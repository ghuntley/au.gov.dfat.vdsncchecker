package p089o1;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: o1.d */
public class C1497d extends Property<Drawable, Integer> {

    /* renamed from: a */
    public static final Property<Drawable, Integer> f4659a = new C1497d();

    public C1497d() {
        super(Integer.class, "drawableAlphaCompat");
        new WeakHashMap();
    }

    public Object get(Object obj) {
        return Integer.valueOf(((Drawable) obj).getAlpha());
    }

    public void set(Object obj, Object obj2) {
        ((Drawable) obj).setAlpha(((Integer) obj2).intValue());
    }
}
