package androidx.lifecycle;

import androidx.lifecycle.C0342c;
import p118t0.C1768c;
import p118t0.C1773g;

public class FullLifecycleObserverAdapter implements C0346d {

    /* renamed from: e */
    public final C1768c f1646e;

    /* renamed from: f */
    public final C0346d f1647f;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    public static /* synthetic */ class C0332a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1648a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.lifecycle.c$b[] r0 = androidx.lifecycle.C0342c.C0344b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1648a = r0
                androidx.lifecycle.c$b r1 = androidx.lifecycle.C0342c.C0344b.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1648a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.c$b r1 = androidx.lifecycle.C0342c.C0344b.ON_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1648a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.c$b r1 = androidx.lifecycle.C0342c.C0344b.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1648a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.c$b r1 = androidx.lifecycle.C0342c.C0344b.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f1648a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.c$b r1 = androidx.lifecycle.C0342c.C0344b.ON_STOP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f1648a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.lifecycle.c$b r1 = androidx.lifecycle.C0342c.C0344b.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f1648a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.lifecycle.c$b r1 = androidx.lifecycle.C0342c.C0344b.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FullLifecycleObserverAdapter.C0332a.<clinit>():void");
        }
    }

    public FullLifecycleObserverAdapter(C1768c cVar, C0346d dVar) {
        this.f1646e = cVar;
        this.f1647f = dVar;
    }

    /* renamed from: g */
    public void mo134g(C1773g gVar, C0342c.C0344b bVar) {
        switch (C0332a.f1648a[bVar.ordinal()]) {
            case 1:
                this.f1646e.mo6057c(gVar);
                break;
            case 2:
                this.f1646e.mo6058d(gVar);
                break;
            case 3:
                this.f1646e.mo6059e(gVar);
                break;
            case 4:
                this.f1646e.mo6056b(gVar);
                break;
            case 5:
                this.f1646e.mo6060f(gVar);
                break;
            case 6:
                this.f1646e.mo6055a(gVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        C0346d dVar = this.f1647f;
        if (dVar != null) {
            dVar.mo134g(gVar, bVar);
        }
    }
}
