package p062j4;

import androidx.appcompat.widget.C0131a0;
import com.dynamsoft.dbr.EnumBarcodeFormat;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import p000a.C0001b;
import p059j1.C1087a;
import p067k3.C1197a;
import p068k4.C1211a;
import p068k4.C1212b;
import p072l2.C1241e;
import p126u2.C1845f;

/* renamed from: j4.f */
public final class C1112f implements C1114h, C1113g, Cloneable, ByteChannel {

    /* renamed from: e */
    public C1129u f3887e;

    /* renamed from: f */
    public long f3888f;

    /* renamed from: A */
    public short mo4611A() {
        short r = mo4655r() & 65535;
        return (short) (((r & 255) << 8) | ((65280 & r) >>> 8));
    }

    /* renamed from: B */
    public /* bridge */ /* synthetic */ C1113g mo4612B(C1115i iVar) {
        mo4629T(iVar);
        return this;
    }

    /* renamed from: C */
    public String mo4613C() {
        return mo4653p(Long.MAX_VALUE);
    }

    /* renamed from: D */
    public byte[] mo4614D() {
        return mo4623M(this.f3888f);
    }

    /* renamed from: E */
    public void mo4615E(long j) {
        if (this.f3888f < j) {
            throw new EOFException();
        }
    }

