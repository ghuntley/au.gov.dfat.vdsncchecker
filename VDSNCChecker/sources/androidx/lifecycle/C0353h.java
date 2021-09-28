package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.C0342c;
import p118t0.C1767b;

/* renamed from: androidx.lifecycle.h */
public class C0353h extends C1767b {
    public final /* synthetic */ C0350g this$0;

    /* renamed from: androidx.lifecycle.h$a */
    public class C0354a extends C1767b {
        public C0354a() {
        }

        public void onActivityPostResumed(Activity activity) {
            C0353h.this.this$0.mo1814a();
        }

        public void onActivityPostStarted(Activity activity) {
            C0353h.this.this$0.mo1815b();
        }
    }

    public C0353h(C0350g gVar) {
        this.this$0 = gVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = C0355i.f1709f;
            ((C0355i) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f1710e = this.this$0.f1706l;
        }
    }

    public void onActivityPaused(Activity activity) {
        C0350g gVar = this.this$0;
        int i = gVar.f1700f - 1;
        gVar.f1700f = i;
        if (i == 0) {
            gVar.f1703i.postDelayed(gVar.f1705k, 700);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new C0354a());
    }

    public void onActivityStopped(Activity activity) {
        C0350g gVar = this.this$0;
        int i = gVar.f1699e - 1;
        gVar.f1699e = i;
        if (i == 0 && gVar.f1701g) {
            gVar.f1704j.mo1807e(C0342c.C0344b.ON_STOP);
            gVar.f1702h = true;
        }
    }
}
