package p053i1;

import android.content.DialogInterface;
import p019c3.C0640p;
import p025d3.C0806j;
import p072l2.C1241e;
import p120t2.C1798k;

/* renamed from: i1.b */
public final class C1026b extends C0806j implements C0640p<DialogInterface, Integer, C1798k> {

    /* renamed from: f */
    public static final C1026b f3746f = new C1026b();

    public C1026b() {
        super(2);
    }

    /* renamed from: k */
    public Object mo2829k(Object obj, Object obj2) {
        DialogInterface dialogInterface = (DialogInterface) obj;
        ((Number) obj2).intValue();
        C1241e.m3517j(dialogInterface, "dialog");
        dialogInterface.dismiss();
        return C1798k.f5446a;
    }
}
