package p136w0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.List;
import p016c0.C0557a;
import p054i2.C1029b;
import p072l2.C1241e;
import p155j$.time.LocalDateTime;
import p155j$.time.ZoneOffset;

/* renamed from: w0.r */
public class C2036r {
    /* renamed from: a */
    public static final Intent m5363a(String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse(str));
    }

    /* renamed from: b */
    public static int m5364b(Context context, int i, int i2) {
        TypedValue a = C1029b.m2953a(context, i);
        return a != null ? a.data : i2;
    }

    /* renamed from: c */
    public static int m5365c(View view, int i) {
        return C1029b.m2955c(view.getContext(), i, view.getClass().getCanonicalName());
    }

    /* renamed from: d */
    public static final long m5366d() {
        return LocalDateTime.now(ZoneOffset.UTC).toEpochSecond(ZoneOffset.UTC);
    }

    /* renamed from: e */
    public static final SharedPreferences m5367e(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("vdsnc_prefs.dat", 0);
        C1241e.m3516f(sharedPreferences, "context.getSharedPreferences(\"vdsnc_prefs.dat\", Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    /* renamed from: f */
    public static TextView m5368f(Toolbar toolbar, CharSequence charSequence) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    return textView;
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    public static final int m5369g(int i) {
        return (int) (((float) i) * Resources.getSystem().getDisplayMetrics().density);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ca A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cb  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p077m1.C1427b m5370h(java.lang.String r15) {
        /*
            m1.b r0 = p077m1.C1427b.INVALID
            java.lang.String r1 = "value"
            p072l2.C1241e.m3517j(r15, r1)
            int r1 = r15.length()
            r2 = 4
            if (r1 >= r2) goto L_0x000f
            return r0
        L_0x000f:
            r1 = 2
            int r2 = r15.length()
            r3 = 1
            int r2 = r2 - r3
            java.lang.String r1 = r15.substring(r1, r2)
            java.lang.String r2 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p072l2.C1241e.m3516f(r1, r2)
            java.lang.String r2 = "$this$dropLast"
            p072l2.C1241e.m3517j(r15, r2)
            int r2 = r15.length()
            int r2 = r2 - r3
            r4 = 0
            if (r2 >= 0) goto L_0x002d
            r2 = r4
        L_0x002d:
            java.lang.String r2 = p067k3.C1210m.m3456k0(r15, r2)
            java.lang.String r5 = "$this$last"
            p072l2.C1241e.m3517j(r15, r5)
            int r5 = r15.length()
            if (r5 != 0) goto L_0x003e
            r5 = r3
            goto L_0x003f
        L_0x003e:
            r5 = r4
        L_0x003f:
            if (r5 != 0) goto L_0x0117
            int r5 = p067k3.C1209l.m3440U(r15)
            char r15 = r15.charAt(r5)
            java.lang.String r5 = "data"
            p072l2.C1241e.m3517j(r2, r5)
            r5 = 3
            int[] r6 = new int[r5]
            r6 = {7, 3, 1} // fill-array
            char[] r2 = r2.toCharArray()
            java.lang.String r7 = "(this as java.lang.String).toCharArray()"
            p072l2.C1241e.m3516f(r2, r7)
            int r7 = r2.length
            r8 = -1
            int r7 = r7 + r8
            if (r7 < 0) goto L_0x00ae
            r9 = r4
            r10 = r9
        L_0x0064:
            int r11 = r9 + 1
            char r12 = r2[r9]
            r13 = 48
            if (r13 > r12) goto L_0x0072
            r13 = 57
            if (r12 > r13) goto L_0x0072
            r13 = r3
            goto L_0x0073
        L_0x0072:
            r13 = r4
        L_0x0073:
            if (r13 == 0) goto L_0x007e
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r12 = java.lang.Integer.parseInt(r12)
            goto L_0x0097
        L_0x007e:
            r13 = 65
            if (r13 > r12) goto L_0x0088
            r13 = 90
            if (r12 > r13) goto L_0x0088
            r13 = r3
            goto L_0x0089
        L_0x0088:
            r13 = r4
        L_0x0089:
            if (r13 == 0) goto L_0x0090
            int r12 = r12 + -65
            int r12 = r12 + 10
            goto L_0x0097
        L_0x0090:
            r13 = 60
            if (r12 == r13) goto L_0x0096
            r12 = r8
            goto L_0x0097
        L_0x0096:
            r12 = r4
        L_0x0097:
            if (r12 != r8) goto L_0x009a
            goto L_0x00c7
        L_0x009a:
            int r9 = r9 % 3
            r13 = r9 ^ 3
            int r14 = -r9
            r14 = r14 | r9
            r13 = r13 & r14
            int r13 = r13 >> 31
            r13 = r13 & r5
            int r9 = r9 + r13
            r9 = r6[r9]
            int r12 = r12 * r9
            int r10 = r10 + r12
            if (r11 <= r7) goto L_0x00ac
            goto L_0x00af
        L_0x00ac:
            r9 = r11
            goto L_0x0064
        L_0x00ae:
            r10 = r4
        L_0x00af:
            int r10 = r10 % 10
            r2 = r10 ^ 10
            int r5 = -r10
            r5 = r5 | r10
            r2 = r2 & r5
            int r2 = r2 >> 31
            r2 = r2 & 10
            int r10 = r10 + r2
            java.lang.String r15 = java.lang.String.valueOf(r15)
            int r15 = java.lang.Integer.parseInt(r15)
            if (r10 != r15) goto L_0x00c7
            r15 = r3
            goto L_0x00c8
        L_0x00c7:
            r15 = r4
        L_0x00c8:
            if (r15 != 0) goto L_0x00cb
            return r0
        L_0x00cb:
            java.lang.String r15 = "[0-9]+"
            java.lang.String r2 = "pattern"
            p072l2.C1241e.m3517j(r15, r2)
            java.util.regex.Pattern r15 = java.util.regex.Pattern.compile(r15)
            java.lang.String r2 = "Pattern.compile(pattern)"
            p072l2.C1241e.m3516f(r15, r2)
            java.lang.String r2 = "nativePattern"
            p072l2.C1241e.m3517j(r15, r2)
            java.lang.String r2 = "input"
            p072l2.C1241e.m3517j(r1, r2)
            java.util.regex.Matcher r15 = r15.matcher(r1)
            boolean r15 = r15.matches()
            if (r15 != 0) goto L_0x00f0
            return r0
        L_0x00f0:
            int r15 = java.lang.Integer.parseInt(r1)
            r1 = 1000000(0xf4240, float:1.401298E-39)
            if (r1 > r15) goto L_0x0100
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r15 > r1) goto L_0x0100
            r1 = r3
            goto L_0x0101
        L_0x0100:
            r1 = r4
        L_0x0101:
            if (r1 == 0) goto L_0x0106
            m1.b r0 = p077m1.C1427b.VALID
            goto L_0x0116
        L_0x0106:
            r1 = 999000(0xf3e58, float:1.399897E-39)
            if (r1 > r15) goto L_0x0111
            r1 = 999999(0xf423f, float:1.401297E-39)
            if (r15 > r1) goto L_0x0111
            goto L_0x0112
        L_0x0111:
            r3 = r4
        L_0x0112:
            if (r3 == 0) goto L_0x0116
            m1.b r0 = p077m1.C1427b.SPECIMEN
        L_0x0116:
            return r0
        L_0x0117:
            java.util.NoSuchElementException r15 = new java.util.NoSuchElementException
            java.lang.String r0 = "Char sequence is empty."
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p136w0.C2036r.m5370h(java.lang.String):m1.b");
    }

    /* renamed from: i */
    public static int m5371i(int i, int i2, float f) {
        return C0557a.m1817a(C0557a.m1819c(i2, Math.round(((float) Color.alpha(i2)) * f)), i);
    }

    /* renamed from: j */
    public static void m5372j(AnimatorSet animatorSet, List<Animator> list) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = list.get(i);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
        ofInt.setDuration(j);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }

    /* renamed from: k */
    public static final void m5373k(Context context, byte[] bArr) {
        SharedPreferences.Editor edit = m5367e(context).edit();
        edit.putString("PREF_CRL_DATA", Base64.encodeToString(bArr, 8));
        edit.apply();
    }

    /* renamed from: l */
    public static final void m5374l(Context context) {
        SharedPreferences.Editor edit = m5367e(context).edit();
        edit.putLong("PREF_CRL_TIME_BETWEEN_UPDATES", m5366d());
        edit.apply();
    }
}
