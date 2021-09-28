package p152z1;

import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: z1.t */
public class C2193t extends BaseAdapter {

    /* renamed from: j */
    public static final int f6312j = C2160a0.m5574e().getMaximum(4);

    /* renamed from: e */
    public final C2191s f6313e;

    /* renamed from: f */
    public final C2166d<?> f6314f;

    /* renamed from: g */
    public Collection<Long> f6315g;

    /* renamed from: h */
    public C2163c f6316h;

    /* renamed from: i */
    public final C2156a f6317i;

    public C2193t(C2191s sVar, C2166d<?> dVar, C2156a aVar) {
        this.f6313e = sVar;
        this.f6314f = dVar;
        this.f6317i = aVar;
        this.f6315g = dVar.mo6710i();
    }

    /* renamed from: a */
    public int mo6750a(int i) {
        return mo6751b() + (i - 1);
    }

    /* renamed from: b */
    public int mo6751b() {
        return this.f6313e.mo6743m();
    }

    /* renamed from: c */
    public Long getItem(int i) {
        if (i < this.f6313e.mo6743m() || i > mo6753d()) {
            return null;
        }
        C2191s sVar = this.f6313e;
        Calendar b = C2160a0.m5571b(sVar.f6305e);
        b.set(5, (i - sVar.mo6743m()) + 1);
        return Long.valueOf(b.getTimeInMillis());
    }

    /* renamed from: d */
    public int mo6753d() {
        return (this.f6313e.mo6743m() + this.f6313e.f6309i) - 1;
    }

    /* renamed from: e */
    public final void mo6754e(TextView textView, long j) {
        C2161b bVar;
        if (textView != null) {
            boolean z = false;
            if (this.f6317i.f6220g.mo6699f(j)) {
                textView.setEnabled(true);
                Iterator<Long> it = this.f6314f.mo6710i().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (C2160a0.m5570a(j) == C2160a0.m5570a(it.next().longValue())) {
                        z = true;
                        break;
                    }
                }
                bVar = z ? this.f6316h.f6240b : C2160a0.m5573d().getTimeInMillis() == j ? this.f6316h.f6241c : this.f6316h.f6239a;
            } else {
                textView.setEnabled(false);
                bVar = this.f6316h.f6245g;
            }
            bVar.mo6700b(textView);
        }
    }

    /* renamed from: f */
    public final void mo6755f(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (C2191s.m5625l(j).equals(this.f6313e)) {
            Calendar b = C2160a0.m5571b(this.f6313e.f6305e);
            b.setTimeInMillis(j);
            mo6754e((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().mo6750a(b.get(5)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    public int getCount() {
        return mo6751b() + this.f6313e.f6309i;
    }

    public long getItemId(int i) {
        return (long) (i / this.f6313e.f6308h);
    }

    /* JADX WARNING: type inference failed for: r10v11, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            r8 = this;
            android.content.Context r0 = r11.getContext()
            z1.c r1 = r8.f6316h
            if (r1 != 0) goto L_0x000f
            z1.c r1 = new z1.c
            r1.<init>(r0)
            r8.f6316h = r1
        L_0x000f:
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r10 != 0) goto L_0x0027
            android.content.Context r10 = r11.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            r0 = 2131492939(0x7f0c004b, float:1.8609344E38)
            android.view.View r10 = r10.inflate(r0, r11, r1)
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0027:
            int r10 = r8.mo6751b()
            int r10 = r9 - r10
            if (r10 < 0) goto L_0x00cf
            z1.s r11 = r8.f6313e
            int r2 = r11.f6309i
            if (r10 < r2) goto L_0x0037
            goto L_0x00cf
        L_0x0037:
            r2 = 1
            int r10 = r10 + r2
            r0.setTag(r11)
            android.content.res.Resources r11 = r0.getResources()
            android.content.res.Configuration r11 = r11.getConfiguration()
            java.util.Locale r11 = r11.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r11 = java.lang.String.format(r11, r4, r3)
            r0.setText(r11)
            z1.s r11 = r8.f6313e
            java.util.Calendar r11 = r11.f6305e
            java.util.Calendar r11 = p152z1.C2160a0.m5571b(r11)
            r3 = 5
            r11.set(r3, r10)
            long r10 = r11.getTimeInMillis()
            z1.s r4 = r8.f6313e
            int r4 = r4.f6307g
            java.util.Calendar r5 = p152z1.C2160a0.m5573d()
            r5.set(r3, r2)
            java.util.Calendar r5 = p152z1.C2160a0.m5571b(r5)
            r6 = 2
            r5.get(r6)
            int r6 = r5.get(r2)
            r7 = 7
            r5.getMaximum(r7)
            r5.getActualMaximum(r3)
            r5.getTimeInMillis()
            java.lang.String r3 = "UTC"
            if (r4 != r6) goto L_0x00a9
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.util.concurrent.atomic.AtomicReference<z1.z> r5 = p152z1.C2160a0.f6230a
            java.lang.String r5 = "MMMEd"
            android.icu.text.DateFormat r4 = android.icu.text.DateFormat.getInstanceForSkeleton(r5, r4)
            android.icu.util.TimeZone r3 = android.icu.util.TimeZone.getTimeZone(r3)
            r4.setTimeZone(r3)
            java.util.Date r3 = new java.util.Date
            r3.<init>(r10)
            java.lang.String r10 = r4.format(r3)
            goto L_0x00c5
        L_0x00a9:
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.util.concurrent.atomic.AtomicReference<z1.z> r5 = p152z1.C2160a0.f6230a
            java.lang.String r5 = "yMMMEd"
            android.icu.text.DateFormat r4 = android.icu.text.DateFormat.getInstanceForSkeleton(r5, r4)
            android.icu.util.TimeZone r3 = android.icu.util.TimeZone.getTimeZone(r3)
            r4.setTimeZone(r3)
            java.util.Date r3 = new java.util.Date
            r3.<init>(r10)
            java.lang.String r10 = r4.format(r3)
        L_0x00c5:
            r0.setContentDescription(r10)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x00d7
        L_0x00cf:
            r10 = 8
            r0.setVisibility(r10)
            r0.setEnabled(r1)
        L_0x00d7:
            java.lang.Long r9 = r8.getItem(r9)
            if (r9 != 0) goto L_0x00de
            goto L_0x00e5
        L_0x00de:
            long r9 = r9.longValue()
            r8.mo6754e(r0, r9)
        L_0x00e5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p152z1.C2193t.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public boolean hasStableIds() {
        return true;
    }
}
