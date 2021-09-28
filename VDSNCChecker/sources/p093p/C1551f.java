package p093p;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;

/* renamed from: p.f */
public class C1551f<K, V> {

    /* renamed from: a */
    public final LinkedHashMap<K, V> f4812a;

    /* renamed from: b */
    public int f4813b;

    /* renamed from: c */
    public int f4814c;

    /* renamed from: d */
    public int f4815d;

    /* renamed from: e */
    public int f4816e;

    /* renamed from: f */
    public int f4817f;

    /* renamed from: g */
    public int f4818g;

    public C1551f(int i) {
        if (i > 0) {
            this.f4814c = i;
            this.f4812a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: a */
    public final V mo5541a(K k) {
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            V v = this.f4812a.get(k);
            if (v != null) {
                this.f4817f++;
                return v;
            }
            this.f4818g++;
            return null;
        }
    }

    /* renamed from: b */
    public final V mo5542b(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f4815d++;
            this.f4813b++;
            put = this.f4812a.put(k, v);
            if (put != null) {
                this.f4813b--;
            }
        }
        mo5543c(this.f4814c);
        return put;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5543c(int r3) {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            int r0 = r2.f4813b     // Catch:{ all -> 0x0069 }
            if (r0 < 0) goto L_0x004a
            java.util.LinkedHashMap<K, V> r0 = r2.f4812a     // Catch:{ all -> 0x0069 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0011
            int r0 = r2.f4813b     // Catch:{ all -> 0x0069 }
            if (r0 != 0) goto L_0x004a
        L_0x0011:
            int r0 = r2.f4813b     // Catch:{ all -> 0x0069 }
            if (r0 <= r3) goto L_0x0048
            java.util.LinkedHashMap<K, V> r0 = r2.f4812a     // Catch:{ all -> 0x0069 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0048
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r2.f4812a     // Catch:{ all -> 0x0069 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0069 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0069 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0069 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0069 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0069 }
            r0.getValue()     // Catch:{ all -> 0x0069 }
            java.util.LinkedHashMap<K, V> r0 = r2.f4812a     // Catch:{ all -> 0x0069 }
            r0.remove(r1)     // Catch:{ all -> 0x0069 }
            int r0 = r2.f4813b     // Catch:{ all -> 0x0069 }
            int r0 = r0 + -1
            r2.f4813b = r0     // Catch:{ all -> 0x0069 }
            int r0 = r2.f4816e     // Catch:{ all -> 0x0069 }
            int r0 = r0 + 1
            r2.f4816e = r0     // Catch:{ all -> 0x0069 }
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
            goto L_0x0000
        L_0x0048:
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
            return
        L_0x004a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0069 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0069 }
            r0.<init>()     // Catch:{ all -> 0x0069 }
            java.lang.Class r1 = r2.getClass()     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0069 }
            r0.append(r1)     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0069 }
            r3.<init>(r0)     // Catch:{ all -> 0x0069 }
            throw r3     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p093p.C1551f.mo5543c(int):void");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f4817f;
        i2 = this.f4818g + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f4814c), Integer.valueOf(this.f4817f), Integer.valueOf(this.f4818g), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0)});
    }
}
