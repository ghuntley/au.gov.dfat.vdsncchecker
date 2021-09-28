package p106r0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0263a0;
import androidx.fragment.app.C0286k;
import androidx.fragment.app.C0302r;
import androidx.fragment.app.C0321t;

/* renamed from: r0.j */
public class C1648j implements LayoutInflater.Factory2 {

    /* renamed from: e */
    public final C0302r f5046e;

    /* renamed from: r0.j$a */
    public class C1649a implements View.OnAttachStateChangeListener {

        /* renamed from: e */
        public final /* synthetic */ C0321t f5047e;

        public C1649a(C0321t tVar) {
            this.f5047e = tVar;
        }

        public void onViewAttachedToWindow(View view) {
            C0321t tVar = this.f5047e;
            C0286k kVar = tVar.f1583c;
            tVar.mo1763k();
            C0263a0.m751f((ViewGroup) kVar.f1441J.getParent(), C1648j.this.f5046e).mo1549e();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public C1648j(C0302r rVar) {
        this.f5046e = rVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x014f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.View r10, java.lang.String r11, android.content.Context r12, android.util.AttributeSet r13) {
        /*
            r9 = this;
            java.lang.Class<androidx.fragment.app.FragmentContainerView> r0 = androidx.fragment.app.FragmentContainerView.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0014
            androidx.fragment.app.FragmentContainerView r10 = new androidx.fragment.app.FragmentContainerView
            androidx.fragment.app.r r11 = r9.f5046e
            r10.<init>(r12, r13, r11)
            return r10
        L_0x0014:
            java.lang.String r0 = "fragment"
            boolean r11 = r0.equals(r11)
            r0 = 0
            if (r11 != 0) goto L_0x001e
            return r0
        L_0x001e:
            java.lang.String r11 = "class"
            java.lang.String r11 = r13.getAttributeValue(r0, r11)
            int[] r1 = p100q0.C1602a.f4980a
            android.content.res.TypedArray r1 = r12.obtainStyledAttributes(r13, r1)
            r2 = 0
            if (r11 != 0) goto L_0x0031
            java.lang.String r11 = r1.getString(r2)
        L_0x0031:
            r3 = 1
            r4 = -1
            int r5 = r1.getResourceId(r3, r4)
            r6 = 2
            java.lang.String r7 = r1.getString(r6)
            r1.recycle()
            if (r11 == 0) goto L_0x0199
            java.lang.ClassLoader r1 = r12.getClassLoader()
            p.h<java.lang.ClassLoader, p.h<java.lang.String, java.lang.Class<?>>> r8 = androidx.fragment.app.C0299p.f1514a
            java.lang.Class r1 = androidx.fragment.app.C0299p.m847b(r1, r11)     // Catch:{ ClassNotFoundException -> 0x0052 }
            java.lang.Class<androidx.fragment.app.k> r8 = androidx.fragment.app.C0286k.class
            boolean r1 = r8.isAssignableFrom(r1)     // Catch:{ ClassNotFoundException -> 0x0052 }
            goto L_0x0053
        L_0x0052:
            r1 = r2
        L_0x0053:
            if (r1 != 0) goto L_0x0057
            goto L_0x0199
        L_0x0057:
            if (r10 == 0) goto L_0x005d
            int r2 = r10.getId()
        L_0x005d:
            if (r2 != r4) goto L_0x0082
            if (r5 != r4) goto L_0x0082
            if (r7 == 0) goto L_0x0064
            goto L_0x0082
        L_0x0064:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = r13.getPositionDescription()
            r12.append(r13)
            java.lang.String r13 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        L_0x0082:
            if (r5 == r4) goto L_0x008a
            androidx.fragment.app.r r0 = r9.f5046e
            androidx.fragment.app.k r0 = r0.mo1681H(r5)
        L_0x008a:
            if (r0 != 0) goto L_0x0094
            if (r7 == 0) goto L_0x0094
            androidx.fragment.app.r r0 = r9.f5046e
            androidx.fragment.app.k r0 = r0.mo1682I(r7)
        L_0x0094:
            if (r0 != 0) goto L_0x009e
            if (r2 == r4) goto L_0x009e
            androidx.fragment.app.r r0 = r9.f5046e
            androidx.fragment.app.k r0 = r0.mo1681H(r2)
        L_0x009e:
            java.lang.String r1 = "Fragment "
            if (r0 != 0) goto L_0x00e8
            androidx.fragment.app.r r0 = r9.f5046e
            androidx.fragment.app.p r0 = r0.mo1684K()
            java.lang.ClassLoader r12 = r12.getClassLoader()
            androidx.fragment.app.k r0 = r0.mo1659a(r12, r11)
            r0.f1468q = r3
            if (r5 == 0) goto L_0x00b6
            r12 = r5
            goto L_0x00b7
        L_0x00b6:
            r12 = r2
        L_0x00b7:
            r0.f1477z = r12
            r0.f1432A = r2
            r0.f1433B = r7
            r0.f1469r = r3
            androidx.fragment.app.r r12 = r9.f5046e
            r0.f1473v = r12
            r0.i<?> r12 = r12.f1546q
            r0.f1474w = r12
            android.content.Context r12 = r12.f5043f
            android.os.Bundle r2 = r0.f1457f
            r0.mo1595N(r12, r13, r2)
            androidx.fragment.app.r r12 = r9.f5046e
            androidx.fragment.app.t r12 = r12.mo1699a(r0)
            boolean r13 = androidx.fragment.app.C0302r.m864N(r6)
            if (r13 == 0) goto L_0x0122
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r1)
            r13.append(r0)
            java.lang.String r2 = " has been inflated via the <fragment> tag: id=0x"
            goto L_0x0118
        L_0x00e8:
            boolean r12 = r0.f1469r
            if (r12 != 0) goto L_0x015b
            r0.f1469r = r3
            androidx.fragment.app.r r12 = r9.f5046e
            r0.f1473v = r12
            r0.i<?> r12 = r12.f1546q
            r0.f1474w = r12
            android.content.Context r12 = r12.f5043f
            android.os.Bundle r2 = r0.f1457f
            r0.mo1595N(r12, r13, r2)
            androidx.fragment.app.r r12 = r9.f5046e
            androidx.fragment.app.t r12 = r12.mo1713h(r0)
            boolean r13 = androidx.fragment.app.C0302r.m864N(r6)
            if (r13 == 0) goto L_0x0122
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r2 = "Retained Fragment "
            r13.append(r2)
            r13.append(r0)
            java.lang.String r2 = " has been re-attached via the <fragment> tag: id=0x"
        L_0x0118:
            r13.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r5)
            r13.append(r2)
        L_0x0122:
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r0.f1440I = r10
            r12.mo1763k()
            r12.mo1762j()
            android.view.View r10 = r0.f1441J
            if (r10 == 0) goto L_0x014f
            if (r5 == 0) goto L_0x0135
            r10.setId(r5)
        L_0x0135:
            android.view.View r10 = r0.f1441J
            java.lang.Object r10 = r10.getTag()
            if (r10 != 0) goto L_0x0142
            android.view.View r10 = r0.f1441J
            r10.setTag(r7)
        L_0x0142:
            android.view.View r10 = r0.f1441J
            r0.j$a r11 = new r0.j$a
            r11.<init>(r12)
            r10.addOnAttachStateChangeListener(r11)
            android.view.View r10 = r0.f1441J
            return r10
        L_0x014f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r12 = " did not create a view."
            java.lang.String r11 = p016c0.C0559c.m1823a(r1, r11, r12)
            r10.<init>(r11)
            throw r10
        L_0x015b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = r13.getPositionDescription()
            r12.append(r13)
            java.lang.String r13 = ": Duplicate id 0x"
            r12.append(r13)
            java.lang.String r13 = java.lang.Integer.toHexString(r5)
            r12.append(r13)
            java.lang.String r13 = ", tag "
            r12.append(r13)
            r12.append(r7)
            java.lang.String r13 = ", or parent id 0x"
            r12.append(r13)
            java.lang.String r13 = java.lang.Integer.toHexString(r2)
            r12.append(r13)
            java.lang.String r13 = " with another fragment for "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        L_0x0199:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p106r0.C1648j.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
