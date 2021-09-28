package p017c1;

import android.view.View;
import android.view.WindowId;

/* renamed from: c1.y */
public class C0622y implements C0623z {

    /* renamed from: a */
    public final WindowId f2492a;

    public C0622y(View view) {
        this.f2492a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0622y) && ((C0622y) obj).f2492a.equals(this.f2492a);
    }

    public int hashCode() {
        return this.f2492a.hashCode();
    }
}
