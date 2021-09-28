package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.C0364b;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p093p.C1559i;
import p106r0.C1656o;
import p141x0.C2114a;

/* renamed from: androidx.navigation.c */
public class C0366c extends C0364b implements Iterable<C0364b> {

    /* renamed from: m */
    public final C1559i<C0364b> f1753m = new C1559i<>();

    /* renamed from: n */
    public int f1754n;

    /* renamed from: o */
    public String f1755o;

    /* renamed from: androidx.navigation.c$a */
    public class C0367a implements Iterator<C0364b> {

        /* renamed from: e */
        public int f1756e = -1;

        /* renamed from: f */
        public boolean f1757f = false;

        public C0367a() {
        }

        public boolean hasNext() {
            return this.f1756e + 1 < C0366c.this.f1753m.mo5635m();
        }

        public Object next() {
            if (hasNext()) {
                this.f1757f = true;
                C1559i<C0364b> iVar = C0366c.this.f1753m;
                int i = this.f1756e + 1;
                this.f1756e = i;
                return iVar.mo5636n(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f1757f) {
                C0366c.this.f1753m.mo5636n(this.f1756e).f1741f = null;
                C1559i<C0364b> iVar = C0366c.this.f1753m;
                int i = this.f1756e;
                Object[] objArr = iVar.f4844g;
                Object obj = objArr[i];
                Object obj2 = C1559i.f4841i;
                if (obj != obj2) {
                    objArr[i] = obj2;
                    iVar.f4842e = true;
                }
                this.f1756e = i - 1;
                this.f1757f = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
    }

    public C0366c(C0369e<? extends C0366c> eVar) {
        super(eVar);
    }

    /* renamed from: d */
    public C0364b.C0365a mo1868d(C1656o oVar) {
        C0364b.C0365a d = super.mo1868d(oVar);
        C0367a aVar = new C0367a();
        while (aVar.hasNext()) {
            C0364b.C0365a d2 = ((C0364b) aVar.next()).mo1868d(oVar);
            if (d2 != null && (d == null || d2.compareTo(d) > 0)) {
                d = d2;
            }
        }
        return d;
    }

    /* renamed from: e */
    public void mo1864e(Context context, AttributeSet attributeSet) {
        super.mo1864e(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C2114a.f6145d);
        int resourceId = obtainAttributes.getResourceId(0, 0);
        if (resourceId != this.f1742g) {
            this.f1754n = resourceId;
            this.f1755o = null;
            this.f1755o = C0364b.m1046c(context, resourceId);
            obtainAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Start destination " + resourceId + " cannot use the same id as the graph " + this);
    }

    /* renamed from: f */
    public final void mo1871f(C0364b bVar) {
        int i = bVar.f1742g;
        if (i == 0) {
            throw new IllegalArgumentException("Destinations must have an id. Call setId() or include an android:id in your navigation XML.");
        } else if (i != this.f1742g) {
            C0364b f = this.f1753m.mo5631f(i);
            if (f != bVar) {
                if (bVar.f1741f == null) {
                    if (f != null) {
                        f.f1741f = null;
                    }
                    bVar.f1741f = this;
                    this.f1753m.mo5634l(bVar.f1742g, bVar);
                    return;
                }
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            }
        } else {
            throw new IllegalArgumentException("Destination " + bVar + " cannot have the same id as graph " + this);
        }
    }

    /* renamed from: g */
    public final C0364b mo1872g(int i) {
        return mo1873h(i, true);
    }

    /* renamed from: h */
    public final C0364b mo1873h(int i, boolean z) {
        C0366c cVar;
        C0364b j = this.f1753m.mo5632j(i, null);
        if (j != null) {
            return j;
        }
        if (!z || (cVar = this.f1741f) == null) {
            return null;
        }
        return cVar.mo1872g(i);
    }

    public final Iterator<C0364b> iterator() {
        return new C0367a();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" startDestination=");
        C0364b g = mo1872g(this.f1754n);
        if (g == null) {
            str = this.f1755o;
            if (str == null) {
                sb.append("0x");
                str = Integer.toHexString(this.f1754n);
            }
        } else {
            sb.append("{");
            sb.append(g.toString());
            str = "}";
        }
        sb.append(str);
        return sb.toString();
    }
}
