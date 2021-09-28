package p139w3;

import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import p000a.C0001b;
import p019c3.C0625a;
import p025d3.C0802f;
import p025d3.C0812p;
import p031e3.C0870a;
import p050h4.C1018c;
import p062j4.C1115i;
import p067k3.C1205h;
import p072l2.C1241e;
import p099q.C1599h;
import p126u2.C1850k;
import p126u2.C1852m;

/* renamed from: w3.h */
public final class C2074h {

    /* renamed from: c */
    public static final C2074h f6027c = new C2074h(C1850k.m5057S(new ArrayList()), (C1018c) null, 2);

    /* renamed from: d */
    public static final C2075a f6028d = new C2075a((C0802f) null);

    /* renamed from: a */
    public final Set<C2076b> f6029a;

    /* renamed from: b */
    public final C1018c f6030b;

    /* renamed from: w3.h$a */
    public static final class C2075a {
        public C2075a(C0802f fVar) {
        }

        /* renamed from: a */
        public final String mo6567a(Certificate certificate) {
            C1241e.m3517j(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                StringBuilder a = C0001b.m0a("sha256/");
                a.append(mo6568b((X509Certificate) certificate).mo4667a());
                return a.toString();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        /* renamed from: b */
        public final C1115i mo6568b(X509Certificate x509Certificate) {
            C1115i.C1116a aVar = C1115i.f3890i;
            PublicKey publicKey = x509Certificate.getPublicKey();
            C1241e.m3516f(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            C1241e.m3516f(encoded, "publicKey.encoded");
            return C1115i.C1116a.m3240c(aVar, encoded, 0, 0, 3).mo4668b("SHA-256");
        }
    }

    /* renamed from: w3.h$b */
    public static final class C2076b {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2076b)) {
                return false;
            }
            C2076b bVar = (C2076b) obj;
            Objects.requireNonNull(bVar);
            if (!C1241e.m3513b((Object) null, (Object) null)) {
                return false;
            }
            Objects.requireNonNull(bVar);
            if (!C1241e.m3513b((Object) null, (Object) null)) {
                return false;
            }
            Objects.requireNonNull(bVar);
            return !(C1241e.m3513b((Object) null, (Object) null) ^ true);
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append((String) null);
            sb.append('/');
            throw null;
        }
    }

    public C2074h(Set<C2076b> set, C1018c cVar) {
        C1241e.m3517j(set, "pins");
        this.f6029a = set;
        this.f6030b = cVar;
    }

    public C2074h(Set set, C1018c cVar, int i) {
        this.f6029a = set;
        this.f6030b = null;
    }

    /* renamed from: a */
    public final void mo6563a(String str, C0625a<? extends List<? extends X509Certificate>> aVar) {
        C1241e.m3517j(str, "hostname");
        Set<C2076b> set = this.f6029a;
        List<C2076b> list = C1852m.f5542e;
        for (T next : set) {
            Objects.requireNonNull((C2076b) next);
            if (C1205h.m3434R((String) null, "**.", false, 2)) {
                throw null;
            } else if (C1205h.m3434R((String) null, "*.", false, 2)) {
                throw null;
            } else if (C1241e.m3513b(str, (Object) null)) {
                if (list.isEmpty()) {
                    list = new ArrayList<>();
                }
                if (!(list instanceof C0870a)) {
                    list.add(next);
                } else {
                    C0812p.m2407c(list, "kotlin.collections.MutableList");
                    throw null;
                }
            }
        }
        if (!list.isEmpty()) {
            List<X509Certificate> list2 = (List) aVar.mo40b();
            for (X509Certificate x509Certificate : list2) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    Objects.requireNonNull((C2076b) it.next());
                    throw null;
                }
            }
            StringBuilder a = C1599h.m4503a("Certificate pinning failure!", "\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : list2) {
                a.append("\n    ");
                a.append(f6028d.mo6567a(x509Certificate2));
                a.append(": ");
                Principal subjectDN = x509Certificate2.getSubjectDN();
                C1241e.m3516f(subjectDN, "element.subjectDN");
                a.append(subjectDN.getName());
            }
            a.append("\n  Pinned certificates for ");
            a.append(str);
            a.append(":");
            for (C2076b append : list) {
                a.append("\n    ");
                a.append(append);
            }
            String sb = a.toString();
            C1241e.m3516f(sb, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(sb);
        }
    }

    /* renamed from: b */
    public final C2074h mo6564b(C1018c cVar) {
        return C1241e.m3513b(this.f6030b, cVar) ? this : new C2074h(this.f6029a, cVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2074h) {
            C2074h hVar = (C2074h) obj;
            return C1241e.m3513b(hVar.f6029a, this.f6029a) && C1241e.m3513b(hVar.f6030b, this.f6030b);
        }
    }

    public int hashCode() {
        int hashCode = (this.f6029a.hashCode() + 1517) * 41;
        C1018c cVar = this.f6030b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }
}
