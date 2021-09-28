package p143x2;

import java.util.Objects;
import p019c3.C0640p;
import p025d3.C0812p;
import p042g2.C0955a;
import p138w2.C2043d;
import p148y2.C2140g;

/* renamed from: x2.b */
public final class C2125b extends C2140g {

    /* renamed from: f */
    public int f6157f;

    /* renamed from: g */
    public final /* synthetic */ C2043d f6158g;

    /* renamed from: h */
    public final /* synthetic */ C0640p f6159h;

    /* renamed from: i */
    public final /* synthetic */ Object f6160i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2125b(C2043d dVar, C2043d dVar2, C0640p pVar, Object obj) {
        super(dVar2);
        this.f6158g = dVar;
        this.f6159h = pVar;
        this.f6160i = obj;
    }

    /* renamed from: g */
    public Object mo4587g(Object obj) {
        int i = this.f6157f;
        if (i == 0) {
            this.f6157f = 1;
            C0955a.m2724E(obj);
            C0640p pVar = this.f6159h;
            Objects.requireNonNull(pVar, "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            C0812p.m2405a(pVar, 2);
            return pVar.mo2829k(this.f6160i, this);
        } else if (i == 1) {
            this.f6157f = 2;
            C0955a.m2724E(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
