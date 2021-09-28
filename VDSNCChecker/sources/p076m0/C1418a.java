package p076m0;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;
import p058j0.C1061o;
import p058j0.C1070q;

/* renamed from: m0.a */
public abstract class C1418a implements View.OnTouchListener {

    /* renamed from: u */
    public static final int f4470u = ViewConfiguration.getTapTimeout();

    /* renamed from: e */
    public final C1419a f4471e;

    /* renamed from: f */
    public final Interpolator f4472f = new AccelerateInterpolator();

    /* renamed from: g */
    public final View f4473g;

    /* renamed from: h */
    public Runnable f4474h;

    /* renamed from: i */
    public float[] f4475i = {0.0f, 0.0f};

    /* renamed from: j */
    public float[] f4476j = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: k */
    public int f4477k;

    /* renamed from: l */
    public int f4478l;

    /* renamed from: m */
    public float[] f4479m = {0.0f, 0.0f};

    /* renamed from: n */
    public float[] f4480n = {0.0f, 0.0f};

    /* renamed from: o */
    public float[] f4481o = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: p */
    public boolean f4482p;

    /* renamed from: q */
    public boolean f4483q;

    /* renamed from: r */
    public boolean f4484r;

    /* renamed from: s */
    public boolean f4485s;

    /* renamed from: t */
    public boolean f4486t;

    /* renamed from: m0.a$a */
    public static class C1419a {

        /* renamed from: a */
        public int f4487a;

        /* renamed from: b */
        public int f4488b;

        /* renamed from: c */
        public float f4489c;

        /* renamed from: d */
        public float f4490d;

        /* renamed from: e */
        public long f4491e = Long.MIN_VALUE;

        /* renamed from: f */
        public long f4492f = 0;

        /* renamed from: g */
        public int f4493g = 0;

        /* renamed from: h */
        public int f4494h = 0;

        /* renamed from: i */
        public long f4495i = -1;

        /* renamed from: j */
        public float f4496j;

        /* renamed from: k */
        public int f4497k;

