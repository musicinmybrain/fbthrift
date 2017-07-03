/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#include "thrift/compiler/test/fixtures/mcpp2-compare/gen-cpp2/ReturnService.h"

#include "thrift/compiler/test/fixtures/mcpp2-compare/gen-cpp2/ReturnService.tcc"

#include <thrift/lib/cpp2/protocol/Protocol.h>
#include <thrift/lib/cpp2/protocol/BinaryProtocol.h>
#include <thrift/lib/cpp2/protocol/CompactProtocol.h>
namespace some { namespace valid { namespace ns {

std::unique_ptr<apache::thrift::AsyncProcessor> ReturnServiceSvIf::getProcessor() {
  return std::make_unique<ReturnServiceAsyncProcessor>(this);
}

void ReturnServiceSvIf::noReturn() {
  throw apache::thrift::TApplicationException("Function noReturn is unimplemented");
}

folly::Future<folly::Unit> ReturnServiceSvIf::future_noReturn() {
  return apache::thrift::detail::si::future([&] { return noReturn(); });
}

void ReturnServiceSvIf::async_eb_noReturn(std::unique_ptr<apache::thrift::HandlerCallback<void>> callback) {
  apache::thrift::detail::si::async_eb(this, std::move(callback), [this]() mutable { return future_noReturn(); });
}

bool ReturnServiceSvIf::boolReturn() {
  throw apache::thrift::TApplicationException("Function boolReturn is unimplemented");
}

folly::Future<bool> ReturnServiceSvIf::future_boolReturn() {
  return apache::thrift::detail::si::future([&] { return boolReturn(); });
}

void ReturnServiceSvIf::async_tm_boolReturn(std::unique_ptr<apache::thrift::HandlerCallback<bool>> callback) {
  apache::thrift::detail::si::async_tm(this, std::move(callback), [&] { return future_boolReturn(); });
}

int16_t ReturnServiceSvIf::i16Return() {
  throw apache::thrift::TApplicationException("Function i16Return is unimplemented");
}

folly::Future<int16_t> ReturnServiceSvIf::future_i16Return() {
  return apache::thrift::detail::si::future([&] { return i16Return(); });
}

void ReturnServiceSvIf::async_tm_i16Return(std::unique_ptr<apache::thrift::HandlerCallback<int16_t>> callback) {
  apache::thrift::detail::si::async_tm(this, std::move(callback), [&] { return future_i16Return(); });
}

int32_t ReturnServiceSvIf::i32Return() {
  throw apache::thrift::TApplicationException("Function i32Return is unimplemented");
}

folly::Future<int32_t> ReturnServiceSvIf::future_i32Return() {
  return apache::thrift::detail::si::future([&] { return i32Return(); });
}

void ReturnServiceSvIf::async_tm_i32Return(std::unique_ptr<apache::thrift::HandlerCallback<int32_t>> callback) {
  apache::thrift::detail::si::async_tm(this, std::move(callback), [&] { return future_i32Return(); });
}

int64_t ReturnServiceSvIf::i64Return() {
  throw apache::thrift::TApplicationException("Function i64Return is unimplemented");
}

folly::Future<int64_t> ReturnServiceSvIf::future_i64Return() {
  return apache::thrift::detail::si::future([&] { return i64Return(); });
}

void ReturnServiceSvIf::async_tm_i64Return(std::unique_ptr<apache::thrift::HandlerCallback<int64_t>> callback) {
  apache::thrift::detail::si::async_tm(this, std::move(callback), [&] { return future_i64Return(); });
}

float ReturnServiceSvIf::floatReturn() {
  throw apache::thrift::TApplicationException("Function floatReturn is unimplemented");
}

folly::Future<float> ReturnServiceSvIf::future_floatReturn() {
  return apache::thrift::detail::si::future([&] { return floatReturn(); });
}

void ReturnServiceSvIf::async_tm_floatReturn(std::unique_ptr<apache::thrift::HandlerCallback<float>> callback) {
  apache::thrift::detail::si::async_tm(this, std::move(callback), [&] { return future_floatReturn(); });
}

double ReturnServiceSvIf::doubleReturn() {
  throw apache::thrift::TApplicationException("Function doubleReturn is unimplemented");
}

folly::Future<double> ReturnServiceSvIf::future_doubleReturn() {
  return apache::thrift::detail::si::future([&] { return doubleReturn(); });
}

void ReturnServiceSvIf::async_tm_doubleReturn(std::unique_ptr<apache::thrift::HandlerCallback<double>> callback) {
  apache::thrift::detail::si::async_tm(this, std::move(callback), [&] { return future_doubleReturn(); });
}

void ReturnServiceSvIf::stringReturn(std::string& /*_return*/) {
  throw apache::thrift::TApplicationException("Function stringReturn is unimplemented");
}

folly::Future<std::unique_ptr<std::string>> ReturnServiceSvIf::future_stringReturn() {
  return apache::thrift::detail::si::future_returning_uptr([&](std::string& _return) { stringReturn(_return); });
}

void ReturnServiceSvIf::async_eb_stringReturn(std::unique_ptr<apache::thrift::HandlerCallback<std::unique_ptr<std::string>>> callback) {
  apache::thrift::detail::si::async_eb(this, std::move(callback), [this]() mutable { return future_stringReturn(); });
}

void ReturnServiceSvIf::binaryReturn(std::string& /*_return*/) {
  throw apache::thrift::TApplicationException("Function binaryReturn is unimplemented");
}

folly::Future<std::unique_ptr<std::string>> ReturnServiceSvIf::future_binaryReturn() {
  return apache::thrift::detail::si::future_returning_uptr([&](std::string& _return) { binaryReturn(_return); });
}

void ReturnServiceSvIf::async_tm_binaryReturn(std::unique_ptr<apache::thrift::HandlerCallback<std::unique_ptr<std::string>>> callback) {
  apache::thrift::detail::si::async_tm(this, std::move(callback), [&] { return future_binaryReturn(); });
}

void ReturnServiceSvIf::mapReturn(std::map<std::string, int64_t>& /*_return*/) {
  throw apache::thrift::TApplicationException("Function mapReturn is unimplemented");
}

folly::Future<std::unique_ptr<std::map<std::string, int64_t>>> ReturnServiceSvIf::future_mapReturn() {
  return apache::thrift::detail::si::future_returning_uptr([&](std::map<std::string, int64_t>& _return) { mapReturn(_return); });
}

void ReturnServiceSvIf::async_tm_mapReturn(std::unique_ptr<apache::thrift::HandlerCallback<std::unique_ptr<std::map<std::string, int64_t>>>> callback) {
  apache::thrift::detail::si::async_tm(this, std::move(callback), [&] { return future_mapReturn(); });
}

