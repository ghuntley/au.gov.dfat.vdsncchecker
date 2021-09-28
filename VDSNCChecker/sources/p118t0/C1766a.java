package p118t0;

import java.io.Closeable;
import java.util.concurrent.CancellationException;
import p072l2.C1241e;
import p073l3.C1320u;
import p073l3.C1334z;
import p138w2.C2046f;

/* renamed from: t0.a */
public final class C1766a implements Closeable, C1334z {

    /* renamed from: e */
    public final C2046f f5408e;

    public C1766a(C2046f fVar) {
        C1241e.m3517j(fVar, "context");
        this.f5408e = fVar;
    }

    public void close() {
        C1320u.m3701e(this.f5408e, (CancellationException) null, 1, (Object) null);
    }

    /* renamed from: v */
    public C2046f mo1777v() {
        return this.f5408e;
    }
}
