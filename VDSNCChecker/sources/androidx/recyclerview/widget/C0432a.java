package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0470q;
import java.util.ArrayList;
import java.util.List;
import p099q.C1595f;

/* renamed from: androidx.recyclerview.widget.a */
public class C0432a implements C0470q.C0471a {

    /* renamed from: a */
    public C1595f f2062a = new C1595f(30, 1);

    /* renamed from: b */
    public final ArrayList<C0434b> f2063b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<C0434b> f2064c = new ArrayList<>();

    /* renamed from: d */
    public final C0433a f2065d;

    /* renamed from: e */
    public final C0470q f2066e;

    /* renamed from: androidx.recyclerview.widget.a$a */
    public interface C0433a {
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    public static class C0434b {

        /* renamed from: a */
        public int f2067a;

        /* renamed from: b */
        public int f2068b;

        /* renamed from: c */
        public Object f2069c;

        /* renamed from: d */
        public int f2070d;

        public C0434b(int i, int i2, int i3, Object obj) {
            this.f2067a = i;
            this.f2068b = i2;
            this.f2070d = i3;
            this.f2069c = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0434b.class != obj.getClass()) {
                return false;
            }
            C0434b bVar = (C0434b) obj;
            int i = this.f2067a;
            if (i != bVar.f2067a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f2070d - this.f2068b) == 1 && this.f2070d == bVar.f2068b && this.f2068b == bVar.f2070d) {
                return true;
            }
            if (this.f2070d != bVar.f2070d || this.f2068b != bVar.f2068b) {
                return false;
            }
            Object obj2 = this.f2069c;
            Object obj3 = bVar.f2069c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f2067a * 31) + this.f2068b) * 31) + this.f2070d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.f2067a;
            sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.f2068b);
            sb.append("c:");
            sb.append(this.f2070d);
            sb.append(",p:");
            sb.append(this.f2069c);
            sb.append("]");
            return sb.toString();
        }
    }

    public C0432a(C0433a aVar) {
        this.f2065d = aVar;
        this.f2066e = new C0470q(this);
    }

    /* renamed from: a */
    public final boolean mo2321a(int i) {
        int size = this.f2064c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0434b bVar = this.f2064c.get(i2);
            int i3 = bVar.f2067a;
            if (i3 == 8) {
                if (mo2326f(bVar.f2070d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f2068b;
                int i5 = bVar.f2070d + i4;
                while (i4 < i5) {
                    if (mo2326f(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo2322b() {
        int size = this.f2064c.size();
        for (int i = 0; i < size; i++) {
            ((C0478x) this.f2065d).mo2438a(this.f2064c.get(i));
        }
        mo2332l(this.f2064c);
    }

    /* renamed from: c */
    public void mo2323c() {
        mo2322b();
        int size = this.f2063b.size();
        for (int i = 0; i < size; i++) {
            C0434b bVar = this.f2063b.get(i);
            int i2 = bVar.f2067a;
            if (i2 == 1) {
                ((C0478x) this.f2065d).mo2438a(bVar);
                ((C0478x) this.f2065d).mo2441d(bVar.f2068b, bVar.f2070d);
            } else if (i2 == 2) {
                ((C0478x) this.f2065d).mo2438a(bVar);
                C0433a aVar = this.f2065d;
                int i3 = bVar.f2068b;
                int i4 = bVar.f2070d;
                C0478x xVar = (C0478x) aVar;
                xVar.f2221a.mo1999S(i3, i4, true);
                RecyclerView recyclerView = xVar.f2221a;
                recyclerView.f1872k0 = true;
                recyclerView.f1866h0.f1971c += i4;
            } else if (i2 == 4) {
                ((C0478x) this.f2065d).mo2438a(bVar);
                ((C0478x) this.f2065d).mo2440c(bVar.f2068b, bVar.f2070d, bVar.f2069c);
            } else if (i2 == 8) {
                ((C0478x) this.f2065d).mo2438a(bVar);
                ((C0478x) this.f2065d).mo2442e(bVar.f2068b, bVar.f2070d);
            }
        }
        mo2332l(this.f2063b);
    }

    /* renamed from: d */
    public final void mo2324d(C0434b bVar) {
        int i;
        int i2 = bVar.f2067a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m = mo2333m(bVar.f2068b, i2);
        int i3 = bVar.f2068b;
        int i4 = bVar.f2067a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f2070d; i6++) {
            int m2 = mo2333m((i * i6) + bVar.f2068b, bVar.f2067a);
            int i7 = bVar.f2067a;
            if (i7 == 2 ? m2 == m : i7 == 4 && m2 == m + 1) {
                i5++;
            } else {
                C0434b h = mo2328h(i7, m, i5, bVar.f2069c);
                mo2325e(h, i3);
                h.f2069c = null;
                this.f2062a.mo4464c(h);
                if (bVar.f2067a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                m = m2;
            }
        }
        Object obj = bVar.f2069c;
        bVar.f2069c = null;
        this.f2062a.mo4464c(bVar);
        if (i5 > 0) {
            C0434b h2 = mo2328h(bVar.f2067a, m, i5, obj);
            mo2325e(h2, i3);
            h2.f2069c = null;
            this.f2062a.mo4464c(h2);
        }
    }

    /* renamed from: e */
    public void mo2325e(C0434b bVar, int i) {
        ((C0478x) this.f2065d).mo2438a(bVar);
        int i2 = bVar.f2067a;
        if (i2 == 2) {
            C0433a aVar = this.f2065d;
            int i3 = bVar.f2070d;
            C0478x xVar = (C0478x) aVar;
            xVar.f2221a.mo1999S(i, i3, true);
            RecyclerView recyclerView = xVar.f2221a;
            recyclerView.f1872k0 = true;
            recyclerView.f1866h0.f1971c += i3;
        } else if (i2 == 4) {
            ((C0478x) this.f2065d).mo2440c(i, bVar.f2070d, bVar.f2069c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* renamed from: f */
    public int mo2326f(int i, int i2) {
        int size = this.f2064c.size();
        while (i2 < size) {
            C0434b bVar = this.f2064c.get(i2);
            int i3 = bVar.f2067a;
            if (i3 == 8) {
                int i4 = bVar.f2068b;
                if (i4 == i) {
                    i = bVar.f2070d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f2070d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f2068b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f2070d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f2070d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: g */
    public boolean mo2327g() {
        return this.f2063b.size() > 0;
    }

    /* renamed from: h */
    public C0434b mo2328h(int i, int i2, int i3, Object obj) {
        C0434b bVar = (C0434b) this.f2062a.mo4463a();
        if (bVar == null) {
            return new C0434b(i, i2, i3, obj);
        }
        bVar.f2067a = i;
        bVar.f2068b = i2;
        bVar.f2070d = i3;
        bVar.f2069c = obj;
        return bVar;
    }

    /* renamed from: i */
    public final void mo2329i(C0434b bVar) {
        this.f2064c.add(bVar);
        int i = bVar.f2067a;
        if (i == 1) {
            ((C0478x) this.f2065d).mo2441d(bVar.f2068b, bVar.f2070d);
        } else if (i == 2) {
            C0433a aVar = this.f2065d;
            C0478x xVar = (C0478x) aVar;
            xVar.f2221a.mo1999S(bVar.f2068b, bVar.f2070d, false);
            xVar.f2221a.f1872k0 = true;
        } else if (i == 4) {
            ((C0478x) this.f2065d).mo2440c(bVar.f2068b, bVar.f2070d, bVar.f2069c);
        } else if (i == 8) {
            ((C0478x) this.f2065d).mo2442e(bVar.f2068b, bVar.f2070d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0164, code lost:
        if (r5 > r12.f2068b) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x018e, code lost:
        if (r5 >= r12.f2068b) goto L_0x0190;
     */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0009 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013b  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2330j() {
        /*
            r16 = this;
            r0 = r16
            androidx.recyclerview.widget.q r1 = r0.f2066e
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r2 = r0.f2063b
            java.util.Objects.requireNonNull(r1)
        L_0x0009:
            int r3 = r2.size()
            r4 = 1
            int r3 = r3 - r4
            r6 = 0
        L_0x0010:
            r7 = 8
            r8 = -1
            if (r3 < 0) goto L_0x0026
            java.lang.Object r9 = r2.get(r3)
            androidx.recyclerview.widget.a$b r9 = (androidx.recyclerview.widget.C0432a.C0434b) r9
            int r9 = r9.f2067a
            if (r9 != r7) goto L_0x0022
            if (r6 == 0) goto L_0x0023
            goto L_0x0027
        L_0x0022:
            r6 = r4
        L_0x0023:
            int r3 = r3 + -1
            goto L_0x0010
        L_0x0026:
            r3 = r8
        L_0x0027:
            r6 = 4
            r9 = 2
            r10 = 0
            if (r3 == r8) goto L_0x01d6
            int r7 = r3 + 1
            java.lang.Object r11 = r2.get(r3)
            androidx.recyclerview.widget.a$b r11 = (androidx.recyclerview.widget.C0432a.C0434b) r11
            java.lang.Object r12 = r2.get(r7)
            androidx.recyclerview.widget.a$b r12 = (androidx.recyclerview.widget.C0432a.C0434b) r12
            int r13 = r12.f2067a
            if (r13 == r4) goto L_0x01ac
            if (r13 == r9) goto L_0x00b1
            if (r13 == r6) goto L_0x0043
            goto L_0x0009
        L_0x0043:
            int r5 = r11.f2070d
            int r8 = r12.f2068b
            if (r5 >= r8) goto L_0x004e
            int r8 = r8 + -1
            r12.f2068b = r8
            goto L_0x0064
        L_0x004e:
            int r9 = r12.f2070d
            int r8 = r8 + r9
            if (r5 >= r8) goto L_0x0064
            int r9 = r9 + -1
            r12.f2070d = r9
            androidx.recyclerview.widget.q$a r5 = r1.f2213a
            int r8 = r11.f2068b
            java.lang.Object r9 = r12.f2069c
            androidx.recyclerview.widget.a r5 = (androidx.recyclerview.widget.C0432a) r5
            androidx.recyclerview.widget.a$b r4 = r5.mo2328h(r6, r8, r4, r9)
            goto L_0x0065
        L_0x0064:
            r4 = r10
        L_0x0065:
            int r5 = r11.f2068b
            int r8 = r12.f2068b
            if (r5 > r8) goto L_0x0070
            int r8 = r8 + 1
            r12.f2068b = r8
            goto L_0x0088
        L_0x0070:
            int r9 = r12.f2070d
            int r8 = r8 + r9
            if (r5 >= r8) goto L_0x0088
            int r8 = r8 - r5
            androidx.recyclerview.widget.q$a r9 = r1.f2213a
            int r5 = r5 + 1
            java.lang.Object r13 = r12.f2069c
            androidx.recyclerview.widget.a r9 = (androidx.recyclerview.widget.C0432a) r9
            androidx.recyclerview.widget.a$b r5 = r9.mo2328h(r6, r5, r8, r13)
            int r6 = r12.f2070d
            int r6 = r6 - r8
            r12.f2070d = r6
            goto L_0x0089
        L_0x0088:
            r5 = r10
        L_0x0089:
            r2.set(r7, r11)
            int r6 = r12.f2070d
            if (r6 <= 0) goto L_0x0094
            r2.set(r3, r12)
            goto L_0x00a5
        L_0x0094:
            r2.remove(r3)
            androidx.recyclerview.widget.q$a r6 = r1.f2213a
            androidx.recyclerview.widget.a r6 = (androidx.recyclerview.widget.C0432a) r6
            java.util.Objects.requireNonNull(r6)
            r12.f2069c = r10
            q.f r6 = r6.f2062a
            r6.mo4464c(r12)
        L_0x00a5:
            if (r4 == 0) goto L_0x00aa
            r2.add(r3, r4)
        L_0x00aa:
            if (r5 == 0) goto L_0x0009
            r2.add(r3, r5)
            goto L_0x0009
        L_0x00b1:
            int r6 = r11.f2068b
            int r8 = r11.f2070d
            int r13 = r12.f2068b
            if (r6 >= r8) goto L_0x00c6
            if (r13 != r6) goto L_0x00c4
            int r14 = r12.f2070d
            int r6 = r8 - r6
            if (r14 != r6) goto L_0x00c4
            r5 = r4
            r6 = 0
            goto L_0x00d4
        L_0x00c4:
            r5 = 0
            goto L_0x00d0
        L_0x00c6:
            int r14 = r8 + 1
            if (r13 != r14) goto L_0x00d2
            int r14 = r12.f2070d
            int r6 = r6 - r8
            if (r14 != r6) goto L_0x00d2
            r5 = r4
        L_0x00d0:
            r6 = r5
            goto L_0x00d4
        L_0x00d2:
            r6 = r4
            r5 = 0
        L_0x00d4:
            if (r8 >= r13) goto L_0x00db
            int r13 = r13 + -1
            r12.f2068b = r13
            goto L_0x00ff
        L_0x00db:
            int r14 = r12.f2070d
            int r13 = r13 + r14
            if (r8 >= r13) goto L_0x00ff
            int r14 = r14 + -1
            r12.f2070d = r14
            r11.f2067a = r9
            r11.f2070d = r4
            int r3 = r12.f2070d
            if (r3 != 0) goto L_0x0009
            r2.remove(r7)
            androidx.recyclerview.widget.q$a r3 = r1.f2213a
            androidx.recyclerview.widget.a r3 = (androidx.recyclerview.widget.C0432a) r3
            java.util.Objects.requireNonNull(r3)
            r12.f2069c = r10
            q.f r3 = r3.f2062a
            r3.mo4464c(r12)
            goto L_0x0009
        L_0x00ff:
            int r4 = r11.f2068b
            int r8 = r12.f2068b
            if (r4 > r8) goto L_0x010a
            int r8 = r8 + 1
            r12.f2068b = r8
            goto L_0x0122
        L_0x010a:
            int r13 = r12.f2070d
            int r8 = r8 + r13
            if (r4 >= r8) goto L_0x0122
            int r8 = r8 - r4
            androidx.recyclerview.widget.q$a r13 = r1.f2213a
            int r4 = r4 + 1
            androidx.recyclerview.widget.a r13 = (androidx.recyclerview.widget.C0432a) r13
            androidx.recyclerview.widget.a$b r4 = r13.mo2328h(r9, r4, r8, r10)
            int r8 = r11.f2068b
            int r9 = r12.f2068b
            int r8 = r8 - r9
            r12.f2070d = r8
            goto L_0x0123
        L_0x0122:
            r4 = r10
        L_0x0123:
            if (r5 == 0) goto L_0x013b
            r2.set(r3, r12)
            r2.remove(r7)
            androidx.recyclerview.widget.q$a r3 = r1.f2213a
            androidx.recyclerview.widget.a r3 = (androidx.recyclerview.widget.C0432a) r3
            java.util.Objects.requireNonNull(r3)
            r11.f2069c = r10
            q.f r3 = r3.f2062a
            r3.mo4464c(r11)
            goto L_0x0009
        L_0x013b:
            if (r6 == 0) goto L_0x0167
            if (r4 == 0) goto L_0x0155
            int r5 = r11.f2068b
            int r6 = r4.f2068b
            if (r5 <= r6) goto L_0x014a
            int r6 = r4.f2070d
            int r5 = r5 - r6
            r11.f2068b = r5
        L_0x014a:
            int r5 = r11.f2070d
            int r6 = r4.f2068b
            if (r5 <= r6) goto L_0x0155
            int r6 = r4.f2070d
            int r5 = r5 - r6
            r11.f2070d = r5
        L_0x0155:
            int r5 = r11.f2068b
            int r6 = r12.f2068b
            if (r5 <= r6) goto L_0x0160
            int r6 = r12.f2070d
            int r5 = r5 - r6
            r11.f2068b = r5
        L_0x0160:
            int r5 = r11.f2070d
            int r6 = r12.f2068b
            if (r5 <= r6) goto L_0x0195
            goto L_0x0190
        L_0x0167:
            if (r4 == 0) goto L_0x017f
            int r5 = r11.f2068b
            int r6 = r4.f2068b
            if (r5 < r6) goto L_0x0174
            int r6 = r4.f2070d
            int r5 = r5 - r6
            r11.f2068b = r5
        L_0x0174:
            int r5 = r11.f2070d
            int r6 = r4.f2068b
            if (r5 < r6) goto L_0x017f
            int r6 = r4.f2070d
            int r5 = r5 - r6
            r11.f2070d = r5
        L_0x017f:
            int r5 = r11.f2068b
            int r6 = r12.f2068b
            if (r5 < r6) goto L_0x018a
            int r6 = r12.f2070d
            int r5 = r5 - r6
            r11.f2068b = r5
        L_0x018a:
            int r5 = r11.f2070d
            int r6 = r12.f2068b
            if (r5 < r6) goto L_0x0195
        L_0x0190:
            int r6 = r12.f2070d
            int r5 = r5 - r6
            r11.f2070d = r5
        L_0x0195:
            r2.set(r3, r12)
            int r5 = r11.f2068b
            int r6 = r11.f2070d
            if (r5 == r6) goto L_0x01a2
            r2.set(r7, r11)
            goto L_0x01a5
        L_0x01a2:
            r2.remove(r7)
        L_0x01a5:
            if (r4 == 0) goto L_0x0009
            r2.add(r3, r4)
            goto L_0x0009
        L_0x01ac:
            int r4 = r11.f2070d
            int r6 = r12.f2068b
            if (r4 >= r6) goto L_0x01b4
            r5 = r8
            goto L_0x01b5
        L_0x01b4:
            r5 = 0
        L_0x01b5:
            int r8 = r11.f2068b
            if (r8 >= r6) goto L_0x01bb
            int r5 = r5 + 1
        L_0x01bb:
            if (r6 > r8) goto L_0x01c2
            int r6 = r12.f2070d
            int r8 = r8 + r6
            r11.f2068b = r8
        L_0x01c2:
            int r6 = r12.f2068b
            if (r6 > r4) goto L_0x01cb
            int r8 = r12.f2070d
            int r4 = r4 + r8
            r11.f2070d = r4
        L_0x01cb:
            int r6 = r6 + r5
            r12.f2068b = r6
            r2.set(r3, r12)
            r2.set(r7, r11)
            goto L_0x0009
        L_0x01d6:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f2063b
            int r1 = r1.size()
            r2 = 0
        L_0x01dd:
            if (r2 >= r1) goto L_0x02b2
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f2063b
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.a$b r3 = (androidx.recyclerview.widget.C0432a.C0434b) r3
            int r11 = r3.f2067a
            if (r11 == r4) goto L_0x02ab
            if (r11 == r9) goto L_0x0251
            if (r11 == r6) goto L_0x01f8
            if (r11 == r7) goto L_0x01f3
            goto L_0x02ae
        L_0x01f3:
            r0.mo2329i(r3)
            goto L_0x02ae
        L_0x01f8:
            int r11 = r3.f2068b
            int r12 = r3.f2070d
            int r12 = r12 + r11
            r15 = r8
            r13 = r11
            r14 = 0
        L_0x0200:
            if (r11 >= r12) goto L_0x0234
            androidx.recyclerview.widget.a$a r5 = r0.f2065d
            androidx.recyclerview.widget.x r5 = (androidx.recyclerview.widget.C0478x) r5
            androidx.recyclerview.widget.RecyclerView$z r5 = r5.mo2439b(r11)
            if (r5 != 0) goto L_0x0222
            boolean r5 = r0.mo2321a(r11)
            if (r5 == 0) goto L_0x0213
            goto L_0x0222
        L_0x0213:
            if (r15 != r4) goto L_0x0220
            java.lang.Object r5 = r3.f2069c
            androidx.recyclerview.widget.a$b r5 = r0.mo2328h(r6, r13, r14, r5)
            r0.mo2329i(r5)
            r13 = r11
            r14 = 0
        L_0x0220:
            r15 = 0
            goto L_0x0230
        L_0x0222:
            if (r15 != 0) goto L_0x022f
            java.lang.Object r5 = r3.f2069c
            androidx.recyclerview.widget.a$b r5 = r0.mo2328h(r6, r13, r14, r5)
            r0.mo2324d(r5)
            r13 = r11
            r14 = 0
        L_0x022f:
            r15 = r4
        L_0x0230:
            int r14 = r14 + r4
            int r11 = r11 + 1
            goto L_0x0200
        L_0x0234:
            int r5 = r3.f2070d
            if (r14 == r5) goto L_0x0245
            java.lang.Object r5 = r3.f2069c
            r3.f2069c = r10
            q.f r11 = r0.f2062a
            r11.mo4464c(r3)
            androidx.recyclerview.widget.a$b r3 = r0.mo2328h(r6, r13, r14, r5)
        L_0x0245:
            if (r15 != 0) goto L_0x024c
            r0.mo2324d(r3)
            goto L_0x02ae
        L_0x024c:
            r0.mo2329i(r3)
            goto L_0x02ae
        L_0x0251:
            int r5 = r3.f2068b
            int r11 = r3.f2070d
            int r11 = r11 + r5
            r12 = r5
            r14 = r8
            r13 = 0
        L_0x0259:
            if (r12 >= r11) goto L_0x0292
            androidx.recyclerview.widget.a$a r15 = r0.f2065d
            androidx.recyclerview.widget.x r15 = (androidx.recyclerview.widget.C0478x) r15
            androidx.recyclerview.widget.RecyclerView$z r15 = r15.mo2439b(r12)
            if (r15 != 0) goto L_0x027a
            boolean r15 = r0.mo2321a(r12)
            if (r15 == 0) goto L_0x026c
            goto L_0x027a
        L_0x026c:
            if (r14 != r4) goto L_0x0277
            androidx.recyclerview.widget.a$b r14 = r0.mo2328h(r9, r5, r13, r10)
            r0.mo2329i(r14)
            r14 = r4
            goto L_0x0278
        L_0x0277:
            r14 = 0
        L_0x0278:
            r15 = 0
            goto L_0x0287
        L_0x027a:
            if (r14 != 0) goto L_0x0285
            androidx.recyclerview.widget.a$b r14 = r0.mo2328h(r9, r5, r13, r10)
            r0.mo2324d(r14)
            r14 = r4
            goto L_0x0286
        L_0x0285:
            r14 = 0
        L_0x0286:
            r15 = r4
        L_0x0287:
            if (r14 == 0) goto L_0x028d
            int r12 = r12 - r13
            int r11 = r11 - r13
            r13 = r4
            goto L_0x028f
        L_0x028d:
            int r13 = r13 + 1
        L_0x028f:
            int r12 = r12 + r4
            r14 = r15
            goto L_0x0259
        L_0x0292:
            int r11 = r3.f2070d
            if (r13 == r11) goto L_0x02a1
            r3.f2069c = r10
            q.f r11 = r0.f2062a
            r11.mo4464c(r3)
            androidx.recyclerview.widget.a$b r3 = r0.mo2328h(r9, r5, r13, r10)
        L_0x02a1:
            if (r14 != 0) goto L_0x02a7
            r0.mo2324d(r3)
            goto L_0x02ae
        L_0x02a7:
            r0.mo2329i(r3)
            goto L_0x02ae
        L_0x02ab:
            r0.mo2329i(r3)
        L_0x02ae:
            int r2 = r2 + 1
            goto L_0x01dd
        L_0x02b2:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f2063b
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0432a.mo2330j():void");
    }

    /* renamed from: k */
    public void mo2331k(C0434b bVar) {
        bVar.f2069c = null;
        this.f2062a.mo4464c(bVar);
    }

    /* renamed from: l */
    public void mo2332l(List<C0434b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo2331k(list.get(i));
        }
        list.clear();
    }

    /* renamed from: m */
    public final int mo2333m(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        for (int size = this.f2064c.size() - 1; size >= 0; size--) {
            C0434b bVar = this.f2064c.get(size);
            int i9 = bVar.f2067a;
            if (i9 == 8) {
                int i10 = bVar.f2068b;
                int i11 = bVar.f2070d;
                if (i10 < i11) {
                    i5 = i10;
                    i4 = i11;
                } else {
                    i4 = i10;
                    i5 = i11;
                }
                if (i < i5 || i > i4) {
                    if (i < i10) {
                        if (i2 == 1) {
                            bVar.f2068b = i10 + 1;
                            i6 = i11 + 1;
                        } else if (i2 == 2) {
                            bVar.f2068b = i10 - 1;
                            i6 = i11 - 1;
                        }
                        bVar.f2070d = i6;
                    }
                } else if (i5 == i10) {
                    if (i2 == 1) {
                        i8 = i11 + 1;
                    } else {
                        if (i2 == 2) {
                            i8 = i11 - 1;
                        }
                        i++;
                    }
                    bVar.f2070d = i8;
                    i++;
                } else {
                    if (i2 == 1) {
                        i7 = i10 + 1;
                    } else {
                        if (i2 == 2) {
                            i7 = i10 - 1;
                        }
                        i--;
                    }
                    bVar.f2068b = i7;
                    i--;
                }
            } else {
                int i12 = bVar.f2068b;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    bVar.f2068b = i3;
                } else if (i9 == 1) {
                    i -= bVar.f2070d;
                } else if (i9 == 2) {
                    i += bVar.f2070d;
                }
            }
        }
        for (int size2 = this.f2064c.size() - 1; size2 >= 0; size2--) {
            C0434b bVar2 = this.f2064c.get(size2);
            if (bVar2.f2067a == 8) {
                int i13 = bVar2.f2070d;
                if (i13 != bVar2.f2068b && i13 >= 0) {
                }
            } else if (bVar2.f2070d > 0) {
            }
            this.f2064c.remove(size2);
            bVar2.f2069c = null;
            this.f2062a.mo4464c(bVar2);
        }
        return i;
    }
}
