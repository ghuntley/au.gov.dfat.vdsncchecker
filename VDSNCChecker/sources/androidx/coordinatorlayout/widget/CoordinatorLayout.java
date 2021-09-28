package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.C0001b;
import p001a0.C0002a;
import p007au.gov.dfat.vdsncchecker.R;
import p052i0.C1024c;
import p058j0.C1054h;
import p058j0.C1055i;
import p058j0.C1056j;
import p058j0.C1057k;
import p058j0.C1061o;
import p058j0.C1070q;
import p058j0.C1076u;
import p063k.C1142f;
import p088o0.C1491a;
import p093p.C1558h;
import p099q.C1592d;
import p099q.C1595f;
import p135w.C1997a;
import p140x.C2113a;

public class CoordinatorLayout extends ViewGroup implements C1054h, C1055i {

    /* renamed from: A */
    public static final Comparator<View> f1259A = new C0256i();

    /* renamed from: B */
    public static final C1595f<Rect> f1260B = new C1024c(12);

    /* renamed from: x */
    public static final String f1261x;

    /* renamed from: y */
    public static final Class<?>[] f1262y = {Context.class, AttributeSet.class};

    /* renamed from: z */
    public static final ThreadLocal<Map<String, Constructor<C0249c>>> f1263z = new ThreadLocal<>();

    /* renamed from: e */
    public final List<View> f1264e = new ArrayList();

    /* renamed from: f */
    public final C1592d f1265f = new C1592d(1);

    /* renamed from: g */
    public final List<View> f1266g = new ArrayList();

    /* renamed from: h */
    public final List<View> f1267h = new ArrayList();

    /* renamed from: i */
    public final int[] f1268i = new int[2];

    /* renamed from: j */
    public final int[] f1269j = new int[2];

    /* renamed from: k */
    public boolean f1270k;

    /* renamed from: l */
    public boolean f1271l;

    /* renamed from: m */
    public int[] f1272m;

    /* renamed from: n */
    public View f1273n;

    /* renamed from: o */
    public View f1274o;

    /* renamed from: p */
    public C0253g f1275p;

    /* renamed from: q */
    public boolean f1276q;

    /* renamed from: r */
    public C1076u f1277r;

    /* renamed from: s */
    public boolean f1278s;

    /* renamed from: t */
    public Drawable f1279t;

    /* renamed from: u */
    public ViewGroup.OnHierarchyChangeListener f1280u;

    /* renamed from: v */
    public C1057k f1281v;

