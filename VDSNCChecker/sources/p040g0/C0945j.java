package p040g0;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p052i0.C1022a;
import p093p.C1551f;
import p093p.C1558h;

/* renamed from: g0.j */
public class C0945j {

    /* renamed from: a */
    public static final C1551f<String, Typeface> f3507a = new C1551f<>(16);

    /* renamed from: b */
    public static final ExecutorService f3508b;

    /* renamed from: c */
    public static final Object f3509c = new Object();

    /* renamed from: d */
    public static final C1558h<String, ArrayList<C1022a<C0946a>>> f3510d = new C1558h<>();

    /* renamed from: g0.j$a */
    public static final class C0946a {

        /* renamed from: a */
        public final Typeface f3511a;

        /* renamed from: b */
        public final int f3512b;

        public C0946a(int i) {
            this.f3511a = null;
            this.f3512b = i;
        }

        @SuppressLint({"WrongConstant"})
        public C0946a(Typeface typeface) {
            this.f3511a = typeface;
            this.f3512b = 0;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new C0950n("fonts-androidx", 10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f3508b = threadPoolExecutor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0046  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040g0.C0945j.C0946a m2718a(java.lang.String r7, android.content.Context r8, p040g0.C0940e r9, int r10) {
        /*
            p.f<java.lang.String, android.graphics.Typeface> r0 = f3507a
            java.lang.Object r0 = r0.mo5541a(r7)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x0010
            g0.j$a r7 = new g0.j$a
            r7.<init>((android.graphics.Typeface) r0)
            return r7
        L_0x0010:
            r0 = 0
            g0.k r9 = p040g0.C0938d.m2714a(r8, r9, r0)     // Catch:{ NameNotFoundException -> 0x0061 }
            int r1 = r9.f3513a
            r2 = -3
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x001e
            goto L_0x0035
        L_0x001e:
            r1 = -2
            goto L_0x003e
        L_0x0020:
            g0.l[] r1 = r9.f3514b
            if (r1 == 0) goto L_0x003d
            int r4 = r1.length
            if (r4 != 0) goto L_0x0028
            goto L_0x003d
        L_0x0028:
            int r3 = r1.length
            r4 = 0
            r5 = r4
        L_0x002b:
            if (r5 >= r3) goto L_0x003c
            r6 = r1[r5]
            int r6 = r6.f3519e
            if (r6 == 0) goto L_0x0039
            if (r6 >= 0) goto L_0x0037
        L_0x0035:
            r1 = r2
            goto L_0x003e
        L_0x0037:
            r1 = r6
            goto L_0x003e
        L_0x0039:
            int r5 = r5 + 1
            goto L_0x002b
        L_0x003c:
            r3 = r4
        L_0x003d:
            r1 = r3
        L_0x003e:
            if (r1 == 0) goto L_0x0046
            g0.j$a r7 = new g0.j$a
            r7.<init>((int) r1)
            return r7
        L_0x0046:
            g0.l[] r9 = r9.f3514b
            c0.j r1 = p016c0.C0560d.f2363a
            android.graphics.Typeface r8 = r1.mo2707b(r8, r0, r9, r10)
            if (r8 == 0) goto L_0x005b
            p.f<java.lang.String, android.graphics.Typeface> r9 = f3507a
            r9.mo5542b(r7, r8)
            g0.j$a r7 = new g0.j$a
            r7.<init>((android.graphics.Typeface) r8)
            return r7
        L_0x005b:
            g0.j$a r7 = new g0.j$a
            r7.<init>((int) r2)
            return r7
        L_0x0061:
            g0.j$a r7 = new g0.j$a
            r8 = -1
            r7.<init>((int) r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040g0.C0945j.m2718a(java.lang.String, android.content.Context, g0.e, int):g0.j$a");
    }
}
