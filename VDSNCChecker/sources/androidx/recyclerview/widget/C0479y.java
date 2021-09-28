package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;
import p058j0.C1043a;
import p064k0.C1150b;
import p064k0.C1154c;

/* renamed from: androidx.recyclerview.widget.y */
public class C0479y extends C1043a {

    /* renamed from: d */
    public final RecyclerView f2222d;

    /* renamed from: e */
    public final C0480a f2223e;

    /* renamed from: androidx.recyclerview.widget.y$a */
    public static class C0480a extends C1043a {

        /* renamed from: d */
        public final C0479y f2224d;

        /* renamed from: e */
        public Map<View, C1043a> f2225e = new WeakHashMap();

        public C0480a(C0479y yVar) {
            this.f2224d = yVar;
        }

        /* renamed from: a */
        public boolean mo2444a(View view, AccessibilityEvent accessibilityEvent) {
            C1043a aVar = this.f2225e.get(view);
            return aVar != null ? aVar.mo2444a(view, accessibilityEvent) : this.f3779a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        /* renamed from: b */
        public C1154c mo2445b(View view) {
            C1043a aVar = this.f2225e.get(view);
            return aVar != null ? aVar.mo2445b(view) : super.mo2445b(view);
        }

        /* renamed from: c */
        public void mo1507c(View view, AccessibilityEvent accessibilityEvent) {
            C1043a aVar = this.f2225e.get(view);
            if (aVar != null) {
                aVar.mo1507c(view, accessibilityEvent);
            } else {
                this.f3779a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        /* renamed from: d */
        public void mo1508d(View view, C1150b bVar) {
            if (!this.f2224d.mo2443j() && this.f2224d.f2222d.getLayoutManager() != null) {
                this.f2224d.f2222d.getLayoutManager().mo2177c0(view, bVar);
                C1043a aVar = this.f2225e.get(view);
                if (aVar != null) {
                    aVar.mo1508d(view, bVar);
                    return;
                }
            }
            this.f3779a.onInitializeAccessibilityNodeInfo(view, bVar.f4005a);
        }

        /* renamed from: e */
        public void mo2446e(View view, AccessibilityEvent accessibilityEvent) {
            C1043a aVar = this.f2225e.get(view);
            if (aVar != null) {
                aVar.mo2446e(view, accessibilityEvent);
            } else {
                this.f3779a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        /* renamed from: f */
        public boolean mo2447f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C1043a aVar = this.f2225e.get(viewGroup);
            return aVar != null ? aVar.mo2447f(viewGroup, view, accessibilityEvent) : this.f3779a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        /* renamed from: g */
        public boolean mo1509g(View view, int i, Bundle bundle) {
            if (this.f2224d.mo2443j() || this.f2224d.f2222d.getLayoutManager() == null) {
                return super.mo1509g(view, i, bundle);
            }
            C1043a aVar = this.f2225e.get(view);
            if (aVar != null) {
                if (aVar.mo1509g(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo1509g(view, i, bundle)) {
                return true;
            }
            RecyclerView.C0411r rVar = this.f2224d.f2222d.getLayoutManager().f1915b.f1861f;
            return false;
        }

        /* renamed from: h */
        public void mo2448h(View view, int i) {
            C1043a aVar = this.f2225e.get(view);
            if (aVar != null) {
                aVar.mo2448h(view, i);
            } else {
                this.f3779a.sendAccessibilityEvent(view, i);
            }
        }

        /* renamed from: i */
        public void mo2449i(View view, AccessibilityEvent accessibilityEvent) {
            C1043a aVar = this.f2225e.get(view);
            if (aVar != null) {
                aVar.mo2449i(view, accessibilityEvent);
            } else {
                this.f3779a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public C0479y(RecyclerView recyclerView) {
        this.f2222d = recyclerView;
        C0480a aVar = this.f2223e;
        this.f2223e = aVar == null ? new C0480a(this) : aVar;
    }

    /* renamed from: c */
    public void mo1507c(View view, AccessibilityEvent accessibilityEvent) {
        this.f3779a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !mo2443j()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo1945b0(accessibilityEvent);
            }
        }
    }

    /* renamed from: d */
    public void mo1508d(View view, C1150b bVar) {
        this.f3779a.onInitializeAccessibilityNodeInfo(view, bVar.f4005a);
        if (!mo2443j() && this.f2222d.getLayoutManager() != null) {
            RecyclerView.C0400l layoutManager = this.f2222d.getLayoutManager();
            RecyclerView recyclerView = layoutManager.f1915b;
            RecyclerView.C0411r rVar = recyclerView.f1861f;
            RecyclerView.C0419w wVar = recyclerView.f1866h0;
            if (recyclerView.canScrollVertically(-1) || layoutManager.f1915b.canScrollHorizontally(-1)) {
                bVar.f4005a.addAction(8192);
                bVar.f4005a.setScrollable(true);
            }
            if (layoutManager.f1915b.canScrollVertically(1) || layoutManager.f1915b.canScrollHorizontally(1)) {
                bVar.f4005a.addAction(4096);
                bVar.f4005a.setScrollable(true);
            }
            bVar.mo4768i(C1150b.C1152b.m3388a(layoutManager.mo1889S(rVar, wVar), layoutManager.mo1921z(rVar, wVar), false, 0));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0087 A[ADDED_TO_REGION] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1509g(android.view.View r9, int r10, android.os.Bundle r11) {
        /*
            r8 = this;
            boolean r9 = super.mo1509g(r9, r10, r11)
            r11 = 1
            if (r9 == 0) goto L_0x0008
            return r11
        L_0x0008:
            boolean r9 = r8.mo2443j()
            r0 = 0
            if (r9 != 0) goto L_0x0095
            androidx.recyclerview.widget.RecyclerView r9 = r8.f2222d
            androidx.recyclerview.widget.RecyclerView$l r9 = r9.getLayoutManager()
            if (r9 == 0) goto L_0x0095
            androidx.recyclerview.widget.RecyclerView r9 = r8.f2222d
            androidx.recyclerview.widget.RecyclerView$l r9 = r9.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r1 = r9.f1915b
            androidx.recyclerview.widget.RecyclerView$r r2 = r1.f1861f
            r2 = 4096(0x1000, float:5.74E-42)
            if (r10 == r2) goto L_0x0058
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r10 == r2) goto L_0x002c
            r3 = r0
            r4 = r3
            goto L_0x0085
        L_0x002c:
            r10 = -1
            boolean r1 = r1.canScrollVertically(r10)
            if (r1 == 0) goto L_0x0041
            int r1 = r9.f1928o
            int r2 = r9.mo2169P()
            int r1 = r1 - r2
            int r2 = r9.mo2166M()
            int r1 = r1 - r2
            int r1 = -r1
            goto L_0x0042
        L_0x0041:
            r1 = r0
        L_0x0042:
            androidx.recyclerview.widget.RecyclerView r2 = r9.f1915b
            boolean r10 = r2.canScrollHorizontally(r10)
            if (r10 == 0) goto L_0x0083
            int r10 = r9.f1927n
            int r2 = r9.mo2167N()
            int r10 = r10 - r2
            int r2 = r9.mo2168O()
            int r10 = r10 - r2
            int r10 = -r10
            goto L_0x0081
        L_0x0058:
            boolean r10 = r1.canScrollVertically(r11)
            if (r10 == 0) goto L_0x006c
            int r10 = r9.f1928o
            int r1 = r9.mo2169P()
            int r10 = r10 - r1
            int r1 = r9.mo2166M()
            int r10 = r10 - r1
            r1 = r10
            goto L_0x006d
        L_0x006c:
            r1 = r0
        L_0x006d:
            androidx.recyclerview.widget.RecyclerView r10 = r9.f1915b
            boolean r10 = r10.canScrollHorizontally(r11)
            if (r10 == 0) goto L_0x0083
            int r10 = r9.f1927n
            int r2 = r9.mo2167N()
            int r10 = r10 - r2
            int r2 = r9.mo2168O()
            int r10 = r10 - r2
        L_0x0081:
            r3 = r10
            goto L_0x0084
        L_0x0083:
            r3 = r0
        L_0x0084:
            r4 = r1
        L_0x0085:
            if (r4 != 0) goto L_0x008b
            if (r3 != 0) goto L_0x008b
            r11 = r0
            goto L_0x0094
        L_0x008b:
            androidx.recyclerview.widget.RecyclerView r2 = r9.f1915b
            r5 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1
            r2.mo2055h0(r3, r4, r5, r6, r7)
        L_0x0094:
            return r11
        L_0x0095:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0479y.mo1509g(android.view.View, int, android.os.Bundle):boolean");
    }

    /* renamed from: j */
    public boolean mo2443j() {
        return this.f2222d.mo1994N();
    }
}
