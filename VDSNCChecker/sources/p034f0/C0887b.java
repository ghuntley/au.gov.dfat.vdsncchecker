package p034f0;

import android.os.Build;
import android.os.Trace;

@Deprecated
/* renamed from: f0.b */
public final class C0887b {

    /* renamed from: a */
    public static final /* synthetic */ int f3352a = 0;

    static {
        Class<String> cls = String.class;
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls2 = Long.TYPE;
                Trace.class.getMethod("isTagEnabled", new Class[]{cls2});
                Class cls3 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", new Class[]{cls2, cls, cls3});
                Trace.class.getMethod("asyncTraceEnd", new Class[]{cls2, cls, cls3});
                Trace.class.getMethod("traceCounter", new Class[]{cls2, cls, cls3});
            } catch (Exception unused) {
            }
        }
    }
}
