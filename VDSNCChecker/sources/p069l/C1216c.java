package p069l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0074e;
import androidx.appcompat.view.menu.C0078g;
import java.lang.reflect.Method;
import p028e0.C0862b;
import p058j0.C1045b;
import p063k.C1137b;

/* renamed from: l.c */
public class C1216c extends C1215b implements MenuItem {

    /* renamed from: d */
    public final C0862b f4138d;

    /* renamed from: e */
    public Method f4139e;

    /* renamed from: l.c$a */
    public class C1217a extends C1045b {

        /* renamed from: b */
        public final ActionProvider f4140b;

        public C1217a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f4140b = actionProvider;
        }

        /* renamed from: a */
        public boolean mo4513a() {
            return this.f4140b.hasSubMenu();
        }

        /* renamed from: c */
        public View mo4515c() {
            return this.f4140b.onCreateActionView();
        }

        /* renamed from: e */
        public boolean mo4517e() {
            return this.f4140b.onPerformDefaultAction();
        }

        /* renamed from: f */
        public void mo4518f(SubMenu subMenu) {
            this.f4140b.onPrepareSubMenu(C1216c.this.mo4849d(subMenu));
        }
    }

    /* renamed from: l.c$b */
    public class C1218b extends C1217a implements ActionProvider.VisibilityListener {

        /* renamed from: d */
        public C1045b.C1046a f4142d;

        public C1218b(C1216c cVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: b */
        public boolean mo4514b() {
            return this.f4140b.isVisible();
        }

        /* renamed from: d */
        public View mo4516d(MenuItem menuItem) {
            return this.f4140b.onCreateActionView(menuItem);
        }

        /* renamed from: g */
        public boolean mo4519g() {
            return this.f4140b.overridesItemVisibility();
        }

        /* renamed from: h */
        public void mo4520h(C1045b.C1046a aVar) {
            this.f4142d = aVar;
            this.f4140b.setVisibilityListener(this);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C1045b.C1046a aVar = this.f4142d;
            if (aVar != null) {
                C0074e eVar = C0078g.this.f400n;
                eVar.f363h = true;
                eVar.mo274p(true);
            }
        }
    }

    /* renamed from: l.c$c */
    public static class C1219c extends FrameLayout implements C1137b {

        /* renamed from: e */
        public final CollapsibleActionView f4143e;

        public C1219c(View view) {
            super(view.getContext());
            this.f4143e = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: c */
        public void mo534c() {
            this.f4143e.onActionViewExpanded();
        }

        /* renamed from: e */
        public void mo536e() {
            this.f4143e.onActionViewCollapsed();
        }
    }

    /* renamed from: l.c$d */
    public class C1220d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        public final MenuItem.OnActionExpandListener f4144a;

        public C1220d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f4144a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f4144a.onMenuItemActionCollapse(C1216c.this.mo4848c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f4144a.onMenuItemActionExpand(C1216c.this.mo4848c(menuItem));
        }
    }

    /* renamed from: l.c$e */
    public class C1221e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        public final MenuItem.OnMenuItemClickListener f4146a;

        public C1221e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f4146a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f4146a.onMenuItemClick(C1216c.this.mo4848c(menuItem));
        }
    }

    public C1216c(Context context, C0862b bVar) {
        super(context);
        if (bVar != null) {
            this.f4138d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f4138d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f4138d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C1045b b = this.f4138d.mo302b();
        if (b instanceof C1217a) {
            return ((C1217a) b).f4140b;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f4138d.getActionView();
        return actionView instanceof C1219c ? (View) ((C1219c) actionView).f4143e : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f4138d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f4138d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f4138d.getContentDescription();
    }

    public int getGroupId() {
        return this.f4138d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f4138d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f4138d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f4138d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f4138d.getIntent();
    }

    public int getItemId() {
        return this.f4138d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f4138d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f4138d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f4138d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f4138d.getOrder();
    }

    public SubMenu getSubMenu() {
        return mo4849d(this.f4138d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f4138d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f4138d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f4138d.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.f4138d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f4138d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f4138d.isCheckable();
    }

    public boolean isChecked() {
        return this.f4138d.isChecked();
    }

    public boolean isEnabled() {
        return this.f4138d.isEnabled();
    }

    public boolean isVisible() {
        return this.f4138d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        C1218b bVar = new C1218b(this, this.f4135a, actionProvider);
        C0862b bVar2 = this.f4138d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.mo301a(bVar);
        return this;
    }

    public MenuItem setActionView(int i) {
        this.f4138d.setActionView(i);
        View actionView = this.f4138d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f4138d.setActionView((View) new C1219c(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C1219c(view);
        }
        this.f4138d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f4138d.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f4138d.setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f4138d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f4138d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f4138d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f4138d.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f4138d.setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f4138d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4138d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f4138d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f4138d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f4138d.setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f4138d.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f4138d.setOnActionExpandListener(onActionExpandListener != null ? new C1220d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f4138d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new C1221e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f4138d.setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f4138d.setShortcut(c, c2, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.f4138d.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.f4138d.setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f4138d.setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f4138d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4138d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f4138d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f4138d.setVisible(z);
    }
}
