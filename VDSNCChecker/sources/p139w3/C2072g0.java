package p139w3;

import java.io.Closeable;
import java.util.Objects;
import p000a.C0001b;
import p005a4.C0013c;
import p063k.C1142f;
import p072l2.C1241e;
import p139w3.C2103w;

/* renamed from: w3.g0 */
public final class C2072g0 implements Closeable {

    /* renamed from: e */
    public final C2063d0 f6001e;

    /* renamed from: f */
    public final C2061c0 f6002f;

    /* renamed from: g */
    public final String f6003g;

    /* renamed from: h */
    public final int f6004h;

    /* renamed from: i */
    public final C2101v f6005i;

    /* renamed from: j */
    public final C2103w f6006j;

    /* renamed from: k */
    public final C2079i0 f6007k;

    /* renamed from: l */
    public final C2072g0 f6008l;

    /* renamed from: m */
    public final C2072g0 f6009m;

    /* renamed from: n */
    public final C2072g0 f6010n;

    /* renamed from: o */
    public final long f6011o;

    /* renamed from: p */
    public final long f6012p;

    /* renamed from: q */
    public final C0013c f6013q;

    /* renamed from: w3.g0$a */
    public static class C2073a {

        /* renamed from: a */
        public C2063d0 f6014a;

        /* renamed from: b */
        public C2061c0 f6015b;

        /* renamed from: c */
        public int f6016c;

        /* renamed from: d */
        public String f6017d;

        /* renamed from: e */
        public C2101v f6018e;

        /* renamed from: f */
        public C2103w.C2104a f6019f;

        /* renamed from: g */
        public C2079i0 f6020g;

        /* renamed from: h */
        public C2072g0 f6021h;

        /* renamed from: i */
        public C2072g0 f6022i;

        /* renamed from: j */
        public C2072g0 f6023j;

        /* renamed from: k */
        public long f6024k;

        /* renamed from: l */
        public long f6025l;

        /* renamed from: m */
        public C0013c f6026m;

        public C2073a() {
            this.f6016c = -1;
            this.f6019f = new C2103w.C2104a();
        }

        public C2073a(C2072g0 g0Var) {
            this.f6016c = -1;
            this.f6014a = g0Var.f6001e;
            this.f6015b = g0Var.f6002f;
            this.f6016c = g0Var.f6004h;
            this.f6017d = g0Var.f6003g;
            this.f6018e = g0Var.f6005i;
            this.f6019f = g0Var.f6006j.mo6613d();
            this.f6020g = g0Var.f6007k;
            this.f6021h = g0Var.f6008l;
            this.f6022i = g0Var.f6009m;
            this.f6023j = g0Var.f6010n;
            this.f6024k = g0Var.f6011o;
            this.f6025l = g0Var.f6012p;
            this.f6026m = g0Var.f6013q;
        }

        /* renamed from: a */
        public C2072g0 mo6556a() {
            int i = this.f6016c;
            if (i >= 0) {
                C2063d0 d0Var = this.f6014a;
                if (d0Var != null) {
                    C2061c0 c0Var = this.f6015b;
                    if (c0Var != null) {
                        String str = this.f6017d;
                        if (str != null) {
                            return new C2072g0(d0Var, c0Var, str, i, this.f6018e, this.f6019f.mo6622c(), this.f6020g, this.f6021h, this.f6022i, this.f6023j, this.f6024k, this.f6025l, this.f6026m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            StringBuilder a = C0001b.m0a("code < 0: ");
            a.append(this.f6016c);
            throw new IllegalStateException(a.toString().toString());
        }

        /* renamed from: b */
        public C2073a mo6557b(C2072g0 g0Var) {
            mo6558c("cacheResponse", g0Var);
            this.f6022i = g0Var;
            return this;
        }

        /* renamed from: c */
        public final void mo6558c(String str, C2072g0 g0Var) {
            if (g0Var != null) {
                boolean z = true;
                if (g0Var.f6007k == null) {
                    if (g0Var.f6008l == null) {
                        if (g0Var.f6009m == null) {
                            if (g0Var.f6010n != null) {
                                z = false;
                            }
                            if (!z) {
                                throw new IllegalArgumentException(C1142f.m3365a(str, ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException(C1142f.m3365a(str, ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException(C1142f.m3365a(str, ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException(C1142f.m3365a(str, ".body != null").toString());
            }
        }

        /* renamed from: d */
        public C2073a mo6559d(C2103w wVar) {
            this.f6019f = wVar.mo6613d();
            return this;
        }

        /* renamed from: e */
        public C2073a mo6560e(String str) {
            C1241e.m3517j(str, "message");
            this.f6017d = str;
            return this;
        }

        /* renamed from: f */
        public C2073a mo6561f(C2061c0 c0Var) {
            C1241e.m3517j(c0Var, "protocol");
            this.f6015b = c0Var;
            return this;
        }

        /* renamed from: g */
        public C2073a mo6562g(C2063d0 d0Var) {
            C1241e.m3517j(d0Var, "request");
            this.f6014a = d0Var;
            return this;
        }
    }

    public C2072g0(C2063d0 d0Var, C2061c0 c0Var, String str, int i, C2101v vVar, C2103w wVar, C2079i0 i0Var, C2072g0 g0Var, C2072g0 g0Var2, C2072g0 g0Var3, long j, long j2, C0013c cVar) {
        C1241e.m3517j(d0Var, "request");
        C1241e.m3517j(c0Var, "protocol");
        C1241e.m3517j(str, "message");
        C1241e.m3517j(wVar, "headers");
        this.f6001e = d0Var;
        this.f6002f = c0Var;
        this.f6003g = str;
        this.f6004h = i;
        this.f6005i = vVar;
        this.f6006j = wVar;
        this.f6007k = i0Var;
        this.f6008l = g0Var;
        this.f6009m = g0Var2;
        this.f6010n = g0Var3;
        this.f6011o = j;
        this.f6012p = j2;
        this.f6013q = cVar;
    }

    /* renamed from: a */
    public static String m5415a(C2072g0 g0Var, String str, String str2, int i) {
        Objects.requireNonNull(g0Var);
        String b = g0Var.f6006j.mo6611b(str);
        if (b != null) {
            return b;
        }
        return null;
    }

    /* renamed from: c */
    public final boolean mo6553c() {
        int i = this.f6004h;
        return 200 <= i && 299 >= i;
    }

    public void close() {
        C2079i0 i0Var = this.f6007k;
        if (i0Var != null) {
            i0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("Response{protocol=");
        a.append(this.f6002f);
        a.append(", code=");
        a.append(this.f6004h);
        a.append(", message=");
        a.append(this.f6003g);
        a.append(", url=");
        a.append(this.f6001e.f5973b);
        a.append('}');
        return a.toString();
    }
}
