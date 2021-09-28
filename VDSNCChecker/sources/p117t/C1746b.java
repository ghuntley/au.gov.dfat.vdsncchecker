package p117t;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import p111s.C1695e;
import p111s.C1696f;

/* renamed from: t.b */
public class C1746b {

    /* renamed from: a */
    public final ArrayList<C1695e> f5338a = new ArrayList<>();

    /* renamed from: b */
    public C1747a f5339b = new C1747a();

    /* renamed from: c */
    public C1696f f5340c;

    /* renamed from: t.b$a */
    public static class C1747a {

        /* renamed from: a */
        public int f5341a;

        /* renamed from: b */
        public int f5342b;

        /* renamed from: c */
        public int f5343c;

        /* renamed from: d */
        public int f5344d;

        /* renamed from: e */
        public int f5345e;

        /* renamed from: f */
        public int f5346f;

        /* renamed from: g */
        public int f5347g;

        /* renamed from: h */
        public boolean f5348h;

        /* renamed from: i */
        public boolean f5349i;

        /* renamed from: j */
        public int f5350j;
    }

    /* renamed from: t.b$b */
    public interface C1748b {
    }

    public C1746b(C1696f fVar) {
        this.f5340c = fVar;
    }

    /* renamed from: a */
    public final boolean mo6008a(C1748b bVar, C1695e eVar, int i) {
        this.f5339b.f5341a = eVar.mo5930m();
        this.f5339b.f5342b = eVar.mo5934q();
        this.f5339b.f5343c = eVar.mo5935r();
        this.f5339b.f5344d = eVar.mo5929l();
        C1747a aVar = this.f5339b;
        aVar.f5349i = false;
        aVar.f5350j = i;
        boolean z = aVar.f5341a == 3;
        boolean z2 = aVar.f5342b == 3;
        boolean z3 = z && eVar.f5195X > 0.0f;
        boolean z4 = z2 && eVar.f5195X > 0.0f;
        if (z3 && eVar.f5232s[0] == 4) {
            aVar.f5341a = 1;
        }
        if (z4 && eVar.f5232s[1] == 4) {
            aVar.f5342b = 1;
        }
        ((ConstraintLayout.C0235b) bVar).mo1284b(eVar, aVar);
        eVar.mo5918N(this.f5339b.f5345e);
        eVar.mo5913I(this.f5339b.f5346f);
        C1747a aVar2 = this.f5339b;
        eVar.f5175D = aVar2.f5348h;
        eVar.mo5910F(aVar2.f5347g);
        C1747a aVar3 = this.f5339b;
        aVar3.f5350j = 0;
        return aVar3.f5349i;
    }

    /* renamed from: b */
    public final void mo6009b(C1696f fVar, int i, int i2, int i3) {
        int i4 = fVar.f5203c0;
        int i5 = fVar.f5205d0;
        fVar.mo5916L(0);
        fVar.mo5915K(0);
        fVar.f5193V = i2;
        int i6 = fVar.f5203c0;
        if (i2 < i6) {
            fVar.f5193V = i6;
        }
        fVar.f5194W = i3;
        int i7 = fVar.f5205d0;
        if (i3 < i7) {
            fVar.f5194W = i7;
        }
        fVar.mo5916L(i4);
        fVar.mo5915K(i5);
        C1696f fVar2 = this.f5340c;
        fVar2.f5254t0 = i;
        fVar2.mo5944Q();
    }

    /* renamed from: c */
    public void mo6010c(C1696f fVar) {
        this.f5338a.clear();
        int size = fVar.f5270q0.size();
        for (int i = 0; i < size; i++) {
            C1695e eVar = fVar.f5270q0.get(i);
            if (eVar.mo5930m() == 3 || eVar.mo5934q() == 3) {
                this.f5338a.add(eVar);
            }
        }
        fVar.mo5952Y();
    }
}
