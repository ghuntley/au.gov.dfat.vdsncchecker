package p139w3;

/* renamed from: w3.c0 */
public enum C2061c0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: e */
    public final String f5971e;

    /* access modifiers changed from: public */
    C2061c0(String str) {
        this.f5971e = str;
    }

    public String toString() {
        return this.f5971e;
    }
}
