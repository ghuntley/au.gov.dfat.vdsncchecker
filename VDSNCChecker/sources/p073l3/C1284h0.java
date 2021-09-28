package p073l3;

import p000a.C0001b;

/* renamed from: l3.h0 */
public final class C1284h0 implements C1309p0 {

    /* renamed from: e */
    public final boolean f4289e;

    public C1284h0(boolean z) {
        this.f4289e = z;
    }

    /* renamed from: a */
    public boolean mo5024a() {
        return this.f4289e;
    }

    /* renamed from: e */
    public C1267b1 mo5025e() {
        return null;
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("Empty{");
        a.append(this.f4289e ? "Active" : "New");
        a.append('}');
        return a.toString();
    }
}
