package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.C0060b;
import java.util.Objects;
import java.util.WeakHashMap;
import p051i.C1021a;
import p058j0.C1061o;
import p058j0.C1070q;

/* renamed from: androidx.appcompat.widget.y */
public class C0219y extends Spinner {

    /* renamed from: m */
    public static final int[] f975m = {16843505};

    /* renamed from: e */
    public final C0157f f976e;

    /* renamed from: f */
    public final Context f977f;

    /* renamed from: g */
    public C0180l0 f978g;

    /* renamed from: h */
    public SpinnerAdapter f979h;

    /* renamed from: i */
    public final boolean f980i;

    /* renamed from: j */
    public C0229f f981j;

    /* renamed from: k */
    public int f982k;

    /* renamed from: l */
    public final Rect f983l = new Rect();

    /* renamed from: androidx.appcompat.widget.y$a */
    public class C0220a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0220a() {
        }

        public void onGlobalLayout() {
            if (!C0219y.this.getInternalPopup().mo1200b()) {
                C0219y.this.mo1170b();
            }
            ViewTreeObserver viewTreeObserver = C0219y.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.y$b */
    public class C0221b implements C0229f, DialogInterface.OnClickListener {

        /* renamed from: e */
        public C0060b f985e;

        /* renamed from: f */
        public ListAdapter f986f;

        /* renamed from: g */
        public CharSequence f987g;

        public C0221b() {
        }

        /* renamed from: b */
        public boolean mo1200b() {
            C0060b bVar = this.f985e;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        /* renamed from: c */
        public void mo1201c(int i) {
        }

        /* renamed from: d */
        public int mo1202d() {
            return 0;
        }

        public void dismiss() {
            C0060b bVar = this.f985e;
            if (bVar != null) {
                bVar.dismiss();
                this.f985e = null;
            }
        }

        /* renamed from: e */
        public void mo1204e(int i, int i2) {
            if (this.f986f != null) {
                C0060b.C0061a aVar = new C0060b.C0061a(C0219y.this.getPopupContext());
                CharSequence charSequence = this.f987g;
                if (charSequence != null) {
                    aVar.f264a.f244d = charSequence;
                }
                ListAdapter listAdapter = this.f986f;
                int selectedItemPosition = C0219y.this.getSelectedItemPosition();
                AlertController.C0056b bVar = aVar.f264a;
                bVar.f255o = listAdapter;
                bVar.f256p = this;
                bVar.f259s = selectedItemPosition;
                bVar.f258r = true;
                C0060b a = aVar.mo5a();
                this.f985e = a;
                ListView listView = a.f263g.f218g;
                listView.setTextDirection(i);
                listView.setTextAlignment(i2);
                this.f985e.show();
            }
        }

        /* renamed from: g */
        public int mo1205g() {
            return 0;
        }

        /* renamed from: i */
        public Drawable mo1206i() {
            return null;
        }

        /* renamed from: j */
        public CharSequence mo1207j() {
            return this.f987g;
        }

        /* renamed from: l */
        public void mo1208l(CharSequence charSequence) {
            this.f987g = charSequence;
        }

        /* renamed from: m */
        public void mo1209m(Drawable drawable) {
        }

        /* renamed from: n */
        public void mo1210n(int i) {
        }

        /* renamed from: o */
        public void mo1211o(ListAdapter listAdapter) {
            this.f986f = listAdapter;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C0219y.this.setSelection(i);
            if (C0219y.this.getOnItemClickListener() != null) {
                C0219y.this.performItemClick((View) null, i, this.f986f.getItemId(i));
            }
            C0060b bVar = this.f985e;
            if (bVar != null) {
                bVar.dismiss();
                this.f985e = null;
            }
        }

        /* renamed from: p */
        public void mo1213p(int i) {
        }
    }

    /* renamed from: androidx.appcompat.widget.y$c */
    public static class C0222c implements ListAdapter, SpinnerAdapter {

        /* renamed from: e */
        public SpinnerAdapter f989e;

        /* renamed from: f */
        public ListAdapter f990f;

        public C0222c(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f989e = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f990f = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof C0218x0) {
                C0218x0 x0Var = (C0218x0) spinnerAdapter;
                if (x0Var.getDropDownViewTheme() == null) {
                    x0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f990f;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f989e;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f989e;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f989e;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f989e;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f989e;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f989e;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f990f;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f989e;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f989e;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.y$d */
    public class C0223d extends C0189o0 implements C0229f {

        /* renamed from: F */
        public CharSequence f991F;

        /* renamed from: G */
        public ListAdapter f992G;

        /* renamed from: H */
        public final Rect f993H = new Rect();

        /* renamed from: I */
        public int f994I;

        /* renamed from: androidx.appcompat.widget.y$d$a */
        public class C0224a implements AdapterView.OnItemClickListener {
            public C0224a(C0219y yVar) {
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0219y.this.setSelection(i);
                if (C0219y.this.getOnItemClickListener() != null) {
                    C0223d dVar = C0223d.this;
                    C0219y.this.performItemClick(view, i, dVar.f992G.getItemId(i));
                }
                C0223d.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.y$d$b */
        public class C0225b implements ViewTreeObserver.OnGlobalLayoutListener {
            public C0225b() {
            }

            public void onGlobalLayout() {
                C0223d dVar = C0223d.this;
                C0219y yVar = C0219y.this;
                Objects.requireNonNull(dVar);
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                if (!(yVar.isAttachedToWindow() && yVar.getGlobalVisibleRect(dVar.f993H))) {
                    C0223d.this.dismiss();
                    return;
                }
                C0223d.this.mo1227t();
                C0223d.this.mo205f();
            }
        }

        /* renamed from: androidx.appcompat.widget.y$d$c */
        public class C0226c implements PopupWindow.OnDismissListener {

            /* renamed from: e */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f998e;

            public C0226c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f998e = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0219y.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f998e);
                }
            }
        }

        public C0223d(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i, 0);
            this.f888s = C0219y.this;
            mo1084s(true);
            this.f889t = new C0224a(C0219y.this);
        }

        /* renamed from: e */
        public void mo1204e(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean b = mo202b();
            mo1227t();
            this.f873C.setInputMethodMode(2);
            mo205f();
            C0172j0 j0Var = this.f876g;
            j0Var.setChoiceMode(1);
            j0Var.setTextDirection(i);
            j0Var.setTextAlignment(i2);
            int selectedItemPosition = C0219y.this.getSelectedItemPosition();
            C0172j0 j0Var2 = this.f876g;
            if (mo202b() && j0Var2 != null) {
                j0Var2.setListSelectionHidden(false);
                j0Var2.setSelection(selectedItemPosition);
                if (j0Var2.getChoiceMode() != 0) {
                    j0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!b && (viewTreeObserver = C0219y.this.getViewTreeObserver()) != null) {
                C0225b bVar = new C0225b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                this.f873C.setOnDismissListener(new C0226c(bVar));
            }
        }

        /* renamed from: j */
        public CharSequence mo1207j() {
            return this.f991F;
        }

        /* renamed from: l */
        public void mo1208l(CharSequence charSequence) {
            this.f991F = charSequence;
        }

        /* renamed from: o */
        public void mo1081o(ListAdapter listAdapter) {
            super.mo1081o(listAdapter);
            this.f992G = listAdapter;
        }

        /* renamed from: p */
        public void mo1213p(int i) {
            this.f994I = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0096  */
        /* renamed from: t */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1227t() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.mo1078i()
                r1 = 0
                if (r0 == 0) goto L_0x0026
                androidx.appcompat.widget.y r1 = androidx.appcompat.widget.C0219y.this
                android.graphics.Rect r1 = r1.f983l
                r0.getPadding(r1)
                androidx.appcompat.widget.y r0 = androidx.appcompat.widget.C0219y.this
                boolean r0 = androidx.appcompat.widget.C0170i1.m489a(r0)
                if (r0 == 0) goto L_0x001d
                androidx.appcompat.widget.y r0 = androidx.appcompat.widget.C0219y.this
                android.graphics.Rect r0 = r0.f983l
                int r0 = r0.right
                goto L_0x0024
            L_0x001d:
                androidx.appcompat.widget.y r0 = androidx.appcompat.widget.C0219y.this
                android.graphics.Rect r0 = r0.f983l
                int r0 = r0.left
                int r0 = -r0
            L_0x0024:
                r1 = r0
                goto L_0x002e
            L_0x0026:
                androidx.appcompat.widget.y r0 = androidx.appcompat.widget.C0219y.this
                android.graphics.Rect r0 = r0.f983l
                r0.right = r1
                r0.left = r1
            L_0x002e:
                androidx.appcompat.widget.y r0 = androidx.appcompat.widget.C0219y.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.y r2 = androidx.appcompat.widget.C0219y.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.y r3 = androidx.appcompat.widget.C0219y.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.y r4 = androidx.appcompat.widget.C0219y.this
                int r5 = r4.f982k
                r6 = -2
                if (r5 != r6) goto L_0x0078
                android.widget.ListAdapter r5 = r8.f992G
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.mo1078i()
                int r4 = r4.mo1169a(r5, r6)
                androidx.appcompat.widget.y r5 = androidx.appcompat.widget.C0219y.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.y r6 = androidx.appcompat.widget.C0219y.this
                android.graphics.Rect r6 = r6.f983l
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L_0x0070
                r4 = r5
            L_0x0070:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L_0x007e
            L_0x0078:
                r4 = -1
                if (r5 != r4) goto L_0x0082
                int r4 = r3 - r0
                int r4 = r4 - r2
            L_0x007e:
                r8.mo1083r(r4)
                goto L_0x0085
            L_0x0082:
                r8.mo1083r(r5)
            L_0x0085:
                androidx.appcompat.widget.y r4 = androidx.appcompat.widget.C0219y.this
                boolean r4 = androidx.appcompat.widget.C0170i1.m489a(r4)
                if (r4 == 0) goto L_0x0096
                int r3 = r3 - r2
                int r0 = r8.f878i
                int r3 = r3 - r0
                int r0 = r8.f994I
                int r3 = r3 - r0
                int r3 = r3 + r1
                goto L_0x009b
            L_0x0096:
                int r2 = r8.f994I
                int r0 = r0 + r2
                int r3 = r0 + r1
            L_0x009b:
                r8.f879j = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0219y.C0223d.mo1227t():void");
        }
    }

    /* renamed from: androidx.appcompat.widget.y$e */
    public static class C0227e extends View.BaseSavedState {
        public static final Parcelable.Creator<C0227e> CREATOR = new C0228a();

        /* renamed from: e */
        public boolean f1000e;

        /* renamed from: androidx.appcompat.widget.y$e$a */
        public class C0228a implements Parcelable.Creator<C0227e> {
            public Object createFromParcel(Parcel parcel) {
                return new C0227e(parcel);
            }

            public Object[] newArray(int i) {
                return new C0227e[i];
            }
        }

        public C0227e(Parcel parcel) {
            super(parcel);
            this.f1000e = parcel.readByte() != 0;
        }

        public C0227e(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1000e ? (byte) 1 : 0);
        }
    }

    /* renamed from: androidx.appcompat.widget.y$f */
    public interface C0229f {
        /* renamed from: b */
        boolean mo1200b();

        /* renamed from: c */
        void mo1201c(int i);

        /* renamed from: d */
        int mo1202d();

        void dismiss();

        /* renamed from: e */
        void mo1204e(int i, int i2);

        /* renamed from: g */
        int mo1205g();

        /* renamed from: i */
        Drawable mo1206i();

        /* renamed from: j */
        CharSequence mo1207j();

        /* renamed from: l */
        void mo1208l(CharSequence charSequence);

        /* renamed from: m */
        void mo1209m(Drawable drawable);

        /* renamed from: n */
        void mo1210n(int i);

        /* renamed from: o */
        void mo1211o(ListAdapter listAdapter);

        /* renamed from: p */
        void mo1213p(int i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r4 != null) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0219y(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.f983l = r0
            android.content.Context r0 = r9.getContext()
            androidx.appcompat.widget.C0216w0.m569a(r9, r0)
            int[] r0 = p039g.C0934b.f3479u
            r1 = 0
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r11, r0, r12, r1)
            androidx.appcompat.widget.f r2 = new androidx.appcompat.widget.f
            r2.<init>(r9)
            r9.f976e = r2
            r2 = 4
            int r2 = r0.getResourceId(r2, r1)
            if (r2 == 0) goto L_0x002e
            k.c r3 = new k.c
            r3.<init>(r10, r2)
            r9.f977f = r3
            goto L_0x0030
        L_0x002e:
            r9.f977f = r10
        L_0x0030:
            r2 = 0
            r3 = -1
            int[] r4 = f975m     // Catch:{ Exception -> 0x004d, all -> 0x0046 }
            android.content.res.TypedArray r4 = r10.obtainStyledAttributes(r11, r4, r12, r1)     // Catch:{ Exception -> 0x004d, all -> 0x0046 }
            boolean r5 = r4.hasValue(r1)     // Catch:{ Exception -> 0x004e, all -> 0x0043 }
            if (r5 == 0) goto L_0x0050
            int r3 = r4.getInt(r1, r1)     // Catch:{ Exception -> 0x004e, all -> 0x0043 }
            goto L_0x0050
        L_0x0043:
            r10 = move-exception
            r2 = r4
            goto L_0x0047
        L_0x0046:
            r10 = move-exception
        L_0x0047:
            if (r2 == 0) goto L_0x004c
            r2.recycle()
        L_0x004c:
            throw r10
        L_0x004d:
            r4 = r2
        L_0x004e:
            if (r4 == 0) goto L_0x0053
        L_0x0050:
            r4.recycle()
        L_0x0053:
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x008f
            if (r3 == r5) goto L_0x005a
            goto L_0x009d
        L_0x005a:
            androidx.appcompat.widget.y$d r3 = new androidx.appcompat.widget.y$d
            android.content.Context r6 = r9.f977f
            r3.<init>(r6, r11, r12)
            android.content.Context r6 = r9.f977f
            int[] r7 = p039g.C0934b.f3479u
            androidx.appcompat.widget.b1 r6 = androidx.appcompat.widget.C0136b1.m361q(r6, r11, r7, r12, r1)
            r7 = 3
            r8 = -2
            int r7 = r6.mo771k(r7, r8)
            r9.f982k = r7
            android.graphics.drawable.Drawable r7 = r6.mo767g(r5)
            android.widget.PopupWindow r8 = r3.f873C
            r8.setBackgroundDrawable(r7)
            java.lang.String r4 = r0.getString(r4)
            r3.f991F = r4
            android.content.res.TypedArray r4 = r6.f692b
            r4.recycle()
            r9.f981j = r3
            androidx.appcompat.widget.x r4 = new androidx.appcompat.widget.x
            r4.<init>(r9, r9, r3)
            r9.f978g = r4
            goto L_0x009d
        L_0x008f:
            androidx.appcompat.widget.y$b r3 = new androidx.appcompat.widget.y$b
            r3.<init>()
            r9.f981j = r3
            java.lang.String r4 = r0.getString(r4)
            r3.mo1208l(r4)
        L_0x009d:
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
            if (r1 == 0) goto L_0x00b4
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r10, r4, r1)
            r10 = 2131492982(0x7f0c0076, float:1.8609431E38)
            r3.setDropDownViewResource(r10)
            r9.setAdapter((android.widget.SpinnerAdapter) r3)
        L_0x00b4:
            r0.recycle()
            r9.f980i = r5
            android.widget.SpinnerAdapter r10 = r9.f979h
            if (r10 == 0) goto L_0x00c2
            r9.setAdapter((android.widget.SpinnerAdapter) r10)
            r9.f979h = r2
        L_0x00c2:
            androidx.appcompat.widget.f r10 = r9.f976e
            r10.mo886d(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0219y.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: a */
    public int mo1169a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f983l);
        Rect rect = this.f983l;
        return i2 + rect.left + rect.right;
    }

    /* renamed from: b */
    public void mo1170b() {
        this.f981j.mo1204e(getTextDirection(), getTextAlignment());
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0157f fVar = this.f976e;
        if (fVar != null) {
            fVar.mo883a();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0229f fVar = this.f981j;
        return fVar != null ? fVar.mo1202d() : super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        C0229f fVar = this.f981j;
        return fVar != null ? fVar.mo1205g() : super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        return this.f981j != null ? this.f982k : super.getDropDownWidth();
    }

    public final C0229f getInternalPopup() {
        return this.f981j;
    }

    public Drawable getPopupBackground() {
        C0229f fVar = this.f981j;
        return fVar != null ? fVar.mo1206i() : super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f977f;
    }

    public CharSequence getPrompt() {
        C0229f fVar = this.f981j;
        return fVar != null ? fVar.mo1207j() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0157f fVar = this.f976e;
        if (fVar != null) {
            return fVar.mo884b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0157f fVar = this.f976e;
        if (fVar != null) {
            return fVar.mo885c();
        }
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0229f fVar = this.f981j;
        if (fVar != null && fVar.mo1200b()) {
            this.f981j.dismiss();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f981j != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo1169a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0227e eVar = (C0227e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        if (eVar.f1000e && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C0220a());
        }
    }

    public Parcelable onSaveInstanceState() {
        C0227e eVar = new C0227e(super.onSaveInstanceState());
        C0229f fVar = this.f981j;
        eVar.f1000e = fVar != null && fVar.mo1200b();
        return eVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0180l0 l0Var = this.f978g;
        if (l0Var == null || !l0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C0229f fVar = this.f981j;
        if (fVar == null) {
            return super.performClick();
        }
        if (fVar.mo1200b()) {
            return true;
        }
        mo1170b();
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f980i) {
            this.f979h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f981j != null) {
            Context context = this.f977f;
            if (context == null) {
                context = getContext();
            }
            this.f981j.mo1211o(new C0222c(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0157f fVar = this.f976e;
        if (fVar != null) {
            fVar.mo887e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0157f fVar = this.f976e;
        if (fVar != null) {
            fVar.mo888f(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C0229f fVar = this.f981j;
        if (fVar != null) {
            fVar.mo1213p(i);
            this.f981j.mo1201c(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    public void setDropDownVerticalOffset(int i) {
        C0229f fVar = this.f981j;
        if (fVar != null) {
            fVar.mo1210n(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f981j != null) {
            this.f982k = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0229f fVar = this.f981j;
        if (fVar != null) {
            fVar.mo1209m(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C1021a.m2945a(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C0229f fVar = this.f981j;
        if (fVar != null) {
            fVar.mo1208l(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0157f fVar = this.f976e;
        if (fVar != null) {
            fVar.mo890h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0157f fVar = this.f976e;
        if (fVar != null) {
            fVar.mo891i(mode);
        }
    }
}
