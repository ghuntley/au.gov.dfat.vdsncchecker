package p071l1;

import android.util.Log;
import java.util.Arrays;
import p025d3.C0802f;
import p072l2.C1241e;

/* renamed from: l1.b */
public final class C1235b {

    /* renamed from: a */
    public static final C1236a f4159a = new C1236a((C0802f) null);

    /* renamed from: l1.b$a */
    public static final class C1236a {
        public C1236a(C0802f fVar) {
        }

        /* renamed from: a */
        public static int m3508a(C1236a aVar, String str, String str2, Object[] objArr, Throwable th, int i) {
            if (objArr.length == 1 && (objArr instanceof Throwable)) {
                return Log.d(str, str2, (Throwable) objArr);
            }
            String format = String.format(str2, Arrays.copyOf(new Object[]{objArr}, 1));
            C1241e.m3516f(format, "java.lang.String.format(format, *args)");
            return Log.d(str, format);
        }
    }
}
