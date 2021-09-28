package p007au.gov.dfat.vdsncchecker.vds;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import p000a.C0001b;
import p025d3.C0802f;
import p072l2.C1241e;
import p077m1.C1428c;
import p155j$.time.LocalDate;

@Keep
/* renamed from: au.gov.dfat.vdsncchecker.vds.VdsPidParcel */
public final class VdsPidParcel implements Parcelable {
    public static final Parcelable.Creator<VdsPidParcel> CREATOR = new C0519a();

    /* renamed from: ai */
    private final String f2300ai;
    private final LocalDate dob;

    /* renamed from: i */
    private final String f2301i;

    /* renamed from: n */
    private final String f2302n;
    private final String sex;

    /* renamed from: au.gov.dfat.vdsncchecker.vds.VdsPidParcel$a */
    public static final class C0519a implements Parcelable.Creator<VdsPidParcel> {
        public Object createFromParcel(Parcel parcel) {
            C1241e.m3517j(parcel, "parcel");
            return new VdsPidParcel((LocalDate) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new VdsPidParcel[i];
        }
    }

    public VdsPidParcel(LocalDate localDate, String str, String str2, String str3, String str4) {
        C1241e.m3517j(str, "n");
        this.dob = localDate;
        this.f2302n = str;
        this.sex = str2;
        this.f2301i = str3;
        this.f2300ai = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VdsPidParcel(LocalDate localDate, String str, String str2, String str3, String str4, int i, C0802f fVar) {
        this((i & 1) != 0 ? null : localDate, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }

    public static /* synthetic */ VdsPidParcel copy$default(VdsPidParcel vdsPidParcel, LocalDate localDate, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            localDate = vdsPidParcel.dob;
        }
        if ((i & 2) != 0) {
            str = vdsPidParcel.f2302n;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = vdsPidParcel.sex;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = vdsPidParcel.f2301i;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = vdsPidParcel.f2300ai;
        }
        return vdsPidParcel.copy(localDate, str5, str6, str7, str4);
    }

    public final LocalDate component1() {
        return this.dob;
    }

    public final String component2() {
        return this.f2302n;
    }

    public final String component3() {
        return this.sex;
    }

    public final String component4() {
        return this.f2301i;
    }

    public final String component5() {
        return this.f2300ai;
    }

    public final VdsPidParcel copy(LocalDate localDate, String str, String str2, String str3, String str4) {
        C1241e.m3517j(str, "n");
        return new VdsPidParcel(localDate, str, str2, str3, str4);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VdsPidParcel)) {
            return false;
        }
        VdsPidParcel vdsPidParcel = (VdsPidParcel) obj;
        return C1241e.m3513b(this.dob, vdsPidParcel.dob) && C1241e.m3513b(this.f2302n, vdsPidParcel.f2302n) && C1241e.m3513b(this.sex, vdsPidParcel.sex) && C1241e.m3513b(this.f2301i, vdsPidParcel.f2301i) && C1241e.m3513b(this.f2300ai, vdsPidParcel.f2300ai);
    }

    public final String getAi() {
        return this.f2300ai;
    }

    public final LocalDate getDob() {
        return this.dob;
    }

    public final String getI() {
        return this.f2301i;
    }

    public final String getN() {
        return this.f2302n;
    }

    public final String getSex() {
        return this.sex;
    }

    public int hashCode() {
        LocalDate localDate = this.dob;
        int i = 0;
        int a = C1428c.m4090a(this.f2302n, (localDate == null ? 0 : localDate.hashCode()) * 31, 31);
        String str = this.sex;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2301i;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2300ai;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("VdsPidParcel(dob=");
        a.append(this.dob);
        a.append(", n=");
        a.append(this.f2302n);
        a.append(", sex=");
        a.append(this.sex);
        a.append(", i=");
        a.append(this.f2301i);
        a.append(", ai=");
        a.append(this.f2300ai);
        a.append(')');
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1241e.m3517j(parcel, "out");
        parcel.writeSerializable(this.dob);
        parcel.writeString(this.f2302n);
        parcel.writeString(this.sex);
        parcel.writeString(this.f2301i);
        parcel.writeString(this.f2300ai);
    }
}
