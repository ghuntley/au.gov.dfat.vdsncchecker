package p138w2;

import java.io.Serializable;
import java.util.Objects;
import p000a.C0001b;
import p019c3.C0640p;
import p025d3.C0806j;
import p072l2.C1241e;
import p099q.C1589b;
import p138w2.C2046f;

/* renamed from: w2.c */
public final class C2041c implements C2046f, Serializable {

    /* renamed from: e */
    public final C2046f f5882e;

    /* renamed from: f */
    public final C2046f.C2047a f5883f;

    /* renamed from: w2.c$a */
    public static final class C2042a extends C0806j implements C0640p<String, C2046f.C2047a, String> {

        /* renamed from: f */
        public static final C2042a f5884f = new C2042a();

        public C2042a() {
            super(2);
        }

        /* renamed from: k */
        public Object mo2829k(Object obj, Object obj2) {
            String str = (String) obj;
            C2046f.C2047a aVar = (C2046f.C2047a) obj2;
            C1241e.m3517j(str, "acc");
            C1241e.m3517j(aVar, "element");
            if (str.length() == 0) {
                return aVar.toString();
            }
            return str + ", " + aVar;
        }
    }

    public C2041c(C2046f fVar, C2046f.C2047a aVar) {
        C1241e.m3517j(fVar, "left");
        C1241e.m3517j(aVar, "element");
        this.f5882e = fVar;
        this.f5883f = aVar;
    }

    /* renamed from: b */
    public final int mo6526b() {
        int i = 2;
        C2041c cVar = this;
        while (true) {
            C2046f fVar = cVar.f5882e;
            if (!(fVar instanceof C2041c)) {
                fVar = null;
            }
            cVar = (C2041c) fVar;
            if (cVar == null) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof C2041c)) {
                return false;
            }
            C2041c cVar = (C2041c) obj;
            if (cVar.mo6526b() != mo6526b()) {
                return false;
            }
            Objects.requireNonNull(cVar);
            C2041c cVar2 = this;
            while (true) {
                C2046f.C2047a aVar = cVar2.f5883f;
                if (C1241e.m3513b(cVar.get(aVar.getKey()), aVar)) {
                    C2046f fVar = cVar2.f5882e;
                    if (!(fVar instanceof C2041c)) {
                        Objects.requireNonNull(fVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        C2046f.C2047a aVar2 = (C2046f.C2047a) fVar;
                        z = C1241e.m3513b(cVar.get(aVar2.getKey()), aVar2);
                        break;
                    }
                    cVar2 = (C2041c) fVar;
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r, C0640p<? super R, ? super C2046f.C2047a, ? extends R> pVar) {
        C1241e.m3517j(pVar, "operation");
        return pVar.mo2829k(this.f5882e.fold(r, pVar), this.f5883f);
    }

    public <E extends C2046f.C2047a> E get(C2046f.C2049b<E> bVar) {
        C1241e.m3517j(bVar, "key");
        C2041c cVar = this;
        while (true) {
            E e = cVar.f5883f.get(bVar);
            if (e != null) {
                return e;
            }
            C2046f fVar = cVar.f5882e;
            if (!(fVar instanceof C2041c)) {
                return fVar.get(bVar);
            }
            cVar = (C2041c) fVar;
        }
    }

    public int hashCode() {
        return this.f5883f.hashCode() + this.f5882e.hashCode();
    }

    public C2046f minusKey(C2046f.C2049b<?> bVar) {
        C1241e.m3517j(bVar, "key");
        if (this.f5883f.get(bVar) != null) {
            return this.f5882e;
        }
        C2046f minusKey = this.f5882e.minusKey(bVar);
        return minusKey == this.f5882e ? this : minusKey == C2051h.f5888e ? this.f5883f : new C2041c(minusKey, this.f5883f);
    }

    public C2046f plus(C2046f fVar) {
        C1241e.m3517j(fVar, "context");
        return fVar == C2051h.f5888e ? this : (C2046f) fVar.fold(this, C2050g.f5887f);
    }

    public String toString() {
        return C1589b.m4444a(C0001b.m0a("["), (String) fold("", C2042a.f5884f), "]");
    }
}
