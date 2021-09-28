package p026d4;

import p154z3.C2205a;

/* renamed from: d4.k */
public final class C0835k extends C2205a {

    /* renamed from: e */
    public final /* synthetic */ C0820f f3236e;

    /* renamed from: f */
    public final /* synthetic */ int f3237f;

    /* renamed from: g */
    public final /* synthetic */ C0814b f3238g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0835k(String str, boolean z, String str2, boolean z2, C0820f fVar, int i, C0814b bVar) {
        super(str2, z2);
        this.f3236e = fVar;
        this.f3237f = i;
        this.f3238g = bVar;
    }

    /* renamed from: a */
    public long mo57a() {
        this.f3236e.f3183p.mo4128d(this.f3237f, this.f3238g);
        synchronized (this.f3236e) {
            this.f3236e.f3171F.remove(Integer.valueOf(this.f3237f));
        }
        return -1;
    }
}
