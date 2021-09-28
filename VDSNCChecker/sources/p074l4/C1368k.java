package p074l4;

import androidx.appcompat.widget.C0131a0;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p000a.C0001b;
import p116s4.C1744a;
import p130v0.C1964a;

/* renamed from: l4.k */
public class C1368k extends FilterInputStream {

    /* renamed from: e */
    public final int f4402e;

    /* renamed from: f */
    public final boolean f4403f;

    /* renamed from: g */
    public final byte[][] f4404g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1368k(InputStream inputStream) {
        super(inputStream);
        int c = C1405v1.m4031c(inputStream);
        this.f4402e = c;
        this.f4403f = false;
        this.f4404g = new byte[11][];
    }

    /* renamed from: c */
    public static C1393s m3898c(int i, C1386p1 p1Var, byte[][] bArr) {
        int i2;
        int i3 = 0;
        if (i == 10) {
            byte[] g = m3899g(p1Var, bArr);
            if (g.length > 1) {
                return new C1354g(g);
            }
            if (g.length != 0) {
                byte b = g[0] & 255;
                C1354g[] gVarArr = C1354g.f4379f;
                if (b >= gVarArr.length) {
                    return new C1354g(g);
                }
                C1354g gVar = gVarArr[b];
                if (gVar == null) {
                    gVar = new C1354g(g);
                    gVarArr[b] = gVar;
                }
                return gVar;
            }
            throw new IllegalArgumentException("ENUMERATED has zero length");
        } else if (i == 12) {
            return new C1361h1(p1Var.mo5214c());
        } else {
            if (i != 30) {
                switch (i) {
                    case 1:
                        byte[] g2 = m3899g(p1Var, bArr);
                        if (g2.length == 1) {
                            byte b2 = g2[0];
                            if (b2 != -1) {
                                return b2 != 0 ? new C1342c(b2) : C1342c.f4362f;
                            }
                            return C1342c.f4363g;
                        }
                        throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
                    case 2:
                        return new C1371l(p1Var.mo5214c(), false);
                    case 3:
                        int i4 = p1Var.f4430h;
                        if (i4 >= 1) {
                            int read = p1Var.read();
                            int i5 = i4 - 1;
                            byte[] bArr2 = new byte[i5];
                            if (i5 != 0) {
                                if (C1744a.m4862b(p1Var, bArr2, 0, i5) != i5) {
                                    throw new EOFException("EOF encountered in middle of BIT STRING");
                                } else if (read > 0 && read < 8) {
                                    int i6 = i5 - 1;
                                    if (bArr2[i6] != ((byte) (bArr2[i6] & (255 << read)))) {
                                        return new C1373l1(bArr2, read);
                                    }
                                }
                            }
                            return new C1391r0(bArr2, read);
                        }
                        throw new IllegalArgumentException("truncated BIT STRING detected");
                    case 4:
                        return new C1338a1(p1Var.mo5214c());
                    case 5:
                        return C1411y0.f4459e;
                    case 6:
                        return C1380o.m3941r(m3899g(p1Var, bArr));
                    default:
                        switch (i) {
                            case 18:
                                return new C1413z0(p1Var.mo5214c());
                            case 19:
                                return new C1344c1(p1Var.mo5214c());
                            case 20:
                                return new C1353f1(p1Var.mo5214c());
                            case 21:
                                return new C1367j1(p1Var.mo5214c());
                            case 22:
                                return new C1409x0(p1Var.mo5214c());
                            case 23:
                                return new C1343c0(p1Var.mo5214c());
                            case 24:
                                return new C1365j(p1Var.mo5214c());
                            case 25:
                                return new C1407w0(p1Var.mo5214c());
                            case 26:
                                return new C1370k1(p1Var.mo5214c());
                            case 27:
                                return new C1401u0(p1Var.mo5214c());
                            case 28:
                                return new C1364i1(p1Var.mo5214c());
                            default:
                                throw new IOException(C1964a.m5271a("unknown tag ", i, " encountered"));
                        }
                }
            } else {
                int i7 = p1Var.f4430h;
                if ((i7 & 1) == 0) {
                    int i8 = i7 / 2;
                    char[] cArr = new char[i8];
                    byte[] bArr3 = new byte[8];
                    int i9 = 0;
                    while (i7 >= 8) {
                        if (C1744a.m4862b(p1Var, bArr3, 0, 8) == 8) {
                            cArr[i9] = (char) ((bArr3[0] << 8) | (bArr3[1] & 255));
                            cArr[i9 + 1] = (char) ((bArr3[2] << 8) | (bArr3[3] & 255));
                            cArr[i9 + 2] = (char) ((bArr3[4] << 8) | (bArr3[5] & 255));
                            cArr[i9 + 3] = (char) ((bArr3[6] << 8) | (bArr3[7] & 255));
                            i9 += 4;
                            i7 -= 8;
                        } else {
                            throw new EOFException("EOF encountered in middle of BMPString");
                        }
                    }
                    if (i7 > 0) {
                        if (C1744a.m4862b(p1Var, bArr3, 0, i7) == i7) {
                            while (true) {
                                int i10 = i3 + 1;
                                int i11 = i10 + 1;
                                i2 = i9 + 1;
                                cArr[i9] = (char) ((bArr3[i10] & 255) | (bArr3[i3] << 8));
                                if (i11 >= i7) {
                                    break;
                                }
                                i3 = i11;
                                i9 = i2;
                            }
                            i9 = i2;
                        } else {
                            throw new EOFException("EOF encountered in middle of BMPString");
                        }
                    }
                    if (p1Var.f4430h == 0 && i8 == i9) {
                        return new C1388q0(cArr);
                    }
                    throw new IllegalStateException();
                }
                throw new IOException("malformed BMPString encoding encountered");
            }
        }
    }

