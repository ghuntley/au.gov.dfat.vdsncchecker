package p126u2;

import java.util.Collection;
import p042g2.C0955a;
import p072l2.C1241e;

/* renamed from: u2.g */
public class C1846g extends C0955a {
    /* renamed from: H */
    public static final <T> int m5046H(Iterable<? extends T> iterable, int i) {
        C1241e.m3517j(iterable, "$this$collectionSizeOrDefault");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
