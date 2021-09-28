package p032e4;

import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p038f4.C0915a;
import p038f4.C0917b;
import p038f4.C0921f;
import p038f4.C0923g;
import p038f4.C0926i;
import p038f4.C0928j;
import p038f4.C0930k;
import p042g2.C0955a;
import p050h4.C1018c;
import p072l2.C1241e;
import p139w3.C2061c0;

/* renamed from: e4.a */
public final class C0871a extends C0879e {

    /* renamed from: e */
    public static final boolean f3326e = (C0879e.f3347c.mo4188c() && Build.VERSION.SDK_INT >= 29);

    /* renamed from: f */
    public static final C0871a f3327f = null;

    /* renamed from: d */
    public final List<C0930k> f3328d;

    public C0871a() {
        C0930k[] kVarArr = new C0930k[4];
        kVarArr[0] = C1241e.m3513b("Dalvik", System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29 ? new C0915a() : null;
        C0921f.C0922a aVar = C0921f.f3445g;
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
        this.f3328d = arrayList;
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

    /* renamed from: d */
    public void mo4168d(SSLSocket sSLSocket, String str, List<? extends C2061c0> list) {
        T t;
        C1241e.m3517j(list, "protocols");
        Iterator<T> it = this.f3328d.iterator();
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

    /* renamed from: f */
    public String mo4169f(SSLSocket sSLSocket) {
        T t;
        Iterator<T> it = this.f3328d.iterator();
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

    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public boolean mo4170h(String str) {
        C1241e.m3517j(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
