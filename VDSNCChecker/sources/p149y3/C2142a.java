package p149y3;

import androidx.appcompat.widget.C0131a0;
import java.util.ArrayList;
import java.util.Objects;
import p005a4.C0013c;
import p005a4.C0017e;
import p014b4.C0548g;
import p025d3.C0802f;
import p067k3.C1205h;
import p067k3.C1209l;
import p072l2.C1241e;
import p139w3.C2061c0;
import p139w3.C2063d0;
import p139w3.C2072g0;
import p139w3.C2079i0;
import p139w3.C2101v;
import p139w3.C2103w;
import p139w3.C2109y;
import p144x3.C2129c;

/* renamed from: y3.a */
public final class C2142a implements C2109y {

    /* renamed from: a */
    public static final C2143a f6193a = new C2143a((C0802f) null);

    /* renamed from: y3.a$a */
    public static final class C2143a {
        public C2143a(C0802f fVar) {
        }

        /* renamed from: a */
        public static final C2072g0 m5558a(C2143a aVar, C2072g0 g0Var) {
            C2072g0 g0Var2 = g0Var;
            if ((g0Var2 != null ? g0Var2.f6007k : null) == null) {
                return g0Var2;
            }
            Objects.requireNonNull(g0Var);
            C2063d0 d0Var = g0Var2.f6001e;
            C2061c0 c0Var = g0Var2.f6002f;
            int i = g0Var2.f6004h;
            String str = g0Var2.f6003g;
            C2101v vVar = g0Var2.f6005i;
            C2103w.C2104a d = g0Var2.f6006j.mo6613d();
            C2072g0 g0Var3 = g0Var2.f6008l;
            C2072g0 g0Var4 = g0Var2.f6009m;
            C2072g0 g0Var5 = g0Var2.f6010n;
            long j = g0Var2.f6011o;
            long j2 = g0Var2.f6012p;
            C0013c cVar = g0Var2.f6013q;
            if (!(i >= 0)) {
                throw new IllegalStateException(C0131a0.m344a("code < 0: ", i).toString());
            } else if (d0Var == null) {
                throw new IllegalStateException("request == null".toString());
            } else if (c0Var == null) {
                throw new IllegalStateException("protocol == null".toString());
            } else if (str != null) {
                return new C2072g0(d0Var, c0Var, str, i, vVar, d.mo6622c(), (C2079i0) null, g0Var3, g0Var4, g0Var5, j, j2, cVar);
            } else {
                throw new IllegalStateException("message == null".toString());
            }
        }

        /* renamed from: b */
        public final boolean mo6680b(String str) {
            return C1205h.m3427K("Content-Length", str, true) || C1205h.m3427K("Content-Encoding", str, true) || C1205h.m3427K("Content-Type", str, true);
        }

