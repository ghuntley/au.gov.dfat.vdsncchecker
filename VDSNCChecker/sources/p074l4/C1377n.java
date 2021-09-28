package p074l4;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import p045h.C0990o;

/* renamed from: l4.n */
public abstract class C1377n implements C1348e {
    /* renamed from: c */
    public abstract C1393s mo5171c();

    /* renamed from: e */
    public void mo5195e(OutputStream outputStream) {
        new C0990o(outputStream).mo4398l(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1348e)) {
            return false;
        }
        return mo5171c().mo5222l(((C1348e) obj).mo5171c());
    }

    /* renamed from: f */
    public void mo5197f(OutputStream outputStream, String str) {
        C0990o.m2884a(outputStream, str).mo4399m(mo5171c(), true);
    }

    /* renamed from: g */
    public byte[] mo5198g() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        mo5195e(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: h */
    public byte[] mo5199h(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        mo5197f(byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        return mo5171c().hashCode();
    }
}
