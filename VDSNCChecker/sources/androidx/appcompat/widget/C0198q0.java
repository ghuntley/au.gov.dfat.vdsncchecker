package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0073d;
import androidx.appcompat.view.menu.C0074e;
import androidx.appcompat.view.menu.C0078g;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.q0 */
public class C0198q0 extends C0189o0 implements C0196p0 {

    /* renamed from: G */
    public static Method f904G;

    /* renamed from: F */
    public C0196p0 f905F;

    /* renamed from: androidx.appcompat.widget.q0$a */
    public static class C0199a extends C0172j0 {

        /* renamed from: r */
        public final int f906r;

        /* renamed from: s */
        public final int f907s;

        /* renamed from: t */
        public C0196p0 f908t;

        /* renamed from: u */
        public MenuItem f909u;

        public C0199a(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f906r = 21;
                this.f907s = 22;
                return;
            }
            this.f906r = 22;
            this.f907s = 21;
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            int pointToPosition;
            int i2;
            if (this.f908t != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                C0073d dVar = (C0073d) adapter;
                C0078g gVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < dVar.getCount()) {
                    gVar = dVar.getItem(i2);
                }
                MenuItem menuItem = this.f909u;
                if (menuItem != gVar) {
                    C0074e eVar = dVar.f349e;
                    if (menuItem != null) {
                        this.f908t.mo224h(eVar, menuItem);
                    }
                    this.f909u = gVar;
                    if (gVar != null) {
                        this.f908t.mo223a(eVar, gVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f906r) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f907s) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                }
                ((C0073d) adapter).f349e.mo254c(false);
                return true;
            }
        }

        public void setHoverListener(C0196p0 p0Var) {
            this.f908t = p0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f904G = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public C0198q0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (AttributeSet) null, i, i2);
    }

    /* renamed from: a */
    public void mo223a(C0074e eVar, MenuItem menuItem) {
        C0196p0 p0Var = this.f905F;
        if (p0Var != null) {
            p0Var.mo223a(eVar, menuItem);
        }
    }

    /* renamed from: h */
    public void mo224h(C0074e eVar, MenuItem menuItem) {
        C0196p0 p0Var = this.f905F;
        if (p0Var != null) {
            p0Var.mo224h(eVar, menuItem);
        }
    }

    /* renamed from: q */
    public C0172j0 mo1082q(Context context, boolean z) {
        C0199a aVar = new C0199a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }
}
