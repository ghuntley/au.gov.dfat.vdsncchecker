package p117t;

import p111s.C1693d;
import p111s.C1695e;

/* renamed from: t.q */
public abstract class C1765q implements C1750d {

    /* renamed from: a */
    public int f5398a;

    /* renamed from: b */
    public C1695e f5399b;

    /* renamed from: c */
    public C1761n f5400c;

    /* renamed from: d */
    public int f5401d;

    /* renamed from: e */
    public C1755h f5402e = new C1755h(this);

    /* renamed from: f */
    public int f5403f = 0;

    /* renamed from: g */
    public boolean f5404g = false;

    /* renamed from: h */
    public C1753g f5405h = new C1753g(this);

    /* renamed from: i */
    public C1753g f5406i = new C1753g(this);

    /* renamed from: j */
    public int f5407j = 1;

    public C1765q(C1695e eVar) {
        this.f5399b = eVar;
    }

    /* renamed from: a */
    public void mo6011a(C1750d dVar) {
    }

    /* renamed from: b */
    public final void mo6044b(C1753g gVar, C1753g gVar2, int i) {
        gVar.f5372l.add(gVar2);
        gVar.f5366f = i;
        gVar2.f5371k.add(gVar);
    }

    /* renamed from: c */
    public final void mo6045c(C1753g gVar, C1753g gVar2, int i, C1755h hVar) {
        gVar.f5372l.add(gVar2);
        gVar.f5372l.add(this.f5402e);
        gVar.f5368h = i;
        gVar.f5369i = hVar;
        gVar2.f5371k.add(gVar);
        hVar.f5371k.add(gVar);
    }

    /* renamed from: d */
    public abstract void mo6012d();

    /* renamed from: e */
    public abstract void mo6013e();

    /* renamed from: f */
    public abstract void mo6014f();

    /* renamed from: g */
    public final int mo6046g(int i, int i2) {
        int i3;
        if (i2 == 0) {
            C1695e eVar = this.f5399b;
            int i4 = eVar.f5234u;
            i3 = Math.max(eVar.f5233t, i);
            if (i4 > 0) {
                i3 = Math.min(i4, i);
            }
            if (i3 == i) {
                return i;
            }
        } else {
            C1695e eVar2 = this.f5399b;
            int i5 = eVar2.f5237x;
            int max = Math.max(eVar2.f5236w, i);
            if (i5 > 0) {
                max = Math.min(i5, i);
            }
            if (i3 == i) {
                return i;
            }
        }
        return i3;
    }

