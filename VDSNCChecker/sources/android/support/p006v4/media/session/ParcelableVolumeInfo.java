package android.support.p006v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0038a();

    /* renamed from: e */
    public int f122e;

    /* renamed from: f */
    public int f123f;

    /* renamed from: g */
    public int f124g;

    /* renamed from: h */
    public int f125h;

    /* renamed from: i */
    public int f126i;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    public static class C0038a implements Parcelable.Creator<ParcelableVolumeInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f122e = parcel.readInt();
        this.f124g = parcel.readInt();
        this.f125h = parcel.readInt();
        this.f126i = parcel.readInt();
        this.f123f = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f122e);
        parcel.writeInt(this.f124g);
        parcel.writeInt(this.f125h);
        parcel.writeInt(this.f126i);
        parcel.writeInt(this.f123f);
    }
}
