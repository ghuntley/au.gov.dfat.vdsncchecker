package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* renamed from: androidx.appcompat.widget.c0 */
public class C0145c0 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ TextView f717e;

    /* renamed from: f */
    public final /* synthetic */ Typeface f718f;

    /* renamed from: g */
    public final /* synthetic */ int f719g;

    public C0145c0(C0134b0 b0Var, TextView textView, Typeface typeface, int i) {
        this.f717e = textView;
        this.f718f = typeface;
        this.f719g = i;
    }

    public void run() {
        this.f717e.setTypeface(this.f718f, this.f719g);
    }
}
