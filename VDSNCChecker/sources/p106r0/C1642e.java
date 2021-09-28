package p106r0;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.C0286k;
import p021d.C0792b;
import p118t0.C1785s;

/* renamed from: r0.e */
public class C1642e implements C0792b {

    /* renamed from: a */
    public final /* synthetic */ C1643f f5034a;

    public C1642e(C1643f fVar) {
        this.f5034a = fVar;
    }

    /* renamed from: a */
    public void mo2700a(Context context) {
        C1647i<?> iVar = this.f5034a.f5035m.f5041a;
        iVar.f5045h.mo1701b(iVar, iVar, (C0286k) null);
        Bundle a = this.f5034a.f144h.f2b.mo2451a("android:support:fragments");
        if (a != null) {
            Parcelable parcelable = a.getParcelable("android:support:fragments");
            C1647i<?> iVar2 = this.f5034a.f5035m.f5041a;
            if (iVar2 instanceof C1785s) {
                iVar2.f5045h.mo1698Z(parcelable);
                return;
            }
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
    }
}