        /* renamed from: c */
        public final boolean mo6681c(String str) {
            return !C1205h.m3427K("Connection", str, true) && !C1205h.m3427K("Keep-Alive", str, true) && !C1205h.m3427K("Proxy-Authenticate", str, true) && !C1205h.m3427K("Proxy-Authorization", str, true) && !C1205h.m3427K("TE", str, true) && !C1205h.m3427K("Trailers", str, true) && !C1205h.m3427K("Transfer-Encoding", str, true) && !C1205h.m3427K("Upgrade", str, true);
        }
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Throwable, w3.d, java.lang.Object] */
    /* renamed from: a */
    public C2072g0 mo8a(C2109y.C2110a aVar) {
        C2103w wVar;
        C0548g gVar = (C0548g) aVar;
        C0017e eVar = gVar.f2339b;
        System.currentTimeMillis();
        C2063d0 d0Var = gVar.f2343f;
        C1241e.m3517j(d0Var, "request");
        C2144b bVar = new C2144b(d0Var, (C2072g0) null);
        if (d0Var.mo6542a().f5993j) {
            bVar = new C2144b((C2063d0) null, (C2072g0) null);
        }
        C2063d0 d0Var2 = bVar.f6194a;
        C2072g0 g0Var = bVar.f6195b;
        boolean z = eVar instanceof C0017e;
        if (d0Var2 == null && g0Var == null) {
            C2072g0.C2073a aVar2 = new C2072g0.C2073a();
            aVar2.mo6562g(gVar.f2343f);
            aVar2.mo6561f(C2061c0.HTTP_1_1);
            aVar2.f6016c = 504;
            aVar2.mo6560e("Unsatisfiable Request (only-if-cached)");
            aVar2.f6020g = C2129c.f6171c;
            aVar2.f6024k = -1;
            aVar2.f6025l = System.currentTimeMillis();
            C2072g0 a = aVar2.mo6556a();
            C1241e.m3517j(eVar, "call");
            return a;
        } else if (d0Var2 == null) {
            C1241e.m3515e(g0Var);
            C2072g0.C2073a aVar3 = new C2072g0.C2073a(g0Var);
            aVar3.mo6557b(C2143a.m5558a(f6193a, g0Var));
            C2072g0 a2 = aVar3.mo6556a();
            C1241e.m3517j(eVar, "call");
            return a2;
        } else {
            if (g0Var != null) {
                C1241e.m3517j(eVar, "call");
            }
            C2072g0 c = ((C0548g) aVar).mo2692c(d0Var2);
            if (g0Var != null) {
                if (c.f6004h == 304) {
                    C2072g0.C2073a aVar4 = new C2072g0.C2073a(g0Var);
                    C2143a aVar5 = f6193a;
                    C2103w wVar2 = g0Var.f6006j;
                    C2103w wVar3 = c.f6006j;
                    ArrayList arrayList = new ArrayList(20);
                    int size = wVar2.size();
                    int i = 0;
                    while (i < size) {
                        String c2 = wVar2.mo6612c(i);
                        String e = wVar2.mo6614e(i);
                        if (C1205h.m3427K("Warning", c2, true)) {
                            wVar = wVar2;
                            if (C1205h.m3434R(e, "1", false, 2)) {
                                i++;
                                wVar2 = wVar;
                            }
                        } else {
                            wVar = wVar2;
                        }
                        if (aVar5.mo6680b(c2) || !aVar5.mo6681c(c2) || wVar3.mo6611b(c2) == null) {
                            C1241e.m3517j(c2, "name");
                            C1241e.m3517j(e, "value");
                            arrayList.add(c2);
                            arrayList.add(C1209l.m3455j0(e).toString());
                            i++;
                            wVar2 = wVar;
                        } else {
                            i++;
                            wVar2 = wVar;
                        }
                    }
                    int size2 = wVar3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        String c3 = wVar3.mo6612c(i2);
                        if (!aVar5.mo6680b(c3) && aVar5.mo6681c(c3)) {
                            String e2 = wVar3.mo6614e(i2);
                            C1241e.m3517j(c3, "name");
                            C1241e.m3517j(e2, "value");
                            arrayList.add(c3);
                            arrayList.add(C1209l.m3455j0(e2).toString());
                        }
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                    aVar4.mo6559d(new C2103w((String[]) array, (C0802f) null));
                    aVar4.f6024k = c.f6011o;
                    aVar4.f6025l = c.f6012p;
                    C2143a aVar6 = f6193a;
                    aVar4.mo6557b(C2143a.m5558a(aVar6, g0Var));
                    C2072g0 a3 = C2143a.m5558a(aVar6, c);
                    aVar4.mo6558c("networkResponse", a3);
                    aVar4.f6021h = a3;
                    aVar4.mo6556a();
                    C2079i0 i0Var = c.f6007k;
                    C1241e.m3515e(i0Var);
                    i0Var.close();
                    ? r0 = 0;
                    C1241e.m3515e(r0);
                    r0.mo6541a();
                    throw r0;
                }
                C2079i0 i0Var2 = g0Var.f6007k;
                if (i0Var2 != null) {
                    C2129c.m5515c(i0Var2);
                }
            }
            C2072g0.C2073a aVar7 = new C2072g0.C2073a(c);
            C2143a aVar8 = f6193a;
            aVar7.mo6557b(C2143a.m5558a(aVar8, g0Var));
            C2072g0 a4 = C2143a.m5558a(aVar8, c);
            aVar7.mo6558c("networkResponse", a4);
            aVar7.f6021h = a4;
            return aVar7.mo6556a();
        }
    }
}
