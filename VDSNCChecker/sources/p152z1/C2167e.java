package p152z1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p152z1.C2156a;

/* renamed from: z1.e */
public class C2167e implements C2156a.C2159c {
    public static final Parcelable.Creator<C2167e> CREATOR = new C2168a();

    /* renamed from: e */
    public final long f6248e;

    /* renamed from: z1.e$a */
    public static class C2168a implements Parcelable.Creator<C2167e> {
        public Object createFromParcel(Parcel parcel) {
            return new C2167e(parcel.readLong(), (C2168a) null);
        }

        public Object[] newArray(int i) {
            return new C2167e[i];
        }
    }

    public C2167e(long j) {
        this.f6248e = j;
    }

    public C2167e(long j, C2168a aVar) {
        this.f6248e = j;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2167e)) {
            return false;
        }
        return this.f6248e == ((C2167e) obj).f6248e;
    }

    /* renamed from: f */
    public boolean mo6699f(long j) {
        return j >= this.f6248e;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f6248e)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f6248e);
    }
}
