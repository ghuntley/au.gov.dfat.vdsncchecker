package p058j0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import p016c0.C0558b;
import p058j0.C1061o;

/* renamed from: j0.u */
public class C1076u {

    /* renamed from: b */
    public static final C1076u f3825b = (Build.VERSION.SDK_INT >= 30 ? C1085i.f3850r : C1086j.f3851b);

    /* renamed from: a */
    public final C1086j f3826a;

    /* renamed from: j0.u$a */
    public static class C1077a extends C1080d {

        /* renamed from: d */
        public static Field f3827d = null;

        /* renamed from: e */
        public static boolean f3828e = false;

        /* renamed from: f */
        public static Constructor<WindowInsets> f3829f = null;

        /* renamed from: g */
        public static boolean f3830g = false;

        /* renamed from: b */
        public WindowInsets f3831b;

        /* renamed from: c */
        public C0558b f3832c;

        public C1077a() {
            this.f3831b = m3066e();
        }

        public C1077a(C1076u uVar) {
            super(uVar);
            this.f3831b = uVar.mo4562g();
        }

        /* renamed from: e */
        public static WindowInsets m3066e() {
            if (!f3828e) {
                try {
                    f3827d = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f3828e = true;
            }
            Field field = f3827d;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f3830g) {
                try {
                    f3829f = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException unused3) {
                }
                f3830g = true;
            }
            Constructor<WindowInsets> constructor = f3829f;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        /* renamed from: b */
        public C1076u mo4564b() {
            mo4567a();
            C1076u h = C1076u.m3058h(this.f3831b);
            h.f3826a.mo4573l((C0558b[]) null);
            h.f3826a.mo4581n(this.f3832c);
            return h;
        }

        /* renamed from: c */
        public void mo4565c(C0558b bVar) {
            this.f3832c = bVar;
        }

        /* renamed from: d */
        public void mo4566d(C0558b bVar) {
            WindowInsets windowInsets = this.f3831b;
            if (windowInsets != null) {
                this.f3831b = windowInsets.replaceSystemWindowInsets(bVar.f2359a, bVar.f2360b, bVar.f2361c, bVar.f2362d);
            }
        }
    }

    /* renamed from: j0.u$b */
    public static class C1078b extends C1080d {

        /* renamed from: b */
        public final WindowInsets.Builder f3833b;

        public C1078b() {
            this.f3833b = new WindowInsets.Builder();
        }

        public C1078b(C1076u uVar) {
            super(uVar);
            WindowInsets.Builder builder;
            WindowInsets g = uVar.mo4562g();
            if (g == null) {
                builder = new WindowInsets.Builder();
            }
            this.f3833b = builder;
        }

        /* renamed from: b */
        public C1076u mo4564b() {
            mo4567a();
            C1076u h = C1076u.m3058h(this.f3833b.build());
            h.f3826a.mo4573l((C0558b[]) null);
            return h;
        }

        /* renamed from: c */
        public void mo4565c(C0558b bVar) {
            this.f3833b.setStableInsets(bVar.mo2702c());
        }

        /* renamed from: d */
        public void mo4566d(C0558b bVar) {
            this.f3833b.setSystemWindowInsets(bVar.mo2702c());
        }
    }

    /* renamed from: j0.u$c */
    public static class C1079c extends C1078b {
        public C1079c() {
        }

        public C1079c(C1076u uVar) {
            super(uVar);
        }
    }

    /* renamed from: j0.u$d */
    public static class C1080d {

        /* renamed from: a */
        public final C1076u f3834a;

        public C1080d() {
            this(new C1076u((C1076u) null));
        }

        public C1080d(C1076u uVar) {
            this.f3834a = uVar;
        }

        /* renamed from: a */
        public final void mo4567a() {
        }

        /* renamed from: b */
        public C1076u mo4564b() {
            throw null;
        }

