package p136w0;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C0342c;
import androidx.lifecycle.C0347e;
import androidx.navigation.C0364b;
import androidx.savedstate.C0483a;
import java.util.UUID;
import p002a1.C0006a;
import p002a1.C0007b;
import p118t0.C1773g;
import p118t0.C1784r;
import p118t0.C1785s;

/* renamed from: w0.g */
public final class C2004g implements C1773g, C1785s, C0007b {

    /* renamed from: e */
    public final C0364b f5821e;

    /* renamed from: f */
    public Bundle f5822f;

    /* renamed from: g */
    public final C0347e f5823g;

    /* renamed from: h */
    public final C0006a f5824h;

    /* renamed from: i */
    public final UUID f5825i;

    /* renamed from: j */
    public C0342c.C0345c f5826j;

    /* renamed from: k */
    public C0342c.C0345c f5827k;

    /* renamed from: l */
    public C2008i f5828l;

    /* renamed from: w0.g$a */
    public static /* synthetic */ class C2005a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5829a;

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
                f5829a = r0
                androidx.lifecycle.c$b r1 = androidx.lifecycle.C0342c.C0344b.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5829a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.c$b r1 = androidx.lifecycle.C0342c.C0344b.ON_STOP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5829a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.c$b r1 = androidx.lifecycle.C0342c.C0344b.ON_START     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5829a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.c$b r1 = androidx.lifecycle.C0342c.C0344b.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5829a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.c$b r1 = androidx.lifecycle.C0342c.C0344b.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f5829a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.lifecycle.c$b r1 = androidx.lifecycle.C0342c.C0344b.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f5829a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.lifecycle.c$b r1 = androidx.lifecycle.C0342c.C0344b.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p136w0.C2004g.C2005a.<clinit>():void");
        }
    }

    public C2004g(Context context, C0364b bVar, Bundle bundle, C1773g gVar, C2008i iVar) {
        this(context, bVar, bundle, gVar, iVar, UUID.randomUUID(), (Bundle) null);
    }

    public C2004g(Context context, C0364b bVar, Bundle bundle, C1773g gVar, C2008i iVar, UUID uuid, Bundle bundle2) {
        this.f5823g = new C0347e(this);
        C0006a aVar = new C0006a(this);
        this.f5824h = aVar;
        this.f5826j = C0342c.C0345c.CREATED;
        this.f5827k = C0342c.C0345c.RESUMED;
        this.f5825i = uuid;
        this.f5821e = bVar;
        this.f5822f = bundle;
        this.f5828l = iVar;
        aVar.mo1a(bundle2);
        if (gVar != null) {
            this.f5826j = ((C0347e) gVar.mo113c()).f1689b;
        }
    }

    /* renamed from: a */
    public void mo6494a() {
        C0342c.C0345c cVar;
        C0347e eVar;
        if (this.f5826j.ordinal() < this.f5827k.ordinal()) {
            eVar = this.f5823g;
            cVar = this.f5826j;
        } else {
            eVar = this.f5823g;
            cVar = this.f5827k;
        }
        eVar.mo1810i(cVar);
    }

    /* renamed from: c */
    public C0342c mo113c() {
        return this.f5823g;
    }

    /* renamed from: e */
    public C0483a mo3e() {
        return this.f5824h.f2b;
    }

    /* renamed from: j */
    public C1784r mo116j() {
        C2008i iVar = this.f5828l;
        if (iVar != null) {
            UUID uuid = this.f5825i;
            C1784r rVar = iVar.f5835c.get(uuid);
            if (rVar != null) {
                return rVar;
            }
            C1784r rVar2 = new C1784r();
            iVar.f5835c.put(uuid, rVar2);
            return rVar2;
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }
}
