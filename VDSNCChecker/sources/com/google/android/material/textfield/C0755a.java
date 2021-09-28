package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p007au.gov.dfat.vdsncchecker.R;
import p051i.C1021a;
import p089o1.C1494a;
import p090o2.C1504a;
import p090o2.C1505b;
import p090o2.C1506c;
import p090o2.C1507d;
import p090o2.C1514k;

/* renamed from: com.google.android.material.textfield.a */
public class C0755a extends C1514k {

    /* renamed from: d */
    public final TextWatcher f2989d = new C0756a();

    /* renamed from: e */
    public final View.OnFocusChangeListener f2990e = new C0757b();

    /* renamed from: f */
    public final TextInputLayout.C0751f f2991f = new C0758c();

    /* renamed from: g */
    public final TextInputLayout.C0752g f2992g = new C0759d();

    /* renamed from: h */
    public AnimatorSet f2993h;

    /* renamed from: i */
    public ValueAnimator f2994i;

    /* renamed from: com.google.android.material.textfield.a$a */
    public class C0756a implements TextWatcher {
        public C0756a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
            if ((r5.length() > 0) != false) goto L_0x0024;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void afterTextChanged(android.text.Editable r5) {
            /*
                r4 = this;
                com.google.android.material.textfield.a r0 = com.google.android.material.textfield.C0755a.this
                com.google.android.material.textfield.TextInputLayout r0 = r0.f4683a
                java.lang.CharSequence r0 = r0.getSuffixText()
                if (r0 == 0) goto L_0x000b
                return
            L_0x000b:
                com.google.android.material.textfield.a r0 = com.google.android.material.textfield.C0755a.this
                com.google.android.material.textfield.TextInputLayout r1 = r0.f4683a
                boolean r1 = r1.hasFocus()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0023
                int r5 = r5.length()
                if (r5 <= 0) goto L_0x001f
                r5 = r2
                goto L_0x0020
            L_0x001f:
                r5 = r3
            L_0x0020:
                if (r5 == 0) goto L_0x0023
                goto L_0x0024
            L_0x0023:
                r2 = r3
            L_0x0024:
                r0.mo3964d(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.C0755a.C0756a.afterTextChanged(android.text.Editable):void");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    public class C0757b implements View.OnFocusChangeListener {
        public C0757b() {
        }

        public void onFocusChange(View view, boolean z) {
            boolean z2 = true;
            boolean z3 = !TextUtils.isEmpty(((EditText) view).getText());
            C0755a aVar = C0755a.this;
            if (!z3 || !z) {
                z2 = false;
            }
            aVar.mo3964d(z2);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    public class C0758c implements TextInputLayout.C0751f {
        public C0758c() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if ((r0.getText().length() > 0) != false) goto L_0x001d;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo3956a(com.google.android.material.textfield.TextInputLayout r5) {
            /*
                r4 = this;
                android.widget.EditText r0 = r5.getEditText()
                boolean r1 = r0.hasFocus()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x001c
                android.text.Editable r1 = r0.getText()
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0018
                r1 = r2
                goto L_0x0019
            L_0x0018:
                r1 = r3
            L_0x0019:
                if (r1 == 0) goto L_0x001c
                goto L_0x001d
            L_0x001c:
                r2 = r3
            L_0x001d:
                r5.setEndIconVisible(r2)
                r5.setEndIconCheckable(r3)
                com.google.android.material.textfield.a r5 = com.google.android.material.textfield.C0755a.this
                android.view.View$OnFocusChangeListener r5 = r5.f2990e
                r0.setOnFocusChangeListener(r5)
                com.google.android.material.textfield.a r5 = com.google.android.material.textfield.C0755a.this
                android.text.TextWatcher r5 = r5.f2989d
                r0.removeTextChangedListener(r5)
                com.google.android.material.textfield.a r5 = com.google.android.material.textfield.C0755a.this
                android.text.TextWatcher r5 = r5.f2989d
                r0.addTextChangedListener(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.C0755a.C0758c.mo3956a(com.google.android.material.textfield.TextInputLayout):void");
        }
    }

    /* renamed from: com.google.android.material.textfield.a$d */
    public class C0759d implements TextInputLayout.C0752g {

        /* renamed from: com.google.android.material.textfield.a$d$a */
        public class C0760a implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ EditText f2999e;

            public C0760a(EditText editText) {
                this.f2999e = editText;
            }

            public void run() {
                this.f2999e.removeTextChangedListener(C0755a.this.f2989d);
            }
        }

        public C0759d() {
        }

        /* renamed from: a */
        public void mo3957a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 2) {
                editText.post(new C0760a(editText));
                if (editText.getOnFocusChangeListener() == C0755a.this.f2990e) {
                    editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.a$e */
    public class C0761e implements View.OnClickListener {
        public C0761e() {
        }

        public void onClick(View view) {
            Editable text = C0755a.this.f4683a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            C0755a.this.f4683a.mo3850o();
        }
    }

    public C0755a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: a */
    public void mo3962a() {
        this.f4683a.setEndIconDrawable(C1021a.m2945a(this.f4684b, R.drawable.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f4683a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.clear_text_end_icon_content_description));
        this.f4683a.setEndIconOnClickListener(new C0761e());
        this.f4683a.mo3783a(this.f2991f);
        TextInputLayout textInputLayout2 = this.f4683a;
        textInputLayout2.f2952m0.add(this.f2992g);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(C1494a.f4655d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C1507d(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = C1494a.f4652a;
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(100);
        ofFloat2.addUpdateListener(new C1506c(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2993h = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.f2993h.addListener(new C1504a(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(100);
        ofFloat3.addUpdateListener(new C1506c(this));
        this.f2994i = ofFloat3;
        ofFloat3.addListener(new C1505b(this));
    }

    /* renamed from: c */
    public void mo3963c(boolean z) {
        if (this.f4683a.getSuffixText() != null) {
            mo3964d(z);
        }
    }

    /* renamed from: d */
    public final void mo3964d(boolean z) {
        boolean z2 = this.f4683a.mo3847k() == z;
        if (z && !this.f2993h.isRunning()) {
            this.f2994i.cancel();
            this.f2993h.start();
            if (z2) {
                this.f2993h.end();
            }
        } else if (!z) {
            this.f2993h.cancel();
            this.f2994i.start();
            if (z2) {
                this.f2994i.end();
            }
        }
    }
}
