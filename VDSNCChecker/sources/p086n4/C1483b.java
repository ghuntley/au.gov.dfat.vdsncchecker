package p086n4;

import p074l4.C1348e;
import p074l4.C1377n;
import p074l4.C1393s;
import p074l4.C1408x;

/* renamed from: n4.b */
public class C1483b extends C1377n {

    /* renamed from: e */
    public C1408x f4631e;

    public C1483b(C1408x xVar) {
        this.f4631e = xVar;
    }

    /* renamed from: c */
    public C1393s mo5171c() {
        return this.f4631e;
    }

    /* renamed from: i */
    public C1482a mo5352i() {
        C1348e[] eVarArr = this.f4631e.f4456e;
        if (eVarArr.length == 0) {
            return null;
        }
        return C1482a.m4172i(eVarArr[0]);
    }

    /* renamed from: j */
    public C1482a[] mo5353j() {
        int length = this.f4631e.f4456e.length;
        C1482a[] aVarArr = new C1482a[length];
        for (int i = 0; i != length; i++) {
            aVarArr[i] = C1482a.m4172i(this.f4631e.f4456e[i]);
        }
        return aVarArr;
    }
}
