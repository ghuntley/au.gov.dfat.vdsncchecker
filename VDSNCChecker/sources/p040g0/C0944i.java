package p040g0;

import p040g0.C0945j;
import p052i0.C1022a;

/* renamed from: g0.i */
public class C0944i implements C1022a<C0945j.C0946a> {

    /* renamed from: a */
    public final /* synthetic */ String f3506a;

    public C0944i(String str) {
        this.f3506a = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0 >= r2.size()) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        ((p052i0.C1022a) r2.get(r0)).mo4255a(r5);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        r0 = 0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4255a(p040g0.C0945j.C0946a r5) {
        /*
            r4 = this;
            java.lang.Object r0 = p040g0.C0945j.f3509c
            monitor-enter(r0)
            p.h<java.lang.String, java.util.ArrayList<i0.a<g0.j$a>>> r1 = p040g0.C0945j.f3510d     // Catch:{ all -> 0x002b }
            java.lang.String r2 = r4.f3506a     // Catch:{ all -> 0x002b }
            java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x002b }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002b }
            if (r2 != 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0011:
            java.lang.String r3 = r4.f3506a     // Catch:{ all -> 0x002b }
            r1.remove(r3)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            r0 = 0
        L_0x0018:
            int r1 = r2.size()
            if (r0 >= r1) goto L_0x002a
            java.lang.Object r1 = r2.get(r0)
            i0.a r1 = (p052i0.C1022a) r1
            r1.mo4255a(r5)
            int r0 = r0 + 1
            goto L_0x0018
        L_0x002a:
            return
        L_0x002b:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040g0.C0944i.mo4255a(g0.j$a):void");
    }
}
