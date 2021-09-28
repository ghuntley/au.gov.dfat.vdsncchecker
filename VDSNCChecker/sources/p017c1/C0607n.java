package p017c1;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p000a.C0001b;
import p063k.C1142f;
import p099q.C1599h;

/* renamed from: c1.n */
public class C0607n {

    /* renamed from: a */
    public final Map<String, Object> f2461a = new HashMap();

    /* renamed from: b */
    public View f2462b;

    /* renamed from: c */
    public final ArrayList<C0592g> f2463c = new ArrayList<>();

    @Deprecated
    public C0607n() {
    }

    public C0607n(View view) {
        this.f2462b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0607n)) {
            return false;
        }
        C0607n nVar = (C0607n) obj;
        return this.f2462b == nVar.f2462b && this.f2461a.equals(nVar.f2461a);
    }

    public int hashCode() {
        return this.f2461a.hashCode() + (this.f2462b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("TransitionValues@");
        a.append(Integer.toHexString(hashCode()));
        a.append(":\n");
        StringBuilder a2 = C1599h.m4503a(a.toString(), "    view = ");
        a2.append(this.f2462b);
        a2.append("\n");
        String a3 = C1142f.m3365a(a2.toString(), "    values:");
        for (String next : this.f2461a.keySet()) {
            a3 = a3 + "    " + next + ": " + this.f2461a.get(next) + "\n";
        }
        return a3;
    }
}
