package p002a1;

import android.os.Bundle;
import androidx.lifecycle.C0342c;
import androidx.lifecycle.C0347e;
import androidx.savedstate.C0483a;
import androidx.savedstate.Recreator;
import androidx.savedstate.SavedStateRegistry$1;
import java.util.Map;
import java.util.Objects;
import p081n.C1442b;

/* renamed from: a1.a */
public final class C0006a {

    /* renamed from: a */
    public final C0007b f1a;

    /* renamed from: b */
    public final C0483a f2b = new C0483a();

    public C0006a(C0007b bVar) {
        this.f1a = bVar;
    }

    /* renamed from: a */
    public void mo1a(Bundle bundle) {
        C0342c c = this.f1a.mo113c();
        if (((C0347e) c).f1689b == C0342c.C0345c.INITIALIZED) {
            c.mo1802a(new Recreator(this.f1a));
            C0483a aVar = this.f2b;
            if (!aVar.f2231c) {
                if (bundle != null) {
                    aVar.f2230b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                }
                c.mo1802a(new SavedStateRegistry$1(aVar));
                aVar.f2231c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    /* renamed from: b */
    public void mo2b(Bundle bundle) {
        C0483a aVar = this.f2b;
        Objects.requireNonNull(aVar);
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = aVar.f2230b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C1442b<K, V>.d b = aVar.f2229a.mo5285b();
        while (b.hasNext()) {
            Map.Entry entry = (Map.Entry) b.next();
            bundle2.putBundle((String) entry.getKey(), ((C0483a.C0485b) entry.getValue()).mo2450a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
