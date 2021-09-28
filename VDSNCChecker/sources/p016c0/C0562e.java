package p016c0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p010b0.C0528a;

/* renamed from: c0.e */
public class C0562e extends C0567j {

    /* renamed from: b */
    public static Class<?> f2366b = null;

    /* renamed from: c */
    public static Constructor<?> f2367c = null;

    /* renamed from: d */
    public static Method f2368d = null;

    /* renamed from: e */
    public static Method f2369e = null;

    /* renamed from: f */
    public static boolean f2370f = false;

    /* renamed from: f */
    public static boolean m1827f(Object obj, String str, int i, boolean z) {
        m1828g();
        try {
            return ((Boolean) f2368d.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    public static void m1828g() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f2370f) {
            f2370f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                method2 = null;
                cls = null;
                method = null;
            }
            f2367c = constructor;
            f2366b = cls;
            f2368d = method;
            f2369e = method2;
        }
    }

    /* renamed from: a */
    public Typeface mo2706a(Context context, C0528a.C0530b bVar, Resources resources, int i) {
        m1828g();
        try {
            Object newInstance = f2367c.newInstance(new Object[0]);
            C0528a.C0531c[] cVarArr = bVar.f2308a;
            int length = cVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                C0528a.C0531c cVar = cVarArr[i2];
                File c = C0568k.m1861c(context);
                if (c == null) {
                    return null;
                }
                try {
                    if (!C0568k.m1859a(c, resources, cVar.f2314f)) {
                        c.delete();
                        return null;
                    } else if (!m1827f(newInstance, c.getPath(), cVar.f2310b, cVar.f2311c)) {
                        return null;
                    } else {
                        i2++;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    c.delete();
                }
            }
            m1828g();
            try {
                Object newInstance2 = Array.newInstance(f2366b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f2369e.invoke((Object) null, new Object[]{newInstance2});
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e A[SYNTHETIC, Splitter:B:18:0x004e] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo2707b(android.content.Context r4, android.os.CancellationSignal r5, p040g0.C0948l[] r6, int r7) {
        /*
            r3 = this;
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L_0x0006
            return r1
        L_0x0006:
            g0.l r6 = r3.mo2718e(r6, r7)
            android.content.ContentResolver r7 = r4.getContentResolver()
            android.net.Uri r6 = r6.f3515a     // Catch:{ IOException -> 0x0084 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r7.openFileDescriptor(r6, r0, r5)     // Catch:{ IOException -> 0x0084 }
            if (r5 != 0) goto L_0x001e
            if (r5 == 0) goto L_0x001d
            r5.close()     // Catch:{ IOException -> 0x0084 }
        L_0x001d:
            return r1
        L_0x001e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ErrnoException -> 0x004b }
            r6.<init>()     // Catch:{ ErrnoException -> 0x004b }
            java.lang.String r7 = "/proc/self/fd/"
            r6.append(r7)     // Catch:{ ErrnoException -> 0x004b }
            int r7 = r5.getFd()     // Catch:{ ErrnoException -> 0x004b }
            r6.append(r7)     // Catch:{ ErrnoException -> 0x004b }
            java.lang.String r6 = r6.toString()     // Catch:{ ErrnoException -> 0x004b }
            java.lang.String r6 = android.system.Os.readlink(r6)     // Catch:{ ErrnoException -> 0x004b }
            android.system.StructStat r7 = android.system.Os.stat(r6)     // Catch:{ ErrnoException -> 0x004b }
            int r7 = r7.st_mode     // Catch:{ ErrnoException -> 0x004b }
            boolean r7 = android.system.OsConstants.S_ISREG(r7)     // Catch:{ ErrnoException -> 0x004b }
            if (r7 == 0) goto L_0x004b
            java.io.File r7 = new java.io.File     // Catch:{ ErrnoException -> 0x004b }
            r7.<init>(r6)     // Catch:{ ErrnoException -> 0x004b }
            goto L_0x004c
        L_0x0049:
            r4 = move-exception
            goto L_0x007b
        L_0x004b:
            r7 = r1
        L_0x004c:
            if (r7 == 0) goto L_0x005d
            boolean r6 = r7.canRead()     // Catch:{ all -> 0x0049 }
            if (r6 != 0) goto L_0x0055
            goto L_0x005d
        L_0x0055:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r7)     // Catch:{ all -> 0x0049 }
            r5.close()     // Catch:{ IOException -> 0x0084 }
            return r4
        L_0x005d:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x0049 }
            java.io.FileDescriptor r7 = r5.getFileDescriptor()     // Catch:{ all -> 0x0049 }
            r6.<init>(r7)     // Catch:{ all -> 0x0049 }
            android.graphics.Typeface r4 = r3.mo2717c(r4, r6)     // Catch:{ all -> 0x0071 }
            r6.close()     // Catch:{ all -> 0x0049 }
            r5.close()     // Catch:{ IOException -> 0x0084 }
            return r4
        L_0x0071:
            r4 = move-exception
            r6.close()     // Catch:{ all -> 0x0076 }
            goto L_0x007a
        L_0x0076:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch:{ all -> 0x0049 }
        L_0x007a:
            throw r4     // Catch:{ all -> 0x0049 }
        L_0x007b:
            r5.close()     // Catch:{ all -> 0x007f }
            goto L_0x0083
        L_0x007f:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch:{ IOException -> 0x0084 }
        L_0x0083:
            throw r4     // Catch:{ IOException -> 0x0084 }
        L_0x0084:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p016c0.C0562e.mo2707b(android.content.Context, android.os.CancellationSignal, g0.l[], int):android.graphics.Typeface");
    }
}
