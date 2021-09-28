package p040g0;

import android.os.Handler;
import p040g0.C0945j;

/* renamed from: g0.c */
public class C0937c {

    /* renamed from: a */
    public final C0949m f3489a;

    /* renamed from: b */
    public final Handler f3490b;

    public C0937c(C0949m mVar, Handler handler) {
        this.f3489a = mVar;
        this.f3490b = handler;
    }

    /* renamed from: a */
    public void mo4251a(C0945j.C0946a aVar) {
        int i = aVar.f3512b;
        if (i == 0) {
            this.f3490b.post(new C0935a(this, this.f3489a, aVar.f3511a));
            return;
        }
        this.f3490b.post(new C0936b(this, this.f3489a, i));
    }
}
