package p106r0;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0286k;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: r0.n */
public final class C1654n implements Parcelable {
    public static final Parcelable.Creator<C1654n> CREATOR = new C1655a();

    /* renamed from: e */
    public final String f5056e;

    /* renamed from: f */
    public final String f5057f;

    /* renamed from: g */
    public final boolean f5058g;

    /* renamed from: h */
    public final int f5059h;

    /* renamed from: i */
    public final int f5060i;

    /* renamed from: j */
    public final String f5061j;

    /* renamed from: k */
    public final boolean f5062k;

    /* renamed from: l */
    public final boolean f5063l;

    /* renamed from: m */
    public final boolean f5064m;

    /* renamed from: n */
    public final Bundle f5065n;

    /* renamed from: o */
    public final boolean f5066o;

    /* renamed from: p */
    public final int f5067p;

    /* renamed from: q */
    public Bundle f5068q;

    /* renamed from: r0.n$a */
    public class C1655a implements Parcelable.Creator<C1654n> {
        public Object createFromParcel(Parcel parcel) {
            return new C1654n(parcel);
        }

        public Object[] newArray(int i) {
            return new C1654n[i];
        }
    }

    public C1654n(Parcel parcel) {
        this.f5056e = parcel.readString();
        this.f5057f = parcel.readString();
        boolean z = true;
        this.f5058g = parcel.readInt() != 0;
        this.f5059h = parcel.readInt();
        this.f5060i = parcel.readInt();
        this.f5061j = parcel.readString();
        this.f5062k = parcel.readInt() != 0;
        this.f5063l = parcel.readInt() != 0;
        this.f5064m = parcel.readInt() != 0;
        this.f5065n = parcel.readBundle();
        this.f5066o = parcel.readInt() == 0 ? false : z;
        this.f5068q = parcel.readBundle();
        this.f5067p = parcel.readInt();
    }

    public C1654n(C0286k kVar) {
        this.f5056e = kVar.getClass().getName();
        this.f5057f = kVar.f1460i;
        this.f5058g = kVar.f1468q;
        this.f5059h = kVar.f1477z;
        this.f5060i = kVar.f1432A;
        this.f5061j = kVar.f1433B;
        this.f5062k = kVar.f1436E;
        this.f5063l = kVar.f1467p;
        this.f5064m = kVar.f1435D;
        this.f5065n = kVar.f1461j;
        this.f5066o = kVar.f1434C;
        this.f5067p = kVar.f1448Q.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f5056e);
        sb.append(" (");
        sb.append(this.f5057f);
        sb.append(")}:");
        if (this.f5058g) {
            sb.append(" fromLayout");
        }
        if (this.f5060i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f5060i));
        }
        String str = this.f5061j;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f5061j);
        }
        if (this.f5062k) {
            sb.append(" retainInstance");
        }
        if (this.f5063l) {
            sb.append(" removing");
        }
        if (this.f5064m) {
            sb.append(" detached");
        }
        if (this.f5066o) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5056e);
        parcel.writeString(this.f5057f);
        parcel.writeInt(this.f5058g ? 1 : 0);
        parcel.writeInt(this.f5059h);
        parcel.writeInt(this.f5060i);
        parcel.writeString(this.f5061j);
        parcel.writeInt(this.f5062k ? 1 : 0);
        parcel.writeInt(this.f5063l ? 1 : 0);
        parcel.writeInt(this.f5064m ? 1 : 0);
        parcel.writeBundle(this.f5065n);
        parcel.writeInt(this.f5066o ? 1 : 0);
        parcel.writeBundle(this.f5068q);
        parcel.writeInt(this.f5067p);
    }
}
