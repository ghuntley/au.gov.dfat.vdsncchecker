package p103q3;

import java.util.Iterator;
import p031e3.C0870a;

/* renamed from: q3.d */
public final class C1617d implements Iterator<C1615c>, C0870a {

    /* renamed from: e */
    public int f4994e;

    /* renamed from: f */
    public final /* synthetic */ C1615c f4995f;

    public C1617d(C1615c cVar) {
        this.f4995f = cVar;
        this.f4994e = cVar.mo5767j();
    }

    public boolean hasNext() {
        return this.f4994e > 0;
    }

    public Object next() {
        C1615c cVar = this.f4995f;
        int j = cVar.mo5767j();
        int i = this.f4994e;
        this.f4994e = i - 1;
        return cVar.mo5764h(j - i);
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
