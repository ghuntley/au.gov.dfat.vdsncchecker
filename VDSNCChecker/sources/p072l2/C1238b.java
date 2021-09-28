package p072l2;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: l2.b */
public final class C1238b implements C1239c {

    /* renamed from: a */
    public final C1239c f4161a;

    /* renamed from: b */
    public final float f4162b;

    public C1238b(float f, C1239c cVar) {
        while (cVar instanceof C1238b) {
            cVar = ((C1238b) cVar).f4161a;
            f += ((C1238b) cVar).f4162b;
        }
        this.f4161a = cVar;
        this.f4162b = f;
    }

    /* renamed from: a */
    public float mo4949a(RectF rectF) {
        return Math.max(0.0f, this.f4161a.mo4949a(rectF) + this.f4162b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1238b)) {
            return false;
        }
        C1238b bVar = (C1238b) obj;
        return this.f4161a.equals(bVar.f4161a) && this.f4162b == bVar.f4162b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4161a, Float.valueOf(this.f4162b)});
    }
}
