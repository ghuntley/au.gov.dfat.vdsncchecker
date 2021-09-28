package p099q;

import java.util.Arrays;
import java.util.Objects;
import p099q.C1590c;
import p111s.C1693d;

/* renamed from: q.e */
public class C1593e {

    /* renamed from: p */
    public static boolean f4940p = false;

    /* renamed from: q */
    public static int f4941q = 1000;

    /* renamed from: r */
    public static long f4942r;

    /* renamed from: a */
    public boolean f4943a;

    /* renamed from: b */
    public int f4944b;

    /* renamed from: c */
    public C1594a f4945c;

    /* renamed from: d */
    public int f4946d;

    /* renamed from: e */
    public int f4947e;

    /* renamed from: f */
    public C1590c[] f4948f;

    /* renamed from: g */
    public boolean f4949g;

    /* renamed from: h */
    public boolean[] f4950h;

    /* renamed from: i */
    public int f4951i;

    /* renamed from: j */
    public int f4952j;

    /* renamed from: k */
    public int f4953k;

    /* renamed from: l */
    public final C1592d f4954l;

    /* renamed from: m */
    public C1601j[] f4955m;

    /* renamed from: n */
    public int f4956n;

    /* renamed from: o */
    public C1594a f4957o;

    /* renamed from: q.e$a */
    public interface C1594a {
        /* renamed from: a */
        C1601j mo5697a(C1593e eVar, boolean[] zArr);

        /* renamed from: b */
        void mo5698b(C1601j jVar);

        void clear();

        boolean isEmpty();
    }

    public C1593e() {
        this.f4943a = false;
        this.f4944b = 0;
        this.f4946d = 32;
        this.f4947e = 32;
        this.f4948f = null;
        this.f4949g = false;
        this.f4950h = new boolean[32];
        this.f4951i = 1;
        this.f4952j = 0;
        this.f4953k = 32;
        this.f4955m = new C1601j[f4941q];
        this.f4956n = 0;
        this.f4948f = new C1590c[32];
        mo5735t();
        C1592d dVar = new C1592d(0);
        this.f4954l = dVar;
        this.f4945c = new C1596g(dVar);
        this.f4957o = new C1590c(dVar);
    }

