package p090o2;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.C0762b;

/* renamed from: o2.h */
public class C1511h implements View.OnTouchListener {

    /* renamed from: e */
    public final /* synthetic */ AutoCompleteTextView f4679e;

    /* renamed from: f */
    public final /* synthetic */ C0762b f4680f;

    public C1511h(C0762b bVar, AutoCompleteTextView autoCompleteTextView) {
        this.f4680f = bVar;
        this.f4679e = autoCompleteTextView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f4680f.mo3973i()) {
                this.f4680f.f3007i = false;
            }
            C0762b.m2339g(this.f4680f, this.f4679e);
        }
        return false;
    }
}
