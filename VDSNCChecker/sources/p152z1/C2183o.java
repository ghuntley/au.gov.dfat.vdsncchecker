package p152z1;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.C0262a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p003a2.C0008a;
import p007au.gov.dfat.vdsncchecker.R;
import p018c2.C0624a;
import p051i.C1021a;
import p054i2.C1029b;
import p058j0.C1043a;
import p058j0.C1061o;
import p058j0.C1070q;
import p072l2.C1242f;
import p106r0.C1634b;
import p152z1.C2156a;

/* renamed from: z1.o */
public final class C2183o<S> extends C1634b {

    /* renamed from: G0 */
    public static final /* synthetic */ int f6279G0 = 0;

    /* renamed from: A0 */
    public boolean f6280A0;

    /* renamed from: B0 */
    public int f6281B0;

    /* renamed from: C0 */
    public TextView f6282C0;

    /* renamed from: D0 */
    public CheckableImageButton f6283D0;

    /* renamed from: E0 */
    public C1242f f6284E0;

    /* renamed from: F0 */
    public Button f6285F0;

    /* renamed from: p0 */
    public final LinkedHashSet<C2188q<? super S>> f6286p0 = new LinkedHashSet<>();

    /* renamed from: q0 */
    public final LinkedHashSet<View.OnClickListener> f6287q0 = new LinkedHashSet<>();

    /* renamed from: r0 */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f6288r0 = new LinkedHashSet<>();

    /* renamed from: s0 */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f6289s0 = new LinkedHashSet<>();

    /* renamed from: t0 */
    public int f6290t0;

    /* renamed from: u0 */
    public C2166d<S> f6291u0;

    /* renamed from: v0 */
    public C2198x<S> f6292v0;

    /* renamed from: w0 */
    public C2156a f6293w0;

    /* renamed from: x0 */
    public C2170g<S> f6294x0;

    /* renamed from: y0 */
    public int f6295y0;

    /* renamed from: z0 */
    public CharSequence f6296z0;

    /* renamed from: z1.o$a */
    public class C2184a implements View.OnClickListener {
        public C2184a() {
        }

        public void onClick(View view) {
            Iterator it = C2183o.this.f6286p0.iterator();
            while (it.hasNext()) {
                ((C2188q) it.next()).mo6737a(C2183o.this.f6291u0.mo6703a());
            }
            C2183o.this.mo5781m0(false, false);
        }
    }

    /* renamed from: z1.o$b */
    public class C2185b implements View.OnClickListener {
        public C2185b() {
        }

        public void onClick(View view) {
            Iterator it = C2183o.this.f6287q0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            C2183o.this.mo5781m0(false, false);
        }
    }

    /* renamed from: z1.o$c */
    public class C2186c extends C2197w<S> {
        public C2186c() {
        }

        /* renamed from: a */
        public void mo6735a(S s) {
            C2183o oVar = C2183o.this;
            int i = C2183o.f6279G0;
            oVar.mo6731t0();
            C2183o oVar2 = C2183o.this;
            oVar2.f6285F0.setEnabled(oVar2.f6291u0.mo6708g());
        }
    }

    /* renamed from: p0 */
    public static int m5606p0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar d = C2160a0.m5573d();
        d.set(5, 1);
        Calendar b = C2160a0.m5571b(d);
        b.get(2);
        b.get(1);
        int maximum = b.getMaximum(7);
        b.getActualMaximum(5);
        b.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    /* renamed from: q0 */
    public static boolean m5607q0(Context context) {
        return m5608r0(context, 16843277);
    }

