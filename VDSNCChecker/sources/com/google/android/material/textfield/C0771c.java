package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p007au.gov.dfat.vdsncchecker.R;
import p036f2.C0902j;
import p051i.C1021a;
import p090o2.C1514k;

/* renamed from: com.google.android.material.textfield.c */
public class C0771c extends C1514k {

    /* renamed from: d */
    public final TextWatcher f3025d = new C0772a();

    /* renamed from: e */
    public final TextInputLayout.C0751f f3026e = new C0773b();

    /* renamed from: f */
    public final TextInputLayout.C0752g f3027f = new C0774c();

    /* renamed from: com.google.android.material.textfield.c$a */
    public class C0772a extends C0902j {
        public C0772a() {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C0771c cVar = C0771c.this;
            cVar.f4685c.setChecked(!C0771c.m2348d(cVar));
        }
    }

    /* renamed from: com.google.android.material.textfield.c$b */
    public class C0773b implements TextInputLayout.C0751f {
        public C0773b() {
        }

        /* renamed from: a */
        public void mo3956a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            C0771c cVar = C0771c.this;
            cVar.f4685c.setChecked(!C0771c.m2348d(cVar));
            editText.removeTextChangedListener(C0771c.this.f3025d);
            editText.addTextChangedListener(C0771c.this.f3025d);
        }
    }

    /* renamed from: com.google.android.material.textfield.c$c */
    public class C0774c implements TextInputLayout.C0752g {

        /* renamed from: com.google.android.material.textfield.c$c$a */
        public class C0775a implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ EditText f3031e;

            public C0775a(EditText editText) {
                this.f3031e = editText;
            }

            public void run() {
                this.f3031e.removeTextChangedListener(C0771c.this.f3025d);
            }
        }

        public C0774c() {
        }

        /* renamed from: a */
        public void mo3957a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.post(new C0775a(editText));
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.c$d */
    public class C0776d implements View.OnClickListener {
        public C0776d() {
        }

        public void onClick(View view) {
            EditText editText = C0771c.this.f4683a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                editText.setTransformationMethod(C0771c.m2348d(C0771c.this) ? null : PasswordTransformationMethod.getInstance());
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
                C0771c.this.f4683a.mo3850o();
            }
        }
    }

    public C0771c(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: d */
    public static boolean m2348d(C0771c cVar) {
        EditText editText = cVar.f4683a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* renamed from: a */
    public void mo3962a() {
        this.f4683a.setEndIconDrawable(C1021a.m2945a(this.f4684b, R.drawable.design_password_eye));
        TextInputLayout textInputLayout = this.f4683a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.password_toggle_content_description));
        this.f4683a.setEndIconOnClickListener(new C0776d());
        this.f4683a.mo3783a(this.f3026e);
        this.f4683a.f2952m0.add(this.f3027f);
        EditText editText = this.f4683a.getEditText();
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
