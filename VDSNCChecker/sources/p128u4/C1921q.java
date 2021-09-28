package p128u4;

import androidx.appcompat.widget.C0131a0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import p000a.C0001b;
import p005a4.C0013c;
import p062j4.C1112f;
import p062j4.C1114h;
import p062j4.C1118k;
import p062j4.C1128t;
import p062j4.C1134z;
import p072l2.C1241e;
import p128u4.C1949w;
import p139w3.C2053a0;
import p139w3.C2061c0;
import p139w3.C2063d0;
import p139w3.C2067e0;
import p139w3.C2068f;
import p139w3.C2071g;
import p139w3.C2072g0;
import p139w3.C2079i0;
import p139w3.C2098t;
import p139w3.C2101v;
import p139w3.C2103w;
import p139w3.C2106x;
import p139w3.C2111z;
import p144x3.C2129c;

/* renamed from: u4.q */
public final class C1921q<T> implements C1882b<T> {

    /* renamed from: e */
    public final C1953z f5646e;

    /* renamed from: f */
    public final Object[] f5647f;

    /* renamed from: g */
    public final C2068f.C2069a f5648g;

    /* renamed from: h */
    public final C1896f<C2079i0, T> f5649h;

    /* renamed from: i */
    public volatile boolean f5650i;
    @GuardedBy("this")
    @Nullable

    /* renamed from: j */
    public C2068f f5651j;
    @GuardedBy("this")
    @Nullable

    /* renamed from: k */
    public Throwable f5652k;
    @GuardedBy("this")

    /* renamed from: l */
    public boolean f5653l;

    /* renamed from: u4.q$a */
    public class C1922a implements C2071g {

        /* renamed from: a */
        public final /* synthetic */ C1887d f5654a;

        public C1922a(C1887d dVar) {
            this.f5654a = dVar;
        }

        /* renamed from: a */
        public void mo6437a(C2068f fVar, IOException iOException) {
            try {
                this.f5654a.mo5961a(C1921q.this, iOException);
            } catch (Throwable th) {
                C1903g0.m5195o(th);
                th.printStackTrace();
            }
        }