        /* renamed from: c */
        public void mo4565c(C0558b bVar) {
            throw null;
        }

        /* renamed from: d */
        public void mo4566d(C0558b bVar) {
            throw null;
        }
    }

    /* renamed from: j0.u$e */
    public static class C1081e extends C1086j {

        /* renamed from: h */
        public static boolean f3835h = false;

        /* renamed from: i */
        public static Method f3836i;

        /* renamed from: j */
        public static Class<?> f3837j;

        /* renamed from: k */
        public static Class<?> f3838k;

        /* renamed from: l */
        public static Field f3839l;

        /* renamed from: m */
        public static Field f3840m;

        /* renamed from: c */
        public final WindowInsets f3841c;

        /* renamed from: d */
        public C0558b[] f3842d;

        /* renamed from: e */
        public C0558b f3843e = null;

        /* renamed from: f */
        public C1076u f3844f;

        /* renamed from: g */
        public C0558b f3845g;

        public C1081e(C1076u uVar, WindowInsets windowInsets) {
            super(uVar);
            this.f3841c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: p */
        public static void m3077p() {
            try {
                f3836i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                f3837j = Class.forName("android.view.ViewRootImpl");
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f3838k = cls;
                f3839l = cls.getDeclaredField("mVisibleInsets");
                f3840m = f3837j.getDeclaredField("mAttachInfo");
                f3839l.setAccessible(true);
                f3840m.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
            f3835h = true;
        }

        /* renamed from: d */
        public void mo4568d(View view) {
            C0558b o = mo4575o(view);
            if (o == null) {
                o = C0558b.f2358e;
            }
            mo4576q(o);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f3845g, ((C1081e) obj).f3845g);
        }

        /* renamed from: h */
        public final C0558b mo4570h() {
            if (this.f3843e == null) {
                this.f3843e = C0558b.m1820a(this.f3841c.getSystemWindowInsetLeft(), this.f3841c.getSystemWindowInsetTop(), this.f3841c.getSystemWindowInsetRight(), this.f3841c.getSystemWindowInsetBottom());
            }
            return this.f3843e;
        }

        /* renamed from: i */
        public C1076u mo4571i(int i, int i2, int i3, int i4) {
            C1076u h = C1076u.m3058h(this.f3841c);
            int i5 = Build.VERSION.SDK_INT;
            C1080d cVar = i5 >= 30 ? new C1079c(h) : i5 >= 29 ? new C1078b(h) : new C1077a(h);
            cVar.mo4566d(C1076u.m3057e(mo4570h(), i, i2, i3, i4));
            cVar.mo4565c(C1076u.m3057e(mo4579g(), i, i2, i3, i4));
            return cVar.mo4564b();
        }

        /* renamed from: k */
        public boolean mo4572k() {
            return this.f3841c.isRound();
        }

        /* renamed from: l */
        public void mo4573l(C0558b[] bVarArr) {
            this.f3842d = bVarArr;
        }

        /* renamed from: m */
        public void mo4574m(C1076u uVar) {
            this.f3844f = uVar;
        }

        /* renamed from: o */
        public final C0558b mo4575o(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f3835h) {
                    m3077p();
                }
                Method method = f3836i;
                if (!(method == null || f3838k == null || f3839l == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            return null;
                        }
                        Rect rect = (Rect) f3839l.get(f3840m.get(invoke));
                        if (rect != null) {
                            return C0558b.m1820a(rect.left, rect.top, rect.right, rect.bottom);
                        }
                        return null;
                    } catch (ReflectiveOperationException e) {
                        e.getMessage();
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        /* renamed from: q */
        public void mo4576q(C0558b bVar) {
            this.f3845g = bVar;
        }
    }

    /* renamed from: j0.u$f */
    public static class C1082f extends C1081e {

        /* renamed from: n */
        public C0558b f3846n = null;

        public C1082f(C1076u uVar, WindowInsets windowInsets) {
            super(uVar, windowInsets);
        }

        /* renamed from: b */
        public C1076u mo4577b() {
            return C1076u.m3058h(this.f3841c.consumeStableInsets());
        }

        /* renamed from: c */
        public C1076u mo4578c() {
            return C1076u.m3058h(this.f3841c.consumeSystemWindowInsets());
        }

        /* renamed from: g */
        public final C0558b mo4579g() {
            if (this.f3846n == null) {
                this.f3846n = C0558b.m1820a(this.f3841c.getStableInsetLeft(), this.f3841c.getStableInsetTop(), this.f3841c.getStableInsetRight(), this.f3841c.getStableInsetBottom());
            }
            return this.f3846n;
        }

        /* renamed from: j */
        public boolean mo4580j() {
            return this.f3841c.isConsumed();
        }

        /* renamed from: n */
        public void mo4581n(C0558b bVar) {
            this.f3846n = bVar;
        }
    }

    /* renamed from: j0.u$g */
    public static class C1083g extends C1082f {
        public C1083g(C1076u uVar, WindowInsets windowInsets) {
            super(uVar, windowInsets);
        }

        /* renamed from: a */
        public C1076u mo4582a() {
            return C1076u.m3058h(this.f3841c.consumeDisplayCutout());
        }

        /* renamed from: e */
        public C1049d mo4583e() {
            DisplayCutout displayCutout = this.f3841c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new C1049d(displayCutout);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1083g)) {
                return false;
            }
            C1083g gVar = (C1083g) obj;
            return Objects.equals(this.f3841c, gVar.f3841c) && Objects.equals(this.f3845g, gVar.f3845g);
        }

