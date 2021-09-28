package p152z1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p007au.gov.dfat.vdsncchecker.R;
import p054i2.C1029b;
import p054i2.C1030c;
import p083n1.C1455a;

/* renamed from: z1.c */
public final class C2163c {

    /* renamed from: a */
    public final C2161b f6239a;

    /* renamed from: b */
    public final C2161b f6240b;

    /* renamed from: c */
    public final C2161b f6241c;

    /* renamed from: d */
    public final C2161b f6242d;

    /* renamed from: e */
    public final C2161b f6243e;

    /* renamed from: f */
    public final C2161b f6244f;

    /* renamed from: g */
    public final C2161b f6245g;

    public C2163c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C1029b.m2955c(context, R.attr.materialCalendarStyle, C2170g.class.getCanonicalName()), C1455a.f4577o);
        this.f6239a = C2161b.m5576a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f6245g = C2161b.m5576a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f6240b = C2161b.m5576a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f6241c = C2161b.m5576a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList a = C1030c.m2956a(context, obtainStyledAttributes, 6);
        this.f6242d = C2161b.m5576a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f6243e = C2161b.m5576a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f6244f = C2161b.m5576a(context, obtainStyledAttributes.getResourceId(9, 0));
        new Paint().setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
