package p090o2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import p072l2.C1242f;
import p072l2.C1247i;

/* renamed from: o2.f */
public class C1509f extends C1242f {

    /* renamed from: B */
    public final Paint f4675B;

    /* renamed from: C */
    public final RectF f4676C;

    /* renamed from: D */
    public int f4677D;

    public C1509f() {
        this((C1247i) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1509f(C1247i iVar) {
        super(iVar == null ? new C1247i() : iVar);
        Paint paint = new Paint(1);
        this.f4675B = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f4676C = new RectF();
    }

    public void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, (Paint) null);
            }
        } else {
            this.f4677D = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
        }
        super.draw(canvas);
        canvas.drawRect(this.f4676C, this.f4675B);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.f4677D);
        }
    }

    /* renamed from: x */
    public void mo5425x(float f, float f2, float f3, float f4) {
        RectF rectF = this.f4676C;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }
}
