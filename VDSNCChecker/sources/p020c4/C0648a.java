package p020c4;

import com.dynamsoft.dbr.EnumBarcodeFormat;
import java.util.ArrayList;
import java.util.Objects;
import p025d3.C0802f;
import p062j4.C1114h;
import p067k3.C1209l;
import p072l2.C1241e;
import p139w3.C2103w;

/* renamed from: c4.a */
public final class C0648a {

    /* renamed from: a */
    public long f2497a = ((long) EnumBarcodeFormat.BF_PATCHCODE);

    /* renamed from: b */
    public final C1114h f2498b;

    public C0648a(C1114h hVar) {
        this.f2498b = hVar;
    }

    /* renamed from: a */
    public final C2103w mo2830a() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String b = mo2831b();
            if (b.length() == 0) {
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                return new C2103w((String[]) array, (C0802f) null);
            }
            C1241e.m3517j(b, "line");
            int Y = C1209l.m3444Y(b, ':', 1, false, 4);
            if (Y != -1) {
                String substring = b.substring(0, Y);
                C1241e.m3516f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                b = b.substring(Y + 1);
                C1241e.m3516f(b, "(this as java.lang.String).substring(startIndex)");
                C1241e.m3517j(substring, "name");
                C1241e.m3517j(b, "value");
                arrayList.add(substring);
            } else {
                if (b.charAt(0) == ':') {
                    b = b.substring(1);
                    C1241e.m3516f(b, "(this as java.lang.String).substring(startIndex)");
                }
                C1241e.m3517j("", "name");
                C1241e.m3517j(b, "value");
                arrayList.add("");
            }
            arrayList.add(C1209l.m3455j0(b).toString());
        }
    }

    /* renamed from: b */
    public final String mo2831b() {
        String p = this.f2498b.mo4653p(this.f2497a);
        this.f2497a -= (long) p.length();
        return p;
    }
}
