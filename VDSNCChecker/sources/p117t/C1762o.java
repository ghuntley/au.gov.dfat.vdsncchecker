package p117t;

import p000a.C0001b;
import p099q.C1600i;
import p111s.C1695e;
import p117t.C1753g;

/* renamed from: t.o */
public class C1762o extends C1765q {

    /* renamed from: k */
    public C1753g f5390k;

    /* renamed from: l */
    public C1755h f5391l = null;

    public C1762o(C1695e eVar) {
        super(eVar);
        C1753g gVar = new C1753g(this);
        this.f5390k = gVar;
        this.f5405h.f5365e = C1753g.C1754a.TOP;
        this.f5406i.f5365e = C1753g.C1754a.BOTTOM;
        gVar.f5365e = C1753g.C1754a.BASELINE;
        this.f5403f = 1;
    }

    /* renamed from: a */
    public void mo6011a(C1750d dVar) {
        int i;
        float f;
        if (C1600i.m4504a(this.f5407j) != 3) {
            C1755h hVar = this.f5402e;
            if (hVar.f5363c && !hVar.f5370j && this.f5401d == 3) {
                C1695e eVar = this.f5399b;
                int i2 = eVar.f5231r;
                if (i2 == 2) {
                    C1695e eVar2 = eVar.f5192U;
                    if (eVar2 != null) {
                        C1755h hVar2 = eVar2.f5206e.f5402e;
                        if (hVar2.f5370j) {
                            f = ((float) hVar2.f5367g) * eVar.f5238y;
                        }
                    }
                } else if (i2 == 3) {
                    C1755h hVar3 = eVar.f5204d.f5402e;
                    if (hVar3.f5370j) {
                        int i3 = eVar.f5196Y;
                        if (i3 != -1) {
                            if (i3 == 0) {
                                f = ((float) hVar3.f5367g) * eVar.f5195X;
                            } else if (i3 != 1) {
                                i = 0;
                                hVar.mo6028c(i);
                            }
                        }
                        f = ((float) hVar3.f5367g) / eVar.f5195X;
                    }
                }
                i = (int) (f + 0.5f);
                hVar.mo6028c(i);
            }
            C1753g gVar = this.f5405h;
            if (gVar.f5363c) {
                C1753g gVar2 = this.f5406i;
                if (gVar2.f5363c) {
                    if (!gVar.f5370j || !gVar2.f5370j || !this.f5402e.f5370j) {
                        if (!this.f5402e.f5370j && this.f5401d == 3) {
                            C1695e eVar3 = this.f5399b;
                            if (eVar3.f5230q == 0 && !eVar3.mo5942y()) {
                                int i4 = this.f5405h.f5372l.get(0).f5367g;
                                C1753g gVar3 = this.f5405h;
                                int i5 = i4 + gVar3.f5366f;
                                int i6 = this.f5406i.f5372l.get(0).f5367g + this.f5406i.f5366f;
                                gVar3.mo6028c(i5);
                                this.f5406i.mo6028c(i6);
                                this.f5402e.mo6028c(i6 - i5);
                                return;
                            }
                        }
                        if (!this.f5402e.f5370j && this.f5401d == 3 && this.f5398a == 1 && this.f5405h.f5372l.size() > 0 && this.f5406i.f5372l.size() > 0) {
                            int i7 = (this.f5406i.f5372l.get(0).f5367g + this.f5406i.f5366f) - (this.f5405h.f5372l.get(0).f5367g + this.f5405h.f5366f);
                            C1755h hVar4 = this.f5402e;
                            int i8 = hVar4.f5382m;
                            if (i7 < i8) {
                                hVar4.mo6028c(i7);
                            } else {
                                hVar4.mo6028c(i8);
                            }
                        }
                        if (this.f5402e.f5370j && this.f5405h.f5372l.size() > 0 && this.f5406i.f5372l.size() > 0) {
                            C1753g gVar4 = this.f5405h.f5372l.get(0);
                            C1753g gVar5 = this.f5406i.f5372l.get(0);
                            int i9 = gVar4.f5367g;
                            C1753g gVar6 = this.f5405h;
                            int i10 = gVar6.f5366f + i9;
                            int i11 = gVar5.f5367g;
                            int i12 = this.f5406i.f5366f + i11;
                            float f2 = this.f5399b.f5209f0;
                            if (gVar4 == gVar5) {
                                f2 = 0.5f;
                            } else {
                                i9 = i10;
                                i11 = i12;
                            }
                            gVar6.mo6028c((int) ((((float) ((i11 - i9) - this.f5402e.f5367g)) * f2) + ((float) i9) + 0.5f));
                            this.f5406i.mo6028c(this.f5405h.f5367g + this.f5402e.f5367g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C1695e eVar4 = this.f5399b;
        mo6049l(eVar4.f5181J, eVar4.f5183L, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x030d, code lost:
        if (r9.f5399b.f5175D != false) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0360, code lost:
        if (r0.f5401d == 3) goto L_0x0410;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0399, code lost:
        if (r9.f5399b.f5175D != false) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x040e, code lost:
        if (r0.f5401d == 3) goto L_0x0410;
     */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6012d() {
        /*
            r9 = this;
            s.e r0 = r9.f5399b
            boolean r1 = r0.f5198a
            if (r1 == 0) goto L_0x000f
            t.h r1 = r9.f5402e
            int r0 = r0.mo5929l()
            r1.mo6028c(r0)
        L_0x000f:
            t.h r0 = r9.f5402e
            boolean r0 = r0.f5370j
            r1 = 3
            r2 = 1
            r3 = 4
            if (r0 != 0) goto L_0x008e
            s.e r0 = r9.f5399b
            int r0 = r0.mo5934q()
            r9.f5401d = r0
            s.e r0 = r9.f5399b
            boolean r0 = r0.f5175D
            if (r0 == 0) goto L_0x002d
            t.a r0 = new t.a
            r0.<init>(r9)
            r9.f5391l = r0
        L_0x002d:
            int r0 = r9.f5401d
            if (r0 == r1) goto L_0x00c2
            if (r0 != r3) goto L_0x007e
            s.e r0 = r9.f5399b
            s.e r0 = r0.f5192U
            if (r0 == 0) goto L_0x007e
            int r4 = r0.mo5934q()
            if (r4 != r2) goto L_0x007e
            int r1 = r0.mo5929l()
            s.e r2 = r9.f5399b
            s.d r2 = r2.f5181J
            int r2 = r2.mo5899d()
            int r1 = r1 - r2
            s.e r2 = r9.f5399b
            s.d r2 = r2.f5183L
            int r2 = r2.mo5899d()
            int r1 = r1 - r2
            t.g r2 = r9.f5405h
            t.o r3 = r0.f5206e
            t.g r3 = r3.f5405h
            s.e r4 = r9.f5399b
            s.d r4 = r4.f5181J
            int r4 = r4.mo5899d()
            r9.mo6044b(r2, r3, r4)
            t.g r2 = r9.f5406i
            t.o r0 = r0.f5206e
            t.g r0 = r0.f5406i
            s.e r3 = r9.f5399b
            s.d r3 = r3.f5183L
            int r3 = r3.mo5899d()
            int r3 = -r3
            r9.mo6044b(r2, r0, r3)
            t.h r0 = r9.f5402e
            r0.mo6028c(r1)
            return
        L_0x007e:
            int r0 = r9.f5401d
            if (r0 != r2) goto L_0x00c2
            t.h r0 = r9.f5402e
            s.e r4 = r9.f5399b
            int r4 = r4.mo5929l()
            r0.mo6028c(r4)
            goto L_0x00c2
        L_0x008e:
            int r0 = r9.f5401d
            if (r0 != r3) goto L_0x00c2
            s.e r0 = r9.f5399b
            s.e r0 = r0.f5192U
            if (r0 == 0) goto L_0x00c2
            int r4 = r0.mo5934q()
            if (r4 != r2) goto L_0x00c2
            t.g r1 = r9.f5405h
            t.o r2 = r0.f5206e
            t.g r2 = r2.f5405h
            s.e r3 = r9.f5399b
            s.d r3 = r3.f5181J
            int r3 = r3.mo5899d()
            r9.mo6044b(r1, r2, r3)
            t.g r1 = r9.f5406i
            t.o r0 = r0.f5206e
            t.g r0 = r0.f5406i
            s.e r2 = r9.f5399b
            s.d r2 = r2.f5183L
            int r2 = r2.mo5899d()
            int r2 = -r2
            r9.mo6044b(r1, r0, r2)
            return
        L_0x00c2:
            t.h r0 = r9.f5402e
            boolean r4 = r0.f5370j
            r5 = 0
            r6 = 2
            if (r4 == 0) goto L_0x0243
            s.e r7 = r9.f5399b
            boolean r8 = r7.f5198a
            if (r8 == 0) goto L_0x0243
            s.d[] r0 = r7.f5188Q
            r4 = r0[r6]
            s.d r4 = r4.f5159f
            if (r4 == 0) goto L_0x015a
            r4 = r0[r1]
            s.d r4 = r4.f5159f
            if (r4 == 0) goto L_0x015a
            boolean r0 = r7.mo5942y()
            if (r0 == 0) goto L_0x0102
            t.g r0 = r9.f5405h
            s.e r2 = r9.f5399b
            s.d[] r2 = r2.f5188Q
            r2 = r2[r6]
            int r2 = r2.mo5899d()
            r0.f5366f = r2
            t.g r0 = r9.f5406i
            s.e r2 = r9.f5399b
            s.d[] r2 = r2.f5188Q
            r1 = r2[r1]
            int r1 = r1.mo5899d()
            int r1 = -r1
            r0.f5366f = r1
            goto L_0x0153
        L_0x0102:
            s.e r0 = r9.f5399b
            s.d[] r0 = r0.f5188Q
            r0 = r0[r6]
            t.g r0 = r9.mo6047h(r0)
            if (r0 == 0) goto L_0x0126
            t.g r3 = r9.f5405h
            s.e r4 = r9.f5399b
            s.d[] r4 = r4.f5188Q
            r4 = r4[r6]
            int r4 = r4.mo5899d()
            java.util.List<t.g> r5 = r3.f5372l
            r5.add(r0)
            r3.f5366f = r4
            java.util.List<t.d> r0 = r0.f5371k
            r0.add(r3)
        L_0x0126:
            s.e r0 = r9.f5399b
            s.d[] r0 = r0.f5188Q
            r0 = r0[r1]
            t.g r0 = r9.mo6047h(r0)
            if (r0 == 0) goto L_0x014b
            t.g r3 = r9.f5406i
            s.e r4 = r9.f5399b
            s.d[] r4 = r4.f5188Q
            r1 = r4[r1]
            int r1 = r1.mo5899d()
            int r1 = -r1
            java.util.List<t.g> r4 = r3.f5372l
            r4.add(r0)
            r3.f5366f = r1
            java.util.List<t.d> r0 = r0.f5371k
            r0.add(r3)
        L_0x014b:
            t.g r0 = r9.f5405h
            r0.f5362b = r2
            t.g r0 = r9.f5406i
            r0.f5362b = r2
        L_0x0153:
            s.e r0 = r9.f5399b
            boolean r1 = r0.f5175D
            if (r1 == 0) goto L_0x0438
            goto L_0x0191
        L_0x015a:
            r2 = r0[r6]
            s.d r2 = r2.f5159f
            if (r2 == 0) goto L_0x0197
            r0 = r0[r6]
            t.g r0 = r9.mo6047h(r0)
            if (r0 == 0) goto L_0x0438
            t.g r1 = r9.f5405h
            s.e r2 = r9.f5399b
            s.d[] r2 = r2.f5188Q
            r2 = r2[r6]
            int r2 = r2.mo5899d()
            java.util.List<t.g> r3 = r1.f5372l
            r3.add(r0)
            r1.f5366f = r2
            java.util.List<t.d> r0 = r0.f5371k
            r0.add(r1)
            t.g r0 = r9.f5406i
            t.g r1 = r9.f5405h
            t.h r2 = r9.f5402e
            int r2 = r2.f5367g
            r9.mo6044b(r0, r1, r2)
            s.e r0 = r9.f5399b
            boolean r1 = r0.f5175D
            if (r1 == 0) goto L_0x0438
        L_0x0191:
            t.g r1 = r9.f5390k
            t.g r2 = r9.f5405h
            goto L_0x023c
        L_0x0197:
            r2 = r0[r1]
            s.d r2 = r2.f5159f
            if (r2 == 0) goto L_0x01d1
            r0 = r0[r1]
            t.g r0 = r9.mo6047h(r0)
            if (r0 == 0) goto L_0x01ca
            t.g r2 = r9.f5406i
            s.e r3 = r9.f5399b
            s.d[] r3 = r3.f5188Q
            r1 = r3[r1]
            int r1 = r1.mo5899d()
            int r1 = -r1
            java.util.List<t.g> r3 = r2.f5372l
            r3.add(r0)
            r2.f5366f = r1
            java.util.List<t.d> r0 = r0.f5371k
            r0.add(r2)
            t.g r0 = r9.f5405h
            t.g r1 = r9.f5406i
            t.h r2 = r9.f5402e
            int r2 = r2.f5367g
            int r2 = -r2
            r9.mo6044b(r0, r1, r2)
        L_0x01ca:
            s.e r0 = r9.f5399b
            boolean r1 = r0.f5175D
            if (r1 == 0) goto L_0x0438
            goto L_0x0191
        L_0x01d1:
            r1 = r0[r3]
            s.d r1 = r1.f5159f
            if (r1 == 0) goto L_0x0206
            r0 = r0[r3]
            t.g r0 = r9.mo6047h(r0)
            if (r0 == 0) goto L_0x0438
            t.g r1 = r9.f5390k
            java.util.List<t.g> r2 = r1.f5372l
            r2.add(r0)
            r1.f5366f = r5
            java.util.List<t.d> r0 = r0.f5371k
            r0.add(r1)
            t.g r0 = r9.f5405h
            t.g r1 = r9.f5390k
            s.e r2 = r9.f5399b
            int r2 = r2.f5201b0
            int r2 = -r2
            r9.mo6044b(r0, r1, r2)
            t.g r0 = r9.f5406i
            t.g r1 = r9.f5405h
            t.h r2 = r9.f5402e
            int r2 = r2.f5367g
            r9.mo6044b(r0, r1, r2)
            goto L_0x0438
        L_0x0206:
            boolean r0 = r7 instanceof p111s.C1698h
            if (r0 != 0) goto L_0x0438
            s.e r0 = r7.f5192U
            if (r0 == 0) goto L_0x0438
            s.d$a r0 = p111s.C1693d.C1694a.CENTER
            s.d r0 = r7.mo5926i(r0)
            s.d r0 = r0.f5159f
            if (r0 != 0) goto L_0x0438
            s.e r0 = r9.f5399b
            s.e r1 = r0.f5192U
            t.o r1 = r1.f5206e
            t.g r1 = r1.f5405h
            t.g r2 = r9.f5405h
            int r0 = r0.mo5937t()
            r9.mo6044b(r2, r1, r0)
            t.g r0 = r9.f5406i
            t.g r1 = r9.f5405h
            t.h r2 = r9.f5402e
            int r2 = r2.f5367g
            r9.mo6044b(r0, r1, r2)
            s.e r0 = r9.f5399b
            boolean r1 = r0.f5175D
            if (r1 == 0) goto L_0x0438
            goto L_0x0191
        L_0x023c:
            int r0 = r0.f5201b0
            r9.mo6044b(r1, r2, r0)
            goto L_0x0438
        L_0x0243:
            if (r4 != 0) goto L_0x0297
            int r4 = r9.f5401d
            if (r4 != r1) goto L_0x0297
            s.e r4 = r9.f5399b
            int r7 = r4.f5231r
            if (r7 == r6) goto L_0x026d
            if (r7 == r1) goto L_0x0252
            goto L_0x02a3
        L_0x0252:
            boolean r0 = r4.mo5942y()
            if (r0 != 0) goto L_0x02a3
            s.e r0 = r9.f5399b
            int r4 = r0.f5230q
            if (r4 != r1) goto L_0x025f
            goto L_0x02a3
        L_0x025f:
            t.m r0 = r0.f5204d
            t.h r0 = r0.f5402e
            t.h r4 = r9.f5402e
            java.util.List<t.g> r4 = r4.f5372l
            r4.add(r0)
            java.util.List<t.d> r0 = r0.f5371k
            goto L_0x027d
        L_0x026d:
            s.e r4 = r4.f5192U
            if (r4 != 0) goto L_0x0272
            goto L_0x02a3
        L_0x0272:
            t.o r4 = r4.f5206e
            t.h r4 = r4.f5402e
            java.util.List<t.g> r0 = r0.f5372l
            r0.add(r4)
            java.util.List<t.d> r0 = r4.f5371k
        L_0x027d:
            t.h r4 = r9.f5402e
            r0.add(r4)
            t.h r0 = r9.f5402e
            r0.f5362b = r2
            java.util.List<t.d> r0 = r0.f5371k
            t.g r4 = r9.f5405h
            r0.add(r4)
            t.h r0 = r9.f5402e
            java.util.List<t.d> r0 = r0.f5371k
            t.g r4 = r9.f5406i
            r0.add(r4)
            goto L_0x02a3
        L_0x0297:
            java.util.List<t.d> r4 = r0.f5371k
            r4.add(r9)
            boolean r0 = r0.f5370j
            if (r0 == 0) goto L_0x02a3
            r9.mo6011a(r9)
        L_0x02a3:
            s.e r0 = r9.f5399b
            s.d[] r4 = r0.f5188Q
            r7 = r4[r6]
            s.d r7 = r7.f5159f
            if (r7 == 0) goto L_0x0311
            r7 = r4[r1]
            s.d r7 = r7.f5159f
            if (r7 == 0) goto L_0x0311
            boolean r0 = r0.mo5942y()
            if (r0 == 0) goto L_0x02d7
            t.g r0 = r9.f5405h
            s.e r3 = r9.f5399b
            s.d[] r3 = r3.f5188Q
            r3 = r3[r6]
            int r3 = r3.mo5899d()
            r0.f5366f = r3
            t.g r0 = r9.f5406i
            s.e r3 = r9.f5399b
            s.d[] r3 = r3.f5188Q
            r1 = r3[r1]
            int r1 = r1.mo5899d()
            int r1 = -r1
            r0.f5366f = r1
            goto L_0x0309
        L_0x02d7:
            s.e r0 = r9.f5399b
            s.d[] r0 = r0.f5188Q
            r0 = r0[r6]
            t.g r0 = r9.mo6047h(r0)
            s.e r4 = r9.f5399b
            s.d[] r4 = r4.f5188Q
            r1 = r4[r1]
            t.g r1 = r9.mo6047h(r1)
            if (r0 == 0) goto L_0x02f9
            java.util.List<t.d> r4 = r0.f5371k
            r4.add(r9)
            boolean r0 = r0.f5370j
            if (r0 == 0) goto L_0x02f9
            r9.mo6011a(r9)
        L_0x02f9:
            if (r1 == 0) goto L_0x0307
            java.util.List<t.d> r0 = r1.f5371k
            r0.add(r9)
            boolean r0 = r1.f5370j
            if (r0 == 0) goto L_0x0307
            r9.mo6011a(r9)
        L_0x0307:
            r9.f5407j = r3
        L_0x0309:
            s.e r0 = r9.f5399b
            boolean r0 = r0.f5175D
            if (r0 == 0) goto L_0x042a
            goto L_0x039b
        L_0x0311:
            r7 = r4[r6]
            s.d r7 = r7.f5159f
            r8 = 0
            if (r7 == 0) goto L_0x0364
            r0 = r4[r6]
            t.g r0 = r9.mo6047h(r0)
            if (r0 == 0) goto L_0x042a
            t.g r3 = r9.f5405h
            s.e r4 = r9.f5399b
            s.d[] r4 = r4.f5188Q
            r4 = r4[r6]
            int r4 = r4.mo5899d()
            java.util.List<t.g> r5 = r3.f5372l
            r5.add(r0)
            r3.f5366f = r4
            java.util.List<t.d> r0 = r0.f5371k
            r0.add(r3)
            t.g r0 = r9.f5406i
            t.g r3 = r9.f5405h
            t.h r4 = r9.f5402e
            r9.mo6045c(r0, r3, r2, r4)
            s.e r0 = r9.f5399b
            boolean r0 = r0.f5175D
            if (r0 == 0) goto L_0x0350
            t.g r0 = r9.f5390k
            t.g r3 = r9.f5405h
            t.h r4 = r9.f5391l
            r9.mo6045c(r0, r3, r2, r4)
        L_0x0350:
            int r0 = r9.f5401d
            if (r0 != r1) goto L_0x042a
            s.e r0 = r9.f5399b
            float r3 = r0.f5195X
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x042a
            t.m r0 = r0.f5204d
            int r3 = r0.f5401d
            if (r3 != r1) goto L_0x042a
            goto L_0x0410
        L_0x0364:
            r6 = r4[r1]
            s.d r6 = r6.f5159f
            r7 = -1
            if (r6 == 0) goto L_0x03a2
            r0 = r4[r1]
            t.g r0 = r9.mo6047h(r0)
            if (r0 == 0) goto L_0x042a
            t.g r3 = r9.f5406i
            s.e r4 = r9.f5399b
            s.d[] r4 = r4.f5188Q
            r1 = r4[r1]
            int r1 = r1.mo5899d()
            int r1 = -r1
            java.util.List<t.g> r4 = r3.f5372l
            r4.add(r0)
            r3.f5366f = r1
            java.util.List<t.d> r0 = r0.f5371k
            r0.add(r3)
            t.g r0 = r9.f5405h
            t.g r1 = r9.f5406i
            t.h r3 = r9.f5402e
            r9.mo6045c(r0, r1, r7, r3)
            s.e r0 = r9.f5399b
            boolean r0 = r0.f5175D
            if (r0 == 0) goto L_0x042a
        L_0x039b:
            t.g r0 = r9.f5390k
            t.g r1 = r9.f5405h
            t.h r3 = r9.f5391l
            goto L_0x03cd
        L_0x03a2:
            r6 = r4[r3]
            s.d r6 = r6.f5159f
            if (r6 == 0) goto L_0x03d1
            r0 = r4[r3]
            t.g r0 = r9.mo6047h(r0)
            if (r0 == 0) goto L_0x042a
            t.g r1 = r9.f5390k
            java.util.List<t.g> r3 = r1.f5372l
            r3.add(r0)
            r1.f5366f = r5
            java.util.List<t.d> r0 = r0.f5371k
            r0.add(r1)
            t.g r0 = r9.f5405h
            t.g r1 = r9.f5390k
            t.h r3 = r9.f5391l
            r9.mo6045c(r0, r1, r7, r3)
            t.g r0 = r9.f5406i
            t.g r1 = r9.f5405h
            t.h r3 = r9.f5402e
        L_0x03cd:
            r9.mo6045c(r0, r1, r2, r3)
            goto L_0x042a
        L_0x03d1:
            boolean r3 = r0 instanceof p111s.C1698h
            if (r3 != 0) goto L_0x042a
            s.e r3 = r0.f5192U
            if (r3 == 0) goto L_0x042a
            t.o r3 = r3.f5206e
            t.g r3 = r3.f5405h
            t.g r4 = r9.f5405h
            int r0 = r0.mo5937t()
            r9.mo6044b(r4, r3, r0)
            t.g r0 = r9.f5406i
            t.g r3 = r9.f5405h
            t.h r4 = r9.f5402e
            r9.mo6045c(r0, r3, r2, r4)
            s.e r0 = r9.f5399b
            boolean r0 = r0.f5175D
            if (r0 == 0) goto L_0x03fe
            t.g r0 = r9.f5390k
            t.g r3 = r9.f5405h
            t.h r4 = r9.f5391l
            r9.mo6045c(r0, r3, r2, r4)
        L_0x03fe:
            int r0 = r9.f5401d
            if (r0 != r1) goto L_0x042a
            s.e r0 = r9.f5399b
            float r3 = r0.f5195X
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x042a
            t.m r0 = r0.f5204d
            int r3 = r0.f5401d
            if (r3 != r1) goto L_0x042a
        L_0x0410:
            t.h r0 = r0.f5402e
            java.util.List<t.d> r0 = r0.f5371k
            t.h r1 = r9.f5402e
            r0.add(r1)
            t.h r0 = r9.f5402e
            java.util.List<t.g> r0 = r0.f5372l
            s.e r1 = r9.f5399b
            t.m r1 = r1.f5204d
            t.h r1 = r1.f5402e
            r0.add(r1)
            t.h r0 = r9.f5402e
            r0.f5361a = r9
        L_0x042a:
            t.h r0 = r9.f5402e
            java.util.List<t.g> r0 = r0.f5372l
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0438
            t.h r0 = r9.f5402e
            r0.f5363c = r2
        L_0x0438:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p117t.C1762o.mo6012d():void");
    }

    /* renamed from: e */
    public void mo6013e() {
        C1753g gVar = this.f5405h;
        if (gVar.f5370j) {
            this.f5399b.f5199a0 = gVar.f5367g;
        }
    }

    /* renamed from: f */
    public void mo6014f() {
        this.f5400c = null;
        this.f5405h.mo6027b();
        this.f5406i.mo6027b();
        this.f5390k.mo6027b();
        this.f5402e.mo6027b();
        this.f5404g = false;
    }

    /* renamed from: k */
    public boolean mo6016k() {
        return this.f5401d != 3 || this.f5399b.f5231r == 0;
    }

    /* renamed from: m */
    public void mo6037m() {
        this.f5404g = false;
        this.f5405h.mo6027b();
        this.f5405h.f5370j = false;
        this.f5406i.mo6027b();
        this.f5406i.f5370j = false;
        this.f5390k.mo6027b();
        this.f5390k.f5370j = false;
        this.f5402e.f5370j = false;
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("VerticalRun ");
        a.append(this.f5399b.f5215i0);
        return a.toString();
    }
}
