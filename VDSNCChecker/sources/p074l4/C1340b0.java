package p074l4;

import java.io.IOException;
import java.util.Objects;
import p000a.C0001b;

/* renamed from: l4.b0 */
public abstract class C1340b0 extends C1393s implements C1389q1 {

    /* renamed from: e */
    public final int f4358e;

    /* renamed from: f */
    public final boolean f4359f;

    /* renamed from: g */
    public final C1348e f4360g;

    public C1340b0(boolean z, int i, C1348e eVar) {
        Objects.requireNonNull(eVar, "'obj' cannot be null");
        this.f4358e = i;
        this.f4359f = z || (eVar instanceof C1345d);
        this.f4360g = eVar;
    }

    /* renamed from: q */
    public static C1340b0 m3801q(Object obj) {
        if (obj == null || (obj instanceof C1340b0)) {
            return (C1340b0) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return m3801q(C1393s.m3981m((byte[]) obj));
            } catch (IOException e) {
                StringBuilder a = C0001b.m0a("failed to construct tagged object from byte[]: ");
                a.append(e.getMessage());
                throw new IllegalArgumentException(a.toString());
            }
        } else {
            StringBuilder a2 = C0001b.m0a("unknown object in getInstance: ");
            a2.append(obj.getClass().getName());
            throw new IllegalArgumentException(a2.toString());
        }
    }

    /* renamed from: a */
    public C1393s mo5162a() {
        return this;
    }

    public int hashCode() {
        return (this.f4358e ^ (this.f4359f ? 15 : 240)) ^ this.f4360g.mo5171c().hashCode();
    }

    /* renamed from: i */
    public boolean mo5153i(C1393s sVar) {
        if (!(sVar instanceof C1340b0)) {
            return false;
        }
        C1340b0 b0Var = (C1340b0) sVar;
        if (this.f4358e != b0Var.f4358e || this.f4359f != b0Var.f4359f) {
            return false;
        }
        C1393s c = this.f4360g.mo5171c();
        C1393s c2 = b0Var.f4360g.mo5171c();
        return c == c2 || c.mo5153i(c2);
    }

    /* renamed from: o */
    public C1393s mo5159o() {
        return new C1358g1(this.f4359f, this.f4358e, this.f4360g, 0);
    }

    /* renamed from: p */
    public C1393s mo5160p() {
        return new C1358g1(this.f4359f, this.f4358e, this.f4360g, 1);
    }

    /* renamed from: r */
    public C1393s mo5163r() {
        return this.f4360g.mo5171c();
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("[");
        a.append(this.f4358e);
        a.append("]");
        a.append(this.f4360g);
        return a.toString();
    }
}
