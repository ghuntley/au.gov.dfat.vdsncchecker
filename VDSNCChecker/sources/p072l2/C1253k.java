package p072l2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.List;
import p066k2.C1195a;
import p072l2.C1254l;

/* renamed from: l2.k */
public class C1253k extends C1254l.C1260f {

    /* renamed from: b */
    public final /* synthetic */ List f4247b;

    /* renamed from: c */
    public final /* synthetic */ Matrix f4248c;

    public C1253k(C1254l lVar, List list, Matrix matrix) {
        this.f4247b = list;
        this.f4248c = matrix;
    }

    /* renamed from: a */
    public void mo4999a(Matrix matrix, C1195a aVar, int i, Canvas canvas) {
        for (C1254l.C1260f a : this.f4247b) {
            a.mo4999a(this.f4248c, aVar, i, canvas);
        }
    }
}
