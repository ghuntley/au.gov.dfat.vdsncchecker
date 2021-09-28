package p136w0;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: w0.h */
public final class C2006h implements Parcelable {
    public static final Parcelable.Creator<C2006h> CREATOR = new C2007a();

    /* renamed from: e */
    public final UUID f5830e;

    /* renamed from: f */
    public final int f5831f;

    /* renamed from: g */
    public final Bundle f5832g;

    /* renamed from: h */
    public final Bundle f5833h;

    /* renamed from: w0.h$a */
    public class C2007a implements Parcelable.Creator<C2006h> {
        public Object createFromParcel(Parcel parcel) {
            return new C2006h(parcel);
        }

        public Object[] newArray(int i) {
            return new C2006h[i];
        }
    }

    public C2006h(Parcel parcel) {
        this.f5830e = UUID.fromString(parcel.readString());
        this.f5831f = parcel.readInt();
        this.f5832g = parcel.readBundle(C2006h.class.getClassLoader());
        this.f5833h = parcel.readBundle(C2006h.class.getClassLoader());
    }

    public C2006h(C2004g gVar) {
        this.f5830e = gVar.f5825i;
        this.f5831f = gVar.f5821e.f1742g;
        this.f5832g = gVar.f5822f;
        Bundle bundle = new Bundle();
        this.f5833h = bundle;
        gVar.f5824h.mo2b(bundle);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5830e.toString());
        parcel.writeInt(this.f5831f);
        parcel.writeBundle(this.f5832g);
        parcel.writeBundle(this.f5833h);
    }
}
