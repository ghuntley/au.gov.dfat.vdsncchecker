package p120t2;

import java.io.Serializable;
import p000a.C0001b;
import p072l2.C1241e;

/* renamed from: t2.f */
public final class C1792f<T> implements Serializable {

    /* renamed from: t2.f$a */
    public static final class C1793a implements Serializable {

        /* renamed from: e */
        public final Throwable f5441e;

        public C1793a(Throwable th) {
            this.f5441e = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C1793a) && C1241e.m3513b(this.f5441e, ((C1793a) obj).f5441e);
        }

        public int hashCode() {
            return this.f5441e.hashCode();
        }

        public String toString() {
            StringBuilder a = C0001b.m0a("Failure(");
            a.append(this.f5441e);
            a.append(')');
            return a.toString();
        }
    }

    /* renamed from: a */
    public static final Throwable m4971a(Object obj) {
        if (obj instanceof C1793a) {
            return ((C1793a) obj).f5441e;
        }
        return null;
    }
}
