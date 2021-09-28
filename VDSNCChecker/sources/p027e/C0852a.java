package p027e;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p000a.C0001b;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: e.a */
public final class C0852a implements Parcelable {
    public static final Parcelable.Creator<C0852a> CREATOR = new C0853a();

    /* renamed from: e */
    public final int f3303e;

    /* renamed from: f */
    public final Intent f3304f;

    /* renamed from: e.a$a */
    public class C0853a implements Parcelable.Creator<C0852a> {
        public Object createFromParcel(Parcel parcel) {
            return new C0852a(parcel);
        }

        public Object[] newArray(int i) {
            return new C0852a[i];
        }
    }

    public C0852a(int i, Intent intent) {
        this.f3303e = i;
        this.f3304f = intent;
    }

    public C0852a(Parcel parcel) {
        this.f3303e = parcel.readInt();
        this.f3304f = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("ActivityResult{resultCode=");
        int i = this.f3303e;
        a.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        a.append(", data=");
        a.append(this.f3304f);
        a.append('}');
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3303e);
        parcel.writeInt(this.f3304f == null ? 0 : 1);
        Intent intent = this.f3304f;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
