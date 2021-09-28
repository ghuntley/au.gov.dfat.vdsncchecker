package p085n3;

import java.lang.Comparable;
import java.util.Arrays;
import p072l2.C1241e;
import p073l3.C1290j0;
import p085n3.C1480r;

/* renamed from: n3.q */
public class C1479q<T extends C1480r & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a */
    public T[] f4624a;

    /* renamed from: a */
    public final void mo5345a(T t) {
        C1290j0.C1291a aVar = (C1290j0.C1291a) t;
        aVar.mo5075b(this);
        T[] tArr = this.f4624a;
        if (tArr == null) {
            tArr = new C1480r[4];
            this.f4624a = tArr;
        } else if (this._size >= tArr.length) {
            T[] copyOf = Arrays.copyOf(tArr, this._size * 2);
            C1241e.m3516f(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            tArr = (C1480r[]) copyOf;
            this.f4624a = tArr;
        }
        int i = this._size;
        this._size = i + 1;
        tArr[i] = t;
        aVar.f4300g = i;
        mo5350f(i);
    }

    /* renamed from: b */
    public final T mo5346b() {
        T[] tArr = this.f4624a;
        if (tArr == null) {
            return null;
        }
        return tArr[0];
    }

    /* renamed from: c */
    public final boolean mo5347c() {
        return this._size == 0;
    }

    /* renamed from: d */
    public final T mo5348d(int i) {
        T[] tArr = this.f4624a;
        C1241e.m3515e(tArr);
        this._size--;
        if (i < this._size) {
            mo5351g(i, this._size);
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                C1241e.m3515e(t);
                T t2 = tArr[i2];
                C1241e.m3515e(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    mo5351g(i, i2);
                    mo5350f(i2);
                }
            }
            while (true) {
                int i3 = (i * 2) + 1;
                if (i3 >= this._size) {
                    break;
                }
                T[] tArr2 = this.f4624a;
                C1241e.m3515e(tArr2);
                int i4 = i3 + 1;
                if (i4 < this._size) {
                    T t3 = tArr2[i4];
                    C1241e.m3515e(t3);
                    T t4 = tArr2[i3];
                    C1241e.m3515e(t4);
                    if (((Comparable) t3).compareTo(t4) < 0) {
                        i3 = i4;
                    }
                }
                T t5 = tArr2[i];
                C1241e.m3515e(t5);
                T t6 = tArr2[i3];
                C1241e.m3515e(t6);
                if (((Comparable) t5).compareTo(t6) <= 0) {
                    break;
                }
                mo5351g(i, i3);
                i = i3;
            }
        }
        T t7 = tArr[this._size];
        C1241e.m3515e(t7);
        t7.mo5075b((C1479q<?>) null);
        t7.mo5074a(-1);
        tArr[this._size] = null;
        return t7;
    }

    /* renamed from: e */
    public final T mo5349e() {
        T d;
        synchronized (this) {
            d = this._size > 0 ? mo5348d(0) : null;
        }
        return d;
    }

    /* renamed from: f */
    public final void mo5350f(int i) {
        while (i > 0) {
            T[] tArr = this.f4624a;
            C1241e.m3515e(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            C1241e.m3515e(t);
            T t2 = tArr[i];
            C1241e.m3515e(t2);
            if (((Comparable) t).compareTo(t2) > 0) {
                mo5351g(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public final void mo5351g(int i, int i2) {
        T[] tArr = this.f4624a;
        C1241e.m3515e(tArr);
        T t = tArr[i2];
        C1241e.m3515e(t);
        T t2 = tArr[i];
        C1241e.m3515e(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.mo5074a(i);
        t2.mo5074a(i2);
    }
}
