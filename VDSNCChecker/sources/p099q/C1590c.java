package p099q;

import java.util.ArrayList;
import p099q.C1593e;

/* renamed from: q.c */
public class C1590c implements C1593e.C1594a {

    /* renamed from: a */
    public C1601j f4931a = null;

    /* renamed from: b */
    public float f4932b = 0.0f;

    /* renamed from: c */
    public ArrayList<C1601j> f4933c = new ArrayList<>();

    /* renamed from: d */
    public C1591a f4934d;

    /* renamed from: e */
    public boolean f4935e = false;

    /* renamed from: q.c$a */
    public interface C1591a {
        /* renamed from: a */
        float mo5684a(int i);

        /* renamed from: b */
        void mo5685b(C1601j jVar, float f, boolean z);

        /* renamed from: c */
        float mo5686c(C1601j jVar);

        void clear();

        /* renamed from: d */
        float mo5688d(C1590c cVar, boolean z);

        /* renamed from: e */
        C1601j mo5689e(int i);

        /* renamed from: f */
        float mo5690f(C1601j jVar, boolean z);

        /* renamed from: g */
        boolean mo5691g(C1601j jVar);

        /* renamed from: h */
        void mo5692h(float f);

        /* renamed from: i */
        void mo5693i(C1601j jVar, float f);

        /* renamed from: j */
        void mo5694j();

        /* renamed from: k */
        int mo5695k();
    }

    public C1590c() {
    }

    public C1590c(C1592d dVar) {
        this.f4934d = new C1588a(this, dVar);
    }

    /* renamed from: a */
    public C1601j mo5697a(C1593e eVar, boolean[] zArr) {
        return mo5706i(zArr, (C1601j) null);
    }

