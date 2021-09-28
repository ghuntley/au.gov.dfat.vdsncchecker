package p017c1;

import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;
import java.util.WeakHashMap;
import p058j0.C1061o;
import p058j0.C1070q;

/* renamed from: c1.b */
public class C0570b extends C0592g {

    /* renamed from: B */
    public static final String[] f2383B = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: C */
    public static final Property<C0579i, PointF> f2384C = new C0572b(PointF.class, "topLeft");

    /* renamed from: D */
    public static final Property<C0579i, PointF> f2385D = new C0573c(PointF.class, "bottomRight");

    /* renamed from: E */
    public static final Property<View, PointF> f2386E = new C0574d(PointF.class, "bottomRight");

    /* renamed from: F */
    public static final Property<View, PointF> f2387F = new C0575e(PointF.class, "topLeft");

    /* renamed from: G */
    public static final Property<View, PointF> f2388G = new C0576f(PointF.class, "position");

    /* renamed from: c1.b$a */
    public static class C0571a extends Property<Drawable, PointF> {

        /* renamed from: a */
        public Rect f2389a = new Rect();

        public C0571a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            ((Drawable) obj).copyBounds(this.f2389a);
            Rect rect = this.f2389a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        public void set(Object obj, Object obj2) {
            Drawable drawable = (Drawable) obj;
            PointF pointF = (PointF) obj2;
            drawable.copyBounds(this.f2389a);
            this.f2389a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f2389a);
        }
    }

    /* renamed from: c1.b$b */
    public static class C0572b extends Property<C0579i, PointF> {
        public C0572b(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            C0579i iVar = (C0579i) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            C0579i iVar = (C0579i) obj;
            PointF pointF = (PointF) obj2;
            Objects.requireNonNull(iVar);
            iVar.f2392a = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            iVar.f2393b = round;
            int i = iVar.f2397f + 1;
            iVar.f2397f = i;
            if (i == iVar.f2398g) {
                C0609p.m1980b(iVar.f2396e, iVar.f2392a, round, iVar.f2394c, iVar.f2395d);
                iVar.f2397f = 0;
                iVar.f2398g = 0;
            }
        }
    }

    /* renamed from: c1.b$c */
    public static class C0573c extends Property<C0579i, PointF> {
        public C0573c(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            C0579i iVar = (C0579i) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            C0579i iVar = (C0579i) obj;
            PointF pointF = (PointF) obj2;
            Objects.requireNonNull(iVar);
            iVar.f2394c = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            iVar.f2395d = round;
            int i = iVar.f2398g + 1;
            iVar.f2398g = i;
            if (iVar.f2397f == i) {
                C0609p.m1980b(iVar.f2396e, iVar.f2392a, iVar.f2393b, iVar.f2394c, round);
                iVar.f2397f = 0;
                iVar.f2398g = 0;
            }
        }
    }

    /* renamed from: c1.b$d */
    public static class C0574d extends Property<View, PointF> {
        public C0574d(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            C0609p.m1980b(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: c1.b$e */
    public static class C0575e extends Property<View, PointF> {
        public C0575e(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            C0609p.m1980b(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: c1.b$f */
    public static class C0576f extends Property<View, PointF> {
        public C0576f(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C0609p.m1980b(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: c1.b$g */
    public class C0577g extends AnimatorListenerAdapter {
        private C0579i mViewBounds;

        public C0577g(C0570b bVar, C0579i iVar) {
            this.mViewBounds = iVar;
        }
    }

    /* renamed from: c1.b$h */
    public class C0578h extends C0599j {

        /* renamed from: a */
        public boolean f2390a = false;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f2391b;

        public C0578h(C0570b bVar, ViewGroup viewGroup) {
            this.f2391b = viewGroup;
        }

        /* renamed from: b */
        public void mo2736b(C0592g gVar) {
            C0608o.m1978a(this.f2391b, true);
        }

        /* renamed from: c */
        public void mo2737c(C0592g gVar) {
            C0608o.m1978a(this.f2391b, false);
        }

        /* renamed from: d */
        public void mo2738d(C0592g gVar) {
            C0608o.m1978a(this.f2391b, false);
            this.f2390a = true;
        }

        /* renamed from: e */
        public void mo2739e(C0592g gVar) {
            if (!this.f2390a) {
                C0608o.m1978a(this.f2391b, false);
            }
            gVar.mo2762A(this);
        }
    }

    /* renamed from: c1.b$i */
    public static class C0579i {

        /* renamed from: a */
        public int f2392a;

        /* renamed from: b */
        public int f2393b;

        /* renamed from: c */
        public int f2394c;

        /* renamed from: d */
        public int f2395d;

        /* renamed from: e */
        public View f2396e;

        /* renamed from: f */
        public int f2397f;

        /* renamed from: g */
        public int f2398g;

        public C0579i(View view) {
            this.f2396e = view;
        }
    }

    static {
        new C0571a(PointF.class, "boundsOrigin");
    }

    /* renamed from: M */
    public final void mo2719M(C0607n nVar) {
        View view = nVar.f2462b;
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        if (view.isLaidOut() || view.getWidth() != 0 || view.getHeight() != 0) {
            nVar.f2461a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            nVar.f2461a.put("android:changeBounds:parent", nVar.f2462b.getParent());
        }
    }

    /* renamed from: f */
    public void mo2720f(C0607n nVar) {
        mo2719M(nVar);
    }

    /* renamed from: l */
    public void mo2721l(C0607n nVar) {
        mo2719M(nVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: android.animation.ObjectAnimator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0114  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo2722p(android.view.ViewGroup r19, p017c1.C0607n r20, p017c1.C0607n r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            if (r1 == 0) goto L_0x012c
            if (r2 != 0) goto L_0x000c
            goto L_0x012c
        L_0x000c:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r1.f2461a
            java.util.Map<java.lang.String, java.lang.Object> r5 = r2.f2461a
            java.lang.String r6 = "android:changeBounds:parent"
            java.lang.Object r4 = r4.get(r6)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.lang.Object r5 = r5.get(r6)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r4 == 0) goto L_0x012a
            if (r5 != 0) goto L_0x0024
            goto L_0x012a
        L_0x0024:
            android.view.View r4 = r2.f2462b
            java.util.Map<java.lang.String, java.lang.Object> r5 = r1.f2461a
            java.lang.String r6 = "android:changeBounds:bounds"
            java.lang.Object r5 = r5.get(r6)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            java.util.Map<java.lang.String, java.lang.Object> r7 = r2.f2461a
            java.lang.Object r6 = r7.get(r6)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            int r7 = r5.left
            int r8 = r6.left
            int r9 = r5.top
            int r10 = r6.top
            int r11 = r5.right
            int r12 = r6.right
            int r5 = r5.bottom
            int r6 = r6.bottom
            int r13 = r11 - r7
            int r14 = r5 - r9
            int r15 = r12 - r8
            int r3 = r6 - r10
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f2461a
            java.lang.String r0 = "android:changeBounds:clip"
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.f2461a
            java.lang.Object r0 = r2.get(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r2 = 1
            if (r13 == 0) goto L_0x0067
            if (r14 != 0) goto L_0x006b
        L_0x0067:
            if (r15 == 0) goto L_0x007c
            if (r3 == 0) goto L_0x007c
        L_0x006b:
            if (r7 != r8) goto L_0x0073
            if (r9 == r10) goto L_0x0070
            goto L_0x0073
        L_0x0070:
            r16 = 0
            goto L_0x0075
        L_0x0073:
            r16 = r2
        L_0x0075:
            if (r11 != r12) goto L_0x0079
            if (r5 == r6) goto L_0x007e
        L_0x0079:
            int r16 = r16 + 1
            goto L_0x007e
        L_0x007c:
            r16 = 0
        L_0x007e:
            if (r1 == 0) goto L_0x0086
            boolean r17 = r1.equals(r0)
            if (r17 == 0) goto L_0x008a
        L_0x0086:
            if (r1 != 0) goto L_0x008c
            if (r0 == 0) goto L_0x008c
        L_0x008a:
            int r16 = r16 + 1
        L_0x008c:
            r0 = r16
            if (r0 <= 0) goto L_0x0126
            p017c1.C0609p.m1980b(r4, r7, r9, r11, r5)
            r1 = 2
            if (r0 != r1) goto L_0x00e8
            if (r13 != r15) goto L_0x00a9
            if (r14 != r3) goto L_0x00a9
            r0 = r18
            m.c r1 = r0.f2435x
            float r3 = (float) r7
            float r5 = (float) r9
            float r6 = (float) r8
            float r7 = (float) r10
            android.graphics.Path r1 = r1.mo2791e(r3, r5, r6, r7)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = f2388G
            goto L_0x0108
        L_0x00a9:
            r0 = r18
            c1.b$i r3 = new c1.b$i
            r3.<init>(r4)
            m.c r13 = r0.f2435x
            float r7 = (float) r7
            float r9 = (float) r9
            float r8 = (float) r8
            float r10 = (float) r10
            android.graphics.Path r7 = r13.mo2791e(r7, r9, r8, r10)
            android.util.Property<c1.b$i, android.graphics.PointF> r8 = f2384C
            android.animation.ObjectAnimator r7 = p017c1.C0590e.m1907a(r3, r8, r7)
            m.c r8 = r0.f2435x
            float r9 = (float) r11
            float r5 = (float) r5
            float r10 = (float) r12
            float r6 = (float) r6
            android.graphics.Path r5 = r8.mo2791e(r9, r5, r10, r6)
            android.util.Property<c1.b$i, android.graphics.PointF> r6 = f2385D
            android.animation.ObjectAnimator r5 = p017c1.C0590e.m1907a(r3, r6, r5)
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r8 = 0
            r1[r8] = r7
            r1[r2] = r5
            r6.playTogether(r1)
            c1.b$g r1 = new c1.b$g
            r1.<init>(r0, r3)
            r6.addListener(r1)
            goto L_0x010c
        L_0x00e8:
            r0 = r18
            if (r7 != r8) goto L_0x00fc
            if (r9 == r10) goto L_0x00ef
            goto L_0x00fc
        L_0x00ef:
            m.c r1 = r0.f2435x
            float r3 = (float) r11
            float r5 = (float) r5
            float r7 = (float) r12
            float r6 = (float) r6
            android.graphics.Path r1 = r1.mo2791e(r3, r5, r7, r6)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = f2386E
            goto L_0x0108
        L_0x00fc:
            m.c r1 = r0.f2435x
            float r3 = (float) r7
            float r5 = (float) r9
            float r6 = (float) r8
            float r7 = (float) r10
            android.graphics.Path r1 = r1.mo2791e(r3, r5, r6, r7)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = f2387F
        L_0x0108:
            android.animation.ObjectAnimator r6 = p017c1.C0590e.m1907a(r4, r3, r1)
        L_0x010c:
            android.view.ViewParent r1 = r4.getParent()
            boolean r1 = r1 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0125
            android.view.ViewParent r1 = r4.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            p017c1.C0608o.m1978a(r1, r2)
            c1.b$h r2 = new c1.b$h
            r2.<init>(r0, r1)
            r0.mo2774b(r2)
        L_0x0125:
            return r6
        L_0x0126:
            r0 = r18
            r1 = 0
            return r1
        L_0x012a:
            r1 = 0
            return r1
        L_0x012c:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p017c1.C0570b.mo2722p(android.view.ViewGroup, c1.n, c1.n):android.animation.Animator");
    }

    /* renamed from: u */
    public String[] mo2723u() {
        return f2383B;
    }
}
