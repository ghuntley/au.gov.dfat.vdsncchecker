package p106r0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.C0051a;
import androidx.fragment.app.C0286k;
import androidx.fragment.app.C0302r;
import androidx.lifecycle.C0342c;
import androidx.lifecycle.C0347e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;
import p015c.C0556e;
import p027e.C0858f;
import p039g.C0933a;
import p118t0.C1784r;
import p118t0.C1785s;
import p124u0.C1829a;
import p150z.C2145a;

/* renamed from: r0.f */
public class C1643f extends ComponentActivity implements C2145a.C2146a {

    /* renamed from: m */
    public final C1646h f5035m;

    /* renamed from: n */
    public final C0347e f5036n = new C0347e(this);

    /* renamed from: o */
    public boolean f5037o;

    /* renamed from: p */
    public boolean f5038p;

    /* renamed from: q */
    public boolean f5039q = true;

    /* renamed from: r0.f$a */
    public class C1644a extends C1647i<C1643f> implements C1785s, C0556e, C0858f, C1653m {
        public C1644a() {
            super(C1643f.this);
        }

        /* renamed from: a */
        public void mo1740a(C0302r rVar, C0286k kVar) {
            Objects.requireNonNull(C1643f.this);
        }

        /* renamed from: b */
        public View mo1648b(int i) {
            return C1643f.this.findViewById(i);
        }

        /* renamed from: c */
        public C0342c mo113c() {
            return C1643f.this.f5036n;
        }

        /* renamed from: d */
        public OnBackPressedDispatcher mo114d() {
            return C1643f.this.f146j;
        }

        /* renamed from: f */
        public boolean mo1649f() {
            Window window = C1643f.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        /* renamed from: g */
        public C0051a mo115g() {
            return C1643f.this.f148l;
        }

        /* renamed from: h */
        public Object mo5800h() {
            return C1643f.this;
        }

        /* renamed from: i */
        public LayoutInflater mo5801i() {
            return C1643f.this.getLayoutInflater().cloneInContext(C1643f.this);
        }

        /* renamed from: j */
        public C1784r mo116j() {
            return C1643f.this.mo116j();
        }

        /* renamed from: k */
        public boolean mo5802k(C0286k kVar) {
            return !C1643f.this.isFinishing();
        }

        /* renamed from: l */
        public void mo5803l() {
            C1643f.this.mo4291q();
        }
    }

    public C1643f() {
        C1644a aVar = new C1644a();
        C0933a.m2709c(aVar, "callbacks == null");
        this.f5035m = new C1646h(aVar);
        this.f144h.f2b.mo2452b("android:support:fragments", new C1641d(this));
        mo117l(new C1642e(this));
    }

    /* renamed from: p */
    public static boolean m4561p(C0302r rVar, C0342c.C0345c cVar) {
        C0342c.C0345c cVar2 = C0342c.C0345c.STARTED;
        boolean z = false;
        for (C0286k next : rVar.f1532c.mo5828i()) {
            if (next != null) {
                C1647i<?> iVar = next.f1474w;
                if ((iVar == null ? null : iVar.mo5800h()) != null) {
                    z |= m4561p(next.mo1620h(), cVar);
                }
                C1669v vVar = next.f1450S;
                if (vVar != null) {
                    vVar.mo5861b();
                    if (vVar.f5104f.f1689b.compareTo(cVar2) >= 0) {
                        C0347e eVar = next.f1450S.f5104f;
                        eVar.mo1806d("setCurrentState");
                        eVar.mo1808g(cVar);
                        z = true;
                    }
                }
                if (next.f1449R.f1689b.compareTo(cVar2) >= 0) {
                    C0347e eVar2 = next.f1449R;
                    eVar2.mo1806d("setCurrentState");
                    eVar2.mo1808g(cVar);
                    z = true;
                }
            }
        }
        return z;
    }

