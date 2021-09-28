package p139w3;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import p025d3.C0802f;
import p067k3.C1205h;
import p072l2.C1241e;

/* renamed from: w3.j */
public final class C2080j {

    /* renamed from: b */
    public static final Comparator<String> f6037b = new C2081a();

    /* renamed from: c */
    public static final Map<String, C2080j> f6038c = new LinkedHashMap();

    /* renamed from: d */
    public static final C2080j f6039d;

    /* renamed from: e */
    public static final C2080j f6040e;

    /* renamed from: f */
    public static final C2080j f6041f;

    /* renamed from: g */
    public static final C2080j f6042g;

    /* renamed from: h */
    public static final C2080j f6043h;

    /* renamed from: i */
    public static final C2080j f6044i;

    /* renamed from: j */
    public static final C2080j f6045j;

    /* renamed from: k */
    public static final C2080j f6046k;

    /* renamed from: l */
    public static final C2080j f6047l;

    /* renamed from: m */
    public static final C2080j f6048m;

    /* renamed from: n */
    public static final C2080j f6049n;

    /* renamed from: o */
    public static final C2080j f6050o;

    /* renamed from: p */
    public static final C2080j f6051p;

    /* renamed from: q */
    public static final C2080j f6052q;

    /* renamed from: r */
    public static final C2080j f6053r;

    /* renamed from: s */
    public static final C2080j f6054s;

    /* renamed from: t */
    public static final C2082b f6055t;

    /* renamed from: a */
    public final String f6056a;

    /* renamed from: w3.j$a */
    public static final class C2081a implements Comparator<String> {
        public int compare(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            C1241e.m3517j(str, "a");
            C1241e.m3517j(str2, "b");
            int min = Math.min(str.length(), str2.length());
            int i = 4;
            while (true) {
                if (i < min) {
                    char charAt = str.charAt(i);
                    char charAt2 = str2.charAt(i);
                    if (charAt == charAt2) {
                        i++;
                    } else if (C1241e.m3519l(charAt, charAt2) < 0) {
                        return -1;
                    }
                } else {
                    int length = str.length();
                    int length2 = str2.length();
                    if (length == length2) {
                        return 0;
                    }
                    if (length < length2) {
                        return -1;
                    }
                }
            }
            return 1;
        }
    }

    /* renamed from: w3.j$b */
    public static final class C2082b {
        public C2082b(C0802f fVar) {
        }

        /* renamed from: a */
        public static final C2080j m5435a(C2082b bVar, String str, int i) {
            C2080j jVar = new C2080j(str, (C0802f) null);
            C2080j.f6038c.put(str, jVar);
            return jVar;
        }

        /* renamed from: b */
        public final synchronized C2080j mo6574b(String str) {
            C2080j jVar;
            C1241e.m3517j(str, "javaName");
            Map<String, C2080j> map = C2080j.f6038c;
            jVar = (C2080j) ((LinkedHashMap) map).get(str);
            if (jVar == null) {
                jVar = (C2080j) ((LinkedHashMap) map).get(mo6575c(str));
                if (jVar == null) {
                    jVar = new C2080j(str, (C0802f) null);
                }
                map.put(str, jVar);
            }
            return jVar;
        }

