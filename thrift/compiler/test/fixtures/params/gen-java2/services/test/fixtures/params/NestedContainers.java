/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.params;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.service.*;
import com.facebook.thrift.client.*;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.*;
import java.util.*;
import reactor.core.publisher.Mono;

@SwiftGenerated
@com.facebook.swift.service.ThriftService("NestedContainers")
public interface NestedContainers extends java.io.Closeable, com.facebook.thrift.util.BlockingService {
    static com.facebook.thrift.server.RpcServerHandler createRpcServerHandler(
        final NestedContainers _serviceImpl,
        final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
        return new NestedContainersRpcServerHandler(_serviceImpl, _eventHandlers);
    }

    static reactor.core.publisher.Mono<? extends com.facebook.thrift.server.ServerTransport> createServer(
        final com.facebook.swift.service.ThriftServerConfig _thriftServerConfig,
        final com.facebook.thrift.util.TransportType _transportType,
        final NestedContainers _serviceImpl,
        final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {

        final com.facebook.thrift.server.RpcServerHandler _serverHandler = createRpcServerHandler(_serviceImpl, _eventHandlers);

        return com.facebook.thrift.util.RpcServerUtils.createServerTransport(_thriftServerConfig, _transportType, _serverHandler);
    }

    static ClientBuilder<NestedContainers> clientBuilder() {
        return new ClientBuilder<NestedContainers>() {
            @Override
            public NestedContainers build(Mono<RpcClient> rpcClientMono) {
                NestedContainers.Reactive _delegate =
                    new NestedContainersReactiveClient(protocolId, rpcClientMono, headers, persistentHeaders);
                return new NestedContainersReactiveBlockingWrapper(_delegate);
            }
        };
    }

    @Deprecated
    static NestedContainers createClient(
      final com.facebook.thrift.client.RpcClientFactory _rpcClientFactory,
      final java.net.SocketAddress _socketAddress,
      final org.apache.thrift.ProtocolId _protocolId) {
        NestedContainers.Reactive _delegate = Reactive.createClient(
            _rpcClientFactory,
            _socketAddress,
            _protocolId);
        return new NestedContainersReactiveBlockingWrapper(_delegate);
    }

    @Deprecated
    static NestedContainers createClient(
      final com.facebook.thrift.client.RpcClientFactory _rpcClientFactory,
      final java.net.SocketAddress _socketAddress,
      final org.apache.thrift.ProtocolId _protocolId,
      final java.util.Map<String, String> _headers,
      final java.util.Map<String, String> _persistentHeaders) {
        NestedContainers.Reactive _delegate = Reactive.createClient(
            _rpcClientFactory,
            _socketAddress,
            _protocolId,
            _headers,
            _persistentHeaders);
        return new NestedContainersReactiveBlockingWrapper(_delegate);
    }

    @Deprecated
    static NestedContainers createClient(
      final reactor.core.publisher.Mono<com.facebook.thrift.client.RpcClient> _rpcClientMono,
      final org.apache.thrift.ProtocolId _protocolId) {
        NestedContainers.Reactive _delegate = Reactive.createClient(
            _rpcClientMono,
            _protocolId);
        return new NestedContainersReactiveBlockingWrapper(_delegate);
    }

    @Deprecated
    static NestedContainers createClient(
      final reactor.core.publisher.Mono<com.facebook.thrift.client.RpcClient> _rpcClientMono,
      final org.apache.thrift.ProtocolId _protocolId,
      final java.util.Map<String, String> _headers,
      final java.util.Map<String, String> _persistentHeaders) {
        NestedContainers.Reactive _delegate = Reactive.createClient(
            _rpcClientMono,
            _protocolId,
            _headers,
            _persistentHeaders);
        return new NestedContainersReactiveBlockingWrapper(_delegate);
    }

    @com.facebook.swift.service.ThriftService("NestedContainers")
    public interface Async extends java.io.Closeable, com.facebook.thrift.util.AsyncService {
        static com.facebook.thrift.server.RpcServerHandler createRpcServerHandler(
        final NestedContainers.Async _serviceImpl,
        final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
            return new NestedContainersRpcServerHandler(_serviceImpl, _eventHandlers);
        }

        static reactor.core.publisher.Mono<? extends com.facebook.thrift.server.ServerTransport> createServer(
            final com.facebook.swift.service.ThriftServerConfig _thriftServerConfig,
            final com.facebook.thrift.util.TransportType _transportType,
            final NestedContainers.Async _serviceImpl,
            final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {

            final com.facebook.thrift.server.RpcServerHandler _serverHandler = createRpcServerHandler(_serviceImpl, _eventHandlers);

            return com.facebook.thrift.util.RpcServerUtils.createServerTransport(_thriftServerConfig, _transportType, _serverHandler);
        }

        static ClientBuilder<NestedContainers.Async> clientBuilder() {
            return new ClientBuilder<NestedContainers.Async>() {
                @Override
                public NestedContainers.Async build(Mono<RpcClient> rpcClientMono) {
                    NestedContainers.Reactive _delegate =
                        new NestedContainersReactiveClient(protocolId, rpcClientMono, headers, persistentHeaders);
                    return new NestedContainersReactiveAsyncWrapper(_delegate);
                }
            };
        }

        @Deprecated
        static NestedContainers.Async createClient(
            final com.facebook.thrift.client.RpcClientFactory _rpcClientFactory,
            final java.net.SocketAddress _socketAddress,
            final org.apache.thrift.ProtocolId _protocolId) {
                NestedContainers.Reactive _delegate = Reactive.createClient(
                    _rpcClientFactory,
                    _socketAddress,
                    _protocolId);
                return new NestedContainersReactiveAsyncWrapper(_delegate);
        }

        @Deprecated
        static NestedContainers.Async createClient(
            final com.facebook.thrift.client.RpcClientFactory _rpcClientFactory,
            final java.net.SocketAddress _socketAddress,
            final org.apache.thrift.ProtocolId _protocolId,
            final java.util.Map<String, String> _headers,
            final java.util.Map<String, String> _persistentHeaders) {
                NestedContainers.Reactive _delegate = Reactive.createClient(
                    _rpcClientFactory,
                    _socketAddress,
                    _protocolId,
                    _headers,
                    _persistentHeaders);
                return new NestedContainersReactiveAsyncWrapper(_delegate);
        }

        @Deprecated
        static NestedContainers.Async createClient(
            final reactor.core.publisher.Mono<com.facebook.thrift.client.RpcClient> _rpcClientMono,
            final org.apache.thrift.ProtocolId _protocolId) {
                NestedContainers.Reactive _delegate = Reactive.createClient(
                    _rpcClientMono,
                    _protocolId);
                return new NestedContainersReactiveAsyncWrapper(_delegate);
        }

        @Deprecated
        static NestedContainers.Async createClient(
            final reactor.core.publisher.Mono<com.facebook.thrift.client.RpcClient> _rpcClientMono,
            final org.apache.thrift.ProtocolId _protocolId,
            final java.util.Map<String, String> _headers,
            final java.util.Map<String, String> _persistentHeaders) {
                NestedContainers.Reactive _delegate = Reactive.createClient(
                    _rpcClientMono,
                    _protocolId,
                    _headers,
                    _persistentHeaders);
                return new NestedContainersReactiveAsyncWrapper(_delegate);
        }

        @java.lang.Override void close();

        @ThriftMethod(value = "mapList")
        ListenableFuture<Void> mapList(
            @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final Map<Integer, List<Integer>> foo);

        default ListenableFuture<Void> mapList(
            @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final Map<Integer, List<Integer>> foo,
            RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        default ListenableFuture<ResponseWrapper<Void>> mapListWrapper(
            @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final Map<Integer, List<Integer>> foo,
            RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        @ThriftMethod(value = "mapSet")
        ListenableFuture<Void> mapSet(
            @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final Map<Integer, Set<Integer>> foo);

        default ListenableFuture<Void> mapSet(
            @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final Map<Integer, Set<Integer>> foo,
            RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        default ListenableFuture<ResponseWrapper<Void>> mapSetWrapper(
            @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final Map<Integer, Set<Integer>> foo,
            RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        @ThriftMethod(value = "listMap")
        ListenableFuture<Void> listMap(
            @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final List<Map<Integer, Integer>> foo);

        default ListenableFuture<Void> listMap(
            @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final List<Map<Integer, Integer>> foo,
            RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        default ListenableFuture<ResponseWrapper<Void>> listMapWrapper(
            @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final List<Map<Integer, Integer>> foo,
            RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        @ThriftMethod(value = "listSet")
        ListenableFuture<Void> listSet(
            @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final List<Set<Integer>> foo);

        default ListenableFuture<Void> listSet(
            @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final List<Set<Integer>> foo,
            RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        default ListenableFuture<ResponseWrapper<Void>> listSetWrapper(
            @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final List<Set<Integer>> foo,
            RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        @ThriftMethod(value = "turtles")
        ListenableFuture<Void> turtles(
            @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final List<List<Map<Integer, Map<Integer, Set<Integer>>>>> foo);

        default ListenableFuture<Void> turtles(
            @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final List<List<Map<Integer, Map<Integer, Set<Integer>>>>> foo,
            RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        default ListenableFuture<ResponseWrapper<Void>> turtlesWrapper(
            @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final List<List<Map<Integer, Map<Integer, Set<Integer>>>>> foo,
            RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }
    }
    @java.lang.Override void close();

    @ThriftMethod(value = "mapList")
    void mapList(
        @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final Map<Integer, List<Integer>> foo) throws org.apache.thrift.TException;

    default void mapList(
        @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final Map<Integer, List<Integer>> foo,
        RpcOptions rpcOptions) throws org.apache.thrift.TException {
        throw new UnsupportedOperationException();
    }

    default ResponseWrapper<Void> mapListWrapper(
        @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final Map<Integer, List<Integer>> foo,
        RpcOptions rpcOptions) throws org.apache.thrift.TException {
        throw new UnsupportedOperationException();
    }

    @ThriftMethod(value = "mapSet")
    void mapSet(
        @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final Map<Integer, Set<Integer>> foo) throws org.apache.thrift.TException;

    default void mapSet(
        @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final Map<Integer, Set<Integer>> foo,
        RpcOptions rpcOptions) throws org.apache.thrift.TException {
        throw new UnsupportedOperationException();
    }

    default ResponseWrapper<Void> mapSetWrapper(
        @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final Map<Integer, Set<Integer>> foo,
        RpcOptions rpcOptions) throws org.apache.thrift.TException {
        throw new UnsupportedOperationException();
    }

    @ThriftMethod(value = "listMap")
    void listMap(
        @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final List<Map<Integer, Integer>> foo) throws org.apache.thrift.TException;

    default void listMap(
        @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final List<Map<Integer, Integer>> foo,
        RpcOptions rpcOptions) throws org.apache.thrift.TException {
        throw new UnsupportedOperationException();
    }

    default ResponseWrapper<Void> listMapWrapper(
        @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final List<Map<Integer, Integer>> foo,
        RpcOptions rpcOptions) throws org.apache.thrift.TException {
        throw new UnsupportedOperationException();
    }

    @ThriftMethod(value = "listSet")
    void listSet(
        @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final List<Set<Integer>> foo) throws org.apache.thrift.TException;

    default void listSet(
        @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final List<Set<Integer>> foo,
        RpcOptions rpcOptions) throws org.apache.thrift.TException {
        throw new UnsupportedOperationException();
    }

    default ResponseWrapper<Void> listSetWrapper(
        @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final List<Set<Integer>> foo,
        RpcOptions rpcOptions) throws org.apache.thrift.TException {
        throw new UnsupportedOperationException();
    }

    @ThriftMethod(value = "turtles")
    void turtles(
        @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final List<List<Map<Integer, Map<Integer, Set<Integer>>>>> foo) throws org.apache.thrift.TException;

    default void turtles(
        @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final List<List<Map<Integer, Map<Integer, Set<Integer>>>>> foo,
        RpcOptions rpcOptions) throws org.apache.thrift.TException {
        throw new UnsupportedOperationException();
    }

    default ResponseWrapper<Void> turtlesWrapper(
        @com.facebook.swift.codec.ThriftField(value=1, name="foo", requiredness=Requiredness.NONE) final List<List<Map<Integer, Map<Integer, Set<Integer>>>>> foo,
        RpcOptions rpcOptions) throws org.apache.thrift.TException {
        throw new UnsupportedOperationException();
    }

    @com.facebook.swift.service.ThriftService("NestedContainers")
    interface Reactive extends reactor.core.Disposable, com.facebook.thrift.util.ReactiveService {
        static com.facebook.thrift.server.RpcServerHandler createRpcServerHandler(
        final NestedContainers.Reactive _serviceImpl,
        final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
            return new NestedContainersRpcServerHandler(_serviceImpl, _eventHandlers);
        }

        static reactor.core.publisher.Mono<? extends com.facebook.thrift.server.ServerTransport> createServer(
            final com.facebook.swift.service.ThriftServerConfig _thriftServerConfig,
            final com.facebook.thrift.util.TransportType _transportType,
            final NestedContainers.Reactive _serviceImpl,
            final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {

            final com.facebook.thrift.server.RpcServerHandler _serverHandler = createRpcServerHandler(_serviceImpl, _eventHandlers);

            return com.facebook.thrift.util.RpcServerUtils.createServerTransport(_thriftServerConfig, _transportType, _serverHandler);
        }

        static ClientBuilder<NestedContainers.Reactive> clientBuilder() {
            return new ClientBuilder<NestedContainers.Reactive>() {
                @Override
                public NestedContainers.Reactive build(Mono<RpcClient> rpcClientMono) {
                    return new NestedContainersReactiveClient(protocolId, rpcClientMono, headers, persistentHeaders);
                }
            };
        }

        @Deprecated
        static NestedContainers.Reactive createClient(
            final com.facebook.thrift.client.RpcClientFactory _rpcClientFactory,
            final java.net.SocketAddress _socketAddress,
            final org.apache.thrift.ProtocolId _protocolId) {
                return new NestedContainersReactiveClient(
                    _protocolId,
                    _rpcClientFactory.createRpcClient(_socketAddress),
                    java.util.Collections.emptyMap(),
                    java.util.Collections.emptyMap());
        }

        @Deprecated
        static NestedContainers.Reactive createClient(
            final com.facebook.thrift.client.RpcClientFactory _rpcClientFactory,
            final java.net.SocketAddress _socketAddress,
            final org.apache.thrift.ProtocolId _protocolId,
            final java.util.Map<String, String> _headers,
            final java.util.Map<String, String> _persistentHeaders
            ) {
                return new NestedContainersReactiveClient(
                    _protocolId,
                    _rpcClientFactory.createRpcClient(_socketAddress),
                    _headers,
                    _persistentHeaders);
        }

        @Deprecated
        static NestedContainers.Reactive createClient(
            final reactor.core.publisher.Mono<com.facebook.thrift.client.RpcClient> _rpcClientMono,
            final org.apache.thrift.ProtocolId _protocolId) {
                return new NestedContainersReactiveClient(
                    _protocolId,
                    _rpcClientMono,
                    java.util.Collections.emptyMap(),
                    java.util.Collections.emptyMap());
        }

        @Deprecated
        static NestedContainers.Reactive createClient(
            final reactor.core.publisher.Mono<com.facebook.thrift.client.RpcClient> _rpcClientMono,
            final org.apache.thrift.ProtocolId _protocolId,
            final java.util.Map<String, String> _headers,
            final java.util.Map<String, String> _persistentHeaders
            ) {
                return new NestedContainersReactiveClient(
                    _protocolId,
                    _rpcClientMono,
                    _headers,
                    _persistentHeaders);
        }

        @ThriftMethod(value = "mapList")
        reactor.core.publisher.Mono<Void> mapList(final Map<Integer, List<Integer>> foo);

        default reactor.core.publisher.Mono<Void> mapList(final Map<Integer, List<Integer>> foo, RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        default reactor.core.publisher.Mono<ResponseWrapper<Void>> mapListWrapper(final Map<Integer, List<Integer>> foo, RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        @ThriftMethod(value = "mapSet")
        reactor.core.publisher.Mono<Void> mapSet(final Map<Integer, Set<Integer>> foo);

        default reactor.core.publisher.Mono<Void> mapSet(final Map<Integer, Set<Integer>> foo, RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        default reactor.core.publisher.Mono<ResponseWrapper<Void>> mapSetWrapper(final Map<Integer, Set<Integer>> foo, RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        @ThriftMethod(value = "listMap")
        reactor.core.publisher.Mono<Void> listMap(final List<Map<Integer, Integer>> foo);

        default reactor.core.publisher.Mono<Void> listMap(final List<Map<Integer, Integer>> foo, RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        default reactor.core.publisher.Mono<ResponseWrapper<Void>> listMapWrapper(final List<Map<Integer, Integer>> foo, RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        @ThriftMethod(value = "listSet")
        reactor.core.publisher.Mono<Void> listSet(final List<Set<Integer>> foo);

        default reactor.core.publisher.Mono<Void> listSet(final List<Set<Integer>> foo, RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        default reactor.core.publisher.Mono<ResponseWrapper<Void>> listSetWrapper(final List<Set<Integer>> foo, RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        @ThriftMethod(value = "turtles")
        reactor.core.publisher.Mono<Void> turtles(final List<List<Map<Integer, Map<Integer, Set<Integer>>>>> foo);

        default reactor.core.publisher.Mono<Void> turtles(final List<List<Map<Integer, Map<Integer, Set<Integer>>>>> foo, RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        default reactor.core.publisher.Mono<ResponseWrapper<Void>> turtlesWrapper(final List<List<Map<Integer, Map<Integer, Set<Integer>>>>> foo, RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

    }
}
