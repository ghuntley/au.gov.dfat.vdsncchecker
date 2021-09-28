package p155j$.time.format;

import java.util.Locale;
import p155j$.time.C2220a;
import p155j$.time.C2230d;
import p155j$.time.temporal.C2296l;
import p155j$.time.temporal.C2300p;
import p155j$.time.temporal.C2309y;

/* renamed from: j$.time.format.A */
final class C2233A {

    /* renamed from: a */
    private C2296l f6378a;

    /* renamed from: b */
    private DateTimeFormatter f6379b;

    /* renamed from: c */
    private int f6380c;

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C2233A(p155j$.time.temporal.C2296l r10, p155j$.time.format.DateTimeFormatter r11) {
        /*
            r9 = this;
            r9.<init>()
            j$.time.chrono.f r0 = r11.mo6884b()
            j$.time.ZoneId r1 = r11.mo6887e()
            if (r0 != 0) goto L_0x0011
            if (r1 != 0) goto L_0x0011
            goto L_0x0105
        L_0x0011:
            int r2 = p155j$.time.temporal.C2308x.f6561a
            j$.time.temporal.r r2 = p155j$.time.temporal.C2302r.f6555a
            java.lang.Object r2 = r10.mo6793e(r2)
            j$.time.chrono.f r2 = (p155j$.time.chrono.C2228f) r2
            j$.time.temporal.q r3 = p155j$.time.temporal.C2301q.f6554a
            java.lang.Object r3 = r10.mo6793e(r3)
            j$.time.ZoneId r3 = (p155j$.time.ZoneId) r3
            boolean r4 = java.util.Objects.equals(r0, r2)
            r5 = 0
            if (r4 == 0) goto L_0x002b
            r0 = r5
        L_0x002b:
            boolean r4 = java.util.Objects.equals(r1, r3)
            if (r4 == 0) goto L_0x0032
            r1 = r5
        L_0x0032:
            if (r0 != 0) goto L_0x0038
            if (r1 != 0) goto L_0x0038
            goto L_0x0105
        L_0x0038:
            if (r0 == 0) goto L_0x003c
            r4 = r0
            goto L_0x003d
        L_0x003c:
            r4 = r2
        L_0x003d:
            if (r1 == 0) goto L_0x00a8
            j$.time.temporal.a r6 = p155j$.time.temporal.C2285a.INSTANT_SECONDS
            boolean r6 = r10.mo6790c(r6)
            if (r6 == 0) goto L_0x0056
            if (r4 == 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            j$.time.chrono.g r0 = p155j$.time.chrono.C2229g.f6372a
        L_0x004c:
            j$.time.h r10 = p155j$.time.C2270h.m5928n(r10)
            j$.time.r r10 = p155j$.time.C2280r.m5991o(r10, r1)
            goto L_0x0105
        L_0x0056:
            j$.time.zone.c r6 = r1.mo6834m()     // Catch:{ d -> 0x0067 }
            boolean r7 = r6.mo7069i()     // Catch:{ d -> 0x0067 }
            if (r7 == 0) goto L_0x0067
            j$.time.h r7 = p155j$.time.C2270h.f6490c     // Catch:{ d -> 0x0067 }
            j$.time.ZoneOffset r6 = r6.mo7063d(r7)     // Catch:{ d -> 0x0067 }
            goto L_0x0068
        L_0x0067:
            r6 = r1
        L_0x0068:
            boolean r6 = r6 instanceof p155j$.time.ZoneOffset
            if (r6 == 0) goto L_0x00a8
            j$.time.temporal.a r6 = p155j$.time.temporal.C2285a.OFFSET_SECONDS
            boolean r7 = r10.mo6790c(r6)
            if (r7 == 0) goto L_0x00a8
            int r6 = r10.mo6789b(r6)
            j$.time.zone.c r7 = r1.mo6834m()
            j$.time.h r8 = p155j$.time.C2270h.f6490c
            j$.time.ZoneOffset r7 = r7.mo7063d(r8)
            int r7 = r7.mo6837q()
            if (r6 != r7) goto L_0x0089
            goto L_0x00a8
        L_0x0089:
            j$.time.d r11 = new j$.time.d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Unable to apply override zone '"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "' because the temporal object being formatted has a different offset but does not represent an instant: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.<init>(r10)
            throw r11
        L_0x00a8:
            if (r1 == 0) goto L_0x00ab
            r3 = r1
        L_0x00ab:
            if (r0 == 0) goto L_0x00ff
            j$.time.temporal.a r1 = p155j$.time.temporal.C2285a.EPOCH_DAY
            boolean r1 = r10.mo6790c(r1)
            if (r1 == 0) goto L_0x00c0
            r0 = r4
            j$.time.chrono.g r0 = (p155j$.time.chrono.C2229g) r0
            java.util.Objects.requireNonNull(r0)
            j$.time.LocalDate r5 = p155j$.time.LocalDate.m5669o(r10)
            goto L_0x00ff
        L_0x00c0:
            j$.time.chrono.g r1 = p155j$.time.chrono.C2229g.f6372a
            if (r0 != r1) goto L_0x00c6
            if (r2 == 0) goto L_0x00ff
        L_0x00c6:
            j$.time.temporal.a[] r1 = p155j$.time.temporal.C2285a.values()
            int r2 = r1.length
            r6 = 0
        L_0x00cc:
            if (r6 >= r2) goto L_0x00ff
            r7 = r1[r6]
            boolean r8 = r7.mo7020c()
            if (r8 == 0) goto L_0x00fc
            boolean r7 = r10.mo6790c(r7)
            if (r7 != 0) goto L_0x00dd
            goto L_0x00fc
        L_0x00dd:
            j$.time.d r11 = new j$.time.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to apply override chronology '"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "' because the temporal object being formatted contains date fields but does not represent a whole date: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r11.<init>(r10)
            throw r11
        L_0x00fc:
            int r6 = r6 + 1
            goto L_0x00cc
        L_0x00ff:
            j$.time.format.z r0 = new j$.time.format.z
            r0.<init>(r5, r10, r4, r3)
            r10 = r0
        L_0x0105:
            r9.f6378a = r10
            r9.f6379b = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p155j$.time.format.C2233A.<init>(j$.time.temporal.l, j$.time.format.DateTimeFormatter):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6862a() {
        this.f6380c--;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C2236D mo6863b() {
        return this.f6379b.mo6885c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Locale mo6864c() {
        return this.f6379b.mo6886d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C2296l mo6865d() {
        return this.f6378a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Long mo6866e(C2300p pVar) {
        try {
            return Long.valueOf(this.f6378a.mo6795f(pVar));
        } catch (C2230d e) {
            if (this.f6380c > 0) {
                return null;
            }
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Object mo6867f(C2309y yVar) {
        Object e = this.f6378a.mo6793e(yVar);
        if (e != null || this.f6380c != 0) {
            return e;
        }
        StringBuilder a = C2220a.m5746a("Unable to extract value: ");
        a.append(this.f6378a.getClass());
        throw new C2230d(a.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo6868g() {
        this.f6380c++;
    }

    public String toString() {
        return this.f6378a.toString();
    }
}
