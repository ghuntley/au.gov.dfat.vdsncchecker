package p073l3;

import java.io.EOFException;
import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.logging.Logger;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p000a.C0001b;
import p019c3.C0636l;
import p042g2.C0955a;
import p055i3.C1035b;
import p062j4.C1112f;
import p067k3.C1205h;
import p067k3.C1209l;
import p072l2.C1241e;
import p073l3.C1317t0;
import p085n3.C1461d;
import p085n3.C1474o;
import p085n3.C1475p;
import p097p3.C1579a;
import p097p3.C1580b;
import p097p3.C1581c;
import p097p3.C1582d;
import p103q3.C1611a;
import p103q3.C1615c;
import p103q3.C1618e;
import p109r3.C1685b;
import p115s3.C1722a;
import p115s3.C1733k;
import p115s3.C1740n;
import p120t2.C1792f;
import p120t2.C1798k;
import p121t3.C1799a;
import p126u2.C1852m;
import p127u3.C1859b;
import p127u3.C1860c;
import p127u3.C1862d;
import p133v3.C1970c;
import p138w2.C2043d;
import p138w2.C2046f;
import p144x3.C2129c;
import p154z3.C2205a;
import p154z3.C2207c;
import p154z3.C2208d;

/* renamed from: l3.u */
public final class C1320u {
    /* renamed from: A */
    public static final String m3694A(String str) {
        C1241e.m3517j(str, "$this$toCanonicalHost");
        int i = 0;
        int i2 = -1;
        if (C1209l.m3439T(str, ":", false, 2)) {
            InetAddress h = (!C1205h.m3434R(str, "[", false, 2) || !C1205h.m3426J(str, "]", false, 2)) ? m3704h(str, 0, str.length()) : m3704h(str, 1, str.length() - 1);
            if (h == null) {
                return null;
            }
            byte[] address = h.getAddress();
            if (address.length == 16) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < address.length) {
                    int i5 = i3;
                    while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                        i5 += 2;
                    }
                    int i6 = i5 - i3;
                    if (i6 > i4 && i6 >= 4) {
                        i2 = i3;
                        i4 = i6;
                    }
                    i3 = i5 + 2;
                }
                C1112f fVar = new C1112f();
                while (i < address.length) {
                    if (i == i2) {
                        fVar.mo4633X(58);
                        i += i4;
                        if (i == 16) {
                            fVar.mo4633X(58);
                        }
                    } else {
                        if (i > 0) {
                            fVar.mo4633X(58);
                        }
                        byte b = address[i];
                        byte[] bArr = C2129c.f6169a;
                        fVar.mo4648j((long) (((b & 255) << 8) | (address[i + 1] & 255)));
                        i += 2;
                    }
                }
                return fVar.mo4620J();
            } else if (address.length == 4) {
                return h.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                C1241e.m3516f(ascii, "IDN.toASCII(host)");
                Locale locale = Locale.US;
                C1241e.m3516f(locale, "Locale.US");
                String lowerCase = ascii.toLowerCase(locale);
                C1241e.m3516f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        break;
                    }
                    char charAt = lowerCase.charAt(i7);
                    if (C1241e.m3519l(charAt, 31) <= 0) {
                        break;
                    } else if (C1241e.m3519l(charAt, 127) >= 0) {
                        break;
                    } else if (C1209l.m3444Y(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                        break;
                    } else {
                        i7++;
                    }
                }
                i = 1;
                if (i != 0) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    /* renamed from: B */
    public static final String m3695B(C2043d<?> dVar) {
        String str;
        if (dVar instanceof C1461d) {
            return dVar.toString();
        }
        try {
            str = dVar + '@' + m3710n(dVar);
        } catch (Throwable th) {
            str = C0955a.m2736j(th);
        }
        Throwable a = C1792f.m4971a(str);
        String str2 = str;
        if (a != null) {
            str2 = dVar.getClass().getName() + '@' + m3710n(dVar);
        }
        return (String) str2;
    }

    /* renamed from: C */
    public static final <T> Object m3696C(Object obj, C0636l<? super Throwable, C1798k> lVar) {
        Throwable a = C1792f.m4971a(obj);
        return a == null ? lVar != null ? new C1314s(obj, lVar) : obj : new C1312r(a, false, 2);
    }

    /* renamed from: a */
    public static final C1862d m3697a(C1615c cVar) {
        StringBuilder a = C0001b.m0a("Value of type '");
        a.append(cVar.mo5760d());
        a.append("' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '");
        a.append(cVar.mo5766i());
        a.append("'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
        return new C1862d(a.toString(), 1);
    }

    /* renamed from: b */
    public static final C1862d m3698b(int i, String str) {
        C1241e.m3517j(str, "message");
        if (i >= 0) {
            str = "Unexpected JSON token at offset " + i + ": " + str;
        }
        return new C1862d(str, 0);
    }

    /* renamed from: c */
    public static final C1862d m3699c(int i, String str, String str2) {
        C1241e.m3517j(str, "message");
        C1241e.m3517j(str2, "input");
        return m3698b(i, str + "\nJSON input: " + m3715s(str2, i));
    }

    /* renamed from: d */
    public static final void m3700d(C2205a aVar, C2207c cVar, String str) {
        C2208d.C2210b bVar = C2208d.f6346j;
        Logger logger = C2208d.f6345i;
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.f6343f);
        sb.append(' ');
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        C1241e.m3516f(format, "java.lang.String.format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(aVar.f6335c);
        logger.fine(sb.toString());
    }

    /* renamed from: e */
    public static void m3701e(C2046f fVar, CancellationException cancellationException, int i, Object obj) {
        int i2 = C1317t0.f4328b;
        C1317t0 t0Var = (C1317t0) fVar.get(C1317t0.C1319b.f4329e);
        if (t0Var != null) {
            t0Var.mo5110z((CancellationException) null);
        }
    }

    /* renamed from: f */
    public static final C1615c m3702f(C1615c cVar, C1970c cVar2) {
        C1580b<?> a;
        C1241e.m3517j(cVar, "<this>");
        C1241e.m3517j(cVar2, "module");
        if (!C1241e.m3513b(cVar.mo5766i(), C1618e.C1619a.f4996a)) {
            return cVar.mo5758b() ? cVar.mo5764h(0) : cVar;
        }
        C1241e.m3517j(cVar2, "<this>");
        C1241e.m3517j(cVar, "descriptor");
        C1035b<?> l = m3708l(cVar);
        C1615c cVar3 = null;
        if (!(l == null || (a = cVar2.mo6466a(l, C1852m.f5542e)) == null)) {
            cVar3 = a.mo2491a();
        }
        return cVar3 == null ? cVar : m3702f(cVar3, cVar2);
    }

    /* renamed from: g */
    public static final byte m3703g(char c) {
        if (c < '~') {
            return C1859b.f5549c[c];
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        r0 = r5;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.net.InetAddress m3704h(java.lang.String r17, int r18, int r19) {
        /*
            r0 = r17
            r1 = r19
            r2 = 16
            byte[] r3 = new byte[r2]
            r4 = -1
            r5 = 0
            r6 = r18
            r8 = r4
            r9 = r8
            r7 = r5
        L_0x000f:
            r10 = 0
            if (r6 >= r1) goto L_0x00df
            if (r7 != r2) goto L_0x0015
            return r10
        L_0x0015:
            int r11 = r6 + 2
            r12 = 4
            r13 = 255(0xff, float:3.57E-43)
            if (r11 > r1) goto L_0x0033
            java.lang.String r14 = "::"
            boolean r14 = p067k3.C1205h.m3433Q(r0, r14, r6, r5, r12)
            if (r14 == 0) goto L_0x0033
            if (r8 == r4) goto L_0x0027
            return r10
        L_0x0027:
            int r7 = r7 + 2
            if (r11 != r1) goto L_0x002f
            r0 = r2
            r8 = r7
            goto L_0x00e0
        L_0x002f:
            r8 = r7
            r9 = r11
            goto L_0x00ac
        L_0x0033:
            if (r7 == 0) goto L_0x00ab
            java.lang.String r11 = ":"
            boolean r11 = p067k3.C1205h.m3433Q(r0, r11, r6, r5, r12)
            if (r11 == 0) goto L_0x0041
            int r6 = r6 + 1
            goto L_0x00ab
        L_0x0041:
            java.lang.String r11 = "."
            boolean r6 = p067k3.C1205h.m3433Q(r0, r11, r6, r5, r12)
            if (r6 == 0) goto L_0x00aa
            int r6 = r7 + -2
            r11 = r6
        L_0x004c:
            if (r9 >= r1) goto L_0x009c
            if (r11 != r2) goto L_0x0051
            goto L_0x005b
        L_0x0051:
            if (r11 == r6) goto L_0x005f
            char r14 = r0.charAt(r9)
            r15 = 46
            if (r14 == r15) goto L_0x005d
        L_0x005b:
            r0 = r5
            goto L_0x00a2
        L_0x005d:
            int r9 = r9 + 1
        L_0x005f:
            r15 = r5
            r14 = r9
        L_0x0061:
            if (r14 >= r1) goto L_0x008b
            char r5 = r0.charAt(r14)
            r2 = 48
            int r16 = p072l2.C1241e.m3519l(r5, r2)
            if (r16 < 0) goto L_0x008b
            r4 = 57
            int r4 = p072l2.C1241e.m3519l(r5, r4)
            if (r4 <= 0) goto L_0x0078
            goto L_0x008b
        L_0x0078:
            if (r15 != 0) goto L_0x007d
            if (r9 == r14) goto L_0x007d
            goto L_0x00a1
        L_0x007d:
            int r15 = r15 * 10
            int r15 = r15 + r5
            int r15 = r15 - r2
            if (r15 <= r13) goto L_0x0084
            goto L_0x00a1
        L_0x0084:
            int r14 = r14 + 1
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x0061
        L_0x008b:
            int r2 = r14 - r9
            if (r2 != 0) goto L_0x0090
            goto L_0x00a1
        L_0x0090:
            int r2 = r11 + 1
            byte r4 = (byte) r15
            r3[r11] = r4
            r11 = r2
            r9 = r14
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x004c
        L_0x009c:
            int r6 = r6 + r12
            if (r11 != r6) goto L_0x00a1
            r0 = 1
            goto L_0x00a2
        L_0x00a1:
            r0 = 0
        L_0x00a2:
            if (r0 != 0) goto L_0x00a5
            return r10
        L_0x00a5:
            int r7 = r7 + 2
            r0 = 16
            goto L_0x00e0
        L_0x00aa:
            return r10
        L_0x00ab:
            r9 = r6
        L_0x00ac:
            r6 = r9
            r2 = 0
        L_0x00ae:
            if (r6 >= r1) goto L_0x00c2
            char r4 = r0.charAt(r6)
            int r4 = p144x3.C2129c.m5528p(r4)
            r5 = -1
            if (r4 != r5) goto L_0x00bc
            goto L_0x00c2
        L_0x00bc:
            int r2 = r2 << 4
            int r2 = r2 + r4
            int r6 = r6 + 1
            goto L_0x00ae
        L_0x00c2:
            int r4 = r6 - r9
            if (r4 == 0) goto L_0x00de
            if (r4 <= r12) goto L_0x00c9
            goto L_0x00de
        L_0x00c9:
            int r4 = r7 + 1
            int r5 = r2 >>> 8
            r5 = r5 & r13
            byte r5 = (byte) r5
            r3[r7] = r5
            int r7 = r4 + 1
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r4] = r2
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x000f
        L_0x00de:
            return r10
        L_0x00df:
            r0 = r2
        L_0x00e0:
            if (r7 == r0) goto L_0x00f5
            r1 = -1
            if (r8 != r1) goto L_0x00e6
            return r10
        L_0x00e6:
            int r1 = r7 - r8
            int r2 = 16 - r1
            java.lang.System.arraycopy(r3, r8, r3, r2, r1)
            int r2 = 16 - r7
            int r2 = r2 + r8
            r0 = 0
            byte r0 = (byte) r0
            java.util.Arrays.fill(r3, r8, r2, r0)
        L_0x00f5:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p073l3.C1320u.m3704h(java.lang.String, int, int):java.net.InetAddress");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v2, types: [t3.j] */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T m3705i(p121t3.C1803d r6, p097p3.C1579a<T> r7) {
        /*
            boolean r0 = r7 instanceof p115s3.C1722a
            if (r0 == 0) goto L_0x00ed
            t3.a r0 = r6.mo6114a()
            t3.c r0 = r0.f5448a
            boolean r0 = r0.f5459h
            if (r0 == 0) goto L_0x0010
            goto L_0x00ed
        L_0x0010:
            t3.e r0 = r6.mo6115h()
            q3.c r1 = r7.mo2491a()
            boolean r2 = r0 instanceof p121t3.C1808i
            r3 = -1
            if (r2 == 0) goto L_0x00b9
            t3.i r0 = (p121t3.C1808i) r0
            t3.a r1 = r6.mo6114a()
            t3.c r1 = r1.f5448a
            java.lang.String r1 = r1.f5460i
            java.lang.Object r2 = r0.get(r1)
            t3.e r2 = (p121t3.C1804e) r2
            r4 = 0
            if (r2 != 0) goto L_0x0031
            goto L_0x003e
        L_0x0031:
            boolean r5 = r2 instanceof p121t3.C1810j
            if (r5 == 0) goto L_0x0038
            r4 = r2
            t3.j r4 = (p121t3.C1810j) r4
        L_0x0038:
            if (r4 == 0) goto L_0x0094
            java.lang.String r4 = r4.mo6116b()
        L_0x003e:
            s3.a r7 = (p115s3.C1722a) r7
            v3.c r2 = r6.mo5883j()
            i3.b r7 = r7.mo5984e()
            p3.a r7 = r2.mo6467b(r7, r4)
            if (r7 != 0) goto L_0x0078
            if (r4 != 0) goto L_0x0053
            java.lang.String r6 = "missing class discriminator ('null')"
            goto L_0x0069
        L_0x0053:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "class discriminator '"
            r6.append(r7)
            r6.append(r4)
            r7 = 39
            r6.append(r7)
            java.lang.String r6 = r6.toString()
        L_0x0069:
            java.lang.String r7 = "Polymorphic serializer was not found for "
            java.lang.String r6 = p072l2.C1241e.m3522p(r7, r6)
            java.lang.String r7 = r0.toString()
            u3.d r6 = m3699c(r3, r6, r7)
            throw r6
        L_0x0078:
            t3.a r6 = r6.mo6114a()
            java.lang.String r2 = "<this>"
            p072l2.C1241e.m3517j(r6, r2)
            java.lang.String r2 = "discriminator"
            p072l2.C1241e.m3517j(r1, r2)
            u3.g r2 = new u3.g
            q3.c r3 = r7.mo2491a()
            r2.<init>(r6, r0, r1, r3)
            java.lang.Object r6 = r2.mo5875c(r7)
            return r6
        L_0x0094:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Element "
            java.lang.StringBuilder r7 = p000a.C0001b.m0a(r7)
            java.lang.Class r0 = r2.getClass()
            i3.b r0 = p025d3.C0810n.m2403a(r0)
            r7.append(r0)
            java.lang.String r0 = " is not a "
            r7.append(r0)
            java.lang.String r0 = "JsonPrimitive"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x00b9:
            java.lang.String r6 = "Expected "
            java.lang.StringBuilder r6 = p000a.C0001b.m0a(r6)
            java.lang.Class<t3.i> r7 = p121t3.C1808i.class
            i3.b r7 = p025d3.C0810n.m2403a(r7)
            r6.append(r7)
            java.lang.String r7 = " as the serialized body of "
            r6.append(r7)
            java.lang.String r7 = r1.mo5760d()
            r6.append(r7)
            java.lang.String r7 = ", but had "
            r6.append(r7)
            java.lang.Class r7 = r0.getClass()
            i3.b r7 = p025d3.C0810n.m2403a(r7)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            u3.d r6 = m3698b(r3, r6)
            throw r6
        L_0x00ed:
            java.lang.Object r6 = r7.mo2494d(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p073l3.C1320u.m3705i(t3.d, p3.a):java.lang.Object");
    }

    /* renamed from: j */
    public static final <T> C1579a<? extends T> m3706j(C1722a<T> aVar, C1685b bVar, String str) {
        String str2;
        C1579a<? extends T> b = bVar.mo5883j().mo6467b(aVar.mo5984e(), str);
        if (b != null) {
            return b;
        }
        C1035b<T> e = aVar.mo5984e();
        C1241e.m3517j(e, "baseClass");
        String str3 = "in the scope of '" + e.mo4037a() + '\'';
        if (str == null) {
            str2 = C1241e.m3522p("Class discriminator was missing and no default polymorphic serializers were registered ", str3);
        } else {
            str2 = "Class '" + str + "' is not registered for polymorphic serialization " + str3 + ".\nMark the base class as 'sealed' or register the serializer explicitly.";
        }
        throw new C1582d(str2);
    }

    /* renamed from: k */
    public static final String m3707k(long j) {
        StringBuilder sb;
        long j2;
        StringBuilder sb2;
        long j3;
        StringBuilder sb3;
        long j4;
        if (j <= ((long) -999500000)) {
            sb = new StringBuilder();
            j2 = j - ((long) 500000000);
        } else {
            if (j <= ((long) -999500)) {
                sb2 = new StringBuilder();
                j3 = j - ((long) 500000);
            } else {
                if (j <= 0) {
                    sb3 = new StringBuilder();
                    j4 = j - ((long) 500);
                } else if (j < ((long) 999500)) {
                    sb3 = new StringBuilder();
                    j4 = j + ((long) 500);
                } else if (j < ((long) 999500000)) {
                    sb2 = new StringBuilder();
                    j3 = j + ((long) 500000);
                } else {
                    sb = new StringBuilder();
                    j2 = j + ((long) 500000000);
                }
                sb3.append(j4 / ((long) 1000));
                sb3.append(" µs");
                String format = String.format("%6s", Arrays.copyOf(new Object[]{sb3.toString()}, 1));
                C1241e.m3516f(format, "java.lang.String.format(format, *args)");
                return format;
            }
            sb3.append(j3 / ((long) 1000000));
            sb3.append(" ms");
            String format2 = String.format("%6s", Arrays.copyOf(new Object[]{sb3.toString()}, 1));
            C1241e.m3516f(format2, "java.lang.String.format(format, *args)");
            return format2;
        }
        sb3.append(j2 / ((long) 1000000000));
        sb3.append(" s ");
        String format22 = String.format("%6s", Arrays.copyOf(new Object[]{sb3.toString()}, 1));
        C1241e.m3516f(format22, "java.lang.String.format(format, *args)");
        return format22;
    }

    /* renamed from: l */
    public static final C1035b<?> m3708l(C1615c cVar) {
        C1241e.m3517j(cVar, "<this>");
        if (cVar instanceof C1611a) {
            C1611a aVar = (C1611a) cVar;
            return null;
        } else if (cVar instanceof C1740n) {
            return m3708l(((C1740n) cVar).f5331a);
        } else {
            return null;
        }
    }

    /* renamed from: m */
    public static final String m3709m(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: n */
    public static final String m3710n(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: o */
    public static final C1860c m3711o(C1799a aVar) {
        C1241e.m3517j(aVar, "<this>");
        return aVar.f5450c;
    }

    /* renamed from: p */
    public static final void m3712p(C2046f fVar, Throwable th) {
        try {
            int i = CoroutineExceptionHandler.f4117a;
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) fVar.get(CoroutineExceptionHandler.C1213a.f4118e);
            if (coroutineExceptionHandler == null) {
                C1329y.m3735a(fVar, th);
            } else {
                coroutineExceptionHandler.handleException(fVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                C0955a.m2727a(runtimeException, th);
                th = runtimeException;
            }
            C1329y.m3735a(fVar, th);
        }
    }

    /* renamed from: q */
    public static final boolean m3713q(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: r */
    public static final boolean m3714r(C1112f fVar) {
        C1241e.m3518k(fVar, "$this$isProbablyUtf8");
        try {
            C1112f fVar2 = new C1112f();
            long j = fVar.f3888f;
            fVar.mo4652n(fVar2, 0, j > 64 ? 64 : j);
            for (int i = 0; i < 16; i++) {
                if (fVar2.mo4619I()) {
                    return true;
                }
                int Q = fVar2.mo4626Q();
                if (Character.isISOControl(Q) && !Character.isWhitespace(Q)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: s */
    public static final String m3715s(String str, int i) {
        if (str.length() < 200) {
            return str;
        }
        String str2 = ".....";
        if (i == -1) {
            int length = str.length() - 60;
            if (length <= 0) {
                return str;
            }
            String substring = str.substring(length);
            C1241e.m3516f(substring, "(this as java.lang.String).substring(startIndex)");
            return C1241e.m3522p(str2, substring);
        }
        int i2 = i - 30;
        int i3 = i + 30;
        String str3 = i2 <= 0 ? "" : str2;
        if (i3 >= str.length()) {
            str2 = "";
        }
        StringBuilder a = C0001b.m0a(str3);
        if (i2 < 0) {
            i2 = 0;
        }
        int length2 = str.length();
        if (i3 > length2) {
            i3 = length2;
        }
        String substring2 = str.substring(i2, i3);
        C1241e.m3516f(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        a.append(substring2);
        a.append(str2);
        return a.toString();
    }

    /* renamed from: t */
    public static final <T> Object m3716t(Object obj, C2043d<? super T> dVar) {
        return obj instanceof C1312r ? C0955a.m2736j(((C1312r) obj).f4322a) : obj;
    }

    /* renamed from: u */
    public static final <T> void m3717u(C1275e0<? super T> e0Var, C2043d<? super T> dVar, boolean z) {
        Object h = e0Var.mo5037h();
        Throwable c = e0Var.mo5034c(h);
        Object j = c != null ? C0955a.m2736j(c) : e0Var.mo5035f(h);
        if (z) {
            C1461d dVar2 = (C1461d) dVar;
            C2043d<T> dVar3 = dVar2.f4597i;
            Object obj = dVar2.f4599k;
            C2046f d = dVar3.mo5012d();
            Object b = C1475p.m4157b(d, obj);
            C1296k1<?> a = b != C1475p.f4620a ? C1322v.m3723a(dVar3, d, b) : null;
            try {
                dVar2.f4597i.mo5013j(j);
            } finally {
                if (a == null || a.mo5081W()) {
                    C1475p.m4156a(d, b);
                }
            }
        } else {
            dVar.mo5013j(j);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0086 A[SYNTHETIC] */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long m3718v(java.lang.String r23, long r24, long r26, long r28) {
        /*
            r0 = r23
            r1 = r26
            r3 = r28
            java.lang.String r5 = m3719w(r23)
            if (r5 != 0) goto L_0x0010
            r5 = r24
            goto L_0x00a9
        L_0x0010:
            java.lang.String r6 = "$this$toLongOrNull"
            p072l2.C1241e.m3517j(r5, r6)
            p072l2.C1241e.m3517j(r5, r6)
            r6 = 10
            p042g2.C0955a.m2729c(r6)
            int r7 = r5.length()
            r8 = 0
            r9 = 1
            if (r7 != 0) goto L_0x0026
            goto L_0x007e
        L_0x0026:
            char r10 = r5.charAt(r8)
            r11 = 48
            int r11 = p072l2.C1241e.m3519l(r10, r11)
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r11 >= 0) goto L_0x0049
            if (r7 != r9) goto L_0x003a
            goto L_0x007e
        L_0x003a:
            r11 = 45
            if (r10 != r11) goto L_0x0042
            r12 = -9223372036854775808
            r10 = r9
            goto L_0x004a
        L_0x0042:
            r11 = 43
            if (r10 != r11) goto L_0x007e
            r11 = r8
            r10 = r9
            goto L_0x004b
        L_0x0049:
            r10 = r8
        L_0x004a:
            r11 = r10
        L_0x004b:
            r14 = 0
            r16 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r18 = r16
        L_0x0054:
            if (r10 >= r7) goto L_0x0086
            char r8 = r5.charAt(r10)
            int r8 = java.lang.Character.digit(r8, r6)
            if (r8 >= 0) goto L_0x0061
            goto L_0x007e
        L_0x0061:
            int r20 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r20 >= 0) goto L_0x0073
            int r18 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r18 != 0) goto L_0x007e
            r20 = r10
            long r9 = (long) r6
            long r18 = r12 / r9
            int r9 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r9 >= 0) goto L_0x0075
            goto L_0x007e
        L_0x0073:
            r20 = r10
        L_0x0075:
            long r9 = (long) r6
            long r14 = r14 * r9
            long r8 = (long) r8
            long r21 = r12 + r8
            int r10 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r10 >= 0) goto L_0x0080
        L_0x007e:
            r6 = 0
            goto L_0x0092
        L_0x0080:
            long r14 = r14 - r8
            int r10 = r20 + 1
            r8 = 0
            r9 = 1
            goto L_0x0054
        L_0x0086:
            if (r11 == 0) goto L_0x008d
            java.lang.Long r6 = java.lang.Long.valueOf(r14)
            goto L_0x0092
        L_0x008d:
            long r6 = -r14
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
        L_0x0092:
            r7 = 39
            java.lang.String r8 = "System property '"
            if (r6 == 0) goto L_0x00de
            long r5 = r6.longValue()
            int r9 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x00a6
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x00a6
            r9 = 1
            goto L_0x00a7
        L_0x00a6:
            r9 = 0
        L_0x00a7:
            if (r9 == 0) goto L_0x00aa
        L_0x00a9:
            return r5
        L_0x00aa:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            r9.append(r0)
            java.lang.String r0 = "' should be in range "
            r9.append(r0)
            r9.append(r1)
            java.lang.String r0 = ".."
            r9.append(r0)
            r9.append(r3)
            java.lang.String r0 = ", but is '"
            r9.append(r0)
            r9.append(r5)
            r9.append(r7)
            java.lang.String r0 = r9.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x00de:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r0)
            java.lang.String r0 = "' has unrecognized value '"
            r1.append(r0)
            r1.append(r5)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p073l3.C1320u.m3718v(java.lang.String, long, long, long):long");
    }

    /* renamed from: w */
    public static final String m3719w(String str) {
        int i = C1474o.f4619a;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* renamed from: x */
    public static int m3720x(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) m3718v(str, (long) i, (long) i2, (long) i3);
    }

    /* renamed from: y */
    public static /* synthetic */ long m3721y(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return m3718v(str, j, j4, j3);
    }

    /* renamed from: z */
    public static final void m3722z(int i, int i2, C1615c cVar) {
        String str;
        StringBuilder sb;
        C1241e.m3517j(cVar, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            if ((i3 & 1) != 0) {
                arrayList.add(((C1733k) cVar).f5317e[i4]);
            }
            i3 >>>= 1;
            if (i5 >= 32) {
                break;
            }
            i4 = i5;
        }
        String str2 = ((C1733k) cVar).f5313a;
        C1241e.m3517j(str2, "serialName");
        if (arrayList.size() == 1) {
            sb = C0001b.m0a("Field '");
            sb.append((String) arrayList.get(0));
            sb.append("' is required for type with serial name '");
            sb.append(str2);
            str = "', but it was missing";
        } else {
            sb = new StringBuilder();
            sb.append("Fields ");
            sb.append(arrayList);
            sb.append(" are required for type with serial name '");
            sb.append(str2);
            str = "', but they were missing";
        }
        sb.append(str);
        throw new C1581c(sb.toString(), (Throwable) null);
    }
}
