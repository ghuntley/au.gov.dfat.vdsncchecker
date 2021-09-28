package p143x2;

import java.util.Objects;
import p019c3.C0640p;
import p025d3.C0812p;
import p042g2.C0955a;
import p138w2.C2043d;
import p138w2.C2046f;
import p148y2.C2135c;

/* renamed from: x2.c */
public final class C2126c extends C2135c {

    /* renamed from: h */
    public int f6161h;

    /* renamed from: i */
    public final /* synthetic */ C2043d f6162i;

    /* renamed from: j */
    public final /* synthetic */ C2046f f6163j;

    /* renamed from: k */
    public final /* synthetic */ C0640p f6164k;

    /* renamed from: l */
    public final /* synthetic */ Object f6165l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2126c(C2043d dVar, C2046f fVar, C2043d dVar2, C2046f fVar2, C0640p pVar, Object obj) {
        super(dVar2, fVar2);
        this.f6162i = dVar;
        this.f6163j = fVar;
        this.f6164k = pVar;
        this.f6165l = obj;
    }

    /* renamed from: g */
    public Object mo4587g(Object obj) {
        int i = this.f6161h;
        if (i == 0) {
            this.f6161h = 1;
            C0955a.m2724E(obj);
            C0640p pVar = this.f6164k;
            Objects.requireNonNull(pVar, "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            C0812p.m2405a(pVar, 2);
            return pVar.mo2829k(this.f6165l, this);
        } else if (i == 1) {
            this.f6161h = 2;
            C0955a.m2724E(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
