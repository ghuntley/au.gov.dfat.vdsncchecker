package p005a4;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p000a.C0001b;
import p072l2.C1241e;
import p132v2.C1966a;
import p139w3.C2080j;
import p139w3.C2087l;
import p144x3.C2129c;

/* renamed from: a4.b */
public final class C0012b {

    /* renamed from: a */
    public int f10a;

    /* renamed from: b */
    public boolean f11b;

    /* renamed from: c */
    public boolean f12c;

    /* renamed from: d */
    public final List<C2087l> f13d;

    public C0012b(List<C2087l> list) {
        C1241e.m3517j(list, "connectionSpecs");
        this.f13d = list;
    }

    /* renamed from: a */
    public final C2087l mo9a(SSLSocket sSLSocket) {
        C2087l lVar;
        boolean z;
        String[] strArr;
        String[] strArr2;
        int i = this.f10a;
        int size = this.f13d.size();
        while (true) {
            if (i >= size) {
                lVar = null;
                break;
            }
            lVar = this.f13d.get(i);
            if (lVar.mo6582b(sSLSocket)) {
                this.f10a = i + 1;
                break;
            }
            i++;
        }
        if (lVar != null) {
            int i2 = this.f10a;
            int size2 = this.f13d.size();
            while (true) {
                if (i2 >= size2) {
                    z = false;
                    break;
                } else if (this.f13d.get(i2).mo6582b(sSLSocket)) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.f11b = z;
            boolean z2 = this.f12c;
            if (lVar.f6072c != null) {
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                C1241e.m3516f(enabledCipherSuites, "sslSocket.enabledCipherSuites");
                String[] strArr3 = lVar.f6072c;
                C2080j.C2082b bVar = C2080j.f6055t;
                Comparator<String> comparator = C2080j.f6037b;
                strArr = C2129c.m5527o(enabledCipherSuites, strArr3, C2080j.f6037b);
            } else {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            if (lVar.f6073d != null) {
                String[] enabledProtocols = sSLSocket.getEnabledProtocols();
                C1241e.m3516f(enabledProtocols, "sslSocket.enabledProtocols");
                strArr2 = C2129c.m5527o(enabledProtocols, lVar.f6073d, C1966a.f5800a);
            } else {
                strArr2 = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            C1241e.m3516f(supportedCipherSuites, "supportedCipherSuites");
            C2080j.C2082b bVar2 = C2080j.f6055t;
            Comparator<String> comparator2 = C2080j.f6037b;
            Comparator<String> comparator3 = C2080j.f6037b;
            byte[] bArr = C2129c.f6169a;
            int length = supportedCipherSuites.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                }
                if (((C2080j.C2081a) comparator3).compare(supportedCipherSuites[i3], "TLS_FALLBACK_SCSV") == 0) {
                    break;
                }
                i3++;
            }
            if (z2 && i3 != -1) {
                C1241e.m3516f(strArr, "cipherSuitesIntersection");
                String str = supportedCipherSuites[i3];
                C1241e.m3516f(str, "supportedCipherSuites[indexOfFallbackScsv]");
                Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
                C1241e.m3516f(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                strArr = (String[]) copyOf;
                strArr[strArr.length - 1] = str;
            }
            C2087l.C2088a aVar = new C2087l.C2088a(lVar);
            C1241e.m3516f(strArr, "cipherSuitesIntersection");
            aVar.mo6588b((String[]) Arrays.copyOf(strArr, strArr.length));
            C1241e.m3516f(strArr2, "tlsVersionsIntersection");
            aVar.mo6591e((String[]) Arrays.copyOf(strArr2, strArr2.length));
            C2087l a = aVar.mo6587a();
            if (a.mo6583c() != null) {
                sSLSocket.setEnabledProtocols(a.f6073d);
            }
            if (a.mo6581a() != null) {
                sSLSocket.setEnabledCipherSuites(a.f6072c);
            }
            return lVar;
        }
        StringBuilder a2 = C0001b.m0a("Unable to find acceptable protocols. isFallback=");
        a2.append(this.f12c);
        a2.append(',');
        a2.append(" modes=");
        a2.append(this.f13d);
        a2.append(',');
        a2.append(" supported protocols=");
        String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
        C1241e.m3515e(enabledProtocols2);
        String arrays = Arrays.toString(enabledProtocols2);
        C1241e.m3516f(arrays, "java.util.Arrays.toString(this)");
        a2.append(arrays);
        throw new UnknownServiceException(a2.toString());
    }
}
