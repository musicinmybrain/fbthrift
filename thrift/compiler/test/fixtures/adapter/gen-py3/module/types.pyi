#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

import folly.iobuf as _fbthrift_iobuf
import thrift.py3.types
import thrift.py3.exceptions
from thrift.py3.types import __NotSet, NOTSET
import typing as _typing
from typing_extensions import Final

import sys
import itertools
import facebook.thrift.annotation.cpp.types as _facebook_thrift_annotation_cpp_types
import facebook.thrift.annotation.hack.types as _facebook_thrift_annotation_hack_types
import facebook.thrift.annotation.python.types as _facebook_thrift_annotation_python_types
import facebook.thrift.annotation.thrift.types as _facebook_thrift_annotation_thrift_types


__property__ = property


class Foo(thrift.py3.types.Struct, _typing.Hashable):
    class __fbthrift_IsSet:
        intField: bool
        optionalIntField: bool
        intFieldWithDefault: bool
        setField: bool
        optionalSetField: bool
        mapField: bool
        optionalMapField: bool
        binaryField: bool
        longField: bool
        adaptedLongField: bool
        doubleAdaptedField: bool
        pass

    intField: Final[int] = ...

    optionalIntField: Final[_typing.Optional[int]] = ...

    intFieldWithDefault: Final[int] = ...

    setField: Final[_typing.AbstractSet[str]] = ...

    optionalSetField: Final[_typing.Optional[_typing.AbstractSet[str]]] = ...

    mapField: Final[_typing.Mapping[str, _typing.Sequence[str]]] = ...

    optionalMapField: Final[_typing.Optional[_typing.Mapping[str, _typing.Sequence[str]]]] = ...

    binaryField: Final[bytes] = ...

    longField: Final[int] = ...

    adaptedLongField: Final[int] = ...

    doubleAdaptedField: Final[int] = ...

    def __init__(
        self, *,
        intField: _typing.Optional[int]=None,
        optionalIntField: _typing.Optional[int]=None,
        intFieldWithDefault: _typing.Optional[int]=None,
        setField: _typing.Optional[_typing.AbstractSet[str]]=None,
        optionalSetField: _typing.Optional[_typing.AbstractSet[str]]=None,
        mapField: _typing.Optional[_typing.Mapping[str, _typing.Sequence[str]]]=None,
        optionalMapField: _typing.Optional[_typing.Mapping[str, _typing.Sequence[str]]]=None,
        binaryField: _typing.Optional[bytes]=None,
        longField: _typing.Optional[int]=None,
        adaptedLongField: _typing.Optional[int]=None,
        doubleAdaptedField: _typing.Optional[int]=None
    ) -> None: ...

    def __call__(
        self, *,
        intField: _typing.Union[int, '__NotSet', None]=NOTSET,
        optionalIntField: _typing.Union[int, '__NotSet', None]=NOTSET,
        intFieldWithDefault: _typing.Union[int, '__NotSet', None]=NOTSET,
        setField: _typing.Union[_typing.AbstractSet[str], '__NotSet', None]=NOTSET,
        optionalSetField: _typing.Union[_typing.AbstractSet[str], '__NotSet', None]=NOTSET,
        mapField: _typing.Union[_typing.Mapping[str, _typing.Sequence[str]], '__NotSet', None]=NOTSET,
        optionalMapField: _typing.Union[_typing.Mapping[str, _typing.Sequence[str]], '__NotSet', None]=NOTSET,
        binaryField: _typing.Union[bytes, '__NotSet', None]=NOTSET,
        longField: _typing.Union[int, '__NotSet', None]=NOTSET,
        adaptedLongField: _typing.Union[int, '__NotSet', None]=NOTSET,
        doubleAdaptedField: _typing.Union[int, '__NotSet', None]=NOTSET
    ) -> Foo: ...

    def __reduce__(self) -> _typing.Tuple[_typing.Callable, _typing.Tuple[_typing.Type['Foo'], bytes]]: ...
    def __hash__(self) -> int: ...
    def __str__(self) -> str: ...
    def __repr__(self) -> str: ...


class Baz(thrift.py3.types.Union, _typing.Hashable):
    class __fbthrift_IsSet:
        intField: bool
        setField: bool
        mapField: bool
        binaryField: bool
        longField: bool
        pass

    intField: Final[int] = ...

    setField: Final[_typing.AbstractSet[str]] = ...

    mapField: Final[_typing.Mapping[str, _typing.Sequence[str]]] = ...

    binaryField: Final[bytes] = ...

    longField: Final[int] = ...

    def __init__(
        self, *,
        intField: _typing.Optional[int]=None,
        setField: _typing.Optional[_typing.AbstractSet[str]]=None,
        mapField: _typing.Optional[_typing.Mapping[str, _typing.Sequence[str]]]=None,
        binaryField: _typing.Optional[bytes]=None,
        longField: _typing.Optional[int]=None
    ) -> None: ...

    def __hash__(self) -> int: ...
    def __str__(self) -> str: ...
    def __repr__(self) -> str: ...

    class Type(thrift.py3.types.Enum):
        EMPTY: Baz.Type = ...
        intField: Baz.Type = ...
        setField: Baz.Type = ...
        mapField: Baz.Type = ...
        binaryField: Baz.Type = ...
        longField: Baz.Type = ...

    @staticmethod
    def fromValue(value: _typing.Union[None, int, _typing.AbstractSet[str], _typing.Mapping[str, _typing.Sequence[str]], bytes, int]) -> Baz: ...
    @__property__
    def value(self) -> _typing.Union[None, int, _typing.AbstractSet[str], _typing.Mapping[str, _typing.Sequence[str]], bytes, int]: ...
    @__property__
    def type(self) -> "Baz.Type": ...


