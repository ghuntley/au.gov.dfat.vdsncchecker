package p005a4;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.Objects;
import p000a.C0001b;
import p014b4.C0545d;
import p062j4.C1112f;
import p062j4.C1117j;
import p062j4.C1118k;
import p062j4.C1132x;
import p062j4.C1134z;
import p072l2.C1241e;
import p139w3.C2063d0;
import p139w3.C2070f0;
import p139w3.C2072g0;
import p139w3.C2095s;

/* renamed from: a4.c */
public final class C0013c {

    /* renamed from: a */
    public boolean f14a;

    /* renamed from: b */
    public final C0024i f15b;

    /* renamed from: c */
    public final C0017e f16c;

    /* renamed from: d */
    public final C2095s f17d;

    /* renamed from: e */
    public final C0016d f18e;

    /* renamed from: f */
    public final C0545d f19f;

    /* renamed from: a4.c$a */
    public final class C0014a extends C1117j {

        /* renamed from: f */
        public boolean f20f;

        /* renamed from: g */
        public long f21g;

        /* renamed from: h */
        public boolean f22h;

        /* renamed from: i */
        public final long f23i;

        /* renamed from: j */
        public final /* synthetic */ C0013c f24j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0014a(C0013c cVar, C1132x xVar, long j) {
            super(xVar);
            C1241e.m3517j(xVar, "delegate");
            this.f24j = cVar;
            this.f23i = j;
        }

