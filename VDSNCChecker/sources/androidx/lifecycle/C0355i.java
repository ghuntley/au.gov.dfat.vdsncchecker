package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.C0342c;
import p118t0.C1773g;
import p118t0.C1774h;

/* renamed from: androidx.lifecycle.i */
public class C0355i extends Fragment {

    /* renamed from: f */
    public static final /* synthetic */ int f1709f = 0;

    /* renamed from: e */
    public C0356a f1710e;

    /* renamed from: androidx.lifecycle.i$a */
    public interface C0356a {
    }

    /* renamed from: androidx.lifecycle.i$b */
    public static class C0357b implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new C0357b());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            C0355i.m1028a(activity, C0342c.C0344b.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            C0355i.m1028a(activity, C0342c.C0344b.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            C0355i.m1028a(activity, C0342c.C0344b.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            C0355i.m1028a(activity, C0342c.C0344b.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            C0355i.m1028a(activity, C0342c.C0344b.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            C0355i.m1028a(activity, C0342c.C0344b.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    public static void m1028a(Activity activity, C0342c.C0344b bVar) {
        if (activity instanceof C1774h) {
            C0347e c = ((C1774h) activity).mo113c();
            c.mo1806d("handleLifecycleEvent");
            c.mo1808g(bVar.mo1804a());
        } else if (activity instanceof C1773g) {
            C0342c c2 = ((C1773g) activity).mo113c();
            if (c2 instanceof C0347e) {
                C0347e eVar = (C0347e) c2;
                eVar.mo1806d("handleLifecycleEvent");
                eVar.mo1808g(bVar.mo1804a());
            }
        }
    }

    /* renamed from: c */
    public static void m1029c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C0357b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C0355i(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: b */
    public final void mo1823b(C0342c.C0344b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            m1028a(getActivity(), bVar);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo1823b(C0342c.C0344b.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        mo1823b(C0342c.C0344b.ON_DESTROY);
        this.f1710e = null;
    }

    public void onPause() {
        super.onPause();
        mo1823b(C0342c.C0344b.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        C0356a aVar = this.f1710e;
        if (aVar != null) {
            C0350g.this.mo1814a();
        }
        mo1823b(C0342c.C0344b.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        C0356a aVar = this.f1710e;
        if (aVar != null) {
            C0350g.this.mo1815b();
        }
        mo1823b(C0342c.C0344b.ON_START);
    }

    public void onStop() {
        super.onStop();
        mo1823b(C0342c.C0344b.ON_STOP);
    }
}
