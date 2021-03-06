#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#
cimport cython as __cython
from cpython.bytes cimport PyBytes_AsStringAndSize
from cpython.object cimport PyTypeObject, Py_LT, Py_LE, Py_EQ, Py_NE, Py_GT, Py_GE
from libcpp.memory cimport shared_ptr, make_shared, unique_ptr, make_unique
from libcpp.string cimport string
from libcpp cimport bool as cbool
from libcpp.iterator cimport inserter as cinserter
from cpython cimport bool as pbool
from cython.operator cimport dereference as deref, preincrement as inc, address as ptr_address
import thrift.py3.types
cimport thrift.py3.types
cimport thrift.py3.exceptions
from thrift.py3.std_libcpp cimport sv_to_str as __sv_to_str, string_view as __cstring_view
from thrift.py3.types cimport (
    cSetOp as __cSetOp,
    richcmp as __richcmp,
    set_op as __set_op,
    setcmp as __setcmp,
    list_index as __list_index,
    list_count as __list_count,
    list_slice as __list_slice,
    list_getitem as __list_getitem,
    set_iter as __set_iter,
    map_iter as __map_iter,
    map_contains as __map_contains,
    map_getitem as __map_getitem,
    reference_shared_ptr as __reference_shared_ptr,
    get_field_name_by_index as __get_field_name_by_index,
    reset_field as __reset_field,
    translate_cpp_enum_to_python,
    SetMetaClass as __SetMetaClass,
    const_pointer_cast,
    constant_shared_ptr,
    NOTSET as __NOTSET,
    EnumData as __EnumData,
    EnumFlagsData as __EnumFlagsData,
    UnionTypeEnumData as __UnionTypeEnumData,
    createEnumDataForUnionType as __createEnumDataForUnionType,
)
cimport thrift.py3.std_libcpp as std_libcpp
cimport thrift.py3.serializer as serializer
import folly.iobuf as __iobuf
from folly.optional cimport cOptional
from folly.memory cimport to_shared_ptr as __to_shared_ptr
from folly.range cimport Range as __cRange

import sys
from collections.abc import Sequence, Set, Mapping, Iterable
import weakref as __weakref
import builtins as _builtins

cimport test.fixtures.enumstrict.module.types_reflection as _types_reflection


cdef __EnumData __EmptyEnum_enum_data  = __EnumData.create(thrift.py3.types.createEnumData[cEmptyEnum](), EmptyEnum)


@__cython.internal
@__cython.auto_pickle(False)
cdef class __EmptyEnumMeta(thrift.py3.types.EnumMeta):

    def __get_by_name(cls, str name):
        return __EmptyEnum_enum_data.get_by_name(name)

    def __get_by_value(cls, int value):
        return __EmptyEnum_enum_data.get_by_value(value)

    def __get_all_names(cls):
        return __EmptyEnum_enum_data.get_all_names()

    def __len__(cls):
        return __EmptyEnum_enum_data.size()


@__cython.final
@__cython.auto_pickle(False)
cdef class EmptyEnum(thrift.py3.types.CompiledEnum):
    cdef get_by_name(self, str name):
        return __EmptyEnum_enum_data.get_by_name(name)


    @staticmethod
    def __get_metadata__():
        cdef __fbthrift_cThriftMetadata meta
        EnumMetadata[cEmptyEnum].gen(meta)
        return __MetadataBox.box(cmove(meta))

    @staticmethod
    def __get_thrift_name__():
        return "module.EmptyEnum"


__SetMetaClass(<PyTypeObject*> EmptyEnum, <PyTypeObject*> __EmptyEnumMeta)


cdef __EnumData __MyEnum_enum_data  = __EnumData.create(thrift.py3.types.createEnumData[cMyEnum](), MyEnum)


@__cython.internal
@__cython.auto_pickle(False)
cdef class __MyEnumMeta(thrift.py3.types.EnumMeta):

    def __get_by_name(cls, str name):
        return __MyEnum_enum_data.get_by_name(name)

    def __get_by_value(cls, int value):
        return __MyEnum_enum_data.get_by_value(value)

    def __get_all_names(cls):
        return __MyEnum_enum_data.get_all_names()

    def __len__(cls):
        return __MyEnum_enum_data.size()


@__cython.final
@__cython.auto_pickle(False)
cdef class MyEnum(thrift.py3.types.CompiledEnum):
    cdef get_by_name(self, str name):
        return __MyEnum_enum_data.get_by_name(name)


    @staticmethod
    def __get_metadata__():
        cdef __fbthrift_cThriftMetadata meta
        EnumMetadata[cMyEnum].gen(meta)
        return __MetadataBox.box(cmove(meta))

    @staticmethod
    def __get_thrift_name__():
        return "module.MyEnum"


__SetMetaClass(<PyTypeObject*> MyEnum, <PyTypeObject*> __MyEnumMeta)


cdef __EnumData __MyBigEnum_enum_data  = __EnumData.create(thrift.py3.types.createEnumData[cMyBigEnum](), MyBigEnum)