    /* renamed from: r0 */
    public static boolean m5608r0(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C1029b.m2955c(context, R.attr.materialCalendarStyle, C2170g.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* renamed from: H */
    public final void mo1589H(Bundle bundle) {
        super.mo1589H(bundle);
        if (bundle == null) {
            bundle = this.f1461j;
        }
        this.f6290t0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f6291u0 = (C2166d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f6293w0 = (C2156a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f6295y0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f6296z0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f6281B0 = bundle.getInt("INPUT_MODE_KEY");
    }

    /* renamed from: J */
    public final View mo1591J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f6280A0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f6280A0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m5606p0(context), -2));
        } else {
            View findViewById = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(R.id.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(m5606p0(context), -1));
            Resources resources = mo1611b0().getResources();
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
            int i = C2193t.f6312j;
            findViewById2.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.f6282C0 = textView;
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        textView.setAccessibilityLiveRegion(1);
        this.f6283D0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.f6296z0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f6295y0);
        }
        this.f6283D0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f6283D0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C1021a.m2945a(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C1021a.m2945a(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f6283D0.setChecked(this.f6281B0 != 0);
        C1061o.m3034o(this.f6283D0, (C1043a) null);
        mo6732u0(this.f6283D0);
        this.f6283D0.setOnClickListener(new C2187p(this));
        this.f6285F0 = (Button) inflate.findViewById(R.id.confirm_button);
        if (this.f6291u0.mo6708g()) {
            this.f6285F0.setEnabled(true);
        } else {
            this.f6285F0.setEnabled(false);
        }
        this.f6285F0.setTag("CONFIRM_BUTTON_TAG");
        this.f6285F0.setOnClickListener(new C2184a());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        button.setOnClickListener(new C2185b());
        return inflate;
    }

    /* renamed from: R */
    public final void mo1599R(Bundle bundle) {
        super.mo1599R(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f6290t0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f6291u0);
        C2156a.C2158b bVar = new C2156a.C2158b(this.f6293w0);
        C2191s sVar = this.f6294x0.f6257d0;
        if (sVar != null) {
            bVar.f6228c = Long.valueOf(sVar.f6310j);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f6229d);
        C2191s l = C2191s.m5625l(bVar.f6226a);
        C2191s l2 = C2191s.m5625l(bVar.f6227b);
        C2156a.C2159c cVar = (C2156a.C2159c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l3 = bVar.f6228c;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C2156a(l, l2, cVar, l3 == null ? null : C2191s.m5625l(l3.longValue()), (C2156a.C2157a) null));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f6295y0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f6296z0);
    }

    /* renamed from: S */
    public void mo1600S() {
        super.mo1600S();
        Window window = mo5782o0().getWindow();
        if (this.f6280A0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f6284E0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = mo1644w().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.f6284E0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new C0008a(mo5782o0(), rect));
        }
        mo6730s0();
    }

    /* renamed from: T */
    public void mo1601T() {
        this.f6292v0.f6327Z.clear();
        this.f1439H = true;
        Dialog dialog = this.f5022k0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* renamed from: n0 */
    public final Dialog mo4802n0(Bundle bundle) {
        Context b0 = mo1611b0();
        Context b02 = mo1611b0();
        int i = this.f6290t0;
        if (i == 0) {
            i = this.f6291u0.mo6706d(b02);
        }
        Dialog dialog = new Dialog(b0, i);
        Context context = dialog.getContext();
        this.f6280A0 = m5607q0(context);
        int c = C1029b.m2955c(context, R.attr.colorSurface, C2183o.class.getCanonicalName());
        C1242f fVar = new C1242f(context, (AttributeSet) null, R.attr.materialCalendarStyle, 2131952309);
        this.f6284E0 = fVar;
        fVar.f4164e.f4188b = new C0624a(context);
        fVar.mo4984w();
        this.f6284E0.mo4976p(ColorStateList.valueOf(c));
        C1242f fVar2 = this.f6284E0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        fVar2.mo4974o(decorView.getElevation());
        return dialog;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f6288r0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f6289s0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f1441J;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* renamed from: s0 */
    public final void mo6730s0() {
        C2198x<S> xVar;
        Context b0 = mo1611b0();
        int i = this.f6290t0;
        if (i == 0) {
            i = this.f6291u0.mo6706d(b0);
        }
        C2166d<S> dVar = this.f6291u0;
        C2156a aVar = this.f6293w0;
        C2170g<S> gVar = new C2170g<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.f6221h);
        gVar.mo1621h0(bundle);
        this.f6294x0 = gVar;
        if (this.f6283D0.isChecked()) {
            C2166d<S> dVar2 = this.f6291u0;
            C2156a aVar2 = this.f6293w0;
            xVar = new C2189r<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i);
            bundle2.putParcelable("DATE_SELECTOR_KEY", dVar2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar2);
            xVar.mo1621h0(bundle2);
        } else {
            xVar = this.f6294x0;
        }
        this.f6292v0 = xVar;
        mo6731t0();
        C0262a aVar3 = new C0262a(mo1620h());
        aVar3.mo1537f(R.id.mtrl_calendar_frame, this.f6292v0, (String) null, 2);
        if (!aVar3.f1593g) {
            aVar3.f1594h = false;
            aVar3.f1355q.mo1677D(aVar3, false);
            this.f6292v0.mo6721m0(new C2186c());
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* renamed from: t0 */
    public final void mo6731t0() {
        String b = this.f6291u0.mo6704b(mo1623i());
        this.f6282C0.setContentDescription(String.format(mo1582A(R.string.mtrl_picker_announce_current_selection), new Object[]{b}));
        this.f6282C0.setText(b);
    }

    /* renamed from: u0 */
    public final void mo6732u0(CheckableImageButton checkableImageButton) {
        this.f6283D0.setContentDescription(checkableImageButton.getContext().getString(this.f6283D0.isChecked() ? R.string.mtrl_picker_toggle_to_calendar_input_mode : R.string.mtrl_picker_toggle_to_text_input_mode));
    }
}