        /* renamed from: c */
        public final String mo6575c(String str) {
            if (C1205h.m3434R(str, "TLS_", false, 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("SSL_");
                String substring = str.substring(4);
                C1241e.m3516f(substring, "(this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                return sb.toString();
            } else if (!C1205h.m3434R(str, "SSL_", false, 2)) {
                return str;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("TLS_");
                String substring2 = str.substring(4);
                C1241e.m3516f(substring2, "(this as java.lang.String).substring(startIndex)");
                sb2.append(substring2);
                return sb2.toString();
            }
        }
    }

    static {
        C2082b bVar = new C2082b((C0802f) null);
        f6055t = bVar;
        C2082b.m5435a(bVar, "SSL_RSA_WITH_NULL_MD5", 1);
        C2082b.m5435a(bVar, "SSL_RSA_WITH_NULL_SHA", 2);
        C2082b.m5435a(bVar, "SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        C2082b.m5435a(bVar, "SSL_RSA_WITH_RC4_128_MD5", 4);
        C2082b.m5435a(bVar, "SSL_RSA_WITH_RC4_128_SHA", 5);
        C2082b.m5435a(bVar, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        C2082b.m5435a(bVar, "SSL_RSA_WITH_DES_CBC_SHA", 9);
        f6039d = C2082b.m5435a(bVar, "SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        C2082b.m5435a(bVar, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        C2082b.m5435a(bVar, "SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        C2082b.m5435a(bVar, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        C2082b.m5435a(bVar, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        C2082b.m5435a(bVar, "SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        C2082b.m5435a(bVar, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        C2082b.m5435a(bVar, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        C2082b.m5435a(bVar, "SSL_DH_anon_WITH_RC4_128_MD5", 24);
        C2082b.m5435a(bVar, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        C2082b.m5435a(bVar, "SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        C2082b.m5435a(bVar, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        C2082b.m5435a(bVar, "TLS_KRB5_WITH_DES_CBC_SHA", 30);
        C2082b.m5435a(bVar, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        C2082b.m5435a(bVar, "TLS_KRB5_WITH_RC4_128_SHA", 32);
        C2082b.m5435a(bVar, "TLS_KRB5_WITH_DES_CBC_MD5", 34);
        C2082b.m5435a(bVar, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        C2082b.m5435a(bVar, "TLS_KRB5_WITH_RC4_128_MD5", 36);
        C2082b.m5435a(bVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        C2082b.m5435a(bVar, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        C2082b.m5435a(bVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        C2082b.m5435a(bVar, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        f6040e = C2082b.m5435a(bVar, "TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        C2082b.m5435a(bVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        C2082b.m5435a(bVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        C2082b.m5435a(bVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        f6041f = C2082b.m5435a(bVar, "TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        C2082b.m5435a(bVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        C2082b.m5435a(bVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        C2082b.m5435a(bVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        C2082b.m5435a(bVar, "TLS_RSA_WITH_NULL_SHA256", 59);
        C2082b.m5435a(bVar, "TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        C2082b.m5435a(bVar, "TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        C2082b.m5435a(bVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        C2082b.m5435a(bVar, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        C2082b.m5435a(bVar, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        C2082b.m5435a(bVar, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        C2082b.m5435a(bVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        C2082b.m5435a(bVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        C2082b.m5435a(bVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        C2082b.m5435a(bVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        C2082b.m5435a(bVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        C2082b.m5435a(bVar, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        C2082b.m5435a(bVar, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        C2082b.m5435a(bVar, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        C2082b.m5435a(bVar, "TLS_PSK_WITH_RC4_128_SHA", 138);
        C2082b.m5435a(bVar, "TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        C2082b.m5435a(bVar, "TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        C2082b.m5435a(bVar, "TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        C2082b.m5435a(bVar, "TLS_RSA_WITH_SEED_CBC_SHA", 150);
        f6042g = C2082b.m5435a(bVar, "TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        f6043h = C2082b.m5435a(bVar, "TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        C2082b.m5435a(bVar, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        C2082b.m5435a(bVar, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        C2082b.m5435a(bVar, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        C2082b.m5435a(bVar, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        C2082b.m5435a(bVar, "TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        C2082b.m5435a(bVar, "TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        C2082b.m5435a(bVar, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        C2082b.m5435a(bVar, "TLS_FALLBACK_SCSV", 22016);
        C2082b.m5435a(bVar, "TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        C2082b.m5435a(bVar, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        C2082b.m5435a(bVar, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        C2082b.m5435a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        C2082b.m5435a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        C2082b.m5435a(bVar, "TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        C2082b.m5435a(bVar, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        C2082b.m5435a(bVar, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        C2082b.m5435a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        C2082b.m5435a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        C2082b.m5435a(bVar, "TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        C2082b.m5435a(bVar, "TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        C2082b.m5435a(bVar, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        C2082b.m5435a(bVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        C2082b.m5435a(bVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        C2082b.m5435a(bVar, "TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        C2082b.m5435a(bVar, "TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        C2082b.m5435a(bVar, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        f6044i = C2082b.m5435a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        f6045j = C2082b.m5435a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        C2082b.m5435a(bVar, "TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        C2082b.m5435a(bVar, "TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        C2082b.m5435a(bVar, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        C2082b.m5435a(bVar, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        C2082b.m5435a(bVar, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        C2082b.m5435a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        C2082b.m5435a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        C2082b.m5435a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        C2082b.m5435a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        C2082b.m5435a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        C2082b.m5435a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        C2082b.m5435a(bVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        C2082b.m5435a(bVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        f6046k = C2082b.m5435a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        f6047l = C2082b.m5435a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        C2082b.m5435a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        C2082b.m5435a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        f6048m = C2082b.m5435a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        f6049n = C2082b.m5435a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        C2082b.m5435a(bVar, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        C2082b.m5435a(bVar, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        C2082b.m5435a(bVar, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        C2082b.m5435a(bVar, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        f6050o = C2082b.m5435a(bVar, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        f6051p = C2082b.m5435a(bVar, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        C2082b.m5435a(bVar, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        C2082b.m5435a(bVar, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        f6052q = C2082b.m5435a(bVar, "TLS_AES_128_GCM_SHA256", 4865);
        f6053r = C2082b.m5435a(bVar, "TLS_AES_256_GCM_SHA384", 4866);
        f6054s = C2082b.m5435a(bVar, "TLS_CHACHA20_POLY1305_SHA256", 4867);
        C2082b.m5435a(bVar, "TLS_AES_128_CCM_SHA256", 4868);
        C2082b.m5435a(bVar, "TLS_AES_128_CCM_8_SHA256", 4869);
    }

    public C2080j(String str, C0802f fVar) {
        this.f6056a = str;
    }

    public String toString() {
        return this.f6056a;
    }
}
