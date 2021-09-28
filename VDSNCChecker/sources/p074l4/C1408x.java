package p074l4;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import p000a.C0001b;
import p104q4.C1625a;

/* renamed from: l4.x */
public abstract class C1408x extends C1393s implements Iterable {

    /* renamed from: e */
    public final C1348e[] f4456e;

    /* renamed from: f */
    public final boolean f4457f;

    public C1408x() {
        this.f4456e = C1351f.f4373d;
        this.f4457f = true;
    }

    public C1408x(C1351f fVar, boolean z) {
        C1348e[] eVarArr;
        int i;
        Objects.requireNonNull(fVar, "'elementVector' cannot be null");
        boolean z2 = false;
        if (!z || (i = fVar.f4375b) < 2) {
            eVarArr = fVar.mo5175d();
        } else {
            if (i == 0) {
                eVarArr = C1351f.f4373d;
            } else {
                C1348e[] eVarArr2 = new C1348e[i];
                System.arraycopy(fVar.f4374a, 0, eVarArr2, 0, i);
                eVarArr = eVarArr2;
            }
            m4040t(eVarArr);
        }
        this.f4456e = eVarArr;
        this.f4457f = (z || eVarArr.length < 2) ? true : z2;
    }

    public C1408x(boolean z, C1348e[] eVarArr) {
        this.f4456e = eVarArr;
        this.f4457f = z || eVarArr.length < 2;
    }

    /* renamed from: q */
    public static byte[] m4037q(C1348e eVar) {
        try {
            return eVar.mo5171c().mo5199h("DER");
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    /* renamed from: r */
    public static C1408x m4038r(Object obj) {
        if (obj == null || (obj instanceof C1408x)) {
            return (C1408x) obj;
        }
        if (obj instanceof C1410y) {
            return m4038r(((C1410y) obj).mo5171c());
        }
        if (obj instanceof byte[]) {
            try {
                return m4038r(C1393s.m3981m((byte[]) obj));
            } catch (IOException e) {
                StringBuilder a = C0001b.m0a("failed to construct set from byte[]: ");
                a.append(e.getMessage());
                throw new IllegalArgumentException(a.toString());
            }
        } else {
            if (obj instanceof C1348e) {
                C1393s c = ((C1348e) obj).mo5171c();
                if (c instanceof C1408x) {
                    return (C1408x) c;
                }
            }
            StringBuilder a2 = C0001b.m0a("unknown object in getInstance: ");
            a2.append(obj.getClass().getName());
            throw new IllegalArgumentException(a2.toString());
        }
    }

    /* renamed from: s */
    public static boolean m4039s(byte[] bArr, byte[] bArr2) {
        byte b = bArr[0] & -33;
        byte b2 = bArr2[0] & -33;
        if (b != b2) {
            return b < b2;
        }
        int min = Math.min(bArr.length, bArr2.length) - 1;
        for (int i = 1; i < min; i++) {
            if (bArr[i] != bArr2[i]) {
                return (bArr[i] & 255) < (bArr2[i] & 255);
            }
        }
        return (bArr[min] & 255) <= (bArr2[min] & 255);
    }

    /* renamed from: t */
    public static void m4040t(C1348e[] eVarArr) {
        int length = eVarArr.length;
        if (length >= 2) {
            C1348e eVar = eVarArr[0];
            C1348e eVar2 = eVarArr[1];
            byte[] q = m4037q(eVar);
            byte[] q2 = m4037q(eVar2);
            if (m4039s(q2, q)) {
                C1348e eVar3 = eVar2;
                eVar2 = eVar;
                eVar = eVar3;
            } else {
                byte[] bArr = q2;
                q2 = q;
                q = bArr;
            }
            for (int i = 2; i < length; i++) {
                C1348e eVar4 = eVarArr[i];
                byte[] q3 = m4037q(eVar4);
                if (m4039s(q, q3)) {
                    eVarArr[i - 2] = eVar;
                    eVar = eVar2;
                    q2 = q;
                    eVar2 = eVar4;
                    q = q3;
                } else if (m4039s(q2, q3)) {
                    eVarArr[i - 2] = eVar;
                    eVar = eVar4;
                    q2 = q3;
                } else {
                    int i2 = i - 1;
                    while (true) {
                        i2--;
                        if (i2 <= 0) {
                            break;
                        }
                        C1348e eVar5 = eVarArr[i2 - 1];
                        if (m4039s(m4037q(eVar5), q3)) {
                            break;
                        }
                        eVarArr[i2] = eVar5;
                    }
                    eVarArr[i2] = eVar4;
                }
            }
            eVarArr[length - 2] = eVar;
            eVarArr[length - 1] = eVar2;
        }
    }

    public int hashCode() {
        int length = this.f4456e.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i += this.f4456e[length].mo5171c().hashCode();
        }
    }

    /* renamed from: i */
    public boolean mo5153i(C1393s sVar) {
        if (!(sVar instanceof C1408x)) {
            return false;
        }
        C1408x xVar = (C1408x) sVar;
        int length = this.f4456e.length;
        if (xVar.f4456e.length != length) {
            return false;
        }
        C1350e1 e1Var = (C1350e1) mo5159o();
        C1350e1 e1Var2 = (C1350e1) xVar.mo5159o();
        for (int i = 0; i < length; i++) {
            C1393s c = e1Var.f4456e[i].mo5171c();
            C1393s c2 = e1Var2.f4456e[i].mo5171c();
            if (c != c2 && !c.mo5153i(c2)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<C1348e> iterator() {
        return new C1625a.C1626a(C1351f.m3840b(this.f4456e));
    }

    /* renamed from: n */
    public boolean mo5156n() {
        return true;
    }

    /* renamed from: o */
    public C1393s mo5159o() {
        C1348e[] eVarArr;
        if (this.f4457f) {
            eVarArr = this.f4456e;
        } else {
            eVarArr = (C1348e[]) this.f4456e.clone();
            m4040t(eVarArr);
        }
        return new C1350e1(true, eVarArr);
    }

    /* renamed from: p */
    public C1393s mo5160p() {
        return new C1383o1(this.f4457f, this.f4456e);
    }

    public String toString() {
        int length = this.f4456e.length;
        if (length == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i = 0;
        while (true) {
            stringBuffer.append(this.f4456e[i]);
            i++;
            if (i >= length) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }
}
