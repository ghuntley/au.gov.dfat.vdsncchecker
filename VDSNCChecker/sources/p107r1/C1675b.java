package p107r1;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: r1.b */
public class C1675b extends FloatingActionButton.C0728a {

    /* renamed from: a */
    public final /* synthetic */ int f5108a;

    /* renamed from: b */
    public final /* synthetic */ BottomAppBar f5109b;

    /* renamed from: r1.b$a */
    public class C1676a extends FloatingActionButton.C0728a {
        public C1676a() {
        }

        /* renamed from: b */
        public void mo3696b(FloatingActionButton floatingActionButton) {
            BottomAppBar.m2093w(C1675b.this.f5109b);
        }
    }

    public C1675b(BottomAppBar bottomAppBar, int i) {
        this.f5109b = bottomAppBar;
        this.f5108a = i;
    }

    /* renamed from: a */
    public void mo3695a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.f5109b.mo3182A(this.f5108a));
        floatingActionButton.mo3649m(new C1676a(), true);
    }
}
