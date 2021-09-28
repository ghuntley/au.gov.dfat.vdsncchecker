package p090o2;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: o2.k */
public abstract class C1514k {

    /* renamed from: a */
    public TextInputLayout f4683a;

    /* renamed from: b */
    public Context f4684b;

    /* renamed from: c */
    public CheckableImageButton f4685c;

    public C1514k(TextInputLayout textInputLayout) {
        this.f4683a = textInputLayout;
        this.f4684b = textInputLayout.getContext();
        this.f4685c = textInputLayout.getEndIconView();
    }

    /* renamed from: a */
    public abstract void mo3962a();

    /* renamed from: b */
    public boolean mo3971b(int i) {
        return true;
    }

    /* renamed from: c */
    public void mo3963c(boolean z) {
    }
}
