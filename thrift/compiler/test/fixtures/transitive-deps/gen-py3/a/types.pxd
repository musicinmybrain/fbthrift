#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

from libc.stdint cimport (
    int8_t as cint8_t,
    int16_t as cint16_t,
    int32_t as cint32_t,
    int64_t as cint64_t,
    uint32_t as cuint32_t,
)
from libcpp.string cimport string
from libcpp cimport bool as cbool, nullptr, nullptr_t
from cpython cimport bool as pbool
from libcpp.memory cimport shared_ptr, unique_ptr
from libcpp.utility cimport move as cmove
from libcpp.vector cimport vector
from libcpp.set cimport set as cset
from libcpp.map cimport map as cmap, pair as cpair
from thrift.py3.exceptions cimport cTException
cimport folly.iobuf as __iobuf
cimport thrift.py3.exceptions
cimport thrift.py3.types
from thrift.py3.types cimport (
    bstring,
    bytes_to_string,
    field_ref as __field_ref,
    optional_field_ref as __optional_field_ref,
    required_field_ref as __required_field_ref,
)
from thrift.py3.common cimport (
    RpcOptions as __RpcOptions,
    Protocol as __Protocol,
    cThriftMetadata as __fbthrift_cThriftMetadata,
    MetadataBox as __MetadataBox,
)
from folly.optional cimport cOptional as __cOptional
cimport b.types as _b_types
cimport c.types as _c_types

cimport a.types_fields as __fbthrift_types_fields

cdef extern from "src/gen-py3/a/types.h":
  pass





cdef extern from "src/gen-cpp2/a_metadata.h" namespace "apache::thrift::detail::md":
    cdef cppclass ExceptionMetadata[T]:
        @staticmethod
        void gen(__fbthrift_cThriftMetadata &metadata)
cdef extern from "src/gen-cpp2/a_metadata.h" namespace "apache::thrift::detail::md":
    cdef cppclass StructMetadata[T]:
        @staticmethod
        void gen(__fbthrift_cThriftMetadata &metadata)
cdef extern from "src/gen-cpp2/a_types_custom_protocol.h" namespace "::cpp2":
    cdef cppclass cA__isset "::cpp2::A::__isset":
        bint b
        bint other

    cdef cppclass cA "::cpp2::A":
        cA() except +
        cA(const cA&) except +
        bint operator==(cA&)
        bint operator!=(cA&)
        bint operator<(cA&)
        bint operator>(cA&)
        bint operator<=(cA&)
        bint operator>=(cA&)
        __field_ref[vector[vector[_c_types.cC]]] b_ref()
        vector[vector[_c_types.cC]] b
        __field_ref[vector[_c_types.cC]] other_ref()
        vector[_c_types.cC] other
        cA__isset __isset




cdef class A(thrift.py3.types.Struct):
    cdef shared_ptr[cA] _cpp_obj
    cdef __fbthrift_types_fields.__A_FieldsSetter _fields_setter
    cdef List__List__c_C __fbthrift_cached_b
    cdef List__c_C __fbthrift_cached_other

    @staticmethod
    cdef create(shared_ptr[cA])


cdef class List__c_C(thrift.py3.types.List):
    cdef shared_ptr[vector[_c_types.cC]] _cpp_obj
    @staticmethod
    cdef create(shared_ptr[vector[_c_types.cC]])
    @staticmethod
    cdef shared_ptr[vector[_c_types.cC]] _make_instance(object items) except *

cdef class List__List__c_C(thrift.py3.types.List):
    cdef shared_ptr[vector[vector[_c_types.cC]]] _cpp_obj
    @staticmethod
    cdef create(shared_ptr[vector[vector[_c_types.cC]]])
    @staticmethod
    cdef shared_ptr[vector[vector[_c_types.cC]]] _make_instance(object items) except *


