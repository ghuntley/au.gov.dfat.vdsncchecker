package androidx.fragment.app;

import androidx.lifecycle.C0342c;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.u */
public abstract class C0323u {

    /* renamed from: a */
    public ArrayList<C0324a> f1587a = new ArrayList<>();

    /* renamed from: b */
    public int f1588b;

    /* renamed from: c */
    public int f1589c;

    /* renamed from: d */
    public int f1590d;

    /* renamed from: e */
    public int f1591e;

    /* renamed from: f */
    public int f1592f;

    /* renamed from: g */
    public boolean f1593g;

    /* renamed from: h */
    public boolean f1594h = true;

    /* renamed from: i */
    public String f1595i;

    /* renamed from: j */
    public int f1596j;

    /* renamed from: k */
    public CharSequence f1597k;

    /* renamed from: l */
    public int f1598l;

    /* renamed from: m */
    public CharSequence f1599m;

    /* renamed from: n */
    public ArrayList<String> f1600n;

    /* renamed from: o */
    public ArrayList<String> f1601o;

    /* renamed from: p */
    public boolean f1602p = false;

    /* renamed from: androidx.fragment.app.u$a */
    public static final class C0324a {

        /* renamed from: a */
        public int f1603a;

        /* renamed from: b */
        public C0286k f1604b;

        /* renamed from: c */
        public int f1605c;

        /* renamed from: d */
        public int f1606d;

        /* renamed from: e */
        public int f1607e;

        /* renamed from: f */
        public int f1608f;

        /* renamed from: g */
        public C0342c.C0345c f1609g;

        /* renamed from: h */
        public C0342c.C0345c f1610h;

        public C0324a() {
        }

        public C0324a(int i, C0286k kVar) {
            this.f1603a = i;
            this.f1604b = kVar;
            C0342c.C0345c cVar = C0342c.C0345c.RESUMED;
            this.f1609g = cVar;
            this.f1610h = cVar;
        }
    }

    public C0323u(C0299p pVar, ClassLoader classLoader) {
    }

    /* renamed from: b */
    public void mo1772b(C0324a aVar) {
        this.f1587a.add(aVar);
        aVar.f1605c = this.f1588b;
        aVar.f1606d = this.f1589c;
        aVar.f1607e = this.f1590d;
        aVar.f1608f = this.f1591e;
    }

    /* renamed from: c */
    public abstract int mo1534c();
}
