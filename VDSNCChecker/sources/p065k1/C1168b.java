package p065k1;

import p019c3.C0640p;
import p042g2.C0955a;
import p059j1.C1088b;
import p073l3.C1334z;
import p118t0.C1776j;
import p120t2.C1798k;
import p138w2.C2043d;
import p143x2.C2124a;
import p148y2.C2137e;
import p148y2.C2141h;

@C2137e(mo6675c = "au.gov.dfat.vdsncchecker.ui.AppViewModel$downloadCrl$1", mo6676f = "AppViewModel.kt", mo6677l = {24}, mo6678m = "invokeSuspend")
/* renamed from: k1.b */
public final class C1168b extends C2141h implements C0640p<C1334z, C2043d<? super C1798k>, Object> {

    /* renamed from: i */
    public Object f4026i;

    /* renamed from: j */
    public int f4027j;

    /* renamed from: k */
    public final /* synthetic */ C1169c f4028k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1168b(C1169c cVar, C2043d<? super C1168b> dVar) {
        super(2, dVar);
        this.f4028k = cVar;
    }

    /* renamed from: a */
    public final C2043d<C1798k> mo4785a(Object obj, C2043d<?> dVar) {
        return new C1168b(this.f4028k, dVar);
    }

    /* renamed from: g */
    public final Object mo4587g(Object obj) {
        C1776j<byte[]> jVar;
        C2124a aVar = C2124a.COROUTINE_SUSPENDED;
        int i = this.f4027j;
        if (i == 0) {
            C0955a.m2724E(obj);
            C1169c cVar = this.f4028k;
            C1776j<byte[]> jVar2 = cVar.f4030d;
            C1088b bVar = cVar.f4029c;
            this.f4026i = jVar2;
            this.f4027j = 1;
            obj = bVar.mo4586a(this);
            if (obj == aVar) {
                return aVar;
            }
            jVar = jVar2;
        } else if (i == 1) {
            jVar = (C1776j) this.f4026i;
            C0955a.m2724E(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jVar.mo6061h(obj);
        return C1798k.f5446a;
    }

    /* renamed from: k */
    public Object mo2829k(Object obj, Object obj2) {
        C1334z zVar = (C1334z) obj;
        return new C1168b(this.f4028k, (C2043d) obj2).mo4587g(C1798k.f5446a);
    }
}
