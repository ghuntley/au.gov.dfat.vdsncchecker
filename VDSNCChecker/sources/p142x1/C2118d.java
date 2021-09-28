package p142x1;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import p042g2.C0955a;

/* renamed from: x1.d */
public interface C2118d {

    /* renamed from: x1.d$b */
    public static class C2120b implements TypeEvaluator<C2123e> {

        /* renamed from: b */
        public static final TypeEvaluator<C2123e> f6148b = new C2120b();

        /* renamed from: a */
        public final C2123e f6149a = new C2123e((C2119a) null);

        public Object evaluate(float f, Object obj, Object obj2) {
            C2123e eVar = (C2123e) obj;
            C2123e eVar2 = (C2123e) obj2;
            C2123e eVar3 = this.f6149a;
            float t = C0955a.m2746t(eVar.f6152a, eVar2.f6152a, f);
            float t2 = C0955a.m2746t(eVar.f6153b, eVar2.f6153b, f);
            float t3 = C0955a.m2746t(eVar.f6154c, eVar2.f6154c, f);
            eVar3.f6152a = t;
            eVar3.f6153b = t2;
            eVar3.f6154c = t3;
            return this.f6149a;
        }
    }

    /* renamed from: x1.d$c */
    public static class C2121c extends Property<C2118d, C2123e> {

        /* renamed from: a */
        public static final Property<C2118d, C2123e> f6150a = new C2121c("circularReveal");

        public C2121c(String str) {
            super(C2123e.class, str);
        }

        public Object get(Object obj) {
            return ((C2118d) obj).getRevealInfo();
        }

        public void set(Object obj, Object obj2) {
            ((C2118d) obj).setRevealInfo((C2123e) obj2);
        }
    }

    /* renamed from: x1.d$d */
    public static class C2122d extends Property<C2118d, Integer> {

        /* renamed from: a */
        public static final Property<C2118d, Integer> f6151a = new C2122d("circularRevealScrimColor");

        public C2122d(String str) {
            super(Integer.class, str);
        }

        public Object get(Object obj) {
            return Integer.valueOf(((C2118d) obj).getCircularRevealScrimColor());
        }

        public void set(Object obj, Object obj2) {
            ((C2118d) obj).setCircularRevealScrimColor(((Integer) obj2).intValue());
        }
    }

    /* renamed from: x1.d$e */
    public static class C2123e {

        /* renamed from: a */
        public float f6152a;

        /* renamed from: b */
        public float f6153b;

        /* renamed from: c */
        public float f6154c;

        public C2123e() {
        }

        public C2123e(float f, float f2, float f3) {
            this.f6152a = f;
            this.f6153b = f2;
            this.f6154c = f3;
        }

        public C2123e(C2119a aVar) {
        }
    }

    /* renamed from: a */
    void mo6652a();

    /* renamed from: b */
    void mo6653b();

    int getCircularRevealScrimColor();

    C2123e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C2123e eVar);
}
