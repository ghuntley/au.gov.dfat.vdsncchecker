package p095p1;

import android.view.View;
import java.util.WeakHashMap;
import p058j0.C1061o;
import p058j0.C1070q;

/* renamed from: p1.e */
public class C1577e {

    /* renamed from: a */
    public final View f4904a;

    /* renamed from: b */
    public int f4905b;

    /* renamed from: c */
    public int f4906c;

    /* renamed from: d */
    public int f4907d;

    /* renamed from: e */
    public int f4908e;

    public C1577e(View view) {
        this.f4904a = view;
    }

    /* renamed from: a */
    public void mo5680a() {
        View view = this.f4904a;
        int top = this.f4907d - (view.getTop() - this.f4905b);
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        view.offsetTopAndBottom(top);
        View view2 = this.f4904a;
        view2.offsetLeftAndRight(this.f4908e - (view2.getLeft() - this.f4906c));
    }
}
