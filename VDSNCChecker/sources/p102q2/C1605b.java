package p102q2;

import android.view.View;
import com.google.android.material.timepicker.ClockFaceView;
import p007au.gov.dfat.vdsncchecker.R;
import p058j0.C1043a;
import p064k0.C1150b;

/* renamed from: q2.b */
public class C1605b extends C1043a {

    /* renamed from: d */
    public final /* synthetic */ ClockFaceView f4984d;

    public C1605b(ClockFaceView clockFaceView) {
        this.f4984d = clockFaceView;
    }

    /* renamed from: d */
    public void mo1508d(View view, C1150b bVar) {
        this.f3779a.onInitializeAccessibilityNodeInfo(view, bVar.f4005a);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            bVar.f4005a.setTraversalAfter(this.f4984d.f3039C.get(intValue - 1));
        }
        bVar.mo4769j(C1150b.C1153c.m3389a(0, 1, intValue, 1, false, view.isSelected()));
    }
}
