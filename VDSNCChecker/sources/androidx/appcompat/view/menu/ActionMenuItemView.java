package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.C0074e;
import androidx.appcompat.view.menu.C0084j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0137c;
import androidx.appcompat.widget.C0148d0;
import androidx.appcompat.widget.C0156e1;
import androidx.appcompat.widget.C0180l0;
import com.dynamsoft.dbr.EnumBarcodeFormat;
import p039g.C0934b;
import p069l.C1224f;

public class ActionMenuItemView extends C0148d0 implements C0084j.C0085a, View.OnClickListener, ActionMenuView.C0096a {

    /* renamed from: j */
    public C0078g f266j;

    /* renamed from: k */
    public CharSequence f267k;

    /* renamed from: l */
    public Drawable f268l;

    /* renamed from: m */
    public C0074e.C0076b f269m;

    /* renamed from: n */
    public C0180l0 f270n;

    /* renamed from: o */
    public C0063b f271o;

    /* renamed from: p */
    public boolean f272p = mo164e();

    /* renamed from: q */
    public boolean f273q;

    /* renamed from: r */
    public int f274r;

    /* renamed from: s */
    public int f275s;

    /* renamed from: t */
    public int f276t;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    public class C0062a extends C0180l0 {
        public C0062a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: b */
        public C1224f mo180b() {
            C0137c.C0138a aVar;
            C0063b bVar = ActionMenuItemView.this.f271o;
            if (bVar == null || (aVar = C0137c.this.f706x) == null) {
                return null;
            }
            return aVar.mo368a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = mo180b();
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo181c() {
            /*
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = androidx.appcompat.view.menu.ActionMenuItemView.this
                androidx.appcompat.view.menu.e$b r1 = r0.f269m
                r2 = 0
                if (r1 == 0) goto L_0x001c
                androidx.appcompat.view.menu.g r0 = r0.f266j
                boolean r0 = r1.mo182a(r0)
                if (r0 == 0) goto L_0x001c
                l.f r0 = r3.mo180b()
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.mo202b()
                if (r0 == 0) goto L_0x001c
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.C0062a.mo181c():boolean");
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class C0063b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0934b.f3461c, 0, 0);
        this.f274r = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f276t = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f275s = -1;
        setSaveEnabled(false);
    }

    /* renamed from: a */
    public boolean mo160a() {
        return mo162c();
    }

    /* renamed from: b */
    public boolean mo161b() {
        return mo162c() && this.f266j.getIcon() == null;
    }

    /* renamed from: c */
    public boolean mo162c() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: d */
    public void mo163d(C0078g gVar, int i) {
        this.f266j = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.getTitleCondensed());
        setId(gVar.f387a);
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f270n == null) {
            this.f270n = new C0062a();
        }
    }

    /* renamed from: e */
    public final boolean mo164e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: f */
    public final void mo165f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f267k);
        if (this.f268l != null) {
            if (!((this.f266j.f411y & 4) == 4) || (!this.f272p && !this.f273q)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f267k : null);
        CharSequence charSequence2 = this.f266j.f403q;
        if (TextUtils.isEmpty(charSequence2)) {
            if (z3) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f266j.f391e;
            }
        }
        setContentDescription(charSequence2);
        CharSequence charSequence3 = this.f266j.f404r;
        if (TextUtils.isEmpty(charSequence3)) {
            if (!z3) {
                charSequence = this.f266j.f391e;
            }
            C0156e1.m441a(this, charSequence);
            return;
        }
        C0156e1.m441a(this, charSequence3);
    }

    public C0078g getItemData() {
        return this.f266j;
    }

    public void onClick(View view) {
        C0074e.C0076b bVar = this.f269m;
        if (bVar != null) {
            bVar.mo182a(this.f266j);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f272p = mo164e();
        mo165f();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        boolean c = mo162c();
        if (c && (i3 = this.f275s) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f274r) : this.f274r;
        if (mode != 1073741824 && this.f274r > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, EnumBarcodeFormat.BF_MICRO_QR), i2);
        }
        if (!c && this.f268l != null) {
            super.setPadding((getMeasuredWidth() - this.f268l.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0180l0 l0Var;
        if (!this.f266j.hasSubMenu() || (l0Var = this.f270n) == null || !l0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f273q != z) {
            this.f273q = z;
            C0078g gVar = this.f266j;
            if (gVar != null) {
                C0074e eVar = gVar.f400n;
                eVar.f366k = true;
                eVar.mo274p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f268l = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f276t;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        mo165f();
    }

    public void setItemInvoker(C0074e.C0076b bVar) {
        this.f269m = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f275s = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0063b bVar) {
        this.f271o = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f267k = charSequence;
        mo165f();
    }
}
