package p050h4;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;
import p072l2.C1241e;

/* renamed from: h4.a */
public final class C1016a extends C1018c {

    /* renamed from: a */
    public final C1020e f3737a;

    public C1016a(C1020e eVar) {
        C1241e.m3517j(eVar, "trustRootIndex");
        this.f3737a = eVar;
    }

    /* renamed from: a */
    public List<Certificate> mo4240a(List<? extends Certificate> list, String str) {
        C1241e.m3517j(list, "chain");
        C1241e.m3517j(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        C1241e.m3516f(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a = this.f3737a.mo4175a(x509Certificate);
            if (a != null) {
                if (arrayList.size() > 1 || (!C1241e.m3513b(x509Certificate, a))) {
                    arrayList.add(a);
                }
                if (mo4452b(a, a)) {
                    return arrayList;
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                C1241e.m3516f(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    Objects.requireNonNull(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (mo4452b(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    /* renamed from: b */
    public final boolean mo4452b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!C1241e.m3513b(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C1016a) && C1241e.m3513b(((C1016a) obj).f3737a, this.f3737a);
    }

    public int hashCode() {
        return this.f3737a.hashCode();
    }
}
