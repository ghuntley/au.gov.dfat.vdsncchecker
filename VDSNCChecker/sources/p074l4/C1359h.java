package p074l4;

import java.io.IOException;

/* renamed from: l4.h */
public class C1359h extends IOException {

    /* renamed from: e */
    public Throwable f4388e;

    public C1359h(String str) {
        super(str);
    }

    public C1359h(String str, Throwable th) {
        super(str);
        this.f4388e = th;
    }

    public Throwable getCause() {
        return this.f4388e;
    }
}
