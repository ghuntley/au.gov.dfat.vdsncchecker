package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.C0323u;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.b */
public final class C0271b implements Parcelable {
    public static final Parcelable.Creator<C0271b> CREATOR = new C0272a();

    /* renamed from: e */
    public final int[] f1385e;

    /* renamed from: f */
    public final ArrayList<String> f1386f;

    /* renamed from: g */
    public final int[] f1387g;

    /* renamed from: h */
    public final int[] f1388h;

    /* renamed from: i */
    public final int f1389i;

    /* renamed from: j */
    public final String f1390j;

    /* renamed from: k */
    public final int f1391k;

    /* renamed from: l */
    public final int f1392l;

    /* renamed from: m */
    public final CharSequence f1393m;

    /* renamed from: n */
    public final int f1394n;

    /* renamed from: o */
    public final CharSequence f1395o;

    /* renamed from: p */
    public final ArrayList<String> f1396p;

    /* renamed from: q */
    public final ArrayList<String> f1397q;

    /* renamed from: r */
    public final boolean f1398r;

    /* renamed from: androidx.fragment.app.b$a */
    public class C0272a implements Parcelable.Creator<C0271b> {
        public Object createFromParcel(Parcel parcel) {
            return new C0271b(parcel);
        }

        public Object[] newArray(int i) {
            return new C0271b[i];
        }
    }

    public C0271b(Parcel parcel) {
        this.f1385e = parcel.createIntArray();
        this.f1386f = parcel.createStringArrayList();
        this.f1387g = parcel.createIntArray();
        this.f1388h = parcel.createIntArray();
        this.f1389i = parcel.readInt();
        this.f1390j = parcel.readString();
        this.f1391k = parcel.readInt();
        this.f1392l = parcel.readInt();
        this.f1393m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1394n = parcel.readInt();
        this.f1395o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1396p = parcel.createStringArrayList();
        this.f1397q = parcel.createStringArrayList();
        this.f1398r = parcel.readInt() != 0;
    }

    public C0271b(C0262a aVar) {
        int size = aVar.f1587a.size();
        this.f1385e = new int[(size * 5)];
        if (aVar.f1593g) {
            this.f1386f = new ArrayList<>(size);
            this.f1387g = new int[size];
            this.f1388h = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C0323u.C0324a aVar2 = aVar.f1587a.get(i);
                int i3 = i2 + 1;
                this.f1385e[i2] = aVar2.f1603a;
                ArrayList<String> arrayList = this.f1386f;
                C0286k kVar = aVar2.f1604b;
                arrayList.add(kVar != null ? kVar.f1460i : null);
                int[] iArr = this.f1385e;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f1605c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f1606d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f1607e;
                iArr[i6] = aVar2.f1608f;
                this.f1387g[i] = aVar2.f1609g.ordinal();
                this.f1388h[i] = aVar2.f1610h.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.f1389i = aVar.f1592f;
            this.f1390j = aVar.f1595i;
            this.f1391k = aVar.f1357s;
            this.f1392l = aVar.f1596j;
            this.f1393m = aVar.f1597k;
            this.f1394n = aVar.f1598l;
            this.f1395o = aVar.f1599m;
            this.f1396p = aVar.f1600n;
            this.f1397q = aVar.f1601o;
            this.f1398r = aVar.f1602p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1385e);
        parcel.writeStringList(this.f1386f);
        parcel.writeIntArray(this.f1387g);
        parcel.writeIntArray(this.f1388h);
        parcel.writeInt(this.f1389i);
        parcel.writeString(this.f1390j);
        parcel.writeInt(this.f1391k);
        parcel.writeInt(this.f1392l);
        TextUtils.writeToParcel(this.f1393m, parcel, 0);
        parcel.writeInt(this.f1394n);
        TextUtils.writeToParcel(this.f1395o, parcel, 0);
        parcel.writeStringList(this.f1396p);
        parcel.writeStringList(this.f1397q);
        parcel.writeInt(this.f1398r ? 1 : 0);
    }
}
