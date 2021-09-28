package p016c0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p010b0.C0528a;
import p040g0.C0948l;

/* renamed from: c0.g */
public class C0564g extends C0562e {

    /* renamed from: g */
    public final Class<?> f2375g;

    /* renamed from: h */
    public final Constructor<?> f2376h;

    /* renamed from: i */
    public final Method f2377i;

    /* renamed from: j */
    public final Method f2378j;

    /* renamed from: k */
    public final Method f2379k;

    /* renamed from: l */
    public final Method f2380l;

    /* renamed from: m */
    public final Method f2381m;

    public C0564g() {
        Method method;
        Method method2;
        Method method3;
        Constructor<?> constructor;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = mo2714n(cls2);
            method2 = mo2715o(cls2);
            method = cls2.getMethod("freeze", new Class[0]);
            method4 = cls2.getMethod("abortCreation", new Class[0]);
            Class<?> cls3 = cls2;
            method5 = mo2716p(cls2);
            cls = cls3;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method5 = null;
            method4 = null;
            constructor = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f2375g = cls;
        this.f2376h = constructor;
        this.f2377i = method3;
        this.f2378j = method2;
        this.f2379k = method;
        this.f2380l = method4;
        this.f2381m = method5;
    }

    /* renamed from: m */
    private Object m1835m() {
        try {
            return this.f2376h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public Typeface mo2706a(Context context, C0528a.C0530b bVar, Resources resources, int i) {
        if (!mo2713l()) {
            return super.mo2706a(context, bVar, resources, i);
        }
        Object m = m1835m();
        if (m == null) {
            return null;
        }
        for (C0528a.C0531c cVar : bVar.f2308a) {
            if (!mo2710i(context, m, cVar.f2309a, cVar.f2313e, cVar.f2310b, cVar.f2311c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.f2312d))) {
                mo2709h(m);
                return null;
            }
        }
        if (!mo2712k(m)) {
            return null;
        }
        return mo2711j(m);
    }

    /* renamed from: b */
    public Typeface mo2707b(Context context, CancellationSignal cancellationSignal, C0948l[] lVarArr, int i) {
        Typeface j;
        boolean z;
        ParcelFileDescriptor openFileDescriptor;
        if (lVarArr.length < 1) {
            return null;
        }
        if (!mo2713l()) {
            C0948l e = mo2718e(lVarArr, i);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(e.f3515a, "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(e.f3517c).setItalic(e.f3518d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            HashMap hashMap = new HashMap();
            for (C0948l lVar : lVarArr) {
                if (lVar.f3519e == 0) {
                    Uri uri = lVar.f3515a;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, C0568k.m1862d(context, cancellationSignal, uri));
                    }
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            Object m = m1835m();
            if (m == null) {
                return null;
            }
            boolean z2 = false;
            for (C0948l lVar2 : lVarArr) {
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(lVar2.f3515a);
                if (byteBuffer != null) {
                    try {
                        z = ((Boolean) this.f2378j.invoke(m, new Object[]{byteBuffer, Integer.valueOf(lVar2.f3516b), null, Integer.valueOf(lVar2.f3517c), Integer.valueOf(lVar2.f3518d ? 1 : 0)})).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z = false;
                    }
                    if (!z) {
                        mo2709h(m);
                        return null;
                    }
                    z2 = true;
                }
            }
            if (!z2) {
                mo2709h(m);
                return null;
            } else if (mo2712k(m) && (j = mo2711j(m)) != null) {
                return Typeface.create(j, i);
            } else {
                return null;
            }
        }
        throw th;
    }

    /* renamed from: d */
    public Typeface mo2708d(Context context, Resources resources, int i, String str, int i2) {
        if (!mo2713l()) {
            return super.mo2708d(context, resources, i, str, i2);
        }
        Object m = m1835m();
        if (m == null) {
            return null;
        }
        if (!mo2710i(context, m, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            mo2709h(m);
            return null;
        } else if (!mo2712k(m)) {
            return null;
        } else {
            return mo2711j(m);
        }
    }

    /* renamed from: h */
    public final void mo2709h(Object obj) {
        try {
            this.f2380l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: i */
    public final boolean mo2710i(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2377i.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: j */
    public Typeface mo2711j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2375g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2381m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: k */
    public final boolean mo2712k(Object obj) {
        try {
            return ((Boolean) this.f2379k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: l */
    public final boolean mo2713l() {
        return this.f2377i != null;
    }

    /* renamed from: n */
    public Method mo2714n(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* renamed from: o */
    public Method mo2715o(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* renamed from: p */
    public Method mo2716p(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
