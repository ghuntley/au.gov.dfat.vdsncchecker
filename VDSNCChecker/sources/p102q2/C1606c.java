package p102q2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0237b;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Objects;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p058j0.C1061o;
import p058j0.C1070q;
import p072l2.C1242f;
import p072l2.C1245g;
import p072l2.C1247i;
import p083n1.C1455a;

/* renamed from: q2.c */
public class C1606c extends ConstraintLayout {

    /* renamed from: w */
    public final Runnable f4985w;

    /* renamed from: x */
    public int f4986x;

    /* renamed from: y */
    public C1242f f4987y;

    /* renamed from: q2.c$a */
    public class C1607a implements Runnable {
        public C1607a() {
        }

        public void run() {
            C1606c.this.mo5752s();
        }
    }

    public C1606c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1606c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C1242f fVar = new C1242f();
        this.f4987y = fVar;
        C1245g gVar = new C1245g(0.5f);
        C1247i iVar = fVar.f4164e.f4187a;
        Objects.requireNonNull(iVar);
        C1247i.C1249b bVar = new C1247i.C1249b(iVar);
        bVar.f4226e = gVar;
        bVar.f4227f = gVar;
        bVar.f4228g = gVar;
        bVar.f4229h = gVar;
        fVar.f4164e.f4187a = bVar.mo4991a();
        fVar.invalidateSelf();
        this.f4987y.mo4976p(ColorStateList.valueOf(-1));
        C1242f fVar2 = this.f4987y;
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        setBackground(fVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1455a.f4585w, i, 0);
        this.f4986x = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f4985w = new C1607a();
        obtainStyledAttributes.recycle();
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f4985w);
            handler.post(this.f4985w);
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        mo5752s();
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f4985w);
            handler.post(this.f4985w);
        }
    }

    /* renamed from: s */
    public void mo5752s() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if ("skip".equals(getChildAt(i2).getTag())) {
                i++;
            }
        }
        C0237b bVar = new C0237b();
        bVar.mo1308c(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int id = childAt.getId();
                int i4 = this.f4986x;
                C0237b.C0240b bVar2 = bVar.mo1312g(id).f1123d;
                bVar2.f1206z = R.id.circle_center;
                bVar2.f1140A = i4;
                bVar2.f1141B = f;
                f = (360.0f / ((float) (childCount - i))) + f;
            }
        }
        bVar.mo1307b(this, true);
        setConstraintSet((C0237b) null);
        requestLayout();
    }

    public void setBackgroundColor(int i) {
        this.f4987y.mo4976p(ColorStateList.valueOf(i));
    }
}
