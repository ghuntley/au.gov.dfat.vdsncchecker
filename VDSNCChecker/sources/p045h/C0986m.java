package p045h;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import p058j0.C1050e;
import p063k.C1135a;
import p093p.C1548c;

/* renamed from: h.m */
public class C0986m extends Dialog implements C0966f {

    /* renamed from: e */
    public C0967g f3632e;

    /* renamed from: f */
    public final C1050e.C1051a f3633f;

    /* renamed from: h.m$a */
    public class C0987a implements C1050e.C1051a {
        public C0987a() {
        }

        /* renamed from: h */
        public boolean mo4384h(KeyEvent keyEvent) {
            return C0986m.this.mo4374c(keyEvent);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0986m(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130903347(0x7f030133, float:1.741351E38)
            if (r6 != 0) goto L_0x0015
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L_0x0016
        L_0x0015:
            r2 = r6
        L_0x0016:
            r4.<init>(r5, r2)
            h.m$a r2 = new h.m$a
            r2.<init>()
            r4.f3633f = r2
            h.g r2 = r4.mo4372a()
            if (r6 != 0) goto L_0x0034
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L_0x0034:
            r2.mo4316x(r6)
            r5 = 0
            r2.mo4305l(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p045h.C0986m.<init>(android.content.Context, int):void");
    }

    /* renamed from: a */
    public C0967g mo4372a() {
        if (this.f3632e == null) {
            C1548c<WeakReference<C0967g>> cVar = C0967g.f3541e;
            this.f3632e = new C0968h(getContext(), getWindow(), this, this);
        }
        return this.f3632e;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo4372a().mo4296c(view, layoutParams);
    }

    /* renamed from: b */
    public C1135a mo4270b(C1135a.C1136a aVar) {
        return null;
    }

    /* renamed from: c */
    public boolean mo4374c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void dismiss() {
        super.dismiss();
        mo4372a().mo4306m();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C1050e.m2996b(this.f3633f, getWindow().getDecorView(), this, keyEvent);
    }

    /* renamed from: f */
    public void mo4273f(C1135a aVar) {
    }

    public <T extends View> T findViewById(int i) {
        return mo4372a().mo4298e(i);
    }

    /* renamed from: i */
    public void mo4277i(C1135a aVar) {
    }

    public void invalidateOptionsMenu() {
        mo4372a().mo4303j();
    }

    public void onCreate(Bundle bundle) {
        mo4372a().mo4302i();
        super.onCreate(bundle);
        mo4372a().mo4305l(bundle);
    }

    public void onStop() {
        super.onStop();
        mo4372a().mo4311r();
    }

    public void setContentView(int i) {
        mo4372a().mo4313u(i);
    }

    public void setContentView(View view) {
        mo4372a().mo4314v(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo4372a().mo4315w(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo4372a().mo4317y(getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo4372a().mo4317y(charSequence);
    }
}
