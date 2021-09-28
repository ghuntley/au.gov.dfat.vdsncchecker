package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0237b;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Objects;
import p129v.C1961e;

/* renamed from: androidx.constraintlayout.widget.c */
public class C0244c extends ViewGroup {

    /* renamed from: e */
    public C0237b f1242e;

    /* renamed from: androidx.constraintlayout.widget.c$a */
    public static class C0245a extends ConstraintLayout.C0233a {

        /* renamed from: A0 */
        public float f1243A0;

        /* renamed from: B0 */
        public float f1244B0;

        /* renamed from: C0 */
        public float f1245C0;

        /* renamed from: q0 */
        public float f1246q0;

        /* renamed from: r0 */
        public boolean f1247r0;

        /* renamed from: s0 */
        public float f1248s0;

        /* renamed from: t0 */
        public float f1249t0;

        /* renamed from: u0 */
        public float f1250u0;

        /* renamed from: v0 */
        public float f1251v0;

        /* renamed from: w0 */
        public float f1252w0;

        /* renamed from: x0 */
        public float f1253x0;

        /* renamed from: y0 */
        public float f1254y0;

        /* renamed from: z0 */
        public float f1255z0;

        public C0245a(int i, int i2) {
            super(i, i2);
            this.f1246q0 = 1.0f;
            this.f1247r0 = false;
            this.f1248s0 = 0.0f;
            this.f1249t0 = 0.0f;
            this.f1250u0 = 0.0f;
            this.f1251v0 = 0.0f;
            this.f1252w0 = 1.0f;
            this.f1253x0 = 1.0f;
            this.f1254y0 = 0.0f;
            this.f1255z0 = 0.0f;
            this.f1243A0 = 0.0f;
            this.f1244B0 = 0.0f;
            this.f1245C0 = 0.0f;
        }

        public C0245a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1246q0 = 1.0f;
            this.f1247r0 = false;
            this.f1248s0 = 0.0f;
            this.f1249t0 = 0.0f;
            this.f1250u0 = 0.0f;
            this.f1251v0 = 0.0f;
            this.f1252w0 = 1.0f;
            this.f1253x0 = 1.0f;
            this.f1254y0 = 0.0f;
            this.f1255z0 = 0.0f;
            this.f1243A0 = 0.0f;
            this.f1244B0 = 0.0f;
            this.f1245C0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1961e.f5786d);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 15) {
                    this.f1246q0 = obtainStyledAttributes.getFloat(index, this.f1246q0);
                } else if (index == 28) {
                    this.f1248s0 = obtainStyledAttributes.getFloat(index, this.f1248s0);
                    this.f1247r0 = true;
                } else if (index == 23) {
                    this.f1250u0 = obtainStyledAttributes.getFloat(index, this.f1250u0);
                } else if (index == 24) {
                    this.f1251v0 = obtainStyledAttributes.getFloat(index, this.f1251v0);
                } else if (index == 22) {
                    this.f1249t0 = obtainStyledAttributes.getFloat(index, this.f1249t0);
                } else if (index == 20) {
                    this.f1252w0 = obtainStyledAttributes.getFloat(index, this.f1252w0);
                } else if (index == 21) {
                    this.f1253x0 = obtainStyledAttributes.getFloat(index, this.f1253x0);
                } else if (index == 16) {
                    this.f1254y0 = obtainStyledAttributes.getFloat(index, this.f1254y0);
                } else if (index == 17) {
                    this.f1255z0 = obtainStyledAttributes.getFloat(index, this.f1255z0);
                } else if (index == 18) {
                    this.f1243A0 = obtainStyledAttributes.getFloat(index, this.f1243A0);
                } else if (index == 19) {
                    this.f1244B0 = obtainStyledAttributes.getFloat(index, this.f1244B0);
                } else if (index == 27) {
                    this.f1245C0 = obtainStyledAttributes.getFloat(index, this.f1245C0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0245a(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0245a(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C0233a(layoutParams);
    }

    public C0237b getConstraintSet() {
        if (this.f1242e == null) {
            this.f1242e = new C0237b();
        }
        C0237b bVar = this.f1242e;
        Objects.requireNonNull(bVar);
        int childCount = getChildCount();
        bVar.f1119c.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            C0245a aVar = (C0245a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!bVar.f1118b || id != -1) {
                if (!bVar.f1119c.containsKey(Integer.valueOf(id))) {
                    bVar.f1119c.put(Integer.valueOf(id), new C0237b.C0238a());
                }
                C0237b.C0238a aVar2 = bVar.f1119c.get(Integer.valueOf(id));
                if (aVar2 != null) {
                    if (childAt instanceof C0236a) {
                        C0236a aVar3 = (C0236a) childAt;
                        aVar2.mo1317c(id, aVar);
                        if (aVar3 instanceof Barrier) {
                            C0237b.C0240b bVar2 = aVar2.f1123d;
                            bVar2.f1181h0 = 1;
                            Barrier barrier = (Barrier) aVar3;
                            bVar2.f1177f0 = barrier.getType();
                            aVar2.f1123d.f1183i0 = barrier.getReferencedIds();
                            aVar2.f1123d.f1179g0 = barrier.getMargin();
                        }
                    }
                    aVar2.mo1317c(id, aVar);
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        return this.f1242e;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
