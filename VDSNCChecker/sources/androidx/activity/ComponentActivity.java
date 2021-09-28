package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.C0051a;
import androidx.lifecycle.C0342c;
import androidx.lifecycle.C0346d;
import androidx.lifecycle.C0347e;
import androidx.lifecycle.C0355i;
import androidx.savedstate.C0483a;
import java.util.concurrent.atomic.AtomicInteger;
import p002a1.C0006a;
import p002a1.C0007b;
import p007au.gov.dfat.vdsncchecker.R;
import p011b1.C0538a;
import p015c.C0553b;
import p015c.C0554c;
import p015c.C0556e;
import p021d.C0791a;
import p021d.C0792b;
import p027e.C0854b;
import p027e.C0858f;
import p027e.C0859g;
import p033f.C0881a;
import p118t0.C1773g;
import p118t0.C1784r;
import p118t0.C1785s;
import p150z.C2145a;
import p150z.C2147b;
import p150z.C2153e;

public class ComponentActivity extends C2153e implements C1785s, C0007b, C0556e, C0858f {

    /* renamed from: f */
    public final C0791a f142f = new C0791a();

    /* renamed from: g */
    public final C0347e f143g;

    /* renamed from: h */
    public final C0006a f144h;

    /* renamed from: i */
    public C1784r f145i;

    /* renamed from: j */
    public final OnBackPressedDispatcher f146j;

    /* renamed from: k */
    public final AtomicInteger f147k;

    /* renamed from: l */
    public final C0051a f148l;

    /* renamed from: androidx.activity.ComponentActivity$a */
    public class C0045a implements Runnable {
        public C0045a() {
        }

        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    public class C0046b extends C0051a {

        /* renamed from: androidx.activity.ComponentActivity$b$a */
        public class C0047a implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ int f154e;

            /* renamed from: f */
            public final /* synthetic */ C0881a.C0882a f155f;

            public C0047a(int i, C0881a.C0882a aVar) {
                this.f154e = i;
                this.f155f = aVar;
            }

            public void run() {
                C0854b<O> bVar;
                C0046b bVar2 = C0046b.this;
                int i = this.f154e;
                T t = this.f155f.f3348a;
                String str = bVar2.f179b.get(Integer.valueOf(i));
                if (str != null) {
                    bVar2.f182e.remove(str);
                    C0051a.C0053b bVar3 = bVar2.f183f.get(str);
                    if (bVar3 == null || (bVar = bVar3.f190a) == null) {
                        bVar2.f185h.remove(str);
                        bVar2.f184g.put(str, t);
                        return;
                    }
                    bVar.mo1735a(t);
                }
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b */
        public class C0048b implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ int f157e;

            /* renamed from: f */
            public final /* synthetic */ IntentSender.SendIntentException f158f;

            public C0048b(int i, IntentSender.SendIntentException sendIntentException) {
                this.f157e = i;
                this.f158f = sendIntentException;
            }

            public void run() {
                C0046b.this.mo142a(this.f157e, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f158f));
            }
        }

        public C0046b() {
        }

