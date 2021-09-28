package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p058j0.C1061o;
import p058j0.C1069p;
import p058j0.C1070q;

/* renamed from: androidx.appcompat.widget.f1 */
public class C0159f1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: n */
    public static C0159f1 f771n;

    /* renamed from: o */
    public static C0159f1 f772o;

    /* renamed from: e */
    public final View f773e;

    /* renamed from: f */
    public final CharSequence f774f;

    /* renamed from: g */
    public final int f775g;

    /* renamed from: h */
    public final Runnable f776h = new C0160a();

    /* renamed from: i */
    public final Runnable f777i = new C0161b();

    /* renamed from: j */
    public int f778j;

    /* renamed from: k */
    public int f779k;

    /* renamed from: l */
    public C0164g1 f780l;

    /* renamed from: m */
    public boolean f781m;

    /* renamed from: androidx.appcompat.widget.f1$a */
    public class C0160a implements Runnable {
        public C0160a() {
        }

        public void run() {
            C0159f1.this.mo901d(false);
        }
    }

    /* renamed from: androidx.appcompat.widget.f1$b */
    public class C0161b implements Runnable {
        public C0161b() {
        }

        public void run() {
            C0159f1.this.mo900b();
        }
    }

    public C0159f1(View view, CharSequence charSequence) {
        this.f773e = view;
        this.f774f = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = C1069p.f3820a;
        this.f775g = Build.VERSION.SDK_INT >= 28 ? viewConfiguration.getScaledHoverSlop() : viewConfiguration.getScaledTouchSlop() / 2;
        mo899a();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: c */
    public static void m451c(C0159f1 f1Var) {
        C0159f1 f1Var2 = f771n;
        if (f1Var2 != null) {
            f1Var2.f773e.removeCallbacks(f1Var2.f776h);
        }
        f771n = f1Var;
        if (f1Var != null) {
            f1Var.f773e.postDelayed(f1Var.f776h, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    /* renamed from: a */
    public final void mo899a() {
        this.f778j = Integer.MAX_VALUE;
        this.f779k = Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public void mo900b() {
        if (f772o == this) {
            f772o = null;
            C0164g1 g1Var = this.f780l;
            if (g1Var != null) {
                g1Var.mo935a();
                this.f780l = null;
                mo899a();
                this.f773e.removeOnAttachStateChangeListener(this);
            }
        }
        if (f771n == this) {
            m451c((C0159f1) null);
        }
        this.f773e.removeCallbacks(this.f777i);
    }

    /* renamed from: d */
    public void mo901d(boolean z) {
        int i;
        int i2;
        long j;
        View view = this.f773e;
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        if (view.isAttachedToWindow()) {
            m451c((C0159f1) null);
            C0159f1 f1Var = f772o;
            if (f1Var != null) {
                f1Var.mo900b();
            }
            f772o = this;
            this.f781m = z;
            C0164g1 g1Var = new C0164g1(this.f773e.getContext());
            this.f780l = g1Var;
            View view2 = this.f773e;
            int i3 = this.f778j;
            int i4 = this.f779k;
            boolean z2 = this.f781m;
            CharSequence charSequence = this.f774f;
            if (g1Var.f787b.getParent() != null) {
                g1Var.mo935a();
            }
            g1Var.f788c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = g1Var.f789d;
            layoutParams.token = view2.getApplicationWindowToken();
            int dimensionPixelOffset = g1Var.f786a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view2.getWidth() < dimensionPixelOffset) {
                i3 = view2.getWidth() / 2;
            }
            if (view2.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = g1Var.f786a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                i = i4 + dimensionPixelOffset2;
                i2 = i4 - dimensionPixelOffset2;
            } else {
                i = view2.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = g1Var.f786a.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view2.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view2.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView != null) {
                rootView.getWindowVisibleDisplayFrame(g1Var.f790e);
                Rect rect = g1Var.f790e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = g1Var.f786a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    g1Var.f790e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(g1Var.f792g);
                view2.getLocationOnScreen(g1Var.f791f);
                int[] iArr = g1Var.f791f;
                int i5 = iArr[0];
                int[] iArr2 = g1Var.f792g;
                iArr[0] = i5 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + i3) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                g1Var.f787b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = g1Var.f787b.getMeasuredHeight();
                int[] iArr3 = g1Var.f791f;
                int i6 = ((iArr3[1] + i2) - dimensionPixelOffset3) - measuredHeight;
                int i7 = iArr3[1] + i + dimensionPixelOffset3;
                if (!z2 ? measuredHeight + i7 > g1Var.f790e.height() : i6 >= 0) {
                    layoutParams.y = i6;
                } else {
                    layoutParams.y = i7;
                }
            }
            ((WindowManager) g1Var.f786a.getSystemService("window")).addView(g1Var.f787b, g1Var.f789d);
            this.f773e.addOnAttachStateChangeListener(this);
            if (this.f781m) {
                j = 2500;
            } else {
                j = ((this.f773e.getWindowSystemUiVisibility() & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f773e.removeCallbacks(this.f777i);
            this.f773e.postDelayed(this.f777i, j);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.f780l != null && this.f781m) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f773e.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                mo899a();
                mo900b();
            }
        } else if (this.f773e.isEnabled() && this.f780l == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.f778j) > this.f775g || Math.abs(y - this.f779k) > this.f775g) {
                this.f778j = x;
                this.f779k = y;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m451c(this);
            }
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f778j = view.getWidth() / 2;
        this.f779k = view.getHeight() / 2;
        mo901d(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        mo900b();
    }
}
