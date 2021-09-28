package p099q;

import java.util.Arrays;
import java.util.Comparator;
import p000a.C0001b;
import p099q.C1590c;

/* renamed from: q.g */
public class C1596g extends C1590c {

    /* renamed from: f */
    public C1601j[] f4961f = new C1601j[128];

    /* renamed from: g */
    public C1601j[] f4962g = new C1601j[128];

    /* renamed from: h */
    public int f4963h = 0;

    /* renamed from: i */
    public C1598b f4964i = new C1598b(this);

    /* renamed from: q.g$a */
    public class C1597a implements Comparator<C1601j> {
        public C1597a(C1596g gVar) {
        }

        public int compare(Object obj, Object obj2) {
            return ((C1601j) obj).f4969f - ((C1601j) obj2).f4969f;
        }
    }

    /* renamed from: q.g$b */
    public class C1598b {

        /* renamed from: a */
        public C1601j f4965a;

        public C1598b(C1596g gVar) {
        }

        public String toString() {
            String str = "[ ";
            if (this.f4965a != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder a = C0001b.m0a(str);
                    a.append(this.f4965a.f4975l[i]);
                    a.append(" ");
                    str = a.toString();
                }
            }
            StringBuilder a2 = C1599h.m4503a(str, "] ");
            a2.append(this.f4965a);
            return a2.toString();
        }
    }

    public C1596g(C1592d dVar) {
        super(dVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (r8 < r7) goto L_0x0051;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p099q.C1601j mo5697a(p099q.C1593e r11, boolean[] r12) {
        /*
            r10 = this;
            r11 = -1
            r0 = 0
            r2 = r11
            r1 = r0
        L_0x0004:
            int r3 = r10.f4963h
            if (r1 >= r3) goto L_0x0057
            q.j[] r3 = r10.f4961f
            r4 = r3[r1]
            int r5 = r4.f4969f
            boolean r5 = r12[r5]
            if (r5 == 0) goto L_0x0013
            goto L_0x0054
        L_0x0013:
            q.g$b r5 = r10.f4964i
            r5.f4965a = r4
            r4 = 8
            r6 = 1
            if (r2 != r11) goto L_0x0036
        L_0x001c:
            if (r4 < 0) goto L_0x0032
            q.j r3 = r5.f4965a
            float[] r3 = r3.f4975l
            r3 = r3[r4]
            r7 = 0
            int r8 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r8 <= 0) goto L_0x002a
            goto L_0x0032
        L_0x002a:
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x002f
            goto L_0x0033
        L_0x002f:
            int r4 = r4 + -1
            goto L_0x001c
        L_0x0032:
            r6 = r0
        L_0x0033:
            if (r6 == 0) goto L_0x0054
            goto L_0x0053
        L_0x0036:
            r3 = r3[r2]
        L_0x0038:
            if (r4 < 0) goto L_0x0050
            float[] r7 = r3.f4975l
            r7 = r7[r4]
            q.j r8 = r5.f4965a
            float[] r8 = r8.f4975l
            r8 = r8[r4]
            int r9 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x004b
            int r4 = r4 + -1
            goto L_0x0038
        L_0x004b:
            int r3 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r6 = r0
        L_0x0051:
            if (r6 == 0) goto L_0x0054
        L_0x0053:
            r2 = r1
        L_0x0054:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0057:
            if (r2 != r11) goto L_0x005b
            r11 = 0
            return r11
        L_0x005b:
            q.j[] r11 = r10.f4961f
            r11 = r11[r2]
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p099q.C1596g.mo5697a(q.e, boolean[]):q.j");
    }

    /* renamed from: b */
    public void mo5698b(C1601j jVar) {
        this.f4964i.f4965a = jVar;
        Arrays.fill(jVar.f4975l, 0.0f);
        jVar.f4975l[jVar.f4971h] = 1.0f;
        mo5738m(jVar);
    }

    public void clear() {
        this.f4963h = 0;
        this.f4932b = 0.0f;
    }

    public boolean isEmpty() {
        return this.f4963h == 0;
    }

    /* renamed from: l */
    public void mo5710l(C1593e eVar, C1590c cVar, boolean z) {
        C1590c cVar2 = cVar;
        C1601j jVar = cVar2.f4931a;
        if (jVar != null) {
            C1590c.C1591a aVar = cVar2.f4934d;
            int k = aVar.mo5695k();
            for (int i = 0; i < k; i++) {
                C1601j e = aVar.mo5689e(i);
                float a = aVar.mo5684a(i);
                C1598b bVar = this.f4964i;
                bVar.f4965a = e;
                boolean z2 = true;
                if (e.f4968e) {
                    for (int i2 = 0; i2 < 9; i2++) {
                        float[] fArr = bVar.f4965a.f4975l;
                        fArr[i2] = (jVar.f4975l[i2] * a) + fArr[i2];
                        if (Math.abs(fArr[i2]) < 1.0E-4f) {
                            bVar.f4965a.f4975l[i2] = 0.0f;
                        } else {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        C1596g.this.mo5739n(bVar.f4965a);
                    }
                    z2 = false;
                } else {
                    for (int i3 = 0; i3 < 9; i3++) {
                        float f = jVar.f4975l[i3];
                        if (f != 0.0f) {
                            float f2 = f * a;
                            if (Math.abs(f2) < 1.0E-4f) {
                                f2 = 0.0f;
                            }
                            bVar.f4965a.f4975l[i3] = f2;
                        } else {
                            bVar.f4965a.f4975l[i3] = 0.0f;
                        }
                    }
                }
                if (z2) {
                    mo5738m(e);
                }
                this.f4932b = (cVar2.f4932b * a) + this.f4932b;
            }
            mo5739n(jVar);
        }
    }

    /* renamed from: m */
    public final void mo5738m(C1601j jVar) {
        int i;
        int i2 = this.f4963h + 1;
        C1601j[] jVarArr = this.f4961f;
        if (i2 > jVarArr.length) {
            C1601j[] jVarArr2 = (C1601j[]) Arrays.copyOf(jVarArr, jVarArr.length * 2);
            this.f4961f = jVarArr2;
            this.f4962g = (C1601j[]) Arrays.copyOf(jVarArr2, jVarArr2.length * 2);
        }
        C1601j[] jVarArr3 = this.f4961f;
        int i3 = this.f4963h;
        jVarArr3[i3] = jVar;
        int i4 = i3 + 1;
        this.f4963h = i4;
        if (i4 > 1 && jVarArr3[i4 - 1].f4969f > jVar.f4969f) {
            int i5 = 0;
            while (true) {
                i = this.f4963h;
                if (i5 >= i) {
                    break;
                }
                this.f4962g[i5] = this.f4961f[i5];
                i5++;
            }
            Arrays.sort(this.f4962g, 0, i, new C1597a(this));
            for (int i6 = 0; i6 < this.f4963h; i6++) {
                this.f4961f[i6] = this.f4962g[i6];
            }
        }
        jVar.f4968e = true;
        jVar.mo5742a(this);
    }

    /* renamed from: n */
    public final void mo5739n(C1601j jVar) {
        int i = 0;
        while (i < this.f4963h) {
            if (this.f4961f[i] == jVar) {
                while (true) {
                    int i2 = this.f4963h;
                    if (i < i2 - 1) {
                        C1601j[] jVarArr = this.f4961f;
                        int i3 = i + 1;
                        jVarArr[i] = jVarArr[i3];
                        i = i3;
                    } else {
                        this.f4963h = i2 - 1;
                        jVar.f4968e = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    public String toString() {
        StringBuilder a = C1599h.m4503a("", " goal -> (");
        a.append(this.f4932b);
        a.append(") : ");
        String sb = a.toString();
        for (int i = 0; i < this.f4963h; i++) {
            this.f4964i.f4965a = this.f4961f[i];
            StringBuilder a2 = C0001b.m0a(sb);
            a2.append(this.f4964i);
            a2.append(" ");
            sb = a2.toString();
        }
        return sb;
    }
}
