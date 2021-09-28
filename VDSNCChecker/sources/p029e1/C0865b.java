package p029e1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p093p.C1545a;
import p099q.C1589b;

/* renamed from: e1.b */
public class C0865b extends C0864a {

    /* renamed from: d */
    public final SparseIntArray f3316d;

    /* renamed from: e */
    public final Parcel f3317e;

    /* renamed from: f */
    public final int f3318f;

    /* renamed from: g */
    public final int f3319g;

    /* renamed from: h */
    public final String f3320h;

    /* renamed from: i */
    public int f3321i;

    /* renamed from: j */
    public int f3322j;

    /* renamed from: k */
    public int f3323k;

    public C0865b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1545a(), new C1545a(), new C1545a());
    }

    public C0865b(Parcel parcel, int i, int i2, String str, C1545a<String, Method> aVar, C1545a<String, Method> aVar2, C1545a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f3316d = new SparseIntArray();
        this.f3321i = -1;
        this.f3322j = 0;
        this.f3323k = -1;
        this.f3317e = parcel;
        this.f3318f = i;
        this.f3319g = i2;
        this.f3322j = i;
        this.f3320h = str;
    }

    /* renamed from: a */
    public void mo4141a() {
        int i = this.f3321i;
        if (i >= 0) {
            int i2 = this.f3316d.get(i);
            int dataPosition = this.f3317e.dataPosition();
            this.f3317e.setDataPosition(i2);
            this.f3317e.writeInt(dataPosition - i2);
            this.f3317e.setDataPosition(dataPosition);
        }
    }

    /* renamed from: b */
    public C0864a mo4142b() {
        Parcel parcel = this.f3317e;
        int dataPosition = parcel.dataPosition();
        int i = this.f3322j;
        if (i == this.f3318f) {
            i = this.f3319g;
        }
        return new C0865b(parcel, dataPosition, i, C1589b.m4444a(new StringBuilder(), this.f3320h, "  "), this.f3313a, this.f3314b, this.f3315c);
    }

    /* renamed from: f */
    public boolean mo4146f() {
        return this.f3317e.readInt() != 0;
    }

    /* renamed from: g */
    public byte[] mo4147g() {
        int readInt = this.f3317e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f3317e.readByteArray(bArr);
        return bArr;
    }

    /* renamed from: h */
    public CharSequence mo4148h() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f3317e);
    }

    /* renamed from: i */
    public boolean mo4149i(int i) {
        while (this.f3322j < this.f3319g) {
            int i2 = this.f3323k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f3317e.setDataPosition(this.f3322j);
            int readInt = this.f3317e.readInt();
            this.f3323k = this.f3317e.readInt();
            this.f3322j += readInt;
        }
        return this.f3323k == i;
    }

    /* renamed from: j */
    public int mo4150j() {
        return this.f3317e.readInt();
    }

    /* renamed from: l */
    public <T extends Parcelable> T mo4152l() {
        return this.f3317e.readParcelable(C0865b.class.getClassLoader());
    }

    /* renamed from: n */
    public String mo4154n() {
        return this.f3317e.readString();
    }

    /* renamed from: p */
    public void mo4156p(int i) {
        mo4141a();
        this.f3321i = i;
        this.f3316d.put(i, this.f3317e.dataPosition());
        this.f3317e.writeInt(0);
        this.f3317e.writeInt(i);
    }

    /* renamed from: q */
    public void mo4157q(boolean z) {
        this.f3317e.writeInt(z ? 1 : 0);
    }

    /* renamed from: r */
    public void mo4158r(byte[] bArr) {
        if (bArr != null) {
            this.f3317e.writeInt(bArr.length);
            this.f3317e.writeByteArray(bArr);
            return;
        }
        this.f3317e.writeInt(-1);
    }

    /* renamed from: s */
    public void mo4159s(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f3317e, 0);
    }

    /* renamed from: t */
    public void mo4160t(int i) {
        this.f3317e.writeInt(i);
    }

    /* renamed from: u */
    public void mo4161u(Parcelable parcelable) {
        this.f3317e.writeParcelable(parcelable, 0);
    }

    /* renamed from: v */
    public void mo4162v(String str) {
        this.f3317e.writeString(str);
    }
}
