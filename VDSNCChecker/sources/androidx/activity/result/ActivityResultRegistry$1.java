package androidx.activity.result;

import androidx.activity.result.C0051a;
import androidx.lifecycle.C0342c;
import androidx.lifecycle.C0346d;
import p027e.C0852a;
import p027e.C0854b;
import p033f.C0881a;
import p118t0.C1773g;

public class ActivityResultRegistry$1 implements C0346d {

    /* renamed from: e */
    public final /* synthetic */ String f174e;

    /* renamed from: f */
    public final /* synthetic */ C0854b f175f;

    /* renamed from: g */
    public final /* synthetic */ C0881a f176g;

    /* renamed from: h */
    public final /* synthetic */ C0051a f177h;

    public ActivityResultRegistry$1(C0051a aVar, String str, C0854b bVar, C0881a aVar2) {
        this.f177h = aVar;
        this.f174e = str;
        this.f175f = bVar;
        this.f176g = aVar2;
    }

    /* renamed from: g */
    public void mo134g(C1773g gVar, C0342c.C0344b bVar) {
        if (C0342c.C0344b.ON_START.equals(bVar)) {
            this.f177h.f183f.put(this.f174e, new C0051a.C0053b(this.f175f, this.f176g));
            if (this.f177h.f184g.containsKey(this.f174e)) {
                Object obj = this.f177h.f184g.get(this.f174e);
                this.f177h.f184g.remove(this.f174e);
                this.f175f.mo1735a(obj);
            }
            C0852a aVar = (C0852a) this.f177h.f185h.getParcelable(this.f174e);
            if (aVar != null) {
                this.f177h.f185h.remove(this.f174e);
                this.f175f.mo1735a(this.f176g.mo1742c(aVar.f3303e, aVar.f3304f));
            }
        } else if (C0342c.C0344b.ON_STOP.equals(bVar)) {
            this.f177h.f183f.remove(this.f174e);
        } else if (C0342c.C0344b.ON_DESTROY.equals(bVar)) {
            this.f177h.mo145e(this.f174e);
        }
    }
}
