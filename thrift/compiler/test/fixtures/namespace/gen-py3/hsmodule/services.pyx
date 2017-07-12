#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

from libcpp.memory cimport shared_ptr, make_shared, unique_ptr, make_unique
from libcpp.string cimport string
from libcpp cimport bool as cbool
from cpython cimport bool as pbool
from libc.stdint cimport int8_t, int16_t, int32_t, int64_t
from libcpp.vector cimport vector
from libcpp.set cimport set as cset
from libcpp.map cimport map as cmap
from cython.operator cimport dereference as deref
from cpython.ref cimport PyObject
from thrift.py3.exceptions cimport cTApplicationException
from thrift.py3.server cimport ServiceInterface, RequestContext, Cpp2RequestContext
from thrift.py3.server import RequestContext
from folly cimport (
  cFollyPromise,
  cFollyUnit,
  c_unit
)

cimport folly.futures
from folly.executor cimport get_executor

cimport hsmodule.types
import hsmodule.types

import asyncio
import functools
import sys
import traceback

from hsmodule.services_wrapper cimport cHsTestServiceInterface


cdef extern from "<utility>" namespace "std":
    cdef cFollyPromise[unique_ptr[string]] move(cFollyPromise[unique_ptr[string]])
    cdef cFollyPromise[int64_t] move(
        cFollyPromise[int64_t])

cdef class Promise_i64:
    cdef cFollyPromise[int64_t] cPromise

    @staticmethod
    cdef create(cFollyPromise[int64_t] cPromise):
        inst = <Promise_i64>Promise_i64.__new__(Promise_i64)
        inst.cPromise = move(cPromise)
        return inst

cdef class HsTestServiceInterface(
    ServiceInterface
):
    def __cinit__(self):
        self.interface_wrapper = cHsTestServiceInterface(
            <PyObject *> self,
            get_executor()
        )

    async def init(
            self,
            int1):
        raise NotImplementedError("async def init is not implemented")




cdef api void call_cy_HsTestService_init(
    object self,
    Cpp2RequestContext* ctx,
    cFollyPromise[int64_t] cPromise,
    int64_t int1
):
    cdef HsTestServiceInterface iface
    iface = self
    promise = Promise_i64.create(move(cPromise))
    arg_int1 = int1
    context = None
    if iface._pass_context_init:
        context = RequestContext.create(ctx)
    asyncio.get_event_loop().create_task(
        HsTestService_init_coro(
            self,
            context,
            promise,
            arg_int1
        )
    )

async def HsTestService_init_coro(
    object self,
    object ctx,
    Promise_i64 promise,
    int1
):
    try:
        if ctx is not None:
            result = await self.init(ctx,
                      int1)
        else:
            result = await self.init(
                      int1)
    except Exception as ex:
        print(
            "Unexpected error in service handler init:",
            file=sys.stderr)
        traceback.print_exc()
        promise.cPromise.setException(cTApplicationException(
            repr(ex).encode('UTF-8')
        ))
    else:
        promise.cPromise.setValue(<int64_t> result)

