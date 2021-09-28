package p071l1;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import p035f1.C0888a;
import p056i4.C1038a;
import p059j1.C1088b;
import p065k1.C1170d;
import p072l2.C1241e;
import p114s2.C1719f;
import p128u4.C1874a;
import p128u4.C1883b0;
import p128u4.C1884c;
import p128u4.C1886c0;
import p128u4.C1889e;
import p128u4.C1899g;
import p128u4.C1926r;
import p128u4.C1946v;
import p139w3.C2057b0;
import p139w3.C2106x;

/* renamed from: l1.a */
public final class C1234a {
    /* renamed from: a */
    public static final C1170d m3507a() {
        C1088b.C1089a aVar = C1088b.f3853b;
        C1038a aVar2 = new C1038a((C1038a.C1040b) null, 1);
        C1038a.C1039a aVar3 = C1038a.C1039a.NONE;
        C1241e.m3518k(aVar3, "<set-?>");
        aVar2.f3770b = aVar3;
        C2057b0.C2058a aVar4 = new C2057b0.C2058a();
        C1241e.m3517j(aVar2, "interceptor");
        aVar4.f5944c.add(aVar2);
        C2057b0 b0Var = new C2057b0(aVar4);
        C1946v vVar = C1946v.f5705c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C1241e.m3517j("https://download.pkd.icao.int/", "$this$toHttpUrl");
        C2106x.C2107a aVar5 = new C2106x.C2107a();
        aVar5.mo6641d((C2106x) null, "https://download.pkd.icao.int/");
        C2106x a = aVar5.mo6638a();
        List<String> list = a.f6122g;
        if ("".equals(list.get(list.size() - 1))) {
            arrayList2.add(new C1719f());
            Executor a2 = vVar.mo6441a();
            ArrayList arrayList3 = new ArrayList(arrayList2);
            C1899g gVar = new C1899g(a2);
            arrayList3.addAll(vVar.f5706a ? Arrays.asList(new C1884c.C1885a[]{C1889e.f5603a, gVar}) : Collections.singletonList(gVar));
            ArrayList arrayList4 = new ArrayList(arrayList.size() + 1 + (vVar.f5706a ? 1 : 0));
            arrayList4.add(new C1874a());
            arrayList4.addAll(arrayList);
            arrayList4.addAll(vVar.f5706a ? Collections.singletonList(C1926r.f5662a) : Collections.emptyList());
            C1886c0 c0Var = new C1886c0(b0Var, a, Collections.unmodifiableList(arrayList4), Collections.unmodifiableList(arrayList3), a2, false);
            Class<C0888a> cls = C0888a.class;
            if (cls.isInterface()) {
                ArrayDeque arrayDeque = new ArrayDeque(1);
                arrayDeque.add(cls);
                while (!arrayDeque.isEmpty()) {
                    Class<C0888a> cls2 = (Class) arrayDeque.removeFirst();
                    if (cls2.getTypeParameters().length != 0) {
                        StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                        sb.append(cls2.getName());
                        if (cls2 != cls) {
                            sb.append(" which is an interface of ");
                            sb.append(cls.getName());
                        }
                        throw new IllegalArgumentException(sb.toString());
                    }
                    Collections.addAll(arrayDeque, cls2.getInterfaces());
                }
                if (c0Var.f5602f) {
                    C1946v vVar2 = C1946v.f5705c;
                    for (Method method : cls.getDeclaredMethods()) {
                        if (!(vVar2.f5706a && method.isDefault()) && !Modifier.isStatic(method.getModifiers())) {
                            c0Var.mo6403b(method);
                        }
                    }
                }
                Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C1883b0(c0Var, cls));
                C1241e.m3516f(newProxyInstance, "retrofit.create(IcaoService::class.java)");
                C0888a aVar6 = (C0888a) newProxyInstance;
                C1241e.m3517j(aVar6, "service");
                C1088b bVar = C1088b.f3854c;
                if (bVar == null) {
                    synchronized (aVar) {
                        bVar = C1088b.f3854c;
                        if (bVar == null) {
                            bVar = new C1088b(aVar6);
                            C1088b.f3854c = bVar;
                        }
                    }
                }
                return new C1170d(bVar);
            }
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        throw new IllegalArgumentException("baseUrl must end in /: " + a);
    }
}
