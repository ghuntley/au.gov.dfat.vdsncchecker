package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b */
public class C0133b extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f673a;

    public C0133b(ActionBarContainer actionBarContainer) {
        this.f673a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f673a;
        if (actionBarContainer.f458l) {
            Drawable drawable = actionBarContainer.f457k;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f455i;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f673a;
        Drawable drawable3 = actionBarContainer2.f456j;
        if (drawable3 != null && actionBarContainer2.f459m) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f673a;
        if (actionBarContainer.f458l) {
            drawable = actionBarContainer.f457k;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f455i;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
