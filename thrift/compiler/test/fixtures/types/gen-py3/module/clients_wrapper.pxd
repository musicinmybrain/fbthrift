#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

from cpython.ref cimport PyObject
from libc.stdint cimport int8_t, int16_t, int32_t, int64_t
from libcpp cimport bool as cbool
from libcpp.map cimport map as cmap, pair as cpair
from libcpp.memory cimport shared_ptr, unique_ptr
from libcpp.set cimport set as cset
from libcpp.string cimport string
from libcpp.vector cimport vector

from folly cimport cFollyFuture, cFollyTry, cFollyUnit
from thrift.py3.common cimport cRpcOptions

cimport module.types as _module_types

cimport include.types as _include_types

cdef extern from "src/gen-cpp2/SomeService.h" namespace "apache::thrift::fixtures::types":
  cdef cppclass cSomeServiceAsyncClient "apache::thrift::fixtures::types::SomeServiceAsyncClient":
      pass

cdef extern from "<utility>" namespace "std":
  cdef unique_ptr[cSomeServiceClientWrapper] move(unique_ptr[cSomeServiceClientWrapper])

cdef extern from "src/gen-py3/module/clients_wrapper.h" namespace "apache::thrift::fixtures::types":
  cdef cppclass cSomeServiceClientWrapper "apache::thrift::fixtures::types::SomeServiceClientWrapper":
    cFollyFuture[cFollyUnit] disconnect()
    void setPersistentHeader(const string& key, const string& value)

    cFollyFuture[_module_types.std_unordered_map[int32_t,string]] bounce_map(cRpcOptions, 
      _module_types.std_unordered_map[int32_t,string] arg_m,)
    cFollyFuture[cmap[string,int64_t]] binary_keyed_map(cRpcOptions, 
      vector[int64_t] arg_r,)