        public int hashCode() {
            return this.f3841c.hashCode();
        }
    }

    /* renamed from: j0.u$h */
    public static class C1084h extends C1083g {

        /* renamed from: o */
        public C0558b f3847o = null;

        /* renamed from: p */
        public C0558b f3848p = null;

        /* renamed from: q */
        public C0558b f3849q = null;

        public C1084h(C1076u uVar, WindowInsets windowInsets) {
            super(uVar, windowInsets);
        }

        /* renamed from: f */
        public C0558b mo4585f() {
            if (this.f3848p == null) {
                this.f3848p = C0558b.m1821b(this.f3841c.getMandatorySystemGestureInsets());
            }
            return this.f3848p;
        }

        /* renamed from: i */
        public C1076u mo4571i(int i, int i2, int i3, int i4) {
            return C1076u.m3058h(this.f3841c.inset(i, i2, i3, i4));
        }

        /* renamed from: n */
        public void mo4581n(C0558b bVar) {
        }
    }

    /* renamed from: j0.u$i */
    public static class C1085i extends C1084h {

        /* renamed from: r */
        public static final C1076u f3850r = C1076u.m3058h(WindowInsets.CONSUMED);

        public C1085i(C1076u uVar, WindowInsets windowInsets) {
            super(uVar, windowInsets);
        }

        /* renamed from: d */
        public final void mo4568d(View view) {
        }
    }

    /* renamed from: j0.u$j */
    public static class C1086j {

        /* renamed from: b */
        public static final C1076u f3851b;

        /* renamed from: a */
        public final C1076u f3852a;

        static {
            int i = Build.VERSION.SDK_INT;
            f3851b = (i >= 30 ? new C1079c() : i >= 29 ? new C1078b() : new C1077a()).mo4564b().f3826a.mo4582a().f3826a.mo4577b().f3826a.mo4578c();
        }

        public C1086j(C1076u uVar) {
            this.f3852a = uVar;
        }

        /* renamed from: a */
        public C1076u mo4582a() {
            return this.f3852a;
        }

        /* renamed from: b */
        public C1076u mo4577b() {
            return this.f3852a;
        }

        /* renamed from: c */
        public C1076u mo4578c() {
            return this.f3852a;
        }

