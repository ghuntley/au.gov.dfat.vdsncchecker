package p152z1;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p058j0.C1043a;
import p058j0.C1061o;
import p058j0.C1070q;
import p152z1.C2170g;

/* renamed from: z1.v */
public class C2195v extends RecyclerView.C0389d<C2196a> {

    /* renamed from: c */
    public final Context f6320c;

    /* renamed from: d */
    public final C2156a f6321d;

    /* renamed from: e */
    public final C2166d<?> f6322e;

    /* renamed from: f */
    public final C2170g.C2175e f6323f;

    /* renamed from: g */
    public final int f6324g;

    /* renamed from: z1.v$a */
    public static class C2196a extends RecyclerView.C0422z {

        /* renamed from: t */
        public final TextView f6325t;

        /* renamed from: u */
        public final MaterialCalendarGridView f6326u;

        public C2196a(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            Object obj;
            boolean z2;
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f6325t = textView;
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            Class<Boolean> cls = Boolean.class;
            Boolean bool = Boolean.TRUE;
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                textView.setAccessibilityHeading(true);
            } else {
                if (i >= 28) {
                    obj = Boolean.valueOf(textView.isAccessibilityHeading());
                } else {
                    Object tag = textView.getTag(R.id.tag_accessibility_heading);
                    obj = cls.isInstance(tag) ? tag : null;
                }
                Boolean bool2 = (Boolean) obj;
                if (bool2 == null) {
                    z2 = false;
                } else {
                    z2 = bool2.booleanValue();
                }
                if (!(z2 == (bool != null))) {
                    C1043a e = C1061o.m3024e(textView);
                    C1061o.m3034o(textView, e == null ? new C1043a() : e);
                    textView.setTag(R.id.tag_accessibility_heading, bool);
                    C1061o.m3028i(textView, 0);
                }
            }
            this.f6326u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    public C2195v(Context context, C2166d<?> dVar, C2156a aVar, C2170g.C2175e eVar) {
        C2191s sVar = aVar.f6218e;
        C2191s sVar2 = aVar.f6219f;
        C2191s sVar3 = aVar.f6221h;
        if (sVar.compareTo(sVar3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (sVar3.compareTo(sVar2) <= 0) {
            int i = C2193t.f6312j;
            int i2 = C2170g.f6253k0;
            int dimensionPixelSize = i * context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
            int dimensionPixelSize2 = C2183o.m5607q0(context) ? context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0;
            this.f6320c = context;
            this.f6324g = dimensionPixelSize + dimensionPixelSize2;
            this.f6321d = aVar;
            this.f6322e = dVar;
            this.f6323f = eVar;
            if (!this.f1903a.mo2133a()) {
                this.f1904b = true;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* renamed from: a */
    public int mo2129a() {
        return this.f6321d.f6223j;
    }

    /* renamed from: b */
    public long mo2130b(int i) {
        return this.f6321d.f6218e.mo6745o(i).f6305e.getTimeInMillis();
    }

    /* renamed from: c */
    public void mo2131c(RecyclerView.C0422z zVar, int i) {
        C2196a aVar = (C2196a) zVar;
        C2191s o = this.f6321d.f6218e.mo6745o(i);
        aVar.f6325t.setText(o.mo6744n(aVar.f1991a.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.f6326u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !o.equals(materialCalendarGridView.getAdapter().f6313e)) {
            C2193t tVar = new C2193t(o, this.f6322e, this.f6321d);
            materialCalendarGridView.setNumColumns(o.f6308h);
            materialCalendarGridView.setAdapter((ListAdapter) tVar);
        } else {
            materialCalendarGridView.invalidate();
            C2193t a = materialCalendarGridView.getAdapter();
            for (Long longValue : a.f6315g) {
                a.mo6755f(materialCalendarGridView, longValue.longValue());
            }
            C2166d<?> dVar = a.f6314f;
            if (dVar != null) {
                for (Long longValue2 : dVar.mo6710i()) {
                    a.mo6755f(materialCalendarGridView, longValue2.longValue());
                }
                a.f6315g = a.f6314f.mo6710i();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new C2194u(this, materialCalendarGridView));
    }

    /* renamed from: d */
    public RecyclerView.C0422z mo2132d(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C2183o.m5607q0(viewGroup.getContext())) {
            return new C2196a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.C0405m(-1, this.f6324g));
        return new C2196a(linearLayout, true);
    }

    /* renamed from: e */
    public C2191s mo6762e(int i) {
        return this.f6321d.f6218e.mo6745o(i);
    }

    /* renamed from: f */
    public int mo6763f(C2191s sVar) {
        return this.f6321d.f6218e.mo6746p(sVar);
    }
}
