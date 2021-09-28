package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.savedstate.Recreator;
import p000a.C0001b;
import p002a1.C0007b;
import p081n.C1442b;

@SuppressLint({"RestrictedApi"})
/* renamed from: androidx.savedstate.a */
public final class C0483a {

    /* renamed from: a */
    public C1442b<String, C0485b> f2229a = new C1442b<>();

    /* renamed from: b */
    public Bundle f2230b;

    /* renamed from: c */
    public boolean f2231c;

    /* renamed from: d */
    public Recreator.C0482a f2232d;

    /* renamed from: e */
    public boolean f2233e = true;

    /* renamed from: androidx.savedstate.a$a */
    public interface C0484a {
        /* renamed from: a */
        void mo1795a(C0007b bVar);
    }

    /* renamed from: androidx.savedstate.a$b */
    public interface C0485b {
        /* renamed from: a */
        Bundle mo2450a();
    }

    /* renamed from: a */
    public Bundle mo2451a(String str) {
        if (this.f2231c) {
            Bundle bundle = this.f2230b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f2230b.remove(str);
            if (this.f2230b.isEmpty()) {
                this.f2230b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* renamed from: b */
    public void mo2452b(String str, C0485b bVar) {
        if (this.f2229a.mo5283d(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* renamed from: c */
    public void mo2453c(Class<? extends C0484a> cls) {
        if (this.f2233e) {
            if (this.f2232d == null) {
                this.f2232d = new Recreator.C0482a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.C0482a aVar = this.f2232d;
                aVar.f2227a.add(cls.getName());
            } catch (NoSuchMethodException e) {
                StringBuilder a = C0001b.m0a("Class");
                a.append(cls.getSimpleName());
                a.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(a.toString(), e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }
}
