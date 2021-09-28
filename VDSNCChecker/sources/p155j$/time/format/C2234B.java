package p155j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: j$.time.format.B */
final class C2234B {

    /* renamed from: a */
    private final Map f6381a;

    /* renamed from: b */
    private final Map f6382b;

    C2234B(Map map) {
        this.f6381a = map;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                int i = C2235C.f6385c;
                hashMap2.put((String) entry2.getValue(), new AbstractMap.SimpleImmutableEntry((String) entry2.getValue(), (Long) entry2.getKey()));
            }
            ArrayList arrayList2 = new ArrayList(hashMap2.values());
            Collections.sort(arrayList2, C2235C.f6384b);
            hashMap.put((C2240H) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            hashMap.put((Object) null, arrayList);
        }
        Collections.sort(arrayList, C2235C.f6384b);
        this.f6382b = hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo6870a(long j, C2240H h) {
        Map map = (Map) this.f6381a.get(h);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Iterator mo6871b(C2240H h) {
        List list = (List) this.f6382b.get(h);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
