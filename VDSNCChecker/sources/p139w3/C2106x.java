package p139w3;

import androidx.appcompat.widget.C0131a0;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import p025d3.C0802f;
import p062j4.C1112f;
import p067k3.C1197a;
import p067k3.C1209l;
import p072l2.C1241e;
import p126u2.C1846g;
import p144x3.C2129c;

/* renamed from: w3.x */
public final class C2106x {

    /* renamed from: k */
    public static final char[] f6114k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: l */
    public static final C2108b f6115l = new C2108b((C0802f) null);

    /* renamed from: a */
    public final boolean f6116a;

    /* renamed from: b */
    public final String f6117b;

    /* renamed from: c */
    public final String f6118c;

    /* renamed from: d */
    public final String f6119d;

    /* renamed from: e */
    public final String f6120e;

    /* renamed from: f */
    public final int f6121f;

    /* renamed from: g */
    public final List<String> f6122g;

    /* renamed from: h */
    public final List<String> f6123h;

    /* renamed from: i */
    public final String f6124i;

    /* renamed from: j */
    public final String f6125j;

    /* renamed from: w3.x$a */
    public static final class C2107a {

        /* renamed from: a */
        public String f6126a;

        /* renamed from: b */
        public String f6127b = "";

        /* renamed from: c */
        public String f6128c = "";

        /* renamed from: d */
        public String f6129d;

        /* renamed from: e */
        public int f6130e = -1;

        /* renamed from: f */
        public final List<String> f6131f;

        /* renamed from: g */
        public List<String> f6132g;

        /* renamed from: h */
        public String f6133h;

        public C2107a() {
            ArrayList arrayList = new ArrayList();
            this.f6131f = arrayList;
            arrayList.add("");
        }

