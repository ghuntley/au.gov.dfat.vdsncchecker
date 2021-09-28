package p099q;

/* renamed from: q.f */
public class C1595f<T> {

    /* renamed from: a */
    public final /* synthetic */ int f4958a;

    /* renamed from: b */
    public final Object[] f4959b;

    /* renamed from: c */
    public int f4960c;

    public C1595f(int i, int i2) {
        this.f4958a = i2;
        if (i2 != 1) {
            if (i > 0) {
                this.f4959b = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        } else if (i > 0) {
            this.f4959b = new Object[i];
        } else {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
    }

    /* renamed from: a */
    public Object mo4463a() {
        switch (this.f4958a) {
            case 0:
                int i = this.f4960c;
                if (i <= 0) {
                    return null;
                }
                int i2 = i - 1;
                Object[] objArr = this.f4959b;
                Object obj = objArr[i2];
                objArr[i2] = null;
                this.f4960c = i2;
                return obj;
            default:
                int i3 = this.f4960c;
                if (i3 <= 0) {
                    return null;
                }
                int i4 = i3 - 1;
                Object[] objArr2 = this.f4959b;
                Object obj2 = objArr2[i4];
                objArr2[i4] = null;
                this.f4960c = i4;
                return obj2;
        }
    }

    /* renamed from: b */
    public boolean mo5737b(T t) {
        for (int i = 0; i < this.f4960c; i++) {
            if (this.f4959b[i] == t) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo4464c(Object obj) {
        switch (this.f4958a) {
            case 0:
                int i = this.f4960c;
                Object[] objArr = this.f4959b;
                if (i >= objArr.length) {
                    return false;
                }
                objArr[i] = obj;
                this.f4960c = i + 1;
                return true;
            default:
                if (!mo5737b(obj)) {
                    int i2 = this.f4960c;
                    Object[] objArr2 = this.f4959b;
                    if (i2 >= objArr2.length) {
                        return false;
                    }
                    objArr2[i2] = obj;
                    this.f4960c = i2 + 1;
                    return true;
                }
                throw new IllegalStateException("Already in the pool!");
        }
    }
}
