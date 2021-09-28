package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.p */
public class C0469p extends RecyclerView.C0416v {

    /* renamed from: h */
    public final LinearInterpolator f2205h = new LinearInterpolator();

    /* renamed from: i */
    public final DecelerateInterpolator f2206i = new DecelerateInterpolator();

    /* renamed from: j */
    public PointF f2207j;

    /* renamed from: k */
    public final DisplayMetrics f2208k;

    /* renamed from: l */
    public boolean f2209l = false;

    /* renamed from: m */
    public float f2210m;

    /* renamed from: n */
    public int f2211n = 0;

    /* renamed from: o */
    public int f2212o = 0;

    public C0469p(Context context) {
        this.f2208k = context.getResources().getDisplayMetrics();
    }

    /* renamed from: b */
    public void mo2224b(View view, RecyclerView.C0419w wVar, RecyclerView.C0416v.C0417a aVar) {
        int i;
        int i2;
        int i3;
        PointF pointF = this.f2207j;
        int i4 = 0;
        int i5 = (pointF == null || pointF.x == 0.0f) ? 0 : i3 > 0 ? 1 : -1;
        RecyclerView.C0400l lVar = this.f1957c;
        if (lVar == null || !lVar.mo1950e()) {
            i = 0;
        } else {
            RecyclerView.C0405m mVar = (RecyclerView.C0405m) view.getLayoutParams();
            i = mo2413d(lVar.mo2152C(view) - mVar.leftMargin, lVar.mo2157F(view) + mVar.rightMargin, lVar.mo2167N(), lVar.f1927n - lVar.mo2168O(), i5);
        }
        PointF pointF2 = this.f2207j;
        int i6 = (pointF2 == null || pointF2.y == 0.0f) ? 0 : i2 > 0 ? 1 : -1;
        RecyclerView.C0400l lVar2 = this.f1957c;
        if (lVar2 != null && lVar2.mo1952f()) {
            RecyclerView.C0405m mVar2 = (RecyclerView.C0405m) view.getLayoutParams();
            i4 = mo2413d(lVar2.mo2159G(view) - mVar2.topMargin, lVar2.mo2149A(view) + mVar2.bottomMargin, lVar2.mo2169P(), lVar2.f1928o - lVar2.mo2166M(), i6);
        }
        int ceil = (int) Math.ceil(((double) mo2415f((int) Math.sqrt((double) ((i4 * i4) + (i * i))))) / 0.3356d);
        if (ceil > 0) {
            aVar.mo2227b(-i, -i4, ceil, this.f2206i);
        }
    }

    /* renamed from: d */
    public int mo2413d(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* renamed from: e */
    public float mo2414e(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* renamed from: f */
    public int mo2415f(int i) {
        float abs = (float) Math.abs(i);
        if (!this.f2209l) {
            this.f2210m = mo2414e(this.f2208k);
            this.f2209l = true;
        }
        return (int) Math.ceil((double) (abs * this.f2210m));
    }
}
