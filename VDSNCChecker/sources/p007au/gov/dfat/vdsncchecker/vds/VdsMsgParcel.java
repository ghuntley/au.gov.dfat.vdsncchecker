package p007au.gov.dfat.vdsncchecker.vds;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import p000a.C0001b;
import p072l2.C1241e;

@Keep
/* renamed from: au.gov.dfat.vdsncchecker.vds.VdsMsgParcel */
public final class VdsMsgParcel implements Parcelable {
    public static final Parcelable.Creator<VdsMsgParcel> CREATOR = new C0517a();
    private final VdsPidParcel pid;
    private final String uvci;

    /* renamed from: ve */
    private final List<VdsVeParcel> f2299ve;

    /* renamed from: au.gov.dfat.vdsncchecker.vds.VdsMsgParcel$a */
    public static final class C0517a implements Parcelable.Creator<VdsMsgParcel> {
        public Object createFromParcel(Parcel parcel) {
            C1241e.m3517j(parcel, "parcel");
            String readString = parcel.readString();
            VdsPidParcel createFromParcel = VdsPidParcel.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(VdsVeParcel.CREATOR.createFromParcel(parcel));
            }
            return new VdsMsgParcel(readString, createFromParcel, arrayList);
        }

        public Object[] newArray(int i) {
            return new VdsMsgParcel[i];
        }
    }

    public VdsMsgParcel(String str, VdsPidParcel vdsPidParcel, List<VdsVeParcel> list) {
        C1241e.m3517j(str, "uvci");
        C1241e.m3517j(vdsPidParcel, "pid");
        C1241e.m3517j(list, "ve");
        this.uvci = str;
        this.pid = vdsPidParcel;
        this.f2299ve = list;
    }

    public static /* synthetic */ VdsMsgParcel copy$default(VdsMsgParcel vdsMsgParcel, String str, VdsPidParcel vdsPidParcel, List<VdsVeParcel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vdsMsgParcel.uvci;
        }
        if ((i & 2) != 0) {
            vdsPidParcel = vdsMsgParcel.pid;
        }
        if ((i & 4) != 0) {
            list = vdsMsgParcel.f2299ve;
        }
        return vdsMsgParcel.copy(str, vdsPidParcel, list);
    }

    public final String component1() {
        return this.uvci;
    }

    public final VdsPidParcel component2() {
        return this.pid;
    }

    public final List<VdsVeParcel> component3() {
        return this.f2299ve;
    }

    public final VdsMsgParcel copy(String str, VdsPidParcel vdsPidParcel, List<VdsVeParcel> list) {
        C1241e.m3517j(str, "uvci");
        C1241e.m3517j(vdsPidParcel, "pid");
        C1241e.m3517j(list, "ve");
        return new VdsMsgParcel(str, vdsPidParcel, list);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VdsMsgParcel)) {
            return false;
        }
        VdsMsgParcel vdsMsgParcel = (VdsMsgParcel) obj;
        return C1241e.m3513b(this.uvci, vdsMsgParcel.uvci) && C1241e.m3513b(this.pid, vdsMsgParcel.pid) && C1241e.m3513b(this.f2299ve, vdsMsgParcel.f2299ve);
    }

    public final VdsPidParcel getPid() {
        return this.pid;
    }

    public final String getUvci() {
        return this.uvci;
    }

    public final List<VdsVeParcel> getVe() {
        return this.f2299ve;
    }

    public int hashCode() {
        int hashCode = this.pid.hashCode();
        return this.f2299ve.hashCode() + ((hashCode + (this.uvci.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("VdsMsgParcel(uvci=");
        a.append(this.uvci);
        a.append(", pid=");
        a.append(this.pid);
        a.append(", ve=");
        a.append(this.f2299ve);
        a.append(')');
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1241e.m3517j(parcel, "out");
        parcel.writeString(this.uvci);
        this.pid.writeToParcel(parcel, i);
        List<VdsVeParcel> list = this.f2299ve;
        parcel.writeInt(list.size());
        for (VdsVeParcel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }
}
