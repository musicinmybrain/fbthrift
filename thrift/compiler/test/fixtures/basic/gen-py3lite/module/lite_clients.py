#
# Autogenerated by Thrift
#
# DO NOT EDIT
#  @generated
#

from thrift.py3lite.client import AsyncClient as _fbthrift_py3lite_AsyncClient
from thrift.py3lite.client.client_wrapper import ClientWrapper as _fbthrift_py3lite_ClientWrapper
from thrift.py3lite.sync_client import SyncClient as _fbthrift_py3lite_SyncClient
import thrift.py3lite.exceptions as _fbthrift_py3lite_exceptions
import thrift.py3lite.types as _fbthrift_py3lite_types
import module.lite_types


class MyService(_fbthrift_py3lite_ClientWrapper["MyService.Async", "MyService.Sync"]):
    class Sync(_fbthrift_py3lite_SyncClient):
        def __init__(self, channel):
            super().__init__(channel)

        def ping(
            self
        ) -> None:
            resp = self._send_request(
                "MyService",
                "ping",
                module.lite_types._fbthrift_MyService_ping_args(),
                module.lite_types._fbthrift_MyService_ping_result,
            )

        def getRandomData(
            self
        ) -> str:
            resp = self._send_request(
                "MyService",
                "getRandomData",
                module.lite_types._fbthrift_MyService_getRandomData_args(),
                module.lite_types._fbthrift_MyService_getRandomData_result,
            )
            # shortcut to success path for non-void returns
            if resp.success is not None:
                return resp.success
            raise _fbthrift_py3lite_exceptions.ApplicationError(
                _fbthrift_py3lite_exceptions.ApplicationErrorType.MISSING_RESULT,
                "Empty Response",
            )

        def sink(
            self,
            sink: int
        ) -> None:
            resp = self._send_request(
                "MyService",
                "sink",
                module.lite_types._fbthrift_MyService_sink_args(
                    sink=sink,),
                module.lite_types._fbthrift_MyService_sink_result,
            )

        def putDataById(
            self,
            id: int,
            data: str
        ) -> None:
            resp = self._send_request(
                "MyService",
                "putDataById",
                module.lite_types._fbthrift_MyService_putDataById_args(
                    id=id,
                    data=data,),
                module.lite_types._fbthrift_MyService_putDataById_result,
            )

        def hasDataById(
            self,
            id: int
        ) -> bool:
            resp = self._send_request(
                "MyService",
                "hasDataById",
                module.lite_types._fbthrift_MyService_hasDataById_args(
                    id=id,),
                module.lite_types._fbthrift_MyService_hasDataById_result,
            )
            # shortcut to success path for non-void returns
            if resp.success is not None:
                return resp.success
            raise _fbthrift_py3lite_exceptions.ApplicationError(
                _fbthrift_py3lite_exceptions.ApplicationErrorType.MISSING_RESULT,
                "Empty Response",
            )

        def getDataById(
            self,
            id: int
        ) -> str:
            resp = self._send_request(
                "MyService",
                "getDataById",
                module.lite_types._fbthrift_MyService_getDataById_args(
                    id=id,),
                module.lite_types._fbthrift_MyService_getDataById_result,
            )
            # shortcut to success path for non-void returns
            if resp.success is not None:
                return resp.success
            raise _fbthrift_py3lite_exceptions.ApplicationError(
                _fbthrift_py3lite_exceptions.ApplicationErrorType.MISSING_RESULT,
                "Empty Response",
            )

        def deleteDataById(
            self,
            id: int
        ) -> None:
            resp = self._send_request(
                "MyService",
                "deleteDataById",
                module.lite_types._fbthrift_MyService_deleteDataById_args(
                    id=id,),
                module.lite_types._fbthrift_MyService_deleteDataById_result,
            )

        def lobDataById(
            self,
            id: int,
            data: str
        ) -> None:
            resp = self._send_request(
                "MyService",
                "lobDataById",
                module.lite_types._fbthrift_MyService_lobDataById_args(
                    id=id,
                    data=data,),
                None,
            )

    class Async(_fbthrift_py3lite_AsyncClient):
        def __init__(self):
            super().__init__()

        async def ping(
            self
        ) -> None:
            resp = await self._send_request(
                "MyService",
                "ping",
                module.lite_types._fbthrift_MyService_ping_args(),
                module.lite_types._fbthrift_MyService_ping_result,
            )

        async def getRandomData(
            self
        ) -> str:
            resp = await self._send_request(
                "MyService",
                "getRandomData",
                module.lite_types._fbthrift_MyService_getRandomData_args(),
                module.lite_types._fbthrift_MyService_getRandomData_result,
            )
            # shortcut to success path for non-void returns
            if resp.success is not None:
                return resp.success
            raise _fbthrift_py3lite_exceptions.ApplicationError(
                _fbthrift_py3lite_exceptions.ApplicationErrorType.MISSING_RESULT,
                "Empty Response",
            )

        async def sink(
            self,
            sink: int
        ) -> None:
            resp = await self._send_request(
                "MyService",
                "sink",
                module.lite_types._fbthrift_MyService_sink_args(
                    sink=sink,),
                module.lite_types._fbthrift_MyService_sink_result,
            )

        async def putDataById(
            self,
            id: int,
            data: str
        ) -> None:
            resp = await self._send_request(
                "MyService",
                "putDataById",
                module.lite_types._fbthrift_MyService_putDataById_args(
                    id=id,
                    data=data,),
                module.lite_types._fbthrift_MyService_putDataById_result,
            )

        async def hasDataById(
            self,
            id: int
        ) -> bool:
            resp = await self._send_request(
                "MyService",
                "hasDataById",
                module.lite_types._fbthrift_MyService_hasDataById_args(
                    id=id,),
                module.lite_types._fbthrift_MyService_hasDataById_result,
            )
            # shortcut to success path for non-void returns
            if resp.success is not None:
                return resp.success
            raise _fbthrift_py3lite_exceptions.ApplicationError(
                _fbthrift_py3lite_exceptions.ApplicationErrorType.MISSING_RESULT,
                "Empty Response",
            )

        async def getDataById(
            self,
            id: int
        ) -> str:
            resp = await self._send_request(
                "MyService",
                "getDataById",
                module.lite_types._fbthrift_MyService_getDataById_args(
                    id=id,),
                module.lite_types._fbthrift_MyService_getDataById_result,
            )
            # shortcut to success path for non-void returns
            if resp.success is not None:
                return resp.success
            raise _fbthrift_py3lite_exceptions.ApplicationError(
                _fbthrift_py3lite_exceptions.ApplicationErrorType.MISSING_RESULT,
                "Empty Response",
            )

        async def deleteDataById(
            self,
            id: int
        ) -> None:
            resp = await self._send_request(
                "MyService",
                "deleteDataById",
                module.lite_types._fbthrift_MyService_deleteDataById_args(
                    id=id,),
                module.lite_types._fbthrift_MyService_deleteDataById_result,
            )

        async def lobDataById(
            self,
            id: int,
            data: str
        ) -> None:
            resp = await self._send_request(
                "MyService",
                "lobDataById",
                module.lite_types._fbthrift_MyService_lobDataById_args(
                    id=id,
                    data=data,),
                None,
            )