    /* renamed from: F */
    public String mo4616F(long j, Charset charset) {
        C1241e.m3517j(charset, "charset");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(C1087a.m3111a("byteCount: ", j).toString());
        } else if (this.f3888f < j) {
            throw new EOFException();
        } else if (i == 0) {
            return "";
        } else {
            C1129u uVar = this.f3887e;
            C1241e.m3515e(uVar);
            int i2 = uVar.f3919b;
            if (((long) i2) + j > ((long) uVar.f3920c)) {
                return new String(mo4623M(j), charset);
            }
            int i3 = (int) j;
            String str = new String(uVar.f3918a, i2, i3, charset);
            int i4 = uVar.f3919b + i3;
            uVar.f3919b = i4;
            this.f3888f -= j;
            if (i4 == uVar.f3920c) {
                this.f3887e = uVar.mo4701a();
                C1130v.m3300b(uVar);
            }
            return str;
        }
    }

    /* renamed from: G */
    public /* bridge */ /* synthetic */ C1113g mo4617G(String str) {
        mo4639c0(str);
        return this;
    }

    /* renamed from: I */
    public boolean mo4619I() {
        return this.f3888f == 0;
    }

    /* renamed from: J */
    public String mo4620J() {
        return mo4616F(this.f3888f, C1197a.f4098a);
    }

    /* renamed from: K */
    public String mo4621K(long j) {
        return mo4616F(j, C1197a.f4098a);
    }

    /* renamed from: L */
    public /* bridge */ /* synthetic */ C1113g mo4622L(int i) {
        mo4633X(i);
        return this;
    }

    /* renamed from: M */
    public byte[] mo4623M(long j) {
        int i;
        int i2 = 0;
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(C1087a.m3111a("byteCount: ", j).toString());
        } else if (this.f3888f >= j) {
            int i3 = (int) j;
            byte[] bArr = new byte[i3];
            C1241e.m3517j(bArr, "sink");
            while (i2 < i3) {
                int i4 = i3 - i2;
                C1241e.m3517j(bArr, "sink");
                C1106b.m3136f((long) i3, (long) i2, (long) i4);
                C1129u uVar = this.f3887e;
                if (uVar != null) {
                    i = Math.min(i4, uVar.f3920c - uVar.f3919b);
                    byte[] bArr2 = uVar.f3918a;
                    int i5 = uVar.f3919b;
                    C1845f.m5042I(bArr2, bArr, i2, i5, i5 + i);
                    int i6 = uVar.f3919b + i;
                    uVar.f3919b = i6;
                    this.f3888f -= (long) i;
                    if (i6 == uVar.f3920c) {
                        this.f3887e = uVar.mo4701a();
                        C1130v.m3300b(uVar);
                    }
                } else {
                    i = -1;
                }
                if (i != -1) {
                    i2 += i;
                } else {
                    throw new EOFException();
                }
            }
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        if (r8 != r9) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        r14.f3887e = r6.mo4701a();
        p062j4.C1130v.m3300b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        r6.f3919b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009b, code lost:
        if (r1 != false) goto L_0x00a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0076 A[SYNTHETIC] */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo4624N() {
        /*
            r14 = this;
            long r0 = r14.f3888f
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00a8
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x000b:
            j4.u r6 = r14.f3887e
            p072l2.C1241e.m3515e(r6)
            byte[] r7 = r6.f3918a
            int r8 = r6.f3919b
            int r9 = r6.f3920c
        L_0x0016:
            if (r8 >= r9) goto L_0x008d
            byte r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0027
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0027
            int r11 = r10 - r11
            goto L_0x0040
        L_0x0027:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0032
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0032
            goto L_0x003c
        L_0x0032:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0072
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0072
        L_0x003c:
            int r11 = r10 - r11
            int r11 = r11 + 10
        L_0x0040:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0050
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0016
        L_0x0050:
            j4.f r0 = new j4.f
            r0.<init>()
            r0.mo4648j(r4)
            r0.mo4633X(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = p000a.C0001b.m0a(r2)
            java.lang.String r0 = r0.mo4620J()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0072:
            if (r0 == 0) goto L_0x0076
            r1 = 1
            goto L_0x008d
        L_0x0076:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r1 = p000a.C0001b.m0a(r1)
            java.lang.String r2 = p062j4.C1106b.m3141k(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008d:
            if (r8 != r9) goto L_0x0099
            j4.u r7 = r6.mo4701a()
            r14.f3887e = r7
            p062j4.C1130v.m3300b(r6)
            goto L_0x009b
        L_0x0099:
            r6.f3919b = r8
        L_0x009b:
            if (r1 != 0) goto L_0x00a1
            j4.u r6 = r14.f3887e
            if (r6 != 0) goto L_0x000b
        L_0x00a1:
            long r1 = r14.f3888f
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f3888f = r1
            return r4
        L_0x00a8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p062j4.C1112f.mo4624N():long");
    }

    /* renamed from: O */
    public void mo15O(C1112f fVar, long j) {
        int i;
        C1129u uVar;
        C1129u uVar2;
        C1241e.m3517j(fVar, "source");
        if (fVar != this) {
            C1106b.m3136f(fVar.f3888f, 0, j);
            while (j > 0) {
                C1129u uVar3 = fVar.f3887e;
                C1241e.m3515e(uVar3);
                int i2 = uVar3.f3920c;
                C1129u uVar4 = fVar.f3887e;
                C1241e.m3515e(uVar4);
                if (j < ((long) (i2 - uVar4.f3919b))) {
                    C1129u uVar5 = this.f3887e;
                    if (uVar5 != null) {
                        C1241e.m3515e(uVar5);
                        uVar = uVar5.f3924g;
                    } else {
                        uVar = null;
                    }
                    if (uVar != null && uVar.f3922e) {
                        if ((((long) uVar.f3920c) + j) - ((long) (uVar.f3921d ? 0 : uVar.f3919b)) <= ((long) 8192)) {
                            C1129u uVar6 = fVar.f3887e;
                            C1241e.m3515e(uVar6);
                            uVar6.mo4704d(uVar, (int) j);
                            fVar.f3888f -= j;
                            this.f3888f += j;
                            return;
                        }
                    }
                    C1129u uVar7 = fVar.f3887e;
                    C1241e.m3515e(uVar7);
                    int i3 = (int) j;
                    if (i3 > 0 && i3 <= uVar7.f3920c - uVar7.f3919b) {
                        if (i3 >= 1024) {
                            uVar2 = uVar7.mo4703c();
                        } else {
                            uVar2 = C1130v.m3301c();
                            byte[] bArr = uVar7.f3918a;
                            byte[] bArr2 = uVar2.f3918a;
                            int i4 = uVar7.f3919b;
                            C1845f.m5043J(bArr, bArr2, 0, i4, i4 + i3, 2);
                        }
                        uVar2.f3920c = uVar2.f3919b + i3;
                        uVar7.f3919b += i3;
                        C1129u uVar8 = uVar7.f3924g;
                        C1241e.m3515e(uVar8);
                        uVar8.mo4702b(uVar2);
                        fVar.f3887e = uVar2;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                C1129u uVar9 = fVar.f3887e;
                C1241e.m3515e(uVar9);
                long j2 = (long) (uVar9.f3920c - uVar9.f3919b);
                fVar.f3887e = uVar9.mo4701a();
                C1129u uVar10 = this.f3887e;
                if (uVar10 == null) {
                    this.f3887e = uVar9;
                    uVar9.f3924g = uVar9;
                    uVar9.f3923f = uVar9;
                } else {
                    C1241e.m3515e(uVar10);
                    C1129u uVar11 = uVar10.f3924g;
                    C1241e.m3515e(uVar11);
                    uVar11.mo4702b(uVar9);
                    C1129u uVar12 = uVar9.f3924g;
                    if (uVar12 != uVar9) {
                        C1241e.m3515e(uVar12);
                        if (uVar12.f3922e) {
                            int i5 = uVar9.f3920c - uVar9.f3919b;
                            C1129u uVar13 = uVar9.f3924g;
                            C1241e.m3515e(uVar13);
                            int i6 = 8192 - uVar13.f3920c;
                            C1129u uVar14 = uVar9.f3924g;
                            C1241e.m3515e(uVar14);
                            if (uVar14.f3921d) {
                                i = 0;
                            } else {
                                C1129u uVar15 = uVar9.f3924g;
                                C1241e.m3515e(uVar15);
                                i = uVar15.f3919b;
                            }
                            if (i5 <= i6 + i) {
                                C1129u uVar16 = uVar9.f3924g;
                                C1241e.m3515e(uVar16);
                                uVar9.mo4704d(uVar16, i5);
                                uVar9.mo4701a();
                                C1130v.m3300b(uVar9);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                fVar.f3888f -= j2;
                this.f3888f += j2;
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    /* renamed from: P */
    public byte mo4625P() {
        if (this.f3888f != 0) {
            C1129u uVar = this.f3887e;
            C1241e.m3515e(uVar);
            int i = uVar.f3919b;
            int i2 = uVar.f3920c;
            int i3 = i + 1;
            byte b = uVar.f3918a[i];
            this.f3888f--;
            if (i3 == i2) {
                this.f3887e = uVar.mo4701a();
                C1130v.m3300b(uVar);
            } else {
                uVar.f3919b = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    /* renamed from: Q */
    public int mo4626Q() {
        byte b;
        int i;
        byte b2;
        if (this.f3888f != 0) {
            byte u = mo4660u(0);
            int i2 = 1;
            if ((u & 128) == 0) {
                b2 = u & Byte.MAX_VALUE;
                b = 0;
                i = 1;
            } else if ((u & 224) == 192) {
                b2 = u & 31;
                i = 2;
                b = 128;
            } else if ((u & 240) == 224) {
                b2 = u & 15;
                i = 3;
                b = 2048;
            } else if ((u & 248) == 240) {
                b2 = u & 7;
                i = 4;
                b = 65536;
            } else {
                mo4654q(1);
                return 65533;
            }
            long j = (long) i;
            if (this.f3888f >= j) {
                while (i2 < i) {
                    long j2 = (long) i2;
                    byte u2 = mo4660u(j2);
                    if ((u2 & 192) == 128) {
                        b2 = (b2 << 6) | (u2 & 63);
                        i2++;
                    } else {
                        mo4654q(j2);
                        return 65533;
                    }
                }
                mo4654q(j);
                if (b2 > 1114111) {
                    return 65533;
                }
                if ((55296 <= b2 && 57343 >= b2) || b2 < b) {
                    return 65533;
                }
                return b2;
            }
            throw new EOFException("size < " + i + ": " + this.f3888f + " (to read code point prefixed 0x" + C1106b.m3141k(u) + ')');
        }
        throw new EOFException();
    }

    /* renamed from: R */
    public final C1115i mo4627R(int i) {
        if (i == 0) {
            return C1115i.f3889h;
        }
        C1106b.m3136f(this.f3888f, 0, (long) i);
        C1129u uVar = this.f3887e;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            C1241e.m3515e(uVar);
            int i5 = uVar.f3920c;
            int i6 = uVar.f3919b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                uVar = uVar.f3923f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[(i4 * 2)];
        C1129u uVar2 = this.f3887e;
        int i7 = 0;
        while (i2 < i) {
            C1241e.m3515e(uVar2);
            bArr[i7] = uVar2.f3918a;
            i2 += uVar2.f3920c - uVar2.f3919b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = uVar2.f3919b;
            uVar2.f3921d = true;
            i7++;
            uVar2 = uVar2.f3923f;
        }
        return new C1131w(bArr, iArr);
    }

    /* renamed from: S */
    public final C1129u mo4628S(int i) {
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (z) {
            C1129u uVar = this.f3887e;
            if (uVar == null) {
                C1129u c = C1130v.m3301c();
                this.f3887e = c;
                c.f3924g = c;
                c.f3923f = c;
                return c;
            }
            C1241e.m3515e(uVar);
            C1129u uVar2 = uVar.f3924g;
            C1241e.m3515e(uVar2);
            if (uVar2.f3920c + i <= 8192 && uVar2.f3922e) {
                return uVar2;
            }
            C1129u c2 = C1130v.m3301c();
            uVar2.mo4702b(c2);
            return c2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    /* renamed from: T */
    public C1112f mo4629T(C1115i iVar) {
        C1241e.m3517j(iVar, "byteString");
        iVar.mo4680k(this, 0, iVar.mo4669c());
        return this;
    }

    /* renamed from: U */
    public C1112f mo4630U(byte[] bArr) {
        C1241e.m3517j(bArr, "source");
        mo4631V(bArr, 0, bArr.length);
        return this;
    }

    /* renamed from: V */
    public C1112f mo4631V(byte[] bArr, int i, int i2) {
        C1241e.m3517j(bArr, "source");
        long j = (long) i2;
        C1106b.m3136f((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C1129u S = mo4628S(1);
            int min = Math.min(i3 - i, 8192 - S.f3920c);
            int i4 = i + min;
            C1845f.m5042I(bArr, S.f3918a, S.f3920c, i, i4);
            S.f3920c += min;
            i = i4;
        }
        this.f3888f += j;
        return this;
    }

    /* renamed from: W */
    public long mo4632W(C1134z zVar) {
        C1241e.m3517j(zVar, "source");
        long j = 0;
        while (true) {
            long o = zVar.mo21o(this, (long) 8192);
            if (o == -1) {
                return j;
            }
            j += o;
        }
    }

    /* renamed from: X */
    public C1112f mo4633X(int i) {
        C1129u S = mo4628S(1);
        byte[] bArr = S.f3918a;
        int i2 = S.f3920c;
        S.f3920c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f3888f++;
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ef A[LOOP:0: B:67:0x00eb->B:69:0x00ef, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ff  */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p062j4.C1112f mo4618H(long r13) {
        /*
            r12 = this;
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x000d
            r13 = 48
            r12.mo4633X(r13)
            goto L_0x0111
        L_0x000d:
            r3 = 0
            r4 = 1
            if (r2 >= 0) goto L_0x001e
            long r13 = -r13
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x001d
            java.lang.String r13 = "-9223372036854775808"
            r12.mo4639c0(r13)
            goto L_0x0111
        L_0x001d:
            r3 = r4
        L_0x001e:
            r5 = 100000000(0x5f5e100, double:4.94065646E-316)
            int r2 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            r5 = 10
            if (r2 >= 0) goto L_0x0066
            r6 = 10000(0x2710, double:4.9407E-320)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0048
            r6 = 100
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x003e
            r6 = 10
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x003b
            goto L_0x00de
        L_0x003b:
            r4 = 2
            goto L_0x00de
        L_0x003e:
            r6 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0046
            r2 = 3
            goto L_0x0092
        L_0x0046:
            r2 = 4
            goto L_0x0092
        L_0x0048:
            r6 = 1000000(0xf4240, double:4.940656E-318)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x005a
            r6 = 100000(0x186a0, double:4.94066E-319)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0058
            r2 = 5
            goto L_0x0092
        L_0x0058:
            r2 = 6
            goto L_0x0092
        L_0x005a:
            r6 = 10000000(0x989680, double:4.9406565E-317)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0063
            r2 = 7
            goto L_0x0092
        L_0x0063:
            r2 = 8
            goto L_0x0092
        L_0x0066:
            r6 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0094
            r6 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0084
            r6 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0082
            r4 = 9
            goto L_0x00de
        L_0x0082:
            r4 = r5
            goto L_0x00de
        L_0x0084:
            r6 = 100000000000(0x174876e800, double:4.9406564584E-313)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0090
            r2 = 11
            goto L_0x0092
        L_0x0090:
            r2 = 12
        L_0x0092:
            r4 = r2
            goto L_0x00de
        L_0x0094:
            r6 = 1000000000000000(0x38d7ea4c68000, double:4.940656458412465E-309)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b8
            r6 = 10000000000000(0x9184e72a000, double:4.9406564584125E-311)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00a9
            r4 = 13
            goto L_0x00de
        L_0x00a9:
            r6 = 100000000000000(0x5af3107a4000, double:4.94065645841247E-310)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b5
            r2 = 14
            goto L_0x0092
        L_0x00b5:
            r2 = 15
            goto L_0x0092
        L_0x00b8:
            r6 = 100000000000000000(0x16345785d8a0000, double:5.620395787888205E-302)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00d0
            r6 = 10000000000000000(0x2386f26fc10000, double:5.431165199810528E-308)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00cd
            r4 = 16
            goto L_0x00de
        L_0x00cd:
            r4 = 17
            goto L_0x00de
        L_0x00d0:
            r6 = 1000000000000000000(0xde0b6b3a7640000, double:7.832953389245686E-242)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00dc
            r4 = 18
            goto L_0x00de
        L_0x00dc:
            r4 = 19
        L_0x00de:
            if (r3 == 0) goto L_0x00e2
            int r4 = r4 + 1
        L_0x00e2:
            j4.u r2 = r12.mo4628S(r4)
            byte[] r6 = r2.f3918a
            int r7 = r2.f3920c
            int r7 = r7 + r4
        L_0x00eb:
            int r8 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x00fd
            long r8 = (long) r5
            long r10 = r13 % r8
            int r10 = (int) r10
            int r7 = r7 + -1
            byte[] r11 = p068k4.C1211a.f4115a
            byte r10 = r11[r10]
            r6[r7] = r10
            long r13 = r13 / r8
            goto L_0x00eb
        L_0x00fd:
            if (r3 == 0) goto L_0x0106
            int r7 = r7 + -1
            r13 = 45
            byte r13 = (byte) r13
            r6[r7] = r13
        L_0x0106:
            int r13 = r2.f3920c
            int r13 = r13 + r4
            r2.f3920c = r13
            long r13 = r12.f3888f
            long r0 = (long) r4
            long r13 = r13 + r0
            r12.f3888f = r13
        L_0x0111:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p062j4.C1112f.mo4618H(long):j4.f");
    }

    /* renamed from: Z */
    public C1112f mo4648j(long j) {
        if (j == 0) {
            mo4633X(48);
        } else {
            long j2 = (j >>> 1) | j;
            long j3 = j2 | (j2 >>> 2);
            long j4 = j3 | (j3 >>> 4);
            long j5 = j4 | (j4 >>> 8);
            long j6 = j5 | (j5 >>> 16);
            long j7 = j6 | (j6 >>> 32);
            long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
            long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
            long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
            long j11 = j10 + (j10 >>> 8);
            long j12 = j11 + (j11 >>> 16);
            int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
            C1129u S = mo4628S(i);
            byte[] bArr = S.f3918a;
            int i2 = S.f3920c;
            for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
                bArr[i3] = C1211a.f4115a[(int) (15 & j)];
                j >>>= 4;
            }
            S.f3920c += i;
            this.f3888f += (long) i;
        }
        return this;
    }

    /* renamed from: a0 */
    public C1112f mo4636a0(int i) {
        C1129u S = mo4628S(4);
        byte[] bArr = S.f3918a;
        int i2 = S.f3920c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        S.f3920c = i5 + 1;
        this.f3888f += 4;
        return this;
    }

    /* renamed from: b */
    public C1112f mo4637b() {
        return this;
    }

    /* renamed from: b0 */
    public C1112f mo4638b0(int i) {
        C1129u S = mo4628S(2);
        byte[] bArr = S.f3918a;
        int i2 = S.f3920c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        S.f3920c = i3 + 1;
        this.f3888f += 2;
        return this;
    }

    /* renamed from: c0 */
    public C1112f mo4639c0(String str) {
        C1241e.m3517j(str, "string");
        mo4641d0(str, 0, str.length());
        return this;
    }

    public void close() {
    }

    /* renamed from: d */
    public C1104a0 mo2835d() {
        return C1104a0.f3872d;
    }

    /* renamed from: d0 */
    public C1112f mo4641d0(String str, int i, int i2) {
        long j;
        long j2;
        char charAt;
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 128) {
                            C1129u S = mo4628S(1);
                            byte[] bArr = S.f3918a;
                            int i3 = S.f3920c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt2;
                            while (true) {
                                i = i4;
                                if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                    int i5 = S.f3920c;
                                    int i6 = (i3 + i) - i5;
                                    S.f3920c = i5 + i6;
                                    this.f3888f += (long) i6;
                                } else {
                                    i4 = i + 1;
                                    bArr[i + i3] = (byte) charAt;
                                }
                            }
                            int i52 = S.f3920c;
                            int i62 = (i3 + i) - i52;
                            S.f3920c = i52 + i62;
                            this.f3888f += (long) i62;
                        } else {
                            if (charAt2 < 2048) {
                                C1129u S2 = mo4628S(2);
                                byte[] bArr2 = S2.f3918a;
                                int i7 = S2.f3920c;
                                bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                                S2.f3920c = i7 + 2;
                                j2 = this.f3888f;
                                j = 2;
                            } else if (charAt2 < 55296 || charAt2 > 57343) {
                                C1129u S3 = mo4628S(3);
                                byte[] bArr3 = S3.f3918a;
                                int i8 = S3.f3920c;
                                bArr3[i8] = (byte) ((charAt2 >> 12) | 224);
                                bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                                S3.f3920c = i8 + 3;
                                j2 = this.f3888f;
                                j = 3;
                            } else {
                                int i9 = i + 1;
                                char charAt3 = i9 < i2 ? str.charAt(i9) : 0;
                                if (charAt2 > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                                    mo4633X(63);
                                    i = i9;
                                } else {
                                    int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + EnumBarcodeFormat.BF_GS1_DATABAR_EXPANDED_STACKED;
                                    C1129u S4 = mo4628S(4);
                                    byte[] bArr4 = S4.f3918a;
                                    int i11 = S4.f3920c;
                                    bArr4[i11] = (byte) ((i10 >> 18) | 240);
                                    bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                                    bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                                    bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                                    S4.f3920c = i11 + 4;
                                    this.f3888f += 4;
                                    i += 2;
                                }
                            }
                            this.f3888f = j2 + j;
                            i++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(C0131a0.m344a("beginIndex < 0: ", i).toString());
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ C1113g mo4642e(byte[] bArr) {
        mo4630U(bArr);
        return this;
    }

    /* renamed from: e0 */
    public C1112f mo4643e0(int i) {
        long j;
        long j2;
        String str;
        if (i < 128) {
            mo4633X(i);
        } else {
            if (i < 2048) {
                C1129u S = mo4628S(2);
                byte[] bArr = S.f3918a;
                int i2 = S.f3920c;
                bArr[i2] = (byte) ((i >> 6) | 192);
                bArr[i2 + 1] = (byte) ((i & 63) | 128);
                S.f3920c = i2 + 2;
                j2 = this.f3888f;
                j = 2;
            } else if (55296 <= i && 57343 >= i) {
                mo4633X(63);
            } else if (i < 65536) {
                C1129u S2 = mo4628S(3);
                byte[] bArr2 = S2.f3918a;
                int i3 = S2.f3920c;
                bArr2[i3] = (byte) ((i >> 12) | 224);
                bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
                bArr2[i3 + 2] = (byte) ((i & 63) | 128);
                S2.f3920c = i3 + 3;
                j2 = this.f3888f;
                j = 3;
            } else if (i <= 1114111) {
                C1129u S3 = mo4628S(4);
                byte[] bArr3 = S3.f3918a;
                int i4 = S3.f3920c;
                bArr3[i4] = (byte) ((i >> 18) | 240);
                bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
                bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
                bArr3[i4 + 3] = (byte) ((i & 63) | 128);
                S3.f3920c = i4 + 4;
                j2 = this.f3888f;
                j = 4;
            } else {
                StringBuilder a = C0001b.m0a("Unexpected code point: 0x");
                if (i != 0) {
                    char[] cArr = C1212b.f4116a;
                    int i5 = 0;
                    char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
                    while (i5 < 8 && cArr2[i5] == '0') {
                        i5++;
                    }
                    str = new String(cArr2, i5, 8 - i5);
                } else {
                    str = "0";
                }
                a.append(str);
                throw new IllegalArgumentException(a.toString());
            }
            this.f3888f = j2 + j;
        }
        return this;
    }

    /* JADX WARNING: type inference failed for: r21v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x000b
        L_0x0008:
            r2 = r3
            goto L_0x0078
        L_0x000b:
            boolean r4 = r1 instanceof p062j4.C1112f
            if (r4 != 0) goto L_0x0011
            goto L_0x0078
        L_0x0011:
            long r4 = r0.f3888f
            j4.f r1 = (p062j4.C1112f) r1
            long r6 = r1.f3888f
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x001c
            goto L_0x0078
        L_0x001c:
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0023
            goto L_0x0008
        L_0x0023:
            j4.u r4 = r0.f3887e
            p072l2.C1241e.m3515e(r4)
            j4.u r1 = r1.f3887e
            p072l2.C1241e.m3515e(r1)
            int r5 = r4.f3919b
            int r8 = r1.f3919b
            r9 = r6
        L_0x0032:
            long r11 = r0.f3888f
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0008
            int r11 = r4.f3920c
            int r11 = r11 - r5
            int r12 = r1.f3920c
            int r12 = r12 - r8
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r6
        L_0x0044:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x0060
            byte[] r15 = r4.f3918a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.f3918a
            int r17 = r8 + 1
            byte r8 = r15[r8]
            if (r5 == r8) goto L_0x0057
            goto L_0x0078
        L_0x0057:
            r18 = 1
            long r13 = r13 + r18
            r5 = r16
            r8 = r17
            goto L_0x0044
        L_0x0060:
            int r13 = r4.f3920c
            if (r5 != r13) goto L_0x006b
            j4.u r4 = r4.f3923f
            p072l2.C1241e.m3515e(r4)
            int r5 = r4.f3919b
        L_0x006b:
            int r13 = r1.f3920c
            if (r8 != r13) goto L_0x0076
            j4.u r1 = r1.f3923f
            p072l2.C1241e.m3515e(r1)
            int r8 = r1.f3919b
        L_0x0076:
            long r9 = r9 + r11
            goto L_0x0032
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p062j4.C1112f.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ C1113g mo4645f(byte[] bArr, int i, int i2) {
        mo4631V(bArr, i, i2);
        return this;
    }

    public void flush() {
    }

    public int hashCode() {
        C1129u uVar = this.f3887e;
        if (uVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = uVar.f3920c;
            for (int i3 = uVar.f3919b; i3 < i2; i3++) {
                i = (i * 31) + uVar.f3918a[i3];
            }
            uVar = uVar.f3923f;
            C1241e.m3515e(uVar);
        } while (uVar != this.f3887e);
        return i;
    }

    public boolean isOpen() {
        return true;
    }

    /* renamed from: k */
    public C1112f clone() {
        C1112f fVar = new C1112f();
        if (this.f3888f != 0) {
            C1129u uVar = this.f3887e;
            C1241e.m3515e(uVar);
            C1129u c = uVar.mo4703c();
            fVar.f3887e = c;
            c.f3924g = c;
            c.f3923f = c;
            for (C1129u uVar2 = uVar.f3923f; uVar2 != uVar; uVar2 = uVar2.f3923f) {
                C1129u uVar3 = c.f3924g;
                C1241e.m3515e(uVar3);
                C1241e.m3515e(uVar2);
                uVar3.mo4702b(uVar2.mo4703c());
            }
            fVar.f3888f = this.f3888f;
        }
        return fVar;
    }

    /* renamed from: l */
    public final long mo4650l() {
        long j = this.f3888f;
        if (j == 0) {
            return 0;
        }
        C1129u uVar = this.f3887e;
        C1241e.m3515e(uVar);
        C1129u uVar2 = uVar.f3924g;
        C1241e.m3515e(uVar2);
        int i = uVar2.f3920c;
        if (i < 8192 && uVar2.f3922e) {
            j -= (long) (i - uVar2.f3919b);
        }
        return j;
    }

    /* renamed from: m */
    public C1115i mo4651m(long j) {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(C1087a.m3111a("byteCount: ", j).toString());
        } else if (this.f3888f < j) {
            throw new EOFException();
        } else if (j < ((long) 4096)) {
            return new C1115i(mo4623M(j));
        } else {
            C1115i R = mo4627R((int) j);
            mo4654q(j);
            return R;
        }
    }

    /* renamed from: n */
    public final C1112f mo4652n(C1112f fVar, long j, long j2) {
        C1241e.m3517j(fVar, "out");
        C1106b.m3136f(this.f3888f, j, j2);
        if (j2 != 0) {
            fVar.f3888f += j2;
            C1129u uVar = this.f3887e;
            while (true) {
                C1241e.m3515e(uVar);
                int i = uVar.f3920c;
                int i2 = uVar.f3919b;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                uVar = uVar.f3923f;
            }
            while (j2 > 0) {
                C1241e.m3515e(uVar);
                C1129u c = uVar.mo4703c();
                int i3 = c.f3919b + ((int) j);
                c.f3919b = i3;
                c.f3920c = Math.min(i3 + ((int) j2), c.f3920c);
                C1129u uVar2 = fVar.f3887e;
                if (uVar2 == null) {
                    c.f3924g = c;
                    c.f3923f = c;
                    fVar.f3887e = c;
                } else {
                    C1241e.m3515e(uVar2);
                    C1129u uVar3 = uVar2.f3924g;
                    C1241e.m3515e(uVar3);
                    uVar3.mo4702b(c);
                }
                j2 -= (long) (c.f3920c - c.f3919b);
                uVar = uVar.f3923f;
                j = 0;
            }
        }
        return this;
    }

    /* renamed from: o */
    public long mo21o(C1112f fVar, long j) {
        C1241e.m3517j(fVar, "sink");
        if (j >= 0) {
            long j2 = this.f3888f;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            fVar.mo15O(this, j);
            return j;
        }
        throw new IllegalArgumentException(C1087a.m3111a("byteCount < 0: ", j).toString());
    }

    /* renamed from: p */
    public String mo4653p(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long v = mo4661v(b, 0, j2);
            if (v != -1) {
                return C1211a.m3457a(this, v);
            }
            if (j2 < this.f3888f && mo4660u(j2 - 1) == ((byte) 13) && mo4660u(j2) == b) {
                return C1211a.m3457a(this, j2);
            }
            C1112f fVar = new C1112f();
            mo4652n(fVar, 0, Math.min((long) 32, this.f3888f));
            StringBuilder a = C0001b.m0a("\\n not found: limit=");
            a.append(Math.min(this.f3888f, j));
            a.append(" content=");
            a.append(fVar.mo4666z().mo4671d());
            a.append(8230);
            throw new EOFException(a.toString());
        }
        throw new IllegalArgumentException(C1087a.m3111a("limit < 0: ", j).toString());
    }

    /* renamed from: q */
    public void mo4654q(long j) {
        while (j > 0) {
            C1129u uVar = this.f3887e;
            if (uVar != null) {
                int min = (int) Math.min(j, (long) (uVar.f3920c - uVar.f3919b));
                long j2 = (long) min;
                this.f3888f -= j2;
                j -= j2;
                int i = uVar.f3919b + min;
                uVar.f3919b = i;
                if (i == uVar.f3920c) {
                    this.f3887e = uVar.mo4701a();
                    C1130v.m3300b(uVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: r */
    public short mo4655r() {
        if (this.f3888f >= 2) {
            C1129u uVar = this.f3887e;
            C1241e.m3515e(uVar);
            int i = uVar.f3919b;
            int i2 = uVar.f3920c;
            if (i2 - i < 2) {
                return (short) (((mo4625P() & 255) << 8) | (mo4625P() & 255));
            }
            byte[] bArr = uVar.f3918a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.f3888f -= 2;
            if (i4 == i2) {
                this.f3887e = uVar.mo4701a();
                C1130v.m3300b(uVar);
            } else {
                uVar.f3919b = i4;
            }
            return (short) b;
        }
        throw new EOFException();
    }

    public int read(ByteBuffer byteBuffer) {
        C1241e.m3517j(byteBuffer, "sink");
        C1129u uVar = this.f3887e;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), uVar.f3920c - uVar.f3919b);
        byteBuffer.put(uVar.f3918a, uVar.f3919b, min);
        int i = uVar.f3919b + min;
        uVar.f3919b = i;
        this.f3888f -= (long) min;
        if (i == uVar.f3920c) {
            this.f3887e = uVar.mo4701a();
            C1130v.m3300b(uVar);
        }
        return min;
    }

    /* renamed from: s */
    public /* bridge */ /* synthetic */ C1113g mo4657s(int i) {
        mo4638b0(i);
        return this;
    }

    /* renamed from: t */
    public boolean mo4658t(long j) {
        return this.f3888f >= j;
    }

    public String toString() {
        long j = this.f3888f;
        if (j <= ((long) Integer.MAX_VALUE)) {
            return mo4627R((int) j).toString();
        }
        StringBuilder a = C0001b.m0a("size > Int.MAX_VALUE: ");
        a.append(this.f3888f);
        throw new IllegalStateException(a.toString().toString());
    }

    /* renamed from: u */
    public final byte mo4660u(long j) {
        C1106b.m3136f(this.f3888f, j, 1);
        C1129u uVar = this.f3887e;
        if (uVar != null) {
            long j2 = this.f3888f;
            if (j2 - j < j) {
                while (j2 > j) {
                    uVar = uVar.f3924g;
                    C1241e.m3515e(uVar);
                    j2 -= (long) (uVar.f3920c - uVar.f3919b);
                }
                return uVar.f3918a[(int) ((((long) uVar.f3919b) + j) - j2)];
            }
            long j3 = 0;
            while (true) {
                int i = uVar.f3920c;
                int i2 = uVar.f3919b;
                long j4 = ((long) (i - i2)) + j3;
                if (j4 > j) {
                    return uVar.f3918a[(int) ((((long) i2) + j) - j3)];
                }
                uVar = uVar.f3923f;
                C1241e.m3515e(uVar);
                j3 = j4;
            }
        } else {
            C1241e.m3515e((Object) null);
            return null.f3918a[(int) ((((long) null.f3919b) + j) - -1)];
        }
    }

    /* renamed from: v */
    public long mo4661v(byte b, long j, long j2) {
        C1129u uVar;
        long j3 = 0;
        if (0 <= j && j2 >= j) {
            long j4 = this.f3888f;
            if (j2 > j4) {
                j2 = j4;
            }
            if (!(j == j2 || (uVar = this.f3887e) == null)) {
                if (j4 - j < j) {
                    while (j4 > j) {
                        uVar = uVar.f3924g;
                        C1241e.m3515e(uVar);
                        j4 -= (long) (uVar.f3920c - uVar.f3919b);
                    }
                    while (j4 < j2) {
                        byte[] bArr = uVar.f3918a;
                        int min = (int) Math.min((long) uVar.f3920c, (((long) uVar.f3919b) + j2) - j4);
                        for (int i = (int) ((((long) uVar.f3919b) + j) - j4); i < min; i++) {
                            if (bArr[i] == b) {
                                return ((long) (i - uVar.f3919b)) + j4;
                            }
                        }
                        j4 += (long) (uVar.f3920c - uVar.f3919b);
                        uVar = uVar.f3923f;
                        C1241e.m3515e(uVar);
                        j = j4;
                    }
                } else {
                    while (true) {
                        long j5 = ((long) (uVar.f3920c - uVar.f3919b)) + j3;
                        if (j5 > j) {
                            break;
                        }
                        uVar = uVar.f3923f;
                        C1241e.m3515e(uVar);
                        j3 = j5;
                    }
                    while (j3 < j2) {
                        byte[] bArr2 = uVar.f3918a;
                        int min2 = (int) Math.min((long) uVar.f3920c, (((long) uVar.f3919b) + j2) - j3);
                        for (int i2 = (int) ((((long) uVar.f3919b) + j) - j3); i2 < min2; i2++) {
                            if (bArr2[i2] == b) {
                                return ((long) (i2 - uVar.f3919b)) + j3;
                            }
                        }
                        j3 += (long) (uVar.f3920c - uVar.f3919b);
                        uVar = uVar.f3923f;
                        C1241e.m3515e(uVar);
                        j = j3;
                    }
                }
            }
            return -1;
        }
        StringBuilder a = C0001b.m0a("size=");
        a.append(this.f3888f);
        a.append(" fromIndex=");
        a.append(j);
        a.append(" toIndex=");
        a.append(j2);
        throw new IllegalArgumentException(a.toString().toString());
    }

    /* renamed from: w */
    public int mo4662w() {
        if (this.f3888f >= 4) {
            C1129u uVar = this.f3887e;
            C1241e.m3515e(uVar);
            int i = uVar.f3919b;
            int i2 = uVar.f3920c;
            if (((long) (i2 - i)) < 4) {
                return ((mo4625P() & 255) << 24) | ((mo4625P() & 255) << 16) | ((mo4625P() & 255) << 8) | (mo4625P() & 255);
            }
            byte[] bArr = uVar.f3918a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            this.f3888f -= 4;
            if (i6 == i2) {
                this.f3887e = uVar.mo4701a();
                C1130v.m3300b(uVar);
            } else {
                uVar.f3919b = i6;
            }
            return b3;
        }
        throw new EOFException();
    }

    public int write(ByteBuffer byteBuffer) {
        C1241e.m3517j(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C1129u S = mo4628S(1);
            int min = Math.min(i, 8192 - S.f3920c);
            byteBuffer.get(S.f3918a, S.f3920c, min);
            i -= min;
            S.f3920c += min;
        }
        this.f3888f += (long) remaining;
        return remaining;
    }

    /* renamed from: x */
    public /* bridge */ /* synthetic */ C1113g mo4664x(int i) {
        mo4636a0(i);
        return this;
    }

    /* renamed from: y */
    public long mo4665y(C1132x xVar) {
        long j = this.f3888f;
        if (j > 0) {
            ((C1112f) xVar).mo15O(this, j);
        }
        return j;
    }

    /* renamed from: z */
    public C1115i mo4666z() {
        return mo4651m(this.f3888f);
    }
}
