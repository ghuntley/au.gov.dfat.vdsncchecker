package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import java.util.Objects;
import p028e0.C0862b;
import p051i.C1021a;
import p058j0.C1045b;

/* renamed from: androidx.appcompat.view.menu.g */
public final class C0078g implements C0862b {

    /* renamed from: A */
    public C1045b f383A;

    /* renamed from: B */
    public MenuItem.OnActionExpandListener f384B;

    /* renamed from: C */
    public boolean f385C = false;

    /* renamed from: D */
    public ContextMenu.ContextMenuInfo f386D;

    /* renamed from: a */
    public final int f387a;

    /* renamed from: b */
    public final int f388b;

    /* renamed from: c */
    public final int f389c;

    /* renamed from: d */
    public final int f390d;

    /* renamed from: e */
    public CharSequence f391e;

    /* renamed from: f */
    public CharSequence f392f;

    /* renamed from: g */
    public Intent f393g;

    /* renamed from: h */
    public char f394h;

    /* renamed from: i */
    public int f395i = 4096;

    /* renamed from: j */
    public char f396j;

    /* renamed from: k */
    public int f397k = 4096;

    /* renamed from: l */
    public Drawable f398l;

    /* renamed from: m */
    public int f399m = 0;

    /* renamed from: n */
    public C0074e f400n;

    /* renamed from: o */
    public C0089l f401o;

    /* renamed from: p */
    public MenuItem.OnMenuItemClickListener f402p;

    /* renamed from: q */
    public CharSequence f403q;

    /* renamed from: r */
    public CharSequence f404r;

    /* renamed from: s */
    public ColorStateList f405s = null;

    /* renamed from: t */
    public PorterDuff.Mode f406t = null;

    /* renamed from: u */
    public boolean f407u = false;

    /* renamed from: v */
    public boolean f408v = false;

    /* renamed from: w */
    public boolean f409w = false;

    /* renamed from: x */
    public int f410x = 16;

    /* renamed from: y */
    public int f411y = 0;

    /* renamed from: z */
    public View f412z;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    public class C0079a implements C1045b.C1046a {
        public C0079a() {
        }
    }

    public C0078g(C0074e eVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f400n = eVar;
        this.f387a = i2;
        this.f388b = i;
        this.f389c = i3;
        this.f390d = i4;
        this.f391e = charSequence;
        this.f411y = i5;
    }

