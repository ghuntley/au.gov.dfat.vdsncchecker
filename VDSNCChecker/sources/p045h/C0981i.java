package p045h;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import p016c0.C0558b;
import p058j0.C1057k;
import p058j0.C1061o;
import p058j0.C1076u;

/* renamed from: h.i */
public class C0981i implements C1057k {

    /* renamed from: a */
    public final /* synthetic */ C0968h f3627a;

    public C0981i(C0968h hVar) {
        this.f3627a = hVar;
    }

    /* renamed from: a */
    public C1076u mo1392a(View view, C1076u uVar) {
        int d = uVar.mo4559d();
        int X = this.f3627a.mo4341X(uVar, (Rect) null);
        if (d != X) {
            int b = uVar.mo4557b();
            int c = uVar.mo4558c();
            int a = uVar.mo4556a();
            int i = Build.VERSION.SDK_INT;
            C1076u.C1080d cVar = i >= 30 ? new C1076u.C1079c(uVar) : i >= 29 ? new C1076u.C1078b(uVar) : new C1076u.C1077a(uVar);
            cVar.mo4566d(C0558b.m1820a(b, X, c, a));
            uVar = cVar.mo4564b();
        }
        return C1061o.m3029j(view, uVar);
    }
}
