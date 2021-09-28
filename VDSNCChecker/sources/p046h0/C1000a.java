package p046h0;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Locale;
import p046h0.C1005d;

/* renamed from: h0.a */
public final class C1000a {

    /* renamed from: d */
    public static final C1004c f3699d;

    /* renamed from: e */
    public static final String f3700e = Character.toString(8206);

    /* renamed from: f */
    public static final String f3701f = Character.toString(8207);

    /* renamed from: g */
    public static final C1000a f3702g;

    /* renamed from: h */
    public static final C1000a f3703h;

    /* renamed from: a */
    public final boolean f3704a;

    /* renamed from: b */
    public final int f3705b;

    /* renamed from: c */
    public final C1004c f3706c;

    /* renamed from: h0.a$a */
    public static class C1001a {

        /* renamed from: e */
        public static final byte[] f3707e = new byte[1792];

        /* renamed from: a */
        public final CharSequence f3708a;

        /* renamed from: b */
        public final int f3709b;

        /* renamed from: c */
        public int f3710c;

        /* renamed from: d */
        public char f3711d;

        static {
            for (int i = 0; i < 1792; i++) {
                f3707e[i] = Character.getDirectionality(i);
            }
        }

        public C1001a(CharSequence charSequence, boolean z) {
            this.f3708a = charSequence;
            this.f3709b = charSequence.length();
        }

