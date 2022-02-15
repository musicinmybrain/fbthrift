// Autogenerated by Thrift Compiler (facebook)
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
// @generated

package module

import (
	"bytes"
	"context"
	"sync"
	"fmt"
	thrift "github.com/facebook/fbthrift/thrift/lib/go/thrift"
)

// (needed to ensure safety because of naive import list construction.)
var _ = thrift.ZERO
var _ = fmt.Printf
var _ = sync.Mutex{}
var _ = bytes.Equal
var _ = context.Background

type MyServicePrioParent interface {
  Ping() (err error)
  Pong() (err error)
}

type MyServicePrioParentClientInterface interface {
  thrift.ClientInterface
  Ping() (err error)
  Pong() (err error)
}

type MyServicePrioParentClient struct {
  MyServicePrioParentClientInterface
  CC thrift.ClientConn
}

func(client *MyServicePrioParentClient) Open() error {
  return client.CC.Open()
}

func(client *MyServicePrioParentClient) Close() error {
  return client.CC.Close()
}

func(client *MyServicePrioParentClient) IsOpen() bool {
  return client.CC.IsOpen()
}

func NewMyServicePrioParentClientFactory(t thrift.Transport, f thrift.ProtocolFactory) *MyServicePrioParentClient {
  return &MyServicePrioParentClient{ CC: thrift.NewClientConn(t, f) }
}

func NewMyServicePrioParentClient(t thrift.Transport, iprot thrift.Protocol, oprot thrift.Protocol) *MyServicePrioParentClient {
  return &MyServicePrioParentClient{ CC: thrift.NewClientConnWithProtocols(t, iprot, oprot) }
}

func NewMyServicePrioParentClientProtocol(prot thrift.Protocol) *MyServicePrioParentClient {
  return NewMyServicePrioParentClient(prot.Transport(), prot, prot)
}

func (p *MyServicePrioParentClient) Ping() (err error) {
  var args MyServicePrioParentPingArgs
  err = p.CC.SendMsg("ping", &args, thrift.CALL)
  if err != nil { return }
  return p.recvPing()
}


func (p *MyServicePrioParentClient) recvPing() (err error) {
  var __result MyServicePrioParentPingResult
  return p.CC.RecvMsg("ping", &__result)
}

func (p *MyServicePrioParentClient) Pong() (err error) {
  var args MyServicePrioParentPongArgs
  err = p.CC.SendMsg("pong", &args, thrift.CALL)
  if err != nil { return }
  return p.recvPong()
}


func (p *MyServicePrioParentClient) recvPong() (err error) {
  var __result MyServicePrioParentPongResult
  return p.CC.RecvMsg("pong", &__result)
}


type MyServicePrioParentThreadsafeClient struct {
  MyServicePrioParentClientInterface
  CC thrift.ClientConn
  Mu sync.Mutex
}

func(client *MyServicePrioParentThreadsafeClient) Open() error {
  client.Mu.Lock()
  defer client.Mu.Unlock()
  return client.CC.Open()
}

func(client *MyServicePrioParentThreadsafeClient) Close() error {
  client.Mu.Lock()
  defer client.Mu.Unlock()
  return client.CC.Close()
}

func(client *MyServicePrioParentThreadsafeClient) IsOpen() bool {
  client.Mu.Lock()
  defer client.Mu.Unlock()
  return client.CC.IsOpen()
}

func NewMyServicePrioParentThreadsafeClientFactory(t thrift.Transport, f thrift.ProtocolFactory) *MyServicePrioParentThreadsafeClient {
  return &MyServicePrioParentThreadsafeClient{ CC: thrift.NewClientConn(t, f) }
}

func NewMyServicePrioParentThreadsafeClient(t thrift.Transport, iprot thrift.Protocol, oprot thrift.Protocol) *MyServicePrioParentThreadsafeClient {
  return &MyServicePrioParentThreadsafeClient{ CC: thrift.NewClientConnWithProtocols(t, iprot, oprot) }
}

