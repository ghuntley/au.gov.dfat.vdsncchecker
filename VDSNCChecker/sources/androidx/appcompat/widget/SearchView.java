package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.dynamsoft.dbr.EnumBarcodeFormat;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.C0001b;
import p007au.gov.dfat.vdsncchecker.R;
import p039g.C0934b;
import p058j0.C1061o;
import p058j0.C1070q;
import p063k.C1137b;
import p082n0.C1449a;
import p088o0.C1491a;

public class SearchView extends C0184m0 implements C1137b {

    /* renamed from: q0 */
    public static final C0116n f537q0 = (Build.VERSION.SDK_INT < 29 ? new C0116n() : null);

    /* renamed from: A */
    public final ImageView f538A;

    /* renamed from: B */
    public final View f539B;

    /* renamed from: C */
    public C0119p f540C;

    /* renamed from: D */
    public Rect f541D;

    /* renamed from: E */
    public Rect f542E;

    /* renamed from: F */
    public int[] f543F;

    /* renamed from: G */
    public int[] f544G;

    /* renamed from: H */
    public final ImageView f545H;

    /* renamed from: I */
    public final Drawable f546I;

    /* renamed from: J */
    public final int f547J;

    /* renamed from: K */
    public final int f548K;

    /* renamed from: L */
    public final Intent f549L;

    /* renamed from: M */
    public final Intent f550M;

    /* renamed from: N */
    public final CharSequence f551N;

    /* renamed from: O */
    public C0114l f552O;

    /* renamed from: P */
    public C0113k f553P;

    /* renamed from: Q */
    public View.OnFocusChangeListener f554Q;

    /* renamed from: R */
    public C0115m f555R;

    /* renamed from: S */
    public View.OnClickListener f556S;

    /* renamed from: T */
    public boolean f557T;

    /* renamed from: U */
    public boolean f558U;

    /* renamed from: V */
    public C1449a f559V;

    /* renamed from: W */
    public boolean f560W;

    /* renamed from: a0 */
    public CharSequence f561a0;

    /* renamed from: b0 */
    public boolean f562b0;

    /* renamed from: c0 */
    public boolean f563c0;

    /* renamed from: d0 */
    public int f564d0;

    /* renamed from: e0 */
    public boolean f565e0;

    /* renamed from: f0 */
    public CharSequence f566f0;

    /* renamed from: g0 */
    public CharSequence f567g0;

    /* renamed from: h0 */
    public boolean f568h0;

    /* renamed from: i0 */
    public int f569i0;

    /* renamed from: j0 */
    public SearchableInfo f570j0;

    /* renamed from: k0 */
    public Bundle f571k0;

    /* renamed from: l0 */
    public final Runnable f572l0;

    /* renamed from: m0 */
    public Runnable f573m0;

    /* renamed from: n0 */
    public final WeakHashMap<String, Drawable.ConstantState> f574n0;

    /* renamed from: o0 */
    public View.OnKeyListener f575o0;

    /* renamed from: p0 */
    public TextWatcher f576p0;

    /* renamed from: t */
    public final SearchAutoComplete f577t;

    /* renamed from: u */
    public final View f578u;

    /* renamed from: v */
    public final View f579v;

    /* renamed from: w */
    public final View f580w;

    /* renamed from: x */
    public final ImageView f581x;

    /* renamed from: y */
    public final ImageView f582y;

    /* renamed from: z */
    public final ImageView f583z;

    public static class SearchAutoComplete extends C0151e {

        /* renamed from: h */
        public int f584h = getThreshold();

        /* renamed from: i */
        public SearchView f585i;

        /* renamed from: j */
        public boolean f586j;

        /* renamed from: k */
        public final Runnable f587k = new C0102a();

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        public class C0102a implements Runnable {
            public C0102a() {
            }

            public void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f586j) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f586j = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* renamed from: a */
        public void mo581a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            C0116n nVar = SearchView.f537q0;
            Objects.requireNonNull(nVar);
            C0116n.m303a();
            Method method = nVar.f601c;
            if (method != null) {
                try {
                    method.invoke(this, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }

        public boolean enoughToFilter() {
            return this.f584h <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f586j) {
                removeCallbacks(this.f587k);
                post(this.f587k);
            }
            return onCreateInputConnection;
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f585i;
            searchView.mo532A(searchView.f558U);
            searchView.post(searchView.f572l0);
            if (searchView.f577t.hasFocus()) {
                searchView.mo547n();
            }
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f585i.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f585i.hasFocus() && getVisibility() == 0) {
                boolean z2 = true;
                this.f586j = true;
                Context context = getContext();
                C0116n nVar = SearchView.f537q0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z2 = false;
                }
                if (z2) {
                    mo581a();
                }
            }
        }

