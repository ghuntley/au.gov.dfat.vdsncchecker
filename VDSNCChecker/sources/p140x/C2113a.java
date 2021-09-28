package p140x;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;

/* renamed from: x.a */
public class C2113a {

    /* renamed from: a */
    public static final ThreadLocal<Matrix> f6140a = new ThreadLocal<>();

    /* renamed from: b */
    public static final ThreadLocal<RectF> f6141b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m5504a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m5504a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
