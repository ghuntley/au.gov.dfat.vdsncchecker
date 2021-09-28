package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.C0273c;

/* renamed from: androidx.fragment.app.e */
public class C0279e implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f1415a;

    /* renamed from: b */
    public final /* synthetic */ View f1416b;

    /* renamed from: c */
    public final /* synthetic */ C0273c.C0275b f1417c;

    /* renamed from: androidx.fragment.app.e$a */
    public class C0280a implements Runnable {
        public C0280a() {
        }

        public void run() {
            C0279e eVar = C0279e.this;
            eVar.f1415a.endViewTransition(eVar.f1416b);
            C0279e.this.f1417c.mo1570a();
        }
    }

    public C0279e(C0273c cVar, ViewGroup viewGroup, View view, C0273c.C0275b bVar) {
        this.f1415a = viewGroup;
        this.f1416b = view;
        this.f1417c = bVar;
    }

    public void onAnimationEnd(Animation animation) {
        this.f1415a.post(new C0280a());
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
