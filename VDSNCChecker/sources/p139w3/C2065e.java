package p139w3;

import java.util.concurrent.TimeUnit;
import p025d3.C0802f;
import p067k3.C1209l;
import p072l2.C1241e;

/* renamed from: w3.e */
public final class C2065e {

    /* renamed from: n */
    public static final C2066a f5983n = new C2066a((C0802f) null);

    /* renamed from: a */
    public final boolean f5984a;

    /* renamed from: b */
    public final boolean f5985b;

    /* renamed from: c */
    public final int f5986c;

    /* renamed from: d */
    public final int f5987d;

    /* renamed from: e */
    public final boolean f5988e;

    /* renamed from: f */
    public final boolean f5989f;

    /* renamed from: g */
    public final boolean f5990g;

    /* renamed from: h */
    public final int f5991h;

    /* renamed from: i */
    public final int f5992i;

    /* renamed from: j */
    public final boolean f5993j;

    /* renamed from: k */
    public final boolean f5994k;

    /* renamed from: l */
    public final boolean f5995l;

    /* renamed from: m */
    public String f5996m;

    /* renamed from: w3.e$a */
    public static final class C2066a {
        public C2066a(C0802f fVar) {
        }

        /* renamed from: a */
        public final int mo6551a(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                if (C1209l.m3438S(str2, str.charAt(i), false, 2)) {
                    return i;
                }
                i++;
            }
            return str.length();
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00ee  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00f2  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p139w3.C2065e mo6552b(p139w3.C2103w r27) {
            /*
                r26 = this;
                r0 = r26
                r1 = r27
                java.lang.String r2 = "headers"
                p072l2.C1241e.m3517j(r1, r2)
                int r2 = r27.size()
                r6 = 1
                r8 = r6
                r7 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = -1
                r13 = -1
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = -1
                r18 = -1
                r19 = 0
                r20 = 0
                r21 = 0
            L_0x0023:
                if (r7 >= r2) goto L_0x0191
                java.lang.String r3 = r1.mo6612c(r7)
                java.lang.String r4 = r1.mo6614e(r7)
                java.lang.String r5 = "Cache-Control"
                boolean r5 = p067k3.C1205h.m3427K(r3, r5, r6)
                if (r5 == 0) goto L_0x003a
                if (r9 == 0) goto L_0x0038
                goto L_0x0042
            L_0x0038:
                r9 = r4
                goto L_0x0043
            L_0x003a:
                java.lang.String r5 = "Pragma"
                boolean r3 = p067k3.C1205h.m3427K(r3, r5, r6)
                if (r3 == 0) goto L_0x0185
            L_0x0042:
                r8 = 0
            L_0x0043:
                r3 = 0
            L_0x0044:
                int r5 = r4.length()
                if (r3 >= r5) goto L_0x0180
                java.lang.String r5 = "=,;"
                int r5 = r0.mo6551a(r4, r5, r3)
                java.lang.String r3 = r4.substring(r3, r5)
                java.lang.String r6 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                p072l2.C1241e.m3516f(r3, r6)
                java.lang.CharSequence r3 = p067k3.C1209l.m3455j0(r3)
                java.lang.String r3 = r3.toString()
                int r1 = r4.length()
                if (r5 == r1) goto L_0x00dc
                char r1 = r4.charAt(r5)
                r24 = r2
                r2 = 44
                if (r1 == r2) goto L_0x00de
                char r1 = r4.charAt(r5)
                r2 = 59
                if (r1 != r2) goto L_0x007a
                goto L_0x00de
            L_0x007a:
                int r5 = r5 + 1
                byte[] r1 = p144x3.C2129c.f6169a
                java.lang.String r1 = "$this$indexOfNonWhitespace"
                p072l2.C1241e.m3517j(r4, r1)
                int r1 = r4.length()
            L_0x0087:
                if (r5 >= r1) goto L_0x009d
                char r2 = r4.charAt(r5)
                r25 = r1
                r1 = 32
                if (r2 == r1) goto L_0x0098
                r1 = 9
                if (r2 == r1) goto L_0x0098
                goto L_0x00a1
            L_0x0098:
                int r5 = r5 + 1
                r1 = r25
                goto L_0x0087
            L_0x009d:
                int r5 = r4.length()
            L_0x00a1:
                int r1 = r4.length()
                if (r5 >= r1) goto L_0x00c3
                char r1 = r4.charAt(r5)
                r2 = 34
                if (r1 != r2) goto L_0x00c3
                int r5 = r5 + 1
                r1 = 4
                r25 = r9
                r9 = 0
                int r1 = p067k3.C1209l.m3444Y(r4, r2, r5, r9, r1)
                java.lang.String r2 = r4.substring(r5, r1)
                p072l2.C1241e.m3516f(r2, r6)
                r5 = 1
                int r1 = r1 + r5
                goto L_0x00e5
            L_0x00c3:
                r25 = r9
                r9 = 0
                java.lang.String r1 = ",;"
                int r1 = r0.mo6551a(r4, r1, r5)
                java.lang.String r2 = r4.substring(r5, r1)
                p072l2.C1241e.m3516f(r2, r6)
                java.lang.CharSequence r2 = p067k3.C1209l.m3455j0(r2)
                java.lang.String r2 = r2.toString()
                goto L_0x00e5
            L_0x00dc:
                r24 = r2
            L_0x00de:
                r25 = r9
                r9 = 0
                int r5 = r5 + 1
                r1 = r5
                r2 = 0
            L_0x00e5:
                java.lang.String r5 = "no-cache"
                r6 = 1
                boolean r5 = p067k3.C1205h.m3427K(r5, r3, r6)
                if (r5 == 0) goto L_0x00f2
                r10 = r6
            L_0x00ef:
                r5 = -1
                goto L_0x0177
            L_0x00f2:
                java.lang.String r5 = "no-store"
                boolean r5 = p067k3.C1205h.m3427K(r5, r3, r6)
                if (r5 == 0) goto L_0x00fc
                r11 = r6
                goto L_0x00ef
            L_0x00fc:
                java.lang.String r5 = "max-age"
                boolean r5 = p067k3.C1205h.m3427K(r5, r3, r6)
                if (r5 == 0) goto L_0x010b
                r5 = -1
                int r12 = p144x3.C2129c.m5534v(r2, r5)
                goto L_0x0177
            L_0x010b:
                r5 = -1
                java.lang.String r9 = "s-maxage"
                boolean r9 = p067k3.C1205h.m3427K(r9, r3, r6)
                if (r9 == 0) goto L_0x0119
                int r13 = p144x3.C2129c.m5534v(r2, r5)
                goto L_0x0177
            L_0x0119:
                java.lang.String r5 = "private"
                boolean r5 = p067k3.C1205h.m3427K(r5, r3, r6)
                if (r5 == 0) goto L_0x0123
                r14 = r6
                goto L_0x00ef
            L_0x0123:
                java.lang.String r5 = "public"
                boolean r5 = p067k3.C1205h.m3427K(r5, r3, r6)
                if (r5 == 0) goto L_0x012d
                r15 = r6
                goto L_0x00ef
            L_0x012d:
                java.lang.String r5 = "must-revalidate"
                boolean r5 = p067k3.C1205h.m3427K(r5, r3, r6)
                if (r5 == 0) goto L_0x0138
                r16 = r6
                goto L_0x00ef
            L_0x0138:
                java.lang.String r5 = "max-stale"
                boolean r5 = p067k3.C1205h.m3427K(r5, r3, r6)
                if (r5 == 0) goto L_0x0148
                r3 = 2147483647(0x7fffffff, float:NaN)
                int r17 = p144x3.C2129c.m5534v(r2, r3)
                goto L_0x00ef
            L_0x0148:
                java.lang.String r5 = "min-fresh"
                boolean r5 = p067k3.C1205h.m3427K(r5, r3, r6)
                if (r5 == 0) goto L_0x0156
                r5 = -1
                int r18 = p144x3.C2129c.m5534v(r2, r5)
                goto L_0x0177
            L_0x0156:
                r5 = -1
                java.lang.String r2 = "only-if-cached"
                boolean r2 = p067k3.C1205h.m3427K(r2, r3, r6)
                if (r2 == 0) goto L_0x0162
                r19 = r6
                goto L_0x0177
            L_0x0162:
                java.lang.String r2 = "no-transform"
                boolean r2 = p067k3.C1205h.m3427K(r2, r3, r6)
                if (r2 == 0) goto L_0x016d
                r20 = r6
                goto L_0x0177
            L_0x016d:
                java.lang.String r2 = "immutable"
                boolean r2 = p067k3.C1205h.m3427K(r2, r3, r6)
                if (r2 == 0) goto L_0x0177
                r21 = r6
            L_0x0177:
                r3 = r1
                r2 = r24
                r9 = r25
                r1 = r27
                goto L_0x0044
            L_0x0180:
                r24 = r2
                r25 = r9
                goto L_0x0188
            L_0x0185:
                r24 = r2
                r3 = r9
            L_0x0188:
                r5 = -1
                int r7 = r7 + 1
                r1 = r27
                r2 = r24
                goto L_0x0023
            L_0x0191:
                r3 = r9
                if (r8 != 0) goto L_0x0197
                r22 = 0
                goto L_0x0199
            L_0x0197:
                r22 = r3
            L_0x0199:
                w3.e r1 = new w3.e
                r23 = 0
                r9 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p139w3.C2065e.C2066a.mo6552b(w3.w):w3.e");
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C1241e.m3517j(timeUnit, "timeUnit");
        timeUnit.toSeconds((long) Integer.MAX_VALUE);
    }

    public C2065e(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, C0802f fVar) {
        this.f5984a = z;
        this.f5985b = z2;
        this.f5986c = i;
        this.f5987d = i2;
        this.f5988e = z3;
        this.f5989f = z4;
        this.f5990g = z5;
        this.f5991h = i3;
        this.f5992i = i4;
        this.f5993j = z6;
        this.f5994k = z7;
        this.f5995l = z8;
        this.f5996m = str;
    }

    public String toString() {
        String str = this.f5996m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f5984a) {
            sb.append("no-cache, ");
        }
        if (this.f5985b) {
            sb.append("no-store, ");
        }
        if (this.f5986c != -1) {
            sb.append("max-age=");
            sb.append(this.f5986c);
            sb.append(", ");
        }
        if (this.f5987d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f5987d);
            sb.append(", ");
        }
        if (this.f5988e) {
            sb.append("private, ");
        }
        if (this.f5989f) {
            sb.append("public, ");
        }
        if (this.f5990g) {
            sb.append("must-revalidate, ");
        }
        if (this.f5991h != -1) {
            sb.append("max-stale=");
            sb.append(this.f5991h);
            sb.append(", ");
        }
        if (this.f5992i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f5992i);
            sb.append(", ");
        }
        if (this.f5993j) {
            sb.append("only-if-cached, ");
        }
        if (this.f5994k) {
            sb.append("no-transform, ");
        }
        if (this.f5995l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        C1241e.m3516f(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f5996m = sb2;
        return sb2;
    }
}
