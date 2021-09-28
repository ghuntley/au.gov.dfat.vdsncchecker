package p144x3;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p025d3.C0802f;
import p026d4.C0815c;
import p042g2.C0955a;
import p062j4.C1112f;
import p062j4.C1114h;
import p062j4.C1115i;
import p062j4.C1124q;
import p062j4.C1134z;
import p067k3.C1200c;
import p067k3.C1205h;
import p067k3.C1209l;
import p072l2.C1241e;
import p126u2.C1842c;
import p126u2.C1845f;
import p126u2.C1850k;
import p126u2.C1852m;
import p139w3.C2057b0;
import p139w3.C2072g0;
import p139w3.C2077h0;
import p139w3.C2079i0;
import p139w3.C2103w;
import p139w3.C2106x;
import p139w3.C2111z;
import p155j$.util.DesugarTimeZone;

/* renamed from: x3.c */
public final class C2129c {

    /* renamed from: a */
    public static final byte[] f6169a;

    /* renamed from: b */
    public static final C2103w f6170b = C2103w.f6111f.mo6626c(new String[0]);

    /* renamed from: c */
    public static final C2079i0 f6171c;

    /* renamed from: d */
    public static final TimeZone f6172d;

    /* renamed from: e */
    public static final C1200c f6173e = new C1200c("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: f */
    public static final String f6174f;

    static {
        int i;
        byte[] bArr = new byte[0];
        f6169a = bArr;
        C1112f fVar = new C1112f();
        fVar.mo4630U(bArr);
        long j = (long) 0;
        f6171c = new C2077h0(fVar, (C2111z) null, j);
        m5514b(j, j, j);
        C1124q.C1125a aVar = C1124q.f3909e;
        C1115i.C1116a aVar2 = C1115i.f3890i;
        C1115i[] iVarArr = {aVar2.mo4682a("efbbbf"), aVar2.mo4682a("feff"), aVar2.mo4682a("fffe"), aVar2.mo4682a("0000ffff"), aVar2.mo4682a("ffff0000")};
        ArrayList arrayList = new ArrayList(new C1842c(iVarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i2 = 0; i2 < 5; i2++) {
            C1115i iVar = iVarArr[i2];
            arrayList2.add(-1);
        }
        Object[] array = arrayList2.toArray(new Integer[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        Integer[] numArr = (Integer[]) array;
        Integer[] numArr2 = (Integer[]) Arrays.copyOf(numArr, numArr.length);
        C1241e.m3517j(numArr2, "elements");
        ArrayList arrayList3 = numArr2.length == 0 ? new ArrayList() : new ArrayList(new C1842c(numArr2, true));
        int i3 = 0;
        int i4 = 0;
        while (i3 < 5) {
            C1115i iVar2 = iVarArr[i3];
            int i5 = i4 + 1;
            int size = arrayList.size();
            int size2 = arrayList.size();
            if (size < 0) {
                throw new IllegalArgumentException("fromIndex (" + 0 + ") is greater than toIndex (" + size + ").");
            } else if (size <= size2) {
                int i6 = size - 1;
                int i7 = 0;
                while (true) {
                    if (i7 > i6) {
                        i = -(i7 + 1);
                        break;
                    }
                    i = (i7 + i6) >>> 1;
                    int f = C0955a.m2732f((Comparable) arrayList.get(i), iVar2);
                    if (f >= 0) {
                        if (f <= 0) {
                            break;
                        }
                        i6 = i - 1;
                    } else {
                        i7 = i + 1;
                    }
                }
                arrayList3.set(i, Integer.valueOf(i4));
                i3++;
                i4 = i5;
            } else {
                throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
            }
        }
        if (((C1115i) arrayList.get(0)).mo4669c() > 0) {
            int i8 = 0;
            while (i8 < arrayList.size()) {
                C1115i iVar3 = (C1115i) arrayList.get(i8);
                int i9 = i8 + 1;
                int i10 = i9;
                while (i10 < arrayList.size()) {
                    C1115i iVar4 = (C1115i) arrayList.get(i10);
                    Objects.requireNonNull(iVar4);
                    C1241e.m3517j(iVar3, "prefix");
                    if (!iVar4.mo4675g(0, iVar3, 0, iVar3.mo4669c())) {
                        continue;
                        break;
                    }
                    if (!(iVar4.mo4669c() != iVar3.mo4669c())) {
                        throw new IllegalArgumentException(("duplicate option: " + iVar4).toString());
                    } else if (((Number) arrayList3.get(i10)).intValue() > ((Number) arrayList3.get(i8)).intValue()) {
                        arrayList.remove(i10);
                        arrayList3.remove(i10);
                    } else {
                        i10++;
                    }
                }
                i8 = i9;
            }
            C1112f fVar2 = new C1112f();
            aVar.mo4689a(0, fVar2, 0, arrayList, 0, arrayList.size(), arrayList3);
            int[] iArr = new int[((int) aVar.mo4690b(fVar2))];
            int i11 = 0;
            while (!fVar2.mo4619I()) {
                iArr[i11] = fVar2.mo4662w();
                i11++;
            }
            Object[] copyOf = Arrays.copyOf(iVarArr, 5);
            C1241e.m3516f(copyOf, "java.util.Arrays.copyOf(this, size)");
            C1115i[] iVarArr2 = (C1115i[]) copyOf;
            TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
            C1241e.m3515e(timeZone);
            f6172d = timeZone;
            Class<C2057b0> cls = C2057b0.class;
            String e0 = C1209l.m3450e0(C2057b0.class.getName(), "okhttp3.");
            if (C1205h.m3426J(e0, "Client", false, 2)) {
                e0 = e0.substring(0, e0.length() - "Client".length());
                C1241e.m3516f(e0, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            f6174f = e0;
            return;
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
    }

    /* renamed from: a */
    public static final boolean m5513a(C2106x xVar, C2106x xVar2) {
        C1241e.m3517j(xVar, "$this$canReuseConnectionFor");
        C1241e.m3517j(xVar2, "other");
        return C1241e.m3513b(xVar.f6120e, xVar2.f6120e) && xVar.f6121f == xVar2.f6121f && C1241e.m3513b(xVar.f6117b, xVar2.f6117b);
    }

    /* renamed from: b */
    public static final void m5514b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: c */
    public static final void m5515c(Closeable closeable) {
        C1241e.m3517j(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static final void m5516d(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!C1241e.m3513b(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public static final int m5517e(String str, char c, int i, int i2) {
        C1241e.m3517j(str, "$this$delimiterOffset");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: f */
    public static final int m5518f(String str, String str2, int i, int i2) {
        C1241e.m3517j(str, "$this$delimiterOffset");
        while (i < i2) {
            if (C1209l.m3438S(str2, str.charAt(i), false, 2)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: g */
    public static final boolean m5519g(C1134z zVar, int i, TimeUnit timeUnit) {
        C1241e.m3517j(timeUnit, "timeUnit");
        try {
            return m5530r(zVar, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: h */
    public static final String m5520h(String str, Object... objArr) {
        C1241e.m3517j(str, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        C1241e.m3516f(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    /* renamed from: i */
    public static final boolean m5521i(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        C1241e.m3517j(strArr, "$this$hasIntersection");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String compare : strArr2) {
                        if (comparator.compare(str, compare) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: j */
    public static final long m5522j(C2072g0 g0Var) {
        String b = g0Var.f6006j.mo6611b("Content-Length");
        if (b == null) {
            return -1;
        }
        try {
            return Long.parseLong(b);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    @SafeVarargs
    /* renamed from: k */
    public static final <T> List<T> m5523k(T... tArr) {
        C1241e.m3517j(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C1241e.m3517j(copyOf, "elements");
        List<T> unmodifiableList = Collections.unmodifiableList(copyOf.length > 0 ? C1845f.m5041H(copyOf) : C1852m.f5542e);
        C1241e.m3516f(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }

    /* renamed from: l */
    public static final int m5524l(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (C1241e.m3519l(charAt, 31) <= 0 || C1241e.m3519l(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public static final int m5525m(String str, int i, int i2) {
        C1241e.m3517j(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: n */
    public static final int m5526n(String str, int i, int i2) {
        C1241e.m3517j(str, "$this$indexOfLastNonAsciiWhitespace");
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt == 9 || charAt == 10 || charAt == 12 || charAt == 13 || charAt == ' ') {
                    if (i3 == i) {
                        break;
                    }
                    i3--;
                } else {
                    return i3 + 1;
                }
            }
        }
        return i;
    }

    /* renamed from: o */
    public static final String[] m5527o(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        C1241e.m3517j(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    /* renamed from: p */
    public static final int m5528p(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: q */
    public static final int m5529q(C1114h hVar) {
        C1241e.m3517j(hVar, "$this$readMedium");
        return (hVar.mo4625P() & 255) | ((hVar.mo4625P() & 255) << 16) | ((hVar.mo4625P() & 255) << 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004e, code lost:
        if (r5 == Long.MAX_VALUE) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        if (r5 != Long.MAX_VALUE) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        r11.mo2835d().mo4598a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        r11.mo2835d().mo4601d(r0 + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        return r12;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m5530r(p062j4.C1134z r11, int r12, java.util.concurrent.TimeUnit r13) {
        /*
            java.lang.String r0 = "timeUnit"
            p072l2.C1241e.m3517j(r13, r0)
            long r0 = java.lang.System.nanoTime()
            j4.a0 r2 = r11.mo2835d()
            boolean r2 = r2.mo4602e()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L_0x0022
            j4.a0 r2 = r11.mo2835d()
            long r5 = r2.mo4600c()
            long r5 = r5 - r0
            goto L_0x0023
        L_0x0022:
            r5 = r3
        L_0x0023:
            j4.a0 r2 = r11.mo2835d()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.mo4601d(r12)
            j4.f r12 = new j4.f     // Catch:{ InterruptedIOException -> 0x0063, all -> 0x0051 }
            r12.<init>()     // Catch:{ InterruptedIOException -> 0x0063, all -> 0x0051 }
        L_0x0039:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.mo21o(r12, r7)     // Catch:{ InterruptedIOException -> 0x0063, all -> 0x0051 }
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L_0x004b
            long r7 = r12.f3888f     // Catch:{ InterruptedIOException -> 0x0063, all -> 0x0051 }
            r12.mo4654q(r7)     // Catch:{ InterruptedIOException -> 0x0063, all -> 0x0051 }
            goto L_0x0039
        L_0x004b:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0070
            goto L_0x0068
        L_0x0051:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            j4.a0 r11 = r11.mo2835d()
            if (r13 != 0) goto L_0x005e
            r11.mo4598a()
            goto L_0x0062
        L_0x005e:
            long r0 = r0 + r5
            r11.mo4601d(r0)
        L_0x0062:
            throw r12
        L_0x0063:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0070
        L_0x0068:
            j4.a0 r11 = r11.mo2835d()
            r11.mo4598a()
            goto L_0x0078
        L_0x0070:
            j4.a0 r11 = r11.mo2835d()
            long r0 = r0 + r5
            r11.mo4601d(r0)
        L_0x0078:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p144x3.C2129c.m5530r(j4.z, int, java.util.concurrent.TimeUnit):boolean");
    }

    /* renamed from: s */
    public static final C2103w m5531s(List<C0815c> list) {
        ArrayList arrayList = new ArrayList(20);
        for (C0815c next : list) {
            C1115i iVar = next.f3137b;
            C1115i iVar2 = next.f3138c;
            String j = iVar.mo4679j();
            String j2 = iVar2.mo4679j();
            arrayList.add(j);
            arrayList.add(C1209l.m3455j0(j2).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return new C2103w((String[]) array, (C0802f) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m5532t(p139w3.C2106x r4, boolean r5) {
        /*
            java.lang.String r0 = "$this$toHostHeader"
            p072l2.C1241e.m3517j(r4, r0)
            java.lang.String r0 = r4.f6120e
            r1 = 0
            r2 = 2
            java.lang.String r3 = ":"
            boolean r0 = p067k3.C1209l.m3439T(r0, r3, r1, r2)
            if (r0 == 0) goto L_0x002a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = r4.f6120e
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x002c
        L_0x002a:
            java.lang.String r0 = r4.f6120e
        L_0x002c:
            if (r5 != 0) goto L_0x005f
            int r5 = r4.f6121f
            java.lang.String r1 = r4.f6117b
            java.lang.String r2 = "scheme"
            p072l2.C1241e.m3517j(r1, r2)
            int r2 = r1.hashCode()
            r3 = 3213448(0x310888, float:4.503E-39)
            if (r2 == r3) goto L_0x0051
            r3 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r2 == r3) goto L_0x0046
            goto L_0x005c
        L_0x0046:
            java.lang.String r2 = "https"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005c
            r1 = 443(0x1bb, float:6.21E-43)
            goto L_0x005d
        L_0x0051:
            java.lang.String r2 = "http"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005c
            r1 = 80
            goto L_0x005d
        L_0x005c:
            r1 = -1
        L_0x005d:
            if (r5 == r1) goto L_0x0075
        L_0x005f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r0 = 58
            r5.append(r0)
            int r4 = r4.f6121f
            r5.append(r4)
            java.lang.String r0 = r5.toString()
        L_0x0075:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p144x3.C2129c.m5532t(w3.x, boolean):java.lang.String");
    }

    /* renamed from: u */
    public static final <T> List<T> m5533u(List<? extends T> list) {
        C1241e.m3517j(list, "$this$toImmutableList");
        List<T> unmodifiableList = Collections.unmodifiableList(C1850k.m5056R(list));
        C1241e.m3516f(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    /* renamed from: v */
    public static final int m5534v(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > ((long) Integer.MAX_VALUE)) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    /* renamed from: w */
    public static final String m5535w(String str, int i, int i2) {
        C1241e.m3517j(str, "$this$trimSubstring");
        int m = m5525m(str, i, i2);
        String substring = str.substring(m, m5526n(str, m, i2));
        C1241e.m3516f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: x */
    public static final Throwable m5536x(Exception exc, List<? extends Exception> list) {
        C1241e.m3517j(exc, "$this$withSuppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        for (Exception a : list) {
            C0955a.m2727a(exc, a);
        }
        return exc;
    }
}