    /* renamed from: c */
    public static void m181c(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: a */
    public C0862b mo301a(C1045b bVar) {
        C1045b bVar2 = this.f383A;
        if (bVar2 != null) {
            bVar2.f3782a = null;
        }
        this.f412z = null;
        this.f383A = bVar;
        this.f400n.mo274p(true);
        C1045b bVar3 = this.f383A;
        if (bVar3 != null) {
            bVar3.mo4520h(new C0079a());
        }
        return this;
    }

    /* renamed from: b */
    public C1045b mo302b() {
        return this.f383A;
    }

    public boolean collapseActionView() {
        if ((this.f411y & 8) == 0) {
            return false;
        }
        if (this.f412z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f384B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f400n.mo258d(this);
        }
        return false;
    }

    /* renamed from: d */
    public final Drawable mo304d(Drawable drawable) {
        if (drawable != null && this.f409w && (this.f407u || this.f408v)) {
            drawable = drawable.mutate();
            if (this.f407u) {
                drawable.setTintList(this.f405s);
            }
            if (this.f408v) {
                drawable.setTintMode(this.f406t);
            }
            this.f409w = false;
        }
        return drawable;
    }

    /* renamed from: e */
    public char mo305e() {
        return this.f400n.mo272n() ? this.f396j : this.f394h;
    }

    public boolean expandActionView() {
        if (!mo307f()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f384B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f400n.mo260f(this);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo307f() {
        C1045b bVar;
        if ((this.f411y & 8) == 0) {
            return false;
        }
        if (this.f412z == null && (bVar = this.f383A) != null) {
            this.f412z = bVar.mo4516d(this);
        }
        return this.f412z != null;
    }

    /* renamed from: g */
    public boolean mo308g() {
        return (this.f410x & 32) == 32;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f412z;
        if (view != null) {
            return view;
        }
        C1045b bVar = this.f383A;
        if (bVar == null) {
            return null;
        }
        View d = bVar.mo4516d(this);
        this.f412z = d;
        return d;
    }

    public int getAlphabeticModifiers() {
        return this.f397k;
    }

    public char getAlphabeticShortcut() {
        return this.f396j;
    }

    public CharSequence getContentDescription() {
        return this.f403q;
    }

    public int getGroupId() {
        return this.f388b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f398l;
        if (drawable != null) {
            return mo304d(drawable);
        }
        int i = this.f399m;
        if (i == 0) {
            return null;
        }
        Drawable a = C1021a.m2945a(this.f400n.f356a, i);
        this.f399m = 0;
        this.f398l = a;
        return mo304d(a);
    }

    public ColorStateList getIconTintList() {
        return this.f405s;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f406t;
    }

    public Intent getIntent() {
        return this.f393g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f387a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f386D;
    }

    public int getNumericModifiers() {
        return this.f395i;
    }

    public char getNumericShortcut() {
        return this.f394h;
    }

    public int getOrder() {
        return this.f389c;
    }

    public SubMenu getSubMenu() {
        return this.f401o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f391e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f392f;
        return charSequence != null ? charSequence : this.f391e;
    }

    public CharSequence getTooltipText() {
        return this.f404r;
    }

    /* renamed from: h */
    public boolean mo328h() {
        return (this.f410x & 4) != 0;
    }

    public boolean hasSubMenu() {
        return this.f401o != null;
    }

    /* renamed from: i */
    public C0862b mo330i(View view) {
        int i;
        this.f412z = view;
        this.f383A = null;
        if (view != null && view.getId() == -1 && (i = this.f387a) > 0) {
            view.setId(i);
        }
        C0074e eVar = this.f400n;
        eVar.f366k = true;
        eVar.mo274p(true);
        return this;
    }

    public boolean isActionViewExpanded() {
        return this.f385C;
    }

    public boolean isCheckable() {
        return (this.f410x & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f410x & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f410x & 16) != 0;
    }

    public boolean isVisible() {
        C1045b bVar = this.f383A;
        return (bVar == null || !bVar.mo4519g()) ? (this.f410x & 8) == 0 : (this.f410x & 8) == 0 && this.f383A.mo4514b();
    }

    /* renamed from: j */
    public void mo336j(boolean z) {
        int i = this.f410x;
        int i2 = (z ? 2 : 0) | (i & -3);
        this.f410x = i2;
        if (i != i2) {
            this.f400n.mo274p(false);
        }
    }

    /* renamed from: k */
    public void mo337k(boolean z) {
        this.f410x = z ? this.f410x | 32 : this.f410x & -33;
    }

    /* renamed from: l */
    public boolean mo338l(boolean z) {
        int i = this.f410x;
        int i2 = (z ? 0 : 8) | (i & -9);
        this.f410x = i2;
        return i != i2;
    }

    /* renamed from: m */
    public boolean mo339m() {
        return this.f400n.mo273o() && mo305e() != 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setActionView(int i) {
        Context context = this.f400n.f356a;
        mo330i(LayoutInflater.from(context).inflate(i, new LinearLayout(context), false));
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        mo330i(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f396j == c) {
            return this;
        }
        this.f396j = Character.toLowerCase(c);
        this.f400n.mo274p(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f396j == c && this.f397k == i) {
            return this;
        }
        this.f396j = Character.toLowerCase(c);
        this.f397k = KeyEvent.normalizeMetaState(i);
        this.f400n.mo274p(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f410x;
        boolean z2 = z | (i & true);
        this.f410x = z2 ? 1 : 0;
        if (i != z2) {
            this.f400n.mo274p(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f410x & 4) != 0) {
            C0074e eVar = this.f400n;
            Objects.requireNonNull(eVar);
            int groupId = getGroupId();
            int size = eVar.f361f.size();
            eVar.mo293y();
            for (int i = 0; i < size; i++) {
                C0078g gVar = eVar.f361f.get(i);
                if (gVar.f388b == groupId && gVar.mo328h() && gVar.isCheckable()) {
                    gVar.mo336j(gVar == this);
                }
            }
            eVar.mo292x();
        } else {
            mo336j(z);
        }
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f403q = charSequence;
        this.f400n.mo274p(false);
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public C0862b m6151setContentDescription(CharSequence charSequence) {
        this.f403q = charSequence;
        this.f400n.mo274p(false);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f410x = z ? this.f410x | 16 : this.f410x & -17;
        this.f400n.mo274p(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f398l = null;
        this.f399m = i;
        this.f409w = true;
        this.f400n.mo274p(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f399m = 0;
        this.f398l = drawable;
        this.f409w = true;
        this.f400n.mo274p(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f405s = colorStateList;
        this.f407u = true;
        this.f409w = true;
        this.f400n.mo274p(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f406t = mode;
        this.f408v = true;
        this.f409w = true;
        this.f400n.mo274p(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f393g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f394h == c) {
            return this;
        }
        this.f394h = c;
        this.f400n.mo274p(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f394h == c && this.f395i == i) {
            return this;
        }
        this.f394h = c;
        this.f395i = KeyEvent.normalizeMetaState(i);
        this.f400n.mo274p(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f384B = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f402p = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f394h = c;
        this.f396j = Character.toLowerCase(c2);
        this.f400n.mo274p(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f394h = c;
        this.f395i = KeyEvent.normalizeMetaState(i);
        this.f396j = Character.toLowerCase(c2);
        this.f397k = KeyEvent.normalizeMetaState(i2);
        this.f400n.mo274p(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f411y = i;
            C0074e eVar = this.f400n;
            eVar.f366k = true;
            eVar.mo274p(true);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        setTitle((CharSequence) this.f400n.f356a.getString(i));
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f391e = charSequence;
        this.f400n.mo274p(false);
        C0089l lVar = this.f401o;
        if (lVar != null) {
            lVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f392f = charSequence;
        this.f400n.mo274p(false);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f404r = charSequence;
        this.f400n.mo274p(false);
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public C0862b m6152setTooltipText(CharSequence charSequence) {
        this.f404r = charSequence;
        this.f400n.mo274p(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo338l(z)) {
            C0074e eVar = this.f400n;
            eVar.f363h = true;
            eVar.mo274p(true);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f391e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
