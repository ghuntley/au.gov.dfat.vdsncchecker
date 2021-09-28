package p106r0;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.C0342c;
import androidx.savedstate.C0483a;

/* renamed from: r0.d */
public class C1641d implements C0483a.C0485b {

    /* renamed from: a */
    public final /* synthetic */ C1643f f5033a;

    public C1641d(C1643f fVar) {
        this.f5033a = fVar;
    }

    /* renamed from: a */
    public Bundle mo2450a() {
        Bundle bundle = new Bundle();
        do {
        } while (C1643f.m4561p(this.f5033a.mo5790o(), C0342c.C0345c.CREATED));
        this.f5033a.f5036n.mo1807e(C0342c.C0344b.ON_STOP);
        Parcelable a0 = this.f5033a.f5035m.f5041a.f5045h.mo1700a0();
        if (a0 != null) {
            bundle.putParcelable("android:support:fragments", a0);
        }
        return bundle;
    }
}
