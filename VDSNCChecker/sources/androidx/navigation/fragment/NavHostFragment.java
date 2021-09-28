package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.C0262a;
import androidx.fragment.app.C0286k;
import androidx.fragment.app.C0302r;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.C0369e;
import androidx.navigation.C0372f;
import androidx.navigation.NavController;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import p007au.gov.dfat.vdsncchecker.R;
import p106r0.C1634b;
import p106r0.C1640c;
import p118t0.C1784r;
import p136w0.C2004g;
import p136w0.C2006h;
import p136w0.C2008i;
import p136w0.C2013k;
import p136w0.C2033o;
import p136w0.C2037s;
import p146y0.C2131a;

public class NavHostFragment extends C0286k {

    /* renamed from: Z */
    public C2013k f1768Z;

    /* renamed from: a0 */
    public Boolean f1769a0 = null;

    /* renamed from: b0 */
    public View f1770b0;

    /* renamed from: c0 */
    public int f1771c0;

    /* renamed from: d0 */
    public boolean f1772d0;

    /* renamed from: m0 */
    public static NavController m1076m0(C0286k kVar) {
        for (C0286k kVar2 = kVar; kVar2 != null; kVar2 = kVar2.f1476y) {
            if (kVar2 instanceof NavHostFragment) {
                return ((NavHostFragment) kVar2).mo1883n0();
            }
            C0286k kVar3 = kVar2.mo1638r().f1549t;
            if (kVar3 instanceof NavHostFragment) {
                return ((NavHostFragment) kVar3).mo1883n0();
            }
        }
        View view = kVar.f1441J;
        if (view != null) {
            return C2033o.m5360a(view);
        }
        Dialog dialog = kVar instanceof C1634b ? ((C1634b) kVar).f5022k0 : null;
        if (dialog != null && dialog.getWindow() != null) {
            return C2033o.m5360a(dialog.getWindow().getDecorView());
        }
        throw new IllegalStateException(C1640c.m4558a("Fragment ", kVar, " does not have a NavController set"));
    }

    /* renamed from: F */
    public void mo1587F(Context context) {
        super.mo1587F(context);
        if (this.f1772d0) {
            C0262a aVar = new C0262a(mo1638r());
            aVar.mo1543l(this);
            aVar.mo1534c();
        }
    }

