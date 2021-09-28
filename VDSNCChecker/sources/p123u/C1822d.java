package p123u;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import p058j0.C1055i;
import p123u.C1827e;

/* renamed from: u.d */
public class C1822d extends ConstraintLayout implements C1055i {

    /* renamed from: S */
    public static final /* synthetic */ int f5491S = 0;

    /* renamed from: A */
    public float f5492A;

    /* renamed from: B */
    public float f5493B;

    /* renamed from: C */
    public float f5494C;

    /* renamed from: D */
    public long f5495D;

    /* renamed from: E */
    public float f5496E;

    /* renamed from: F */
    public C1825c f5497F;

    /* renamed from: G */
    public C1820b f5498G;

    /* renamed from: H */
    public boolean f5499H;

    /* renamed from: I */
    public ArrayList<C1821c> f5500I;

    /* renamed from: J */
    public ArrayList<C1821c> f5501J;

    /* renamed from: K */
    public CopyOnWriteArrayList<C1825c> f5502K;

    /* renamed from: L */
    public int f5503L;

    /* renamed from: M */
    public float f5504M;

    /* renamed from: N */
    public boolean f5505N;

    /* renamed from: O */
    public C1824b f5506O;

    /* renamed from: P */
    public boolean f5507P;

    /* renamed from: Q */
    public C1826d f5508Q;

    /* renamed from: R */
    public boolean f5509R;

    /* renamed from: w */
    public float f5510w;

    /* renamed from: x */
    public int f5511x;

    /* renamed from: y */
    public int f5512y;

    /* renamed from: z */
    public int f5513z;

    /* renamed from: u.d$a */
    public class C1823a implements Runnable {
        public C1823a() {
        }

        public void run() {
            C1822d.this.f5506O.mo6205a();
        }
    }

    /* renamed from: u.d$b */
    public class C1824b {

        /* renamed from: a */
        public float f5515a = Float.NaN;

        /* renamed from: b */
        public float f5516b = Float.NaN;

        /* renamed from: c */
        public int f5517c = -1;

        /* renamed from: d */
        public int f5518d = -1;