        /* renamed from: a */
        public byte mo4423a() {
            char charAt = this.f3708a.charAt(this.f3710c - 1);
            this.f3711d = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f3708a, this.f3710c);
                this.f3710c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f3710c--;
            char c = this.f3711d;
            return c < 1792 ? f3707e[c] : Character.getDirectionality(c);
        }
    }

    static {
        C1004c cVar = C1005d.f3718c;
        f3699d = cVar;
        f3702g = new C1000a(false, 2, cVar);
        f3703h = new C1000a(true, 2, cVar);
    }

    public C1000a(boolean z, int i, C1004c cVar) {
        this.f3704a = z;
        this.f3705b = i;
        this.f3706c = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m2926a(java.lang.CharSequence r9) {
        /*
            h0.a$a r0 = new h0.a$a
            r1 = 0
            r0.<init>(r9, r1)
            r0.f3710c = r1
            r9 = -1
            r2 = 1
            r3 = r1
            r4 = r3
            r5 = r4
        L_0x000d:
            int r6 = r0.f3710c
            int r7 = r0.f3709b
            if (r6 >= r7) goto L_0x0070
            if (r3 != 0) goto L_0x0070
            java.lang.CharSequence r7 = r0.f3708a
            char r6 = r7.charAt(r6)
            r0.f3711d = r6
            boolean r6 = java.lang.Character.isHighSurrogate(r6)
            if (r6 == 0) goto L_0x0039
            java.lang.CharSequence r6 = r0.f3708a
            int r7 = r0.f3710c
            int r6 = java.lang.Character.codePointAt(r6, r7)
            int r7 = r0.f3710c
            int r8 = java.lang.Character.charCount(r6)
            int r8 = r8 + r7
            r0.f3710c = r8
            byte r6 = java.lang.Character.getDirectionality(r6)
            goto L_0x004d
        L_0x0039:
            int r6 = r0.f3710c
            int r6 = r6 + r2
            r0.f3710c = r6
            char r6 = r0.f3711d
            r7 = 1792(0x700, float:2.511E-42)
            if (r6 >= r7) goto L_0x0049
            byte[] r7 = p046h0.C1000a.C1001a.f3707e
            byte r6 = r7[r6]
            goto L_0x004d
        L_0x0049:
            byte r6 = java.lang.Character.getDirectionality(r6)
        L_0x004d:
            if (r6 == 0) goto L_0x006b
            if (r6 == r2) goto L_0x0068
            r7 = 2
            if (r6 == r7) goto L_0x0068
            r7 = 9
            if (r6 == r7) goto L_0x000d
            switch(r6) {
                case 14: goto L_0x0064;
                case 15: goto L_0x0064;
                case 16: goto L_0x0060;
                case 17: goto L_0x0060;
                case 18: goto L_0x005c;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x006e
        L_0x005c:
            int r5 = r5 + -1
            r4 = r1
            goto L_0x000d
        L_0x0060:
            int r5 = r5 + 1
            r4 = r2
            goto L_0x000d
        L_0x0064:
            int r5 = r5 + 1
            r4 = r9
            goto L_0x000d
        L_0x0068:
            if (r5 != 0) goto L_0x006e
            goto L_0x0088
        L_0x006b:
            if (r5 != 0) goto L_0x006e
            goto L_0x008c
        L_0x006e:
            r3 = r5
            goto L_0x000d
        L_0x0070:
            if (r3 != 0) goto L_0x0073
            goto L_0x0091
        L_0x0073:
            if (r4 == 0) goto L_0x0077
            r1 = r4
            goto L_0x0091
        L_0x0077:
            int r4 = r0.f3710c
            if (r4 <= 0) goto L_0x0091
            byte r4 = r0.mo4423a()
            switch(r4) {
                case 14: goto L_0x008a;
                case 15: goto L_0x008a;
                case 16: goto L_0x0086;
                case 17: goto L_0x0086;
                case 18: goto L_0x0083;
                default: goto L_0x0082;
            }
        L_0x0082:
            goto L_0x0077
        L_0x0083:
            int r5 = r5 + 1
            goto L_0x0077
        L_0x0086:
            if (r3 != r5) goto L_0x008e
        L_0x0088:
            r1 = r2
            goto L_0x0091
        L_0x008a:
            if (r3 != r5) goto L_0x008e
        L_0x008c:
            r1 = r9
            goto L_0x0091
        L_0x008e:
            int r5 = r5 + -1
            goto L_0x0077
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046h0.C1000a.m2926a(java.lang.CharSequence):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return 1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m2927b(java.lang.CharSequence r6) {
        /*
            h0.a$a r0 = new h0.a$a
            r1 = 0
            r0.<init>(r6, r1)
            int r6 = r0.f3709b
            r0.f3710c = r6
            r6 = r1
        L_0x000b:
            r2 = r6
        L_0x000c:
            int r3 = r0.f3710c
            r4 = 1
            if (r3 <= 0) goto L_0x0041
            byte r3 = r0.mo4423a()
            if (r3 == 0) goto L_0x0039
            if (r3 == r4) goto L_0x0032
            r5 = 2
            if (r3 == r5) goto L_0x0032
            r5 = 9
            if (r3 == r5) goto L_0x000c
            switch(r3) {
                case 14: goto L_0x002c;
                case 15: goto L_0x002c;
                case 16: goto L_0x0029;
                case 17: goto L_0x0029;
                case 18: goto L_0x0026;
                default: goto L_0x0023;
            }
        L_0x0023:
            if (r6 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0029:
            if (r6 != r2) goto L_0x002f
            goto L_0x0034
        L_0x002c:
            if (r6 != r2) goto L_0x002f
            goto L_0x003b
        L_0x002f:
            int r2 = r2 + -1
            goto L_0x000c
        L_0x0032:
            if (r2 != 0) goto L_0x0036
        L_0x0034:
            r1 = r4
            goto L_0x0041
        L_0x0036:
            if (r6 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0039:
            if (r2 != 0) goto L_0x003d
        L_0x003b:
            r1 = -1
            goto L_0x0041
        L_0x003d:
            if (r6 != 0) goto L_0x000c
        L_0x003f:
            r6 = r2
            goto L_0x000b
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046h0.C1000a.m2927b(java.lang.CharSequence):int");
    }

    /* renamed from: c */
    public static C1000a m2928c() {
        Locale locale = Locale.getDefault();
        int i = C1010e.f3723a;
        boolean z = true;
        if (TextUtils.getLayoutDirectionFromLocale(locale) != 1) {
            z = false;
        }
        C1004c cVar = f3699d;
        if (cVar == f3699d) {
            return z ? f3703h : f3702g;
        }
        return new C1000a(z, 2, cVar);
    }

    /* renamed from: d */
    public CharSequence mo4422d(CharSequence charSequence, C1004c cVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean b = ((C1005d.C1008c) cVar).mo4441b(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (((this.f3705b & 2) != 0) && z) {
            boolean b2 = ((C1005d.C1008c) (b ? C1005d.f3717b : C1005d.f3716a)).mo4441b(charSequence, 0, charSequence.length());
            spannableStringBuilder.append((this.f3704a || (!b2 && m2926a(charSequence) != 1)) ? (!this.f3704a || (b2 && m2926a(charSequence) != -1)) ? str : f3701f : f3700e);
        }
        if (b != this.f3704a) {
            spannableStringBuilder.append(b ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            boolean b3 = ((C1005d.C1008c) (b ? C1005d.f3717b : C1005d.f3716a)).mo4441b(charSequence, 0, charSequence.length());
            if (!this.f3704a && (b3 || m2927b(charSequence) == 1)) {
                str = f3700e;
            } else if (this.f3704a && (!b3 || m2927b(charSequence) == -1)) {
                str = f3701f;
            }
            spannableStringBuilder.append(str);
        }
        return spannableStringBuilder;
    }
}
