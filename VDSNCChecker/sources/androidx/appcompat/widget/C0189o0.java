package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.dynamsoft.dbr.EnumBarcodeFormat;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p039g.C0934b;
import p058j0.C1061o;
import p058j0.C1070q;
import p069l.C1224f;

/* renamed from: androidx.appcompat.widget.o0 */
public class C0189o0 implements C1224f {

    /* renamed from: D */
    public static Method f869D;

    /* renamed from: E */
    public static Method f870E;

    /* renamed from: A */
    public Rect f871A;

    /* renamed from: B */
    public boolean f872B;

    /* renamed from: C */
    public PopupWindow f873C;

    /* renamed from: e */
    public Context f874e;

    /* renamed from: f */
    public ListAdapter f875f;

    /* renamed from: g */
    public C0172j0 f876g;

    /* renamed from: h */
    public int f877h = -2;

    /* renamed from: i */
    public int f878i = -2;

    /* renamed from: j */
    public int f879j;

    /* renamed from: k */
    public int f880k;

    /* renamed from: l */
    public int f881l = 1002;

    /* renamed from: m */
    public boolean f882m;

    /* renamed from: n */
    public boolean f883n;

    /* renamed from: o */
    public boolean f884o;

    /* renamed from: p */
    public int f885p = 0;

    /* renamed from: q */
    public int f886q = Integer.MAX_VALUE;

    /* renamed from: r */
    public DataSetObserver f887r;

    /* renamed from: s */
    public View f888s;

    /* renamed from: t */
    public AdapterView.OnItemClickListener f889t;

    /* renamed from: u */
    public final C0194e f890u = new C0194e();

    /* renamed from: v */
    public final C0193d f891v = new C0193d();

    /* renamed from: w */
    public final C0192c f892w = new C0192c();

    /* renamed from: x */
    public final C0190a f893x = new C0190a();

    /* renamed from: y */
    public final Handler f894y;

    /* renamed from: z */
    public final Rect f895z = new Rect();

    /* renamed from: androidx.appcompat.widget.o0$a */
    public class C0190a implements Runnable {
        public C0190a() {
        }

