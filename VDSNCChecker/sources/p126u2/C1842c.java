package p126u2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p025d3.C0797a;
import p025d3.C0801e;
import p031e3.C0870a;
import p072l2.C1241e;

/* renamed from: u2.c */
public final class C1842c<T> implements Collection<T>, C0870a {

    /* renamed from: e */
    public final T[] f5537e;

    /* renamed from: f */
    public final boolean f5538f;

    public C1842c(T[] tArr, boolean z) {
        this.f5537e = tArr;
        this.f5538f = z;
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean contains(java.lang.Object r6) {
        /*
            r5 = this;
            T[] r0 = r5.f5537e
            java.lang.String r1 = "$this$contains"
            p072l2.C1241e.m3517j(r0, r1)
            java.lang.String r1 = "$this$indexOf"
            p072l2.C1241e.m3517j(r0, r1)
            r1 = 0
            if (r6 != 0) goto L_0x001b
            int r6 = r0.length
            r2 = r1
        L_0x0011:
            if (r2 >= r6) goto L_0x002c
            r3 = r0[r2]
            if (r3 != 0) goto L_0x0018
            goto L_0x002d
        L_0x0018:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x001b:
            int r2 = r0.length
            r3 = r1
        L_0x001d:
            if (r3 >= r2) goto L_0x002c
            r4 = r0[r3]
            boolean r4 = p072l2.C1241e.m3513b(r6, r4)
            if (r4 == 0) goto L_0x0029
            r2 = r3
            goto L_0x002d
        L_0x0029:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x002c:
            r2 = -1
        L_0x002d:
            if (r2 < 0) goto L_0x0030
            r1 = 1
        L_0x0030:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p126u2.C1842c.contains(java.lang.Object):boolean");
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C1241e.m3517j(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.f5537e.length == 0;
    }

    public Iterator<T> iterator() {
        T[] tArr = this.f5537e;
        C1241e.m3517j(tArr, "array");
        return new C0797a(tArr);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f5537e.length;
    }

    public final Object[] toArray() {
        T[] tArr = this.f5537e;
        boolean z = this.f5538f;
        Class<Object[]> cls = Object[].class;
        C1241e.m3517j(tArr, "$this$copyToArrayOfAny");
        if (z && C1241e.m3513b(tArr.getClass(), cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        C1241e.m3516f(copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return copyOf;
    }

    public <T> T[] toArray(T[] tArr) {
        return C0801e.m2398b(this, tArr);
    }
}
