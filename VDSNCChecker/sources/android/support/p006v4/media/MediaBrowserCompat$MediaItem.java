package android.support.p006v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0030a();

    /* renamed from: e */
    public final int f103e;

    /* renamed from: f */
    public final MediaDescriptionCompat f104f;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
    public static class C0030a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        public Object createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        public Object[] newArray(int i) {
            return new MediaBrowserCompat$MediaItem[i];
        }
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f103e = parcel.readInt();
        this.f104f = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{" + "mFlags=" + this.f103e + ", mDescription=" + this.f104f + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f103e);
        this.f104f.writeToParcel(parcel, i);
    }
}
