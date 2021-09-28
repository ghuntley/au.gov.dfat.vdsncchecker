package p058j0;

import java.util.Objects;
import p000a.C0001b;

/* renamed from: j0.d */
public final class C1049d {

    /* renamed from: a */
    public final Object f3793a;

    public C1049d(Object obj) {
        this.f3793a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1049d.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f3793a, ((C1049d) obj).f3793a);
    }

    public int hashCode() {
        Object obj = this.f3793a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("DisplayCutoutCompat{");
        a.append(this.f3793a);
        a.append("}");
        return a.toString();
    }
}
