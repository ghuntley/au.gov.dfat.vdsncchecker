package p036f2;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;
import p058j0.C1043a;
import p064k0.C1150b;

/* renamed from: f2.a */
public class C0889a extends C1043a {

    /* renamed from: d */
    public final /* synthetic */ CheckableImageButton f3353d;

    public C0889a(CheckableImageButton checkableImageButton) {
        this.f3353d = checkableImageButton;
    }

    /* renamed from: c */
    public void mo1507c(View view, AccessibilityEvent accessibilityEvent) {
        this.f3779a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f3353d.isChecked());
    }

    /* renamed from: d */
    public void mo1508d(View view, C1150b bVar) {
        this.f3779a.onInitializeAccessibilityNodeInfo(view, bVar.f4005a);
        bVar.f4005a.setCheckable(this.f3353d.f2870h);
        bVar.f4005a.setChecked(this.f3353d.isChecked());
    }
}
