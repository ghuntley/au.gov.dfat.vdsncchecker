package p126u2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import p019c3.C0636l;
import p042g2.C0955a;
import p072l2.C1241e;

/* renamed from: u2.k */
public class C1850k extends C1848i {
    /* renamed from: K */
    public static final <T> T m5049K(List<? extends T> list) {
        C1241e.m3517j(list, "$this$first");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: L */
    public static final <T, A extends Appendable> A m5050L(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C0636l<? super T, ? extends CharSequence> lVar) {
        C1241e.m3517j(iterable, "$this$joinTo");
        C1241e.m3517j(a, "buffer");
        C1241e.m3517j(charSequence, "separator");
        C1241e.m3517j(charSequence2, "prefix");
        C1241e.m3517j(charSequence3, "postfix");
        C1241e.m3517j(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C0955a.m2728b(a, next, lVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: M */
    public static String m5051M(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C0636l lVar, int i2) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = charSequence;
        String str = (i2 & 2) != 0 ? "" : charSequence2;
        String str2 = (i2 & 4) != 0 ? "" : charSequence3;
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        String str3 = (i2 & 16) != 0 ? "..." : null;
        C0636l lVar2 = (i2 & 32) != 0 ? null : lVar;
        C1241e.m3517j(iterable, "$this$joinToString");
        C1241e.m3517j(str, "prefix");
        C1241e.m3517j(str3, "truncated");
        StringBuilder sb = new StringBuilder();
        m5050L(iterable, sb, charSequence5, str, str2, i3, str3, lVar2);
        String sb2 = sb.toString();
        C1241e.m3516f(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: N */
    public static final <T> T m5052N(List<? extends T> list) {
        if (!list.isEmpty()) {
            return list.get(C0955a.m2742p(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: O */
    public static final <T, C extends Collection<? super T>> C m5053O(Iterable<? extends T> iterable, C c) {
        for (Object add : iterable) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: P */
    public static final <T> List<T> m5054P(Iterable<? extends T> iterable) {
        C1241e.m3517j(iterable, "$this$toList");
        if (!(iterable instanceof Collection)) {
            return C0955a.m2751y(m5055Q(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C1852m.f5542e;
        }
        if (size != 1) {
            return m5056R(collection);
        }
        return C0955a.m2747u(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: Q */
    public static final <T> List<T> m5055Q(Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m5053O(iterable, arrayList);
        return arrayList;
    }

    /* renamed from: R */
    public static final <T> List<T> m5056R(Collection<? extends T> collection) {
        return new ArrayList(collection);
    }

    /* renamed from: S */
    public static final <T> Set<T> m5057S(Iterable<? extends T> iterable) {
        C1241e.m3517j(iterable, "$this$toSet");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return C1854o.f5544e;
            }
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(C0955a.m2749w(collection.size()));
                m5053O(iterable, linkedHashSet);
                return linkedHashSet;
            }
            Set<T> singleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            C1241e.m3516f(singleton, "java.util.Collections.singleton(element)");
            return singleton;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        m5053O(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        if (size2 == 0) {
            return C1854o.f5544e;
        }
        if (size2 != 1) {
            return linkedHashSet2;
        }
        Set<T> singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
        C1241e.m3516f(singleton2, "java.util.Collections.singleton(element)");
        return singleton2;
    }
}
