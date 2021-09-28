package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import p007au.gov.dfat.vdsncchecker.R;

/* renamed from: androidx.appcompat.widget.g1 */
public class C0164g1 {

    /* renamed from: a */
    public final Context f786a;

    /* renamed from: b */
    public final View f787b;

    /* renamed from: c */
    public final TextView f788c;

    /* renamed from: d */
    public final WindowManager.LayoutParams f789d;

    /* renamed from: e */
    public final Rect f790e = new Rect();

    /* renamed from: f */
    public final int[] f791f = new int[2];

    /* renamed from: g */
    public final int[] f792g = new int[2];

    public C0164g1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f789d = layoutParams;
        this.f786a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f787b = inflate;
        this.f788c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(C0164g1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131951621;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    public void mo935a() {
        if (this.f787b.getParent() != null) {
            ((WindowManager) this.f786a.getSystemService("window")).removeView(this.f787b);
        }
    }
}
