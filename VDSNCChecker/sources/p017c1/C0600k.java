package p017c1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p093p.C1545a;

/* renamed from: c1.k */
public class C0600k {

    /* renamed from: a */
    public static C0592g f2444a = new C0569a();

    /* renamed from: b */
    public static ThreadLocal<WeakReference<C1545a<ViewGroup, ArrayList<C0592g>>>> f2445b = new ThreadLocal<>();

    /* renamed from: c */
    public static ArrayList<ViewGroup> f2446c = new ArrayList<>();

    /* renamed from: c1.k$a */
    public static class C0601a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: e */
        public C0592g f2447e;

        /* renamed from: f */
        public ViewGroup f2448f;

        /* renamed from: c1.k$a$a */
        public class C0602a extends C0599j {

            /* renamed from: a */
            public final /* synthetic */ C1545a f2449a;

            public C0602a(C1545a aVar) {
                this.f2449a = aVar;
            }

            /* renamed from: e */
            public void mo2739e(C0592g gVar) {
                ((ArrayList) this.f2449a.get(C0601a.this.f2448f)).remove(gVar);
                gVar.mo2762A(this);
            }
        }

        public C0601a(C0592g gVar, ViewGroup viewGroup) {
            this.f2447e = gVar;
            this.f2448f = viewGroup;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: c1.n} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:101:0x022a  */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x0256  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x0204 A[EDGE_INSN: B:141:0x0204->B:91:0x0204 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x00a3  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x0209  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onPreDraw() {
            /*
                r18 = this;
                r0 = r18
                android.view.ViewGroup r1 = r0.f2448f
                android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                r1.removeOnPreDrawListener(r0)
                android.view.ViewGroup r1 = r0.f2448f
                r1.removeOnAttachStateChangeListener(r0)
                java.util.ArrayList<android.view.ViewGroup> r1 = p017c1.C0600k.f2446c
                android.view.ViewGroup r2 = r0.f2448f
                boolean r1 = r1.remove(r2)
                r2 = 1
                if (r1 != 0) goto L_0x001c
                return r2
            L_0x001c:
                p.a r1 = p017c1.C0600k.m1951a()
                android.view.ViewGroup r3 = r0.f2448f
                java.lang.Object r3 = r1.get(r3)
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                r4 = 0
                if (r3 != 0) goto L_0x0036
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                android.view.ViewGroup r5 = r0.f2448f
                r1.put(r5, r3)
                goto L_0x0042
            L_0x0036:
                int r5 = r3.size()
                if (r5 <= 0) goto L_0x0042
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r3)
                goto L_0x0043
            L_0x0042:
                r5 = r4
            L_0x0043:
                c1.g r6 = r0.f2447e
                r3.add(r6)
                c1.g r3 = r0.f2447e
                c1.k$a$a r6 = new c1.k$a$a
                r6.<init>(r1)
                r3.mo2774b(r6)
                c1.g r1 = r0.f2447e
                android.view.ViewGroup r3 = r0.f2448f
                r6 = 0
                r1.mo2780m(r3, r6)
                if (r5 == 0) goto L_0x0072
                java.util.Iterator r1 = r5.iterator()
            L_0x0060:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0072
                java.lang.Object r3 = r1.next()
                c1.g r3 = (p017c1.C0592g) r3
                android.view.ViewGroup r5 = r0.f2448f
                r3.mo2764C(r5)
                goto L_0x0060
            L_0x0072:
                c1.g r1 = r0.f2447e
                android.view.ViewGroup r8 = r0.f2448f
                java.util.Objects.requireNonNull(r1)
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.f2426o = r3
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.f2427p = r3
                q.d r3 = r1.f2422k
                q.d r5 = r1.f2423l
                p.a r7 = new p.a
                q.f r9 = r3.f4936a
                p.a r9 = (p093p.C1545a) r9
                r7.<init>(r9)
                p.a r9 = new p.a
                q.f r10 = r5.f4936a
                p.a r10 = (p093p.C1545a) r10
                r9.<init>(r10)
                r10 = r6
            L_0x009e:
                int[] r11 = r1.f2425n
                int r12 = r11.length
                if (r10 >= r12) goto L_0x0204
                r11 = r11[r10]
                if (r11 == r2) goto L_0x01c4
                r12 = 2
                if (r11 == r12) goto L_0x0172
                r12 = 3
                if (r11 == r12) goto L_0x011a
                r12 = 4
                if (r11 == r12) goto L_0x00b3
            L_0x00b0:
                r17 = r3
                goto L_0x0116
            L_0x00b3:
                q.f r11 = r3.f4938c
                p.e r11 = (p093p.C1550e) r11
                q.f r12 = r5.f4938c
                p.e r12 = (p093p.C1550e) r12
                int r13 = r11.mo5538l()
                r14 = r6
            L_0x00c0:
                if (r14 >= r13) goto L_0x00b0
                java.lang.Object r15 = r11.mo5539m(r14)
                android.view.View r15 = (android.view.View) r15
                if (r15 == 0) goto L_0x010c
                boolean r16 = r1.mo2789x(r15)
                if (r16 == 0) goto L_0x010c
                boolean r6 = r11.f4808e
                if (r6 == 0) goto L_0x00d7
                r11.mo5534e()
            L_0x00d7:
                long[] r6 = r11.f4809f
                r17 = r3
                r2 = r6[r14]
                java.lang.Object r2 = r12.mo5535f(r2)
                android.view.View r2 = (android.view.View) r2
                if (r2 == 0) goto L_0x010e
                boolean r3 = r1.mo2789x(r2)
                if (r3 == 0) goto L_0x010e
                java.lang.Object r3 = r7.getOrDefault(r15, r4)
                c1.n r3 = (p017c1.C0607n) r3
                java.lang.Object r6 = r9.getOrDefault(r2, r4)
                c1.n r6 = (p017c1.C0607n) r6
                if (r3 == 0) goto L_0x010e
                if (r6 == 0) goto L_0x010e
                java.util.ArrayList<c1.n> r4 = r1.f2426o
                r4.add(r3)
                java.util.ArrayList<c1.n> r3 = r1.f2427p
                r3.add(r6)
                r7.remove(r15)
                r9.remove(r2)
                goto L_0x010e
            L_0x010c:
                r17 = r3
            L_0x010e:
                int r14 = r14 + 1
                r3 = r17
                r2 = 1
                r4 = 0
                r6 = 0
                goto L_0x00c0
            L_0x0116:
                r2 = r17
                goto L_0x01fa
            L_0x011a:
                r2 = r3
                q.f r3 = r2.f4937b
                android.util.SparseArray r3 = (android.util.SparseArray) r3
                q.f r4 = r5.f4937b
                android.util.SparseArray r4 = (android.util.SparseArray) r4
                int r6 = r3.size()
                r11 = 0
            L_0x0128:
                if (r11 >= r6) goto L_0x01fa
                java.lang.Object r12 = r3.valueAt(r11)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x016d
                boolean r13 = r1.mo2789x(r12)
                if (r13 == 0) goto L_0x016d
                int r13 = r3.keyAt(r11)
                java.lang.Object r13 = r4.get(r13)
                android.view.View r13 = (android.view.View) r13
                if (r13 == 0) goto L_0x016d
                boolean r14 = r1.mo2789x(r13)
                if (r14 == 0) goto L_0x016d
                r14 = 0
                java.lang.Object r15 = r7.getOrDefault(r12, r14)
                c1.n r15 = (p017c1.C0607n) r15
                java.lang.Object r17 = r9.getOrDefault(r13, r14)
                r14 = r17
                c1.n r14 = (p017c1.C0607n) r14
                if (r15 == 0) goto L_0x016d
                if (r14 == 0) goto L_0x016d
                java.util.ArrayList<c1.n> r0 = r1.f2426o
                r0.add(r15)
                java.util.ArrayList<c1.n> r0 = r1.f2427p
                r0.add(r14)
                r7.remove(r12)
                r9.remove(r13)
            L_0x016d:
                int r11 = r11 + 1
                r0 = r18
                goto L_0x0128
            L_0x0172:
                r2 = r3
                java.lang.Object r0 = r2.f4939d
                p.a r0 = (p093p.C1545a) r0
                java.lang.Object r3 = r5.f4939d
                p.a r3 = (p093p.C1545a) r3
                int r4 = r0.f4840g
                r6 = 0
            L_0x017e:
                if (r6 >= r4) goto L_0x01fa
                java.lang.Object r11 = r0.mo5618l(r6)
                android.view.View r11 = (android.view.View) r11
                if (r11 == 0) goto L_0x01c1
                boolean r12 = r1.mo2789x(r11)
                if (r12 == 0) goto L_0x01c1
                java.lang.Object r12 = r0.mo5614i(r6)
                java.lang.Object r12 = r3.get(r12)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x01c1
                boolean r13 = r1.mo2789x(r12)
                if (r13 == 0) goto L_0x01c1
                r13 = 0
                java.lang.Object r14 = r7.getOrDefault(r11, r13)
                c1.n r14 = (p017c1.C0607n) r14
                java.lang.Object r15 = r9.getOrDefault(r12, r13)
                c1.n r15 = (p017c1.C0607n) r15
                if (r14 == 0) goto L_0x01c1
                if (r15 == 0) goto L_0x01c1
                java.util.ArrayList<c1.n> r13 = r1.f2426o
                r13.add(r14)
                java.util.ArrayList<c1.n> r13 = r1.f2427p
                r13.add(r15)
                r7.remove(r11)
                r9.remove(r12)
            L_0x01c1:
                int r6 = r6 + 1
                goto L_0x017e
            L_0x01c4:
                r2 = r3
                int r0 = r7.f4840g
            L_0x01c7:
                int r0 = r0 + -1
                if (r0 < 0) goto L_0x01fa
                java.lang.Object r3 = r7.mo5614i(r0)
                android.view.View r3 = (android.view.View) r3
                if (r3 == 0) goto L_0x01c7
                boolean r4 = r1.mo2789x(r3)
                if (r4 == 0) goto L_0x01c7
                java.lang.Object r3 = r9.remove(r3)
                c1.n r3 = (p017c1.C0607n) r3
                if (r3 == 0) goto L_0x01c7
                android.view.View r4 = r3.f2462b
                boolean r4 = r1.mo2789x(r4)
                if (r4 == 0) goto L_0x01c7
                java.lang.Object r4 = r7.mo5616j(r0)
                c1.n r4 = (p017c1.C0607n) r4
                java.util.ArrayList<c1.n> r6 = r1.f2426o
                r6.add(r4)
                java.util.ArrayList<c1.n> r4 = r1.f2427p
                r4.add(r3)
                goto L_0x01c7
            L_0x01fa:
                int r10 = r10 + 1
                r0 = r18
                r3 = r2
                r2 = 1
                r4 = 0
                r6 = 0
                goto L_0x009e
            L_0x0204:
                r0 = 0
            L_0x0205:
                int r2 = r7.f4840g
                if (r0 >= r2) goto L_0x0225
                java.lang.Object r2 = r7.mo5618l(r0)
                c1.n r2 = (p017c1.C0607n) r2
                android.view.View r3 = r2.f2462b
                boolean r3 = r1.mo2789x(r3)
                if (r3 == 0) goto L_0x0222
                java.util.ArrayList<c1.n> r3 = r1.f2426o
                r3.add(r2)
                java.util.ArrayList<c1.n> r2 = r1.f2427p
                r3 = 0
                r2.add(r3)
            L_0x0222:
                int r0 = r0 + 1
                goto L_0x0205
            L_0x0225:
                r0 = 0
            L_0x0226:
                int r2 = r9.f4840g
                if (r0 >= r2) goto L_0x0246
                java.lang.Object r2 = r9.mo5618l(r0)
                c1.n r2 = (p017c1.C0607n) r2
                android.view.View r3 = r2.f2462b
                boolean r3 = r1.mo2789x(r3)
                if (r3 == 0) goto L_0x0243
                java.util.ArrayList<c1.n> r3 = r1.f2427p
                r3.add(r2)
                java.util.ArrayList<c1.n> r2 = r1.f2426o
                r3 = 0
                r2.add(r3)
            L_0x0243:
                int r0 = r0 + 1
                goto L_0x0226
            L_0x0246:
                p.a r0 = p017c1.C0592g.m1909t()
                int r2 = r0.f4840g
                c1.v r3 = p017c1.C0609p.f2465a
                android.view.WindowId r3 = r8.getWindowId()
                r4 = 1
                int r2 = r2 - r4
            L_0x0254:
                if (r2 < 0) goto L_0x02c6
                java.lang.Object r4 = r0.mo5614i(r2)
                android.animation.Animator r4 = (android.animation.Animator) r4
                r5 = 0
                if (r4 == 0) goto L_0x02c3
                java.lang.Object r6 = r0.getOrDefault(r4, r5)
                c1.g$b r6 = (p017c1.C0592g.C0594b) r6
                if (r6 == 0) goto L_0x02c3
                android.view.View r7 = r6.f2436a
                if (r7 == 0) goto L_0x02c3
                c1.z r7 = r6.f2439d
                boolean r9 = r7 instanceof p017c1.C0622y
                if (r9 == 0) goto L_0x027d
                c1.y r7 = (p017c1.C0622y) r7
                android.view.WindowId r7 = r7.f2492a
                boolean r7 = r7.equals(r3)
                if (r7 == 0) goto L_0x027d
                r7 = 1
                goto L_0x027e
            L_0x027d:
                r7 = 0
            L_0x027e:
                if (r7 == 0) goto L_0x02c3
                c1.n r7 = r6.f2438c
                android.view.View r9 = r6.f2436a
                r10 = 1
                c1.n r11 = r1.mo2787v(r9, r10)
                c1.n r12 = r1.mo2785s(r9, r10)
                if (r11 != 0) goto L_0x029e
                if (r12 != 0) goto L_0x029e
                q.d r10 = r1.f2423l
                q.f r10 = r10.f4936a
                p.a r10 = (p093p.C1545a) r10
                java.lang.Object r9 = r10.get(r9)
                r12 = r9
                c1.n r12 = (p017c1.C0607n) r12
            L_0x029e:
                if (r11 != 0) goto L_0x02a2
                if (r12 == 0) goto L_0x02ac
            L_0x02a2:
                c1.g r6 = r6.f2440e
                boolean r6 = r6.mo2788w(r7, r12)
                if (r6 == 0) goto L_0x02ac
                r6 = 1
                goto L_0x02ad
            L_0x02ac:
                r6 = 0
            L_0x02ad:
                if (r6 == 0) goto L_0x02c3
                boolean r6 = r4.isRunning()
                if (r6 != 0) goto L_0x02c0
                boolean r6 = r4.isStarted()
                if (r6 == 0) goto L_0x02bc
                goto L_0x02c0
            L_0x02bc:
                r0.remove(r4)
                goto L_0x02c3
            L_0x02c0:
                r4.cancel()
            L_0x02c3:
                int r2 = r2 + -1
                goto L_0x0254
            L_0x02c6:
                q.d r9 = r1.f2422k
                q.d r10 = r1.f2423l
                java.util.ArrayList<c1.n> r11 = r1.f2426o
                java.util.ArrayList<c1.n> r12 = r1.f2427p
                r7 = r1
                r7.mo2783q(r8, r9, r10, r11, r12)
                r1.mo2765D()
                r0 = 1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p017c1.C0600k.C0601a.onPreDraw():boolean");
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            this.f2448f.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f2448f.removeOnAttachStateChangeListener(this);
            C0600k.f2446c.remove(this.f2448f);
            ArrayList arrayList = C0600k.m1951a().get(this.f2448f);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C0592g) it.next()).mo2764C(this.f2448f);
                }
            }
            this.f2447e.mo2781n(true);
        }
    }

    /* renamed from: a */
    public static C1545a<ViewGroup, ArrayList<C0592g>> m1951a() {
        C1545a<ViewGroup, ArrayList<C0592g>> aVar;
        WeakReference weakReference = f2445b.get();
        if (weakReference != null && (aVar = (C1545a) weakReference.get()) != null) {
            return aVar;
        }
        C1545a<ViewGroup, ArrayList<C0592g>> aVar2 = new C1545a<>();
        f2445b.set(new WeakReference(aVar2));
        return aVar2;
    }
}
