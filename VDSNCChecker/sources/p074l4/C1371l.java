package p074l4;

import java.math.BigInteger;
import java.util.Arrays;
import p000a.C0001b;
import p045h.C0990o;
import p104q4.C1625a;

/* renamed from: l4.l */
public class C1371l extends C1393s {

    /* renamed from: e */
    public final byte[] f4408e;

    /* renamed from: f */
    public final int f4409f;

    public C1371l(BigInteger bigInteger) {
        this.f4408e = bigInteger.toByteArray();
        this.f4409f = 0;
    }

    public C1371l(byte[] bArr, boolean z) {
        if (!m3914s(bArr)) {
            this.f4408e = z ? C1625a.m4534a(bArr) : bArr;
            this.f4409f = m3915t(bArr);
            return;
        }
        throw new IllegalArgumentException("malformed integer");
    }

    /* renamed from: q */
    public static C1371l m3912q(Object obj) {
        if (obj == null || (obj instanceof C1371l)) {
            return (C1371l) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C1371l) C1393s.m3981m((byte[]) obj);
            } catch (Exception e) {
                StringBuilder a = C0001b.m0a("encoding error in getInstance: ");
                a.append(e.toString());
                throw new IllegalArgumentException(a.toString());
            }
        } else {
            StringBuilder a2 = C0001b.m0a("illegal object in getInstance: ");
            a2.append(obj.getClass().getName());
            throw new IllegalArgumentException(a2.toString());
        }
    }

    /* renamed from: r */
    public static C1371l m3913r(C1340b0 b0Var, boolean z) {
        C1393s r = b0Var.mo5163r();
        if (z || (r instanceof C1371l)) {
            return m3912q(r);
        }
        return new C1371l(C1384p.m3959q(r).f4424e, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m3914s(byte[] r5) {
        /*
            int r0 = r5.length
            r1 = 1
            if (r0 == 0) goto L_0x0095
            r2 = 0
            if (r0 == r1) goto L_0x0094
            byte r0 = r5[r2]
            byte r5 = r5[r1]
            int r5 = r5 >> 7
            if (r0 != r5) goto L_0x0092
            java.lang.String r5 = "org.bouncycastle.asn1.allow_unsafe_integer"
            java.lang.ThreadLocal r0 = p104q4.C1629d.f5005a
            q4.b r0 = new q4.b     // Catch:{ AccessControlException -> 0x008e }
            r0.<init>(r5)     // Catch:{ AccessControlException -> 0x008e }
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ AccessControlException -> 0x008e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ AccessControlException -> 0x008e }
            if (r0 == 0) goto L_0x0021
            goto L_0x0040
        L_0x0021:
            java.lang.ThreadLocal r0 = p104q4.C1629d.f5005a     // Catch:{ AccessControlException -> 0x008e }
            java.lang.Object r0 = r0.get()     // Catch:{ AccessControlException -> 0x008e }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ AccessControlException -> 0x008e }
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r0.get(r5)     // Catch:{ AccessControlException -> 0x008e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ AccessControlException -> 0x008e }
            if (r0 == 0) goto L_0x0034
            goto L_0x0040
        L_0x0034:
            q4.c r0 = new q4.c     // Catch:{ AccessControlException -> 0x008e }
            r0.<init>(r5)     // Catch:{ AccessControlException -> 0x008e }
            java.lang.Object r5 = java.security.AccessController.doPrivileged(r0)     // Catch:{ AccessControlException -> 0x008e }
            r0 = r5
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ AccessControlException -> 0x008e }
        L_0x0040:
            if (r0 == 0) goto L_0x008e
            int r5 = r0.length()     // Catch:{ AccessControlException -> 0x008e }
            r3 = 4
            if (r5 == r3) goto L_0x004a
            goto L_0x008e
        L_0x004a:
            char r5 = r0.charAt(r2)     // Catch:{ AccessControlException -> 0x008e }
            r3 = 116(0x74, float:1.63E-43)
            if (r5 == r3) goto L_0x005a
            char r5 = r0.charAt(r2)     // Catch:{ AccessControlException -> 0x008e }
            r3 = 84
            if (r5 != r3) goto L_0x008e
        L_0x005a:
            char r5 = r0.charAt(r1)     // Catch:{ AccessControlException -> 0x008e }
            r3 = 114(0x72, float:1.6E-43)
            if (r5 == r3) goto L_0x006a
            char r5 = r0.charAt(r1)     // Catch:{ AccessControlException -> 0x008e }
            r3 = 82
            if (r5 != r3) goto L_0x008e
        L_0x006a:
            r5 = 2
            char r3 = r0.charAt(r5)     // Catch:{ AccessControlException -> 0x008e }
            r4 = 117(0x75, float:1.64E-43)
            if (r3 == r4) goto L_0x007b
            char r5 = r0.charAt(r5)     // Catch:{ AccessControlException -> 0x008e }
            r3 = 85
            if (r5 != r3) goto L_0x008e
        L_0x007b:
            r5 = 3
            char r3 = r0.charAt(r5)     // Catch:{ AccessControlException -> 0x008e }
            r4 = 101(0x65, float:1.42E-43)
            if (r3 == r4) goto L_0x008c
            char r5 = r0.charAt(r5)     // Catch:{ AccessControlException -> 0x008e }
            r0 = 69
            if (r5 != r0) goto L_0x008e
        L_0x008c:
            r5 = r1
            goto L_0x008f
        L_0x008e:
            r5 = r2
        L_0x008f:
            if (r5 != 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r1 = r2
        L_0x0093:
            return r1
        L_0x0094:
            return r2
        L_0x0095:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p074l4.C1371l.m3914s(byte[]):boolean");
    }

    /* renamed from: t */
    public static int m3915t(byte[] bArr) {
        int length = bArr.length - 1;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (bArr[i] != (bArr[i2] >> 7)) {
                break;
            }
            i = i2;
        }
        return i;
    }

    public int hashCode() {
        return C1625a.m4536c(this.f4408e);
    }

    /* renamed from: i */
    public boolean mo5153i(C1393s sVar) {
        if (!(sVar instanceof C1371l)) {
            return false;
        }
        return Arrays.equals(this.f4408e, ((C1371l) sVar).f4408e);
    }

    /* renamed from: j */
    public void mo5154j(C0990o oVar, boolean z) {
        oVar.mo4394h(z, 2, this.f4408e);
    }

    /* renamed from: k */
    public int mo5155k() {
        return C1405v1.m4029a(this.f4408e.length) + 1 + this.f4408e.length;
    }

    /* renamed from: n */
    public boolean mo5156n() {
        return false;
    }

    public String toString() {
        return new BigInteger(this.f4408e).toString();
    }
}
