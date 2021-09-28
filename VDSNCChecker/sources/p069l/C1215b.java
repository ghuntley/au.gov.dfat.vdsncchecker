package p069l;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p028e0.C0862b;
import p028e0.C0863c;
import p093p.C1558h;

/* renamed from: l.b */
public abstract class C1215b {

    /* renamed from: a */
    public final Context f4135a;

    /* renamed from: b */
    public C1558h<C0862b, MenuItem> f4136b;

    /* renamed from: c */
    public C1558h<C0863c, SubMenu> f4137c;

    public C1215b(Context context) {
        this.f4135a = context;
    }

    /* renamed from: c */
    public final MenuItem mo4848c(MenuItem menuItem) {
        if (!(menuItem instanceof C0862b)) {
            return menuItem;
        }
        C0862b bVar = (C0862b) menuItem;
        if (this.f4136b == null) {
            this.f4136b = new C1558h<>();
        }
        MenuItem orDefault = this.f4136b.getOrDefault(menuItem, null);
        if (orDefault != null) {
            return orDefault;
        }
        C1216c cVar = new C1216c(this.f4135a, bVar);
        this.f4136b.put(bVar, cVar);
        return cVar;
    }

    /* renamed from: d */
    public final SubMenu mo4849d(SubMenu subMenu) {
        if (!(subMenu instanceof C0863c)) {
            return subMenu;
        }
        C0863c cVar = (C0863c) subMenu;
        if (this.f4137c == null) {
            this.f4137c = new C1558h<>();
        }
        SubMenu subMenu2 = this.f4137c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        C1225g gVar = new C1225g(this.f4135a, cVar);
        this.f4137c.put(cVar, gVar);
        return gVar;
    }
}
