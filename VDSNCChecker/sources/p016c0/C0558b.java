package p016c0;

import android.graphics.Insets;
import p000a.C0001b;

/* renamed from: c0.b */
public final class C0558b {

    /* renamed from: e */
    public static final C0558b f2358e = new C0558b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f2359a;

    /* renamed from: b */
    public final int f2360b;

    /* renamed from: c */
    public final int f2361c;

    /* renamed from: d */
    public final int f2362d;

    public C0558b(int i, int i2, int i3, int i4) {
        this.f2359a = i;
        this.f2360b = i2;
        this.f2361c = i3;
        this.f2362d = i4;
    }

    /* renamed from: a */
    public static C0558b m1820a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f2358e : new C0558b(i, i2, i3, i4);
    }

    /* renamed from: b */
    public static C0558b m1821b(Insets insets) {
        return m1820a(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: c */
    public Insets mo2702c() {
        return Insets.of(this.f2359a, this.f2360b, this.f2361c, this.f2362d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0558b.class != obj.getClass()) {
            return false;
        }
        C0558b bVar = (C0558b) obj;
        return this.f2362d == bVar.f2362d && this.f2359a == bVar.f2359a && this.f2361c == bVar.f2361c && this.f2360b == bVar.f2360b;
    }

    public int hashCode() {
        return (((((this.f2359a * 31) + this.f2360b) * 31) + this.f2361c) * 31) + this.f2362d;
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("Insets{left=");
        a.append(this.f2359a);
        a.append(", top=");
        a.append(this.f2360b);
        a.append(", right=");
        a.append(this.f2361c);
        a.append(", bottom=");
        a.append(this.f2362d);
        a.append('}');
        return a.toString();
    }
}
