package p074l4;

import java.io.IOException;
import java.io.OutputStream;
import p045h.C0990o;

/* renamed from: l4.s */
public abstract class C1393s extends C1377n {
    /* renamed from: m */
    public static C1393s m3981m(byte[] bArr) {
        C1368k kVar = new C1368k(bArr);
        try {
            C1393s i = kVar.mo5190i();
            if (kVar.available() == 0) {
                return i;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    /* renamed from: c */
    public final C1393s mo5171c() {
        return this;
    }

    /* renamed from: e */
    public void mo5195e(OutputStream outputStream) {
        mo5154j(new C0990o(outputStream), true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1348e) && mo5153i(((C1348e) obj).mo5171c());
    }

    /* renamed from: f */
    public void mo5197f(OutputStream outputStream, String str) {
        C0990o.m2884a(outputStream, str).mo4399m(this, true);
    }

    /* renamed from: i */
    public abstract boolean mo5153i(C1393s sVar);

    /* renamed from: j */
    public abstract void mo5154j(C0990o oVar, boolean z);

    /* renamed from: k */
    public abstract int mo5155k();

    /* renamed from: l */
    public final boolean mo5222l(C1393s sVar) {
        return this == sVar || mo5153i(sVar);
    }

    /* renamed from: n */
    public abstract boolean mo5156n();

    /* renamed from: o */
    public C1393s mo5159o() {
        return this;
    }

    /* renamed from: p */
    public C1393s mo5160p() {
        return this;
    }
}
