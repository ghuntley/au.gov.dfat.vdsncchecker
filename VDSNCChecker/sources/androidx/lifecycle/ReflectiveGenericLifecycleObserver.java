package androidx.lifecycle;

import androidx.lifecycle.C0338a;
import androidx.lifecycle.C0342c;
import p118t0.C1773g;

public class ReflectiveGenericLifecycleObserver implements C0346d {

    /* renamed from: e */
    public final Object f1665e;

    /* renamed from: f */
    public final C0338a.C0339a f1666f;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1665e = obj;
        this.f1666f = C0338a.f1673c.mo1797b(obj.getClass());
    }

    /* renamed from: g */
    public void mo134g(C1773g gVar, C0342c.C0344b bVar) {
        C0338a.C0339a aVar = this.f1666f;
        Object obj = this.f1665e;
        C0338a.C0339a.m1007a(aVar.f1676a.get(bVar), gVar, bVar, obj);
        C0338a.C0339a.m1007a(aVar.f1676a.get(C0342c.C0344b.ON_ANY), gVar, bVar, obj);
    }
}
