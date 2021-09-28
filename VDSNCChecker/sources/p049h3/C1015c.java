package p049h3;

/* renamed from: h3.c */
public final class C1015c extends C1013a {

    /* renamed from: h */
    public static final C1015c f3735h = new C1015c(1, 0);

    /* renamed from: i */
    public static final C1015c f3736i = null;

    public C1015c(int i, int i2) {
        super(i, i2, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1015c) {
            if (!isEmpty() || !((C1015c) obj).isEmpty()) {
                C1015c cVar = (C1015c) obj;
                if (!(this.f3728e == cVar.f3728e && this.f3729f == cVar.f3729f)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f3728e * 31) + this.f3729f;
    }

    public boolean isEmpty() {
        return this.f3728e > this.f3729f;
    }

    public String toString() {
        return this.f3728e + ".." + this.f3729f;
    }
}
