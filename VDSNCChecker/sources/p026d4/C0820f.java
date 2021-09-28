package p026d4;

import com.dynamsoft.dbr.EnumBarcodeFormat;
import com.dynamsoft.dbr.EnumBarcodeFormat_2;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p000a.C0001b;
import p019c3.C0625a;
import p026d4.C0838n;
import p026d4.C0841o;
import p032e4.C0879e;
import p062j4.C1112f;
import p062j4.C1113g;
import p062j4.C1114h;
import p062j4.C1115i;
import p063k.C1142f;
import p072l2.C1241e;
import p099q.C1589b;
import p120t2.C1798k;
import p144x3.C2129c;
import p154z3.C2205a;
import p154z3.C2207c;
import p154z3.C2208d;

/* renamed from: d4.f */
public final class C0820f implements Closeable {

    /* renamed from: G */
    public static final C0850t f3164G;

    /* renamed from: H */
    public static final C0820f f3165H = null;

    /* renamed from: A */
    public long f3166A;

    /* renamed from: B */
    public long f3167B;

    /* renamed from: C */
    public final Socket f3168C;

    /* renamed from: D */
    public final C0845p f3169D;

    /* renamed from: E */
    public final C0825d f3170E;

    /* renamed from: F */
    public final Set<Integer> f3171F;

    /* renamed from: e */
    public final boolean f3172e;

    /* renamed from: f */
    public final C0823c f3173f;

    /* renamed from: g */
    public final Map<Integer, C0841o> f3174g = new LinkedHashMap();

    /* renamed from: h */
    public final String f3175h;

    /* renamed from: i */
    public int f3176i;

    /* renamed from: j */
    public int f3177j;

    /* renamed from: k */
    public boolean f3178k;

    /* renamed from: l */
    public final C2208d f3179l;

    /* renamed from: m */
    public final C2207c f3180m;

    /* renamed from: n */
    public final C2207c f3181n;

    /* renamed from: o */
    public final C2207c f3182o;

    /* renamed from: p */
    public final C0849s f3183p;

    /* renamed from: q */
    public long f3184q;

    /* renamed from: r */
    public long f3185r;

    /* renamed from: s */
    public long f3186s;

    /* renamed from: t */
    public long f3187t;

    /* renamed from: u */
    public long f3188u;

    /* renamed from: v */
    public long f3189v;

    /* renamed from: w */
    public final C0850t f3190w;

    /* renamed from: x */
    public C0850t f3191x;

    /* renamed from: y */
    public long f3192y;

    /* renamed from: z */
    public long f3193z;

    /* renamed from: d4.f$a */
    public static final class C0821a extends C2205a {

        /* renamed from: e */
        public final /* synthetic */ C0820f f3194e;

        /* renamed from: f */
        public final /* synthetic */ long f3195f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0821a(String str, String str2, C0820f fVar, long j) {
            super(str2, true);
            this.f3194e = fVar;
            this.f3195f = j;
        }

        /* renamed from: a */
        public long mo57a() {
            C0820f fVar;
            boolean z;
            synchronized (this.f3194e) {
                fVar = this.f3194e;
                long j = fVar.f3185r;
                long j2 = fVar.f3184q;
                if (j < j2) {
                    z = true;
                } else {
                    fVar.f3184q = j2 + 1;
                    z = false;
                }
            }
            if (z) {
                C0814b bVar = C0814b.PROTOCOL_ERROR;
                fVar.mo4071a(bVar, bVar, (IOException) null);
                return -1;
            }
            fVar.mo4079n(false, 1, 0);
            return this.f3195f;
        }
    }

    /* renamed from: d4.f$b */
    public static final class C0822b {

        /* renamed from: a */
        public Socket f3196a;

        /* renamed from: b */
        public String f3197b;

        /* renamed from: c */
        public C1114h f3198c;

        /* renamed from: d */
        public C1113g f3199d;

        /* renamed from: e */
        public C0823c f3200e = C0823c.f3205a;

        /* renamed from: f */
        public C0849s f3201f = C0849s.f3299a;

        /* renamed from: g */
        public int f3202g;

        /* renamed from: h */
        public boolean f3203h;

        /* renamed from: i */
        public final C2208d f3204i;

        public C0822b(boolean z, C2208d dVar) {
            C1241e.m3517j(dVar, "taskRunner");
            this.f3203h = z;
            this.f3204i = dVar;
        }
    }

    /* renamed from: d4.f$c */
    public static abstract class C0823c {

        /* renamed from: a */
        public static final C0823c f3205a = new C0824a();

