package p074l4;

/* renamed from: l4.r */
public class C1390r extends IllegalStateException {

    /* renamed from: e */
    public final /* synthetic */ int f4432e;

    /* renamed from: f */
    public Throwable f4433f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1390r(String str) {
        super(str);
        this.f4432e = 0;
    }

    public Throwable getCause() {
        switch (this.f4432e) {
            case 0:
                return this.f4433f;
            case 1:
                return this.f4433f;
            default:
                return this.f4433f;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1390r(String str, Throwable th, int i) {
        super(str);
        this.f4432e = i;
        if (i == 1) {
            super(str);
            this.f4433f = th;
        } else if (i != 2) {
            this.f4433f = th;
        } else {
            super(str);
            this.f4433f = th;
        }
    }
}