        /* renamed from: a */
        public final C2106x mo6638a() {
            ArrayList arrayList;
            String str = this.f6126a;
            if (str != null) {
                C2108b bVar = C2106x.f6115l;
                String d = C2108b.m5497d(bVar, this.f6127b, 0, 0, false, 7);
                String d2 = C2108b.m5497d(bVar, this.f6128c, 0, 0, false, 7);
                String str2 = this.f6129d;
                if (str2 != null) {
                    int b = mo6639b();
                    List<String> list = this.f6131f;
                    ArrayList arrayList2 = new ArrayList(C1846g.m5046H(list, 10));
                    for (String d3 : list) {
                        arrayList2.add(C2108b.m5497d(C2106x.f6115l, d3, 0, 0, false, 7));
                    }
                    List<String> list2 = this.f6132g;
                    if (list2 != null) {
                        arrayList = new ArrayList(C1846g.m5046H(list2, 10));
                        for (String str3 : list2) {
                            arrayList.add(str3 != null ? C2108b.m5497d(C2106x.f6115l, str3, 0, 0, true, 3) : null);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str4 = this.f6133h;
                    return new C2106x(str, d, d2, str2, b, arrayList2, arrayList, str4 != null ? C2108b.m5497d(C2106x.f6115l, str4, 0, 0, false, 7) : null, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        /* renamed from: b */
        public final int mo6639b() {
            int i = this.f6130e;
            if (i != -1) {
                return i;
            }
            String str = this.f6126a;
            C1241e.m3515e(str);
            C1241e.m3517j(str, "scheme");
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && str.equals("https")) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        /* renamed from: c */
        public final C2107a mo6640c(String str) {
            List<String> list;
            if (str != null) {
                C2108b bVar = C2106x.f6115l;
                list = bVar.mo6645e(C2108b.m5496a(bVar, str, 0, 0, " \"'<>#", true, false, true, false, (Charset) null, 211));
            } else {
                list = null;
            }
            this.f6132g = list;
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: boolean} */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x0316  */
        /* JADX WARNING: Removed duplicated region for block: B:216:0x03dc A[SYNTHETIC] */
        /* renamed from: d */
        public final p139w3.C2106x.C2107a mo6641d(p139w3.C2106x r27, java.lang.String r28) {
            /*
                r26 = this;
                r0 = r26
                r1 = r27
                r12 = r28
                byte[] r2 = p144x3.C2129c.f6169a
                int r2 = r28.length()
                r3 = 0
                int r2 = p144x3.C2129c.m5525m(r12, r3, r2)
                int r4 = r28.length()
                int r13 = p144x3.C2129c.m5526n(r12, r2, r4)
                int r4 = r13 - r2
                r5 = 2
                r6 = -1
                r14 = 58
                r7 = 1
                if (r4 >= r5) goto L_0x0024
                goto L_0x007d
            L_0x0024:
                char r4 = r12.charAt(r2)
                r8 = 97
                int r9 = p072l2.C1241e.m3519l(r4, r8)
                r10 = 122(0x7a, float:1.71E-43)
                r11 = 65
                r15 = 90
                if (r9 < 0) goto L_0x003c
                int r9 = p072l2.C1241e.m3519l(r4, r10)
                if (r9 <= 0) goto L_0x0049
            L_0x003c:
                int r9 = p072l2.C1241e.m3519l(r4, r11)
                if (r9 < 0) goto L_0x007d
                int r4 = p072l2.C1241e.m3519l(r4, r15)
                if (r4 <= 0) goto L_0x0049
                goto L_0x007d
            L_0x0049:
                r4 = r2
            L_0x004a:
                int r4 = r4 + r7
                if (r4 >= r13) goto L_0x007d
                char r9 = r12.charAt(r4)
                if (r8 <= r9) goto L_0x0054
                goto L_0x0057
            L_0x0054:
                if (r10 < r9) goto L_0x0057
                goto L_0x0075
            L_0x0057:
                if (r11 <= r9) goto L_0x005a
                goto L_0x005d
            L_0x005a:
                if (r15 < r9) goto L_0x005d
                goto L_0x0075
            L_0x005d:
                r8 = 57
                r10 = 48
                if (r10 <= r9) goto L_0x0064
                goto L_0x0067
            L_0x0064:
                if (r8 < r9) goto L_0x0067
                goto L_0x0075
            L_0x0067:
                r8 = 43
                if (r9 != r8) goto L_0x006c
                goto L_0x0075
            L_0x006c:
                r8 = 45
                if (r9 != r8) goto L_0x0071
                goto L_0x0075
            L_0x0071:
                r8 = 46
                if (r9 != r8) goto L_0x007a
            L_0x0075:
                r8 = 97
                r10 = 122(0x7a, float:1.71E-43)
                goto L_0x004a
            L_0x007a:
                if (r9 != r14) goto L_0x007d
                goto L_0x007e
            L_0x007d:
                r4 = r6
            L_0x007e:
                java.lang.String r15 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                if (r4 == r6) goto L_0x00bf
                java.lang.String r8 = "https:"
                boolean r8 = p067k3.C1205h.m3431O(r12, r8, r2, r7)
                if (r8 == 0) goto L_0x0091
                java.lang.String r4 = "https"
                r0.f6126a = r4
                int r2 = r2 + 6
                goto L_0x00c5
            L_0x0091:
                java.lang.String r8 = "http:"
                boolean r8 = p067k3.C1205h.m3431O(r12, r8, r2, r7)
                if (r8 == 0) goto L_0x00a0
                java.lang.String r4 = "http"
                r0.f6126a = r4
                int r2 = r2 + 5
                goto L_0x00c5
            L_0x00a0:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Expected URL scheme 'http' or 'https' but was '"
                java.lang.StringBuilder r2 = p000a.C0001b.m0a(r2)
                java.lang.String r3 = r12.substring(r3, r4)
                p072l2.C1241e.m3516f(r3, r15)
                r2.append(r3)
                java.lang.String r3 = "'"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x00bf:
                if (r1 == 0) goto L_0x0454
                java.lang.String r4 = r1.f6117b
                r0.f6126a = r4
            L_0x00c5:
                r4 = r2
            L_0x00c6:
                r8 = 92
                r9 = 47
                if (r4 >= r13) goto L_0x00d9
                char r10 = r12.charAt(r4)
                if (r10 == r8) goto L_0x00d4
                if (r10 != r9) goto L_0x00d9
            L_0x00d4:
                int r3 = r3 + 1
                int r4 = r4 + 1
                goto L_0x00c6
            L_0x00d9:
                r4 = 63
                r10 = 35
                if (r3 >= r5) goto L_0x0122
                if (r1 == 0) goto L_0x0122
                java.lang.String r5 = r1.f6117b
                java.lang.String r11 = r0.f6126a
                boolean r5 = p072l2.C1241e.m3513b(r5, r11)
                r5 = r5 ^ r7
                if (r5 == 0) goto L_0x00ed
                goto L_0x0122
            L_0x00ed:
                java.lang.String r3 = r27.mo6631e()
                r0.f6127b = r3
                java.lang.String r3 = r27.mo6627a()
                r0.f6128c = r3
                java.lang.String r3 = r1.f6120e
                r0.f6129d = r3
                int r3 = r1.f6121f
                r0.f6130e = r3
                java.util.List<java.lang.String> r3 = r0.f6131f
                r3.clear()
                java.util.List<java.lang.String> r3 = r0.f6131f
                java.util.List r4 = r27.mo6629c()
                r3.addAll(r4)
                if (r2 == r13) goto L_0x0117
                char r3 = r12.charAt(r2)
                if (r3 != r10) goto L_0x011e
            L_0x0117:
                java.lang.String r1 = r27.mo6630d()
                r0.mo6640c(r1)
            L_0x011e:
                r20 = r13
                goto L_0x02ce
            L_0x0122:
                int r2 = r2 + r3
                r1 = 0
                r3 = 0
                r16 = r1
                r11 = r2
                r17 = r3
            L_0x012a:
                java.lang.String r1 = "@/\\?#"
                int r7 = p144x3.C2129c.m5518f(r12, r1, r11, r13)
                if (r7 == r13) goto L_0x0137
                char r1 = r12.charAt(r7)
                goto L_0x0138
            L_0x0137:
                r1 = r6
            L_0x0138:
                if (r1 == r6) goto L_0x01f1
                if (r1 == r10) goto L_0x01f1
                if (r1 == r9) goto L_0x01f1
                if (r1 == r8) goto L_0x01f1
                if (r1 == r4) goto L_0x01f1
                r2 = 64
                if (r1 == r2) goto L_0x014a
                r20 = r13
                goto L_0x01e2
            L_0x014a:
                java.lang.String r10 = "%40"
                if (r16 != 0) goto L_0x01b1
                int r9 = p144x3.C2129c.m5517e(r12, r14, r11, r7)
                w3.x$b r18 = p139w3.C2106x.f6115l
                r6 = 1
                r8 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r18
                r2 = r28
                r3 = r11
                r4 = r9
                r11 = r7
                r7 = r8
                r8 = r19
                r14 = r9
                r9 = r20
                r23 = r10
                r10 = r21
                r20 = r13
                r13 = r11
                r11 = r22
                java.lang.String r1 = p139w3.C2106x.C2108b.m5496a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r17 == 0) goto L_0x0192
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r0.f6127b
                r2.append(r3)
                r3 = r23
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
            L_0x0192:
                r0.f6127b = r1
                if (r14 == r13) goto L_0x01ae
                int r3 = r14 + 1
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r18
                r2 = r28
                r4 = r13
                java.lang.String r1 = p139w3.C2106x.C2108b.m5496a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r0.f6128c = r1
                r16 = 1
            L_0x01ae:
                r17 = 1
                goto L_0x01e0
            L_0x01b1:
                r3 = r10
                r20 = r13
                r13 = r7
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r1 = r0.f6128c
                r14.append(r1)
                r14.append(r3)
                w3.x$b r1 = p139w3.C2106x.f6115l
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r18 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r2 = r28
                r3 = r11
                r4 = r13
                r11 = r18
                java.lang.String r1 = p139w3.C2106x.C2108b.m5496a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r14.append(r1)
                java.lang.String r1 = r14.toString()
                r0.f6128c = r1
            L_0x01e0:
                int r11 = r13 + 1
            L_0x01e2:
                r10 = 35
                r4 = 63
                r9 = 47
                r8 = 92
                r6 = -1
                r13 = r20
                r14 = 58
                goto L_0x012a
            L_0x01f1:
                r20 = r13
                r13 = r7
                r7 = r11
            L_0x01f5:
                if (r7 >= r13) goto L_0x0217
                char r1 = r12.charAt(r7)
                r2 = 58
                if (r1 == r2) goto L_0x0213
                r3 = 91
                if (r1 == r3) goto L_0x0204
                goto L_0x0210
            L_0x0204:
                int r7 = r7 + 1
                if (r7 >= r13) goto L_0x0210
                char r1 = r12.charAt(r7)
                r3 = 93
                if (r1 != r3) goto L_0x0204
            L_0x0210:
                int r7 = r7 + 1
                goto L_0x01f5
            L_0x0213:
                r1 = 1
                r10 = r1
                r14 = r7
                goto L_0x021a
            L_0x0217:
                r1 = 1
                r10 = r1
                r14 = r13
            L_0x021a:
                int r9 = r14 + 1
                r7 = 34
                if (r9 >= r13) goto L_0x02a1
                w3.x$b r7 = p139w3.C2106x.f6115l
                r5 = 0
                r6 = 4
                r1 = r7
                r2 = r28
                r3 = r11
                r4 = r14
                java.lang.String r1 = p139w3.C2106x.C2108b.m5497d(r1, r2, r3, r4, r5, r6)
                java.lang.String r1 = p073l3.C1320u.m3694A(r1)
                r0.f6129d = r1
                java.lang.String r5 = ""
                r6 = 0
                r8 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 248(0xf8, float:3.48E-43)
                r1 = r7
                r2 = r28
                r3 = r9
                r4 = r13
                r7 = r8
                r8 = r16
                r24 = r9
                r9 = r17
                r25 = r10
                r10 = r18
                r27 = r11
                r11 = r19
                java.lang.String r1 = p139w3.C2106x.C2108b.m5496a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ NumberFormatException -> 0x0266 }
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0266 }
                r2 = 65535(0xffff, float:9.1834E-41)
                r8 = r25
                if (r8 <= r1) goto L_0x0263
                goto L_0x026e
            L_0x0263:
                if (r2 < r1) goto L_0x026e
                goto L_0x026f
            L_0x0266:
                r8 = r25
                goto L_0x026e
            L_0x0269:
                r24 = r9
                r8 = r10
                r27 = r11
            L_0x026e:
                r1 = -1
            L_0x026f:
                r0.f6130e = r1
                r2 = -1
                if (r1 == r2) goto L_0x0276
                r10 = r8
                goto L_0x0277
            L_0x0276:
                r10 = 0
            L_0x0277:
                if (r10 == 0) goto L_0x027c
                r7 = 34
                goto L_0x02c3
            L_0x027c:
                java.lang.String r1 = "Invalid URL port: \""
                java.lang.StringBuilder r1 = p000a.C0001b.m0a(r1)
                r14 = r24
                java.lang.String r2 = r12.substring(r14, r13)
                p072l2.C1241e.m3516f(r2, r15)
                r1.append(r2)
                r2 = 34
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L_0x02a1:
                r8 = r10
                r27 = r11
                w3.x$b r9 = p139w3.C2106x.f6115l
                r5 = 0
                r6 = 4
                r1 = r9
                r2 = r28
                r3 = r27
                r4 = r14
                java.lang.String r1 = p139w3.C2106x.C2108b.m5497d(r1, r2, r3, r4, r5, r6)
                java.lang.String r1 = p073l3.C1320u.m3694A(r1)
                r0.f6129d = r1
                java.lang.String r1 = r0.f6126a
                p072l2.C1241e.m3515e(r1)
                int r1 = r9.mo6643b(r1)
                r0.f6130e = r1
            L_0x02c3:
                java.lang.String r1 = r0.f6129d
                if (r1 == 0) goto L_0x02c9
                r10 = r8
                goto L_0x02ca
            L_0x02c9:
                r10 = 0
            L_0x02ca:
                if (r10 == 0) goto L_0x0431
                r7 = r8
                r2 = r13
            L_0x02ce:
                java.lang.String r1 = "?#"
                r3 = r20
                int r1 = p144x3.C2129c.m5518f(r12, r1, r2, r3)
                if (r2 != r1) goto L_0x02dd
                r15 = r0
                r14 = r3
                r13 = r12
                goto L_0x03e0
            L_0x02dd:
                char r4 = r12.charAt(r2)
                java.lang.String r5 = ""
                r6 = 47
                if (r4 == r6) goto L_0x0300
                r6 = 92
                if (r4 != r6) goto L_0x02ec
                goto L_0x0300
            L_0x02ec:
                java.util.List<java.lang.String> r4 = r0.f6131f
                int r6 = r4.size()
                int r6 = r6 - r7
                r4.set(r6, r5)
                r8 = r0
                r9 = r8
                r4 = r1
                r13 = r3
                r6 = r5
                r3 = r4
                r5 = r2
                r1 = r12
                r2 = r1
                goto L_0x0314
            L_0x0300:
                java.util.List<java.lang.String> r4 = r0.f6131f
                r4.clear()
                java.util.List<java.lang.String> r4 = r0.f6131f
                r4.add(r5)
                r8 = r0
                r9 = r8
                r4 = r1
                r13 = r3
                r6 = r5
                r3 = r4
                r5 = r2
                r1 = r12
                r2 = r1
            L_0x0313:
                int r5 = r5 + r7
            L_0x0314:
                if (r5 >= r4) goto L_0x03dc
                java.lang.String r10 = "/\\"
                int r10 = p144x3.C2129c.m5518f(r1, r10, r5, r4)
                if (r10 >= r4) goto L_0x0320
                r11 = r7
                goto L_0x0321
            L_0x0320:
                r11 = 0
            L_0x0321:
                r19 = 1
                w3.x$b r14 = p139w3.C2106x.f6115l
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 240(0xf0, float:3.36E-43)
                java.lang.String r18 = " \"<>^`{}|/\\?#"
                r15 = r1
                r16 = r5
                r17 = r10
                java.lang.String r5 = p139w3.C2106x.C2108b.m5496a(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                java.lang.String r14 = "."
                boolean r14 = p072l2.C1241e.m3513b(r5, r14)
                if (r14 != 0) goto L_0x034d
                java.lang.String r14 = "%2e"
                boolean r14 = p067k3.C1205h.m3427K(r5, r14, r7)
                if (r14 == 0) goto L_0x034b
                goto L_0x034d
            L_0x034b:
                r14 = 0
                goto L_0x034e
            L_0x034d:
                r14 = r7
            L_0x034e:
                if (r14 == 0) goto L_0x0352
                goto L_0x03d7
            L_0x0352:
                java.lang.String r14 = ".."
                boolean r14 = p072l2.C1241e.m3513b(r5, r14)
                if (r14 != 0) goto L_0x0375
                java.lang.String r14 = "%2e."
                boolean r14 = p067k3.C1205h.m3427K(r5, r14, r7)
                if (r14 != 0) goto L_0x0375
                java.lang.String r14 = ".%2e"
                boolean r14 = p067k3.C1205h.m3427K(r5, r14, r7)
                if (r14 != 0) goto L_0x0375
                java.lang.String r14 = "%2e%2e"
                boolean r14 = p067k3.C1205h.m3427K(r5, r14, r7)
                if (r14 == 0) goto L_0x0373
                goto L_0x0375
            L_0x0373:
                r14 = 0
                goto L_0x0376
            L_0x0375:
                r14 = r7
            L_0x0376:
                if (r14 == 0) goto L_0x03aa
                java.util.List<java.lang.String> r5 = r9.f6131f
                int r14 = r5.size()
                int r14 = r14 - r7
                java.lang.Object r5 = r5.remove(r14)
                java.lang.String r5 = (java.lang.String) r5
                int r5 = r5.length()
                if (r5 != 0) goto L_0x038d
                r5 = r7
                goto L_0x038e
            L_0x038d:
                r5 = 0
            L_0x038e:
                if (r5 == 0) goto L_0x03a4
                java.util.List<java.lang.String> r5 = r9.f6131f
                boolean r5 = r5.isEmpty()
                r5 = r5 ^ r7
                if (r5 == 0) goto L_0x03a4
                java.util.List<java.lang.String> r5 = r9.f6131f
                int r14 = r5.size()
                int r14 = r14 - r7
                r5.set(r14, r6)
                goto L_0x03d7
            L_0x03a4:
                java.util.List<java.lang.String> r5 = r9.f6131f
                r5.add(r6)
                goto L_0x03d7
            L_0x03aa:
                java.util.List<java.lang.String> r14 = r9.f6131f
                int r15 = r14.size()
                int r15 = r15 - r7
                java.lang.Object r14 = r14.get(r15)
                java.lang.CharSequence r14 = (java.lang.CharSequence) r14
                int r14 = r14.length()
                if (r14 != 0) goto L_0x03bf
                r14 = r7
                goto L_0x03c0
            L_0x03bf:
                r14 = 0
            L_0x03c0:
                java.util.List<java.lang.String> r15 = r9.f6131f
                if (r14 == 0) goto L_0x03cd
                int r14 = r15.size()
                int r14 = r14 - r7
                r15.set(r14, r5)
                goto L_0x03d0
            L_0x03cd:
                r15.add(r5)
            L_0x03d0:
                if (r11 == 0) goto L_0x03d7
                java.util.List<java.lang.String> r5 = r9.f6131f
                r5.add(r6)
            L_0x03d7:
                r5 = r10
                if (r11 == 0) goto L_0x0314
                goto L_0x0313
            L_0x03dc:
                r1 = r3
                r15 = r8
                r14 = r13
                r13 = r2
            L_0x03e0:
                if (r1 >= r14) goto L_0x0410
                char r2 = r12.charAt(r1)
                r3 = 63
                if (r2 != r3) goto L_0x0410
                r2 = 35
                int r16 = p144x3.C2129c.m5517e(r12, r2, r1, r14)
                w3.x$b r11 = p139w3.C2106x.f6115l
                int r3 = r1 + 1
                r6 = 1
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r17 = 208(0xd0, float:2.91E-43)
                java.lang.String r5 = " \"'<>#"
                r1 = r11
                r2 = r13
                r4 = r16
                r0 = r11
                r11 = r17
                java.lang.String r1 = p139w3.C2106x.C2108b.m5496a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                java.util.List r0 = r0.mo6645e(r1)
                r15.f6132g = r0
                r1 = r16
            L_0x0410:
                if (r1 >= r14) goto L_0x0430
                char r0 = r12.charAt(r1)
                r2 = 35
                if (r0 != r2) goto L_0x0430
                w3.x$b r0 = p139w3.C2106x.f6115l
                int r3 = r1 + 1
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 1
                r10 = 0
                r11 = 176(0xb0, float:2.47E-43)
                java.lang.String r5 = ""
                r1 = r0
                r2 = r13
                r4 = r14
                java.lang.String r0 = p139w3.C2106x.C2108b.m5496a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r15.f6133h = r0
            L_0x0430:
                return r15
            L_0x0431:
                java.lang.String r0 = "Invalid URL host: \""
                java.lang.StringBuilder r0 = p000a.C0001b.m0a(r0)
                r2 = r27
                java.lang.String r1 = r12.substring(r2, r14)
                p072l2.C1241e.m3516f(r1, r15)
                r0.append(r1)
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L_0x0454:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expected URL scheme 'http' or 'https' but no colon was found"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p139w3.C2106x.C2107a.mo6641d(w3.x, java.lang.String):w3.x$a");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
            if ((r9.f6128c.length() > 0) != false) goto L_0x0032;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b0, code lost:
            if (r1 != r5) goto L_0x00b2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r9 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r9.f6126a
                if (r1 == 0) goto L_0x000f
                r0.append(r1)
                java.lang.String r1 = "://"
                goto L_0x0011
            L_0x000f:
                java.lang.String r1 = "//"
            L_0x0011:
                r0.append(r1)
                java.lang.String r1 = r9.f6127b
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L_0x0020
                r1 = r2
                goto L_0x0021
            L_0x0020:
                r1 = r3
            L_0x0021:
                r4 = 58
                if (r1 != 0) goto L_0x0032
                java.lang.String r1 = r9.f6128c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x002f
                r1 = r2
                goto L_0x0030
            L_0x002f:
                r1 = r3
            L_0x0030:
                if (r1 == 0) goto L_0x0050
            L_0x0032:
                java.lang.String r1 = r9.f6127b
                r0.append(r1)
                java.lang.String r1 = r9.f6128c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0040
                goto L_0x0041
            L_0x0040:
                r2 = r3
            L_0x0041:
                if (r2 == 0) goto L_0x004b
                r0.append(r4)
                java.lang.String r1 = r9.f6128c
                r0.append(r1)
            L_0x004b:
                r1 = 64
                r0.append(r1)
            L_0x0050:
                java.lang.String r1 = r9.f6129d
                r2 = 2
                if (r1 == 0) goto L_0x0073
                p072l2.C1241e.m3515e(r1)
                boolean r1 = p067k3.C1209l.m3438S(r1, r4, r3, r2)
                if (r1 == 0) goto L_0x006e
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r9.f6129d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L_0x0073
            L_0x006e:
                java.lang.String r1 = r9.f6129d
                r0.append(r1)
            L_0x0073:
                int r1 = r9.f6130e
                r5 = -1
                if (r1 != r5) goto L_0x007c
                java.lang.String r1 = r9.f6126a
                if (r1 == 0) goto L_0x00b8
            L_0x007c:
                int r1 = r9.mo6639b()
                java.lang.String r6 = r9.f6126a
                if (r6 == 0) goto L_0x00b2
                p072l2.C1241e.m3515e(r6)
                java.lang.String r7 = "scheme"
                p072l2.C1241e.m3517j(r6, r7)
                int r7 = r6.hashCode()
                r8 = 3213448(0x310888, float:4.503E-39)
                if (r7 == r8) goto L_0x00a6
                r8 = 99617003(0x5f008eb, float:2.2572767E-35)
                if (r7 == r8) goto L_0x009b
                goto L_0x00b0
            L_0x009b:
                java.lang.String r7 = "https"
                boolean r6 = r6.equals(r7)
                if (r6 == 0) goto L_0x00b0
                r5 = 443(0x1bb, float:6.21E-43)
                goto L_0x00b0
            L_0x00a6:
                java.lang.String r7 = "http"
                boolean r6 = r6.equals(r7)
                if (r6 == 0) goto L_0x00b0
                r5 = 80
            L_0x00b0:
                if (r1 == r5) goto L_0x00b8
            L_0x00b2:
                r0.append(r4)
                r0.append(r1)
            L_0x00b8:
                java.util.List<java.lang.String> r1 = r9.f6131f
                java.lang.String r4 = "$this$toPathString"
                p072l2.C1241e.m3517j(r1, r4)
                java.lang.String r4 = "out"
                p072l2.C1241e.m3517j(r0, r4)
                int r5 = r1.size()
                r6 = r3
            L_0x00c9:
                if (r6 >= r5) goto L_0x00dc
                r7 = 47
                r0.append(r7)
                java.lang.Object r7 = r1.get(r6)
                java.lang.String r7 = (java.lang.String) r7
                r0.append(r7)
                int r6 = r6 + 1
                goto L_0x00c9
            L_0x00dc:
                java.util.List<java.lang.String> r1 = r9.f6132g
                if (r1 == 0) goto L_0x0131
                r1 = 63
                r0.append(r1)
                java.util.List<java.lang.String> r1 = r9.f6132g
                p072l2.C1241e.m3515e(r1)
                java.lang.String r5 = "$this$toQueryString"
                p072l2.C1241e.m3517j(r1, r5)
                p072l2.C1241e.m3517j(r0, r4)
                int r4 = r1.size()
                h3.c r3 = p042g2.C0955a.m2726G(r3, r4)
                h3.a r2 = p042g2.C0955a.m2722C(r3, r2)
                int r3 = r2.f3728e
                int r4 = r2.f3729f
                int r2 = r2.f3730g
                if (r2 < 0) goto L_0x0109
                if (r3 > r4) goto L_0x0131
                goto L_0x010b
            L_0x0109:
                if (r3 < r4) goto L_0x0131
            L_0x010b:
                java.lang.Object r5 = r1.get(r3)
                java.lang.String r5 = (java.lang.String) r5
                int r6 = r3 + 1
                java.lang.Object r6 = r1.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                if (r3 <= 0) goto L_0x0120
                r7 = 38
                r0.append(r7)
            L_0x0120:
                r0.append(r5)
                if (r6 == 0) goto L_0x012d
                r5 = 61
                r0.append(r5)
                r0.append(r6)
            L_0x012d:
                if (r3 == r4) goto L_0x0131
                int r3 = r3 + r2
                goto L_0x010b
            L_0x0131:
                java.lang.String r1 = r9.f6133h
                if (r1 == 0) goto L_0x013f
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r9.f6133h
                r0.append(r1)
            L_0x013f:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                p072l2.C1241e.m3516f(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p139w3.C2106x.C2107a.toString():java.lang.String");
        }
    }

    /* renamed from: w3.x$b */
    public static final class C2108b {
        public C2108b(C0802f fVar) {
        }

        /* renamed from: a */
        public static String m5496a(C2108b bVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3) {
            boolean z5;
            C2108b bVar2 = bVar;
            String str3 = str;
            String str4 = str2;
            int i4 = i3;
            int i5 = (i4 & 1) != 0 ? 0 : i;
            int length = (i4 & 2) != 0 ? str.length() : i2;
            boolean z6 = (i4 & 8) != 0 ? false : z;
            boolean z7 = (i4 & 16) != 0 ? false : z2;
            boolean z8 = (i4 & 32) != 0 ? false : z3;
            boolean z9 = (i4 & 64) != 0 ? false : z4;
            Charset charset2 = (i4 & 128) != 0 ? null : charset;
            C1241e.m3517j(str3, "$this$canonicalize");
            int i6 = i5;
            while (i6 < length) {
                int codePointAt = str3.codePointAt(i6);
                int i7 = 2;
                if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z9) || C1209l.m3438S(str4, (char) codePointAt, false, 2) || ((codePointAt == 37 && (!z6 || (z7 && !bVar2.mo6644c(str3, i6, length)))) || (codePointAt == 43 && z8)))) {
                    C1112f fVar = new C1112f();
                    fVar.mo4641d0(str3, i5, i6);
                    C1112f fVar2 = null;
                    while (i6 < length) {
                        int codePointAt2 = str3.codePointAt(i6);
                        if (!z6 || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                            if (codePointAt2 != 43 || !z8) {
                                if (codePointAt2 < 32 || codePointAt2 == 127 || (codePointAt2 >= 128 && !z9)) {
                                    z5 = z8;
                                } else {
                                    z5 = z8;
                                    if (!C1209l.m3438S(str4, (char) codePointAt2, false, i7) && (codePointAt2 != 37 || (z6 && (!z7 || bVar2.mo6644c(str3, i6, length))))) {
                                        fVar.mo4643e0(codePointAt2);
                                        i6 += Character.charCount(codePointAt2);
                                        i7 = 2;
                                        z8 = z5;
                                    }
                                }
                                if (fVar2 == null) {
                                    fVar2 = new C1112f();
                                }
                                if (charset2 == null || C1241e.m3513b(charset2, StandardCharsets.UTF_8)) {
                                    fVar2.mo4643e0(codePointAt2);
                                } else {
                                    int charCount = Character.charCount(codePointAt2) + i6;
                                    boolean z10 = true;
                                    if (i6 >= 0) {
                                        if (charCount >= i6) {
                                            if (charCount > str.length()) {
                                                z10 = false;
                                            }
                                            if (!z10) {
                                                throw new IllegalArgumentException(("endIndex > string.length: " + charCount + " > " + str.length()).toString());
                                            } else if (C1241e.m3513b(charset2, C1197a.f4098a)) {
                                                fVar2.mo4641d0(str3, i6, charCount);
                                            } else {
                                                String substring = str3.substring(i6, charCount);
                                                C1241e.m3516f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                                byte[] bytes = substring.getBytes(charset2);
                                                C1241e.m3516f(bytes, "(this as java.lang.String).getBytes(charset)");
                                                fVar2.mo4631V(bytes, 0, bytes.length);
                                            }
                                        } else {
                                            throw new IllegalArgumentException(("endIndex < beginIndex: " + charCount + " < " + i6).toString());
                                        }
                                    } else {
                                        throw new IllegalArgumentException(C0131a0.m344a("beginIndex < 0: ", i6).toString());
                                    }
                                }
                                while (!fVar2.mo4619I()) {
                                    byte P = fVar2.mo4625P() & 255;
                                    fVar.mo4633X(37);
                                    char[] cArr = C2106x.f6114k;
                                    fVar.mo4633X(cArr[(P >> 4) & 15]);
                                    fVar.mo4633X(cArr[P & 15]);
                                }
                                i6 += Character.charCount(codePointAt2);
                                i7 = 2;
                                z8 = z5;
                            } else {
                                fVar.mo4639c0(z6 ? "+" : "%2B");
                            }
                        }
                        z5 = z8;
                        i6 += Character.charCount(codePointAt2);
                        i7 = 2;
                        z8 = z5;
                    }
                    return fVar.mo4620J();
                }
                i6 += Character.charCount(codePointAt);
            }
            String substring2 = str3.substring(i5, length);
            C1241e.m3516f(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring2;
        }

        /* renamed from: d */
        public static String m5497d(C2108b bVar, String str, int i, int i2, boolean z, int i3) {
            int i4;
            int i5;
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            C1241e.m3517j(str, "$this$percentDecode");
            int i6 = i;
            while (i4 < i2) {
                char charAt = str.charAt(i4);
                if (charAt == '%' || (charAt == '+' && z)) {
                    C1112f fVar = new C1112f();
                    fVar.mo4641d0(str, i, i4);
                    while (i4 < i2) {
                        int codePointAt = str.codePointAt(i4);
                        if (codePointAt == 37 && (i5 = i4 + 2) < i2) {
                            int p = C2129c.m5528p(str.charAt(i4 + 1));
                            int p2 = C2129c.m5528p(str.charAt(i5));
                            if (!(p == -1 || p2 == -1)) {
                                fVar.mo4633X((p << 4) + p2);
                                i4 = Character.charCount(codePointAt) + i5;
                            }
                        } else if (codePointAt == 43 && z) {
                            fVar.mo4633X(32);
                            i4++;
                        }
                        fVar.mo4643e0(codePointAt);
                        i4 += Character.charCount(codePointAt);
                    }
                    return fVar.mo4620J();
                }
                i6 = i4 + 1;
            }
            String substring = str.substring(i, i2);
            C1241e.m3516f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        /* renamed from: b */
        public final int mo6643b(String str) {
            C1241e.m3517j(str, "scheme");
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && str.equals("https")) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        /* renamed from: c */
        public final boolean mo6644c(String str, int i, int i2) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && C2129c.m5528p(str.charAt(i + 1)) != -1 && C2129c.m5528p(str.charAt(i3)) != -1;
        }

        /* renamed from: e */
        public final List<String> mo6645e(String str) {
            String str2;
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int Y = C1209l.m3444Y(str, '&', i, false, 4);
                if (Y == -1) {
                    Y = str.length();
                }
                int Y2 = C1209l.m3444Y(str, '=', i, false, 4);
                if (Y2 == -1 || Y2 > Y) {
                    String substring = str.substring(i, Y);
                    C1241e.m3516f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    str2 = null;
                } else {
                    String substring2 = str.substring(i, Y2);
                    C1241e.m3516f(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    str2 = str.substring(Y2 + 1, Y);
                    C1241e.m3516f(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                arrayList.add(str2);
                i = Y + 1;
            }
            return arrayList;
        }
    }

    public C2106x(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
        this.f6117b = str;
        this.f6118c = str2;
        this.f6119d = str3;
        this.f6120e = str4;
        this.f6121f = i;
        this.f6122g = list;
        this.f6123h = list2;
        this.f6124i = str5;
        this.f6125j = str6;
        this.f6116a = C1241e.m3513b(str, "https");
    }

    /* renamed from: a */
    public final String mo6627a() {
        if (this.f6119d.length() == 0) {
            return "";
        }
        int Y = C1209l.m3444Y(this.f6125j, '@', 0, false, 6);
        String str = this.f6125j;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(C1209l.m3444Y(this.f6125j, ':', this.f6117b.length() + 3, false, 4) + 1, Y);
        C1241e.m3516f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: b */
    public final String mo6628b() {
        int Y = C1209l.m3444Y(this.f6125j, '/', this.f6117b.length() + 3, false, 4);
        String str = this.f6125j;
        int f = C2129c.m5518f(str, "?#", Y, str.length());
        String str2 = this.f6125j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(Y, f);
        C1241e.m3516f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: c */
    public final List<String> mo6629c() {
        int Y = C1209l.m3444Y(this.f6125j, '/', this.f6117b.length() + 3, false, 4);
        String str = this.f6125j;
        int f = C2129c.m5518f(str, "?#", Y, str.length());
        ArrayList arrayList = new ArrayList();
        while (Y < f) {
            int i = Y + 1;
            int e = C2129c.m5517e(this.f6125j, '/', i, f);
            String str2 = this.f6125j;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String substring = str2.substring(i, e);
            C1241e.m3516f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring);
            Y = e;
        }
        return arrayList;
    }

    /* renamed from: d */
    public final String mo6630d() {
        if (this.f6123h == null) {
            return null;
        }
        int Y = C1209l.m3444Y(this.f6125j, '?', 0, false, 6) + 1;
        String str = this.f6125j;
        int e = C2129c.m5517e(str, '#', Y, str.length());
        String str2 = this.f6125j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(Y, e);
        C1241e.m3516f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: e */
    public final String mo6631e() {
        if (this.f6118c.length() == 0) {
            return "";
        }
        int length = this.f6117b.length() + 3;
        String str = this.f6125j;
        int f = C2129c.m5518f(str, ":@", length, str.length());
        String str2 = this.f6125j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(length, f);
        C1241e.m3516f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2106x) && C1241e.m3513b(((C2106x) obj).f6125j, this.f6125j);
    }

    /* renamed from: f */
    public final C2107a mo6633f(String str) {
        C1241e.m3517j(str, "link");
        try {
            C2107a aVar = new C2107a();
            aVar.mo6641d(this, str);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public final String mo6634g() {
        C2107a f = mo6633f("/...");
        C1241e.m3515e(f);
        C1241e.m3517j("", "username");
        C2108b bVar = f6115l;
        f.f6127b = C2108b.m5496a(bVar, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
        C1241e.m3517j("", "password");
        f.f6128c = C2108b.m5496a(bVar, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
        return f.mo6638a().f6125j;
    }

    /* renamed from: h */
    public final URI mo6635h() {
        String str;
        String str2;
        C2107a aVar = new C2107a();
        aVar.f6126a = this.f6117b;
        String e = mo6631e();
        C1241e.m3517j(e, "<set-?>");
        aVar.f6127b = e;
        String a = mo6627a();
        C1241e.m3517j(a, "<set-?>");
        aVar.f6128c = a;
        aVar.f6129d = this.f6120e;
        aVar.f6130e = this.f6121f != f6115l.mo6643b(this.f6117b) ? this.f6121f : -1;
        aVar.f6131f.clear();
        aVar.f6131f.addAll(mo6629c());
        aVar.mo6640c(mo6630d());
        String str3 = null;
        if (this.f6124i == null) {
            str = null;
        } else {
            String str4 = this.f6125j;
            Objects.requireNonNull(str4, "null cannot be cast to non-null type java.lang.String");
            str = str4.substring(C1209l.m3444Y(this.f6125j, '#', 0, false, 6) + 1);
            C1241e.m3516f(str, "(this as java.lang.String).substring(startIndex)");
        }
        aVar.f6133h = str;
        String str5 = aVar.f6129d;
        if (str5 != null) {
            C1241e.m3517j("[\"<>^`{|}]", "pattern");
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            C1241e.m3516f(compile, "Pattern.compile(pattern)");
            C1241e.m3517j(compile, "nativePattern");
            C1241e.m3517j(str5, "input");
            C1241e.m3517j("", "replacement");
            str2 = compile.matcher(str5).replaceAll("");
            C1241e.m3516f(str2, "nativePattern.matcher(in…).replaceAll(replacement)");
        } else {
            str2 = null;
        }
        aVar.f6129d = str2;
        int size = aVar.f6131f.size();
        for (int i = 0; i < size; i++) {
            List<String> list = aVar.f6131f;
            list.set(i, C2108b.m5496a(f6115l, list.get(i), 0, 0, "[]", true, true, false, false, (Charset) null, 227));
        }
        List<String> list2 = aVar.f6132g;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str6 = list2.get(i2);
                list2.set(i2, str6 != null ? C2108b.m5496a(f6115l, str6, 0, 0, "\\^`{|}", true, true, true, false, (Charset) null, 195) : null);
            }
        }
        String str7 = aVar.f6133h;
        if (str7 != null) {
            str3 = C2108b.m5496a(f6115l, str7, 0, 0, " \"#<>\\^`{|}", true, true, false, true, (Charset) null, 163);
        }
        aVar.f6133h = str3;
        String aVar2 = aVar.toString();
        try {
            return new URI(aVar2);
        } catch (URISyntaxException e2) {
            try {
                C1241e.m3517j("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", "pattern");
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                C1241e.m3516f(compile2, "Pattern.compile(pattern)");
                C1241e.m3517j(compile2, "nativePattern");
                C1241e.m3517j(aVar2, "input");
                C1241e.m3517j("", "replacement");
                String replaceAll = compile2.matcher(aVar2).replaceAll("");
                C1241e.m3516f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                URI create = URI.create(replaceAll);
                C1241e.m3516f(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public int hashCode() {
        return this.f6125j.hashCode();
    }

    public String toString() {
        return this.f6125j;
    }
}
