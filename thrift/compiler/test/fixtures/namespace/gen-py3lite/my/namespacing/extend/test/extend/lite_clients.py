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
import my.namespacing.extend.test.extend.lite_types
import my.namespacing.test.hsmodule.lite_types
import my.namespacing.test.hsmodule.lite_clients


class ExtendTestService(_fbthrift_py3lite_ClientWrapper["ExtendTestService.Async", "ExtendTestService.Sync"]):
    class Sync(my.namespacing.test.hsmodule.lite_clients.HsTestService.Sync):
        def __init__(self, channel):
            super().__init__(channel)

        def check(
            self,
            struct1: my.namespacing.test.hsmodule.lite_types.HsFoo
        ) -> bool:
            resp = self._send_request(
                "ExtendTestService",
                "check",
                my.namespacing.extend.test.extend.lite_types._fbthrift_ExtendTestService_check_args(
                    struct1=struct1,),
                my.namespacing.extend.test.extend.lite_types._fbthrift_ExtendTestService_check_result,
            )
            # shortcut to success path for non-void returns
            if resp.success is not None:
                return resp.success
            raise _fbthrift_py3lite_exceptions.ApplicationError(
                _fbthrift_py3lite_exceptions.ApplicationErrorType.MISSING_RESULT,
                "Empty Response",
            )

    class Async(my.namespacing.test.hsmodule.lite_clients.HsTestService.Async):
        def __init__(self):
            super().__init__()

        async def check(
            self,
            struct1: my.namespacing.test.hsmodule.lite_types.HsFoo
        ) -> bool:
            resp = await self._send_request(
                "ExtendTestService",
                "check",
                my.namespacing.extend.test.extend.lite_types._fbthrift_ExtendTestService_check_args(
                    struct1=struct1,),
                my.namespacing.extend.test.extend.lite_types._fbthrift_ExtendTestService_check_result,
            )
            # shortcut to success path for non-void returns
            if resp.success is not None:
                return resp.success
            raise _fbthrift_py3lite_exceptions.ApplicationError(
                _fbthrift_py3lite_exceptions.ApplicationErrorType.MISSING_RESULT,
                "Empty Response",
            )