        public void run() {
            C0172j0 j0Var = C0189o0.this.f876g;
            if (j0Var != null) {
                j0Var.setListSelectionHidden(true);
                j0Var.requestLayout();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.o0$b */
    public class C0191b extends DataSetObserver {
        public C0191b() {
        }

        public void onChanged() {
            if (C0189o0.this.mo202b()) {
                C0189o0.this.mo205f();
            }
        }

        public void onInvalidated() {
            C0189o0.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.o0$c */
    public class C0192c implements AbsListView.OnScrollListener {
        public C0192c() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            boolean z = true;
            if (i == 1) {
                if (C0189o0.this.f873C.getInputMethodMode() != 2) {
                    z = false;
                }
                if (!z && C0189o0.this.f873C.getContentView() != null) {
                    C0189o0 o0Var = C0189o0.this;
                    o0Var.f894y.removeCallbacks(o0Var.f890u);
                    C0189o0.this.f890u.run();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.o0$d */
    public class C0193d implements View.OnTouchListener {
        public C0193d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C0189o0.this.f873C) != null && popupWindow.isShowing() && x >= 0 && x < C0189o0.this.f873C.getWidth() && y >= 0 && y < C0189o0.this.f873C.getHeight()) {
                C0189o0 o0Var = C0189o0.this;
                o0Var.f894y.postDelayed(o0Var.f890u, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                C0189o0 o0Var2 = C0189o0.this;
                o0Var2.f894y.removeCallbacks(o0Var2.f890u);
                return false;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.o0$e */
    public class C0194e implements Runnable {
        public C0194e() {
        }

        public void run() {
            C0172j0 j0Var = C0189o0.this.f876g;
            if (j0Var != null) {
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                if (j0Var.isAttachedToWindow() && C0189o0.this.f876g.getCount() > C0189o0.this.f876g.getChildCount()) {
                    int childCount = C0189o0.this.f876g.getChildCount();
                    C0189o0 o0Var = C0189o0.this;
                    if (childCount <= o0Var.f886q) {
                        o0Var.f873C.setInputMethodMode(2);
                        C0189o0.this.mo205f();
                    }
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                f869D = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
            }
            try {
                f870E = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public C0189o0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f874e = context;
        this.f894y = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0934b.f3472n, i, i2);
        this.f879j = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f880k = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f882m = true;
        }
        obtainStyledAttributes.recycle();
        C0197q qVar = new C0197q(context, attributeSet, i, i2);
        this.f873C = qVar;
        qVar.setInputMethodMode(1);
    }

    /* renamed from: b */
    public boolean mo202b() {
        return this.f873C.isShowing();
    }

    /* renamed from: c */
    public void mo1075c(int i) {
        this.f879j = i;
    }

    /* renamed from: d */
    public int mo1076d() {
        return this.f879j;
    }

    public void dismiss() {
        this.f873C.dismiss();
        this.f873C.setContentView((View) null);
        this.f876g = null;
        this.f894y.removeCallbacks(this.f890u);
    }

    /* renamed from: f */
    public void mo205f() {
        int i;
        int i2;
        C0172j0 j0Var;
        int i3;
        if (this.f876g == null) {
            C0172j0 q = mo1082q(this.f874e, !this.f872B);
            this.f876g = q;
            q.setAdapter(this.f875f);
            this.f876g.setOnItemClickListener(this.f889t);
            this.f876g.setFocusable(true);
            this.f876g.setFocusableInTouchMode(true);
            this.f876g.setOnItemSelectedListener(new C0187n0(this));
            this.f876g.setOnScrollListener(this.f892w);
            this.f873C.setContentView(this.f876g);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f873C.getContentView();
        }
        Drawable background = this.f873C.getBackground();
        int i4 = 0;
        if (background != null) {
            background.getPadding(this.f895z);
            Rect rect = this.f895z;
            int i5 = rect.top;
            i = rect.bottom + i5;
            if (!this.f882m) {
                this.f880k = -i5;
            }
        } else {
            this.f895z.setEmpty();
            i = 0;
        }
        int maxAvailableHeight = this.f873C.getMaxAvailableHeight(this.f888s, this.f880k, this.f873C.getInputMethodMode() == 2);
        if (this.f877h == -1) {
            i2 = maxAvailableHeight + i;
        } else {
            int i6 = this.f878i;
            if (i6 != -2) {
                i3 = EnumBarcodeFormat.BF_MICRO_QR;
                if (i6 == -1) {
                    int i7 = this.f874e.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.f895z;
                    i6 = i7 - (rect2.left + rect2.right);
                }
            } else {
                int i8 = this.f874e.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.f895z;
                i6 = i8 - (rect3.left + rect3.right);
                i3 = Integer.MIN_VALUE;
            }
            int a = this.f876g.mo957a(View.MeasureSpec.makeMeasureSpec(i6, i3), maxAvailableHeight - 0, -1);
            i2 = a + (a > 0 ? this.f876g.getPaddingBottom() + this.f876g.getPaddingTop() + i + 0 : 0);
        }
        boolean z = this.f873C.getInputMethodMode() == 2;
        this.f873C.setWindowLayoutType(this.f881l);
        if (this.f873C.isShowing()) {
            View view = this.f888s;
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            if (view.isAttachedToWindow()) {
                int i9 = this.f878i;
                if (i9 == -1) {
                    i9 = -1;
                } else if (i9 == -2) {
                    i9 = this.f888s.getWidth();
                }
                int i10 = this.f877h;
                if (i10 == -1) {
                    if (!z) {
                        i2 = -1;
                    }
                    if (z) {
                        this.f873C.setWidth(this.f878i == -1 ? -1 : 0);
                        this.f873C.setHeight(0);
                    } else {
                        PopupWindow popupWindow = this.f873C;
                        if (this.f878i == -1) {
                            i4 = -1;
                        }
                        popupWindow.setWidth(i4);
                        this.f873C.setHeight(-1);
                    }
                } else if (i10 != -2) {
                    i2 = i10;
                }
                this.f873C.setOutsideTouchable(true);
                this.f873C.update(this.f888s, this.f879j, this.f880k, i9 < 0 ? -1 : i9, i2 < 0 ? -1 : i2);
                return;
            }
            return;
        }
        int i11 = this.f878i;
        if (i11 == -1) {
            i11 = -1;
        } else if (i11 == -2) {
            i11 = this.f888s.getWidth();
        }
        int i12 = this.f877h;
        if (i12 == -1) {
            i2 = -1;
        } else if (i12 != -2) {
            i2 = i12;
        }
        this.f873C.setWidth(i11);
        this.f873C.setHeight(i2);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f869D;
            if (method != null) {
                try {
                    method.invoke(this.f873C, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        } else {
            this.f873C.setIsClippedToScreen(true);
        }
        this.f873C.setOutsideTouchable(true);
        this.f873C.setTouchInterceptor(this.f891v);
        if (this.f884o) {
            this.f873C.setOverlapAnchor(this.f883n);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f870E;
            if (method2 != null) {
                try {
                    method2.invoke(this.f873C, new Object[]{this.f871A});
                } catch (Exception unused2) {
                }
            }
        } else {
            this.f873C.setEpicenterBounds(this.f871A);
        }
        this.f873C.showAsDropDown(this.f888s, this.f879j, this.f880k, this.f885p);
        this.f876g.setSelection(-1);
        if ((!this.f872B || this.f876g.isInTouchMode()) && (j0Var = this.f876g) != null) {
            j0Var.setListSelectionHidden(true);
            j0Var.requestLayout();
        }
        if (!this.f872B) {
            this.f894y.post(this.f893x);
        }
    }

    /* renamed from: g */
    public int mo1077g() {
        if (!this.f882m) {
            return 0;
        }
        return this.f880k;
    }

    /* renamed from: i */
    public Drawable mo1078i() {
        return this.f873C.getBackground();
    }

    /* renamed from: k */
    public ListView mo208k() {
        return this.f876g;
    }

    /* renamed from: m */
    public void mo1079m(Drawable drawable) {
        this.f873C.setBackgroundDrawable(drawable);
    }

    /* renamed from: n */
    public void mo1080n(int i) {
        this.f880k = i;
        this.f882m = true;
    }

    /* renamed from: o */
    public void mo1081o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f887r;
        if (dataSetObserver == null) {
            this.f887r = new C0191b();
        } else {
            ListAdapter listAdapter2 = this.f875f;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f875f = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f887r);
        }
        C0172j0 j0Var = this.f876g;
        if (j0Var != null) {
            j0Var.setAdapter(this.f875f);
        }
    }

    /* renamed from: q */
    public C0172j0 mo1082q(Context context, boolean z) {
        return new C0172j0(context, z);
    }

    /* renamed from: r */
    public void mo1083r(int i) {
        Drawable background = this.f873C.getBackground();
        if (background != null) {
            background.getPadding(this.f895z);
            Rect rect = this.f895z;
            this.f878i = rect.left + rect.right + i;
            return;
        }
        this.f878i = i;
    }

    /* renamed from: s */
    public void mo1084s(boolean z) {
        this.f872B = z;
        this.f873C.setFocusable(z);
    }
}