        /* renamed from: b */
        public void mo6438b(C2068f fVar, C2072g0 g0Var) {
            try {
                try {
                    this.f5654a.mo5962b(C1921q.this, C1921q.this.mo6436e(g0Var));
                } catch (Throwable th) {
                    C1903g0.m5195o(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                C1903g0.m5195o(th2);
                th2.printStackTrace();
            }
        }
    }

    /* renamed from: u4.q$b */
    public static final class C1923b extends C2079i0 {

        /* renamed from: e */
        public final C2079i0 f5656e;

        /* renamed from: f */
        public final C1114h f5657f;
        @Nullable

        /* renamed from: g */
        public IOException f5658g;

        /* renamed from: u4.q$b$a */
        public class C1924a extends C1118k {
            public C1924a(C1134z zVar) {
                super(zVar);
            }

            /* renamed from: o */
            public long mo21o(C1112f fVar, long j) {
                try {
                    C1241e.m3517j(fVar, "sink");
                    return this.f3895e.mo21o(fVar, j);
                } catch (IOException e) {
                    C1923b.this.f5658g = e;
                    throw e;
                }
            }
        }

        public C1923b(C2079i0 i0Var) {
            this.f5656e = i0Var;
            this.f5657f = new C1128t(new C1924a(i0Var.mo2695g()));
        }

        /* renamed from: a */
        public long mo2693a() {
            return this.f5656e.mo2693a();
        }

        /* renamed from: c */
        public C2111z mo2694c() {
            return this.f5656e.mo2694c();
        }

        public void close() {
            this.f5656e.close();
        }

        /* renamed from: g */
        public C1114h mo2695g() {
            return this.f5657f;
        }
    }

    /* renamed from: u4.q$c */
    public static final class C1925c extends C2079i0 {
        @Nullable

        /* renamed from: e */
        public final C2111z f5660e;

        /* renamed from: f */
        public final long f5661f;

        public C1925c(@Nullable C2111z zVar, long j) {
            this.f5660e = zVar;
            this.f5661f = j;
        }

        /* renamed from: a */
        public long mo2693a() {
            return this.f5661f;
        }

        /* renamed from: c */
        public C2111z mo2694c() {
            return this.f5660e;
        }

        /* renamed from: g */
        public C1114h mo2695g() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public C1921q(C1953z zVar, Object[] objArr, C2068f.C2069a aVar, C1896f<C2079i0, T> fVar) {
        this.f5646e = zVar;
        this.f5647f = objArr;
        this.f5648g = aVar;
        this.f5649h = fVar;
    }

    /* renamed from: a */
    public synchronized C2063d0 mo5978a() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return mo6435d().mo25a();
    }

    /* renamed from: b */
    public final C2068f mo6433b() {
        C2106x xVar;
        C2068f.C2069a aVar = this.f5648g;
        C1953z zVar = this.f5646e;
        Object[] objArr = this.f5647f;
        C1930u[] uVarArr = zVar.f5733j;
        int length = objArr.length;
        if (length == uVarArr.length) {
            C1949w wVar = new C1949w(zVar.f5726c, zVar.f5725b, zVar.f5727d, zVar.f5728e, zVar.f5729f, zVar.f5730g, zVar.f5731h, zVar.f5732i);
            if (zVar.f5734k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                uVarArr[i].mo6440a(wVar, objArr[i]);
            }
            C2106x.C2107a aVar2 = wVar.f5714d;
            if (aVar2 != null) {
                xVar = aVar2.mo6638a();
            } else {
                C2106x xVar2 = wVar.f5712b;
                String str = wVar.f5713c;
                Objects.requireNonNull(xVar2);
                C1241e.m3517j(str, "link");
                C2106x.C2107a f = xVar2.mo6633f(str);
                xVar = f != null ? f.mo6638a() : null;
                if (xVar == null) {
                    StringBuilder a = C0001b.m0a("Malformed URL. Base: ");
                    a.append(wVar.f5712b);
                    a.append(", Relative: ");
                    a.append(wVar.f5713c);
                    throw new IllegalArgumentException(a.toString());
                }
            }
            C1949w.C1950a aVar3 = wVar.f5721k;
            if (aVar3 == null) {
                C2098t.C2099a aVar4 = wVar.f5720j;
                if (aVar4 != null) {
                    aVar3 = new C2098t(aVar4.f6102a, aVar4.f6103b);
                } else {
                    C2053a0.C2054a aVar5 = wVar.f5719i;
                    if (aVar5 != null) {
                        if (!aVar5.f5911c.isEmpty()) {
                            aVar3 = new C2053a0(aVar5.f5909a, aVar5.f5910b, C2129c.m5533u(aVar5.f5911c));
                        } else {
                            throw new IllegalStateException("Multipart body must have at least one part.".toString());
                        }
                    } else if (wVar.f5718h) {
                        byte[] bArr = new byte[0];
                        C1241e.m3517j(bArr, "content");
                        C1241e.m3517j(bArr, "$this$toRequestBody");
                        long j = (long) 0;
                        C2129c.m5514b(j, j, j);
                        aVar3 = new C2067e0(bArr, (C2111z) null, 0, 0);
                    }
                }
            }
            C2111z zVar2 = wVar.f5717g;
            if (zVar2 != null) {
                if (aVar3 != null) {
                    aVar3 = new C1949w.C1950a(aVar3, zVar2);
                } else {
                    wVar.f5716f.mo6620a("Content-Type", zVar2.f6137a);
                }
            }
            C2063d0.C2064a aVar6 = wVar.f5715e;
            aVar6.mo6549e(xVar);
            C2103w c = wVar.f5716f.mo6622c();
            C1241e.m3517j(c, "headers");
            aVar6.f5980c = c.mo6613d();
            aVar6.mo6547c(wVar.f5711a, aVar3);
            aVar6.mo6548d(C1913k.class, new C1913k(zVar.f5724a, arrayList));
            C2068f b = aVar.mo6538b(aVar6.mo6545a());
            Objects.requireNonNull(b, "Call.Factory returned null.");
            return b;
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + uVarArr.length + ")");
    }

    /* renamed from: c */
    public boolean mo5979c() {
        boolean z = true;
        if (this.f5650i) {
            return true;
        }
        synchronized (this) {
            C2068f fVar = this.f5651j;
            if (fVar == null || !fVar.mo26c()) {
                z = false;
            }
        }
        return z;
    }

    public void cancel() {
        C2068f fVar;
        this.f5650i = true;
        synchronized (this) {
            fVar = this.f5651j;
        }
        if (fVar != null) {
            fVar.cancel();
        }
    }

    public Object clone() {
        return new C1921q(this.f5646e, this.f5647f, this.f5648g, this.f5649h);
    }

    @GuardedBy("this")
    /* renamed from: d */
    public final C2068f mo6435d() {
        C2068f fVar = this.f5651j;
        if (fVar != null) {
            return fVar;
        }
        Throwable th = this.f5652k;
        if (th == null) {
            try {
                C2068f b = mo6433b();
                this.f5651j = b;
                return b;
            } catch (IOException | Error | RuntimeException e) {
                C1903g0.m5195o(e);
                this.f5652k = e;
                throw e;
            }
        } else if (th instanceof IOException) {
            throw ((IOException) th);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else {
            throw ((Error) th);
        }
    }

    /* renamed from: e */
    public C1881a0<T> mo6436e(C2072g0 g0Var) {
        C2072g0 g0Var2 = g0Var;
        C2079i0 i0Var = g0Var2.f6007k;
        C1241e.m3517j(g0Var2, "response");
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
        long j3 = j2;
        long j4 = j;
        C1925c cVar2 = new C1925c(i0Var.mo2694c(), i0Var.mo2693a());
        if (!(i >= 0)) {
            throw new IllegalStateException(C0131a0.m344a("code < 0: ", i).toString());
        } else if (d0Var == null) {
            throw new IllegalStateException("request == null".toString());
        } else if (c0Var == null) {
            throw new IllegalStateException("protocol == null".toString());
        } else if (str != null) {
            C2072g0 g0Var6 = new C2072g0(d0Var, c0Var, str, i, vVar, d.mo6622c(), cVar2, g0Var3, g0Var4, g0Var5, j4, j3, cVar);
            int i2 = g0Var6.f6004h;
            if (i2 < 200 || i2 >= 300) {
                try {
                    C2079i0 a = C1903g0.m5181a(i0Var);
                    if (!g0Var6.mo6553c()) {
                        return new C1881a0<>(g0Var6, null, a);
                    }
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                } finally {
                    i0Var.close();
                }
            } else if (i2 == 204 || i2 == 205) {
                i0Var.close();
                return C1881a0.m5142c(null, g0Var6);
            } else {
                C1923b bVar = new C1923b(i0Var);
                try {
                    return C1881a0.m5142c(this.f5649h.mo6398a(bVar), g0Var6);
                } catch (RuntimeException e) {
                    IOException iOException = bVar.f5658g;
                    if (iOException == null) {
                        throw e;
                    }
                    throw iOException;
                }
            }
        } else {
            throw new IllegalStateException("message == null".toString());
        }
    }

    /* renamed from: h */
    public C1882b mo5982h() {
        return new C1921q(this.f5646e, this.f5647f, this.f5648g, this.f5649h);
    }

    /* renamed from: i */
    public void mo5983i(C1887d<T> dVar) {
        C2068f fVar;
        Throwable th;
        synchronized (this) {
            if (!this.f5653l) {
                this.f5653l = true;
                fVar = this.f5651j;
                th = this.f5652k;
                if (fVar == null && th == null) {
                    try {
                        C2068f b = mo6433b();
                        this.f5651j = b;
                        fVar = b;
                    } catch (Throwable th2) {
                        th = th2;
                        C1903g0.m5195o(th);
                        this.f5652k = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            dVar.mo5961a(this, th);
            return;
        }
        if (this.f5650i) {
            fVar.cancel();
        }
        fVar.mo32g(new C1922a(dVar));
    }
}
