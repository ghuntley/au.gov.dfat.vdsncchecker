package p117t;

import java.util.ArrayList;

/* renamed from: t.n */
public class C1761n {

    /* renamed from: c */
    public static int f5387c;

    /* renamed from: a */
    public C1765q f5388a = null;

    /* renamed from: b */
    public ArrayList<C1765q> f5389b = new ArrayList<>();

    public C1761n(C1765q qVar, int i) {
        f5387c++;
        this.f5388a = qVar;
    }

    /* renamed from: a */
    public final long mo6035a(C1753g gVar, long j) {
        C1765q qVar = gVar.f5364d;
        if (qVar instanceof C1759l) {
            return j;
        }
        int size = gVar.f5371k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C1750d dVar = gVar.f5371k.get(i);
            if (dVar instanceof C1753g) {
                C1753g gVar2 = (C1753g) dVar;
                if (gVar2.f5364d != qVar) {
                    j2 = Math.min(j2, mo6035a(gVar2, ((long) gVar2.f5366f) + j));
                }
            }
        }
        if (gVar != qVar.f5406i) {
            return j2;
        }
        long j3 = j - qVar.mo6015j();
        return Math.min(Math.min(j2, mo6035a(qVar.f5405h, j3)), j3 - ((long) qVar.f5405h.f5366f));
    }

    /* renamed from: b */
    public final long mo6036b(C1753g gVar, long j) {
        C1765q qVar = gVar.f5364d;
        if (qVar instanceof C1759l) {
            return j;
        }
        int size = gVar.f5371k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C1750d dVar = gVar.f5371k.get(i);
            if (dVar instanceof C1753g) {
                C1753g gVar2 = (C1753g) dVar;
                if (gVar2.f5364d != qVar) {
                    j2 = Math.max(j2, mo6036b(gVar2, ((long) gVar2.f5366f) + j));
                }
            }
        }
        if (gVar != qVar.f5405h) {
            return j2;
        }
        long j3 = j + qVar.mo6015j();
        return Math.max(Math.max(j2, mo6036b(qVar.f5406i, j3)), j3 - ((long) qVar.f5406i.f5366f));
    }
}
