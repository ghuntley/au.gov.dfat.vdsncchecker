package p069l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p028e0.C0863c;

/* renamed from: l.g */
public class C1225g extends C1223e implements SubMenu {

    /* renamed from: e */
    public final C0863c f4150e;

    public C1225g(Context context, C0863c cVar) {
        super(context, cVar);
        this.f4150e = cVar;
    }

    public void clearHeader() {
        this.f4150e.clearHeader();
    }

    public MenuItem getItem() {
        return mo4848c(this.f4150e.getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        this.f4150e.setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f4150e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        this.f4150e.setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f4150e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f4150e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f4150e.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f4150e.setIcon(drawable);
        return this;
    }
}