    /* renamed from: w */
    public final C1056j f1282w = new C1056j();

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    public class C0247a implements C1057k {
        public C0247a() {
        }

        /* renamed from: a */
        public C1076u mo1392a(View view, C1076u uVar) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!Objects.equals(coordinatorLayout.f1277r, uVar)) {
                coordinatorLayout.f1277r = uVar;
                boolean z = true;
                boolean z2 = uVar.mo4559d() > 0;
                coordinatorLayout.f1278s = z2;
                if (z2 || coordinatorLayout.getBackground() != null) {
                    z = false;
                }
                coordinatorLayout.setWillNotDraw(z);
                if (!uVar.mo4561f()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                        if (childAt.getFitsSystemWindows() && ((C0252f) childAt.getLayoutParams()).f1285a != null && uVar.mo4561f()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return uVar;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface C0248b {
        C0249c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class C0249c<V extends View> {
        public C0249c() {
        }

        public C0249c(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: a */
        public boolean mo1394a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: b */
        public boolean mo1395b(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: c */
        public void mo1396c(C0252f fVar) {
        }

        /* renamed from: d */
        public boolean mo1397d(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: e */
        public void mo1398e(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: f */
        public void mo1399f() {
        }

        /* renamed from: g */
        public boolean mo1400g(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: h */
        public boolean mo1401h(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: i */
        public boolean mo1402i(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: j */
        public boolean mo1403j(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        /* renamed from: k */
        public void mo1404k(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        }

        /* renamed from: l */
        public void mo1405l(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }

        /* renamed from: m */
        public boolean mo1406m(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: n */
        public void mo1407n(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: o */
        public Parcelable mo1408o(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        /* renamed from: p */
        public boolean mo1409p(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            return false;
        }

        /* renamed from: q */
        public void mo1410q(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        }

        /* renamed from: r */
        public boolean mo1411r(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public @interface C0250d {
        Class<? extends C0249c> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    public class C0251e implements ViewGroup.OnHierarchyChangeListener {
        public C0251e() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1280u;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo1374q(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1280u;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C0252f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public C0249c f1285a;

        /* renamed from: b */
        public boolean f1286b = false;

        /* renamed from: c */
        public int f1287c = 0;

        /* renamed from: d */
        public int f1288d = 0;

        /* renamed from: e */
        public int f1289e = -1;

        /* renamed from: f */
        public int f1290f = -1;

        /* renamed from: g */
        public int f1291g = 0;

        /* renamed from: h */
        public int f1292h = 0;

        /* renamed from: i */
        public int f1293i;

        /* renamed from: j */
        public int f1294j;

        /* renamed from: k */
        public View f1295k;

        /* renamed from: l */
        public View f1296l;

        /* renamed from: m */
        public boolean f1297m;

        /* renamed from: n */
        public boolean f1298n;

        /* renamed from: o */
        public boolean f1299o;

        /* renamed from: p */
        public boolean f1300p;

        /* renamed from: q */
        public final Rect f1301q = new Rect();

        public C0252f(int i, int i2) {
            super(i, i2);
        }

        public C0252f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C0249c cVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1997a.f5808b);
            this.f1287c = obtainStyledAttributes.getInteger(0, 0);
            this.f1290f = obtainStyledAttributes.getResourceId(1, -1);
            this.f1288d = obtainStyledAttributes.getInteger(2, 0);
            this.f1289e = obtainStyledAttributes.getInteger(6, -1);
            this.f1291g = obtainStyledAttributes.getInt(5, 0);
            this.f1292h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.f1286b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.f1261x;
                if (TextUtils.isEmpty(string)) {
                    cVar = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.f1261x;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<C0249c>>> threadLocal = CoordinatorLayout.f1263z;
                        Map map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap();
                            threadLocal.set(map);
                        }
                        Constructor<?> constructor = (Constructor) map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1262y);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        cVar = (C0249c) constructor.newInstance(new Object[]{context, attributeSet});
                    } catch (Exception e) {
                        throw new RuntimeException(C1142f.m3365a("Could not inflate Behavior subclass ", string), e);
                    }
                }
                this.f1285a = cVar;
            }
            obtainStyledAttributes.recycle();
            C0249c cVar2 = this.f1285a;
            if (cVar2 != null) {
                cVar2.mo1396c(this);
            }
        }

        public C0252f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0252f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0252f(C0252f fVar) {
            super(fVar);
        }

        /* renamed from: a */
        public boolean mo1415a(int i) {
            if (i == 0) {
                return this.f1298n;
            }
            if (i != 1) {
                return false;
            }
            return this.f1299o;
        }

        /* renamed from: b */
        public void mo1416b(int i, boolean z) {
            if (i == 0) {
                this.f1298n = z;
            } else if (i == 1) {
                this.f1299o = z;
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    public class C0253g implements ViewTreeObserver.OnPreDrawListener {
        public C0253g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo1374q(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    public static class C0254h extends C1491a {
        public static final Parcelable.Creator<C0254h> CREATOR = new C0255a();

        /* renamed from: g */
        public SparseArray<Parcelable> f1303g;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        public static class C0255a implements Parcelable.ClassLoaderCreator<C0254h> {
            public Object createFromParcel(Parcel parcel) {
                return new C0254h(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i) {
                return new C0254h[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0254h(parcel, classLoader);
            }
        }

        public C0254h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1303g = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f1303g.append(iArr[i], readParcelableArray[i]);
            }
        }

        public C0254h(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f4651e, i);
            SparseArray<Parcelable> sparseArray = this.f1303g;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f1303g.keyAt(i2);
                parcelableArr[i2] = this.f1303g.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    public static class C0256i implements Comparator<View> {
        public int compare(Object obj, Object obj2) {
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            float z = ((View) obj).getZ();
            float z2 = ((View) obj2).getZ();
            if (z > z2) {
                return -1;
            }
            return z < z2 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r0.getName()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            f1261x = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$i r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$i
            r0.<init>()
            f1259A = r0
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            f1262y = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f1263z = r0
            i0.c r0 = new i0.c
            r1 = 12
            r0.<init>(r1)
            f1260B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        int[] iArr = C1997a.f5807a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f1272m = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f1272m.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = this.f1272m;
                iArr2[i] = (int) (((float) iArr2[i]) * f);
            }
        }
        this.f1279t = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        mo1391y();
        super.setOnHierarchyChangeListener(new C0251e());
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: a */
    public static Rect m657a() {
        Rect rect = (Rect) f1260B.mo4463a();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: b */
    public final void mo1337b(C0252f fVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - fVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: c */
    public void mo1338c(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            mo1344g(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0252f) && super.checkLayoutParams(layoutParams);
    }

    /* renamed from: d */
    public void mo433d(View view, View view2, int i, int i2) {
        C1056j jVar = this.f1282w;
        if (i2 == 1) {
            jVar.f3804b = i;
        } else {
            jVar.f3803a = i;
        }
        this.f1274o = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            boolean a = ((C0252f) getChildAt(i3).getLayoutParams()).mo1415a(i2);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        C0249c cVar = ((C0252f) view.getLayoutParams()).f1285a;
        if (cVar != null) {
            Objects.requireNonNull(cVar);
        }
        return super.drawChild(canvas, view, j);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1279t;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public List<View> mo1342e(View view) {
        C1592d dVar = this.f1265f;
        int i = ((C1558h) dVar.f4937b).f4840g;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) ((C1558h) dVar.f4937b).mo5618l(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((C1558h) dVar.f4937b).mo5614i(i2));
            }
        }
        this.f1267h.clear();
        if (arrayList != null) {
            this.f1267h.addAll(arrayList);
        }
        return this.f1267h;
    }

    /* renamed from: f */
    public List<View> mo1343f(View view) {
        List list = (List) ((C1558h) this.f1265f.f4937b).getOrDefault(view, null);
        this.f1267h.clear();
        if (list != null) {
            this.f1267h.addAll(list);
        }
        return this.f1267h;
    }

    /* renamed from: g */
    public void mo1344g(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = C2113a.f6140a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = C2113a.f6140a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        C2113a.m5504a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = C2113a.f6141b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0252f(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0252f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        mo1386u();
        return Collections.unmodifiableList(this.f1264e);
    }

    public final C1076u getLastWindowInsets() {
        return this.f1277r;
    }

    public int getNestedScrollAxes() {
        return this.f1282w.mo4535a();
    }

    public Drawable getStatusBarBackground() {
        return this.f1279t;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    /* renamed from: h */
    public final void mo1354h(int i, Rect rect, Rect rect2, C0252f fVar, int i2, int i3) {
        int i4 = fVar.f1287c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = fVar.f1288d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int width = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            width -= i2 / 2;
        } else if (i6 != 5) {
            width -= i2;
        }
        if (i7 == 16) {
            height -= i3 / 2;
        } else if (i7 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* renamed from: i */
    public void mo446i(View view, int i) {
        C1056j jVar = this.f1282w;
        if (i == 1) {
            jVar.f3804b = 0;
        } else {
            jVar.f3803a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0252f fVar = (C0252f) childAt.getLayoutParams();
            if (fVar.mo1415a(i)) {
                C0249c cVar = fVar.f1285a;
                if (cVar != null) {
                    cVar.mo1410q(this, childAt, view, i);
                }
                fVar.mo1416b(i, false);
                fVar.f1300p = false;
            }
        }
        this.f1274o = null;
    }

    /* renamed from: j */
    public void mo447j(View view, int i, int i2, int[] iArr, int i3) {
        C0249c cVar;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                int i7 = i3;
            } else {
                C0252f fVar = (C0252f) childAt.getLayoutParams();
                if (fVar.mo1415a(i3) && (cVar = fVar.f1285a) != null) {
                    int[] iArr2 = this.f1268i;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.mo1404k(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f1268i;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.f1268i;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            mo1374q(1);
        }
    }

    /* renamed from: k */
    public final int mo1355k(int i) {
        int[] iArr = this.f1272m;
        if (iArr == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Keyline index ");
            sb2.append(i);
            sb2.append(" out of range for ");
            sb2.append(this);
            return 0;
        }
    }

    /* renamed from: l */
    public C0252f mo1356l(View view) {
        C0252f fVar = (C0252f) view.getLayoutParams();
        if (!fVar.f1286b) {
            if (view instanceof C0248b) {
                C0249c behavior = ((C0248b) view).getBehavior();
                C0249c cVar = fVar.f1285a;
                if (cVar != behavior) {
                    if (cVar != null) {
                        cVar.mo1399f();
                    }
                    fVar.f1285a = behavior;
                    fVar.f1286b = true;
                    if (behavior != null) {
                        behavior.mo1396c(fVar);
                    }
                }
            } else {
                C0250d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (C0250d) cls.getAnnotation(C0250d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        C0249c cVar2 = (C0249c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        C0249c cVar3 = fVar.f1285a;
                        if (cVar3 != cVar2) {
                            if (cVar3 != null) {
                                cVar3.mo1399f();
                            }
                            fVar.f1285a = cVar2;
                            fVar.f1286b = true;
                            if (cVar2 != null) {
                                cVar2.mo1396c(fVar);
                            }
                        }
                    } catch (Exception unused) {
                        Objects.requireNonNull(dVar.value());
                    }
                }
            }
            fVar.f1286b = true;
        }
        return fVar;
    }

    /* renamed from: m */
    public void mo450m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        C0249c cVar;
        boolean z;
        int i6;
        int childCount = getChildCount();
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C0252f fVar = (C0252f) childAt.getLayoutParams();
                if (fVar.mo1415a(i5) && (cVar = fVar.f1285a) != null) {
                    int[] iArr2 = this.f1268i;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.mo1405l(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f1268i;
                    i7 = i3 > 0 ? Math.max(i7, iArr3[0]) : Math.min(i7, iArr3[0]);
                    if (i4 > 0) {
                        z = true;
                        i6 = Math.max(i8, this.f1268i[1]);
                    } else {
                        z = true;
                        i6 = Math.min(i8, this.f1268i[1]);
                    }
                    i8 = i6;
                    z2 = z;
                }
            }
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i8;
        if (z2) {
            mo1374q(1);
        }
    }

    /* renamed from: n */
    public void mo451n(View view, int i, int i2, int i3, int i4, int i5) {
        mo450m(view, i, i2, i3, i4, 0, this.f1269j);
    }

    /* renamed from: o */
    public boolean mo452o(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        int i4 = 0;
        boolean z = false;
        while (true) {
            if (i4 >= childCount) {
                return z;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0252f fVar = (C0252f) childAt.getLayoutParams();
                C0249c cVar = fVar.f1285a;
                if (cVar != null) {
                    boolean p = cVar.mo1409p(this, childAt, view, view2, i, i2);
                    z |= p;
                    fVar.mo1416b(i3, p);
                } else {
                    fVar.mo1416b(i3, false);
                }
            }
            i4++;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo1387v(false);
        if (this.f1276q) {
            if (this.f1275p == null) {
                this.f1275p = new C0253g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1275p);
        }
        if (this.f1277r == null) {
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.f1271l = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1387v(false);
        if (this.f1276q && this.f1275p != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1275p);
        }
        View view = this.f1274o;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1271l = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1278s && this.f1279t != null) {
            C1076u uVar = this.f1277r;
            int d = uVar != null ? uVar.mo4559d() : 0;
            if (d > 0) {
                this.f1279t.setBounds(0, 0, getWidth(), d);
                this.f1279t.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            mo1387v(true);
        }
        boolean t = mo1385t(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            mo1387v(true);
        }
        return t;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0249c cVar;
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        int layoutDirection = getLayoutDirection();
        int size = this.f1264e.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f1264e.get(i5);
            if (view.getVisibility() != 8 && ((cVar = ((C0252f) view.getLayoutParams()).f1285a) == null || !cVar.mo1401h(this, view, layoutDirection))) {
                mo1375r(view, layoutDirection);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0184, code lost:
        if (r0.mo1402i(r30, r20, r8, r21, r23, 0) == false) goto L_0x0194;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0187  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.mo1386u()
            int r0 = r30.getChildCount()
            r8 = 0
            r1 = r8
        L_0x000b:
            r2 = 1
            if (r1 >= r0) goto L_0x003c
            android.view.View r3 = r7.getChildAt(r1)
            q.d r4 = r7.f1265f
            q.f r5 = r4.f4937b
            p.h r5 = (p093p.C1558h) r5
            int r5 = r5.f4840g
            r6 = r8
        L_0x001b:
            if (r6 >= r5) goto L_0x0034
            q.f r9 = r4.f4937b
            p.h r9 = (p093p.C1558h) r9
            java.lang.Object r9 = r9.mo5618l(r6)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x0031
            boolean r9 = r9.contains(r3)
            if (r9 == 0) goto L_0x0031
            r3 = r2
            goto L_0x0035
        L_0x0031:
            int r6 = r6 + 1
            goto L_0x001b
        L_0x0034:
            r3 = r8
        L_0x0035:
            if (r3 == 0) goto L_0x0039
            r0 = r2
            goto L_0x003d
        L_0x0039:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x003c:
            r0 = r8
        L_0x003d:
            boolean r1 = r7.f1276q
            if (r0 == r1) goto L_0x0071
            if (r0 == 0) goto L_0x005e
            boolean r0 = r7.f1271l
            if (r0 == 0) goto L_0x005b
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r7.f1275p
            if (r0 != 0) goto L_0x0052
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$g
            r0.<init>()
            r7.f1275p = r0
        L_0x0052:
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r7.f1275p
            r0.addOnPreDrawListener(r1)
        L_0x005b:
            r7.f1276q = r2
            goto L_0x0071
        L_0x005e:
            boolean r0 = r7.f1271l
            if (r0 == 0) goto L_0x006f
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r7.f1275p
            if (r0 == 0) goto L_0x006f
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r7.f1275p
            r0.removeOnPreDrawListener(r1)
        L_0x006f:
            r7.f1276q = r8
        L_0x0071:
            int r9 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r10 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            java.util.WeakHashMap<android.view.View, j0.q> r3 = p058j0.C1061o.f3808a
            int r11 = r30.getLayoutDirection()
            if (r11 != r2) goto L_0x008b
            r12 = r2
            goto L_0x008c
        L_0x008b:
            r12 = r8
        L_0x008c:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r9 + r10
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            j0.u r3 = r7.f1277r
            if (r3 == 0) goto L_0x00b5
            boolean r3 = r30.getFitsSystemWindows()
            if (r3 == 0) goto L_0x00b5
            r19 = r2
            goto L_0x00b7
        L_0x00b5:
            r19 = r8
        L_0x00b7:
            java.util.List<android.view.View> r2 = r7.f1264e
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = r8
            r3 = r2
        L_0x00c1:
            if (r3 >= r6) goto L_0x01da
            java.util.List<android.view.View> r0 = r7.f1264e
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x00dd
            r22 = r3
            r29 = r6
            r28 = r9
            goto L_0x01d1
        L_0x00dd:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0252f) r1
            int r0 = r1.f1289e
            if (r0 < 0) goto L_0x0127
            if (r13 == 0) goto L_0x0127
            int r0 = r7.mo1355k(r0)
            int r8 = r1.f1287c
            if (r8 != 0) goto L_0x00f5
            r8 = 8388661(0x800035, float:1.1755018E-38)
        L_0x00f5:
            int r8 = android.view.Gravity.getAbsoluteGravity(r8, r11)
            r8 = r8 & 7
            r22 = r2
            r2 = 3
            if (r8 != r2) goto L_0x0102
            if (r12 == 0) goto L_0x0107
        L_0x0102:
            r2 = 5
            if (r8 != r2) goto L_0x0113
            if (r12 == 0) goto L_0x0113
        L_0x0107:
            int r2 = r14 - r10
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r8 = r0
            r21 = r2
            goto L_0x012b
        L_0x0113:
            if (r8 != r2) goto L_0x0117
            if (r12 == 0) goto L_0x011c
        L_0x0117:
            r2 = 3
            if (r8 != r2) goto L_0x0125
            if (r12 == 0) goto L_0x0125
        L_0x011c:
            int r0 = r0 - r9
            r8 = 0
            int r0 = java.lang.Math.max(r8, r0)
            r21 = r0
            goto L_0x012b
        L_0x0125:
            r8 = 0
            goto L_0x0129
        L_0x0127:
            r22 = r2
        L_0x0129:
            r21 = r8
        L_0x012b:
            if (r19 == 0) goto L_0x015d
            boolean r0 = r20.getFitsSystemWindows()
            if (r0 != 0) goto L_0x015d
            j0.u r0 = r7.f1277r
            int r0 = r0.mo4557b()
            j0.u r2 = r7.f1277r
            int r2 = r2.mo4558c()
            int r2 = r2 + r0
            j0.u r0 = r7.f1277r
            int r0 = r0.mo4559d()
            j0.u r8 = r7.f1277r
            int r8 = r8.mo4556a()
            int r8 = r8 + r0
            int r0 = r14 - r2
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r8
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r8 = r0
            r23 = r2
            goto L_0x0161
        L_0x015d:
            r8 = r31
            r23 = r32
        L_0x0161:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f1285a
            if (r0 == 0) goto L_0x0187
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r8
            r27 = r4
            r4 = r21
            r28 = r9
            r9 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo1402i(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x01a1
            goto L_0x0194
        L_0x0187:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r9
            r25 = r22
            r22 = r3
            r9 = r5
        L_0x0194:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r8
            r3 = r21
            r4 = r23
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L_0x01a1:
            int r0 = r20.getMeasuredWidth()
            int r0 = r0 + r17
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r9, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r2 + r18
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r8 = r25
            int r2 = android.view.View.combineMeasuredStates(r8, r2)
            r5 = r0
            r4 = r1
        L_0x01d1:
            int r3 = r22 + 1
            r9 = r28
            r6 = r29
            r8 = 0
            goto L_0x00c1
        L_0x01da:
            r8 = r2
            r1 = r4
            r9 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r8
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r9, r2, r0)
            int r2 = r8 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0252f fVar = (C0252f) childAt.getLayoutParams();
                if (fVar.mo1415a(0)) {
                    C0249c cVar = fVar.f1285a;
                }
            }
        }
        return false;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        C0249c cVar;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0252f fVar = (C0252f) childAt.getLayoutParams();
                if (fVar.mo1415a(0) && (cVar = fVar.f1285a) != null) {
                    z |= cVar.mo1403j(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo447j(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo450m(view, i, i2, i3, i4, 0, this.f1269j);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo433d(view, view2, i, 0);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0254h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0254h hVar = (C0254h) parcelable;
        super.onRestoreInstanceState(hVar.f4651e);
        SparseArray<Parcelable> sparseArray = hVar.f1303g;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0249c cVar = mo1356l(childAt).f1285a;
            if (!(id == -1 || cVar == null || (parcelable2 = sparseArray.get(id)) == null)) {
                cVar.mo1407n(this, childAt, parcelable2);
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable o;
        C0254h hVar = new C0254h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0249c cVar = ((C0252f) childAt.getLayoutParams()).f1285a;
            if (!(id == -1 || cVar == null || (o = cVar.mo1408o(this, childAt)) == null)) {
                sparseArray.append(id, o);
            }
        }
        hVar.f1303g = sparseArray;
        return hVar;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo452o(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo446i(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1273n
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.mo1385t(r1, r4)
            if (r3 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0015:
            r3 = r5
        L_0x0016:
            android.view.View r6 = r0.f1273n
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0252f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f1285a
            if (r6 == 0) goto L_0x0029
            android.view.View r7 = r0.f1273n
            boolean r6 = r6.mo1411r(r0, r7, r1)
            goto L_0x002a
        L_0x0029:
            r6 = r5
        L_0x002a:
            android.view.View r7 = r0.f1273n
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.mo1387v(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public boolean mo1373p(View view, int i, int i2) {
        Rect a = m657a();
        mo1344g(view, a);
        try {
            return a.contains(i, i2);
        } finally {
            a.setEmpty();
            f1260B.mo4464c(a);
        }
    }

    /* renamed from: q */
    public final void mo1374q(int i) {
        int i2;
        Rect rect;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        Rect rect2;
        int i10;
        int i11;
        int i12;
        C0252f fVar;
        C0249c cVar;
        int i13 = i;
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        int layoutDirection = getLayoutDirection();
        int size = this.f1264e.size();
        Rect a = m657a();
        Rect a2 = m657a();
        Rect a3 = m657a();
        int i14 = 0;
        while (i14 < size) {
            View view = this.f1264e.get(i14);
            C0252f fVar2 = (C0252f) view.getLayoutParams();
            if (i13 == 0 && view.getVisibility() == 8) {
                i3 = size;
                rect = a3;
                i2 = i14;
            } else {
                int i15 = 0;
                while (i15 < i14) {
                    if (fVar2.f1296l == this.f1264e.get(i15)) {
                        C0252f fVar3 = (C0252f) view.getLayoutParams();
                        if (fVar3.f1295k != null) {
                            Rect a4 = m657a();
                            Rect a5 = m657a();
                            Rect a6 = m657a();
                            mo1344g(fVar3.f1295k, a4);
                            mo1338c(view, false, a5);
                            int measuredWidth = view.getMeasuredWidth();
                            i12 = size;
                            int measuredHeight = view.getMeasuredHeight();
                            int i16 = measuredWidth;
                            Rect rect3 = a6;
                            i11 = i14;
                            Rect rect4 = a5;
                            Rect rect5 = a4;
                            C0252f fVar4 = fVar3;
                            i10 = i15;
                            rect2 = a3;
                            fVar = fVar2;
                            mo1354h(layoutDirection, a4, rect3, fVar3, i16, measuredHeight);
                            Rect rect6 = rect3;
                            boolean z4 = (rect6.left == rect4.left && rect6.top == rect4.top) ? false : true;
                            C0252f fVar5 = fVar4;
                            mo1337b(fVar5, rect6, i16, measuredHeight);
                            int i17 = rect6.left - rect4.left;
                            int i18 = rect6.top - rect4.top;
                            if (i17 != 0) {
                                WeakHashMap<View, C1070q> weakHashMap2 = C1061o.f3808a;
                                view.offsetLeftAndRight(i17);
                            }
                            if (i18 != 0) {
                                WeakHashMap<View, C1070q> weakHashMap3 = C1061o.f3808a;
                                view.offsetTopAndBottom(i18);
                            }
                            if (z4 && (cVar = fVar5.f1285a) != null) {
                                cVar.mo1397d(this, view, fVar5.f1295k);
                            }
                            rect5.setEmpty();
                            C1595f<Rect> fVar6 = f1260B;
                            fVar6.mo4464c(rect5);
                            rect4.setEmpty();
                            fVar6.mo4464c(rect4);
                            rect6.setEmpty();
                            fVar6.mo4464c(rect6);
                            i15 = i10 + 1;
                            fVar2 = fVar;
                            size = i12;
                            i14 = i11;
                            a3 = rect2;
                        }
                    }
                    i10 = i15;
                    i12 = size;
                    rect2 = a3;
                    i11 = i14;
                    fVar = fVar2;
                    i15 = i10 + 1;
                    fVar2 = fVar;
                    size = i12;
                    i14 = i11;
                    a3 = rect2;
                }
                int i19 = size;
                Rect rect7 = a3;
                i2 = i14;
                C0252f fVar7 = fVar2;
                mo1338c(view, true, a2);
                if (fVar7.f1291g != 0 && !a2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar7.f1291g, layoutDirection);
                    int i20 = absoluteGravity & 112;
                    if (i20 == 48) {
                        a.top = Math.max(a.top, a2.bottom);
                    } else if (i20 == 80) {
                        a.bottom = Math.max(a.bottom, getHeight() - a2.top);
                    }
                    int i21 = absoluteGravity & 7;
                    if (i21 == 3) {
                        a.left = Math.max(a.left, a2.right);
                    } else if (i21 == 5) {
                        a.right = Math.max(a.right, getWidth() - a2.left);
                    }
                }
                if (fVar7.f1292h != 0 && view.getVisibility() == 0) {
                    WeakHashMap<View, C1070q> weakHashMap4 = C1061o.f3808a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        C0252f fVar8 = (C0252f) view.getLayoutParams();
                        C0249c cVar2 = fVar8.f1285a;
                        Rect a7 = m657a();
                        Rect a8 = m657a();
                        a8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (cVar2 == null || !cVar2.mo1394a(this, view, a7)) {
                            a7.set(a8);
                        } else if (!a8.contains(a7)) {
                            StringBuilder a9 = C0001b.m0a("Rect should be within the child's bounds. Rect:");
                            a9.append(a7.toShortString());
                            a9.append(" | Bounds:");
                            a9.append(a8.toShortString());
                            throw new IllegalArgumentException(a9.toString());
                        }
                        a8.setEmpty();
                        C1595f<Rect> fVar9 = f1260B;
                        fVar9.mo4464c(a8);
                        if (!a7.isEmpty()) {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar8.f1292h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i8 = (a7.top - fVar8.topMargin) - fVar8.f1294j) >= (i9 = a.top)) {
                                z2 = false;
                            } else {
                                mo1390x(view, i9 - i8);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - a7.bottom) - fVar8.bottomMargin) + fVar8.f1294j) < (i7 = a.bottom)) {
                                mo1390x(view, height - i7);
                                z2 = true;
                            }
                            if (!z2) {
                                mo1390x(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i5 = (a7.left - fVar8.leftMargin) - fVar8.f1293i) >= (i6 = a.left)) {
                                z3 = false;
                            } else {
                                mo1389w(view, i6 - i5);
                                z3 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - a7.right) - fVar8.rightMargin) + fVar8.f1293i) < (i4 = a.right)) {
                                mo1389w(view, width - i4);
                                z3 = true;
                            }
                            if (!z3) {
                                mo1389w(view, 0);
                            }
                        }
                        a7.setEmpty();
                        fVar9.mo4464c(a7);
                    }
                }
                if (i13 != 2) {
                    rect = rect7;
                    rect.set(((C0252f) view.getLayoutParams()).f1301q);
                    if (rect.equals(a2)) {
                        i3 = i19;
                    } else {
                        ((C0252f) view.getLayoutParams()).f1301q.set(a2);
                    }
                } else {
                    rect = rect7;
                }
                i3 = i19;
                for (int i22 = i2 + 1; i22 < i3; i22++) {
                    View view2 = this.f1264e.get(i22);
                    C0252f fVar10 = (C0252f) view2.getLayoutParams();
                    C0249c cVar3 = fVar10.f1285a;
                    if (cVar3 != null && cVar3.mo1395b(this, view2, view)) {
                        if (i13 != 0 || !fVar10.f1300p) {
                            if (i13 != 2) {
                                z = cVar3.mo1397d(this, view2, view);
                            } else {
                                cVar3.mo1398e(this, view2, view);
                                z = true;
                            }
                            if (i13 == 1) {
                                fVar10.f1300p = z;
                            }
                        } else {
                            fVar10.f1300p = false;
                        }
                    }
                }
            }
            i14 = i2 + 1;
            size = i3;
            a3 = rect;
        }
        Rect rect8 = a3;
        a.setEmpty();
        C1595f<Rect> fVar11 = f1260B;
        fVar11.mo4464c(a);
        a2.setEmpty();
        fVar11.mo4464c(a2);
        rect8.setEmpty();
        fVar11.mo4464c(rect8);
    }

    /* renamed from: r */
    public void mo1375r(View view, int i) {
        C0252f fVar = (C0252f) view.getLayoutParams();
        View view2 = fVar.f1295k;
        int i2 = 0;
        if (view2 == null && fVar.f1290f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (view2 != null) {
            Rect a = m657a();
            Rect a2 = m657a();
            try {
                mo1344g(view2, a);
                C0252f fVar2 = (C0252f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                mo1354h(i, a, a2, fVar2, measuredWidth, measuredHeight);
                mo1337b(fVar2, a2, measuredWidth, measuredHeight);
                view.layout(a2.left, a2.top, a2.right, a2.bottom);
            } finally {
                a.setEmpty();
                C1595f<Rect> fVar3 = f1260B;
                fVar3.mo4464c(a);
                a2.setEmpty();
                fVar3.mo4464c(a2);
            }
        } else {
            int i3 = fVar.f1289e;
            if (i3 >= 0) {
                C0252f fVar4 = (C0252f) view.getLayoutParams();
                int i4 = fVar4.f1287c;
                if (i4 == 0) {
                    i4 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
                int i5 = absoluteGravity & 7;
                int i6 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i == 1) {
                    i3 = width - i3;
                }
                int k = mo1355k(i3) - measuredWidth2;
                if (i5 == 1) {
                    k += measuredWidth2 / 2;
                } else if (i5 == 5) {
                    k += measuredWidth2;
                }
                if (i6 == 16) {
                    i2 = 0 + (measuredHeight2 / 2);
                } else if (i6 == 80) {
                    i2 = measuredHeight2 + 0;
                }
                int max = Math.max(getPaddingLeft() + fVar4.leftMargin, Math.min(k, ((width - getPaddingRight()) - measuredWidth2) - fVar4.rightMargin));
                int max2 = Math.max(getPaddingTop() + fVar4.topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - fVar4.bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            C0252f fVar5 = (C0252f) view.getLayoutParams();
            Rect a3 = m657a();
            a3.set(getPaddingLeft() + fVar5.leftMargin, getPaddingTop() + fVar5.topMargin, (getWidth() - getPaddingRight()) - fVar5.rightMargin, (getHeight() - getPaddingBottom()) - fVar5.bottomMargin);
            if (this.f1277r != null) {
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    a3.left = this.f1277r.mo4557b() + a3.left;
                    a3.top = this.f1277r.mo4559d() + a3.top;
                    a3.right -= this.f1277r.mo4558c();
                    a3.bottom -= this.f1277r.mo4556a();
                }
            }
            Rect a4 = m657a();
            int i7 = fVar5.f1287c;
            if ((i7 & 7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            Gravity.apply(i7, view.getMeasuredWidth(), view.getMeasuredHeight(), a3, a4, i);
            view.layout(a4.left, a4.top, a4.right, a4.bottom);
            a3.setEmpty();
            C1595f<Rect> fVar6 = f1260B;
            fVar6.mo4464c(a3);
            a4.setEmpty();
            fVar6.mo4464c(a4);
        }
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C0249c cVar = ((C0252f) view.getLayoutParams()).f1285a;
        if (cVar == null || !cVar.mo1406m(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f1270k) {
            mo1387v(false);
            this.f1270k = true;
        }
    }

    /* renamed from: s */
    public void mo1378s(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        mo1391y();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1280u = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1279t;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f1279t = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f1279t.setState(getDrawableState());
                }
                Drawable drawable4 = this.f1279t;
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                drawable4.setLayoutDirection(getLayoutDirection());
                this.f1279t.setVisible(getVisibility() == 0, false);
                this.f1279t.setCallback(this);
            }
            WeakHashMap<View, C1070q> weakHashMap2 = C1061o.f3808a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            Context context = getContext();
            Object obj = C0002a.f0a;
            drawable = C0002a.C0004b.m5b(context, i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1279t;
        if (drawable != null && drawable.isVisible() != z) {
            this.f1279t.setVisible(z, false);
        }
    }

    /* renamed from: t */
    public final boolean mo1385t(MotionEvent motionEvent, int i) {
        boolean z;
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f1266g;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        Comparator<View> comparator = f1259A;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = list.get(i4);
            C0252f fVar = (C0252f) view.getLayoutParams();
            C0249c cVar = fVar.f1285a;
            if ((!z2 && !z3) || actionMasked == 0) {
                if (!z2 && cVar != null) {
                    if (i2 == 0) {
                        z2 = cVar.mo1400g(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z2 = cVar.mo1411r(this, view, motionEvent2);
                    }
                    if (z2) {
                        this.f1273n = view;
                    }
                }
                if (fVar.f1285a == null) {
                    fVar.f1297m = false;
                }
                boolean z4 = fVar.f1297m;
                if (z4) {
                    z = true;
                } else {
                    z = z4 | false;
                    fVar.f1297m = z;
                }
                z3 = z && !z4;
                if (z && !z3) {
                    break;
                }
            } else if (cVar != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    cVar.mo1400g(this, view, motionEvent3);
                } else if (i2 == 1) {
                    cVar.mo1411r(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
        if (r5 != false) goto L_0x00c4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0163 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x010a  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1386u() {
        /*
            r12 = this;
            java.util.List<android.view.View> r0 = r12.f1264e
            r0.clear()
            q.d r0 = r12.f1265f
            q.f r1 = r0.f4937b
            p.h r1 = (p093p.C1558h) r1
            int r1 = r1.f4840g
            r2 = 0
            r3 = r2
        L_0x000f:
            if (r3 >= r1) goto L_0x0023
            q.f r4 = r0.f4937b
            p.h r4 = (p093p.C1558h) r4
            java.lang.Object r4 = r4.mo5618l(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L_0x0020
            r0.mo5715d(r4)
        L_0x0020:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0023:
            q.f r0 = r0.f4937b
            p.h r0 = (p093p.C1558h) r0
            r0.clear()
            int r0 = r12.getChildCount()
            r1 = r2
        L_0x002f:
            if (r1 >= r0) goto L_0x0190
            android.view.View r3 = r12.getChildAt(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = r12.mo1356l(r3)
            int r5 = r4.f1290f
            r6 = -1
            r7 = 0
            r8 = 1
            if (r5 != r6) goto L_0x0046
            r4.f1296l = r7
            r4.f1295k = r7
            goto L_0x00c4
        L_0x0046:
            android.view.View r5 = r4.f1295k
            if (r5 == 0) goto L_0x0077
            int r5 = r5.getId()
            int r6 = r4.f1290f
            if (r5 == r6) goto L_0x0053
            goto L_0x0070
        L_0x0053:
            android.view.View r5 = r4.f1295k
            android.view.ViewParent r6 = r5.getParent()
        L_0x0059:
            if (r6 == r12) goto L_0x0072
            if (r6 == 0) goto L_0x006c
            if (r6 != r3) goto L_0x0060
            goto L_0x006c
        L_0x0060:
            boolean r9 = r6 instanceof android.view.View
            if (r9 == 0) goto L_0x0067
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x0067:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x0059
        L_0x006c:
            r4.f1296l = r7
            r4.f1295k = r7
        L_0x0070:
            r5 = r2
            goto L_0x0075
        L_0x0072:
            r4.f1296l = r5
            r5 = r8
        L_0x0075:
            if (r5 != 0) goto L_0x00c4
        L_0x0077:
            int r5 = r4.f1290f
            android.view.View r5 = r12.findViewById(r5)
            r4.f1295k = r5
            if (r5 == 0) goto L_0x00ba
            if (r5 != r12) goto L_0x0092
            boolean r5 = r12.isInEditMode()
            if (r5 == 0) goto L_0x008a
            goto L_0x00c0
        L_0x008a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            r0.<init>(r1)
            throw r0
        L_0x0092:
            android.view.ViewParent r6 = r5.getParent()
        L_0x0096:
            if (r6 == r12) goto L_0x00b7
            if (r6 == 0) goto L_0x00b7
            if (r6 != r3) goto L_0x00ab
            boolean r5 = r12.isInEditMode()
            if (r5 == 0) goto L_0x00a3
            goto L_0x00c0
        L_0x00a3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            r0.<init>(r1)
            throw r0
        L_0x00ab:
            boolean r9 = r6 instanceof android.view.View
            if (r9 == 0) goto L_0x00b2
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x00b2:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x0096
        L_0x00b7:
            r4.f1296l = r5
            goto L_0x00c4
        L_0x00ba:
            boolean r5 = r12.isInEditMode()
            if (r5 == 0) goto L_0x016b
        L_0x00c0:
            r4.f1296l = r7
            r4.f1295k = r7
        L_0x00c4:
            q.d r5 = r12.f1265f
            r5.mo5712a(r3)
            r5 = r2
        L_0x00ca:
            if (r5 >= r0) goto L_0x0167
            if (r5 != r1) goto L_0x00d0
            goto L_0x0163
        L_0x00d0:
            android.view.View r6 = r12.getChildAt(r5)
            android.view.View r9 = r4.f1296l
            if (r6 == r9) goto L_0x0107
            java.util.WeakHashMap<android.view.View, j0.q> r9 = p058j0.C1061o.f3808a
            int r9 = r12.getLayoutDirection()
            android.view.ViewGroup$LayoutParams r10 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0252f) r10
            int r10 = r10.f1291g
            int r10 = android.view.Gravity.getAbsoluteGravity(r10, r9)
            if (r10 == 0) goto L_0x00f7
            int r11 = r4.f1292h
            int r9 = android.view.Gravity.getAbsoluteGravity(r11, r9)
            r9 = r9 & r10
            if (r9 != r10) goto L_0x00f7
            r9 = r8
            goto L_0x00f8
        L_0x00f7:
            r9 = r2
        L_0x00f8:
            if (r9 != 0) goto L_0x0107
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r9 = r4.f1285a
            if (r9 == 0) goto L_0x0105
            boolean r9 = r9.mo1395b(r12, r3, r6)
            if (r9 == 0) goto L_0x0105
            goto L_0x0107
        L_0x0105:
            r9 = r2
            goto L_0x0108
        L_0x0107:
            r9 = r8
        L_0x0108:
            if (r9 == 0) goto L_0x0163
            q.d r9 = r12.f1265f
            q.f r9 = r9.f4937b
            p.h r9 = (p093p.C1558h) r9
            int r9 = r9.mo5608f(r6)
            if (r9 < 0) goto L_0x0118
            r9 = r8
            goto L_0x0119
        L_0x0118:
            r9 = r2
        L_0x0119:
            if (r9 != 0) goto L_0x0120
            q.d r9 = r12.f1265f
            r9.mo5712a(r6)
        L_0x0120:
            q.d r9 = r12.f1265f
            q.f r10 = r9.f4937b
            p.h r10 = (p093p.C1558h) r10
            int r10 = r10.mo5608f(r6)
            if (r10 < 0) goto L_0x012e
            r10 = r8
            goto L_0x012f
        L_0x012e:
            r10 = r2
        L_0x012f:
            if (r10 == 0) goto L_0x015b
            q.f r10 = r9.f4937b
            p.h r10 = (p093p.C1558h) r10
            int r10 = r10.mo5608f(r3)
            if (r10 < 0) goto L_0x013d
            r10 = r8
            goto L_0x013e
        L_0x013d:
            r10 = r2
        L_0x013e:
            if (r10 == 0) goto L_0x015b
            q.f r10 = r9.f4937b
            p.h r10 = (p093p.C1558h) r10
            java.lang.Object r10 = r10.getOrDefault(r6, r7)
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 != 0) goto L_0x0157
            java.util.ArrayList r10 = r9.mo5714c()
            q.f r9 = r9.f4937b
            p.h r9 = (p093p.C1558h) r9
            r9.put(r6, r10)
        L_0x0157:
            r10.add(r3)
            goto L_0x0163
        L_0x015b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            r0.<init>(r1)
            throw r0
        L_0x0163:
            int r5 = r5 + 1
            goto L_0x00ca
        L_0x0167:
            int r1 = r1 + 1
            goto L_0x002f
        L_0x016b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not find CoordinatorLayout descendant view with id "
            java.lang.StringBuilder r1 = p000a.C0001b.m0a(r1)
            android.content.res.Resources r2 = r12.getResources()
            int r4 = r4.f1290f
            java.lang.String r2 = r2.getResourceName(r4)
            r1.append(r2)
            java.lang.String r2 = " to anchor view "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0190:
            java.util.List<android.view.View> r0 = r12.f1264e
            q.d r1 = r12.f1265f
            q.f r3 = r1.f4938c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.clear()
            java.lang.Object r3 = r1.f4939d
            java.util.HashSet r3 = (java.util.HashSet) r3
            r3.clear()
            q.f r3 = r1.f4937b
            p.h r3 = (p093p.C1558h) r3
            int r3 = r3.f4840g
        L_0x01a8:
            if (r2 >= r3) goto L_0x01c0
            q.f r4 = r1.f4937b
            p.h r4 = (p093p.C1558h) r4
            java.lang.Object r4 = r4.mo5614i(r2)
            q.f r5 = r1.f4938c
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r6 = r1.f4939d
            java.util.HashSet r6 = (java.util.HashSet) r6
            r1.mo5713b(r4, r5, r6)
            int r2 = r2 + 1
            goto L_0x01a8
        L_0x01c0:
            q.f r1 = r1.f4938c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r0.addAll(r1)
            java.util.List<android.view.View> r0 = r12.f1264e
            java.util.Collections.reverse(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.mo1386u():void");
    }

    /* renamed from: v */
    public final void mo1387v(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0249c cVar = ((C0252f) childAt.getLayoutParams()).f1285a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    cVar.mo1400g(this, childAt, obtain);
                } else {
                    cVar.mo1411r(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0252f) getChildAt(i2).getLayoutParams()).f1297m = false;
        }
        this.f1273n = null;
        this.f1270k = false;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1279t;
    }

    /* renamed from: w */
    public final void mo1389w(View view, int i) {
        C0252f fVar = (C0252f) view.getLayoutParams();
        int i2 = fVar.f1293i;
        if (i2 != i) {
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            view.offsetLeftAndRight(i - i2);
            fVar.f1293i = i;
        }
    }

    /* renamed from: x */
    public final void mo1390x(View view, int i) {
        C0252f fVar = (C0252f) view.getLayoutParams();
        int i2 = fVar.f1294j;
        if (i2 != i) {
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            view.offsetTopAndBottom(i - i2);
            fVar.f1294j = i;
        }
    }

    /* renamed from: y */
    public final void mo1391y() {
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        if (getFitsSystemWindows()) {
            if (this.f1281v == null) {
                this.f1281v = new C0247a();
            }
            C1061o.C1063b.m3038c(this, this.f1281v);
            setSystemUiVisibility(1280);
            return;
        }
        C1061o.C1063b.m3038c(this, (C1057k) null);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0252f) {
            return new C0252f((C0252f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0252f((ViewGroup.MarginLayoutParams) layoutParams) : new C0252f(layoutParams);
    }
}
