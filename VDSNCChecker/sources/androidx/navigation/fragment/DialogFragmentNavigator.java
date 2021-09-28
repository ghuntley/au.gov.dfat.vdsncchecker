package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.fragment.app.C0262a;
import androidx.fragment.app.C0286k;
import androidx.fragment.app.C0302r;
import androidx.lifecycle.C0342c;
import androidx.lifecycle.C0346d;
import androidx.navigation.C0364b;
import androidx.navigation.C0369e;
import java.util.HashSet;
import p000a.C0001b;
import p099q.C1589b;
import p106r0.C1634b;
import p118t0.C1773g;
import p136w0.C1998a;
import p136w0.C2015m;
import p146y0.C2131a;

@C0369e.C0371b("dialog")
public final class DialogFragmentNavigator extends C0369e<C0374a> {

    /* renamed from: a */
    public final Context f1762a;

    /* renamed from: b */
    public final C0302r f1763b;

    /* renamed from: c */
    public int f1764c = 0;

    /* renamed from: d */
    public final HashSet<String> f1765d = new HashSet<>();

    /* renamed from: e */
    public C0346d f1766e = new C0346d(this) {
        /* renamed from: g */
        public void mo134g(C1773g gVar, C0342c.C0344b bVar) {
            if (bVar == C0342c.C0344b.ON_STOP) {
                C1634b bVar2 = (C1634b) gVar;
                if (!bVar2.mo5782o0().isShowing()) {
                    NavHostFragment.m1076m0(bVar2).mo1856e();
                }
            }
        }
    };

    /* renamed from: androidx.navigation.fragment.DialogFragmentNavigator$a */
    public static class C0374a extends C0364b implements C1998a {

        /* renamed from: m */
        public String f1767m;

        public C0374a(C0369e<? extends C0374a> eVar) {
            super(eVar);
        }

        /* renamed from: e */
        public void mo1864e(Context context, AttributeSet attributeSet) {
            super.mo1864e(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C2131a.f6180a);
            String string = obtainAttributes.getString(0);
            if (string != null) {
                this.f1767m = string;
            }
            obtainAttributes.recycle();
        }
    }

    public DialogFragmentNavigator(Context context, C0302r rVar) {
        this.f1762a = context;
        this.f1763b = rVar;
    }

    /* renamed from: a */
    public C0364b mo1861a() {
        return new C0374a(this);
    }

    /* renamed from: b */
    public C0364b mo1862b(C0364b bVar, Bundle bundle, C2015m mVar, C0369e.C0370a aVar) {
        C0374a aVar2 = (C0374a) bVar;
        if (this.f1763b.mo1690R()) {
            return null;
        }
        String str = aVar2.f1767m;
        if (str != null) {
            if (str.charAt(0) == '.') {
                str = this.f1762a.getPackageName() + str;
            }
            C0286k a = this.f1763b.mo1684K().mo1659a(this.f1762a.getClassLoader(), str);
            if (!C1634b.class.isAssignableFrom(a.getClass())) {
                StringBuilder a2 = C0001b.m0a("Dialog destination ");
                String str2 = aVar2.f1767m;
                if (str2 != null) {
                    throw new IllegalArgumentException(C1589b.m4444a(a2, str2, " is not an instance of DialogFragment"));
                }
                throw new IllegalStateException("DialogFragment class was not set");
            }
            C1634b bVar2 = (C1634b) a;
            bVar2.mo1621h0(bundle);
            bVar2.f1449R.mo1802a(this.f1766e);
            C0302r rVar = this.f1763b;
            StringBuilder a3 = C0001b.m0a("androidx-nav-fragment:navigator:dialog:");
            int i = this.f1764c;
            this.f1764c = i + 1;
            a3.append(i);
            String sb = a3.toString();
            bVar2.f5024m0 = false;
            bVar2.f5025n0 = true;
            C0262a aVar3 = new C0262a(rVar);
            aVar3.mo1537f(0, bVar2, sb, 1);
            aVar3.mo1534c();
            return aVar2;
        }
        throw new IllegalStateException("DialogFragment class was not set");
    }

    /* renamed from: c */
    public void mo1878c(Bundle bundle) {
        this.f1764c = bundle.getInt("androidx-nav-dialogfragment:navigator:count", 0);
        for (int i = 0; i < this.f1764c; i++) {
            C0302r rVar = this.f1763b;
            C1634b bVar = (C1634b) rVar.mo1682I("androidx-nav-fragment:navigator:dialog:" + i);
            if (bVar != null) {
                bVar.f1449R.mo1802a(this.f1766e);
            } else {
                HashSet<String> hashSet = this.f1765d;
                hashSet.add("androidx-nav-fragment:navigator:dialog:" + i);
            }
        }
    }

    /* renamed from: d */
    public Bundle mo1879d() {
        if (this.f1764c == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("androidx-nav-dialogfragment:navigator:count", this.f1764c);
        return bundle;
    }

    /* renamed from: e */
    public boolean mo1863e() {
        if (this.f1764c == 0 || this.f1763b.mo1690R()) {
            return false;
        }
        C0302r rVar = this.f1763b;
        StringBuilder a = C0001b.m0a("androidx-nav-fragment:navigator:dialog:");
        int i = this.f1764c - 1;
        this.f1764c = i;
        a.append(i);
        C0286k I = rVar.mo1682I(a.toString());
        if (I != null) {
            I.f1449R.mo1803b(this.f1766e);
            ((C1634b) I).mo5781m0(false, false);
        }
        return true;
    }
}
