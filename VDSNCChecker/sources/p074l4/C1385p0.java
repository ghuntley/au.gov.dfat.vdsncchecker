package p074l4;

import java.io.IOException;
import java.io.InputStream;
import p000a.C0001b;

/* renamed from: l4.p0 */
public class C1385p0 extends InputStream {

    /* renamed from: e */
    public final C1412z f4425e;

    /* renamed from: f */
    public boolean f4426f = true;

    /* renamed from: g */
    public InputStream f4427g;

    public C1385p0(C1412z zVar) {
        this.f4425e = zVar;
    }

    /* renamed from: a */
    public final C1387q mo5211a() {
        C1348e a = this.f4425e.mo5243a();
        if (a == null) {
            return null;
        }
        if (a instanceof C1387q) {
            return (C1387q) a;
        }
        StringBuilder a2 = C0001b.m0a("unknown object encountered: ");
        a2.append(a.getClass());
        throw new IOException(a2.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read() {
        /*
            r3 = this;
            java.io.InputStream r0 = r3.f4427g
            r1 = -1
            if (r0 != 0) goto L_0x0015
            boolean r0 = r3.f4426f
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            l4.q r0 = r3.mo5211a()
            if (r0 != 0) goto L_0x0011
            return r1
        L_0x0011:
            r2 = 0
            r3.f4426f = r2
            goto L_0x0028
        L_0x0015:
            java.io.InputStream r0 = r3.f4427g
            int r0 = r0.read()
            if (r0 < 0) goto L_0x001e
            return r0
        L_0x001e:
            l4.q r0 = r3.mo5211a()
            if (r0 != 0) goto L_0x0028
            r0 = 0
            r3.f4427g = r0
            return r1
        L_0x0028:
            java.io.InputStream r0 = r0.mo5183b()
            r3.f4427g = r0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: p074l4.C1385p0.read():int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002a A[EDGE_INSN: B:20:0x002a->B:15:0x002a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0029 A[SYNTHETIC] */
    public int read(byte[] r6, int r7, int r8) {
        /*
            r5 = this;
            java.io.InputStream r0 = r5.f4427g
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L_0x001a
            boolean r0 = r5.f4426f
            if (r0 != 0) goto L_0x000b
            return r2
        L_0x000b:
            l4.q r0 = r5.mo5211a()
            if (r0 != 0) goto L_0x0012
            return r2
        L_0x0012:
            r5.f4426f = r1
        L_0x0014:
            java.io.InputStream r0 = r0.mo5183b()
            r5.f4427g = r0
        L_0x001a:
            java.io.InputStream r0 = r5.f4427g
            int r3 = r7 + r1
            int r4 = r8 - r1
            int r0 = r0.read(r6, r3, r4)
            if (r0 < 0) goto L_0x002a
            int r1 = r1 + r0
            if (r1 != r8) goto L_0x001a
            return r1
        L_0x002a:
            l4.q r0 = r5.mo5211a()
            if (r0 != 0) goto L_0x0014
            r6 = 0
            r5.f4427g = r6
            r6 = 1
            if (r1 >= r6) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r2 = r1
        L_0x0038:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p074l4.C1385p0.read(byte[], int, int):int");
    }
}
