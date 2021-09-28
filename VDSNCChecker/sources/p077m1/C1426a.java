package p077m1;

import android.content.Context;
import p065k1.C1169c;
import p071l1.C1235b;
import p072l2.C1241e;
import p118t0.C1776j;
import p136w0.C2036r;

/* renamed from: m1.a */
public final class C1426a {
    /* renamed from: a */
    public static final void m4088a(Context context, C1169c cVar) {
        C1169c cVar2 = cVar;
        C1241e.m3517j(context, "context");
        C1241e.m3517j(cVar2, "viewModel");
        long d = C2036r.m5366d();
        long j = C2036r.m5367e(context).getLong("PREF_CRL_TIME_BETWEEN_UPDATES", 0);
        C1235b.C1236a aVar = C1235b.f4159a;
        boolean z = true;
        C1235b.C1236a.m3508a(aVar, "CRLHelper", "getCurrentUtcDateTimeInSeconds is %1$s", new Object[]{Long.valueOf(d)}, (Throwable) null, 8);
        C1235b.C1236a.m3508a(aVar, "CRLHelper", "getCrlLastUpdatedAsUtc is %1$s", new Object[]{Long.valueOf(j)}, (Throwable) null, 8);
        C1235b.C1236a.m3508a(aVar, "CRLHelper", "TIME_BETWEEN_UPDATES_BEFORE_WARNING_SHOWN is %1$s", new Object[]{864000L}, (Throwable) null, 8);
        C1776j<Boolean> jVar = cVar2.f4032f;
        if (d - j < 864000) {
            z = false;
        }
        jVar.mo6061h(Boolean.valueOf(z));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: l3.z} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m4089b(android.content.Context r18, p065k1.C1169c r19) {
        /*
            r0 = r19
            java.lang.String r1 = "context"
            r2 = r18
            p072l2.C1241e.m3517j(r2, r1)
            java.lang.String r1 = "viewModel"
            p072l2.C1241e.m3517j(r0, r1)
            long r3 = p136w0.C2036r.m5366d()
            android.content.SharedPreferences r1 = p136w0.C2036r.m5367e(r18)
            r5 = 0
            java.lang.String r2 = "PREF_CRL_TIME_BETWEEN_UPDATES"
            long r1 = r1.getLong(r2, r5)
            l1.b$a r11 = p071l1.C1235b.f4159a
            r12 = 1
            java.lang.Object[] r8 = new java.lang.Object[r12]
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            r13 = 0
            r8[r13] = r5
            r14 = 0
            r15 = 8
            r16 = 0
            r17 = 8
            java.lang.String r6 = "CRLHelper"
            java.lang.String r7 = "getCurrentUtcDateTimeInSeconds is %1$s"
            r5 = r11
            r9 = r16
            r10 = r17
            p071l1.C1235b.C1236a.m3508a(r5, r6, r7, r8, r9, r10)
            java.lang.Object[] r8 = new java.lang.Object[r12]
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            r8[r13] = r5
            java.lang.String r6 = "CRLHelper"
            java.lang.String r7 = "getCrlLastUpdatedAsUtc is %1$s"
            r5 = r11
            p071l1.C1235b.C1236a.m3508a(r5, r6, r7, r8, r9, r10)
            java.lang.Object[] r8 = new java.lang.Object[r12]
            r16 = 86400(0x15180, double:4.26873E-319)
            java.lang.Long r5 = java.lang.Long.valueOf(r16)
            r8[r13] = r5
            java.lang.String r6 = "CRLHelper"
            java.lang.String r7 = "TIME_BETWEEN_UPDATES is %1$s"
            r5 = r11
            r9 = r14
            r10 = r15
            p071l1.C1235b.C1236a.m3508a(r5, r6, r7, r8, r9, r10)
            long r3 = r3 - r1
            int r1 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r1 < 0) goto L_0x00e0
            java.lang.Object[] r8 = new java.lang.Object[r13]
            r9 = 0
            r10 = 8
            java.lang.String r6 = "CRLHelper"
            java.lang.String r7 = "Downloading latest CRL..."
            r5 = r11
            p071l1.C1235b.C1236a.m3508a(r5, r6, r7, r8, r9, r10)
            java.lang.String r1 = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY"
            java.lang.Object r2 = r0.mo6062a(r1)
            l3.z r2 = (p073l3.C1334z) r2
            r3 = 0
            if (r2 == 0) goto L_0x0080
            goto L_0x00a2
        L_0x0080:
            t0.a r2 = new t0.a
            l3.g1 r4 = new l3.g1
            r4.<init>(r3)
            l3.f0 r5 = p073l3.C1278f0.f4285a
            l3.a1 r5 = p085n3.C1470k.f4617a
            l3.a1 r5 = r5.mo5016T()
            w2.f r4 = p138w2.C2046f.C2047a.C2048a.m5385d(r4, r5)
            r2.<init>(r4)
            java.lang.Object r1 = r0.mo6063c(r1, r2)
            java.lang.String r2 = "setTagIfAbsent(\n        …Main.immediate)\n        )"
            p072l2.C1241e.m3516f(r1, r2)
            r2 = r1
            l3.z r2 = (p073l3.C1334z) r2
        L_0x00a2:
            k1.b r1 = new k1.b
            r1.<init>(r0, r3)
            w2.h r0 = p138w2.C2051h.f5888e
            boolean r4 = p073l3.C1322v.f4331a
            w2.f r2 = r2.mo1777v()
            w2.f r0 = r2.plus(r0)
            l3.f0 r2 = p073l3.C1278f0.f4285a
            l3.x r2 = p073l3.C1278f0.f4286b
            if (r0 == r2) goto L_0x00c5
            w2.e$a r4 = p138w2.C2044e.C2045a.f5886e
            w2.f$a r4 = r0.get(r4)
            if (r4 != 0) goto L_0x00c5
            w2.f r0 = r0.plus(r2)
        L_0x00c5:
            l3.f1 r2 = new l3.f1
            r2.<init>(r0, r12)
            w2.d r0 = p042g2.C0955a.m2734h(r1, r2, r2)     // Catch:{ all -> 0x00d8 }
            w2.d r0 = p042g2.C0955a.m2743q(r0)     // Catch:{ all -> 0x00d8 }
            t2.k r1 = p120t2.C1798k.f5446a     // Catch:{ all -> 0x00d8 }
            p085n3.C1462e.m4130a(r0, r1, r3)     // Catch:{ all -> 0x00d8 }
            goto L_0x00e0
        L_0x00d8:
            r0 = move-exception
            java.lang.Object r0 = p042g2.C0955a.m2736j(r0)
            r2.mo5013j(r0)
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p077m1.C1426a.m4089b(android.content.Context, k1.c):void");
    }
}
