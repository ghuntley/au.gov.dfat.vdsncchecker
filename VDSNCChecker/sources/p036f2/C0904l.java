package p036f2;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p036f2.C0906n;
import p058j0.C1057k;
import p058j0.C1076u;
import p113s1.C1708b;

/* renamed from: f2.l */
public final class C0904l implements C1057k {

    /* renamed from: a */
    public final /* synthetic */ C0906n.C0907a f3427a;

    /* renamed from: b */
    public final /* synthetic */ C0906n.C0908b f3428b;

    public C0904l(C0906n.C0907a aVar, C0906n.C0908b bVar) {
        this.f3427a = aVar;
        this.f3428b = bVar;
    }

    /* renamed from: a */
    public C1076u mo1392a(View view, C1076u uVar) {
        C0906n.C0907a aVar = this.f3427a;
        C0906n.C0908b bVar = this.f3428b;
        int i = bVar.f3429a;
        int i2 = bVar.f3431c;
        int i3 = bVar.f3432d;
        C1708b bVar2 = (C1708b) aVar;
        bVar2.f5278b.f2645r = uVar.mo4559d();
        boolean a = C0906n.m2664a(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        BottomSheetBehavior bottomSheetBehavior = bVar2.f5278b;
        if (bottomSheetBehavior.f2640m) {
            bottomSheetBehavior.f2644q = uVar.mo4556a();
            paddingBottom = bVar2.f5278b.f2644q + i3;
        }
        if (bVar2.f5278b.f2641n) {
            paddingLeft = uVar.mo4557b() + (a ? i2 : i);
        }
        if (bVar2.f5278b.f2642o) {
            if (!a) {
                i = i2;
            }
            paddingRight = uVar.mo4558c() + i;
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        if (bVar2.f5277a) {
            bVar2.f5278b.f2638k = uVar.f3826a.mo4585f().f2362d;
        }
        BottomSheetBehavior bottomSheetBehavior2 = bVar2.f5278b;
        if (bottomSheetBehavior2.f2640m || bVar2.f5277a) {
            bottomSheetBehavior2.mo3218J(false);
        }
        return uVar;
    }
}
