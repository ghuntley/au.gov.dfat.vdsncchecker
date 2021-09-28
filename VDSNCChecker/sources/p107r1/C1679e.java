package p107r1;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* renamed from: r1.e */
public class C1679e implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ ActionMenuView f5117e;

    /* renamed from: f */
    public final /* synthetic */ int f5118f;

    /* renamed from: g */
    public final /* synthetic */ boolean f5119g;

    /* renamed from: h */
    public final /* synthetic */ BottomAppBar f5120h;

    public C1679e(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.f5120h = bottomAppBar;
        this.f5117e = actionMenuView;
        this.f5118f = i;
        this.f5119g = z;
    }

    public void run() {
        ActionMenuView actionMenuView = this.f5117e;
        actionMenuView.setTranslationX((float) this.f5120h.mo3204z(actionMenuView, this.f5118f, this.f5119g));
    }
}
