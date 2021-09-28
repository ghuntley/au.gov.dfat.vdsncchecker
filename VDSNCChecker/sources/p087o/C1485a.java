package p087o;

import android.content.res.ColorStateList;
import android.widget.FrameLayout;

/* renamed from: o.a */
public class C1485a extends FrameLayout {

    /* renamed from: g */
    public static final C1488d f4638g = new C1486b();

    /* renamed from: e */
    public boolean f4639e;

    /* renamed from: f */
    public boolean f4640f;

    public ColorStateList getCardBackgroundColor() {
        ((C1486b) f4638g).mo5378a((C1487c) null);
        throw null;
    }

    public float getCardElevation() {
        throw null;
    }

    public int getContentPaddingBottom() {
        throw null;
    }

    public int getContentPaddingLeft() {
        throw null;
    }

    public int getContentPaddingRight() {
        throw null;
    }

    public int getContentPaddingTop() {
        throw null;
    }

    public float getMaxCardElevation() {
        ((C1486b) f4638g).mo5379b((C1487c) null);
        throw null;
    }

    public boolean getPreventCornerOverlap() {
        return this.f4640f;
    }

    public float getRadius() {
        ((C1486b) f4638g).mo5380c((C1487c) null);
        throw null;
    }

    public boolean getUseCompatPadding() {
        return this.f4639e;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ((C1486b) f4638g).mo5381d((C1487c) null, ColorStateList.valueOf(i));
        throw null;
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        ((C1486b) f4638g).mo5381d((C1487c) null, colorStateList);
        throw null;
    }

    public void setCardElevation(float f) {
        throw null;
    }

    public void setMaxCardElevation(float f) {
        ((C1486b) f4638g).mo5382e((C1487c) null, f);
        throw null;
    }

    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f4640f) {
            this.f4640f = z;
            ((C1486b) f4638g).mo5378a((C1487c) null);
            throw null;
        }
    }

    public void setRadius(float f) {
        ((C1486b) f4638g).mo5378a((C1487c) null);
        throw null;
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f4639e != z) {
            this.f4639e = z;
            ((C1486b) f4638g).mo5378a((C1487c) null);
            throw null;
        }
    }
}
