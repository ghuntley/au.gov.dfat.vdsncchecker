package p152z1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p058j0.C1043a;
import p064k0.C1150b;

/* renamed from: z1.g */
public final class C2170g<S> extends C2198x<S> {

    /* renamed from: k0 */
    public static final /* synthetic */ int f6253k0 = 0;

    /* renamed from: a0 */
    public int f6254a0;

    /* renamed from: b0 */
    public C2166d<S> f6255b0;

    /* renamed from: c0 */
    public C2156a f6256c0;

    /* renamed from: d0 */
    public C2191s f6257d0;

    /* renamed from: e0 */
    public int f6258e0;

    /* renamed from: f0 */
    public C2163c f6259f0;

    /* renamed from: g0 */
    public RecyclerView f6260g0;

    /* renamed from: h0 */
    public RecyclerView f6261h0;

    /* renamed from: i0 */
    public View f6262i0;

    /* renamed from: j0 */
    public View f6263j0;

    /* renamed from: z1.g$a */
    public class C2171a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ int f6264e;

        public C2171a(int i) {
            this.f6264e = i;
        }

        public void run() {
            RecyclerView.C0400l lVar;
            RecyclerView recyclerView = C2170g.this.f6261h0;
            int i = this.f6264e;
            if (!recyclerView.f1900z && (lVar = recyclerView.f1881p) != null) {
                lVar.mo1925G0(recyclerView, recyclerView.f1866h0, i);
            }
        }
    }

    /* renamed from: z1.g$b */
    public class C2172b extends C1043a {
        public C2172b(C2170g gVar) {
        }

        /* renamed from: d */
        public void mo1508d(View view, C1150b bVar) {
            this.f3779a.onInitializeAccessibilityNodeInfo(view, bVar.f4005a);
            bVar.mo4768i((Object) null);
        }
    }

    /* renamed from: z1.g$c */
    public class C2173c extends C2199y {

        /* renamed from: E */
        public final /* synthetic */ int f6266E;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2173c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f6266E = i2;
        }

        /* renamed from: J0 */
        public void mo1926J0(RecyclerView.C0419w wVar, int[] iArr) {
            if (this.f6266E == 0) {
                iArr[0] = C2170g.this.f6261h0.getWidth();
                iArr[1] = C2170g.this.f6261h0.getWidth();
                return;
            }
            iArr[0] = C2170g.this.f6261h0.getHeight();
            iArr[1] = C2170g.this.f6261h0.getHeight();
        }
    }

    /* renamed from: z1.g$d */
    public class C2174d implements C2175e {
        public C2174d() {
        }
    }

    /* renamed from: z1.g$e */
    public interface C2175e {
    }

    /* renamed from: H */
    public void mo1589H(Bundle bundle) {
        super.mo1589H(bundle);
        if (bundle == null) {
            bundle = this.f1461j;
        }
        this.f6254a0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f6255b0 = (C2166d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f6256c0 = (C2156a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f6257d0 = (C2191s) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x013f, code lost:
        r13 = new androidx.recyclerview.widget.C0476v();
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo1591J(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            r10 = this;
            android.view.ContextThemeWrapper r13 = new android.view.ContextThemeWrapper
            android.content.Context r0 = r10.mo1623i()
            int r1 = r10.f6254a0
            r13.<init>(r0, r1)
            z1.c r0 = new z1.c
            r0.<init>(r13)
            r10.f6259f0 = r0
            android.view.LayoutInflater r11 = r11.cloneInContext(r13)
            z1.a r0 = r10.f6256c0
            z1.s r0 = r0.f6218e
            boolean r1 = p152z1.C2183o.m5607q0(r13)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0027
            r1 = 2131492947(0x7f0c0053, float:1.860936E38)
            r9 = r2
            goto L_0x002b
        L_0x0027:
            r1 = 2131492942(0x7f0c004e, float:1.860935E38)
            r9 = r3
        L_0x002b:
            android.view.View r11 = r11.inflate(r1, r12, r3)
            r12 = 2131296565(0x7f090135, float:1.821105E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.GridView r12 = (android.widget.GridView) r12
            z1.g$b r1 = new z1.g$b
            r1.<init>(r10)
            p058j0.C1061o.m3034o(r12, r1)
            z1.f r1 = new z1.f
            r1.<init>()
            r12.setAdapter(r1)
            int r0 = r0.f6308h
            r12.setNumColumns(r0)
            r12.setEnabled(r3)
            r12 = 2131296568(0x7f090138, float:1.8211056E38)
            android.view.View r12 = r11.findViewById(r12)
            androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12
            r10.f6261h0 = r12
            z1.g$c r12 = new z1.g$c
            android.content.Context r6 = r10.mo1623i()
            r8 = 0
            r4 = r12
            r5 = r10
            r7 = r9
            r4.<init>(r6, r7, r8, r9)
            androidx.recyclerview.widget.RecyclerView r0 = r10.f6261h0
            r0.setLayoutManager(r12)
            androidx.recyclerview.widget.RecyclerView r12 = r10.f6261h0
            java.lang.String r0 = "MONTHS_VIEW_GROUP_TAG"
            r12.setTag(r0)
            z1.v r12 = new z1.v
            z1.d<S> r0 = r10.f6255b0
            z1.a r1 = r10.f6256c0
            z1.g$d r4 = new z1.g$d
            r4.<init>()
            r12.<init>(r13, r0, r1, r4)
            androidx.recyclerview.widget.RecyclerView r0 = r10.f6261h0
            r0.setAdapter(r12)
            android.content.res.Resources r0 = r13.getResources()
            r1 = 2131361814(0x7f0a0016, float:1.834339E38)
            int r0 = r0.getInteger(r1)
            r1 = 2131296571(0x7f09013b, float:1.8211062E38)
            android.view.View r4 = r11.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            r10.f6260g0 = r4
            if (r4 == 0) goto L_0x00c0
            r4.setHasFixedSize(r2)
            androidx.recyclerview.widget.RecyclerView r4 = r10.f6260g0
            androidx.recyclerview.widget.GridLayoutManager r5 = new androidx.recyclerview.widget.GridLayoutManager
            r5.<init>((android.content.Context) r13, (int) r0, (int) r2, (boolean) r3)
            r4.setLayoutManager(r5)
            androidx.recyclerview.widget.RecyclerView r0 = r10.f6260g0
            z1.c0 r3 = new z1.c0
            r3.<init>(r10)
            r0.setAdapter(r3)
            androidx.recyclerview.widget.RecyclerView r0 = r10.f6260g0
            z1.h r3 = new z1.h
            r3.<init>(r10)
            r0.mo2032g(r3)
        L_0x00c0:
            r0 = 2131296557(0x7f09012d, float:1.8211034E38)
            android.view.View r3 = r11.findViewById(r0)
            if (r3 == 0) goto L_0x0139
            android.view.View r0 = r11.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            java.lang.String r3 = "SELECTOR_TOGGLE_TAG"
            r0.setTag(r3)
            z1.i r3 = new z1.i
            r3.<init>(r10)
            p058j0.C1061o.m3034o(r0, r3)
            r3 = 2131296559(0x7f09012f, float:1.8211038E38)
            android.view.View r3 = r11.findViewById(r3)
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            java.lang.String r4 = "NAVIGATION_PREV_TAG"
            r3.setTag(r4)
            r4 = 2131296558(0x7f09012e, float:1.8211036E38)
            android.view.View r4 = r11.findViewById(r4)
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            java.lang.String r5 = "NAVIGATION_NEXT_TAG"
            r4.setTag(r5)
            android.view.View r1 = r11.findViewById(r1)
            r10.f6262i0 = r1
            r1 = 2131296564(0x7f090134, float:1.8211048E38)
            android.view.View r1 = r11.findViewById(r1)
            r10.f6263j0 = r1
            r10.mo6725q0(r2)
            z1.s r1 = r10.f6257d0
            android.content.Context r2 = r11.getContext()
            java.lang.String r1 = r1.mo6744n(r2)
            r0.setText(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r10.f6261h0
            z1.j r2 = new z1.j
            r2.<init>(r10, r12, r0)
            r1.mo2054h(r2)
            z1.k r1 = new z1.k
            r1.<init>(r10)
            r0.setOnClickListener(r1)
            z1.l r0 = new z1.l
            r0.<init>(r10, r12)
            r4.setOnClickListener(r0)
            z1.m r0 = new z1.m
            r0.<init>(r10, r12)
            r3.setOnClickListener(r0)
        L_0x0139:
            boolean r13 = p152z1.C2183o.m5607q0(r13)
            if (r13 != 0) goto L_0x018e
            androidx.recyclerview.widget.v r13 = new androidx.recyclerview.widget.v
            r13.<init>()
            androidx.recyclerview.widget.RecyclerView r0 = r10.f6261h0
            androidx.recyclerview.widget.RecyclerView r1 = r13.f2072a
            if (r1 != r0) goto L_0x014b
            goto L_0x018e
        L_0x014b:
            if (r1 == 0) goto L_0x015c
            androidx.recyclerview.widget.RecyclerView$p r2 = r13.f2073b
            java.util.List<androidx.recyclerview.widget.RecyclerView$p> r1 = r1.f1870j0
            if (r1 == 0) goto L_0x0156
            r1.remove(r2)
        L_0x0156:
            androidx.recyclerview.widget.RecyclerView r1 = r13.f2072a
            r2 = 0
            r1.setOnFlingListener(r2)
        L_0x015c:
            r13.f2072a = r0
            if (r0 == 0) goto L_0x018e
            androidx.recyclerview.widget.RecyclerView$n r0 = r0.getOnFlingListener()
            if (r0 != 0) goto L_0x0186
            androidx.recyclerview.widget.RecyclerView r0 = r13.f2072a
            androidx.recyclerview.widget.RecyclerView$p r1 = r13.f2073b
            r0.mo2054h(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r13.f2072a
            r0.setOnFlingListener(r13)
            android.widget.Scroller r0 = new android.widget.Scroller
            androidx.recyclerview.widget.RecyclerView r1 = r13.f2072a
            android.content.Context r1 = r1.getContext()
            android.view.animation.DecelerateInterpolator r2 = new android.view.animation.DecelerateInterpolator
            r2.<init>()
            r0.<init>(r1, r2)
            r13.mo2339b()
            goto L_0x018e
        L_0x0186:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "An instance of OnFlingListener already set."
            r11.<init>(r12)
            throw r11
        L_0x018e:
            androidx.recyclerview.widget.RecyclerView r13 = r10.f6261h0
            z1.s r0 = r10.f6257d0
            int r12 = r12.mo6763f(r0)
            r13.mo2030f0(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p152z1.C2170g.mo1591J(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* renamed from: R */
    public void mo1599R(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f6254a0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f6255b0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f6256c0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f6257d0);
    }

    /* renamed from: m0 */
    public boolean mo6721m0(C2197w<S> wVar) {
        return this.f6327Z.add(wVar);
    }

    /* renamed from: n0 */
    public LinearLayoutManager mo6722n0() {
        return (LinearLayoutManager) this.f6261h0.getLayoutManager();
    }

    /* renamed from: o0 */
    public final void mo6723o0(int i) {
        this.f6261h0.post(new C2171a(i));
    }

    /* renamed from: p0 */
    public void mo6724p0(C2191s sVar) {
        RecyclerView recyclerView;
        int i;
        C2195v vVar = (C2195v) this.f6261h0.getAdapter();
        int p = vVar.f6321d.f6218e.mo6746p(sVar);
        int f = p - vVar.mo6763f(this.f6257d0);
        boolean z = true;
        boolean z2 = Math.abs(f) > 3;
        if (f <= 0) {
            z = false;
        }
        this.f6257d0 = sVar;
        if (!z2 || !z) {
            if (z2) {
                recyclerView = this.f6261h0;
                i = p + 3;
            }
            mo6723o0(p);
        }
        recyclerView = this.f6261h0;
        i = p - 3;
        recyclerView.mo2030f0(i);
        mo6723o0(p);
    }

    /* renamed from: q0 */
    public void mo6725q0(int i) {
        this.f6258e0 = i;
        if (i == 2) {
            this.f6260g0.getLayoutManager().mo1969w0(((C2164c0) this.f6260g0.getAdapter()).mo6702e(this.f6257d0.f6307g));
            this.f6262i0.setVisibility(0);
            this.f6263j0.setVisibility(8);
        } else if (i == 1) {
            this.f6262i0.setVisibility(8);
            this.f6263j0.setVisibility(0);
            mo6724p0(this.f6257d0);
        }
    }
}