    /* renamed from: g */
    public static byte[] m3899g(C1386p1 p1Var, byte[][] bArr) {
        int i = p1Var.f4430h;
        if (i >= bArr.length) {
            return p1Var.mo5214c();
        }
        byte[] bArr2 = bArr[i];
        if (bArr2 == null) {
            bArr2 = new byte[i];
            bArr[i] = bArr2;
        }
        if (i == bArr2.length) {
            if (i != 0) {
                int i2 = p1Var.f4451f;
                if (i < i2) {
                    int b = i - C1744a.m4862b(p1Var.f4450e, bArr2, 0, bArr2.length);
                    p1Var.f4430h = b;
                    if (b == 0) {
                        p1Var.mo5236a(true);
                    } else {
                        StringBuilder a = C0001b.m0a("DEF length ");
                        a.append(p1Var.f4429g);
                        a.append(" object truncated by ");
                        a.append(p1Var.f4430h);
                        throw new EOFException(a.toString());
                    }
                } else {
                    StringBuilder a2 = C0001b.m0a("corrupted stream - out of bounds length found: ");
                    a2.append(p1Var.f4430h);
                    a2.append(" >= ");
                    a2.append(i2);
                    throw new IOException(a2.toString());
                }
            }
            return bArr2;
        }
        throw new IllegalArgumentException("buffer length not right for data");
    }

