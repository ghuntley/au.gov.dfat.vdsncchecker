package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p111s.C1695e;
import p111s.C1698h;
import p129v.C1960d;
import p129v.C1961e;

/* renamed from: androidx.constraintlayout.widget.a */
public abstract class C0236a extends View {

    /* renamed from: e */
    public int[] f1106e = new int[32];

    /* renamed from: f */
    public int f1107f;

    /* renamed from: g */
    public Context f1108g;

    /* renamed from: h */
    public C1698h f1109h;

    /* renamed from: i */
    public String f1110i;

    /* renamed from: j */
    public String f1111j;

    /* renamed from: k */
    public View[] f1112k = null;

    /* renamed from: l */
    public HashMap<Integer, String> f1113l = new HashMap<>();

    public C0236a(Context context) {
        super(context);
        this.f1108g = context;
        mo1239i((AttributeSet) null);
    }

    public C0236a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1108g = context;
        mo1239i(attributeSet);
    }

    /* renamed from: c */
    public final void mo1291c(String str) {
        if (str != null && str.length() != 0 && this.f1108g != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            ConstraintLayout constraintLayout2 = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
            int i = 0;
            if (isInEditMode() && constraintLayout2 != null) {
                Object c = constraintLayout2.mo1246c(0, trim);
                if (c instanceof Integer) {
                    i = ((Integer) c).intValue();
                }
            }
            if (i == 0 && constraintLayout2 != null) {
                i = mo1297h(constraintLayout2, trim);
            }
            if (i == 0) {
                try {
                    i = C1960d.class.getField(trim).getInt((Object) null);
                } catch (Exception unused) {
                }
            }
            if (i == 0) {
                i = this.f1108g.getResources().getIdentifier(trim, "id", this.f1108g.getPackageName());
            }
            if (i != 0) {
                this.f1113l.put(Integer.valueOf(i), trim);
                mo1292d(i);
            }
        }
    }

    /* renamed from: d */
    public final void mo1292d(int i) {
        if (i != getId()) {
            int i2 = this.f1107f + 1;
            int[] iArr = this.f1106e;
            if (i2 > iArr.length) {
                this.f1106e = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f1106e;
            int i3 = this.f1107f;
            iArr2[i3] = i;
            this.f1107f = i3 + 1;
        }
    }

    /* renamed from: e */
    public final void mo1293e(String str) {
        if (str != null && str.length() != 0 && this.f1108g != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = null;
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            }
            if (constraintLayout != null) {
                int childCount = constraintLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = constraintLayout.getChildAt(i);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if ((layoutParams instanceof ConstraintLayout.C0233a) && trim.equals(((ConstraintLayout.C0233a) layoutParams).f1052X) && childAt.getId() != -1) {
                        mo1292d(childAt.getId());
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public void mo1294f(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f1107f; i++) {
            View e = constraintLayout.mo1249e(this.f1106e[i]);
            if (e != null) {
                e.setVisibility(visibility);
                if (elevation > 0.0f) {
                    e.setTranslationZ(e.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* renamed from: g */
    public void mo1295g(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1106e, this.f1107f);
    }

    /* renamed from: h */
    public final int mo1297h(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || (resources = this.f1108g.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: i */
    public void mo1239i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1961e.f5784b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1110i = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f1111j = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: j */
    public void mo1240j(C1695e eVar, boolean z) {
    }

    /* renamed from: k */
    public void mo1298k() {
        if (this.f1109h != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.C0233a) {
                ((ConstraintLayout.C0233a) layoutParams).f1086p0 = (C1695e) this.f1109h;
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1110i;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1111j;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f1110i = str;
        if (str != null) {
            int i = 0;
            this.f1107f = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    mo1291c(str.substring(i));
                    return;
                } else {
                    mo1291c(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f1111j = str;
        if (str != null) {
            int i = 0;
            this.f1107f = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    mo1293e(str.substring(i));
                    return;
                } else {
                    mo1293e(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1110i = null;
        this.f1107f = 0;
        for (int d : iArr) {
            mo1292d(d);
        }
    }

    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f1110i == null) {
            mo1292d(i);
        }
    }
}
