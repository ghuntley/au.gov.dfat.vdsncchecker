package p017c1;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;
import p058j0.C1061o;
import p058j0.C1070q;

/* renamed from: c1.p */
public class C0609p {

    /* renamed from: a */
    public static final C0617v f2465a = (Build.VERSION.SDK_INT >= 29 ? new C0616u() : new C0615t());

    /* renamed from: b */
    public static final Property<View, Float> f2466b = new C0610a(Float.class, "translationAlpha");

    /* renamed from: c1.p$a */
    public static class C0610a extends Property<View, Float> {
        public C0610a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf(C0609p.m1979a((View) obj));
        }

        public void set(Object obj, Object obj2) {
            float floatValue = ((Float) obj2).floatValue();
            C0609p.f2465a.mo2811e((View) obj, floatValue);
        }
    }

    /* renamed from: c1.p$b */
    public static class C0611b extends Property<View, Rect> {
        public C0611b(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            return ((View) obj).getClipBounds();
        }

        public void set(Object obj, Object obj2) {
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            ((View) obj).setClipBounds((Rect) obj2);
        }
    }

    static {
        new C0611b(Rect.class, "clipBounds");
    }

    /* renamed from: a */
    public static float m1979a(View view) {
        return f2465a.mo2809b(view);
    }

    /* renamed from: b */
    public static void m1980b(View view, int i, int i2, int i3, int i4) {
        f2465a.mo2814d(view, i, i2, i3, i4);
    }
}