func NewMyServicePrioParentThreadsafeClientProtocol(prot thrift.Protocol) *MyServicePrioParentThreadsafeClient {
  return NewMyServicePrioParentThreadsafeClient(prot.Transport(), prot, prot)
}

func (p *MyServicePrioParentThreadsafeClient) Ping() (err error) {
  p.Mu.Lock()
  defer p.Mu.Unlock()
  var args MyServicePrioParentPingArgs
  err = p.CC.SendMsg("ping", &args, thrift.CALL)
  if err != nil { return }
  return p.recvPing()
}


func (p *MyServicePrioParentThreadsafeClient) recvPing() (err error) {
  var __result MyServicePrioParentPingResult
  return p.CC.RecvMsg("ping", &__result)
}

func (p *MyServicePrioParentThreadsafeClient) Pong() (err error) {
  p.Mu.Lock()
  defer p.Mu.Unlock()
  var args MyServicePrioParentPongArgs
  err = p.CC.SendMsg("pong", &args, thrift.CALL)
  if err != nil { return }
  return p.recvPong()
}


func (p *MyServicePrioParentThreadsafeClient) recvPong() (err error) {
  var __result MyServicePrioParentPongResult
  return p.CC.RecvMsg("pong", &__result)
}


type MyServicePrioParentChannelClient struct {
  RequestChannel thrift.RequestChannel
}

func (c *MyServicePrioParentChannelClient) Close() error {
  return c.RequestChannel.Close()
}

func (c *MyServicePrioParentChannelClient) IsOpen() bool {
  return c.RequestChannel.IsOpen()
}

func (c *MyServicePrioParentChannelClient) Open() error {
  return c.RequestChannel.Open()
}

func NewMyServicePrioParentChannelClient(channel thrift.RequestChannel) *MyServicePrioParentChannelClient {
  return &MyServicePrioParentChannelClient{RequestChannel: channel}
}

func (p *MyServicePrioParentChannelClient) Ping(ctx context.Context) (err error) {
  args := MyServicePrioParentPingArgs{
  }
  var __result MyServicePrioParentPingResult
  err = p.RequestChannel.Call(ctx, "ping", &args, &__result)
  if err != nil { return }

  return nil
}

func (p *MyServicePrioParentChannelClient) Pong(ctx context.Context) (err error) {
  args := MyServicePrioParentPongArgs{
  }
  var __result MyServicePrioParentPongResult
  err = p.RequestChannel.Call(ctx, "pong", &args, &__result)
  if err != nil { return }

  return nil
}


type MyServicePrioParentProcessor struct {
  processorMap map[string]thrift.ProcessorFunction
  functionServiceMap map[string]string
  handler MyServicePrioParent
}

func (p *MyServicePrioParentProcessor) AddToProcessorMap(key string, processor thrift.ProcessorFunction) {
  p.processorMap[key] = processor
}

func (p *MyServicePrioParentProcessor) AddToFunctionServiceMap(key, service string) {
  p.functionServiceMap[key] = service
}

func (p *MyServicePrioParentProcessor) GetProcessorFunction(key string) (processor thrift.ProcessorFunction, err error) {
  if processor, ok := p.processorMap[key]; ok {
    return processor, nil
  }
  return nil, nil // generic error message will be sent
}

func (p *MyServicePrioParentProcessor) ProcessorMap() map[string]thrift.ProcessorFunction {
  return p.processorMap
}

func (p *MyServicePrioParentProcessor) FunctionServiceMap() map[string]string {
  return p.functionServiceMap
}

func NewMyServicePrioParentProcessor(handler MyServicePrioParent) *MyServicePrioParentProcessor {
  self8 := &MyServicePrioParentProcessor{handler:handler, processorMap:make(map[string]thrift.ProcessorFunction), functionServiceMap:make(map[string]string)}
  self8.processorMap["ping"] = &myServicePrioParentProcessorPing{handler:handler}
  self8.processorMap["pong"] = &myServicePrioParentProcessorPong{handler:handler}
  self8.functionServiceMap["ping"] = "MyServicePrioParent"
  self8.functionServiceMap["pong"] = "MyServicePrioParent"
  return self8
}

