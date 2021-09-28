package p026d4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000a.C0001b;
import p026d4.C0846q;
import p062j4.C1112f;
import p062j4.C1114h;
import p062j4.C1115i;
import p062j4.C1128t;
import p062j4.C1134z;
import p072l2.C1241e;
import p144x3.C2129c;

/* renamed from: d4.d */
public final class C0816d {

    /* renamed from: a */
    public static final C0815c[] f3139a;

    /* renamed from: b */
    public static final Map<C1115i, Integer> f3140b;

    /* renamed from: c */
    public static final C0816d f3141c = new C0816d();

    /* renamed from: d4.d$a */
    public static final class C0817a {

        /* renamed from: a */
        public final List<C0815c> f3142a;

        /* renamed from: b */
        public final C1114h f3143b;

        /* renamed from: c */
        public C0815c[] f3144c;

        /* renamed from: d */
        public int f3145d;

        /* renamed from: e */
        public int f3146e;

        /* renamed from: f */
        public int f3147f;

        /* renamed from: g */
        public final int f3148g;

        /* renamed from: h */
        public int f3149h;

        public C0817a(C1134z zVar, int i, int i2, int i3) {
            i2 = (i3 & 4) != 0 ? i : i2;
            this.f3148g = i;
            this.f3149h = i2;
            this.f3142a = new ArrayList();
            this.f3143b = new C1128t(zVar);
            this.f3144c = new C0815c[8];
            this.f3145d = 7;
        }

        /* renamed from: a */
        public final void mo4056a() {
            C0815c[] cVarArr = this.f3144c;
            Arrays.fill(cVarArr, 0, cVarArr.length, (Object) null);
            this.f3145d = this.f3144c.length - 1;
            this.f3146e = 0;
            this.f3147f = 0;
        }

        /* renamed from: b */
        public final int mo4057b(int i) {
            return this.f3145d + 1 + i;
        }

