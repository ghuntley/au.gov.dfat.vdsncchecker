package p068k4;

import p062j4.C1112f;
import p067k3.C1197a;
import p072l2.C1241e;

/* renamed from: k4.a */
public final class C1211a {

    /* renamed from: a */
    public static final byte[] f4115a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(C1197a.f4098a);
        C1241e.m3516f(bytes, "(this as java.lang.String).getBytes(charset)");
        f4115a = bytes;
    }

    /* renamed from: a */
    public static final String m3457a(C1112f fVar, long j) {
        C1241e.m3517j(fVar, "$this$readUtf8Line");
        if (j > 0) {
            long j2 = j - 1;
            if (fVar.mo4660u(j2) == ((byte) 13)) {
                String K = fVar.mo4621K(j2);
                fVar.mo4654q(2);
                return K;
            }
        }
        String K2 = fVar.mo4621K(j);
        fVar.mo4654q(1);
        return K2;
    }
}
