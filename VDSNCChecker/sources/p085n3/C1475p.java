package p085n3;

import java.util.Objects;
import kotlinx.coroutines.ThreadContextElement;
import p019c3.C0640p;
import p025d3.C0806j;
import p045h.C0990o;
import p072l2.C1241e;
import p073l3.C1285h1;
import p138w2.C2046f;

/* renamed from: n3.p */
public final class C1475p {

    /* renamed from: a */
    public static final C0990o f4620a = new C0990o("NO_THREAD_ELEMENTS");

    /* renamed from: n3.p$a */
    public static final class C1476a extends C0806j implements C0640p<Object, C2046f.C2047a, Object> {

        /* renamed from: f */
        public static final C1476a f4621f = new C1476a();

        public C1476a() {
            super(2);
        }

        /* renamed from: k */
        public Object mo2829k(Object obj, Object obj2) {
            C2046f.C2047a aVar = (C2046f.C2047a) obj2;
            if (!(aVar instanceof C1285h1)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num == null ? 1 : num.intValue();
            return intValue == 0 ? aVar : Integer.valueOf(intValue + 1);
        }
    }

    /* renamed from: n3.p$b */
    public static final class C1477b extends C0806j implements C0640p<C1285h1<?>, C2046f.C2047a, C1285h1<?>> {

        /* renamed from: f */
        public static final C1477b f4622f = new C1477b();

        public C1477b() {
            super(2);
        }

        /* renamed from: k */
        public Object mo2829k(Object obj, Object obj2) {
            C1285h1 h1Var = (C1285h1) obj;
            C2046f.C2047a aVar = (C2046f.C2047a) obj2;
            if (h1Var != null) {
                return h1Var;
            }
            if (aVar instanceof C1285h1) {
                return (C1285h1) aVar;
            }
            return null;
        }
    }

    /* renamed from: n3.p$c */
    public static final class C1478c extends C0806j implements C0640p<C1481s, C2046f.C2047a, C1481s> {

        /* renamed from: f */
        public static final C1478c f4623f = new C1478c();

        public C1478c() {
            super(2);
        }

        /* renamed from: k */
        public Object mo2829k(Object obj, Object obj2) {
            C1481s sVar = (C1481s) obj;
            ThreadContextElement<Object> threadContextElement = (C2046f.C2047a) obj2;
            if (threadContextElement instanceof C1285h1) {
                ThreadContextElement<Object> threadContextElement2 = (C1285h1) threadContextElement;
                Object K = threadContextElement2.mo5058K(sVar.f4625a);
                Object[] objArr = sVar.f4626b;
                int i = sVar.f4628d;
                objArr[i] = K;
                ThreadContextElement<Object>[] threadContextElementArr = sVar.f4627c;
                sVar.f4628d = i + 1;
                threadContextElementArr[i] = threadContextElement2;
            }
            return sVar;
        }
    }

    /* renamed from: a */
    public static final void m4156a(C2046f fVar, Object obj) {
        if (obj != f4620a) {
            if (obj instanceof C1481s) {
                C1481s sVar = (C1481s) obj;
                int length = sVar.f4627c.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i = length - 1;
                        C1285h1 h1Var = sVar.f4627c[length];
                        C1241e.m3515e(h1Var);
                        h1Var.mo5059i(fVar, sVar.f4626b[length]);
                        if (i >= 0) {
                            length = i;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                Object fold = fVar.fold(null, C1477b.f4622f);
                Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
                ((C1285h1) fold).mo5059i(fVar, obj);
            }
        }
    }

    /* renamed from: b */
    public static final Object m4157b(C2046f fVar, Object obj) {
        if (obj == null) {
            obj = fVar.fold(0, C1476a.f4621f);
            C1241e.m3515e(obj);
        }
        if (obj == 0) {
            return f4620a;
        }
        return obj instanceof Integer ? fVar.fold(new C1481s(fVar, ((Number) obj).intValue()), C1478c.f4623f) : ((C1285h1) obj).mo5058K(fVar);
    }
}
