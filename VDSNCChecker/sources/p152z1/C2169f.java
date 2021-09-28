package p152z1;

import android.os.Build;
import android.widget.BaseAdapter;
import java.util.Calendar;

/* renamed from: z1.f */
public class C2169f extends BaseAdapter {

    /* renamed from: h */
    public static final int f6249h = (Build.VERSION.SDK_INT >= 26 ? 4 : 1);

    /* renamed from: e */
    public final Calendar f6250e;

    /* renamed from: f */
    public final int f6251f;

    /* renamed from: g */
    public final int f6252g;

    public C2169f() {
        Calendar e = C2160a0.m5574e();
        this.f6250e = e;
        this.f6251f = e.getMaximum(7);
        this.f6252g = e.getFirstDayOfWeek();
    }

    public int getCount() {
        return this.f6251f;
    }

    public Object getItem(int i) {
        int i2 = this.f6251f;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f6252g;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    public long getItemId(int i) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x0018
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r0 = 2131492940(0x7f0c004c, float:1.8609346E38)
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0018:
            java.util.Calendar r7 = r5.f6250e
            int r2 = r5.f6252g
            int r6 = r6 + r2
            int r2 = r5.f6251f
            if (r6 <= r2) goto L_0x0022
            int r6 = r6 - r2
        L_0x0022:
            r2 = 7
            r7.set(r2, r6)
            android.content.res.Resources r6 = r0.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            java.util.Locale r6 = r6.locale
            java.util.Calendar r7 = r5.f6250e
            int r3 = f6249h
            java.lang.String r6 = r7.getDisplayName(r2, r3, r6)
            r0.setText(r6)
            android.content.Context r6 = r8.getContext()
            r7 = 2131886181(0x7f120065, float:1.9406934E38)
            java.lang.String r6 = r6.getString(r7)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.util.Calendar r8 = r5.f6250e
            r3 = 2
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r8 = r8.getDisplayName(r2, r3, r4)
            r7[r1] = r8
            java.lang.String r6 = java.lang.String.format(r6, r7)
            r0.setContentDescription(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p152z1.C2169f.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
