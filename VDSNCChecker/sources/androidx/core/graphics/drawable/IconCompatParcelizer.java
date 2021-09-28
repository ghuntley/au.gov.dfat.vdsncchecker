package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import com.dynamsoft.dce.HardwareUtil;
import java.nio.charset.Charset;
import java.util.Objects;
import p029e1.C0864a;

public class IconCompatParcelizer {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.core.graphics.drawable.IconCompat read(p029e1.C0864a r5) {
        /*
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>()
            int r1 = r0.f1311a
            r2 = 1
            int r1 = r5.mo4151k(r1, r2)
            r0.f1311a = r1
            byte[] r1 = r0.f1313c
            r2 = 2
            boolean r3 = r5.mo4149i(r2)
            if (r3 != 0) goto L_0x0018
            goto L_0x001c
        L_0x0018:
            byte[] r1 = r5.mo4147g()
        L_0x001c:
            r0.f1313c = r1
            android.os.Parcelable r1 = r0.f1314d
            r3 = 3
            android.os.Parcelable r1 = r5.mo4153m(r1, r3)
            r0.f1314d = r1
            int r1 = r0.f1315e
            r4 = 4
            int r1 = r5.mo4151k(r1, r4)
            r0.f1315e = r1
            int r1 = r0.f1316f
            r4 = 5
            int r1 = r5.mo4151k(r1, r4)
            r0.f1316f = r1
            android.content.res.ColorStateList r1 = r0.f1317g
            r4 = 6
            android.os.Parcelable r1 = r5.mo4153m(r1, r4)
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            r0.f1317g = r1
            java.lang.String r1 = r0.f1319i
            r4 = 7
            boolean r4 = r5.mo4149i(r4)
            if (r4 != 0) goto L_0x004e
            goto L_0x0052
        L_0x004e:
            java.lang.String r1 = r5.mo4154n()
        L_0x0052:
            r0.f1319i = r1
            java.lang.String r1 = r0.f1320j
            r4 = 8
            boolean r4 = r5.mo4149i(r4)
            if (r4 != 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            java.lang.String r1 = r5.mo4154n()
        L_0x0063:
            r0.f1320j = r1
            java.lang.String r5 = r0.f1319i
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.valueOf(r5)
            r0.f1318h = r5
            int r5 = r0.f1311a
            r1 = 0
            switch(r5) {
                case -1: goto L_0x00ad;
                case 0: goto L_0x0073;
                case 1: goto L_0x009c;
                case 2: goto L_0x0079;
                case 3: goto L_0x0074;
                case 4: goto L_0x0079;
                case 5: goto L_0x009c;
                case 6: goto L_0x0079;
                default: goto L_0x0073;
            }
        L_0x0073:
            goto L_0x00bc
        L_0x0074:
            byte[] r5 = r0.f1313c
            r0.f1312b = r5
            goto L_0x00bc
        L_0x0079:
            java.lang.String r5 = new java.lang.String
            byte[] r3 = r0.f1313c
            java.lang.String r4 = "UTF-16"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            r5.<init>(r3, r4)
            r0.f1312b = r5
            int r3 = r0.f1311a
            if (r3 != r2) goto L_0x00bc
            java.lang.String r2 = r0.f1320j
            if (r2 != 0) goto L_0x00bc
            r2 = -1
            java.lang.String r3 = ":"
            java.lang.String[] r5 = r5.split(r3, r2)
            r5 = r5[r1]
            r0.f1320j = r5
            goto L_0x00bc
        L_0x009c:
            android.os.Parcelable r5 = r0.f1314d
            if (r5 == 0) goto L_0x00a1
            goto L_0x00b1
        L_0x00a1:
            byte[] r5 = r0.f1313c
            r0.f1312b = r5
            r0.f1311a = r3
            r0.f1315e = r1
            int r5 = r5.length
            r0.f1316f = r5
            goto L_0x00bc
        L_0x00ad:
            android.os.Parcelable r5 = r0.f1314d
            if (r5 == 0) goto L_0x00b4
        L_0x00b1:
            r0.f1312b = r5
            goto L_0x00bc
        L_0x00b4:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid icon"
            r5.<init>(r0)
            throw r5
        L_0x00bc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompatParcelizer.read(e1.a):androidx.core.graphics.drawable.IconCompat");
    }

    public static void write(IconCompat iconCompat, C0864a aVar) {
        Objects.requireNonNull(aVar);
        iconCompat.f1319i = iconCompat.f1318h.name();
        switch (iconCompat.f1311a) {
            case HardwareUtil.DEVICEINFO_UNKNOWN /*-1*/:
            case 1:
            case 5:
                iconCompat.f1314d = (Parcelable) iconCompat.f1312b;
                break;
            case 2:
                iconCompat.f1313c = ((String) iconCompat.f1312b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1313c = (byte[]) iconCompat.f1312b;
                break;
            case 4:
            case 6:
                iconCompat.f1313c = iconCompat.f1312b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1311a;
        if (-1 != i) {
            aVar.mo4156p(1);
            aVar.mo4160t(i);
        }
        byte[] bArr = iconCompat.f1313c;
        if (bArr != null) {
            aVar.mo4156p(2);
            aVar.mo4158r(bArr);
        }
        Parcelable parcelable = iconCompat.f1314d;
        if (parcelable != null) {
            aVar.mo4156p(3);
            aVar.mo4161u(parcelable);
        }
        int i2 = iconCompat.f1315e;
        if (i2 != 0) {
            aVar.mo4156p(4);
            aVar.mo4160t(i2);
        }
        int i3 = iconCompat.f1316f;
        if (i3 != 0) {
            aVar.mo4156p(5);
            aVar.mo4160t(i3);
        }
        ColorStateList colorStateList = iconCompat.f1317g;
        if (colorStateList != null) {
            aVar.mo4156p(6);
            aVar.mo4161u(colorStateList);
        }
        String str = iconCompat.f1319i;
        if (str != null) {
            aVar.mo4156p(7);
            aVar.mo4162v(str);
        }
        String str2 = iconCompat.f1320j;
        if (str2 != null) {
            aVar.mo4156p(8);
            aVar.mo4162v(str2);
        }
    }
}
