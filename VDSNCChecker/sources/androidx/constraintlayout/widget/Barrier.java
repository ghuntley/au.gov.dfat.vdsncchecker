package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p111s.C1690a;
import p129v.C1961e;

public class Barrier extends C0236a {

    /* renamed from: m */
    public int f1008m;

    /* renamed from: n */
    public int f1009n;

    /* renamed from: o */
    public C1690a f1010o;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f1010o.f5131t0;
    }

    public int getMargin() {
        return this.f1010o.f5132u0;
    }

    public int getType() {
        return this.f1008m;
    }

    /* renamed from: i */
    public void mo1239i(AttributeSet attributeSet) {
        super.mo1239i(attributeSet);
        this.f1010o = new C1690a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1961e.f5784b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f1010o.f5131t0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f1010o.f5132u0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1109h = this.f1010o;
        mo1298k();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0 == 6) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r0 == 6) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1240j(p111s.C1695e r4, boolean r5) {
        /*
            r3 = this;
            int r0 = r3.f1008m
            r3.f1009n = r0
            r1 = 6
            r2 = 5
            if (r5 == 0) goto L_0x000e
            if (r0 != r2) goto L_0x000b
            goto L_0x0016
        L_0x000b:
            if (r0 != r1) goto L_0x0018
            goto L_0x0010
        L_0x000e:
            if (r0 != r2) goto L_0x0014
        L_0x0010:
            r5 = 0
        L_0x0011:
            r3.f1009n = r5
            goto L_0x0018
        L_0x0014:
            if (r0 != r1) goto L_0x0018
        L_0x0016:
            r5 = 1
            goto L_0x0011
        L_0x0018:
            boolean r5 = r4 instanceof p111s.C1690a
            if (r5 == 0) goto L_0x0022
            s.a r4 = (p111s.C1690a) r4
            int r5 = r3.f1009n
            r4.f5130s0 = r5
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.mo1240j(s.e, boolean):void");
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f1010o.f5131t0 = z;
    }

    public void setDpMargin(int i) {
        this.f1010o.f5132u0 = (int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f1010o.f5132u0 = i;
    }

    public void setType(int i) {
        this.f1008m = i;
    }
}
