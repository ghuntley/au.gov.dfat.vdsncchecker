package p072l2;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Objects;
import p072l2.C1242f;
import p072l2.C1254l;
import p129v.C1960d;

/* renamed from: l2.j */
public class C1250j {

    /* renamed from: a */
    public final C1254l[] f4234a = new C1254l[4];

    /* renamed from: b */
    public final Matrix[] f4235b = new Matrix[4];

    /* renamed from: c */
    public final Matrix[] f4236c = new Matrix[4];

    /* renamed from: d */
    public final PointF f4237d = new PointF();

    /* renamed from: e */
    public final Path f4238e = new Path();

    /* renamed from: f */
    public final Path f4239f = new Path();

    /* renamed from: g */
    public final C1254l f4240g = new C1254l();

    /* renamed from: h */
    public final float[] f4241h = new float[2];

    /* renamed from: i */
    public final float[] f4242i = new float[2];

    /* renamed from: j */
    public final Path f4243j = new Path();

    /* renamed from: k */
    public final Path f4244k = new Path();

    /* renamed from: l */
    public boolean f4245l = true;

    /* renamed from: l2.j$a */
    public static class C1251a {

        /* renamed from: a */
        public static final C1250j f4246a = new C1250j();
    }

    /* renamed from: l2.j$b */
    public interface C1252b {
    }

