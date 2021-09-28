package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* renamed from: androidx.appcompat.widget.j */
public class C0171j {

    /* renamed from: a */
    public final CompoundButton f802a;

    /* renamed from: b */
    public ColorStateList f803b = null;

    /* renamed from: c */
    public PorterDuff.Mode f804c = null;

    /* renamed from: d */
    public boolean f805d = false;

    /* renamed from: e */
    public boolean f806e = false;

    /* renamed from: f */
    public boolean f807f;

    public C0171j(CompoundButton compoundButton) {
        this.f802a = compoundButton;
    }

    /* renamed from: a */
    public void mo955a() {
        Drawable buttonDrawable = this.f802a.getButtonDrawable();
        if (buttonDrawable == null) {
            return;
        }
        if (this.f805d || this.f806e) {
            Drawable mutate = buttonDrawable.mutate();
            if (this.f805d) {
                mutate.setTintList(this.f803b);
            }
            if (this.f806e) {
                mutate.setTintMode(this.f804c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f802a.getDrawableState());
            }
            this.f802a.setButtonDrawable(mutate);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039 A[SYNTHETIC, Splitter:B:11:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059 A[Catch:{ all -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c A[Catch:{ all -> 0x0063 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo956b(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f802a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p039g.C0934b.f3470l
            r8 = 0
            androidx.appcompat.widget.b1 r0 = androidx.appcompat.widget.C0136b1.m361q(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f802a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.f692b
            r7 = 0
            r4 = r10
            r6 = r11
            p058j0.C1061o.m3033n(r1, r2, r3, r4, r5, r6, r7)
            r10 = 1
            boolean r11 = r0.mo775o(r10)     // Catch:{ all -> 0x0063 }
            if (r11 == 0) goto L_0x0036
            int r11 = r0.mo772l(r10, r8)     // Catch:{ all -> 0x0063 }
            if (r11 == 0) goto L_0x0036
            android.widget.CompoundButton r1 = r9.f802a     // Catch:{ NotFoundException -> 0x0036 }
            android.content.Context r2 = r1.getContext()     // Catch:{ NotFoundException -> 0x0036 }
            android.graphics.drawable.Drawable r11 = p051i.C1021a.m2945a(r2, r11)     // Catch:{ NotFoundException -> 0x0036 }
            r1.setButtonDrawable(r11)     // Catch:{ NotFoundException -> 0x0036 }
            goto L_0x0037
        L_0x0036:
            r10 = r8
        L_0x0037:
            if (r10 != 0) goto L_0x0052
            boolean r10 = r0.mo775o(r8)     // Catch:{ all -> 0x0063 }
            if (r10 == 0) goto L_0x0052
            int r10 = r0.mo772l(r8, r8)     // Catch:{ all -> 0x0063 }
            if (r10 == 0) goto L_0x0052
            android.widget.CompoundButton r11 = r9.f802a     // Catch:{ all -> 0x0063 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0063 }
            android.graphics.drawable.Drawable r10 = p051i.C1021a.m2945a(r1, r10)     // Catch:{ all -> 0x0063 }
            r11.setButtonDrawable(r10)     // Catch:{ all -> 0x0063 }
        L_0x0052:
            r10 = 2
            boolean r11 = r0.mo775o(r10)     // Catch:{ all -> 0x0063 }
            if (r11 == 0) goto L_0x0065
            android.widget.CompoundButton r11 = r9.f802a     // Catch:{ all -> 0x0063 }
            android.content.res.ColorStateList r10 = r0.mo763c(r10)     // Catch:{ all -> 0x0063 }
            r11.setButtonTintList(r10)     // Catch:{ all -> 0x0063 }
            goto L_0x0065
        L_0x0063:
            r10 = move-exception
            goto L_0x0081
        L_0x0065:
            r10 = 3
            boolean r11 = r0.mo775o(r10)     // Catch:{ all -> 0x0063 }
            if (r11 == 0) goto L_0x007b
            android.widget.CompoundButton r11 = r9.f802a     // Catch:{ all -> 0x0063 }
            r1 = -1
            int r10 = r0.mo770j(r10, r1)     // Catch:{ all -> 0x0063 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.C0169i0.m488b(r10, r1)     // Catch:{ all -> 0x0063 }
            r11.setButtonTintMode(r10)     // Catch:{ all -> 0x0063 }
        L_0x007b:
            android.content.res.TypedArray r10 = r0.f692b
            r10.recycle()
            return
        L_0x0081:
            android.content.res.TypedArray r11 = r0.f692b
            r11.recycle()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0171j.mo956b(android.util.AttributeSet, int):void");
    }
}
