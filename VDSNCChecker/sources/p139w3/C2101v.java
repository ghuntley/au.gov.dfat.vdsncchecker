package p139w3;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p019c3.C0625a;
import p025d3.C0806j;
import p042g2.C0955a;
import p063k.C1142f;
import p072l2.C1241e;
import p099q.C1599h;
import p120t2.C1790d;
import p126u2.C1846g;
import p126u2.C1852m;
import p144x3.C2129c;

/* renamed from: w3.v */
public final class C2101v {

    /* renamed from: a */
    public final C1790d f6106a;

    /* renamed from: b */
    public final C2085k0 f6107b;

    /* renamed from: c */
    public final C2080j f6108c;

    /* renamed from: d */
    public final List<Certificate> f6109d;

    /* renamed from: w3.v$a */
    public static final class C2102a extends C0806j implements C0625a<List<? extends Certificate>> {

        /* renamed from: f */
        public final /* synthetic */ C0625a f6110f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2102a(C0625a aVar) {
            super(0);
            this.f6110f = aVar;
        }

        /* renamed from: b */
        public Object mo40b() {
            try {
                return (List) this.f6110f.mo40b();
            } catch (SSLPeerUnverifiedException unused) {
                return C1852m.f5542e;
            }
        }
    }

    public C2101v(C2085k0 k0Var, C2080j jVar, List<? extends Certificate> list, C0625a<? extends List<? extends Certificate>> aVar) {
        C1241e.m3517j(k0Var, "tlsVersion");
        C1241e.m3517j(jVar, "cipherSuite");
        C1241e.m3517j(list, "localCertificates");
        this.f6107b = k0Var;
        this.f6108c = jVar;
        this.f6109d = list;
        this.f6106a = C0955a.m2745s(new C2102a(aVar));
    }

    /* renamed from: a */
    public static final C2101v m5469a(SSLSession sSLSession) {
        List list;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            int hashCode = cipherSuite.hashCode();
            if (hashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException(C1142f.m3365a("cipherSuite == ", cipherSuite));
            }
            C2080j b = C2080j.f6055t.mo6574b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            } else if (!C1241e.m3513b("NONE", protocol)) {
                C2085k0 a = C2085k0.f6066l.mo6580a(protocol);
                try {
                    Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                    list = peerCertificates != null ? C2129c.m5523k((Certificate[]) Arrays.copyOf(peerCertificates, peerCertificates.length)) : C1852m.f5542e;
                } catch (SSLPeerUnverifiedException unused) {
                    list = C1852m.f5542e;
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                return new C2101v(a, b, localCertificates != null ? C2129c.m5523k((Certificate[]) Arrays.copyOf(localCertificates, localCertificates.length)) : C1852m.f5542e, new C2100u(list));
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IllegalStateException("cipherSuite == null".toString());
        }
    }

    /* renamed from: b */
    public final String mo6606b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        C1241e.m3516f(type, "type");
        return type;
    }

    /* renamed from: c */
    public final List<Certificate> mo6607c() {
        return (List) this.f6106a.getValue();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2101v) {
            C2101v vVar = (C2101v) obj;
            return vVar.f6107b == this.f6107b && C1241e.m3513b(vVar.f6108c, this.f6108c) && C1241e.m3513b(vVar.mo6607c(), mo6607c()) && C1241e.m3513b(vVar.f6109d, this.f6109d);
        }
    }

    public int hashCode() {
        int hashCode = this.f6108c.hashCode();
        int hashCode2 = mo6607c().hashCode();
        return this.f6109d.hashCode() + ((hashCode2 + ((hashCode + ((this.f6107b.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public String toString() {
        List<Certificate> c = mo6607c();
        ArrayList arrayList = new ArrayList(C1846g.m5046H(c, 10));
        for (Certificate b : c) {
            arrayList.add(mo6606b(b));
        }
        String obj = arrayList.toString();
        StringBuilder a = C1599h.m4503a("Handshake{", "tlsVersion=");
        a.append(this.f6107b);
        a.append(' ');
        a.append("cipherSuite=");
        a.append(this.f6108c);
        a.append(' ');
        a.append("peerCertificates=");
        a.append(obj);
        a.append(' ');
        a.append("localCertificates=");
        List<Certificate> list = this.f6109d;
        ArrayList arrayList2 = new ArrayList(C1846g.m5046H(list, 10));
        for (Certificate b2 : list) {
            arrayList2.add(mo6606b(b2));
        }
        a.append(arrayList2);
        a.append('}');
        return a.toString();
    }
}
