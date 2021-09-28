package p005a4;

import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import p000a.C0001b;
import p005a4.C0017e;
import p032e4.C0879e;
import p059j1.C1087a;
import p072l2.C1241e;
import p099q.C1589b;
import p139w3.C2052a;
import p139w3.C2083j0;
import p144x3.C2129c;
import p154z3.C2205a;
import p154z3.C2207c;
import p154z3.C2208d;

/* renamed from: a4.j */
public final class C0025j {

    /* renamed from: a */
    public final long f85a;

    /* renamed from: b */
    public final C2207c f86b;

    /* renamed from: c */
    public final C0026a f87c = new C0026a(this, C1589b.m4444a(new StringBuilder(), C2129c.f6174f, " ConnectionPool"));

    /* renamed from: d */
    public final ConcurrentLinkedQueue<C0024i> f88d = new ConcurrentLinkedQueue<>();

    /* renamed from: e */
    public final int f89e;

    /* renamed from: a4.j$a */
    public static final class C0026a extends C2205a {

        /* renamed from: e */
        public final /* synthetic */ C0025j f90e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0026a(C0025j jVar, String str) {
            super(str, true);
            this.f90e = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0076, code lost:
            r1 = r6.f70c;
            p072l2.C1241e.m3515e(r1);
            p144x3.C2129c.m5516d(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0084, code lost:
            if (r0.f88d.isEmpty() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0086, code lost:
            r0.f86b.mo6765a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            return 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            return 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
            return 0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo57a() {
            /*
                r13 = this;
                a4.j r0 = r13.f90e
                long r1 = java.lang.System.nanoTime()
                java.util.concurrent.ConcurrentLinkedQueue<a4.i> r3 = r0.f88d
                java.util.Iterator r3 = r3.iterator()
                r4 = 0
                r5 = 0
                r6 = -9223372036854775808
                r7 = r6
                r6 = r5
                r5 = r4
            L_0x0013:
                boolean r9 = r3.hasNext()
                if (r9 == 0) goto L_0x003f
                java.lang.Object r9 = r3.next()
                a4.i r9 = (p005a4.C0024i) r9
                java.lang.String r10 = "connection"
                p072l2.C1241e.m3516f(r9, r10)
                monitor-enter(r9)
                int r10 = r0.mo56b(r9, r1)     // Catch:{ all -> 0x003c }
                if (r10 <= 0) goto L_0x002e
                int r5 = r5 + 1
                goto L_0x003a
            L_0x002e:
                int r4 = r4 + 1
                long r10 = r9.f83p     // Catch:{ all -> 0x003c }
                long r10 = r1 - r10
                int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r12 <= 0) goto L_0x003a
                r6 = r9
                r7 = r10
            L_0x003a:
                monitor-exit(r9)
                goto L_0x0013
            L_0x003c:
                r0 = move-exception
                monitor-exit(r9)
                throw r0
            L_0x003f:
                long r9 = r0.f85a
                int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r3 >= 0) goto L_0x0054
                int r3 = r0.f89e
                if (r4 <= r3) goto L_0x004a
                goto L_0x0054
            L_0x004a:
                if (r4 <= 0) goto L_0x004e
                long r9 = r9 - r7
                goto L_0x008b
            L_0x004e:
                if (r5 <= 0) goto L_0x0051
                goto L_0x008b
            L_0x0051:
                r9 = -1
                goto L_0x008b
            L_0x0054:
                p072l2.C1241e.m3515e(r6)
                monitor-enter(r6)
                java.util.List<java.lang.ref.Reference<a4.e>> r3 = r6.f82o     // Catch:{ all -> 0x008c }
                boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x008c }
                r4 = 1
                r3 = r3 ^ r4
                r9 = 0
                if (r3 == 0) goto L_0x0066
            L_0x0064:
                monitor-exit(r6)
                goto L_0x008b
            L_0x0066:
                long r11 = r6.f83p     // Catch:{ all -> 0x008c }
                long r11 = r11 + r7
                int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
                if (r1 == 0) goto L_0x006e
                goto L_0x0064
            L_0x006e:
                r6.f76i = r4     // Catch:{ all -> 0x008c }
                java.util.concurrent.ConcurrentLinkedQueue<a4.i> r1 = r0.f88d     // Catch:{ all -> 0x008c }
                r1.remove(r6)     // Catch:{ all -> 0x008c }
                monitor-exit(r6)
                java.net.Socket r1 = r6.f70c
                p072l2.C1241e.m3515e(r1)
                p144x3.C2129c.m5516d(r1)
                java.util.concurrent.ConcurrentLinkedQueue<a4.i> r1 = r0.f88d
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x008b
                z3.c r0 = r0.f86b
                r0.mo6765a()
            L_0x008b:
                return r9
            L_0x008c:
                r0 = move-exception
                monitor-exit(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p005a4.C0025j.C0026a.mo57a():long");
        }
    }

    public C0025j(C2208d dVar, int i, long j, TimeUnit timeUnit) {
        C1241e.m3517j(dVar, "taskRunner");
        this.f89e = i;
        this.f85a = timeUnit.toNanos(j);
        this.f86b = dVar.mo6775f();
        if (!(j > 0)) {
            throw new IllegalArgumentException(C1087a.m3111a("keepAliveDuration <= 0: ", j).toString());
        }
    }

    /* renamed from: a */
    public final boolean mo55a(C2052a aVar, C0017e eVar, List<C2083j0> list, boolean z) {
        C1241e.m3517j(aVar, "address");
        C1241e.m3517j(eVar, "call");
        Iterator<C0024i> it = this.f88d.iterator();
        while (it.hasNext()) {
            C0024i next = it.next();
            C1241e.m3516f(next, "connection");
            synchronized (next) {
                if (z) {
                    if (!next.mo50j()) {
                    }
                }
                if (next.mo48h(aVar, list)) {
                    eVar.mo29d(next);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final int mo56b(C0024i iVar, long j) {
        byte[] bArr = C2129c.f6169a;
        List<Reference<C0017e>> list = iVar.f82o;
        int i = 0;
        while (i < list.size()) {
            Reference reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                StringBuilder a = C0001b.m0a("A connection to ");
                a.append(iVar.f84q.f6057a.f5889a);
                a.append(" was leaked. ");
                a.append("Did you forget to close a response body?");
                String sb = a.toString();
                C0879e.C0880a aVar = C0879e.f3347c;
                C0879e.f3345a.mo4174k(sb, ((C0017e.C0019b) reference).f62a);
                list.remove(i);
                iVar.f76i = true;
                if (list.isEmpty()) {
                    iVar.f83p = j - this.f85a;
                    return 0;
                }
            }
        }
        return list.size();
    }
}
