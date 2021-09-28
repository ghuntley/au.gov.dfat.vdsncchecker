package p020c4;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p000a.C0001b;
import p005a4.C0024i;
import p014b4.C0545d;
import p014b4.C0546e;
import p014b4.C0551j;
import p059j1.C1087a;
import p062j4.C1104a0;
import p062j4.C1112f;
import p062j4.C1113g;
import p062j4.C1114h;
import p062j4.C1119l;
import p062j4.C1132x;
import p062j4.C1134z;
import p063k.C1142f;
import p067k3.C1205h;
import p067k3.C1209l;
import p072l2.C1241e;
import p139w3.C2057b0;
import p139w3.C2063d0;
import p139w3.C2072g0;
import p139w3.C2091o;
import p139w3.C2103w;
import p139w3.C2106x;
import p144x3.C2129c;

/* renamed from: c4.b */
public final class C0649b implements C0545d {

    /* renamed from: a */
    public int f2499a;

    /* renamed from: b */
    public final C0648a f2500b;

    /* renamed from: c */
    public C2103w f2501c;

    /* renamed from: d */
    public final C2057b0 f2502d;

    /* renamed from: e */
    public final C0024i f2503e;

    /* renamed from: f */
    public final C1114h f2504f;

    /* renamed from: g */
    public final C1113g f2505g;

    /* renamed from: c4.b$a */
    public abstract class C0650a implements C1134z {

        /* renamed from: e */
        public final C1119l f2506e;

        /* renamed from: f */
        public boolean f2507f;

        public C0650a() {
            this.f2506e = new C1119l(C0649b.this.f2504f.mo2835d());
        }

        /* renamed from: a */
        public final void mo2834a() {
            C0649b bVar = C0649b.this;
            int i = bVar.f2499a;
            if (i != 6) {
                if (i == 5) {
                    C0649b.m2025i(bVar, this.f2506e);
                    C0649b.this.f2499a = 6;
                    return;
                }
                StringBuilder a = C0001b.m0a("state: ");
                a.append(C0649b.this.f2499a);
                throw new IllegalStateException(a.toString());
            }
        }

        /* renamed from: d */
        public C1104a0 mo2835d() {
            return this.f2506e;
        }

        /* renamed from: o */
        public long mo21o(C1112f fVar, long j) {
            try {
                return C0649b.this.f2504f.mo21o(fVar, j);
            } catch (IOException e) {
                C0649b.this.f2503e.mo52l();
                mo2834a();
                throw e;
            }
        }
    }

    /* renamed from: c4.b$b */
    public final class C0651b implements C1132x {

        /* renamed from: e */
        public final C1119l f2509e;

        /* renamed from: f */
        public boolean f2510f;

        public C0651b() {
            this.f2509e = new C1119l(C0649b.this.f2505g.mo2836d());
        }

        /* renamed from: O */
        public void mo15O(C1112f fVar, long j) {
            C1241e.m3517j(fVar, "source");
            if (!(!this.f2510f)) {
                throw new IllegalStateException("closed".toString());
            } else if (j != 0) {
                C0649b.this.f2505g.mo4648j(j);
                C0649b.this.f2505g.mo4617G("\r\n");
                C0649b.this.f2505g.mo15O(fVar, j);
                C0649b.this.f2505g.mo4617G("\r\n");
            }
        }

        public synchronized void close() {
            if (!this.f2510f) {
                this.f2510f = true;
                C0649b.this.f2505g.mo4617G("0\r\n\r\n");
                C0649b.m2025i(C0649b.this, this.f2509e);
                C0649b.this.f2499a = 3;
            }
        }

        /* renamed from: d */
        public C1104a0 mo2836d() {
            return this.f2509e;
        }

        public synchronized void flush() {
            if (!this.f2510f) {
                C0649b.this.f2505g.flush();
            }
        }
    }

    /* renamed from: c4.b$c */
    public final class C0652c extends C0650a {

        /* renamed from: h */
        public long f2512h = -1;

        /* renamed from: i */
        public boolean f2513i = true;

        /* renamed from: j */
        public final C2106x f2514j;

