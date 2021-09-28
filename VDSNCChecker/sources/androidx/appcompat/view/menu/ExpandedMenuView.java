package androidx.appcompat.view.menu;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0074e;

public final class ExpandedMenuView extends ListView implements C0074e.C0076b, C0084j, AdapterView.OnItemClickListener {

    /* renamed from: f */
    public static final int[] f278f = {16842964, 16843049};

    /* renamed from: e */
    public C0074e f279e;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        r0 = r5.getResourceId(0, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExpandedMenuView(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r3.<init>(r4, r5)
            r3.setOnItemClickListener(r3)
            int[] r0 = f278f
            r1 = 0
            r2 = 16842868(0x1010074, float:2.3693883E-38)
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r0, r2, r1)
            boolean r0 = r5.hasValue(r1)
            if (r0 == 0) goto L_0x002e
            boolean r0 = r5.hasValue(r1)
            if (r0 == 0) goto L_0x0027
            int r0 = r5.getResourceId(r1, r1)
            if (r0 == 0) goto L_0x0027
            android.graphics.drawable.Drawable r0 = p051i.C1021a.m2945a(r4, r0)
            goto L_0x002b
        L_0x0027:
            android.graphics.drawable.Drawable r0 = r5.getDrawable(r1)
        L_0x002b:
            r3.setBackgroundDrawable(r0)
        L_0x002e:
            r0 = 1
            boolean r2 = r5.hasValue(r0)
            if (r2 == 0) goto L_0x004d
            boolean r2 = r5.hasValue(r0)
            if (r2 == 0) goto L_0x0046
            int r1 = r5.getResourceId(r0, r1)
            if (r1 == 0) goto L_0x0046
            android.graphics.drawable.Drawable r4 = p051i.C1021a.m2945a(r4, r1)
            goto L_0x004a
        L_0x0046:
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r0)
        L_0x004a:
            r3.setDivider(r4)
        L_0x004d:
            r5.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ExpandedMenuView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: a */
    public boolean mo182a(C0078g gVar) {
        return this.f279e.mo278r(gVar, (C0082i) null, 0);
    }

    /* renamed from: b */
    public void mo183b(C0074e eVar) {
        this.f279e = eVar;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo182a((C0078g) getAdapter().getItem(i));
    }
}
