package p155j$.time.zone;

import java.security.PrivilegedAction;
import java.util.List;

/* renamed from: j$.time.zone.e */
class C2315e implements PrivilegedAction {

    /* renamed from: a */
    final /* synthetic */ List f6577a;

    C2315e(List list) {
        this.f6577a = list;
    }

    public Object run() {
        Class<C2317g> cls = C2317g.class;
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property != null) {
            try {
                C2317g cast = cls.cast(Class.forName(property, true, cls.getClassLoader()).newInstance());
                C2317g.m6148e(cast);
                this.f6577a.add(cast);
                return null;
            } catch (Exception e) {
                throw new Error(e);
            }
        } else {
            C2317g.m6148e(new C2316f());
            return null;
        }
    }
}