    /* renamed from: h */
    public static int m3900h(InputStream inputStream, int i, boolean z) {
        int read = inputStream.read();
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        } else if (read == 128) {
            return -1;
        } else {
            if (read <= 127) {
                return read;
            }
            int i2 = read & 127;
            if (i2 <= 4) {
                int i3 = 0;
                int i4 = 0;
                while (i4 < i2) {
                    int read2 = inputStream.read();
                    if (read2 >= 0) {
                        i3 = (i3 << 8) + read2;
                        i4++;
                    } else {
                        throw new EOFException("EOF found reading length");
                    }
                }
                if (i3 < 0) {
                    throw new IOException("corrupted stream - negative length found");
                } else if (i3 < i || z) {
                    return i3;
                } else {
                    throw new IOException("corrupted stream - out of bounds length found: " + i3 + " >= " + i);
                }
            } else {
                throw new IOException(C0131a0.m344a("DER length more than 4 bytes: ", i2));
            }
        }
    }

    /* renamed from: k */
    public static int m3901k(InputStream inputStream, int i) {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int i3 = 0;
        int read = inputStream.read();
        if ((read & 127) != 0) {
            while (read >= 0 && (read & 128) != 0) {
                i3 = (i3 | (read & 127)) << 7;
                read = inputStream.read();
            }
            if (read >= 0) {
                return i3 | (read & 127);
            }
            throw new EOFException("EOF found inside tag value.");
        }
        throw new IOException("corrupted stream - invalid high tag number found");
    }

    /* renamed from: a */
    public C1393s mo5189a(int i, int i2, int i3) {
        int i4 = 0;
        boolean z = (i & 32) != 0;
        C1386p1 p1Var = new C1386p1(this, i3, this.f4402e);
        if ((i & 192) == 192) {
            return new C1363i0(z, i2, p1Var.mo5214c());
        }
        if ((i & 64) != 0) {
            return new C1346d0(z, i2, p1Var.mo5214c());
        }
        if ((i & 128) != 0) {
            return new C1412z(p1Var).mo5244b(z, i2);
        }
        if (!z) {
            return m3898c(i2, p1Var, this.f4404g);
        }
        if (i2 == 4) {
            C1351f l = mo5191l(p1Var);
            int i5 = l.f4375b;
            C1384p[] pVarArr = new C1384p[i5];
            while (i4 != i5) {
                C1348e c = l.mo5174c(i4);
                if (c instanceof C1384p) {
                    pVarArr[i4] = (C1384p) c;
                    i4++;
                } else {
                    StringBuilder a = C0001b.m0a("unknown object encountered in constructed OCTET STRING: ");
                    a.append(c.getClass());
                    throw new C1359h(a.toString());
                }
            }
            return new C1355g0(pVarArr);
        } else if (i2 == 8) {
            return new C1394s0(mo5191l(p1Var));
        } else {
            if (i2 != 16) {
                if (i2 == 17) {
                    C1351f l2 = mo5191l(p1Var);
                    C1399u uVar = C1376m1.f4412a;
                    return l2.f4375b < 1 ? C1376m1.f4413b : new C1383o1(l2);
                }
                throw new IOException(C1964a.m5271a("unknown tag ", i2, " encountered"));
            } else if (this.f4403f) {
                return new C1398t1(p1Var.mo5214c());
            } else {
                C1351f l3 = mo5191l(p1Var);
                C1399u uVar2 = C1376m1.f4412a;
                return l3.f4375b < 1 ? C1376m1.f4412a : new C1379n1(l3);
            }
        }
    }

    /* renamed from: i */
    public C1393s mo5190i() {
        int read = read();
        if (read > 0) {
            int k = m3901k(this, read);
            boolean z = (read & 32) != 0;
            int h = m3900h(this, this.f4402e, false);
            if (h >= 0) {
                try {
                    return mo5189a(read, k, h);
                } catch (IllegalArgumentException e) {
                    throw new C1359h("corrupted stream detected", e);
                }
            } else if (z) {
                C1412z zVar = new C1412z(new C1392r1(this, this.f4402e), this.f4402e);
                if ((read & 192) == 192) {
                    return new C1363i0(k, zVar.mo5245c());
                }
                if ((read & 64) != 0) {
                    return new C1346d0(k, zVar.mo5245c());
                }
                if ((read & 128) != 0) {
                    return zVar.mo5244b(true, k);
                }
                if (k == 4) {
                    return new C1355g0(C1744a.m4861a(new C1385p0(zVar)));
                }
                if (k == 8) {
                    try {
                        return new C1394s0(zVar.mo5245c());
                    } catch (IllegalArgumentException e2) {
                        throw new C1359h(e2.getMessage(), e2);
                    }
                } else if (k == 16) {
                    return new C1366j0(zVar.mo5245c());
                } else {
                    if (k == 17) {
                        return new C1372l0(zVar.mo5245c());
                    }
                    throw new IOException("unknown BER object encountered");
                }
            } else {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
        } else if (read != 0) {
            return null;
        } else {
            throw new IOException("unexpected end-of-contents marker");
        }
    }

    /* renamed from: l */
    public C1351f mo5191l(C1386p1 p1Var) {
        if (p1Var.f4430h < 1) {
            return new C1351f(0);
        }
        C1368k kVar = new C1368k((InputStream) p1Var);
        C1351f fVar = new C1351f(10);
        while (true) {
            C1393s i = kVar.mo5190i();
            if (i == null) {
                return fVar;
            }
            fVar.mo5173a(i);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1368k(byte[] r2) {
        /*
            r1 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r2)
            int r2 = r2.length
            r1.<init>(r0)
            r1.f4402e = r2
            r2 = 0
            r1.f4403f = r2
            r2 = 11
            byte[][] r2 = new byte[r2][]
            r1.f4404g = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p074l4.C1368k.<init>(byte[]):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1368k(byte[] r2, boolean r3) {
        /*
            r1 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r2)
            int r2 = r2.length
            r1.<init>(r0)
            r1.f4402e = r2
            r1.f4403f = r3
            r2 = 11
            byte[][] r2 = new byte[r2][]
            r1.f4404g = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p074l4.C1368k.<init>(byte[], boolean):void");
    }
}
