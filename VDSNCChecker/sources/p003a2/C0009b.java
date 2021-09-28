package p003a2;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.C0060b;
import java.util.WeakHashMap;
import p058j0.C1061o;
import p058j0.C1070q;
import p072l2.C1242f;

/* renamed from: a2.b */
public class C0009b extends C0060b.C0061a {

    /* renamed from: c */
    public Drawable f7c;

    /* renamed from: d */
    public final Rect f8d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0009b(android.content.Context r14) {
        /*
            r13 = this;
            r0 = 2130903637(0x7f030255, float:1.7414098E38)
            android.util.TypedValue r1 = p054i2.C1029b.m2953a(r14, r0)
            r2 = 0
            if (r1 != 0) goto L_0x000c
            r1 = r2
            goto L_0x000e
        L_0x000c:
            int r1 = r1.data
        L_0x000e:
            r3 = 0
            r4 = 2130903083(0x7f03002b, float:1.7412974E38)
            r5 = 2131951848(0x7f1300e8, float:1.9540122E38)
            android.content.Context r6 = p096p2.C1578a.m4424a(r14, r3, r4, r5)
            if (r1 != 0) goto L_0x001c
            goto L_0x0022
        L_0x001c:
            k.c r7 = new k.c
            r7.<init>(r6, r1)
            r6 = r7
        L_0x0022:
            android.util.TypedValue r14 = p054i2.C1029b.m2953a(r14, r0)
            if (r14 != 0) goto L_0x002a
            r14 = r2
            goto L_0x002c
        L_0x002a:
            int r14 = r14.data
        L_0x002c:
            r13.<init>(r6, r14)
            androidx.appcompat.app.AlertController$b r14 = r13.f264a
            android.content.Context r14 = r14.f241a
            android.content.res.Resources$Theme r0 = r14.getTheme()
            int[] r1 = p083n1.C1455a.f4573k
            int[] r11 = new int[r2]
            p036f2.C0903k.m2659a(r14, r3, r4, r5)
            r7 = 0
            r9 = 2130903083(0x7f03002b, float:1.7412974E38)
            r10 = 2131951848(0x7f1300e8, float:1.9540122E38)
            r6 = r14
            r8 = r1
            p036f2.C0903k.m2660b(r6, r7, r8, r9, r10, r11)
            android.content.res.TypedArray r1 = r14.obtainStyledAttributes(r3, r1, r4, r5)
            r6 = 2
            android.content.res.Resources r7 = r14.getResources()
            r8 = 2131099852(0x7f0600cc, float:1.7812069E38)
            int r7 = r7.getDimensionPixelSize(r8)
            int r6 = r1.getDimensionPixelSize(r6, r7)
            r7 = 3
            android.content.res.Resources r8 = r14.getResources()
            r9 = 2131099853(0x7f0600cd, float:1.781207E38)
            int r8 = r8.getDimensionPixelSize(r9)
            int r7 = r1.getDimensionPixelSize(r7, r8)
            android.content.res.Resources r8 = r14.getResources()
            r9 = 2131099851(0x7f0600cb, float:1.7812067E38)
            int r8 = r8.getDimensionPixelSize(r9)
            r9 = 1
            int r8 = r1.getDimensionPixelSize(r9, r8)
            android.content.res.Resources r10 = r14.getResources()
            r11 = 2131099850(0x7f0600ca, float:1.7812065E38)
            int r10 = r10.getDimensionPixelSize(r11)
            int r2 = r1.getDimensionPixelSize(r2, r10)
            r1.recycle()
            android.content.res.Resources r1 = r14.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.getLayoutDirection()
            if (r1 != r9) goto L_0x00a1
            r12 = r8
            r8 = r6
            r6 = r12
        L_0x00a1:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r6, r7, r8, r2)
            r13.f8d = r1
            r1 = 2130903273(0x7f0300e9, float:1.741336E38)
            java.lang.Class<a2.b> r2 = p003a2.C0009b.class
            java.lang.String r2 = r2.getCanonicalName()
            int r1 = p054i2.C1029b.m2955c(r14, r1, r2)
            l2.f r2 = new l2.f
            r2.<init>(r14, r3, r4, r5)
            l2.f$b r3 = r2.f4164e
            c2.a r4 = new c2.a
            r4.<init>(r14)
            r3.f4188b = r4
            r2.mo4984w()
            android.content.res.ColorStateList r14 = android.content.res.ColorStateList.valueOf(r1)
            r2.mo4976p(r14)
            int r14 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r14 < r1) goto L_0x0107
            android.util.TypedValue r14 = new android.util.TypedValue
            r14.<init>()
            r1 = 16844145(0x1010571, float:2.3697462E-38)
            r0.resolveAttribute(r1, r14, r9)
            androidx.appcompat.app.AlertController$b r0 = r13.f264a
            android.content.Context r0 = r0.f241a
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r14.getDimension(r0)
            int r14 = r14.type
            r1 = 5
            if (r14 != r1) goto L_0x0107
            r14 = 0
            int r14 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r14 < 0) goto L_0x0107
            l2.f$b r14 = r2.f4164e
            l2.i r14 = r14.f4187a
            l2.i r14 = r14.mo4990e(r0)
            l2.f$b r0 = r2.f4164e
            r0.f4187a = r14
            r2.invalidateSelf()
        L_0x0107:
            r13.f7c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p003a2.C0009b.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public C0060b mo5a() {
        C0060b a = super.mo5a();
        Window window = a.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f7c;
        if (drawable instanceof C1242f) {
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            ((C1242f) drawable).mo4974o(decorView.getElevation());
        }
        Drawable drawable2 = this.f7c;
        Rect rect = this.f8d;
        window.setBackgroundDrawable(new InsetDrawable(drawable2, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new C0008a(a, this.f8d));
        return a;
    }

    /* renamed from: b */
    public C0009b mo6b(int i, DialogInterface.OnClickListener onClickListener) {
        AlertController.C0056b bVar = this.f264a;
        bVar.f247g = bVar.f241a.getText(i);
        this.f264a.f248h = onClickListener;
        return this;
    }
}
