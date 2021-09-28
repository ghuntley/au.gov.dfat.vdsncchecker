package p007au.gov.dfat.vdsncchecker.vds;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import p000a.C0001b;
import p072l2.C1241e;

@Keep
/* renamed from: au.gov.dfat.vdsncchecker.vds.VdsParcel */
public final class VdsParcel implements Parcelable {
    public static final Parcelable.Creator<VdsParcel> CREATOR = new C0518a();
    private final VdsHdrParcel hdr;
    private final VdsMsgParcel msg;

    /* renamed from: au.gov.dfat.vdsncchecker.vds.VdsParcel$a */
    public static final class C0518a implements Parcelable.Creator<VdsParcel> {
        public Object createFromParcel(Parcel parcel) {
            C1241e.m3517j(parcel, "parcel");
            return new VdsParcel(VdsHdrParcel.CREATOR.createFromParcel(parcel), VdsMsgParcel.CREATOR.createFromParcel(parcel));
        }

        public Object[] newArray(int i) {
            return new VdsParcel[i];
        }
    }

    public VdsParcel(VdsHdrParcel vdsHdrParcel, VdsMsgParcel vdsMsgParcel) {
        C1241e.m3517j(vdsHdrParcel, "hdr");
        C1241e.m3517j(vdsMsgParcel, "msg");
        this.hdr = vdsHdrParcel;
        this.msg = vdsMsgParcel;
    }

    public static /* synthetic */ VdsParcel copy$default(VdsParcel vdsParcel, VdsHdrParcel vdsHdrParcel, VdsMsgParcel vdsMsgParcel, int i, Object obj) {
        if ((i & 1) != 0) {
            vdsHdrParcel = vdsParcel.hdr;
        }
        if ((i & 2) != 0) {
            vdsMsgParcel = vdsParcel.msg;
        }
        return vdsParcel.copy(vdsHdrParcel, vdsMsgParcel);
    }

    public final VdsHdrParcel component1() {
        return this.hdr;
    }

    public final VdsMsgParcel component2() {
        return this.msg;
    }

    public final VdsParcel copy(VdsHdrParcel vdsHdrParcel, VdsMsgParcel vdsMsgParcel) {
        C1241e.m3517j(vdsHdrParcel, "hdr");
        C1241e.m3517j(vdsMsgParcel, "msg");
        return new VdsParcel(vdsHdrParcel, vdsMsgParcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VdsParcel)) {
            return false;
        }
        VdsParcel vdsParcel = (VdsParcel) obj;
        return C1241e.m3513b(this.hdr, vdsParcel.hdr) && C1241e.m3513b(this.msg, vdsParcel.msg);
    }

    public final VdsHdrParcel getHdr() {
        return this.hdr;
    }

    public final VdsMsgParcel getMsg() {
        return this.msg;
    }

    public int hashCode() {
        return this.msg.hashCode() + (this.hdr.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("VdsParcel(hdr=");
        a.append(this.hdr);
        a.append(", msg=");
        a.append(this.msg);
        a.append(')');
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1241e.m3517j(parcel, "out");
        this.hdr.writeToParcel(parcel, i);
        this.msg.writeToParcel(parcel, i);
    }
}