        /* renamed from: O */
        public void mo15O(C1112f fVar, long j) {
            C1241e.m3517j(fVar, "source");
            if (!this.f22h) {
                long j2 = this.f23i;
                if (j2 == -1 || this.f21g + j <= j2) {
                    try {
                        C1241e.m3517j(fVar, "source");
                        this.f3894e.mo15O(fVar, j);
                        this.f21g += j;
                    } catch (IOException e) {
                        throw mo16a(e);
                    }
                } else {
                    StringBuilder a = C0001b.m0a("expected ");
                    a.append(this.f23i);
                    a.append(" bytes but received ");
                    a.append(this.f21g + j);
                    throw new ProtocolException(a.toString());
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        /* renamed from: a */
        public final <E extends IOException> E mo16a(E e) {
            if (this.f20f) {
                return e;
            }
            this.f20f = true;
            return this.f24j.mo10a(this.f21g, false, true, e);
        }

        public void close() {
            if (!this.f22h) {
                this.f22h = true;
                long j = this.f23i;
                if (j == -1 || this.f21g == j) {
                    try {
                        this.f3894e.close();
                        mo16a((IOException) null);
                    } catch (IOException e) {
                        throw mo16a(e);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public void flush() {
            try {
                this.f3894e.flush();
            } catch (IOException e) {
                throw mo16a(e);
            }
        }
    }

    /* renamed from: a4.c$b */
    public final class C0015b extends C1118k {

        /* renamed from: f */
        public long f25f;

        /* renamed from: g */
        public boolean f26g = true;

        /* renamed from: h */
        public boolean f27h;

        /* renamed from: i */
        public boolean f28i;

        /* renamed from: j */
        public final long f29j;

        /* renamed from: k */
        public final /* synthetic */ C0013c f30k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0015b(C0013c cVar, C1134z zVar, long j) {
            super(zVar);
            C1241e.m3517j(zVar, "delegate");
            this.f30k = cVar;
            this.f29j = j;
            if (j == 0) {
                mo19a((IOException) null);
            }
        }

        /* renamed from: a */
        public final <E extends IOException> E mo19a(E e) {
            if (this.f27h) {
                return e;
            }
            this.f27h = true;
            if (e == null && this.f26g) {
                this.f26g = false;
                C0013c cVar = this.f30k;
                C2095s sVar = cVar.f17d;
                C0017e eVar = cVar.f16c;
                Objects.requireNonNull(sVar);
                C1241e.m3517j(eVar, "call");
            }
            return this.f30k.mo10a(this.f25f, true, false, e);
        }

        public void close() {
            if (!this.f28i) {
                this.f28i = true;
                try {
                    this.f3895e.close();
                    mo19a((IOException) null);
                } catch (IOException e) {
                    throw mo19a(e);
                }
            }
        }

        /* renamed from: o */
        public long mo21o(C1112f fVar, long j) {
            C1241e.m3517j(fVar, "sink");
            if (!this.f28i) {
                try {
                    long o = this.f3895e.mo21o(fVar, j);
                    if (this.f26g) {
                        this.f26g = false;
                        C0013c cVar = this.f30k;
                        C2095s sVar = cVar.f17d;
                        C0017e eVar = cVar.f16c;
                        Objects.requireNonNull(sVar);
                        C1241e.m3517j(eVar, "call");
                    }
                    if (o == -1) {
                        mo19a((IOException) null);
                        return -1;
                    }
                    long j2 = this.f25f + o;
                    long j3 = this.f29j;
                    if (j3 != -1) {
                        if (j2 > j3) {
                            throw new ProtocolException("expected " + this.f29j + " bytes but received " + j2);
                        }
                    }
                    this.f25f = j2;
                    if (j2 == j3) {
                        mo19a((IOException) null);
                    }
                    return o;
                } catch (IOException e) {
                    throw mo19a(e);
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    public C0013c(C0017e eVar, C2095s sVar, C0016d dVar, C0545d dVar2) {
        C1241e.m3517j(sVar, "eventListener");
        this.f16c = eVar;
        this.f17d = sVar;
        this.f18e = dVar;
        this.f19f = dVar2;
        this.f15b = dVar2.mo2689g();
    }

    /* renamed from: a */
    public final <E extends IOException> E mo10a(long j, boolean z, boolean z2, E e) {
        if (e != null) {
            mo14e(e);
        }
        if (z2) {
            C2095s sVar = this.f17d;
            C0017e eVar = this.f16c;
            if (e != null) {
                sVar.mo6602b(eVar, e);
            } else {
                Objects.requireNonNull(sVar);
                C1241e.m3517j(eVar, "call");
            }
        }
        if (z) {
            if (e != null) {
                this.f17d.mo6603c(this.f16c, e);
            } else {
                C2095s sVar2 = this.f17d;
                C0017e eVar2 = this.f16c;
                Objects.requireNonNull(sVar2);
                C1241e.m3517j(eVar2, "call");
            }
        }
        return this.f16c.mo34k(this, z2, z, e);
    }

    /* renamed from: b */
    public final C1132x mo11b(C2063d0 d0Var, boolean z) {
        this.f14a = z;
        C2070f0 f0Var = d0Var.f5976e;
        C1241e.m3515e(f0Var);
        long a = f0Var.mo6448a();
        C2095s sVar = this.f17d;
        C0017e eVar = this.f16c;
        Objects.requireNonNull(sVar);
        C1241e.m3517j(eVar, "call");
        return new C0014a(this, this.f19f.mo2683b(d0Var, a), a);
    }

    /* renamed from: c */
    public final C2072g0.C2073a mo12c(boolean z) {
        try {
            C2072g0.C2073a e = this.f19f.mo2687e(z);
            if (e != null) {
                C1241e.m3517j(this, "deferredTrailers");
                e.f6026m = this;
            }
            return e;
        } catch (IOException e2) {
            this.f17d.mo6603c(this.f16c, e2);
            mo14e(e2);
            throw e2;
        }
    }

    /* renamed from: d */
    public final void mo13d() {
        C2095s sVar = this.f17d;
        C0017e eVar = this.f16c;
        Objects.requireNonNull(sVar);
        C1241e.m3517j(eVar, "call");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r6 > 1) goto L_0x0028;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14e(java.io.IOException r6) {
        /*
            r5 = this;
            a4.d r0 = r5.f18e
            r0.mo24c(r6)
            b4.d r0 = r5.f19f
            a4.i r0 = r0.mo2689g()
            a4.e r1 = r5.f16c
            monitor-enter(r0)
            java.lang.String r2 = "call"
            p072l2.C1241e.m3517j(r1, r2)     // Catch:{ all -> 0x0056 }
            boolean r2 = r6 instanceof p026d4.C0851u     // Catch:{ all -> 0x0056 }
            r3 = 1
            if (r2 == 0) goto L_0x0038
            r2 = r6
            d4.u r2 = (p026d4.C0851u) r2     // Catch:{ all -> 0x0056 }
            d4.b r2 = r2.f3302e     // Catch:{ all -> 0x0056 }
            d4.b r4 = p026d4.C0814b.REFUSED_STREAM     // Catch:{ all -> 0x0056 }
            if (r2 != r4) goto L_0x002b
            int r6 = r0.f80m     // Catch:{ all -> 0x0056 }
            int r6 = r6 + r3
            r0.f80m = r6     // Catch:{ all -> 0x0056 }
            if (r6 <= r3) goto L_0x0054
        L_0x0028:
            r0.f76i = r3     // Catch:{ all -> 0x0056 }
            goto L_0x004f
        L_0x002b:
            d4.u r6 = (p026d4.C0851u) r6     // Catch:{ all -> 0x0056 }
            d4.b r6 = r6.f3302e     // Catch:{ all -> 0x0056 }
            d4.b r2 = p026d4.C0814b.CANCEL     // Catch:{ all -> 0x0056 }
            if (r6 != r2) goto L_0x0028
            boolean r6 = r1.f53q     // Catch:{ all -> 0x0056 }
            if (r6 == 0) goto L_0x0028
            goto L_0x0054
        L_0x0038:
            boolean r2 = r0.mo50j()     // Catch:{ all -> 0x0056 }
            if (r2 == 0) goto L_0x0042
            boolean r2 = r6 instanceof p026d4.C0813a     // Catch:{ all -> 0x0056 }
            if (r2 == 0) goto L_0x0054
        L_0x0042:
            r0.f76i = r3     // Catch:{ all -> 0x0056 }
            int r2 = r0.f79l     // Catch:{ all -> 0x0056 }
            if (r2 != 0) goto L_0x0054
            w3.b0 r1 = r1.f56t     // Catch:{ all -> 0x0056 }
            w3.j0 r2 = r0.f84q     // Catch:{ all -> 0x0056 }
            r0.mo44d(r1, r2, r6)     // Catch:{ all -> 0x0056 }
        L_0x004f:
            int r6 = r0.f78k     // Catch:{ all -> 0x0056 }
            int r6 = r6 + r3
            r0.f78k = r6     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r0)
            return
        L_0x0056:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p005a4.C0013c.mo14e(java.io.IOException):void");
    }
}