        public C1824b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
            if (r5 == null) goto L_0x00b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a4, code lost:
            if (r5 == null) goto L_0x00b4;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo6205a() {
            /*
                r7 = this;
                u.d$d r0 = p123u.C1822d.C1826d.SETUP
                int r1 = r7.f5517c
                r2 = -1
                if (r1 != r2) goto L_0x000b
                int r3 = r7.f5518d
                if (r3 == r2) goto L_0x00b9
            L_0x000b:
                if (r1 != r2) goto L_0x0016
                u.d r1 = p123u.C1822d.this
                int r3 = r7.f5518d
                r1.mo6203x(r3)
                goto L_0x00b4
            L_0x0016:
                int r3 = r7.f5518d
                if (r3 != r2) goto L_0x00af
                u.d r3 = p123u.C1822d.this
                r3.setState(r0)
                r3.f5512y = r1
                r3.f5511x = r2
                r3.f5513z = r2
                v.b r3 = r3.f1022o
                if (r3 == 0) goto L_0x00b4
                float r4 = (float) r2
                int r5 = r3.f5769b
                if (r5 != r1) goto L_0x007a
                if (r1 != r2) goto L_0x0038
                android.util.SparseArray<v.b$a> r1 = r3.f5771d
                r5 = 0
                java.lang.Object r1 = r1.valueAt(r5)
                goto L_0x003e
            L_0x0038:
                android.util.SparseArray<v.b$a> r1 = r3.f5771d
                java.lang.Object r1 = r1.get(r5)
            L_0x003e:
                v.b$a r1 = (p129v.C1956b.C1957a) r1
                int r5 = r3.f5770c
                if (r5 == r2) goto L_0x0053
                java.util.ArrayList<v.b$b> r6 = r1.f5774b
                java.lang.Object r5 = r6.get(r5)
                v.b$b r5 = (p129v.C1956b.C1958b) r5
                boolean r5 = r5.mo6456a(r4, r4)
                if (r5 == 0) goto L_0x0053
                goto L_0x00b4
            L_0x0053:
                int r4 = r1.mo6455a(r4, r4)
                int r5 = r3.f5770c
                if (r5 != r4) goto L_0x005c
                goto L_0x00b4
            L_0x005c:
                if (r4 != r2) goto L_0x0060
                r5 = 0
                goto L_0x006a
            L_0x0060:
                java.util.ArrayList<v.b$b> r5 = r1.f5774b
                java.lang.Object r5 = r5.get(r4)
                v.b$b r5 = (p129v.C1956b.C1958b) r5
                androidx.constraintlayout.widget.b r5 = r5.f5782f
            L_0x006a:
                if (r4 != r2) goto L_0x006d
                goto L_0x0077
            L_0x006d:
                java.util.ArrayList<v.b$b> r1 = r1.f5774b
                java.lang.Object r1 = r1.get(r4)
                v.b$b r1 = (p129v.C1956b.C1958b) r1
                int r1 = r1.f5781e
            L_0x0077:
                if (r5 != 0) goto L_0x00a7
                goto L_0x00b4
            L_0x007a:
                r3.f5769b = r1
                android.util.SparseArray<v.b$a> r5 = r3.f5771d
                java.lang.Object r1 = r5.get(r1)
                v.b$a r1 = (p129v.C1956b.C1957a) r1
                int r4 = r1.mo6455a(r4, r4)
                if (r4 != r2) goto L_0x008d
                androidx.constraintlayout.widget.b r5 = r1.f5776d
                goto L_0x0097
            L_0x008d:
                java.util.ArrayList<v.b$b> r5 = r1.f5774b
                java.lang.Object r5 = r5.get(r4)
                v.b$b r5 = (p129v.C1956b.C1958b) r5
                androidx.constraintlayout.widget.b r5 = r5.f5782f
            L_0x0097:
                if (r4 != r2) goto L_0x009a
                goto L_0x00a4
            L_0x009a:
                java.util.ArrayList<v.b$b> r1 = r1.f5774b
                java.lang.Object r1 = r1.get(r4)
                v.b$b r1 = (p129v.C1956b.C1958b) r1
                int r1 = r1.f5781e
            L_0x00a4:
                if (r5 != 0) goto L_0x00a7
                goto L_0x00b4
            L_0x00a7:
                r3.f5770c = r4
                androidx.constraintlayout.widget.ConstraintLayout r1 = r3.f5768a
                r5.mo1306a(r1)
                goto L_0x00b4
            L_0x00af:
                u.d r4 = p123u.C1822d.this
                r4.mo6202w(r1, r3)
            L_0x00b4:
                u.d r1 = p123u.C1822d.this
                r1.setState(r0)
            L_0x00b9:
                float r0 = r7.f5516b
                boolean r0 = java.lang.Float.isNaN(r0)
                if (r0 == 0) goto L_0x00d2
                float r0 = r7.f5515a
                boolean r0 = java.lang.Float.isNaN(r0)
                if (r0 == 0) goto L_0x00ca
                return
            L_0x00ca:
                u.d r0 = p123u.C1822d.this
                float r1 = r7.f5515a
                r0.setProgress(r1)
                return
            L_0x00d2:
                u.d r0 = p123u.C1822d.this
                float r1 = r7.f5515a
                float r3 = r7.f5516b
                r0.mo6201v(r1, r3)
                r0 = 2143289344(0x7fc00000, float:NaN)
                r7.f5515a = r0
                r7.f5516b = r0
                r7.f5517c = r2
                r7.f5518d = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p123u.C1822d.C1824b.mo6205a():void");
        }
    }

    /* renamed from: u.d$c */
    public interface C1825c {
        /* renamed from: a */
        void mo6159a(C1822d dVar, int i, int i2);

        /* renamed from: b */
        void mo6160b(C1822d dVar, int i, int i2, float f);
    }

    /* renamed from: u.d$d */
    public enum C1826d {
        SETUP,
        MOVING,
        FINISHED
    }

    /* renamed from: d */
    public void mo433d(View view, View view2, int i, int i2) {
        getNanoTime();
    }

    public void dispatchDraw(Canvas canvas) {
        mo6182s(false);
        super.dispatchDraw(canvas);
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.f5512y;
    }

    public ArrayList<C1827e.C1828a> getDefinedTransitions() {
        return null;
    }

    public C1820b getDesignTool() {
        if (this.f5498G == null) {
            this.f5498G = new C1820b(this);
        }
        return this.f5498G;
    }

    public int getEndState() {
        return this.f5513z;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f5494C;
    }

    public int getStartState() {
        return this.f5511x;
    }

    public float getTargetPosition() {
        return this.f5496E;
    }

    public Bundle getTransitionState() {
        if (this.f5506O == null) {
            this.f5506O = new C1824b();
        }
        C1824b bVar = this.f5506O;
        C1822d dVar = C1822d.this;
        bVar.f5518d = dVar.f5513z;
        bVar.f5517c = dVar.f5511x;
        bVar.f5516b = dVar.getVelocity();
        bVar.f5515a = C1822d.this.getProgress();
        C1824b bVar2 = this.f5506O;
        Objects.requireNonNull(bVar2);
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", bVar2.f5515a);
        bundle.putFloat("motion.velocity", bVar2.f5516b);
        bundle.putInt("motion.StartState", bVar2.f5517c);
        bundle.putInt("motion.EndState", bVar2.f5518d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        return (long) (this.f5492A * 1000.0f);
    }

    public float getVelocity() {
        return this.f5510w;
    }

    /* renamed from: i */
    public void mo446i(View view, int i) {
    }

    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    /* renamed from: j */
    public void mo447j(View view, int i, int i2, int[] iArr, int i3) {
    }

    /* renamed from: k */
    public void mo1262k(int i) {
        this.f1022o = null;
    }

    /* renamed from: m */
    public void mo450m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
    }

    /* renamed from: n */
    public void mo451n(View view, int i, int i2, int i3, int i4, int i5) {
    }

    /* renamed from: o */
    public boolean mo452o(View view, View view2, int i, int i2) {
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        C1824b bVar = this.f5506O;
        if (bVar == null) {
            return;
        }
        if (this.f5507P) {
            post(new C1823a());
        } else {
            bVar.mo6205a();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f5505N = true;
        try {
            super.onLayout(z, i, i2, i3, i4);
        } finally {
            this.f5505N = false;
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onRtlPropertiesChanged(int i) {
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof C1821c) {
            C1821c cVar = (C1821c) view;
            if (this.f5502K == null) {
                this.f5502K = new CopyOnWriteArrayList<>();
            }
            this.f5502K.add(cVar);
            if (cVar.f5487m) {
                if (this.f5500I == null) {
                    this.f5500I = new ArrayList<>();
                }
                this.f5500I.add(cVar);
            }
            if (cVar.f5488n) {
                if (this.f5501J == null) {
                    this.f5501J = new ArrayList<>();
                }
                this.f5501J.add(cVar);
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<C1821c> arrayList = this.f5500I;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<C1821c> arrayList2 = this.f5501J;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public void requestLayout() {
        int i = this.f5512y;
        super.requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0104, code lost:
        if (r1 != r2) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x010f, code lost:
        if (r1 != r2) goto L_0x0113;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6182s(boolean r18) {
        /*
            r17 = this;
            r0 = r17
            u.d$d r1 = p123u.C1822d.C1826d.FINISHED
            long r2 = r0.f5495D
            r4 = -1
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0012
            long r2 = r17.getNanoTime()
            r0.f5495D = r2
        L_0x0012:
            float r2 = r0.f5494C
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r5 = -1
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r4 <= 0) goto L_0x0022
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x0022
            r0.f5512y = r5
        L_0x0022:
            boolean r4 = r0.f5499H
            r7 = 1
            r8 = 0
            if (r4 != 0) goto L_0x002a
            goto L_0x00fa
        L_0x002a:
            float r4 = r0.f5496E
            float r4 = r4 - r2
            float r2 = java.lang.Math.signum(r4)
            long r9 = r17.getNanoTime()
            long r11 = r0.f5495D
            long r11 = r9 - r11
            float r4 = (float) r11
            float r4 = r4 * r2
            r11 = 814313567(0x3089705f, float:1.0E-9)
            float r4 = r4 * r11
            float r11 = r0.f5492A
            float r4 = r4 / r11
            float r11 = r0.f5494C
            float r11 = r11 + r4
            int r12 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r12 <= 0) goto L_0x004f
            float r13 = r0.f5496E
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 >= 0) goto L_0x0059
        L_0x004f:
            int r13 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r13 > 0) goto L_0x005b
            float r13 = r0.f5496E
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 > 0) goto L_0x005b
        L_0x0059:
            float r11 = r0.f5496E
        L_0x005b:
            r0.f5494C = r11
            r0.f5493B = r11
            r0.f5495D = r9
            r0.f5510w = r4
            float r4 = java.lang.Math.abs(r4)
            r9 = 925353388(0x3727c5ac, float:1.0E-5)
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x0073
            u.d$d r4 = p123u.C1822d.C1826d.MOVING
            r0.setState(r4)
        L_0x0073:
            if (r12 <= 0) goto L_0x007b
            float r4 = r0.f5496E
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x0085
        L_0x007b:
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 > 0) goto L_0x0087
            float r4 = r0.f5496E
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0087
        L_0x0085:
            float r11 = r0.f5496E
        L_0x0087:
            int r4 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x008f
            int r9 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x0092
        L_0x008f:
            r0.setState(r1)
        L_0x0092:
            int r9 = r17.getChildCount()
            r0.f5499H = r8
            r17.getNanoTime()
            r10 = 0
            if (r9 > 0) goto L_0x0129
            if (r12 <= 0) goto L_0x00a6
            float r9 = r0.f5496E
            int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x00b0
        L_0x00a6:
            int r9 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x00b2
            float r9 = r0.f5496E
            int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r9 > 0) goto L_0x00b2
        L_0x00b0:
            r9 = r7
            goto L_0x00b3
        L_0x00b2:
            r9 = r8
        L_0x00b3:
            boolean r13 = r0.f5499H
            if (r13 != 0) goto L_0x00bc
            if (r9 == 0) goto L_0x00bc
            r0.setState(r1)
        L_0x00bc:
            boolean r13 = r0.f5499H
            r9 = r9 ^ r7
            r9 = r9 | r13
            r0.f5499H = r9
            int r13 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r13 > 0) goto L_0x00d2
            int r13 = r0.f5511x
            if (r13 == r5) goto L_0x00d2
            int r5 = r0.f5512y
            if (r5 != r13) goto L_0x00cf
            goto L_0x00d2
        L_0x00cf:
            r0.f5512y = r13
            throw r10
        L_0x00d2:
            double r13 = (double) r11
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 < 0) goto L_0x00e3
            int r5 = r0.f5512y
            int r13 = r0.f5513z
            if (r5 != r13) goto L_0x00e0
            goto L_0x00e3
        L_0x00e0:
            r0.f5512y = r13
            throw r10
        L_0x00e3:
            if (r9 != 0) goto L_0x00f5
            if (r12 <= 0) goto L_0x00e9
            if (r4 == 0) goto L_0x00f1
        L_0x00e9:
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x00f8
            int r2 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x00f8
        L_0x00f1:
            r0.setState(r1)
            goto L_0x00f8
        L_0x00f5:
            r17.invalidate()
        L_0x00f8:
            boolean r1 = r0.f5499H
        L_0x00fa:
            float r1 = r0.f5494C
            int r2 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0107
            int r1 = r0.f5512y
            int r2 = r0.f5513z
            if (r1 == r2) goto L_0x0112
            goto L_0x0113
        L_0x0107:
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0116
            int r1 = r0.f5512y
            int r2 = r0.f5511x
            if (r1 == r2) goto L_0x0112
            goto L_0x0113
        L_0x0112:
            r7 = r8
        L_0x0113:
            r0.f5512y = r2
            r8 = r7
        L_0x0116:
            boolean r1 = r0.f5509R
            r1 = r1 | r8
            r0.f5509R = r1
            if (r8 == 0) goto L_0x0124
            boolean r1 = r0.f5505N
            if (r1 != 0) goto L_0x0124
            r17.requestLayout()
        L_0x0124:
            float r1 = r0.f5494C
            r0.f5493B = r1
            return
        L_0x0129:
            r0.getChildAt(r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p123u.C1822d.mo6182s(boolean):void");
    }

    public void setDebugMode(int i) {
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.f5507P = z;
    }

    public void setInteractionEnabled(boolean z) {
    }

    public void setInterpolatedProgress(float f) {
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList<C1821c> arrayList = this.f5501J;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f5501J.get(i).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<C1821c> arrayList = this.f5500I;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f5500I.get(i).setProgress(f);
            }
        }
    }

    public void setProgress(float f) {
        C1826d dVar = C1826d.FINISHED;
        C1826d dVar2 = C1826d.MOVING;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (!super.isAttachedToWindow()) {
            if (this.f5506O == null) {
                this.f5506O = new C1824b();
            }
            this.f5506O.f5515a = f;
            return;
        }
        if (i <= 0) {
            if (this.f5494C == 1.0f && this.f5512y == this.f5513z) {
                setState(dVar2);
            }
            this.f5512y = this.f5511x;
            if (this.f5494C != 0.0f) {
                return;
            }
        } else if (f >= 1.0f) {
            if (this.f5494C == 0.0f && this.f5512y == this.f5511x) {
                setState(dVar2);
            }
            this.f5512y = this.f5513z;
            if (this.f5494C != 1.0f) {
                return;
            }
        } else {
            this.f5512y = -1;
            setState(dVar2);
            return;
        }
        setState(dVar);
    }

    public void setScene(C1827e eVar) {
        mo1261h();
        throw null;
    }

    public void setStartState(int i) {
        if (!super.isAttachedToWindow()) {
            if (this.f5506O == null) {
                this.f5506O = new C1824b();
            }
            C1824b bVar = this.f5506O;
            bVar.f5517c = i;
            bVar.f5518d = i;
            return;
        }
        this.f5512y = i;
    }

    public void setState(C1826d dVar) {
        C1826d dVar2 = C1826d.FINISHED;
        if (dVar != dVar2 || this.f5512y != -1) {
            C1826d dVar3 = this.f5508Q;
            this.f5508Q = dVar;
            C1826d dVar4 = C1826d.MOVING;
            if (dVar3 == dVar4 && dVar == dVar4) {
                mo6198t();
            }
            int ordinal = dVar3.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                if (dVar == dVar4) {
                    mo6198t();
                }
                if (dVar != dVar2) {
                    return;
                }
            } else if (!(ordinal == 2 && dVar == dVar2)) {
                return;
            }
            mo6200u();
        }
    }

    public void setTransition(int i) {
    }

    public void setTransition(C1827e.C1828a aVar) {
        throw null;
    }

    public void setTransitionDuration(int i) {
    }

    public void setTransitionListener(C1825c cVar) {
        this.f5497F = cVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f5506O == null) {
            this.f5506O = new C1824b();
        }
        C1824b bVar = this.f5506O;
        Objects.requireNonNull(bVar);
        bVar.f5515a = bundle.getFloat("motion.progress");
        bVar.f5516b = bundle.getFloat("motion.velocity");
        bVar.f5517c = bundle.getInt("motion.StartState");
        bVar.f5518d = bundle.getInt("motion.EndState");
        if (super.isAttachedToWindow()) {
            this.f5506O.mo6205a();
        }
    }

    /* renamed from: t */
    public final void mo6198t() {
        CopyOnWriteArrayList<C1825c> copyOnWriteArrayList;
        if ((this.f5497F != null || ((copyOnWriteArrayList = this.f5502K) != null && !copyOnWriteArrayList.isEmpty())) && this.f5504M != this.f5493B) {
            if (this.f5503L != -1) {
                C1825c cVar = this.f5497F;
                if (cVar != null) {
                    cVar.mo6159a(this, this.f5511x, this.f5513z);
                }
                CopyOnWriteArrayList<C1825c> copyOnWriteArrayList2 = this.f5502K;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<C1825c> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().mo6159a(this, this.f5511x, this.f5513z);
                    }
                }
            }
            this.f5503L = -1;
            float f = this.f5493B;
            this.f5504M = f;
            C1825c cVar2 = this.f5497F;
            if (cVar2 != null) {
                cVar2.mo6160b(this, this.f5511x, this.f5513z, f);
            }
            CopyOnWriteArrayList<C1825c> copyOnWriteArrayList3 = this.f5502K;
            if (copyOnWriteArrayList3 != null) {
                Iterator<C1825c> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().mo6160b(this, this.f5511x, this.f5513z, this.f5493B);
                }
            }
        }
    }

    public String toString() {
        Context context = getContext();
        return C1819a.m5005a(context, this.f5511x) + "->" + C1819a.m5005a(context, this.f5513z) + " (pos:" + this.f5494C + " Dpos/Dt:" + this.f5510w;
    }

    /* renamed from: u */
    public void mo6200u() {
        CopyOnWriteArrayList<C1825c> copyOnWriteArrayList;
        CopyOnWriteArrayList<C1825c> copyOnWriteArrayList2;
        if ((this.f5497F != null || ((copyOnWriteArrayList2 = this.f5502K) != null && !copyOnWriteArrayList2.isEmpty())) && this.f5503L == -1) {
            this.f5503L = this.f5512y;
            throw null;
        } else if (this.f5497F != null || ((copyOnWriteArrayList = this.f5502K) != null && !copyOnWriteArrayList.isEmpty())) {
            throw null;
        }
    }

    /* renamed from: v */
    public void mo6201v(float f, float f2) {
        if (!super.isAttachedToWindow()) {
            if (this.f5506O == null) {
                this.f5506O = new C1824b();
            }
            C1824b bVar = this.f5506O;
            bVar.f5515a = f;
            bVar.f5516b = f2;
            return;
        }
        setProgress(f);
        setState(C1826d.MOVING);
        this.f5510w = f2;
    }

    /* renamed from: w */
    public void mo6202w(int i, int i2) {
        if (!super.isAttachedToWindow()) {
            if (this.f5506O == null) {
                this.f5506O = new C1824b();
            }
            C1824b bVar = this.f5506O;
            bVar.f5517c = i;
            bVar.f5518d = i2;
        }
    }

    /* renamed from: x */
    public void mo6203x(int i) {
        if (!super.isAttachedToWindow()) {
            if (this.f5506O == null) {
                this.f5506O = new C1824b();
            }
            this.f5506O.f5518d = i;
            return;
        }
        int i2 = this.f5512y;
        if (i2 != i && this.f5511x != i && this.f5513z != i) {
            this.f5513z = i;
            if (i2 != -1) {
                mo6202w(i2, i);
                this.f5494C = 0.0f;
                return;
            }
            this.f5496E = 1.0f;
            this.f5493B = 0.0f;
            this.f5494C = 0.0f;
            this.f5495D = getNanoTime();
            getNanoTime();
            throw null;
        }
    }
}
