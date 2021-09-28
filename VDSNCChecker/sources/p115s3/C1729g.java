package p115s3;

import java.util.ArrayList;
import p025d3.C0802f;
import p072l2.C1241e;
import p097p3.C1580b;
import p109r3.C1685b;
import p109r3.C1687c;

/* renamed from: s3.g */
public abstract class C1729g<Element, Collection, Builder> implements C1580b {

    /* renamed from: a */
    public final C1580b<Element> f5307a;

    public C1729g(C1580b bVar, C0802f fVar) {
        this.f5307a = bVar;
    }

    /* renamed from: d */
    public Object mo2494d(C1687c cVar) {
        C1241e.m3517j(cVar, "decoder");
        C1241e.m3517j(cVar, "decoder");
        ArrayList arrayList = new ArrayList();
        C1241e.m3517j(arrayList, "<this>");
        int size = arrayList.size();
        C1724c cVar2 = (C1724c) this;
        C1685b e = cVar.mo5886e(cVar2.f5304b);
        if (e.mo5880o()) {
            int f = mo5990f(e, arrayList);
            C1241e.m3517j(e, "decoder");
            int i = 0;
            if (!(f >= 0)) {
                throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
            } else if (f > 0) {
                while (true) {
                    int i2 = i + 1;
                    mo5989e(e, i + size, arrayList);
                    if (i2 >= f) {
                        break;
                    }
                    i = i2;
                }
            }
        } else {
            while (true) {
                int n = e.mo5885n(cVar2.f5304b);
                if (n == -1) {
                    break;
                }
                mo5989e(e, n + size, arrayList);
            }
        }
        e.mo5884l(cVar2.f5304b);
        C1241e.m3517j(arrayList, "<this>");
        return arrayList;
    }

    /* renamed from: e */
    public void mo5989e(C1685b bVar, int i, Object obj) {
        C1241e.m3517j(bVar, "decoder");
        Object a = bVar.mo5874b(((C1724c) this).f5304b, i, this.f5307a, null);
        ArrayList arrayList = (ArrayList) obj;
        C1241e.m3517j(arrayList, "<this>");
        arrayList.add(i, a);
    }

    /* renamed from: f */
    public final int mo5990f(C1685b bVar, Object obj) {
        int g = bVar.mo5878g(((C1724c) this).f5304b);
        ((ArrayList) obj).ensureCapacity(g);
        return g;
    }
}