    /* renamed from: G */
    public void mo1588G(C0286k kVar) {
        C0372f fVar = this.f1768Z.f1729k;
        Objects.requireNonNull(fVar);
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) fVar.mo1882c(C0372f.m1065b(DialogFragmentNavigator.class));
        if (dialogFragmentNavigator.f1765d.remove(kVar.f1433B)) {
            kVar.f1449R.mo1802a(dialogFragmentNavigator.f1766e);
        }
    }

    /* renamed from: H */
    public void mo1589H(Bundle bundle) {
        Bundle bundle2;
        C2013k kVar = new C2013k(mo1611b0());
        this.f1768Z = kVar;
        if (this != kVar.f1727i) {
            kVar.f1727i = this;
            this.f1449R.mo1802a(kVar.f1731m);
        }
        C2013k kVar2 = this.f1768Z;
        OnBackPressedDispatcher onBackPressedDispatcher = mo1609a0().f146j;
        if (kVar2.f1727i != null) {
            kVar2.f1732n.mo2701b();
            onBackPressedDispatcher.mo139a(kVar2.f1727i, kVar2.f1732n);
            kVar2.f1727i.mo113c().mo1803b(kVar2.f1731m);
            kVar2.f1727i.mo113c().mo1802a(kVar2.f1731m);
            C2013k kVar3 = this.f1768Z;
            Boolean bool = this.f1769a0;
            int i = 0;
            kVar3.f1733o = bool != null && bool.booleanValue();
            kVar3.mo1859h();
            Bundle bundle3 = null;
            this.f1769a0 = null;
            C2013k kVar4 = this.f1768Z;
            C1784r j = mo116j();
            if (kVar4.f1728j != C2008i.m5281d(j)) {
                if (kVar4.f1726h.isEmpty()) {
                    kVar4.f1728j = C2008i.m5281d(j);
                } else {
                    throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                }
            }
            C2013k kVar5 = this.f1768Z;
            kVar5.f1729k.mo1881a(new DialogFragmentNavigator(mo1611b0(), mo1620h()));
            C0372f fVar = kVar5.f1729k;
            Context b0 = mo1611b0();
            C0302r h = mo1620h();
            int i2 = this.f1477z;
            if (i2 == 0 || i2 == -1) {
                i2 = R.id.nav_host_fragment_container;
            }
            fVar.mo1881a(new C0375a(b0, h, i2));
            if (bundle != null) {
                bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
                if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                    this.f1772d0 = true;
                    C0262a aVar = new C0262a(mo1638r());
                    aVar.mo1543l(this);
                    aVar.mo1534c();
                }
                this.f1771c0 = bundle.getInt("android-support-nav:fragment:graphId");
            } else {
                bundle2 = null;
            }
            if (bundle2 != null) {
                C2013k kVar6 = this.f1768Z;
                Objects.requireNonNull(kVar6);
                bundle2.setClassLoader(kVar6.f1719a.getClassLoader());
                kVar6.f1723e = bundle2.getBundle("android-support-nav:controller:navigatorState");
                kVar6.f1724f = bundle2.getParcelableArray("android-support-nav:controller:backStack");
                kVar6.f1725g = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled");
            }
            int i3 = this.f1771c0;
            if (i3 != 0) {
                this.f1768Z.mo1858g(i3, (Bundle) null);
            } else {
                Bundle bundle4 = this.f1461j;
                if (bundle4 != null) {
                    i = bundle4.getInt("android-support-nav:fragment:graphId");
                }
                if (bundle4 != null) {
                    bundle3 = bundle4.getBundle("android-support-nav:fragment:startDestinationArgs");
                }
                if (i != 0) {
                    this.f1768Z.mo1858g(i, bundle3);
                }
            }
            super.mo1589H(bundle);
            return;
        }
        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
    }

    /* renamed from: J */
    public View mo1591J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        int i = this.f1477z;
        if (i == 0 || i == -1) {
            i = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(i);
        return fragmentContainerView;
    }

    /* renamed from: K */
    public void mo1592K() {
        this.f1439H = true;
        View view = this.f1770b0;
        if (view != null && C2033o.m5360a(view) == this.f1768Z) {
            this.f1770b0.setTag(R.id.nav_controller_view_tag, (Object) null);
        }
        this.f1770b0 = null;
    }

    /* renamed from: N */
    public void mo1595N(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.mo1595N(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2037s.f5877b);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f1771c0 = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C2131a.f6182c);
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.f1772d0 = true;
        }
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: Q */
    public void mo1598Q(boolean z) {
        C2013k kVar = this.f1768Z;
        if (kVar != null) {
            kVar.f1733o = z;
            kVar.mo1859h();
            return;
        }
        this.f1769a0 = Boolean.valueOf(z);
    }

    /* renamed from: R */
    public void mo1599R(Bundle bundle) {
        Bundle bundle2;
        C2013k kVar = this.f1768Z;
        Objects.requireNonNull(kVar);
        ArrayList arrayList = new ArrayList();
        Bundle bundle3 = new Bundle();
        for (Map.Entry next : kVar.f1729k.f1761a.entrySet()) {
            String str = (String) next.getKey();
            Bundle d = ((C0369e) next.getValue()).mo1879d();
            if (d != null) {
                arrayList.add(str);
                bundle3.putBundle(str, d);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle2 = new Bundle();
            bundle3.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle2.putBundle("android-support-nav:controller:navigatorState", bundle3);
        } else {
            bundle2 = null;
        }
        if (!kVar.f1726h.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[kVar.f1726h.size()];
            int i = 0;
            for (C2004g hVar : kVar.f1726h) {
                parcelableArr[i] = new C2006h(hVar);
                i++;
            }
            bundle2.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (kVar.f1725g) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android-support-nav:controller:deepLinkHandled", kVar.f1725g);
        }
        if (bundle2 != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", bundle2);
        }
        if (this.f1772d0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i2 = this.f1771c0;
        if (i2 != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i2);
        }
    }

    /* renamed from: U */
    public void mo1602U(View view, Bundle bundle) {
        if (view instanceof ViewGroup) {
            view.setTag(R.id.nav_controller_view_tag, this.f1768Z);
            if (view.getParent() != null) {
                View view2 = (View) view.getParent();
                this.f1770b0 = view2;
                if (view2.getId() == this.f1477z) {
                    this.f1770b0.setTag(R.id.nav_controller_view_tag, this.f1768Z);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("created host view " + view + " is not a ViewGroup");
    }

    /* renamed from: n0 */
    public final NavController mo1883n0() {
        C2013k kVar = this.f1768Z;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalStateException("NavController is not available before onCreate()");
    }
}