        /* renamed from: d4.f$c$a */
        public static final class C0824a extends C0823c {
            /* renamed from: b */
            public void mo42b(C0841o oVar) {
                C1241e.m3517j(oVar, "stream");
                oVar.mo4099c(C0814b.REFUSED_STREAM, (IOException) null);
            }
        }

        /* renamed from: a */
        public void mo41a(C0820f fVar, C0850t tVar) {
            C1241e.m3517j(fVar, "connection");
            C1241e.m3517j(tVar, "settings");
        }

        /* renamed from: b */
        public abstract void mo42b(C0841o oVar);
    }

    /* renamed from: d4.f$d */
    public final class C0825d implements C0838n.C0840b, C0625a<C1798k> {

        /* renamed from: e */
        public final C0838n f3206e;

        /* renamed from: d4.f$d$a */
        public static final class C0826a extends C2205a {

            /* renamed from: e */
            public final /* synthetic */ C0841o f3208e;

            /* renamed from: f */
            public final /* synthetic */ C0825d f3209f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0826a(String str, boolean z, String str2, boolean z2, C0841o oVar, C0825d dVar, C0841o oVar2, int i, List list, boolean z3) {
                super(str2, z2);
                this.f3208e = oVar;
                this.f3209f = dVar;
            }

            /* renamed from: a */
            public long mo57a() {
                try {
                    C0820f.this.f3173f.mo42b(this.f3208e);
                    return -1;
                } catch (IOException e) {
                    C0879e.C0880a aVar = C0879e.f3347c;
                    C0879e eVar = C0879e.f3345a;
                    StringBuilder a = C0001b.m0a("Http2Connection.Listener failure for ");
                    a.append(C0820f.this.f3175h);
                    eVar.mo4181i(a.toString(), 4, e);
                    try {
                        this.f3208e.mo4099c(C0814b.PROTOCOL_ERROR, e);
                        return -1;
                    } catch (IOException unused) {
                        return -1;
                    }
                }
            }
        }

        /* renamed from: d4.f$d$b */
        public static final class C0827b extends C2205a {

            /* renamed from: e */
            public final /* synthetic */ C0825d f3210e;

            /* renamed from: f */
            public final /* synthetic */ int f3211f;

            /* renamed from: g */
            public final /* synthetic */ int f3212g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0827b(String str, boolean z, String str2, boolean z2, C0825d dVar, int i, int i2) {
                super(str2, z2);
                this.f3210e = dVar;
                this.f3211f = i;
                this.f3212g = i2;
            }

            /* renamed from: a */
            public long mo57a() {
                C0820f.this.mo4079n(true, this.f3211f, this.f3212g);
                return -1;
            }
        }

        /* renamed from: d4.f$d$c */
        public static final class C0828c extends C2205a {

            /* renamed from: e */
            public final /* synthetic */ C0825d f3213e;

            /* renamed from: f */
            public final /* synthetic */ boolean f3214f;

