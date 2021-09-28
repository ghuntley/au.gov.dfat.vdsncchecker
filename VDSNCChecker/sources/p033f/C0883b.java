package p033f;

import android.content.Context;
import android.content.Intent;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p001a0.C0002a;
import p033f.C0881a;
import p093p.C1545a;

/* renamed from: f.b */
public final class C0883b extends C0881a<String[], Map<String, Boolean>> {
    /* renamed from: a */
    public Intent mo1741a(Context context, Object obj) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
    }

    /* renamed from: b */
    public C0881a.C0882a mo4189b(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        if (strArr == null || strArr.length == 0) {
            return new C0881a.C0882a(Collections.emptyMap());
        }
        C1545a aVar = new C1545a();
        boolean z = true;
        for (String str : strArr) {
            boolean z2 = C0002a.m1a(context, str) == 0;
            aVar.put(str, Boolean.valueOf(z2));
            if (!z2) {
                z = false;
            }
        }
        if (z) {
            return new C0881a.C0882a(aVar);
        }
        return null;
    }

    /* renamed from: c */
    public Object mo1742c(int i, Intent intent) {
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (!(intArrayExtra == null || stringArrayExtra == null)) {
                HashMap hashMap = new HashMap();
                int length = stringArrayExtra.length;
                for (int i2 = 0; i2 < length; i2++) {
                    hashMap.put(stringArrayExtra[i2], Boolean.valueOf(intArrayExtra[i2] == 0));
                }
                return hashMap;
            }
        }
        return Collections.emptyMap();
    }
}
