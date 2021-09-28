package p072l2;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import java.util.BitSet;
import java.util.Objects;
import p016c0.C0557a;
import p018c2.C0624a;
import p066k2.C1195a;
import p072l2.C1250j;
import p072l2.C1254l;
import p136w0.C2036r;

/* renamed from: l2.f */
public class C1242f extends Drawable implements C1261m {

    /* renamed from: A */
    public static final Paint f4163A = new Paint(1);

    /* renamed from: e */
    public C1244b f4164e;

    /* renamed from: f */
    public final C1254l.C1260f[] f4165f;

    /* renamed from: g */
    public final C1254l.C1260f[] f4166g;

    /* renamed from: h */
    public final BitSet f4167h;

    /* renamed from: i */
    public boolean f4168i;

    /* renamed from: j */
    public final Matrix f4169j;

    /* renamed from: k */
    public final Path f4170k;

    /* renamed from: l */
    public final Path f4171l;

    /* renamed from: m */
    public final RectF f4172m;

    /* renamed from: n */
    public final RectF f4173n;

    /* renamed from: o */
    public final Region f4174o;

    /* renamed from: p */
    public final Region f4175p;

    /* renamed from: q */
    public C1247i f4176q;

    /* renamed from: r */
    public final Paint f4177r;

    /* renamed from: s */
    public final Paint f4178s;

    /* renamed from: t */
    public final C1195a f4179t;

    /* renamed from: u */
    public final C1250j.C1252b f4180u;

    /* renamed from: v */
    public final C1250j f4181v;

    /* renamed from: w */
    public PorterDuffColorFilter f4182w;

    /* renamed from: x */
    public PorterDuffColorFilter f4183x;

    /* renamed from: y */
    public final RectF f4184y;

    /* renamed from: z */
    public boolean f4185z;

    /* renamed from: l2.f$a */
    public class C1243a implements C1250j.C1252b {
        public C1243a() {
        }
    }

    /* renamed from: l2.f$b */
    public static final class C1244b extends Drawable.ConstantState {

        /* renamed from: a */
        public C1247i f4187a;

        /* renamed from: b */
        public C0624a f4188b;

        /* renamed from: c */
        public ColorFilter f4189c;

        /* renamed from: d */
        public ColorStateList f4190d = null;

        /* renamed from: e */
        public ColorStateList f4191e = null;

        /* renamed from: f */
        public ColorStateList f4192f = null;

        /* renamed from: g */
        public ColorStateList f4193g = null;

        /* renamed from: h */
        public PorterDuff.Mode f4194h = PorterDuff.Mode.SRC_IN;

        /* renamed from: i */
        public Rect f4195i = null;

        /* renamed from: j */
        public float f4196j = 1.0f;

        /* renamed from: k */
        public float f4197k = 1.0f;

        /* renamed from: l */
        public float f4198l;

        /* renamed from: m */
        public int f4199m = 255;

        /* renamed from: n */
        public float f4200n = 0.0f;

        /* renamed from: o */
        public float f4201o = 0.0f;

        /* renamed from: p */
        public float f4202p = 0.0f;

        /* renamed from: q */
        public int f4203q = 0;

        /* renamed from: r */
        public int f4204r = 0;

        /* renamed from: s */
        public int f4205s = 0;

        /* renamed from: t */
        public int f4206t = 0;

        /* renamed from: u */
        public boolean f4207u = false;

        /* renamed from: v */
        public Paint.Style f4208v = Paint.Style.FILL_AND_STROKE;

        public C1244b(C1244b bVar) {
            this.f4187a = bVar.f4187a;
            this.f4188b = bVar.f4188b;
            this.f4198l = bVar.f4198l;
            this.f4189c = bVar.f4189c;
            this.f4190d = bVar.f4190d;
            this.f4191e = bVar.f4191e;
            this.f4194h = bVar.f4194h;
            this.f4193g = bVar.f4193g;
            this.f4199m = bVar.f4199m;
            this.f4196j = bVar.f4196j;
            this.f4205s = bVar.f4205s;
            this.f4203q = bVar.f4203q;
            this.f4207u = bVar.f4207u;
            this.f4197k = bVar.f4197k;
            this.f4200n = bVar.f4200n;
            this.f4201o = bVar.f4201o;
            this.f4202p = bVar.f4202p;
            this.f4204r = bVar.f4204r;
            this.f4206t = bVar.f4206t;
            this.f4192f = bVar.f4192f;
            this.f4208v = bVar.f4208v;
            if (bVar.f4195i != null) {
                this.f4195i = new Rect(bVar.f4195i);
            }
        }

