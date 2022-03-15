/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.basicannotations;

import static com.facebook.swift.service.SwiftConstants.STICKY_HASH_KEY;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.thrift.protocol.*;
import org.apache.thrift.ClientPushMetadata;
import org.apache.thrift.InteractionCreate;
import org.apache.thrift.InteractionTerminate;
import com.facebook.thrift.client.ResponseWrapper;
import com.facebook.thrift.client.RpcOptions;
import com.facebook.thrift.util.Readers;

public class MyServiceReactiveClient 
  implements MyService.Reactive {
  private static final AtomicLong _interactionCounter = new AtomicLong(0);

  protected final org.apache.thrift.ProtocolId _protocolId;
  protected final reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient;
  protected final Map<String, String> _headers;
  protected final Map<String, String> _persistentHeaders;
  protected final Set<Long> _activeInteractions;

  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _ping_EXCEPTION_READERS = new HashMap<>();
  private static final com.facebook.thrift.payload.Reader _ping_EXCEPTION_READER0 = Readers.wrap(test.fixtures.basicannotations.MyException.asReader());
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _getRandomData_EXCEPTION_READERS = java.util.Collections.emptyMap();
  private static final TField _hasDataById_ID_FIELD_DESC = new TField("id", TType.I64, (short)1);
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _hasDataById_EXCEPTION_READERS = java.util.Collections.emptyMap();
  private static final TField _getDataById_ID_FIELD_DESC = new TField("id", TType.I64, (short)1);
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _getDataById_EXCEPTION_READERS = java.util.Collections.emptyMap();
  private static final TField _putDataById_ID_FIELD_DESC = new TField("id", TType.I64, (short)1);
  private static final TField _putDataById_DATA_FIELD_DESC = new TField("data", TType.STRING, (short)2);
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _putDataById_EXCEPTION_READERS = java.util.Collections.emptyMap();
  private static final TField _lobDataById_ID_FIELD_DESC = new TField("id", TType.I64, (short)1);
  private static final TField _lobDataById_DATA_FIELD_DESC = new TField("data", TType.STRING, (short)2);
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _lobDataById_EXCEPTION_READERS = java.util.Collections.emptyMap();
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _doNothing_EXCEPTION_READERS = java.util.Collections.emptyMap();

  static {
    _ping_EXCEPTION_READERS.put((short)1, _ping_EXCEPTION_READER0);
  }

  public MyServiceReactiveClient(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient) {
    
    this._protocolId = _protocolId;
    this._rpcClient = _rpcClient;
    this._headers = java.util.Collections.emptyMap();
    this._persistentHeaders = java.util.Collections.emptyMap();
    this._activeInteractions = ConcurrentHashMap.newKeySet();
  }

  public MyServiceReactiveClient(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient, Map<String, String> _headers, Map<String, String> _persistentHeaders) {
    this(_protocolId, _rpcClient, _headers, _persistentHeaders, new AtomicLong(), ConcurrentHashMap.newKeySet());
  }

  public MyServiceReactiveClient(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient, Map<String, String> _headers, Map<String, String> _persistentHeaders, AtomicLong interactionCounter, Set<Long> activeInteractions) {
    
    this._protocolId = _protocolId;
    this._rpcClient = _rpcClient;
    this._headers = _headers;
    this._persistentHeaders = _persistentHeaders;
    this._activeInteractions = activeInteractions;
  }

  @java.lang.Override
  public void dispose() {}

  private com.facebook.thrift.payload.Writer _createpingWriter() {
    return oprot -> {
      try {

      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }

  private static final com.facebook.thrift.payload.Reader _ping_READER = Readers.voidReader();

  @java.lang.Override
  public reactor.core.publisher.Mono<com.facebook.thrift.client.ResponseWrapper<Void>> pingWrapper( final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return _rpcClient
      .flatMap(_rpc -> {
        org.apache.thrift.RequestRpcMetadata _metadata = new org.apache.thrift.RequestRpcMetadata.Builder()
                .setName("ping")
                .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_SINGLE_RESPONSE)
                .setOtherMetadata(getHeaders(rpcOptions))
                .setProtocol(_protocolId)
                .build();

            com.facebook.thrift.payload.ClientRequestPayload<Void> _crp =
                com.facebook.thrift.payload.ClientRequestPayload.create(
                    _createpingWriter(),
                    _ping_READER,
                    _ping_EXCEPTION_READERS,
                    _metadata,
                    java.util.Collections.emptyMap());

            return _rpc
                .singleRequestSingleResponse(_crp, rpcOptions).doOnNext(_p -> {if(_p.getException() != null) throw com.facebook.thrift.util.ExceptionUtil.propagate(_p);});
      });
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Void> ping( final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return pingWrapper( rpcOptions).then();
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Void> ping() {
    return ping( com.facebook.thrift.client.RpcOptions.EMPTY);
  }

  private com.facebook.thrift.payload.Writer _creategetRandomDataWriter() {
    return oprot -> {
      try {

      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }

  private static final com.facebook.thrift.payload.Reader _getRandomData_READER = Readers.stringReader();

  @java.lang.Override
  public reactor.core.publisher.Mono<com.facebook.thrift.client.ResponseWrapper<String>> getRandomDataWrapper( final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return _rpcClient
      .flatMap(_rpc -> {
        org.apache.thrift.RequestRpcMetadata _metadata = new org.apache.thrift.RequestRpcMetadata.Builder()
                .setName("getRandomData")
                .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_SINGLE_RESPONSE)
                .setOtherMetadata(getHeaders(rpcOptions))
                .setProtocol(_protocolId)
                .build();

            com.facebook.thrift.payload.ClientRequestPayload<String> _crp =
                com.facebook.thrift.payload.ClientRequestPayload.create(
                    _creategetRandomDataWriter(),
                    _getRandomData_READER,
                    _getRandomData_EXCEPTION_READERS,
                    _metadata,
                    java.util.Collections.emptyMap());

            return _rpc
                .singleRequestSingleResponse(_crp, rpcOptions).doOnNext(_p -> {if(_p.getException() != null) throw com.facebook.thrift.util.ExceptionUtil.propagate(_p);});
      });
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<String> getRandomData( final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return getRandomDataWrapper( rpcOptions).map(_p -> _p.getData());
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<String> getRandomData() {
    return getRandomData( com.facebook.thrift.client.RpcOptions.EMPTY);
  }

  private com.facebook.thrift.payload.Writer _createhasDataByIdWriter(final long id) {
    return oprot -> {
      try {
        {
          oprot.writeFieldBegin(_hasDataById_ID_FIELD_DESC);

          long _iter0 = id;

          oprot.writeI64(id);
          oprot.writeFieldEnd();
        }


      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }

  private static final com.facebook.thrift.payload.Reader _hasDataById_READER = Readers.booleanReader();

  @java.lang.Override
  public reactor.core.publisher.Mono<com.facebook.thrift.client.ResponseWrapper<Boolean>> hasDataByIdWrapper(final long id,  final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return _rpcClient
      .flatMap(_rpc -> {
        org.apache.thrift.RequestRpcMetadata _metadata = new org.apache.thrift.RequestRpcMetadata.Builder()
                .setName("hasDataById")
                .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_SINGLE_RESPONSE)
                .setOtherMetadata(getHeaders(rpcOptions))
                .setProtocol(_protocolId)
                .build();

            com.facebook.thrift.payload.ClientRequestPayload<Boolean> _crp =
                com.facebook.thrift.payload.ClientRequestPayload.create(
                    _createhasDataByIdWriter(id),
                    _hasDataById_READER,
                    _hasDataById_EXCEPTION_READERS,
                    _metadata,
                    java.util.Collections.emptyMap());

            return _rpc
                .singleRequestSingleResponse(_crp, rpcOptions).doOnNext(_p -> {if(_p.getException() != null) throw com.facebook.thrift.util.ExceptionUtil.propagate(_p);});
      });
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Boolean> hasDataById(final long id,  final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return hasDataByIdWrapper(id,  rpcOptions).map(_p -> _p.getData());
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Boolean> hasDataById(final long id) {
    return hasDataById(id,  com.facebook.thrift.client.RpcOptions.EMPTY);
  }

  private com.facebook.thrift.payload.Writer _creategetDataByIdWriter(final long id) {
    return oprot -> {
      try {
        {
          oprot.writeFieldBegin(_getDataById_ID_FIELD_DESC);

          long _iter0 = id;

          oprot.writeI64(id);
          oprot.writeFieldEnd();
        }


      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }

  private static final com.facebook.thrift.payload.Reader _getDataById_READER = Readers.stringReader();

  @java.lang.Override
  public reactor.core.publisher.Mono<com.facebook.thrift.client.ResponseWrapper<String>> getDataByIdWrapper(final long id,  final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return _rpcClient
      .flatMap(_rpc -> {
        org.apache.thrift.RequestRpcMetadata _metadata = new org.apache.thrift.RequestRpcMetadata.Builder()
                .setName("getDataById")
                .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_SINGLE_RESPONSE)
                .setOtherMetadata(getHeaders(rpcOptions))
                .setProtocol(_protocolId)
                .build();

            com.facebook.thrift.payload.ClientRequestPayload<String> _crp =
                com.facebook.thrift.payload.ClientRequestPayload.create(
                    _creategetDataByIdWriter(id),
                    _getDataById_READER,
                    _getDataById_EXCEPTION_READERS,
                    _metadata,
                    java.util.Collections.emptyMap());

            return _rpc
                .singleRequestSingleResponse(_crp, rpcOptions).doOnNext(_p -> {if(_p.getException() != null) throw com.facebook.thrift.util.ExceptionUtil.propagate(_p);});
      });
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<String> getDataById(final long id,  final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return getDataByIdWrapper(id,  rpcOptions).map(_p -> _p.getData());
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<String> getDataById(final long id) {
    return getDataById(id,  com.facebook.thrift.client.RpcOptions.EMPTY);
  }

  private com.facebook.thrift.payload.Writer _createputDataByIdWriter(final long id, final String data) {
    return oprot -> {
      try {
        {
          oprot.writeFieldBegin(_putDataById_ID_FIELD_DESC);

          long _iter0 = id;

          oprot.writeI64(id);
          oprot.writeFieldEnd();
        }

        {
          oprot.writeFieldBegin(_putDataById_DATA_FIELD_DESC);

          String _iter0 = data;

          oprot.writeString(data);
          oprot.writeFieldEnd();
        }


      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }

  private static final com.facebook.thrift.payload.Reader _putDataById_READER = Readers.voidReader();

  @java.lang.Override
  public reactor.core.publisher.Mono<com.facebook.thrift.client.ResponseWrapper<Void>> putDataByIdWrapper(final long id, final String data,  final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return _rpcClient
      .flatMap(_rpc -> {
        org.apache.thrift.RequestRpcMetadata _metadata = new org.apache.thrift.RequestRpcMetadata.Builder()
                .setName("putDataById")
                .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_SINGLE_RESPONSE)
                .setOtherMetadata(getHeaders(rpcOptions))
                .setProtocol(_protocolId)
                .build();

            com.facebook.thrift.payload.ClientRequestPayload<Void> _crp =
                com.facebook.thrift.payload.ClientRequestPayload.create(
                    _createputDataByIdWriter(id, data),
                    _putDataById_READER,
                    _putDataById_EXCEPTION_READERS,
                    _metadata,
                    java.util.Collections.emptyMap());

            return _rpc
                .singleRequestSingleResponse(_crp, rpcOptions).doOnNext(_p -> {if(_p.getException() != null) throw com.facebook.thrift.util.ExceptionUtil.propagate(_p);});
      });
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Void> putDataById(final long id, final String data,  final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return putDataByIdWrapper(id, data,  rpcOptions).then();
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Void> putDataById(final long id, final String data) {
    return putDataById(id, data,  com.facebook.thrift.client.RpcOptions.EMPTY);
  }

  private com.facebook.thrift.payload.Writer _createlobDataByIdWriter(final long id, final String data) {
    return oprot -> {
      try {
        {
          oprot.writeFieldBegin(_lobDataById_ID_FIELD_DESC);

          long _iter0 = id;

          oprot.writeI64(id);
          oprot.writeFieldEnd();
        }

        {
          oprot.writeFieldBegin(_lobDataById_DATA_FIELD_DESC);

          String _iter0 = data;

          oprot.writeString(data);
          oprot.writeFieldEnd();
        }


      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }

  private static final com.facebook.thrift.payload.Reader _lobDataById_READER = Readers.voidReader();

  @java.lang.Override
  public reactor.core.publisher.Mono<com.facebook.thrift.client.ResponseWrapper<Void>> lobDataByIdWrapper(final long id, final String data,  final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return _rpcClient
      .flatMap(_rpc -> {
        org.apache.thrift.RequestRpcMetadata _metadata = new org.apache.thrift.RequestRpcMetadata.Builder()
                .setName("lobDataById")
                .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_NO_RESPONSE)
                .setOtherMetadata(getHeaders(rpcOptions))
                .setProtocol(_protocolId)
                .build();

            com.facebook.thrift.payload.ClientRequestPayload<Void> _crp =
                com.facebook.thrift.payload.ClientRequestPayload.create(
                    _createlobDataByIdWriter(id, data),
                    _lobDataById_READER,
                    _lobDataById_EXCEPTION_READERS,
                    _metadata,
                    java.util.Collections.emptyMap());

            return _rpc
                .singleRequestNoResponse(_crp, rpcOptions).thenReturn(ResponseWrapper.create(null, java.util.Collections.emptyMap(), java.util.Collections.emptyMap()));
      });
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Void> lobDataById(final long id, final String data,  final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return lobDataByIdWrapper(id, data,  rpcOptions).then();
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Void> lobDataById(final long id, final String data) {
    return lobDataById(id, data,  com.facebook.thrift.client.RpcOptions.EMPTY);
  }

  private com.facebook.thrift.payload.Writer _createdoNothingWriter() {
    return oprot -> {
      try {

      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }

  private static final com.facebook.thrift.payload.Reader _doNothing_READER = Readers.voidReader();

  @java.lang.Override
  public reactor.core.publisher.Mono<com.facebook.thrift.client.ResponseWrapper<Void>> doNothingWrapper( final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return _rpcClient
      .flatMap(_rpc -> {
        org.apache.thrift.RequestRpcMetadata _metadata = new org.apache.thrift.RequestRpcMetadata.Builder()
                .setName("doNothing")
                .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_SINGLE_RESPONSE)
                .setOtherMetadata(getHeaders(rpcOptions))
                .setProtocol(_protocolId)
                .build();

            com.facebook.thrift.payload.ClientRequestPayload<Void> _crp =
                com.facebook.thrift.payload.ClientRequestPayload.create(
                    _createdoNothingWriter(),
                    _doNothing_READER,
                    _doNothing_EXCEPTION_READERS,
                    _metadata,
                    java.util.Collections.emptyMap());

            return _rpc
                .singleRequestSingleResponse(_crp, rpcOptions).doOnNext(_p -> {if(_p.getException() != null) throw com.facebook.thrift.util.ExceptionUtil.propagate(_p);});
      });
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Void> doNothing( final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return doNothingWrapper( rpcOptions).then();
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Void> doNothing() {
    return doNothing( com.facebook.thrift.client.RpcOptions.EMPTY);
  }



  private Map<String, String> getHeaders(com.facebook.thrift.client.RpcOptions rpcOptions) {
      Map<String, String> headers = new HashMap<>();
      if (rpcOptions.getRequestHeaders() != null && !rpcOptions.getRequestHeaders().isEmpty()) {
          headers.putAll(rpcOptions.getRequestHeaders());
      }
      if (_headers != null && !_headers.isEmpty()) {
          headers.putAll(_headers);
      }
      if (_persistentHeaders != null && !_persistentHeaders.isEmpty()) {
          headers.putAll(_persistentHeaders);
      }
      return headers;
  }
}
