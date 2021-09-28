package p102q2;

import android.view.ViewTreeObserver;
import com.google.android.material.timepicker.ClockFaceView;
import com.google.android.material.timepicker.ClockHandView;

/* renamed from: q2.a */
public class C1604a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: e */
    public final /* synthetic */ ClockFaceView f4983e;

    public C1604a(ClockFaceView clockFaceView) {
        this.f4983e = clockFaceView;
    }

    public boolean onPreDraw() {
        if (!this.f4983e.isShown()) {
            return true;
        }
        this.f4983e.getViewTreeObserver().removeOnPreDrawListener(this);
        ClockFaceView clockFaceView = this.f4983e;
        int height = ((this.f4983e.getHeight() / 2) - clockFaceView.f3050z.f3057j) - clockFaceView.f3043G;
        if (height != clockFaceView.f4986x) {
            clockFaceView.f4986x = height;
            clockFaceView.mo5752s();
            ClockHandView clockHandView = clockFaceView.f3050z;
            clockHandView.f3065r = clockFaceView.f4986x;
            clockHandView.invalidate();
        }
        return true;
    }
}