type myServicePrioParentProcessorPing struct {
  handler MyServicePrioParent
}

func (p *MyServicePrioParentPingResult) Exception() thrift.WritableException {
  if p == nil { return nil }
  return nil
}

func (p *myServicePrioParentProcessorPing) Read(iprot thrift.Protocol) (thrift.Struct, thrift.Exception) {
  args := MyServicePrioParentPingArgs{}
  if err := args.Read(iprot); err != nil {
    return nil, err
  }
  iprot.ReadMessageEnd()
  return &args, nil
}

func (p *myServicePrioParentProcessorPing) Write(seqId int32, result thrift.WritableStruct, oprot thrift.Protocol) (err thrift.Exception) {
  var err2 error
  messageType := thrift.REPLY
  switch result.(type) {
  case thrift.ApplicationException:
    messageType = thrift.EXCEPTION
  }
  if err2 = oprot.WriteMessageBegin("ping", messageType, seqId); err2 != nil {
    err = err2
  }
  if err2 = result.Write(oprot); err == nil && err2 != nil {
    err = err2
  }
  if err2 = oprot.WriteMessageEnd(); err == nil && err2 != nil {
    err = err2
  }
  if err2 = oprot.Flush(); err == nil && err2 != nil {
    err = err2
  }
  return err
}

func (p *myServicePrioParentProcessorPing) Run(argStruct thrift.Struct) (thrift.WritableStruct, thrift.ApplicationException) {
  var __result MyServicePrioParentPingResult
  if err := p.handler.Ping(); err != nil {
    switch err.(type) {
    default:
      x := thrift.NewApplicationExceptionCause(thrift.INTERNAL_ERROR, "Internal error processing ping: " + err.Error(), err)
      return x, x
    }
  }
  return &__result, nil
}

type myServicePrioParentProcessorPong struct {
  handler MyServicePrioParent
}

func (p *MyServicePrioParentPongResult) Exception() thrift.WritableException {
  if p == nil { return nil }
  return nil
}

func (p *myServicePrioParentProcessorPong) Read(iprot thrift.Protocol) (thrift.Struct, thrift.Exception) {
  args := MyServicePrioParentPongArgs{}
  if err := args.Read(iprot); err != nil {
    return nil, err
  }
  iprot.ReadMessageEnd()
  return &args, nil
}

func (p *myServicePrioParentProcessorPong) Write(seqId int32, result thrift.WritableStruct, oprot thrift.Protocol) (err thrift.Exception) {
  var err2 error
  messageType := thrift.REPLY
  switch result.(type) {
  case thrift.ApplicationException:
    messageType = thrift.EXCEPTION
  }
  if err2 = oprot.WriteMessageBegin("pong", messageType, seqId); err2 != nil {
    err = err2
  }
  if err2 = result.Write(oprot); err == nil && err2 != nil {
    err = err2
  }
  if err2 = oprot.WriteMessageEnd(); err == nil && err2 != nil {
    err = err2
  }
  if err2 = oprot.Flush(); err == nil && err2 != nil {
    err = err2
  }
  return err
}

func (p *myServicePrioParentProcessorPong) Run(argStruct thrift.Struct) (thrift.WritableStruct, thrift.ApplicationException) {
  var __result MyServicePrioParentPongResult
  if err := p.handler.Pong(); err != nil {
    switch err.(type) {
    default:
      x := thrift.NewApplicationExceptionCause(thrift.INTERNAL_ERROR, "Internal error processing pong: " + err.Error(), err)
      return x, x
    }
  }
  return &__result, nil
}


// HELPER FUNCTIONS AND STRUCTURES

type MyServicePrioParentPingArgs struct {
  thrift.IRequest
}

func NewMyServicePrioParentPingArgs() *MyServicePrioParentPingArgs {
  return &MyServicePrioParentPingArgs{}
}

type MyServicePrioParentPingArgsBuilder struct {
  obj *MyServicePrioParentPingArgs
}