        public C1244b(C1247i iVar, C0624a aVar) {
            this.f4187a = iVar;
            this.f4188b = null;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            C1242f fVar = new C1242f(this);
            fVar.f4168i = true;
            return fVar;
        }
    }

    static {
        Class<C1242f> cls = C1242f.class;
    }

    public C1242f() {
        this(new C1247i());
    }

    public C1242f(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C1247i.m3551b(context, (AttributeSet) null, i, i2).mo4991a());
    }

    public C1242f(C1244b bVar) {
        C1250j jVar;
        this.f4165f = new C1254l.C1260f[4];
        this.f4166g = new C1254l.C1260f[4];
        this.f4167h = new BitSet(8);
        this.f4169j = new Matrix();
        this.f4170k = new Path();
        this.f4171l = new Path();
        this.f4172m = new RectF();
        this.f4173n = new RectF();
        this.f4174o = new Region();
        this.f4175p = new Region();
        Paint paint = new Paint(1);
        this.f4177r = paint;
        Paint paint2 = new Paint(1);
        this.f4178s = paint2;
        this.f4179t = new C1195a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            jVar = C1250j.C1251a.f4246a;
        } else {
            jVar = new C1250j();
        }
        this.f4181v = jVar;
        this.f4184y = new RectF();
        this.f4185z = true;
        this.f4164e = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f4163A;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        mo4983v();
        mo4982u(getState());
        this.f4180u = new C1243a();
    }

    public C1242f(C1247i iVar) {
        this(new C1244b(iVar, (C0624a) null));
    }

    /* renamed from: b */
    public final void mo4956b(RectF rectF, Path path) {
        mo4957c(rectF, path);
        if (this.f4164e.f4196j != 1.0f) {
            this.f4169j.reset();
            Matrix matrix = this.f4169j;
            float f = this.f4164e.f4196j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f4169j);
        }
        path.computeBounds(this.f4184y, true);
    }

    /* renamed from: c */
    public final void mo4957c(RectF rectF, Path path) {
        C1250j jVar = this.f4181v;
        C1244b bVar = this.f4164e;
        C1247i iVar = bVar.f4187a;
        float f = bVar.f4197k;
        jVar.mo4997a(iVar, f, rectF, this.f4180u, path);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        r2 = r4.getColor();
        r3 = mo4959e(r2);
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.PorterDuffColorFilter mo4958d(android.content.res.ColorStateList r2, android.graphics.PorterDuff.Mode r3, android.graphics.Paint r4, boolean r5) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x001a
            if (r3 != 0) goto L_0x0005
            goto L_0x001a
        L_0x0005:
            int[] r4 = r1.getState()
            r0 = 0
            int r2 = r2.getColorForState(r4, r0)
            if (r5 == 0) goto L_0x0014
            int r2 = r1.mo4959e(r2)
        L_0x0014:
            android.graphics.PorterDuffColorFilter r4 = new android.graphics.PorterDuffColorFilter
            r4.<init>(r2, r3)
            goto L_0x0030
        L_0x001a:
            if (r5 == 0) goto L_0x002e
            int r2 = r4.getColor()
            int r3 = r1.mo4959e(r2)
            if (r3 == r2) goto L_0x002e
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r4)
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            r4 = r2
        L_0x0030:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p072l2.C1242f.mo4958d(android.content.res.ColorStateList, android.graphics.PorterDuff$Mode, android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ef, code lost:
        if ((!r2.f4187a.mo4989d(mo4965h()) && !r12.f4170k.isConvex() && android.os.Build.VERSION.SDK_INT < 29) != false) goto L_0x00f1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r13) {
        /*
            r12 = this;
            android.graphics.Paint r0 = r12.f4177r
            android.graphics.PorterDuffColorFilter r1 = r12.f4182w
            r0.setColorFilter(r1)
            android.graphics.Paint r0 = r12.f4177r
            int r0 = r0.getAlpha()
            android.graphics.Paint r1 = r12.f4177r
            l2.f$b r2 = r12.f4164e
            int r2 = r2.f4199m
            int r3 = r2 >>> 7
            int r2 = r2 + r3
            int r2 = r2 * r0
            int r2 = r2 >>> 8
            r1.setAlpha(r2)
            android.graphics.Paint r1 = r12.f4178s
            android.graphics.PorterDuffColorFilter r2 = r12.f4183x
            r1.setColorFilter(r2)
            android.graphics.Paint r1 = r12.f4178s
            l2.f$b r2 = r12.f4164e
            float r2 = r2.f4198l
            r1.setStrokeWidth(r2)
            android.graphics.Paint r1 = r12.f4178s
            int r1 = r1.getAlpha()
            android.graphics.Paint r2 = r12.f4178s
            l2.f$b r3 = r12.f4164e
            int r3 = r3.f4199m
            int r4 = r3 >>> 7
            int r3 = r3 + r4
            int r3 = r3 * r1
            int r3 = r3 >>> 8
            r2.setAlpha(r3)
            boolean r2 = r12.f4168i
            r3 = 0
            if (r2 == 0) goto L_0x00c4
            float r2 = r12.mo4969k()
            float r2 = -r2
            l2.f$b r4 = r12.f4164e
            l2.i r4 = r4.f4187a
            java.util.Objects.requireNonNull(r4)
            l2.i$b r5 = new l2.i$b
            r5.<init>(r4)
            l2.c r6 = r4.f4214e
            boolean r7 = r6 instanceof p072l2.C1245g
            if (r7 == 0) goto L_0x005e
            goto L_0x0064
        L_0x005e:
            l2.b r7 = new l2.b
            r7.<init>(r2, r6)
            r6 = r7
        L_0x0064:
            r5.f4226e = r6
            l2.c r6 = r4.f4215f
            boolean r7 = r6 instanceof p072l2.C1245g
            if (r7 == 0) goto L_0x006d
            goto L_0x0073
        L_0x006d:
            l2.b r7 = new l2.b
            r7.<init>(r2, r6)
            r6 = r7
        L_0x0073:
            r5.f4227f = r6
            l2.c r6 = r4.f4217h
            boolean r7 = r6 instanceof p072l2.C1245g
            if (r7 == 0) goto L_0x007c
            goto L_0x0082
        L_0x007c:
            l2.b r7 = new l2.b
            r7.<init>(r2, r6)
            r6 = r7
        L_0x0082:
            r5.f4229h = r6
            l2.c r4 = r4.f4216g
            boolean r6 = r4 instanceof p072l2.C1245g
            if (r6 == 0) goto L_0x008b
            goto L_0x0091
        L_0x008b:
            l2.b r6 = new l2.b
            r6.<init>(r2, r4)
            r4 = r6
        L_0x0091:
            r5.f4228g = r4
            l2.i r7 = r5.mo4991a()
            r12.f4176q = r7
            l2.j r6 = r12.f4181v
            l2.f$b r2 = r12.f4164e
            float r8 = r2.f4197k
            android.graphics.RectF r2 = r12.f4173n
            android.graphics.RectF r4 = r12.mo4965h()
            r2.set(r4)
            float r2 = r12.mo4969k()
            android.graphics.RectF r4 = r12.f4173n
            r4.inset(r2, r2)
            android.graphics.RectF r9 = r12.f4173n
            android.graphics.Path r11 = r12.f4171l
            r10 = 0
            r6.mo4997a(r7, r8, r9, r10, r11)
            android.graphics.RectF r2 = r12.mo4965h()
            android.graphics.Path r4 = r12.f4170k
            r12.mo4956b(r2, r4)
            r12.f4168i = r3
        L_0x00c4:
            l2.f$b r2 = r12.f4164e
            int r4 = r2.f4203q
            r5 = 2
            r6 = 1
            if (r4 == r6) goto L_0x00f3
            int r7 = r2.f4204r
            if (r7 <= 0) goto L_0x00f3
            if (r4 == r5) goto L_0x00f1
            int r4 = android.os.Build.VERSION.SDK_INT
            l2.i r2 = r2.f4187a
            android.graphics.RectF r7 = r12.mo4965h()
            boolean r2 = r2.mo4989d(r7)
            if (r2 != 0) goto L_0x00ee
            android.graphics.Path r2 = r12.f4170k
            boolean r2 = r2.isConvex()
            if (r2 != 0) goto L_0x00ee
            r2 = 29
            if (r4 >= r2) goto L_0x00ee
            r2 = r6
            goto L_0x00ef
        L_0x00ee:
            r2 = r3
        L_0x00ef:
            if (r2 == 0) goto L_0x00f3
        L_0x00f1:
            r2 = r6
            goto L_0x00f4
        L_0x00f3:
            r2 = r3
        L_0x00f4:
            if (r2 != 0) goto L_0x00f8
            goto L_0x0189
        L_0x00f8:
            r13.save()
            int r2 = r12.mo4966i()
            int r4 = r12.mo4968j()
            float r2 = (float) r2
            float r4 = (float) r4
            r13.translate(r2, r4)
            boolean r2 = r12.f4185z
            if (r2 != 0) goto L_0x0110
            r12.mo4960f(r13)
            goto L_0x0186
        L_0x0110:
            android.graphics.RectF r2 = r12.f4184y
            float r2 = r2.width()
            android.graphics.Rect r4 = r12.getBounds()
            int r4 = r4.width()
            float r4 = (float) r4
            float r2 = r2 - r4
            int r2 = (int) r2
            android.graphics.RectF r4 = r12.f4184y
            float r4 = r4.height()
            android.graphics.Rect r7 = r12.getBounds()
            int r7 = r7.height()
            float r7 = (float) r7
            float r4 = r4 - r7
            int r4 = (int) r4
            if (r2 < 0) goto L_0x01d7
            if (r4 < 0) goto L_0x01d7
            android.graphics.RectF r7 = r12.f4184y
            float r7 = r7.width()
            int r7 = (int) r7
            l2.f$b r8 = r12.f4164e
            int r8 = r8.f4204r
            int r8 = r8 * r5
            int r8 = r8 + r7
            int r8 = r8 + r2
            android.graphics.RectF r7 = r12.f4184y
            float r7 = r7.height()
            int r7 = (int) r7
            l2.f$b r9 = r12.f4164e
            int r9 = r9.f4204r
            int r9 = r9 * r5
            int r9 = r9 + r7
            int r9 = r9 + r4
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r8, r9, r5)
            android.graphics.Canvas r7 = new android.graphics.Canvas
            r7.<init>(r5)
            android.graphics.Rect r8 = r12.getBounds()
            int r8 = r8.left
            l2.f$b r9 = r12.f4164e
            int r9 = r9.f4204r
            int r8 = r8 - r9
            int r8 = r8 - r2
            float r2 = (float) r8
            android.graphics.Rect r8 = r12.getBounds()
            int r8 = r8.top
            l2.f$b r9 = r12.f4164e
            int r9 = r9.f4204r
            int r8 = r8 - r9
            int r8 = r8 - r4
            float r4 = (float) r8
            float r8 = -r2
            float r9 = -r4
            r7.translate(r8, r9)
            r12.mo4960f(r7)
            r7 = 0
            r13.drawBitmap(r5, r2, r4, r7)
            r5.recycle()
        L_0x0186:
            r13.restore()
        L_0x0189:
            l2.f$b r2 = r12.f4164e
            android.graphics.Paint$Style r4 = r2.f4208v
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r4 == r5) goto L_0x0195
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
            if (r4 != r5) goto L_0x0196
        L_0x0195:
            r3 = r6
        L_0x0196:
            if (r3 == 0) goto L_0x01a7
            android.graphics.Paint r6 = r12.f4177r
            android.graphics.Path r7 = r12.f4170k
            l2.i r8 = r2.f4187a
            android.graphics.RectF r9 = r12.mo4965h()
            r4 = r12
            r5 = r13
            r4.mo4961g(r5, r6, r7, r8, r9)
        L_0x01a7:
            boolean r2 = r12.mo4971m()
            if (r2 == 0) goto L_0x01cc
            android.graphics.Paint r5 = r12.f4178s
            android.graphics.Path r6 = r12.f4171l
            l2.i r7 = r12.f4176q
            android.graphics.RectF r2 = r12.f4173n
            android.graphics.RectF r3 = r12.mo4965h()
            r2.set(r3)
            float r2 = r12.mo4969k()
            android.graphics.RectF r3 = r12.f4173n
            r3.inset(r2, r2)
            android.graphics.RectF r8 = r12.f4173n
            r3 = r12
            r4 = r13
            r3.mo4961g(r4, r5, r6, r7, r8)
        L_0x01cc:
            android.graphics.Paint r13 = r12.f4177r
            r13.setAlpha(r0)
            android.graphics.Paint r13 = r12.f4178s
            r13.setAlpha(r1)
            return
        L_0x01d7:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Invalid shadow bounds. Check that the treatments result in a valid path."
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p072l2.C1242f.draw(android.graphics.Canvas):void");
    }

    /* renamed from: e */
    public int mo4959e(int i) {
        C1244b bVar = this.f4164e;
        float f = bVar.f4201o + bVar.f4202p + bVar.f4200n;
        C0624a aVar = bVar.f4188b;
        if (aVar == null || !aVar.f2493a) {
            return i;
        }
        if (!(C0557a.m1819c(i, 255) == aVar.f2495c)) {
            return i;
        }
        float f2 = aVar.f2496d;
        float f3 = 0.0f;
        if (f2 > 0.0f && f > 0.0f) {
            f3 = Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        return C0557a.m1819c(C2036r.m5371i(C0557a.m1819c(i, 255), aVar.f2494b, f3), Color.alpha(i));
    }

    /* renamed from: f */
    public final void mo4960f(Canvas canvas) {
        this.f4167h.cardinality();
        if (this.f4164e.f4205s != 0) {
            canvas.drawPath(this.f4170k, this.f4179t.f4090a);
        }
        for (int i = 0; i < 4; i++) {
            C1254l.C1260f fVar = this.f4165f[i];
            C1195a aVar = this.f4179t;
            int i2 = this.f4164e.f4204r;
            Matrix matrix = C1254l.C1260f.f4271a;
            fVar.mo4999a(matrix, aVar, i2, canvas);
            this.f4166g[i].mo4999a(matrix, this.f4179t, this.f4164e.f4204r, canvas);
        }
        if (this.f4185z) {
            int i3 = mo4966i();
            int j = mo4968j();
            canvas.translate((float) (-i3), (float) (-j));
            canvas.drawPath(this.f4170k, f4163A);
            canvas.translate((float) i3, (float) j);
        }
    }

    /* renamed from: g */
    public final void mo4961g(Canvas canvas, Paint paint, Path path, C1247i iVar, RectF rectF) {
        if (iVar.mo4989d(rectF)) {
            float a = iVar.f4215f.mo4949a(rectF) * this.f4164e.f4197k;
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public Drawable.ConstantState getConstantState() {
        return this.f4164e;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        C1244b bVar = this.f4164e;
        if (bVar.f4203q != 2) {
            if (bVar.f4187a.mo4989d(mo4965h())) {
                outline.setRoundRect(getBounds(), mo4970l() * this.f4164e.f4197k);
                return;
            }
            mo4956b(mo4965h(), this.f4170k);
            if (this.f4170k.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.f4170k);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f4164e.f4195i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.f4174o.set(getBounds());
        mo4956b(mo4965h(), this.f4170k);
        this.f4175p.setPath(this.f4170k, this.f4174o);
        this.f4174o.op(this.f4175p, Region.Op.DIFFERENCE);
        return this.f4174o;
    }

    /* renamed from: h */
    public RectF mo4965h() {
        this.f4172m.set(getBounds());
        return this.f4172m;
    }

    /* renamed from: i */
    public int mo4966i() {
        C1244b bVar = this.f4164e;
        return (int) (Math.sin(Math.toRadians((double) bVar.f4206t)) * ((double) bVar.f4205s));
    }

    public void invalidateSelf() {
        this.f4168i = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.f4164e.f4191e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.f4164e.f4190d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f4164e.f4193g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f4164e.f4192f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            l2.f$b r0 = r1.f4164e
            android.content.res.ColorStateList r0 = r0.f4193g
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            l2.f$b r0 = r1.f4164e
            android.content.res.ColorStateList r0 = r0.f4192f
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            l2.f$b r0 = r1.f4164e
            android.content.res.ColorStateList r0 = r0.f4191e
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            l2.f$b r0 = r1.f4164e
            android.content.res.ColorStateList r0 = r0.f4190d
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p072l2.C1242f.isStateful():boolean");
    }

    /* renamed from: j */
    public int mo4968j() {
        C1244b bVar = this.f4164e;
        return (int) (Math.cos(Math.toRadians((double) bVar.f4206t)) * ((double) bVar.f4205s));
    }

    /* renamed from: k */
    public final float mo4969k() {
        if (mo4971m()) {
            return this.f4178s.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: l */
    public float mo4970l() {
        return this.f4164e.f4187a.f4214e.mo4949a(mo4965h());
    }

    /* renamed from: m */
    public final boolean mo4971m() {
        Paint.Style style = this.f4164e.f4208v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f4178s.getStrokeWidth() > 0.0f;
    }

    public Drawable mutate() {
        this.f4164e = new C1244b(this.f4164e);
        return this;
    }

    /* renamed from: n */
    public void mo4973n(Context context) {
        this.f4164e.f4188b = new C0624a(context);
        mo4984w();
    }

    /* renamed from: o */
    public void mo4974o(float f) {
        C1244b bVar = this.f4164e;
        if (bVar.f4201o != f) {
            bVar.f4201o = f;
            mo4984w();
        }
    }

    public void onBoundsChange(Rect rect) {
        this.f4168i = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z = mo4982u(iArr) || mo4983v();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* renamed from: p */
    public void mo4976p(ColorStateList colorStateList) {
        C1244b bVar = this.f4164e;
        if (bVar.f4190d != colorStateList) {
            bVar.f4190d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: q */
    public void mo4977q(float f) {
        C1244b bVar = this.f4164e;
        if (bVar.f4197k != f) {
            bVar.f4197k = f;
            this.f4168i = true;
            invalidateSelf();
        }
    }

    /* renamed from: r */
    public void mo4978r(float f, int i) {
        this.f4164e.f4198l = f;
        invalidateSelf();
        mo4981t(ColorStateList.valueOf(i));
    }

    /* renamed from: s */
    public void mo4979s(float f, ColorStateList colorStateList) {
        this.f4164e.f4198l = f;
        invalidateSelf();
        mo4981t(colorStateList);
    }

    public void setAlpha(int i) {
        C1244b bVar = this.f4164e;
        if (bVar.f4199m != i) {
            bVar.f4199m = i;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f4164e.f4189c = colorFilter;
        super.invalidateSelf();
    }

    public void setShapeAppearanceModel(C1247i iVar) {
        this.f4164e.f4187a = iVar;
        invalidateSelf();
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f4164e.f4193g = colorStateList;
        mo4983v();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C1244b bVar = this.f4164e;
        if (bVar.f4194h != mode) {
            bVar.f4194h = mode;
            mo4983v();
            super.invalidateSelf();
        }
    }

    /* renamed from: t */
    public void mo4981t(ColorStateList colorStateList) {
        C1244b bVar = this.f4164e;
        if (bVar.f4191e != colorStateList) {
            bVar.f4191e = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: u */
    public final boolean mo4982u(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f4164e.f4190d == null || (color2 = this.f4177r.getColor()) == (colorForState2 = this.f4164e.f4190d.getColorForState(iArr, color2))) {
            z = false;
        } else {
            this.f4177r.setColor(colorForState2);
            z = true;
        }
        if (this.f4164e.f4191e == null || (color = this.f4178s.getColor()) == (colorForState = this.f4164e.f4191e.getColorForState(iArr, color))) {
            return z;
        }
        this.f4178s.setColor(colorForState);
        return true;
    }

    /* renamed from: v */
    public final boolean mo4983v() {
        PorterDuffColorFilter porterDuffColorFilter = this.f4182w;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f4183x;
        C1244b bVar = this.f4164e;
        this.f4182w = mo4958d(bVar.f4193g, bVar.f4194h, this.f4177r, true);
        C1244b bVar2 = this.f4164e;
        this.f4183x = mo4958d(bVar2.f4192f, bVar2.f4194h, this.f4178s, false);
        C1244b bVar3 = this.f4164e;
        if (bVar3.f4207u) {
            this.f4179t.mo4803a(bVar3.f4193g.getColorForState(getState(), 0));
        }
        if (!Objects.equals(porterDuffColorFilter, this.f4182w) || !Objects.equals(porterDuffColorFilter2, this.f4183x)) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final void mo4984w() {
        C1244b bVar = this.f4164e;
        float f = bVar.f4201o + bVar.f4202p;
        bVar.f4204r = (int) Math.ceil((double) (0.75f * f));
        this.f4164e.f4205s = (int) Math.ceil((double) (f * 0.25f));
        mo4983v();
        super.invalidateSelf();
    }
}
