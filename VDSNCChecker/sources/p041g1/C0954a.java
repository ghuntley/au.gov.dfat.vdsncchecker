package p041g1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import p001a0.C0002a;
import p007au.gov.dfat.vdsncchecker.R;
import p007au.gov.dfat.vdsncchecker.camera.GraphicOverlay;
import p136w0.C2036r;

/* renamed from: g1.a */
public final class C0954a extends GraphicOverlay.C0487a {

    /* renamed from: b */
    public final GraphicOverlay f3528b;

    /* renamed from: c */
    public final int f3529c = C2036r.m5369g(30);

    /* renamed from: d */
    public final Paint f3530d;

    /* renamed from: e */
    public final Paint f3531e;

    /* renamed from: f */
    public final Paint f3532f;

    /* renamed from: g */
    public final Paint f3533g;

    public C0954a(GraphicOverlay graphicOverlay) {
        super(graphicOverlay);
        this.f3528b = graphicOverlay;
        Paint paint = new Paint();
        Context context = this.f2238a;
        Object obj = C0002a.f0a;
        paint.setColor(C0002a.C0005c.m7a(context, R.color.barcode_reticle_stroke));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) this.f2238a.getResources().getDimensionPixelOffset(R.dimen.barcode_reticle_stroke_width));
        this.f3530d = paint;
        Paint paint2 = new Paint();
        paint2.setColor(C0002a.C0005c.m7a(this.f2238a, R.color.barcode_reticle_background));
        this.f3531e = paint2;
        Paint paint3 = new Paint();
        paint3.setStrokeWidth(paint.getStrokeWidth());
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint3.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f3532f = paint3;
        Paint paint4 = new Paint();
        paint4.setStrokeWidth(paint.getStrokeWidth());
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setColor(-1);
        this.f3533g = paint4;
    }

    /* renamed from: a */
    public void mo2461a(Canvas canvas) {
        Canvas canvas2 = canvas;
        float width = (float) this.f3528b.getWidth();
        float f = 0.75f * width;
        float f2 = (float) 2;
        float f3 = width / f2;
        float height = ((float) this.f3528b.getHeight()) / f2;
        float f4 = f / f2;
        float f5 = f3 - f4;
        float f6 = f3 + f4;
        float f7 = height - f4;
        float f8 = height + f4;
        int g = C2036r.m5369g((int) (this.f3533g.getStrokeWidth() / ((float) 4)));
        RectF rectF = new RectF(f5, f7, f6, f8);
        canvas.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), this.f3531e);
        canvas2.drawRect(rectF, this.f3532f);
        canvas2.drawRect(rectF, this.f3530d);
        float f9 = (float) g;
        float f10 = f5 - f9;
        canvas.drawLine(f10, f7, f5 + ((float) this.f3529c), f7, this.f3533g);
        float f11 = f7 - f9;
        canvas.drawLine(f5, f11, f5, f7 + ((float) this.f3529c), this.f3533g);
        float f12 = f6 + f9;
        canvas.drawLine(f12, f7, f6 - ((float) this.f3529c), f7, this.f3533g);
        canvas.drawLine(f6, f11, f6, f7 + ((float) this.f3529c), this.f3533g);
        canvas.drawLine(f10, f8, f5 + ((float) this.f3529c), f8, this.f3533g);
        float f13 = f8 + f9;
        canvas.drawLine(f5, f13, f5, f8 - ((float) this.f3529c), this.f3533g);
        canvas.drawLine(f12, f8, f6 - ((float) this.f3529c), f8, this.f3533g);
        canvas.drawLine(f6, f13, f6, f8 - ((float) this.f3529c), this.f3533g);
    }
}
