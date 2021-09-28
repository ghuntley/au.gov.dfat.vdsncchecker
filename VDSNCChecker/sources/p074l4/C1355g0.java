package p074l4;

import java.io.OutputStream;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import p045h.C0990o;

/* renamed from: l4.g0 */
public class C1355g0 extends C1384p {

    /* renamed from: f */
    public final int f4381f;

    /* renamed from: g */
    public final C1384p[] f4382g;

    /* renamed from: l4.g0$a */
    public class C1356a implements Enumeration {

        /* renamed from: a */
        public int f4383a = 0;

        public C1356a() {
        }

        public boolean hasMoreElements() {
            return this.f4383a < C1355g0.this.f4424e.length;
        }

        public Object nextElement() {
            int i = this.f4383a;
            C1355g0 g0Var = C1355g0.this;
            byte[] bArr = g0Var.f4424e;
            if (i < bArr.length) {
                int min = Math.min(bArr.length - i, g0Var.f4381f);
                byte[] bArr2 = new byte[min];
                System.arraycopy(C1355g0.this.f4424e, this.f4383a, bArr2, 0, min);
                this.f4383a += min;
                return new C1338a1(bArr2);
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: l4.g0$b */
    public class C1357b implements Enumeration {

        /* renamed from: a */
        public int f4385a = 0;

        public C1357b() {
        }

        public boolean hasMoreElements() {
            return this.f4385a < C1355g0.this.f4382g.length;
        }

        public Object nextElement() {
            int i = this.f4385a;
            C1384p[] pVarArr = C1355g0.this.f4382g;
            if (i < pVarArr.length) {
                this.f4385a = i + 1;
                return pVarArr[i];
            }
            throw new NoSuchElementException();
        }
    }

    public C1355g0(byte[] bArr) {
        super(bArr);
        this.f4382g = null;
        this.f4381f = 1000;
    }

    /* renamed from: s */
    public static C1355g0 m3853s(C1399u uVar) {
        int size = uVar.size();
        C1384p[] pVarArr = new C1384p[size];
        for (int i = 0; i < size; i++) {
            pVarArr[i] = C1384p.m3959q(uVar.mo5228s(i));
        }
        return new C1355g0(pVarArr);
    }

    /* renamed from: j */
    public void mo5154j(C0990o oVar, boolean z) {
        Enumeration t = mo5177t();
        if (z) {
            ((OutputStream) oVar.f3645b).write(36);
        }
        oVar.mo4390d(128);
        oVar.mo4391e(t);
        oVar.mo4390d(0);
        oVar.mo4390d(0);
    }

    /* renamed from: k */
    public int mo5155k() {
        Enumeration t = mo5177t();
        int i = 0;
        while (t.hasMoreElements()) {
            i += ((C1348e) t.nextElement()).mo5171c().mo5155k();
        }
        return i + 2 + 2;
    }

    /* renamed from: n */
    public boolean mo5156n() {
        return true;
    }

    /* renamed from: t */
    public Enumeration mo5177t() {
        return this.f4382g == null ? new C1356a() : new C1357b();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1355g0(p074l4.C1384p[] r4) {
        /*
            r3 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
        L_0x0006:
            int r2 = r4.length
            if (r1 == r2) goto L_0x002b
            r2 = r4[r1]     // Catch:{ IOException -> 0x0013 }
            byte[] r2 = r2.f4424e     // Catch:{ IOException -> 0x0013 }
            r0.write(r2)     // Catch:{ IOException -> 0x0013 }
            int r1 = r1 + 1
            goto L_0x0006
        L_0x0013:
            r4 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "exception converting octets "
            java.lang.StringBuilder r1 = p000a.C0001b.m0a(r1)
            java.lang.String r4 = r4.toString()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x002b:
            byte[] r0 = r0.toByteArray()
            r3.<init>(r0)
            r3.f4382g = r4
            r4 = 1000(0x3e8, float:1.401E-42)
            r3.f4381f = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p074l4.C1355g0.<init>(l4.p[]):void");
    }
}
