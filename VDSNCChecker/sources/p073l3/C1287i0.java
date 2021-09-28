package p073l3;

import java.util.Objects;
import p085n3.C1458a;
import p126u2.C1845f;

/* renamed from: l3.i0 */
public abstract class C1287i0 extends C1326x {

    /* renamed from: f */
    public long f4290f;

    /* renamed from: g */
    public boolean f4291g;

    /* renamed from: h */
    public C1458a<C1275e0<?>> f4292h;

    /* renamed from: T */
    public final void mo5060T(boolean z) {
        long U = this.f4290f - mo5061U(z);
        this.f4290f = U;
        if (U <= 0 && this.f4291g) {
            mo5066Z();
        }
    }

    /* renamed from: U */
    public final long mo5061U(boolean z) {
        return z ? 4294967296L : 1;
    }

    /* renamed from: V */
    public final void mo5062V(C1275e0<?> e0Var) {
        C1458a<C1275e0<?>> aVar = this.f4292h;
        if (aVar == null) {
            aVar = new C1458a<>();
            this.f4292h = aVar;
        }
        Object[] objArr = aVar.f4590a;
        int i = aVar.f4592c;
        objArr[i] = e0Var;
        int length = (objArr.length - 1) & (i + 1);
        aVar.f4592c = length;
        int i2 = aVar.f4591b;
        if (length == i2) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[(length2 << 1)];
            C1845f.m5044K(objArr, objArr2, 0, i2, 0, 10);
            Object[] objArr3 = aVar.f4590a;
            int length3 = objArr3.length;
            int i3 = aVar.f4591b;
            C1845f.m5044K(objArr3, objArr2, length3 - i3, 0, i3, 4);
            aVar.f4590a = objArr2;
            aVar.f4591b = 0;
            aVar.f4592c = length2;
        }
    }

    /* renamed from: W */
    public final void mo5063W(boolean z) {
        this.f4290f = mo5061U(z) + this.f4290f;
        if (!z) {
            this.f4291g = true;
        }
    }

    /* renamed from: X */
    public final boolean mo5064X() {
        return this.f4290f >= mo5061U(true);
    }

    /* renamed from: Y */
    public final boolean mo5065Y() {
        C1458a<C1275e0<?>> aVar = this.f4292h;
        if (aVar == null) {
            return false;
        }
        int i = aVar.f4591b;
        Object obj = null;
        if (i != aVar.f4592c) {
            Object[] objArr = aVar.f4590a;
            Object obj2 = objArr[i];
            objArr[i] = null;
            aVar.f4591b = (i + 1) & (objArr.length - 1);
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            obj = obj2;
        }
        C1275e0 e0Var = (C1275e0) obj;
        if (e0Var == null) {
            return false;
        }
        e0Var.run();
        return true;
    }

    /* renamed from: Z */
    public void mo5066Z() {
    }
}
