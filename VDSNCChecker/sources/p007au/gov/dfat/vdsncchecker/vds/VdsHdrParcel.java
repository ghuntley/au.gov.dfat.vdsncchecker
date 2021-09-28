package p007au.gov.dfat.vdsncchecker.vds;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import p000a.C0001b;
import p072l2.C1241e;
import p077m1.C1428c;

@Keep
/* renamed from: au.gov.dfat.vdsncchecker.vds.VdsHdrParcel */
public final class VdsHdrParcel implements Parcelable {
    public static final Parcelable.Creator<VdsHdrParcel> CREATOR = new C0516a();
    private final String hdrIs;

    /* renamed from: t */
    private final String f2297t;

    /* renamed from: v */
    private final long f2298v;

    /* renamed from: au.gov.dfat.vdsncchecker.vds.VdsHdrParcel$a */
    public static final class C0516a implements Parcelable.Creator<VdsHdrParcel> {
        public Object createFromParcel(Parcel parcel) {
            C1241e.m3517j(parcel, "parcel");
            return new VdsHdrParcel(parcel.readLong(), parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new VdsHdrParcel[i];
        }
    }

    public VdsHdrParcel(long j, String str, String str2) {
        C1241e.m3517j(str, "t");
        C1241e.m3517j(str2, "hdrIs");
        this.f2298v = j;
        this.f2297t = str;
        this.hdrIs = str2;
    }

    public static /* synthetic */ VdsHdrParcel copy$default(VdsHdrParcel vdsHdrParcel, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = vdsHdrParcel.f2298v;
        }
        if ((i & 2) != 0) {
            str = vdsHdrParcel.f2297t;
        }
        if ((i & 4) != 0) {
            str2 = vdsHdrParcel.hdrIs;
        }
        return vdsHdrParcel.copy(j, str, str2);
    }

    public final long component1() {
        return this.f2298v;
    }

    public final String component2() {
        return this.f2297t;
    }

    public final String component3() {
        return this.hdrIs;
    }

    public final VdsHdrParcel copy(long j, String str, String str2) {
        C1241e.m3517j(str, "t");
        C1241e.m3517j(str2, "hdrIs");
        return new VdsHdrParcel(j, str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VdsHdrParcel)) {
            return false;
        }
        VdsHdrParcel vdsHdrParcel = (VdsHdrParcel) obj;
        return this.f2298v == vdsHdrParcel.f2298v && C1241e.m3513b(this.f2297t, vdsHdrParcel.f2297t) && C1241e.m3513b(this.hdrIs, vdsHdrParcel.hdrIs);
    }

    public final String getHdrIs() {
        return this.hdrIs;
    }

    public final String getT() {
        return this.f2297t;
    }

    public final long getV() {
        return this.f2298v;
    }

    public int hashCode() {
        return this.hdrIs.hashCode() + C1428c.m4090a(this.f2297t, Long.hashCode(this.f2298v) * 31, 31);
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("VdsHdrParcel(v=");
        a.append(this.f2298v);
        a.append(", t=");
        a.append(this.f2297t);
        a.append(", hdrIs=");
        a.append(this.hdrIs);
        a.append(')');
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1241e.m3517j(parcel, "out");
        parcel.writeLong(this.f2298v);
        parcel.writeString(this.f2297t);
        parcel.writeString(this.hdrIs);
    }
}
