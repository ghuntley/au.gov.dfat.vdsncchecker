package p005a4;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p019c3.C0625a;
import p025d3.C0806j;
import p072l2.C1241e;
import p126u2.C1846g;
import p139w3.C2101v;

/* renamed from: a4.h */
public final class C0023h extends C0806j implements C0625a<List<? extends X509Certificate>> {

    /* renamed from: f */
    public final /* synthetic */ C0024i f68f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0023h(C0024i iVar) {
        super(0);
        this.f68f = iVar;
    }

    /* renamed from: b */
    public Object mo40b() {
        C2101v vVar = this.f68f.f71d;
        C1241e.m3515e(vVar);
        List<Certificate> c = vVar.mo6607c();
        ArrayList arrayList = new ArrayList(C1846g.m5046H(c, 10));
        for (Certificate certificate : c) {
            Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
