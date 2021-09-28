package p133v3;

import java.util.List;
import java.util.Map;
import p019c3.C0636l;
import p025d3.C0802f;
import p025d3.C0812p;
import p055i3.C1035b;
import p072l2.C1241e;
import p097p3.C1579a;
import p097p3.C1580b;

/* renamed from: v3.b */
public final class C1969b extends C1970c {

    /* renamed from: a */
    public final Map<C1035b<?>, C1968a> f5802a;

    /* renamed from: b */
    public final Map<C1035b<?>, Map<C1035b<?>, C1580b<?>>> f5803b;

    /* renamed from: c */
    public final Map<C1035b<?>, Map<String, C1580b<?>>> f5804c;

    /* renamed from: d */
    public final Map<C1035b<?>, C0636l<String, C1579a<?>>> f5805d;

    public C1969b(Map<C1035b<?>, ? extends C1968a> map, Map<C1035b<?>, ? extends Map<C1035b<?>, ? extends C1580b<?>>> map2, Map<C1035b<?>, ? extends Map<String, ? extends C1580b<?>>> map3, Map<C1035b<?>, ? extends C0636l<? super String, ? extends C1579a<?>>> map4) {
        super((C0802f) null);
        this.f5802a = map;
        this.f5803b = map2;
        this.f5804c = map3;
        this.f5805d = map4;
    }

    /* renamed from: a */
    public <T> C1580b<T> mo6466a(C1035b<T> bVar, List<? extends C1580b<?>> list) {
        C1241e.m3517j(bVar, "kClass");
        C1241e.m3517j(list, "typeArgumentsSerializers");
        C1968a aVar = this.f5802a.get(bVar);
        C1580b<?> a = aVar == null ? null : aVar.mo6465a(list);
        if (a instanceof C1580b) {
            return a;
        }
        return null;
    }

    /* renamed from: b */
    public <T> C1579a<? extends T> mo6467b(C1035b<? super T> bVar, String str) {
        C1241e.m3517j(bVar, "baseClass");
        Map map = this.f5804c.get(bVar);
        C1580b bVar2 = map == null ? null : (C1580b) map.get(str);
        if (!(bVar2 instanceof C1580b)) {
            bVar2 = null;
        }
        if (bVar2 != null) {
            return bVar2;
        }
        C0636l<String, C1579a<?>> lVar = this.f5805d.get(bVar);
        C0636l lVar2 = C0812p.m2406b(lVar, 1) ? lVar : null;
        if (lVar2 == null) {
            return null;
        }
        return (C1579a) lVar2.mo2828m(str);
    }
}
