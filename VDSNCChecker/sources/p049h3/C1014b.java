package p049h3;

import java.util.NoSuchElementException;
import p126u2.C1855p;

/* renamed from: h3.b */
public final class C1014b extends C1855p {

    /* renamed from: e */
    public final int f3731e;

    /* renamed from: f */
    public boolean f3732f;

    /* renamed from: g */
    public int f3733g;

    /* renamed from: h */
    public final int f3734h;

    public C1014b(int i, int i2, int i3) {
        this.f3734h = i3;
        this.f3731e = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f3732f = z;
        this.f3733g = !z ? i2 : i;
    }

    /* renamed from: b */
    public int mo4450b() {
        int i = this.f3733g;
        if (i != this.f3731e) {
            this.f3733g = this.f3734h + i;
        } else if (this.f3732f) {
            this.f3732f = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public boolean hasNext() {
        return this.f3732f;
    }
}
