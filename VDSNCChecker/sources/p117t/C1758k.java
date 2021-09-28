package p117t;

import p111s.C1695e;
import p111s.C1697g;

/* renamed from: t.k */
public class C1758k extends C1765q {
    public C1758k(C1695e eVar) {
        super(eVar);
        eVar.f5204d.mo6014f();
        eVar.f5206e.mo6014f();
        this.f5403f = ((C1697g) eVar).f5265u0;
    }

    /* renamed from: a */
    public void mo6011a(C1750d dVar) {
        C1753g gVar = this.f5405h;
        if (gVar.f5363c && !gVar.f5370j) {
            this.f5405h.mo6028c((int) ((((float) gVar.f5372l.get(0).f5367g) * ((C1697g) this.f5399b).f5261q0) + 0.5f));
        }
    }

    /* renamed from: d */
    public void mo6012d() {
        C1765q qVar;
        C1695e eVar = this.f5399b;
        C1697g gVar = (C1697g) eVar;
        int i = gVar.f5262r0;
        int i2 = gVar.f5263s0;
        if (gVar.f5265u0 == 1) {
            C1753g gVar2 = this.f5405h;
            if (i != -1) {
                gVar2.f5372l.add(eVar.f5192U.f5204d.f5405h);
                this.f5399b.f5192U.f5204d.f5405h.f5371k.add(this.f5405h);
                this.f5405h.f5366f = i;
            } else if (i2 != -1) {
                gVar2.f5372l.add(eVar.f5192U.f5204d.f5406i);
                this.f5399b.f5192U.f5204d.f5406i.f5371k.add(this.f5405h);
                this.f5405h.f5366f = -i2;
            } else {
                gVar2.f5362b = true;
                gVar2.f5372l.add(eVar.f5192U.f5204d.f5406i);
                this.f5399b.f5192U.f5204d.f5406i.f5371k.add(this.f5405h);
            }
            mo6030m(this.f5399b.f5204d.f5405h);
            qVar = this.f5399b.f5204d;
        } else {
            C1753g gVar3 = this.f5405h;
            if (i != -1) {
                gVar3.f5372l.add(eVar.f5192U.f5206e.f5405h);
                this.f5399b.f5192U.f5206e.f5405h.f5371k.add(this.f5405h);
                this.f5405h.f5366f = i;
            } else if (i2 != -1) {
                gVar3.f5372l.add(eVar.f5192U.f5206e.f5406i);
                this.f5399b.f5192U.f5206e.f5406i.f5371k.add(this.f5405h);
                this.f5405h.f5366f = -i2;
            } else {
                gVar3.f5362b = true;
                gVar3.f5372l.add(eVar.f5192U.f5206e.f5406i);
                this.f5399b.f5192U.f5206e.f5406i.f5371k.add(this.f5405h);
            }
            mo6030m(this.f5399b.f5206e.f5405h);
            qVar = this.f5399b.f5206e;
        }
        mo6030m(qVar.f5406i);
    }

    /* renamed from: e */
    public void mo6013e() {
        C1695e eVar = this.f5399b;
        if (((C1697g) eVar).f5265u0 == 1) {
            eVar.f5197Z = this.f5405h.f5367g;
        } else {
            eVar.f5199a0 = this.f5405h.f5367g;
        }
    }

    /* renamed from: f */
    public void mo6014f() {
        this.f5405h.mo6027b();
    }

    /* renamed from: k */
    public boolean mo6016k() {
        return false;
    }

    /* renamed from: m */
    public final void mo6030m(C1753g gVar) {
        this.f5405h.f5371k.add(gVar);
        gVar.f5372l.add(this.f5405h);
    }
}
