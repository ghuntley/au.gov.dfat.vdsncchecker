package p007au.gov.dfat.vdsncchecker.vds;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import p000a.C0001b;
import p072l2.C1241e;
import p077m1.C1428c;

@Keep
/* renamed from: au.gov.dfat.vdsncchecker.vds.VdsVeParcel */
public final class VdsVeParcel implements Parcelable {
    public static final Parcelable.Creator<VdsVeParcel> CREATOR = new C0521a();
    private final String des;
    private final String dis;
    private final String nam;

    /* renamed from: vd */
    private final List<VdsVdParcel> f2303vd;

    /* renamed from: au.gov.dfat.vdsncchecker.vds.VdsVeParcel$a */
    public static final class C0521a implements Parcelable.Creator<VdsVeParcel> {
        public Object createFromParcel(Parcel parcel) {
            C1241e.m3517j(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(VdsVdParcel.CREATOR.createFromParcel(parcel));
            }
            return new VdsVeParcel(readString, readString2, readString3, arrayList);
        }

        public Object[] newArray(int i) {
            return new VdsVeParcel[i];
        }
    }

    public VdsVeParcel(String str, String str2, String str3, List<VdsVdParcel> list) {
        C1241e.m3517j(str, "des");
        C1241e.m3517j(str2, "nam");
        C1241e.m3517j(str3, "dis");
        C1241e.m3517j(list, "vd");
        this.des = str;
        this.nam = str2;
        this.dis = str3;
        this.f2303vd = list;
    }

    public static /* synthetic */ VdsVeParcel copy$default(VdsVeParcel vdsVeParcel, String str, String str2, String str3, List<VdsVdParcel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vdsVeParcel.des;
        }
        if ((i & 2) != 0) {
            str2 = vdsVeParcel.nam;
        }
        if ((i & 4) != 0) {
            str3 = vdsVeParcel.dis;
        }
        if ((i & 8) != 0) {
            list = vdsVeParcel.f2303vd;
        }
        return vdsVeParcel.copy(str, str2, str3, list);
    }

    public final String component1() {
        return this.des;
    }

    public final String component2() {
        return this.nam;
    }

    public final String component3() {
        return this.dis;
    }

    public final List<VdsVdParcel> component4() {
        return this.f2303vd;
    }

    public final VdsVeParcel copy(String str, String str2, String str3, List<VdsVdParcel> list) {
        C1241e.m3517j(str, "des");
        C1241e.m3517j(str2, "nam");
        C1241e.m3517j(str3, "dis");
        C1241e.m3517j(list, "vd");
        return new VdsVeParcel(str, str2, str3, list);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VdsVeParcel)) {
            return false;
        }
        VdsVeParcel vdsVeParcel = (VdsVeParcel) obj;
        return C1241e.m3513b(this.des, vdsVeParcel.des) && C1241e.m3513b(this.nam, vdsVeParcel.nam) && C1241e.m3513b(this.dis, vdsVeParcel.dis) && C1241e.m3513b(this.f2303vd, vdsVeParcel.f2303vd);
    }

    public final String getDes() {
        return this.des;
    }

    public final String getDis() {
        return this.dis;
    }

    public final String getNam() {
        return this.nam;
    }

    public final List<VdsVdParcel> getVd() {
        return this.f2303vd;
    }

    public int hashCode() {
        return this.f2303vd.hashCode() + C1428c.m4090a(this.dis, C1428c.m4090a(this.nam, this.des.hashCode() * 31, 31), 31);
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("VdsVeParcel(des=");
        a.append(this.des);
        a.append(", nam=");
        a.append(this.nam);
        a.append(", dis=");
        a.append(this.dis);
        a.append(", vd=");
        a.append(this.f2303vd);
        a.append(')');
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1241e.m3517j(parcel, "out");
        parcel.writeString(this.des);
        parcel.writeString(this.nam);
        parcel.writeString(this.dis);
        List<VdsVdParcel> list = this.f2303vd;
        parcel.writeInt(list.size());
        for (VdsVdParcel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }
}
