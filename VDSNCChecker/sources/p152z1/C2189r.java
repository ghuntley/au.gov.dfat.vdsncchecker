package p152z1;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: z1.r */
public final class C2189r<S> extends C2198x<S> {

    /* renamed from: a0 */
    public int f6301a0;

    /* renamed from: b0 */
    public C2166d<S> f6302b0;

    /* renamed from: c0 */
    public C2156a f6303c0;

    /* renamed from: z1.r$a */
    public class C2190a extends C2197w<S> {
        public C2190a() {
        }

        /* renamed from: a */
        public void mo6735a(S s) {
            Iterator it = C2189r.this.f6327Z.iterator();
            while (it.hasNext()) {
                ((C2197w) it.next()).mo6735a(s);
            }
        }
    }

    /* renamed from: H */
    public void mo1589H(Bundle bundle) {
        super.mo1589H(bundle);
        if (bundle == null) {
            bundle = this.f1461j;
        }
        this.f6301a0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f6302b0 = (C2166d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f6303c0 = (C2156a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    /* renamed from: J */
    public View mo1591J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f6302b0.mo6705c(layoutInflater.cloneInContext(new ContextThemeWrapper(mo1623i(), this.f6301a0)), viewGroup, bundle, this.f6303c0, new C2190a());
    }

    /* renamed from: R */
    public void mo1599R(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f6301a0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f6302b0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f6303c0);
    }
}
