package p126u2;

import java.util.Iterator;
import p031e3.C0870a;

/* renamed from: u2.p */
public abstract class C1855p implements Iterator<Integer>, C0870a {
    /* renamed from: b */
    public abstract int mo4450b();

    public Object next() {
        return Integer.valueOf(mo4450b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
