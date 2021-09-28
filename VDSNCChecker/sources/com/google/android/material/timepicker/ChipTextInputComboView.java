package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import p007au.gov.dfat.vdsncchecker.R;
import p036f2.C0902j;

public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: e */
    public final Chip f3034e;

    /* renamed from: f */
    public final EditText f3035f;

    /* renamed from: com.google.android.material.timepicker.ChipTextInputComboView$b */
    public class C0778b extends C0902j {
        public C0778b(C0777a aVar) {
        }

        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
                chipTextInputComboView.f3034e.setText(ChipTextInputComboView.m2359a(chipTextInputComboView, "00"));
                return;
            }
            ChipTextInputComboView chipTextInputComboView2 = ChipTextInputComboView.this;
            chipTextInputComboView2.f3034e.setText(ChipTextInputComboView.m2359a(chipTextInputComboView2, editable));
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, this, false);
        this.f3034e = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, this, false);
        EditText editText = textInputLayout.getEditText();
        this.f3035f = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new C0778b((C0777a) null));
        mo3988b();
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        editText.setSaveEnabled(false);
    }

    /* renamed from: a */
    public static String m2359a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
    }

    /* renamed from: b */
    public final void mo3988b() {
        this.f3035f.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public boolean isChecked() {
        return this.f3034e.isChecked();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo3988b();
    }

    public void setChecked(boolean z) {
        this.f3034e.setChecked(z);
        int i = 0;
        this.f3035f.setVisibility(z ? 0 : 4);
        Chip chip = this.f3034e;
        if (z) {
            i = 8;
        }
        chip.setVisibility(i);
        if (isChecked()) {
            this.f3035f.requestFocus();
            if (!TextUtils.isEmpty(this.f3035f.getText())) {
                EditText editText = this.f3035f;
                editText.setSelection(editText.getText().length());
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f3034e.setOnClickListener(onClickListener);
    }

    public void setTag(int i, Object obj) {
        this.f3034e.setTag(i, obj);
    }

    public void toggle() {
        this.f3034e.toggle();
    }
}
