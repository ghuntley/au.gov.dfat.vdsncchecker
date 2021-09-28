package p074l4;

import java.util.Arrays;
import p045h.C0990o;
import p104q4.C1625a;
import p110r4.C1688a;

/* renamed from: l4.a */
public abstract class C1336a extends C1393s {

    /* renamed from: e */
    public final boolean f4352e;

    /* renamed from: f */
    public final int f4353f;

    /* renamed from: g */
    public final byte[] f4354g;

    public C1336a(boolean z, int i, byte[] bArr) {
        this.f4352e = z;
        this.f4353f = i;
        this.f4354g = C1625a.m4534a(bArr);
    }

    public int hashCode() {
        return (this.f4352e ^ this.f4353f) ^ C1625a.m4536c(this.f4354g) ? 1 : 0;
    }

    /* renamed from: i */
    public boolean mo5153i(C1393s sVar) {
        if (!(sVar instanceof C1336a)) {
            return false;
        }
        C1336a aVar = (C1336a) sVar;
        return this.f4352e == aVar.f4352e && this.f4353f == aVar.f4353f && Arrays.equals(this.f4354g, aVar.f4354g);
    }

    /* renamed from: j */
    public void mo5154j(C0990o oVar, boolean z) {
        oVar.mo4393g(z, this.f4352e ? 96 : 64, this.f4353f, this.f4354g);
    }

    /* renamed from: k */
    public int mo5155k() {
        return C1405v1.m4029a(this.f4354g.length) + C1405v1.m4030b(this.f4353f) + this.f4354g.length;
    }

    /* renamed from: n */
    public boolean mo5156n() {
        return this.f4352e;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (this.f4352e) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("APPLICATION ");
        stringBuffer.append(Integer.toString(this.f4353f));
        stringBuffer.append("]");
        if (this.f4354g != null) {
            stringBuffer.append(" #");
            str = C1688a.m4678b(this.f4354g);
        } else {
            str = " #null";
        }
        stringBuffer.append(str);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }
}
