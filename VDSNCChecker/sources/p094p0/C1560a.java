package p094p0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.dynamsoft.dbr.EnumBarcodeFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p058j0.C1043a;
import p058j0.C1061o;
import p058j0.C1070q;
import p064k0.C1150b;
import p064k0.C1154c;
import p093p.C1559i;
import p094p0.C1564b;

/* renamed from: p0.a */
public abstract class C1560a extends C1043a {

    /* renamed from: n */
    public static final Rect f4846n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    public static final C1564b.C1565a<C1150b> f4847o = new C1561a();

    /* renamed from: p */
    public static final C1564b.C1566b<C1559i<C1150b>, C1150b> f4848p = new C1562b();

    /* renamed from: d */
    public final Rect f4849d = new Rect();

    /* renamed from: e */
    public final Rect f4850e = new Rect();

    /* renamed from: f */
    public final Rect f4851f = new Rect();

    /* renamed from: g */
    public final int[] f4852g = new int[2];

    /* renamed from: h */
    public final AccessibilityManager f4853h;

    /* renamed from: i */
    public final View f4854i;

    /* renamed from: j */
    public C1563c f4855j;

    /* renamed from: k */
    public int f4856k = Integer.MIN_VALUE;

    /* renamed from: l */
    public int f4857l = Integer.MIN_VALUE;

    /* renamed from: m */
    public int f4858m = Integer.MIN_VALUE;

    /* renamed from: p0.a$a */
    public class C1561a implements C1564b.C1565a<C1150b> {
        /* renamed from: a */
        public void mo5646a(Object obj, Rect rect) {
            ((C1150b) obj).f4005a.getBoundsInParent(rect);
        }
    }

    /* renamed from: p0.a$b */
    public class C1562b implements C1564b.C1566b<C1559i<C1150b>, C1150b> {
    }

    /* renamed from: p0.a$c */
    public class C1563c extends C1154c {
        public C1563c() {
        }

        /* renamed from: a */
        public C1150b mo4776a(int i) {
            return new C1150b(AccessibilityNodeInfo.obtain(C1560a.this.mo5642o(i).f4005a));
        }

        /* renamed from: b */
        public C1150b mo4777b(int i) {
            int i2 = i == 2 ? C1560a.this.f4856k : C1560a.this.f4857l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return new C1150b(AccessibilityNodeInfo.obtain(C1560a.this.mo5642o(i2).f4005a));
        }

        /* renamed from: c */
        public boolean mo4778c(int i, int i2, Bundle bundle) {
            int i3;
            C1560a aVar = C1560a.this;
            if (i != -1) {
                boolean z = true;
                if (i2 == 1) {
                    return aVar.mo5643t(i);
                }
                if (i2 == 2) {
                    return aVar.mo5639k(i);
                }
                if (i2 != 64) {
                    return i2 != 128 ? aVar.mo3470p(i, i2, bundle) : aVar.mo5638j(i);
                }
                if (!aVar.f4853h.isEnabled() || !aVar.f4853h.isTouchExplorationEnabled() || (i3 = aVar.f4856k) == i) {
                    z = false;
                } else {
                    if (i3 != Integer.MIN_VALUE) {
                        aVar.mo5638j(i3);
                    }
                    aVar.f4856k = i;
                    aVar.f4854i.invalidate();
                    aVar.mo5644u(i, EnumBarcodeFormat.BF_GS1_DATABAR_EXPANDED);
                }
                return z;
            }
            View view = aVar.f4854i;
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            return view.performAccessibilityAction(i2, bundle);
        }
    }

