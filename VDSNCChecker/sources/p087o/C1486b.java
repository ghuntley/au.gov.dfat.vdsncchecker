package p087o;

import android.content.res.ColorStateList;
import android.graphics.Rect;

/* renamed from: o.b */
public class C1486b implements C1488d {
    /* renamed from: a */
    public final C1489e mo5378a(C1487c cVar) {
        return (C1489e) cVar.mo5385c();
    }

    /* renamed from: b */
    public float mo5379b(C1487c cVar) {
        mo5378a((C1487c) null);
        throw null;
    }

    /* renamed from: c */
    public float mo5380c(C1487c cVar) {
        mo5378a((C1487c) null);
        throw null;
    }

    /* renamed from: d */
    public void mo5381d(C1487c cVar, ColorStateList colorStateList) {
        mo5378a((C1487c) null);
        throw null;
    }

    /* renamed from: e */
    public void mo5382e(C1487c cVar, float f) {
        C1489e a = mo5378a(cVar);
        boolean a2 = cVar.mo5383a();
        boolean d = cVar.mo5386d();
        if (f != a.f4642b || a.f4643c != a2 || a.f4644d != d) {
            a.f4642b = f;
            a.f4643c = a2;
            a.f4644d = d;
            a.mo5388b((Rect) null);
            throw null;
        } else if (!cVar.mo5383a()) {
            cVar.mo5384b(0, 0, 0, 0);
        } else {
            float f2 = mo5378a(cVar).f4642b;
            float f3 = mo5378a(cVar).f4641a;
            int ceil = (int) Math.ceil((double) C1490f.m4191a(f2, f3, cVar.mo5386d()));
            int ceil2 = (int) Math.ceil((double) C1490f.m4192b(f2, f3, cVar.mo5386d()));
            cVar.mo5384b(ceil, ceil2, ceil, ceil2);
        }
    }
}
