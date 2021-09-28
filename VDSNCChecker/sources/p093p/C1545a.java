package p093p;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p093p.C1552g;

/* renamed from: p.a */
public class C1545a<K, V> extends C1558h<K, V> implements Map<K, V> {

    /* renamed from: l */
    public C1552g<K, V> f4791l;

    /* renamed from: p.a$a */
    public class C1546a extends C1552g<K, V> {
        public C1546a() {
        }

        /* renamed from: a */
        public void mo5501a() {
            C1545a.this.clear();
        }

        /* renamed from: b */
        public Object mo5502b(int i, int i2) {
            return C1545a.this.f4839f[(i << 1) + i2];
        }

        /* renamed from: c */
        public Map<K, V> mo5503c() {
            return C1545a.this;
        }

        /* renamed from: d */
        public int mo5504d() {
            return C1545a.this.f4840g;
        }

        /* renamed from: e */
        public int mo5505e(Object obj) {
            return C1545a.this.mo5608f(obj);
        }

        /* renamed from: f */
        public int mo5506f(Object obj) {
            return C1545a.this.mo5612h(obj);
        }

        /* renamed from: g */
        public void mo5507g(K k, V v) {
            C1545a.this.put(k, v);
        }

        /* renamed from: h */
        public void mo5508h(int i) {
            C1545a.this.mo5616j(i);
        }

        /* renamed from: i */
        public V mo5509i(int i, V v) {
            int i2 = (i << 1) + 1;
            V[] vArr = C1545a.this.f4839f;
            V v2 = vArr[i2];
            vArr[i2] = v;
            return v2;
        }
    }

    public C1545a() {
    }

    public C1545a(C1558h hVar) {
        if (hVar != null) {
            int i = hVar.f4840g;
            mo5602c(this.f4840g + i);
            if (this.f4840g != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    put(hVar.mo5614i(i2), hVar.mo5618l(i2));
                }
            } else if (i > 0) {
                System.arraycopy(hVar.f4838e, 0, this.f4838e, 0, i);
                System.arraycopy(hVar.f4839f, 0, this.f4839f, 0, i << 1);
                this.f4840g = i;
            }
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        C1552g m = mo5498m();
        if (m.f4819a == null) {
            m.f4819a = new C1552g.C1554b();
        }
        return m.f4819a;
    }

    public Set<K> keySet() {
        C1552g m = mo5498m();
        if (m.f4820b == null) {
            m.f4820b = new C1552g.C1555c();
        }
        return m.f4820b;
    }

    /* renamed from: m */
    public final C1552g<K, V> mo5498m() {
        if (this.f4791l == null) {
            this.f4791l = new C1546a();
        }
        return this.f4791l;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo5602c(map.size() + this.f4840g);
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        C1552g m = mo5498m();
        if (m.f4821c == null) {
            m.f4821c = new C1552g.C1557e();
        }
        return m.f4821c;
    }
}