 ::some::valid::ns::simpleTypeDef ReturnServiceSvIf::simpleTypedefReturn() {
  throw apache::thrift::TApplicationException("Function simpleTypedefReturn is unimplemented");
}

folly::Future< ::some::valid::ns::simpleTypeDef> ReturnServiceSvIf::future_simpleTypedefReturn() {
  return apache::thrift::detail::si::future([&] { return simpleTypedefReturn(); });
}

void ReturnServiceSvIf::async_tm_simpleTypedefReturn(std::unique_ptr<apache::thrift::HandlerCallback< ::some::valid::ns::simpleTypeDef>> callback) {
  apache::thrift::detail::si::async_tm(this, std::move(callback), [&] { return future_simpleTypedefReturn(); });
}

void ReturnServiceSvIf::complexTypedefReturn( ::some::valid::ns::complexStructTypeDef& /*_return*/) {
  throw apache::thrift::TApplicationException("Function complexTypedefReturn is unimplemented");
}

folly::Future<std::unique_ptr< ::some::valid::ns::complexStructTypeDef>> ReturnServiceSvIf::future_complexTypedefReturn() {
  return apache::thrift::detail::si::future_returning_uptr([&]( ::some::valid::ns::complexStructTypeDef& _return) { complexTypedefReturn(_return); });
}

void ReturnServiceSvIf::async_tm_complexTypedefReturn(std::unique_ptr<apache::thrift::HandlerCallback<std::unique_ptr< ::some::valid::ns::complexStructTypeDef>>> callback) {
  apache::thrift::detail::si::async_tm(this, std::move(callback), [&] { return future_complexTypedefReturn(); });
}

void ReturnServiceSvIf::list_mostComplexTypedefReturn(std::vector< ::some::valid::ns::mostComplexTypeDef>& /*_return*/) {
  throw apache::thrift::TApplicationException("Function list_mostComplexTypedefReturn is unimplemented");
}

folly::Future<std::unique_ptr<std::vector< ::some::valid::ns::mostComplexTypeDef>>> ReturnServiceSvIf::future_list_mostComplexTypedefReturn() {
  return apache::thrift::detail::si::future_returning_uptr([&](std::vector< ::some::valid::ns::mostComplexTypeDef>& _return) { list_mostComplexTypedefReturn(_return); });
}

void ReturnServiceSvIf::async_tm_list_mostComplexTypedefReturn(std::unique_ptr<apache::thrift::HandlerCallback<std::unique_ptr<std::vector< ::some::valid::ns::mostComplexTypeDef>>>> callback) {
  apache::thrift::detail::si::async_tm(this, std::move(callback), [&] { return future_list_mostComplexTypedefReturn(); });
}

