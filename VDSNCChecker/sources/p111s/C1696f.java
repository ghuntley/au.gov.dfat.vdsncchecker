package p111s;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p099q.C1593e;
import p117t.C1746b;
import p117t.C1752f;

/* renamed from: s.f */
public class C1696f extends C1702l {

    /* renamed from: A0 */
    public int f5240A0 = 0;

    /* renamed from: B0 */
    public C1692c[] f5241B0 = new C1692c[4];

    /* renamed from: C0 */
    public C1692c[] f5242C0 = new C1692c[4];

    /* renamed from: D0 */
    public int f5243D0 = 257;

    /* renamed from: E0 */
    public boolean f5244E0 = false;

    /* renamed from: F0 */
    public boolean f5245F0 = false;

    /* renamed from: G0 */
    public WeakReference<C1693d> f5246G0 = null;

    /* renamed from: H0 */
    public WeakReference<C1693d> f5247H0 = null;

    /* renamed from: I0 */
    public WeakReference<C1693d> f5248I0 = null;

    /* renamed from: J0 */
    public WeakReference<C1693d> f5249J0 = null;

    /* renamed from: K0 */
    public HashSet<C1695e> f5250K0 = new HashSet<>();

    /* renamed from: L0 */
    public C1746b.C1747a f5251L0 = new C1746b.C1747a();

    /* renamed from: r0 */
    public C1746b f5252r0 = new C1746b(this);

    /* renamed from: s0 */
    public C1752f f5253s0 = new C1752f(this);

    /* renamed from: t0 */
    public int f5254t0;

    /* renamed from: u0 */
    public C1746b.C1748b f5255u0 = null;

    /* renamed from: v0 */
    public boolean f5256v0 = false;

    /* renamed from: w0 */
    public C1593e f5257w0 = new C1593e();

    /* renamed from: x0 */
    public int f5258x0;

    /* renamed from: y0 */
    public int f5259y0;

    /* renamed from: z0 */
    public int f5260z0 = 0;

    /* renamed from: Z */
    public static boolean m4738Z(C1695e eVar, C1746b.C1748b bVar, C1746b.C1747a aVar, int i) {
        int i2;
        int i3;
        if (bVar == null) {
            return false;
        }
        if (eVar.f5213h0 == 8 || (eVar instanceof C1697g) || (eVar instanceof C1690a)) {
            aVar.f5345e = 0;
            aVar.f5346f = 0;
            return false;
        }
        aVar.f5341a = eVar.mo5930m();
        aVar.f5342b = eVar.mo5934q();
        aVar.f5343c = eVar.mo5935r();
        aVar.f5344d = eVar.mo5929l();
        aVar.f5349i = false;
        aVar.f5350j = i;
        boolean z = aVar.f5341a == 3;
        boolean z2 = aVar.f5342b == 3;
        boolean z3 = z && eVar.f5195X > 0.0f;
        boolean z4 = z2 && eVar.f5195X > 0.0f;
        if (z && eVar.mo5938u(0) && eVar.f5230q == 0 && !z3) {
            aVar.f5341a = 2;
            if (z2 && eVar.f5231r == 0) {
                aVar.f5341a = 1;
            }
            z = false;
        }
        if (z2 && eVar.mo5938u(1) && eVar.f5231r == 0 && !z4) {
            aVar.f5342b = 2;
            if (z && eVar.f5230q == 0) {
                aVar.f5342b = 1;
            }
            z2 = false;
        }
        if (eVar.mo5889A()) {
            aVar.f5341a = 1;
            z = false;
        }
        if (eVar.mo5890B()) {
            aVar.f5342b = 1;
            z2 = false;
        }
        if (z3) {
            if (eVar.f5232s[0] == 4) {
                aVar.f5341a = 1;
            } else if (!z2) {
                if (aVar.f5342b == 1) {
                    i3 = aVar.f5344d;
                } else {
                    aVar.f5341a = 2;
                    ((ConstraintLayout.C0235b) bVar).mo1284b(eVar, aVar);
                    i3 = aVar.f5346f;
                }
                aVar.f5341a = 1;
                aVar.f5343c = (int) (eVar.f5195X * ((float) i3));
            }
        }
        if (z4) {
            if (eVar.f5232s[1] == 4) {
                aVar.f5342b = 1;
            } else if (!z) {
                if (aVar.f5341a == 1) {
                    i2 = aVar.f5343c;
                } else {
                    aVar.f5342b = 2;
                    ((ConstraintLayout.C0235b) bVar).mo1284b(eVar, aVar);
                    i2 = aVar.f5345e;
                }
                aVar.f5342b = 1;
                aVar.f5344d = eVar.f5196Y == -1 ? (int) (((float) i2) / eVar.f5195X) : (int) (eVar.f5195X * ((float) i2));
            }
        }
        ((ConstraintLayout.C0235b) bVar).mo1284b(eVar, aVar);
        eVar.mo5918N(aVar.f5345e);
        eVar.mo5913I(aVar.f5346f);
        eVar.f5175D = aVar.f5348h;
        eVar.mo5910F(aVar.f5347g);
        aVar.f5350j = 0;
        return aVar.f5349i;
    }

    /* renamed from: C */
    public void mo5907C() {
        this.f5257w0.mo5736u();
        this.f5258x0 = 0;
        this.f5259y0 = 0;
        super.mo5907C();
    }

