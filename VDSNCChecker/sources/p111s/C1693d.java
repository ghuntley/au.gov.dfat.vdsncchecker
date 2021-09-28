package p111s;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p099q.C1601j;
import p117t.C1757j;
import p117t.C1763p;

/* renamed from: s.d */
public class C1693d {

    /* renamed from: a */
    public HashSet<C1693d> f5154a = null;

    /* renamed from: b */
    public int f5155b;

    /* renamed from: c */
    public boolean f5156c;

    /* renamed from: d */
    public final C1695e f5157d;

    /* renamed from: e */
    public final C1694a f5158e;

    /* renamed from: f */
    public C1693d f5159f;

    /* renamed from: g */
    public int f5160g = 0;

    /* renamed from: h */
    public int f5161h = Integer.MIN_VALUE;

    /* renamed from: i */
    public C1601j f5162i;

    /* renamed from: s.d$a */
    public enum C1694a {
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C1693d(C1695e eVar, C1694a aVar) {
        this.f5157d = eVar;
        this.f5158e = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r8.f5157d.f5175D == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r5 != r12) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r5 != r1) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        if (r5 != r12) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006f, code lost:
        if (r5 != r2) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0076 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5896a(p111s.C1693d r9, int r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = 1
            if (r9 != 0) goto L_0x0007
            r8.mo5903h()
            return r0
        L_0x0007:
            if (r12 != 0) goto L_0x0077
            s.d$a r12 = p111s.C1693d.C1694a.CENTER_Y
            s.d$a r1 = p111s.C1693d.C1694a.RIGHT
            s.d$a r2 = p111s.C1693d.C1694a.CENTER_X
            s.d$a r3 = p111s.C1693d.C1694a.LEFT
            s.d$a r4 = p111s.C1693d.C1694a.BASELINE
            s.d$a r5 = r9.f5158e
            s.d$a r6 = r8.f5158e
            r7 = 0
            if (r5 != r6) goto L_0x0029
            if (r6 != r4) goto L_0x0071
            s.e r12 = r9.f5157d
            boolean r12 = r12.f5175D
            if (r12 == 0) goto L_0x0073
            s.e r12 = r8.f5157d
            boolean r12 = r12.f5175D
            if (r12 != 0) goto L_0x0071
            goto L_0x0073
        L_0x0029:
            int r6 = r6.ordinal()
            switch(r6) {
                case 0: goto L_0x0073;
                case 1: goto L_0x005f;
                case 2: goto L_0x0048;
                case 3: goto L_0x005f;
                case 4: goto L_0x0048;
                case 5: goto L_0x0043;
                case 6: goto L_0x003c;
                case 7: goto L_0x0073;
                case 8: goto L_0x0073;
                default: goto L_0x0030;
            }
        L_0x0030:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            s.d$a r10 = r8.f5158e
            java.lang.String r10 = r10.name()
            r9.<init>(r10)
            throw r9
        L_0x003c:
            if (r5 == r4) goto L_0x0073
            if (r5 == r2) goto L_0x0073
            if (r5 == r12) goto L_0x0073
            goto L_0x0071
        L_0x0043:
            if (r5 == r3) goto L_0x0073
            if (r5 != r1) goto L_0x0071
            goto L_0x0073
        L_0x0048:
            s.d$a r1 = p111s.C1693d.C1694a.TOP
            if (r5 == r1) goto L_0x0053
            s.d$a r1 = p111s.C1693d.C1694a.BOTTOM
            if (r5 != r1) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            r1 = r7
            goto L_0x0054
        L_0x0053:
            r1 = r0
        L_0x0054:
            s.e r2 = r9.f5157d
            boolean r2 = r2 instanceof p111s.C1697g
            if (r2 == 0) goto L_0x0074
            if (r1 != 0) goto L_0x0071
            if (r5 != r12) goto L_0x0073
            goto L_0x0071
        L_0x005f:
            if (r5 == r3) goto L_0x0066
            if (r5 != r1) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r1 = r7
            goto L_0x0067
        L_0x0066:
            r1 = r0
        L_0x0067:
            s.e r12 = r9.f5157d
            boolean r12 = r12 instanceof p111s.C1697g
            if (r12 == 0) goto L_0x0074
            if (r1 != 0) goto L_0x0071
            if (r5 != r2) goto L_0x0073
        L_0x0071:
            r1 = r0
            goto L_0x0074
        L_0x0073:
            r1 = r7
        L_0x0074:
            if (r1 != 0) goto L_0x0077
            return r7
        L_0x0077:
            r8.f5159f = r9
            java.util.HashSet<s.d> r12 = r9.f5154a
            if (r12 != 0) goto L_0x0084
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            r9.f5154a = r12
        L_0x0084:
            s.d r9 = r8.f5159f
            java.util.HashSet<s.d> r9 = r9.f5154a
            if (r9 == 0) goto L_0x008d
            r9.add(r8)
        L_0x008d:
            r8.f5160g = r10
            r8.f5161h = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p111s.C1693d.mo5896a(s.d, int, int, boolean):boolean");
    }

