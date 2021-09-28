package p117t;

import p111s.C1690a;
import p111s.C1695e;
import p117t.C1753g;

/* renamed from: t.l */
public class C1759l extends C1765q {
    public C1759l(C1695e eVar) {
        super(eVar);
    }

    /* renamed from: a */
    public void mo6011a(C1750d dVar) {
        C1690a aVar = (C1690a) this.f5399b;
        int i = aVar.f5130s0;
        int i2 = 0;
        int i3 = -1;
        for (C1753g gVar : this.f5405h.f5372l) {
            int i4 = gVar.f5367g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            this.f5405h.mo6028c(i3 + aVar.f5132u0);
        } else {
            this.f5405h.mo6028c(i2 + aVar.f5132u0);
        }
    }

    /* renamed from: d */
    public void mo6012d() {
        C1765q qVar;
        C1695e eVar = this.f5399b;
        if (eVar instanceof C1690a) {
            C1753g gVar = this.f5405h;
            gVar.f5362b = true;
            C1690a aVar = (C1690a) eVar;
            int i = aVar.f5130s0;
            boolean z = aVar.f5131t0;
            int i2 = 0;
            if (i == 0) {
                gVar.f5365e = C1753g.C1754a.LEFT;
                while (i2 < aVar.f5268r0) {
                    C1695e eVar2 = aVar.f5267q0[i2];
                    if (z || eVar2.f5213h0 != 8) {
                        C1753g gVar2 = eVar2.f5204d.f5405h;
                        gVar2.f5371k.add(this.f5405h);
                        this.f5405h.f5372l.add(gVar2);
                    }
                    i2++;
                }
            } else if (i != 1) {
                if (i == 2) {
                    gVar.f5365e = C1753g.C1754a.TOP;
                    while (i2 < aVar.f5268r0) {
                        C1695e eVar3 = aVar.f5267q0[i2];
                        if (z || eVar3.f5213h0 != 8) {
                            C1753g gVar3 = eVar3.f5206e.f5405h;
                            gVar3.f5371k.add(this.f5405h);
                            this.f5405h.f5372l.add(gVar3);
                        }
                        i2++;
                    }
                } else if (i == 3) {
                    gVar.f5365e = C1753g.C1754a.BOTTOM;
                    while (i2 < aVar.f5268r0) {
                        C1695e eVar4 = aVar.f5267q0[i2];
                        if (z || eVar4.f5213h0 != 8) {
                            C1753g gVar4 = eVar4.f5206e.f5406i;
                            gVar4.f5371k.add(this.f5405h);
                            this.f5405h.f5372l.add(gVar4);
                        }
                        i2++;
                    }
                } else {
                    return;
                }
                mo6031m(this.f5399b.f5206e.f5405h);
                qVar = this.f5399b.f5206e;
                mo6031m(qVar.f5406i);
            } else {
                gVar.f5365e = C1753g.C1754a.RIGHT;
                while (i2 < aVar.f5268r0) {
                    C1695e eVar5 = aVar.f5267q0[i2];
                    if (z || eVar5.f5213h0 != 8) {
                        C1753g gVar5 = eVar5.f5204d.f5406i;
                        gVar5.f5371k.add(this.f5405h);
                        this.f5405h.f5372l.add(gVar5);
                    }
                    i2++;
                }
            }
            mo6031m(this.f5399b.f5204d.f5405h);
            qVar = this.f5399b.f5204d;
            mo6031m(qVar.f5406i);
        }
    }

    /* renamed from: e */
    public void mo6013e() {
        C1695e eVar = this.f5399b;
        if (eVar instanceof C1690a) {
            int i = ((C1690a) eVar).f5130s0;
            if (i == 0 || i == 1) {
                eVar.f5197Z = this.f5405h.f5367g;
            } else {
                eVar.f5199a0 = this.f5405h.f5367g;
            }
        }
    }

    /* renamed from: f */
    public void mo6014f() {
        this.f5400c = null;
        this.f5405h.mo6027b();
    }

    /* renamed from: k */
    public boolean mo6016k() {
        return false;
    }

    /* renamed from: m */
    public final void mo6031m(C1753g gVar) {
        this.f5405h.f5371k.add(gVar);
        gVar.f5372l.add(this.f5405h);
    }
}
