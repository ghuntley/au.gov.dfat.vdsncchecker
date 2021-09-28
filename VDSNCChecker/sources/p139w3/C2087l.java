package p139w3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p072l2.C1241e;
import p099q.C1599h;
import p126u2.C1850k;
import p132v2.C1966a;
import p139w3.C2080j;
import p144x3.C2129c;

/* renamed from: w3.l */
public final class C2087l {

    /* renamed from: e */
    public static final C2087l f6068e;

    /* renamed from: f */
    public static final C2087l f6069f = new C2087l(false, false, (String[]) null, (String[]) null);

    /* renamed from: a */
    public final boolean f6070a;

    /* renamed from: b */
    public final boolean f6071b;

    /* renamed from: c */
    public final String[] f6072c;

    /* renamed from: d */
    public final String[] f6073d;

    /* renamed from: w3.l$a */
    public static final class C2088a {

        /* renamed from: a */
        public boolean f6074a;

        /* renamed from: b */
        public String[] f6075b;

        /* renamed from: c */
        public String[] f6076c;

        /* renamed from: d */
        public boolean f6077d;

        public C2088a(C2087l lVar) {
            this.f6074a = lVar.f6070a;
            this.f6075b = lVar.f6072c;
            this.f6076c = lVar.f6073d;
            this.f6077d = lVar.f6071b;
        }

        public C2088a(boolean z) {
            this.f6074a = z;
        }

        /* renamed from: a */
        public final C2087l mo6587a() {
            return new C2087l(this.f6074a, this.f6077d, this.f6075b, this.f6076c);
        }

        /* renamed from: b */
        public final C2088a mo6588b(String... strArr) {
            C1241e.m3517j(strArr, "cipherSuites");
            if (this.f6074a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    this.f6075b = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        /* renamed from: c */
        public final C2088a mo6589c(C2080j... jVarArr) {
            C1241e.m3517j(jVarArr, "cipherSuites");
            if (this.f6074a) {
                ArrayList arrayList = new ArrayList(jVarArr.length);
                for (C2080j jVar : jVarArr) {
                    arrayList.add(jVar.f6056a);
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                mo6588b((String[]) Arrays.copyOf(strArr, strArr.length));
                return this;
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        /* renamed from: d */
        public final C2088a mo6590d(boolean z) {
            if (this.f6074a) {
                this.f6077d = z;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        /* renamed from: e */
        public final C2088a mo6591e(String... strArr) {
            C1241e.m3517j(strArr, "tlsVersions");
            if (this.f6074a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    this.f6076c = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        /* renamed from: f */
        public final C2088a mo6592f(C2085k0... k0VarArr) {
            if (this.f6074a) {
                ArrayList arrayList = new ArrayList(k0VarArr.length);
                for (C2085k0 k0Var : k0VarArr) {
                    arrayList.add(k0Var.f6067e);
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                mo6591e((String[]) Arrays.copyOf(strArr, strArr.length));
                return this;
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
    }

    static {
        C2080j jVar = C2080j.f6052q;
        C2080j jVar2 = C2080j.f6053r;
        C2080j jVar3 = C2080j.f6054s;
        C2080j jVar4 = C2080j.f6046k;
        C2080j jVar5 = C2080j.f6048m;
        C2080j jVar6 = C2080j.f6047l;
        C2080j jVar7 = C2080j.f6049n;
        C2080j jVar8 = C2080j.f6051p;
        C2080j jVar9 = C2080j.f6050o;
        C2080j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9};
        C2080j[] jVarArr2 = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, C2080j.f6044i, C2080j.f6045j, C2080j.f6042g, C2080j.f6043h, C2080j.f6040e, C2080j.f6041f, C2080j.f6039d};
        C2088a aVar = new C2088a(true);
        aVar.mo6589c((C2080j[]) Arrays.copyOf(jVarArr, 9));
        C2085k0 k0Var = C2085k0.TLS_1_3;
        C2085k0 k0Var2 = C2085k0.TLS_1_2;
        aVar.mo6592f(k0Var, k0Var2);
        aVar.mo6590d(true);
        aVar.mo6587a();
        C2088a aVar2 = new C2088a(true);
        aVar2.mo6589c((C2080j[]) Arrays.copyOf(jVarArr2, 16));
        aVar2.mo6592f(k0Var, k0Var2);
        aVar2.mo6590d(true);
        f6068e = aVar2.mo6587a();
        C2088a aVar3 = new C2088a(true);
        aVar3.mo6589c((C2080j[]) Arrays.copyOf(jVarArr2, 16));
        aVar3.mo6592f(k0Var, k0Var2, C2085k0.TLS_1_1, C2085k0.TLS_1_0);
        aVar3.mo6590d(true);
        aVar3.mo6587a();
    }

    public C2087l(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f6070a = z;
        this.f6071b = z2;
        this.f6072c = strArr;
        this.f6073d = strArr2;
    }

    /* renamed from: a */
    public final List<C2080j> mo6581a() {
        String[] strArr = this.f6072c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String b : strArr) {
            arrayList.add(C2080j.f6055t.mo6574b(b));
        }
        return C1850k.m5054P(arrayList);
    }

    /* renamed from: b */
    public final boolean mo6582b(SSLSocket sSLSocket) {
        C1241e.m3517j(sSLSocket, "socket");
        if (!this.f6070a) {
            return false;
        }
        String[] strArr = this.f6073d;
        if (strArr != null && !C2129c.m5521i(strArr, sSLSocket.getEnabledProtocols(), C1966a.f5800a)) {
            return false;
        }
        String[] strArr2 = this.f6072c;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        C2080j.C2082b bVar = C2080j.f6055t;
        Comparator<String> comparator = C2080j.f6037b;
        if (!C2129c.m5521i(strArr2, enabledCipherSuites, C2080j.f6037b)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final List<C2085k0> mo6583c() {
        String[] strArr = this.f6073d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(C2085k0.f6066l.mo6580a(a));
        }
        return C1850k.m5054P(arrayList);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2087l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.f6070a;
        C2087l lVar = (C2087l) obj;
        if (z != lVar.f6070a) {
            return false;
        }
        return !z || (Arrays.equals(this.f6072c, lVar.f6072c) && Arrays.equals(this.f6073d, lVar.f6073d) && this.f6071b == lVar.f6071b);
    }

    public int hashCode() {
        if (!this.f6070a) {
            return 17;
        }
        String[] strArr = this.f6072c;
        int i = 0;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f6073d;
        if (strArr2 != null) {
            i = Arrays.hashCode(strArr2);
        }
        return ((hashCode + i) * 31) + (this.f6071b ^ true ? 1 : 0);
    }

    public String toString() {
        if (!this.f6070a) {
            return "ConnectionSpec()";
        }
        StringBuilder a = C1599h.m4503a("ConnectionSpec(", "cipherSuites=");
        a.append(Objects.toString(mo6581a(), "[all enabled]"));
        a.append(", ");
        a.append("tlsVersions=");
        a.append(Objects.toString(mo6583c(), "[all enabled]"));
        a.append(", ");
        a.append("supportsTlsExtensions=");
        a.append(this.f6071b);
        a.append(')');
        return a.toString();
    }
}
