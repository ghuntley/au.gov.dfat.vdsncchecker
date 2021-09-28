package p050h4;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import p072l2.C1241e;
import p126u2.C1852m;

/* renamed from: h4.d */
public final class C1019d implements HostnameVerifier {

    /* renamed from: a */
    public static final C1019d f3739a = new C1019d();

    /* renamed from: a */
    public final List<String> mo4457a(X509Certificate x509Certificate, int i) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return C1852m.f5542e;
            }
            ArrayList arrayList = new ArrayList();
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        if (!(!C1241e.m3513b(next.get(0), Integer.valueOf(i)))) {
                            Object obj = next.get(1);
                            if (obj != null) {
                                arrayList.add((String) obj);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return C1852m.f5542e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0128 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo4458b(java.lang.String r13, java.security.cert.X509Certificate r14) {
        /*
            r12 = this;
            java.lang.String r0 = "host"
            p072l2.C1241e.m3517j(r13, r0)
            byte[] r0 = p144x3.C2129c.f6169a
            k3.c r0 = p144x3.C2129c.f6173e
            boolean r0 = r0.mo4808a(r13)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            java.lang.String r13 = p073l3.C1320u.m3694A(r13)
            r0 = 7
            java.util.List r14 = r12.mo4457a(r14, r0)
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x0022
            goto L_0x0129
        L_0x0022:
            java.util.Iterator r14 = r14.iterator()
        L_0x0026:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0129
            java.lang.Object r0 = r14.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = p073l3.C1320u.m3694A(r0)
            boolean r0 = p072l2.C1241e.m3513b(r13, r0)
            if (r0 == 0) goto L_0x0026
            goto L_0x0128
        L_0x003e:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = "Locale.US"
            p072l2.C1241e.m3516f(r0, r3)
            java.lang.String r13 = r13.toLowerCase(r0)
            java.lang.String r0 = "(this as java.lang.String).toLowerCase(locale)"
            p072l2.C1241e.m3516f(r13, r0)
            r4 = 2
            java.util.List r14 = r12.mo4457a(r14, r4)
            boolean r5 = r14.isEmpty()
            if (r5 == 0) goto L_0x005b
            goto L_0x0129
        L_0x005b:
            java.util.Iterator r14 = r14.iterator()
        L_0x005f:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L_0x0129
            java.lang.Object r5 = r14.next()
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r13.length()
            if (r6 != 0) goto L_0x0073
            r6 = r2
            goto L_0x0074
        L_0x0073:
            r6 = r1
        L_0x0074:
            if (r6 != 0) goto L_0x0125
            java.lang.String r6 = "."
            boolean r7 = p067k3.C1205h.m3434R(r13, r6, r1, r4)
            if (r7 != 0) goto L_0x0125
            java.lang.String r7 = ".."
            boolean r8 = p067k3.C1205h.m3426J(r13, r7, r1, r4)
            if (r8 == 0) goto L_0x0088
            goto L_0x0125
        L_0x0088:
            if (r5 == 0) goto L_0x0093
            int r8 = r5.length()
            if (r8 != 0) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            r8 = r1
            goto L_0x0094
        L_0x0093:
            r8 = r2
        L_0x0094:
            if (r8 != 0) goto L_0x0125
            boolean r8 = p067k3.C1205h.m3434R(r5, r6, r1, r4)
            if (r8 != 0) goto L_0x0125
            boolean r7 = p067k3.C1205h.m3426J(r5, r7, r1, r4)
            if (r7 == 0) goto L_0x00a4
            goto L_0x0125
        L_0x00a4:
            boolean r7 = p067k3.C1205h.m3426J(r13, r6, r1, r4)
            if (r7 != 0) goto L_0x00af
            java.lang.String r7 = p063k.C1142f.m3365a(r13, r6)
            goto L_0x00b0
        L_0x00af:
            r7 = r13
        L_0x00b0:
            boolean r8 = p067k3.C1205h.m3426J(r5, r6, r1, r4)
            if (r8 != 0) goto L_0x00ba
            java.lang.String r5 = p063k.C1142f.m3365a(r5, r6)
        L_0x00ba:
            java.util.Locale r6 = java.util.Locale.US
            p072l2.C1241e.m3516f(r6, r3)
            java.lang.String r8 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r5, r8)
            java.lang.String r5 = r5.toLowerCase(r6)
            p072l2.C1241e.m3516f(r5, r0)
            java.lang.String r6 = "*"
            boolean r6 = p067k3.C1209l.m3439T(r5, r6, r1, r4)
            if (r6 != 0) goto L_0x00d8
            boolean r5 = p072l2.C1241e.m3513b(r7, r5)
            goto L_0x0126
        L_0x00d8:
            java.lang.String r6 = "*."
            boolean r8 = p067k3.C1205h.m3434R(r5, r6, r1, r4)
            if (r8 == 0) goto L_0x0125
            r8 = 42
            r9 = 4
            int r8 = p067k3.C1209l.m3444Y(r5, r8, r2, r1, r9)
            r10 = -1
            if (r8 == r10) goto L_0x00eb
            goto L_0x0125
        L_0x00eb:
            int r8 = r7.length()
            int r11 = r5.length()
            if (r8 >= r11) goto L_0x00f6
            goto L_0x0125
        L_0x00f6:
            boolean r6 = p072l2.C1241e.m3513b(r6, r5)
            if (r6 == 0) goto L_0x00fd
            goto L_0x0125
        L_0x00fd:
            java.lang.String r5 = r5.substring(r2)
            java.lang.String r6 = "(this as java.lang.String).substring(startIndex)"
            p072l2.C1241e.m3516f(r5, r6)
            boolean r6 = p067k3.C1205h.m3426J(r7, r5, r1, r4)
            if (r6 != 0) goto L_0x010d
            goto L_0x0125
        L_0x010d:
            int r6 = r7.length()
            int r5 = r5.length()
            int r6 = r6 - r5
            if (r6 <= 0) goto L_0x0123
            r5 = 46
            int r6 = r6 + -1
            int r5 = p067k3.C1209l.m3447b0(r7, r5, r6, r1, r9)
            if (r5 == r10) goto L_0x0123
            goto L_0x0125
        L_0x0123:
            r5 = r2
            goto L_0x0126
        L_0x0125:
            r5 = r1
        L_0x0126:
            if (r5 == 0) goto L_0x005f
        L_0x0128:
            r1 = r2
        L_0x0129:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p050h4.C1019d.mo4458b(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    public boolean verify(String str, SSLSession sSLSession) {
        C1241e.m3517j(str, "host");
        C1241e.m3517j(sSLSession, "session");
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return mo4458b(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
