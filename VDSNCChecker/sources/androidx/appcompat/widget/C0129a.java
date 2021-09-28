package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.C0074e;
import p007au.gov.dfat.vdsncchecker.R;
import p039g.C0934b;
import p058j0.C1061o;
import p058j0.C1070q;
import p058j0.C1073r;

/* renamed from: androidx.appcompat.widget.a */
public abstract class C0129a extends ViewGroup {

    /* renamed from: e */
    public final C0130a f662e;

    /* renamed from: f */
    public final Context f663f;

    /* renamed from: g */
    public ActionMenuView f664g;

    /* renamed from: h */
    public C0137c f665h;

    /* renamed from: i */
    public int f666i;

    /* renamed from: j */
    public C1070q f667j;

    /* renamed from: k */
    public boolean f668k;

    /* renamed from: l */
    public boolean f669l;

    /* renamed from: androidx.appcompat.widget.a$a */
    public class C0130a implements C1073r {

        /* renamed from: a */
        public boolean f670a = false;

        /* renamed from: b */
        public int f671b;

        public C0130a() {
        }

        /* renamed from: a */
        public void mo739a(View view) {
            if (!this.f670a) {
                C0129a aVar = C0129a.this;
                aVar.f667j = null;
                C0129a.super.setVisibility(this.f671b);
            }
        }

        /* renamed from: b */
        public void mo740b(View view) {
            C0129a.super.setVisibility(0);
            this.f670a = false;
        }

        /* renamed from: c */
        public void mo741c(View view) {
            this.f670a = true;
        }
    }

    public C0129a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0129a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f662e = new C0130a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f663f = context;
        } else {
            this.f663f = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: c */
    public int mo733c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* renamed from: d */
    public int mo734d(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: e */
    public C1070q mo735e(int i, long j) {
        C1070q qVar = this.f667j;
        if (qVar != null) {
            qVar.mo4546b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C1070q b = C1061o.m3021b(this);
            b.mo4545a(1.0f);
            b.mo4547c(j);
            C0130a aVar = this.f662e;
            C0129a.this.f667j = b;
            aVar.f671b = i;
            View view = (View) b.f3821a.get();
            if (view != null) {
                b.mo4549e(view, aVar);
            }
            return b;
        }
        C1070q b2 = C1061o.m3021b(this);
        b2.mo4545a(0.0f);
        b2.mo4547c(j);
        C0130a aVar2 = this.f662e;
        C0129a.this.f667j = b2;
        aVar2.f671b = i;
        View view2 = (View) b2.f3821a.get();
        if (view2 != null) {
            b2.mo4549e(view2, aVar2);
        }
        return b2;
    }

    public int getAnimatedVisibility() {
        return this.f667j != null ? this.f662e.f671b : getVisibility();
    }

    public int getContentHeight() {
        return this.f666i;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C0934b.f3459a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C0137c cVar = this.f665h;
        if (cVar != null) {
            Configuration configuration2 = cVar.f298f.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            cVar.f702t = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            C0074e eVar = cVar.f299g;
            if (eVar != null) {
                eVar.mo274p(true);
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f669l = false;
        }
        if (!this.f669l) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f669l = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f669l = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f668k = false;
        }
        if (!this.f668k) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f668k = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f668k = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C1070q qVar = this.f667j;
            if (qVar != null) {
                qVar.mo4546b();
            }
            super.setVisibility(i);
        }
    }
}
