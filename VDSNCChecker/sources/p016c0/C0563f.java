package p016c0;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p040g0.C0948l;
import p093p.C1558h;

/* renamed from: c0.f */
public class C0563f extends C0567j {

    /* renamed from: b */
    public static final Class<?> f2371b;

    /* renamed from: c */
    public static final Constructor<?> f2372c;

    /* renamed from: d */
    public static final Method f2373d;

    /* renamed from: e */
    public static final Method f2374e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method2 = null;
            method = null;
        }
        f2372c = constructor;
        f2371b = cls;
        f2373d = method;
        f2374e = method2;
    }

    /* renamed from: f */
    public static boolean m1831f(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f2373d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: g */
    public static Typeface m1832g(Object obj) {
        try {
            Object newInstance = Array.newInstance(f2371b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2374e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0068 A[LOOP:0: B:8:0x0015->B:39:0x0068, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo2706a(android.content.Context r17, p010b0.C0528a.C0530b r18, android.content.res.Resources r19, int r20) {
        /*
            r16 = this;
            r0 = 0
            r1 = 0
            java.lang.reflect.Constructor<?> r2 = f2372c     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000b }
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000b }
            java.lang.Object r2 = r2.newInstance(r3)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000b }
            goto L_0x000c
        L_0x000b:
            r2 = r1
        L_0x000c:
            if (r2 != 0) goto L_0x000f
            return r1
        L_0x000f:
            r3 = r18
            b0.a$c[] r3 = r3.f2308a
            int r4 = r3.length
            r5 = r0
        L_0x0015:
            if (r5 >= r4) goto L_0x0070
            r6 = r3[r5]
            int r0 = r6.f2314f
            java.io.File r7 = p016c0.C0568k.m1861c(r17)
            r8 = r19
            if (r7 != 0) goto L_0x0024
            goto L_0x002d
        L_0x0024:
            boolean r0 = p016c0.C0568k.m1859a(r7, r8, r0)     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x002f
            r7.delete()
        L_0x002d:
            r0 = r1
            goto L_0x0058
        L_0x002f:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0054 }
            r9.<init>(r7)     // Catch:{ IOException -> 0x0054 }
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch:{ all -> 0x0048 }
            long r14 = r10.size()     // Catch:{ all -> 0x0048 }
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0048 }
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch:{ all -> 0x0048 }
            r9.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0055
        L_0x0048:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch:{ all -> 0x004e }
            goto L_0x0053
        L_0x004e:
            r0 = move-exception
            r9 = r0
            r10.addSuppressed(r9)     // Catch:{ IOException -> 0x0054 }
        L_0x0053:
            throw r10     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            r0 = r1
        L_0x0055:
            r7.delete()
        L_0x0058:
            if (r0 != 0) goto L_0x005b
            return r1
        L_0x005b:
            int r7 = r6.f2313e
            int r9 = r6.f2310b
            boolean r6 = r6.f2311c
            boolean r0 = m1831f(r2, r0, r7, r9, r6)
            if (r0 != 0) goto L_0x0068
            return r1
        L_0x0068:
            int r5 = r5 + 1
            goto L_0x0015
        L_0x006b:
            r0 = move-exception
            r7.delete()
            throw r0
        L_0x0070:
            android.graphics.Typeface r0 = m1832g(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p016c0.C0563f.mo2706a(android.content.Context, b0.a$b, android.content.res.Resources, int):android.graphics.Typeface");
    }

    /* renamed from: b */
    public Typeface mo2707b(Context context, CancellationSignal cancellationSignal, C0948l[] lVarArr, int i) {
        Object obj;
        try {
            obj = f2372c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        C1558h hVar = new C1558h();
        for (C0948l lVar : lVarArr) {
            Uri uri = lVar.f3515a;
            ByteBuffer byteBuffer = (ByteBuffer) hVar.get(uri);
            if (byteBuffer == null) {
                byteBuffer = C0568k.m1862d(context, cancellationSignal, uri);
                hVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !m1831f(obj, byteBuffer, lVar.f3516b, lVar.f3517c, lVar.f3518d)) {
                return null;
            }
        }
        Typeface g = m1832g(obj);
        if (g == null) {
            return null;
        }
        return Typeface.create(g, i);
    }
}
