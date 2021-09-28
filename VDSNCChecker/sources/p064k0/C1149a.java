package p064k0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: k0.a */
public final class C1149a extends ClickableSpan {

    /* renamed from: e */
    public final int f4001e;

    /* renamed from: f */
    public final C1150b f4002f;

    /* renamed from: g */
    public final int f4003g;

    public C1149a(int i, C1150b bVar, int i2) {
        this.f4001e = i;
        this.f4002f = bVar;
        this.f4003g = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f4001e);
        C1150b bVar = this.f4002f;
        bVar.f4005a.performAction(this.f4003g, bundle);
    }
}
