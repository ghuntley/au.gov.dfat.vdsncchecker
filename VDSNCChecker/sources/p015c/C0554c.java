package p015c;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.result.C0051a;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import p021d.C0792b;

/* renamed from: c.c */
public final /* synthetic */ class C0554c implements C0792b {

    /* renamed from: a */
    public final /* synthetic */ ComponentActivity f2355a;

    public /* synthetic */ C0554c(ComponentActivity componentActivity) {
        this.f2355a = componentActivity;
    }

    /* renamed from: a */
    public final void mo2700a(Context context) {
        ComponentActivity componentActivity = this.f2355a;
        Bundle a = componentActivity.f144h.f2b.mo2451a("android:support:activity-result");
        if (a != null) {
            C0051a aVar = componentActivity.f148l;
            Objects.requireNonNull(aVar);
            ArrayList<Integer> integerArrayList = a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                aVar.f182e = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                aVar.f178a = (Random) a.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                aVar.f185h.putAll(a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i = 0; i < stringArrayList.size(); i++) {
                    String str = stringArrayList.get(i);
                    if (aVar.f180c.containsKey(str)) {
                        Integer remove = aVar.f180c.remove(str);
                        if (!aVar.f185h.containsKey(str)) {
                            aVar.f179b.remove(remove);
                        }
                    }
                    int intValue = integerArrayList.get(i).intValue();
                    String str2 = stringArrayList.get(i);
                    aVar.f179b.put(Integer.valueOf(intValue), str2);
                    aVar.f180c.put(str2, Integer.valueOf(intValue));
                }
            }
        }
    }
}
