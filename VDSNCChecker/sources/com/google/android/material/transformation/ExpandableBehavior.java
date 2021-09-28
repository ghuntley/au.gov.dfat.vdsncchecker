package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import java.util.WeakHashMap;
import p024d2.C0796a;
import p058j0.C1061o;
import p058j0.C1070q;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.C0249c<View> {

    /* renamed from: a */
    public int f3073a = 0;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    public class C0783a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: e */
        public final /* synthetic */ View f3074e;

        /* renamed from: f */
        public final /* synthetic */ int f3075f;

        /* renamed from: g */
        public final /* synthetic */ C0796a f3076g;

        public C0783a(View view, int i, C0796a aVar) {
            this.f3074e = view;
            this.f3075f = i;
            this.f3076g = aVar;
        }

        public boolean onPreDraw() {
            this.f3074e.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f3073a == this.f3075f) {
                C0796a aVar = this.f3076g;
                expandableBehavior.mo4011t((View) aVar, this.f3074e, aVar.mo3617a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: d */
    public boolean mo1397d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        C0796a aVar = (C0796a) view2;
        if (!mo4010s(aVar.mo3617a())) {
            return false;
        }
        this.f3073a = aVar.mo3617a() ? 1 : 2;
        return mo4011t((View) aVar, view, aVar.mo3617a(), true);
    }

    /* renamed from: h */
    public boolean mo1401h(CoordinatorLayout coordinatorLayout, View view, int i) {
        C0796a aVar;
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        if (!view.isLaidOut()) {
            List<View> e = coordinatorLayout.mo1342e(view);
            int size = e.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = e.get(i2);
                if (mo1395b(coordinatorLayout, view, view2)) {
                    aVar = (C0796a) view2;
                    break;
                }
                i2++;
            }
            if (aVar != null && mo4010s(aVar.mo3617a())) {
                int i3 = aVar.mo3617a() ? 1 : 2;
                this.f3073a = i3;
                view.getViewTreeObserver().addOnPreDrawListener(new C0783a(view, i3, aVar));
            }
        }
        return false;
    }

    /* renamed from: s */
    public final boolean mo4010s(boolean z) {
        if (!z) {
            return this.f3073a == 1;
        }
        int i = this.f3073a;
        return i == 0 || i == 2;
    }

    /* renamed from: t */
    public abstract boolean mo4011t(View view, View view2, boolean z, boolean z2);
}