 ::some::valid::ns::MyEnumA ReturnServiceSvIf::enumReturn() {
  throw apache::thrift::TApplicationException("Function enumReturn is unimplemented");
}

folly::Future< ::some::valid::ns::MyEnumA> ReturnServiceSvIf::future_enumReturn() {
  return apache::thrift::detail::si::future([&] { return enumReturn(); });
}

void ReturnServiceSvIf::async_eb_enumReturn(std::unique_ptr<apache::thrift::HandlerCallback< ::some::valid::ns::MyEnumA>> callback) {
  apache::thrift::detail::si::async_eb(this, std::move(callback), [this]() mutable { return future_enumReturn(); });
}

void ReturnServiceSvIf::list_EnumReturn(std::vector< ::some::valid::ns::MyEnumA>& /*_return*/) {
  throw apache::thrift::TApplicationException("Function list_EnumReturn is unimplemented");
}

folly::Future<std::unique_ptr<std::vector< ::some::valid::ns::MyEnumA>>> ReturnServiceSvIf::future_list_EnumReturn() {
  return apache::thrift::detail::si::future_returning_uptr([&](std::vector< ::some::valid::ns::MyEnumA>& _return) { list_EnumReturn(_return); });
}

void ReturnServiceSvIf::async_eb_list_EnumReturn(std::unique_ptr<apache::thrift::HandlerCallback<std::unique_ptr<std::vector< ::some::valid::ns::MyEnumA>>>> callback) {
  apache::thrift::detail::si::async_eb(this, std::move(callback), [this]() mutable { return future_list_EnumReturn(); });
}

void ReturnServiceSvIf::structReturn( ::some::valid::ns::MyStruct& /*_return*/) {
  throw apache::thrift::TApplicationException("Function structReturn is unimplemented");
}

folly::Future<std::unique_ptr< ::some::valid::ns::MyStruct>> ReturnServiceSvIf::future_structReturn() {
  return apache::thrift::detail::si::future_returning_uptr([&]( ::some::valid::ns::MyStruct& _return) { structReturn(_return); });
}

void ReturnServiceSvIf::async_tm_structReturn(std::unique_ptr<apache::thrift::HandlerCallback<std::unique_ptr< ::some::valid::ns::MyStruct>>> callback) {
  apache::thrift::detail::si::async_tm(this, std::move(callback), [&] { return future_structReturn(); });
}

void ReturnServiceSvIf::set_StructReturn(std::set< ::some::valid::ns::MyStruct>& /*_return*/) {
  throw apache::thrift::TApplicationException("Function set_StructReturn is unimplemented");
}

folly::Future<std::unique_ptr<std::set< ::some::valid::ns::MyStruct>>> ReturnServiceSvIf::future_set_StructReturn() {
  return apache::thrift::detail::si::future_returning_uptr([&](std::set< ::some::valid::ns::MyStruct>& _return) { set_StructReturn(_return); });
}

void ReturnServiceSvIf::async_tm_set_StructReturn(std::unique_ptr<apache::thrift::HandlerCallback<std::unique_ptr<std::set< ::some::valid::ns::MyStruct>>>> callback) {
  apache::thrift::detail::si::async_tm(this, std::move(callback), [&] { return future_set_StructReturn(); });
}

void ReturnServiceSvIf::unionReturn( ::some::valid::ns::ComplexUnion& /*_return*/) {
  throw apache::thrift::TApplicationException("Function unionReturn is unimplemented");
}

folly::Future<std::unique_ptr< ::some::valid::ns::ComplexUnion>> ReturnServiceSvIf::future_unionReturn() {
  return apache::thrift::detail::si::future_returning_uptr([&]( ::some::valid::ns::ComplexUnion& _return) { unionReturn(_return); });
}

void ReturnServiceSvIf::async_eb_unionReturn(std::unique_ptr<apache::thrift::HandlerCallback<std::unique_ptr< ::some::valid::ns::ComplexUnion>>> callback) {
  apache::thrift::detail::si::async_eb(this, std::move(callback), [this]() mutable { return future_unionReturn(); });
}

void ReturnServiceSvIf::list_UnionReturn(std::vector< ::some::valid::ns::ComplexUnion>& /*_return*/) {
  throw apache::thrift::TApplicationException("Function list_UnionReturn is unimplemented");
}

folly::Future<std::unique_ptr<std::vector< ::some::valid::ns::ComplexUnion>>> ReturnServiceSvIf::future_list_UnionReturn() {
  return apache::thrift::detail::si::future_returning_uptr([&](std::vector< ::some::valid::ns::ComplexUnion>& _return) { list_UnionReturn(_return); });
}

void ReturnServiceSvIf::async_tm_list_UnionReturn(std::unique_ptr<apache::thrift::HandlerCallback<std::unique_ptr<std::vector< ::some::valid::ns::ComplexUnion>>>> callback) {
  apache::thrift::detail::si::async_tm(this, std::move(callback), [&] { return future_list_UnionReturn(); });
}

bool ReturnServiceSvNull::boolReturn() {
  return 0;
}

int16_t ReturnServiceSvNull::i16Return() {
  return 0;
}

int32_t ReturnServiceSvNull::i32Return() {
  return 0;
}

int64_t ReturnServiceSvNull::i64Return() {
  return 0;
}

float ReturnServiceSvNull::floatReturn() {
  return 0;
}

double ReturnServiceSvNull::doubleReturn() {
  return 0;
}

void ReturnServiceSvNull::binaryReturn(std::string& /*_return*/) {}

void ReturnServiceSvNull::mapReturn(std::map<std::string, int64_t>& /*_return*/) {}

