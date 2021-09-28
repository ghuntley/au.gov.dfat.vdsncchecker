package p025d3;

import p016c0.C0559c;
import p019c3.C0625a;
import p019c3.C0626b;
import p019c3.C0627c;
import p019c3.C0628d;
import p019c3.C0629e;
import p019c3.C0630f;
import p019c3.C0631g;
import p019c3.C0632h;
import p019c3.C0633i;
import p019c3.C0634j;
import p019c3.C0635k;
import p019c3.C0636l;
import p019c3.C0637m;
import p019c3.C0638n;
import p019c3.C0639o;
import p019c3.C0640p;
import p019c3.C0641q;
import p019c3.C0642r;
import p019c3.C0643s;
import p019c3.C0644t;
import p019c3.C0645u;
import p019c3.C0646v;
import p019c3.C0647w;
import p072l2.C1241e;
import p120t2.C1787a;

/* renamed from: d3.p */
public class C0812p {
    /* renamed from: a */
    public static Object m2405a(Object obj, int i) {
        if (m2406b(obj, i)) {
            return obj;
        }
        m2407c(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    /* renamed from: b */
    public static boolean m2406b(Object obj, int i) {
        if (obj instanceof C1787a) {
            if ((obj instanceof C0803g ? ((C0803g) obj).mo4041f() : obj instanceof C0625a ? 0 : obj instanceof C0636l ? 1 : obj instanceof C0640p ? 2 : obj instanceof C0641q ? 3 : obj instanceof C0642r ? 4 : obj instanceof C0643s ? 5 : obj instanceof C0644t ? 6 : obj instanceof C0645u ? 7 : obj instanceof C0646v ? 8 : obj instanceof C0647w ? 9 : obj instanceof C0626b ? 10 : obj instanceof C0627c ? 11 : obj instanceof C0628d ? 12 : obj instanceof C0629e ? 13 : obj instanceof C0630f ? 14 : obj instanceof C0631g ? 15 : obj instanceof C0632h ? 16 : obj instanceof C0633i ? 17 : obj instanceof C0634j ? 18 : obj instanceof C0635k ? 19 : obj instanceof C0637m ? 20 : obj instanceof C0638n ? 21 : obj instanceof C0639o ? 22 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static void m2407c(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(C0559c.m1823a(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        C1241e.m3521o(classCastException, C0812p.class.getName());
        throw classCastException;
    }
}