func NewMyServicePrioParentPingArgsBuilder() *MyServicePrioParentPingArgsBuilder{
  return &MyServicePrioParentPingArgsBuilder{
    obj: NewMyServicePrioParentPingArgs(),
  }
}

func (p MyServicePrioParentPingArgsBuilder) Emit() *MyServicePrioParentPingArgs{
  return &MyServicePrioParentPingArgs{
  }
}

func (p *MyServicePrioParentPingArgs) Read(iprot thrift.Protocol) error {
  if _, err := iprot.ReadStructBegin(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read error: ", p), err)
  }


  for {
    _, fieldTypeId, fieldId, err := iprot.ReadFieldBegin()
    if err != nil {
      return thrift.PrependError(fmt.Sprintf("%T field %d read error: ", p, fieldId), err)
    }
    if fieldTypeId == thrift.STOP { break; }
    if err := iprot.Skip(fieldTypeId); err != nil {
      return err
    }
    if err := iprot.ReadFieldEnd(); err != nil {
      return err
    }
  }
  if err := iprot.ReadStructEnd(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read struct end error: ", p), err)
  }
  return nil
}

func (p *MyServicePrioParentPingArgs) Write(oprot thrift.Protocol) error {
  if err := oprot.WriteStructBegin("ping_args"); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T write struct begin error: ", p), err) }
  if err := oprot.WriteFieldStop(); err != nil {
    return thrift.PrependError("write field stop error: ", err) }
  if err := oprot.WriteStructEnd(); err != nil {
    return thrift.PrependError("write struct stop error: ", err) }
  return nil
}

func (p *MyServicePrioParentPingArgs) String() string {
  if p == nil {
    return "<nil>"
  }

  return fmt.Sprintf("MyServicePrioParentPingArgs({})")
}

type MyServicePrioParentPingResult struct {
  thrift.IResponse
}

func NewMyServicePrioParentPingResult() *MyServicePrioParentPingResult {
  return &MyServicePrioParentPingResult{}
}

type MyServicePrioParentPingResultBuilder struct {
  obj *MyServicePrioParentPingResult
}

func NewMyServicePrioParentPingResultBuilder() *MyServicePrioParentPingResultBuilder{
  return &MyServicePrioParentPingResultBuilder{
    obj: NewMyServicePrioParentPingResult(),
  }
}

func (p MyServicePrioParentPingResultBuilder) Emit() *MyServicePrioParentPingResult{
  return &MyServicePrioParentPingResult{
  }
}

func (p *MyServicePrioParentPingResult) Read(iprot thrift.Protocol) error {
  if _, err := iprot.ReadStructBegin(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read error: ", p), err)
  }


  for {
    _, fieldTypeId, fieldId, err := iprot.ReadFieldBegin()
    if err != nil {
      return thrift.PrependError(fmt.Sprintf("%T field %d read error: ", p, fieldId), err)
    }
    if fieldTypeId == thrift.STOP { break; }
    if err := iprot.Skip(fieldTypeId); err != nil {
      return err
    }
    if err := iprot.ReadFieldEnd(); err != nil {
      return err
    }
  }
  if err := iprot.ReadStructEnd(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read struct end error: ", p), err)
  }
  return nil
}

func (p *MyServicePrioParentPingResult) Write(oprot thrift.Protocol) error {
  if err := oprot.WriteStructBegin("ping_result"); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T write struct begin error: ", p), err) }
  if err := oprot.WriteFieldStop(); err != nil {
    return thrift.PrependError("write field stop error: ", err) }
  if err := oprot.WriteStructEnd(); err != nil {
    return thrift.PrependError("write struct stop error: ", err) }
  return nil
}

func (p *MyServicePrioParentPingResult) String() string {
  if p == nil {
    return "<nil>"
  }

  return fmt.Sprintf("MyServicePrioParentPingResult({})")
}

type MyServicePrioParentPongArgs struct {
  thrift.IRequest
}

func NewMyServicePrioParentPongArgs() *MyServicePrioParentPongArgs {
  return &MyServicePrioParentPongArgs{}
}

