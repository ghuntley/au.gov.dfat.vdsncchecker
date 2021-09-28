package p106r0;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.C0286k;
import androidx.fragment.app.C0302r;
import androidx.fragment.app.C0321t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p099q.C1599h;

/* renamed from: r0.o */
public class C1656o {

    /* renamed from: a */
    public final /* synthetic */ int f5069a;

    /* renamed from: b */
    public final ArrayList<C0286k> f5070b;

    /* renamed from: c */
    public final HashMap<String, C0321t> f5071c;

    /* renamed from: d */
    public Object f5072d;

    public C1656o() {
        this.f5069a = 0;
        this.f5070b = new ArrayList<>();
        this.f5071c = new HashMap<>();
    }

    /* renamed from: a */
    public void mo5820a(C0286k kVar) {
        if (!this.f5070b.contains(kVar)) {
            synchronized (this.f5070b) {
                this.f5070b.add(kVar);
            }
            kVar.f1466o = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + kVar);
    }

    /* renamed from: b */
    public void mo5821b() {
        this.f5071c.values().removeAll(Collections.singleton((Object) null));
    }

    /* renamed from: c */
    public boolean mo5822c(String str) {
        return this.f5071c.get(str) != null;
    }

    /* renamed from: d */
    public C0286k mo5823d(String str) {
        C0321t tVar = (C0321t) this.f5071c.get(str);
        if (tVar != null) {
            return tVar.f1583c;
        }
        return null;
    }

    /* renamed from: e */
    public C0286k mo5824e(String str) {
        for (C0321t tVar : this.f5071c.values()) {
            if (tVar != null) {
                C0286k kVar = tVar.f1583c;
                if (!str.equals(kVar.f1460i)) {
                    kVar = kVar.f1475x.f1532c.mo5824e(str);
                }
                if (kVar != null) {
                    return kVar;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public List<C0321t> mo5825f() {
        ArrayList arrayList = new ArrayList();
        for (C0321t tVar : this.f5071c.values()) {
            if (tVar != null) {
                arrayList.add(tVar);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public List<C0286k> mo5826g() {
        ArrayList arrayList = new ArrayList();
        for (C0321t tVar : this.f5071c.values()) {
            arrayList.add(tVar != null ? tVar.f1583c : null);
        }
        return arrayList;
    }

    /* renamed from: h */
    public C0321t mo5827h(String str) {
        return (C0321t) this.f5071c.get(str);
    }

    /* renamed from: i */
    public List<C0286k> mo5828i() {
        ArrayList arrayList;
        if (this.f5070b.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f5070b) {
            arrayList = new ArrayList(this.f5070b);
        }
        return arrayList;
    }

    /* renamed from: j */
    public void mo5829j(C0321t tVar) {
        C0286k kVar = tVar.f1583c;
        if (!mo5822c(kVar.f1460i)) {
            this.f5071c.put(kVar.f1460i, tVar);
            if (C0302r.m864N(2)) {
                kVar.toString();
            }
        }
    }

    /* renamed from: k */
    public void mo5830k(C0321t tVar) {
        C0286k kVar = tVar.f1583c;
        if (kVar.f1436E) {
            ((C1651l) this.f5072d).mo5810d(kVar);
        }
        if (((C0321t) this.f5071c.put(kVar.f1460i, (Object) null)) != null && C0302r.m864N(2)) {
            kVar.toString();
        }
    }

    /* renamed from: l */
    public void mo5831l(C0286k kVar) {
        synchronized (this.f5070b) {
            this.f5070b.remove(kVar);
        }
        kVar.f1466o = false;
    }

    public String toString() {
        switch (this.f5069a) {
            case 1:
                StringBuilder a = C1599h.m4503a("NavDeepLinkRequest", "{");
                if (((Uri) this.f5070b) != null) {
                    a.append(" uri=");
                    a.append(((Uri) this.f5070b).toString());
                }
                if (((String) this.f5071c) != null) {
                    a.append(" action=");
                    a.append((String) this.f5071c);
                }
                if (((String) this.f5072d) != null) {
                    a.append(" mimetype=");
                    a.append((String) this.f5072d);
                }
                a.append(" }");
                return a.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1656o(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        this.f5069a = 1;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.ArrayList<androidx.fragment.app.k>, android.net.Uri] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.String, java.util.HashMap<java.lang.String, androidx.fragment.app.t>] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1656o(android.net.Uri r2, java.lang.String r3, java.lang.String r4) {
        /*
            r1 = this;
            r0 = 1
            r1.f5069a = r0
            r1.<init>()
            r1.f5070b = r2
            r1.f5071c = r3
            r1.f5072d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p106r0.C1656o.<init>(android.net.Uri, java.lang.String, java.lang.String):void");
    }
}