    /* renamed from: b */
    public void mo5698b(C1601j jVar) {
        float f;
        int i = jVar.f4971h;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
            this.f4934d.mo5693i(jVar, f);
        }
        f = 1.0f;
        this.f4934d.mo5693i(jVar, f);
    }

    /* renamed from: c */
    public C1590c mo5699c(C1593e eVar, int i) {
        this.f4934d.mo5693i(eVar.mo5726k(i, "ep"), 1.0f);
        this.f4934d.mo5693i(eVar.mo5726k(i, "em"), -1.0f);
        return this;
    }

    public void clear() {
        this.f4934d.clear();
        this.f4931a = null;
        this.f4932b = 0.0f;
    }

    /* renamed from: d */
    public C1590c mo5701d(C1601j jVar, C1601j jVar2, C1601j jVar3, C1601j jVar4, float f) {
        this.f4934d.mo5693i(jVar, -1.0f);
        this.f4934d.mo5693i(jVar2, 1.0f);
        this.f4934d.mo5693i(jVar3, f);
        this.f4934d.mo5693i(jVar4, -f);
        return this;
    }

    /* renamed from: e */
    public C1590c mo5702e(C1601j jVar, C1601j jVar2, C1601j jVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f4932b = (float) i;
        }
        if (!z) {
            this.f4934d.mo5693i(jVar, -1.0f);
            this.f4934d.mo5693i(jVar2, 1.0f);
            this.f4934d.mo5693i(jVar3, 1.0f);
        } else {
            this.f4934d.mo5693i(jVar, 1.0f);
            this.f4934d.mo5693i(jVar2, -1.0f);
            this.f4934d.mo5693i(jVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: f */
    public C1590c mo5703f(C1601j jVar, C1601j jVar2, C1601j jVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f4932b = (float) i;
        }
        if (!z) {
            this.f4934d.mo5693i(jVar, -1.0f);
            this.f4934d.mo5693i(jVar2, 1.0f);
            this.f4934d.mo5693i(jVar3, -1.0f);
        } else {
            this.f4934d.mo5693i(jVar, 1.0f);
            this.f4934d.mo5693i(jVar2, -1.0f);
            this.f4934d.mo5693i(jVar3, 1.0f);
        }
        return this;
    }

    /* renamed from: g */
    public C1590c mo5704g(C1601j jVar, C1601j jVar2, C1601j jVar3, C1601j jVar4, float f) {
        this.f4934d.mo5693i(jVar3, 0.5f);
        this.f4934d.mo5693i(jVar4, 0.5f);
        this.f4934d.mo5693i(jVar, -0.5f);
        this.f4934d.mo5693i(jVar2, -0.5f);
        this.f4932b = -f;
        return this;
    }

    /* renamed from: h */
    public final boolean mo5705h(C1601j jVar) {
        return jVar.f4979p <= 1;
    }

    /* renamed from: i */
    public final C1601j mo5706i(boolean[] zArr, C1601j jVar) {
        int i;
        int k = this.f4934d.mo5695k();
        C1601j jVar2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < k; i2++) {
            float a = this.f4934d.mo5684a(i2);
            if (a < 0.0f) {
                C1601j e = this.f4934d.mo5689e(i2);
                if ((zArr == null || !zArr[e.f4969f]) && e != jVar && (((i = e.f4976m) == 3 || i == 4) && a < f)) {
                    f = a;
                    jVar2 = e;
                }
            }
        }
        return jVar2;
    }

    public boolean isEmpty() {
        return this.f4931a == null && this.f4932b == 0.0f && this.f4934d.mo5695k() == 0;
    }

    /* renamed from: j */
    public void mo5708j(C1601j jVar) {
        C1601j jVar2 = this.f4931a;
        if (jVar2 != null) {
            this.f4934d.mo5693i(jVar2, -1.0f);
            this.f4931a.f4970g = -1;
            this.f4931a = null;
        }
        float f = this.f4934d.mo5690f(jVar, true) * -1.0f;
        this.f4931a = jVar;
        if (f != 1.0f) {
            this.f4932b /= f;
            this.f4934d.mo5692h(f);
        }
    }

    /* renamed from: k */
    public void mo5709k(C1593e eVar, C1601j jVar, boolean z) {
        if (jVar.f4973j) {
            float c = this.f4934d.mo5686c(jVar);
            this.f4932b = (jVar.f4972i * c) + this.f4932b;
            this.f4934d.mo5690f(jVar, z);
            if (z) {
                jVar.mo5743b(this);
            }
            if (this.f4934d.mo5695k() == 0) {
                this.f4935e = true;
                eVar.f4943a = true;
            }
        }
    }

    /* renamed from: l */
    public void mo5710l(C1593e eVar, C1590c cVar, boolean z) {
        float d = this.f4934d.mo5688d(cVar, z);
        this.f4932b = (cVar.f4932b * d) + this.f4932b;
        if (z) {
            cVar.f4931a.mo5743b(this);
        }
        if (this.f4931a != null && this.f4934d.mo5695k() == 0) {
            this.f4935e = true;
            eVar.f4943a = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            q.j r0 = r10.f4931a
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x0016
        L_0x0007:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = p000a.C0001b.m0a(r0)
            q.j r1 = r10.f4931a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0016:
            java.lang.String r1 = " = "
            java.lang.String r0 = p063k.C1142f.m3365a(r0, r1)
            float r1 = r10.f4932b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0034
            java.lang.StringBuilder r0 = p000a.C0001b.m0a(r0)
            float r1 = r10.f4932b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L_0x0035
        L_0x0034:
            r1 = r3
        L_0x0035:
            q.c$a r5 = r10.f4934d
            int r5 = r5.mo5695k()
        L_0x003b:
            if (r3 >= r5) goto L_0x009f
            q.c$a r6 = r10.f4934d
            q.j r6 = r6.mo5689e(r3)
            if (r6 != 0) goto L_0x0046
            goto L_0x009c
        L_0x0046:
            q.c$a r7 = r10.f4934d
            float r7 = r7.mo5684a(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0051
            goto L_0x009c
        L_0x0051:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0064
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x007e
            java.lang.StringBuilder r0 = p000a.C0001b.m0a(r0)
            java.lang.String r1 = "- "
            goto L_0x0076
        L_0x0064:
            java.lang.StringBuilder r0 = p000a.C0001b.m0a(r0)
            if (r8 <= 0) goto L_0x0074
            java.lang.String r1 = " + "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x007e
        L_0x0074:
            java.lang.String r1 = " - "
        L_0x0076:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            float r7 = r7 * r9
        L_0x007e:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x008a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x0097
        L_0x008a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L_0x0097:
            java.lang.String r0 = p099q.C1589b.m4444a(r1, r0, r6)
            r1 = r4
        L_0x009c:
            int r3 = r3 + 1
            goto L_0x003b
        L_0x009f:
            if (r1 != 0) goto L_0x00a7
            java.lang.String r1 = "0.0"
            java.lang.String r0 = p063k.C1142f.m3365a(r0, r1)
        L_0x00a7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p099q.C1590c.toString():java.lang.String");
    }
}