    /* renamed from: b */
    public void mo5897b(int i, ArrayList<C1763p> arrayList, C1763p pVar) {
        HashSet<C1693d> hashSet = this.f5154a;
        if (hashSet != null) {
            Iterator<C1693d> it = hashSet.iterator();
            while (it.hasNext()) {
                C1757j.m4894a(it.next().f5157d, i, arrayList, pVar);
            }
        }
    }

    /* renamed from: c */
    public int mo5898c() {
        if (!this.f5156c) {
            return 0;
        }
        return this.f5155b;
    }

    /* renamed from: d */
    public int mo5899d() {
        C1693d dVar;
        if (this.f5157d.f5213h0 == 8) {
            return 0;
        }
        int i = this.f5161h;
        if (i == Integer.MIN_VALUE || (dVar = this.f5159f) == null || dVar.f5157d.f5213h0 != 8) {
            return this.f5160g;
        }
        return i;
    }

    /* renamed from: e */
    public boolean mo5900e() {
        C1693d dVar;
        HashSet<C1693d> hashSet = this.f5154a;
        if (hashSet == null) {
            return false;
        }
        Iterator<C1693d> it = hashSet.iterator();
        while (it.hasNext()) {
            C1693d next = it.next();
            switch (next.f5158e.ordinal()) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                    dVar = null;
                    break;
                case 1:
                    dVar = next.f5157d.f5182K;
                    break;
                case 2:
                    dVar = next.f5157d.f5183L;
                    break;
                case 3:
                    dVar = next.f5157d.f5180I;
                    break;
                case 4:
                    dVar = next.f5157d.f5181J;
                    break;
                default:
                    throw new AssertionError(next.f5158e.name());
            }
            if (dVar.mo5902g()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo5901f() {
        HashSet<C1693d> hashSet = this.f5154a;
        return hashSet != null && hashSet.size() > 0;
    }

    /* renamed from: g */
    public boolean mo5902g() {
        return this.f5159f != null;
    }

    /* renamed from: h */
    public void mo5903h() {
        HashSet<C1693d> hashSet;
        C1693d dVar = this.f5159f;
        if (!(dVar == null || (hashSet = dVar.f5154a) == null)) {
            hashSet.remove(this);
            if (this.f5159f.f5154a.size() == 0) {
                this.f5159f.f5154a = null;
            }
        }
        this.f5154a = null;
        this.f5159f = null;
        this.f5160g = 0;
        this.f5161h = Integer.MIN_VALUE;
        this.f5156c = false;
        this.f5155b = 0;
    }

    /* renamed from: i */
    public void mo5904i() {
        C1601j jVar = this.f5162i;
        if (jVar == null) {
            this.f5162i = new C1601j(1);
        } else {
            jVar.mo5744c();
        }
    }

    /* renamed from: j */
    public void mo5905j(int i) {
        this.f5155b = i;
        this.f5156c = true;
    }

    public String toString() {
        return this.f5157d.f5215i0 + ":" + this.f5158e.toString();
    }
}
