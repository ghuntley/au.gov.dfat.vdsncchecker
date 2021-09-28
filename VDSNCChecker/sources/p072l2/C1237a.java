package p072l2;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: l2.a */
public final class C1237a implements C1239c {

    /* renamed from: a */
    public final float f4160a;

    public C1237a(float f) {
        this.f4160a = f;
    }

    /* renamed from: a */
    public float mo4949a(RectF rectF) {
        return this.f4160a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1237a)) {
            return false;
        }
        return this.f4160a == ((C1237a) obj).f4160a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4160a)});
    }
}
