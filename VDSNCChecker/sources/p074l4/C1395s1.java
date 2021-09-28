package p074l4;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* renamed from: l4.s1 */
public class C1395s1 implements Enumeration {

    /* renamed from: a */
    public C1368k f4439a;

    /* renamed from: b */
    public Object f4440b = mo5223a();

    public C1395s1(byte[] bArr) {
        this.f4439a = new C1368k(bArr, true);
    }

    /* renamed from: a */
    public final Object mo5223a() {
        try {
            return this.f4439a.mo5190i();
        } catch (IOException e) {
            throw new C1390r("malformed DER construction: " + e, e, 0);
        }
    }

    public boolean hasMoreElements() {
        return this.f4440b != null;
    }

    public Object nextElement() {
        Object obj = this.f4440b;
        if (obj != null) {
            this.f4440b = mo5223a();
            return obj;
        }
        throw new NoSuchElementException();
    }
}
