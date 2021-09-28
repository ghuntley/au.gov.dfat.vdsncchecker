package p106r0;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0131a0;
import androidx.fragment.app.C0262a;
import androidx.fragment.app.C0286k;
import androidx.fragment.app.C0302r;
import androidx.fragment.app.C0323u;
import androidx.lifecycle.LiveData;
import java.util.Objects;
import p000a.C0001b;
import p007au.gov.dfat.vdsncchecker.R;
import p118t0.C1773g;
import p118t0.C1776j;
import p118t0.C1777k;

/* renamed from: r0.b */
public class C1634b extends C0286k implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: Z */
    public Handler f5011Z;

    /* renamed from: a0 */
    public Runnable f5012a0 = new C1635a();

    /* renamed from: b0 */
    public DialogInterface.OnCancelListener f5013b0 = new C1636b();

    /* renamed from: c0 */
    public DialogInterface.OnDismissListener f5014c0 = new C1637c();

    /* renamed from: d0 */
    public int f5015d0 = 0;

    /* renamed from: e0 */
    public int f5016e0 = 0;

    /* renamed from: f0 */
    public boolean f5017f0 = true;

    /* renamed from: g0 */
    public boolean f5018g0 = true;

    /* renamed from: h0 */
    public int f5019h0 = -1;

    /* renamed from: i0 */
    public boolean f5020i0;

    /* renamed from: j0 */
    public C1777k<C1773g> f5021j0 = new C1638d();

    /* renamed from: k0 */
    public Dialog f5022k0;

    /* renamed from: l0 */
    public boolean f5023l0;

    /* renamed from: m0 */
    public boolean f5024m0;

    /* renamed from: n0 */
    public boolean f5025n0;

    /* renamed from: o0 */
    public boolean f5026o0 = false;

    /* renamed from: r0.b$a */
    public class C1635a implements Runnable {
        public C1635a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            C1634b bVar = C1634b.this;
            bVar.f5014c0.onDismiss(bVar.f5022k0);
        }
    }

    /* renamed from: r0.b$b */
    public class C1636b implements DialogInterface.OnCancelListener {
        public C1636b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            C1634b bVar = C1634b.this;
            Dialog dialog = bVar.f5022k0;
            if (dialog != null) {
                bVar.onCancel(dialog);
            }
        }
    }

    /* renamed from: r0.b$c */
    public class C1637c implements DialogInterface.OnDismissListener {
        public C1637c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            C1634b bVar = C1634b.this;
            Dialog dialog = bVar.f5022k0;
            if (dialog != null) {
                bVar.onDismiss(dialog);
            }
        }
    }

    /* renamed from: r0.b$d */
    public class C1638d implements C1777k<C1773g> {
        public C1638d() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void mo4788b(Object obj) {
            if (((C1773g) obj) != null) {
                C1634b bVar = C1634b.this;
                if (bVar.f5018g0) {
                    View c0 = bVar.mo1612c0();
                    if (c0.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    } else if (C1634b.this.f5022k0 != null) {
                        if (C0302r.m864N(3)) {
                            Objects.toString(C1634b.this.f5022k0);
                        }
                        C1634b.this.f5022k0.setContentView(c0);
                    }
                }
            }
        }
    }

    /* renamed from: r0.b$e */
    public class C1639e extends C1645g {

        /* renamed from: a */
        public final /* synthetic */ C1645g f5031a;

        public C1639e(C1645g gVar) {
            this.f5031a = gVar;
        }

        /* renamed from: b */
        public View mo1648b(int i) {
            if (this.f5031a.mo1649f()) {
                return this.f5031a.mo1648b(i);
            }
            Dialog dialog = C1634b.this.f5022k0;
            if (dialog != null) {
                return dialog.findViewById(i);
            }
            return null;
        }

        /* renamed from: f */
        public boolean mo1649f() {
            return this.f5031a.mo1649f() || C1634b.this.f5026o0;
        }
    }

    /* renamed from: F */
    public void mo1587F(Context context) {
        super.mo1587F(context);
        C1776j<C1773g> jVar = this.f1451T;
        C1777k<C1773g> kVar = this.f5021j0;
        Objects.requireNonNull(jVar);
        LiveData.m980a("observeForever");
        LiveData.C0333a aVar = new LiveData.C0333a(jVar, kVar);
        LiveData.C0334b d = jVar.f1651b.mo5283d(kVar, aVar);
        if (!(d instanceof LiveData.LifecycleBoundObserver)) {
            if (d == null) {
                aVar.mo1787h(true);
            }
            if (!this.f5025n0) {
                this.f5024m0 = false;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    /* renamed from: H */
    public void mo1589H(Bundle bundle) {
        super.mo1589H(bundle);
        this.f5011Z = new Handler();
        this.f5018g0 = this.f1432A == 0;
        if (bundle != null) {
            this.f5015d0 = bundle.getInt("android:style", 0);
            this.f5016e0 = bundle.getInt("android:theme", 0);
            this.f5017f0 = bundle.getBoolean("android:cancelable", true);
            this.f5018g0 = bundle.getBoolean("android:showsDialog", this.f5018g0);
            this.f5019h0 = bundle.getInt("android:backStackId", -1);
        }
    }

    /* renamed from: K */
    public void mo1592K() {
        this.f1439H = true;
        Dialog dialog = this.f5022k0;
        if (dialog != null) {
            this.f5023l0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f5022k0.dismiss();
            if (!this.f5024m0) {
                onDismiss(this.f5022k0);
            }
            this.f5022k0 = null;
            this.f5026o0 = false;
        }
    }

    /* renamed from: L */
    public void mo1593L() {
        this.f1439H = true;
        if (!this.f5025n0 && !this.f5024m0) {
            this.f5024m0 = true;
        }
        this.f1451T.mo1783g(this.f5021j0);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0044 A[Catch:{ all -> 0x0069 }] */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.LayoutInflater mo1594M(android.os.Bundle r7) {
        /*
            r6 = this;
            android.view.LayoutInflater r0 = super.mo1594M(r7)
            boolean r1 = r6.f5018g0
            r2 = 2
            if (r1 == 0) goto L_0x0092
            boolean r3 = r6.f5020i0
            if (r3 == 0) goto L_0x000f
            goto L_0x0092
        L_0x000f:
            if (r1 != 0) goto L_0x0012
            goto L_0x006d
        L_0x0012:
            boolean r1 = r6.f5026o0
            if (r1 != 0) goto L_0x006d
            r1 = 0
            r3 = 1
            r6.f5020i0 = r3     // Catch:{ all -> 0x0069 }
            android.app.Dialog r7 = r6.mo4802n0(r7)     // Catch:{ all -> 0x0069 }
            r6.f5022k0 = r7     // Catch:{ all -> 0x0069 }
            boolean r4 = r6.f5018g0     // Catch:{ all -> 0x0069 }
            if (r4 == 0) goto L_0x0063
            int r4 = r6.f5015d0     // Catch:{ all -> 0x0069 }
            if (r4 == r3) goto L_0x0039
            if (r4 == r2) goto L_0x0039
            r5 = 3
            if (r4 == r5) goto L_0x002e
            goto L_0x003c
        L_0x002e:
            android.view.Window r4 = r7.getWindow()     // Catch:{ all -> 0x0069 }
            if (r4 == 0) goto L_0x0039
            r5 = 24
            r4.addFlags(r5)     // Catch:{ all -> 0x0069 }
        L_0x0039:
            r7.requestWindowFeature(r3)     // Catch:{ all -> 0x0069 }
        L_0x003c:
            android.content.Context r7 = r6.mo1623i()     // Catch:{ all -> 0x0069 }
            boolean r4 = r7 instanceof android.app.Activity     // Catch:{ all -> 0x0069 }
            if (r4 == 0) goto L_0x004b
            android.app.Dialog r4 = r6.f5022k0     // Catch:{ all -> 0x0069 }
            android.app.Activity r7 = (android.app.Activity) r7     // Catch:{ all -> 0x0069 }
            r4.setOwnerActivity(r7)     // Catch:{ all -> 0x0069 }
        L_0x004b:
            android.app.Dialog r7 = r6.f5022k0     // Catch:{ all -> 0x0069 }
            boolean r4 = r6.f5017f0     // Catch:{ all -> 0x0069 }
            r7.setCancelable(r4)     // Catch:{ all -> 0x0069 }
            android.app.Dialog r7 = r6.f5022k0     // Catch:{ all -> 0x0069 }
            android.content.DialogInterface$OnCancelListener r4 = r6.f5013b0     // Catch:{ all -> 0x0069 }
            r7.setOnCancelListener(r4)     // Catch:{ all -> 0x0069 }
            android.app.Dialog r7 = r6.f5022k0     // Catch:{ all -> 0x0069 }
            android.content.DialogInterface$OnDismissListener r4 = r6.f5014c0     // Catch:{ all -> 0x0069 }
            r7.setOnDismissListener(r4)     // Catch:{ all -> 0x0069 }
            r6.f5026o0 = r3     // Catch:{ all -> 0x0069 }
            goto L_0x0066
        L_0x0063:
            r7 = 0
            r6.f5022k0 = r7     // Catch:{ all -> 0x0069 }
        L_0x0066:
            r6.f5020i0 = r1
            goto L_0x006d
        L_0x0069:
            r7 = move-exception
            r6.f5020i0 = r1
            throw r7
        L_0x006d:
            boolean r7 = androidx.fragment.app.C0302r.m864N(r2)
            if (r7 == 0) goto L_0x0085
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "get layout inflater for DialogFragment "
            r7.append(r1)
            r7.append(r6)
            java.lang.String r1 = " from dialog context"
            r7.append(r1)
        L_0x0085:
            android.app.Dialog r7 = r6.f5022k0
            if (r7 == 0) goto L_0x0091
            android.content.Context r7 = r7.getContext()
            android.view.LayoutInflater r0 = r0.cloneInContext(r7)
        L_0x0091:
            return r0
        L_0x0092:
            boolean r7 = androidx.fragment.app.C0302r.m864N(r2)
            if (r7 == 0) goto L_0x00a5
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "getting layout inflater for DialogFragment "
            r7.append(r1)
            r7.append(r6)
        L_0x00a5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p106r0.C1634b.mo1594M(android.os.Bundle):android.view.LayoutInflater");
    }

    /* renamed from: R */
    public void mo1599R(Bundle bundle) {
        Dialog dialog = this.f5022k0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f5015d0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f5016e0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f5017f0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f5018g0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f5019h0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    /* renamed from: S */
    public void mo1600S() {
        this.f1439H = true;
        Dialog dialog = this.f5022k0;
        if (dialog != null) {
            this.f5023l0 = false;
            dialog.show();
            View decorView = this.f5022k0.getWindow().getDecorView();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    /* renamed from: T */
    public void mo1601T() {
        this.f1439H = true;
        Dialog dialog = this.f5022k0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* renamed from: V */
    public void mo1603V(Bundle bundle) {
        Bundle bundle2;
        this.f1439H = true;
        if (this.f5022k0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f5022k0.onRestoreInstanceState(bundle2);
        }
    }

    /* renamed from: W */
    public void mo1604W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo1604W(layoutInflater, viewGroup, bundle);
        if (this.f1441J == null && this.f5022k0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f5022k0.onRestoreInstanceState(bundle2);
        }
    }

    /* renamed from: a */
    public C1645g mo1608a() {
        return new C1639e(new C0286k.C0287a());
    }

    /* renamed from: m0 */
    public final void mo5781m0(boolean z, boolean z2) {
        if (!this.f5024m0) {
            this.f5024m0 = true;
            this.f5025n0 = false;
            Dialog dialog = this.f5022k0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f5022k0.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.f5011Z.getLooper()) {
                        onDismiss(this.f5022k0);
                    } else {
                        this.f5011Z.post(this.f5012a0);
                    }
                }
            }
            this.f5023l0 = true;
            if (this.f5019h0 >= 0) {
                C0302r r = mo1638r();
                int i = this.f5019h0;
                if (i >= 0) {
                    r.mo1674A(new C0302r.C0317n((String) null, i, 1), false);
                    this.f5019h0 = -1;
                    return;
                }
                throw new IllegalArgumentException(C0131a0.m344a("Bad id: ", i));
            }
            C0262a aVar = new C0262a(mo1638r());
            C0302r rVar = this.f1473v;
            if (rVar == null || rVar == aVar.f1355q) {
                aVar.mo1772b(new C0323u.C0324a(3, this));
                if (z) {
                    aVar.mo1536e(true);
                } else {
                    aVar.mo1534c();
                }
            } else {
                StringBuilder a = C0001b.m0a("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
                a.append(toString());
                a.append(" is already attached to a FragmentManager.");
                throw new IllegalStateException(a.toString());
            }
        }
    }

    /* renamed from: n0 */
    public Dialog mo4802n0(Bundle bundle) {
        if (C0302r.m864N(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCreateDialog called for DialogFragment ");
            sb.append(this);
        }
        return new Dialog(mo1611b0(), this.f5016e0);
    }

    /* renamed from: o0 */
    public final Dialog mo5782o0() {
        Dialog dialog = this.f5022k0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f5023l0) {
            if (C0302r.m864N(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("onDismiss called for DialogFragment ");
                sb.append(this);
            }
            mo5781m0(true, true);
        }
    }
}
