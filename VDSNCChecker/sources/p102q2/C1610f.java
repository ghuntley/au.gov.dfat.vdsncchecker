package p102q2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import com.google.android.material.timepicker.TimePickerView;

/* renamed from: q2.f */
public class C1610f implements View.OnTouchListener {

    /* renamed from: e */
    public final /* synthetic */ GestureDetector f4991e;

    public C1610f(TimePickerView timePickerView, GestureDetector gestureDetector) {
        this.f4991e = gestureDetector;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f4991e.onTouchEvent(motionEvent);
        }
        return false;
    }
}
