package p081n;

import java.util.HashMap;
import p081n.C1442b;

/* renamed from: n.a */
public class C1441a<K, V> extends C1442b<K, V> {

    /* renamed from: i */
    public HashMap<K, C1442b.C1445c<K, V>> f4531i = new HashMap<>();

    /* renamed from: a */
    public C1442b.C1445c<K, V> mo5281a(K k) {
        return this.f4531i.get(k);
    }

    public boolean contains(K k) {
        return this.f4531i.containsKey(k);
    }

    /* renamed from: d */
    public V mo5283d(K k, V v) {
        C1442b.C1445c cVar = this.f4531i.get(k);
        if (cVar != null) {
            return cVar.f4537f;
        }
        this.f4531i.put(k, mo5286c(k, v));
        return null;
    }

    /* renamed from: e */
    public V mo5284e(K k) {
        V e = super.mo5284e(k);
        this.f4531i.remove(k);
        return e;
    }
}
