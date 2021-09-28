package p063k;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0074e;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0137c;
import java.lang.ref.WeakReference;
import p063k.C1135a;

/* renamed from: k.d */
public class C1139d extends C1135a implements C0074e.C0075a {

    /* renamed from: g */
    public Context f3939g;

    /* renamed from: h */
    public ActionBarContextView f3940h;

    /* renamed from: i */
    public C1135a.C1136a f3941i;

    /* renamed from: j */
    public WeakReference<View> f3942j;

    /* renamed from: k */
    public boolean f3943k;

    /* renamed from: l */
    public C0074e f3944l;

    public C1139d(Context context, ActionBarContextView actionBarContextView, C1135a.C1136a aVar, boolean z) {
        this.f3939g = context;
        this.f3940h = actionBarContextView;
        this.f3941i = aVar;
        C0074e eVar = new C0074e(actionBarContextView.getContext());
        eVar.f367l = 1;
        this.f3944l = eVar;
        eVar.f360e = this;
    }

    /* renamed from: a */
    public boolean mo294a(C0074e eVar, MenuItem menuItem) {
        return this.f3941i.mo4346a(this, menuItem);
    }

    /* renamed from: b */
    public void mo295b(C0074e eVar) {
        mo4414i();
        C0137c cVar = this.f3940h.f665h;
        if (cVar != null) {
            cVar.mo781n();
        }
    }

    /* renamed from: c */
    public void mo4408c() {
        if (!this.f3943k) {
            this.f3943k = true;
            this.f3940h.sendAccessibilityEvent(32);
            this.f3941i.mo4349d(this);
        }
    }

    /* renamed from: d */
    public View mo4409d() {
        WeakReference<View> weakReference = this.f3942j;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: e */
    public Menu mo4410e() {
        return this.f3944l;
    }

    /* renamed from: f */
    public MenuInflater mo4411f() {
        return new C1143g(this.f3940h.getContext());
    }

    /* renamed from: g */
    public CharSequence mo4412g() {
        return this.f3940h.getSubtitle();
    }

    /* renamed from: h */
    public CharSequence mo4413h() {
        return this.f3940h.getTitle();
    }

    /* renamed from: i */
    public void mo4414i() {
        this.f3941i.mo4347b(this, this.f3944l);
    }

    /* renamed from: j */
    public boolean mo4415j() {
        return this.f3940h.f471w;
    }

    /* renamed from: k */
    public void mo4416k(View view) {
        this.f3940h.setCustomView(view);
        this.f3942j = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: l */
    public void mo4417l(int i) {
        this.f3940h.setSubtitle(this.f3939g.getString(i));
    }

    /* renamed from: m */
    public void mo4418m(CharSequence charSequence) {
        this.f3940h.setSubtitle(charSequence);
    }

    /* renamed from: n */
    public void mo4419n(int i) {
        this.f3940h.setTitle(this.f3939g.getString(i));
    }

    /* renamed from: o */
    public void mo4420o(CharSequence charSequence) {
        this.f3940h.setTitle(charSequence);
    }

    /* renamed from: p */
    public void mo4421p(boolean z) {
        this.f3933f = z;
        this.f3940h.setTitleOptional(z);
    }
}