type MyServicePrioParentPongArgsBuilder struct {
  obj *MyServicePrioParentPongArgs
}

func NewMyServicePrioParentPongArgsBuilder() *MyServicePrioParentPongArgsBuilder{
  return &MyServicePrioParentPongArgsBuilder{
    obj: NewMyServicePrioParentPongArgs(),
  }
}

func (p MyServicePrioParentPongArgsBuilder) Emit() *MyServicePrioParentPongArgs{
  return &MyServicePrioParentPongArgs{
  }
}

func (p *MyServicePrioParentPongArgs) Read(iprot thrift.Protocol) error {
  if _, err := iprot.ReadStructBegin(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read error: ", p), err)
  }


  for {
    _, fieldTypeId, fieldId, err := iprot.ReadFieldBegin()
    if err != nil {
      return thrift.PrependError(fmt.Sprintf("%T field %d read error: ", p, fieldId), err)
    }
    if fieldTypeId == thrift.STOP { break; }
    if err := iprot.Skip(fieldTypeId); err != nil {
      return err
    }
    if err := iprot.ReadFieldEnd(); err != nil {
      return err
    }
  }
  if err := iprot.ReadStructEnd(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read struct end error: ", p), err)
  }
  return nil
}

func (p *MyServicePrioParentPongArgs) Write(oprot thrift.Protocol) error {
  if err := oprot.WriteStructBegin("pong_args"); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T write struct begin error: ", p), err) }
  if err := oprot.WriteFieldStop(); err != nil {
    return thrift.PrependError("write field stop error: ", err) }
  if err := oprot.WriteStructEnd(); err != nil {
    return thrift.PrependError("write struct stop error: ", err) }
  return nil
}

func (p *MyServicePrioParentPongArgs) String() string {
  if p == nil {
    return "<nil>"
  }

  return fmt.Sprintf("MyServicePrioParentPongArgs({})")
}

type MyServicePrioParentPongResult struct {
  thrift.IResponse
}

func NewMyServicePrioParentPongResult() *MyServicePrioParentPongResult {
  return &MyServicePrioParentPongResult{}
}

type MyServicePrioParentPongResultBuilder struct {
  obj *MyServicePrioParentPongResult
}

func NewMyServicePrioParentPongResultBuilder() *MyServicePrioParentPongResultBuilder{
  return &MyServicePrioParentPongResultBuilder{
    obj: NewMyServicePrioParentPongResult(),
  }
}

func (p MyServicePrioParentPongResultBuilder) Emit() *MyServicePrioParentPongResult{
  return &MyServicePrioParentPongResult{
  }
}

func (p *MyServicePrioParentPongResult) Read(iprot thrift.Protocol) error {
  if _, err := iprot.ReadStructBegin(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read error: ", p), err)
  }


  for {
    _, fieldTypeId, fieldId, err := iprot.ReadFieldBegin()
    if err != nil {
      return thrift.PrependError(fmt.Sprintf("%T field %d read error: ", p, fieldId), err)
    }
    if fieldTypeId == thrift.STOP { break; }
    if err := iprot.Skip(fieldTypeId); err != nil {
      return err
    }
    if err := iprot.ReadFieldEnd(); err != nil {
      return err
    }
  }
  if err := iprot.ReadStructEnd(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read struct end error: ", p), err)
  }
  return nil
}

func (p *MyServicePrioParentPongResult) Write(oprot thrift.Protocol) error {
  if err := oprot.WriteStructBegin("pong_result"); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T write struct begin error: ", p), err) }
  if err := oprot.WriteFieldStop(); err != nil {
    return thrift.PrependError("write field stop error: ", err) }
  if err := oprot.WriteStructEnd(); err != nil {
    return thrift.PrependError("write struct stop error: ", err) }
  return nil
}

func (p *MyServicePrioParentPongResult) String() string {
  if p == nil {
    return "<nil>"
  }

  return fmt.Sprintf("MyServicePrioParentPongResult({})")
}


