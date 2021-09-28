package p069l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p001a0.C0002a;
import p028e0.C0862b;
import p058j0.C1045b;

/* renamed from: l.a */
public class C1214a implements C0862b {

    /* renamed from: a */
    public CharSequence f4119a;

    /* renamed from: b */
    public CharSequence f4120b;

    /* renamed from: c */
    public Intent f4121c;

    /* renamed from: d */
    public char f4122d;

    /* renamed from: e */
    public int f4123e = 4096;

    /* renamed from: f */
    public char f4124f;

    /* renamed from: g */
    public int f4125g = 4096;

    /* renamed from: h */
    public Drawable f4126h;

    /* renamed from: i */
    public Context f4127i;

    /* renamed from: j */
    public CharSequence f4128j;

    /* renamed from: k */
    public CharSequence f4129k;

    /* renamed from: l */
    public ColorStateList f4130l = null;

    /* renamed from: m */
    public PorterDuff.Mode f4131m = null;

    /* renamed from: n */
    public boolean f4132n = false;

    /* renamed from: o */
    public boolean f4133o = false;

    /* renamed from: p */
    public int f4134p = 16;

    public C1214a(Context context, int i, int i2, int i3, CharSequence charSequence) {
        this.f4127i = context;
        this.f4119a = charSequence;
    }

    /* renamed from: a */
    public C0862b mo301a(C1045b bVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public C1045b mo302b() {
        return null;
    }

    /* renamed from: c */
    public final void mo4814c() {
        Drawable drawable = this.f4126h;
        if (drawable == null) {
            return;
        }
        if (this.f4132n || this.f4133o) {
            this.f4126h = drawable;
            Drawable mutate = drawable.mutate();
            this.f4126h = mutate;
            if (this.f4132n) {
                mutate.setTintList(this.f4130l);
            }
            if (this.f4133o) {
                this.f4126h.setTintMode(this.f4131m);
            }
        }
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f4125g;
    }

    public char getAlphabeticShortcut() {
        return this.f4124f;
    }

    public CharSequence getContentDescription() {
        return this.f4128j;
    }

    public int getGroupId() {
        return 0;
    }

    public Drawable getIcon() {
        return this.f4126h;
    }

    public ColorStateList getIconTintList() {
        return this.f4130l;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f4131m;
    }

    public Intent getIntent() {
        return this.f4121c;
    }

    public int getItemId() {
        return 16908332;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f4123e;
    }

    public char getNumericShortcut() {
        return this.f4122d;
    }

    public int getOrder() {
        return 0;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f4119a;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f4120b;
        return charSequence != null ? charSequence : this.f4119a;
    }

    public CharSequence getTooltipText() {
        return this.f4129k;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f4134p & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f4134p & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f4134p & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f4134p & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f4124f = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f4124f = Character.toLowerCase(c);
        this.f4125g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f4134p = z | (this.f4134p & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f4134p = (z ? 2 : 0) | (this.f4134p & -3);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f4128j = charSequence;
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public C0862b m6155setContentDescription(CharSequence charSequence) {
        this.f4128j = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f4134p = (z ? 16 : 0) | (this.f4134p & -17);
        return this;
    }

    public MenuItem setIcon(int i) {
        Context context = this.f4127i;
        Object obj = C0002a.f0a;
        this.f4126h = C0002a.C0004b.m5b(context, i);
        mo4814c();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f4126h = drawable;
        mo4814c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4130l = colorStateList;
        this.f4132n = true;
        mo4814c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f4131m = mode;
        this.f4133o = true;
        mo4814c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f4121c = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f4122d = c;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f4122d = c;
        this.f4123e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f4122d = c;
        this.f4124f = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f4122d = c;
        this.f4123e = KeyEvent.normalizeMetaState(i);
        this.f4124f = Character.toLowerCase(c2);
        this.f4125g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f4119a = this.f4127i.getResources().getString(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f4119a = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4120b = charSequence;
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f4129k = charSequence;
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public C0862b m6156setTooltipText(CharSequence charSequence) {
        this.f4129k = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f4134p & 8;
        if (z) {
            i = 0;
        }
        this.f4134p = i2 | i;
        return this;
    }

    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}
