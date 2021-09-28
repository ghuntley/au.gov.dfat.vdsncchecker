package android.support.p006v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.p006v4.media.MediaDescriptionCompat;
import p000a.C0001b;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0035a();

        /* renamed from: e */
        public final MediaDescriptionCompat f117e;

        /* renamed from: f */
        public final long f118f;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        public static class C0035a implements Parcelable.Creator<QueueItem> {
            public Object createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            public Object[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        public QueueItem(Parcel parcel) {
            this.f117e = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f118f = parcel.readLong();
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder a = C0001b.m0a("MediaSession.QueueItem {Description=");
            a.append(this.f117e);
            a.append(", Id=");
            a.append(this.f118f);
            a.append(" }");
            return a.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f117e.writeToParcel(parcel, i);
            parcel.writeLong(this.f118f);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0036a();

        /* renamed from: e */
        public ResultReceiver f119e;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        public static class C0036a implements Parcelable.Creator<ResultReceiverWrapper> {
            public Object createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            public Object[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f119e = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f119e.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0037a();

        /* renamed from: e */
        public final Object f120e;

        /* renamed from: f */
        public C0041a f121f = null;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        public static class C0037a implements Parcelable.Creator<Token> {
            public Object createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable((ClassLoader) null));
            }

            public Object[] newArray(int i) {
                return new Token[i];
            }
        }

        public Token(Object obj) {
            this.f120e = obj;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Object obj2 = this.f120e;
            Object obj3 = ((Token) obj).f120e;
            if (obj2 == null) {
                return obj3 == null;
            }
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f120e;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.f120e, i);
        }
    }

    /* renamed from: a */
    public static void m70a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