        /* renamed from: c */
        public final int mo4058c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f3144c.length;
                while (true) {
                    length--;
                    i2 = this.f3145d;
                    if (length < i2 || i <= 0) {
                        C0815c[] cVarArr = this.f3144c;
                        System.arraycopy(cVarArr, i2 + 1, cVarArr, i2 + 1 + i3, this.f3146e);
                        this.f3145d += i3;
                    } else {
                        C0815c cVar = this.f3144c[length];
                        C1241e.m3515e(cVar);
                        int i4 = cVar.f3136a;
                        i -= i4;
                        this.f3147f -= i4;
                        this.f3146e--;
                        i3++;
                    }
                }
                C0815c[] cVarArr2 = this.f3144c;
                System.arraycopy(cVarArr2, i2 + 1, cVarArr2, i2 + 1 + i3, this.f3146e);
                this.f3145d += i3;
            }
            return i3;
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x0010  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p062j4.C1115i mo4059d(int r5) {
            /*
                r4 = this;
                r0 = 1
                if (r5 < 0) goto L_0x000d
                d4.d r1 = p026d4.C0816d.f3141c
                d4.c[] r1 = p026d4.C0816d.f3139a
                int r1 = r1.length
                int r1 = r1 - r0
                if (r5 > r1) goto L_0x000d
                r1 = r0
                goto L_0x000e
            L_0x000d:
                r1 = 0
            L_0x000e:
                if (r1 == 0) goto L_0x0017
                d4.d r0 = p026d4.C0816d.f3141c
                d4.c[] r0 = p026d4.C0816d.f3139a
                r5 = r0[r5]
                goto L_0x002e
            L_0x0017:
                d4.d r1 = p026d4.C0816d.f3141c
                d4.c[] r1 = p026d4.C0816d.f3139a
                int r1 = r1.length
                int r1 = r5 - r1
                int r1 = r4.mo4057b(r1)
                if (r1 < 0) goto L_0x0031
                d4.c[] r2 = r4.f3144c
                int r3 = r2.length
                if (r1 >= r3) goto L_0x0031
                r5 = r2[r1]
                p072l2.C1241e.m3515e(r5)
            L_0x002e:
                j4.i r5 = r5.f3137b
                return r5
            L_0x0031:
                java.io.IOException r1 = new java.io.IOException
                java.lang.String r2 = "Header index too large "
                java.lang.StringBuilder r2 = p000a.C0001b.m0a(r2)
                int r5 = r5 + r0
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p026d4.C0816d.C0817a.mo4059d(int):j4.i");
        }

        /* renamed from: e */
        public final void mo4060e(int i, C0815c cVar) {
            this.f3142a.add(cVar);
            int i2 = cVar.f3136a;
            if (i != -1) {
                C0815c cVar2 = this.f3144c[this.f3145d + 1 + i];
                C1241e.m3515e(cVar2);
                i2 -= cVar2.f3136a;
            }
            int i3 = this.f3149h;
            if (i2 > i3) {
                mo4056a();
                return;
            }
            int c = mo4058c((this.f3147f + i2) - i3);
            if (i == -1) {
                int i4 = this.f3146e + 1;
                C0815c[] cVarArr = this.f3144c;
                if (i4 > cVarArr.length) {
                    C0815c[] cVarArr2 = new C0815c[(cVarArr.length * 2)];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f3145d = this.f3144c.length - 1;
                    this.f3144c = cVarArr2;
                }
                int i5 = this.f3145d;
                this.f3145d = i5 - 1;
                this.f3144c[i5] = cVar;
                this.f3146e++;
            } else {
                this.f3144c[this.f3145d + 1 + i + c + i] = cVar;
            }
            this.f3147f += i2;
        }

        /* renamed from: f */
        public final C1115i mo4061f() {
            byte P = this.f3143b.mo4625P();
            byte[] bArr = C2129c.f6169a;
            byte b = P & 255;
            byte b2 = 0;
            boolean z = (b & 128) == 128;
            long g = (long) mo4062g(b, 127);
            if (!z) {
                return this.f3143b.mo4651m(g);
            }
            C1112f fVar = new C1112f();
            C0846q qVar = C0846q.f3295d;
            C1114h hVar = this.f3143b;
            C1241e.m3517j(hVar, "source");
            C0846q.C0847a aVar = C0846q.f3294c;
            int i = 0;
            for (long j = 0; j < g; j++) {
                byte P2 = hVar.mo4625P();
                byte[] bArr2 = C2129c.f6169a;
                b2 = (b2 << 8) | (P2 & 255);
                i += 8;
                while (i >= 8) {
                    int i2 = i - 8;
                    C0846q.C0847a[] aVarArr = aVar.f3296a;
                    C1241e.m3515e(aVarArr);
                    aVar = aVarArr[(b2 >>> i2) & 255];
                    C1241e.m3515e(aVar);
                    if (aVar.f3296a == null) {
                        fVar.mo4633X(aVar.f3297b);
                        i -= aVar.f3298c;
                        aVar = C0846q.f3294c;
                    } else {
                        i = i2;
                    }
                }
            }
            while (i > 0) {
                C0846q.C0847a[] aVarArr2 = aVar.f3296a;
                C1241e.m3515e(aVarArr2);
                C0846q.C0847a aVar2 = aVarArr2[(b2 << (8 - i)) & 255];
                C1241e.m3515e(aVar2);
                if (aVar2.f3296a != null || aVar2.f3298c > i) {
                    break;
                }
                fVar.mo4633X(aVar2.f3297b);
                i -= aVar2.f3298c;
                aVar = C0846q.f3294c;
            }
            return fVar.mo4666z();
        }

        /* renamed from: g */
        public final int mo4062g(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                byte P = this.f3143b.mo4625P();
                byte[] bArr = C2129c.f6169a;
                byte b = P & 255;
                if ((b & 128) == 0) {
                    return i2 + (b << i4);
                }
                i2 += (b & Byte.MAX_VALUE) << i4;
                i4 += 7;
            }
        }
    }

    /* renamed from: d4.d$b */
    public static final class C0818b {

        /* renamed from: a */
        public int f3150a;

        /* renamed from: b */
        public boolean f3151b;

        /* renamed from: c */
        public int f3152c;

        /* renamed from: d */
        public C0815c[] f3153d;

        /* renamed from: e */
        public int f3154e;

        /* renamed from: f */
        public int f3155f;

        /* renamed from: g */
        public int f3156g;

        /* renamed from: h */
        public final boolean f3157h;

        /* renamed from: i */
        public final C1112f f3158i;

        public C0818b(int i, boolean z, C1112f fVar, int i2) {
            i = (i2 & 1) != 0 ? 4096 : i;
            this.f3157h = (i2 & 2) != 0 ? true : z;
            this.f3158i = fVar;
            this.f3150a = Integer.MAX_VALUE;
            this.f3152c = i;
            this.f3153d = new C0815c[8];
            this.f3154e = 7;
        }

        /* renamed from: a */
        public final void mo4063a() {
            C0815c[] cVarArr = this.f3153d;
            Arrays.fill(cVarArr, 0, cVarArr.length, (Object) null);
            this.f3154e = this.f3153d.length - 1;
            this.f3155f = 0;
            this.f3156g = 0;
        }

        /* renamed from: b */
        public final int mo4064b(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f3153d.length;
                while (true) {
                    length--;
                    i2 = this.f3154e;
                    if (length < i2 || i <= 0) {
                        C0815c[] cVarArr = this.f3153d;
                        System.arraycopy(cVarArr, i2 + 1, cVarArr, i2 + 1 + i3, this.f3155f);
                        C0815c[] cVarArr2 = this.f3153d;
                        int i4 = this.f3154e;
                        Arrays.fill(cVarArr2, i4 + 1, i4 + 1 + i3, (Object) null);
                        this.f3154e += i3;
                    } else {
                        C0815c cVar = this.f3153d[length];
                        C1241e.m3515e(cVar);
                        i -= cVar.f3136a;
                        int i5 = this.f3156g;
                        C0815c cVar2 = this.f3153d[length];
                        C1241e.m3515e(cVar2);
                        this.f3156g = i5 - cVar2.f3136a;
                        this.f3155f--;
                        i3++;
                    }
                }
                C0815c[] cVarArr3 = this.f3153d;
                System.arraycopy(cVarArr3, i2 + 1, cVarArr3, i2 + 1 + i3, this.f3155f);
                C0815c[] cVarArr22 = this.f3153d;
                int i42 = this.f3154e;
                Arrays.fill(cVarArr22, i42 + 1, i42 + 1 + i3, (Object) null);
                this.f3154e += i3;
            }
            return i3;
        }

        /* renamed from: c */
        public final void mo4065c(C0815c cVar) {
            int i = cVar.f3136a;
            int i2 = this.f3152c;
            if (i > i2) {
                mo4063a();
                return;
            }
            mo4064b((this.f3156g + i) - i2);
            int i3 = this.f3155f + 1;
            C0815c[] cVarArr = this.f3153d;
            if (i3 > cVarArr.length) {
                C0815c[] cVarArr2 = new C0815c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f3154e = this.f3153d.length - 1;
                this.f3153d = cVarArr2;
            }
            int i4 = this.f3154e;
            this.f3154e = i4 - 1;
            this.f3153d[i4] = cVar;
            this.f3155f++;
            this.f3156g += i;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo4066d(p062j4.C1115i r11) {
            /*
                r10 = this;
                java.lang.String r0 = "data"
                p072l2.C1241e.m3517j(r11, r0)
                boolean r0 = r10.f3157h
                r1 = 127(0x7f, float:1.78E-43)
                r2 = 0
                if (r0 == 0) goto L_0x0092
                d4.q r0 = p026d4.C0846q.f3295d
                java.lang.String r0 = "bytes"
                p072l2.C1241e.m3517j(r11, r0)
                int r0 = r11.mo4669c()
                r3 = 0
                r5 = r2
                r6 = r3
            L_0x001b:
                if (r5 >= r0) goto L_0x002e
                byte r8 = r11.mo4674f(r5)
                byte[] r9 = p144x3.C2129c.f6169a
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte[] r9 = p026d4.C0846q.f3293b
                byte r8 = r9[r8]
                long r8 = (long) r8
                long r6 = r6 + r8
                int r5 = r5 + 1
                goto L_0x001b
            L_0x002e:
                r0 = 7
                long r8 = (long) r0
                long r6 = r6 + r8
                r0 = 3
                long r5 = r6 >> r0
                int r0 = (int) r5
                int r5 = r11.mo4669c()
                if (r0 >= r5) goto L_0x0092
                j4.f r0 = new j4.f
                r0.<init>()
                d4.q r5 = p026d4.C0846q.f3295d
                java.lang.String r5 = "source"
                p072l2.C1241e.m3517j(r11, r5)
                java.lang.String r5 = "sink"
                p072l2.C1241e.m3517j(r0, r5)
                int r5 = r11.mo4669c()
                r6 = r3
                r3 = r2
            L_0x0052:
                if (r2 >= r5) goto L_0x0078
                byte r4 = r11.mo4674f(r2)
                byte[] r8 = p144x3.C2129c.f6169a
                r4 = r4 & 255(0xff, float:3.57E-43)
                int[] r8 = p026d4.C0846q.f3292a
                r8 = r8[r4]
                byte[] r9 = p026d4.C0846q.f3293b
                byte r4 = r9[r4]
                long r6 = r6 << r4
                long r8 = (long) r8
                long r6 = r6 | r8
                int r3 = r3 + r4
            L_0x0068:
                r4 = 8
                if (r3 < r4) goto L_0x0075
                int r3 = r3 + -8
                long r8 = r6 >> r3
                int r4 = (int) r8
                r0.mo4622L(r4)
                goto L_0x0068
            L_0x0075:
                int r2 = r2 + 1
                goto L_0x0052
            L_0x0078:
                if (r3 <= 0) goto L_0x0087
                int r11 = 8 - r3
                long r4 = r6 << r11
                r6 = 255(0xff, double:1.26E-321)
                long r2 = r6 >>> r3
                long r2 = r2 | r4
                int r11 = (int) r2
                r0.mo4622L(r11)
            L_0x0087:
                j4.i r11 = r0.mo4666z()
                int r0 = r11.mo4669c()
                r2 = 128(0x80, float:1.794E-43)
                goto L_0x0096
            L_0x0092:
                int r0 = r11.mo4669c()
            L_0x0096:
                r10.mo4068f(r0, r1, r2)
                j4.f r0 = r10.f3158i
                r0.mo4629T(r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p026d4.C0816d.C0818b.mo4066d(j4.i):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00b1  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00b9  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo4067e(java.util.List<p026d4.C0815c> r13) {
            /*
                r12 = this;
                boolean r0 = r12.f3151b
                r1 = 0
                if (r0 == 0) goto L_0x001e
                int r0 = r12.f3150a
                int r2 = r12.f3152c
                r3 = 32
                r4 = 31
                if (r0 >= r2) goto L_0x0012
                r12.mo4068f(r0, r4, r3)
            L_0x0012:
                r12.f3151b = r1
                r0 = 2147483647(0x7fffffff, float:NaN)
                r12.f3150a = r0
                int r0 = r12.f3152c
                r12.mo4068f(r0, r4, r3)
            L_0x001e:
                int r0 = r13.size()
                r2 = r1
            L_0x0023:
                if (r2 >= r0) goto L_0x00fb
                java.lang.Object r3 = r13.get(r2)
                d4.c r3 = (p026d4.C0815c) r3
                j4.i r4 = r3.f3137b
                j4.i r4 = r4.mo4678i()
                j4.i r5 = r3.f3138c
                d4.d r6 = p026d4.C0816d.f3141c
                java.util.Map<j4.i, java.lang.Integer> r6 = p026d4.C0816d.f3140b
                java.lang.Object r6 = r6.get(r4)
                java.lang.Integer r6 = (java.lang.Integer) r6
                r7 = -1
                if (r6 == 0) goto L_0x006b
                int r6 = r6.intValue()
                int r6 = r6 + 1
                r8 = 7
                r9 = 2
                if (r9 <= r6) goto L_0x004b
                goto L_0x0069
            L_0x004b:
                if (r8 < r6) goto L_0x0069
                d4.c[] r8 = p026d4.C0816d.f3139a
                int r9 = r6 + -1
                r9 = r8[r9]
                j4.i r9 = r9.f3138c
                boolean r9 = p072l2.C1241e.m3513b(r9, r5)
                if (r9 == 0) goto L_0x005c
                goto L_0x006c
            L_0x005c:
                r8 = r8[r6]
                j4.i r8 = r8.f3138c
                boolean r8 = p072l2.C1241e.m3513b(r8, r5)
                if (r8 == 0) goto L_0x0069
                int r8 = r6 + 1
                goto L_0x006d
            L_0x0069:
                r8 = r7
                goto L_0x006d
            L_0x006b:
                r6 = r7
            L_0x006c:
                r8 = r6
            L_0x006d:
                if (r8 != r7) goto L_0x00af
                int r9 = r12.f3154e
                int r9 = r9 + 1
                d4.c[] r10 = r12.f3153d
                int r10 = r10.length
            L_0x0076:
                if (r9 >= r10) goto L_0x00af
                d4.c[] r11 = r12.f3153d
                r11 = r11[r9]
                p072l2.C1241e.m3515e(r11)
                j4.i r11 = r11.f3137b
                boolean r11 = p072l2.C1241e.m3513b(r11, r4)
                if (r11 == 0) goto L_0x00ac
                d4.c[] r11 = r12.f3153d
                r11 = r11[r9]
                p072l2.C1241e.m3515e(r11)
                j4.i r11 = r11.f3138c
                boolean r11 = p072l2.C1241e.m3513b(r11, r5)
                if (r11 == 0) goto L_0x00a0
                int r8 = r12.f3154e
                int r9 = r9 - r8
                d4.d r8 = p026d4.C0816d.f3141c
                d4.c[] r8 = p026d4.C0816d.f3139a
                int r8 = r8.length
                int r8 = r8 + r9
                goto L_0x00af
            L_0x00a0:
                if (r6 != r7) goto L_0x00ac
                int r6 = r12.f3154e
                int r6 = r9 - r6
                d4.d r11 = p026d4.C0816d.f3141c
                d4.c[] r11 = p026d4.C0816d.f3139a
                int r11 = r11.length
                int r6 = r6 + r11
            L_0x00ac:
                int r9 = r9 + 1
                goto L_0x0076
            L_0x00af:
                if (r8 == r7) goto L_0x00b9
                r3 = 127(0x7f, float:1.78E-43)
                r4 = 128(0x80, float:1.794E-43)
                r12.mo4068f(r8, r3, r4)
                goto L_0x00f7
            L_0x00b9:
                r8 = 64
                if (r6 != r7) goto L_0x00c6
                j4.f r6 = r12.f3158i
                r6.mo4633X(r8)
                r12.mo4066d(r4)
                goto L_0x00f1
            L_0x00c6:
                j4.i r7 = p026d4.C0815c.f3130d
                java.util.Objects.requireNonNull(r4)
                java.lang.String r9 = "prefix"
                p072l2.C1241e.m3517j(r7, r9)
                byte[] r9 = r7.f3893g
                int r9 = r9.length
                boolean r7 = r4.mo4675g(r1, r7, r1, r9)
                if (r7 == 0) goto L_0x00ec
                j4.i r7 = p026d4.C0815c.f3135i
                boolean r4 = p072l2.C1241e.m3513b(r7, r4)
                r4 = r4 ^ 1
                if (r4 == 0) goto L_0x00ec
                r3 = 15
                r12.mo4068f(r6, r3, r1)
                r12.mo4066d(r5)
                goto L_0x00f7
            L_0x00ec:
                r4 = 63
                r12.mo4068f(r6, r4, r8)
            L_0x00f1:
                r12.mo4066d(r5)
                r12.mo4065c(r3)
            L_0x00f7:
                int r2 = r2 + 1
                goto L_0x0023
            L_0x00fb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p026d4.C0816d.C0818b.mo4067e(java.util.List):void");
        }

        /* renamed from: f */
        public final void mo4068f(int i, int i2, int i3) {
            int i4;
            C1112f fVar;
            if (i < i2) {
                fVar = this.f3158i;
                i4 = i | i3;
            } else {
                this.f3158i.mo4633X(i3 | i2);
                i4 = i - i2;
                while (i4 >= 128) {
                    this.f3158i.mo4633X(128 | (i4 & 127));
                    i4 >>>= 7;
                }
                fVar = this.f3158i;
            }
            fVar.mo4633X(i4);
        }
    }

    static {
        C0815c cVar = new C0815c(C0815c.f3135i, "");
        C1115i iVar = C0815c.f3132f;
        C1115i iVar2 = C0815c.f3133g;
        C1115i iVar3 = C0815c.f3134h;
        C1115i iVar4 = C0815c.f3131e;
        C0815c[] cVarArr = {cVar, new C0815c(iVar, "GET"), new C0815c(iVar, "POST"), new C0815c(iVar2, "/"), new C0815c(iVar2, "/index.html"), new C0815c(iVar3, "http"), new C0815c(iVar3, "https"), new C0815c(iVar4, "200"), new C0815c(iVar4, "204"), new C0815c(iVar4, "206"), new C0815c(iVar4, "304"), new C0815c(iVar4, "400"), new C0815c(iVar4, "404"), new C0815c(iVar4, "500"), new C0815c("accept-charset", ""), new C0815c("accept-encoding", "gzip, deflate"), new C0815c("accept-language", ""), new C0815c("accept-ranges", ""), new C0815c("accept", ""), new C0815c("access-control-allow-origin", ""), new C0815c("age", ""), new C0815c("allow", ""), new C0815c("authorization", ""), new C0815c("cache-control", ""), new C0815c("content-disposition", ""), new C0815c("content-encoding", ""), new C0815c("content-language", ""), new C0815c("content-length", ""), new C0815c("content-location", ""), new C0815c("content-range", ""), new C0815c("content-type", ""), new C0815c("cookie", ""), new C0815c("date", ""), new C0815c("etag", ""), new C0815c("expect", ""), new C0815c("expires", ""), new C0815c("from", ""), new C0815c("host", ""), new C0815c("if-match", ""), new C0815c("if-modified-since", ""), new C0815c("if-none-match", ""), new C0815c("if-range", ""), new C0815c("if-unmodified-since", ""), new C0815c("last-modified", ""), new C0815c("link", ""), new C0815c("location", ""), new C0815c("max-forwards", ""), new C0815c("proxy-authenticate", ""), new C0815c("proxy-authorization", ""), new C0815c("range", ""), new C0815c("referer", ""), new C0815c("refresh", ""), new C0815c("retry-after", ""), new C0815c("server", ""), new C0815c("set-cookie", ""), new C0815c("strict-transport-security", ""), new C0815c("transfer-encoding", ""), new C0815c("user-agent", ""), new C0815c("vary", ""), new C0815c("via", ""), new C0815c("www-authenticate", "")};
        f3139a = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int length = cVarArr.length;
        for (int i = 0; i < length; i++) {
            C0815c[] cVarArr2 = f3139a;
            if (!linkedHashMap.containsKey(cVarArr2[i].f3137b)) {
                linkedHashMap.put(cVarArr2[i].f3137b, Integer.valueOf(i));
            }
        }
        Map<C1115i, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C1241e.m3516f(unmodifiableMap, "Collections.unmodifiableMap(result)");
        f3140b = unmodifiableMap;
    }

    /* renamed from: a */
    public final C1115i mo4055a(C1115i iVar) {
        C1241e.m3517j(iVar, "name");
        int c = iVar.mo4669c();
        for (int i = 0; i < c; i++) {
            byte b = (byte) 65;
            byte b2 = (byte) 90;
            byte f = iVar.mo4674f(i);
            if (b <= f && b2 >= f) {
                StringBuilder a = C0001b.m0a("PROTOCOL_ERROR response malformed: mixed case name: ");
                a.append(iVar.mo4679j());
                throw new IOException(a.toString());
            }
        }
        return iVar;
    }
}
