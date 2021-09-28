package p095p1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Objects;

/* renamed from: p1.b */
public abstract class C1573b<V extends View> extends C1576d<V> {

    /* renamed from: c */
    public Runnable f4888c;

    /* renamed from: d */
    public OverScroller f4889d;

    /* renamed from: e */
    public boolean f4890e;

    /* renamed from: f */
    public int f4891f = -1;

    /* renamed from: g */
    public int f4892g;

    /* renamed from: h */
    public int f4893h = -1;

    /* renamed from: i */
    public VelocityTracker f4894i;

    /* renamed from: p1.b$a */
    public class C1574a implements Runnable {

        /* renamed from: e */
        public final CoordinatorLayout f4895e;

        /* renamed from: f */
        public final V f4896f;

        public C1574a(CoordinatorLayout coordinatorLayout, V v) {
            this.f4895e = coordinatorLayout;
            this.f4896f = v;
        }

        public void run() {
            OverScroller overScroller;
            if (this.f4896f != null && (overScroller = C1573b.this.f4889d) != null) {
                if (overScroller.computeScrollOffset()) {
                    C1573b bVar = C1573b.this;
                    bVar.mo5674x(this.f4895e, this.f4896f, bVar.f4889d.getCurrY());
                    this.f4896f.postOnAnimation(this);
                    return;
                }
                C1573b bVar2 = C1573b.this;
                CoordinatorLayout coordinatorLayout = this.f4895e;
                V v = this.f4896f;
                AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) bVar2;
                Objects.requireNonNull(baseBehavior);
                AppBarLayout appBarLayout = (AppBarLayout) v;
                baseBehavior.mo3152D(coordinatorLayout, appBarLayout);
                if (appBarLayout.f2539m) {
                    appBarLayout.mo3115c(appBarLayout.mo3117d(baseBehavior.mo3150B(coordinatorLayout)));
                }
            }
        }
    }

    public C1573b() {
    }

    public C1573b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        r5 = (android.view.View) r5.get();
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1400g(androidx.coordinatorlayout.widget.CoordinatorLayout r8, V r9, android.view.MotionEvent r10) {
        /*
            r7 = this;
            int r0 = r7.f4893h
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r8.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r7.f4893h = r0
        L_0x0012:
            int r0 = r10.getActionMasked()
            r1 = 2
            r2 = 1
            r3 = -1
            r4 = 0
            if (r0 != r1) goto L_0x0040
            boolean r0 = r7.f4890e
            if (r0 == 0) goto L_0x0040
            int r0 = r7.f4891f
            if (r0 != r3) goto L_0x0025
            return r4
        L_0x0025:
            int r0 = r10.findPointerIndex(r0)
            if (r0 != r3) goto L_0x002c
            return r4
        L_0x002c:
            float r0 = r10.getY(r0)
            int r0 = (int) r0
            int r1 = r7.f4892g
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r5 = r7.f4893h
            if (r1 <= r5) goto L_0x0040
            r7.f4892g = r0
            return r2
        L_0x0040:
            int r0 = r10.getActionMasked()
            if (r0 != 0) goto L_0x00a5
            r7.f4891f = r3
            float r0 = r10.getX()
            int r0 = (int) r0
            float r1 = r10.getY()
            int r1 = (int) r1
            r5 = r7
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r5 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r5
            r6 = r9
            com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
            java.lang.ref.WeakReference<android.view.View> r5 = r5.f2551p
            if (r5 == 0) goto L_0x0073
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L_0x0071
            boolean r6 = r5.isShown()
            if (r6 == 0) goto L_0x0071
            boolean r3 = r5.canScrollVertically(r3)
            if (r3 != 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r3 = r4
            goto L_0x0074
        L_0x0073:
            r3 = r2
        L_0x0074:
            if (r3 == 0) goto L_0x007e
            boolean r8 = r8.mo1373p(r9, r0, r1)
            if (r8 == 0) goto L_0x007e
            r8 = r2
            goto L_0x007f
        L_0x007e:
            r8 = r4
        L_0x007f:
            r7.f4890e = r8
            if (r8 == 0) goto L_0x00a5
            r7.f4892g = r1
            int r8 = r10.getPointerId(r4)
            r7.f4891f = r8
            android.view.VelocityTracker r8 = r7.f4894i
            if (r8 != 0) goto L_0x0095
            android.view.VelocityTracker r8 = android.view.VelocityTracker.obtain()
            r7.f4894i = r8
        L_0x0095:
            android.widget.OverScroller r8 = r7.f4889d
            if (r8 == 0) goto L_0x00a5
            boolean r8 = r8.isFinished()
            if (r8 != 0) goto L_0x00a5
            android.widget.OverScroller r8 = r7.f4889d
            r8.abortAnimation()
            return r2
        L_0x00a5:
            android.view.VelocityTracker r8 = r7.f4894i
            if (r8 == 0) goto L_0x00ac
            r8.addMovement(r10)
        L_0x00ac:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p095p1.C1573b.mo1400g(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1411r(androidx.coordinatorlayout.widget.CoordinatorLayout r21, V r22, android.view.MotionEvent r23) {
        /*
            r20 = this;
            r6 = r20
            r1 = r21
            r2 = r22
            r7 = r23
            int r0 = r23.getActionMasked()
            r3 = 0
            r4 = -1
            r8 = 1
            r9 = 0
            if (r0 == r8) goto L_0x005e
            r5 = 2
            if (r0 == r5) goto L_0x0036
            r1 = 3
            if (r0 == r1) goto L_0x00d7
            r1 = 6
            if (r0 == r1) goto L_0x001c
            goto L_0x005b
        L_0x001c:
            int r0 = r23.getActionIndex()
            if (r0 != 0) goto L_0x0024
            r0 = r8
            goto L_0x0025
        L_0x0024:
            r0 = r9
        L_0x0025:
            int r1 = r7.getPointerId(r0)
            r6.f4891f = r1
            float r0 = r7.getY(r0)
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r6.f4892g = r0
            goto L_0x005b
        L_0x0036:
            int r0 = r6.f4891f
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r4) goto L_0x003f
            return r9
        L_0x003f:
            float r0 = r7.getY(r0)
            int r0 = (int) r0
            int r3 = r6.f4892g
            int r3 = r3 - r0
            r6.f4892g = r0
            r0 = r2
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            int r0 = r0.getDownNestedScrollRange()
            int r4 = -r0
            r5 = 0
            r0 = r20
            r1 = r21
            r2 = r22
            r0.mo5673w(r1, r2, r3, r4, r5)
        L_0x005b:
            r0 = r9
            goto L_0x00e5
        L_0x005e:
            android.view.VelocityTracker r0 = r6.f4894i
            if (r0 == 0) goto L_0x00d7
            r0.addMovement(r7)
            android.view.VelocityTracker r0 = r6.f4894i
            r5 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r5)
            android.view.VelocityTracker r0 = r6.f4894i
            int r5 = r6.f4891f
            float r0 = r0.getYVelocity(r5)
            r5 = r2
            com.google.android.material.appbar.AppBarLayout r5 = (com.google.android.material.appbar.AppBarLayout) r5
            int r10 = r5.getTotalScrollRange()
            int r10 = -r10
            r19 = 0
            java.lang.Runnable r11 = r6.f4888c
            if (r11 == 0) goto L_0x0087
            r2.removeCallbacks(r11)
            r6.f4888c = r3
        L_0x0087:
            android.widget.OverScroller r11 = r6.f4889d
            if (r11 != 0) goto L_0x0096
            android.widget.OverScroller r11 = new android.widget.OverScroller
            android.content.Context r12 = r22.getContext()
            r11.<init>(r12)
            r6.f4889d = r11
        L_0x0096:
            android.widget.OverScroller r11 = r6.f4889d
            r12 = 0
            int r13 = r20.mo5678s()
            r14 = 0
            int r15 = java.lang.Math.round(r0)
            r16 = 0
            r17 = 0
            r18 = r10
            r11.fling(r12, r13, r14, r15, r16, r17, r18, r19)
            android.widget.OverScroller r0 = r6.f4889d
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x00c0
            p1.b$a r0 = new p1.b$a
            r0.<init>(r1, r2)
            r6.f4888c = r0
            java.util.WeakHashMap<android.view.View, j0.q> r1 = p058j0.C1061o.f3808a
            r2.postOnAnimation(r0)
            goto L_0x00d5
        L_0x00c0:
            r0 = r6
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r0 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r0
            r0.mo3152D(r1, r5)
            boolean r2 = r5.f2539m
            if (r2 == 0) goto L_0x00d5
            android.view.View r0 = r0.mo3150B(r1)
            boolean r0 = r5.mo3117d(r0)
            r5.mo3115c(r0)
        L_0x00d5:
            r0 = r8
            goto L_0x00d8
        L_0x00d7:
            r0 = r9
        L_0x00d8:
            r6.f4890e = r9
            r6.f4891f = r4
            android.view.VelocityTracker r1 = r6.f4894i
            if (r1 == 0) goto L_0x00e5
            r1.recycle()
            r6.f4894i = r3
        L_0x00e5:
            android.view.VelocityTracker r1 = r6.f4894i
            if (r1 == 0) goto L_0x00ec
            r1.addMovement(r7)
        L_0x00ec:
            boolean r1 = r6.f4890e
            if (r1 != 0) goto L_0x00f4
            if (r0 == 0) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            r8 = r9
        L_0x00f4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p095p1.C1573b.mo1411r(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: v */
    public abstract int mo3155v();

    /* renamed from: w */
    public final int mo5673w(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo3156y(coordinatorLayout, v, mo3155v() - i, i2, i3);
    }

    /* renamed from: x */
    public int mo5674x(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo3156y(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* renamed from: y */
    public abstract int mo3156y(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);
}
