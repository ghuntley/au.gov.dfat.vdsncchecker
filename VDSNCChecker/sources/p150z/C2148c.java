package p150z;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: z.c */
public final class C2148c {

    /* renamed from: a */
    public static final Class<?> f6197a;

    /* renamed from: b */
    public static final Field f6198b;

    /* renamed from: c */
    public static final Field f6199c;

    /* renamed from: d */
    public static final Method f6200d;

    /* renamed from: e */
    public static final Method f6201e;

    /* renamed from: f */
    public static final Method f6202f;

    /* renamed from: g */
    public static final Handler f6203g = new Handler(Looper.getMainLooper());

    /* renamed from: z.c$a */
    public class C2149a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C2151c f6204e;

        /* renamed from: f */
        public final /* synthetic */ Object f6205f;

        public C2149a(C2151c cVar, Object obj) {
            this.f6204e = cVar;
            this.f6205f = obj;
        }

        public void run() {
            this.f6204e.f6208a = this.f6205f;
        }
    }

    /* renamed from: z.c$b */
    public class C2150b implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ Application f6206e;

        /* renamed from: f */
        public final /* synthetic */ C2151c f6207f;

        public C2150b(Application application, C2151c cVar) {
            this.f6206e = application;
            this.f6207f = cVar;
        }

        public void run() {
            this.f6206e.unregisterActivityLifecycleCallbacks(this.f6207f);
        }
    }

    /* renamed from: z.c$c */
    public static final class C2151c implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        public Object f6208a;

        /* renamed from: b */
        public Activity f6209b;

        /* renamed from: c */
        public final int f6210c;

        /* renamed from: d */
        public boolean f6211d = false;

        /* renamed from: e */
        public boolean f6212e = false;

        /* renamed from: f */
        public boolean f6213f = false;

        public C2151c(Activity activity) {
            this.f6209b = activity;
            this.f6210c = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f6209b == activity) {
                this.f6209b = null;
                this.f6212e = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f6212e && !this.f6213f && !this.f6211d) {
                Object obj = this.f6208a;
                int i = this.f6210c;
                boolean z = false;
                try {
                    Object obj2 = C2148c.f6199c.get(activity);
                    if (obj2 == obj) {
                        if (activity.hashCode() == i) {
                            C2148c.f6203g.postAtFrontOfQueue(new C2152d(C2148c.f6198b.get(activity), obj2));
                            z = true;
                        }
                    }
                } catch (Throwable unused) {
                }
                if (z) {
                    this.f6213f = true;
                    this.f6208a = null;
                }
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f6209b == activity) {
                this.f6211d = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b A[SYNTHETIC, Splitter:B:25:0x005b] */
    static {
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            f6203g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r2 = r1
        L_0x0016:
            f6197a = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch:{ all -> 0x0023 }
            r3.setAccessible(r2)     // Catch:{ all -> 0x0023 }
            goto L_0x0024
        L_0x0023:
            r3 = r1
        L_0x0024:
            f6198b = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch:{ all -> 0x0030 }
            r0.setAccessible(r2)     // Catch:{ all -> 0x0030 }
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            f6199c = r0
            java.lang.Class<?> r0 = f6197a
            r3 = 3
            java.lang.String r4 = "performStopActivity"
            r5 = 2
            r6 = 0
            if (r0 != 0) goto L_0x003e
        L_0x003c:
            r0 = r1
            goto L_0x0053
        L_0x003e:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ all -> 0x003c }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x003c }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x003c }
            r7[r2] = r8     // Catch:{ all -> 0x003c }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch:{ all -> 0x003c }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x003c }
            r0.setAccessible(r2)     // Catch:{ all -> 0x003c }
        L_0x0053:
            f6200d = r0
            java.lang.Class<?> r0 = f6197a
            if (r0 != 0) goto L_0x005b
        L_0x0059:
            r0 = r1
            goto L_0x006c
        L_0x005b:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ all -> 0x0059 }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x0059 }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0059 }
            r7[r2] = r8     // Catch:{ all -> 0x0059 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x0059 }
            r0.setAccessible(r2)     // Catch:{ all -> 0x0059 }
        L_0x006c:
            f6201e = r0
            java.lang.Class<?> r0 = f6197a
            boolean r4 = m5563a()
            if (r4 == 0) goto L_0x00ad
            if (r0 != 0) goto L_0x0079
            goto L_0x00ad
        L_0x0079:
            java.lang.String r4 = "requestRelaunchActivity"
            r7 = 9
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ all -> 0x00ad }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x00ad }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r2] = r6     // Catch:{ all -> 0x00ad }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r5] = r6     // Catch:{ all -> 0x00ad }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00ad }
            r7[r3] = r5     // Catch:{ all -> 0x00ad }
            r3 = 4
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00ad }
            r7[r3] = r5     // Catch:{ all -> 0x00ad }
            r3 = 5
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch:{ all -> 0x00ad }
            r3 = 6
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch:{ all -> 0x00ad }
            r3 = 7
            r7[r3] = r5     // Catch:{ all -> 0x00ad }
            r3 = 8
            r7[r3] = r5     // Catch:{ all -> 0x00ad }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x00ad }
            r0.setAccessible(r2)     // Catch:{ all -> 0x00ad }
            r1 = r0
        L_0x00ad:
            f6202f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p150z.C2148c.<clinit>():void");
    }

    /* renamed from: a */
    public static boolean m5563a() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: b */
    public static boolean m5564b(Activity activity) {
        Object obj;
        Application application;
        C2151c cVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m5563a() && f6202f == null) {
            return false;
        } else {
            if (f6201e == null && f6200d == null) {
                return false;
            }
            try {
                Object obj2 = f6199c.get(activity);
                if (obj2 == null || (obj = f6198b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                cVar = new C2151c(activity);
                application.registerActivityLifecycleCallbacks(cVar);
                Handler handler = f6203g;
                handler.post(new C2149a(cVar, obj2));
                if (m5563a()) {
                    Method method = f6202f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new C2150b(application, cVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
