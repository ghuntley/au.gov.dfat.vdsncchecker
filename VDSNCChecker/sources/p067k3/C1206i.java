package p067k3;

import p019c3.C0640p;
import p025d3.C0806j;
import p072l2.C1241e;
import p120t2.C1791e;

/* renamed from: k3.i */
public final class C1206i extends C0806j implements C0640p<CharSequence, Integer, C1791e<? extends Integer, ? extends Integer>> {

    /* renamed from: f */
    public final /* synthetic */ char[] f4110f;

    /* renamed from: g */
    public final /* synthetic */ boolean f4111g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1206i(char[] cArr, boolean z) {
        super(2);
        this.f4110f = cArr;
        this.f4111g = z;
    }

    /* renamed from: k */
    public Object mo2829k(Object obj, Object obj2) {
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Number) obj2).intValue();
        C1241e.m3517j(charSequence, "$receiver");
        int a0 = C1209l.m3446a0(charSequence, this.f4110f, intValue, this.f4111g);
        if (a0 < 0) {
            return null;
        }
        return new C1791e(Integer.valueOf(a0), 1);
    }
}
