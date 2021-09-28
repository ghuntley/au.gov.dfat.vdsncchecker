package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.appcompat.widget.C0219y;
import p069l.C1224f;

/* renamed from: androidx.appcompat.widget.x */
public class C0217x extends C0180l0 {

    /* renamed from: n */
    public final /* synthetic */ C0219y.C0223d f973n;

    /* renamed from: o */
    public final /* synthetic */ C0219y f974o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0217x(C0219y yVar, View view, C0219y.C0223d dVar) {
        super(view);
        this.f974o = yVar;
        this.f973n = dVar;
    }

    /* renamed from: b */
    public C1224f mo180b() {
        return this.f973n;
    }

    @SuppressLint({"SyntheticAccessor"})
    /* renamed from: c */
    public boolean mo181c() {
        if (this.f974o.getInternalPopup().mo1200b()) {
            return true;
        }
        this.f974o.mo1170b();
        return true;
    }
}
