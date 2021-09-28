package p001a0;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import java.io.File;

/* renamed from: a0.a */
public class C0002a {

    /* renamed from: a */
    public static final Object f0a = new Object();

    /* renamed from: a0.a$a */
    public static class C0003a {
        /* renamed from: a */
        public static void m2a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: b */
        public static void m3b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* renamed from: a0.a$b */
    public static class C0004b {
        /* renamed from: a */
        public static File m4a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        public static Drawable m5b(Context context, int i) {
            return context.getDrawable(i);
        }

        /* renamed from: c */
        public static File m6c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: a0.a$c */
    public static class C0005c {
        /* renamed from: a */
        public static int m7a(Context context, int i) {
            return context.getColor(i);
        }

        /* renamed from: b */
        public static ColorStateList m8b(Context context, int i) {
            return context.getColorStateList(i);
        }

        /* renamed from: c */
        public static <T> T m9c(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        /* renamed from: d */
        public static String m10d(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* renamed from: a */
    public static int m1a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }
}
