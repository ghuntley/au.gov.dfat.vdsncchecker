package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.fragment.app.C0302r;
import androidx.navigation.C0364b;
import androidx.navigation.C0369e;
import java.util.ArrayDeque;
import java.util.Iterator;
import p146y0.C2131a;

@C0369e.C0371b("fragment")
/* renamed from: androidx.navigation.fragment.a */
public class C0375a extends C0369e<C0376a> {

    /* renamed from: a */
    public final Context f1773a;

    /* renamed from: b */
    public final C0302r f1774b;

    /* renamed from: c */
    public final int f1775c;

    /* renamed from: d */
    public ArrayDeque<Integer> f1776d = new ArrayDeque<>();

    /* renamed from: androidx.navigation.fragment.a$a */
    public static class C0376a extends C0364b {

        /* renamed from: m */
        public String f1777m;

        public C0376a(C0369e<? extends C0376a> eVar) {
            super(eVar);
        }

        /* renamed from: e */
        public void mo1864e(Context context, AttributeSet attributeSet) {
            super.mo1864e(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C2131a.f6181b);
            String string = obtainAttributes.getString(0);
            if (string != null) {
                this.f1777m = string;
            }
            obtainAttributes.recycle();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.f1777m;
            if (str == null) {
                str = "null";
            }
            sb.append(str);
            return sb.toString();
        }
    }

    /* renamed from: androidx.navigation.fragment.a$b */
    public static final class C0377b implements C0369e.C0370a {
    }

    public C0375a(Context context, C0302r rVar, int i) {
        this.f1773a = context;
        this.f1774b = rVar;
        this.f1775c = i;
    }

