package p045h;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.C0167h1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p001a0.C0002a;
import p007au.gov.dfat.vdsncchecker.R;
import p063k.C1135a;
import p093p.C1548c;
import p106r0.C1643f;
import p150z.C2145a;
import p150z.C2154f;

/* renamed from: h.e */
public class C0965e extends C1643f implements C0966f {

    /* renamed from: r */
    public C0967g f3540r;

    public C0965e() {
        this.f144h.f2b.mo2452b("androidx:appcompat", new C0963c(this));
        mo117l(new C0964d(this));
    }

    /* renamed from: n */
    private void m2761n() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2761n();
        mo4292r().mo4296c(view, layoutParams);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(mo4292r().mo4297d(context));
    }

    /* renamed from: b */
    public C1135a mo4270b(C1135a.C1136a aVar) {
        return null;
    }

    public void closeOptionsMenu() {
        C0958a s = mo4293s();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0958a s = mo4293s();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: f */
    public void mo4273f(C1135a aVar) {
    }

    public <T extends View> T findViewById(int i) {
        return mo4292r().mo4298e(i);
    }

    public MenuInflater getMenuInflater() {
        return mo4292r().mo4300g();
    }

    public Resources getResources() {
        int i = C0167h1.f796a;
        return super.getResources();
    }

    /* renamed from: i */
    public void mo4277i(C1135a aVar) {
    }

    public void invalidateOptionsMenu() {
        mo4292r().mo4303j();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo4292r().mo4304k(configuration);
    }

    public void onContentChanged() {
    }

    public void onDestroy() {
        super.onDestroy();
        mo4292r().mo4306m();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        r0 = getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 1
            if (r0 >= r1) goto L_0x003f
            boolean r0 = r5.isCtrlPressed()
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getRepeatCount()
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003f
            android.view.Window r0 = r3.getWindow()
            if (r0 == 0) goto L_0x003f
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x003f
            android.view.View r0 = r0.getDecorView()
            boolean r0 = r0.dispatchKeyShortcutEvent(r5)
            if (r0 == 0) goto L_0x003f
            r0 = r2
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r0 == 0) goto L_0x0043
            return r2
        L_0x0043:
            boolean r4 = super.onKeyDown(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p045h.C0965e.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0958a s = mo4293s();
        if (menuItem.getItemId() != 16908332 || s == null || (((C0995s) s).f3670e.mo843j() & 4) == 0) {
            return false;
        }
        Intent a = C2154f.m5566a(this);
        if (a == null) {
            return false;
        }
        if (shouldUpRecreateTask(a)) {
            ArrayList arrayList = new ArrayList();
            Intent t = mo4295t();
            if (t == null) {
                t = C2154f.m5566a(this);
            }
            if (t != null) {
                ComponentName component = t.getComponent();
                if (component == null) {
                    component = t.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                while (true) {
                    try {
                        Intent b = C2154f.m5567b(this, component);
                        if (b == null) {
                            break;
                        }
                        arrayList.add(size, b);
                        component = b.getComponent();
                    } catch (PackageManager.NameNotFoundException e) {
                        throw new IllegalArgumentException(e);
                    }
                }
                arrayList.add(t);
            }
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                Object obj = C0002a.f0a;
                C0002a.C0003a.m2a(this, intentArr, (Bundle) null);
                try {
                    int i2 = C2145a.f6196b;
                    finishAffinity();
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            navigateUpTo(a);
            return true;
        }
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo4292r().mo4307n(bundle);
    }

    public void onPostResume() {
        super.onPostResume();
        mo4292r().mo4308o();
    }

    public void onStart() {
        super.onStart();
        mo4292r().mo4310q();
    }

    public void onStop() {
        super.onStop();
        mo4292r().mo4311r();
    }

    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo4292r().mo4317y(charSequence);
    }

    public void openOptionsMenu() {
        C0958a s = mo4293s();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    /* renamed from: q */
    public void mo4291q() {
        mo4292r().mo4303j();
    }

    /* renamed from: r */
    public C0967g mo4292r() {
        if (this.f3540r == null) {
            C1548c<WeakReference<C0967g>> cVar = C0967g.f3541e;
            this.f3540r = new C0968h(this, (Window) null, this, this);
        }
        return this.f3540r;
    }

    /* renamed from: s */
    public C0958a mo4293s() {
        return mo4292r().mo4301h();
    }

    public void setContentView(int i) {
        m2761n();
        mo4292r().mo4313u(i);
    }

    public void setContentView(View view) {
        m2761n();
        mo4292r().mo4314v(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2761n();
        mo4292r().mo4315w(view, layoutParams);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        mo4292r().mo4316x(i);
    }

    /* renamed from: t */
    public Intent mo4295t() {
        return C2154f.m5566a(this);
    }
}
