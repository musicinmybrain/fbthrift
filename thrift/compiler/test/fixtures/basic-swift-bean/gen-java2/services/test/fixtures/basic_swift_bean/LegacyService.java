/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.basic_swift_bean;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.service.*;
import com.facebook.thrift.client.*;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.*;
import java.util.*;
import reactor.core.publisher.Mono;

@SwiftGenerated
@com.facebook.swift.service.ThriftService("LegacyService")
public interface LegacyService extends java.io.Closeable, com.facebook.thrift.util.BlockingService {
    static com.facebook.thrift.server.RpcServerHandler createRpcServerHandler(
        final LegacyService _serviceImpl,
        final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
        return new LegacyServiceRpcServerHandler(_serviceImpl, _eventHandlers);
    }

    static reactor.core.publisher.Mono<? extends com.facebook.thrift.server.ServerTransport> createServer(
        final com.facebook.swift.service.ThriftServerConfig _thriftServerConfig,
        final com.facebook.thrift.util.TransportType _transportType,
        final LegacyService _serviceImpl,
        final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {

        final com.facebook.thrift.server.RpcServerHandler _serverHandler = createRpcServerHandler(_serviceImpl, _eventHandlers);

        return com.facebook.thrift.util.RpcServerUtils.createServerTransport(_thriftServerConfig, _transportType, _serverHandler);
    }

    static ClientBuilder<LegacyService> clientBuilder() {
        return new ClientBuilder<LegacyService>() {
            @Override
            public LegacyService build(Mono<RpcClient> rpcClientMono) {
                LegacyService.Reactive _delegate =
                    new LegacyServiceReactiveClient(protocolId, rpcClientMono, headers, persistentHeaders);
                return new LegacyServiceReactiveBlockingWrapper(_delegate);
            }
        };
    }

    @Deprecated
    static LegacyService createClient(
      final com.facebook.thrift.client.RpcClientFactory _rpcClientFactory,
      final java.net.SocketAddress _socketAddress,
      final org.apache.thrift.ProtocolId _protocolId) {
        LegacyService.Reactive _delegate = Reactive.createClient(
            _rpcClientFactory,
            _socketAddress,
            _protocolId);
        return new LegacyServiceReactiveBlockingWrapper(_delegate);
    }

    @Deprecated
    static LegacyService createClient(
      final com.facebook.thrift.client.RpcClientFactory _rpcClientFactory,
      final java.net.SocketAddress _socketAddress,
      final org.apache.thrift.ProtocolId _protocolId,
      final java.util.Map<String, String> _headers,
      final java.util.Map<String, String> _persistentHeaders) {
        LegacyService.Reactive _delegate = Reactive.createClient(
            _rpcClientFactory,
            _socketAddress,
            _protocolId,
            _headers,
            _persistentHeaders);
        return new LegacyServiceReactiveBlockingWrapper(_delegate);
    }

    @Deprecated
    static LegacyService createClient(
      final reactor.core.publisher.Mono<com.facebook.thrift.client.RpcClient> _rpcClientMono,
      final org.apache.thrift.ProtocolId _protocolId) {
        LegacyService.Reactive _delegate = Reactive.createClient(
            _rpcClientMono,
            _protocolId);
        return new LegacyServiceReactiveBlockingWrapper(_delegate);
    }

    @Deprecated
    static LegacyService createClient(
      final reactor.core.publisher.Mono<com.facebook.thrift.client.RpcClient> _rpcClientMono,
      final org.apache.thrift.ProtocolId _protocolId,
      final java.util.Map<String, String> _headers,
      final java.util.Map<String, String> _persistentHeaders) {
        LegacyService.Reactive _delegate = Reactive.createClient(
            _rpcClientMono,
            _protocolId,
            _headers,
            _persistentHeaders);
        return new LegacyServiceReactiveBlockingWrapper(_delegate);
    }

    @com.facebook.swift.service.ThriftService("LegacyService")
    public interface Async extends java.io.Closeable, com.facebook.thrift.util.AsyncService {
        static com.facebook.thrift.server.RpcServerHandler createRpcServerHandler(
        final LegacyService.Async _serviceImpl,
        final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
            return new LegacyServiceRpcServerHandler(_serviceImpl, _eventHandlers);
        }

        static reactor.core.publisher.Mono<? extends com.facebook.thrift.server.ServerTransport> createServer(
            final com.facebook.swift.service.ThriftServerConfig _thriftServerConfig,
            final com.facebook.thrift.util.TransportType _transportType,
            final LegacyService.Async _serviceImpl,
            final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {

            final com.facebook.thrift.server.RpcServerHandler _serverHandler = createRpcServerHandler(_serviceImpl, _eventHandlers);

            return com.facebook.thrift.util.RpcServerUtils.createServerTransport(_thriftServerConfig, _transportType, _serverHandler);
        }

        static ClientBuilder<LegacyService.Async> clientBuilder() {
            return new ClientBuilder<LegacyService.Async>() {
                @Override
                public LegacyService.Async build(Mono<RpcClient> rpcClientMono) {
                    LegacyService.Reactive _delegate =
                        new LegacyServiceReactiveClient(protocolId, rpcClientMono, headers, persistentHeaders);
                    return new LegacyServiceReactiveAsyncWrapper(_delegate);
                }
            };
        }

        @Deprecated
        static LegacyService.Async createClient(
            final com.facebook.thrift.client.RpcClientFactory _rpcClientFactory,
            final java.net.SocketAddress _socketAddress,
            final org.apache.thrift.ProtocolId _protocolId) {
                LegacyService.Reactive _delegate = Reactive.createClient(
                    _rpcClientFactory,
                    _socketAddress,
                    _protocolId);
                return new LegacyServiceReactiveAsyncWrapper(_delegate);
        }

        @Deprecated
        static LegacyService.Async createClient(
            final com.facebook.thrift.client.RpcClientFactory _rpcClientFactory,
            final java.net.SocketAddress _socketAddress,
            final org.apache.thrift.ProtocolId _protocolId,
            final java.util.Map<String, String> _headers,
            final java.util.Map<String, String> _persistentHeaders) {
                LegacyService.Reactive _delegate = Reactive.createClient(
                    _rpcClientFactory,
                    _socketAddress,
                    _protocolId,
                    _headers,
                    _persistentHeaders);
                return new LegacyServiceReactiveAsyncWrapper(_delegate);
        }

        @Deprecated
        static LegacyService.Async createClient(
            final reactor.core.publisher.Mono<com.facebook.thrift.client.RpcClient> _rpcClientMono,
            final org.apache.thrift.ProtocolId _protocolId) {
                LegacyService.Reactive _delegate = Reactive.createClient(
                    _rpcClientMono,
                    _protocolId);
                return new LegacyServiceReactiveAsyncWrapper(_delegate);
        }

        @Deprecated
        static LegacyService.Async createClient(
            final reactor.core.publisher.Mono<com.facebook.thrift.client.RpcClient> _rpcClientMono,
            final org.apache.thrift.ProtocolId _protocolId,
            final java.util.Map<String, String> _headers,
            final java.util.Map<String, String> _persistentHeaders) {
                LegacyService.Reactive _delegate = Reactive.createClient(
                    _rpcClientMono,
                    _protocolId,
                    _headers,
                    _persistentHeaders);
                return new LegacyServiceReactiveAsyncWrapper(_delegate);
        }

        @java.lang.Override void close();

        @ThriftMethod(value = "getPoints")
        ListenableFuture<Map<String, List<Integer>>> getPoints(
            @com.facebook.swift.codec.ThriftField(value=1, name="key", requiredness=Requiredness.NONE) final Set<String> key,
            @com.facebook.swift.codec.ThriftField(value=-1, isLegacyId=true, name="legacyStuff", requiredness=Requiredness.NONE) final long legacyStuff);

        default ListenableFuture<Map<String, List<Integer>>> getPoints(
            @com.facebook.swift.codec.ThriftField(value=1, name="key", requiredness=Requiredness.NONE) final Set<String> key,
            @com.facebook.swift.codec.ThriftField(value=-1, isLegacyId=true, name="legacyStuff", requiredness=Requiredness.NONE) final long legacyStuff,
            RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        default ListenableFuture<ResponseWrapper<Map<String, List<Integer>>>> getPointsWrapper(
            @com.facebook.swift.codec.ThriftField(value=1, name="key", requiredness=Requiredness.NONE) final Set<String> key,
            @com.facebook.swift.codec.ThriftField(value=-1, isLegacyId=true, name="legacyStuff", requiredness=Requiredness.NONE) final long legacyStuff,
            RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }
    }
    @java.lang.Override void close();

    @ThriftMethod(value = "getPoints")
    Map<String, List<Integer>> getPoints(
        @com.facebook.swift.codec.ThriftField(value=1, name="key", requiredness=Requiredness.NONE) final Set<String> key,
        @com.facebook.swift.codec.ThriftField(value=-1, isLegacyId=true, name="legacyStuff", requiredness=Requiredness.NONE) final long legacyStuff) throws org.apache.thrift.TException;

    default Map<String, List<Integer>> getPoints(
        @com.facebook.swift.codec.ThriftField(value=1, name="key", requiredness=Requiredness.NONE) final Set<String> key,
        @com.facebook.swift.codec.ThriftField(value=-1, isLegacyId=true, name="legacyStuff", requiredness=Requiredness.NONE) final long legacyStuff,
        RpcOptions rpcOptions) throws org.apache.thrift.TException {
        throw new UnsupportedOperationException();
    }

    default ResponseWrapper<Map<String, List<Integer>>> getPointsWrapper(
        @com.facebook.swift.codec.ThriftField(value=1, name="key", requiredness=Requiredness.NONE) final Set<String> key,
        @com.facebook.swift.codec.ThriftField(value=-1, isLegacyId=true, name="legacyStuff", requiredness=Requiredness.NONE) final long legacyStuff,
        RpcOptions rpcOptions) throws org.apache.thrift.TException {
        throw new UnsupportedOperationException();
    }

    @com.facebook.swift.service.ThriftService("LegacyService")
    interface Reactive extends reactor.core.Disposable, com.facebook.thrift.util.ReactiveService {
        static com.facebook.thrift.server.RpcServerHandler createRpcServerHandler(
        final LegacyService.Reactive _serviceImpl,
        final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
            return new LegacyServiceRpcServerHandler(_serviceImpl, _eventHandlers);
        }

        static reactor.core.publisher.Mono<? extends com.facebook.thrift.server.ServerTransport> createServer(
            final com.facebook.swift.service.ThriftServerConfig _thriftServerConfig,
            final com.facebook.thrift.util.TransportType _transportType,
            final LegacyService.Reactive _serviceImpl,
            final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {

            final com.facebook.thrift.server.RpcServerHandler _serverHandler = createRpcServerHandler(_serviceImpl, _eventHandlers);

            return com.facebook.thrift.util.RpcServerUtils.createServerTransport(_thriftServerConfig, _transportType, _serverHandler);
        }

        static ClientBuilder<LegacyService.Reactive> clientBuilder() {
            return new ClientBuilder<LegacyService.Reactive>() {
                @Override
                public LegacyService.Reactive build(Mono<RpcClient> rpcClientMono) {
                    return new LegacyServiceReactiveClient(protocolId, rpcClientMono, headers, persistentHeaders);
                }
            };
        }

        @Deprecated
        static LegacyService.Reactive createClient(
            final com.facebook.thrift.client.RpcClientFactory _rpcClientFactory,
            final java.net.SocketAddress _socketAddress,
            final org.apache.thrift.ProtocolId _protocolId) {
                return new LegacyServiceReactiveClient(
                    _protocolId,
                    _rpcClientFactory.createRpcClient(_socketAddress),
                    java.util.Collections.emptyMap(),
                    java.util.Collections.emptyMap());
        }

        @Deprecated
        static LegacyService.Reactive createClient(
            final com.facebook.thrift.client.RpcClientFactory _rpcClientFactory,
            final java.net.SocketAddress _socketAddress,
            final org.apache.thrift.ProtocolId _protocolId,
            final java.util.Map<String, String> _headers,
            final java.util.Map<String, String> _persistentHeaders
            ) {
                return new LegacyServiceReactiveClient(
                    _protocolId,
                    _rpcClientFactory.createRpcClient(_socketAddress),
                    _headers,
                    _persistentHeaders);
        }

        @Deprecated
        static LegacyService.Reactive createClient(
            final reactor.core.publisher.Mono<com.facebook.thrift.client.RpcClient> _rpcClientMono,
            final org.apache.thrift.ProtocolId _protocolId) {
                return new LegacyServiceReactiveClient(
                    _protocolId,
                    _rpcClientMono,
                    java.util.Collections.emptyMap(),
                    java.util.Collections.emptyMap());
        }

        @Deprecated
        static LegacyService.Reactive createClient(
            final reactor.core.publisher.Mono<com.facebook.thrift.client.RpcClient> _rpcClientMono,
            final org.apache.thrift.ProtocolId _protocolId,
            final java.util.Map<String, String> _headers,
            final java.util.Map<String, String> _persistentHeaders
            ) {
                return new LegacyServiceReactiveClient(
                    _protocolId,
                    _rpcClientMono,
                    _headers,
                    _persistentHeaders);
        }

        @ThriftMethod(value = "getPoints")
        reactor.core.publisher.Mono<Map<String, List<Integer>>> getPoints(final Set<String> key, final long legacyStuff);

        default reactor.core.publisher.Mono<Map<String, List<Integer>>> getPoints(final Set<String> key, final long legacyStuff, RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        default reactor.core.publisher.Mono<ResponseWrapper<Map<String, List<Integer>>>> getPointsWrapper(final Set<String> key, final long legacyStuff, RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

    }
}