    /* renamed from: a */
    public C0364b mo1861a() {
        return new C0376a(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0199  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.navigation.C0364b mo1862b(androidx.navigation.C0364b r9, android.os.Bundle r10, p136w0.C2015m r11, androidx.navigation.C0369e.C0370a r12) {
        /*
            r8 = this;
            androidx.navigation.fragment.a$a r9 = (androidx.navigation.fragment.C0375a.C0376a) r9
            androidx.fragment.app.r r0 = r8.f1774b
            boolean r0 = r0.mo1690R()
            r1 = 0
            if (r0 == 0) goto L_0x000d
            goto L_0x01a3
        L_0x000d:
            java.lang.String r0 = r9.f1777m
            if (r0 == 0) goto L_0x01b3
            r2 = 0
            char r3 = r0.charAt(r2)
            r4 = 46
            if (r3 != r4) goto L_0x002f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            android.content.Context r4 = r8.f1773a
            java.lang.String r4 = r4.getPackageName()
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L_0x002f:
            android.content.Context r3 = r8.f1773a
            androidx.fragment.app.r r4 = r8.f1774b
            androidx.fragment.app.p r4 = r4.mo1684K()
            java.lang.ClassLoader r3 = r3.getClassLoader()
            androidx.fragment.app.k r0 = r4.mo1659a(r3, r0)
            r0.mo1621h0(r10)
            androidx.fragment.app.r r10 = r8.f1774b
            androidx.fragment.app.a r3 = new androidx.fragment.app.a
            r3.<init>(r10)
            r10 = -1
            if (r11 == 0) goto L_0x004f
            int r4 = r11.f5855d
            goto L_0x0050
        L_0x004f:
            r4 = r10
        L_0x0050:
            if (r11 == 0) goto L_0x0055
            int r5 = r11.f5856e
            goto L_0x0056
        L_0x0055:
            r5 = r10
        L_0x0056:
            if (r11 == 0) goto L_0x005b
            int r6 = r11.f5857f
            goto L_0x005c
        L_0x005b:
            r6 = r10
        L_0x005c:
            if (r11 == 0) goto L_0x0061
            int r7 = r11.f5858g
            goto L_0x0062
        L_0x0061:
            r7 = r10
        L_0x0062:
            if (r4 != r10) goto L_0x006a
            if (r5 != r10) goto L_0x006a
            if (r6 != r10) goto L_0x006a
            if (r7 == r10) goto L_0x0082
        L_0x006a:
            if (r4 == r10) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r4 = r2
        L_0x006e:
            if (r5 == r10) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r5 = r2
        L_0x0072:
            if (r6 == r10) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r6 = r2
        L_0x0076:
            if (r7 == r10) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r7 = r2
        L_0x007a:
            r3.f1588b = r4
            r3.f1589c = r5
            r3.f1590d = r6
            r3.f1591e = r7
        L_0x0082:
            int r4 = r8.f1775c
            if (r4 == 0) goto L_0x01ab
            r5 = 2
            r3.mo1537f(r4, r0, r1, r5)
            r3.mo1543l(r0)
            int r0 = r9.f1742g
            java.util.ArrayDeque<java.lang.Integer> r4 = r8.f1776d
            boolean r4 = r4.isEmpty()
            r5 = 1
            if (r11 == 0) goto L_0x00ae
            if (r4 != 0) goto L_0x00ae
            boolean r11 = r11.f5852a
            if (r11 == 0) goto L_0x00ae
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.f1776d
            java.lang.Object r11 = r11.peekLast()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r11 != r0) goto L_0x00ae
            r11 = r5
            goto L_0x00af
        L_0x00ae:
            r11 = r2
        L_0x00af:
            if (r4 == 0) goto L_0x00b2
            goto L_0x010a
        L_0x00b2:
            java.lang.String r4 = "This FragmentTransaction is not allowed to be added to the back stack."
            if (r11 == 0) goto L_0x00f7
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.f1776d
            int r11 = r11.size()
            if (r11 <= r5) goto L_0x010b
            androidx.fragment.app.r r11 = r8.f1774b
            java.util.ArrayDeque<java.lang.Integer> r6 = r8.f1776d
            int r6 = r6.size()
            java.util.ArrayDeque<java.lang.Integer> r7 = r8.f1776d
            java.lang.Object r7 = r7.peekLast()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.String r6 = r8.mo1884f(r6, r7)
            androidx.fragment.app.r$n r7 = new androidx.fragment.app.r$n
            r7.<init>(r6, r10, r5)
            r11.mo1674A(r7, r2)
            java.util.ArrayDeque<java.lang.Integer> r10 = r8.f1776d
            int r10 = r10.size()
            java.lang.String r10 = r8.mo1884f(r10, r0)
            boolean r11 = r3.f1594h
            if (r11 == 0) goto L_0x00f1
            r3.f1593g = r5
            r3.f1595i = r10
            goto L_0x010b
        L_0x00f1:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r4)
            throw r9
        L_0x00f7:
            java.util.ArrayDeque<java.lang.Integer> r10 = r8.f1776d
            int r10 = r10.size()
            int r10 = r10 + r5
            java.lang.String r10 = r8.mo1884f(r10, r0)
            boolean r11 = r3.f1594h
            if (r11 == 0) goto L_0x01a5
            r3.f1593g = r5
            r3.f1595i = r10
        L_0x010a:
            r2 = r5
        L_0x010b:
            boolean r10 = r12 instanceof androidx.navigation.fragment.C0375a.C0377b
            if (r10 == 0) goto L_0x0192
            androidx.navigation.fragment.a$b r12 = (androidx.navigation.fragment.C0375a.C0377b) r12
            java.util.Objects.requireNonNull(r12)
            java.util.Map r10 = java.util.Collections.unmodifiableMap(r1)
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x0120:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0192
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r12 = r11.getKey()
            android.view.View r12 = (android.view.View) r12
            java.lang.Object r11 = r11.getValue()
            java.lang.String r11 = (java.lang.String) r11
            int[] r4 = androidx.fragment.app.C0329z.f1636a
            java.util.WeakHashMap<android.view.View, j0.q> r4 = p058j0.C1061o.f3808a
            java.lang.String r12 = r12.getTransitionName()
            if (r12 == 0) goto L_0x018a
            java.util.ArrayList<java.lang.String> r4 = r3.f1600n
            if (r4 != 0) goto L_0x0155
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.f1600n = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.f1601o = r4
            goto L_0x0167
        L_0x0155:
            java.util.ArrayList<java.lang.String> r4 = r3.f1601o
            boolean r4 = r4.contains(r11)
            java.lang.String r6 = "' has already been added to the transaction."
            if (r4 != 0) goto L_0x017e
            java.util.ArrayList<java.lang.String> r4 = r3.f1600n
            boolean r4 = r4.contains(r12)
            if (r4 != 0) goto L_0x0172
        L_0x0167:
            java.util.ArrayList<java.lang.String> r4 = r3.f1600n
            r4.add(r12)
            java.util.ArrayList<java.lang.String> r12 = r3.f1601o
            r12.add(r11)
            goto L_0x0120
        L_0x0172:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "A shared element with the source name '"
            java.lang.String r10 = p016c0.C0559c.m1823a(r10, r12, r6)
            r9.<init>(r10)
            throw r9
        L_0x017e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "A shared element with the target name '"
            java.lang.String r10 = p016c0.C0559c.m1823a(r10, r11, r6)
            r9.<init>(r10)
            throw r9
        L_0x018a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Unique transitionNames are required for all sharedElements"
            r9.<init>(r10)
            throw r9
        L_0x0192:
            r3.f1602p = r5
            r3.mo1534c()
            if (r2 == 0) goto L_0x01a3
            java.util.ArrayDeque<java.lang.Integer> r10 = r8.f1776d
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r10.add(r11)
            goto L_0x01a4
        L_0x01a3:
            r9 = r1
        L_0x01a4:
            return r9
        L_0x01a5:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r4)
            throw r9
        L_0x01ab:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Must use non-zero containerViewId"
            r9.<init>(r10)
            throw r9
        L_0x01b3:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Fragment class was not set"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.C0375a.mo1862b(androidx.navigation.b, android.os.Bundle, w0.m, androidx.navigation.e$a):androidx.navigation.b");
    }

    /* renamed from: c */
    public void mo1878c(Bundle bundle) {
        int[] intArray = bundle.getIntArray("androidx-nav-fragment:navigator:backStackIds");
        if (intArray != null) {
            this.f1776d.clear();
            for (int valueOf : intArray) {
                this.f1776d.add(Integer.valueOf(valueOf));
            }
        }
    }

    /* renamed from: d */
    public Bundle mo1879d() {
        Bundle bundle = new Bundle();
        int[] iArr = new int[this.f1776d.size()];
        Iterator<Integer> it = this.f1776d.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        bundle.putIntArray("androidx-nav-fragment:navigator:backStackIds", iArr);
        return bundle;
    }

    /* renamed from: e */
    public boolean mo1863e() {
        if (this.f1776d.isEmpty() || this.f1774b.mo1690R()) {
            return false;
        }
        C0302r rVar = this.f1774b;
        rVar.mo1674A(new C0302r.C0317n(mo1884f(this.f1776d.size(), this.f1776d.peekLast().intValue()), -1, 1), false);
        this.f1776d.removeLast();
        return true;
    }

    /* renamed from: f */
    public final String mo1884f(int i, int i2) {
        return i + "-" + i2;
    }
}
