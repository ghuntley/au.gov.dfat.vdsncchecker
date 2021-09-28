package p009b;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p009b.C0522a;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: b.b */
public class C0525b implements Parcelable {
    public static final Parcelable.Creator<C0525b> CREATOR = new C0526a();

    /* renamed from: e */
    public C0522a f2306e;

    /* renamed from: b.b$a */
    public class C0526a implements Parcelable.Creator<C0525b> {
        public Object createFromParcel(Parcel parcel) {
            return new C0525b(parcel);
        }

        public Object[] newArray(int i) {
            return new C0525b[i];
        }
    }

    /* renamed from: b.b$b */
    public class C0527b extends C0522a.C0523a {
        public C0527b() {
        }
    }

    public C0525b(Parcel parcel) {
        C0522a aVar;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i = C0522a.C0523a.f2304a;
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C0522a)) ? new C0522a.C0523a.C0524a(readStrongBinder) : (C0522a) queryLocalInterface;
        }
        this.f2306e = aVar;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: j */
    public void mo62j(int i, Bundle bundle) {
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f2306e == null) {
                this.f2306e = new C0527b();
            }
            parcel.writeStrongBinder(this.f2306e.asBinder());
        }
    }
}
