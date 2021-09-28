package android.support.p006v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
import p000a.C0001b;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0040a();

    /* renamed from: e */
    public final int f127e;

    /* renamed from: f */
    public final long f128f;

    /* renamed from: g */
    public final long f129g;

    /* renamed from: h */
    public final float f130h;

    /* renamed from: i */
    public final long f131i;

    /* renamed from: j */
    public final int f132j;

    /* renamed from: k */
    public final CharSequence f133k;

    /* renamed from: l */
    public final long f134l;

    /* renamed from: m */
    public List<CustomAction> f135m;

    /* renamed from: n */
    public final long f136n;

    /* renamed from: o */
    public final Bundle f137o;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0039a();

        /* renamed from: e */
        public final String f138e;

        /* renamed from: f */
        public final CharSequence f139f;

        /* renamed from: g */
        public final int f140g;

        /* renamed from: h */
        public final Bundle f141h;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        public static class C0039a implements Parcelable.Creator<CustomAction> {
            public Object createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            public Object[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f138e = parcel.readString();
            this.f139f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f140g = parcel.readInt();
            this.f141h = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder a = C0001b.m0a("Action:mName='");
            a.append(this.f139f);
            a.append(", mIcon=");
            a.append(this.f140g);
            a.append(", mExtras=");
            a.append(this.f141h);
            return a.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f138e);
            TextUtils.writeToParcel(this.f139f, parcel, i);
            parcel.writeInt(this.f140g);
            parcel.writeBundle(this.f141h);
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    public static class C0040a implements Parcelable.Creator<PlaybackStateCompat> {
        public Object createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        public Object[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f127e = parcel.readInt();
        this.f128f = parcel.readLong();
        this.f130h = parcel.readFloat();
        this.f134l = parcel.readLong();
        this.f129g = parcel.readLong();
        this.f131i = parcel.readLong();
        this.f133k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f135m = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f136n = parcel.readLong();
        this.f137o = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f132j = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f127e + ", position=" + this.f128f + ", buffered position=" + this.f129g + ", speed=" + this.f130h + ", updated=" + this.f134l + ", actions=" + this.f131i + ", error code=" + this.f132j + ", error message=" + this.f133k + ", custom actions=" + this.f135m + ", active item id=" + this.f136n + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f127e);
        parcel.writeLong(this.f128f);
        parcel.writeFloat(this.f130h);
        parcel.writeLong(this.f134l);
        parcel.writeLong(this.f129g);
        parcel.writeLong(this.f131i);
        TextUtils.writeToParcel(this.f133k, parcel, i);
        parcel.writeTypedList(this.f135m);
        parcel.writeLong(this.f136n);
        parcel.writeBundle(this.f137o);
        parcel.writeInt(this.f132j);
    }
}
