package p062j4;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p059j1.C1087a;
import p072l2.C1241e;

/* renamed from: j4.a0 */
public class C1104a0 {

    /* renamed from: d */
    public static final C1104a0 f3872d = new C1105a();

    /* renamed from: a */
    public boolean f3873a;

    /* renamed from: b */
    public long f3874b;

    /* renamed from: c */
    public long f3875c;

    /* renamed from: j4.a0$a */
    public static final class C1105a extends C1104a0 {
        /* renamed from: d */
        public C1104a0 mo4601d(long j) {
            return this;
        }

        /* renamed from: f */
        public void mo4603f() {
        }

        /* renamed from: g */
        public C1104a0 mo4604g(long j, TimeUnit timeUnit) {
            C1241e.m3517j(timeUnit, "unit");
            return this;
        }
    }

    /* renamed from: a */
    public C1104a0 mo4598a() {
        this.f3873a = false;
        return this;
    }

    /* renamed from: b */
    public C1104a0 mo4599b() {
        this.f3875c = 0;
        return this;
    }

    /* renamed from: c */
    public long mo4600c() {
        if (this.f3873a) {
            return this.f3874b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    /* renamed from: d */
    public C1104a0 mo4601d(long j) {
        this.f3873a = true;
        this.f3874b = j;
        return this;
    }

    /* renamed from: e */
    public boolean mo4602e() {
        return this.f3873a;
    }

    /* renamed from: f */
    public void mo4603f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f3873a && this.f3874b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: g */
    public C1104a0 mo4604g(long j, TimeUnit timeUnit) {
        C1241e.m3517j(timeUnit, "unit");
        if (j >= 0) {
            this.f3875c = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(C1087a.m3111a("timeout < 0: ", j).toString());
    }
}