    public C1560a(View view) {
        if (view != null) {
            this.f4854i = view;
            this.f4853h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: b */
    public C1154c mo2445b(View view) {
        if (this.f4855j == null) {
            this.f4855j = new C1563c();
        }
        return this.f4855j;
    }

    /* renamed from: c */
    public void mo1507c(View view, AccessibilityEvent accessibilityEvent) {
        this.f3779a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo1508d(View view, C1150b bVar) {
        this.f3779a.onInitializeAccessibilityNodeInfo(view, bVar.f4005a);
        mo3471q(bVar);
    }

    /* renamed from: j */
    public final boolean mo5638j(int i) {
        if (this.f4856k != i) {
            return false;
        }
        this.f4856k = Integer.MIN_VALUE;
        this.f4854i.invalidate();
        mo5644u(i, EnumBarcodeFormat.BF_GS1_DATABAR_EXPANDED_STACKED);
        return true;
    }

    /* renamed from: k */
    public final boolean mo5639k(int i) {
        if (this.f4857l != i) {
            return false;
        }
        this.f4857l = Integer.MIN_VALUE;
        mo3473s(i, false);
        mo5644u(i, 8);
        return true;
    }

    /* renamed from: l */
    public final C1150b mo5640l(int i) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        C1150b bVar = new C1150b(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName("android.view.View");
        Rect rect = f4846n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        View view = this.f4854i;
        bVar.f4006b = -1;
        obtain.setParent(view);
        mo3472r(i, bVar);
        if (bVar.mo4765g() == null && bVar.mo4762e() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        obtain.getBoundsInParent(this.f4850e);
        if (!this.f4850e.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                obtain.setPackageName(this.f4854i.getContext().getPackageName());
                View view2 = this.f4854i;
                bVar.f4007c = i;
                obtain.setSource(view2, i);
                boolean z = false;
                if (this.f4856k == i) {
                    obtain.setAccessibilityFocused(true);
                    obtain.addAction(128);
                } else {
                    obtain.setAccessibilityFocused(false);
                    obtain.addAction(64);
                }
                boolean z2 = this.f4857l == i;
                if (z2) {
                    obtain.addAction(2);
                } else if (obtain.isFocusable()) {
                    obtain.addAction(1);
                }
                obtain.setFocused(z2);
                this.f4854i.getLocationOnScreen(this.f4852g);
                obtain.getBoundsInScreen(this.f4849d);
                if (this.f4849d.equals(rect)) {
                    obtain.getBoundsInParent(this.f4849d);
                    if (bVar.f4006b != -1) {
                        C1150b bVar2 = new C1150b(AccessibilityNodeInfo.obtain());
                        for (int i2 = bVar.f4006b; i2 != -1; i2 = bVar2.f4006b) {
                            View view3 = this.f4854i;
                            bVar2.f4006b = -1;
                            bVar2.f4005a.setParent(view3, -1);
                            bVar2.f4005a.setBoundsInParent(f4846n);
                            mo3472r(i2, bVar2);
                            bVar2.f4005a.getBoundsInParent(this.f4850e);
                            Rect rect2 = this.f4849d;
                            Rect rect3 = this.f4850e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        bVar2.f4005a.recycle();
                    }
                    this.f4849d.offset(this.f4852g[0] - this.f4854i.getScrollX(), this.f4852g[1] - this.f4854i.getScrollY());
                }
                if (this.f4854i.getLocalVisibleRect(this.f4851f)) {
                    this.f4851f.offset(this.f4852g[0] - this.f4854i.getScrollX(), this.f4852g[1] - this.f4854i.getScrollY());
                    if (this.f4849d.intersect(this.f4851f)) {
                        bVar.f4005a.setBoundsInScreen(this.f4849d);
                        Rect rect4 = this.f4849d;
                        if (rect4 != null && !rect4.isEmpty() && this.f4854i.getWindowVisibility() == 0) {
                            View view4 = this.f4854i;
                            while (true) {
                                ViewParent parent = view4.getParent();
                                if (parent instanceof View) {
                                    view4 = (View) parent;
                                    if (view4.getAlpha() > 0.0f) {
                                        if (view4.getVisibility() != 0) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                } else if (parent != null) {
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            bVar.f4005a.setVisibleToUser(true);
                        }
                    }
                }
                return bVar;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* renamed from: m */
    public abstract void mo3469m(List<Integer> list);

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0143, code lost:
        if (r13 < ((r17 * r17) + ((r12 * 13) * r12))) goto L_0x0145;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x014f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x014a  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5641n(int r20, android.graphics.Rect r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.mo3469m(r3)
            p.i r4 = new p.i
            r4.<init>()
            r5 = 0
            r6 = r5
        L_0x0015:
            int r7 = r3.size()
            if (r6 >= r7) goto L_0x0039
            java.lang.Object r7 = r3.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            k0.b r7 = r0.mo5640l(r7)
            java.lang.Object r8 = r3.get(r6)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r4.mo5634l(r8, r7)
            int r6 = r6 + 1
            goto L_0x0015
        L_0x0039:
            int r3 = r0.f4857l
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r7) goto L_0x0041
            r3 = 0
            goto L_0x0047
        L_0x0041:
            java.lang.Object r3 = r4.mo5631f(r3)
            k0.b r3 = (p064k0.C1150b) r3
        L_0x0047:
            r8 = 2
            r9 = -1
            r10 = 1
            if (r1 == r10) goto L_0x0152
            if (r1 == r8) goto L_0x0152
            r8 = 130(0x82, float:1.82E-43)
            r11 = 66
            r12 = 33
            r13 = 17
            if (r1 == r13) goto L_0x0067
            if (r1 == r12) goto L_0x0067
            if (r1 == r11) goto L_0x0067
            if (r1 != r8) goto L_0x005f
            goto L_0x0067
        L_0x005f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L_0x0067:
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>()
            int r15 = r0.f4857l
            java.lang.String r6 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            if (r15 == r7) goto L_0x007c
            k0.b r2 = r0.mo5642o(r15)
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.f4005a
            r2.getBoundsInParent(r14)
            goto L_0x00a9
        L_0x007c:
            if (r2 == 0) goto L_0x0082
            r14.set(r2)
            goto L_0x00a9
        L_0x0082:
            android.view.View r2 = r0.f4854i
            int r15 = r2.getWidth()
            int r2 = r2.getHeight()
            if (r1 == r13) goto L_0x00a6
            if (r1 == r12) goto L_0x00a2
            if (r1 == r11) goto L_0x009e
            if (r1 != r8) goto L_0x0098
            r14.set(r5, r9, r15, r9)
            goto L_0x00a9
        L_0x0098:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r6)
            throw r1
        L_0x009e:
            r14.set(r9, r5, r9, r2)
            goto L_0x00a9
        L_0x00a2:
            r14.set(r5, r2, r15, r2)
            goto L_0x00a9
        L_0x00a6:
            r14.set(r15, r5, r15, r2)
        L_0x00a9:
            p0.b$b<p.i<k0.b>, k0.b> r2 = f4848p
            p0.b$a<k0.b> r15 = f4847o
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>(r14)
            if (r1 == r13) goto L_0x00d7
            if (r1 == r12) goto L_0x00ce
            if (r1 == r11) goto L_0x00c7
            if (r1 != r8) goto L_0x00c1
            int r6 = r14.height()
            int r6 = r6 + r10
            int r6 = -r6
            goto L_0x00d3
        L_0x00c1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r6)
            throw r1
        L_0x00c7:
            int r6 = r14.width()
            int r6 = r6 + r10
            int r6 = -r6
            goto L_0x00dc
        L_0x00ce:
            int r6 = r14.height()
            int r6 = r6 + r10
        L_0x00d3:
            r7.offset(r5, r6)
            goto L_0x00df
        L_0x00d7:
            int r6 = r14.width()
            int r6 = r6 + r10
        L_0x00dc:
            r7.offset(r6, r5)
        L_0x00df:
            p0.a$b r2 = (p094p0.C1560a.C1562b) r2
            java.util.Objects.requireNonNull(r2)
            int r2 = r4.mo5635m()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r8 = r5
            r16 = 0
        L_0x00f0:
            if (r8 >= r2) goto L_0x01c7
            boolean r11 = r4.f4842e
            if (r11 == 0) goto L_0x00f9
            r4.mo5630e()
        L_0x00f9:
            java.lang.Object[] r11 = r4.f4844g
            r11 = r11[r8]
            k0.b r11 = (p064k0.C1150b) r11
            if (r11 != r3) goto L_0x0102
            goto L_0x014f
        L_0x0102:
            r12 = r15
            p0.a$a r12 = (p094p0.C1560a.C1561a) r12
            r12.mo5646a(r11, r6)
            boolean r12 = p094p0.C1564b.m4376c(r14, r6, r1)
            if (r12 != 0) goto L_0x010f
            goto L_0x0147
        L_0x010f:
            boolean r12 = p094p0.C1564b.m4376c(r14, r7, r1)
            if (r12 != 0) goto L_0x0116
            goto L_0x0145
        L_0x0116:
            boolean r12 = p094p0.C1564b.m4374a(r1, r14, r6, r7)
            if (r12 == 0) goto L_0x011d
            goto L_0x0145
        L_0x011d:
            boolean r12 = p094p0.C1564b.m4374a(r1, r14, r7, r6)
            if (r12 == 0) goto L_0x0124
            goto L_0x0147
        L_0x0124:
            int r12 = p094p0.C1564b.m4377d(r1, r14, r6)
            int r13 = p094p0.C1564b.m4378e(r1, r14, r6)
            int r17 = r12 * 13
            int r17 = r17 * r12
            int r13 = r13 * r13
            int r13 = r13 + r17
            int r12 = p094p0.C1564b.m4377d(r1, r14, r7)
            int r17 = p094p0.C1564b.m4378e(r1, r14, r7)
            int r18 = r12 * 13
            int r18 = r18 * r12
            int r17 = r17 * r17
            int r12 = r17 + r18
            if (r13 >= r12) goto L_0x0147
        L_0x0145:
            r12 = r10
            goto L_0x0148
        L_0x0147:
            r12 = r5
        L_0x0148:
            if (r12 == 0) goto L_0x014f
            r7.set(r6)
            r16 = r11
        L_0x014f:
            int r8 = r8 + 1
            goto L_0x00f0
        L_0x0152:
            android.view.View r2 = r0.f4854i
            java.util.WeakHashMap<android.view.View, j0.q> r6 = p058j0.C1061o.f3808a
            int r2 = r2.getLayoutDirection()
            if (r2 != r10) goto L_0x015e
            r2 = r10
            goto L_0x015f
        L_0x015e:
            r2 = r5
        L_0x015f:
            p0.b$b<p.i<k0.b>, k0.b> r6 = f4848p
            p0.b$a<k0.b> r7 = f4847o
            p0.a$b r6 = (p094p0.C1560a.C1562b) r6
            java.util.Objects.requireNonNull(r6)
            int r6 = r4.mo5635m()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r6)
            r12 = r5
        L_0x0172:
            if (r12 >= r6) goto L_0x0187
            boolean r13 = r4.f4842e
            if (r13 == 0) goto L_0x017b
            r4.mo5630e()
        L_0x017b:
            java.lang.Object[] r13 = r4.f4844g
            r13 = r13[r12]
            k0.b r13 = (p064k0.C1150b) r13
            r11.add(r13)
            int r12 = r12 + 1
            goto L_0x0172
        L_0x0187:
            p0.b$c r6 = new p0.b$c
            r6.<init>(r2, r7)
            java.util.Collections.sort(r11, r6)
            if (r1 == r10) goto L_0x01b1
            if (r1 != r8) goto L_0x01a9
            int r1 = r11.size()
            if (r3 != 0) goto L_0x019b
            r2 = r9
            goto L_0x019f
        L_0x019b:
            int r2 = r11.lastIndexOf(r3)
        L_0x019f:
            int r2 = r2 + r10
            if (r2 >= r1) goto L_0x01a7
            java.lang.Object r6 = r11.get(r2)
            goto L_0x01c3
        L_0x01a7:
            r6 = 0
            goto L_0x01c3
        L_0x01a9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r1.<init>(r2)
            throw r1
        L_0x01b1:
            int r1 = r11.size()
            if (r3 != 0) goto L_0x01b8
            goto L_0x01bc
        L_0x01b8:
            int r1 = r11.indexOf(r3)
        L_0x01bc:
            int r1 = r1 + r9
            if (r1 < 0) goto L_0x01a7
            java.lang.Object r6 = r11.get(r1)
        L_0x01c3:
            r16 = r6
            k0.b r16 = (p064k0.C1150b) r16
        L_0x01c7:
            r1 = r16
            if (r1 != 0) goto L_0x01ce
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x01e8
        L_0x01ce:
            boolean r2 = r4.f4842e
            if (r2 == 0) goto L_0x01d5
            r4.mo5630e()
        L_0x01d5:
            int r2 = r4.f4845h
            if (r5 >= r2) goto L_0x01e4
            java.lang.Object[] r2 = r4.f4844g
            r2 = r2[r5]
            if (r2 != r1) goto L_0x01e1
            r9 = r5
            goto L_0x01e4
        L_0x01e1:
            int r5 = r5 + 1
            goto L_0x01d5
        L_0x01e4:
            int r7 = r4.mo5633k(r9)
        L_0x01e8:
            boolean r1 = r0.mo5643t(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p094p0.C1560a.mo5641n(int, android.graphics.Rect):boolean");
    }

    /* renamed from: o */
    public C1150b mo5642o(int i) {
        if (i != -1) {
            return mo5640l(i);
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.f4854i);
        C1150b bVar = new C1150b(obtain);
        View view = this.f4854i;
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        mo3469m(arrayList);
        if (obtain.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                bVar.f4005a.addChild(this.f4854i, ((Integer) arrayList.get(i2)).intValue());
            }
            return bVar;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: p */
    public abstract boolean mo3470p(int i, int i2, Bundle bundle);

    /* renamed from: q */
    public void mo3471q(C1150b bVar) {
    }

    /* renamed from: r */
    public abstract void mo3472r(int i, C1150b bVar);

    /* renamed from: s */
    public void mo3473s(int i, boolean z) {
    }

    /* renamed from: t */
    public final boolean mo5643t(int i) {
        int i2;
        if ((!this.f4854i.isFocused() && !this.f4854i.requestFocus()) || (i2 = this.f4857l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            mo5639k(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f4857l = i;
        mo3473s(i, true);
        mo5644u(i, 8);
        return true;
    }

    /* renamed from: u */
    public final boolean mo5644u(int i, int i2) {
        ViewParent parent;
        AccessibilityEvent accessibilityEvent;
        if (i == Integer.MIN_VALUE || !this.f4853h.isEnabled() || (parent = this.f4854i.getParent()) == null) {
            return false;
        }
        if (i != -1) {
            accessibilityEvent = AccessibilityEvent.obtain(i2);
            C1150b o = mo5642o(i);
            accessibilityEvent.getText().add(o.mo4765g());
            accessibilityEvent.setContentDescription(o.mo4762e());
            accessibilityEvent.setScrollable(o.f4005a.isScrollable());
            accessibilityEvent.setPassword(o.f4005a.isPassword());
            accessibilityEvent.setEnabled(o.f4005a.isEnabled());
            accessibilityEvent.setChecked(o.f4005a.isChecked());
            if (!accessibilityEvent.getText().isEmpty() || accessibilityEvent.getContentDescription() != null) {
                accessibilityEvent.setClassName(o.f4005a.getClassName());
                accessibilityEvent.setSource(this.f4854i, i);
                accessibilityEvent.setPackageName(this.f4854i.getContext().getPackageName());
            } else {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
        } else {
            accessibilityEvent = AccessibilityEvent.obtain(i2);
            this.f4854i.onInitializeAccessibilityEvent(accessibilityEvent);
        }
        return parent.requestSendAccessibilityEvent(this.f4854i, accessibilityEvent);
    }

    /* renamed from: v */
    public final void mo5645v(int i) {
        int i2 = this.f4858m;
        if (i2 != i) {
            this.f4858m = i;
            mo5644u(i, 128);
            mo5644u(i2, 256);
        }
    }
}