        /* renamed from: d */
        public void mo4568d(View view) {
        }

        /* renamed from: e */
        public C1049d mo4583e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1086j)) {
                return false;
            }
            C1086j jVar = (C1086j) obj;
            if (mo4572k() != jVar.mo4572k() || mo4580j() != jVar.mo4580j() || !Objects.equals(mo4570h(), jVar.mo4570h()) || !Objects.equals(mo4579g(), jVar.mo4579g()) || !Objects.equals(mo4583e(), jVar.mo4583e())) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public C0558b mo4585f() {
            return mo4570h();
        }

        /* renamed from: g */
        public C0558b mo4579g() {
            return C0558b.f2358e;
        }

        /* renamed from: h */
        public C0558b mo4570h() {
            return C0558b.f2358e;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Boolean.valueOf(mo4572k()), Boolean.valueOf(mo4580j()), mo4570h(), mo4579g(), mo4583e()});
        }

        /* renamed from: i */
        public C1076u mo4571i(int i, int i2, int i3, int i4) {
            return f3851b;
        }

        /* renamed from: j */
        public boolean mo4580j() {
            return false;
        }

        /* renamed from: k */
        public boolean mo4572k() {
            return false;
        }

        /* renamed from: l */
        public void mo4573l(C0558b[] bVarArr) {
        }

        /* renamed from: m */
        public void mo4574m(C1076u uVar) {
        }

        /* renamed from: n */
        public void mo4581n(C0558b bVar) {
        }
    }

    public C1076u(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        this.f3826a = i >= 30 ? new C1085i(this, windowInsets) : i >= 29 ? new C1084h(this, windowInsets) : i >= 28 ? new C1083g(this, windowInsets) : new C1082f(this, windowInsets);
    }

    public C1076u(C1076u uVar) {
        this.f3826a = new C1086j(this);
    }

    /* renamed from: e */
    public static C0558b m3057e(C0558b bVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, bVar.f2359a - i);
        int max2 = Math.max(0, bVar.f2360b - i2);
        int max3 = Math.max(0, bVar.f2361c - i3);
        int max4 = Math.max(0, bVar.f2362d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? bVar : C0558b.m1820a(max, max2, max3, max4);
    }

    /* renamed from: h */
    public static C1076u m3058h(WindowInsets windowInsets) {
        return m3059i(windowInsets, (View) null);
    }

    /* renamed from: i */
    public static C1076u m3059i(WindowInsets windowInsets, View view) {
        Objects.requireNonNull(windowInsets);
        C1076u uVar = new C1076u(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            uVar.f3826a.mo4574m(C1061o.C1065c.m3039a(view));
            uVar.f3826a.mo4568d(view.getRootView());
        }
        return uVar;
    }

    @Deprecated
    /* renamed from: a */
    public int mo4556a() {
        return this.f3826a.mo4570h().f2362d;
    }

    @Deprecated
    /* renamed from: b */
    public int mo4557b() {
        return this.f3826a.mo4570h().f2359a;
    }

    @Deprecated
    /* renamed from: c */
    public int mo4558c() {
        return this.f3826a.mo4570h().f2361c;
    }

    @Deprecated
    /* renamed from: d */
    public int mo4559d() {
        return this.f3826a.mo4570h().f2360b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1076u)) {
            return false;
        }
        return Objects.equals(this.f3826a, ((C1076u) obj).f3826a);
    }

    /* renamed from: f */
    public boolean mo4561f() {
        return this.f3826a.mo4580j();
    }

    /* renamed from: g */
    public WindowInsets mo4562g() {
        C1086j jVar = this.f3826a;
        if (jVar instanceof C1081e) {
            return ((C1081e) jVar).f3841c;
        }
        return null;
    }

    public int hashCode() {
        C1086j jVar = this.f3826a;
        if (jVar == null) {
            return 0;
        }
        return jVar.hashCode();
    }
}
