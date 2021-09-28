package p127u3;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p019c3.C0625a;
import p025d3.C0805i;
import p027e.C0856d;
import p072l2.C1241e;
import p073l3.C1320u;
import p097p3.C1581c;
import p103q3.C1615c;
import p121t3.C1799a;
import p121t3.C1806g;
import p126u2.C1853n;
import p126u2.C1857r;
import p127u3.C1860c;

/* renamed from: u3.f */
public final class C1864f {

    /* renamed from: a */
    public static final C1860c.C1861a<Map<String, Integer>> f5555a = new C1860c.C1861a<>();

    /* renamed from: u3.f$a */
    public /* synthetic */ class C1865a extends C0805i implements C0625a<Map<String, ? extends Integer>> {
        public C1865a(C1615c cVar) {
            super(0, cVar, C1864f.class, "buildAlternativeNamesMap", "buildAlternativeNamesMap(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Map;", 1);
        }

        /* renamed from: b */
        public Object mo40b() {
            return C1864f.m5097a((C1615c) this.f3105f);
        }
    }

    /* renamed from: a */
    public static final Map<String, Integer> m5097a(C1615c cVar) {
        String[] names;
        C1241e.m3517j(cVar, "<this>");
        int j = cVar.mo5767j();
        ConcurrentHashMap concurrentHashMap = null;
        if (j > 0) {
            ConcurrentHashMap concurrentHashMap2 = null;
            int i = 0;
            while (true) {
                int i2 = i + 1;
                List<Annotation> g = cVar.mo5763g(i);
                ArrayList arrayList = new ArrayList();
                for (T next : g) {
                    if (next instanceof C1806g) {
                        arrayList.add(next);
                    }
                }
                C1241e.m3517j(arrayList, "$this$singleOrNull");
                C1806g gVar = (C1806g) (arrayList.size() == 1 ? arrayList.get(0) : null);
                if (!(gVar == null || (names = gVar.names()) == null)) {
                    int length = names.length;
                    int i3 = 0;
                    while (i3 < length) {
                        String str = names[i3];
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap(cVar.mo5767j());
                        }
                        if (!concurrentHashMap2.containsKey(str)) {
                            concurrentHashMap2.put(str, Integer.valueOf(i));
                            i3++;
                        } else {
                            StringBuilder a = C0856d.m2530a("The suggested name '", str, "' for property ");
                            a.append(cVar.mo5757a(i));
                            a.append(" is already one of the names for property ");
                            a.append(cVar.mo5757a(((Number) C1857r.m5060H(concurrentHashMap2, str)).intValue()));
                            a.append(" in ");
                            a.append(cVar);
                            throw new C1581c(a.toString(), 2);
                        }
                    }
                }
                if (i2 >= j) {
                    concurrentHashMap = concurrentHashMap2;
                    break;
                }
                i = i2;
            }
        }
        return concurrentHashMap == null ? C1853n.f5543e : concurrentHashMap;
    }

    /* renamed from: b */
    public static final int m5098b(C1615c cVar, C1799a aVar, String str) {
        C1241e.m3517j(cVar, "<this>");
        C1241e.m3517j(aVar, "json");
        C1241e.m3517j(str, "name");
        int c = cVar.mo5759c(str);
        if (c != -3 || !aVar.f5448a.f5462k) {
            return c;
        }
        Integer num = (Integer) ((Map) C1320u.m3711o(aVar).mo6375b(cVar, f5555a, new C1865a(cVar))).get(str);
        if (num == null) {
            return -3;
        }
        return num.intValue();
    }
}
