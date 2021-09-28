package p073l3;

import p025d3.C0802f;
import p072l2.C1241e;
import p085n3.C1461d;
import p138w2.C2039a;
import p138w2.C2040b;
import p138w2.C2043d;
import p138w2.C2044e;
import p138w2.C2046f;

/* renamed from: l3.x */
public abstract class C1326x extends C2039a implements C2044e {

    /* renamed from: e */
    public static final C1327a f4334e = new C1327a((C0802f) null);

    /* renamed from: l3.x$a */
    public static final class C1327a extends C2040b<C2044e, C1326x> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1327a(C0802f fVar) {
            super(C2044e.C2045a.f5886e, C1324w.f4332f);
            int i = C2044e.f5885d;
        }
    }

    public C1326x() {
        super(C2044e.C2045a.f5886e);
    }

    /* renamed from: A */
    public final <T> C2043d<T> mo5117A(C2043d<? super T> dVar) {
        return new C1461d(this, dVar);
    }

    /* renamed from: R */
    public abstract void mo5067R(C2046f fVar, Runnable runnable);

    /* renamed from: S */
    public boolean mo5118S(C2046f fVar) {
        return !(this instanceof C1293j1);
    }

    public <E extends C2046f.C2047a> E get(C2046f.C2049b<E> bVar) {
        C1241e.m3517j(bVar, "key");
        if (bVar instanceof C2040b) {
            C2040b bVar2 = (C2040b) bVar;
            C2046f.C2049b<?> key = getKey();
            C1241e.m3517j(key, "key");
            if (!(key == bVar2 || bVar2.f5880e == key)) {
                return null;
            }
            C1241e.m3517j(this, "element");
            E e = (C2046f.C2047a) bVar2.f5881f.mo2828m(this);
            if (!(e instanceof C2046f.C2047a)) {
                return null;
            }
            return e;
        } else if (C2044e.C2045a.f5886e == bVar) {
            return this;
        } else {
            return null;
        }
    }

    /* renamed from: h */
    public void mo5119h(C2043d<?> dVar) {
        ((C1461d) dVar).mo5323l();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r3.mo6525a(r2) != null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (p138w2.C2044e.C2045a.f5886e == r3) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p138w2.C2046f minusKey(p138w2.C2046f.C2049b<?> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            p072l2.C1241e.m3517j(r3, r0)
            boolean r1 = r3 instanceof p138w2.C2040b
            if (r1 == 0) goto L_0x0029
            w2.b r3 = (p138w2.C2040b) r3
            w2.f$b r1 = r2.getKey()
            p072l2.C1241e.m3517j(r1, r0)
            if (r1 == r3) goto L_0x001b
            w2.f$b<?> r0 = r3.f5880e
            if (r0 != r1) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r0 = 0
            goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            if (r0 == 0) goto L_0x0027
            w2.f$a r3 = r3.mo6525a(r2)
            if (r3 == 0) goto L_0x0027
        L_0x0024:
            w2.h r3 = p138w2.C2051h.f5888e
            goto L_0x002e
        L_0x0027:
            r3 = r2
            goto L_0x002e
        L_0x0029:
            w2.e$a r0 = p138w2.C2044e.C2045a.f5886e
            if (r0 != r3) goto L_0x0027
            goto L_0x0024
        L_0x002e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p073l3.C1326x.minusKey(w2.f$b):w2.f");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + C1320u.m3710n(this);
    }
}
