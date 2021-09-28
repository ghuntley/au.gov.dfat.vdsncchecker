package p063k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p028e0.C0861a;
import p028e0.C0862b;
import p063k.C1135a;
import p069l.C1216c;
import p069l.C1223e;
import p093p.C1558h;

/* renamed from: k.e */
public class C1140e extends ActionMode {

    /* renamed from: a */
    public final Context f3945a;

    /* renamed from: b */
    public final C1135a f3946b;

    /* renamed from: k.e$a */
    public static class C1141a implements C1135a.C1136a {

        /* renamed from: a */
        public final ActionMode.Callback f3947a;

        /* renamed from: b */
        public final Context f3948b;

        /* renamed from: c */
        public final ArrayList<C1140e> f3949c = new ArrayList<>();

        /* renamed from: d */
        public final C1558h<Menu, Menu> f3950d = new C1558h<>();

        public C1141a(Context context, ActionMode.Callback callback) {
            this.f3948b = context;
            this.f3947a = callback;
        }

        /* renamed from: a */
        public boolean mo4346a(C1135a aVar, MenuItem menuItem) {
            return this.f3947a.onActionItemClicked(mo4733e(aVar), new C1216c(this.f3948b, (C0862b) menuItem));
        }

        /* renamed from: b */
        public boolean mo4347b(C1135a aVar, Menu menu) {
            return this.f3947a.onPrepareActionMode(mo4733e(aVar), mo4734f(menu));
        }

        /* renamed from: c */
        public boolean mo4348c(C1135a aVar, Menu menu) {
            return this.f3947a.onCreateActionMode(mo4733e(aVar), mo4734f(menu));
        }

        /* renamed from: d */
        public void mo4349d(C1135a aVar) {
            this.f3947a.onDestroyActionMode(mo4733e(aVar));
        }

        /* renamed from: e */
        public ActionMode mo4733e(C1135a aVar) {
            int size = this.f3949c.size();
            for (int i = 0; i < size; i++) {
                C1140e eVar = this.f3949c.get(i);
                if (eVar != null && eVar.f3946b == aVar) {
                    return eVar;
                }
            }
            C1140e eVar2 = new C1140e(this.f3948b, aVar);
            this.f3949c.add(eVar2);
            return eVar2;
        }

        /* renamed from: f */
        public final Menu mo4734f(Menu menu) {
            Menu orDefault = this.f3950d.getOrDefault(menu, null);
            if (orDefault != null) {
                return orDefault;
            }
            C1223e eVar = new C1223e(this.f3948b, (C0861a) menu);
            this.f3950d.put(menu, eVar);
            return eVar;
        }
    }

    public C1140e(Context context, C1135a aVar) {
        this.f3945a = context;
        this.f3946b = aVar;
    }

    public void finish() {
        this.f3946b.mo4408c();
    }

    public View getCustomView() {
        return this.f3946b.mo4409d();
    }

    public Menu getMenu() {
        return new C1223e(this.f3945a, (C0861a) this.f3946b.mo4410e());
    }

    public MenuInflater getMenuInflater() {
        return this.f3946b.mo4411f();
    }

    public CharSequence getSubtitle() {
        return this.f3946b.mo4412g();
    }

    public Object getTag() {
        return this.f3946b.f3932e;
    }

    public CharSequence getTitle() {
        return this.f3946b.mo4413h();
    }

    public boolean getTitleOptionalHint() {
        return this.f3946b.f3933f;
    }

    public void invalidate() {
        this.f3946b.mo4414i();
    }

    public boolean isTitleOptional() {
        return this.f3946b.mo4415j();
    }

    public void setCustomView(View view) {
        this.f3946b.mo4416k(view);
    }

    public void setSubtitle(int i) {
        this.f3946b.mo4417l(i);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f3946b.mo4418m(charSequence);
    }

    public void setTag(Object obj) {
        this.f3946b.f3932e = obj;
    }

    public void setTitle(int i) {
        this.f3946b.mo4419n(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.f3946b.mo4420o(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f3946b.mo4421p(z);
    }
}
