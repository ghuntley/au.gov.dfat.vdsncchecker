package p032e4;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p000a.C0001b;
import p025d3.C0802f;
import p038f4.C0917b;
import p038f4.C0921f;
import p038f4.C0923g;
import p038f4.C0925h;
import p038f4.C0926i;
import p038f4.C0928j;
import p038f4.C0930k;
import p038f4.C0931l;
import p042g2.C0955a;
import p050h4.C1018c;
import p050h4.C1020e;
import p072l2.C1241e;
import p139w3.C2061c0;

/* renamed from: e4.b */
public final class C0872b extends C0879e {

    /* renamed from: f */
    public static final boolean f3329f;

    /* renamed from: g */
    public static final C0873a f3330g = new C0873a((C0802f) null);

    /* renamed from: d */
    public final List<C0930k> f3331d;

    /* renamed from: e */
    public final C0925h f3332e;

    /* renamed from: e4.b$a */
    public static final class C0873a {
        public C0873a(C0802f fVar) {
        }
    }

    /* renamed from: e4.b$b */
    public static final class C0874b implements C1020e {

        /* renamed from: a */
        public final X509TrustManager f3333a;

        /* renamed from: b */
        public final Method f3334b;

        public C0874b(X509TrustManager x509TrustManager, Method method) {
            this.f3333a = x509TrustManager;
            this.f3334b = method;
        }

        /* renamed from: a */
        public X509Certificate mo4175a(X509Certificate x509Certificate) {
            try {
                Object invoke = this.f3334b.invoke(this.f3333a, new Object[]{x509Certificate});
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0874b)) {
                return false;
            }
            C0874b bVar = (C0874b) obj;
            return C1241e.m3513b(this.f3333a, bVar.f3333a) && C1241e.m3513b(this.f3334b, bVar.f3334b);
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.f3333a;
            int i = 0;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f3334b;
            if (method != null) {
                i = method.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder a = C0001b.m0a("CustomTrustRootIndex(trustManager=");
            a.append(this.f3333a);
            a.append(", findByIssuerAndSignatureMethod=");
            a.append(this.f3334b);
            a.append(")");
            return a.toString();
        }
    }

    static {
        boolean z = false;
        if (C0879e.f3347c.mo4188c() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f3329f = z;
    }

    public C0872b() {
        C0931l lVar;
        Method method;
        Method method2;
        C0930k[] kVarArr = new C0930k[4];
        C0931l.C0932a aVar = C0931l.f3458h;
        Method method3 = null;
        try {
            lVar = new C0931l(Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl"), Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl"), Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
        } catch (Exception e) {
            C0879e.f3345a.mo4181i("unable to load android socket classes", 5, e);
            lVar = null;
        }
        kVarArr[0] = lVar;
        C0921f.C0922a aVar2 = C0921f.f3445g;
        kVarArr[1] = new C0928j(C0921f.f3444f);
        kVarArr[2] = new C0928j(C0926i.f3455a);
        kVarArr[3] = new C0928j(C0923g.f3451a);
        List v = C0955a.m2748v(kVarArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) v).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((C0930k) next).mo4238c()) {
                arrayList.add(next);
            }
        }
        this.f3331d = arrayList;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", new Class[0]);
            method = cls.getMethod("open", new Class[]{String.class});
            method2 = cls.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method2 = null;
            method = null;
        }
        this.f3332e = new C0925h(method3, method, method2);
    }

    /* renamed from: b */
    public C1018c mo4167b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        C0917b bVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            bVar = new C0917b(x509TrustManager, x509TrustManagerExtensions);
        }
        return bVar != null ? bVar : super.mo4167b(x509TrustManager);
    }

    /* renamed from: c */
    public C1020e mo4171c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            C1241e.m3516f(declaredMethod, "method");
            declaredMethod.setAccessible(true);
            return new C0874b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo4171c(x509TrustManager);
        }
    }

    /* renamed from: d */
    public void mo4168d(SSLSocket sSLSocket, String str, List<C2061c0> list) {
        T t;
        C1241e.m3517j(list, "protocols");
        Iterator<T> it = this.f3331d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C0930k) t).mo4236a(sSLSocket)) {
                break;
            }
        }
        C0930k kVar = (C0930k) t;
        if (kVar != null) {
            kVar.mo4239d(sSLSocket, str, list);
        }
    }

    /* renamed from: e */
    public void mo4172e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        C1241e.m3517j(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e);
            }
            throw e;
        }
    }

    /* renamed from: f */
    public String mo4169f(SSLSocket sSLSocket) {
        T t;
        Iterator<T> it = this.f3331d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C0930k) t).mo4236a(sSLSocket)) {
                break;
            }
        }
        C0930k kVar = (C0930k) t;
        if (kVar != null) {
            return kVar.mo4237b(sSLSocket);
        }
        return null;
    }

    /* renamed from: g */
    public Object mo4173g(String str) {
        C0925h hVar = this.f3332e;
        Objects.requireNonNull(hVar);
        Method method = hVar.f3452a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke((Object) null, new Object[0]);
            Method method2 = hVar.f3453b;
            C1241e.m3515e(method2);
            method2.invoke(invoke, new Object[]{str});
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: h */
    public boolean mo4170h(String str) {
        C1241e.m3517j(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    /* renamed from: k */
    public void mo4174k(String str, Object obj) {
        C1241e.m3517j(str, "message");
        C0925h hVar = this.f3332e;
        Objects.requireNonNull(hVar);
        boolean z = false;
        if (obj != null) {
            try {
                Method method = hVar.f3454c;
                C1241e.m3515e(method);
                method.invoke(obj, new Object[0]);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (!z) {
            C0879e.m2603j(this, str, 5, (Throwable) null, 4, (Object) null);
        }
    }
}
