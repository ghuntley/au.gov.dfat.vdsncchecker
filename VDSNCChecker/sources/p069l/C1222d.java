package p069l;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0065b;
import androidx.appcompat.view.menu.C0073d;
import androidx.appcompat.view.menu.C0074e;
import androidx.appcompat.view.menu.C0078g;
import androidx.appcompat.view.menu.C0082i;

/* renamed from: l.d */
public abstract class C1222d implements C1224f, C0082i, AdapterView.OnItemClickListener {

    /* renamed from: e */
    public Rect f4148e;

    /* renamed from: m */
    public static int m3474m(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        C0073d dVar = (C0073d) listAdapter;
        int count = dVar.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = dVar.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = dVar.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: u */
    public static boolean m3475u(C0074e eVar) {
        int size = eVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = eVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public void mo227d(Context context, C0074e eVar) {
    }

    /* renamed from: e */
    public boolean mo198e(C0074e eVar, C0078g gVar) {
        return false;
    }

    /* renamed from: g */
    public boolean mo199g(C0074e eVar, C0078g gVar) {
        return false;
    }

    /* renamed from: l */
    public abstract void mo209l(C0074e eVar);

    /* renamed from: n */
    public abstract void mo210n(View view);

    /* renamed from: o */
    public abstract void mo211o(boolean z);

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C0073d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0073d) listAdapter).f349e.mo278r((MenuItem) listAdapter.getItem(i), this, (this instanceof C0065b) ^ true ? 0 : 4);
    }

    /* renamed from: p */
    public abstract void mo214p(int i);

    /* renamed from: q */
    public abstract void mo215q(int i);

    /* renamed from: r */
    public abstract void mo216r(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: s */
    public abstract void mo217s(boolean z);

    /* renamed from: t */
    public abstract void mo218t(int i);
}
