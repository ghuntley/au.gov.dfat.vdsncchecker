package p074l4;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Objects;
import p045h.C0990o;
import p074l4.C1399u;

/* renamed from: l4.t1 */
public class C1398t1 extends C1399u {

    /* renamed from: f */
    public byte[] f4445f;

    public C1398t1(byte[] bArr) {
        this.f4445f = bArr;
    }

    public synchronized int hashCode() {
        mo5231u();
        return super.hashCode();
    }

    public synchronized Iterator<C1348e> iterator() {
        mo5231u();
        return super.iterator();
    }

    /* renamed from: j */
    public synchronized void mo5154j(C0990o oVar, boolean z) {
        byte[] bArr = this.f4445f;
        if (bArr != null) {
            oVar.mo4394h(z, 48, bArr);
        } else {
            super.mo5160p().mo5154j(oVar, z);
        }
    }

    /* renamed from: k */
    public synchronized int mo5155k() {
        byte[] bArr = this.f4445f;
        if (bArr != null) {
            return C1405v1.m4029a(bArr.length) + 1 + this.f4445f.length;
        }
        return super.mo5160p().mo5155k();
    }

    /* renamed from: o */
    public synchronized C1393s mo5159o() {
        mo5231u();
        return super.mo5159o();
    }

    /* renamed from: p */
    public synchronized C1393s mo5160p() {
        mo5231u();
        return super.mo5160p();
    }

    /* renamed from: s */
    public synchronized C1348e mo5228s(int i) {
        mo5231u();
        return this.f4446e[i];
    }

    public synchronized int size() {
        mo5231u();
        return this.f4446e.length;
    }

    /* renamed from: t */
    public synchronized Enumeration mo5230t() {
        byte[] bArr = this.f4445f;
        if (bArr != null) {
            return new C1395s1(bArr);
        }
        return new C1399u.C1400a();
    }

    /* renamed from: u */
    public final void mo5231u() {
        byte[] bArr = this.f4445f;
        if (bArr != null) {
            C1348e[] eVarArr = new C1348e[10];
            C1395s1 s1Var = new C1395s1(bArr);
            int i = 0;
            while (s1Var.hasMoreElements()) {
                C1393s sVar = (C1393s) s1Var.nextElement();
                Objects.requireNonNull(sVar, "'element' cannot be null");
                int i2 = i + 1;
                if ((i2 > eVarArr.length) || false) {
                    C1348e[] eVarArr2 = new C1348e[Math.max(eVarArr.length, (i2 >> 1) + i2)];
                    System.arraycopy(eVarArr, 0, eVarArr2, 0, i);
                    eVarArr = eVarArr2;
                }
                eVarArr[i] = sVar;
                i = i2;
            }
            if (i == 0) {
                eVarArr = C1351f.f4373d;
            } else if (eVarArr.length != i) {
                C1348e[] eVarArr3 = new C1348e[i];
                System.arraycopy(eVarArr, 0, eVarArr3, 0, i);
                eVarArr = eVarArr3;
            }
            this.f4446e = eVarArr;
            this.f4445f = null;
        }
    }
}
