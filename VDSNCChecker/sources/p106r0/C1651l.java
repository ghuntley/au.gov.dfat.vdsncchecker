package p106r0;

import androidx.fragment.app.C0286k;
import androidx.fragment.app.C0302r;
import java.util.HashMap;
import java.util.Iterator;
import p118t0.C1779m;
import p118t0.C1781o;
import p118t0.C1784r;

/* renamed from: r0.l */
public final class C1651l extends C1779m {

    /* renamed from: i */
    public static final C1781o f5049i = new C1652a();

    /* renamed from: c */
    public final HashMap<String, C0286k> f5050c = new HashMap<>();

    /* renamed from: d */
    public final HashMap<String, C1651l> f5051d = new HashMap<>();

    /* renamed from: e */
    public final HashMap<String, C1784r> f5052e = new HashMap<>();

    /* renamed from: f */
    public final boolean f5053f;

    /* renamed from: g */
    public boolean f5054g = false;

    /* renamed from: h */
    public boolean f5055h = false;

    /* renamed from: r0.l$a */
    public class C1652a implements C1781o {
        /* renamed from: a */
        public <T extends C1779m> T mo4786a(Class<T> cls) {
            return new C1651l(true);
        }
    }

    public C1651l(boolean z) {
        this.f5053f = z;
    }

    /* renamed from: b */
    public void mo5809b() {
        if (C0302r.m864N(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
        }
        this.f5054g = true;
    }

    /* renamed from: d */
    public void mo5810d(C0286k kVar) {
        if (!this.f5055h) {
            if ((this.f5050c.remove(kVar.f1460i) != null) && C0302r.m864N(2)) {
                kVar.toString();
            }
        }
    }

    /* renamed from: e */
    public boolean mo5811e(C0286k kVar) {
        if (this.f5050c.containsKey(kVar.f1460i) && this.f5053f) {
            return this.f5054g;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1651l.class != obj.getClass()) {
            return false;
        }
        C1651l lVar = (C1651l) obj;
        return this.f5050c.equals(lVar.f5050c) && this.f5051d.equals(lVar.f5051d) && this.f5052e.equals(lVar.f5052e);
    }

    public int hashCode() {
        int hashCode = this.f5051d.hashCode();
        return this.f5052e.hashCode() + ((hashCode + (this.f5050c.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<C0286k> it = this.f5050c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f5051d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f5052e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