class DbMixedStackArguments(_fbthrift_py3lite_ClientWrapper["DbMixedStackArguments.Async", "DbMixedStackArguments.Sync"]):
    class Sync(_fbthrift_py3lite_SyncClient):
        def __init__(self, channel):
            super().__init__(channel)

        def getDataByKey0(
            self,
            key: str
        ) -> bytes:
            resp = self._send_request(
                "DbMixedStackArguments",
                "getDataByKey0",
                module.lite_types._fbthrift_DbMixedStackArguments_getDataByKey0_args(
                    key=key,),
                module.lite_types._fbthrift_DbMixedStackArguments_getDataByKey0_result,
            )
            # shortcut to success path for non-void returns
            if resp.success is not None:
                return resp.success
            raise _fbthrift_py3lite_exceptions.ApplicationError(
                _fbthrift_py3lite_exceptions.ApplicationErrorType.MISSING_RESULT,
                "Empty Response",
            )

        def getDataByKey1(
            self,
            key: str
        ) -> bytes:
            resp = self._send_request(
                "DbMixedStackArguments",
                "getDataByKey1",
                module.lite_types._fbthrift_DbMixedStackArguments_getDataByKey1_args(
                    key=key,),
                module.lite_types._fbthrift_DbMixedStackArguments_getDataByKey1_result,
            )
            # shortcut to success path for non-void returns
            if resp.success is not None:
                return resp.success
            raise _fbthrift_py3lite_exceptions.ApplicationError(
                _fbthrift_py3lite_exceptions.ApplicationErrorType.MISSING_RESULT,
                "Empty Response",
            )

    class Async(_fbthrift_py3lite_AsyncClient):
        def __init__(self):
            super().__init__()

        async def getDataByKey0(
            self,
            key: str
        ) -> bytes:
            resp = await self._send_request(
                "DbMixedStackArguments",
                "getDataByKey0",
                module.lite_types._fbthrift_DbMixedStackArguments_getDataByKey0_args(
                    key=key,),
                module.lite_types._fbthrift_DbMixedStackArguments_getDataByKey0_result,
            )
            # shortcut to success path for non-void returns
            if resp.success is not None:
                return resp.success
            raise _fbthrift_py3lite_exceptions.ApplicationError(
                _fbthrift_py3lite_exceptions.ApplicationErrorType.MISSING_RESULT,
                "Empty Response",
            )

        async def getDataByKey1(
            self,
            key: str
        ) -> bytes:
            resp = await self._send_request(
                "DbMixedStackArguments",
                "getDataByKey1",
                module.lite_types._fbthrift_DbMixedStackArguments_getDataByKey1_args(
                    key=key,),
                module.lite_types._fbthrift_DbMixedStackArguments_getDataByKey1_result,
            )
            # shortcut to success path for non-void returns
            if resp.success is not None:
                return resp.success
            raise _fbthrift_py3lite_exceptions.ApplicationError(
                _fbthrift_py3lite_exceptions.ApplicationErrorType.MISSING_RESULT,
                "Empty Response",
            )


