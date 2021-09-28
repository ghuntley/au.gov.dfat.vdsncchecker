package p026d4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p005a4.C0024i;
import p014b4.C0545d;
import p014b4.C0546e;
import p014b4.C0548g;
import p026d4.C0841o;
import p062j4.C1115i;
import p062j4.C1132x;
import p062j4.C1134z;
import p072l2.C1241e;
import p139w3.C2057b0;
import p139w3.C2061c0;
import p139w3.C2063d0;
import p139w3.C2072g0;
import p139w3.C2103w;
import p139w3.C2106x;
import p144x3.C2129c;

/* renamed from: d4.m */
public final class C0837m implements C0545d {

    /* renamed from: g */
    public static final List<String> f3240g = C2129c.m5523k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h */
    public static final List<String> f3241h = C2129c.m5523k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    public volatile C0841o f3242a;

    /* renamed from: b */
    public final C2061c0 f3243b;

    /* renamed from: c */
    public volatile boolean f3244c;

    /* renamed from: d */
    public final C0024i f3245d;

    /* renamed from: e */
    public final C0548g f3246e;

    /* renamed from: f */
    public final C0820f f3247f;

    public C0837m(C2057b0 b0Var, C0024i iVar, C0548g gVar, C0820f fVar) {
        this.f3245d = iVar;
        this.f3246e = gVar;
        this.f3247f = fVar;
        List<C2061c0> list = b0Var.f5937v;
        C2061c0 c0Var = C2061c0.H2_PRIOR_KNOWLEDGE;
        this.f3243b = !list.contains(c0Var) ? C2061c0.HTTP_2 : c0Var;
    }

    /* renamed from: a */
    public C1134z mo2682a(C2072g0 g0Var) {
        C0841o oVar = this.f3242a;
        C1241e.m3515e(oVar);
        return oVar.f3266g;
    }

    /* renamed from: b */
    public C1132x mo2683b(C2063d0 d0Var, long j) {
        C0841o oVar = this.f3242a;
        C1241e.m3515e(oVar);
        return oVar.mo4103g();
    }

    /* renamed from: c */
    public void mo2684c() {
        C0841o oVar = this.f3242a;
        C1241e.m3515e(oVar);
        ((C0841o.C0842a) oVar.mo4103g()).close();
    }

    public void cancel() {
        this.f3244c = true;
        C0841o oVar = this.f3242a;
        if (oVar != null) {
            oVar.mo4101e(C0814b.CANCEL);
        }
    }

