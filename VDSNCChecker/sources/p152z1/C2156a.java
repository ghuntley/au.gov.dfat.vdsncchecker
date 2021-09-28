package p152z1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: z1.a */
public final class C2156a implements Parcelable {
    public static final Parcelable.Creator<C2156a> CREATOR = new C2157a();

    /* renamed from: e */
    public final C2191s f6218e;

    /* renamed from: f */
    public final C2191s f6219f;

    /* renamed from: g */
    public final C2159c f6220g;

    /* renamed from: h */
    public C2191s f6221h;

    /* renamed from: i */
    public final int f6222i;

    /* renamed from: j */
    public final int f6223j;

    /* renamed from: z1.a$a */
    public static class C2157a implements Parcelable.Creator<C2156a> {
        public Object createFromParcel(Parcel parcel) {
            return new C2156a((C2191s) parcel.readParcelable(C2191s.class.getClassLoader()), (C2191s) parcel.readParcelable(C2191s.class.getClassLoader()), (C2159c) parcel.readParcelable(C2159c.class.getClassLoader()), (C2191s) parcel.readParcelable(C2191s.class.getClassLoader()), (C2157a) null);
        }

        public Object[] newArray(int i) {
            return new C2156a[i];
        }
    }

    /* renamed from: z1.a$b */
    public static final class C2158b {

        /* renamed from: e */
        public static final long f6224e = C2160a0.m5570a(C2191s.m5624k(1900, 0).f6310j);

        /* renamed from: f */
        public static final long f6225f = C2160a0.m5570a(C2191s.m5624k(2100, 11).f6310j);

        /* renamed from: a */
        public long f6226a = f6224e;

        /* renamed from: b */
        public long f6227b = f6225f;

        /* renamed from: c */
        public Long f6228c;

        /* renamed from: d */
        public C2159c f6229d = new C2167e(Long.MIN_VALUE);

        public C2158b(C2156a aVar) {
            this.f6226a = aVar.f6218e.f6310j;
            this.f6227b = aVar.f6219f.f6310j;
            this.f6228c = Long.valueOf(aVar.f6221h.f6310j);
            this.f6229d = aVar.f6220g;
        }
    }

    /* renamed from: z1.a$c */
    public interface C2159c extends Parcelable {
        /* renamed from: f */
        boolean mo6699f(long j);
    }

    public C2156a(C2191s sVar, C2191s sVar2, C2159c cVar, C2191s sVar3, C2157a aVar) {
        this.f6218e = sVar;
        this.f6219f = sVar2;
        this.f6221h = sVar3;
        this.f6220g = cVar;
        if (sVar3 != null && sVar.f6305e.compareTo(sVar3.f6305e) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (sVar3 == null || sVar3.f6305e.compareTo(sVar2.f6305e) <= 0) {
            this.f6223j = sVar.mo6746p(sVar2) + 1;
            this.f6222i = (sVar2.f6307g - sVar.f6307g) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2156a)) {
            return false;
        }
        C2156a aVar = (C2156a) obj;
        if (!this.f6218e.equals(aVar.f6218e) || !this.f6219f.equals(aVar.f6219f) || !Objects.equals(this.f6221h, aVar.f6221h) || !this.f6220g.equals(aVar.f6220g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6218e, this.f6219f, this.f6221h, this.f6220g});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f6218e, 0);
        parcel.writeParcelable(this.f6219f, 0);
        parcel.writeParcelable(this.f6221h, 0);
        parcel.writeParcelable(this.f6220g, 0);
    }
}
