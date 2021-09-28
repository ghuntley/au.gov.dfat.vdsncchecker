package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p058j0.C1061o;
import p058j0.C1070q;
import p083n1.C1455a;

public class ClockHandView extends View {

    /* renamed from: s */
    public static final /* synthetic */ int f3051s = 0;

    /* renamed from: e */
    public ValueAnimator f3052e;

    /* renamed from: f */
    public float f3053f;

    /* renamed from: g */
    public float f3054g;

    /* renamed from: h */
    public int f3055h;

    /* renamed from: i */
    public final List<C0781c> f3056i = new ArrayList();

    /* renamed from: j */
    public final int f3057j;

    /* renamed from: k */
    public final float f3058k;

    /* renamed from: l */
    public final Paint f3059l;

    /* renamed from: m */
    public final RectF f3060m;

    /* renamed from: n */
    public final int f3061n;

    /* renamed from: o */
    public float f3062o;

    /* renamed from: p */
    public boolean f3063p;

    /* renamed from: q */
    public double f3064q;

    /* renamed from: r */
    public int f3065r;

    /* renamed from: com.google.android.material.timepicker.ClockHandView$a */
    public class C0779a implements ValueAnimator.AnimatorUpdateListener {
        public C0779a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ClockHandView clockHandView = ClockHandView.this;
            int i = ClockHandView.f3051s;
            clockHandView.mo4000c(floatValue, true);
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$b */
    public class C0780b extends AnimatorListenerAdapter {
        public C0780b(ClockHandView clockHandView) {
        }

        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$c */
    public interface C0781c {
        /* renamed from: a */
        void mo3995a(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        Paint paint = new Paint();
        this.f3059l = paint;
        this.f3060m = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1455a.f4568f, R.attr.materialClockStyle, 2131952365);
        this.f3065r = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f3057j = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f3061n = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f3058k = (float) resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        mo3999b(0.0f, false);
        this.f3055h = ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final int mo3998a(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (f2 - ((float) (getHeight() / 2))), (double) (f - ((float) (getWidth() / 2)))))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    /* renamed from: b */
    public void mo3999b(float f, boolean z) {
        ValueAnimator valueAnimator = this.f3052e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            mo4000c(f, false);
            return;
        }
        float f2 = this.f3062o;
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f2), Float.valueOf(f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{((Float) pair.first).floatValue(), ((Float) pair.second).floatValue()});
        this.f3052e = ofFloat;
        ofFloat.setDuration(200);
        this.f3052e.addUpdateListener(new C0779a());
        this.f3052e.addListener(new C0780b(this));
        this.f3052e.start();
    }

    /* renamed from: c */
    public final void mo4000c(float f, boolean z) {
        float f2 = f % 360.0f;
        this.f3062o = f2;
        this.f3064q = Math.toRadians((double) (f2 - 90.0f));
        float cos = (((float) this.f3065r) * ((float) Math.cos(this.f3064q))) + ((float) (getWidth() / 2));
        float sin = (((float) this.f3065r) * ((float) Math.sin(this.f3064q))) + ((float) (getHeight() / 2));
        RectF rectF = this.f3060m;
        int i = this.f3057j;
        rectF.set(cos - ((float) i), sin - ((float) i), cos + ((float) i), sin + ((float) i));
        for (C0781c a : this.f3056i) {
            a.mo3995a(f2, z);
        }
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = (float) width;
        float f2 = (float) height;
        this.f3059l.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) this.f3065r) * ((float) Math.cos(this.f3064q))) + f, (((float) this.f3065r) * ((float) Math.sin(this.f3064q))) + f2, (float) this.f3057j, this.f3059l);
        double sin = Math.sin(this.f3064q);
        double cos = Math.cos(this.f3064q);
        double d = (double) ((float) (this.f3065r - this.f3057j));
        float f3 = (float) (width + ((int) (cos * d)));
        float f4 = (float) (height + ((int) (d * sin)));
        this.f3059l.setStrokeWidth((float) this.f3061n);
        canvas.drawLine(f, f2, f3, f4, this.f3059l);
        canvas.drawCircle(f, f2, this.f3058k, this.f3059l);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo3999b(this.f3062o, false);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.f3053f = x;
            this.f3054g = y;
            this.f3063p = false;
            z2 = false;
            z = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.f3063p;
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.f3063p;
        float a = (float) mo3998a(x, y);
        boolean z5 = this.f3062o != a;
        if (!z || !z5) {
            if (z5 || z2) {
                mo3999b(a, false);
            }
            this.f3063p = z4 | z3;
            return true;
        }
        z3 = true;
        this.f3063p = z4 | z3;
        return true;
    }
}
