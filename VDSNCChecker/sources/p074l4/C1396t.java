package p074l4;

import java.util.Arrays;
import p045h.C0990o;
import p104q4.C1625a;
import p110r4.C1688a;

/* renamed from: l4.t */
public abstract class C1396t extends C1393s {

    /* renamed from: e */
    public final boolean f4441e;

    /* renamed from: f */
    public final int f4442f;

    /* renamed from: g */
    public final byte[] f4443g;

    public C1396t(boolean z, int i, byte[] bArr) {
        this.f4441e = z;
        this.f4442f = i;
        this.f4443g = C1625a.m4534a(bArr);
    }

    public int hashCode() {
        return (this.f4441e ^ this.f4442f) ^ C1625a.m4536c(this.f4443g) ? 1 : 0;
    }

    /* renamed from: i */
    public boolean mo5153i(C1393s sVar) {
        if (!(sVar instanceof C1396t)) {
            return false;
        }
        C1396t tVar = (C1396t) sVar;
        return this.f4441e == tVar.f4441e && this.f4442f == tVar.f4442f && Arrays.equals(this.f4443g, tVar.f4443g);
    }

    /* renamed from: j */
    public void mo5154j(C0990o oVar, boolean z) {
        oVar.mo4393g(z, this.f4441e ? 224 : 192, this.f4442f, this.f4443g);
    }

    /* renamed from: k */
    public int mo5155k() {
        return C1405v1.m4029a(this.f4443g.length) + C1405v1.m4030b(this.f4442f) + this.f4443g.length;
    }

    /* renamed from: n */
    public boolean mo5156n() {
        return this.f4441e;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (this.f4441e) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("PRIVATE ");
        stringBuffer.append(Integer.toString(this.f4442f));
        stringBuffer.append("]");
        if (this.f4443g != null) {
            stringBuffer.append(" #");
            str = C1688a.m4678b(this.f4443g);
        } else {
            str = " #null";
        }
        stringBuffer.append(str);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }
}
