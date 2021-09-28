package p003a2;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: a2.a */
public class C0008a implements View.OnTouchListener {

    /* renamed from: e */
    public final Dialog f3e;

    /* renamed from: f */
    public final int f4f;

    /* renamed from: g */
    public final int f5g;

    /* renamed from: h */
    public final int f6h;

    public C0008a(Dialog dialog, Rect rect) {
        this.f3e = dialog;
        this.f4f = rect.left;
        this.f5g = rect.top;
        this.f6h = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f4f;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.f5g;
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f6h;
            obtain.setLocation((float) ((-i) - 1), (float) ((-i) - 1));
        }
        view.performClick();
        return this.f3e.onTouchEvent(obtain);
    }
}
