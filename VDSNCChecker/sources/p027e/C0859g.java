package p027e;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: e.g */
public final class C0859g implements Parcelable {
    public static final Parcelable.Creator<C0859g> CREATOR = new C0860a();

    /* renamed from: e */
    public final IntentSender f3309e;

    /* renamed from: f */
    public final Intent f3310f;

    /* renamed from: g */
    public final int f3311g;

    /* renamed from: h */
    public final int f3312h;

    /* renamed from: e.g$a */
    public class C0860a implements Parcelable.Creator<C0859g> {
        public Object createFromParcel(Parcel parcel) {
            return new C0859g(parcel);
        }

        public Object[] newArray(int i) {
            return new C0859g[i];
        }
    }

    public C0859g(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f3309e = intentSender;
        this.f3310f = intent;
        this.f3311g = i;
        this.f3312h = i2;
    }

    public C0859g(Parcel parcel) {
        this.f3309e = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f3310f = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f3311g = parcel.readInt();
        this.f3312h = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3309e, i);
        parcel.writeParcelable(this.f3310f, i);
        parcel.writeInt(this.f3311g);
        parcel.writeInt(this.f3312h);
    }
}
