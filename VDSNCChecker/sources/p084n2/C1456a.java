package p084n2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p000a.C0001b;
import p088o0.C1491a;
import p093p.C1558h;

/* renamed from: n2.a */
public class C1456a extends C1491a {
    public static final Parcelable.Creator<C1456a> CREATOR = new C1457a();

    /* renamed from: g */
    public final C1558h<String, Bundle> f4589g;

    /* renamed from: n2.a$a */
    public static class C1457a implements Parcelable.ClassLoaderCreator<C1456a> {
        public Object createFromParcel(Parcel parcel) {
            return new C1456a(parcel, (ClassLoader) null, (C1457a) null);
        }

        public Object[] newArray(int i) {
            return new C1456a[i];
        }

        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C1456a(parcel, classLoader, (C1457a) null);
        }
    }

    public C1456a(Parcel parcel, ClassLoader classLoader, C1457a aVar) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f4589g = new C1558h<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f4589g.put(strArr[i], bundleArr[i]);
        }
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("ExtendableSavedState{");
        a.append(Integer.toHexString(System.identityHashCode(this)));
        a.append(" states=");
        a.append(this.f4589g);
        a.append("}");
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f4651e, i);
        int i2 = this.f4589g.f4840g;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = this.f4589g.mo5614i(i3);
            bundleArr[i3] = this.f4589g.mo5618l(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
