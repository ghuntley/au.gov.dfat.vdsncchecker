package p139w3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p019c3.C0625a;
import p025d3.C0806j;
import p050h4.C1018c;
import p126u2.C1846g;

/* renamed from: w3.i */
public final class C2078i extends C0806j implements C0625a<List<? extends X509Certificate>> {

    /* renamed from: f */
    public final /* synthetic */ C2074h f6034f;

    /* renamed from: g */
    public final /* synthetic */ List f6035g;

    /* renamed from: h */
    public final /* synthetic */ String f6036h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2078i(C2074h hVar, List list, String str) {
        super(0);
        this.f6034f = hVar;
        this.f6035g = list;
        this.f6036h = str;
    }

    /* renamed from: b */
    public Object mo40b() {
        List<Certificate> list;
        C1018c cVar = this.f6034f.f6030b;
        if (cVar == null || (list = cVar.mo4240a(this.f6035g, this.f6036h)) == null) {
            list = this.f6035g;
        }
        ArrayList arrayList = new ArrayList(C1846g.m5046H(list, 10));
        for (Certificate certificate : list) {
            Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
