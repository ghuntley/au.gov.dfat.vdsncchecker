package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0302r;
import java.util.ArrayList;
import p106r0.C1654n;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.s */
public final class C0319s implements Parcelable {
    public static final Parcelable.Creator<C0319s> CREATOR = new C0320a();

    /* renamed from: e */
    public ArrayList<C1654n> f1573e;

    /* renamed from: f */
    public ArrayList<String> f1574f;

    /* renamed from: g */
    public C0271b[] f1575g;

    /* renamed from: h */
    public int f1576h;

    /* renamed from: i */
    public String f1577i = null;

    /* renamed from: j */
    public ArrayList<String> f1578j = new ArrayList<>();

    /* renamed from: k */
    public ArrayList<Bundle> f1579k = new ArrayList<>();

    /* renamed from: l */
    public ArrayList<C0302r.C0314l> f1580l;

    /* renamed from: androidx.fragment.app.s$a */
    public class C0320a implements Parcelable.Creator<C0319s> {
        public Object createFromParcel(Parcel parcel) {
            return new C0319s(parcel);
        }

        public Object[] newArray(int i) {
            return new C0319s[i];
        }
    }

    public C0319s() {
    }

    public C0319s(Parcel parcel) {
        this.f1573e = parcel.createTypedArrayList(C1654n.CREATOR);
        this.f1574f = parcel.createStringArrayList();
        this.f1575g = (C0271b[]) parcel.createTypedArray(C0271b.CREATOR);
        this.f1576h = parcel.readInt();
        this.f1577i = parcel.readString();
        this.f1578j = parcel.createStringArrayList();
        this.f1579k = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f1580l = parcel.createTypedArrayList(C0302r.C0314l.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f1573e);
        parcel.writeStringList(this.f1574f);
        parcel.writeTypedArray(this.f1575g, i);
        parcel.writeInt(this.f1576h);
        parcel.writeString(this.f1577i);
        parcel.writeStringList(this.f1578j);
        parcel.writeTypedList(this.f1579k);
        parcel.writeTypedList(this.f1580l);
    }
}
