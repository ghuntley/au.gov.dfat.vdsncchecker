package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: androidx.appcompat.view.menu.l */
public class C0089l extends C0074e implements SubMenu {

    /* renamed from: A */
    public C0078g f449A;

    /* renamed from: z */
    public C0074e f450z;

    public C0089l(Context context, C0074e eVar, C0078g gVar) {
        super(context);
        this.f450z = eVar;
        this.f449A = gVar;
    }

    /* renamed from: d */
    public boolean mo258d(C0078g gVar) {
        return this.f450z.mo258d(gVar);
    }

    /* renamed from: e */
    public boolean mo259e(C0074e eVar, MenuItem menuItem) {
        return super.mo259e(eVar, menuItem) || this.f450z.mo259e(eVar, menuItem);
    }

    /* renamed from: f */
    public boolean mo260f(C0078g gVar) {
        return this.f450z.mo260f(gVar);
    }

    public MenuItem getItem() {
        return this.f449A;
    }

    /* renamed from: j */
    public String mo268j() {
        C0078g gVar = this.f449A;
        int i = gVar != null ? gVar.f387a : 0;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates" + ":" + i;
    }

    /* renamed from: k */
    public C0074e mo269k() {
        return this.f450z.mo269k();
    }

    /* renamed from: m */
    public boolean mo271m() {
        return this.f450z.mo271m();
    }

    /* renamed from: n */
    public boolean mo272n() {
        return this.f450z.mo272n();
    }

    /* renamed from: o */
    public boolean mo273o() {
        return this.f450z.mo273o();
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f450z.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(int i) {
        mo291w(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        mo291w(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        mo291w(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f449A.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f449A.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f450z.setQwertyMode(z);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        mo291w(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        mo291w(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }
}
