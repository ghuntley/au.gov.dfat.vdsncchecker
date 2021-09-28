package p152z1;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import p155j$.util.DesugarTimeZone;

/* renamed from: z1.a0 */
public class C2160a0 {

    /* renamed from: a */
    public static AtomicReference<C2201z> f6230a = new AtomicReference<>();

    /* renamed from: a */
    public static long m5570a(long j) {
        Calendar e = m5574e();
        e.setTimeInMillis(j);
        return m5571b(e).getTimeInMillis();
    }

    /* renamed from: b */
    public static Calendar m5571b(Calendar calendar) {
        Calendar f = m5575f(calendar);
        Calendar e = m5574e();
        e.set(f.get(1), f.get(2), f.get(5));
        return e;
    }

    /* renamed from: c */
    public static TimeZone m5572c() {
        return DesugarTimeZone.getTimeZone("UTC");
    }

    /* renamed from: d */
    public static Calendar m5573d() {
        C2201z zVar = f6230a.get();
        if (zVar == null) {
            zVar = C2201z.f6328c;
        }
        TimeZone timeZone = zVar.f6330b;
        Calendar instance = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = zVar.f6329a;
        if (l != null) {
            instance.setTimeInMillis(l.longValue());
        }
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        instance.setTimeZone(m5572c());
        return instance;
    }

    /* renamed from: e */
    public static Calendar m5574e() {
        return m5575f((Calendar) null);
    }

    /* renamed from: f */
    public static Calendar m5575f(Calendar calendar) {
        Calendar instance = Calendar.getInstance(m5572c());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }
}
