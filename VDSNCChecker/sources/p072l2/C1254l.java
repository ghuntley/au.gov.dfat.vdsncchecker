package p072l2;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p066k2.C1195a;

/* renamed from: l2.l */
public class C1254l {
    @Deprecated

    /* renamed from: a */
    public float f4249a;
    @Deprecated

    /* renamed from: b */
    public float f4250b;
    @Deprecated

    /* renamed from: c */
    public float f4251c;
    @Deprecated

    /* renamed from: d */
    public float f4252d;
    @Deprecated

    /* renamed from: e */
    public float f4253e;
    @Deprecated

    /* renamed from: f */
    public float f4254f;

    /* renamed from: g */
    public final List<C1259e> f4255g = new ArrayList();

    /* renamed from: h */
    public final List<C1260f> f4256h = new ArrayList();

    /* renamed from: l2.l$a */
    public static class C1255a extends C1260f {

        /* renamed from: b */
        public final C1257c f4257b;

        public C1255a(C1257c cVar) {
            this.f4257b = cVar;
        }

        /* renamed from: a */
        public void mo4999a(Matrix matrix, C1195a aVar, int i, Canvas canvas) {
            C1195a aVar2 = aVar;
            int i2 = i;
            Canvas canvas2 = canvas;
            C1257c cVar = this.f4257b;
            float f = cVar.f4266f;
            float f2 = cVar.f4267g;
            C1257c cVar2 = this.f4257b;
            RectF rectF = new RectF(cVar2.f4262b, cVar2.f4263c, cVar2.f4264d, cVar2.f4265e);
            boolean z = f2 < 0.0f;
            Path path = aVar2.f4096g;
            if (z) {
                int[] iArr = C1195a.f4088k;
                iArr[0] = 0;
                iArr[1] = aVar2.f4095f;
                iArr[2] = aVar2.f4094e;
                iArr[3] = aVar2.f4093d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f, f2);
                path.close();
                float f3 = (float) (-i2);
                rectF.inset(f3, f3);
                int[] iArr2 = C1195a.f4088k;
                iArr2[0] = 0;
                iArr2[1] = aVar2.f4093d;
                iArr2[2] = aVar2.f4094e;
                iArr2[3] = aVar2.f4095f;
            }
            float width = rectF.width() / 2.0f;
            if (width > 0.0f) {
                float f4 = 1.0f - (((float) i2) / width);
                float[] fArr = C1195a.f4089l;
                fArr[1] = f4;
                fArr[2] = ((1.0f - f4) / 2.0f) + f4;
                aVar2.f4091b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, C1195a.f4088k, fArr, Shader.TileMode.CLAMP));
                canvas.save();
                canvas2.concat(matrix);
                canvas2.scale(1.0f, rectF.height() / rectF.width());
                if (!z) {
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                    canvas2.drawPath(path, aVar2.f4097h);
                }
                canvas.drawArc(rectF, f, f2, true, aVar2.f4091b);
                canvas.restore();
            }
        }
    }

    /* renamed from: l2.l$b */
    public static class C1256b extends C1260f {

        /* renamed from: b */
        public final C1258d f4258b;

        /* renamed from: c */
        public final float f4259c;

        /* renamed from: d */
        public final float f4260d;

        public C1256b(C1258d dVar, float f, float f2) {
            this.f4258b = dVar;
            this.f4259c = f;
            this.f4260d = f2;
        }

        /* renamed from: a */
        public void mo4999a(Matrix matrix, C1195a aVar, int i, Canvas canvas) {
            C1258d dVar = this.f4258b;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (dVar.f4269c - this.f4260d), (double) (dVar.f4268b - this.f4259c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f4259c, this.f4260d);
            matrix2.preRotate(mo5005b());
            Objects.requireNonNull(aVar);
            rectF.bottom += (float) i;
            rectF.offset(0.0f, (float) (-i));
            int[] iArr = C1195a.f4086i;
            iArr[0] = aVar.f4095f;
            iArr[1] = aVar.f4094e;
            iArr[2] = aVar.f4093d;
            Paint paint = aVar.f4092c;
            float f = rectF.left;
            paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, C1195a.f4087j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, aVar.f4092c);
            canvas.restore();
        }

        /* renamed from: b */
        public float mo5005b() {
            C1258d dVar = this.f4258b;
            return (float) Math.toDegrees(Math.atan((double) ((dVar.f4269c - this.f4260d) / (dVar.f4268b - this.f4259c))));
        }
    }

    /* renamed from: l2.l$c */
    public static class C1257c extends C1259e {

        /* renamed from: h */
        public static final RectF f4261h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f4262b;
        @Deprecated

        /* renamed from: c */
        public float f4263c;
        @Deprecated

        /* renamed from: d */
        public float f4264d;
        @Deprecated

        /* renamed from: e */
        public float f4265e;
        @Deprecated

        /* renamed from: f */
        public float f4266f;
        @Deprecated

        /* renamed from: g */
        public float f4267g;

        public C1257c(float f, float f2, float f3, float f4) {
            this.f4262b = f;
            this.f4263c = f2;
            this.f4264d = f3;
            this.f4265e = f4;
        }

        /* renamed from: a */
        public void mo5006a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f4270a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f4261h;
            rectF.set(this.f4262b, this.f4263c, this.f4264d, this.f4265e);
            path.arcTo(rectF, this.f4266f, this.f4267g, false);
            path.transform(matrix);
        }
    }

    /* renamed from: l2.l$d */
    public static class C1258d extends C1259e {

        /* renamed from: b */
        public float f4268b;

        /* renamed from: c */
        public float f4269c;

        /* renamed from: a */
        public void mo5006a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f4270a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f4268b, this.f4269c);
            path.transform(matrix);
        }
    }

    /* renamed from: l2.l$e */
    public static abstract class C1259e {

        /* renamed from: a */
        public final Matrix f4270a = new Matrix();

        /* renamed from: a */
        public abstract void mo5006a(Matrix matrix, Path path);
    }

    /* renamed from: l2.l$f */
    public static abstract class C1260f {

        /* renamed from: a */
        public static final Matrix f4271a = new Matrix();

        /* renamed from: a */
        public abstract void mo4999a(Matrix matrix, C1195a aVar, int i, Canvas canvas);
    }

    public C1254l() {
        mo5004e(0.0f, 0.0f, 270.0f, 0.0f);
    }

    /* renamed from: a */
    public void mo5000a(float f, float f2, float f3, float f4, float f5, float f6) {
        C1257c cVar = new C1257c(f, f2, f3, f4);
        cVar.f4266f = f5;
        cVar.f4267g = f6;
        this.f4255g.add(cVar);
        C1255a aVar = new C1255a(cVar);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        float f8 = z ? (180.0f + f7) % 360.0f : f7;
        mo5001b(f5);
        this.f4256h.add(aVar);
        this.f4253e = f8;
        double d = (double) f7;
        this.f4251c = (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))) + ((f + f3) * 0.5f);
        this.f4252d = (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))) + ((f2 + f4) * 0.5f);
    }

    /* renamed from: b */
    public final void mo5001b(float f) {
        float f2 = this.f4253e;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 <= 180.0f) {
                float f4 = this.f4251c;
                float f5 = this.f4252d;
                C1257c cVar = new C1257c(f4, f5, f4, f5);
                cVar.f4266f = this.f4253e;
                cVar.f4267g = f3;
                this.f4256h.add(new C1255a(cVar));
                this.f4253e = f;
            }
        }
    }

    /* renamed from: c */
    public void mo5002c(Matrix matrix, Path path) {
        int size = this.f4255g.size();
        for (int i = 0; i < size; i++) {
            this.f4255g.get(i).mo5006a(matrix, path);
        }
    }

    /* renamed from: d */
    public void mo5003d(float f, float f2) {
        C1258d dVar = new C1258d();
        dVar.f4268b = f;
        dVar.f4269c = f2;
        this.f4255g.add(dVar);
        C1256b bVar = new C1256b(dVar, this.f4251c, this.f4252d);
        mo5001b(bVar.mo5005b() + 270.0f);
        this.f4256h.add(bVar);
        this.f4253e = bVar.mo5005b() + 270.0f;
        this.f4251c = f;
        this.f4252d = f2;
    }

    /* renamed from: e */
    public void mo5004e(float f, float f2, float f3, float f4) {
        this.f4249a = f;
        this.f4250b = f2;
        this.f4251c = f;
        this.f4252d = f2;
        this.f4253e = f3;
        this.f4254f = (f3 + f4) % 360.0f;
        this.f4255g.clear();
        this.f4256h.clear();
    }
}
