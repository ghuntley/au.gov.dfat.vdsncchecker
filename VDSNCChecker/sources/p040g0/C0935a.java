package p040g0;

import android.graphics.Typeface;
import p010b0.C0533b;
import p016c0.C0560d;

/* renamed from: g0.a */
public class C0935a implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C0949m f3485e;

    /* renamed from: f */
    public final /* synthetic */ Typeface f3486f;

    public C0935a(C0937c cVar, C0949m mVar, Typeface typeface) {
        this.f3485e = mVar;
        this.f3486f = typeface;
    }

    public void run() {
        C0949m mVar = this.f3485e;
        Typeface typeface = this.f3486f;
        C0533b.C0534a aVar = ((C0560d.C0561a) mVar).f2365a;
        if (aVar != null) {
            aVar.mo760e(typeface);
        }
    }
}
