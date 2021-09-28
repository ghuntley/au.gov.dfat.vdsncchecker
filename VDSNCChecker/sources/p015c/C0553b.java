package p015c;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.result.C0051a;
import androidx.savedstate.C0483a;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: c.b */
public final /* synthetic */ class C0553b implements C0483a.C0485b {

    /* renamed from: a */
    public final /* synthetic */ ComponentActivity f2354a;

    public /* synthetic */ C0553b(ComponentActivity componentActivity) {
        this.f2354a = componentActivity;
    }

    /* renamed from: a */
    public final Bundle mo2450a() {
        ComponentActivity componentActivity = this.f2354a;
        Objects.requireNonNull(componentActivity);
        Bundle bundle = new Bundle();
        C0051a aVar = componentActivity.f148l;
        Objects.requireNonNull(aVar);
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(aVar.f180c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(aVar.f180c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(aVar.f182e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) aVar.f185h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", aVar.f178a);
        return bundle;
    }
}
