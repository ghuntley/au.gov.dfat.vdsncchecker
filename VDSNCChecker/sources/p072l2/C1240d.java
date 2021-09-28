package p072l2;

import p129v.C1960d;

/* renamed from: l2.d */
public class C1240d extends C1960d {
    public C1240d() {
        super(1);
    }

    /* renamed from: a */
    public void mo4954a(C1254l lVar, float f, float f2, float f3) {
        lVar.mo5004e(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double d = (double) f3;
        double d2 = (double) f2;
        lVar.mo5003d((float) (Math.sin(Math.toRadians((double) f)) * d * d2), (float) (Math.sin(Math.toRadians((double) (90.0f - f))) * d * d2));
    }
}
