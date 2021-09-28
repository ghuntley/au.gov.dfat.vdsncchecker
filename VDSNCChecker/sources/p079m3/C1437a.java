package p079m3;

import android.os.Handler;
import android.os.Looper;
import p025d3.C0802f;
import p063k.C1142f;
import p072l2.C1241e;
import p073l3.C1264a1;
import p138w2.C2046f;

/* renamed from: m3.a */
public final class C1437a extends C1438b {
    private volatile C1437a _immediate;

    /* renamed from: f */
    public final C1437a f4523f;

    /* renamed from: g */
    public final Handler f4524g;

    /* renamed from: h */
    public final String f4525h;

    /* renamed from: i */
    public final boolean f4526i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1437a(Handler handler, String str, boolean z) {
        super((C0802f) null);
        C1437a aVar = null;
        this.f4524g = handler;
        this.f4525h = str;
        this.f4526i = z;
        this._immediate = z ? this : aVar;
        C1437a aVar2 = this._immediate;
        if (aVar2 == null) {
            aVar2 = new C1437a(handler, str, true);
            this._immediate = aVar2;
        }
        this.f4523f = aVar2;
    }

    /* renamed from: R */
    public void mo5067R(C2046f fVar, Runnable runnable) {
        this.f4524g.post(runnable);
    }

    /* renamed from: S */
    public boolean mo5118S(C2046f fVar) {
        return !this.f4526i || (C1241e.m3513b(Looper.myLooper(), this.f4524g.getLooper()) ^ true);
    }

    /* renamed from: T */
    public C1264a1 mo5016T() {
        return this.f4523f;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1437a) && ((C1437a) obj).f4524g == this.f4524g;
    }

    public int hashCode() {
        return System.identityHashCode(this.f4524g);
    }

    public String toString() {
        String U = mo5017U();
        if (U != null) {
            return U;
        }
        String str = this.f4525h;
        if (str == null) {
            str = this.f4524g.toString();
        }
        return this.f4526i ? C1142f.m3365a(str, ".immediate") : str;
    }
}
