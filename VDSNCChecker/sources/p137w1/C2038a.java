package p137w1;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.C0722a;
import com.google.android.material.chip.Chip;

/* renamed from: w1.a */
public class C2038a extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ Chip f5879a;

    public C2038a(Chip chip) {
        this.f5879a = chip;
    }

    @TargetApi(21)
    public void getOutline(View view, Outline outline) {
        C0722a aVar = this.f5879a.f2708h;
        if (aVar != null) {
            aVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
