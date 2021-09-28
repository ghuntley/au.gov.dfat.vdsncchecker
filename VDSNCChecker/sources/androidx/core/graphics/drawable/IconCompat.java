package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    public static final PorterDuff.Mode f1310k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f1311a = -1;

    /* renamed from: b */
    public Object f1312b;

    /* renamed from: c */
    public byte[] f1313c = null;

    /* renamed from: d */
    public Parcelable f1314d = null;

    /* renamed from: e */
    public int f1315e = 0;

    /* renamed from: f */
    public int f1316f = 0;

    /* renamed from: g */
    public ColorStateList f1317g = null;

    /* renamed from: h */
    public PorterDuff.Mode f1318h = f1310k;

    /* renamed from: i */
    public String f1319i = null;

    /* renamed from: j */
    public String f1320j;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r7 = this;
            int r0 = r7.f1311a
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r7.f1312b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Icon(typ="
            r0.<init>(r2)
            int r2 = r7.f1311a
            switch(r2) {
                case 1: goto L_0x002a;
                case 2: goto L_0x0027;
                case 3: goto L_0x0024;
                case 4: goto L_0x0021;
                case 5: goto L_0x001e;
                case 6: goto L_0x001b;
                default: goto L_0x0018;
            }
        L_0x0018:
            java.lang.String r2 = "UNKNOWN"
            goto L_0x002c
        L_0x001b:
            java.lang.String r2 = "URI_MASKABLE"
            goto L_0x002c
        L_0x001e:
            java.lang.String r2 = "BITMAP_MASKABLE"
            goto L_0x002c
        L_0x0021:
            java.lang.String r2 = "URI"
            goto L_0x002c
        L_0x0024:
            java.lang.String r2 = "DATA"
            goto L_0x002c
        L_0x0027:
            java.lang.String r2 = "RESOURCE"
            goto L_0x002c
        L_0x002a:
            java.lang.String r2 = "BITMAP"
        L_0x002c:
            r0.append(r2)
            int r2 = r7.f1311a
            switch(r2) {
                case 1: goto L_0x00c6;
                case 2: goto L_0x0059;
                case 3: goto L_0x0042;
                case 4: goto L_0x0036;
                case 5: goto L_0x00c6;
                case 6: goto L_0x0036;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x00e6
        L_0x0036:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r7.f1312b
            r0.append(r1)
            goto L_0x00e6
        L_0x0042:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r7.f1315e
            r0.append(r1)
            int r1 = r7.f1316f
            if (r1 == 0) goto L_0x00e6
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r7.f1316f
            goto L_0x00e3
        L_0x0059:
            java.lang.String r2 = " pkg="
            r0.append(r2)
            java.lang.String r2 = r7.f1320j
            r0.append(r2)
            java.lang.String r2 = " id="
            r0.append(r2)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r7.f1311a
            r4 = 0
            if (r3 != r1) goto L_0x009a
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.Object r3 = r7.f1312b
            android.graphics.drawable.Icon r3 = (android.graphics.drawable.Icon) r3
            r5 = 28
            if (r1 < r5) goto L_0x007f
            int r1 = r3.getResId()
            goto L_0x009f
        L_0x007f:
            java.lang.Class r1 = r3.getClass()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0098 }
            java.lang.String r5 = "getResId"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0098 }
            java.lang.reflect.Method r1 = r1.getMethod(r5, r6)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0098 }
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0098 }
            java.lang.Object r1 = r1.invoke(r3, r5)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0098 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0098 }
            int r1 = r1.intValue()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0098 }
            goto L_0x009f
        L_0x0098:
            r1 = r4
            goto L_0x009f
        L_0x009a:
            r1 = 2
            if (r3 != r1) goto L_0x00af
            int r1 = r7.f1315e
        L_0x009f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r4] = r1
            java.lang.String r1 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.append(r1)
            goto L_0x00e6
        L_0x00af:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "called getResId() on "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00c6:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r7.f1312b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r7.f1312b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L_0x00e3:
            r0.append(r1)
        L_0x00e6:
            android.content.res.ColorStateList r1 = r7.f1317g
            if (r1 == 0) goto L_0x00f4
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r7.f1317g
            r0.append(r1)
        L_0x00f4:
            android.graphics.PorterDuff$Mode r1 = r7.f1318h
            android.graphics.PorterDuff$Mode r2 = f1310k
            if (r1 == r2) goto L_0x0104
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r7.f1318h
            r0.append(r1)
        L_0x0104:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
