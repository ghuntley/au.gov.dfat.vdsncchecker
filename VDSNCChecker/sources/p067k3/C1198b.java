package p067k3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import p019c3.C0640p;
import p031e3.C0870a;
import p042g2.C0955a;
import p049h3.C1015c;
import p061j3.C1096d;
import p072l2.C1241e;
import p120t2.C1791e;

/* renamed from: k3.b */
public final class C1198b implements C1096d<C1015c> {

    /* renamed from: a */
    public final CharSequence f4099a;

    /* renamed from: b */
    public final int f4100b;

    /* renamed from: c */
    public final int f4101c;

    /* renamed from: d */
    public final C0640p<CharSequence, Integer, C1791e<Integer, Integer>> f4102d;

    /* renamed from: k3.b$a */
    public static final class C1199a implements Iterator<C1015c>, C0870a {

        /* renamed from: e */
        public int f4103e = -1;

        /* renamed from: f */
        public int f4104f;

        /* renamed from: g */
        public int f4105g;

        /* renamed from: h */
        public C1015c f4106h;

        /* renamed from: i */
        public int f4107i;

        /* renamed from: j */
        public final /* synthetic */ C1198b f4108j;

        public C1199a(C1198b bVar) {
            this.f4108j = bVar;
            int e = C0955a.m2731e(bVar.f4100b, 0, bVar.f4099a.length());
            this.f4104f = e;
            this.f4105g = e;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if (r6 < r3) goto L_0x001b;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo4804b() {
            /*
                r7 = this;
                int r0 = r7.f4105g
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r7.f4103e = r1
                r0 = 0
                r7.f4106h = r0
                goto L_0x007e
            L_0x000c:
                k3.b r2 = r7.f4108j
                int r3 = r2.f4101c
                r4 = -1
                r5 = 1
                if (r3 <= 0) goto L_0x001b
                int r6 = r7.f4107i
                int r6 = r6 + r5
                r7.f4107i = r6
                if (r6 >= r3) goto L_0x0023
            L_0x001b:
                java.lang.CharSequence r2 = r2.f4099a
                int r2 = r2.length()
                if (r0 <= r2) goto L_0x0033
            L_0x0023:
                int r0 = r7.f4104f
                h3.c r1 = new h3.c
                k3.b r2 = r7.f4108j
                java.lang.CharSequence r2 = r2.f4099a
                int r2 = p067k3.C1209l.m3440U(r2)
                r1.<init>(r0, r2)
                goto L_0x0056
            L_0x0033:
                k3.b r0 = r7.f4108j
                c3.p<java.lang.CharSequence, java.lang.Integer, t2.e<java.lang.Integer, java.lang.Integer>> r2 = r0.f4102d
                java.lang.CharSequence r0 = r0.f4099a
                int r3 = r7.f4105g
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r0 = r2.mo2829k(r0, r3)
                t2.e r0 = (p120t2.C1791e) r0
                if (r0 != 0) goto L_0x005b
                int r0 = r7.f4104f
                h3.c r1 = new h3.c
                k3.b r2 = r7.f4108j
                java.lang.CharSequence r2 = r2.f4099a
                int r2 = p067k3.C1209l.m3440U(r2)
                r1.<init>(r0, r2)
            L_0x0056:
                r7.f4106h = r1
                r7.f4105g = r4
                goto L_0x007c
            L_0x005b:
                A r2 = r0.f5439e
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.f5440f
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.f4104f
                h3.c r3 = p042g2.C0955a.m2726G(r3, r2)
                r7.f4106h = r3
                int r2 = r2 + r0
                r7.f4104f = r2
                if (r0 != 0) goto L_0x0079
                r1 = r5
            L_0x0079:
                int r2 = r2 + r1
                r7.f4105g = r2
            L_0x007c:
                r7.f4103e = r5
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p067k3.C1198b.C1199a.mo4804b():void");
        }

        public boolean hasNext() {
            if (this.f4103e == -1) {
                mo4804b();
            }
            return this.f4103e == 1;
        }

        public Object next() {
            if (this.f4103e == -1) {
                mo4804b();
            }
            if (this.f4103e != 0) {
                C1015c cVar = this.f4106h;
                Objects.requireNonNull(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f4106h = null;
                this.f4103e = -1;
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1198b(CharSequence charSequence, int i, int i2, C0640p<? super CharSequence, ? super Integer, C1791e<Integer, Integer>> pVar) {
        C1241e.m3517j(charSequence, "input");
        this.f4099a = charSequence;
        this.f4100b = i;
        this.f4101c = i2;
        this.f4102d = pVar;
    }

    public Iterator<C1015c> iterator() {
        return new C1199a(this);
    }
}