        /* renamed from: a */
        public final float mo5259a(long j) {
            long j2 = this.f4491e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f4495i;
            if (j3 < 0 || j < j3) {
                return C1418a.m4075b(((float) (j - j2)) / ((float) this.f4487a), 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f4496j;
            return (C1418a.m4075b(((float) (j - j3)) / ((float) this.f4497k), 0.0f, 1.0f) * f) + (1.0f - f);
        }
    }

    /* renamed from: m0.a$b */
    public class C1420b implements Runnable {
        public C1420b() {
        }

        public void run() {
            C1418a aVar = C1418a.this;
            if (aVar.f4485s) {
                if (aVar.f4483q) {
                    aVar.f4483q = false;
                    C1419a aVar2 = aVar.f4471e;
                    Objects.requireNonNull(aVar2);
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    aVar2.f4491e = currentAnimationTimeMillis;
                    aVar2.f4495i = -1;
                    aVar2.f4492f = currentAnimationTimeMillis;
                    aVar2.f4496j = 0.5f;
                    aVar2.f4493g = 0;
                    aVar2.f4494h = 0;
                }
                C1419a aVar3 = C1418a.this.f4471e;
                if ((aVar3.f4495i > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar3.f4495i + ((long) aVar3.f4497k)) || !C1418a.this.mo5257e()) {
                    C1418a.this.f4485s = false;
                    return;
                }
                C1418a aVar4 = C1418a.this;
                if (aVar4.f4484r) {
                    aVar4.f4484r = false;
                    Objects.requireNonNull(aVar4);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    aVar4.f4473g.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (aVar3.f4492f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = aVar3.mo5259a(currentAnimationTimeMillis2);
                    aVar3.f4492f = currentAnimationTimeMillis2;
                    float f = ((float) (currentAnimationTimeMillis2 - aVar3.f4492f)) * ((a * 4.0f) + (-4.0f * a * a));
                    aVar3.f4493g = (int) (aVar3.f4489c * f);
                    int i = (int) (f * aVar3.f4490d);
                    aVar3.f4494h = i;
                    ((C1422c) C1418a.this).f4500v.scrollListBy(i);
                    View view = C1418a.this.f4473g;
                    WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                    view.postOnAnimation(this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
        }
    }

    public C1418a(View view) {
        C1419a aVar = new C1419a();
        this.f4471e = aVar;
        this.f4473g = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f4481o;
        float f2 = ((float) ((int) ((1575.0f * f) + 0.5f))) / 1000.0f;
        fArr[0] = f2;
        fArr[1] = f2;
        float[] fArr2 = this.f4480n;
        float f3 = ((float) ((int) ((f * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f3;
        fArr2[1] = f3;
        this.f4477k = 1;
        float[] fArr3 = this.f4476j;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f4475i;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f4479m;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f4478l = f4470u;
        aVar.f4487a = 500;
        aVar.f4488b = 500;
    }

    /* renamed from: b */
    public static float m4075b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float mo5254a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f4475i
            r0 = r0[r4]
            float[] r1 = r3.f4476j
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = m4075b(r0, r2, r1)
            float r1 = r3.mo5255c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.mo5255c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0025
            android.view.animation.Interpolator r6 = r3.f4472f
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L_0x002f
        L_0x0025:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0038
            android.view.animation.Interpolator r6 = r3.f4472f
            float r5 = r6.getInterpolation(r5)
        L_0x002f:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = m4075b(r5, r6, r0)
            goto L_0x0039
        L_0x0038:
            r5 = r2
        L_0x0039:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x003e
            return r2
        L_0x003e:
            float[] r0 = r3.f4479m
            r0 = r0[r4]
            float[] r1 = r3.f4480n
            r1 = r1[r4]
            float[] r2 = r3.f4481o
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L_0x0053
            float r5 = r5 * r0
            float r4 = m4075b(r5, r1, r4)
            return r4
        L_0x0053:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = m4075b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p076m0.C1418a.mo5254a(int, float, float, float):float");
    }

    /* renamed from: c */
    public final float mo5255c(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f4477k;
        if (i == 0 || i == 1) {
            if (f < f2) {
                return f >= 0.0f ? 1.0f - (f / f2) : (!this.f4485s || i != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
    }

    /* renamed from: d */
    public final void mo5256d() {
        int i = 0;
        if (this.f4483q) {
            this.f4485s = false;
            return;
        }
        C1419a aVar = this.f4471e;
        Objects.requireNonNull(aVar);
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - aVar.f4491e);
        int i3 = aVar.f4488b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        aVar.f4497k = i;
        aVar.f4496j = aVar.mo5259a(currentAnimationTimeMillis);
        aVar.f4495i = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5257e() {
        /*
            r9 = this;
            m0.a$a r0 = r9.f4471e
            float r1 = r0.f4490d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f4489c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0053
            r4 = r9
            m0.c r4 = (p076m0.C1422c) r4
            android.widget.ListView r4 = r4.f4500v
            int r5 = r4.getCount()
            if (r5 != 0) goto L_0x0023
        L_0x0021:
            r1 = r3
            goto L_0x0051
        L_0x0023:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L_0x0041
            if (r8 < r5) goto L_0x0050
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L_0x0050
            goto L_0x0021
        L_0x0041:
            if (r1 >= 0) goto L_0x0021
            if (r7 > 0) goto L_0x0050
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L_0x0050
            goto L_0x0021
        L_0x0050:
            r1 = r2
        L_0x0051:
            if (r1 != 0) goto L_0x0054
        L_0x0053:
            r2 = r3
        L_0x0054:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p076m0.C1418a.mo5257e():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f4486t
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x007f
        L_0x0016:
            r5.mo5256d()
            goto L_0x007f
        L_0x001a:
            r5.f4484r = r2
            r5.f4482p = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f4473g
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.mo5254a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f4473g
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.mo5254a(r2, r7, r6, r3)
            m0.a$a r7 = r5.f4471e
            r7.f4489c = r0
            r7.f4490d = r6
            boolean r6 = r5.f4485s
            if (r6 != 0) goto L_0x007f
            boolean r6 = r5.mo5257e()
            if (r6 == 0) goto L_0x007f
            java.lang.Runnable r6 = r5.f4474h
            if (r6 != 0) goto L_0x0061
            m0.a$b r6 = new m0.a$b
            r6.<init>()
            r5.f4474h = r6
        L_0x0061:
            r5.f4485s = r2
            r5.f4483q = r2
            boolean r6 = r5.f4482p
            if (r6 != 0) goto L_0x0078
            int r6 = r5.f4478l
            if (r6 <= 0) goto L_0x0078
            android.view.View r7 = r5.f4473g
            java.lang.Runnable r0 = r5.f4474h
            long r3 = (long) r6
            java.util.WeakHashMap<android.view.View, j0.q> r6 = p058j0.C1061o.f3808a
            r7.postOnAnimationDelayed(r0, r3)
            goto L_0x007d
        L_0x0078:
            java.lang.Runnable r6 = r5.f4474h
            r6.run()
        L_0x007d:
            r5.f4482p = r2
        L_0x007f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p076m0.C1418a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
