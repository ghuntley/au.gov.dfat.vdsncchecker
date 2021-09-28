package p128u4;

import java.io.IOException;
import p128u4.C1899g;

/* renamed from: u4.h */
public final /* synthetic */ class C1907h implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ int f5624e = 0;

    /* renamed from: f */
    public final /* synthetic */ C1899g.C1901b.C1902a f5625f;

    /* renamed from: g */
    public final /* synthetic */ C1887d f5626g;

    /* renamed from: h */
    public final /* synthetic */ Object f5627h;

    public /* synthetic */ C1907h(C1899g.C1901b.C1902a aVar, C1887d dVar, Throwable th) {
        this.f5625f = aVar;
        this.f5626g = dVar;
        this.f5627h = th;
    }

    public /* synthetic */ C1907h(C1899g.C1901b.C1902a aVar, C1887d dVar, C1881a0 a0Var) {
        this.f5625f = aVar;
        this.f5626g = dVar;
        this.f5627h = a0Var;
    }

    public final void run() {
        switch (this.f5624e) {
            case 0:
                this.f5626g.mo5961a(C1899g.C1901b.this, (Throwable) this.f5627h);
                return;
            default:
                C1899g.C1901b.C1902a aVar = this.f5625f;
                C1887d dVar = this.f5626g;
                C1881a0 a0Var = (C1881a0) this.f5627h;
                boolean c = C1899g.C1901b.this.f5614f.mo5979c();
                C1899g.C1901b bVar = C1899g.C1901b.this;
                if (c) {
                    dVar.mo5961a(bVar, new IOException("Canceled"));
                    return;
                } else {
                    dVar.mo5962b(bVar, a0Var);
                    return;
                }
        }
    }
}
