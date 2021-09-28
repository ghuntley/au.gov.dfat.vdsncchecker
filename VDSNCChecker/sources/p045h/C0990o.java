package p045h;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;
import p005a4.C0025j;
import p072l2.C1241e;
import p074l4.C1341b1;
import p074l4.C1348e;
import p074l4.C1393s;
import p154z3.C2208d;

/* renamed from: h.o */
public class C0990o {

    /* renamed from: a */
    public final /* synthetic */ int f3644a;

    /* renamed from: b */
    public Deque<WeakReference<XmlPullParser>> f3645b;

    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>>, java.io.ByteArrayOutputStream] */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>>, java.util.LinkedHashSet] */
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0990o(int i) {
        this(5, 5, TimeUnit.MINUTES);
        this.f3644a = i;
        if (i == 1) {
            this.f3645b = new HashMap();
        } else if (i == 9) {
            this.f3645b = new ByteArrayOutputStream();
        } else if (i == 6) {
        } else if (i != 7) {
            this.f3645b = new ArrayDeque();
        } else {
            this.f3645b = new LinkedHashSet();
        }
    }

    /* renamed from: a */
    public static C0990o m2884a(OutputStream outputStream, String str) {
        return str.equals("DER") ? new C1341b1(outputStream, 0) : str.equals("DL") ? new C1341b1(outputStream, 1) : new C0990o(outputStream);
    }

    /* renamed from: b */
    public C1341b1 mo4388b() {
        return new C1341b1((OutputStream) this.f3645b, 0);
    }

    /* renamed from: c */
    public C0990o mo4389c() {
        return new C1341b1((OutputStream) this.f3645b, 1);
    }

    /* renamed from: d */
    public void mo4390d(int i) {
        ((OutputStream) this.f3645b).write(i);
    }

    /* renamed from: e */
    public void mo4391e(Enumeration enumeration) {
        while (enumeration.hasMoreElements()) {
            mo4399m(((C1348e) enumeration.nextElement()).mo5171c(), true);
        }
    }

    /* renamed from: f */
    public void mo4392f(boolean z, int i, byte b, byte[] bArr) {
        if (z) {
            ((OutputStream) this.f3645b).write(i);
        }
        mo4397k(bArr.length + 1);
        ((OutputStream) this.f3645b).write(b);
        ((OutputStream) this.f3645b).write(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    public void mo4393g(boolean z, int i, int i2, byte[] bArr) {
        mo4400n(z, i, i2);
        mo4397k(bArr.length);
        ((OutputStream) this.f3645b).write(bArr, 0, bArr.length);
    }

    /* renamed from: h */
    public void mo4394h(boolean z, int i, byte[] bArr) {
        if (z) {
            ((OutputStream) this.f3645b).write(i);
        }
        mo4397k(bArr.length);
        ((OutputStream) this.f3645b).write(bArr, 0, bArr.length);
    }

    /* renamed from: i */
    public void mo4395i(boolean z, int i, int i2, byte[] bArr) {
        mo4400n(z, i, i2);
        mo4390d(128);
        ((OutputStream) this.f3645b).write(bArr, 0, bArr.length);
        mo4390d(0);
        mo4390d(0);
    }

    /* renamed from: j */
    public void mo4396j(boolean z, int i, C1348e[] eVarArr) {
        if (z) {
            ((OutputStream) this.f3645b).write(i);
        }
        mo4390d(128);
        for (C1348e c : eVarArr) {
            mo4399m(c.mo5171c(), true);
        }
        mo4390d(0);
        mo4390d(0);
    }

    /* renamed from: k */
    public void mo4397k(int i) {
        if (i > 127) {
            int i2 = i;
            int i3 = 1;
            while (true) {
                i2 >>>= 8;
                if (i2 == 0) {
                    break;
                }
                i3++;
            }
            mo4390d((byte) (i3 | 128));
            for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
                mo4390d((byte) (i >> i4));
            }
            return;
        }
        mo4390d((byte) i);
    }

    /* renamed from: l */
    public void mo4398l(C1348e eVar) {
        mo4399m(eVar.mo5171c(), true);
    }

    /* renamed from: m */
    public void mo4399m(C1393s sVar, boolean z) {
        sVar.mo5154j(this, z);
    }

    /* renamed from: n */
    public void mo4400n(boolean z, int i, int i2) {
        if (z) {
            if (i2 < 31) {
                mo4390d(i | i2);
                return;
            }
            mo4390d(31 | i);
            if (i2 < 128) {
                ((OutputStream) this.f3645b).write(i2);
                return;
            }
            byte[] bArr = new byte[5];
            int i3 = 4;
            bArr[4] = (byte) (i2 & 127);
            do {
                i2 >>= 7;
                i3--;
                bArr[i3] = (byte) ((i2 & 127) | 128);
            } while (i2 > 127);
            ((OutputStream) this.f3645b).write(bArr, i3, 5 - i3);
        }
    }

    public String toString() {
        switch (this.f3644a) {
            case 5:
                return '<' + ((String) this.f3645b) + '>';
            default:
                return super.toString();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0990o(int i, long j, TimeUnit timeUnit) {
        this(new C0025j(C2208d.f6344h, i, j, timeUnit));
        this.f3644a = 6;
        C1241e.m3517j(timeUnit, "timeUnit");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>>, a4.j] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0990o(p005a4.C0025j r2) {
        /*
            r1 = this;
            r0 = 6
            r1.f3644a = r0
            r1.<init>()
            r1.f3645b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p045h.C0990o.<init>(a4.j):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.io.OutputStream, java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0990o(java.io.OutputStream r2) {
        /*
            r1 = this;
            r0 = 8
            r1.f3644a = r0
            r1.<init>()
            r1.f3645b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p045h.C0990o.<init>(java.io.OutputStream):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>>, java.lang.String] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0990o(java.lang.String r2) {
        /*
            r1 = this;
            r0 = 5
            r1.f3644a = r0
            r1.<init>()
            r1.f3645b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p045h.C0990o.<init>(java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>>, l3.p0] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0990o(p073l3.C1309p0 r2) {
        /*
            r1 = this;
            r0 = 4
            r1.f3644a = r0
            r1.<init>()
            r1.f3645b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p045h.C0990o.<init>(l3.p0):void");
    }
}
