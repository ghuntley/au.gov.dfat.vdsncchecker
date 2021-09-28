package p065k1;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.Objects;
import p007au.gov.dfat.vdsncchecker.p008ui.ScanActivity;
import p019c3.C0640p;
import p025d3.C0806j;
import p027e.C0855c;
import p072l2.C1241e;
import p120t2.C1798k;
import p150z.C2147b;

/* renamed from: k1.p */
public final class C1184p extends C0806j implements C0640p<DialogInterface, Integer, C1798k> {

    /* renamed from: f */
    public final /* synthetic */ ScanActivity f4069f;

    /* renamed from: g */
    public final /* synthetic */ ArrayList<String> f4070g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1184p(ScanActivity scanActivity, ArrayList<String> arrayList) {
        super(2);
        this.f4069f = scanActivity;
        this.f4070g = arrayList;
    }

    /* renamed from: k */
    public Object mo2829k(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1241e.m3517j((DialogInterface) obj, "$noName_0");
        C0855c<String[]> cVar = this.f4069f.f2253G;
        Object[] array = this.f4070g.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        cVar.mo146a(array, (C2147b) null);
        return C1798k.f5446a;
    }
}