@__cython.internal
@__cython.auto_pickle(False)
cdef class __MyBigEnumMeta(thrift.py3.types.EnumMeta):

    def __get_by_name(cls, str name):
        return __MyBigEnum_enum_data.get_by_name(name)

    def __get_by_value(cls, int value):
        return __MyBigEnum_enum_data.get_by_value(value)

    def __get_all_names(cls):
        return __MyBigEnum_enum_data.get_all_names()

    def __len__(cls):
        return __MyBigEnum_enum_data.size()


@__cython.final
@__cython.auto_pickle(False)
cdef class MyBigEnum(thrift.py3.types.CompiledEnum):
    cdef get_by_name(self, str name):
        return __MyBigEnum_enum_data.get_by_name(name)


    @staticmethod
    def __get_metadata__():
        cdef __fbthrift_cThriftMetadata meta
        EnumMetadata[cMyBigEnum].gen(meta)
        return __MetadataBox.box(cmove(meta))

    @staticmethod
    def __get_thrift_name__():
        return "module.MyBigEnum"


__SetMetaClass(<PyTypeObject*> MyBigEnum, <PyTypeObject*> __MyBigEnumMeta)



@__cython.auto_pickle(False)
cdef class MyStruct(thrift.py3.types.Struct):
    def __init__(MyStruct self, **kwargs):
        self._cpp_obj = make_shared[cMyStruct]()
        self._fields_setter = __fbthrift_types_fields.__MyStruct_FieldsSetter.create(self._cpp_obj.get())
        super().__init__(**kwargs)

    def __call__(MyStruct self, **kwargs):
        if not kwargs:
            return self
        cdef MyStruct __fbthrift_inst = MyStruct.__new__(MyStruct)
        __fbthrift_inst._cpp_obj = make_shared[cMyStruct](deref(self._cpp_obj))
        __fbthrift_inst._fields_setter = __fbthrift_types_fields.__MyStruct_FieldsSetter.create(__fbthrift_inst._cpp_obj.get())
        for __fbthrift_name, __fbthrift_value in kwargs.items():
            __fbthrift_inst.__fbthrift_set_field(__fbthrift_name, __fbthrift_value)
        return __fbthrift_inst

    cdef void __fbthrift_set_field(self, str name, object value) except *:
        self._fields_setter.set_field(name.encode("utf-8"), value)

    cdef object __fbthrift_isset(self):
        return thrift.py3.types._IsSet("MyStruct", {
          "myEnum": deref(self._cpp_obj).myEnum_ref().has_value(),
          "myBigEnum": deref(self._cpp_obj).myBigEnum_ref().has_value(),
        })

    @staticmethod
    cdef create(shared_ptr[cMyStruct] cpp_obj):
        __fbthrift_inst = <MyStruct>MyStruct.__new__(MyStruct)
        __fbthrift_inst._cpp_obj = cmove(cpp_obj)
        return __fbthrift_inst

    @property
    def myEnum(self):

        if self.__fbthrift_cached_myEnum is None:
            self.__fbthrift_cached_myEnum = translate_cpp_enum_to_python(MyEnum, <int>(deref(self._cpp_obj).myEnum_ref().value()))
        return self.__fbthrift_cached_myEnum

    @property
    def myBigEnum(self):

        if self.__fbthrift_cached_myBigEnum is None:
            self.__fbthrift_cached_myBigEnum = translate_cpp_enum_to_python(MyBigEnum, <int>(deref(self._cpp_obj).myBigEnum_ref().value()))
        return self.__fbthrift_cached_myBigEnum


    def __hash__(MyStruct self):
        return  super().__hash__()

    def __copy__(MyStruct self):
        cdef shared_ptr[cMyStruct] cpp_obj = make_shared[cMyStruct](
            deref(self._cpp_obj)
        )
        return MyStruct.create(cmove(cpp_obj))

    def __richcmp__(self, other, int op):
        r = self.__cmp_sametype(other, op)
        return __richcmp[cMyStruct](
            self._cpp_obj,
            (<MyStruct>other)._cpp_obj,
            op,
        ) if r is None else r

    @staticmethod
    def __get_reflection__():
        return _types_reflection.get_reflection__MyStruct()

    @staticmethod
    def __get_metadata__():
        cdef __fbthrift_cThriftMetadata meta
        StructMetadata[cMyStruct].gen(meta)
        return __MetadataBox.box(cmove(meta))

    @staticmethod
    def __get_thrift_name__():
        return "module.MyStruct"

    cdef __cstring_view __fbthrift_get_field_name_by_index(self, size_t idx):
        return __get_field_name_by_index[cMyStruct](idx)

    def __cinit__(self):
        self.__fbthrift_struct_size = 2

    cdef __iobuf.IOBuf _serialize(MyStruct self, __Protocol proto):
        cdef unique_ptr[__iobuf.cIOBuf] data
        with nogil:
            data = cmove(serializer.cserialize[cMyStruct](self._cpp_obj.get(), proto))
        return __iobuf.from_unique_ptr(cmove(data))

    cdef cuint32_t _deserialize(MyStruct self, const __iobuf.cIOBuf* buf, __Protocol proto) except? 0:
        cdef cuint32_t needed
        self._cpp_obj = make_shared[cMyStruct]()
        with nogil:
            needed = serializer.cdeserialize[cMyStruct](buf, self._cpp_obj.get(), proto)
        return needed


kOne = MyEnum(<int> (ckOne()))
