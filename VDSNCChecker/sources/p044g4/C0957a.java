package p044g4;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import p042g2.C0955a;

/* renamed from: g4.a */
public final class C0957a extends ProxySelector {

    /* renamed from: a */
    public static final C0957a f3534a = new C0957a();

    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    public List<Proxy> select(URI uri) {
        if (uri != null) {
            return C0955a.m2747u(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}
