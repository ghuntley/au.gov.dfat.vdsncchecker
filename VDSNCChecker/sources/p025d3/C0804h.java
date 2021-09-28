package p025d3;

import java.util.Objects;
import p000a.C0001b;
import p055i3.C1034a;
import p055i3.C1037d;
import p072l2.C1241e;
import p077m1.C1428c;
import p099q.C1589b;

/* renamed from: d3.h */
public class C0804h extends C0798b implements C0803g, C1037d {

    /* renamed from: k */
    public final int f3114k;

    /* renamed from: l */
    public final int f3115l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0804h(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f3114k = i;
        this.f3115l = i2 >> 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0804h) {
            C0804h hVar = (C0804h) obj;
            if (!C1241e.m3513b(mo4035a(), hVar.mo4035a()) || !this.f3107h.equals(hVar.f3107h) || !this.f3108i.equals(hVar.f3108i) || this.f3115l != hVar.f3115l || this.f3114k != hVar.f3114k || !C1241e.m3513b(this.f3105f, hVar.f3105f)) {
                return false;
            }
            return true;
        } else if (!(obj instanceof C1037d)) {
            return false;
        } else {
            C1034a aVar = this.f3104e;
            if (aVar == null) {
                Objects.requireNonNull(C0810n.f3120a);
                this.f3104e = this;
                aVar = this;
            }
            return obj.equals(aVar);
        }
    }

    /* renamed from: f */
    public int mo4041f() {
        return this.f3114k;
    }

    public int hashCode() {
        return this.f3108i.hashCode() + C1428c.m4090a(this.f3107h, mo4035a() == null ? 0 : mo4035a().hashCode() * 31, 31);
    }

    public String toString() {
        C1034a aVar = this.f3104e;
        if (aVar == null) {
            Objects.requireNonNull(C0810n.f3120a);
            this.f3104e = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        if ("<init>".equals(this.f3107h)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return C1589b.m4444a(C0001b.m0a("function "), this.f3107h, " (Kotlin reflection is not available)");
    }
}