        /* renamed from: b */
        public <I, O> void mo136b(int i, C0881a<I, O> aVar, I i2, C2147b bVar) {
            ComponentActivity componentActivity = ComponentActivity.this;
            C0881a.C0882a<O> b = aVar.mo4189b(componentActivity, i2);
            if (b != null) {
                new Handler(Looper.getMainLooper()).post(new C0047a(i, b));
                return;
            }
            Intent a = aVar.mo1741a(componentActivity, i2);
            Bundle bundle = null;
            if (a.getExtras() != null && a.getExtras().getClassLoader() == null) {
                a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a.getAction())) {
                String[] stringArrayExtra = a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C2145a.m5561b(componentActivity, stringArrayExtra, i);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a.getAction())) {
                C0859g gVar = (C0859g) a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    IntentSender intentSender = gVar.f3309e;
                    Intent intent = gVar.f3310f;
                    int i3 = gVar.f3311g;
                    int i4 = gVar.f3312h;
                    int i5 = C2145a.f6196b;
                    componentActivity.startIntentSenderForResult(intentSender, i, intent, i3, i4, 0, bundle2);
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new C0048b(i, e));
                }
            } else {
                int i6 = C2145a.f6196b;
                componentActivity.startActivityForResult(a, i, bundle2);
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$c */
    public static final class C0049c {

        /* renamed from: a */
        public C1784r f160a;
    }

    public ComponentActivity() {
        C0347e eVar = new C0347e(this);
        this.f143g = eVar;
        C0006a aVar = new C0006a(this);
        this.f144h = aVar;
        this.f146j = new OnBackPressedDispatcher(new C0045a());
        this.f147k = new AtomicInteger();
        this.f148l = new C0046b();
        eVar.mo1802a(new C0346d() {
            /* renamed from: g */
            public void mo134g(C1773g gVar, C0342c.C0344b bVar) {
                if (bVar == C0342c.C0344b.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        eVar.mo1802a(new C0346d() {
            /* renamed from: g */
            public void mo134g(C1773g gVar, C0342c.C0344b bVar) {
                if (bVar == C0342c.C0344b.ON_DESTROY) {
                    ComponentActivity.this.f142f.f3101b = null;
                    if (!ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.mo116j().mo6067a();
                    }
                }
            }
        });
        eVar.mo1802a(new C0346d() {
            /* renamed from: g */
            public void mo134g(C1773g gVar, C0342c.C0344b bVar) {
                ComponentActivity.this.mo118m();
                C0347e eVar = ComponentActivity.this.f143g;
                eVar.mo1806d("removeObserver");
                eVar.f1688a.mo5284e(this);
            }
        });
        aVar.f2b.mo2452b("android:support:activity-result", new C0553b(this));
        mo117l(new C0554c(this));
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        mo119n();
        super.addContentView(view, layoutParams);
    }

    /* renamed from: c */
    public C0342c mo113c() {
        return this.f143g;
    }

    /* renamed from: d */
    public final OnBackPressedDispatcher mo114d() {
        return this.f146j;
    }

    /* renamed from: e */
    public final C0483a mo3e() {
        return this.f144h.f2b;
    }

    /* renamed from: g */
    public final C0051a mo115g() {
        return this.f148l;
    }

    /* renamed from: j */
    public C1784r mo116j() {
        if (getApplication() != null) {
            mo118m();
            return this.f145i;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    /* renamed from: l */
    public final void mo117l(C0792b bVar) {
        C0791a aVar = this.f142f;
        if (aVar.f3101b != null) {
            bVar.mo2700a(aVar.f3101b);
        }
        aVar.f3100a.add(bVar);
    }

    /* renamed from: m */
    public void mo118m() {
        if (this.f145i == null) {
            C0049c cVar = (C0049c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this.f145i = cVar.f160a;
            }
            if (this.f145i == null) {
                this.f145i = new C1784r();
            }
        }
    }

    /* renamed from: n */
    public final void mo119n() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f148l.mo142a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        this.f146j.mo140b();
    }

    public void onCreate(Bundle bundle) {
        this.f144h.mo1a(bundle);
        C0791a aVar = this.f142f;
        aVar.f3101b = this;
        for (C0792b a : aVar.f3100a) {
            a.mo2700a(this);
        }
        super.onCreate(bundle);
        C0355i.m1029c(this);
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.f148l.mo142a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        C0049c cVar;
        C1784r rVar = this.f145i;
        if (rVar == null && (cVar = (C0049c) getLastNonConfigurationInstance()) != null) {
            rVar = cVar.f160a;
        }
        if (rVar == null) {
            return null;
        }
        C0049c cVar2 = new C0049c();
        cVar2.f160a = rVar;
        return cVar2;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C0347e eVar = this.f143g;
        if (eVar instanceof C0347e) {
            C0342c.C0345c cVar = C0342c.C0345c.CREATED;
            eVar.mo1806d("setCurrentState");
            eVar.mo1808g(cVar);
        }
        super.onSaveInstanceState(bundle);
        this.f144h.mo2b(bundle);
    }

    public void reportFullyDrawn() {
        try {
            if (C0538a.m1785a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
        } finally {
            Trace.endSection();
        }
    }

    public void setContentView(int i) {
        mo119n();
        super.setContentView(i);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        mo119n();
        super.setContentView(view);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        mo119n();
        super.setContentView(view, layoutParams);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
