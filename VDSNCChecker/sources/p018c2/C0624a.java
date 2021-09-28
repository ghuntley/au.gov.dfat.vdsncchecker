package p018c2;

import android.content.Context;
import p007au.gov.dfat.vdsncchecker.R;
import p054i2.C1029b;
import p136w0.C2036r;

/* renamed from: c2.a */
public class C0624a {

    /* renamed from: a */
    public final boolean f2493a;

    /* renamed from: b */
    public final int f2494b;

    /* renamed from: c */
    public final int f2495c;

    /* renamed from: d */
    public final float f2496d;

    public C0624a(Context context) {
        this.f2493a = C1029b.m2954b(context, R.attr.elevationOverlayEnabled, false);
        this.f2494b = C2036r.m5364b(context, R.attr.elevationOverlayColor, 0);
        this.f2495c = C2036r.m5364b(context, R.attr.colorSurface, 0);
        this.f2496d = context.getResources().getDisplayMetrics().density;
    }
}
