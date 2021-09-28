package p132v2;

import java.util.Comparator;
import p072l2.C1241e;

/* renamed from: v2.a */
public final class C1966a implements Comparator<Comparable<? super Object>> {

    /* renamed from: a */
    public static final C1966a f5800a = new C1966a();

    public int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        C1241e.m3517j(comparable, "a");
        C1241e.m3517j(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    public final Comparator<Comparable<Object>> reversed() {
        return C1967b.f5801a;
    }
}
