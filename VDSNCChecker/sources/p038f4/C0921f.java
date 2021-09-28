package p038f4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p025d3.C0802f;
import p032e4.C0872b;
import p032e4.C0879e;
import p038f4.C0928j;
import p072l2.C1241e;
import p139w3.C2061c0;

/* renamed from: f4.f */
public class C0921f implements C0930k {

    /* renamed from: f */
    public static final C0928j.C0929a f3444f = new C0920e("com.google.android.gms.org.conscrypt");

    /* renamed from: g */
    public static final C0922a f3445g;

    /* renamed from: a */
    public final Method f3446a;

    /* renamed from: b */
    public final Method f3447b;

    /* renamed from: c */
    public final Method f3448c;

    /* renamed from: d */
    public final Method f3449d;

    /* renamed from: e */
    public final Class<? super SSLSocket> f3450e;

    /* renamed from: f4.f$a */
    public static final class C0922a {
        public C0922a(C0802f fVar) {
        }
    }

    static {
        C0922a aVar = new C0922a((C0802f) null);
        f3445g = aVar;
        Objects.requireNonNull(aVar);
        C1241e.m3517j("com.google.android.gms.org.conscrypt", "packageName");
    }

    public C0921f(Class<? super SSLSocket> cls) {
        this.f3450e = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        C1241e.m3516f(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f3446a = declaredMethod;
        this.f3447b = cls.getMethod("setHostname", new Class[]{String.class});
        this.f3448c = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f3449d = cls.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    }

    /* renamed from: a */
    public boolean mo4236a(SSLSocket sSLSocket) {
        return this.f3450e.isInstance(sSLSocket);
    }

    /* renamed from: b */
    public String mo4237b(SSLSocket sSLSocket) {
        if (!mo4236a(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f3448c.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            C1241e.m3516f(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (NullPointerException e) {
            if (C1241e.m3513b(e.getMessage(), "ssl == null")) {
                return null;
            }
            throw e;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError(e3);
        }
    }

    /* renamed from: c */
    public boolean mo4238c() {
        C0872b.C0873a aVar = C0872b.f3330g;
        return C0872b.f3329f;
    }

    /* renamed from: d */
    public void mo4239d(SSLSocket sSLSocket, String str, List<? extends C2061c0> list) {
        if (mo4236a(sSLSocket)) {
            try {
                this.f3446a.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                if (str != null) {
                    this.f3447b.invoke(sSLSocket, new Object[]{str});
                }
                this.f3449d.invoke(sSLSocket, new Object[]{C0879e.f3347c.mo4187b(list)});
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