        public void performCompletion() {
        }

        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f586j = false;
                removeCallbacks(this.f587k);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f586j = false;
                removeCallbacks(this.f587k);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f586j = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f585i = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f584h = i;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    public class C0103a implements TextWatcher {
        public C0103a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f577t.getText();
            searchView.f567g0 = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.mo580z(z);
            searchView.mo533B(!z);
            searchView.mo576v();
            searchView.mo579y();
            if (searchView.f552O != null && !TextUtils.equals(charSequence, searchView.f566f0)) {
                searchView.f552O.mo608a(charSequence.toString());
            }
            searchView.f566f0 = charSequence.toString();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    public class C0104b implements Runnable {
        public C0104b() {
        }

        public void run() {
            SearchView.this.mo577w();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    public class C0105c implements Runnable {
        public C0105c() {
        }

        public void run() {
            C1449a aVar = SearchView.this.f559V;
            if (aVar instanceof C0213v0) {
                aVar.mo1153b((Cursor) null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    public class C0106d implements View.OnFocusChangeListener {
        public C0106d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f554Q;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    public class C0107e implements View.OnLayoutChangeListener {
        public C0107e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView searchView = SearchView.this;
            if (searchView.f539B.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.f579v.getPaddingLeft();
                Rect rect = new Rect();
                boolean a = C0170i1.m489a(searchView);
                int dimensionPixelSize = searchView.f557T ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                searchView.f577t.getDropDownBackground().getPadding(rect);
                searchView.f577t.setDropDownHorizontalOffset(a ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchView.f577t.setDropDownWidth((((searchView.f539B.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    public class C0108f implements View.OnClickListener {
        public C0108f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f581x) {
                searchView.mo574t();
            } else if (view == searchView.f583z) {
                searchView.mo553p();
            } else if (view == searchView.f582y) {
                searchView.mo575u();
            } else if (view == searchView.f538A) {
                SearchableInfo searchableInfo = searchView.f570j0;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.f549L);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.mo546m(searchView.f550M, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            } else if (view == searchView.f577t) {
                searchView.mo547n();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    public class C0109g implements View.OnKeyListener {
        public C0109g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f570j0 == null) {
                return false;
            }
            if (!searchView.f577t.isPopupShowing() || SearchView.this.f577t.getListSelection() == -1) {
                if ((TextUtils.getTrimmedLength(SearchView.this.f577t.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView searchView2 = SearchView.this;
                searchView2.mo548o(0, (String) null, searchView2.f577t.getText().toString());
                return true;
            }
            SearchView searchView3 = SearchView.this;
            if (searchView3.f570j0 == null || searchView3.f559V == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i == 66 || i == 84 || i == 61) {
                return searchView3.mo554q(searchView3.f577t.getListSelection());
            }
            if (i == 21 || i == 22) {
                searchView3.f577t.setSelection(i == 21 ? 0 : searchView3.f577t.length());
                searchView3.f577t.setListSelection(0);
                searchView3.f577t.clearListSelection();
                searchView3.f577t.mo581a();
                return true;
            } else if (i != 19) {
                return false;
            } else {
                searchView3.f577t.getListSelection();
                return false;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    public class C0110h implements TextView.OnEditorActionListener {
        public C0110h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.mo575u();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    public class C0111i implements AdapterView.OnItemClickListener {
        public C0111i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo554q(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    public class C0112j implements AdapterView.OnItemSelectedListener {
        public C0112j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo555r(i);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    public interface C0113k {
        /* renamed from: a */
        boolean mo607a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface C0114l {
        /* renamed from: a */
        boolean mo608a(String str);

        /* renamed from: b */
        boolean mo609b(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface C0115m {
        /* renamed from: a */
        boolean mo610a(int i);

        /* renamed from: b */
        boolean mo611b(int i);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    public static class C0116n {

        /* renamed from: a */
        public Method f599a = null;

        /* renamed from: b */
        public Method f600b = null;

        /* renamed from: c */
        public Method f601c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public C0116n() {
            m303a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f599a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f600b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f601c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: a */
        public static void m303a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    public static class C0117o extends C1491a {
        public static final Parcelable.Creator<C0117o> CREATOR = new C0118a();

        /* renamed from: g */
        public boolean f602g;

        /* renamed from: androidx.appcompat.widget.SearchView$o$a */
        public class C0118a implements Parcelable.ClassLoaderCreator<C0117o> {
            public Object createFromParcel(Parcel parcel) {
                return new C0117o(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i) {
                return new C0117o[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0117o(parcel, classLoader);
            }
        }

        public C0117o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f602g = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        public C0117o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder a = C0001b.m0a("SearchView.SavedState{");
            a.append(Integer.toHexString(System.identityHashCode(this)));
            a.append(" isIconified=");
            a.append(this.f602g);
            a.append("}");
            return a.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f4651e, i);
            parcel.writeValue(Boolean.valueOf(this.f602g));
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    public static class C0119p extends TouchDelegate {

        /* renamed from: a */
        public final View f603a;

        /* renamed from: b */
        public final Rect f604b = new Rect();

        /* renamed from: c */
        public final Rect f605c = new Rect();

        /* renamed from: d */
        public final Rect f606d = new Rect();

        /* renamed from: e */
        public final int f607e;

        /* renamed from: f */
        public boolean f608f;

        public C0119p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f607e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo617a(rect, rect2);
            this.f603a = view;
        }

        /* renamed from: a */
        public void mo617a(Rect rect, Rect rect2) {
            this.f604b.set(rect);
            this.f606d.set(rect);
            Rect rect3 = this.f606d;
            int i = this.f607e;
            rect3.inset(-i, -i);
            this.f605c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r9) {
            /*
                r8 = this;
                float r0 = r9.getX()
                int r0 = (int) r0
                float r1 = r9.getY()
                int r1 = (int) r1
                int r2 = r9.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0033
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003f
            L_0x001b:
                boolean r2 = r8.f608f
                r8.f608f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r8.f608f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r8.f606d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = r5
                goto L_0x0041
            L_0x002f:
                r7 = r4
                r4 = r2
                r2 = r7
                goto L_0x0041
            L_0x0033:
                android.graphics.Rect r2 = r8.f604b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003f
                r8.f608f = r4
                r2 = r4
                goto L_0x0041
            L_0x003f:
                r2 = r4
                r4 = r5
            L_0x0041:
                if (r4 == 0) goto L_0x0070
                if (r2 == 0) goto L_0x005d
                android.graphics.Rect r2 = r8.f605c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005d
                android.view.View r0 = r8.f603a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r8.f603a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                goto L_0x0066
            L_0x005d:
                android.graphics.Rect r2 = r8.f605c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
            L_0x0066:
                float r1 = (float) r1
                r9.setLocation(r0, r1)
                android.view.View r0 = r8.f603a
                boolean r5 = r0.dispatchTouchEvent(r9)
            L_0x0070:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C0119p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        this.f541D = new Rect();
        this.f542E = new Rect();
        this.f543F = new int[2];
        this.f544G = new int[2];
        this.f572l0 = new C0104b();
        this.f573m0 = new C0105c();
        this.f574n0 = new WeakHashMap<>();
        C0108f fVar = new C0108f();
        this.f575o0 = new C0109g();
        C0110h hVar = new C0110h();
        C0111i iVar = new C0111i();
        C0112j jVar = new C0112j();
        this.f576p0 = new C0103a();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C0934b.f3478t, i, 0);
        C0136b1 b1Var = new C0136b1(context2, obtainStyledAttributes);
        LayoutInflater.from(context).inflate(b1Var.mo772l(9, R.layout.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f577t = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f578u = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f579v = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f580w = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f581x = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f582y = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f583z = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f538A = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f545H = imageView5;
        Drawable g = b1Var.mo767g(10);
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        findViewById.setBackground(g);
        findViewById2.setBackground(b1Var.mo767g(14));
        imageView.setImageDrawable(b1Var.mo767g(13));
        imageView2.setImageDrawable(b1Var.mo767g(7));
        imageView3.setImageDrawable(b1Var.mo767g(4));
        imageView4.setImageDrawable(b1Var.mo767g(16));
        imageView5.setImageDrawable(b1Var.mo767g(13));
        this.f546I = b1Var.mo767g(12);
        C0156e1.m441a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f547J = b1Var.mo772l(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f548K = b1Var.mo772l(5, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f576p0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f575o0);
        searchAutoComplete.setOnFocusChangeListener(new C0106d());
        setIconifiedByDefault(b1Var.mo761a(8, true));
        int f = b1Var.mo766f(1, -1);
        if (f != -1) {
            setMaxWidth(f);
        }
        this.f551N = b1Var.mo774n(6);
        this.f561a0 = b1Var.mo774n(11);
        int j = b1Var.mo770j(3, -1);
        if (j != -1) {
            setImeOptions(j);
        }
        int j2 = b1Var.mo770j(2, -1);
        if (j2 != -1) {
            setInputType(j2);
        }
        setFocusable(b1Var.mo761a(0, true));
        obtainStyledAttributes.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f549L = intent;
        intent.addFlags(EnumBarcodeFormat.BF_AZTEC);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f550M = intent2;
        intent2.addFlags(EnumBarcodeFormat.BF_AZTEC);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f539B = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new C0107e());
        }
        mo532A(this.f557T);
        mo578x();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.f577t.setText(charSequence);
        this.f577t.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: A */
    public final void mo532A(boolean z) {
        this.f558U = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f577t.getText());
        this.f581x.setVisibility(i2);
        mo580z(z2);
        this.f578u.setVisibility(z ? 8 : 0);
        if (this.f545H.getDrawable() == null || this.f557T) {
            i = 8;
        }
        this.f545H.setVisibility(i);
        mo576v();
        mo533B(!z2);
        mo579y();
    }

    /* renamed from: B */
    public final void mo533B(boolean z) {
        int i = 8;
        if (this.f565e0 && !this.f558U && z) {
            this.f582y.setVisibility(8);
            i = 0;
        }
        this.f538A.setVisibility(i);
    }

    /* renamed from: c */
    public void mo534c() {
        if (!this.f568h0) {
            this.f568h0 = true;
            int imeOptions = this.f577t.getImeOptions();
            this.f569i0 = imeOptions;
            this.f577t.setImeOptions(imeOptions | EnumBarcodeFormat.BF_PDF417);
            this.f577t.setText("");
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.f563c0 = true;
        super.clearFocus();
        this.f577t.clearFocus();
        this.f577t.setImeVisibility(false);
        this.f563c0 = false;
    }

    /* renamed from: e */
    public void mo536e() {
        this.f577t.setText("");
        SearchAutoComplete searchAutoComplete = this.f577t;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f567g0 = "";
        clearFocus();
        mo532A(true);
        this.f577t.setImeOptions(this.f569i0);
        this.f568h0 = false;
    }

    public int getImeOptions() {
        return this.f577t.getImeOptions();
    }

    public int getInputType() {
        return this.f577t.getInputType();
    }

    public int getMaxWidth() {
        return this.f564d0;
    }

    public CharSequence getQuery() {
        return this.f577t.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f561a0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f570j0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f551N : getContext().getText(this.f570j0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f548K;
    }

    public int getSuggestionRowLayout() {
        return this.f547J;
    }

    public C1449a getSuggestionsAdapter() {
        return this.f559V;
    }

    /* renamed from: l */
    public final Intent mo545l(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(EnumBarcodeFormat.BF_AZTEC);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f567g0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f571k0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f570j0.getSearchActivity());
        return intent;
    }

    /* renamed from: m */
    public final Intent mo546m(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, EnumBarcodeFormat.BF_MICRO_QR);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f571k0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: n */
    public void mo547n() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f577t.refreshAutoCompleteResults();
            return;
        }
        C0116n nVar = f537q0;
        SearchAutoComplete searchAutoComplete = this.f577t;
        Objects.requireNonNull(nVar);
        C0116n.m303a();
        Method method = nVar.f599a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        C0116n nVar2 = f537q0;
        SearchAutoComplete searchAutoComplete2 = this.f577t;
        Objects.requireNonNull(nVar2);
        C0116n.m303a();
        Method method2 = nVar2.f600b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: o */
    public void mo548o(int i, String str, String str2) {
        getContext().startActivity(mo545l("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, (String) null));
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.f572l0);
        post(this.f573m0);
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f577t;
            Rect rect = this.f541D;
            searchAutoComplete.getLocationInWindow(this.f543F);
            getLocationInWindow(this.f544G);
            int[] iArr = this.f543F;
            int i5 = iArr[1];
            int[] iArr2 = this.f544G;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            Rect rect2 = this.f542E;
            Rect rect3 = this.f541D;
            rect2.set(rect3.left, 0, rect3.right, i4 - i2);
            C0119p pVar = this.f540C;
            if (pVar == null) {
                C0119p pVar2 = new C0119p(this.f542E, this.f541D, this.f577t);
                this.f540C = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.mo617a(this.f542E, this.f541D);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0 <= 0) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.f558U
            if (r0 == 0) goto L_0x0008
            super.onMeasure(r4, r5)
            return
        L_0x0008:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002a
            if (r0 == 0) goto L_0x0020
            if (r0 == r2) goto L_0x001b
            goto L_0x0037
        L_0x001b:
            int r0 = r3.f564d0
            if (r0 <= 0) goto L_0x0037
            goto L_0x002e
        L_0x0020:
            int r4 = r3.f564d0
            if (r4 <= 0) goto L_0x0025
            goto L_0x0037
        L_0x0025:
            int r4 = r3.getPreferredWidth()
            goto L_0x0037
        L_0x002a:
            int r0 = r3.f564d0
            if (r0 <= 0) goto L_0x002f
        L_0x002e:
            goto L_0x0033
        L_0x002f:
            int r0 = r3.getPreferredWidth()
        L_0x0033:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0037:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x0049
            if (r0 == 0) goto L_0x0044
            goto L_0x0051
        L_0x0044:
            int r5 = r3.getPreferredHeight()
            goto L_0x0051
        L_0x0049:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0051:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0117o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0117o oVar = (C0117o) parcelable;
        super.onRestoreInstanceState(oVar.f4651e);
        mo532A(oVar.f602g);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C0117o oVar = new C0117o(super.onSaveInstanceState());
        oVar.f602g = this.f558U;
        return oVar;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f572l0);
    }

    /* renamed from: p */
    public void mo553p() {
        if (!TextUtils.isEmpty(this.f577t.getText())) {
            this.f577t.setText("");
            this.f577t.requestFocus();
            this.f577t.setImeVisibility(true);
        } else if (this.f557T) {
            C0113k kVar = this.f553P;
            if (kVar == null || !kVar.mo607a()) {
                clearFocus();
                mo532A(true);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r0.getPosition();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0090 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo554q(int r10) {
        /*
            r9 = this;
            androidx.appcompat.widget.SearchView$m r0 = r9.f555R
            r1 = 0
            if (r0 == 0) goto L_0x000d
            boolean r0 = r0.mo611b(r10)
            if (r0 != 0) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            return r1
        L_0x000d:
            r7 = 0
            r8 = 0
            n0.a r0 = r9.f559V
            android.database.Cursor r0 = r0.f4547g
            if (r0 == 0) goto L_0x00a1
            boolean r10 = r0.moveToPosition(r10)
            if (r10 == 0) goto L_0x00a1
            r10 = 0
            java.lang.String r2 = "suggest_intent_action"
            int r3 = androidx.appcompat.widget.C0213v0.f941C     // Catch:{ RuntimeException -> 0x0090 }
            int r2 = r0.getColumnIndex(r2)     // Catch:{ RuntimeException -> 0x0090 }
            java.lang.String r2 = androidx.appcompat.widget.C0213v0.m558h(r0, r2)     // Catch:{ RuntimeException -> 0x0090 }
            if (r2 != 0) goto L_0x0030
            android.app.SearchableInfo r2 = r9.f570j0     // Catch:{ RuntimeException -> 0x0090 }
            java.lang.String r2 = r2.getSuggestIntentAction()     // Catch:{ RuntimeException -> 0x0090 }
        L_0x0030:
            if (r2 != 0) goto L_0x0034
            java.lang.String r2 = "android.intent.action.SEARCH"
        L_0x0034:
            r3 = r2
            java.lang.String r2 = "suggest_intent_data"
            int r2 = r0.getColumnIndex(r2)     // Catch:{ RuntimeException -> 0x0090 }
            java.lang.String r2 = androidx.appcompat.widget.C0213v0.m558h(r0, r2)     // Catch:{ RuntimeException -> 0x0090 }
            if (r2 != 0) goto L_0x0047
            android.app.SearchableInfo r2 = r9.f570j0     // Catch:{ RuntimeException -> 0x0090 }
            java.lang.String r2 = r2.getSuggestIntentData()     // Catch:{ RuntimeException -> 0x0090 }
        L_0x0047:
            if (r2 == 0) goto L_0x006d
            java.lang.String r4 = "suggest_intent_data_id"
            int r4 = r0.getColumnIndex(r4)     // Catch:{ RuntimeException -> 0x0090 }
            java.lang.String r4 = androidx.appcompat.widget.C0213v0.m558h(r0, r4)     // Catch:{ RuntimeException -> 0x0090 }
            if (r4 == 0) goto L_0x006d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0090 }
            r5.<init>()     // Catch:{ RuntimeException -> 0x0090 }
            r5.append(r2)     // Catch:{ RuntimeException -> 0x0090 }
            java.lang.String r2 = "/"
            r5.append(r2)     // Catch:{ RuntimeException -> 0x0090 }
            java.lang.String r2 = android.net.Uri.encode(r4)     // Catch:{ RuntimeException -> 0x0090 }
            r5.append(r2)     // Catch:{ RuntimeException -> 0x0090 }
            java.lang.String r2 = r5.toString()     // Catch:{ RuntimeException -> 0x0090 }
        L_0x006d:
            if (r2 != 0) goto L_0x0071
            r4 = r10
            goto L_0x0076
        L_0x0071:
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ RuntimeException -> 0x0090 }
            r4 = r2
        L_0x0076:
            java.lang.String r2 = "suggest_intent_query"
            int r2 = r0.getColumnIndex(r2)     // Catch:{ RuntimeException -> 0x0090 }
            java.lang.String r6 = androidx.appcompat.widget.C0213v0.m558h(r0, r2)     // Catch:{ RuntimeException -> 0x0090 }
            java.lang.String r2 = "suggest_intent_extra_data"
            int r2 = r0.getColumnIndex(r2)     // Catch:{ RuntimeException -> 0x0090 }
            java.lang.String r5 = androidx.appcompat.widget.C0213v0.m558h(r0, r2)     // Catch:{ RuntimeException -> 0x0090 }
            r2 = r9
            android.content.Intent r10 = r2.mo545l(r3, r4, r5, r6, r7, r8)     // Catch:{ RuntimeException -> 0x0090 }
            goto L_0x0093
        L_0x0090:
            r0.getPosition()     // Catch:{ RuntimeException -> 0x0093 }
        L_0x0093:
            if (r10 != 0) goto L_0x0096
            goto L_0x00a1
        L_0x0096:
            android.content.Context r0 = r9.getContext()     // Catch:{ RuntimeException -> 0x009e }
            r0.startActivity(r10)     // Catch:{ RuntimeException -> 0x009e }
            goto L_0x00a1
        L_0x009e:
            r10.toString()
        L_0x00a1:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r10 = r9.f577t
            r10.setImeVisibility(r1)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r10 = r9.f577t
            r10.dismissDropDown()
            r10 = 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.mo554q(int):boolean");
    }

    /* renamed from: r */
    public boolean mo555r(int i) {
        CharSequence c;
        C0115m mVar = this.f555R;
        if (mVar != null && mVar.mo610a(i)) {
            return false;
        }
        Editable text = this.f577t.getText();
        Cursor cursor = this.f559V.f4547g;
        if (cursor == null) {
            return true;
        }
        if (!cursor.moveToPosition(i) || (c = this.f559V.mo1154c(cursor)) == null) {
            setQuery(text);
            return true;
        }
        setQuery(c);
        return true;
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f563c0 || !isFocusable()) {
            return false;
        }
        if (this.f558U) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f577t.requestFocus(i, rect);
        if (requestFocus) {
            mo532A(false);
        }
        return requestFocus;
    }

    /* renamed from: s */
    public void mo557s(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f571k0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo553p();
        } else {
            mo574t();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f557T != z) {
            this.f557T = z;
            mo532A(z);
            mo578x();
        }
    }

    public void setImeOptions(int i) {
        this.f577t.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f577t.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f564d0 = i;
        requestLayout();
    }

    public void setOnCloseListener(C0113k kVar) {
        this.f553P = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f554Q = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0114l lVar) {
        this.f552O = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f556S = onClickListener;
    }

    public void setOnSuggestionListener(C0115m mVar) {
        this.f555R = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f561a0 = charSequence;
        mo578x();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f562b0 = z;
        C1449a aVar = this.f559V;
        if (aVar instanceof C0213v0) {
            ((C0213v0) aVar).f949u = z ? 2 : 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, com.dynamsoft.dbr.EnumBarcodeFormat.BF_GS1_DATABAR_EXPANDED_STACKED) != null) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.f570j0 = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            if (r7 == 0) goto L_0x006e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f577t
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f577t
            android.app.SearchableInfo r3 = r6.f570j0
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.f570j0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L_0x0036
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f570j0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L_0x0036
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L_0x0036:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f577t
            r3.setInputType(r7)
            n0.a r7 = r6.f559V
            if (r7 == 0) goto L_0x0042
            r7.mo1153b(r2)
        L_0x0042:
            android.app.SearchableInfo r7 = r6.f570j0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L_0x006b
            androidx.appcompat.widget.v0 r7 = new androidx.appcompat.widget.v0
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f570j0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.f574n0
            r7.<init>(r3, r6, r4, r5)
            r6.f559V = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f577t
            r3.setAdapter(r7)
            n0.a r7 = r6.f559V
            androidx.appcompat.widget.v0 r7 = (androidx.appcompat.widget.C0213v0) r7
            boolean r3 = r6.f562b0
            if (r3 == 0) goto L_0x0068
            r3 = 2
            goto L_0x0069
        L_0x0068:
            r3 = r0
        L_0x0069:
            r7.f949u = r3
        L_0x006b:
            r6.mo578x()
        L_0x006e:
            android.app.SearchableInfo r7 = r6.f570j0
            r3 = 0
            if (r7 == 0) goto L_0x009f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L_0x009f
            android.app.SearchableInfo r7 = r6.f570j0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L_0x0084
            android.content.Intent r2 = r6.f549L
            goto L_0x008e
        L_0x0084:
            android.app.SearchableInfo r7 = r6.f570j0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L_0x008e
            android.content.Intent r2 = r6.f550M
        L_0x008e:
            if (r2 == 0) goto L_0x009f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r0 = r3
        L_0x00a0:
            r6.f565e0 = r0
            if (r0 == 0) goto L_0x00ab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f577t
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        L_0x00ab:
            boolean r7 = r6.f558U
            r6.mo532A(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f560W = z;
        mo532A(this.f558U);
    }

    public void setSuggestionsAdapter(C1449a aVar) {
        this.f559V = aVar;
        this.f577t.setAdapter(aVar);
    }

    /* renamed from: t */
    public void mo574t() {
        mo532A(false);
        this.f577t.requestFocus();
        this.f577t.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f556S;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: u */
    public void mo575u() {
        Editable text = this.f577t.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C0114l lVar = this.f552O;
            if (lVar == null || !lVar.mo609b(text.toString())) {
                if (this.f570j0 != null) {
                    mo548o(0, (String) null, text.toString());
                }
                this.f577t.setImeVisibility(false);
                this.f577t.dismissDropDown();
            }
        }
    }

    /* renamed from: v */
    public final void mo576v() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f577t.getText());
        int i = 0;
        if (!z2 && (!this.f557T || this.f568h0)) {
            z = false;
        }
        ImageView imageView = this.f583z;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f583z.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: w */
    public void mo577w() {
        int[] iArr = this.f577t.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f579v.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f580w.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* renamed from: x */
    public final void mo578x() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f577t;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.f557T && this.f546I != null) {
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            this.f546I.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.f546I), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    /* renamed from: y */
    public final void mo579y() {
        int i = 0;
        if (!((this.f560W || this.f565e0) && !this.f558U) || !(this.f582y.getVisibility() == 0 || this.f538A.getVisibility() == 0)) {
            i = 8;
        }
        this.f580w.setVisibility(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r2.f565e0 == false) goto L_0x0023;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo580z(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f560W
            r1 = 0
            if (r0 == 0) goto L_0x0021
            if (r0 != 0) goto L_0x000b
            boolean r0 = r2.f565e0
            if (r0 == 0) goto L_0x0011
        L_0x000b:
            boolean r0 = r2.f558U
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L_0x0021
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.f565e0
            if (r3 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 8
        L_0x0023:
            android.widget.ImageView r3 = r2.f582y
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.mo580z(boolean):void");
    }
}
