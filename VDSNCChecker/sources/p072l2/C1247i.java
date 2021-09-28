package p072l2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import java.util.Objects;
import p042g2.C0955a;
import p083n1.C1455a;
import p129v.C1960d;

/* renamed from: l2.i */
public class C1247i {

    /* renamed from: a */
    public C1960d f4210a;

    /* renamed from: b */
    public C1960d f4211b;

    /* renamed from: c */
    public C1960d f4212c;

    /* renamed from: d */
    public C1960d f4213d;

    /* renamed from: e */
    public C1239c f4214e;

    /* renamed from: f */
    public C1239c f4215f;

    /* renamed from: g */
    public C1239c f4216g;

    /* renamed from: h */
    public C1239c f4217h;

    /* renamed from: i */
    public C1241e f4218i;

    /* renamed from: j */
    public C1241e f4219j;

    /* renamed from: k */
    public C1241e f4220k;

    /* renamed from: l */
    public C1241e f4221l;

    public C1247i() {
        this.f4210a = new C1246h();
        this.f4211b = new C1246h();
        this.f4212c = new C1246h();
        this.f4213d = new C1246h();
        this.f4214e = new C1237a(0.0f);
        this.f4215f = new C1237a(0.0f);
        this.f4216g = new C1237a(0.0f);
        this.f4217h = new C1237a(0.0f);
        this.f4218i = C0955a.m2735i();
        this.f4219j = C0955a.m2735i();
        this.f4220k = C0955a.m2735i();
        this.f4221l = C0955a.m2735i();
    }

