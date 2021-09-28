package p095p1;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.dynamsoft.dbr.EnumBarcodeFormat;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;
import p039g.C0933a;
import p058j0.C1061o;
import p058j0.C1070q;
import p058j0.C1076u;

/* renamed from: p1.c */
public abstract class C1575c extends C1576d<View> {

    /* renamed from: c */
    public final Rect f4898c = new Rect();

    /* renamed from: d */
    public final Rect f4899d = new Rect();

    /* renamed from: e */
    public int f4900e = 0;

    /* renamed from: f */
    public int f4901f;

    public C1575c() {
    }

    public C1575c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: i */
    public boolean mo1402i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        AppBarLayout w;
        C1076u lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (w = ((AppBarLayout.ScrollingViewBehavior) this).mo3161w(coordinatorLayout.mo1342e(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            if (w.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.mo4556a() + lastWindowInsets.mo4559d();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.mo1378s(view, i, i2, View.MeasureSpec.makeMeasureSpec((size + w.getTotalScrollRange()) - w.getMeasuredHeight(), i5 == -1 ? EnumBarcodeFormat.BF_MICRO_QR : Integer.MIN_VALUE), i4);
        return true;
    }

    /* renamed from: t */
    public void mo5676t(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        AppBarLayout w = ((AppBarLayout.ScrollingViewBehavior) this).mo3161w(coordinatorLayout.mo1342e(view));
        if (w != null) {
            CoordinatorLayout.C0252f fVar = (CoordinatorLayout.C0252f) view.getLayoutParams();
            Rect rect = this.f4898c;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, w.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((w.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            C1076u lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rect.left = lastWindowInsets.mo4557b() + rect.left;
                    rect.right -= lastWindowInsets.mo4558c();
                }
            }
            Rect rect2 = this.f4899d;
            int i3 = fVar.f1287c;
            if (i3 == 0) {
                i3 = 8388659;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int v = mo5677v(w);
            view.layout(rect2.left, rect2.top - v, rect2.right, rect2.bottom - v);
            i2 = rect2.top - w.getBottom();
        } else {
            coordinatorLayout.mo1375r(view, i);
            i2 = 0;
        }
        this.f4900e = i2;
    }

    /* renamed from: v */
    public final int mo5677v(View view) {
        int i;
        if (this.f4901f == 0) {
            return 0;
        }
        float f = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            CoordinatorLayout.C0249c cVar = ((CoordinatorLayout.C0252f) appBarLayout.getLayoutParams()).f1285a;
            int v = cVar instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) cVar).mo3155v() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + v > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                f = 1.0f + (((float) v) / ((float) i));
            }
        }
        int i2 = this.f4901f;
        return C0933a.m2711e((int) (f * ((float) i2)), 0, i2);
    }
}
