package p114s2;

import java.io.IOException;
import p000a.C0001b;
import p025d3.C0802f;
import p072l2.C1241e;
import p139w3.C2103w;

/* renamed from: s2.d */
public abstract class C1713d<T, U> {

    /* renamed from: s2.d$a */
    public static final class C1714a extends C1713d {

        /* renamed from: a */
        public final IOException f5287a;

        public C1714a(IOException iOException) {
            super((C0802f) null);
            this.f5287a = iOException;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1714a) && C1241e.m3513b(this.f5287a, ((C1714a) obj).f5287a);
        }

        public int hashCode() {
            return this.f5287a.hashCode();
        }

        public String toString() {
            StringBuilder a = C0001b.m0a("NetworkError(error=");
            a.append(this.f5287a);
            a.append(')');
            return a.toString();
        }
    }

    /* renamed from: s2.d$b */
    public static final class C1715b<U> extends C1713d {

        /* renamed from: a */
        public final U f5288a;

        /* renamed from: b */
        public final int f5289b;

        /* renamed from: c */
        public final C2103w f5290c;

        public C1715b(U u, int i, C2103w wVar) {
            super((C0802f) null);
            this.f5288a = u;
            this.f5289b = i;
            this.f5290c = wVar;
            new IOException("Network server error: " + i + " \n" + u);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1715b)) {
                return false;
            }
            C1715b bVar = (C1715b) obj;
            return C1241e.m3513b(this.f5288a, bVar.f5288a) && this.f5289b == bVar.f5289b && C1241e.m3513b(this.f5290c, bVar.f5290c);
        }

        public int hashCode() {
            U u = this.f5288a;
            int i = 0;
            int hashCode = (Integer.hashCode(this.f5289b) + ((u == null ? 0 : u.hashCode()) * 31)) * 31;
            C2103w wVar = this.f5290c;
            if (wVar != null) {
                i = wVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder a = C0001b.m0a("ServerError(body=");
            a.append(this.f5288a);
            a.append(", code=");
            a.append(this.f5289b);
            a.append(", headers=");
            a.append(this.f5290c);
            a.append(')');
            return a.toString();
        }
    }

    /* renamed from: s2.d$c */
    public static final class C1716c<T> extends C1713d {

        /* renamed from: a */
        public final T f5291a;

        /* renamed from: b */
        public final C2103w f5292b;

        /* renamed from: c */
        public final int f5293c;

        public C1716c(T t, C2103w wVar, int i) {
            super((C0802f) null);
            this.f5291a = t;
            this.f5292b = wVar;
            this.f5293c = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1716c)) {
                return false;
            }
            C1716c cVar = (C1716c) obj;
            return C1241e.m3513b(this.f5291a, cVar.f5291a) && C1241e.m3513b(this.f5292b, cVar.f5292b) && this.f5293c == cVar.f5293c;
        }

        public int hashCode() {
            int hashCode = this.f5291a.hashCode() * 31;
            C2103w wVar = this.f5292b;
            return Integer.hashCode(this.f5293c) + ((hashCode + (wVar == null ? 0 : wVar.hashCode())) * 31);
        }

        public String toString() {
            StringBuilder a = C0001b.m0a("Success(body=");
            a.append(this.f5291a);
            a.append(", headers=");
            a.append(this.f5292b);
            a.append(", code=");
            a.append(this.f5293c);
            a.append(')');
            return a.toString();
        }
    }

    /* renamed from: s2.d$d */
    public static final class C1717d extends C1713d {

        /* renamed from: a */
        public final Throwable f5294a;

        /* renamed from: b */
        public final Integer f5295b;

        /* renamed from: c */
        public final C2103w f5296c;

        public C1717d(Throwable th, Integer num, C2103w wVar) {
            super((C0802f) null);
            this.f5294a = th;
            this.f5295b = num;
            this.f5296c = wVar;
        }

        public C1717d(Throwable th, Integer num, C2103w wVar, int i) {
            super((C0802f) null);
            this.f5294a = th;
            this.f5295b = null;
            this.f5296c = null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1717d)) {
                return false;
            }
            C1717d dVar = (C1717d) obj;
            return C1241e.m3513b(this.f5294a, dVar.f5294a) && C1241e.m3513b(this.f5295b, dVar.f5295b) && C1241e.m3513b(this.f5296c, dVar.f5296c);
        }

        public int hashCode() {
            int hashCode = this.f5294a.hashCode() * 31;
            Integer num = this.f5295b;
            int i = 0;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            C2103w wVar = this.f5296c;
            if (wVar != null) {
                i = wVar.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder a = C0001b.m0a("UnknownError(error=");
            a.append(this.f5294a);
            a.append(", code=");
            a.append(this.f5295b);
            a.append(", headers=");
            a.append(this.f5296c);
            a.append(')');
            return a.toString();
        }
    }

    public C1713d() {
    }

    public C1713d(C0802f fVar) {
    }
}
