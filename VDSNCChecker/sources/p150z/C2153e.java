package p150z;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0342c;
import androidx.lifecycle.C0347e;
import androidx.lifecycle.C0355i;
import p058j0.C1050e;
import p118t0.C1773g;

/* renamed from: z.e */
public class C2153e extends Activity implements C1773g, C1050e.C1051a {

    /* renamed from: e */
    public C0347e f6216e = new C0347e(this);

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C1050e.m2995a(decorView, keyEvent)) {
            return C1050e.m2996b(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C1050e.m2995a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* renamed from: h */
    public boolean mo4384h(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0355i.m1029c(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C0347e eVar = this.f6216e;
        C0342c.C0345c cVar = C0342c.C0345c.CREATED;
        eVar.mo1806d("markState");
        eVar.mo1806d("setCurrentState");
        eVar.mo1808g(cVar);
        super.onSaveInstanceState(bundle);
    }
}
