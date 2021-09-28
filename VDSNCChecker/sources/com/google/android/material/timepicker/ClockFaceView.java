package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.dynamsoft.dbr.EnumBarcodeFormat;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import p007au.gov.dfat.vdsncchecker.R;
import p051i.C1021a;
import p054i2.C1030c;
import p058j0.C1043a;
import p058j0.C1061o;
import p064k0.C1150b;
import p083n1.C1455a;
import p102q2.C1604a;
import p102q2.C1605b;
import p102q2.C1606c;

public class ClockFaceView extends C1606c implements ClockHandView.C0781c {

    /* renamed from: A */
    public final Rect f3037A = new Rect();

    /* renamed from: B */
    public final RectF f3038B = new RectF();

    /* renamed from: C */
    public final SparseArray<TextView> f3039C;

    /* renamed from: D */
    public final C1043a f3040D;

    /* renamed from: E */
    public final int[] f3041E;

    /* renamed from: F */
    public final float[] f3042F;

    /* renamed from: G */
    public final int f3043G;

    /* renamed from: H */
    public final int f3044H;

    /* renamed from: I */
    public final int f3045I;

    /* renamed from: J */
    public final int f3046J;

    /* renamed from: K */
    public String[] f3047K;

    /* renamed from: L */
    public float f3048L;

    /* renamed from: M */
    public final ColorStateList f3049M;

    /* renamed from: z */
    public final ClockHandView f3050z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.f3039C = sparseArray;
        this.f3042F = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1455a.f4567e, R.attr.materialClockStyle, 2131952365);
        Resources resources = getResources();
        ColorStateList a = C1030c.m2956a(context, obtainStyledAttributes, 1);
        this.f3049M = a;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f3050z = clockHandView;
        this.f3043G = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = a.getColorForState(new int[]{16842913}, a.getDefaultColor());
        this.f3041E = new int[]{colorForState, colorForState, a.getDefaultColor()};
        clockHandView.f3056i.add(this);
        ThreadLocal<TypedValue> threadLocal = C1021a.f3740a;
        int defaultColor = context.getColorStateList(R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList a2 = C1030c.m2956a(context, obtainStyledAttributes, 0);
        setBackgroundColor(a2 != null ? a2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new C1604a(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f3040D = new C1605b(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f3047K = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i = 0; i < Math.max(this.f3047K.length, size); i++) {
            TextView textView = this.f3039C.get(i);
            if (i >= this.f3047K.length) {
                removeView(textView);
                this.f3039C.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, this, false);
                    this.f3039C.put(i, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f3047K[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                C1061o.m3034o(textView, this.f3040D);
                textView.setTextColor(this.f3049M);
            }
        }
        this.f3044H = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f3045I = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f3046J = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    /* renamed from: a */
    public void mo3995a(float f, boolean z) {
        if (Math.abs(this.f3048L - f) > 0.001f) {
            this.f3048L = f;
            mo3997t();
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C1150b.C1152b.m3388a(1, this.f3047K.length, false, 1).f4020a);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo3997t();
    }

    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (((float) this.f3046J) / Math.max(Math.max(((float) this.f3044H) / ((float) displayMetrics.heightPixels), ((float) this.f3045I) / ((float) displayMetrics.widthPixels)), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, EnumBarcodeFormat.BF_MICRO_QR);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    /* renamed from: t */
    public final void mo3997t() {
        RectF rectF = this.f3050z.f3060m;
        for (int i = 0; i < this.f3039C.size(); i++) {
            TextView textView = this.f3039C.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.f3037A);
                this.f3037A.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.f3037A);
                this.f3038B.set(this.f3037A);
                textView.getPaint().setShader(!RectF.intersects(rectF, this.f3038B) ? null : new RadialGradient(rectF.centerX() - this.f3038B.left, rectF.centerY() - this.f3038B.top, 0.5f * rectF.width(), this.f3041E, this.f3042F, Shader.TileMode.CLAMP));
                textView.invalidate();
            }
        }
    }
}
