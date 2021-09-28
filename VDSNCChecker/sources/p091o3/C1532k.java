package p091o3;

import p000a.C0001b;
import p073l3.C1320u;

/* renamed from: o3.k */
public final class C1532k extends C1530i {

    /* renamed from: g */
    public final Runnable f4758g;

    public C1532k(Runnable runnable, long j, C1531j jVar) {
        super(j, jVar);
        this.f4758g = runnable;
    }

    public void run() {
        try {
            this.f4758g.run();
        } finally {
            this.f4757f.mo5477Q();
        }
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("Task[");
        a.append(C1320u.m3709m(this.f4758g));
        a.append('@');
        a.append(C1320u.m3710n(this.f4758g));
        a.append(", ");
        a.append(this.f4756e);
        a.append(", ");
        a.append(this.f4757f);
        a.append(']');
        return a.toString();
    }
}