    /* renamed from: O */
    public void mo5919O(boolean z, boolean z2) {
        super.mo5919O(z, z2);
        int size = this.f5270q0.size();
        for (int i = 0; i < size; i++) {
            this.f5270q0.get(i).mo5919O(z, z2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v64, resolved type: s.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v65, resolved type: s.a} */
    /* JADX WARNING: type inference failed for: r6v4, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0589  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x05e6  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x05fc  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x0624  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0626  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x0648  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x064b  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0656  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x0673  */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x0770  */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x07b7  */
    /* JADX WARNING: Removed duplicated region for block: B:456:0x07e4 A[LOOP:32: B:455:0x07e2->B:456:0x07e4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x084c  */
    /* JADX WARNING: Removed duplicated region for block: B:469:0x085a  */
    /* JADX WARNING: Removed duplicated region for block: B:472:0x086d  */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x0878  */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x087c  */
    /* JADX WARNING: Removed duplicated region for block: B:487:0x08b6  */
    /* JADX WARNING: Removed duplicated region for block: B:490:0x08bc  */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x08c9  */
    /* JADX WARNING: Removed duplicated region for block: B:582:0x08be A[SYNTHETIC] */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5944Q() {
        /*
            r26 = this;
            r1 = r26
            r2 = 0
            r1.f5197Z = r2
            r1.f5199a0 = r2
            r1.f5244E0 = r2
            r1.f5245F0 = r2
            java.util.ArrayList<s.e> r0 = r1.f5270q0
            int r3 = r0.size()
            int r0 = r26.mo5935r()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r26.mo5929l()
            int r4 = java.lang.Math.max(r2, r4)
            int[] r5 = r1.f5191T
            r6 = 1
            r7 = r5[r6]
            r5 = r5[r2]
            int r8 = r1.f5254t0
            r9 = -1
            if (r8 != 0) goto L_0x0237
            int r8 = r1.f5243D0
            boolean r8 = p111s.C1700j.m4764b(r8, r6)
            if (r8 == 0) goto L_0x0237
            t.b$b r8 = r1.f5255u0
            int r11 = r26.mo5930m()
            int r12 = r26.mo5934q()
            p117t.C1756i.f5384b = r2
            p117t.C1756i.f5385c = r2
            r26.mo5908D()
            java.util.ArrayList<s.e> r13 = r1.f5270q0
            int r14 = r13.size()
            r15 = r2
        L_0x004d:
            if (r15 >= r14) goto L_0x005b
            java.lang.Object r16 = r13.get(r15)
            s.e r16 = (p111s.C1695e) r16
            r16.mo5908D()
            int r15 = r15 + 1
            goto L_0x004d
        L_0x005b:
            boolean r15 = r1.f5256v0
            if (r11 != r6) goto L_0x0067
            int r11 = r26.mo5935r()
            r1.mo5911G(r2, r11)
            goto L_0x006f
        L_0x0067:
            s.d r11 = r1.f5180I
            r11.f5155b = r2
            r11.f5156c = r6
            r1.f5197Z = r2
        L_0x006f:
            r11 = r2
            r16 = r11
            r17 = r16
        L_0x0074:
            r18 = 1056964608(0x3f000000, float:0.5)
            if (r11 >= r14) goto L_0x00cb
            java.lang.Object r19 = r13.get(r11)
            r10 = r19
            s.e r10 = (p111s.C1695e) r10
            boolean r2 = r10 instanceof p111s.C1697g
            if (r2 == 0) goto L_0x00b8
            s.g r10 = (p111s.C1697g) r10
            int r2 = r10.f5265u0
            if (r2 != r6) goto L_0x00c6
            int r2 = r10.f5262r0
            if (r2 == r9) goto L_0x008f
            goto L_0x00b2
        L_0x008f:
            int r2 = r10.f5263s0
            if (r2 == r9) goto L_0x00a1
            boolean r2 = r26.mo5889A()
            if (r2 == 0) goto L_0x00a1
            int r2 = r26.mo5935r()
            int r9 = r10.f5263s0
            int r2 = r2 - r9
            goto L_0x00b2
        L_0x00a1:
            boolean r2 = r26.mo5889A()
            if (r2 == 0) goto L_0x00b5
            float r2 = r10.f5261q0
            int r9 = r26.mo5935r()
            float r9 = (float) r9
            float r2 = r2 * r9
            float r2 = r2 + r18
            int r2 = (int) r2
        L_0x00b2:
            r10.mo5955Q(r2)
        L_0x00b5:
            r16 = r6
            goto L_0x00c6
        L_0x00b8:
            boolean r2 = r10 instanceof p111s.C1690a
            if (r2 == 0) goto L_0x00c6
            s.a r10 = (p111s.C1690a) r10
            int r2 = r10.mo5892S()
            if (r2 != 0) goto L_0x00c6
            r17 = r6
        L_0x00c6:
            int r11 = r11 + 1
            r2 = 0
            r9 = -1
            goto L_0x0074
        L_0x00cb:
            if (r16 == 0) goto L_0x00e9
            r2 = 0
        L_0x00ce:
            if (r2 >= r14) goto L_0x00e9
            java.lang.Object r9 = r13.get(r2)
            s.e r9 = (p111s.C1695e) r9
            boolean r10 = r9 instanceof p111s.C1697g
            if (r10 == 0) goto L_0x00e5
            s.g r9 = (p111s.C1697g) r9
            int r10 = r9.f5265u0
            if (r10 != r6) goto L_0x00e5
            r10 = 0
            p117t.C1756i.m4888b(r10, r9, r8, r15)
            goto L_0x00e6
        L_0x00e5:
            r10 = 0
        L_0x00e6:
            int r2 = r2 + 1
            goto L_0x00ce
        L_0x00e9:
            r10 = 0
            p117t.C1756i.m4888b(r10, r1, r8, r15)
            if (r17 == 0) goto L_0x0110
            r2 = 0
        L_0x00f0:
            if (r2 >= r14) goto L_0x0110
            java.lang.Object r9 = r13.get(r2)
            s.e r9 = (p111s.C1695e) r9
            boolean r10 = r9 instanceof p111s.C1690a
            if (r10 == 0) goto L_0x010d
            s.a r9 = (p111s.C1690a) r9
            int r10 = r9.mo5892S()
            if (r10 != 0) goto L_0x010d
            boolean r10 = r9.mo5891R()
            if (r10 == 0) goto L_0x010d
            p117t.C1756i.m4888b(r6, r9, r8, r15)
        L_0x010d:
            int r2 = r2 + 1
            goto L_0x00f0
        L_0x0110:
            if (r12 != r6) goto L_0x011b
            int r2 = r26.mo5929l()
            r9 = 0
            r1.mo5912H(r9, r2)
            goto L_0x0124
        L_0x011b:
            r9 = 0
            s.d r2 = r1.f5181J
            r2.f5155b = r9
            r2.f5156c = r6
            r1.f5199a0 = r9
        L_0x0124:
            r2 = 0
            r9 = 0
            r10 = 0
        L_0x0127:
            if (r2 >= r14) goto L_0x0177
            java.lang.Object r11 = r13.get(r2)
            s.e r11 = (p111s.C1695e) r11
            boolean r12 = r11 instanceof p111s.C1697g
            if (r12 == 0) goto L_0x0167
            s.g r11 = (p111s.C1697g) r11
            int r12 = r11.f5265u0
            if (r12 != 0) goto L_0x0174
            int r9 = r11.f5262r0
            r12 = -1
            if (r9 == r12) goto L_0x013f
            goto L_0x0162
        L_0x013f:
            int r9 = r11.f5263s0
            if (r9 == r12) goto L_0x0151
            boolean r9 = r26.mo5890B()
            if (r9 == 0) goto L_0x0151
            int r9 = r26.mo5929l()
            int r12 = r11.f5263s0
            int r9 = r9 - r12
            goto L_0x0162
        L_0x0151:
            boolean r9 = r26.mo5890B()
            if (r9 == 0) goto L_0x0165
            float r9 = r11.f5261q0
            int r12 = r26.mo5929l()
            float r12 = (float) r12
            float r9 = r9 * r12
            float r9 = r9 + r18
            int r9 = (int) r9
        L_0x0162:
            r11.mo5955Q(r9)
        L_0x0165:
            r9 = r6
            goto L_0x0174
        L_0x0167:
            boolean r12 = r11 instanceof p111s.C1690a
            if (r12 == 0) goto L_0x0174
            s.a r11 = (p111s.C1690a) r11
            int r11 = r11.mo5892S()
            if (r11 != r6) goto L_0x0174
            r10 = r6
        L_0x0174:
            int r2 = r2 + 1
            goto L_0x0127
        L_0x0177:
            if (r9 == 0) goto L_0x0192
            r2 = 0
        L_0x017a:
            if (r2 >= r14) goto L_0x0192
            java.lang.Object r9 = r13.get(r2)
            s.e r9 = (p111s.C1695e) r9
            boolean r11 = r9 instanceof p111s.C1697g
            if (r11 == 0) goto L_0x018f
            s.g r9 = (p111s.C1697g) r9
            int r11 = r9.f5265u0
            if (r11 != 0) goto L_0x018f
            p117t.C1756i.m4893g(r6, r9, r8)
        L_0x018f:
            int r2 = r2 + 1
            goto L_0x017a
        L_0x0192:
            r2 = 0
            p117t.C1756i.m4893g(r2, r1, r8)
            if (r10 == 0) goto L_0x01b9
            r2 = 0
        L_0x0199:
            if (r2 >= r14) goto L_0x01b9
            java.lang.Object r9 = r13.get(r2)
            s.e r9 = (p111s.C1695e) r9
            boolean r10 = r9 instanceof p111s.C1690a
            if (r10 == 0) goto L_0x01b6
            s.a r9 = (p111s.C1690a) r9
            int r10 = r9.mo5892S()
            if (r10 != r6) goto L_0x01b6
            boolean r10 = r9.mo5891R()
            if (r10 == 0) goto L_0x01b6
            p117t.C1756i.m4893g(r6, r9, r8)
        L_0x01b6:
            int r2 = r2 + 1
            goto L_0x0199
        L_0x01b9:
            r2 = 0
        L_0x01ba:
            if (r2 >= r14) goto L_0x01ed
            java.lang.Object r9 = r13.get(r2)
            s.e r9 = (p111s.C1695e) r9
            boolean r10 = r9.mo5943z()
            if (r10 == 0) goto L_0x01ea
            boolean r10 = p117t.C1756i.m4887a(r9)
            if (r10 == 0) goto L_0x01ea
            t.b$a r10 = p117t.C1756i.f5383a
            r11 = 0
            m4738Z(r9, r8, r10, r11)
            boolean r10 = r9 instanceof p111s.C1697g
            if (r10 == 0) goto L_0x01e4
            r10 = r9
            s.g r10 = (p111s.C1697g) r10
            int r10 = r10.f5265u0
            if (r10 != 0) goto L_0x01e0
            goto L_0x01e7
        L_0x01e0:
            p117t.C1756i.m4888b(r11, r9, r8, r15)
            goto L_0x01ea
        L_0x01e4:
            p117t.C1756i.m4888b(r11, r9, r8, r15)
        L_0x01e7:
            p117t.C1756i.m4893g(r11, r9, r8)
        L_0x01ea:
            int r2 = r2 + 1
            goto L_0x01ba
        L_0x01ed:
            r2 = 0
        L_0x01ee:
            if (r2 >= r3) goto L_0x0237
            java.util.ArrayList<s.e> r8 = r1.f5270q0
            java.lang.Object r8 = r8.get(r2)
            s.e r8 = (p111s.C1695e) r8
            boolean r9 = r8.mo5943z()
            if (r9 == 0) goto L_0x0234
            boolean r9 = r8 instanceof p111s.C1697g
            if (r9 != 0) goto L_0x0234
            boolean r9 = r8 instanceof p111s.C1690a
            if (r9 != 0) goto L_0x0234
            boolean r9 = r8 instanceof p111s.C1701k
            if (r9 != 0) goto L_0x0234
            boolean r9 = r8.f5177F
            if (r9 != 0) goto L_0x0234
            r9 = 0
            int r10 = r8.mo5928k(r9)
            int r9 = r8.mo5928k(r6)
            r11 = 3
            if (r10 != r11) goto L_0x0226
            int r10 = r8.f5230q
            if (r10 == r6) goto L_0x0226
            if (r9 != r11) goto L_0x0226
            int r9 = r8.f5231r
            if (r9 == r6) goto L_0x0226
            r9 = r6
            goto L_0x0227
        L_0x0226:
            r9 = 0
        L_0x0227:
            if (r9 != 0) goto L_0x0234
            t.b$a r9 = new t.b$a
            r9.<init>()
            t.b$b r10 = r1.f5255u0
            r11 = 0
            m4738Z(r8, r10, r9, r11)
        L_0x0234:
            int r2 = r2 + 1
            goto L_0x01ee
        L_0x0237:
            r2 = 2
            if (r3 <= r2) goto L_0x060c
            if (r5 == r2) goto L_0x023e
            if (r7 != r2) goto L_0x060c
        L_0x023e:
            int r9 = r1.f5243D0
            r10 = 1024(0x400, float:1.435E-42)
            boolean r9 = p111s.C1700j.m4764b(r9, r10)
            if (r9 == 0) goto L_0x060c
            t.b$b r9 = r1.f5255u0
            s.d$a r10 = p111s.C1693d.C1694a.CENTER
            java.util.ArrayList<s.e> r11 = r1.f5270q0
            int r12 = r11.size()
            r13 = 0
        L_0x0253:
            if (r13 >= r12) goto L_0x0281
            java.lang.Object r14 = r11.get(r13)
            s.e r14 = (p111s.C1695e) r14
            int r15 = r26.mo5930m()
            int r2 = r26.mo5934q()
            int r8 = r14.mo5930m()
            int r14 = r14.mo5934q()
            boolean r2 = p117t.C1757j.m4896c(r15, r2, r8, r14)
            if (r2 != 0) goto L_0x027d
            r24 = r0
            r22 = r3
            r21 = r4
            r25 = r5
            r23 = r7
            goto L_0x05be
        L_0x027d:
            int r13 = r13 + 1
            r2 = 2
            goto L_0x0253
        L_0x0281:
            r2 = 0
            r6 = 0
            r8 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 0
        L_0x0289:
            if (r6 >= r12) goto L_0x0371
            java.lang.Object r21 = r11.get(r6)
            r22 = r3
            r3 = r21
            s.e r3 = (p111s.C1695e) r3
            r21 = r4
            int r4 = r26.mo5930m()
            r23 = r7
            int r7 = r26.mo5934q()
            r24 = r0
            int r0 = r3.mo5930m()
            r25 = r5
            int r5 = r3.mo5934q()
            boolean r0 = p117t.C1757j.m4896c(r4, r7, r0, r5)
            if (r0 != 0) goto L_0x02b9
            t.b$a r0 = r1.f5251L0
            r4 = 0
            m4738Z(r3, r9, r0, r4)
        L_0x02b9:
            boolean r0 = r3 instanceof p111s.C1697g
            if (r0 == 0) goto L_0x02de
            r4 = r3
            s.g r4 = (p111s.C1697g) r4
            int r5 = r4.f5265u0
            if (r5 != 0) goto L_0x02cf
            if (r13 != 0) goto L_0x02cc
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r13 = r5
        L_0x02cc:
            r13.add(r4)
        L_0x02cf:
            int r5 = r4.f5265u0
            r7 = 1
            if (r5 != r7) goto L_0x02de
            if (r2 != 0) goto L_0x02db
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x02db:
            r2.add(r4)
        L_0x02de:
            boolean r4 = r3 instanceof p111s.C1699i
            if (r4 == 0) goto L_0x0321
            boolean r4 = r3 instanceof p111s.C1690a
            if (r4 == 0) goto L_0x0309
            r4 = r3
            s.a r4 = (p111s.C1690a) r4
            int r5 = r4.mo5892S()
            if (r5 != 0) goto L_0x02fa
            if (r8 != 0) goto L_0x02f7
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r8 = r5
        L_0x02f7:
            r8.add(r4)
        L_0x02fa:
            int r5 = r4.mo5892S()
            r7 = 1
            if (r5 != r7) goto L_0x0321
            if (r14 != 0) goto L_0x031e
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            goto L_0x031d
        L_0x0309:
            r4 = r3
            s.i r4 = (p111s.C1699i) r4
            if (r8 != 0) goto L_0x0313
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0313:
            r8.add(r4)
            if (r14 != 0) goto L_0x031e
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x031d:
            r14 = r5
        L_0x031e:
            r14.add(r4)
        L_0x0321:
            s.d r4 = r3.f5180I
            s.d r4 = r4.f5159f
            if (r4 != 0) goto L_0x033d
            s.d r4 = r3.f5182K
            s.d r4 = r4.f5159f
            if (r4 != 0) goto L_0x033d
            if (r0 != 0) goto L_0x033d
            boolean r4 = r3 instanceof p111s.C1690a
            if (r4 != 0) goto L_0x033d
            if (r15 != 0) goto L_0x033a
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L_0x033a:
            r15.add(r3)
        L_0x033d:
            s.d r4 = r3.f5181J
            s.d r4 = r4.f5159f
            if (r4 != 0) goto L_0x0363
            s.d r4 = r3.f5183L
            s.d r4 = r4.f5159f
            if (r4 != 0) goto L_0x0363
            s.d r4 = r3.f5184M
            s.d r4 = r4.f5159f
            if (r4 != 0) goto L_0x0363
            if (r0 != 0) goto L_0x0363
            boolean r0 = r3 instanceof p111s.C1690a
            if (r0 != 0) goto L_0x0363
            if (r18 != 0) goto L_0x035c
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
        L_0x035c:
            r0 = r18
            r0.add(r3)
            r18 = r0
        L_0x0363:
            int r6 = r6 + 1
            r4 = r21
            r3 = r22
            r7 = r23
            r0 = r24
            r5 = r25
            goto L_0x0289
        L_0x0371:
            r24 = r0
            r22 = r3
            r21 = r4
            r25 = r5
            r23 = r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r2 == 0) goto L_0x0398
            java.util.Iterator r2 = r2.iterator()
        L_0x0386:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0398
            java.lang.Object r3 = r2.next()
            s.g r3 = (p111s.C1697g) r3
            r4 = 0
            r5 = 0
            p117t.C1757j.m4894a(r3, r5, r0, r4)
            goto L_0x0386
        L_0x0398:
            r4 = 0
            r5 = 0
            if (r8 == 0) goto L_0x03b9
            java.util.Iterator r2 = r8.iterator()
        L_0x03a0:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03b9
            java.lang.Object r3 = r2.next()
            s.i r3 = (p111s.C1699i) r3
            t.p r6 = p117t.C1757j.m4894a(r3, r5, r0, r4)
            r3.mo5958Q(r0, r5, r6)
            r6.mo6040b(r0)
            r4 = 0
            r5 = 0
            goto L_0x03a0
        L_0x03b9:
            s.d$a r2 = p111s.C1693d.C1694a.LEFT
            s.d r2 = r1.mo5926i(r2)
            java.util.HashSet<s.d> r2 = r2.f5154a
            if (r2 == 0) goto L_0x03db
            java.util.Iterator r2 = r2.iterator()
        L_0x03c7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03db
            java.lang.Object r3 = r2.next()
            s.d r3 = (p111s.C1693d) r3
            s.e r3 = r3.f5157d
            r4 = 0
            r5 = 0
            p117t.C1757j.m4894a(r3, r5, r0, r4)
            goto L_0x03c7
        L_0x03db:
            s.d$a r2 = p111s.C1693d.C1694a.RIGHT
            s.d r2 = r1.mo5926i(r2)
            java.util.HashSet<s.d> r2 = r2.f5154a
            if (r2 == 0) goto L_0x03fd
            java.util.Iterator r2 = r2.iterator()
        L_0x03e9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03fd
            java.lang.Object r3 = r2.next()
            s.d r3 = (p111s.C1693d) r3
            s.e r3 = r3.f5157d
            r4 = 0
            r5 = 0
            p117t.C1757j.m4894a(r3, r5, r0, r4)
            goto L_0x03e9
        L_0x03fd:
            s.d r2 = r1.mo5926i(r10)
            java.util.HashSet<s.d> r2 = r2.f5154a
            if (r2 == 0) goto L_0x041d
            java.util.Iterator r2 = r2.iterator()
        L_0x0409:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x041d
            java.lang.Object r3 = r2.next()
            s.d r3 = (p111s.C1693d) r3
            s.e r3 = r3.f5157d
            r4 = 0
            r5 = 0
            p117t.C1757j.m4894a(r3, r5, r0, r4)
            goto L_0x0409
        L_0x041d:
            r4 = 0
            r5 = 0
            if (r15 == 0) goto L_0x0435
            java.util.Iterator r2 = r15.iterator()
        L_0x0425:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0435
            java.lang.Object r3 = r2.next()
            s.e r3 = (p111s.C1695e) r3
            p117t.C1757j.m4894a(r3, r5, r0, r4)
            goto L_0x0425
        L_0x0435:
            if (r13 == 0) goto L_0x044c
            java.util.Iterator r2 = r13.iterator()
        L_0x043b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x044c
            java.lang.Object r3 = r2.next()
            s.g r3 = (p111s.C1697g) r3
            r5 = 1
            p117t.C1757j.m4894a(r3, r5, r0, r4)
            goto L_0x043b
        L_0x044c:
            r5 = 1
            if (r14 == 0) goto L_0x046c
            java.util.Iterator r2 = r14.iterator()
        L_0x0453:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x046c
            java.lang.Object r3 = r2.next()
            s.i r3 = (p111s.C1699i) r3
            t.p r6 = p117t.C1757j.m4894a(r3, r5, r0, r4)
            r3.mo5958Q(r0, r5, r6)
            r6.mo6040b(r0)
            r4 = 0
            r5 = 1
            goto L_0x0453
        L_0x046c:
            s.d$a r2 = p111s.C1693d.C1694a.TOP
            s.d r2 = r1.mo5926i(r2)
            java.util.HashSet<s.d> r2 = r2.f5154a
            if (r2 == 0) goto L_0x048e
            java.util.Iterator r2 = r2.iterator()
        L_0x047a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x048e
            java.lang.Object r3 = r2.next()
            s.d r3 = (p111s.C1693d) r3
            s.e r3 = r3.f5157d
            r4 = 0
            r5 = 1
            p117t.C1757j.m4894a(r3, r5, r0, r4)
            goto L_0x047a
        L_0x048e:
            s.d$a r2 = p111s.C1693d.C1694a.BASELINE
            s.d r2 = r1.mo5926i(r2)
            java.util.HashSet<s.d> r2 = r2.f5154a
            if (r2 == 0) goto L_0x04b0
            java.util.Iterator r2 = r2.iterator()
        L_0x049c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04b0
            java.lang.Object r3 = r2.next()
            s.d r3 = (p111s.C1693d) r3
            s.e r3 = r3.f5157d
            r4 = 0
            r5 = 1
            p117t.C1757j.m4894a(r3, r5, r0, r4)
            goto L_0x049c
        L_0x04b0:
            s.d$a r2 = p111s.C1693d.C1694a.BOTTOM
            s.d r2 = r1.mo5926i(r2)
            java.util.HashSet<s.d> r2 = r2.f5154a
            if (r2 == 0) goto L_0x04d2
            java.util.Iterator r2 = r2.iterator()
        L_0x04be:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04d2
            java.lang.Object r3 = r2.next()
            s.d r3 = (p111s.C1693d) r3
            s.e r3 = r3.f5157d
            r4 = 0
            r5 = 1
            p117t.C1757j.m4894a(r3, r5, r0, r4)
            goto L_0x04be
        L_0x04d2:
            s.d r2 = r1.mo5926i(r10)
            java.util.HashSet<s.d> r2 = r2.f5154a
            if (r2 == 0) goto L_0x04f2
            java.util.Iterator r2 = r2.iterator()
        L_0x04de:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04f2
            java.lang.Object r3 = r2.next()
            s.d r3 = (p111s.C1693d) r3
            s.e r3 = r3.f5157d
            r4 = 0
            r5 = 1
            p117t.C1757j.m4894a(r3, r5, r0, r4)
            goto L_0x04de
        L_0x04f2:
            r4 = 0
            r5 = 1
            if (r18 == 0) goto L_0x050a
            java.util.Iterator r2 = r18.iterator()
        L_0x04fa:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x050a
            java.lang.Object r3 = r2.next()
            s.e r3 = (p111s.C1695e) r3
            p117t.C1757j.m4894a(r3, r5, r0, r4)
            goto L_0x04fa
        L_0x050a:
            r2 = 0
        L_0x050b:
            if (r2 >= r12) goto L_0x0542
            java.lang.Object r3 = r11.get(r2)
            s.e r3 = (p111s.C1695e) r3
            int[] r4 = r3.f5191T
            r6 = 0
            r7 = r4[r6]
            r6 = 3
            if (r7 != r6) goto L_0x0521
            r4 = r4[r5]
            if (r4 != r6) goto L_0x0521
            r4 = 1
            goto L_0x0522
        L_0x0521:
            r4 = 0
        L_0x0522:
            if (r4 == 0) goto L_0x053e
            int r4 = r3.f5227o0
            t.p r4 = p117t.C1757j.m4895b(r0, r4)
            int r3 = r3.f5229p0
            t.p r3 = p117t.C1757j.m4895b(r0, r3)
            if (r4 == 0) goto L_0x053e
            if (r3 == 0) goto L_0x053e
            r5 = 0
            r4.mo6042d(r5, r3)
            r5 = 2
            r3.f5395c = r5
            r0.remove(r4)
        L_0x053e:
            int r2 = r2 + 1
            r5 = 1
            goto L_0x050b
        L_0x0542:
            int r2 = r0.size()
            r3 = 1
            if (r2 > r3) goto L_0x054b
            goto L_0x05be
        L_0x054b:
            int r2 = r26.mo5930m()
            r4 = 2
            if (r2 != r4) goto L_0x0581
            java.util.Iterator r2 = r0.iterator()
            r4 = 0
            r5 = 0
        L_0x0558:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0576
            java.lang.Object r6 = r2.next()
            t.p r6 = (p117t.C1763p) r6
            int r7 = r6.f5395c
            if (r7 != r3) goto L_0x056a
            r8 = 0
            goto L_0x0558
        L_0x056a:
            q.e r7 = r1.f5257w0
            r8 = 0
            int r7 = r6.mo6041c(r7, r8)
            if (r7 <= r5) goto L_0x0558
            r4 = r6
            r5 = r7
            goto L_0x0558
        L_0x0576:
            r8 = 0
            if (r4 == 0) goto L_0x0581
            int[] r2 = r1.f5191T
            r2[r8] = r3
            r1.mo5918N(r5)
            goto L_0x0582
        L_0x0581:
            r4 = 0
        L_0x0582:
            int r2 = r26.mo5934q()
            r3 = 2
            if (r2 != r3) goto L_0x05b8
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = 0
        L_0x058f:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x05ad
            java.lang.Object r5 = r0.next()
            t.p r5 = (p117t.C1763p) r5
            int r6 = r5.f5395c
            if (r6 != 0) goto L_0x05a1
            r7 = 1
            goto L_0x058f
        L_0x05a1:
            q.e r6 = r1.f5257w0
            r7 = 1
            int r6 = r5.mo6041c(r6, r7)
            if (r6 <= r3) goto L_0x058f
            r2 = r5
            r3 = r6
            goto L_0x058f
        L_0x05ad:
            r7 = 1
            if (r2 == 0) goto L_0x05b8
            int[] r0 = r1.f5191T
            r0[r7] = r7
            r1.mo5913I(r3)
            goto L_0x05b9
        L_0x05b8:
            r2 = 0
        L_0x05b9:
            if (r4 != 0) goto L_0x05c0
            if (r2 == 0) goto L_0x05be
            goto L_0x05c0
        L_0x05be:
            r0 = 0
            goto L_0x05c1
        L_0x05c0:
            r0 = 1
        L_0x05c1:
            if (r0 == 0) goto L_0x0603
            r2 = r25
            r3 = 2
            if (r2 != r3) goto L_0x05de
            int r0 = r26.mo5935r()
            r3 = r24
            if (r3 >= r0) goto L_0x05d9
            if (r3 <= 0) goto L_0x05d9
            r1.mo5918N(r3)
            r4 = 1
            r1.f5244E0 = r4
            goto L_0x05e0
        L_0x05d9:
            int r0 = r26.mo5935r()
            goto L_0x05e1
        L_0x05de:
            r3 = r24
        L_0x05e0:
            r0 = r3
        L_0x05e1:
            r4 = r23
            r3 = 2
            if (r4 != r3) goto L_0x05fc
            int r3 = r26.mo5929l()
            r5 = r21
            if (r5 >= r3) goto L_0x05f7
            if (r5 <= 0) goto L_0x05f7
            r1.mo5913I(r5)
            r3 = 1
            r1.f5245F0 = r3
            goto L_0x05fe
        L_0x05f7:
            int r3 = r26.mo5929l()
            goto L_0x05ff
        L_0x05fc:
            r5 = r21
        L_0x05fe:
            r3 = r5
        L_0x05ff:
            r5 = r3
            r3 = r0
            r0 = 1
            goto L_0x0613
        L_0x0603:
            r5 = r21
            r4 = r23
            r3 = r24
            r2 = r25
            goto L_0x0612
        L_0x060c:
            r22 = r3
            r2 = r5
            r3 = r0
            r5 = r4
            r4 = r7
        L_0x0612:
            r0 = 0
        L_0x0613:
            r6 = 64
            boolean r7 = r1.mo5953a0(r6)
            if (r7 != 0) goto L_0x0626
            r7 = 128(0x80, float:1.794E-43)
            boolean r7 = r1.mo5953a0(r7)
            if (r7 == 0) goto L_0x0624
            goto L_0x0626
        L_0x0624:
            r7 = 0
            goto L_0x0627
        L_0x0626:
            r7 = 1
        L_0x0627:
            q.e r8 = r1.f5257w0
            java.util.Objects.requireNonNull(r8)
            r9 = 0
            r8.f4949g = r9
            int r9 = r1.f5243D0
            if (r9 == 0) goto L_0x0638
            if (r7 == 0) goto L_0x0638
            r7 = 1
            r8.f4949g = r7
        L_0x0638:
            java.util.ArrayList<s.e> r7 = r1.f5270q0
            int r8 = r26.mo5930m()
            r9 = 2
            if (r8 == r9) goto L_0x064b
            int r8 = r26.mo5934q()
            if (r8 != r9) goto L_0x0648
            goto L_0x064b
        L_0x0648:
            r8 = 0
            r10 = 0
            goto L_0x064d
        L_0x064b:
            r8 = 0
            r10 = 1
        L_0x064d:
            r1.f5260z0 = r8
            r1.f5240A0 = r8
            r9 = r22
            r8 = 0
        L_0x0654:
            if (r8 >= r9) goto L_0x066a
            java.util.ArrayList<s.e> r11 = r1.f5270q0
            java.lang.Object r11 = r11.get(r8)
            s.e r11 = (p111s.C1695e) r11
            boolean r12 = r11 instanceof p111s.C1702l
            if (r12 == 0) goto L_0x0667
            s.l r11 = (p111s.C1702l) r11
            r11.mo5944Q()
        L_0x0667:
            int r8 = r8 + 1
            goto L_0x0654
        L_0x066a:
            boolean r8 = r1.mo5953a0(r6)
            r11 = r0
            r0 = 0
            r12 = 1
        L_0x0671:
            if (r12 == 0) goto L_0x08c5
            r13 = 1
            int r14 = r0 + 1
            q.e r0 = r1.f5257w0     // Catch:{ Exception -> 0x0753 }
            r0.mo5736u()     // Catch:{ Exception -> 0x0753 }
            r13 = 0
            r1.f5260z0 = r13     // Catch:{ Exception -> 0x0753 }
            r1.f5240A0 = r13     // Catch:{ Exception -> 0x0753 }
            q.e r0 = r1.f5257w0     // Catch:{ Exception -> 0x0753 }
            r1.mo5924g(r0)     // Catch:{ Exception -> 0x0753 }
            r0 = 0
        L_0x0686:
            if (r0 >= r9) goto L_0x0698
            java.util.ArrayList<s.e> r13 = r1.f5270q0     // Catch:{ Exception -> 0x0753 }
            java.lang.Object r13 = r13.get(r0)     // Catch:{ Exception -> 0x0753 }
            s.e r13 = (p111s.C1695e) r13     // Catch:{ Exception -> 0x0753 }
            q.e r15 = r1.f5257w0     // Catch:{ Exception -> 0x0753 }
            r13.mo5924g(r15)     // Catch:{ Exception -> 0x0753 }
            int r0 = r0 + 1
            goto L_0x0686
        L_0x0698:
            q.e r0 = r1.f5257w0     // Catch:{ Exception -> 0x0753 }
            r1.mo5946S(r0)     // Catch:{ Exception -> 0x0753 }
            java.lang.ref.WeakReference<s.d> r0 = r1.f5246G0     // Catch:{ Exception -> 0x0746 }
            r12 = 5
            if (r0 == 0) goto L_0x06c7
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0746 }
            if (r0 == 0) goto L_0x06c7
            java.lang.ref.WeakReference<s.d> r0 = r1.f5246G0     // Catch:{ Exception -> 0x0746 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0746 }
            s.d r0 = (p111s.C1693d) r0     // Catch:{ Exception -> 0x0746 }
            q.e r13 = r1.f5257w0     // Catch:{ Exception -> 0x0746 }
            s.d r15 = r1.f5181J     // Catch:{ Exception -> 0x0746 }
            q.j r13 = r13.mo5727l(r15)     // Catch:{ Exception -> 0x0746 }
            q.e r15 = r1.f5257w0     // Catch:{ Exception -> 0x0746 }
            q.j r0 = r15.mo5727l(r0)     // Catch:{ Exception -> 0x0746 }
            q.e r15 = r1.f5257w0     // Catch:{ Exception -> 0x0746 }
            r6 = 0
            r15.mo5721f(r0, r13, r6, r12)     // Catch:{ Exception -> 0x0746 }
            r6 = 0
            r1.f5246G0 = r6     // Catch:{ Exception -> 0x0746 }
        L_0x06c7:
            java.lang.ref.WeakReference<s.d> r0 = r1.f5248I0     // Catch:{ Exception -> 0x0746 }
            if (r0 == 0) goto L_0x06f0
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0746 }
            if (r0 == 0) goto L_0x06f0
            java.lang.ref.WeakReference<s.d> r0 = r1.f5248I0     // Catch:{ Exception -> 0x0746 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0746 }
            s.d r0 = (p111s.C1693d) r0     // Catch:{ Exception -> 0x0746 }
            q.e r6 = r1.f5257w0     // Catch:{ Exception -> 0x0746 }
            s.d r13 = r1.f5183L     // Catch:{ Exception -> 0x0746 }
            q.j r6 = r6.mo5727l(r13)     // Catch:{ Exception -> 0x0746 }
            q.e r13 = r1.f5257w0     // Catch:{ Exception -> 0x0746 }
            q.j r0 = r13.mo5727l(r0)     // Catch:{ Exception -> 0x0746 }
            q.e r13 = r1.f5257w0     // Catch:{ Exception -> 0x0746 }
            r15 = 0
            r13.mo5721f(r6, r0, r15, r12)     // Catch:{ Exception -> 0x0746 }
            r6 = 0
            r1.f5248I0 = r6     // Catch:{ Exception -> 0x0746 }
        L_0x06f0:
            java.lang.ref.WeakReference<s.d> r0 = r1.f5247H0     // Catch:{ Exception -> 0x0746 }
            if (r0 == 0) goto L_0x071c
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0746 }
            if (r0 == 0) goto L_0x071c
            java.lang.ref.WeakReference<s.d> r0 = r1.f5247H0     // Catch:{ Exception -> 0x0746 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0746 }
            s.d r0 = (p111s.C1693d) r0     // Catch:{ Exception -> 0x0746 }
            q.e r6 = r1.f5257w0     // Catch:{ Exception -> 0x0746 }
            s.d r13 = r1.f5180I     // Catch:{ Exception -> 0x0746 }
            q.j r6 = r6.mo5727l(r13)     // Catch:{ Exception -> 0x0746 }
            q.e r13 = r1.f5257w0     // Catch:{ Exception -> 0x0746 }
            q.j r0 = r13.mo5727l(r0)     // Catch:{ Exception -> 0x0746 }
            q.e r13 = r1.f5257w0     // Catch:{ Exception -> 0x0746 }
            r15 = 0
            r13.mo5721f(r0, r6, r15, r12)     // Catch:{ Exception -> 0x0746 }
            r6 = 0
            r1.f5247H0 = r6     // Catch:{ Exception -> 0x0746 }
            goto L_0x071c
        L_0x071a:
            r6 = 0
            goto L_0x0751
        L_0x071c:
            java.lang.ref.WeakReference<s.d> r0 = r1.f5249J0     // Catch:{ Exception -> 0x0746 }
            if (r0 == 0) goto L_0x0748
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0746 }
            if (r0 == 0) goto L_0x0748
            java.lang.ref.WeakReference<s.d> r0 = r1.f5249J0     // Catch:{ Exception -> 0x0746 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0746 }
            s.d r0 = (p111s.C1693d) r0     // Catch:{ Exception -> 0x0746 }
            q.e r6 = r1.f5257w0     // Catch:{ Exception -> 0x0746 }
            s.d r13 = r1.f5182K     // Catch:{ Exception -> 0x0746 }
            q.j r6 = r6.mo5727l(r13)     // Catch:{ Exception -> 0x0746 }
            q.e r13 = r1.f5257w0     // Catch:{ Exception -> 0x0746 }
            q.j r0 = r13.mo5727l(r0)     // Catch:{ Exception -> 0x0746 }
            q.e r13 = r1.f5257w0     // Catch:{ Exception -> 0x0746 }
            r15 = 0
            r13.mo5721f(r6, r0, r15, r12)     // Catch:{ Exception -> 0x0746 }
            r6 = 0
            r1.f5249J0 = r6     // Catch:{ Exception -> 0x0750 }
            goto L_0x0749
        L_0x0746:
            r0 = move-exception
            goto L_0x071a
        L_0x0748:
            r6 = 0
        L_0x0749:
            q.e r0 = r1.f5257w0     // Catch:{ Exception -> 0x0750 }
            r0.mo5732q()     // Catch:{ Exception -> 0x0750 }
            r12 = 1
            goto L_0x076e
        L_0x0750:
            r0 = move-exception
        L_0x0751:
            r12 = 1
            goto L_0x0755
        L_0x0753:
            r0 = move-exception
            r6 = 0
        L_0x0755:
            r0.printStackTrace()
            java.io.PrintStream r13 = java.lang.System.out
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r6 = "EXCEPTION : "
            r15.append(r6)
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            r13.println(r0)
        L_0x076e:
            if (r12 == 0) goto L_0x07b7
            q.e r0 = r1.f5257w0
            boolean[] r6 = p111s.C1700j.f5269a
            r12 = 2
            r13 = 0
            r6[r12] = r13
            r6 = 64
            boolean r12 = r1.mo5953a0(r6)
            r1.mo5920P(r0, r12)
            java.util.ArrayList<s.e> r13 = r1.f5270q0
            int r13 = r13.size()
            r15 = 0
            r18 = 0
        L_0x078a:
            if (r15 >= r13) goto L_0x07b5
            java.util.ArrayList<s.e> r6 = r1.f5270q0
            java.lang.Object r6 = r6.get(r15)
            s.e r6 = (p111s.C1695e) r6
            r6.mo5920P(r0, r12)
            r21 = r0
            int r0 = r6.f5212h
            r22 = r12
            r12 = -1
            if (r0 != r12) goto L_0x07a7
            int r0 = r6.f5214i
            if (r0 == r12) goto L_0x07a5
            goto L_0x07a7
        L_0x07a5:
            r0 = 0
            goto L_0x07a8
        L_0x07a7:
            r0 = 1
        L_0x07a8:
            if (r0 == 0) goto L_0x07ac
            r18 = 1
        L_0x07ac:
            int r15 = r15 + 1
            r0 = r21
            r12 = r22
            r6 = 64
            goto L_0x078a
        L_0x07b5:
            r12 = -1
            goto L_0x07d2
        L_0x07b7:
            r12 = -1
            q.e r0 = r1.f5257w0
            r1.mo5920P(r0, r8)
            r0 = 0
        L_0x07be:
            if (r0 >= r9) goto L_0x07d0
            java.util.ArrayList<s.e> r6 = r1.f5270q0
            java.lang.Object r6 = r6.get(r0)
            s.e r6 = (p111s.C1695e) r6
            q.e r13 = r1.f5257w0
            r6.mo5920P(r13, r8)
            int r0 = r0 + 1
            goto L_0x07be
        L_0x07d0:
            r18 = 0
        L_0x07d2:
            r0 = 8
            if (r10 == 0) goto L_0x083c
            if (r14 >= r0) goto L_0x083c
            boolean[] r6 = p111s.C1700j.f5269a
            r13 = 2
            boolean r6 = r6[r13]
            if (r6 == 0) goto L_0x083c
            r6 = 0
            r13 = 0
            r15 = 0
        L_0x07e2:
            if (r6 >= r9) goto L_0x0809
            java.util.ArrayList<s.e> r12 = r1.f5270q0
            java.lang.Object r12 = r12.get(r6)
            s.e r12 = (p111s.C1695e) r12
            int r0 = r12.f5197Z
            int r22 = r12.mo5935r()
            int r0 = r22 + r0
            int r13 = java.lang.Math.max(r13, r0)
            int r0 = r12.f5199a0
            int r12 = r12.mo5929l()
            int r12 = r12 + r0
            int r15 = java.lang.Math.max(r15, r12)
            int r6 = r6 + 1
            r0 = 8
            r12 = -1
            goto L_0x07e2
        L_0x0809:
            int r0 = r1.f5203c0
            int r0 = java.lang.Math.max(r0, r13)
            int r6 = r1.f5205d0
            int r6 = java.lang.Math.max(r6, r15)
            r12 = 2
            if (r2 != r12) goto L_0x0829
            int r13 = r26.mo5935r()
            if (r13 >= r0) goto L_0x0829
            r1.mo5918N(r0)
            int[] r0 = r1.f5191T
            r11 = 0
            r0[r11] = r12
            r11 = 1
            r18 = 1
        L_0x0829:
            if (r4 != r12) goto L_0x083c
            int r0 = r26.mo5929l()
            if (r0 >= r6) goto L_0x083c
            r1.mo5913I(r6)
            int[] r0 = r1.f5191T
            r6 = 1
            r0[r6] = r12
            r11 = 1
            r18 = 1
        L_0x083c:
            int r0 = r1.f5203c0
            int r6 = r26.mo5935r()
            int r0 = java.lang.Math.max(r0, r6)
            int r6 = r26.mo5935r()
            if (r0 <= r6) goto L_0x085a
            r1.mo5918N(r0)
            int[] r0 = r1.f5191T
            r6 = 1
            r11 = 0
            r0[r11] = r6
            r18 = r6
            r20 = r18
            goto L_0x085d
        L_0x085a:
            r6 = 1
            r20 = r11
        L_0x085d:
            int r0 = r1.f5205d0
            int r11 = r26.mo5929l()
            int r0 = java.lang.Math.max(r0, r11)
            int r11 = r26.mo5929l()
            if (r0 <= r11) goto L_0x0878
            r1.mo5913I(r0)
            int[] r0 = r1.f5191T
            r0[r6] = r6
            r0 = r6
            r18 = r0
            goto L_0x087a
        L_0x0878:
            r0 = r20
        L_0x087a:
            if (r0 != 0) goto L_0x08b6
            int[] r11 = r1.f5191T
            r12 = 0
            r11 = r11[r12]
            r13 = 2
            if (r11 != r13) goto L_0x0898
            if (r3 <= 0) goto L_0x0898
            int r11 = r26.mo5935r()
            if (r11 <= r3) goto L_0x0898
            r1.f5244E0 = r6
            int[] r0 = r1.f5191T
            r0[r12] = r6
            r1.mo5918N(r3)
            r0 = r6
            r18 = r0
        L_0x0898:
            int[] r11 = r1.f5191T
            r11 = r11[r6]
            r12 = 2
            if (r11 != r12) goto L_0x08b7
            if (r5 <= 0) goto L_0x08b7
            int r11 = r26.mo5929l()
            if (r11 <= r5) goto L_0x08b7
            r1.f5245F0 = r6
            int[] r0 = r1.f5191T
            r0[r6] = r6
            r1.mo5913I(r5)
            r0 = 8
            r11 = 1
            r18 = 1
            goto L_0x08ba
        L_0x08b6:
            r12 = 2
        L_0x08b7:
            r11 = r0
            r0 = 8
        L_0x08ba:
            if (r14 <= r0) goto L_0x08be
            r18 = 0
        L_0x08be:
            r0 = r14
            r12 = r18
            r6 = 64
            goto L_0x0671
        L_0x08c5:
            r1.f5270q0 = r7
            if (r11 == 0) goto L_0x08d1
            int[] r0 = r1.f5191T
            r3 = 0
            r0[r3] = r2
            r2 = 1
            r0[r2] = r4
        L_0x08d1:
            q.e r0 = r1.f5257w0
            q.d r0 = r0.f4954l
            r1.mo5909E(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p111s.C1696f.mo5944Q():void");
    }

    /* renamed from: R */
    public void mo5945R(C1695e eVar, int i) {
        if (i == 0) {
            int i2 = this.f5260z0 + 1;
            C1692c[] cVarArr = this.f5242C0;
            if (i2 >= cVarArr.length) {
                this.f5242C0 = (C1692c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
            }
            C1692c[] cVarArr2 = this.f5242C0;
            int i3 = this.f5260z0;
            cVarArr2[i3] = new C1692c(eVar, 0, this.f5256v0);
            this.f5260z0 = i3 + 1;
        } else if (i == 1) {
            int i4 = this.f5240A0 + 1;
            C1692c[] cVarArr3 = this.f5241B0;
            if (i4 >= cVarArr3.length) {
                this.f5241B0 = (C1692c[]) Arrays.copyOf(cVarArr3, cVarArr3.length * 2);
            }
            C1692c[] cVarArr4 = this.f5241B0;
            int i5 = this.f5240A0;
            cVarArr4[i5] = new C1692c(eVar, 1, this.f5256v0);
            this.f5240A0 = i5 + 1;
        }
    }

    /* renamed from: S */
    public boolean mo5946S(C1593e eVar) {
        boolean z;
        boolean a0 = mo5953a0(64);
        mo5893d(eVar, a0);
        int size = this.f5270q0.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            C1695e eVar2 = this.f5270q0.get(i);
            boolean[] zArr = eVar2.f5190S;
            zArr[0] = false;
            zArr[1] = false;
            if (eVar2 instanceof C1690a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i2 = 0; i2 < size; i2++) {
                C1695e eVar3 = this.f5270q0.get(i2);
                if (eVar3 instanceof C1690a) {
                    C1690a aVar = (C1690a) eVar3;
                    for (int i3 = 0; i3 < aVar.f5268r0; i3++) {
                        C1695e eVar4 = aVar.f5267q0[i3];
                        if (aVar.f5131t0 || eVar4.mo5894e()) {
                            int i4 = aVar.f5130s0;
                            if (i4 == 0 || i4 == 1) {
                                eVar4.f5190S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                eVar4.f5190S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        this.f5250K0.clear();
        for (int i5 = 0; i5 < size; i5++) {
            C1695e eVar5 = this.f5270q0.get(i5);
            if (eVar5.mo5922c()) {
                if (eVar5 instanceof C1701k) {
                    this.f5250K0.add(eVar5);
                } else {
                    eVar5.mo5893d(eVar, a0);
                }
            }
        }
        while (this.f5250K0.size() > 0) {
            int size2 = this.f5250K0.size();
            Iterator<C1695e> it = this.f5250K0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1701k kVar = (C1701k) it.next();
                HashSet<C1695e> hashSet = this.f5250K0;
                int i6 = 0;
                while (true) {
                    if (i6 >= kVar.f5268r0) {
                        z = false;
                        continue;
                        break;
                    } else if (hashSet.contains(kVar.f5267q0[i6])) {
                        z = true;
                        continue;
                        break;
                    } else {
                        i6++;
                    }
                }
                if (z) {
                    kVar.mo5893d(eVar, a0);
                    this.f5250K0.remove(kVar);
                    break;
                }
            }
            if (size2 == this.f5250K0.size()) {
                Iterator<C1695e> it2 = this.f5250K0.iterator();
                while (it2.hasNext()) {
                    it2.next().mo5893d(eVar, a0);
                }
                this.f5250K0.clear();
            }
        }
        if (C1593e.f4940p) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                C1695e eVar6 = this.f5270q0.get(i7);
                if (!eVar6.mo5922c()) {
                    hashSet2.add(eVar6);
                }
            }
            mo5921b(this, eVar, hashSet2, mo5930m() == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C1695e eVar7 = (C1695e) it3.next();
                C1700j.m4763a(this, eVar, eVar7);
                eVar7.mo5893d(eVar, a0);
            }
        } else {
            for (int i8 = 0; i8 < size; i8++) {
                C1695e eVar8 = this.f5270q0.get(i8);
                if (eVar8 instanceof C1696f) {
                    int[] iArr = eVar8.f5191T;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        iArr[0] = 1;
                    }
                    if (i10 == 2) {
                        iArr[1] = 1;
                    }
                    eVar8.mo5893d(eVar, a0);
                    if (i9 == 2) {
                        eVar8.mo5914J(i9);
                    }
                    if (i10 == 2) {
                        eVar8.mo5917M(i10);
                    }
                } else {
                    C1700j.m4763a(this, eVar, eVar8);
                    if (!eVar8.mo5922c()) {
                        eVar8.mo5893d(eVar, a0);
                    }
                }
            }
        }
        if (this.f5260z0 > 0) {
            C1691b.m4686a(this, eVar, (ArrayList<C1695e>) null, 0);
        }
        if (this.f5240A0 > 0) {
            C1691b.m4686a(this, eVar, (ArrayList<C1695e>) null, 1);
        }
        return true;
    }

    /* renamed from: T */
    public void mo5947T(C1693d dVar) {
        WeakReference<C1693d> weakReference = this.f5249J0;
        if (weakReference == null || weakReference.get() == null || dVar.mo5898c() > ((C1693d) this.f5249J0.get()).mo5898c()) {
            this.f5249J0 = new WeakReference<>(dVar);
        }
    }

    /* renamed from: U */
    public void mo5948U(C1693d dVar) {
        WeakReference<C1693d> weakReference = this.f5247H0;
        if (weakReference == null || weakReference.get() == null || dVar.mo5898c() > ((C1693d) this.f5247H0.get()).mo5898c()) {
            this.f5247H0 = new WeakReference<>(dVar);
        }
    }

    /* renamed from: V */
    public void mo5949V(C1693d dVar) {
        WeakReference<C1693d> weakReference = this.f5248I0;
        if (weakReference == null || weakReference.get() == null || dVar.mo5898c() > ((C1693d) this.f5248I0.get()).mo5898c()) {
            this.f5248I0 = new WeakReference<>(dVar);
        }
    }

    /* renamed from: W */
    public void mo5950W(C1693d dVar) {
        WeakReference<C1693d> weakReference = this.f5246G0;
        if (weakReference == null || weakReference.get() == null || dVar.mo5898c() > ((C1693d) this.f5246G0.get()).mo5898c()) {
            this.f5246G0 = new WeakReference<>(dVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0129 A[EDGE_INSN: B:77:0x0129->B:62:0x0129 ?: BREAK  , SYNTHETIC] */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5951X(boolean r12, int r13) {
        /*
            r11 = this;
            t.f r0 = r11.f5253s0
            r1 = 1
            r12 = r12 & r1
            s.f r2 = r0.f5353a
            r3 = 0
            int r2 = r2.mo5928k(r3)
            s.f r4 = r0.f5353a
            int r4 = r4.mo5928k(r1)
            s.f r5 = r0.f5353a
            int r5 = r5.mo5936s()
            s.f r6 = r0.f5353a
            int r6 = r6.mo5937t()
            if (r12 == 0) goto L_0x007d
            r7 = 2
            if (r2 == r7) goto L_0x0024
            if (r4 != r7) goto L_0x007d
        L_0x0024:
            java.util.ArrayList<t.q> r8 = r0.f5357e
            java.util.Iterator r8 = r8.iterator()
        L_0x002a:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0041
            java.lang.Object r9 = r8.next()
            t.q r9 = (p117t.C1765q) r9
            int r10 = r9.f5403f
            if (r10 != r13) goto L_0x002a
            boolean r9 = r9.mo6016k()
            if (r9 != 0) goto L_0x002a
            r12 = r3
        L_0x0041:
            if (r13 != 0) goto L_0x005f
            if (r12 == 0) goto L_0x007d
            if (r2 != r7) goto L_0x007d
            s.f r12 = r0.f5353a
            int[] r7 = r12.f5191T
            r7[r3] = r1
            int r7 = r0.mo6023d(r12, r3)
            r12.mo5918N(r7)
            s.f r12 = r0.f5353a
            t.m r7 = r12.f5204d
            t.h r7 = r7.f5402e
            int r12 = r12.mo5935r()
            goto L_0x007a
        L_0x005f:
            if (r12 == 0) goto L_0x007d
            if (r4 != r7) goto L_0x007d
            s.f r12 = r0.f5353a
            int[] r7 = r12.f5191T
            r7[r1] = r1
            int r7 = r0.mo6023d(r12, r1)
            r12.mo5913I(r7)
            s.f r12 = r0.f5353a
            t.o r7 = r12.f5206e
            t.h r7 = r7.f5402e
            int r12 = r12.mo5929l()
        L_0x007a:
            r7.mo6028c(r12)
        L_0x007d:
            s.f r12 = r0.f5353a
            int[] r7 = r12.f5191T
            r8 = 4
            if (r13 != 0) goto L_0x00a2
            r6 = r7[r3]
            if (r6 == r1) goto L_0x008c
            r6 = r7[r3]
            if (r6 != r8) goto L_0x00ab
        L_0x008c:
            int r12 = r12.mo5935r()
            int r12 = r12 + r5
            s.f r6 = r0.f5353a
            t.m r6 = r6.f5204d
            t.g r6 = r6.f5406i
            r6.mo6028c(r12)
            s.f r6 = r0.f5353a
            t.m r6 = r6.f5204d
            t.h r6 = r6.f5402e
            int r12 = r12 - r5
            goto L_0x00c3
        L_0x00a2:
            r5 = r7[r1]
            if (r5 == r1) goto L_0x00ad
            r5 = r7[r1]
            if (r5 != r8) goto L_0x00ab
            goto L_0x00ad
        L_0x00ab:
            r12 = r3
            goto L_0x00c7
        L_0x00ad:
            int r12 = r12.mo5929l()
            int r12 = r12 + r6
            s.f r5 = r0.f5353a
            t.o r5 = r5.f5206e
            t.g r5 = r5.f5406i
            r5.mo6028c(r12)
            s.f r5 = r0.f5353a
            t.o r5 = r5.f5206e
            t.h r5 = r5.f5402e
            int r12 = r12 - r6
            r6 = r5
        L_0x00c3:
            r6.mo6028c(r12)
            r12 = r1
        L_0x00c7:
            r0.mo6026g()
            java.util.ArrayList<t.q> r5 = r0.f5357e
            java.util.Iterator r5 = r5.iterator()
        L_0x00d0:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00f0
            java.lang.Object r6 = r5.next()
            t.q r6 = (p117t.C1765q) r6
            int r7 = r6.f5403f
            if (r7 == r13) goto L_0x00e1
            goto L_0x00d0
        L_0x00e1:
            s.e r7 = r6.f5399b
            s.f r8 = r0.f5353a
            if (r7 != r8) goto L_0x00ec
            boolean r7 = r6.f5404g
            if (r7 != 0) goto L_0x00ec
            goto L_0x00d0
        L_0x00ec:
            r6.mo6013e()
            goto L_0x00d0
        L_0x00f0:
            java.util.ArrayList<t.q> r5 = r0.f5357e
            java.util.Iterator r5 = r5.iterator()
        L_0x00f6:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0129
            java.lang.Object r6 = r5.next()
            t.q r6 = (p117t.C1765q) r6
            int r7 = r6.f5403f
            if (r7 == r13) goto L_0x0107
            goto L_0x00f6
        L_0x0107:
            if (r12 != 0) goto L_0x0110
            s.e r7 = r6.f5399b
            s.f r8 = r0.f5353a
            if (r7 != r8) goto L_0x0110
            goto L_0x00f6
        L_0x0110:
            t.g r7 = r6.f5405h
            boolean r7 = r7.f5370j
            if (r7 != 0) goto L_0x0117
            goto L_0x0128
        L_0x0117:
            t.g r7 = r6.f5406i
            boolean r7 = r7.f5370j
            if (r7 != 0) goto L_0x011e
            goto L_0x0128
        L_0x011e:
            boolean r7 = r6 instanceof p117t.C1749c
            if (r7 != 0) goto L_0x00f6
            t.h r6 = r6.f5402e
            boolean r6 = r6.f5370j
            if (r6 != 0) goto L_0x00f6
        L_0x0128:
            r1 = r3
        L_0x0129:
            s.f r12 = r0.f5353a
            r12.mo5914J(r2)
            s.f r12 = r0.f5353a
            r12.mo5917M(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p111s.C1696f.mo5951X(boolean, int):boolean");
    }

    /* renamed from: Y */
    public void mo5952Y() {
        this.f5253s0.f5354b = true;
    }

    /* renamed from: a0 */
    public boolean mo5953a0(int i) {
        return (this.f5243D0 & i) == i;
    }

    /* renamed from: b0 */
    public void mo5954b0(int i) {
        this.f5243D0 = i;
        C1593e.f4940p = mo5953a0(512);
    }
}
