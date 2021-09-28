package p094p0;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.C0001b;
import p058j0.C1061o;
import p058j0.C1070q;

/* renamed from: p0.c */
public class C1568c {

    /* renamed from: v */
    public static final Interpolator f4864v = new C1569a();

    /* renamed from: a */
    public int f4865a;

    /* renamed from: b */
    public int f4866b;

    /* renamed from: c */
    public int f4867c = -1;

    /* renamed from: d */
    public float[] f4868d;

    /* renamed from: e */
    public float[] f4869e;

    /* renamed from: f */
    public float[] f4870f;

    /* renamed from: g */
    public float[] f4871g;

    /* renamed from: h */
    public int[] f4872h;

    /* renamed from: i */
    public int[] f4873i;

    /* renamed from: j */
    public int[] f4874j;

    /* renamed from: k */
    public int f4875k;

    /* renamed from: l */
    public VelocityTracker f4876l;

    /* renamed from: m */
    public float f4877m;

    /* renamed from: n */
    public float f4878n;

    /* renamed from: o */
    public int f4879o;

    /* renamed from: p */
    public OverScroller f4880p;

    /* renamed from: q */
    public final C1571c f4881q;

    /* renamed from: r */
    public View f4882r;

    /* renamed from: s */
    public boolean f4883s;

    /* renamed from: t */
    public final ViewGroup f4884t;

    /* renamed from: u */
    public final Runnable f4885u = new C1570b();

    /* renamed from: p0.c$a */
    public class C1569a implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: p0.c$b */
    public class C1570b implements Runnable {
        public C1570b() {
        }

        public void run() {
            C1568c.this.mo5666s(0);
        }
    }

    /* renamed from: p0.c$c */
    public static abstract class C1571c {
        /* renamed from: a */
        public abstract int mo3173a(View view, int i, int i2);

        /* renamed from: b */
        public abstract int mo3174b(View view, int i, int i2);

        /* renamed from: c */
        public int mo3175c(View view) {
            return 0;
        }

        /* renamed from: d */
        public int mo3229d(View view) {
            return 0;
        }

        /* renamed from: e */
        public void mo3176e(View view, int i) {
        }

        /* renamed from: f */
        public abstract void mo3177f(int i);

        /* renamed from: g */
        public abstract void mo3178g(View view, int i, int i2, int i3, int i4);

        /* renamed from: h */
        public abstract void mo3179h(View view, float f, float f2);

        /* renamed from: i */
        public abstract boolean mo3180i(View view, int i);
    }

