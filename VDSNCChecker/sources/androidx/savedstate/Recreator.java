package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C0342c;
import androidx.lifecycle.C0346d;
import androidx.lifecycle.C0347e;
import androidx.savedstate.C0483a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p000a.C0001b;
import p002a1.C0007b;
import p016c0.C0559c;
import p063k.C1142f;
import p118t0.C1773g;

@SuppressLint({"RestrictedApi"})
public final class Recreator implements C0346d {

    /* renamed from: e */
    public final C0007b f2226e;

    /* renamed from: androidx.savedstate.Recreator$a */
    public static final class C0482a implements C0483a.C0485b {

        /* renamed from: a */
        public final Set<String> f2227a = new HashSet();

        public C0482a(C0483a aVar) {
            aVar.mo2452b("androidx.savedstate.Restarter", this);
        }

        /* renamed from: a */
        public Bundle mo2450a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f2227a));
            return bundle;
        }
    }

    public Recreator(C0007b bVar) {
        this.f2226e = bVar;
    }

    /* renamed from: g */
    public void mo134g(C1773g gVar, C0342c.C0344b bVar) {
        if (bVar == C0342c.C0344b.ON_CREATE) {
            C0347e eVar = (C0347e) gVar.mo113c();
            eVar.mo1806d("removeObserver");
            eVar.f1688a.mo5284e(this);
            Bundle a = this.f2226e.mo3e().mo2451a("androidx.savedstate.Restarter");
            if (a != null) {
                ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(C0483a.C0484a.class);
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    ((C0483a.C0484a) declaredConstructor.newInstance(new Object[0])).mo1795a(this.f2226e);
                                } catch (Exception e) {
                                    throw new RuntimeException(C1142f.m3365a("Failed to instantiate ", next), e);
                                }
                            } catch (NoSuchMethodException e2) {
                                StringBuilder a2 = C0001b.m0a("Class");
                                a2.append(asSubclass.getSimpleName());
                                a2.append(" must have default constructor in order to be automatically recreated");
                                throw new IllegalStateException(a2.toString(), e2);
                            }
                        } catch (ClassNotFoundException e3) {
                            throw new RuntimeException(C0559c.m1823a("Class ", next, " wasn't found"), e3);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
