package p016c0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import p010b0.C0533b;
import p040g0.C0949m;
import p093p.C1551f;

@SuppressLint({"NewApi"})
/* renamed from: c0.d */
public class C0560d {

    /* renamed from: a */
    public static final C0567j f2363a;

    /* renamed from: b */
    public static final C1551f<String, Typeface> f2364b = new C1551f<>(16);

    /* renamed from: c0.d$a */
    public static class C0561a extends C0949m {

        /* renamed from: a */
        public C0533b.C0534a f2365a;

        public C0561a(C0533b.C0534a aVar) {
            this.f2365a = aVar;
        }
    }

    static {
        C0567j jVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            jVar = new C0566i();
        } else if (i >= 28) {
            jVar = new C0565h();
        } else if (i >= 26) {
            jVar = new C0564g();
        } else {
            jVar = C0563f.f2373d != null ? new C0563f() : new C0562e();
        }
        f2363a = jVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r0.equals(r4) == false) goto L_0x0028;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m1824a(android.content.Context r6, p010b0.C0528a.C0529a r7, android.content.res.Resources r8, int r9, int r10, p010b0.C0533b.C0534a r11, android.os.Handler r12, boolean r13) {
        /*
            boolean r0 = r7 instanceof p010b0.C0528a.C0532d
            r1 = -3
            if (r0 == 0) goto L_0x0146
            b0.a$d r7 = (p010b0.C0528a.C0532d) r7
            java.lang.String r0 = r7.f2318d
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0027
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0014
            goto L_0x0027
        L_0x0014:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r3)
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r3)
            if (r0 == 0) goto L_0x0027
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = r2
        L_0x0028:
            if (r0 == 0) goto L_0x0030
            if (r11 == 0) goto L_0x002f
            r11.mo2677b(r0, r12)
        L_0x002f:
            return r0
        L_0x0030:
            r0 = 1
            if (r13 == 0) goto L_0x0038
            int r4 = r7.f2317c
            if (r4 != 0) goto L_0x003b
            goto L_0x003a
        L_0x0038:
            if (r11 != 0) goto L_0x003b
        L_0x003a:
            r3 = r0
        L_0x003b:
            r0 = -1
            if (r13 == 0) goto L_0x0041
            int r13 = r7.f2316b
            goto L_0x0042
        L_0x0041:
            r13 = r0
        L_0x0042:
            android.os.Handler r12 = p010b0.C0533b.C0534a.m1780c(r12)
            c0.d$a r4 = new c0.d$a
            r4.<init>(r11)
            g0.e r7 = r7.f2315a
            g0.c r11 = new g0.c
            r11.<init>(r4, r12)
            if (r3 == 0) goto L_0x00c8
            p.f<java.lang.String, android.graphics.Typeface> r3 = p040g0.C0945j.f3507a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = r7.f3496e
            r3.append(r5)
            java.lang.String r5 = "-"
            r3.append(r5)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            p.f<java.lang.String, android.graphics.Typeface> r5 = p040g0.C0945j.f3507a
            java.lang.Object r5 = r5.mo5541a(r3)
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5
            if (r5 == 0) goto L_0x0081
            g0.a r6 = new g0.a
            r6.<init>(r11, r4, r5)
            r12.post(r6)
            r2 = r5
            goto L_0x0159
        L_0x0081:
            if (r13 != r0) goto L_0x008e
            g0.j$a r6 = p040g0.C0945j.m2718a(r3, r6, r7, r10)
            r11.mo4251a(r6)
            android.graphics.Typeface r2 = r6.f3511a
            goto L_0x0159
        L_0x008e:
            g0.f r12 = new g0.f
            r12.<init>(r3, r6, r7, r10)
            java.util.concurrent.ExecutorService r6 = p040g0.C0945j.f3508b     // Catch:{ InterruptedException -> 0x00ba }
            java.util.concurrent.Future r6 = r6.submit(r12)     // Catch:{ InterruptedException -> 0x00ba }
            long r12 = (long) r13
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x00b3, InterruptedException -> 0x00b1, TimeoutException -> 0x00a9 }
            java.lang.Object r6 = r6.get(r12, r7)     // Catch:{ ExecutionException -> 0x00b3, InterruptedException -> 0x00b1, TimeoutException -> 0x00a9 }
            g0.j$a r6 = (p040g0.C0945j.C0946a) r6     // Catch:{ InterruptedException -> 0x00ba }
            r11.mo4251a(r6)     // Catch:{ InterruptedException -> 0x00ba }
            android.graphics.Typeface r2 = r6.f3511a     // Catch:{ InterruptedException -> 0x00ba }
            goto L_0x0159
        L_0x00a9:
            java.lang.InterruptedException r6 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x00ba }
            java.lang.String r7 = "timeout"
            r6.<init>(r7)     // Catch:{ InterruptedException -> 0x00ba }
            throw r6     // Catch:{ InterruptedException -> 0x00ba }
        L_0x00b1:
            r6 = move-exception
            throw r6     // Catch:{ InterruptedException -> 0x00ba }
        L_0x00b3:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x00ba }
            r7.<init>(r6)     // Catch:{ InterruptedException -> 0x00ba }
            throw r7     // Catch:{ InterruptedException -> 0x00ba }
        L_0x00ba:
            g0.m r6 = r11.f3489a
            android.os.Handler r7 = r11.f3490b
            g0.b r12 = new g0.b
            r12.<init>(r11, r6, r1)
            r7.post(r12)
            goto L_0x0159
        L_0x00c8:
            p.f<java.lang.String, android.graphics.Typeface> r13 = p040g0.C0945j.f3507a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = r7.f3496e
            r13.append(r0)
            java.lang.String r0 = "-"
            r13.append(r0)
            r13.append(r10)
            java.lang.String r13 = r13.toString()
            p.f<java.lang.String, android.graphics.Typeface> r0 = p040g0.C0945j.f3507a
            java.lang.Object r0 = r0.mo5541a(r13)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x00f4
            g0.a r6 = new g0.a
            r6.<init>(r11, r4, r0)
            r12.post(r6)
            r2 = r0
            goto L_0x0159
        L_0x00f4:
            g0.g r12 = new g0.g
            r12.<init>(r11)
            java.lang.Object r0 = p040g0.C0945j.f3509c
            monitor-enter(r0)
            p.h<java.lang.String, java.util.ArrayList<i0.a<g0.j$a>>> r11 = p040g0.C0945j.f3510d     // Catch:{ all -> 0x0143 }
            java.lang.Object r1 = r11.getOrDefault(r13, r2)     // Catch:{ all -> 0x0143 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0143 }
            if (r1 == 0) goto L_0x010b
            r1.add(r12)     // Catch:{ all -> 0x0143 }
            monitor-exit(r0)     // Catch:{ all -> 0x0143 }
            goto L_0x0159
        L_0x010b:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0143 }
            r1.<init>()     // Catch:{ all -> 0x0143 }
            r1.add(r12)     // Catch:{ all -> 0x0143 }
            r11.put(r13, r1)     // Catch:{ all -> 0x0143 }
            monitor-exit(r0)     // Catch:{ all -> 0x0143 }
            g0.h r11 = new g0.h
            r11.<init>(r13, r6, r7, r10)
            java.util.concurrent.ExecutorService r6 = p040g0.C0945j.f3508b
            g0.i r7 = new g0.i
            r7.<init>(r13)
            android.os.Looper r12 = android.os.Looper.myLooper()
            if (r12 != 0) goto L_0x0133
            android.os.Handler r12 = new android.os.Handler
            android.os.Looper r13 = android.os.Looper.getMainLooper()
            r12.<init>(r13)
            goto L_0x0138
        L_0x0133:
            android.os.Handler r12 = new android.os.Handler
            r12.<init>()
        L_0x0138:
            g0.o r13 = new g0.o
            r13.<init>(r12, r11, r7)
            java.util.concurrent.ThreadPoolExecutor r6 = (java.util.concurrent.ThreadPoolExecutor) r6
            r6.execute(r13)
            goto L_0x0159
        L_0x0143:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0143 }
            throw r6
        L_0x0146:
            c0.j r13 = f2363a
            b0.a$b r7 = (p010b0.C0528a.C0530b) r7
            android.graphics.Typeface r2 = r13.mo2706a(r6, r7, r8, r10)
            if (r11 == 0) goto L_0x0159
            if (r2 == 0) goto L_0x0156
            r11.mo2677b(r2, r12)
            goto L_0x0159
        L_0x0156:
            r11.mo2676a(r1, r12)
        L_0x0159:
            if (r2 == 0) goto L_0x0164
            p.f<java.lang.String, android.graphics.Typeface> r6 = f2364b
            java.lang.String r7 = m1826c(r8, r9, r10)
            r6.mo5542b(r7, r2)
        L_0x0164:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p016c0.C0560d.m1824a(android.content.Context, b0.a$a, android.content.res.Resources, int, int, b0.b$a, android.os.Handler, boolean):android.graphics.Typeface");
    }

    /* renamed from: b */
    public static Typeface m1825b(Context context, Resources resources, int i, String str, int i2) {
        Typeface d = f2363a.mo2708d(context, resources, i, str, i2);
        if (d != null) {
            f2364b.mo5542b(m1826c(resources, i, i2), d);
        }
        return d;
    }

    /* renamed from: c */
    public static String m1826c(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
