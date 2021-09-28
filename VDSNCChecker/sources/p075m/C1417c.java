package p075m;

import android.graphics.Path;
import android.graphics.Typeface;
import java.util.Enumeration;
import java.util.Hashtable;
import p062j4.C1106b;
import p074l4.C1348e;
import p086n4.C1482a;
import p086n4.C1483b;
import p086n4.C1484c;

/* renamed from: m.c */
public abstract class C1417c {
    public C1417c(int i) {
    }

    /* renamed from: c */
    public static Hashtable m4065c(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        return hashtable2;
    }

    /* renamed from: a */
    public boolean mo5249a(C1484c cVar, C1484c cVar2) {
        C1483b[] j = cVar.mo5354j();
        C1483b[] j2 = cVar2.mo5354j();
        if (j.length != j2.length) {
            return false;
        }
        boolean z = (j[0].mo5352i() == null || j2[0].mo5352i() == null) ? false : !j[0].mo5352i().f4629e.mo5222l(j2[0].mo5352i().f4629e);
        for (int i = 0; i != j.length; i++) {
            if (!mo5251d(z, j[i], j2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public int mo5250b(C1348e eVar) {
        return C1106b.m3135e(eVar).hashCode();
    }

    /* renamed from: d */
    public boolean mo5251d(boolean z, C1483b bVar, C1483b[] bVarArr) {
        if (z) {
            int length = bVarArr.length - 1;
            while (length >= 0) {
                if (bVarArr[length] == null || !mo5252i(bVar, bVarArr[length])) {
                    length--;
                } else {
                    bVarArr[length] = null;
                    return true;
                }
            }
        } else {
            int i = 0;
            while (i != bVarArr.length) {
                if (bVarArr[i] == null || !mo5252i(bVar, bVarArr[i])) {
                    i++;
                } else {
                    bVarArr[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    public abstract Path mo2791e(float f, float f2, float f3, float f4);

    /* renamed from: f */
    public abstract boolean mo5247f();

    /* renamed from: g */
    public abstract void mo3467g(int i);

    /* renamed from: h */
    public abstract void mo3468h(Typeface typeface, boolean z);

    /* renamed from: i */
    public boolean mo5252i(C1483b bVar, C1483b bVar2) {
        if (bVar.f4631e.f4456e.length != bVar2.f4631e.f4456e.length) {
            return false;
        }
        C1482a[] j = bVar.mo5353j();
        C1482a[] j2 = bVar2.mo5353j();
        if (j.length != j2.length) {
            return false;
        }
        for (int i = 0; i != j.length; i++) {
            C1482a aVar = j[i];
            C1482a aVar2 = j2[i];
            if (!(aVar == aVar2 || (aVar != null && aVar2 != null && aVar.f4629e.mo5222l(aVar2.f4629e) && C1106b.m3135e(aVar.f4630f).equals(C1106b.m3135e(aVar2.f4630f))))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public abstract String mo5253j(C1484c cVar);
}
