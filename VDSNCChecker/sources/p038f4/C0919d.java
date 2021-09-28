package p038f4;

import android.util.Log;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import p067k3.C1209l;
import p067k3.C1210m;
import p072l2.C1241e;
import p099q.C1599h;

/* renamed from: f4.d */
public final class C0919d extends Handler {

    /* renamed from: a */
    public static final C0919d f3442a = new C0919d();

    public void close() {
    }

    public void flush() {
    }

    public void publish(LogRecord logRecord) {
        int min;
        C1241e.m3517j(logRecord, "record");
        C0918c cVar = C0918c.f3441c;
        String loggerName = logRecord.getLoggerName();
        C1241e.m3516f(loggerName, "record.loggerName");
        int i = logRecord.getLevel().intValue() > Level.INFO.intValue() ? 5 : logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        C1241e.m3516f(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        C1241e.m3517j(loggerName, "loggerName");
        C1241e.m3517j(message, "message");
        String str = C0918c.f3440b.get(loggerName);
        if (str == null) {
            str = C1210m.m3456k0(loggerName, 23);
        }
        if (Log.isLoggable(str, i)) {
            if (thrown != null) {
                StringBuilder a = C1599h.m4503a(message, "\n");
                a.append(Log.getStackTraceString(thrown));
                message = a.toString();
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int Y = C1209l.m3444Y(message, 10, i2, false, 4);
                if (Y == -1) {
                    Y = length;
                }
                while (true) {
                    min = Math.min(Y, i2 + 4000);
                    String substring = message.substring(i2, min);
                    C1241e.m3516f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i, str, substring);
                    if (min >= Y) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }
}
