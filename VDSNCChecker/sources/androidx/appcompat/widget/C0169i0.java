package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import p022d0.C0793a;
import p057j.C1042a;

@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.widget.i0 */
public class C0169i0 {

    /* renamed from: a */
    public static final int[] f799a = {16842912};

    /* renamed from: b */
    public static final int[] f800b = new int[0];

    static {
        new Rect();
        try {
            Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public static boolean m487a(Drawable drawable) {
        Drawable drawable2;
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable a : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!m487a(a)) {
                    return false;
                }
            }
            return true;
        }
        if (drawable instanceof C0793a) {
            drawable2 = ((C0793a) drawable).mo4030a();
        } else if (drawable instanceof C1042a) {
            return m487a(((C1042a) drawable).f3777e);
        } else {
            if (!(drawable instanceof ScaleDrawable)) {
                return true;
            }
            drawable2 = ((ScaleDrawable) drawable).getDrawable();
        }
        return m487a(drawable2);
    }

    /* renamed from: b */
    public static PorterDuff.Mode m488b(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
