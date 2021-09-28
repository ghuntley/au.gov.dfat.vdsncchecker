package p139w3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import p042g2.C0955a;
import p063k.C1142f;
import p072l2.C1241e;
import p126u2.C1842c;
import p126u2.C1852m;

/* renamed from: w3.q */
public final class C2093q implements C2094r {
    /* renamed from: a */
    public List<InetAddress> mo6600a(String str) {
        C1241e.m3517j(str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            C1241e.m3516f(allByName, "InetAddress.getAllByName(hostname)");
            C1241e.m3517j(allByName, "$this$toList");
            int length = allByName.length;
            if (length == 0) {
                return C1852m.f5542e;
            }
            if (length == 1) {
                return C0955a.m2747u(allByName[0]);
            }
            C1241e.m3517j(allByName, "$this$toMutableList");
            C1241e.m3517j(allByName, "$this$asCollection");
            return new ArrayList(new C1842c(allByName, false));
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException(C1142f.m3365a("Broken system behaviour for dns lookup of ", str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }
}