    /* renamed from: a */
    public final C1601j mo5716a(int i, String str) {
        C1601j jVar = (C1601j) this.f4954l.f4938c.mo4463a();
        if (jVar == null) {
            jVar = new C1601j(i);
        } else {
            jVar.mo5744c();
        }
        jVar.f4976m = i;
        int i2 = this.f4956n;
        int i3 = f4941q;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            f4941q = i4;
            this.f4955m = (C1601j[]) Arrays.copyOf(this.f4955m, i4);
        }
        C1601j[] jVarArr = this.f4955m;
        int i5 = this.f4956n;
        this.f4956n = i5 + 1;
        jVarArr[i5] = jVar;
        return jVar;
    }

    /* renamed from: b */
    public void mo5717b(C1601j jVar, C1601j jVar2, int i, float f, C1601j jVar3, C1601j jVar4, int i2, int i3) {
        float f2;
        int i4;
        C1590c m = mo5728m();
        if (jVar2 == jVar3) {
            m.f4934d.mo5693i(jVar, 1.0f);
            m.f4934d.mo5693i(jVar4, 1.0f);
            m.f4934d.mo5693i(jVar2, -2.0f);
        } else {
            if (f == 0.5f) {
                m.f4934d.mo5693i(jVar, 1.0f);
                m.f4934d.mo5693i(jVar2, -1.0f);
                m.f4934d.mo5693i(jVar3, -1.0f);
                m.f4934d.mo5693i(jVar4, 1.0f);
                if (i > 0 || i2 > 0) {
                    i4 = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                m.f4934d.mo5693i(jVar, -1.0f);
                m.f4934d.mo5693i(jVar2, 1.0f);
                f2 = (float) i;
                m.f4932b = f2;
            } else if (f >= 1.0f) {
                m.f4934d.mo5693i(jVar4, -1.0f);
                m.f4934d.mo5693i(jVar3, 1.0f);
                i4 = -i2;
            } else {
                float f3 = 1.0f - f;
                m.f4934d.mo5693i(jVar, f3 * 1.0f);
                m.f4934d.mo5693i(jVar2, f3 * -1.0f);
                m.f4934d.mo5693i(jVar3, -1.0f * f);
                m.f4934d.mo5693i(jVar4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    m.f4932b = (((float) i2) * f) + (((float) (-i)) * f3);
                }
            }
            f2 = (float) i4;
            m.f4932b = f2;
        }
        if (i3 != 8) {
            m.mo5699c(this, i3);
        }
        mo5718c(m);
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ab A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01ac  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5718c(p099q.C1590c r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.f4952j
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.f4953k
            if (r2 >= r4) goto L_0x0013
            int r2 = r0.f4951i
            int r2 = r2 + r3
            int r4 = r0.f4947e
            if (r2 < r4) goto L_0x0016
        L_0x0013:
            r16.mo5731p()
        L_0x0016:
            boolean r2 = r1.f4935e
            if (r2 != 0) goto L_0x01ae
            q.c[] r2 = r0.f4948f
            int r2 = r2.length
            r5 = -1
            if (r2 != 0) goto L_0x0021
            goto L_0x0083
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 != 0) goto L_0x0073
            q.c$a r6 = r1.f4934d
            int r6 = r6.mo5695k()
            r7 = 0
        L_0x002b:
            if (r7 >= r6) goto L_0x0044
            q.c$a r8 = r1.f4934d
            q.j r8 = r8.mo5689e(r7)
            int r9 = r8.f4970g
            if (r9 != r5) goto L_0x003c
            boolean r9 = r8.f4973j
            if (r9 != 0) goto L_0x003c
            goto L_0x0041
        L_0x003c:
            java.util.ArrayList<q.j> r9 = r1.f4933c
            r9.add(r8)
        L_0x0041:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x0044:
            java.util.ArrayList<q.j> r6 = r1.f4933c
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0071
            r7 = 0
        L_0x004d:
            if (r7 >= r6) goto L_0x006b
            java.util.ArrayList<q.j> r8 = r1.f4933c
            java.lang.Object r8 = r8.get(r7)
            q.j r8 = (p099q.C1601j) r8
            boolean r9 = r8.f4973j
            if (r9 == 0) goto L_0x005f
            r1.mo5709k(r0, r8, r3)
            goto L_0x0068
        L_0x005f:
            q.c[] r9 = r0.f4948f
            int r8 = r8.f4970g
            r8 = r9[r8]
            r1.mo5710l(r0, r8, r3)
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x004d
        L_0x006b:
            java.util.ArrayList<q.j> r6 = r1.f4933c
            r6.clear()
            goto L_0x0022
        L_0x0071:
            r2 = r3
            goto L_0x0022
        L_0x0073:
            q.j r2 = r1.f4931a
            if (r2 == 0) goto L_0x0083
            q.c$a r2 = r1.f4934d
            int r2 = r2.mo5695k()
            if (r2 != 0) goto L_0x0083
            r1.f4935e = r3
            r0.f4943a = r3
        L_0x0083:
            boolean r2 = r17.isEmpty()
            if (r2 == 0) goto L_0x008a
            return
        L_0x008a:
            float r2 = r1.f4932b
            r6 = 0
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x009b
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r7
            r1.f4932b = r2
            q.c$a r2 = r1.f4934d
            r2.mo5694j()
        L_0x009b:
            q.c$a r2 = r1.f4934d
            int r2 = r2.mo5695k()
            r7 = 0
            r11 = r6
            r13 = r11
            r9 = r7
            r10 = r9
            r8 = 0
            r12 = 0
            r14 = 0
        L_0x00a9:
            if (r8 >= r2) goto L_0x00f6
            q.c$a r15 = r1.f4934d
            float r15 = r15.mo5684a(r8)
            q.c$a r4 = r1.f4934d
            q.j r4 = r4.mo5689e(r8)
            int r5 = r4.f4976m
            if (r5 != r3) goto L_0x00d4
            if (r9 != 0) goto L_0x00be
            goto L_0x00c2
        L_0x00be:
            int r5 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00c8
        L_0x00c2:
            boolean r5 = r1.mo5705h(r4)
            r12 = r5
            goto L_0x00d1
        L_0x00c8:
            if (r12 != 0) goto L_0x00f2
            boolean r5 = r1.mo5705h(r4)
            if (r5 == 0) goto L_0x00f2
            r12 = r3
        L_0x00d1:
            r9 = r4
            r11 = r15
            goto L_0x00f2
        L_0x00d4:
            if (r9 != 0) goto L_0x00f2
            int r5 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x00f2
            if (r10 != 0) goto L_0x00dd
            goto L_0x00e1
        L_0x00dd:
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00e7
        L_0x00e1:
            boolean r5 = r1.mo5705h(r4)
            r14 = r5
            goto L_0x00f0
        L_0x00e7:
            if (r14 != 0) goto L_0x00f2
            boolean r5 = r1.mo5705h(r4)
            if (r5 == 0) goto L_0x00f2
            r14 = r3
        L_0x00f0:
            r10 = r4
            r13 = r15
        L_0x00f2:
            int r8 = r8 + 1
            r5 = -1
            goto L_0x00a9
        L_0x00f6:
            if (r9 == 0) goto L_0x00f9
            goto L_0x00fa
        L_0x00f9:
            r9 = r10
        L_0x00fa:
            if (r9 != 0) goto L_0x00fe
            r2 = r3
            goto L_0x0102
        L_0x00fe:
            r1.mo5708j(r9)
            r2 = 0
        L_0x0102:
            q.c$a r4 = r1.f4934d
            int r4 = r4.mo5695k()
            if (r4 != 0) goto L_0x010c
            r1.f4935e = r3
        L_0x010c:
            if (r2 == 0) goto L_0x0198
            int r2 = r0.f4951i
            int r2 = r2 + r3
            int r4 = r0.f4947e
            if (r2 < r4) goto L_0x0118
            r16.mo5731p()
        L_0x0118:
            r2 = 3
            q.j r2 = r0.mo5716a(r2, r7)
            int r4 = r0.f4944b
            int r4 = r4 + r3
            r0.f4944b = r4
            int r5 = r0.f4951i
            int r5 = r5 + r3
            r0.f4951i = r5
            r2.f4969f = r4
            q.d r5 = r0.f4954l
            java.lang.Object r5 = r5.f4939d
            q.j[] r5 = (p099q.C1601j[]) r5
            r5[r4] = r2
            r1.f4931a = r2
            int r4 = r0.f4952j
            r16.mo5724i(r17)
            int r5 = r0.f4952j
            int r4 = r4 + r3
            if (r5 != r4) goto L_0x0198
            q.e$a r4 = r0.f4957o
            q.c r4 = (p099q.C1590c) r4
            java.util.Objects.requireNonNull(r4)
            r4.f4931a = r7
            q.c$a r5 = r4.f4934d
            r5.clear()
            r5 = 0
        L_0x014c:
            q.c$a r8 = r1.f4934d
            int r8 = r8.mo5695k()
            if (r5 >= r8) goto L_0x0168
            q.c$a r8 = r1.f4934d
            q.j r8 = r8.mo5689e(r5)
            q.c$a r9 = r1.f4934d
            float r9 = r9.mo5684a(r5)
            q.c$a r10 = r4.f4934d
            r10.mo5685b(r8, r9, r3)
            int r5 = r5 + 1
            goto L_0x014c
        L_0x0168:
            q.e$a r4 = r0.f4957o
            r0.mo5734s(r4)
            int r4 = r2.f4970g
            r5 = -1
            if (r4 != r5) goto L_0x0196
            q.j r4 = r1.f4931a
            if (r4 != r2) goto L_0x017f
            q.j r2 = r1.mo5706i(r7, r2)
            if (r2 == 0) goto L_0x017f
            r1.mo5708j(r2)
        L_0x017f:
            boolean r2 = r1.f4935e
            if (r2 != 0) goto L_0x0188
            q.j r2 = r1.f4931a
            r2.mo5747e(r0, r1)
        L_0x0188:
            q.d r2 = r0.f4954l
            q.f r2 = r2.f4937b
            q.f r2 = (p099q.C1595f) r2
            r2.mo4464c(r1)
            int r2 = r0.f4952j
            int r2 = r2 - r3
            r0.f4952j = r2
        L_0x0196:
            r2 = r3
            goto L_0x0199
        L_0x0198:
            r2 = 0
        L_0x0199:
            q.j r4 = r1.f4931a
            if (r4 == 0) goto L_0x01a8
            int r4 = r4.f4976m
            if (r4 == r3) goto L_0x01a9
            float r4 = r1.f4932b
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x01a8
            goto L_0x01a9
        L_0x01a8:
            r3 = 0
        L_0x01a9:
            if (r3 != 0) goto L_0x01ac
            return
        L_0x01ac:
            r4 = r2
            goto L_0x01af
        L_0x01ae:
            r4 = 0
        L_0x01af:
            if (r4 != 0) goto L_0x01b4
            r16.mo5724i(r17)
        L_0x01b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p099q.C1593e.mo5718c(q.c):void");
    }

    /* renamed from: d */
    public C1590c mo5719d(C1601j jVar, C1601j jVar2, int i, int i2) {
        if (i2 == 8 && jVar2.f4973j && jVar.f4970g == -1) {
            jVar.mo5746d(this, jVar2.f4972i + ((float) i));
            return null;
        }
        C1590c m = mo5728m();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            m.f4932b = (float) i;
        }
        if (!z) {
            m.f4934d.mo5693i(jVar, -1.0f);
            m.f4934d.mo5693i(jVar2, 1.0f);
        } else {
            m.f4934d.mo5693i(jVar, 1.0f);
            m.f4934d.mo5693i(jVar2, -1.0f);
        }
        if (i2 != 8) {
            m.mo5699c(this, i2);
        }
        mo5718c(m);
        return m;
    }

    /* renamed from: e */
    public void mo5720e(C1601j jVar, int i) {
        C1590c cVar;
        C1590c.C1591a aVar;
        float f;
        int i2 = jVar.f4970g;
        if (i2 == -1) {
            jVar.mo5746d(this, (float) i);
            for (int i3 = 0; i3 < this.f4944b + 1; i3++) {
                C1601j jVar2 = ((C1601j[]) this.f4954l.f4939d)[i3];
            }
            return;
        }
        if (i2 != -1) {
            C1590c cVar2 = this.f4948f[i2];
            if (!cVar2.f4935e) {
                if (cVar2.f4934d.mo5695k() == 0) {
                    cVar2.f4935e = true;
                } else {
                    cVar = mo5728m();
                    if (i < 0) {
                        cVar.f4932b = (float) (i * -1);
                        aVar = cVar.f4934d;
                        f = 1.0f;
                    } else {
                        cVar.f4932b = (float) i;
                        aVar = cVar.f4934d;
                        f = -1.0f;
                    }
                    aVar.mo5693i(jVar, f);
                }
            }
            cVar2.f4932b = (float) i;
            return;
        }
        cVar = mo5728m();
        cVar.f4931a = jVar;
        float f2 = (float) i;
        jVar.f4972i = f2;
        cVar.f4932b = f2;
        cVar.f4935e = true;
        mo5718c(cVar);
    }

    /* renamed from: f */
    public void mo5721f(C1601j jVar, C1601j jVar2, int i, int i2) {
        C1590c m = mo5728m();
        C1601j n = mo5729n();
        n.f4971h = 0;
        m.mo5702e(jVar, jVar2, n, i);
        if (i2 != 8) {
            m.f4934d.mo5693i(mo5726k(i2, (String) null), (float) ((int) (m.f4934d.mo5686c(n) * -1.0f)));
        }
        mo5718c(m);
    }

    /* renamed from: g */
    public void mo5722g(C1601j jVar, C1601j jVar2, int i, int i2) {
        C1590c m = mo5728m();
        C1601j n = mo5729n();
        n.f4971h = 0;
        m.mo5703f(jVar, jVar2, n, i);
        if (i2 != 8) {
            m.f4934d.mo5693i(mo5726k(i2, (String) null), (float) ((int) (m.f4934d.mo5686c(n) * -1.0f)));
        }
        mo5718c(m);
    }

    /* renamed from: h */
    public void mo5723h(C1601j jVar, C1601j jVar2, C1601j jVar3, C1601j jVar4, float f, int i) {
        C1590c m = mo5728m();
        m.mo5701d(jVar, jVar2, jVar3, jVar4, f);
        if (i != 8) {
            m.mo5699c(this, i);
        }
        mo5718c(m);
    }

    /* renamed from: i */
    public final void mo5724i(C1590c cVar) {
        int i;
        if (cVar.f4935e) {
            cVar.f4931a.mo5746d(this, cVar.f4932b);
        } else {
            C1590c[] cVarArr = this.f4948f;
            int i2 = this.f4952j;
            cVarArr[i2] = cVar;
            C1601j jVar = cVar.f4931a;
            jVar.f4970g = i2;
            this.f4952j = i2 + 1;
            jVar.mo5747e(this, cVar);
        }
        if (this.f4943a) {
            int i3 = 0;
            while (i3 < this.f4952j) {
                if (this.f4948f[i3] == null) {
                    System.out.println("WTF");
                }
                C1590c[] cVarArr2 = this.f4948f;
                if (cVarArr2[i3] != null && cVarArr2[i3].f4935e) {
                    C1590c cVar2 = cVarArr2[i3];
                    cVar2.f4931a.mo5746d(this, cVar2.f4932b);
                    this.f4954l.f4937b.mo4464c(cVar2);
                    this.f4948f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f4952j;
                        if (i4 >= i) {
                            break;
                        }
                        C1590c[] cVarArr3 = this.f4948f;
                        int i6 = i4 - 1;
                        cVarArr3[i6] = cVarArr3[i4];
                        if (cVarArr3[i6].f4931a.f4970g == i4) {
                            cVarArr3[i6].f4931a.f4970g = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f4948f[i5] = null;
                    }
                    this.f4952j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f4943a = false;
        }
    }

    /* renamed from: j */
    public final void mo5725j() {
        for (int i = 0; i < this.f4952j; i++) {
            C1590c cVar = this.f4948f[i];
            cVar.f4931a.f4972i = cVar.f4932b;
        }
    }

    /* renamed from: k */
    public C1601j mo5726k(int i, String str) {
        if (this.f4951i + 1 >= this.f4947e) {
            mo5731p();
        }
        C1601j a = mo5716a(4, str);
        int i2 = this.f4944b + 1;
        this.f4944b = i2;
        this.f4951i++;
        a.f4969f = i2;
        a.f4971h = i;
        ((C1601j[]) this.f4954l.f4939d)[i2] = a;
        this.f4945c.mo5698b(a);
        return a;
    }

    /* renamed from: l */
    public C1601j mo5727l(Object obj) {
        C1601j jVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f4951i + 1 >= this.f4947e) {
            mo5731p();
        }
        if (obj instanceof C1693d) {
            C1693d dVar = (C1693d) obj;
            jVar = dVar.f5162i;
            if (jVar == null) {
                dVar.mo5904i();
                jVar = dVar.f5162i;
            }
            int i = jVar.f4969f;
            if (i == -1 || i > this.f4944b || ((C1601j[]) this.f4954l.f4939d)[i] == null) {
                if (i != -1) {
                    jVar.mo5744c();
                }
                int i2 = this.f4944b + 1;
                this.f4944b = i2;
                this.f4951i++;
                jVar.f4969f = i2;
                jVar.f4976m = 1;
                ((C1601j[]) this.f4954l.f4939d)[i2] = jVar;
            }
        }
        return jVar;
    }

    /* renamed from: m */
    public C1590c mo5728m() {
        C1590c cVar = (C1590c) this.f4954l.f4937b.mo4463a();
        if (cVar == null) {
            cVar = new C1590c(this.f4954l);
            f4942r++;
        } else {
            cVar.f4931a = null;
            cVar.f4934d.clear();
            cVar.f4932b = 0.0f;
            cVar.f4935e = false;
        }
        C1601j.f4967q++;
        return cVar;
    }

    /* renamed from: n */
    public C1601j mo5729n() {
        if (this.f4951i + 1 >= this.f4947e) {
            mo5731p();
        }
        C1601j a = mo5716a(3, (String) null);
        int i = this.f4944b + 1;
        this.f4944b = i;
        this.f4951i++;
        a.f4969f = i;
        ((C1601j[]) this.f4954l.f4939d)[i] = a;
        return a;
    }

    /* renamed from: o */
    public int mo5730o(Object obj) {
        C1601j jVar = ((C1693d) obj).f5162i;
        if (jVar != null) {
            return (int) (jVar.f4972i + 0.5f);
        }
        return 0;
    }

    /* renamed from: p */
    public final void mo5731p() {
        int i = this.f4946d * 2;
        this.f4946d = i;
        this.f4948f = (C1590c[]) Arrays.copyOf(this.f4948f, i);
        C1592d dVar = this.f4954l;
        dVar.f4939d = (C1601j[]) Arrays.copyOf((C1601j[]) dVar.f4939d, this.f4946d);
        int i2 = this.f4946d;
        this.f4950h = new boolean[i2];
        this.f4947e = i2;
        this.f4953k = i2;
    }

    /* renamed from: q */
    public void mo5732q() {
        if (this.f4945c.isEmpty()) {
            mo5725j();
            return;
        }
        if (this.f4949g) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f4952j) {
                    z = true;
                    break;
                } else if (!this.f4948f[i].f4935e) {
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                mo5725j();
                return;
            }
        }
        mo5733r(this.f4945c);
    }

    /* renamed from: r */
    public void mo5733r(C1594a aVar) {
        float f;
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            f = 0.0f;
            i = 1;
            if (i2 >= this.f4952j) {
                z = false;
                break;
            }
            C1590c[] cVarArr = this.f4948f;
            if (cVarArr[i2].f4931a.f4976m != 1 && cVarArr[i2].f4932b < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            boolean z2 = false;
            int i3 = 0;
            while (!z2) {
                i3 += i;
                float f2 = Float.MAX_VALUE;
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                int i7 = 0;
                while (i6 < this.f4952j) {
                    C1590c cVar = this.f4948f[i6];
                    if (cVar.f4931a.f4976m != i && !cVar.f4935e && cVar.f4932b < f) {
                        int k = cVar.f4934d.mo5695k();
                        int i8 = 0;
                        while (i8 < k) {
                            C1601j e = cVar.f4934d.mo5689e(i8);
                            float c = cVar.f4934d.mo5686c(e);
                            if (c > f) {
                                for (int i9 = 0; i9 < 9; i9++) {
                                    float f3 = e.f4974k[i9] / c;
                                    if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                        i5 = e.f4969f;
                                        i7 = i9;
                                        f2 = f3;
                                        i4 = i6;
                                    }
                                }
                            }
                            i8++;
                            f = 0.0f;
                        }
                    }
                    i6++;
                    f = 0.0f;
                    i = 1;
                }
                if (i4 != -1) {
                    C1590c cVar2 = this.f4948f[i4];
                    cVar2.f4931a.f4970g = -1;
                    cVar2.mo5708j(((C1601j[]) this.f4954l.f4939d)[i5]);
                    C1601j jVar = cVar2.f4931a;
                    jVar.f4970g = i4;
                    jVar.mo5747e(this, cVar2);
                } else {
                    z2 = true;
                }
                if (i3 > this.f4951i / 2) {
                    z2 = true;
                }
                f = 0.0f;
                i = 1;
            }
        }
        mo5734s(aVar);
        mo5725j();
    }

    /* renamed from: s */
    public final int mo5734s(C1594a aVar) {
        for (int i = 0; i < this.f4951i; i++) {
            this.f4950h[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.f4951i * 2) {
                return i2;
            }
            C1601j jVar = ((C1590c) aVar).f4931a;
            if (jVar != null) {
                this.f4950h[jVar.f4969f] = true;
            }
            C1601j a = aVar.mo5697a(this, this.f4950h);
            if (a != null) {
                boolean[] zArr = this.f4950h;
                int i3 = a.f4969f;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (a != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f4952j; i5++) {
                    C1590c cVar = this.f4948f[i5];
                    if (cVar.f4931a.f4976m != 1 && !cVar.f4935e && cVar.f4934d.mo5691g(a)) {
                        float c = cVar.f4934d.mo5686c(a);
                        if (c < 0.0f) {
                            float f2 = (-cVar.f4932b) / c;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C1590c cVar2 = this.f4948f[i4];
                    cVar2.f4931a.f4970g = -1;
                    cVar2.mo5708j(a);
                    C1601j jVar2 = cVar2.f4931a;
                    jVar2.f4970g = i4;
                    jVar2.mo5747e(this, cVar2);
                }
            } else {
                z = true;
            }
        }
        return i2;
    }

    /* renamed from: t */
    public final void mo5735t() {
        for (int i = 0; i < this.f4952j; i++) {
            C1590c cVar = this.f4948f[i];
            if (cVar != null) {
                this.f4954l.f4937b.mo4464c(cVar);
            }
            this.f4948f[i] = null;
        }
    }

    /* renamed from: u */
    public void mo5736u() {
        C1592d dVar;
        int i = 0;
        while (true) {
            dVar = this.f4954l;
            Object obj = dVar.f4939d;
            if (i >= ((C1601j[]) obj).length) {
                break;
            }
            C1601j jVar = ((C1601j[]) obj)[i];
            if (jVar != null) {
                jVar.mo5744c();
            }
            i++;
        }
        C1595f fVar = dVar.f4938c;
        C1601j[] jVarArr = this.f4955m;
        int i2 = this.f4956n;
        Objects.requireNonNull(fVar);
        if (i2 > jVarArr.length) {
            i2 = jVarArr.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C1601j jVar2 = jVarArr[i3];
            int i4 = fVar.f4960c;
            Object[] objArr = fVar.f4959b;
            if (i4 < objArr.length) {
                objArr[i4] = jVar2;
                fVar.f4960c = i4 + 1;
            }
        }
        this.f4956n = 0;
        Arrays.fill((C1601j[]) this.f4954l.f4939d, (Object) null);
        this.f4944b = 0;
        this.f4945c.clear();
        this.f4951i = 1;
        for (int i5 = 0; i5 < this.f4952j; i5++) {
            C1590c[] cVarArr = this.f4948f;
            if (cVarArr[i5] != null) {
                Objects.requireNonNull(cVarArr[i5]);
            }
        }
        mo5735t();
        this.f4952j = 0;
        this.f4957o = new C1590c(this.f4954l);
    }
}