class Bar(thrift.py3.types.Struct, _typing.Hashable):
    class __fbthrift_IsSet:
        structField: bool
        optionalStructField: bool
        structListField: bool
        optionalStructListField: bool
        unionField: bool
        optionalUnionField: bool
        pass

    structField: Final[Foo] = ...

    optionalStructField: Final[_typing.Optional[Foo]] = ...

    structListField: Final[_typing.Sequence[Foo]] = ...

    optionalStructListField: Final[_typing.Optional[_typing.Sequence[Foo]]] = ...

    unionField: Final[Baz] = ...

    optionalUnionField: Final[_typing.Optional[Baz]] = ...

    def __init__(
        self, *,
        structField: _typing.Optional[Foo]=None,
        optionalStructField: _typing.Optional[Foo]=None,
        structListField: _typing.Optional[_typing.Sequence[Foo]]=None,
        optionalStructListField: _typing.Optional[_typing.Sequence[Foo]]=None,
        unionField: _typing.Optional[Baz]=None,
        optionalUnionField: _typing.Optional[Baz]=None
    ) -> None: ...

    def __call__(
        self, *,
        structField: _typing.Union[Foo, '__NotSet', None]=NOTSET,
        optionalStructField: _typing.Union[Foo, '__NotSet', None]=NOTSET,
        structListField: _typing.Union[_typing.Sequence[Foo], '__NotSet', None]=NOTSET,
        optionalStructListField: _typing.Union[_typing.Sequence[Foo], '__NotSet', None]=NOTSET,
        unionField: _typing.Union[Baz, '__NotSet', None]=NOTSET,
        optionalUnionField: _typing.Union[Baz, '__NotSet', None]=NOTSET
    ) -> Bar: ...

    def __reduce__(self) -> _typing.Tuple[_typing.Callable, _typing.Tuple[_typing.Type['Bar'], bytes]]: ...
    def __hash__(self) -> int: ...
    def __str__(self) -> str: ...
    def __repr__(self) -> str: ...


class StructWithFieldAdapter(thrift.py3.types.Struct, _typing.Hashable):
    class __fbthrift_IsSet:
        field: bool
        opt_boxed_field: bool
        pass

    field: Final[int] = ...

    shared_field: Final[_typing.Optional[int]] = ...

    opt_shared_field: Final[_typing.Optional[int]] = ...

    opt_boxed_field: Final[_typing.Optional[int]] = ...

    def __init__(
        self, *,
        field: _typing.Optional[int]=None,
        shared_field: _typing.Optional[int]=None,
        opt_shared_field: _typing.Optional[int]=None,
        opt_boxed_field: _typing.Optional[int]=None
    ) -> None: ...

    def __call__(
        self, *,
        field: _typing.Union[int, '__NotSet', None]=NOTSET,
        shared_field: _typing.Union[int, '__NotSet', None]=NOTSET,
        opt_shared_field: _typing.Union[int, '__NotSet', None]=NOTSET,
        opt_boxed_field: _typing.Union[int, '__NotSet', None]=NOTSET
    ) -> StructWithFieldAdapter: ...

    def __reduce__(self) -> _typing.Tuple[_typing.Callable, _typing.Tuple[_typing.Type['StructWithFieldAdapter'], bytes]]: ...
    def __hash__(self) -> int: ...
    def __str__(self) -> str: ...
    def __repr__(self) -> str: ...
    def __lt__(self, other: 'StructWithFieldAdapter') -> bool: ...
    def __gt__(self, other: 'StructWithFieldAdapter') -> bool: ...
    def __le__(self, other: 'StructWithFieldAdapter') -> bool: ...
    def __ge__(self, other: 'StructWithFieldAdapter') -> bool: ...


