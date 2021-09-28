package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.C0369e;
import p000a.C0001b;
import p016c0.C0559c;
import p136w0.C2015m;

@C0369e.C0371b("navigation")
/* renamed from: androidx.navigation.d */
public class C0368d extends C0369e<C0366c> {

    /* renamed from: a */
    public final C0372f f1759a;

    public C0368d(C0372f fVar) {
        this.f1759a = fVar;
    }

    /* renamed from: a */
    public C0364b mo1861a() {
        return new C0366c(this);
    }

    /* renamed from: b */
    public C0364b mo1862b(C0364b bVar, Bundle bundle, C2015m mVar, C0369e.C0370a aVar) {
        String str;
        C0366c cVar = (C0366c) bVar;
        int i = cVar.f1754n;
        if (i == 0) {
            StringBuilder a = C0001b.m0a("no start destination defined via app:startDestination for ");
            int i2 = cVar.f1742g;
            if (i2 != 0) {
                if (cVar.f1743h == null) {
                    cVar.f1743h = Integer.toString(i2);
                }
                str = cVar.f1743h;
            } else {
                str = "the root navigation";
            }
            a.append(str);
            throw new IllegalStateException(a.toString());
        }
        C0364b h = cVar.mo1873h(i, false);
        if (h != null) {
            return this.f1759a.mo1882c(h.f1740e).mo1862b(h, h.mo1866a(bundle), mVar, aVar);
        }
        if (cVar.f1755o == null) {
            cVar.f1755o = Integer.toString(cVar.f1754n);
        }
        throw new IllegalArgumentException(C0559c.m1823a("navigation destination ", cVar.f1755o, " is not a direct child of this NavGraph"));
    }

    /* renamed from: e */
    public boolean mo1863e() {
        return true;
    }
}