    /* renamed from: d */
    public void mo2686d() {
        this.f3247f.f3169D.flush();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e9, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ea, code lost:
        r0.f3268i.mo4112l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ef, code lost:
        throw r12;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p139w3.C2072g0.C2073a mo2687e(boolean r12) {
        /*
            r11 = this;
            d4.o r0 = r11.f3242a
            p072l2.C1241e.m3515e(r0)
            monitor-enter(r0)
            d4.o$c r1 = r0.f3268i     // Catch:{ all -> 0x00f0 }
            r1.mo4605h()     // Catch:{ all -> 0x00f0 }
        L_0x000b:
            java.util.ArrayDeque<w3.w> r1 = r0.f3264e     // Catch:{ all -> 0x00e9 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00e9 }
            if (r1 == 0) goto L_0x001b
            d4.b r1 = r0.f3270k     // Catch:{ all -> 0x00e9 }
            if (r1 != 0) goto L_0x001b
            r0.mo4108l()     // Catch:{ all -> 0x00e9 }
            goto L_0x000b
        L_0x001b:
            d4.o$c r1 = r0.f3268i     // Catch:{ all -> 0x00f0 }
            r1.mo4112l()     // Catch:{ all -> 0x00f0 }
            java.util.ArrayDeque<w3.w> r1 = r0.f3264e     // Catch:{ all -> 0x00f0 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00f0 }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x00d9
            java.util.ArrayDeque<w3.w> r1 = r0.f3264e     // Catch:{ all -> 0x00f0 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x00f0 }
            java.lang.String r2 = "headersQueue.removeFirst()"
            p072l2.C1241e.m3516f(r1, r2)     // Catch:{ all -> 0x00f0 }
            w3.w r1 = (p139w3.C2103w) r1     // Catch:{ all -> 0x00f0 }
            monitor-exit(r0)
            w3.c0 r0 = r11.f3243b
            java.lang.String r2 = "headerBlock"
            p072l2.C1241e.m3517j(r1, r2)
            java.lang.String r2 = "protocol"
            p072l2.C1241e.m3517j(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            int r3 = r1.size()
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r5
        L_0x0053:
            if (r6 >= r3) goto L_0x009e
            java.lang.String r8 = r1.mo6612c(r6)
            java.lang.String r9 = r1.mo6614e(r6)
            java.lang.String r10 = ":status"
            boolean r10 = p072l2.C1241e.m3513b(r8, r10)
            if (r10 == 0) goto L_0x007b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "HTTP/1.1 "
            r7.append(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            b4.j r7 = p014b4.C0551j.m1811a(r7)
            goto L_0x009b
        L_0x007b:
            java.util.List<java.lang.String> r10 = f3241h
            boolean r10 = r10.contains(r8)
            if (r10 != 0) goto L_0x009b
            java.lang.String r10 = "name"
            p072l2.C1241e.m3517j(r8, r10)
            java.lang.String r10 = "value"
            p072l2.C1241e.m3517j(r9, r10)
            r2.add(r8)
            java.lang.CharSequence r8 = p067k3.C1209l.m3455j0(r9)
            java.lang.String r8 = r8.toString()
            r2.add(r8)
        L_0x009b:
            int r6 = r6 + 1
            goto L_0x0053
        L_0x009e:
            if (r7 == 0) goto L_0x00d1
            w3.g0$a r1 = new w3.g0$a
            r1.<init>()
            r1.mo6561f(r0)
            int r0 = r7.f2352b
            r1.f6016c = r0
            java.lang.String r0 = r7.f2353c
            r1.mo6560e(r0)
            w3.w r0 = new w3.w
            java.lang.String[] r3 = new java.lang.String[r4]
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r2, r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.<init>(r2, r5)
            r1.mo6559d(r0)
            if (r12 == 0) goto L_0x00cf
            int r12 = r1.f6016c
            r0 = 100
            if (r12 != r0) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            r5 = r1
        L_0x00d0:
            return r5
        L_0x00d1:
            java.net.ProtocolException r12 = new java.net.ProtocolException
            java.lang.String r0 = "Expected ':status' header not present"
            r12.<init>(r0)
            throw r12
        L_0x00d9:
            java.io.IOException r12 = r0.f3271l     // Catch:{ all -> 0x00f0 }
            if (r12 == 0) goto L_0x00de
            goto L_0x00e8
        L_0x00de:
            d4.u r12 = new d4.u     // Catch:{ all -> 0x00f0 }
            d4.b r1 = r0.f3270k     // Catch:{ all -> 0x00f0 }
            p072l2.C1241e.m3515e(r1)     // Catch:{ all -> 0x00f0 }
            r12.<init>(r1)     // Catch:{ all -> 0x00f0 }
        L_0x00e8:
            throw r12     // Catch:{ all -> 0x00f0 }
        L_0x00e9:
            r12 = move-exception
            d4.o$c r1 = r0.f3268i     // Catch:{ all -> 0x00f0 }
            r1.mo4112l()     // Catch:{ all -> 0x00f0 }
            throw r12     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p026d4.C0837m.mo2687e(boolean):w3.g0$a");
    }

    /* renamed from: f */
    public long mo2688f(C2072g0 g0Var) {
        if (!C0546e.m1798a(g0Var)) {
            return 0;
        }
        return C2129c.m5522j(g0Var);
    }

    /* renamed from: g */
    public C0024i mo2689g() {
        return this.f3245d;
    }

    /* renamed from: h */
    public void mo2690h(C2063d0 d0Var) {
        int i;
        C0841o oVar;
        if (this.f3242a == null) {
            boolean z = false;
            boolean z2 = d0Var.f5976e != null;
            C2103w wVar = d0Var.f5975d;
            ArrayList arrayList = new ArrayList(wVar.size() + 4);
            arrayList.add(new C0815c(C0815c.f3132f, d0Var.f5974c));
            C1115i iVar = C0815c.f3133g;
            C2106x xVar = d0Var.f5973b;
            C1241e.m3517j(xVar, "url");
            String b = xVar.mo6628b();
            String d = xVar.mo6630d();
            if (d != null) {
                b = b + '?' + d;
            }
            arrayList.add(new C0815c(iVar, b));
            String b2 = d0Var.mo6543b("Host");
            if (b2 != null) {
                arrayList.add(new C0815c(C0815c.f3135i, b2));
            }
            arrayList.add(new C0815c(C0815c.f3134h, d0Var.f5973b.f6117b));
            int size = wVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                String c = wVar.mo6612c(i2);
                Locale locale = Locale.US;
                C1241e.m3516f(locale, "Locale.US");
                Objects.requireNonNull(c, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = c.toLowerCase(locale);
                C1241e.m3516f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!f3240g.contains(lowerCase) || (C1241e.m3513b(lowerCase, "te") && C1241e.m3513b(wVar.mo6614e(i2), "trailers"))) {
                    arrayList.add(new C0815c(lowerCase, wVar.mo6614e(i2)));
                }
            }
            C0820f fVar = this.f3247f;
            Objects.requireNonNull(fVar);
            boolean z3 = !z2;
            synchronized (fVar.f3169D) {
                synchronized (fVar) {
                    if (fVar.f3177j > 1073741823) {
                        fVar.mo4076i(C0814b.REFUSED_STREAM);
                    }
                    if (!fVar.f3178k) {
                        i = fVar.f3177j;
                        fVar.f3177j = i + 2;
                        oVar = new C0841o(i, fVar, z3, false, (C2103w) null);
                        if (!z2 || fVar.f3166A >= fVar.f3167B || oVar.f3262c >= oVar.f3263d) {
                            z = true;
                        }
                        if (oVar.mo4105i()) {
                            fVar.f3174g.put(Integer.valueOf(i), oVar);
                        }
                    } else {
                        throw new C0813a();
                    }
                }
                fVar.f3169D.mo4119i(z3, i, arrayList);
            }
            if (z) {
                fVar.f3169D.flush();
            }
            this.f3242a = oVar;
            if (!this.f3244c) {
                C0841o oVar2 = this.f3242a;
                C1241e.m3515e(oVar2);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                oVar2.f3268i.mo4604g((long) this.f3246e.f2345h, timeUnit);
                C0841o oVar3 = this.f3242a;
                C1241e.m3515e(oVar3);
                oVar3.f3269j.mo4604g((long) this.f3246e.f2346i, timeUnit);
                return;
            }
            C0841o oVar4 = this.f3242a;
            C1241e.m3515e(oVar4);
            oVar4.mo4101e(C0814b.CANCEL);
            throw new IOException("Canceled");
        }
    }
}
