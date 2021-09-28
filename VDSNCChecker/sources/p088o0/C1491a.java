package p088o0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: o0.a */
public abstract class C1491a implements Parcelable {
    public static final Parcelable.Creator<C1491a> CREATOR = new C1493b();

    /* renamed from: f */
    public static final C1491a f4650f = new C1492a();

    /* renamed from: e */
    public final Parcelable f4651e;

    /* renamed from: o0.a$a */
    public class C1492a extends C1491a {
        public C1492a() {
            super((C1492a) null);
        }
    }

    /* renamed from: o0.a$b */
    public class C1493b implements Parcelable.ClassLoaderCreator<C1491a> {
        public Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable((ClassLoader) null) == null) {
                return C1491a.f4650f;
            }
            throw new IllegalStateException("superState must be null");
        }

        public Object[] newArray(int i) {
            return new C1491a[i];
        }

        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return C1491a.f4650f;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public C1491a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f4651e = readParcelable == null ? f4650f : readParcelable;
    }

    public C1491a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f4651e = parcelable == f4650f ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public C1491a(C1492a aVar) {
        this.f4651e = null;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f4651e, i);
    }
}
