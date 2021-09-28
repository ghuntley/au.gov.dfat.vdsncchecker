package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0148d0;
import androidx.appcompat.widget.C0151e;
import androidx.appcompat.widget.C0162g;
import androidx.appcompat.widget.C0165h;
import androidx.appcompat.widget.C0205s;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import p045h.C0988n;
import p048h2.C1012a;
import p090o2.C1518n;
import p131v1.C1965a;

public class MaterialComponentsViewInflater extends C0988n {
    /* renamed from: a */
    public C0151e mo3983a(Context context, AttributeSet attributeSet) {
        return new C1518n(context, attributeSet);
    }

    /* renamed from: b */
    public C0162g mo3984b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    /* renamed from: c */
    public C0165h mo3985c(Context context, AttributeSet attributeSet) {
        return new C1965a(context, attributeSet);
    }

    /* renamed from: d */
    public C0205s mo3986d(Context context, AttributeSet attributeSet) {
        return new C1012a(context, attributeSet);
    }

    /* renamed from: e */
    public C0148d0 mo3987e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
