package p089o1;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: o1.e */
public class C1498e extends Property<ImageView, Matrix> {

    /* renamed from: a */
    public final Matrix f4660a = new Matrix();

    public C1498e() {
        super(Matrix.class, "imageMatrixProperty");
    }

    public Object get(Object obj) {
        this.f4660a.set(((ImageView) obj).getImageMatrix());
        return this.f4660a;
    }

    public void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}