    @Deprecated
    /* renamed from: a */
    public final void mo5788a(int i) {
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f5037o);
        printWriter.print(" mResumed=");
        printWriter.print(this.f5038p);
        printWriter.print(" mStopped=");
        printWriter.print(this.f5039q);
        if (getApplication() != null) {
            C1829a.m5026b(this).mo6206a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f5035m.f5041a.f5045h.mo1733y(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: o */
    public C0302r mo5790o() {
        return this.f5035m.f5041a.f5045h;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.f5035m.mo5804a();
        super.onActivityResult(i, i2, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f5035m.mo5804a();
        super.onConfigurationChanged(configuration);
        this.f5035m.f5041a.f5045h.mo1718k(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5036n.mo1807e(C0342c.C0344b.ON_CREATE);
        this.f5035m.f5041a.f5045h.mo1720m();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        C1646h hVar = this.f5035m;
        return onCreatePanelMenu | hVar.f5041a.f5045h.mo1721n(menu, getMenuInflater());
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f5035m.f5041a.f5045h.f1535f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f5035m.f5041a.f5045h.mo1722o();
        this.f5036n.mo1807e(C0342c.C0344b.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f5035m.f5041a.f5045h.mo1723p();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f5035m.f5041a.f5045h.mo1725r(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f5035m.f5041a.f5045h.mo1719l(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f5035m.f5041a.f5045h.mo1724q(z);
    }

    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.f5035m.mo5804a();
        super.onNewIntent(intent);
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f5035m.f5041a.f5045h.mo1726s(menu);
        }
        super.onPanelClosed(i, menu);
    }

    public void onPause() {
        super.onPause();
        this.f5038p = false;
        this.f5035m.f5041a.f5045h.mo1731w(5);
        this.f5036n.mo1807e(C0342c.C0344b.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f5035m.f5041a.f5045h.mo1729u(z);
    }

    public void onPostResume() {
        super.onPostResume();
        this.f5036n.mo1807e(C0342c.C0344b.ON_RESUME);
        C0302r rVar = this.f5035m.f5041a.f5045h;
        rVar.f1520B = false;
        rVar.f1521C = false;
        rVar.f1528J.f5055h = false;
        rVar.mo1731w(7);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return super.onPreparePanel(0, view, menu) | this.f5035m.f5041a.f5045h.mo1730v(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f5035m.mo5804a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResume() {
        this.f5035m.mo5804a();
        super.onResume();
        this.f5038p = true;
        this.f5035m.f5041a.f5045h.mo1676C(true);
    }

    public void onStart() {
        this.f5035m.mo5804a();
        super.onStart();
        this.f5039q = false;
        if (!this.f5037o) {
            this.f5037o = true;
            C0302r rVar = this.f5035m.f5041a.f5045h;
            rVar.f1520B = false;
            rVar.f1521C = false;
            rVar.f1528J.f5055h = false;
            rVar.mo1731w(4);
        }
        this.f5035m.f5041a.f5045h.mo1676C(true);
        this.f5036n.mo1807e(C0342c.C0344b.ON_START);
        C0302r rVar2 = this.f5035m.f5041a.f5045h;
        rVar2.f1520B = false;
        rVar2.f1521C = false;
        rVar2.f1528J.f5055h = false;
        rVar2.mo1731w(5);
    }

    public void onStateNotSaved() {
        this.f5035m.mo5804a();
    }

    public void onStop() {
        super.onStop();
        this.f5039q = true;
        do {
        } while (m4561p(mo5790o(), C0342c.C0345c.CREATED));
        C0302r rVar = this.f5035m.f5041a.f5045h;
        rVar.f1521C = true;
        rVar.f1528J.f5055h = true;
        rVar.mo1731w(4);
        this.f5036n.mo1807e(C0342c.C0344b.ON_STOP);
    }

    @Deprecated
    /* renamed from: q */
    public void mo4291q() {
        invalidateOptionsMenu();
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f5035m.f5041a.f5045h.f1535f.onCreateView((View) null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
