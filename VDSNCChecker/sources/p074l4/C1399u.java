package p074l4;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import p000a.C0001b;
import p104q4.C1625a;

/* renamed from: l4.u */
public abstract class C1399u extends C1393s implements Iterable {

    /* renamed from: e */
    public C1348e[] f4446e;

    /* renamed from: l4.u$a */
    public class C1400a implements Enumeration {

        /* renamed from: a */
        public int f4447a = 0;

        public C1400a() {
        }

        public boolean hasMoreElements() {
            return this.f4447a < C1399u.this.f4446e.length;
        }

        public Object nextElement() {
            int i = this.f4447a;
            C1348e[] eVarArr = C1399u.this.f4446e;
            if (i < eVarArr.length) {
                this.f4447a = i + 1;
                return eVarArr[i];
            }
            throw new NoSuchElementException();
        }
    }

    public C1399u() {
        this.f4446e = C1351f.f4373d;
    }

    public C1399u(C1348e eVar) {
        Objects.requireNonNull(eVar, "'element' cannot be null");
        this.f4446e = new C1348e[]{eVar};
    }

    public C1399u(C1351f fVar) {
        Objects.requireNonNull(fVar, "'elementVector' cannot be null");
        this.f4446e = fVar.mo5175d();
    }

    public C1399u(C1348e[] eVarArr) {
        boolean z;
        if (eVarArr != null) {
            int length = eVarArr.length;
            z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (eVarArr[i] == null) {
                    break;
                } else {
                    i++;
                }
            }
        }
        z = true;
        if (!z) {
            this.f4446e = C1351f.m3840b(eVarArr);
            return;
        }
        throw new NullPointerException("'elements' cannot be null, or contain null");
    }

    public C1399u(C1348e[] eVarArr, boolean z) {
        this.f4446e = z ? C1351f.m3840b(eVarArr) : eVarArr;
    }

    /* renamed from: q */
    public static C1399u m4010q(Object obj) {
        if (obj == null || (obj instanceof C1399u)) {
            return (C1399u) obj;
        }
        if (obj instanceof C1403v) {
            return m4010q(((C1403v) obj).mo5171c());
        }
        if (obj instanceof byte[]) {
            try {
                return m4010q(C1393s.m3981m((byte[]) obj));
            } catch (IOException e) {
                StringBuilder a = C0001b.m0a("failed to construct sequence from byte[]: ");
                a.append(e.getMessage());
                throw new IllegalArgumentException(a.toString());
            }
        } else {
            if (obj instanceof C1348e) {
                C1393s c = ((C1348e) obj).mo5171c();
                if (c instanceof C1399u) {
                    return (C1399u) c;
                }
            }
            StringBuilder a2 = C0001b.m0a("unknown object in getInstance: ");
            a2.append(obj.getClass().getName());
            throw new IllegalArgumentException(a2.toString());
        }
    }

    /* renamed from: r */
    public static C1399u m4011r(C1340b0 b0Var, boolean z) {
        if (!z) {
            C1393s r = b0Var.mo5163r();
            if (b0Var.f4359f) {
                return b0Var instanceof C1378n0 ? new C1366j0((C1348e) r) : new C1379n1((C1348e) r);
            }
            if (r instanceof C1399u) {
                C1399u uVar = (C1399u) r;
                return b0Var instanceof C1378n0 ? uVar : (C1399u) uVar.mo5160p();
            }
            StringBuilder a = C0001b.m0a("unknown object in getInstance: ");
            a.append(b0Var.getClass().getName());
            throw new IllegalArgumentException(a.toString());
        } else if (b0Var.f4359f) {
            return m4010q(b0Var.mo5163r());
        } else {
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
    }

    public int hashCode() {
        int length = this.f4446e.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ this.f4446e[length].mo5171c().hashCode();
        }
    }

    /* renamed from: i */
    public boolean mo5153i(C1393s sVar) {
        if (!(sVar instanceof C1399u)) {
            return false;
        }
        C1399u uVar = (C1399u) sVar;
        int size = size();
        if (uVar.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            C1393s c = this.f4446e[i].mo5171c();
            C1393s c2 = uVar.f4446e[i].mo5171c();
            if (c != c2 && !c.mo5153i(c2)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<C1348e> iterator() {
        return new C1625a.C1626a(this.f4446e);
    }

    /* renamed from: n */
    public boolean mo5156n() {
        return true;
    }

    /* renamed from: o */
    public C1393s mo5159o() {
        return new C1347d1(this.f4446e, false);
    }

    /* renamed from: p */
    public C1393s mo5160p() {
        return new C1379n1(this.f4446e, false);
    }

    /* renamed from: s */
    public C1348e mo5228s(int i) {
        return this.f4446e[i];
    }

    public int size() {
        return this.f4446e.length;
    }

    /* renamed from: t */
    public Enumeration mo5230t() {
        return new C1400a();
    }

    public String toString() {
        int size = size();
        if (size == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i = 0;
        while (true) {
            stringBuffer.append(this.f4446e[i]);
            i++;
            if (i >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }
}
