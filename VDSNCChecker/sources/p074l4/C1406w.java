package p074l4;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/* renamed from: l4.w */
public class C1406w implements Enumeration {

    /* renamed from: a */
    public int f4453a = 0;

    /* renamed from: b */
    public final /* synthetic */ C1408x f4454b;

    public C1406w(C1408x xVar) {
        this.f4454b = xVar;
    }

    public boolean hasMoreElements() {
        return this.f4453a < this.f4454b.f4456e.length;
    }

    public Object nextElement() {
        int i = this.f4453a;
        C1348e[] eVarArr = this.f4454b.f4456e;
        if (i < eVarArr.length) {
            this.f4453a = i + 1;
            return eVarArr[i];
        }
        throw new NoSuchElementException();
    }
}
