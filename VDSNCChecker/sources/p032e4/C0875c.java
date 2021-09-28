package p032e4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p072l2.C1241e;
import p126u2.C1846g;
import p139w3.C2061c0;

/* renamed from: e4.c */
public final class C0875c extends C0879e {

    /* renamed from: d */
    public final Method f3335d;

    /* renamed from: e */
    public final Method f3336e;

    /* renamed from: f */
    public final Method f3337f;

    /* renamed from: g */
    public final Class<?> f3338g;

    /* renamed from: h */
    public final Class<?> f3339h;

    /* renamed from: e4.c$a */
    public static final class C0876a implements InvocationHandler {

        /* renamed from: a */
        public boolean f3340a;

        /* renamed from: b */
        public String f3341b;

        /* renamed from: c */
        public final List<String> f3342c;

        public C0876a(List<String> list) {
            this.f3342c = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            C1241e.m3517j(obj, "proxy");
            C1241e.m3517j(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (C1241e.m3513b(name, "supports") && C1241e.m3513b(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (!C1241e.m3513b(name, "unsupported") || !C1241e.m3513b(Void.TYPE, returnType)) {
                if (C1241e.m3513b(name, "protocols")) {
                    if (objArr.length == 0) {
                        return this.f3342c;
                    }
                }
                if ((C1241e.m3513b(name, "selectProtocol") || C1241e.m3513b(name, "select")) && C1241e.m3513b(String.class, returnType) && objArr.length == 1 && (objArr[0] instanceof List)) {
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj2;
                    int size = list.size();
                    if (size >= 0) {
                        int i = 0;
                        while (true) {
                            Object obj3 = list.get(i);
                            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            if (!this.f3342c.contains(str)) {
                                if (i == size) {
                                    break;
                                }
                                i++;
                            } else {
                                this.f3341b = str;
                                return str;
                            }
                        }
                    }
                    String str2 = this.f3342c.get(0);
                    this.f3341b = str2;
                    return str2;
                } else if ((!C1241e.m3513b(name, "protocolSelected") && !C1241e.m3513b(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                } else {
                    Object obj4 = objArr[0];
                    Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.String");
                    this.f3341b = (String) obj4;
                    return null;
                }
            } else {
                this.f3340a = true;
                return null;
            }
        }
    }

    public C0875c(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f3335d = method;
        this.f3336e = method2;
        this.f3337f = method3;
        this.f3338g = cls;
        this.f3339h = cls2;
    }

    /* renamed from: a */
    public void mo4179a(SSLSocket sSLSocket) {
        try {
            this.f3337f.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    /* renamed from: d */
    public void mo4168d(SSLSocket sSLSocket, String str, List<? extends C2061c0> list) {
        C1241e.m3517j(list, "protocols");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((C2061c0) next) == C2061c0.HTTP_1_0) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C1846g.m5046H(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C2061c0) it2.next()).f5971e);
        }
        try {
            this.f3335d.invoke((Object) null, new Object[]{sSLSocket, Proxy.newProxyInstance(C0879e.class.getClassLoader(), new Class[]{this.f3338g, this.f3339h}, new C0876a(arrayList2))});
        } catch (InvocationTargetException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    /* renamed from: f */
    public String mo4169f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f3336e.invoke((Object) null, new Object[]{sSLSocket}));
            if (invocationHandler != null) {
                C0876a aVar = (C0876a) invocationHandler;
                boolean z = aVar.f3340a;
                if (!z && aVar.f3341b == null) {
                    C0879e.m2603j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, (Throwable) null, 6, (Object) null);
                    return null;
                } else if (z) {
                    return null;
                } else {
                    return aVar.f3341b;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (InvocationTargetException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
