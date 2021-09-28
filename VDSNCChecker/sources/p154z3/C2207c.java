package p154z3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import p072l2.C1241e;
import p073l3.C1320u;
import p144x3.C2129c;
import p154z3.C2208d;

/* renamed from: z3.c */
public final class C2207c {

    /* renamed from: a */
    public boolean f6338a;

    /* renamed from: b */
    public C2205a f6339b;

    /* renamed from: c */
    public final List<C2205a> f6340c = new ArrayList();

    /* renamed from: d */
    public boolean f6341d;

    /* renamed from: e */
    public final C2208d f6342e;

    /* renamed from: f */
    public final String f6343f;

    public C2207c(C2208d dVar, String str) {
        C1241e.m3517j(str, "name");
        this.f6342e = dVar;
        this.f6343f = str;
    }

    /* renamed from: a */
    public final void mo6765a() {
        byte[] bArr = C2129c.f6169a;
        synchronized (this.f6342e) {
            if (mo6766b()) {
                this.f6342e.mo6774e(this);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo6766b() {
        C2205a aVar = this.f6339b;
        if (aVar != null) {
            C1241e.m3515e(aVar);
            if (aVar.f6336d) {
                this.f6341d = true;
            }
        }
        boolean z = false;
        for (int size = this.f6340c.size() - 1; size >= 0; size--) {
            if (this.f6340c.get(size).f6336d) {
                C2205a aVar2 = this.f6340c.get(size);
                Objects.requireNonNull(C2208d.f6346j);
                if (C2208d.f6345i.isLoggable(Level.FINE)) {
                    C1320u.m3700d(aVar2, this, "canceled");
                }
                this.f6340c.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6767c(p154z3.C2205a r3, long r4) {
        /*
            r2 = this;
            java.lang.String r0 = "task"
            p072l2.C1241e.m3517j(r3, r0)
            z3.d r0 = r2.f6342e
            monitor-enter(r0)
            boolean r1 = r2.f6338a     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0040
            boolean r4 = r3.f6336d     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x0026
            z3.d$b r4 = p154z3.C2208d.f6346j     // Catch:{ all -> 0x004e }
            java.util.Objects.requireNonNull(r4)     // Catch:{ all -> 0x004e }
            java.util.logging.Logger r4 = p154z3.C2208d.f6345i     // Catch:{ all -> 0x004e }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x004e }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x0024
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            p073l3.C1320u.m3700d(r3, r2, r4)     // Catch:{ all -> 0x004e }
        L_0x0024:
            monitor-exit(r0)
            return
        L_0x0026:
            z3.d$b r4 = p154z3.C2208d.f6346j     // Catch:{ all -> 0x004e }
            java.util.Objects.requireNonNull(r4)     // Catch:{ all -> 0x004e }
            java.util.logging.Logger r4 = p154z3.C2208d.f6345i     // Catch:{ all -> 0x004e }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x004e }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x003a
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            p073l3.C1320u.m3700d(r3, r2, r4)     // Catch:{ all -> 0x004e }
        L_0x003a:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x004e }
            r3.<init>()     // Catch:{ all -> 0x004e }
            throw r3     // Catch:{ all -> 0x004e }
        L_0x0040:
            r1 = 0
            boolean r3 = r2.mo6768d(r3, r4, r1)     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x004c
            z3.d r3 = r2.f6342e     // Catch:{ all -> 0x004e }
            r3.mo6774e(r2)     // Catch:{ all -> 0x004e }
        L_0x004c:
            monitor-exit(r0)
            return
        L_0x004e:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p154z3.C2207c.mo6767c(z3.a, long):void");
    }

    /* renamed from: d */
    public final boolean mo6768d(C2205a aVar, long j, boolean z) {
        StringBuilder sb;
        String str;
        C2207c cVar = aVar.f6333a;
        if (cVar != this) {
            if (cVar == null) {
                aVar.f6333a = this;
            } else {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
        }
        long b = this.f6342e.f6353g.mo6777b();
        long j2 = b + j;
        int indexOf = this.f6340c.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.f6334b <= j2) {
                C2208d.C2210b bVar = C2208d.f6346j;
                if (C2208d.f6345i.isLoggable(Level.FINE)) {
                    C1320u.m3700d(aVar, this, "already scheduled");
                }
                return false;
            }
            this.f6340c.remove(indexOf);
        }
        aVar.f6334b = j2;
        C2208d.C2210b bVar2 = C2208d.f6346j;
        if (C2208d.f6345i.isLoggable(Level.FINE)) {
            if (z) {
                sb = new StringBuilder();
                str = "run again after ";
            } else {
                sb = new StringBuilder();
                str = "scheduled after ";
            }
            sb.append(str);
            sb.append(C1320u.m3707k(j2 - b));
            C1320u.m3700d(aVar, this, sb.toString());
        }
        Iterator<C2205a> it = this.f6340c.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().f6334b - b > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = this.f6340c.size();
        }
        this.f6340c.add(i, aVar);
        if (i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo6769e() {
        byte[] bArr = C2129c.f6169a;
        synchronized (this.f6342e) {
            this.f6338a = true;
            if (mo6766b()) {
                this.f6342e.mo6774e(this);
            }
        }
    }

    public String toString() {
        return this.f6343f;
    }
}
