package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import p118t0.C1772f;

/* renamed from: androidx.lifecycle.c */
public abstract class C0342c {

    /* renamed from: androidx.lifecycle.c$a */
    public static /* synthetic */ class C0343a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1680a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f1681b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x006c */
        static {
            /*
                androidx.lifecycle.c$b[] r0 = androidx.lifecycle.C0342c.C0344b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1681b = r0
                r1 = 1
                androidx.lifecycle.c$b r2 = androidx.lifecycle.C0342c.C0344b.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f1681b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.c$b r3 = androidx.lifecycle.C0342c.C0344b.ON_STOP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f1681b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.c$b r4 = androidx.lifecycle.C0342c.C0344b.ON_START     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f1681b     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.c$b r5 = androidx.lifecycle.C0342c.C0344b.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f1681b     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.c$b r6 = androidx.lifecycle.C0342c.C0344b.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r5 = f1681b     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.lifecycle.c$b r6 = androidx.lifecycle.C0342c.C0344b.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r7 = 6
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r5 = f1681b     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.lifecycle.c$b r6 = androidx.lifecycle.C0342c.C0344b.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7 = 7
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                androidx.lifecycle.c$c[] r5 = androidx.lifecycle.C0342c.C0345c.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f1680a = r5
                r5[r0] = r1     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                int[] r5 = f1680a     // Catch:{ NoSuchFieldError -> 0x0063 }
                r5[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = f1680a     // Catch:{ NoSuchFieldError -> 0x0067 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                int[] r0 = f1680a     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 0
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f1680a     // Catch:{ NoSuchFieldError -> 0x0070 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0070 }
            L_0x0070:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0342c.C0343a.<clinit>():void");
        }
    }

    /* renamed from: androidx.lifecycle.c$b */
    public enum C0344b {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        /* renamed from: b */
        public static C0344b m1011b(C0345c cVar) {
            int ordinal = cVar.ordinal();
            if (ordinal == 1) {
                return ON_CREATE;
            }
            if (ordinal == 2) {
                return ON_START;
            }
            if (ordinal != 3) {
                return null;
            }
            return ON_RESUME;
        }

        /* renamed from: a */
        public C0345c mo1804a() {
            switch (C0343a.f1681b[ordinal()]) {
                case 1:
                case 2:
                    return C0345c.CREATED;
                case 3:
                case 4:
                    return C0345c.STARTED;
                case 5:
                    return C0345c.RESUMED;
                case 6:
                    return C0345c.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* renamed from: androidx.lifecycle.c$c */
    public enum C0345c {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED
    }

    public C0342c() {
        new AtomicReference();
    }

    /* renamed from: a */
    public abstract void mo1802a(C1772f fVar);

    /* renamed from: b */
    public abstract void mo1803b(C1772f fVar);
}
