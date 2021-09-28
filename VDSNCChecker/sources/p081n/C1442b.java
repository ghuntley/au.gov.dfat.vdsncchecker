package p081n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p000a.C0001b;

/* renamed from: n.b */
public class C1442b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: e */
    public C1445c<K, V> f4532e;

    /* renamed from: f */
    public C1445c<K, V> f4533f;

    /* renamed from: g */
    public WeakHashMap<C1448f<K, V>, Boolean> f4534g = new WeakHashMap<>();

    /* renamed from: h */
    public int f4535h = 0;

    /* renamed from: n.b$a */
    public static class C1443a<K, V> extends C1447e<K, V> {
        public C1443a(C1445c<K, V> cVar, C1445c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* renamed from: b */
        public C1445c<K, V> mo5291b(C1445c<K, V> cVar) {
            return cVar.f4539h;
        }

        /* renamed from: c */
        public C1445c<K, V> mo5292c(C1445c<K, V> cVar) {
            return cVar.f4538g;
        }
    }

    /* renamed from: n.b$b */
    public static class C1444b<K, V> extends C1447e<K, V> {
        public C1444b(C1445c<K, V> cVar, C1445c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* renamed from: b */
        public C1445c<K, V> mo5291b(C1445c<K, V> cVar) {
            return cVar.f4538g;
        }

        /* renamed from: c */
        public C1445c<K, V> mo5292c(C1445c<K, V> cVar) {
            return cVar.f4539h;
        }
    }

    /* renamed from: n.b$c */
    public static class C1445c<K, V> implements Map.Entry<K, V> {

        /* renamed from: e */
        public final K f4536e;

        /* renamed from: f */
        public final V f4537f;

        /* renamed from: g */
        public C1445c<K, V> f4538g;

        /* renamed from: h */
        public C1445c<K, V> f4539h;

        public C1445c(K k, V v) {
            this.f4536e = k;
            this.f4537f = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1445c)) {
                return false;
            }
            C1445c cVar = (C1445c) obj;
            return this.f4536e.equals(cVar.f4536e) && this.f4537f.equals(cVar.f4537f);
        }

        public K getKey() {
            return this.f4536e;
        }

        public V getValue() {
            return this.f4537f;
        }

        public int hashCode() {
            return this.f4536e.hashCode() ^ this.f4537f.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f4536e + "=" + this.f4537f;
        }
    }

    /* renamed from: n.b$d */
    public class C1446d implements Iterator<Map.Entry<K, V>>, C1448f<K, V> {

        /* renamed from: e */
        public C1445c<K, V> f4540e;

        /* renamed from: f */
        public boolean f4541f = true;

        public C1446d() {
        }

        /* renamed from: a */
        public void mo5299a(C1445c<K, V> cVar) {
            C1445c<K, V> cVar2 = this.f4540e;
            if (cVar == cVar2) {
                C1445c<K, V> cVar3 = cVar2.f4539h;
                this.f4540e = cVar3;
                this.f4541f = cVar3 == null;
            }
        }

        public boolean hasNext() {
            if (this.f4541f) {
                return C1442b.this.f4532e != null;
            }
            C1445c<K, V> cVar = this.f4540e;
            return (cVar == null || cVar.f4538g == null) ? false : true;
        }

        public Object next() {
            C1445c<K, V> cVar;
            if (this.f4541f) {
                this.f4541f = false;
                cVar = C1442b.this.f4532e;
            } else {
                C1445c<K, V> cVar2 = this.f4540e;
                cVar = cVar2 != null ? cVar2.f4538g : null;
            }
            this.f4540e = cVar;
            return cVar;
        }
    }

    /* renamed from: n.b$e */
    public static abstract class C1447e<K, V> implements Iterator<Map.Entry<K, V>>, C1448f<K, V> {

        /* renamed from: e */
        public C1445c<K, V> f4543e;

        /* renamed from: f */
        public C1445c<K, V> f4544f;

        public C1447e(C1445c<K, V> cVar, C1445c<K, V> cVar2) {
            this.f4543e = cVar2;
            this.f4544f = cVar;
        }

        /* renamed from: a */
        public void mo5299a(C1445c<K, V> cVar) {
            C1445c<K, V> cVar2 = null;
            if (this.f4543e == cVar && cVar == this.f4544f) {
                this.f4544f = null;
                this.f4543e = null;
            }
            C1445c<K, V> cVar3 = this.f4543e;
            if (cVar3 == cVar) {
                this.f4543e = mo5291b(cVar3);
            }
            C1445c<K, V> cVar4 = this.f4544f;
            if (cVar4 == cVar) {
                C1445c<K, V> cVar5 = this.f4543e;
                if (!(cVar4 == cVar5 || cVar5 == null)) {
                    cVar2 = mo5292c(cVar4);
                }
                this.f4544f = cVar2;
            }
        }

        /* renamed from: b */
        public abstract C1445c<K, V> mo5291b(C1445c<K, V> cVar);

        /* renamed from: c */
        public abstract C1445c<K, V> mo5292c(C1445c<K, V> cVar);

        public boolean hasNext() {
            return this.f4544f != null;
        }

        public Object next() {
            C1445c<K, V> cVar = this.f4544f;
            C1445c<K, V> cVar2 = this.f4543e;
            this.f4544f = (cVar == cVar2 || cVar2 == null) ? null : mo5292c(cVar);
            return cVar;
        }
    }

    /* renamed from: n.b$f */
    public interface C1448f<K, V> {
        /* renamed from: a */
        void mo5299a(C1445c<K, V> cVar);
    }

    /* renamed from: a */
    public C1445c<K, V> mo5281a(K k) {
        C1445c<K, V> cVar = this.f4532e;
        while (cVar != null && !cVar.f4536e.equals(k)) {
            cVar = cVar.f4538g;
        }
        return cVar;
    }

    /* renamed from: b */
    public C1442b<K, V>.d mo5285b() {
        C1442b<K, V>.d dVar = new C1446d();
        this.f4534g.put(dVar, Boolean.FALSE);
        return dVar;
    }

    /* renamed from: c */
    public C1445c<K, V> mo5286c(K k, V v) {
        C1445c<K, V> cVar = new C1445c<>(k, v);
        this.f4535h++;
        C1445c<K, V> cVar2 = this.f4533f;
        if (cVar2 == null) {
            this.f4532e = cVar;
        } else {
            cVar2.f4538g = cVar;
            cVar.f4539h = cVar2;
        }
        this.f4533f = cVar;
        return cVar;
    }

    /* renamed from: d */
    public V mo5283d(K k, V v) {
        C1445c a = mo5281a(k);
        if (a != null) {
            return a.f4537f;
        }
        mo5286c(k, v);
        return null;
    }

    /* renamed from: e */
    public V mo5284e(K k) {
        C1445c a = mo5281a(k);
        if (a == null) {
            return null;
        }
        this.f4535h--;
        if (!this.f4534g.isEmpty()) {
            for (C1448f<K, V> a2 : this.f4534g.keySet()) {
                a2.mo5299a(a);
            }
        }
        C1445c<K, V> cVar = a.f4539h;
        C1445c<K, V> cVar2 = a.f4538g;
        if (cVar != null) {
            cVar.f4538g = cVar2;
        } else {
            this.f4532e = cVar2;
        }
        C1445c<K, V> cVar3 = a.f4538g;
        if (cVar3 != null) {
            cVar3.f4539h = cVar;
        } else {
            this.f4533f = cVar;
        }
        a.f4538g = null;
        a.f4539h = null;
        return a.f4537f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((p081n.C1442b.C1447e) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof p081n.C1442b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            n.b r7 = (p081n.C1442b) r7
            int r1 = r6.f4535h
            int r3 = r7.f4535h
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            r3 = r1
            n.b$e r3 = (p081n.C1442b.C1447e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r7
            n.b$e r4 = (p081n.C1442b.C1447e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L_0x003b
            if (r4 != 0) goto L_0x0043
        L_0x003b:
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x0053
            n.b$e r7 = (p081n.C1442b.C1447e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p081n.C1442b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            C1447e eVar = (C1447e) it;
            if (!eVar.hasNext()) {
                return i;
            }
            i += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        C1443a aVar = new C1443a(this.f4532e, this.f4533f);
        this.f4534g.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("[");
        Iterator it = iterator();
        while (true) {
            C1447e eVar = (C1447e) it;
            if (eVar.hasNext()) {
                a.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    a.append(", ");
                }
            } else {
                a.append("]");
                return a.toString();
            }
        }
    }
}