    public C1568c(Context context, ViewGroup viewGroup, C1571c cVar) {
        if (cVar != null) {
            this.f4884t = viewGroup;
            this.f4881q = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f4879o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f4866b = viewConfiguration.getScaledTouchSlop();
            this.f4877m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f4878n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f4880p = new OverScroller(context, f4864v);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    /* renamed from: a */
    public void mo5648a() {
        this.f4867c = -1;
        float[] fArr = this.f4868d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f4869e, 0.0f);
            Arrays.fill(this.f4870f, 0.0f);
            Arrays.fill(this.f4871g, 0.0f);
            Arrays.fill(this.f4872h, 0);
            Arrays.fill(this.f4873i, 0);
            Arrays.fill(this.f4874j, 0);
            this.f4875k = 0;
        }
        VelocityTracker velocityTracker = this.f4876l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4876l = null;
        }
    }

    /* renamed from: b */
    public void mo5649b(View view, int i) {
        if (view.getParent() == this.f4884t) {
            this.f4882r = view;
            this.f4867c = i;
            this.f4881q.mo3176e(view, i);
            mo5666s(1);
            return;
        }
        StringBuilder a = C0001b.m0a("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        a.append(this.f4884t);
        a.append(")");
        throw new IllegalArgumentException(a.toString());
    }

    /* renamed from: c */
    public final boolean mo5650c(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f4872h[i] & i2) != i2 || (0 & i2) == 0 || (this.f4874j[i] & i2) == i2 || (this.f4873i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f4866b;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            Objects.requireNonNull(this.f4881q);
        }
        return (this.f4873i[i] & i2) == 0 && abs > ((float) this.f4866b);
    }

    /* renamed from: d */
    public final boolean mo5651d(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f4881q.mo3175c(view) > 0;
        boolean z2 = this.f4881q.mo3229d(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f4866b) : z2 && Math.abs(f2) > ((float) this.f4866b);
        }
        float f3 = f2 * f2;
        int i = this.f4866b;
        return f3 + (f * f) > ((float) (i * i));
    }

    /* renamed from: e */
    public final float mo5652e(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    /* renamed from: f */
    public final int mo5653f(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* renamed from: g */
    public final void mo5654g(int i) {
        float[] fArr = this.f4868d;
        if (fArr != null) {
            int i2 = this.f4875k;
            boolean z = true;
            int i3 = 1 << i;
            if ((i3 & i2) == 0) {
                z = false;
            }
            if (z) {
                fArr[i] = 0.0f;
                this.f4869e[i] = 0.0f;
                this.f4870f[i] = 0.0f;
                this.f4871g[i] = 0.0f;
                this.f4872h[i] = 0;
                this.f4873i[i] = 0;
                this.f4874j[i] = 0;
                this.f4875k = (~i3) & i2;
            }
        }
    }

    /* renamed from: h */
    public final int mo5655h(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f4884t.getWidth();
        float f = (float) (width / 2);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i)) / ((float) width)) - 0.5f) * 0.47123894f))) * f) + f;
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: i */
    public boolean mo5656i(boolean z) {
        if (this.f4865a == 2) {
            boolean computeScrollOffset = this.f4880p.computeScrollOffset();
            int currX = this.f4880p.getCurrX();
            int currY = this.f4880p.getCurrY();
            int left = currX - this.f4882r.getLeft();
            int top = currY - this.f4882r.getTop();
            if (left != 0) {
                View view = this.f4882r;
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f4882r;
                WeakHashMap<View, C1070q> weakHashMap2 = C1061o.f3808a;
                view2.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                this.f4881q.mo3178g(this.f4882r, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f4880p.getFinalX() && currY == this.f4880p.getFinalY()) {
                this.f4880p.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f4884t.post(this.f4885u);
                } else {
                    mo5666s(0);
                }
            }
        }
        if (this.f4865a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void mo5657j(float f, float f2) {
        this.f4883s = true;
        this.f4881q.mo3179h(this.f4882r, f, f2);
        this.f4883s = false;
        if (this.f4865a == 1) {
            mo5666s(0);
        }
    }

    /* renamed from: k */
    public View mo5658k(int i, int i2) {
        for (int childCount = this.f4884t.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f4884t;
            Objects.requireNonNull(this.f4881q);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: l */
    public final boolean mo5659l(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f4882r.getLeft();
        int top = this.f4882r.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f4880p.abortAnimation();
            mo5666s(0);
            return false;
        }
        View view = this.f4882r;
        int f5 = mo5653f(i3, (int) this.f4878n, (int) this.f4877m);
        int f6 = mo5653f(i4, (int) this.f4878n, (int) this.f4877m);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        int abs3 = Math.abs(f5);
        int abs4 = Math.abs(f6);
        int i7 = abs3 + abs4;
        int i8 = abs + abs2;
        if (f5 != 0) {
            f = (float) abs3;
            f2 = (float) i7;
        } else {
            f = (float) abs;
            f2 = (float) i8;
        }
        float f7 = f / f2;
        if (f6 != 0) {
            f4 = (float) abs4;
            f3 = (float) i7;
        } else {
            f4 = (float) abs2;
            f3 = (float) i8;
        }
        int h = mo5655h(i5, f5, this.f4881q.mo3175c(view));
        float h2 = ((float) mo5655h(i6, f6, this.f4881q.mo3229d(view))) * (f4 / f3);
        this.f4880p.startScroll(left, top, i5, i6, (int) (h2 + (((float) h) * f7)));
        mo5666s(2);
        return true;
    }

    /* renamed from: m */
    public final boolean mo5660m(int i) {
        return ((1 << i) & this.f4875k) != 0;
    }

    /* renamed from: n */
    public void mo5661n(MotionEvent motionEvent) {
        int i;
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo5648a();
        }
        if (this.f4876l == null) {
            this.f4876l = VelocityTracker.obtain();
        }
        this.f4876l.addMovement(motionEvent2);
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f4865a != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i2 < pointerCount) {
                            int pointerId = motionEvent2.getPointerId(i2);
                            if (mo5660m(pointerId)) {
                                float x = motionEvent2.getX(i2);
                                float y = motionEvent2.getY(i2);
                                float f = x - this.f4868d[pointerId];
                                float f2 = y - this.f4869e[pointerId];
                                mo5663p(f, f2, pointerId);
                                if (this.f4865a != 1) {
                                    View k = mo5658k((int) x, (int) y);
                                    if (mo5651d(k, f, f2) && mo5669v(k, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i2++;
                        }
                    } else if (mo5660m(this.f4867c)) {
                        int findPointerIndex = motionEvent2.findPointerIndex(this.f4867c);
                        float x2 = motionEvent2.getX(findPointerIndex);
                        float y2 = motionEvent2.getY(findPointerIndex);
                        float[] fArr = this.f4870f;
                        int i3 = this.f4867c;
                        int i4 = (int) (x2 - fArr[i3]);
                        int i5 = (int) (y2 - this.f4871g[i3]);
                        int left = this.f4882r.getLeft() + i4;
                        int top = this.f4882r.getTop() + i5;
                        int left2 = this.f4882r.getLeft();
                        int top2 = this.f4882r.getTop();
                        if (i4 != 0) {
                            left = this.f4881q.mo3173a(this.f4882r, left, i4);
                            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                            this.f4882r.offsetLeftAndRight(left - left2);
                        }
                        int i6 = left;
                        if (i5 != 0) {
                            top = this.f4881q.mo3174b(this.f4882r, top, i5);
                            WeakHashMap<View, C1070q> weakHashMap2 = C1061o.f3808a;
                            this.f4882r.offsetTopAndBottom(top - top2);
                        }
                        int i7 = top;
                        if (!(i4 == 0 && i5 == 0)) {
                            this.f4881q.mo3178g(this.f4882r, i6, i7, i6 - left2, i7 - top2);
                        }
                    } else {
                        return;
                    }
                    mo5665r(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent2.getPointerId(actionIndex);
                        float x3 = motionEvent2.getX(actionIndex);
                        float y3 = motionEvent2.getY(actionIndex);
                        mo5664q(x3, y3, pointerId2);
                        if (this.f4865a == 0) {
                            mo5669v(mo5658k((int) x3, (int) y3), pointerId2);
                            if ((this.f4872h[pointerId2] & 0) == 0) {
                                return;
                            }
                        } else {
                            int i8 = (int) x3;
                            int i9 = (int) y3;
                            View view = this.f4882r;
                            if (view != null && i8 >= view.getLeft() && i8 < view.getRight() && i9 >= view.getTop() && i9 < view.getBottom()) {
                                i2 = 1;
                            }
                            if (i2 != 0) {
                                mo5669v(this.f4882r, pointerId2);
                                return;
                            }
                            return;
                        }
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent2.getPointerId(actionIndex);
                        if (this.f4865a == 1 && pointerId3 == this.f4867c) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i2 >= pointerCount2) {
                                    i = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent2.getPointerId(i2);
                                if (pointerId4 != this.f4867c) {
                                    View k2 = mo5658k((int) motionEvent2.getX(i2), (int) motionEvent2.getY(i2));
                                    View view2 = this.f4882r;
                                    if (k2 == view2 && mo5669v(view2, pointerId4)) {
                                        i = this.f4867c;
                                        break;
                                    }
                                }
                                i2++;
                            }
                            if (i == -1) {
                                mo5662o();
                            }
                        }
                        mo5654g(pointerId3);
                        return;
                    } else {
                        return;
                    }
                } else if (this.f4865a == 1) {
                    mo5657j(0.0f, 0.0f);
                }
            } else if (this.f4865a == 1) {
                mo5662o();
            }
            mo5648a();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent2.getPointerId(0);
        View k3 = mo5658k((int) x4, (int) y4);
        mo5664q(x4, y4, pointerId5);
        mo5669v(k3, pointerId5);
        if ((this.f4872h[pointerId5] & 0) == 0) {
            return;
        }
        Objects.requireNonNull(this.f4881q);
    }

    /* renamed from: o */
    public final void mo5662o() {
        this.f4876l.computeCurrentVelocity(1000, this.f4877m);
        mo5657j(mo5652e(this.f4876l.getXVelocity(this.f4867c), this.f4878n, this.f4877m), mo5652e(this.f4876l.getYVelocity(this.f4867c), this.f4878n, this.f4877m));
    }

    /* renamed from: p */
    public final void mo5663p(float f, float f2, int i) {
        boolean c = mo5650c(f, f2, i, 1);
        if (mo5650c(f2, f, i, 4)) {
            c |= true;
        }
        if (mo5650c(f, f2, i, 2)) {
            c |= true;
        }
        if (mo5650c(f2, f, i, 8)) {
            c |= true;
        }
        if (c) {
            int[] iArr = this.f4873i;
            iArr[i] = iArr[i] | c;
            Objects.requireNonNull(this.f4881q);
        }
    }

    /* renamed from: q */
    public final void mo5664q(float f, float f2, int i) {
        float[] fArr = this.f4868d;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f4869e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f4870f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f4871g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f4872h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f4873i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f4874j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f4868d = fArr2;
            this.f4869e = fArr3;
            this.f4870f = fArr4;
            this.f4871g = fArr5;
            this.f4872h = iArr;
            this.f4873i = iArr2;
            this.f4874j = iArr3;
        }
        float[] fArr9 = this.f4868d;
        this.f4870f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f4869e;
        this.f4871g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f4872h;
        int i4 = (int) f;
        int i5 = (int) f2;
        if (i4 < this.f4884t.getLeft() + this.f4879o) {
            i2 = 1;
        }
        if (i5 < this.f4884t.getTop() + this.f4879o) {
            i2 |= 4;
        }
        if (i4 > this.f4884t.getRight() - this.f4879o) {
            i2 |= 2;
        }
        if (i5 > this.f4884t.getBottom() - this.f4879o) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.f4875k |= 1 << i;
    }

    /* renamed from: r */
    public final void mo5665r(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (mo5660m(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f4870f[pointerId] = x;
                this.f4871g[pointerId] = y;
            }
        }
    }

    /* renamed from: s */
    public void mo5666s(int i) {
        this.f4884t.removeCallbacks(this.f4885u);
        if (this.f4865a != i) {
            this.f4865a = i;
            this.f4881q.mo3177f(i);
            if (this.f4865a == 0) {
                this.f4882r = null;
            }
        }
    }

    /* renamed from: t */
    public boolean mo5667t(int i, int i2) {
        if (this.f4883s) {
            return mo5659l(i, i2, (int) this.f4876l.getXVelocity(this.f4867c), (int) this.f4876l.getYVelocity(this.f4867c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5668u(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo5648a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f4876l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f4876l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f4876l
            r4.addMovement(r1)
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0104
            if (r2 == r5) goto L_0x00ff
            if (r2 == r4) goto L_0x006f
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003d
            r4 = 6
            if (r2 == r4) goto L_0x0034
            goto L_0x0102
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.mo5654g(r1)
            goto L_0x0102
        L_0x003d:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.mo5664q(r7, r1, r2)
            int r3 = r0.f4865a
            if (r3 != 0) goto L_0x005e
            int[] r1 = r0.f4872h
            r1 = r1[r2]
            r1 = r1 & r6
            if (r1 == 0) goto L_0x0102
            p0.c$c r1 = r0.f4881q
            java.util.Objects.requireNonNull(r1)
            goto L_0x0102
        L_0x005e:
            if (r3 != r4) goto L_0x0102
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo5658k(r3, r1)
            android.view.View r3 = r0.f4882r
            if (r1 != r3) goto L_0x0102
            r0.mo5669v(r1, r2)
            goto L_0x0102
        L_0x006f:
            float[] r2 = r0.f4868d
            if (r2 == 0) goto L_0x0102
            float[] r2 = r0.f4869e
            if (r2 != 0) goto L_0x0079
            goto L_0x0102
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = r6
        L_0x007e:
            if (r3 >= r2) goto L_0x00fb
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.mo5660m(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f4868d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f4869e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo5658k(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.mo5651d(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = r5
            goto L_0x00b1
        L_0x00b0:
            r8 = r6
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            p0.c$c r14 = r0.f4881q
            int r12 = r14.mo3173a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            p0.c$c r6 = r0.f4881q
            int r6 = r6.mo3174b(r7, r15, r14)
            p0.c$c r14 = r0.f4881q
            int r14 = r14.mo3175c(r7)
            p0.c$c r15 = r0.f4881q
            int r15 = r15.mo3229d(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fb
            if (r15 <= 0) goto L_0x00e6
            if (r6 != r13) goto L_0x00e6
            goto L_0x00fb
        L_0x00e6:
            r0.mo5663p(r9, r10, r4)
            int r6 = r0.f4865a
            if (r6 != r5) goto L_0x00ee
            goto L_0x00fb
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.mo5669v(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fb
        L_0x00f7:
            int r3 = r3 + 1
            r6 = 0
            goto L_0x007e
        L_0x00fb:
            r16.mo5665r(r17)
            goto L_0x0102
        L_0x00ff:
            r16.mo5648a()
        L_0x0102:
            r2 = 0
            goto L_0x0132
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r6 = 0
            int r1 = r1.getPointerId(r6)
            r0.mo5664q(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo5658k(r2, r3)
            android.view.View r3 = r0.f4882r
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f4865a
            if (r3 != r4) goto L_0x0125
            r0.mo5669v(r2, r1)
        L_0x0125:
            int[] r2 = r0.f4872h
            r1 = r2[r1]
            r2 = 0
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0132
            p0.c$c r1 = r0.f4881q
            java.util.Objects.requireNonNull(r1)
        L_0x0132:
            int r1 = r0.f4865a
            if (r1 != r5) goto L_0x0137
            goto L_0x0138
        L_0x0137:
            r5 = r2
        L_0x0138:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p094p0.C1568c.mo5668u(android.view.MotionEvent):boolean");
    }

    /* renamed from: v */
    public boolean mo5669v(View view, int i) {
        if (view == this.f4882r && this.f4867c == i) {
            return true;
        }
        if (view == null || !this.f4881q.mo3180i(view, i)) {
            return false;
        }
        this.f4867c = i;
        mo5649b(view, i);
        return true;
    }
}
