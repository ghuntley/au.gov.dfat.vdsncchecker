package p066k2;

import android.graphics.Paint;
import android.graphics.Path;
import p016c0.C0557a;

/* renamed from: k2.a */
public class C1195a {

    /* renamed from: i */
    public static final int[] f4086i = new int[3];

    /* renamed from: j */
    public static final float[] f4087j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    public static final int[] f4088k = new int[4];

    /* renamed from: l */
    public static final float[] f4089l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    public final Paint f4090a = new Paint();

    /* renamed from: b */
    public final Paint f4091b;

    /* renamed from: c */
    public final Paint f4092c;

    /* renamed from: d */
    public int f4093d;

    /* renamed from: e */
    public int f4094e;

    /* renamed from: f */
    public int f4095f;

    /* renamed from: g */
    public final Path f4096g = new Path();

    /* renamed from: h */
    public Paint f4097h = new Paint();

    public C1195a() {
        mo4803a(-16777216);
        this.f4097h.setColor(0);
        Paint paint = new Paint(4);
        this.f4091b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f4092c = new Paint(paint);
    }

    /* renamed from: a */
    public void mo4803a(int i) {
        this.f4093d = C0557a.m1819c(i, 68);
        this.f4094e = C0557a.m1819c(i, 20);
        this.f4095f = C0557a.m1819c(i, 0);
        this.f4090a.setColor(this.f4093d);
    }
}
