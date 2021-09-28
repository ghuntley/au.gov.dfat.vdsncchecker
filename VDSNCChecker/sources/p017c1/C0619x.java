package p017c1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p017c1.C0592g;

/* renamed from: c1.x */
public abstract class C0619x extends C0592g {

    /* renamed from: C */
    public static final String[] f2478C = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: B */
    public int f2479B = 3;

    /* renamed from: c1.x$a */
    public static class C0620a extends AnimatorListenerAdapter implements C0592g.C0596d {

        /* renamed from: a */
        public final View f2480a;

        /* renamed from: b */
        public final int f2481b;

        /* renamed from: c */
        public final ViewGroup f2482c;

        /* renamed from: d */
        public final boolean f2483d;

        /* renamed from: e */
        public boolean f2484e;

        /* renamed from: f */
        public boolean f2485f = false;

        public C0620a(View view, int i, boolean z) {
            this.f2480a = view;
            this.f2481b = i;
            this.f2482c = (ViewGroup) view.getParent();
            this.f2483d = z;
            mo2819g(true);
        }

        /* renamed from: a */
        public void mo2761a(C0592g gVar) {
        }

        /* renamed from: b */
        public void mo2736b(C0592g gVar) {
            mo2819g(true);
        }

        /* renamed from: c */
        public void mo2737c(C0592g gVar) {
            mo2819g(false);
        }

        /* renamed from: d */
        public void mo2738d(C0592g gVar) {
        }

        /* renamed from: e */
        public void mo2739e(C0592g gVar) {
            mo2818f();
            gVar.mo2762A(this);
        }

