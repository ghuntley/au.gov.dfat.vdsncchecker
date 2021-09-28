package p117t;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import p111s.C1695e;
import p111s.C1696f;
import p111s.C1697g;
import p111s.C1699i;
import p117t.C1746b;

/* renamed from: t.f */
public class C1752f {

    /* renamed from: a */
    public C1696f f5353a;

    /* renamed from: b */
    public boolean f5354b = true;

    /* renamed from: c */
    public boolean f5355c = true;

    /* renamed from: d */
    public C1696f f5356d;

    /* renamed from: e */
    public ArrayList<C1765q> f5357e = new ArrayList<>();

    /* renamed from: f */
    public C1746b.C1748b f5358f;

    /* renamed from: g */
    public C1746b.C1747a f5359g;

    /* renamed from: h */
    public ArrayList<C1761n> f5360h;

    public C1752f(C1696f fVar) {
        new ArrayList();
        this.f5358f = null;
        this.f5359g = new C1746b.C1747a();
        this.f5360h = new ArrayList<>();
        this.f5353a = fVar;
        this.f5356d = fVar;
    }

    /* renamed from: a */
    public final void mo6020a(C1753g gVar, int i, int i2, C1753g gVar2, ArrayList<C1761n> arrayList, C1761n nVar) {
        C1765q qVar = gVar.f5364d;
        if (qVar.f5400c == null) {
            C1696f fVar = this.f5353a;
            if (qVar != fVar.f5204d && qVar != fVar.f5206e) {
                if (nVar == null) {
                    nVar = new C1761n(qVar, i2);
                    arrayList.add(nVar);
                }
                qVar.f5400c = nVar;
                nVar.f5389b.add(qVar);
                for (C1750d next : qVar.f5405h.f5371k) {
                    if (next instanceof C1753g) {
                        mo6020a((C1753g) next, i, 0, gVar2, arrayList, nVar);
                    }
                }
                for (C1750d next2 : qVar.f5406i.f5371k) {
                    if (next2 instanceof C1753g) {
                        mo6020a((C1753g) next2, i, 1, gVar2, arrayList, nVar);
                    }
                }
                if (i == 1 && (qVar instanceof C1762o)) {
                    for (C1750d next3 : ((C1762o) qVar).f5390k.f5371k) {
                        if (next3 instanceof C1753g) {
                            mo6020a((C1753g) next3, i, 2, gVar2, arrayList, nVar);
                        }
                    }
                }
                for (C1753g a : qVar.f5405h.f5372l) {
                    mo6020a(a, i, 0, gVar2, arrayList, nVar);
                }
                for (C1753g a2 : qVar.f5406i.f5372l) {
                    mo6020a(a2, i, 1, gVar2, arrayList, nVar);
                }
                if (i == 1 && (qVar instanceof C1762o)) {
                    for (C1753g a3 : ((C1762o) qVar).f5390k.f5372l) {
                        mo6020a(a3, i, 2, gVar2, arrayList, nVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0184, code lost:
        if (r4[3].f5159f != null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        if (r2.f5231r == 0) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0117, code lost:
        if (r9[1].f5159f != null) goto L_0x011b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6021b(p111s.C1696f r17) {
        /*
            r16 = this;
            r0 = r17
            java.util.ArrayList<s.e> r1 = r0.f5270q0
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x022b
            java.lang.Object r2 = r1.next()
            s.e r2 = (p111s.C1695e) r2
            int[] r4 = r2.f5191T
            r5 = r4[r3]
            r10 = 1
            r4 = r4[r10]
            int r6 = r2.f5213h0
            r7 = 8
            if (r6 != r7) goto L_0x0024
            goto L_0x0107
        L_0x0024:
            float r6 = r2.f5235v
            r11 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            r8 = 3
            r9 = 2
            if (r7 >= 0) goto L_0x0032
            if (r5 != r8) goto L_0x0032
            r2.f5230q = r9
        L_0x0032:
            float r7 = r2.f5238y
            int r12 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r12 >= 0) goto L_0x003c
            if (r4 != r8) goto L_0x003c
            r2.f5231r = r9
        L_0x003c:
            float r12 = r2.f5195X
            r13 = 0
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x0063
            if (r5 != r8) goto L_0x004c
            if (r4 == r9) goto L_0x0049
            if (r4 != r10) goto L_0x004c
        L_0x0049:
            r2.f5230q = r8
            goto L_0x0063
        L_0x004c:
            if (r4 != r8) goto L_0x0053
            if (r5 == r9) goto L_0x0061
            if (r5 != r10) goto L_0x0053
            goto L_0x0061
        L_0x0053:
            if (r5 != r8) goto L_0x0063
            if (r4 != r8) goto L_0x0063
            int r12 = r2.f5230q
            if (r12 != 0) goto L_0x005d
            r2.f5230q = r8
        L_0x005d:
            int r12 = r2.f5231r
            if (r12 != 0) goto L_0x0063
        L_0x0061:
            r2.f5231r = r8
        L_0x0063:
            if (r5 != r8) goto L_0x0077
            int r12 = r2.f5230q
            if (r12 != r10) goto L_0x0077
            s.d r12 = r2.f5180I
            s.d r12 = r12.f5159f
            if (r12 == 0) goto L_0x0075
            s.d r12 = r2.f5182K
            s.d r12 = r12.f5159f
            if (r12 != 0) goto L_0x0077
        L_0x0075:
            r12 = r9
            goto L_0x0078
        L_0x0077:
            r12 = r5
        L_0x0078:
            if (r4 != r8) goto L_0x008c
            int r5 = r2.f5231r
            if (r5 != r10) goto L_0x008c
            s.d r5 = r2.f5181J
            s.d r5 = r5.f5159f
            if (r5 == 0) goto L_0x008a
            s.d r5 = r2.f5183L
            s.d r5 = r5.f5159f
            if (r5 != 0) goto L_0x008c
        L_0x008a:
            r13 = r9
            goto L_0x008d
        L_0x008c:
            r13 = r4
        L_0x008d:
            t.m r4 = r2.f5204d
            r4.f5401d = r12
            int r5 = r2.f5230q
            r4.f5398a = r5
            t.o r4 = r2.f5206e
            r4.f5401d = r13
            int r14 = r2.f5231r
            r4.f5398a = r14
            r4 = 4
            if (r12 == r4) goto L_0x00a4
            if (r12 == r10) goto L_0x00a4
            if (r12 != r9) goto L_0x00ac
        L_0x00a4:
            if (r13 == r4) goto L_0x01db
            if (r13 == r10) goto L_0x01db
            if (r13 != r9) goto L_0x00ac
            goto L_0x01db
        L_0x00ac:
            r15 = 1056964608(0x3f000000, float:0.5)
            if (r12 != r8) goto L_0x011b
            if (r13 == r9) goto L_0x00b4
            if (r13 != r10) goto L_0x011b
        L_0x00b4:
            if (r5 != r8) goto L_0x00d0
            if (r13 != r9) goto L_0x00c2
            r7 = 0
            r9 = 0
            r8 = 2
            r4 = r16
            r5 = r2
            r6 = r8
            r4.mo6025f(r5, r6, r7, r8, r9)
        L_0x00c2:
            int r3 = r2.mo5929l()
            float r4 = (float) r3
            float r5 = r2.f5195X
            float r4 = r4 * r5
            float r4 = r4 + r15
            int r4 = (int) r4
            r9 = r3
            r7 = r4
            r8 = r10
            goto L_0x0101
        L_0x00d0:
            if (r5 != r10) goto L_0x00e6
            r7 = 0
            r9 = 0
            r6 = 2
            r4 = r16
            r5 = r2
            r8 = r13
            r4.mo6025f(r5, r6, r7, r8, r9)
            t.m r3 = r2.f5204d
            t.h r3 = r3.f5402e
            int r2 = r2.mo5935r()
            goto L_0x01d7
        L_0x00e6:
            if (r5 != r9) goto L_0x010b
            int[] r11 = r0.f5191T
            r9 = r11[r3]
            if (r9 == r10) goto L_0x00f2
            r9 = r11[r3]
            if (r9 != r4) goto L_0x011b
        L_0x00f2:
            int r3 = r17.mo5935r()
            float r3 = (float) r3
            float r6 = r6 * r3
            float r6 = r6 + r15
            int r3 = (int) r6
            int r4 = r2.mo5929l()
            r7 = r3
            r9 = r4
            r8 = r13
        L_0x0101:
            r6 = 1
            r4 = r16
            r5 = r2
            goto L_0x0210
        L_0x0107:
            r2.f5198a = r10
            goto L_0x0008
        L_0x010b:
            s.d[] r9 = r2.f5188Q
            r11 = r9[r3]
            s.d r11 = r11.f5159f
            if (r11 == 0) goto L_0x0186
            r9 = r9[r10]
            s.d r9 = r9.f5159f
            if (r9 != 0) goto L_0x011b
            goto L_0x0186
        L_0x011b:
            if (r13 != r8) goto L_0x018c
            r9 = 2
            if (r12 == r9) goto L_0x0122
            if (r12 != r10) goto L_0x018c
        L_0x0122:
            if (r14 != r8) goto L_0x014a
            if (r12 != r9) goto L_0x0130
            r7 = 0
            r9 = 0
            r8 = 2
            r4 = r16
            r5 = r2
            r6 = r8
            r4.mo6025f(r5, r6, r7, r8, r9)
        L_0x0130:
            int r7 = r2.mo5935r()
            float r3 = r2.f5195X
            int r4 = r2.f5196Y
            r5 = -1
            if (r4 != r5) goto L_0x013f
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
        L_0x013f:
            float r4 = (float) r7
            float r4 = r4 * r3
            float r4 = r4 + r15
            int r9 = (int) r4
            r8 = 1
            r4 = r16
            r5 = r2
            r6 = r8
            goto L_0x0210
        L_0x014a:
            if (r14 != r10) goto L_0x0158
            r7 = 0
            r9 = 0
            r8 = 2
            r4 = r16
            r5 = r2
            r6 = r12
            r4.mo6025f(r5, r6, r7, r8, r9)
            goto L_0x01cf
        L_0x0158:
            r9 = 2
            if (r14 != r9) goto L_0x0177
            int[] r9 = r0.f5191T
            r11 = r9[r10]
            if (r11 == r10) goto L_0x0165
            r9 = r9[r10]
            if (r9 != r4) goto L_0x018c
        L_0x0165:
            int r3 = r2.mo5935r()
            int r4 = r17.mo5929l()
            float r4 = (float) r4
            float r7 = r7 * r4
            float r7 = r7 + r15
            int r4 = (int) r7
            r7 = r3
            r9 = r4
            r8 = r10
            r6 = r12
            goto L_0x020d
        L_0x0177:
            s.d[] r4 = r2.f5188Q
            r9 = 2
            r11 = r4[r9]
            s.d r9 = r11.f5159f
            if (r9 == 0) goto L_0x0186
            r4 = r4[r8]
            s.d r4 = r4.f5159f
            if (r4 != 0) goto L_0x018c
        L_0x0186:
            r7 = r3
            r9 = r7
            r8 = r13
            r6 = 2
            goto L_0x020d
        L_0x018c:
            if (r12 != r8) goto L_0x0008
            if (r13 != r8) goto L_0x0008
            if (r5 == r10) goto L_0x01bb
            if (r14 != r10) goto L_0x0195
            goto L_0x01bb
        L_0x0195:
            r4 = 2
            if (r14 != r4) goto L_0x0008
            if (r5 != r4) goto L_0x0008
            int[] r4 = r0.f5191T
            r3 = r4[r3]
            if (r3 != r10) goto L_0x0008
            r3 = r4[r10]
            if (r3 != r10) goto L_0x0008
            int r3 = r17.mo5935r()
            float r3 = (float) r3
            float r6 = r6 * r3
            float r6 = r6 + r15
            int r3 = (int) r6
            int r4 = r17.mo5929l()
            float r4 = (float) r4
            float r7 = r7 * r4
            float r7 = r7 + r15
            int r9 = (int) r7
            r8 = 1
            r4 = r16
            r5 = r2
            r6 = r8
            r7 = r3
            goto L_0x0210
        L_0x01bb:
            r7 = 0
            r9 = 0
            r8 = 2
            r4 = r16
            r5 = r2
            r6 = r8
            r4.mo6025f(r5, r6, r7, r8, r9)
            t.m r3 = r2.f5204d
            t.h r3 = r3.f5402e
            int r4 = r2.mo5935r()
            r3.f5382m = r4
        L_0x01cf:
            t.o r3 = r2.f5206e
            t.h r3 = r3.f5402e
            int r2 = r2.mo5929l()
        L_0x01d7:
            r3.f5382m = r2
            goto L_0x0008
        L_0x01db:
            int r3 = r2.mo5935r()
            if (r12 != r4) goto L_0x01f2
            int r3 = r17.mo5935r()
            s.d r5 = r2.f5180I
            int r5 = r5.f5160g
            int r3 = r3 - r5
            s.d r5 = r2.f5182K
            int r5 = r5.f5160g
            int r3 = r3 - r5
            r7 = r3
            r6 = r10
            goto L_0x01f4
        L_0x01f2:
            r7 = r3
            r6 = r12
        L_0x01f4:
            int r3 = r2.mo5929l()
            if (r13 != r4) goto L_0x020b
            int r3 = r17.mo5929l()
            s.d r4 = r2.f5181J
            int r4 = r4.f5160g
            int r3 = r3 - r4
            s.d r4 = r2.f5183L
            int r4 = r4.f5160g
            int r3 = r3 - r4
            r9 = r3
            r8 = r10
            goto L_0x020d
        L_0x020b:
            r9 = r3
            r8 = r13
        L_0x020d:
            r4 = r16
            r5 = r2
        L_0x0210:
            r4.mo6025f(r5, r6, r7, r8, r9)
            t.m r3 = r2.f5204d
            t.h r3 = r3.f5402e
            int r4 = r2.mo5935r()
            r3.mo6028c(r4)
            t.o r3 = r2.f5206e
            t.h r3 = r3.f5402e
            int r4 = r2.mo5929l()
            r3.mo6028c(r4)
            goto L_0x0107
        L_0x022b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p117t.C1752f.mo6021b(s.f):boolean");
    }

    /* renamed from: c */
    public void mo6022c() {
        Object obj;
        ArrayList<C1765q> arrayList = this.f5357e;
        arrayList.clear();
        this.f5356d.f5204d.mo6014f();
        this.f5356d.f5206e.mo6014f();
        arrayList.add(this.f5356d.f5204d);
        arrayList.add(this.f5356d.f5206e);
        Iterator<C1695e> it = this.f5356d.f5270q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C1695e next = it.next();
            if (next instanceof C1697g) {
                obj = new C1758k(next);
            } else {
                if (next.mo5941x()) {
                    if (next.f5200b == null) {
                        next.f5200b = new C1749c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f5200b);
                } else {
                    arrayList.add(next.f5204d);
                }
                if (next.mo5942y()) {
                    if (next.f5202c == null) {
                        next.f5202c = new C1749c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f5202c);
                } else {
                    arrayList.add(next.f5206e);
                }
                if (next instanceof C1699i) {
                    obj = new C1759l(next);
                }
            }
            arrayList.add(obj);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<C1765q> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo6014f();
        }
        Iterator<C1765q> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C1765q next2 = it3.next();
            if (next2.f5399b != this.f5356d) {
                next2.mo6012d();
            }
        }
        this.f5360h.clear();
        C1761n.f5387c = 0;
        mo6024e(this.f5353a.f5204d, 0, this.f5360h);
        mo6024e(this.f5353a.f5206e, 1, this.f5360h);
        this.f5354b = false;
    }

    /* renamed from: d */
    public final int mo6023d(C1696f fVar, int i) {
        long j;
        long j2;
        C1752f fVar2 = this;
        C1696f fVar3 = fVar;
        int i2 = i;
        int size = fVar2.f5360h.size();
        long j3 = 0;
        int i3 = 0;
        long j4 = 0;
        while (i3 < size) {
            C1761n nVar = fVar2.f5360h.get(i3);
            C1765q qVar = nVar.f5388a;
            if (qVar instanceof C1749c) {
                if (((C1749c) qVar).f5403f != i2) {
                    j3 = Math.max(j3, j4);
                    i3++;
                    j4 = 0;
                    fVar2 = this;
                    fVar3 = fVar;
                }
            } else if (i2 == 0) {
                if (!(qVar instanceof C1760m)) {
                    j3 = Math.max(j3, j4);
                    i3++;
                    j4 = 0;
                    fVar2 = this;
                    fVar3 = fVar;
                }
            } else if (!(qVar instanceof C1762o)) {
                j3 = Math.max(j3, j4);
                i3++;
                j4 = 0;
                fVar2 = this;
                fVar3 = fVar;
            }
            C1753g gVar = (i2 == 0 ? fVar3.f5204d : fVar3.f5206e).f5405h;
            C1753g gVar2 = (i2 == 0 ? fVar3.f5204d : fVar3.f5206e).f5406i;
            boolean contains = qVar.f5405h.f5372l.contains(gVar);
            boolean contains2 = nVar.f5388a.f5406i.f5372l.contains(gVar2);
            long j5 = nVar.f5388a.mo6015j();
            if (!contains || !contains2) {
                C1765q qVar2 = nVar.f5388a;
                if (contains) {
                    C1753g gVar3 = qVar2.f5405h;
                    j2 = nVar.mo6036b(gVar3, (long) gVar3.f5366f);
                    j = ((long) nVar.f5388a.f5405h.f5366f) + j5;
                } else if (contains2) {
                    C1753g gVar4 = qVar2.f5406i;
                    long a = nVar.mo6035a(gVar4, (long) gVar4.f5366f);
                    j = ((long) (-nVar.f5388a.f5406i.f5366f)) + j5;
                    j2 = -a;
                } else {
                    j4 = (qVar2.mo6015j() + ((long) qVar2.f5405h.f5366f)) - ((long) nVar.f5388a.f5406i.f5366f);
                    j3 = Math.max(j3, j4);
                    i3++;
                    j4 = 0;
                    fVar2 = this;
                    fVar3 = fVar;
                }
                j4 = Math.max(j2, j);
                j3 = Math.max(j3, j4);
                i3++;
                j4 = 0;
                fVar2 = this;
                fVar3 = fVar;
            } else {
                long b = nVar.mo6036b(nVar.f5388a.f5405h, j4);
                long a2 = nVar.mo6035a(nVar.f5388a.f5406i, j4);
                long j6 = b - j5;
                C1765q qVar3 = nVar.f5388a;
                int i4 = qVar3.f5406i.f5366f;
                if (j6 >= ((long) (-i4))) {
                    j6 += (long) i4;
                }
                long j7 = (long) qVar3.f5405h.f5366f;
                long j8 = ((-a2) - j5) - j7;
                if (j8 >= j7) {
                    j8 -= j7;
                }
                C1695e eVar = qVar3.f5399b;
                Objects.requireNonNull(eVar);
                float f = i2 == 0 ? eVar.f5207e0 : i2 == 1 ? eVar.f5209f0 : -1.0f;
                float f2 = (float) (f > 0.0f ? (long) ((((float) j6) / (1.0f - f)) + (((float) j8) / f)) : 0);
                long a3 = ((long) ((f2 * f) + 0.5f)) + j5 + ((long) C1751e.m4875a(1.0f, f, f2, 0.5f));
                C1765q qVar4 = nVar.f5388a;
                j4 = (((long) qVar4.f5405h.f5366f) + a3) - ((long) qVar4.f5406i.f5366f);
                j3 = Math.max(j3, j4);
                i3++;
                j4 = 0;
                fVar2 = this;
                fVar3 = fVar;
            }
        }
        return (int) j3;
    }

    /* renamed from: e */
    public final void mo6024e(C1765q qVar, int i, ArrayList<C1761n> arrayList) {
        for (C1750d next : qVar.f5405h.f5371k) {
            if (next instanceof C1753g) {
                mo6020a((C1753g) next, i, 0, qVar.f5406i, arrayList, (C1761n) null);
            } else if (next instanceof C1765q) {
                mo6020a(((C1765q) next).f5405h, i, 0, qVar.f5406i, arrayList, (C1761n) null);
            }
        }
        for (C1750d next2 : qVar.f5406i.f5371k) {
            if (next2 instanceof C1753g) {
                mo6020a((C1753g) next2, i, 1, qVar.f5405h, arrayList, (C1761n) null);
            } else if (next2 instanceof C1765q) {
                mo6020a(((C1765q) next2).f5406i, i, 1, qVar.f5405h, arrayList, (C1761n) null);
            }
        }
        if (i == 1) {
            for (C1750d next3 : ((C1762o) qVar).f5390k.f5371k) {
                if (next3 instanceof C1753g) {
                    mo6020a((C1753g) next3, i, 2, (C1753g) null, arrayList, (C1761n) null);
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo6025f(C1695e eVar, int i, int i2, int i3, int i4) {
        C1746b.C1747a aVar = this.f5359g;
        aVar.f5341a = i;
        aVar.f5342b = i3;
        aVar.f5343c = i2;
        aVar.f5344d = i4;
        ((ConstraintLayout.C0235b) this.f5358f).mo1284b(eVar, aVar);
        eVar.mo5918N(this.f5359g.f5345e);
        eVar.mo5913I(this.f5359g.f5346f);
        C1746b.C1747a aVar2 = this.f5359g;
        eVar.f5175D = aVar2.f5348h;
        eVar.mo5910F(aVar2.f5347g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006b, code lost:
        if (r10 == 3) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0085, code lost:
        if (r8 == 3) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        r2.mo6028c(r3);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6026g() {
        /*
            r12 = this;
            s.f r0 = r12.f5353a
            java.util.ArrayList<s.e> r0 = r0.f5270q0
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a0
            java.lang.Object r1 = r0.next()
            s.e r1 = (p111s.C1695e) r1
            boolean r2 = r1.f5198a
            if (r2 == 0) goto L_0x0019
            goto L_0x0008
        L_0x0019:
            int[] r2 = r1.f5191T
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.f5230q
            int r4 = r1.f5231r
            r5 = 2
            r11 = 3
            if (r8 == r5) goto L_0x0030
            if (r8 != r11) goto L_0x002e
            if (r2 != r9) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r2 = r3
            goto L_0x0031
        L_0x0030:
            r2 = r9
        L_0x0031:
            if (r10 == r5) goto L_0x0037
            if (r10 != r11) goto L_0x0038
            if (r4 != r9) goto L_0x0038
        L_0x0037:
            r3 = r9
        L_0x0038:
            t.m r4 = r1.f5204d
            t.h r4 = r4.f5402e
            boolean r5 = r4.f5370j
            t.o r6 = r1.f5206e
            t.h r6 = r6.f5402e
            boolean r7 = r6.f5370j
            if (r5 == 0) goto L_0x0054
            if (r7 == 0) goto L_0x0054
            int r5 = r4.f5367g
            int r7 = r6.f5367g
            r6 = 1
            r2 = r12
            r3 = r1
            r4 = r6
            r2.mo6025f(r3, r4, r5, r6, r7)
            goto L_0x008d
        L_0x0054:
            if (r5 == 0) goto L_0x006e
            if (r3 == 0) goto L_0x006e
            int r5 = r4.f5367g
            int r7 = r6.f5367g
            r4 = 1
            r6 = 2
            r2 = r12
            r3 = r1
            r2.mo6025f(r3, r4, r5, r6, r7)
            t.o r2 = r1.f5206e
            t.h r2 = r2.f5402e
            int r3 = r1.mo5929l()
            if (r10 != r11) goto L_0x008a
            goto L_0x0087
        L_0x006e:
            if (r7 == 0) goto L_0x008f
            if (r2 == 0) goto L_0x008f
            int r5 = r4.f5367g
            int r7 = r6.f5367g
            r4 = 2
            r6 = 1
            r2 = r12
            r3 = r1
            r2.mo6025f(r3, r4, r5, r6, r7)
            t.m r2 = r1.f5204d
            t.h r2 = r2.f5402e
            int r3 = r1.mo5935r()
            if (r8 != r11) goto L_0x008a
        L_0x0087:
            r2.f5382m = r3
            goto L_0x008f
        L_0x008a:
            r2.mo6028c(r3)
        L_0x008d:
            r1.f5198a = r9
        L_0x008f:
            boolean r2 = r1.f5198a
            if (r2 == 0) goto L_0x0008
            t.o r2 = r1.f5206e
            t.h r2 = r2.f5391l
            if (r2 == 0) goto L_0x0008
            int r1 = r1.f5201b0
            r2.mo6028c(r1)
            goto L_0x0008
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p117t.C1752f.mo6026g():void");
    }
}
