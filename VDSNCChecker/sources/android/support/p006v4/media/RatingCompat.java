package android.support.p006v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import p000a.C0001b;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0033a();

    /* renamed from: e */
    public final int f115e;

    /* renamed from: f */
    public final float f116f;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    public static class C0033a implements Parcelable.Creator<RatingCompat> {
        public Object createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        public Object[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    public RatingCompat(int i, float f) {
        this.f115e = i;
        this.f116f = f;
    }

    public int describeContents() {
        return this.f115e;
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("Rating:style=");
        a.append(this.f115e);
        a.append(" rating=");
        float f = this.f116f;
        a.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f115e);
        parcel.writeFloat(this.f116f);
    }
}
