package p126u2;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import p042g2.C0955a;
import p072l2.C1241e;

/* renamed from: u2.i */
public class C1848i extends C1847h {
    /* renamed from: I */
    public static final <T> boolean m5047I(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C1241e.m3517j(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: J */
    public static final <T> T m5048J(List<T> list) {
        if (!list.isEmpty()) {
            return list.remove(C0955a.m2742p(list));
        }
        throw new NoSuchElementException("List is empty.");
    }
}
