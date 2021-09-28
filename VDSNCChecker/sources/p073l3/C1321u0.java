package p073l3;

import java.util.concurrent.CancellationException;
import p072l2.C1241e;

/* renamed from: l3.u0 */
public final class C1321u0 extends CancellationException {

    /* renamed from: e */
    public final C1317t0 f4330e;

    public C1321u0(String str, Throwable th, C1317t0 t0Var) {
        super(str);
        this.f4330e = t0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C1321u0) {
                C1321u0 u0Var = (C1321u0) obj;
                if (!C1241e.m3513b(u0Var.getMessage(), getMessage()) || !C1241e.m3513b(u0Var.f4330e, this.f4330e) || !C1241e.m3513b(u0Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        C1241e.m3515e(message);
        int hashCode = (this.f4330e.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    public String toString() {
        return super.toString() + "; job=" + this.f4330e;
    }
}
