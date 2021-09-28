package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.C0342c;
import androidx.lifecycle.C0355i;
import p118t0.C1773g;

/* renamed from: androidx.lifecycle.g */
public class C0350g implements C1773g {

    /* renamed from: m */
    public static final C0350g f1698m = new C0350g();

    /* renamed from: e */
    public int f1699e = 0;

    /* renamed from: f */
    public int f1700f = 0;

    /* renamed from: g */
    public boolean f1701g = true;

    /* renamed from: h */
    public boolean f1702h = true;

    /* renamed from: i */
    public Handler f1703i;

    /* renamed from: j */
    public final C0347e f1704j = new C0347e(this);

    /* renamed from: k */
    public Runnable f1705k = new C0351a();

    /* renamed from: l */
    public C0355i.C0356a f1706l = new C0352b();

    /* renamed from: androidx.lifecycle.g$a */
    public class C0351a implements Runnable {
        public C0351a() {
        }

        public void run() {
            C0350g gVar = C0350g.this;
            if (gVar.f1700f == 0) {
                gVar.f1701g = true;
                gVar.f1704j.mo1807e(C0342c.C0344b.ON_PAUSE);
            }
            C0350g gVar2 = C0350g.this;
            if (gVar2.f1699e == 0 && gVar2.f1701g) {
                gVar2.f1704j.mo1807e(C0342c.C0344b.ON_STOP);
                gVar2.f1702h = true;
            }
        }
    }

    /* renamed from: androidx.lifecycle.g$b */
    public class C0352b implements C0355i.C0356a {
        public C0352b() {
        }
    }

    /* renamed from: a */
    public void mo1814a() {
        int i = this.f1700f + 1;
        this.f1700f = i;
        if (i != 1) {
            return;
        }
        if (this.f1701g) {
            this.f1704j.mo1807e(C0342c.C0344b.ON_RESUME);
            this.f1701g = false;
            return;
        }
        this.f1703i.removeCallbacks(this.f1705k);
    }

    /* renamed from: b */
    public void mo1815b() {
        int i = this.f1699e + 1;
        this.f1699e = i;
        if (i == 1 && this.f1702h) {
            this.f1704j.mo1807e(C0342c.C0344b.ON_START);
            this.f1702h = false;
        }
    }

    /* renamed from: c */
    public C0342c mo113c() {
        return this.f1704j;
    }
}
