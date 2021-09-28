package p104q4;

import java.security.PrivilegedAction;
import java.security.Security;

/* renamed from: q4.b */
public final class C1627b implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ String f5003a;

    public C1627b(String str) {
        this.f5003a = str;
    }

    public Object run() {
        return Security.getProperty(this.f5003a);
    }
}
