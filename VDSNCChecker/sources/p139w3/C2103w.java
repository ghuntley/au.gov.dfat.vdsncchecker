package p139w3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p025d3.C0797a;
import p025d3.C0802f;
import p031e3.C0870a;
import p042g2.C0955a;
import p049h3.C1013a;
import p067k3.C1205h;
import p067k3.C1209l;
import p072l2.C1241e;
import p120t2.C1791e;
import p126u2.C1845f;
import p144x3.C2129c;

/* renamed from: w3.w */
public final class C2103w implements Iterable<C1791e<? extends String, ? extends String>>, C0870a {

    /* renamed from: f */
    public static final C2105b f6111f = new C2105b((C0802f) null);

    /* renamed from: e */
    public final String[] f6112e;

    /* renamed from: w3.w$a */
    public static final class C2104a {

        /* renamed from: a */
        public final List<String> f6113a = new ArrayList(20);

        /* renamed from: a */
        public final C2104a mo6620a(String str, String str2) {
            C1241e.m3517j(str, "name");
            C1241e.m3517j(str2, "value");
            C2105b bVar = C2103w.f6111f;
            bVar.mo6624a(str);
            bVar.mo6625b(str2, str);
            mo6621b(str, str2);
            return this;
        }

        /* renamed from: b */
        public final C2104a mo6621b(String str, String str2) {
            C1241e.m3517j(str, "name");
            C1241e.m3517j(str2, "value");
            this.f6113a.add(str);
            this.f6113a.add(C1209l.m3455j0(str2).toString());
            return this;
        }

        /* renamed from: c */
        public final C2103w mo6622c() {
            Object[] array = this.f6113a.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new C2103w((String[]) array, (C0802f) null);
        }

        /* renamed from: d */
        public final C2104a mo6623d(String str) {
            int i = 0;
            while (i < this.f6113a.size()) {
                if (C1205h.m3427K(str, this.f6113a.get(i), true)) {
                    this.f6113a.remove(i);
                    this.f6113a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }
    }

    /* renamed from: w3.w$b */
    public static final class C2105b {
        public C2105b(C0802f fVar) {
        }

        /* renamed from: a */
        public final void mo6624a(String str) {
            if (str.length() > 0) {
                int length = str.length();
                int i = 0;
                while (i < length) {
                    char charAt = str.charAt(i);
                    if ('!' <= charAt && '~' >= charAt) {
                        i++;
                    } else {
                        throw new IllegalArgumentException(C2129c.m5520h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* renamed from: b */
        public final void mo6625b(String str, String str2) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if (charAt == 9 || (' ' <= charAt && '~' >= charAt)) {
                    i++;
                } else {
                    throw new IllegalArgumentException(C2129c.m5520h("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str).toString());
                }
            }
        }

        /* renamed from: c */
        public final C2103w mo6626c(String... strArr) {
            C1241e.m3517j(strArr, "namesAndValues");
            if (strArr.length % 2 == 0) {
                Object clone = strArr.clone();
                Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                String[] strArr2 = (String[]) clone;
                int length = strArr2.length;
                int i = 0;
                while (i < length) {
                    if (strArr2[i] != null) {
                        String str = strArr2[i];
                        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                        strArr2[i] = C1209l.m3455j0(str).toString();
                        i++;
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                }
                C1013a C = C0955a.m2722C(C0955a.m2726G(0, strArr2.length), 2);
                int i2 = C.f3728e;
                int i3 = C.f3729f;
                int i4 = C.f3730g;
                if (i4 < 0 ? i2 >= i3 : i2 <= i3) {
                    while (true) {
                        String str2 = strArr2[i2];
                        String str3 = strArr2[i2 + 1];
                        mo6624a(str2);
                        mo6625b(str3, str2);
                        if (i2 == i3) {
                            break;
                        }
                        i2 += i4;
                    }
                }
                return new C2103w(strArr2, (C0802f) null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    public C2103w(String[] strArr, C0802f fVar) {
        this.f6112e = strArr;
    }

    /* renamed from: b */
    public final String mo6611b(String str) {
        C1241e.m3517j(str, "name");
        String[] strArr = this.f6112e;
        C1013a C = C0955a.m2722C(C0955a.m2738l(strArr.length - 2, 0), 2);
        int i = C.f3728e;
        int i2 = C.f3729f;
        int i3 = C.f3730g;
        if (i3 < 0 ? i >= i2 : i <= i2) {
            while (!C1205h.m3427K(str, strArr[i], true)) {
                if (i != i2) {
                    i += i3;
                }
            }
            return strArr[i + 1];
        }
        return null;
    }

    /* renamed from: c */
    public final String mo6612c(int i) {
        return this.f6112e[i * 2];
    }

    /* renamed from: d */
    public final C2104a mo6613d() {
        C2104a aVar = new C2104a();
        List<String> list = aVar.f6113a;
        String[] strArr = this.f6112e;
        C1241e.m3517j(list, "$this$addAll");
        C1241e.m3517j(strArr, "elements");
        list.addAll(C1845f.m5041H(strArr));
        return aVar;
    }

    /* renamed from: e */
    public final String mo6614e(int i) {
        return this.f6112e[(i * 2) + 1];
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2103w) && Arrays.equals(this.f6112e, ((C2103w) obj).f6112e);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f6112e);
    }

    public Iterator<C1791e<String, String>> iterator() {
        int size = size();
        C1791e[] eVarArr = new C1791e[size];
        for (int i = 0; i < size; i++) {
            eVarArr[i] = new C1791e(mo6612c(i), mo6614e(i));
        }
        return new C0797a(eVarArr);
    }

    public final int size() {
        return this.f6112e.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            sb.append(mo6612c(i));
            sb.append(": ");
            sb.append(mo6614e(i));
            sb.append("\n");
        }
        String sb2 = sb.toString();
        C1241e.m3516f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