    /* renamed from: a */
    public static C1249b m3550a(Context context, int i, int i2, C1239c cVar) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C1455a.f4587y);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            C1239c c = m3552c(obtainStyledAttributes, 5, cVar);
            C1239c c2 = m3552c(obtainStyledAttributes, 8, c);
            C1239c c3 = m3552c(obtainStyledAttributes, 9, c);
            C1239c c4 = m3552c(obtainStyledAttributes, 7, c);
            C1239c c5 = m3552c(obtainStyledAttributes, 6, c);
            C1249b bVar = new C1249b();
            C1960d g = C0955a.m2733g(i4);
            bVar.f4222a = g;
            C1249b.m3555b(g);
            bVar.f4226e = c2;
            C1960d g2 = C0955a.m2733g(i5);
            bVar.f4223b = g2;
            C1249b.m3555b(g2);
            bVar.f4227f = c3;
            C1960d g3 = C0955a.m2733g(i6);
            bVar.f4224c = g3;
            C1249b.m3555b(g3);
            bVar.f4228g = c4;
            C1960d g4 = C0955a.m2733g(i7);
            bVar.f4225d = g4;
            C1249b.m3555b(g4);
            bVar.f4229h = c5;
            return bVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static C1249b m3551b(Context context, AttributeSet attributeSet, int i, int i2) {
        C1237a aVar = new C1237a((float) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1455a.f4581s, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return m3550a(context, resourceId, resourceId2, aVar);
    }

    /* renamed from: c */
    public static C1239c m3552c(TypedArray typedArray, int i, C1239c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cVar;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new C1237a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new C1245g(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    /* renamed from: d */
    public boolean mo4989d(RectF rectF) {
        Class<C1241e> cls = C1241e.class;
        boolean z = this.f4221l.getClass().equals(cls) && this.f4219j.getClass().equals(cls) && this.f4218i.getClass().equals(cls) && this.f4220k.getClass().equals(cls);
        float a = this.f4214e.mo4949a(rectF);
        return z && ((this.f4215f.mo4949a(rectF) > a ? 1 : (this.f4215f.mo4949a(rectF) == a ? 0 : -1)) == 0 && (this.f4217h.mo4949a(rectF) > a ? 1 : (this.f4217h.mo4949a(rectF) == a ? 0 : -1)) == 0 && (this.f4216g.mo4949a(rectF) > a ? 1 : (this.f4216g.mo4949a(rectF) == a ? 0 : -1)) == 0) && ((this.f4211b instanceof C1246h) && (this.f4210a instanceof C1246h) && (this.f4212c instanceof C1246h) && (this.f4213d instanceof C1246h));
    }

    /* renamed from: e */
    public C1247i mo4990e(float f) {
        C1249b bVar = new C1249b(this);
        bVar.mo4992c(f);
        return bVar.mo4991a();
    }

    /* renamed from: l2.i$b */
    public static final class C1249b {

        /* renamed from: a */
        public C1960d f4222a = new C1246h();

        /* renamed from: b */
        public C1960d f4223b = new C1246h();

        /* renamed from: c */
        public C1960d f4224c = new C1246h();

        /* renamed from: d */
        public C1960d f4225d = new C1246h();

        /* renamed from: e */
        public C1239c f4226e = new C1237a(0.0f);

        /* renamed from: f */
        public C1239c f4227f = new C1237a(0.0f);

        /* renamed from: g */
        public C1239c f4228g = new C1237a(0.0f);

        /* renamed from: h */
        public C1239c f4229h = new C1237a(0.0f);

        /* renamed from: i */
        public C1241e f4230i = C0955a.m2735i();

        /* renamed from: j */
        public C1241e f4231j = C0955a.m2735i();

        /* renamed from: k */
        public C1241e f4232k = C0955a.m2735i();

        /* renamed from: l */
        public C1241e f4233l = C0955a.m2735i();

        public C1249b() {
        }

        /* renamed from: b */
        public static float m3555b(C1960d dVar) {
            Object obj;
            if (dVar instanceof C1246h) {
                obj = (C1246h) dVar;
            } else if (!(dVar instanceof C1240d)) {
                return -1.0f;
            } else {
                obj = (C1240d) dVar;
            }
            Objects.requireNonNull(obj);
            return -1.0f;
        }

        /* renamed from: a */
        public C1247i mo4991a() {
            return new C1247i(this, (C1248a) null);
        }

        /* renamed from: c */
        public C1249b mo4992c(float f) {
            this.f4226e = new C1237a(f);
            this.f4227f = new C1237a(f);
            this.f4228g = new C1237a(f);
            this.f4229h = new C1237a(f);
            return this;
        }

        /* renamed from: d */
        public C1249b mo4993d(float f) {
            this.f4229h = new C1237a(f);
            return this;
        }

        /* renamed from: e */
        public C1249b mo4994e(float f) {
            this.f4228g = new C1237a(f);
            return this;
        }

        /* renamed from: f */
        public C1249b mo4995f(float f) {
            this.f4226e = new C1237a(f);
            return this;
        }

        /* renamed from: g */
        public C1249b mo4996g(float f) {
            this.f4227f = new C1237a(f);
            return this;
        }

        public C1249b(C1247i iVar) {
            this.f4222a = iVar.f4210a;
            this.f4223b = iVar.f4211b;
            this.f4224c = iVar.f4212c;
            this.f4225d = iVar.f4213d;
            this.f4226e = iVar.f4214e;
            this.f4227f = iVar.f4215f;
            this.f4228g = iVar.f4216g;
            this.f4229h = iVar.f4217h;
            this.f4230i = iVar.f4218i;
            this.f4231j = iVar.f4219j;
            this.f4232k = iVar.f4220k;
            this.f4233l = iVar.f4221l;
        }
    }

    public C1247i(C1249b bVar, C1248a aVar) {
        this.f4210a = bVar.f4222a;
        this.f4211b = bVar.f4223b;
        this.f4212c = bVar.f4224c;
        this.f4213d = bVar.f4225d;
        this.f4214e = bVar.f4226e;
        this.f4215f = bVar.f4227f;
        this.f4216g = bVar.f4228g;
        this.f4217h = bVar.f4229h;
        this.f4218i = bVar.f4230i;
        this.f4219j = bVar.f4231j;
        this.f4220k = bVar.f4232k;
        this.f4221l = bVar.f4233l;
    }
}
