package p009b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Objects;
import p009b.C0525b;

/* renamed from: b.a */
public interface C0522a extends IInterface {

    /* renamed from: b.a$a */
    public static abstract class C0523a extends Binder implements C0522a {

        /* renamed from: a */
        public static final /* synthetic */ int f2304a = 0;

        /* renamed from: b.a$a$a */
        public static class C0524a implements C0522a {

            /* renamed from: a */
            public IBinder f2305a;

            public C0524a(IBinder iBinder) {
                this.f2305a = iBinder;
            }

            public IBinder asBinder() {
                return this.f2305a;
            }
        }

        public C0523a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                int readInt = parcel.readInt();
                Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                C0525b.C0527b bVar = (C0525b.C0527b) this;
                Objects.requireNonNull(C0525b.this);
                C0525b.this.mo62j(readInt, bundle);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }
}
