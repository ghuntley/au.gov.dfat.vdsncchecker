package p090o2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p054i2.C1030c;
import p058j0.C1061o;
import p058j0.C1070q;
import p089o1.C1494a;
import p136w0.C2036r;

/* renamed from: o2.l */
public final class C1515l {

    /* renamed from: a */
    public final Context f4686a;

    /* renamed from: b */
    public final TextInputLayout f4687b;

    /* renamed from: c */
    public LinearLayout f4688c;

    /* renamed from: d */
    public int f4689d;

    /* renamed from: e */
    public FrameLayout f4690e;

    /* renamed from: f */
    public Animator f4691f;

    /* renamed from: g */
    public final float f4692g;

    /* renamed from: h */
    public int f4693h;

    /* renamed from: i */
    public int f4694i;

    /* renamed from: j */
    public CharSequence f4695j;

    /* renamed from: k */
    public boolean f4696k;

    /* renamed from: l */
    public TextView f4697l;

    /* renamed from: m */
    public CharSequence f4698m;

    /* renamed from: n */
    public int f4699n;

    /* renamed from: o */
    public ColorStateList f4700o;

    /* renamed from: p */
    public CharSequence f4701p;

    /* renamed from: q */
    public boolean f4702q;

    /* renamed from: r */
    public TextView f4703r;

    /* renamed from: s */
    public int f4704s;

    /* renamed from: t */
    public ColorStateList f4705t;

    /* renamed from: u */
    public Typeface f4706u;

    /* renamed from: o2.l$a */
    public class C1516a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f4707a;

        /* renamed from: b */
        public final /* synthetic */ TextView f4708b;

        /* renamed from: c */
        public final /* synthetic */ int f4709c;

        /* renamed from: d */
        public final /* synthetic */ TextView f4710d;

        public C1516a(int i, TextView textView, int i2, TextView textView2) {
            this.f4707a = i;
            this.f4708b = textView;
            this.f4709c = i2;
            this.f4710d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            TextView textView;
            C1515l lVar = C1515l.this;
            lVar.f4693h = this.f4707a;
            lVar.f4691f = null;
            TextView textView2 = this.f4708b;
            if (textView2 != null) {
                textView2.setVisibility(4);
                if (this.f4709c == 1 && (textView = C1515l.this.f4697l) != null) {
                    textView.setText((CharSequence) null);
                }
            }
            TextView textView3 = this.f4710d;
            if (textView3 != null) {
                textView3.setTranslationY(0.0f);
                this.f4710d.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f4710d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C1515l(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f4686a = context;
        this.f4687b = textInputLayout;
        this.f4692g = (float) context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    /* renamed from: a */
    public void mo5430a(TextView textView, int i) {
        if (this.f4688c == null && this.f4690e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f4686a);
            this.f4688c = linearLayout;
            linearLayout.setOrientation(0);
            this.f4687b.addView(this.f4688c, -1, -2);
            this.f4690e = new FrameLayout(this.f4686a);
            this.f4688c.addView(this.f4690e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f4687b.getEditText() != null) {
                mo5431b();
            }
        }
        if (i == 0 || i == 1) {
            this.f4690e.setVisibility(0);
            this.f4690e.addView(textView);
        } else {
            this.f4688c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f4688c.setVisibility(0);
        this.f4689d++;
    }

    /* renamed from: b */
    public void mo5431b() {
        if ((this.f4688c == null || this.f4687b.getEditText() == null) ? false : true) {
            EditText editText = this.f4687b.getEditText();
            boolean d = C1030c.m2959d(this.f4686a);
            LinearLayout linearLayout = this.f4688c;
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            linearLayout.setPaddingRelative(mo5437h(d, R.dimen.material_helper_text_font_1_3_padding_horizontal, editText.getPaddingStart()), mo5437h(d, R.dimen.material_helper_text_font_1_3_padding_top, this.f4686a.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), mo5437h(d, R.dimen.material_helper_text_font_1_3_padding_horizontal, editText.getPaddingEnd()), 0);
        }
    }

    /* renamed from: c */
    public void mo5432c() {
        Animator animator = this.f4691f;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: d */
    public final void mo5433d(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{i3 == i ? 1.0f : 0.0f});
                ofFloat.setDuration(167);
                ofFloat.setInterpolator(C1494a.f4652a);
                list.add(ofFloat);
                if (i3 == i) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f4692g, 0.0f});
                    ofFloat2.setDuration(217);
                    ofFloat2.setInterpolator(C1494a.f4655d);
                    list.add(ofFloat2);
                }
            }
        }
    }

    /* renamed from: e */
    public boolean mo5434e() {
        return this.f4694i == 1 && this.f4697l != null && !TextUtils.isEmpty(this.f4695j);
    }

    /* renamed from: f */
    public final TextView mo5435f(int i) {
        if (i == 1) {
            return this.f4697l;
        }
        if (i != 2) {
            return null;
        }
        return this.f4703r;
    }

    /* renamed from: g */
    public int mo5436g() {
        TextView textView = this.f4697l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: h */
    public final int mo5437h(boolean z, int i, int i2) {
        return z ? this.f4686a.getResources().getDimensionPixelSize(i) : i2;
    }

    /* renamed from: i */
    public void mo5438i() {
        this.f4695j = null;
        mo5432c();
        if (this.f4693h == 1) {
            this.f4694i = (!this.f4702q || TextUtils.isEmpty(this.f4701p)) ? 0 : 2;
        }
        mo5441l(this.f4693h, this.f4694i, mo5440k(this.f4697l, (CharSequence) null));
    }

    /* renamed from: j */
    public void mo5439j(TextView textView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f4688c;
        if (linearLayout != null) {
            if (!(i == 0 || i == 1) || (frameLayout = this.f4690e) == null) {
                linearLayout.removeView(textView);
            } else {
                frameLayout.removeView(textView);
            }
            int i2 = this.f4689d - 1;
            this.f4689d = i2;
            LinearLayout linearLayout2 = this.f4688c;
            if (i2 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    /* renamed from: k */
    public final boolean mo5440k(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f4687b;
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        return textInputLayout.isLaidOut() && this.f4687b.isEnabled() && (this.f4694i != this.f4693h || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: l */
    public final void mo5441l(int i, int i2, boolean z) {
        TextView f;
        TextView f2;
        int i3 = i;
        int i4 = i2;
        boolean z2 = z;
        if (i3 != i4) {
            if (z2) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f4691f = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i5 = i;
                int i6 = i2;
                mo5433d(arrayList2, this.f4702q, this.f4703r, 2, i5, i6);
                mo5433d(arrayList2, this.f4696k, this.f4697l, 1, i5, i6);
                C2036r.m5372j(animatorSet, arrayList);
                animatorSet.addListener(new C1516a(i2, mo5435f(i), i, mo5435f(i4)));
                animatorSet.start();
            } else if (i3 != i4) {
                if (!(i4 == 0 || (f2 = mo5435f(i4)) == null)) {
                    f2.setVisibility(0);
                    f2.setAlpha(1.0f);
                }
                if (!(i3 == 0 || (f = mo5435f(i)) == null)) {
                    f.setVisibility(4);
                    if (i3 == 1) {
                        f.setText((CharSequence) null);
                    }
                }
                this.f4693h = i4;
            }
            this.f4687b.mo3946w();
            this.f4687b.mo3948y(z2, false);
            this.f4687b.mo3782F();
        }
    }
}
