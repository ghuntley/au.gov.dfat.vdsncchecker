package p102q2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.material.timepicker.TimePickerView;
import java.util.Objects;

/* renamed from: q2.e */
public class C1609e extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public final /* synthetic */ TimePickerView f4990a;

    public C1609e(TimePickerView timePickerView) {
        this.f4990a = timePickerView;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        TimePickerView timePickerView = this.f4990a;
        int i = TimePickerView.f3067A;
        Objects.requireNonNull(timePickerView);
        return onDoubleTap;
    }
}
