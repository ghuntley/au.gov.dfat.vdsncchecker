package p155j$.time.temporal;

/* renamed from: j$.time.temporal.n */
public final /* synthetic */ class C2298n implements C2297m {

    /* renamed from: a */
    public final /* synthetic */ int f6553a;

    public /* synthetic */ C2298n(int i) {
        this.f6553a = i;
    }

    /* renamed from: b */
    public final C2295k mo7049b(C2295k kVar) {
        int i = this.f6553a;
        int b = kVar.mo6789b(C2285a.DAY_OF_WEEK);
        if (b == i) {
            return kVar;
        }
        int i2 = b - i;
        return kVar.mo6800j((long) (i2 >= 0 ? 7 - i2 : -i2), C2286b.DAYS);
    }
}
