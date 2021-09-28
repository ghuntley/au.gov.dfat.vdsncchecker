package p007au.gov.dfat.vdsncchecker.vds;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import p000a.C0001b;
import p025d3.C0802f;
import p072l2.C1241e;
import p077m1.C1428c;
import p155j$.time.LocalDate;
import p155j$.time.format.DateTimeFormatter;

@Keep
/* renamed from: au.gov.dfat.vdsncchecker.vds.VdsVdParcel */
public final class VdsVdParcel implements Parcelable {
    public static final Parcelable.Creator<VdsVdParcel> CREATOR = new C0520a();
    private final String adm;
    private final String ctr;
    private final LocalDate dvc;
    private final LocalDate dvn;
    private final String lot;
    private final long seq;

    /* renamed from: au.gov.dfat.vdsncchecker.vds.VdsVdParcel$a */
    public static final class C0520a implements Parcelable.Creator<VdsVdParcel> {
        public Object createFromParcel(Parcel parcel) {
            C1241e.m3517j(parcel, "parcel");
            C1241e.m3517j(parcel, "parcel");
            return new VdsVdParcel(parcel.readInt() != 0 ? LocalDate.parse(parcel.readString()) : null, parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), (LocalDate) parcel.readSerializable());
        }

        public Object[] newArray(int i) {
            return new VdsVdParcel[i];
        }
    }

    public VdsVdParcel(LocalDate localDate, long j, String str, String str2, String str3, LocalDate localDate2) {
        C1241e.m3517j(localDate, "dvc");
        C1241e.m3517j(str, "ctr");
        C1241e.m3517j(str2, "adm");
        C1241e.m3517j(str3, "lot");
        this.dvc = localDate;
        this.seq = j;
        this.ctr = str;
        this.adm = str2;
        this.lot = str3;
        this.dvn = localDate2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VdsVdParcel(LocalDate localDate, long j, String str, String str2, String str3, LocalDate localDate2, int i, C0802f fVar) {
        this(localDate, j, str, str2, str3, (i & 32) != 0 ? null : localDate2);
    }

    public static /* synthetic */ VdsVdParcel copy$default(VdsVdParcel vdsVdParcel, LocalDate localDate, long j, String str, String str2, String str3, LocalDate localDate2, int i, Object obj) {
        if ((i & 1) != 0) {
            localDate = vdsVdParcel.dvc;
        }
        if ((i & 2) != 0) {
            j = vdsVdParcel.seq;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str = vdsVdParcel.ctr;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = vdsVdParcel.adm;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = vdsVdParcel.lot;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            localDate2 = vdsVdParcel.dvn;
        }
        return vdsVdParcel.copy(localDate, j2, str4, str5, str6, localDate2);
    }

    public final LocalDate component1() {
        return this.dvc;
    }

    public final long component2() {
        return this.seq;
    }

    public final String component3() {
        return this.ctr;
    }

    public final String component4() {
        return this.adm;
    }

    public final String component5() {
        return this.lot;
    }

    public final LocalDate component6() {
        return this.dvn;
    }

    public final VdsVdParcel copy(LocalDate localDate, long j, String str, String str2, String str3, LocalDate localDate2) {
        C1241e.m3517j(localDate, "dvc");
        C1241e.m3517j(str, "ctr");
        C1241e.m3517j(str2, "adm");
        C1241e.m3517j(str3, "lot");
        return new VdsVdParcel(localDate, j, str, str2, str3, localDate2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VdsVdParcel)) {
            return false;
        }
        VdsVdParcel vdsVdParcel = (VdsVdParcel) obj;
        return C1241e.m3513b(this.dvc, vdsVdParcel.dvc) && this.seq == vdsVdParcel.seq && C1241e.m3513b(this.ctr, vdsVdParcel.ctr) && C1241e.m3513b(this.adm, vdsVdParcel.adm) && C1241e.m3513b(this.lot, vdsVdParcel.lot) && C1241e.m3513b(this.dvn, vdsVdParcel.dvn);
    }

    public final String getAdm() {
        return this.adm;
    }

    public final String getCtr() {
        return this.ctr;
    }

    public final LocalDate getDvc() {
        return this.dvc;
    }

    public final LocalDate getDvn() {
        return this.dvn;
    }

    public final String getLot() {
        return this.lot;
    }

    public final long getSeq() {
        return this.seq;
    }

    public int hashCode() {
        int a = C1428c.m4090a(this.lot, C1428c.m4090a(this.adm, C1428c.m4090a(this.ctr, (Long.hashCode(this.seq) + (this.dvc.hashCode() * 31)) * 31, 31), 31), 31);
        LocalDate localDate = this.dvn;
        return a + (localDate == null ? 0 : localDate.hashCode());
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("VdsVdParcel(dvc=");
        a.append(this.dvc);
        a.append(", seq=");
        a.append(this.seq);
        a.append(", ctr=");
        a.append(this.ctr);
        a.append(", adm=");
        a.append(this.adm);
        a.append(", lot=");
        a.append(this.lot);
        a.append(", dvn=");
        a.append(this.dvn);
        a.append(')');
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1241e.m3517j(parcel, "out");
        LocalDate localDate = this.dvc;
        C1241e.m3517j(parcel, "parcel");
        if (localDate != null) {
            parcel.writeInt(1);
            parcel.writeString(localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        } else {
            parcel.writeInt(0);
        }
        parcel.writeLong(this.seq);
        parcel.writeString(this.ctr);
        parcel.writeString(this.adm);
        parcel.writeString(this.lot);
        parcel.writeSerializable(this.dvn);
    }
}
