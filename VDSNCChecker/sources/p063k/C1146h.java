package p063k;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p058j0.C1070q;
import p058j0.C1073r;
import p058j0.C1074s;

/* renamed from: k.h */
public class C1146h {

    /* renamed from: a */
    public final ArrayList<C1070q> f3991a = new ArrayList<>();

    /* renamed from: b */
    public long f3992b = -1;

    /* renamed from: c */
    public Interpolator f3993c;

    /* renamed from: d */
    public C1073r f3994d;

    /* renamed from: e */
    public boolean f3995e;

    /* renamed from: f */
    public final C1074s f3996f = new C1147a();

    /* renamed from: k.h$a */
    public class C1147a extends C1074s {

        /* renamed from: a */
        public boolean f3997a = false;

        /* renamed from: b */
        public int f3998b = 0;

        public C1147a() {
        }

        /* renamed from: a */
        public void mo739a(View view) {
            int i = this.f3998b + 1;
            this.f3998b = i;
            if (i == C1146h.this.f3991a.size()) {
                C1073r rVar = C1146h.this.f3994d;
                if (rVar != null) {
                    rVar.mo739a((View) null);
                }
                this.f3998b = 0;
                this.f3997a = false;
                C1146h.this.f3995e = false;
            }
        }

        /* renamed from: b */
        public void mo740b(View view) {
            if (!this.f3997a) {
                this.f3997a = true;
                C1073r rVar = C1146h.this.f3994d;
                if (rVar != null) {
                    rVar.mo740b((View) null);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo4742a() {
        if (this.f3995e) {
            Iterator<C1070q> it = this.f3991a.iterator();
            while (it.hasNext()) {
                it.next().mo4546b();
            }
            this.f3995e = false;
        }
    }

    /* renamed from: b */
    public void mo4743b() {
        View view;
        if (!this.f3995e) {
            Iterator<C1070q> it = this.f3991a.iterator();
            while (it.hasNext()) {
                C1070q next = it.next();
                long j = this.f3992b;
                if (j >= 0) {
                    next.mo4547c(j);
                }
                Interpolator interpolator = this.f3993c;
                if (!(interpolator == null || (view = (View) next.f3821a.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.f3994d != null) {
                    next.mo4548d(this.f3996f);
                }
                View view2 = (View) next.f3821a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.f3995e = true;
        }
    }
}
