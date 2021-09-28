package androidx.fragment.app;

import androidx.fragment.app.C0263a0;
import p093p.C1545a;

/* renamed from: androidx.fragment.app.g */
public class C0282g implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C0263a0.C0267d f1422e;

    /* renamed from: f */
    public final /* synthetic */ C0263a0.C0267d f1423f;

    /* renamed from: g */
    public final /* synthetic */ boolean f1424g;

    /* renamed from: h */
    public final /* synthetic */ C1545a f1425h;

    public C0282g(C0273c cVar, C0263a0.C0267d dVar, C0263a0.C0267d dVar2, boolean z, C1545a aVar) {
        this.f1422e = dVar;
        this.f1423f = dVar2;
        this.f1424g = z;
        this.f1425h = aVar;
    }

    public void run() {
        C0329z.m960c(this.f1422e.f1370c, this.f1423f.f1370c, this.f1424g, this.f1425h, false);
    }
}
