package androidx.appcompat.widget;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* renamed from: androidx.appcompat.widget.e1 */
public class C0156e1 {
    /* renamed from: a */
    public static void m441a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        C0159f1 f1Var = C0159f1.f771n;
        if (f1Var != null && f1Var.f773e == view) {
            C0159f1.m451c((C0159f1) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C0159f1 f1Var2 = C0159f1.f772o;
            if (f1Var2 != null && f1Var2.f773e == view) {
                f1Var2.mo900b();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new C0159f1(view, charSequence);
    }
}
