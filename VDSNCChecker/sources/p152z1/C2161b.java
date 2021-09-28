package p152z1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import java.util.WeakHashMap;
import p039g.C0933a;
import p054i2.C1030c;
import p058j0.C1061o;
import p058j0.C1070q;
import p072l2.C1237a;
import p072l2.C1242f;
import p072l2.C1247i;
import p083n1.C1455a;

/* renamed from: z1.b */
public final class C2161b {

    /* renamed from: a */
    public final Rect f6231a;

    /* renamed from: b */
    public final ColorStateList f6232b;

    /* renamed from: c */
    public final ColorStateList f6233c;

    /* renamed from: d */
    public final ColorStateList f6234d;

    /* renamed from: e */
    public final int f6235e;

    /* renamed from: f */
    public final C1247i f6236f;

    public C2161b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C1247i iVar, Rect rect) {
        C0933a.m2708b(rect.left);
        C0933a.m2708b(rect.top);
        C0933a.m2708b(rect.right);
        C0933a.m2708b(rect.bottom);
        this.f6231a = rect;
        this.f6232b = colorStateList2;
        this.f6233c = colorStateList;
        this.f6234d = colorStateList3;
        this.f6235e = i;
        this.f6236f = iVar;
    }

    /* renamed from: a */
    public static C2161b m5576a(Context context, int i) {
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C1455a.f4578p);
            Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            ColorStateList a = C1030c.m2956a(context, obtainStyledAttributes, 4);
            ColorStateList a2 = C1030c.m2956a(context, obtainStyledAttributes, 9);
            ColorStateList a3 = C1030c.m2956a(context, obtainStyledAttributes, 7);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            C1247i a4 = C1247i.m3550a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new C1237a((float) 0)).mo4991a();
            obtainStyledAttributes.recycle();
            return new C2161b(a, a2, a3, dimensionPixelSize, a4, rect);
        }
        throw new IllegalArgumentException("Cannot create a CalendarItemStyle with a styleResId of 0");
    }

    /* renamed from: b */
    public void mo6700b(TextView textView) {
        C1242f fVar = new C1242f();
        C1242f fVar2 = new C1242f();
        fVar.setShapeAppearanceModel(this.f6236f);
        fVar2.setShapeAppearanceModel(this.f6236f);
        fVar.mo4976p(this.f6233c);
        fVar.mo4979s((float) this.f6235e, this.f6234d);
        textView.setTextColor(this.f6232b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f6232b.withAlpha(30), fVar, fVar2);
        Rect rect = this.f6231a;
        InsetDrawable insetDrawable = new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        textView.setBackground(insetDrawable);
    }
}
