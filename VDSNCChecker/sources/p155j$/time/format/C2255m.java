package p155j$.time.format;

import java.util.Objects;
import p155j$.time.C2220a;
import p155j$.time.temporal.C2285a;

/* renamed from: j$.time.format.m */
final class C2255m implements C2250h {

    /* renamed from: c */
    static final String[] f6442c = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

    /* renamed from: d */
    static final C2255m f6443d = new C2255m("+HH:MM:ss", "Z");

    /* renamed from: e */
    static final C2255m f6444e = new C2255m("+HH:MM:ss", "0");

    /* renamed from: a */
    private final String f6445a;

    /* renamed from: b */
    private final int f6446b;

    C2255m(String str, String str2) {
        Objects.requireNonNull(str, "pattern");
        Objects.requireNonNull(str2, "noOffsetText");
        int i = 0;
        while (true) {
            String[] strArr = f6442c;
            if (i >= strArr.length) {
                throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
            } else if (strArr[i].equals(str)) {
                this.f6446b = i;
                this.f6445a = str2;
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: a */
    private boolean m5868a(int[] iArr, int i, CharSequence charSequence, boolean z) {
        int i2;
        int i3 = this.f6446b;
        if ((i3 + 3) / 2 < i) {
            return false;
        }
        int i4 = iArr[0];
        if (i3 % 2 == 0 && i > 1) {
            int i5 = i4 + 1;
            if (i5 > charSequence.length() || charSequence.charAt(i4) != ':') {
                return z;
            }
            i4 = i5;
        }
        if (i4 + 2 > charSequence.length()) {
            return z;
        }
        int i6 = i4 + 1;
        char charAt = charSequence.charAt(i4);
        int i7 = i6 + 1;
        char charAt2 = charSequence.charAt(i6);
        if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9' || (i2 = (charAt2 - '0') + ((charAt - '0') * 10)) < 0 || i2 > 59) {
            return z;
        }
        iArr[i] = i2;
        iArr[0] = i7;
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r16.mo6963s(r17, r18, r0.f6445a, 0, r9) != false) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007c  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo6897c(p155j$.time.format.C2266x r16, java.lang.CharSequence r17, int r18) {
        /*
            r15 = this;
            r0 = r15
            r7 = r17
            r8 = r18
            int r1 = r17.length()
            java.lang.String r2 = r0.f6445a
            int r9 = r2.length()
            if (r9 != 0) goto L_0x0022
            if (r8 != r1) goto L_0x0041
            j$.time.temporal.a r2 = p155j$.time.temporal.C2285a.OFFSET_SECONDS
            r3 = 0
            r1 = r16
            r5 = r18
            r6 = r18
        L_0x001d:
            int r1 = r1.mo6959o(r2, r3, r5, r6)
            return r1
        L_0x0022:
            if (r8 != r1) goto L_0x0026
            int r1 = ~r8
            return r1
        L_0x0026:
            java.lang.String r4 = r0.f6445a
            r5 = 0
            r1 = r16
            r2 = r17
            r3 = r18
            r6 = r9
            boolean r1 = r1.mo6963s(r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x0041
        L_0x0036:
            j$.time.temporal.a r2 = p155j$.time.temporal.C2285a.OFFSET_SECONDS
            int r6 = r8 + r9
            r3 = 0
            r1 = r16
            r5 = r18
            goto L_0x001d
        L_0x0041:
            char r1 = r17.charAt(r18)
            r2 = 43
            r3 = 45
            if (r1 == r2) goto L_0x004d
            if (r1 != r3) goto L_0x009a
        L_0x004d:
            r2 = 1
            if (r1 != r3) goto L_0x0052
            r1 = -1
            goto L_0x0053
        L_0x0052:
            r1 = r2
        L_0x0053:
            r3 = 4
            int[] r3 = new int[r3]
            int r4 = r8 + 1
            r5 = 0
            r3[r5] = r4
            boolean r4 = r15.m5868a(r3, r2, r7, r2)
            r6 = 2
            r10 = 3
            if (r4 != 0) goto L_0x0079
            int r4 = r0.f6446b
            if (r4 < r10) goto L_0x0069
            r4 = r2
            goto L_0x006a
        L_0x0069:
            r4 = r5
        L_0x006a:
            boolean r4 = r15.m5868a(r3, r6, r7, r4)
            if (r4 != 0) goto L_0x0079
            boolean r4 = r15.m5868a(r3, r10, r7, r5)
            if (r4 == 0) goto L_0x0077
            goto L_0x0079
        L_0x0077:
            r4 = r5
            goto L_0x007a
        L_0x0079:
            r4 = r2
        L_0x007a:
            if (r4 != 0) goto L_0x009a
            long r11 = (long) r1
            r1 = r3[r2]
            long r1 = (long) r1
            r13 = 3600(0xe10, double:1.7786E-320)
            long r1 = r1 * r13
            r4 = r3[r6]
            long r6 = (long) r4
            r13 = 60
            long r6 = r6 * r13
            long r6 = r6 + r1
            r1 = r3[r10]
            long r1 = (long) r1
            long r6 = r6 + r1
            long r6 = r6 * r11
            j$.time.temporal.a r2 = p155j$.time.temporal.C2285a.OFFSET_SECONDS
            r9 = r3[r5]
            r1 = r16
            r3 = r6
            r5 = r18
            r6 = r9
            goto L_0x001d
        L_0x009a:
            if (r9 != 0) goto L_0x009d
            goto L_0x0036
        L_0x009d:
            int r1 = ~r8
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p155j$.time.format.C2255m.mo6897c(j$.time.format.x, java.lang.CharSequence, int):int");
    }

    /* renamed from: d */
    public boolean mo6898d(C2233A a, StringBuilder sb) {
        Long e = a.mo6866e(C2285a.OFFSET_SECONDS);
        if (e == null) {
            return false;
        }
        int intExact = Math.toIntExact(e.longValue());
        if (intExact != 0) {
            int abs = Math.abs((intExact / 3600) % 100);
            int abs2 = Math.abs((intExact / 60) % 60);
            int abs3 = Math.abs(intExact % 60);
            int length = sb.length();
            sb.append(intExact < 0 ? "-" : "+");
            sb.append((char) ((abs / 10) + 48));
            sb.append((char) ((abs % 10) + 48));
            int i = this.f6446b;
            if (i >= 3 || (i >= 1 && abs2 > 0)) {
                String str = ":";
                sb.append(i % 2 == 0 ? str : "");
                sb.append((char) ((abs2 / 10) + 48));
                sb.append((char) ((abs2 % 10) + 48));
                abs += abs2;
                int i2 = this.f6446b;
                if (i2 >= 7 || (i2 >= 5 && abs3 > 0)) {
                    if (i2 % 2 != 0) {
                        str = "";
                    }
                    sb.append(str);
                    sb.append((char) ((abs3 / 10) + 48));
                    sb.append((char) ((abs3 % 10) + 48));
                    abs += abs3;
                }
            }
            if (abs == 0) {
                sb.setLength(length);
            }
            return true;
        }
        sb.append(this.f6445a);
        return true;
    }

    public String toString() {
        String replace = this.f6445a.replace("'", "''");
        StringBuilder a = C2220a.m5746a("Offset(");
        a.append(f6442c[this.f6446b]);
        a.append(",'");
        a.append(replace);
        a.append("')");
        return a.toString();
    }
}
