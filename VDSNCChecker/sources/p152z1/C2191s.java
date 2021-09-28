package p152z1;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* renamed from: z1.s */
public final class C2191s implements Comparable<C2191s>, Parcelable {
    public static final Parcelable.Creator<C2191s> CREATOR = new C2192a();

    /* renamed from: e */
    public final Calendar f6305e;

    /* renamed from: f */
    public final int f6306f;

    /* renamed from: g */
    public final int f6307g;

    /* renamed from: h */
    public final int f6308h;

    /* renamed from: i */
    public final int f6309i;

    /* renamed from: j */
    public final long f6310j;

    /* renamed from: k */
    public String f6311k;

    /* renamed from: z1.s$a */
    public static class C2192a implements Parcelable.Creator<C2191s> {
        public Object createFromParcel(Parcel parcel) {
            return C2191s.m5624k(parcel.readInt(), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new C2191s[i];
        }
    }

    public C2191s(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b = C2160a0.m5571b(calendar);
        this.f6305e = b;
        this.f6306f = b.get(2);
        this.f6307g = b.get(1);
        this.f6308h = b.getMaximum(7);
        this.f6309i = b.getActualMaximum(5);
        this.f6310j = b.getTimeInMillis();
    }

    /* renamed from: k */
    public static C2191s m5624k(int i, int i2) {
        Calendar e = C2160a0.m5574e();
        e.set(1, i);
        e.set(2, i2);
        return new C2191s(e);
    }

    /* renamed from: l */
    public static C2191s m5625l(long j) {
        Calendar e = C2160a0.m5574e();
        e.setTimeInMillis(j);
        return new C2191s(e);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2191s)) {
            return false;
        }
        C2191s sVar = (C2191s) obj;
        return this.f6306f == sVar.f6306f && this.f6307g == sVar.f6307g;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6306f), Integer.valueOf(this.f6307g)});
    }

    /* renamed from: j */
    public int compareTo(C2191s sVar) {
        return this.f6305e.compareTo(sVar.f6305e);
    }

    /* renamed from: m */
    public int mo6743m() {
        int firstDayOfWeek = this.f6305e.get(7) - this.f6305e.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f6308h : firstDayOfWeek;
    }

    /* renamed from: n */
    public String mo6744n(Context context) {
        if (this.f6311k == null) {
            long timeInMillis = this.f6305e.getTimeInMillis();
            this.f6311k = DateUtils.formatDateTime(context, timeInMillis - ((long) TimeZone.getDefault().getOffset(timeInMillis)), 36);
        }
        return this.f6311k;
    }

    /* renamed from: o */
    public C2191s mo6745o(int i) {
        Calendar b = C2160a0.m5571b(this.f6305e);
        b.add(2, i);
        return new C2191s(b);
    }

    /* renamed from: p */
    public int mo6746p(C2191s sVar) {
        if (this.f6305e instanceof GregorianCalendar) {
            return (sVar.f6306f - this.f6306f) + ((sVar.f6307g - this.f6307g) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6307g);
        parcel.writeInt(this.f6306f);
    }
}
