package p139w3;

import p025d3.C0802f;
import p063k.C1142f;
import p072l2.C1241e;

/* renamed from: w3.k0 */
public enum C2085k0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: l */
    public static final C2086a f6066l = null;

    /* renamed from: e */
    public final String f6067e;

    /* renamed from: w3.k0$a */
    public static final class C2086a {
        public C2086a(C0802f fVar) {
        }

        /* renamed from: a */
        public final C2085k0 mo6580a(String str) {
            C1241e.m3517j(str, "javaName");
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return C2085k0.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return C2085k0.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return C2085k0.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return C2085k0.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return C2085k0.SSL_3_0;
            }
            throw new IllegalArgumentException(C1142f.m3365a("Unexpected TLS version: ", str));
        }
    }

    /* access modifiers changed from: public */
    static {
        f6066l = new C2086a((C0802f) null);
    }

    /* access modifiers changed from: public */
    C2085k0(String str) {
        this.f6067e = str;
    }
}