            /* renamed from: g */
            public final /* synthetic */ C0850t f3215g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0828c(String str, boolean z, String str2, boolean z2, C0825d dVar, boolean z3, C0850t tVar) {
                super(str2, z2);
                this.f3213e = dVar;
                this.f3214f = z3;
                this.f3215g = tVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:35:0x00e5  */
            /* JADX WARNING: Removed duplicated region for block: B:60:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public long mo57a() {
                /*
                    r21 = this;
                    r1 = r21
                    d4.f$d r13 = r1.f3213e
                    boolean r9 = r1.f3214f
                    d4.t r10 = r1.f3215g
                    java.util.Objects.requireNonNull(r13)
                    java.lang.String r0 = "settings"
                    p072l2.C1241e.m3517j(r10, r0)
                    d3.l r14 = new d3.l
                    r14.<init>()
                    d3.m r15 = new d3.m
                    r15.<init>()
                    d3.m r0 = new d3.m
                    r0.<init>()
                    d4.f r2 = p026d4.C0820f.this
                    d4.p r12 = r2.f3169D
                    monitor-enter(r12)
                    d4.f r11 = p026d4.C0820f.this     // Catch:{ all -> 0x0113 }
                    monitor-enter(r11)     // Catch:{ all -> 0x0113 }
                    d4.f r2 = p026d4.C0820f.this     // Catch:{ all -> 0x010a }
                    d4.t r2 = r2.f3191x     // Catch:{ all -> 0x010a }
                    if (r9 == 0) goto L_0x002f
                    r3 = r10
                    goto L_0x003a
                L_0x002f:
                    d4.t r3 = new d4.t     // Catch:{ all -> 0x010a }
                    r3.<init>()     // Catch:{ all -> 0x010a }
                    r3.mo4130b(r2)     // Catch:{ all -> 0x010a }
                    r3.mo4130b(r10)     // Catch:{ all -> 0x010a }
                L_0x003a:
                    r0.f3119e = r3     // Catch:{ all -> 0x010a }
                    int r3 = r3.mo4129a()     // Catch:{ all -> 0x010a }
                    long r3 = (long) r3     // Catch:{ all -> 0x010a }
                    int r2 = r2.mo4129a()     // Catch:{ all -> 0x010a }
                    long r5 = (long) r2     // Catch:{ all -> 0x010a }
                    long r3 = r3 - r5
                    r14.f3118e = r3     // Catch:{ all -> 0x010a }
                    r7 = 0
                    int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                    r6 = 0
                    if (r2 == 0) goto L_0x0076
                    d4.f r2 = p026d4.C0820f.this     // Catch:{ all -> 0x010a }
                    java.util.Map<java.lang.Integer, d4.o> r2 = r2.f3174g     // Catch:{ all -> 0x010a }
                    boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x010a }
                    if (r2 == 0) goto L_0x005b
                    goto L_0x0076
                L_0x005b:
                    d4.f r2 = p026d4.C0820f.this     // Catch:{ all -> 0x010a }
                    java.util.Map<java.lang.Integer, d4.o> r2 = r2.f3174g     // Catch:{ all -> 0x010a }
                    java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x010a }
                    d4.o[] r3 = new p026d4.C0841o[r6]     // Catch:{ all -> 0x010a }
                    java.lang.Object[] r2 = r2.toArray(r3)     // Catch:{ all -> 0x010a }
                    if (r2 == 0) goto L_0x006e
                    d4.o[] r2 = (p026d4.C0841o[]) r2     // Catch:{ all -> 0x010a }
                    goto L_0x0077
                L_0x006e:
                    java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x010a }
                    java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T>"
                    r0.<init>(r2)     // Catch:{ all -> 0x010a }
                    throw r0     // Catch:{ all -> 0x010a }
                L_0x0076:
                    r2 = 0
                L_0x0077:
                    r15.f3119e = r2     // Catch:{ all -> 0x010a }
                    d4.f r2 = p026d4.C0820f.this     // Catch:{ all -> 0x010a }
                    T r3 = r0.f3119e     // Catch:{ all -> 0x010a }
                    d4.t r3 = (p026d4.C0850t) r3     // Catch:{ all -> 0x010a }
                    java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x010a }
                    java.lang.String r4 = "<set-?>"
                    p072l2.C1241e.m3517j(r3, r4)     // Catch:{ all -> 0x010a }
                    r2.f3191x = r3     // Catch:{ all -> 0x010a }
                    d4.f r2 = p026d4.C0820f.this     // Catch:{ all -> 0x010a }
                    z3.c r5 = r2.f3182o     // Catch:{ all -> 0x010a }
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x010a }
                    r2.<init>()     // Catch:{ all -> 0x010a }
                    d4.f r3 = p026d4.C0820f.this     // Catch:{ all -> 0x010a }
                    java.lang.String r3 = r3.f3175h     // Catch:{ all -> 0x010a }
                    r2.append(r3)     // Catch:{ all -> 0x010a }
                    java.lang.String r3 = " onSettings"
                    r2.append(r3)     // Catch:{ all -> 0x010a }
                    java.lang.String r16 = r2.toString()     // Catch:{ all -> 0x010a }
                    r17 = 1
                    d4.g r4 = new d4.g     // Catch:{ all -> 0x010a }
                    r2 = r4
                    r3 = r16
                    r18 = r4
                    r4 = r17
                    r19 = r5
                    r5 = r16
                    r16 = r6
                    r6 = r17
                    r7 = r13
                    r8 = r0
                    r17 = r11
                    r11 = r14
                    r20 = r12
                    r12 = r15
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0108 }
                    r3 = r18
                    r2 = r19
                    r4 = 0
                    r2.mo6767c(r3, r4)     // Catch:{ all -> 0x0108 }
                    monitor-exit(r17)     // Catch:{ all -> 0x0111 }
                    d4.f r2 = p026d4.C0820f.this     // Catch:{ IOException -> 0x00d6 }
                    d4.p r2 = r2.f3169D     // Catch:{ IOException -> 0x00d6 }
                    T r0 = r0.f3119e     // Catch:{ IOException -> 0x00d6 }
                    d4.t r0 = (p026d4.C0850t) r0     // Catch:{ IOException -> 0x00d6 }
                    r2.mo4113a(r0)     // Catch:{ IOException -> 0x00d6 }
                    goto L_0x00de
                L_0x00d6:
                    r0 = move-exception
                    d4.f r2 = p026d4.C0820f.this     // Catch:{ all -> 0x0111 }
                    d4.b r3 = p026d4.C0814b.PROTOCOL_ERROR     // Catch:{ all -> 0x0111 }
                    r2.mo4071a(r3, r3, r0)     // Catch:{ all -> 0x0111 }
                L_0x00de:
                    monitor-exit(r20)
                    T r0 = r15.f3119e
                    d4.o[] r0 = (p026d4.C0841o[]) r0
                    if (r0 == 0) goto L_0x0105
                    p072l2.C1241e.m3515e(r0)
                    int r2 = r0.length
                    r6 = r16
                L_0x00eb:
                    if (r6 >= r2) goto L_0x0105
                    r3 = r0[r6]
                    monitor-enter(r3)
                    long r7 = r14.f3118e     // Catch:{ all -> 0x0102 }
                    long r9 = r3.f3263d     // Catch:{ all -> 0x0102 }
                    long r9 = r9 + r7
                    r3.f3263d = r9     // Catch:{ all -> 0x0102 }
                    int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                    if (r7 <= 0) goto L_0x00fe
                    r3.notifyAll()     // Catch:{ all -> 0x0102 }
                L_0x00fe:
                    monitor-exit(r3)
                    int r6 = r6 + 1
                    goto L_0x00eb
                L_0x0102:
                    r0 = move-exception
                    monitor-exit(r3)
                    throw r0
                L_0x0105:
                    r2 = -1
                    return r2
                L_0x0108:
                    r0 = move-exception
                    goto L_0x010f
                L_0x010a:
                    r0 = move-exception
                    r17 = r11
                    r20 = r12
                L_0x010f:
                    monitor-exit(r17)     // Catch:{ all -> 0x0111 }
                    throw r0     // Catch:{ all -> 0x0111 }
                L_0x0111:
                    r0 = move-exception
                    goto L_0x0116
                L_0x0113:
                    r0 = move-exception
                    r20 = r12
                L_0x0116:
                    monitor-exit(r20)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p026d4.C0820f.C0825d.C0828c.mo57a():long");
            }
        }

        public C0825d(C0838n nVar) {
            this.f3206e = nVar;
        }

        /* renamed from: a */
        public void mo4082a(boolean z, int i, int i2, List<C0815c> list) {
            int i3 = i;
            if (C0820f.this.mo4074g(i3)) {
                C0820f fVar = C0820f.this;
                Objects.requireNonNull(fVar);
                String str = fVar.f3175h + '[' + i3 + "] onHeaders";
                fVar.f3181n.mo6767c(new C0833i(str, true, str, true, fVar, i, list, z), 0);
                return;
            }
            synchronized (C0820f.this) {
                C0841o c = C0820f.this.mo4072c(i3);
                if (c == null) {
                    C0820f fVar2 = C0820f.this;
                    if (!fVar2.f3178k) {
                        if (i3 > fVar2.f3176i) {
                            if (i3 % 2 != fVar2.f3177j % 2) {
                                C0841o oVar = new C0841o(i, C0820f.this, false, z, C2129c.m5531s(list));
                                C0820f fVar3 = C0820f.this;
                                fVar3.f3176i = i3;
                                fVar3.f3174g.put(Integer.valueOf(i), oVar);
                                C2207c f = C0820f.this.f3179l.mo6775f();
                                String str2 = C0820f.this.f3175h + '[' + i3 + "] onStream";
                                C0826a aVar = r1;
                                C0826a aVar2 = new C0826a(str2, true, str2, true, oVar, this, c, i, list, z);
                                f.mo6767c(aVar, 0);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                c.mo4106j(C2129c.m5531s(list), z);
            }
        }

        /* renamed from: b */
        public Object mo40b() {
            C0814b bVar;
            C0814b bVar2 = C0814b.INTERNAL_ERROR;
            e = null;
            try {
                this.f3206e.mo4094g(this);
                while (this.f3206e.mo4092c(false, this)) {
                }
                bVar = C0814b.NO_ERROR;
                try {
                    C0820f.this.mo4071a(bVar, C0814b.CANCEL, (IOException) null);
                } catch (IOException e) {
                    e = e;
                    try {
                        C0814b bVar3 = C0814b.PROTOCOL_ERROR;
                        C0820f.this.mo4071a(bVar3, bVar3, e);
                        C2129c.m5515c(this.f3206e);
                        return C1798k.f5446a;
                    } catch (Throwable th) {
                        th = th;
                        C0820f.this.mo4071a(bVar, bVar2, e);
                        C2129c.m5515c(this.f3206e);
                        throw th;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                bVar = bVar2;
                C0814b bVar32 = C0814b.PROTOCOL_ERROR;
                C0820f.this.mo4071a(bVar32, bVar32, e);
                C2129c.m5515c(this.f3206e);
                return C1798k.f5446a;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                C0820f.this.mo4071a(bVar, bVar2, e);
                C2129c.m5515c(this.f3206e);
                throw th;
            }
            C2129c.m5515c(this.f3206e);
            return C1798k.f5446a;
        }

        /* renamed from: c */
        public void mo4083c() {
        }

        /* renamed from: d */
        public void mo4084d(int i, C0814b bVar) {
            if (C0820f.this.mo4074g(i)) {
                C0820f fVar = C0820f.this;
                Objects.requireNonNull(fVar);
                String str = fVar.f3175h + '[' + i + "] onReset";
                fVar.f3181n.mo6767c(new C0835k(str, true, str, true, fVar, i, bVar), 0);
                return;
            }
            C0841o h = C0820f.this.mo4075h(i);
            if (h != null) {
                h.mo4107k(bVar);
            }
        }

        /* renamed from: e */
        public void mo4085e(boolean z, C0850t tVar) {
            C2207c cVar = C0820f.this.f3180m;
            String a = C1589b.m4444a(new StringBuilder(), C0820f.this.f3175h, " applyAndAckSettings");
            cVar.mo6767c(new C0828c(a, true, a, true, this, z, tVar), 0);
        }

        /* renamed from: g */
        public void mo4086g(int i, long j) {
            Object obj;
            if (i == 0) {
                Object obj2 = C0820f.this;
                synchronized (obj2) {
                    C0820f fVar = C0820f.this;
                    fVar.f3167B += j;
                    fVar.notifyAll();
                    obj = obj2;
                }
            } else {
                C0841o c = C0820f.this.mo4072c(i);
                if (c != null) {
                    synchronized (c) {
                        c.f3263d += j;
                        obj = c;
                        if (j > 0) {
                            c.notifyAll();
                            obj = c;
                        }
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: h */
        public void mo4087h(int i, int i2, List<C0815c> list) {
            C0820f fVar = C0820f.this;
            Objects.requireNonNull(fVar);
            synchronized (fVar) {
                if (fVar.f3171F.contains(Integer.valueOf(i2))) {
                    fVar.mo4080u(i2, C0814b.PROTOCOL_ERROR);
                    return;
                }
                fVar.f3171F.add(Integer.valueOf(i2));
                String str = fVar.f3175h + '[' + i2 + "] onRequest";
                fVar.f3181n.mo6767c(new C0834j(str, true, str, true, fVar, i2, list), 0);
            }
        }

        /* renamed from: i */
        public void mo4088i(boolean z, int i, int i2) {
            if (z) {
                synchronized (C0820f.this) {
                    if (i == 1) {
                        C0820f.this.f3185r++;
                    } else if (i == 2) {
                        C0820f.this.f3187t++;
                    } else if (i == 3) {
                        C0820f fVar = C0820f.this;
                        fVar.f3188u++;
                        fVar.notifyAll();
                    }
                }
                return;
            }
            C2207c cVar = C0820f.this.f3180m;
            String a = C1589b.m4444a(new StringBuilder(), C0820f.this.f3175h, " ping");
            cVar.mo6767c(new C0827b(a, true, a, true, this, i, i2), 0);
        }

        /* renamed from: j */
        public void mo4089j(int i, int i2, int i3, boolean z) {
        }

        /* renamed from: l */
        public void mo4090l(boolean z, int i, C1114h hVar, int i2) {
            boolean z2;
            boolean z3;
            long j;
            int i3 = i;
            C1114h hVar2 = hVar;
            int i4 = i2;
            C1241e.m3517j(hVar2, "source");
            if (C0820f.this.mo4074g(i3)) {
                C0820f fVar = C0820f.this;
                Objects.requireNonNull(fVar);
                C1112f fVar2 = new C1112f();
                long j2 = (long) i4;
                hVar2.mo4615E(j2);
                hVar2.mo21o(fVar2, j2);
                String str = fVar.f3175h + '[' + i3 + "] onData";
                fVar.f3181n.mo6767c(new C0832h(str, true, str, true, fVar, i, fVar2, i2, z), 0);
                return;
            }
            C0841o c = C0820f.this.mo4072c(i3);
            if (c == null) {
                C0820f.this.mo4080u(i3, C0814b.PROTOCOL_ERROR);
                long j3 = (long) i4;
                C0820f.this.mo4077k(j3);
                hVar2.mo4654q(j3);
                return;
            }
            byte[] bArr = C2129c.f6169a;
            C0841o.C0843b bVar = c.f3266g;
            long j4 = (long) i4;
            Objects.requireNonNull(bVar);
            while (true) {
                boolean z4 = true;
                if (j4 <= 0) {
                    break;
                }
                synchronized (C0841o.this) {
                    z2 = bVar.f3282i;
                    z3 = bVar.f3279f.f3888f + j4 > bVar.f3281h;
                }
                if (z3) {
                    hVar2.mo4654q(j4);
                    C0841o.this.mo4101e(C0814b.FLOW_CONTROL_ERROR);
                    break;
                } else if (z2) {
                    hVar2.mo4654q(j4);
                    break;
                } else {
                    long o = hVar2.mo21o(bVar.f3278e, j4);
                    if (o != -1) {
                        j4 -= o;
                        synchronized (C0841o.this) {
                            if (bVar.f3280g) {
                                C1112f fVar3 = bVar.f3278e;
                                j = fVar3.f3888f;
                                fVar3.mo4654q(j);
                            } else {
                                C1112f fVar4 = bVar.f3279f;
                                if (fVar4.f3888f != 0) {
                                    z4 = false;
                                }
                                fVar4.mo4632W(bVar.f3278e);
                                if (z4) {
                                    C0841o oVar = C0841o.this;
                                    if (oVar != null) {
                                        oVar.notifyAll();
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                    }
                                }
                                j = 0;
                            }
                        }
                        if (j > 0) {
                            bVar.mo4110a(j);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (z) {
                c.mo4106j(C2129c.f6170b, true);
            }
        }

        /* renamed from: n */
        public void mo4091n(int i, C0814b bVar, C1115i iVar) {
            int i2;
            C0841o[] oVarArr;
            C1241e.m3517j(iVar, "debugData");
            iVar.mo4669c();
            synchronized (C0820f.this) {
                Object[] array = C0820f.this.f3174g.values().toArray(new C0841o[0]);
                if (array != null) {
                    oVarArr = (C0841o[]) array;
                    C0820f.this.f3178k = true;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            for (C0841o oVar : oVarArr) {
                if (oVar.f3272m > i && oVar.mo4104h()) {
                    oVar.mo4107k(C0814b.REFUSED_STREAM);
                    C0820f.this.mo4075h(oVar.f3272m);
                }
            }
        }
    }

    /* renamed from: d4.f$e */
    public static final class C0829e extends C2205a {

        /* renamed from: e */
        public final /* synthetic */ C0820f f3216e;

        /* renamed from: f */
        public final /* synthetic */ int f3217f;

        /* renamed from: g */
        public final /* synthetic */ C0814b f3218g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0829e(String str, boolean z, String str2, boolean z2, C0820f fVar, int i, C0814b bVar) {
            super(str2, z2);
            this.f3216e = fVar;
            this.f3217f = i;
            this.f3218g = bVar;
        }

        /* renamed from: a */
        public long mo57a() {
            try {
                C0820f fVar = this.f3216e;
                int i = this.f3217f;
                C0814b bVar = this.f3218g;
                Objects.requireNonNull(fVar);
                C1241e.m3517j(bVar, "statusCode");
                fVar.f3169D.mo4121l(i, bVar);
                return -1;
            } catch (IOException e) {
                C0820f fVar2 = this.f3216e;
                C0814b bVar2 = C0814b.PROTOCOL_ERROR;
                fVar2.mo4071a(bVar2, bVar2, e);
                return -1;
            }
        }
    }

    /* renamed from: d4.f$f */
    public static final class C0830f extends C2205a {

        /* renamed from: e */
        public final /* synthetic */ C0820f f3219e;

        /* renamed from: f */
        public final /* synthetic */ int f3220f;

        /* renamed from: g */
        public final /* synthetic */ long f3221g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0830f(String str, boolean z, String str2, boolean z2, C0820f fVar, int i, long j) {
            super(str2, z2);
            this.f3219e = fVar;
            this.f3220f = i;
            this.f3221g = j;
        }

        /* renamed from: a */
        public long mo57a() {
            try {
                this.f3219e.f3169D.mo4122n(this.f3220f, this.f3221g);
                return -1;
            } catch (IOException e) {
                C0820f fVar = this.f3219e;
                C0814b bVar = C0814b.PROTOCOL_ERROR;
                fVar.mo4071a(bVar, bVar, e);
                return -1;
            }
        }
    }

    static {
        C0850t tVar = new C0850t();
        tVar.mo4131c(7, 65535);
        tVar.mo4131c(5, EnumBarcodeFormat.BF_GS1_DATABAR_STACKED_OMNIDIRECTIONAL);
        f3164G = tVar;
    }

    public C0820f(C0822b bVar) {
        boolean z = bVar.f3203h;
        this.f3172e = z;
        this.f3173f = bVar.f3200e;
        String str = bVar.f3197b;
        if (str != null) {
            this.f3175h = str;
            this.f3177j = bVar.f3203h ? 3 : 2;
            C2208d dVar = bVar.f3204i;
            this.f3179l = dVar;
            C2207c f = dVar.mo6775f();
            this.f3180m = f;
            this.f3181n = dVar.mo6775f();
            this.f3182o = dVar.mo6775f();
            this.f3183p = bVar.f3201f;
            C0850t tVar = new C0850t();
            if (bVar.f3203h) {
                tVar.mo4131c(7, EnumBarcodeFormat_2.BF2_RM4SCC);
            }
            this.f3190w = tVar;
            C0850t tVar2 = f3164G;
            this.f3191x = tVar2;
            this.f3167B = (long) tVar2.mo4129a();
            Socket socket = bVar.f3196a;
            if (socket != null) {
                this.f3168C = socket;
                C1113g gVar = bVar.f3199d;
                if (gVar != null) {
                    this.f3169D = new C0845p(gVar, z);
                    C1114h hVar = bVar.f3198c;
                    if (hVar != null) {
                        this.f3170E = new C0825d(new C0838n(hVar, z));
                        this.f3171F = new LinkedHashSet();
                        int i = bVar.f3202g;
                        if (i != 0) {
                            long nanos = TimeUnit.MILLISECONDS.toNanos((long) i);
                            String a = C1142f.m3365a(str, " ping");
                            f.mo6767c(new C0821a(a, a, this, nanos), nanos);
                            return;
                        }
                        return;
                    }
                    C1241e.m3524r("source");
                    throw null;
                }
                C1241e.m3524r("sink");
                throw null;
            }
            C1241e.m3524r("socket");
            throw null;
        }
        C1241e.m3524r("connectionName");
        throw null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|(2:1|2)|3|6|(2:16|(5:18|19|20|33|21))|23|24|25|26|27|29) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0043 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4071a(p026d4.C0814b r4, p026d4.C0814b r5, java.io.IOException r6) {
        /*
            r3 = this;
            byte[] r0 = p144x3.C2129c.f6169a
            r3.mo4076i(r4)     // Catch:{ IOException -> 0x0005 }
        L_0x0005:
            r4 = 0
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, d4.o> r0 = r3.f3174g     // Catch:{ all -> 0x0058 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0058 }
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L_0x0030
            java.util.Map<java.lang.Integer, d4.o> r4 = r3.f3174g     // Catch:{ all -> 0x0058 }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x0058 }
            d4.o[] r0 = new p026d4.C0841o[r1]     // Catch:{ all -> 0x0058 }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x0058 }
            if (r4 == 0) goto L_0x0028
            d4.o[] r4 = (p026d4.C0841o[]) r4     // Catch:{ all -> 0x0058 }
            java.util.Map<java.lang.Integer, d4.o> r0 = r3.f3174g     // Catch:{ all -> 0x0058 }
            r0.clear()     // Catch:{ all -> 0x0058 }
            goto L_0x0030
        L_0x0028:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x0058 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r4.<init>(r5)     // Catch:{ all -> 0x0058 }
            throw r4     // Catch:{ all -> 0x0058 }
        L_0x0030:
            monitor-exit(r3)
            if (r4 == 0) goto L_0x003e
            int r0 = r4.length
        L_0x0034:
            if (r1 >= r0) goto L_0x003e
            r2 = r4[r1]
            r2.mo4099c(r5, r6)     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            int r1 = r1 + 1
            goto L_0x0034
        L_0x003e:
            d4.p r4 = r3.f3169D     // Catch:{ IOException -> 0x0043 }
            r4.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            java.net.Socket r4 = r3.f3168C     // Catch:{ IOException -> 0x0048 }
            r4.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            z3.c r4 = r3.f3180m
            r4.mo6769e()
            z3.c r4 = r3.f3181n
            r4.mo6769e()
            z3.c r4 = r3.f3182o
            r4.mo6769e()
            return
        L_0x0058:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p026d4.C0820f.mo4071a(d4.b, d4.b, java.io.IOException):void");
    }

    /* renamed from: c */
    public final synchronized C0841o mo4072c(int i) {
        return this.f3174g.get(Integer.valueOf(i));
    }

    public void close() {
        mo4071a(C0814b.NO_ERROR, C0814b.CANCEL, (IOException) null);
    }

    /* renamed from: g */
    public final boolean mo4074g(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* renamed from: h */
    public final synchronized C0841o mo4075h(int i) {
        C0841o remove;
        remove = this.f3174g.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    /* renamed from: i */
    public final void mo4076i(C0814b bVar) {
        synchronized (this.f3169D) {
            synchronized (this) {
                if (!this.f3178k) {
                    this.f3178k = true;
                    int i = this.f3176i;
                    this.f3169D.mo4118h(i, bVar, C2129c.f6169a);
                }
            }
        }
    }

    /* renamed from: k */
    public final synchronized void mo4077k(long j) {
        long j2 = this.f3192y + j;
        this.f3192y = j2;
        long j3 = j2 - this.f3193z;
        if (j3 >= ((long) (this.f3190w.mo4129a() / 2))) {
            mo4081v(0, j3);
            this.f3193z += j3;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f3169D.f3287f);
        r6 = (long) r2;
        r8.f3166A += r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0059 */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4078l(int r9, boolean r10, p062j4.C1112f r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            d4.p r12 = r8.f3169D
            r12.mo4114c(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0068
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.f3166A     // Catch:{ InterruptedException -> 0x0059 }
            long r6 = r8.f3167B     // Catch:{ InterruptedException -> 0x0059 }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0032
            java.util.Map<java.lang.Integer, d4.o> r2 = r8.f3174g     // Catch:{ InterruptedException -> 0x0059 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0059 }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x0059 }
            if (r2 == 0) goto L_0x002a
            r8.wait()     // Catch:{ InterruptedException -> 0x0059 }
            goto L_0x0012
        L_0x002a:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0059 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0059 }
            throw r9     // Catch:{ InterruptedException -> 0x0059 }
        L_0x0032:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch:{ all -> 0x0057 }
            int r2 = (int) r4     // Catch:{ all -> 0x0057 }
            d4.p r4 = r8.f3169D     // Catch:{ all -> 0x0057 }
            int r4 = r4.f3287f     // Catch:{ all -> 0x0057 }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x0057 }
            long r4 = r8.f3166A     // Catch:{ all -> 0x0057 }
            long r6 = (long) r2     // Catch:{ all -> 0x0057 }
            long r4 = r4 + r6
            r8.f3166A = r4     // Catch:{ all -> 0x0057 }
            monitor-exit(r8)
            long r12 = r12 - r6
            d4.p r4 = r8.f3169D
            if (r10 == 0) goto L_0x0052
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0052
            r5 = 1
            goto L_0x0053
        L_0x0052:
            r5 = r3
        L_0x0053:
            r4.mo4114c(r5, r9, r11, r2)
            goto L_0x000d
        L_0x0057:
            r9 = move-exception
            goto L_0x0066
        L_0x0059:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0057 }
            r9.interrupt()     // Catch:{ all -> 0x0057 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0057 }
            r9.<init>()     // Catch:{ all -> 0x0057 }
            throw r9     // Catch:{ all -> 0x0057 }
        L_0x0066:
            monitor-exit(r8)
            throw r9
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p026d4.C0820f.mo4078l(int, boolean, j4.f, long):void");
    }

    /* renamed from: n */
    public final void mo4079n(boolean z, int i, int i2) {
        try {
            this.f3169D.mo4120k(z, i, i2);
        } catch (IOException e) {
            C0814b bVar = C0814b.PROTOCOL_ERROR;
            mo4071a(bVar, bVar, e);
        }
    }

    /* renamed from: u */
    public final void mo4080u(int i, C0814b bVar) {
        String str = this.f3175h + '[' + i + "] writeSynReset";
        this.f3180m.mo6767c(new C0829e(str, true, str, true, this, i, bVar), 0);
    }

    /* renamed from: v */
    public final void mo4081v(int i, long j) {
        String str = this.f3175h + '[' + i + "] windowUpdate";
        this.f3180m.mo6767c(new C0830f(str, true, str, true, this, i, j), 0);
    }
}
