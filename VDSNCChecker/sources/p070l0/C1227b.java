package p070l0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.appcompat.widget.C0209u;
import p070l0.C1230e;

/* renamed from: l0.b */
public class C1227b extends InputConnectionWrapper {

    /* renamed from: a */
    public final /* synthetic */ C1229d f4152a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1227b(InputConnection inputConnection, boolean z, C1229d dVar) {
        super(inputConnection, z);
        this.f4152a = dVar;
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        C1229d dVar = this.f4152a;
        C1230e eVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            eVar = new C1230e(new C1230e.C1231a(inputContentInfo));
        }
        if (((C0209u) dVar).mo1135a(eVar, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
