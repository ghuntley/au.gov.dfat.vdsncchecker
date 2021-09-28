package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Objects;
import p078m2.C1429a;
import p078m2.C1432d;
import p078m2.C1434e;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h */
    public final C1429a f2885h = new C1429a(this);

    /* renamed from: g */
    public boolean mo1400g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        Objects.requireNonNull(this.f2885h);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C1434e.f4519c == null) {
                    C1434e.f4519c = new C1434e();
                }
                synchronized (C1434e.f4519c.f4520a) {
                }
            }
        } else if (coordinatorLayout.mo1373p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C1434e.f4519c == null) {
                C1434e.f4519c = new C1434e();
            }
            synchronized (C1434e.f4519c.f4520a) {
            }
        }
        return super.mo1400g(coordinatorLayout, view, motionEvent);
    }

    /* renamed from: s */
    public boolean mo3172s(View view) {
        Objects.requireNonNull(this.f2885h);
        return view instanceof C1432d;
    }
}
