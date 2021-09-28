package p086n4;

import p074l4.C1347d1;
import p074l4.C1348e;
import p074l4.C1351f;
import p074l4.C1377n;
import p074l4.C1380o;
import p074l4.C1393s;
import p074l4.C1399u;

/* renamed from: n4.a */
public class C1482a extends C1377n {

    /* renamed from: e */
    public C1380o f4629e;

    /* renamed from: f */
    public C1348e f4630f;

    public C1482a(C1399u uVar) {
        this.f4629e = (C1380o) uVar.mo5228s(0);
        this.f4630f = uVar.mo5228s(1);
    }

    /* renamed from: i */
    public static C1482a m4172i(Object obj) {
        if (obj instanceof C1482a) {
            return (C1482a) obj;
        }
        if (obj != null) {
            return new C1482a(C1399u.m4010q(obj));
        }
        throw new IllegalArgumentException("null value in getInstance()");
    }

    /* renamed from: c */
    public C1393s mo5171c() {
        C1351f fVar = new C1351f(2);
        fVar.mo5173a(this.f4629e);
        fVar.mo5173a(this.f4630f);
        return new C1347d1(fVar);
    }
}