 ::some::valid::ns::simpleTypeDef ReturnServiceSvNull::simpleTypedefReturn() {
  return 0;
}

void ReturnServiceSvNull::complexTypedefReturn( ::some::valid::ns::complexStructTypeDef& /*_return*/) {}

void ReturnServiceSvNull::list_mostComplexTypedefReturn(std::vector< ::some::valid::ns::mostComplexTypeDef>& /*_return*/) {}

void ReturnServiceSvNull::structReturn( ::some::valid::ns::MyStruct& /*_return*/) {}

void ReturnServiceSvNull::set_StructReturn(std::set< ::some::valid::ns::MyStruct>& /*_return*/) {}

void ReturnServiceSvNull::list_UnionReturn(std::vector< ::some::valid::ns::ComplexUnion>& /*_return*/) {}

const char* ReturnServiceAsyncProcessor::getServiceName() {
  return "ReturnService";
}

folly::Optional<std::string> ReturnServiceAsyncProcessor::getCacheKey(folly::IOBuf* buf, apache::thrift::protocol::PROTOCOL_TYPES protType) {
  return apache::thrift::detail::ap::get_cache_key(buf, protType, cacheKeyMap_);
}

void ReturnServiceAsyncProcessor::process(std::unique_ptr<apache::thrift::ResponseChannel::Request> req, std::unique_ptr<folly::IOBuf> buf, apache::thrift::protocol::PROTOCOL_TYPES protType, apache::thrift::Cpp2RequestContext* context, folly::EventBase* eb, apache::thrift::concurrency::ThreadManager* tm) {
  apache::thrift::detail::ap::process(this, std::move(req), std::move(buf), protType, context, eb, tm);
}

bool ReturnServiceAsyncProcessor::isOnewayMethod(const folly::IOBuf* buf, const apache::thrift::transport::THeader* header) {
  return apache::thrift::detail::ap::is_oneway_method(buf, header, onewayMethods_);
}

std::unordered_set<std::string> ReturnServiceAsyncProcessor::onewayMethods_ {};
std::unordered_map<std::string, int16_t> ReturnServiceAsyncProcessor::cacheKeyMap_ {};
const ReturnServiceAsyncProcessor::BinaryProtocolProcessMap& ReturnServiceAsyncProcessor::getBinaryProtocolProcessMap() {
  return binaryProcessMap_;
}

const ReturnServiceAsyncProcessor::BinaryProtocolProcessMap ReturnServiceAsyncProcessor::binaryProcessMap_ {
  {"noReturn", &ReturnServiceAsyncProcessor::process_noReturn<apache::thrift::BinaryProtocolReader, apache::thrift::BinaryProtocolWriter>},
  {"boolReturn", &ReturnServiceAsyncProcessor::_processInThread_boolReturn<apache::thrift::BinaryProtocolReader, apache::thrift::BinaryProtocolWriter>},
  {"i16Return", &ReturnServiceAsyncProcessor::_processInThread_i16Return<apache::thrift::BinaryProtocolReader, apache::thrift::BinaryProtocolWriter>},
  {"i32Return", &ReturnServiceAsyncProcessor::_processInThread_i32Return<apache::thrift::BinaryProtocolReader, apache::thrift::BinaryProtocolWriter>},
  {"i64Return", &ReturnServiceAsyncProcessor::_processInThread_i64Return<apache::thrift::BinaryProtocolReader, apache::thrift::BinaryProtocolWriter>},
  {"floatReturn", &ReturnServiceAsyncProcessor::_processInThread_floatReturn<apache::thrift::BinaryProtocolReader, apache::thrift::BinaryProtocolWriter>},
  {"doubleReturn", &ReturnServiceAsyncProcessor::_processInThread_doubleReturn<apache::thrift::BinaryProtocolReader, apache::thrift::BinaryProtocolWriter>},
  {"stringReturn", &ReturnServiceAsyncProcessor::process_stringReturn<apache::thrift::BinaryProtocolReader, apache::thrift::BinaryProtocolWriter>},
  {"binaryReturn", &ReturnServiceAsyncProcessor::_processInThread_binaryReturn<apache::thrift::BinaryProtocolReader, apache::thrift::BinaryProtocolWriter>},
  {"mapReturn", &ReturnServiceAsyncProcessor::_processInThread_mapReturn<apache::thrift::BinaryProtocolReader, apache::thrift::BinaryProtocolWriter>},
  {"simpleTypedefReturn", &ReturnServiceAsyncProcessor::_processInThread_simpleTypedefReturn<apache::thrift::BinaryProtocolReader, apache::thrift::BinaryProtocolWriter>},
  {"complexTypedefReturn", &ReturnServiceAsyncProcessor::_processInThread_complexTypedefReturn<apache::thrift::BinaryProtocolReader, apache::thrift::BinaryProtocolWriter>},
  {"list_mostComplexTypedefReturn", &ReturnServiceAsyncProcessor::_processInThread_list_mostComplexTypedefReturn<apache::thrift::BinaryProtocolReader, apache::thrift::BinaryProtocolWriter>},
  {"enumReturn", &ReturnServiceAsyncProcessor::process_enumReturn<apache::thrift::BinaryProtocolReader, apache::thrift::BinaryProtocolWriter>},
  {"list_EnumReturn", &ReturnServiceAsyncProcessor::process_list_EnumReturn<apache::thrift::BinaryProtocolReader, apache::thrift::BinaryProtocolWriter>},
  {"structReturn", &ReturnServiceAsyncProcessor::_processInThread_structReturn<apache::thrift::BinaryProtocolReader, apache::thrift::BinaryProtocolWriter>},
  {"set_StructReturn", &ReturnServiceAsyncProcessor::_processInThread_set_StructReturn<apache::thrift::BinaryProtocolReader, apache::thrift::BinaryProtocolWriter>},
  {"unionReturn", &ReturnServiceAsyncProcessor::process_unionReturn<apache::thrift::BinaryProtocolReader, apache::thrift::BinaryProtocolWriter>},
  {"list_UnionReturn", &ReturnServiceAsyncProcessor::_processInThread_list_UnionReturn<apache::thrift::BinaryProtocolReader, apache::thrift::BinaryProtocolWriter>},
};

const ReturnServiceAsyncProcessor::CompactProtocolProcessMap& ReturnServiceAsyncProcessor::getCompactProtocolProcessMap() {
  return compactProcessMap_;
}

const ReturnServiceAsyncProcessor::CompactProtocolProcessMap ReturnServiceAsyncProcessor::compactProcessMap_ {
  {"noReturn", &ReturnServiceAsyncProcessor::process_noReturn<apache::thrift::CompactProtocolReader, apache::thrift::CompactProtocolWriter>},
  {"boolReturn", &ReturnServiceAsyncProcessor::_processInThread_boolReturn<apache::thrift::CompactProtocolReader, apache::thrift::CompactProtocolWriter>},
  {"i16Return", &ReturnServiceAsyncProcessor::_processInThread_i16Return<apache::thrift::CompactProtocolReader, apache::thrift::CompactProtocolWriter>},
  {"i32Return", &ReturnServiceAsyncProcessor::_processInThread_i32Return<apache::thrift::CompactProtocolReader, apache::thrift::CompactProtocolWriter>},
  {"i64Return", &ReturnServiceAsyncProcessor::_processInThread_i64Return<apache::thrift::CompactProtocolReader, apache::thrift::CompactProtocolWriter>},
  {"floatReturn", &ReturnServiceAsyncProcessor::_processInThread_floatReturn<apache::thrift::CompactProtocolReader, apache::thrift::CompactProtocolWriter>},
  {"doubleReturn", &ReturnServiceAsyncProcessor::_processInThread_doubleReturn<apache::thrift::CompactProtocolReader, apache::thrift::CompactProtocolWriter>},
  {"stringReturn", &ReturnServiceAsyncProcessor::process_stringReturn<apache::thrift::CompactProtocolReader, apache::thrift::CompactProtocolWriter>},
  {"binaryReturn", &ReturnServiceAsyncProcessor::_processInThread_binaryReturn<apache::thrift::CompactProtocolReader, apache::thrift::CompactProtocolWriter>},
  {"mapReturn", &ReturnServiceAsyncProcessor::_processInThread_mapReturn<apache::thrift::CompactProtocolReader, apache::thrift::CompactProtocolWriter>},
  {"simpleTypedefReturn", &ReturnServiceAsyncProcessor::_processInThread_simpleTypedefReturn<apache::thrift::CompactProtocolReader, apache::thrift::CompactProtocolWriter>},
  {"complexTypedefReturn", &ReturnServiceAsyncProcessor::_processInThread_complexTypedefReturn<apache::thrift::CompactProtocolReader, apache::thrift::CompactProtocolWriter>},
  {"list_mostComplexTypedefReturn", &ReturnServiceAsyncProcessor::_processInThread_list_mostComplexTypedefReturn<apache::thrift::CompactProtocolReader, apache::thrift::CompactProtocolWriter>},
  {"enumReturn", &ReturnServiceAsyncProcessor::process_enumReturn<apache::thrift::CompactProtocolReader, apache::thrift::CompactProtocolWriter>},
  {"list_EnumReturn", &ReturnServiceAsyncProcessor::process_list_EnumReturn<apache::thrift::CompactProtocolReader, apache::thrift::CompactProtocolWriter>},
  {"structReturn", &ReturnServiceAsyncProcessor::_processInThread_structReturn<apache::thrift::CompactProtocolReader, apache::thrift::CompactProtocolWriter>},
  {"set_StructReturn", &ReturnServiceAsyncProcessor::_processInThread_set_StructReturn<apache::thrift::CompactProtocolReader, apache::thrift::CompactProtocolWriter>},
  {"unionReturn", &ReturnServiceAsyncProcessor::process_unionReturn<apache::thrift::CompactProtocolReader, apache::thrift::CompactProtocolWriter>},
  {"list_UnionReturn", &ReturnServiceAsyncProcessor::_processInThread_list_UnionReturn<apache::thrift::CompactProtocolReader, apache::thrift::CompactProtocolWriter>},
};

}}} // some::valid::ns
namespace apache { namespace thrift {

}} // apache::thrift
