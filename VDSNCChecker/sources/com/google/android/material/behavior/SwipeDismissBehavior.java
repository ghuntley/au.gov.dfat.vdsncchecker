package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Objects;
import java.util.WeakHashMap;
import p058j0.C1061o;
import p058j0.C1070q;
import p064k0.C1150b;
import p094p0.C1568c;
import p101q1.C1603a;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.C0249c<V> {

    /* renamed from: a */
    public C1568c f2575a;

    /* renamed from: b */
    public boolean f2576b;

    /* renamed from: c */
    public int f2577c = 2;

    /* renamed from: d */
    public float f2578d = 0.5f;

    /* renamed from: e */
    public float f2579e = 0.0f;

    /* renamed from: f */
    public float f2580f = 0.5f;

    /* renamed from: g */
    public final C1568c.C1571c f2581g = new C0693a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    public class C0693a extends C1568c.C1571c {

        /* renamed from: a */
        public int f2582a;

        /* renamed from: b */
        public int f2583b = -1;

        public C0693a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
            if (r5 != false) goto L_0x001e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
            if (r5 != false) goto L_0x0014;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
            r5 = r2.f2582a;
            r3 = r3.getWidth() + r5;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo3173a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                java.util.WeakHashMap<android.view.View, j0.q> r5 = p058j0.C1061o.f3808a
                int r5 = r3.getLayoutDirection()
                r0 = 1
                if (r5 != r0) goto L_0x000b
                r5 = r0
                goto L_0x000c
            L_0x000b:
                r5 = 0
            L_0x000c:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f2577c
                if (r1 != 0) goto L_0x0026
                if (r5 == 0) goto L_0x001e
            L_0x0014:
                int r5 = r2.f2582a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f2582a
                goto L_0x0039
            L_0x001e:
                int r5 = r2.f2582a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L_0x0039
            L_0x0026:
                if (r1 != r0) goto L_0x002b
                if (r5 == 0) goto L_0x0014
                goto L_0x001e
            L_0x002b:
                int r5 = r2.f2582a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f2582a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L_0x0039:
                int r4 = java.lang.Math.max(r5, r4)
                int r3 = java.lang.Math.min(r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C0693a.mo3173a(android.view.View, int, int):int");
        }

        /* renamed from: b */
        public int mo3174b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: c */
        public int mo3175c(View view) {
            return view.getWidth();
        }

        /* renamed from: e */
        public void mo3176e(View view, int i) {
            this.f2583b = i;
            this.f2582a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        /* renamed from: f */
        public void mo3177f(int i) {
            Objects.requireNonNull(SwipeDismissBehavior.this);
        }

        /* renamed from: g */
        public void mo3178g(View view, int i, int i2, int i3, int i4) {
            float width = (((float) view.getWidth()) * SwipeDismissBehavior.this.f2579e) + ((float) this.f2582a);
            float width2 = (((float) view.getWidth()) * SwipeDismissBehavior.this.f2580f) + ((float) this.f2582a);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m2080t(0.0f, 1.0f - ((f - width) / (width2 - width)), 1.0f));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
            if (java.lang.Math.abs(r8.getLeft() - r7.f2582a) >= java.lang.Math.round(((float) r8.getWidth()) * r7.f2584c.f2578d)) goto L_0x002c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0077  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0084  */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo3179h(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r10 = -1
                r7.f2583b = r10
                int r10 = r8.getWidth()
                r0 = 0
                int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x003c
                java.util.WeakHashMap<android.view.View, j0.q> r4 = p058j0.C1061o.f3808a
                int r4 = r8.getLayoutDirection()
                if (r4 != r2) goto L_0x0018
                r4 = r2
                goto L_0x0019
            L_0x0018:
                r4 = r3
            L_0x0019:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.f2577c
                r6 = 2
                if (r5 != r6) goto L_0x0021
                goto L_0x002c
            L_0x0021:
                if (r5 != 0) goto L_0x0030
                if (r4 == 0) goto L_0x002a
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x002e
                goto L_0x002c
            L_0x002a:
                if (r1 <= 0) goto L_0x002e
            L_0x002c:
                r9 = r2
                goto L_0x0058
            L_0x002e:
                r9 = r3
                goto L_0x0058
            L_0x0030:
                if (r5 != r2) goto L_0x002e
                if (r4 == 0) goto L_0x0037
                if (r1 <= 0) goto L_0x002e
                goto L_0x003b
            L_0x0037:
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x002e
            L_0x003b:
                goto L_0x002c
            L_0x003c:
                int r9 = r8.getLeft()
                int r0 = r7.f2582a
                int r9 = r9 - r0
                int r0 = r8.getWidth()
                float r0 = (float) r0
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r1 = r1.f2578d
                float r0 = r0 * r1
                int r0 = java.lang.Math.round(r0)
                int r9 = java.lang.Math.abs(r9)
                if (r9 < r0) goto L_0x002e
                goto L_0x002c
            L_0x0058:
                if (r9 == 0) goto L_0x0066
                int r9 = r8.getLeft()
                int r0 = r7.f2582a
                if (r9 >= r0) goto L_0x0064
                int r0 = r0 - r10
                goto L_0x0069
            L_0x0064:
                int r0 = r0 + r10
                goto L_0x0069
            L_0x0066:
                int r0 = r7.f2582a
                r2 = r3
            L_0x0069:
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                p0.c r9 = r9.f2575a
                int r10 = r8.getTop()
                boolean r9 = r9.mo5667t(r0, r10)
                if (r9 == 0) goto L_0x0084
                com.google.android.material.behavior.SwipeDismissBehavior$b r9 = new com.google.android.material.behavior.SwipeDismissBehavior$b
                com.google.android.material.behavior.SwipeDismissBehavior r10 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r9.<init>(r8, r2)
                java.util.WeakHashMap<android.view.View, j0.q> r10 = p058j0.C1061o.f3808a
                r8.postOnAnimation(r9)
                goto L_0x008b
            L_0x0084:
                if (r2 == 0) goto L_0x008b
                com.google.android.material.behavior.SwipeDismissBehavior r8 = com.google.android.material.behavior.SwipeDismissBehavior.this
                java.util.Objects.requireNonNull(r8)
            L_0x008b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C0693a.mo3179h(android.view.View, float, float):void");
        }

        /* renamed from: i */
        public boolean mo3180i(View view, int i) {
            int i2 = this.f2583b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo3172s(view);
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    public class C0694b implements Runnable {

        /* renamed from: e */
        public final View f2585e;

        /* renamed from: f */
        public final boolean f2586f;

        public C0694b(View view, boolean z) {
            this.f2585e = view;
            this.f2586f = z;
        }

        public void run() {
            C1568c cVar = SwipeDismissBehavior.this.f2575a;
            if (cVar != null && cVar.mo5656i(true)) {
                View view = this.f2585e;
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                view.postOnAnimation(this);
            } else if (this.f2586f) {
                Objects.requireNonNull(SwipeDismissBehavior.this);
            }
        }
    }

    /* renamed from: t */
    public static float m2080t(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: g */
    public boolean mo1400g(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f2576b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.mo1373p(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f2576b = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2576b = false;
        }
        if (!z) {
            return false;
        }
        if (this.f2575a == null) {
            this.f2575a = new C1568c(coordinatorLayout.getContext(), coordinatorLayout, this.f2581g);
        }
        return this.f2575a.mo5668u(motionEvent);
    }

    /* renamed from: h */
    public boolean mo1401h(CoordinatorLayout coordinatorLayout, V v, int i) {
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        if (v.getImportantForAccessibility() == 0) {
            v.setImportantForAccessibility(1);
            C1061o.m3031l(1048576, v);
            C1061o.m3028i(v, 0);
            if (mo3172s(v)) {
                C1061o.m3032m(v, C1150b.C1151a.f4013j, (CharSequence) null, new C1603a(this));
            }
        }
        return false;
    }

    /* renamed from: r */
    public boolean mo1411r(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C1568c cVar = this.f2575a;
        if (cVar == null) {
            return false;
        }
        cVar.mo5661n(motionEvent);
        return true;
    }

    /* renamed from: s */
    public boolean mo3172s(View view) {
        return true;
    }
}
