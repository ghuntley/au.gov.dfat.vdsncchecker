package p036f2;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: f2.o */
public class C0909o extends ImageButton {

    /* renamed from: e */
    public int f3433e;

    /* renamed from: b */
    public final void mo4231b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f3433e = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f3433e;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        this.f3433e = i;
    }
}