    /* renamed from: h */
    public final C1753g mo6047h(C1693d dVar) {
        C1765q qVar;
        C1765q qVar2;
        C1693d dVar2 = dVar.f5159f;
        if (dVar2 == null) {
            return null;
        }
        C1695e eVar = dVar2.f5157d;
        int ordinal = dVar2.f5158e.ordinal();
        if (ordinal == 1) {
            qVar = eVar.f5204d;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                qVar2 = eVar.f5204d;
            } else if (ordinal == 4) {
                qVar2 = eVar.f5206e;
            } else if (ordinal != 5) {
                return null;
            } else {
                return eVar.f5206e.f5390k;
            }
            return qVar2.f5406i;
        } else {
            qVar = eVar.f5206e;
        }
        return qVar.f5405h;
    }

    /* renamed from: i */
    public final C1753g mo6048i(C1693d dVar, int i) {
        C1693d dVar2 = dVar.f5159f;
        if (dVar2 == null) {
            return null;
        }
        C1695e eVar = dVar2.f5157d;
        C1765q qVar = i == 0 ? eVar.f5204d : eVar.f5206e;
        int ordinal = dVar2.f5158e.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return qVar.f5405h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return qVar.f5406i;
        }
        return null;
    }

    /* renamed from: j */
    public long mo6015j() {
        C1755h hVar = this.f5402e;
        if (hVar.f5370j) {
            return (long) hVar.f5367g;
        }
        return 0;
    }

    /* renamed from: k */
    public abstract boolean mo6016k();

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r9.f5398a == 3) goto L_0x00a9;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6049l(p111s.C1693d r13, p111s.C1693d r14, int r15) {
        /*
            r12 = this;
            t.g r0 = r12.mo6047h(r13)
            t.g r1 = r12.mo6047h(r14)
            boolean r2 = r0.f5370j
            if (r2 == 0) goto L_0x00ea
            boolean r2 = r1.f5370j
            if (r2 != 0) goto L_0x0012
            goto L_0x00ea
        L_0x0012:
            int r2 = r0.f5367g
            int r13 = r13.mo5899d()
            int r13 = r13 + r2
            int r2 = r1.f5367g
            int r14 = r14.mo5899d()
            int r2 = r2 - r14
            int r14 = r2 - r13
            t.h r3 = r12.f5402e
            boolean r4 = r3.f5370j
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r4 != 0) goto L_0x00a9
            int r4 = r12.f5401d
            r6 = 3
            if (r4 != r6) goto L_0x00a9
            int r4 = r12.f5398a
            if (r4 == 0) goto L_0x00a1
            r7 = 1
            if (r4 == r7) goto L_0x0091
            r8 = 2
            if (r4 == r8) goto L_0x0070
            if (r4 == r6) goto L_0x003d
            goto L_0x00a9
        L_0x003d:
            s.e r4 = r12.f5399b
            t.m r8 = r4.f5204d
            int r9 = r8.f5401d
            if (r9 != r6) goto L_0x0054
            int r9 = r8.f5398a
            if (r9 != r6) goto L_0x0054
            t.o r9 = r4.f5206e
            int r10 = r9.f5401d
            if (r10 != r6) goto L_0x0054
            int r9 = r9.f5398a
            if (r9 != r6) goto L_0x0054
            goto L_0x00a9
        L_0x0054:
            if (r15 != 0) goto L_0x0058
            t.o r8 = r4.f5206e
        L_0x0058:
            t.h r6 = r8.f5402e
            boolean r8 = r6.f5370j
            if (r8 == 0) goto L_0x00a9
            float r4 = r4.f5195X
            if (r15 != r7) goto L_0x0069
            int r6 = r6.f5367g
            float r6 = (float) r6
            float r6 = r6 / r4
            float r6 = r6 + r5
            int r4 = (int) r6
            goto L_0x00a6
        L_0x0069:
            int r6 = r6.f5367g
            float r6 = (float) r6
            float r4 = r4 * r6
            float r4 = r4 + r5
            int r4 = (int) r4
            goto L_0x00a6
        L_0x0070:
            s.e r4 = r12.f5399b
            s.e r6 = r4.f5192U
            if (r6 == 0) goto L_0x00a9
            if (r15 != 0) goto L_0x007b
            t.m r6 = r6.f5204d
            goto L_0x007d
        L_0x007b:
            t.o r6 = r6.f5206e
        L_0x007d:
            t.h r6 = r6.f5402e
            boolean r7 = r6.f5370j
            if (r7 == 0) goto L_0x00a9
            if (r15 != 0) goto L_0x0088
            float r4 = r4.f5235v
            goto L_0x008a
        L_0x0088:
            float r4 = r4.f5238y
        L_0x008a:
            int r6 = r6.f5367g
            float r6 = (float) r6
            float r6 = r6 * r4
            float r6 = r6 + r5
            int r4 = (int) r6
            goto L_0x00a2
        L_0x0091:
            int r3 = r3.f5382m
            int r3 = r12.mo6046g(r3, r15)
            t.h r4 = r12.f5402e
            int r3 = java.lang.Math.min(r3, r14)
            r11 = r4
            r4 = r3
            r3 = r11
            goto L_0x00a6
        L_0x00a1:
            r4 = r14
        L_0x00a2:
            int r4 = r12.mo6046g(r4, r15)
        L_0x00a6:
            r3.mo6028c(r4)
        L_0x00a9:
            t.h r3 = r12.f5402e
            boolean r4 = r3.f5370j
            if (r4 != 0) goto L_0x00b0
            return
        L_0x00b0:
            int r3 = r3.f5367g
            if (r3 != r14) goto L_0x00bf
            t.g r14 = r12.f5405h
            r14.mo6028c(r13)
            t.g r13 = r12.f5406i
            r13.mo6028c(r2)
            return
        L_0x00bf:
            s.e r14 = r12.f5399b
            if (r15 != 0) goto L_0x00c6
            float r14 = r14.f5207e0
            goto L_0x00c8
        L_0x00c6:
            float r14 = r14.f5209f0
        L_0x00c8:
            if (r0 != r1) goto L_0x00cf
            int r13 = r0.f5367g
            int r2 = r1.f5367g
            r14 = r5
        L_0x00cf:
            int r2 = r2 - r13
            int r2 = r2 - r3
            t.g r15 = r12.f5405h
            float r13 = (float) r13
            float r13 = r13 + r5
            float r0 = (float) r2
            float r0 = r0 * r14
            float r0 = r0 + r13
            int r13 = (int) r0
            r15.mo6028c(r13)
            t.g r13 = r12.f5406i
            t.g r14 = r12.f5405h
            int r14 = r14.f5367g
            t.h r15 = r12.f5402e
            int r15 = r15.f5367g
            int r14 = r14 + r15
            r13.mo6028c(r14)
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p117t.C1765q.mo6049l(s.d, s.d, int):void");
    }
}
