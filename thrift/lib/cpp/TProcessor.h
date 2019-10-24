/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#ifndef THRIFT_TPROCESSOR_H_
#define THRIFT_TPROCESSOR_H_ 1

#include <string>
#include <vector>
#include <thrift/lib/cpp/EventHandlerBase.h>
#include <thrift/lib/cpp/server/TConnectionContext.h>
#include <thrift/lib/cpp/protocol/TProtocol.h>
#include <memory>

namespace apache { namespace thrift {

/**
 * A processor is a generic object that acts upon two streams of data, one
 * an input and the other an output. The definition of this object is loose,
 * though the typical case is for some sort of server that either generates
 * responses to an input stream or forwards data from one pipe onto another.
 */
class TProcessor : public TProcessorBase {
 public:
  virtual ~TProcessor() {}

  virtual bool process(std::shared_ptr<protocol::TProtocol> in,
                       std::shared_ptr<protocol::TProtocol> out,
                       TConnectionContext* connectionContext) = 0;

  bool process(std::shared_ptr<apache::thrift::protocol::TProtocol> io,
               TConnectionContext* connectionContext) {
    return process(io, io, connectionContext);
  }

 protected:
  TProcessor() {}
};

class TProcessorFactory {
 public:
  virtual ~TProcessorFactory() {}

  /**
   * Get the TProcessor to use for a particular connection.
   *
   * This method is always invoked in the same thread that the connection was
   * accepted on.  This generally means that this call does not need to be
   * thread safe, as it will always be invoked from a single thread.
   */
  virtual std::shared_ptr<TProcessor> getProcessor(
      server::TConnectionContext* ctx) = 0;
};

class TSingletonProcessorFactory : public TProcessorFactory {
 public:
  explicit TSingletonProcessorFactory(
    const std::shared_ptr<TProcessor>& processor) :
      processor_(processor) {}

  std::shared_ptr<TProcessor> getProcessor(
      server::TConnectionContext*) override {
    return processor_;
  }

  std::shared_ptr<TProcessor> getProcessor() {
    return processor_;
  }

 private:
  std::shared_ptr<TProcessor> processor_;
};

/**
 * This is a helper class to allow std::shared_ptr to be used with handler
 * pointers returned by the generated handler factories.
 *
 * The handler factory classes generated by the thrift compiler return raw
 * pointers, and factory->releaseHandler() must be called when the handler is
 * no longer needed.
 *
 * A ReleaseHandler object can be instantiated and passed as the second
 * parameter to a shared_ptr, so that factory->releaseHandler() will be called
 * when the object is no longer needed, instead of deleting the pointer.
 */
template<typename HandlerFactory_>
class ReleaseHandler {
 public:
   explicit ReleaseHandler(
     const std::shared_ptr<HandlerFactory_>& handlerFactory) :
       handlerFactory_(handlerFactory) {}

   void operator()(typename HandlerFactory_::Handler* handler) {
     if (handler) {
       handlerFactory_->releaseHandler(handler);
     }
   }

 private:
   std::shared_ptr<HandlerFactory_> handlerFactory_;
};

}} // apache::thrift

#endif // #ifndef THRIFT_TPROCESSOR_H_
