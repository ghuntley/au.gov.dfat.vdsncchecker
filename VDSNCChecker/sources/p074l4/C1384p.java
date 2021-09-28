package p074l4;

import androidx.appcompat.widget.C0231z;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Objects;
import p000a.C0001b;
import p104q4.C1625a;
import p104q4.C1630e;
import p110r4.C1688a;

/* renamed from: l4.p */
public abstract class C1384p extends C1393s implements C1387q {

    /* renamed from: e */
    public byte[] f4424e;

    public C1384p(byte[] bArr) {
        Objects.requireNonNull(bArr, "'string' cannot be null");
        this.f4424e = bArr;
    }

    /* renamed from: q */
    public static C1384p m3959q(Object obj) {
        if (obj == null || (obj instanceof C1384p)) {
            return (C1384p) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return m3959q(C1393s.m3981m((byte[]) obj));
            } catch (IOException e) {
                StringBuilder a = C0001b.m0a("failed to construct OCTET STRING from byte[]: ");
                a.append(e.getMessage());
                throw new IllegalArgumentException(a.toString());
            }
        } else {
            if (obj instanceof C1348e) {
                C1393s c = ((C1348e) obj).mo5171c();
                if (c instanceof C1384p) {
                    return (C1384p) c;
                }
            }
            StringBuilder a2 = C0001b.m0a("illegal object in getInstance: ");
            a2.append(obj.getClass().getName());
            throw new IllegalArgumentException(a2.toString());
        }
    }

    /* renamed from: r */
    public static C1384p m3960r(C1340b0 b0Var, boolean z) {
        if (!z) {
            C1393s r = b0Var.mo5163r();
            if (b0Var.f4359f) {
                C1384p q = m3959q(r);
                if (b0Var instanceof C1378n0) {
                    return new C1355g0(new C1384p[]{q});
                }
                return (C1384p) new C1355g0(new C1384p[]{q}).mo5160p();
            } else if (r instanceof C1384p) {
                C1384p pVar = (C1384p) r;
                return b0Var instanceof C1378n0 ? pVar : (C1384p) pVar.mo5160p();
            } else if (r instanceof C1399u) {
                C1399u uVar = (C1399u) r;
                return b0Var instanceof C1378n0 ? C1355g0.m3853s(uVar) : (C1384p) C1355g0.m3853s(uVar).mo5160p();
            } else {
                StringBuilder a = C0001b.m0a("unknown object in getInstance: ");
                a.append(b0Var.getClass().getName());
                throw new IllegalArgumentException(a.toString());
            }
        } else if (b0Var.f4359f) {
            return m3959q(b0Var.mo5163r());
        } else {
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
    }

    /* renamed from: a */
    public C1393s mo5162a() {
        return this;
    }

    /* renamed from: b */
    public InputStream mo5183b() {
        return new ByteArrayInputStream(this.f4424e);
    }

    public int hashCode() {
        return C1625a.m4536c(this.f4424e);
    }

    /* renamed from: i */
    public boolean mo5153i(C1393s sVar) {
        if (!(sVar instanceof C1384p)) {
            return false;
        }
        return Arrays.equals(this.f4424e, ((C1384p) sVar).f4424e);
    }

    /* renamed from: o */
    public C1393s mo5159o() {
        return new C1338a1(this.f4424e);
    }

    /* renamed from: p */
    public C1393s mo5160p() {
        return new C1338a1(this.f4424e);
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("#");
        byte[] bArr = this.f4424e;
        C0231z zVar = C1688a.f5127a;
        a.append(C1630e.m4537a(C1688a.m4677a(bArr, 0, bArr.length)));
        return a.toString();
    }
}
