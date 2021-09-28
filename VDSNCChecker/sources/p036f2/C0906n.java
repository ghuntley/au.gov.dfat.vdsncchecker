package p036f2;

import android.graphics.PorterDuff;
import android.view.View;
import java.util.WeakHashMap;
import p058j0.C1061o;
import p058j0.C1070q;

/* renamed from: f2.n */
public class C0906n {

    /* renamed from: f2.n$a */
    public interface C0907a {
    }

    /* renamed from: f2.n$b */
    public static class C0908b {

        /* renamed from: a */
        public int f3429a;

        /* renamed from: b */
        public int f3430b;

        /* renamed from: c */
        public int f3431c;

        /* renamed from: d */
        public int f3432d;

        public C0908b(int i, int i2, int i3, int i4) {
            this.f3429a = i;
            this.f3430b = i2;
            this.f3431c = i3;
            this.f3432d = i4;
        }
    }

    /* renamed from: a */
    public static boolean m2664a(View view) {
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        return view.getLayoutDirection() == 1;
    }

    /* renamed from: b */
    public static PorterDuff.Mode m2665b(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
