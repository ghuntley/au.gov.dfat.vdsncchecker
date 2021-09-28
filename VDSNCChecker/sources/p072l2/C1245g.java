package p072l2;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: l2.g */
public final class C1245g implements C1239c {

    /* renamed from: a */
    public final float f4209a;

    public C1245g(float f) {
        this.f4209a = f;
    }

    /* renamed from: a */
    public float mo4949a(RectF rectF) {
        return rectF.height() * this.f4209a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1245g)) {
            return false;
        }
        return this.f4209a == ((C1245g) obj).f4209a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4209a)});
    }
}