    public C1250j() {
        for (int i = 0; i < 4; i++) {
            this.f4234a[i] = new C1254l();
            this.f4235b[i] = new Matrix();
            this.f4236c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    public void mo4997a(C1247i iVar, float f, RectF rectF, C1252b bVar, Path path) {
        float f2;
        float f3;
        C1241e eVar;
        char c;
        Path path2;
        Matrix matrix;
        C1254l lVar;
        C1239c cVar;
        C1960d dVar;
        float f4;
        float f5;
        C1247i iVar2 = iVar;
        float f6 = f;
        RectF rectF2 = rectF;
        Path path3 = path;
        path.rewind();
        this.f4238e.rewind();
        this.f4239f.rewind();
        this.f4239f.addRect(rectF2, Path.Direction.CW);
        int i = 0;
        while (i < 4) {
            if (i == 1) {
                cVar = iVar2.f4216g;
            } else if (i == 2) {
                cVar = iVar2.f4217h;
            } else if (i != 3) {
                cVar = iVar2.f4215f;
            } else {
                cVar = iVar2.f4214e;
            }
            if (i == 1) {
                dVar = iVar2.f4212c;
            } else if (i == 2) {
                dVar = iVar2.f4213d;
            } else if (i != 3) {
                dVar = iVar2.f4211b;
            } else {
                dVar = iVar2.f4210a;
            }
            C1254l lVar2 = this.f4234a[i];
            Objects.requireNonNull(dVar);
            dVar.mo4954a(lVar2, 90.0f, f6, cVar.mo4949a(rectF2));
            int i2 = i + 1;
            float f7 = (float) (i2 * 90);
            this.f4235b[i].reset();
            PointF pointF = this.f4237d;
            if (i == 1) {
                f5 = rectF2.right;
            } else if (i != 2) {
                float f8 = i != 3 ? rectF2.right : rectF2.left;
                f4 = rectF2.top;
                pointF.set(f8, f4);
                Matrix matrix2 = this.f4235b[i];
                PointF pointF2 = this.f4237d;
                matrix2.setTranslate(pointF2.x, pointF2.y);
                this.f4235b[i].preRotate(f7);
                float[] fArr = this.f4241h;
                C1254l[] lVarArr = this.f4234a;
                fArr[0] = lVarArr[i].f4251c;
                fArr[1] = lVarArr[i].f4252d;
                this.f4235b[i].mapPoints(fArr);
                this.f4236c[i].reset();
                Matrix matrix3 = this.f4236c[i];
                float[] fArr2 = this.f4241h;
                matrix3.setTranslate(fArr2[0], fArr2[1]);
                this.f4236c[i].preRotate(f7);
                i = i2;
            } else {
                f5 = rectF2.left;
            }
            f4 = rectF2.bottom;
            pointF.set(f8, f4);
            Matrix matrix22 = this.f4235b[i];
            PointF pointF22 = this.f4237d;
            matrix22.setTranslate(pointF22.x, pointF22.y);
            this.f4235b[i].preRotate(f7);
            float[] fArr3 = this.f4241h;
            C1254l[] lVarArr2 = this.f4234a;
            fArr3[0] = lVarArr2[i].f4251c;
            fArr3[1] = lVarArr2[i].f4252d;
            this.f4235b[i].mapPoints(fArr3);
            this.f4236c[i].reset();
            Matrix matrix32 = this.f4236c[i];
            float[] fArr22 = this.f4241h;
            matrix32.setTranslate(fArr22[0], fArr22[1]);
            this.f4236c[i].preRotate(f7);
            i = i2;
        }
        int i3 = 0;
        while (i3 < 4) {
            float[] fArr4 = this.f4241h;
            C1254l[] lVarArr3 = this.f4234a;
            fArr4[0] = lVarArr3[i3].f4249a;
            fArr4[1] = lVarArr3[i3].f4250b;
            this.f4235b[i3].mapPoints(fArr4);
            float[] fArr5 = this.f4241h;
            if (i3 == 0) {
                path3.moveTo(fArr5[0], fArr5[1]);
            } else {
                path3.lineTo(fArr5[0], fArr5[1]);
            }
            this.f4234a[i3].mo5002c(this.f4235b[i3], path3);
            if (bVar != null) {
                C1254l lVar3 = this.f4234a[i3];
                Matrix matrix4 = this.f4235b[i3];
                C1242f.C1243a aVar = (C1242f.C1243a) bVar;
                BitSet bitSet = C1242f.this.f4167h;
                Objects.requireNonNull(lVar3);
                bitSet.set(i3, false);
                C1254l.C1260f[] fVarArr = C1242f.this.f4165f;
                lVar3.mo5001b(lVar3.f4254f);
                fVarArr[i3] = new C1253k(lVar3, new ArrayList(lVar3.f4256h), new Matrix(matrix4));
            }
            int i4 = i3 + 1;
            int i5 = i4 % 4;
            float[] fArr6 = this.f4241h;
            C1254l[] lVarArr4 = this.f4234a;
            fArr6[0] = lVarArr4[i3].f4251c;
            fArr6[1] = lVarArr4[i3].f4252d;
            this.f4235b[i3].mapPoints(fArr6);
            float[] fArr7 = this.f4242i;
            C1254l[] lVarArr5 = this.f4234a;
            fArr7[0] = lVarArr5[i5].f4249a;
            fArr7[1] = lVarArr5[i5].f4250b;
            this.f4235b[i5].mapPoints(fArr7);
            float[] fArr8 = this.f4241h;
            float f9 = fArr8[0];
            float[] fArr9 = this.f4242i;
            float max = Math.max(((float) Math.hypot((double) (f9 - fArr9[0]), (double) (fArr8[1] - fArr9[1]))) - 0.001f, 0.0f);
            float[] fArr10 = this.f4241h;
            C1254l[] lVarArr6 = this.f4234a;
            fArr10[0] = lVarArr6[i3].f4251c;
            fArr10[1] = lVarArr6[i3].f4252d;
            this.f4235b[i3].mapPoints(fArr10);
            if (i3 == 1 || i3 == 3) {
                f3 = rectF.centerX();
                f2 = this.f4241h[0];
            } else {
                f3 = rectF.centerY();
                f2 = this.f4241h[1];
            }
            float abs = Math.abs(f3 - f2);
            this.f4240g.mo5004e(0.0f, 0.0f, 270.0f, 0.0f);
            if (i3 == 1) {
                c = 3;
                eVar = iVar2.f4220k;
            } else if (i3 != 2) {
                c = 3;
                if (i3 != 3) {
                    eVar = iVar2.f4219j;
                } else {
                    eVar = iVar2.f4218i;
                }
            } else {
                c = 3;
                eVar = iVar2.f4221l;
            }
            eVar.mo4955n(max, abs, f6, this.f4240g);
            this.f4243j.reset();
            this.f4240g.mo5002c(this.f4236c[i3], this.f4243j);
            if (!this.f4245l || (!mo4998b(this.f4243j, i3) && !mo4998b(this.f4243j, i5))) {
                lVar = this.f4240g;
                matrix = this.f4236c[i3];
                path2 = path3;
            } else {
                Path path4 = this.f4243j;
                path4.op(path4, this.f4239f, Path.Op.DIFFERENCE);
                float[] fArr11 = this.f4241h;
                C1254l lVar4 = this.f4240g;
                fArr11[0] = lVar4.f4249a;
                fArr11[1] = lVar4.f4250b;
                this.f4236c[i3].mapPoints(fArr11);
                Path path5 = this.f4238e;
                float[] fArr12 = this.f4241h;
                path5.moveTo(fArr12[0], fArr12[1]);
                lVar = this.f4240g;
                matrix = this.f4236c[i3];
                path2 = this.f4238e;
            }
            lVar.mo5002c(matrix, path2);
            if (bVar != null) {
                C1254l lVar5 = this.f4240g;
                Matrix matrix5 = this.f4236c[i3];
                C1242f.C1243a aVar2 = (C1242f.C1243a) bVar;
                Objects.requireNonNull(lVar5);
                C1242f.this.f4167h.set(i3 + 4, false);
                C1254l.C1260f[] fVarArr2 = C1242f.this.f4166g;
                lVar5.mo5001b(lVar5.f4254f);
                fVarArr2[i3] = new C1253k(lVar5, new ArrayList(lVar5.f4256h), new Matrix(matrix5));
            }
            i3 = i4;
            char c2 = c;
        }
        path.close();
        this.f4238e.close();
        if (!this.f4238e.isEmpty()) {
            path3.op(this.f4238e, Path.Op.UNION);
        }
    }

    /* renamed from: b */
    public final boolean mo4998b(Path path, int i) {
        this.f4244k.reset();
        this.f4234a[i].mo5002c(this.f4235b[i], this.f4244k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f4244k.computeBounds(rectF, true);
        path.op(this.f4244k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
