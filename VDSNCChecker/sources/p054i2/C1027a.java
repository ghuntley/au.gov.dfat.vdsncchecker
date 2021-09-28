package p054i2;

import android.graphics.Typeface;
import p036f2.C0890b;
import p036f2.C0891c;
import p075m.C1417c;

/* renamed from: i2.a */
public final class C1027a extends C1417c {

    /* renamed from: a */
    public final Typeface f3747a;

    /* renamed from: b */
    public final C1028a f3748b;

    /* renamed from: c */
    public boolean f3749c;

    /* renamed from: i2.a$a */
    public interface C1028a {
    }

    public C1027a(C1028a aVar, Typeface typeface) {
        super(2);
        this.f3747a = typeface;
        this.f3748b = aVar;
    }

    /* renamed from: g */
    public void mo3467g(int i) {
        mo4466k(this.f3747a);
    }

    /* renamed from: h */
    public void mo3468h(Typeface typeface, boolean z) {
        mo4466k(typeface);
    }

    /* renamed from: k */
    public final void mo4466k(Typeface typeface) {
        if (!this.f3749c) {
            C0891c cVar = ((C0890b) this.f3748b).f3354a;
            C1027a aVar = cVar.f3395w;
            boolean z = true;
            if (aVar != null) {
                aVar.f3749c = true;
            }
            if (cVar.f3392t != typeface) {
                cVar.f3392t = typeface;
            } else {
                z = false;
            }
            if (z) {
                cVar.mo4201k();
            }
        }
    }
}
