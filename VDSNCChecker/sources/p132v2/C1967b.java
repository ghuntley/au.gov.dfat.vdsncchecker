package p132v2;

import java.util.Comparator;
import p072l2.C1241e;

/* renamed from: v2.b */
public final class C1967b implements Comparator<Comparable<? super Object>> {

    /* renamed from: a */
    public static final C1967b f5801a = new C1967b();

    public int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        C1241e.m3517j(comparable, "a");
        C1241e.m3517j(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    public final Comparator<Comparable<Object>> reversed() {
        return C1966a.f5800a;
    }
}
