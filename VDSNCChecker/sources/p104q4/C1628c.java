package p104q4;

import java.security.PrivilegedAction;

/* renamed from: q4.c */
public final class C1628c implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ String f5004a;

    public C1628c(String str) {
        this.f5004a = str;
    }

    public Object run() {
        return System.getProperty(this.f5004a);
    }
}