        /* renamed from: k */
        public final /* synthetic */ C0649b f2515k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0652c(C0649b bVar, C2106x xVar) {
            super();
            C1241e.m3517j(xVar, "url");
            this.f2515k = bVar;
            this.f2514j = xVar;
        }

        public void close() {
            if (!this.f2507f) {
                if (this.f2513i && !C2129c.m5519g(this, 100, TimeUnit.MILLISECONDS)) {
                    this.f2515k.f2503e.mo52l();
                    mo2834a();
                }
                this.f2507f = true;
            }
        }

        /* renamed from: o */
        public long mo21o(C1112f fVar, long j) {
            C1241e.m3517j(fVar, "sink");
            boolean z = true;
            if (!(j >= 0)) {
                throw new IllegalArgumentException(C1087a.m3111a("byteCount < 0: ", j).toString());
            } else if (!(!this.f2507f)) {
                throw new IllegalStateException("closed".toString());
            } else if (!this.f2513i) {
                return -1;
            } else {
                long j2 = this.f2512h;
                if (j2 == 0 || j2 == -1) {
                    if (j2 != -1) {
                        this.f2515k.f2504f.mo4613C();
                    }
                    try {
                        this.f2512h = this.f2515k.f2504f.mo4624N();
                        String C = this.f2515k.f2504f.mo4613C();
                        if (C != null) {
                            String obj = C1209l.m3455j0(C).toString();
                            if (this.f2512h >= 0) {
                                if (obj.length() <= 0) {
                                    z = false;
                                }
                                if (!z || C1205h.m3434R(obj, ";", false, 2)) {
                                    if (this.f2512h == 0) {
                                        this.f2513i = false;
                                        C0649b bVar = this.f2515k;
                                        bVar.f2501c = bVar.f2500b.mo2830a();
                                        C2057b0 b0Var = this.f2515k.f2502d;
                                        C1241e.m3515e(b0Var);
                                        C2091o oVar = b0Var.f5929n;
                                        C2106x xVar = this.f2514j;
                                        C2103w wVar = this.f2515k.f2501c;
                                        C1241e.m3515e(wVar);
                                        C0546e.m1799b(oVar, xVar, wVar);
                                        mo2834a();
                                    }
                                    if (!this.f2513i) {
                                        return -1;
                                    }
                                }
                            }
                            throw new ProtocolException("expected chunk size and optional extensions" + " but was \"" + this.f2512h + obj + '\"');
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long o = super.mo21o(fVar, Math.min(j, this.f2512h));
                if (o != -1) {
                    this.f2512h -= o;
                    return o;
                }
                this.f2515k.f2503e.mo52l();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo2834a();
                throw protocolException;
            }
        }
    }

    /* renamed from: c4.b$d */
    public final class C0653d extends C0650a {

        /* renamed from: h */
        public long f2516h;

        public C0653d(long j) {
            super();
            this.f2516h = j;
            if (j == 0) {
                mo2834a();
            }
        }

        public void close() {
            if (!this.f2507f) {
                if (this.f2516h != 0 && !C2129c.m5519g(this, 100, TimeUnit.MILLISECONDS)) {
                    C0649b.this.f2503e.mo52l();
                    mo2834a();
                }
                this.f2507f = true;
            }
        }

        /* renamed from: o */
        public long mo21o(C1112f fVar, long j) {
            C1241e.m3517j(fVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(C1087a.m3111a("byteCount < 0: ", j).toString());
            } else if (!this.f2507f) {
                long j2 = this.f2516h;
                if (j2 == 0) {
                    return -1;
                }
                long o = super.mo21o(fVar, Math.min(j2, j));
                if (o != -1) {
                    long j3 = this.f2516h - o;
                    this.f2516h = j3;
                    if (j3 == 0) {
                        mo2834a();
                    }
                    return o;
                }
                C0649b.this.f2503e.mo52l();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo2834a();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    /* renamed from: c4.b$e */
    public final class C0654e implements C1132x {

        /* renamed from: e */
        public final C1119l f2518e;

        /* renamed from: f */
        public boolean f2519f;

        public C0654e() {
            this.f2518e = new C1119l(C0649b.this.f2505g.mo2836d());
        }

        /* renamed from: O */
        public void mo15O(C1112f fVar, long j) {
            C1241e.m3517j(fVar, "source");
            if (!this.f2519f) {
                C2129c.m5514b(fVar.f3888f, 0, j);
                C0649b.this.f2505g.mo15O(fVar, j);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        public void close() {
            if (!this.f2519f) {
                this.f2519f = true;
                C0649b.m2025i(C0649b.this, this.f2518e);
                C0649b.this.f2499a = 3;
            }
        }

        /* renamed from: d */
        public C1104a0 mo2836d() {
            return this.f2518e;
        }

        public void flush() {
            if (!this.f2519f) {
                C0649b.this.f2505g.flush();
            }
        }
    }

    /* renamed from: c4.b$f */
    public final class C0655f extends C0650a {

        /* renamed from: h */
        public boolean f2521h;

        public C0655f(C0649b bVar) {
            super();
        }

        public void close() {
            if (!this.f2507f) {
                if (!this.f2521h) {
                    mo2834a();
                }
                this.f2507f = true;
            }
        }

        /* renamed from: o */
        public long mo21o(C1112f fVar, long j) {
            C1241e.m3517j(fVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(C1087a.m3111a("byteCount < 0: ", j).toString());
            } else if (!(!this.f2507f)) {
                throw new IllegalStateException("closed".toString());
            } else if (this.f2521h) {
                return -1;
            } else {
                long o = super.mo21o(fVar, j);
                if (o != -1) {
                    return o;
                }
                this.f2521h = true;
                mo2834a();
                return -1;
            }
        }
    }

    public C0649b(C2057b0 b0Var, C0024i iVar, C1114h hVar, C1113g gVar) {
        this.f2502d = b0Var;
        this.f2503e = iVar;
        this.f2504f = hVar;
        this.f2505g = gVar;
        this.f2500b = new C0648a(hVar);
    }

    /* renamed from: i */
    public static final void m2025i(C0649b bVar, C1119l lVar) {
        Objects.requireNonNull(bVar);
        C1104a0 a0Var = lVar.f3896e;
        C1104a0 a0Var2 = C1104a0.f3872d;
        C1241e.m3517j(a0Var2, "delegate");
        lVar.f3896e = a0Var2;
        a0Var.mo4598a();
        a0Var.mo4599b();
    }

    /* renamed from: a */
    public C1134z mo2682a(C2072g0 g0Var) {
        if (!C0546e.m1798a(g0Var)) {
            return mo2832j(0);
        }
        boolean z = true;
        if (C1205h.m3427K("chunked", C2072g0.m5415a(g0Var, "Transfer-Encoding", (String) null, 2), true)) {
            C2106x xVar = g0Var.f6001e.f5973b;
            if (this.f2499a != 4) {
                z = false;
            }
            if (z) {
                this.f2499a = 5;
                return new C0652c(this, xVar);
            }
            StringBuilder a = C0001b.m0a("state: ");
            a.append(this.f2499a);
            throw new IllegalStateException(a.toString().toString());
        }
        long j = C2129c.m5522j(g0Var);
        if (j != -1) {
            return mo2832j(j);
        }
        if (this.f2499a != 4) {
            z = false;
        }
        if (z) {
            this.f2499a = 5;
            this.f2503e.mo52l();
            return new C0655f(this);
        }
        StringBuilder a2 = C0001b.m0a("state: ");
        a2.append(this.f2499a);
        throw new IllegalStateException(a2.toString().toString());
    }

    /* renamed from: b */
    public C1132x mo2683b(C2063d0 d0Var, long j) {
        boolean z = true;
        if (C1205h.m3427K("chunked", d0Var.mo6543b("Transfer-Encoding"), true)) {
            if (this.f2499a != 1) {
                z = false;
            }
            if (z) {
                this.f2499a = 2;
                return new C0651b();
            }
            StringBuilder a = C0001b.m0a("state: ");
            a.append(this.f2499a);
            throw new IllegalStateException(a.toString().toString());
        } else if (j != -1) {
            if (this.f2499a != 1) {
                z = false;
            }
            if (z) {
                this.f2499a = 2;
                return new C0654e();
            }
            StringBuilder a2 = C0001b.m0a("state: ");
            a2.append(this.f2499a);
            throw new IllegalStateException(a2.toString().toString());
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    /* renamed from: c */
    public void mo2684c() {
        this.f2505g.flush();
    }

    public void cancel() {
        Socket socket = this.f2503e.f69b;
        if (socket != null) {
            C2129c.m5516d(socket);
        }
    }

    /* renamed from: d */
    public void mo2686d() {
        this.f2505g.flush();
    }

    /* renamed from: e */
    public C2072g0.C2073a mo2687e(boolean z) {
        int i = this.f2499a;
        boolean z2 = true;
        if (!(i == 1 || i == 3)) {
            z2 = false;
        }
        if (z2) {
            try {
                C0551j a = C0551j.m1811a(this.f2500b.mo2831b());
                C2072g0.C2073a aVar = new C2072g0.C2073a();
                aVar.mo6561f(a.f2351a);
                aVar.f6016c = a.f2352b;
                aVar.mo6560e(a.f2353c);
                aVar.mo6559d(this.f2500b.mo2830a());
                if (z && a.f2352b == 100) {
                    return null;
                }
                if (a.f2352b == 100) {
                    this.f2499a = 3;
                    return aVar;
                }
                this.f2499a = 4;
                return aVar;
            } catch (EOFException e) {
                throw new IOException(C1142f.m3365a("unexpected end of stream on ", this.f2503e.f84q.f6057a.f5889a.mo6634g()), e);
            }
        } else {
            StringBuilder a2 = C0001b.m0a("state: ");
            a2.append(this.f2499a);
            throw new IllegalStateException(a2.toString().toString());
        }
    }

    /* renamed from: f */
    public long mo2688f(C2072g0 g0Var) {
        if (!C0546e.m1798a(g0Var)) {
            return 0;
        }
        if (C1205h.m3427K("chunked", C2072g0.m5415a(g0Var, "Transfer-Encoding", (String) null, 2), true)) {
            return -1;
        }
        return C2129c.m5522j(g0Var);
    }

    /* renamed from: g */
    public C0024i mo2689g() {
        return this.f2503e;
    }

    /* renamed from: h */
    public void mo2690h(C2063d0 d0Var) {
        Proxy.Type type = this.f2503e.f84q.f6058b.type();
        C1241e.m3516f(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append(d0Var.f5974c);
        sb.append(' ');
        C2106x xVar = d0Var.f5973b;
        if (!xVar.f6116a && type == Proxy.Type.HTTP) {
            sb.append(xVar);
        } else {
            String b = xVar.mo6628b();
            String d = xVar.mo6630d();
            if (d != null) {
                b = b + '?' + d;
            }
            sb.append(b);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        C1241e.m3516f(sb2, "StringBuilder().apply(builderAction).toString()");
        mo2833k(d0Var.f5975d, sb2);
    }

    /* renamed from: j */
    public final C1134z mo2832j(long j) {
        if (this.f2499a == 4) {
            this.f2499a = 5;
            return new C0653d(j);
        }
        StringBuilder a = C0001b.m0a("state: ");
        a.append(this.f2499a);
        throw new IllegalStateException(a.toString().toString());
    }

    /* renamed from: k */
    public final void mo2833k(C2103w wVar, String str) {
        C1241e.m3517j(wVar, "headers");
        C1241e.m3517j(str, "requestLine");
        if (this.f2499a == 0) {
            this.f2505g.mo4617G(str).mo4617G("\r\n");
            int size = wVar.size();
            for (int i = 0; i < size; i++) {
                this.f2505g.mo4617G(wVar.mo6612c(i)).mo4617G(": ").mo4617G(wVar.mo6614e(i)).mo4617G("\r\n");
            }
            this.f2505g.mo4617G("\r\n");
            this.f2499a = 1;
            return;
        }
        StringBuilder a = C0001b.m0a("state: ");
        a.append(this.f2499a);
        throw new IllegalStateException(a.toString().toString());
    }
}
