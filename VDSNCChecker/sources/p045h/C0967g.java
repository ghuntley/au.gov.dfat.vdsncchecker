package p045h;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p093p.C1548c;

/* renamed from: h.g */
public abstract class C0967g {

    /* renamed from: e */
    public static final C1548c<WeakReference<C0967g>> f3541e = new C1548c<>();

    /* renamed from: f */
    public static final Object f3542f = new Object();

    /* renamed from: s */
    public static void m2772s(C0967g gVar) {
        synchronized (f3542f) {
            Iterator<WeakReference<C0967g>> it = f3541e.iterator();
            while (it.hasNext()) {
                C0967g gVar2 = (C0967g) it.next().get();
                if (gVar2 == gVar || gVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: c */
    public abstract void mo4296c(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: d */
    public Context mo4297d(Context context) {
        return context;
    }

    /* renamed from: e */
    public abstract <T extends View> T mo4298e(int i);

    /* renamed from: f */
    public int mo4299f() {
        return -100;
    }

    /* renamed from: g */
    public abstract MenuInflater mo4300g();

    /* renamed from: h */
    public abstract C0958a mo4301h();

    /* renamed from: i */
    public abstract void mo4302i();

    /* renamed from: j */
    public abstract void mo4303j();

    /* renamed from: k */
    public abstract void mo4304k(Configuration configuration);

    /* renamed from: l */
    public abstract void mo4305l(Bundle bundle);

    /* renamed from: m */
    public abstract void mo4306m();

    /* renamed from: n */
    public abstract void mo4307n(Bundle bundle);

    /* renamed from: o */
    public abstract void mo4308o();

    /* renamed from: p */
    public abstract void mo4309p(Bundle bundle);

    /* renamed from: q */
    public abstract void mo4310q();

    /* renamed from: r */
    public abstract void mo4311r();

    /* renamed from: t */
    public abstract boolean mo4312t(int i);

    /* renamed from: u */
    public abstract void mo4313u(int i);

    /* renamed from: v */
    public abstract void mo4314v(View view);

    /* renamed from: w */
    public abstract void mo4315w(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: x */
    public void mo4316x(int i) {
    }

    /* renamed from: y */
    public abstract void mo4317y(CharSequence charSequence);
}
