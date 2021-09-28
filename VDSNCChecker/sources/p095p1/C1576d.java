package p095p1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: p1.d */
public class C1576d<V extends View> extends CoordinatorLayout.C0249c<V> {

    /* renamed from: a */
    public C1577e f4902a;

    /* renamed from: b */
    public int f4903b = 0;

    public C1576d() {
    }

    public C1576d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: h */
    public boolean mo1401h(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo5676t(coordinatorLayout, v, i);
        if (this.f4902a == null) {
            this.f4902a = new C1577e(v);
        }
        C1577e eVar = this.f4902a;
        eVar.f4905b = eVar.f4904a.getTop();
        eVar.f4906c = eVar.f4904a.getLeft();
        this.f4902a.mo5680a();
        int i2 = this.f4903b;
        if (i2 == 0) {
            return true;
        }
        C1577e eVar2 = this.f4902a;
        if (eVar2.f4907d != i2) {
            eVar2.f4907d = i2;
            eVar2.mo5680a();
        }
        this.f4903b = 0;
        return true;
    }

    /* renamed from: s */
    public int mo5678s() {
        C1577e eVar = this.f4902a;
        if (eVar != null) {
            return eVar.f4907d;
        }
        return 0;
    }

    /* renamed from: t */
    public void mo5676t(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.mo1375r(v, i);
    }

    /* renamed from: u */
    public boolean mo5679u(int i) {
        C1577e eVar = this.f4902a;
        if (eVar == null) {
            this.f4903b = i;
            return false;
        } else if (eVar.f4907d == i) {
            return false;
        } else {
            eVar.f4907d = i;
            eVar.mo5680a();
            return true;
        }
    }
}