        /* renamed from: f */
        public final void mo2818f() {
            if (!this.f2485f) {
                C0609p.f2465a.mo2815f(this.f2480a, this.f2481b);
                ViewGroup viewGroup = this.f2482c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            mo2819g(false);
        }

        /* renamed from: g */
        public final void mo2819g(boolean z) {
            ViewGroup viewGroup;
            if (this.f2483d && this.f2484e != z && (viewGroup = this.f2482c) != null) {
                this.f2484e = z;
                C0608o.m1978a(viewGroup, z);
            }
        }

        public void onAnimationCancel(Animator animator) {
            this.f2485f = true;
        }

        public void onAnimationEnd(Animator animator) {
            mo2818f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f2485f) {
                C0609p.f2465a.mo2815f(this.f2480a, this.f2481b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f2485f) {
                C0609p.f2465a.mo2815f(this.f2480a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: c1.x$b */
    public static class C0621b {

        /* renamed from: a */
        public boolean f2486a;

        /* renamed from: b */
        public boolean f2487b;

        /* renamed from: c */
        public int f2488c;

        /* renamed from: d */
        public int f2489d;

        /* renamed from: e */
        public ViewGroup f2490e;

        /* renamed from: f */
        public ViewGroup f2491f;
    }

    /* renamed from: M */
    public final void mo2816M(C0607n nVar) {
        nVar.f2461a.put("android:visibility:visibility", Integer.valueOf(nVar.f2462b.getVisibility()));
        nVar.f2461a.put("android:visibility:parent", nVar.f2462b.getParent());
        int[] iArr = new int[2];
        nVar.f2462b.getLocationOnScreen(iArr);
        nVar.f2461a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r9 == 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r0.f2490e == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0091, code lost:
        if (r0.f2488c == 0) goto L_0x0093;
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p017c1.C0619x.C0621b mo2817N(p017c1.C0607n r8, p017c1.C0607n r9) {
        /*
            r7 = this;
            c1.x$b r0 = new c1.x$b
            r0.<init>()
            r1 = 0
            r0.f2486a = r1
            r0.f2487b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f2461a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f2461a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f2488c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f2461a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f2490e = r6
            goto L_0x0037
        L_0x0033:
            r0.f2488c = r4
            r0.f2490e = r3
        L_0x0037:
            if (r9 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f2461a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f2461a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f2489d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f2461a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f2491f = r2
            goto L_0x005e
        L_0x005a:
            r0.f2489d = r4
            r0.f2491f = r3
        L_0x005e:
            r2 = 1
            if (r8 == 0) goto L_0x0082
            if (r9 == 0) goto L_0x0082
            int r8 = r0.f2488c
            int r9 = r0.f2489d
            if (r8 != r9) goto L_0x0070
            android.view.ViewGroup r3 = r0.f2490e
            android.view.ViewGroup r4 = r0.f2491f
            if (r3 != r4) goto L_0x0070
            return r0
        L_0x0070:
            if (r8 == r9) goto L_0x0078
            if (r8 != 0) goto L_0x0075
            goto L_0x0093
        L_0x0075:
            if (r9 != 0) goto L_0x0096
            goto L_0x0088
        L_0x0078:
            android.view.ViewGroup r8 = r0.f2491f
            if (r8 != 0) goto L_0x007d
            goto L_0x0093
        L_0x007d:
            android.view.ViewGroup r8 = r0.f2490e
            if (r8 != 0) goto L_0x0096
            goto L_0x0088
        L_0x0082:
            if (r8 != 0) goto L_0x008d
            int r8 = r0.f2489d
            if (r8 != 0) goto L_0x008d
        L_0x0088:
            r0.f2487b = r2
        L_0x008a:
            r0.f2486a = r2
            goto L_0x0096
        L_0x008d:
            if (r9 != 0) goto L_0x0096
            int r8 = r0.f2488c
            if (r8 != 0) goto L_0x0096
        L_0x0093:
            r0.f2487b = r1
            goto L_0x008a
        L_0x0096:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p017c1.C0619x.mo2817N(c1.n, c1.n):c1.x$b");
    }

    /* renamed from: O */
    public abstract Animator mo2740O(ViewGroup viewGroup, View view, C0607n nVar, C0607n nVar2);

    /* renamed from: f */
    public void mo2720f(C0607n nVar) {
        mo2816M(nVar);
    }

    /* JADX WARNING: type inference failed for: r16v7, types: [android.view.ViewParent] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (mo2817N(mo2785s(r1, false), mo2787v(r1, false)).f2486a != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        r2 = (java.lang.Float) r2.f2461a.get("android:fade:transitionAlpha");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01eb  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo2722p(android.view.ViewGroup r22, p017c1.C0607n r23, p017c1.C0607n r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            c1.x$b r4 = r0.mo2817N(r2, r3)
            boolean r5 = r4.f2486a
            if (r5 == 0) goto L_0x02a7
            android.view.ViewGroup r5 = r4.f2490e
            if (r5 != 0) goto L_0x0018
            android.view.ViewGroup r5 = r4.f2491f
            if (r5 == 0) goto L_0x02a7
        L_0x0018:
            boolean r5 = r4.f2487b
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r9 = 1
            r10 = 0
            if (r5 == 0) goto L_0x006a
            int r1 = r0.f2479B
            r1 = r1 & r9
            if (r1 != r9) goto L_0x0068
            if (r3 != 0) goto L_0x0029
            goto L_0x0068
        L_0x0029:
            if (r2 != 0) goto L_0x0044
            android.view.View r1 = r3.f2462b
            android.view.ViewParent r1 = r1.getParent()
            android.view.View r1 = (android.view.View) r1
            c1.n r4 = r0.mo2785s(r1, r10)
            c1.n r1 = r0.mo2787v(r1, r10)
            c1.x$b r1 = r0.mo2817N(r4, r1)
            boolean r1 = r1.f2486a
            if (r1 == 0) goto L_0x0044
            goto L_0x0068
        L_0x0044:
            android.view.View r1 = r3.f2462b
            r3 = r0
            c1.c r3 = (p017c1.C0580c) r3
            if (r2 == 0) goto L_0x005c
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.f2461a
            java.lang.String r4 = "android:fade:transitionAlpha"
            java.lang.Object r2 = r2.get(r4)
            java.lang.Float r2 = (java.lang.Float) r2
            if (r2 == 0) goto L_0x005c
            float r2 = r2.floatValue()
            goto L_0x005d
        L_0x005c:
            r2 = r8
        L_0x005d:
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r8 = r2
        L_0x0063:
            android.animation.Animator r6 = r3.mo2741P(r1, r8, r7)
            goto L_0x0069
        L_0x0068:
            r6 = 0
        L_0x0069:
            return r6
        L_0x006a:
            int r4 = r4.f2489d
            int r5 = r0.f2479B
            r11 = 2
            r5 = r5 & r11
            if (r5 == r11) goto L_0x0076
        L_0x0072:
            r2 = r0
        L_0x0073:
            r6 = 0
            goto L_0x02a6
        L_0x0076:
            if (r2 != 0) goto L_0x0079
            goto L_0x0072
        L_0x0079:
            android.view.View r5 = r2.f2462b
            if (r3 == 0) goto L_0x0080
            android.view.View r12 = r3.f2462b
            goto L_0x0081
        L_0x0080:
            r12 = 0
        L_0x0081:
            r13 = 2131296646(0x7f090186, float:1.8211215E38)
            java.lang.Object r14 = r5.getTag(r13)
            android.view.View r14 = (android.view.View) r14
            if (r14 == 0) goto L_0x0091
            r19 = r4
            r12 = 0
            goto L_0x0220
        L_0x0091:
            if (r12 == 0) goto L_0x00a2
            android.view.ViewParent r14 = r12.getParent()
            if (r14 != 0) goto L_0x009a
            goto L_0x00a2
        L_0x009a:
            r14 = 4
            if (r4 != r14) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            if (r5 != r12) goto L_0x00a8
        L_0x00a0:
            r15 = r10
            goto L_0x00aa
        L_0x00a2:
            if (r12 == 0) goto L_0x00a8
            r15 = r10
            r14 = r12
            r12 = 0
            goto L_0x00ab
        L_0x00a8:
            r15 = r9
            r12 = 0
        L_0x00aa:
            r14 = 0
        L_0x00ab:
            if (r15 == 0) goto L_0x0219
            android.view.ViewParent r15 = r5.getParent()
            if (r15 != 0) goto L_0x00b9
            r19 = r4
            r14 = r5
            r9 = r10
            goto L_0x0220
        L_0x00b9:
            android.view.ViewParent r15 = r5.getParent()
            boolean r15 = r15 instanceof android.view.View
            if (r15 == 0) goto L_0x0219
            android.view.ViewParent r15 = r5.getParent()
            android.view.View r15 = (android.view.View) r15
            c1.n r6 = r0.mo2787v(r15, r9)
            c1.n r13 = r0.mo2785s(r15, r9)
            c1.x$b r6 = r0.mo2817N(r6, r13)
            boolean r6 = r6.f2486a
            if (r6 != 0) goto L_0x0204
            boolean r6 = p017c1.C0606m.f2458a
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            int r13 = r15.getScrollX()
            int r13 = -r13
            float r13 = (float) r13
            int r14 = r15.getScrollY()
            int r14 = -r14
            float r14 = (float) r14
            r6.setTranslate(r13, r14)
            c1.v r13 = p017c1.C0609p.f2465a
            r13.mo2812g(r5, r6)
            r13.mo2813h(r1, r6)
            android.graphics.RectF r13 = new android.graphics.RectF
            int r14 = r5.getWidth()
            float r14 = (float) r14
            int r15 = r5.getHeight()
            float r15 = (float) r15
            r13.<init>(r8, r8, r14, r15)
            r6.mapRect(r13)
            float r8 = r13.left
            int r8 = java.lang.Math.round(r8)
            float r14 = r13.top
            int r14 = java.lang.Math.round(r14)
            float r15 = r13.right
            int r15 = java.lang.Math.round(r15)
            float r11 = r13.bottom
            int r11 = java.lang.Math.round(r11)
            android.widget.ImageView r10 = new android.widget.ImageView
            android.content.Context r7 = r5.getContext()
            r10.<init>(r7)
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER_CROP
            r10.setScaleType(r7)
            boolean r7 = p017c1.C0606m.f2458a
            if (r7 == 0) goto L_0x013e
            boolean r7 = r5.isAttachedToWindow()
            r7 = r7 ^ r9
            if (r1 != 0) goto L_0x0139
            goto L_0x013f
        L_0x0139:
            boolean r16 = r22.isAttachedToWindow()
            goto L_0x0141
        L_0x013e:
            r7 = 0
        L_0x013f:
            r16 = 0
        L_0x0141:
            boolean r17 = p017c1.C0606m.f2459b
            if (r17 == 0) goto L_0x016e
            if (r7 == 0) goto L_0x016e
            if (r16 != 0) goto L_0x0150
            r19 = r4
            r16 = r12
            r0 = 0
            goto L_0x01e9
        L_0x0150:
            android.view.ViewParent r16 = r5.getParent()
            r9 = r16
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            int r16 = r9.indexOfChild(r5)
            r18 = r9
            android.view.ViewGroupOverlay r9 = r22.getOverlay()
            r9.add(r5)
            r9 = r18
            r20 = r16
            r16 = r12
            r12 = r20
            goto L_0x0172
        L_0x016e:
            r16 = r12
            r9 = 0
            r12 = 0
        L_0x0172:
            float r18 = r13.width()
            r19 = r4
            int r4 = java.lang.Math.round(r18)
            float r18 = r13.height()
            int r0 = java.lang.Math.round(r18)
            if (r4 <= 0) goto L_0x01da
            if (r0 <= 0) goto L_0x01da
            r18 = 1233125376(0x49800000, float:1048576.0)
            int r3 = r4 * r0
            float r3 = (float) r3
            float r3 = r18 / r3
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r2, r3)
            float r3 = (float) r4
            float r3 = r3 * r2
            int r3 = java.lang.Math.round(r3)
            float r0 = (float) r0
            float r0 = r0 * r2
            int r0 = java.lang.Math.round(r0)
            float r4 = r13.left
            float r4 = -r4
            float r13 = r13.top
            float r13 = -r13
            r6.postTranslate(r4, r13)
            r6.postScale(r2, r2)
            boolean r2 = p017c1.C0606m.f2460c
            if (r2 == 0) goto L_0x01c8
            android.graphics.Picture r2 = new android.graphics.Picture
            r2.<init>()
            android.graphics.Canvas r0 = r2.beginRecording(r3, r0)
            r0.concat(r6)
            r5.draw(r0)
            r2.endRecording()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2)
            goto L_0x01db
        L_0x01c8:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r0, r2)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            r2.concat(r6)
            r5.draw(r2)
            goto L_0x01db
        L_0x01da:
            r0 = 0
        L_0x01db:
            if (r17 == 0) goto L_0x01e9
            if (r7 == 0) goto L_0x01e9
            android.view.ViewGroupOverlay r2 = r22.getOverlay()
            r2.remove(r5)
            r9.addView(r5, r12)
        L_0x01e9:
            if (r0 == 0) goto L_0x01ee
            r10.setImageBitmap(r0)
        L_0x01ee:
            int r0 = r15 - r8
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r3 = r11 - r14
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r10.measure(r0, r2)
            r10.layout(r8, r14, r15, r11)
            r14 = r10
            goto L_0x021d
        L_0x0204:
            r19 = r4
            r16 = r12
            int r0 = r15.getId()
            android.view.ViewParent r2 = r15.getParent()
            if (r2 != 0) goto L_0x021d
            r2 = -1
            if (r0 == r2) goto L_0x021d
            r1.findViewById(r0)
            goto L_0x021d
        L_0x0219:
            r19 = r4
            r16 = r12
        L_0x021d:
            r12 = r16
            r9 = 0
        L_0x0220:
            if (r14 == 0) goto L_0x027c
            r0 = r23
            if (r9 != 0) goto L_0x0259
            java.util.Map<java.lang.String, java.lang.Object> r2 = r0.f2461a
            java.lang.String r3 = "android:visibility:screenLocation"
            java.lang.Object r2 = r2.get(r3)
            int[] r2 = (int[]) r2
            r3 = 0
            r4 = r2[r3]
            r6 = 1
            r2 = r2[r6]
            r7 = 2
            int[] r7 = new int[r7]
            r1.getLocationOnScreen(r7)
            r3 = r7[r3]
            int r4 = r4 - r3
            int r3 = r14.getLeft()
            int r4 = r4 - r3
            r14.offsetLeftAndRight(r4)
            r3 = r7[r6]
            int r2 = r2 - r3
            int r3 = r14.getTop()
            int r2 = r2 - r3
            r14.offsetTopAndBottom(r2)
            android.view.ViewGroupOverlay r2 = r22.getOverlay()
            r2.add(r14)
        L_0x0259:
            r2 = r21
            r3 = r24
            android.animation.Animator r6 = r2.mo2740O(r1, r14, r0, r3)
            if (r9 != 0) goto L_0x02a6
            if (r6 != 0) goto L_0x026d
            android.view.ViewGroupOverlay r0 = r22.getOverlay()
            r0.remove(r14)
            goto L_0x02a6
        L_0x026d:
            r0 = 2131296646(0x7f090186, float:1.8211215E38)
            r5.setTag(r0, r14)
            c1.w r0 = new c1.w
            r0.<init>(r2, r1, r14, r5)
        L_0x0278:
            r2.mo2774b(r0)
            goto L_0x02a6
        L_0x027c:
            r2 = r21
            r0 = r23
            r3 = r24
            if (r12 == 0) goto L_0x0073
            int r4 = r12.getVisibility()
            c1.v r5 = p017c1.C0609p.f2465a
            r6 = 0
            r5.mo2815f(r12, r6)
            android.animation.Animator r6 = r2.mo2740O(r1, r12, r0, r3)
            if (r6 == 0) goto L_0x02a3
            c1.x$a r0 = new c1.x$a
            r1 = r19
            r3 = 1
            r0.<init>(r12, r1, r3)
            r6.addListener(r0)
            r6.addPauseListener(r0)
            goto L_0x0278
        L_0x02a3:
            r5.mo2815f(r12, r4)
        L_0x02a6:
            return r6
        L_0x02a7:
            r2 = r0
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p017c1.C0619x.mo2722p(android.view.ViewGroup, c1.n, c1.n):android.animation.Animator");
    }

    /* renamed from: u */
    public String[] mo2723u() {
        return f2478C;
    }

    /* renamed from: w */
    public boolean mo2788w(C0607n nVar, C0607n nVar2) {
        if (nVar == null && nVar2 == null) {
            return false;
        }
        if (nVar != null && nVar2 != null && nVar2.f2461a.containsKey("android:visibility:visibility") != nVar.f2461a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C0621b N = mo2817N(nVar, nVar2);
        if (N.f2486a) {
            return N.f2488c == 0 || N.f2489d == 0;
        }
        return false;
    }
}
