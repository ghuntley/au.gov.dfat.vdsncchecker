package p150z;

import android.app.Activity;
import android.text.TextUtils;
import java.util.Arrays;
import p000a.C0001b;
import p001a0.C0002a;
import p099q.C1589b;

/* renamed from: z.a */
public class C2145a extends C0002a {

    /* renamed from: b */
    public static final /* synthetic */ int f6196b = 0;

    /* renamed from: z.a$a */
    public interface C2146a {
        /* renamed from: a */
        void mo5788a(int i);
    }

    /* renamed from: b */
    public static void m5561b(Activity activity, String[] strArr, int i) {
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (!TextUtils.isEmpty(strArr[i2])) {
                i2++;
            } else {
                throw new IllegalArgumentException(C1589b.m4444a(C0001b.m0a("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
        }
        if (activity instanceof C2146a) {
            ((C2146a) activity).mo5788a(i);
        }
        activity.requestPermissions(strArr, i);
    }
}