class B(thrift.py3.types.Struct, _typing.Hashable):
    class __fbthrift_IsSet:
        a: bool
        pass

    a: Final[A] = ...

    def __init__(
        self, *,
        a: _typing.Optional[A]=None
    ) -> None: ...

    def __call__(
        self, *,
        a: _typing.Union[A, '__NotSet', None]=NOTSET
    ) -> B: ...

    def __reduce__(self) -> _typing.Tuple[_typing.Callable, _typing.Tuple[_typing.Type['B'], bytes]]: ...
    def __hash__(self) -> int: ...
    def __str__(self) -> str: ...
    def __repr__(self) -> str: ...
    def __lt__(self, other: 'B') -> bool: ...
    def __gt__(self, other: 'B') -> bool: ...
    def __le__(self, other: 'B') -> bool: ...
    def __ge__(self, other: 'B') -> bool: ...


class A(thrift.py3.types.Struct, _typing.Hashable):
    class __fbthrift_IsSet:
        pass

    def __init__(
        self, 
    ) -> None: ...

    def __call__(
        self, 
    ) -> A: ...

    def __reduce__(self) -> _typing.Tuple[_typing.Callable, _typing.Tuple[_typing.Type['A'], bytes]]: ...
    def __hash__(self) -> int: ...
    def __str__(self) -> str: ...
    def __repr__(self) -> str: ...
    def __lt__(self, other: 'A') -> bool: ...
    def __gt__(self, other: 'A') -> bool: ...
    def __le__(self, other: 'A') -> bool: ...
    def __ge__(self, other: 'A') -> bool: ...


class Set__string(_typing.AbstractSet[str], _typing.Hashable):
    def __init__(self, items: _typing.Optional[_typing.AbstractSet[str]]=None) -> None: ...
    def __len__(self) -> int: ...
    def __hash__(self) -> int: ...
    def __copy__(self) -> _typing.AbstractSet[str]: ...
    def __contains__(self, x: object) -> bool: ...
    def union(self, other: _typing.AbstractSet[str]) -> 'Set__string': ...
    def intersection(self, other: _typing.AbstractSet[str]) -> 'Set__string': ...
    def difference(self, other: _typing.AbstractSet[str]) -> 'Set__string': ...
    def symmetric_difference(self, other: _typing.AbstractSet[str]) -> 'Set__string': ...
    def issubset(self, other: _typing.AbstractSet[str]) -> bool: ...
    def issuperset(self, other: _typing.AbstractSet[str]) -> bool: ...
    def __iter__(self) -> _typing.Iterator[str]: ...


_List__stringT = _typing.TypeVar('_List__stringT', bound=_typing.Sequence[str])


class List__string(_typing.Sequence[str], _typing.Hashable):
    def __init__(self, items: _typing.Optional[_typing.Sequence[str]]=None) -> None: ...
    def __len__(self) -> int: ...
    def __hash__(self) -> int: ...
    def __copy__(self) -> _typing.Sequence[str]: ...
    @_typing.overload
    def __getitem__(self, i: int) -> str: ...
    @_typing.overload
    def __getitem__(self, s: slice) -> _typing.Sequence[str]: ...
    def __add__(self, other: _typing.Sequence[str]) -> 'List__string': ...
    def __radd__(self, other: _List__stringT) -> _List__stringT: ...
    def __reversed__(self) -> _typing.Iterator[str]: ...
    def __iter__(self) -> _typing.Iterator[str]: ...


class Map__string_List__string(_typing.Mapping[str, _typing.Sequence[str]], _typing.Hashable):
    def __init__(self, items: _typing.Optional[_typing.Mapping[str, _typing.Sequence[str]]]=None) -> None: ...
    def __len__(self) -> int: ...
    def __hash__(self) -> int: ...
    def __copy__(self) -> _typing.Mapping[str, _typing.Sequence[str]]: ...
    def __getitem__(self, key: str) -> _typing.Sequence[str]: ...
    def __iter__(self) -> _typing.Iterator[str]: ...


_List__FooT = _typing.TypeVar('_List__FooT', bound=_typing.Sequence[Foo])


class List__Foo(_typing.Sequence[Foo], _typing.Hashable):
    def __init__(self, items: _typing.Optional[_typing.Sequence[Foo]]=None) -> None: ...
    def __len__(self) -> int: ...
    def __hash__(self) -> int: ...
    def __copy__(self) -> _typing.Sequence[Foo]: ...
    @_typing.overload
    def __getitem__(self, i: int) -> Foo: ...
    @_typing.overload
    def __getitem__(self, s: slice) -> _typing.Sequence[Foo]: ...
    def __add__(self, other: _typing.Sequence[Foo]) -> 'List__Foo': ...
    def __radd__(self, other: _List__FooT) -> _List__FooT: ...
    def __reversed__(self) -> _typing.Iterator[Foo]: ...
    def __iter__(self) -> _typing.Iterator[Foo]: ...


SetWithAdapter = Set__string
StringWithAdapter = str
ListWithElemAdapter = List__string
ListWithElemAdapter_withAdapter = List__string
MyI64 = int
DoubleTypedefI64 = int
MyI32 = int
FooWithAdapter = Foo
StructWithAdapter = Bar
UnionWithAdapter = Baz
AdaptedA = A
