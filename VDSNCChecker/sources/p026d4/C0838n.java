package p026d4;

import androidx.appcompat.widget.C0131a0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000a.C0001b;
import p026d4.C0816d;
import p042g2.C0955a;
import p049h3.C1013a;
import p062j4.C1104a0;
import p062j4.C1112f;
import p062j4.C1114h;
import p062j4.C1115i;
import p062j4.C1134z;
import p072l2.C1241e;
import p130v0.C1964a;
import p144x3.C2129c;

/* renamed from: d4.n */
public final class C0838n implements Closeable {

    /* renamed from: i */
    public static final Logger f3248i;

    /* renamed from: j */
    public static final C0838n f3249j = null;

    /* renamed from: e */
    public final C0839a f3250e;

    /* renamed from: f */
    public final C0816d.C0817a f3251f;

    /* renamed from: g */
    public final C1114h f3252g;

    /* renamed from: h */
    public final boolean f3253h;

    /* renamed from: d4.n$a */
    public static final class C0839a implements C1134z {

        /* renamed from: e */
        public int f3254e;

        /* renamed from: f */
        public int f3255f;

        /* renamed from: g */
        public int f3256g;

        /* renamed from: h */
        public int f3257h;

        /* renamed from: i */
        public int f3258i;

        /* renamed from: j */
        public final C1114h f3259j;

        public C0839a(C1114h hVar) {
            this.f3259j = hVar;
        }

        public void close() {
        }

        /* renamed from: d */
        public C1104a0 mo2835d() {
            return this.f3259j.mo2835d();
        }

        /* renamed from: o */
        public long mo21o(C1112f fVar, long j) {
            int i;
            int w;
            C1241e.m3517j(fVar, "sink");
            do {
                int i2 = this.f3257h;
                if (i2 == 0) {
                    this.f3259j.mo4654q((long) this.f3258i);
                    this.f3258i = 0;
                    if ((this.f3255f & 4) != 0) {
                        return -1;
                    }
                    i = this.f3256g;
                    int q = C2129c.m5529q(this.f3259j);
                    this.f3257h = q;
                    this.f3254e = q;
                    byte P = this.f3259j.mo4625P() & 255;
                    this.f3255f = this.f3259j.mo4625P() & 255;
                    C0838n nVar = C0838n.f3249j;
                    Logger logger = C0838n.f3248i;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(C0819e.f3163e.mo4070b(true, this.f3256g, this.f3254e, P, this.f3255f));
                    }
                    w = this.f3259j.mo4662w() & Integer.MAX_VALUE;
                    this.f3256g = w;
                    if (P != 9) {
                        throw new IOException(P + " != TYPE_CONTINUATION");
                    }
                } else {
                    long o = this.f3259j.mo21o(fVar, Math.min(j, (long) i2));
                    if (o == -1) {
                        return -1;
                    }
                    this.f3257h -= (int) o;
                    return o;
                }
            } while (w == i);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }
    }

    /* renamed from: d4.n$b */
    public interface C0840b {
        /* renamed from: a */
        void mo4082a(boolean z, int i, int i2, List<C0815c> list);

        /* renamed from: c */
        void mo4083c();

        /* renamed from: d */
        void mo4084d(int i, C0814b bVar);

        /* renamed from: e */
        void mo4085e(boolean z, C0850t tVar);

        /* renamed from: g */
        void mo4086g(int i, long j);

        /* renamed from: h */
        void mo4087h(int i, int i2, List<C0815c> list);

        /* renamed from: i */
        void mo4088i(boolean z, int i, int i2);

        /* renamed from: j */
        void mo4089j(int i, int i2, int i3, boolean z);

        /* renamed from: l */
        void mo4090l(boolean z, int i, C1114h hVar, int i2);

        /* renamed from: n */
        void mo4091n(int i, C0814b bVar, C1115i iVar);
    }

    static {
        Logger logger = Logger.getLogger(C0819e.class.getName());
        C1241e.m3516f(logger, "Logger.getLogger(Http2::class.java.name)");
        f3248i = logger;
    }

    public C0838n(C1114h hVar, boolean z) {
        this.f3252g = hVar;
        this.f3253h = z;
        C0839a aVar = new C0839a(hVar);
        this.f3250e = aVar;
        this.f3251f = new C0816d.C0817a(aVar, 4096, 0, 4);
    }

    /* renamed from: a */
    public static final int m2468a(int i, int i2, int i3) {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException("PROTOCOL_ERROR padding " + i3 + " > remaining length " + i);
    }

    /* renamed from: c */
    public final boolean mo4092c(boolean z, C0840b bVar) {
        int w;
        C0840b bVar2 = bVar;
        boolean z2 = false;
        try {
            this.f3252g.mo4615E(9);
            int q = C2129c.m5529q(this.f3252g);
            if (q <= 16384) {
                byte P = this.f3252g.mo4625P() & 255;
                byte P2 = this.f3252g.mo4625P() & 255;
                int w2 = this.f3252g.mo4662w() & Integer.MAX_VALUE;
                Logger logger = f3248i;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C0819e.f3163e.mo4070b(true, w2, q, P, P2));
                }
                if (!z || P == 4) {
                    C0814b bVar3 = null;
                    switch (P) {
                        case 0:
                            if (w2 != 0) {
                                boolean z3 = (P2 & 1) != 0;
                                if (!((P2 & 32) != 0)) {
                                    if ((P2 & 8) != 0) {
                                        byte P3 = this.f3252g.mo4625P();
                                        byte[] bArr = C2129c.f6169a;
                                        z2 = P3 & true;
                                    }
                                    bVar2.mo4090l(z3, w2, this.f3252g, m2468a(q, P2, z2 ? 1 : 0));
                                    this.f3252g.mo4654q(z2 ? 1 : 0);
                                    break;
                                } else {
                                    throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                                }
                            } else {
                                throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                            }
                        case 1:
                            if (w2 != 0) {
                                boolean z4 = (P2 & 1) != 0;
                                if ((P2 & 8) != 0) {
                                    byte P4 = this.f3252g.mo4625P();
                                    byte[] bArr2 = C2129c.f6169a;
                                    z2 = P4 & true;
                                }
                                if ((P2 & 32) != 0) {
                                    mo4096i(bVar2, w2);
                                    q -= 5;
                                }
                                bVar2.mo4082a(z4, w2, -1, mo4095h(m2468a(q, P2, z2 ? 1 : 0), z2, P2, w2));
                                break;
                            } else {
                                throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                            }
                        case 2:
                            if (q != 5) {
                                throw new IOException(C1964a.m5271a("TYPE_PRIORITY length: ", q, " != 5"));
                            } else if (w2 != 0) {
                                mo4096i(bVar2, w2);
                                break;
                            } else {
                                throw new IOException("TYPE_PRIORITY streamId == 0");
                            }
                        case 3:
                            if (q != 4) {
                                throw new IOException(C1964a.m5271a("TYPE_RST_STREAM length: ", q, " != 4"));
                            } else if (w2 != 0) {
                                int w3 = this.f3252g.mo4662w();
                                C0814b[] values = C0814b.values();
                                int length = values.length;
                                int i = 0;
                                while (true) {
                                    if (i < length) {
                                        C0814b bVar4 = values[i];
                                        if (bVar4.f3129e == w3) {
                                            bVar3 = bVar4;
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                                if (bVar3 != null) {
                                    bVar2.mo4084d(w2, bVar3);
                                    break;
                                } else {
                                    throw new IOException(C0131a0.m344a("TYPE_RST_STREAM unexpected error code: ", w3));
                                }
                            } else {
                                throw new IOException("TYPE_RST_STREAM streamId == 0");
                            }
                        case 4:
                            if (w2 != 0) {
                                throw new IOException("TYPE_SETTINGS streamId != 0");
                            } else if ((P2 & 1) != 0) {
                                if (q == 0) {
                                    bVar.mo4083c();
                                    break;
                                } else {
                                    throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                                }
                            } else if (q % 6 == 0) {
                                C0850t tVar = new C0850t();
                                C1013a C = C0955a.m2722C(C0955a.m2726G(0, q), 6);
                                int i2 = C.f3728e;
                                int i3 = C.f3729f;
                                int i4 = C.f3730g;
                                if (i4 < 0 ? i2 >= i3 : i2 <= i3) {
                                    while (true) {
                                        short r = this.f3252g.mo4655r();
                                        byte[] bArr3 = C2129c.f6169a;
                                        short s = r & 65535;
                                        w = this.f3252g.mo4662w();
                                        if (s != 2) {
                                            if (s == 3) {
                                                s = 4;
                                            } else if (s == 4) {
                                                s = 7;
                                                if (w < 0) {
                                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                                }
                                            } else if (s == 5 && (w < 16384 || w > 16777215)) {
                                            }
                                        } else if (!(w == 0 || w == 1)) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                        }
                                        tVar.mo4131c(s, w);
                                        if (i2 != i3) {
                                            i2 += i4;
                                        }
                                    }
                                    throw new IOException(C0131a0.m344a("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", w));
                                }
                                bVar2.mo4085e(false, tVar);
                                break;
                            } else {
                                throw new IOException(C0131a0.m344a("TYPE_SETTINGS length % 6 != 0: ", q));
                            }
                        case 5:
                            if (w2 != 0) {
                                if ((P2 & 8) != 0) {
                                    byte P5 = this.f3252g.mo4625P();
                                    byte[] bArr4 = C2129c.f6169a;
                                    z2 = P5 & true;
                                }
                                bVar2.mo4087h(w2, this.f3252g.mo4662w() & Integer.MAX_VALUE, mo4095h(m2468a(q - 4, P2, z2 ? 1 : 0), z2, P2, w2));
                                break;
                            } else {
                                throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                            }
                        case 6:
                            if (q != 8) {
                                throw new IOException(C0131a0.m344a("TYPE_PING length != 8: ", q));
                            } else if (w2 == 0) {
                                int w4 = this.f3252g.mo4662w();
                                int w5 = this.f3252g.mo4662w();
                                if ((P2 & 1) != 0) {
                                    z2 = true;
                                }
                                bVar2.mo4088i(z2, w4, w5);
                                break;
                            } else {
                                throw new IOException("TYPE_PING streamId != 0");
                            }
                        case 7:
                            if (q < 8) {
                                throw new IOException(C0131a0.m344a("TYPE_GOAWAY length < 8: ", q));
                            } else if (w2 == 0) {
                                int w6 = this.f3252g.mo4662w();
                                int w7 = this.f3252g.mo4662w();
                                int i5 = q - 8;
                                C0814b[] values2 = C0814b.values();
                                int length2 = values2.length;
                                int i6 = 0;
                                while (true) {
                                    if (i6 < length2) {
                                        C0814b bVar5 = values2[i6];
                                        if (bVar5.f3129e == w7) {
                                            bVar3 = bVar5;
                                        } else {
                                            i6++;
                                        }
                                    }
                                }
                                if (bVar3 != null) {
                                    C1115i iVar = C1115i.f3889h;
                                    if (i5 > 0) {
                                        iVar = this.f3252g.mo4651m((long) i5);
                                    }
                                    bVar2.mo4091n(w6, bVar3, iVar);
                                    break;
                                } else {
                                    throw new IOException(C0131a0.m344a("TYPE_GOAWAY unexpected error code: ", w7));
                                }
                            } else {
                                throw new IOException("TYPE_GOAWAY streamId != 0");
                            }
                        case 8:
                            if (q == 4) {
                                int w8 = this.f3252g.mo4662w();
                                byte[] bArr5 = C2129c.f6169a;
                                long j = ((long) w8) & 2147483647L;
                                if (j != 0) {
                                    bVar2.mo4086g(w2, j);
                                    break;
                                } else {
                                    throw new IOException("windowSizeIncrement was 0");
                                }
                            } else {
                                throw new IOException(C0131a0.m344a("TYPE_WINDOW_UPDATE length !=4: ", q));
                            }
                        default:
                            this.f3252g.mo4654q((long) q);
                            break;
                    }
                    return true;
                }
                StringBuilder a = C0001b.m0a("Expected a SETTINGS frame but was ");
                a.append(C0819e.f3163e.mo4069a(P));
                throw new IOException(a.toString());
            }
            throw new IOException(C0131a0.m344a("FRAME_SIZE_ERROR: ", q));
        } catch (EOFException unused) {
            return false;
        }
    }

    public void close() {
        this.f3252g.close();
    }

    /* renamed from: g */
    public final void mo4094g(C0840b bVar) {
        if (!this.f3253h) {
            C1114h hVar = this.f3252g;
            C1115i iVar = C0819e.f3159a;
            C1115i m = hVar.mo4651m((long) iVar.f3893g.length);
            Logger logger = f3248i;
            if (logger.isLoggable(Level.FINE)) {
                StringBuilder a = C0001b.m0a("<< CONNECTION ");
                a.append(m.mo4671d());
                logger.fine(C2129c.m5520h(a.toString(), new Object[0]));
            }
            if (!C1241e.m3513b(iVar, m)) {
                StringBuilder a2 = C0001b.m0a("Expected a connection header but was ");
                a2.append(m.mo4679j());
                throw new IOException(a2.toString());
            }
        } else if (!mo4092c(true, bVar)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p026d4.C0815c> mo4095h(int r3, int r4, int r5, int r6) {
        /*
            r2 = this;
            d4.n$a r0 = r2.f3250e
            r0.f3257h = r3
            r0.f3254e = r3
            r0.f3258i = r4
            r0.f3255f = r5
            r0.f3256g = r6
            d4.d$a r3 = r2.f3251f
        L_0x000e:
            j4.h r4 = r3.f3143b
            boolean r4 = r4.mo4619I()
            if (r4 != 0) goto L_0x0132
            j4.h r4 = r3.f3143b
            byte r4 = r4.mo4625P()
            byte[] r5 = p144x3.C2129c.f6169a
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == r5) goto L_0x012a
            r6 = r4 & 128(0x80, float:1.794E-43)
            r0 = 1
            if (r6 != r5) goto L_0x007c
            r5 = 127(0x7f, float:1.78E-43)
            int r4 = r3.mo4062g(r4, r5)
            int r4 = r4 - r0
            if (r4 < 0) goto L_0x003c
            d4.d r5 = p026d4.C0816d.f3141c
            d4.c[] r5 = p026d4.C0816d.f3139a
            int r5 = r5.length
            int r5 = r5 - r0
            if (r4 > r5) goto L_0x003c
            r5 = r0
            goto L_0x003d
        L_0x003c:
            r5 = 0
        L_0x003d:
            if (r5 == 0) goto L_0x004b
            d4.d r5 = p026d4.C0816d.f3141c
            d4.c[] r5 = p026d4.C0816d.f3139a
            r4 = r5[r4]
            java.util.List<d4.c> r5 = r3.f3142a
            r5.add(r4)
            goto L_0x000e
        L_0x004b:
            d4.d r5 = p026d4.C0816d.f3141c
            d4.c[] r5 = p026d4.C0816d.f3139a
            int r5 = r5.length
            int r5 = r4 - r5
            int r5 = r3.mo4057b(r5)
            if (r5 < 0) goto L_0x0068
            d4.c[] r6 = r3.f3144c
            int r1 = r6.length
            if (r5 >= r1) goto L_0x0068
            java.util.List<d4.c> r4 = r3.f3142a
            r5 = r6[r5]
            p072l2.C1241e.m3515e(r5)
            r4.add(r5)
            goto L_0x000e
        L_0x0068:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r5 = "Header index too large "
            java.lang.StringBuilder r5 = p000a.C0001b.m0a(r5)
            int r4 = r4 + r0
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L_0x007c:
            r5 = -1
            r6 = 64
            if (r4 != r6) goto L_0x0098
            d4.d r4 = p026d4.C0816d.f3141c
            j4.i r6 = r3.mo4061f()
            r4.mo4055a(r6)
            j4.i r4 = r3.mo4061f()
            d4.c r0 = new d4.c
            r0.<init>((p062j4.C1115i) r6, (p062j4.C1115i) r4)
            r3.mo4060e(r5, r0)
            goto L_0x000e
        L_0x0098:
            r1 = r4 & 64
            if (r1 != r6) goto L_0x00b5
            r6 = 63
            int r4 = r3.mo4062g(r4, r6)
            int r4 = r4 - r0
            j4.i r4 = r3.mo4059d(r4)
            j4.i r6 = r3.mo4061f()
            d4.c r0 = new d4.c
            r0.<init>((p062j4.C1115i) r4, (p062j4.C1115i) r6)
            r3.mo4060e(r5, r0)
            goto L_0x000e
        L_0x00b5:
            r5 = r4 & 32
            r6 = 32
            if (r5 != r6) goto L_0x00ef
            r5 = 31
            int r4 = r3.mo4062g(r4, r5)
            r3.f3149h = r4
            if (r4 < 0) goto L_0x00da
            int r5 = r3.f3148g
            if (r4 > r5) goto L_0x00da
            int r5 = r3.f3147f
            if (r4 >= r5) goto L_0x000e
            if (r4 != 0) goto L_0x00d4
            r3.mo4056a()
            goto L_0x000e
        L_0x00d4:
            int r5 = r5 - r4
            r3.mo4058c(r5)
            goto L_0x000e
        L_0x00da:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "Invalid dynamic table size update "
            java.lang.StringBuilder r5 = p000a.C0001b.m0a(r5)
            int r3 = r3.f3149h
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L_0x00ef:
            r5 = 16
            if (r4 == r5) goto L_0x0111
            if (r4 != 0) goto L_0x00f6
            goto L_0x0111
        L_0x00f6:
            r5 = 15
            int r4 = r3.mo4062g(r4, r5)
            int r4 = r4 - r0
            j4.i r4 = r3.mo4059d(r4)
            j4.i r5 = r3.mo4061f()
            java.util.List<d4.c> r6 = r3.f3142a
            d4.c r0 = new d4.c
            r0.<init>((p062j4.C1115i) r4, (p062j4.C1115i) r5)
            r6.add(r0)
            goto L_0x000e
        L_0x0111:
            d4.d r4 = p026d4.C0816d.f3141c
            j4.i r5 = r3.mo4061f()
            r4.mo4055a(r5)
            j4.i r4 = r3.mo4061f()
            java.util.List<d4.c> r6 = r3.f3142a
            d4.c r0 = new d4.c
            r0.<init>((p062j4.C1115i) r5, (p062j4.C1115i) r4)
            r6.add(r0)
            goto L_0x000e
        L_0x012a:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "index == 0"
            r3.<init>(r4)
            throw r3
        L_0x0132:
            d4.d$a r3 = r2.f3251f
            java.util.List<d4.c> r4 = r3.f3142a
            java.util.List r4 = p126u2.C1850k.m5054P(r4)
            java.util.List<d4.c> r3 = r3.f3142a
            r3.clear()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p026d4.C0838n.mo4095h(int, int, int, int):java.util.List");
    }

    /* renamed from: i */
    public final void mo4096i(C0840b bVar, int i) {
        int w = this.f3252g.mo4662w();
        boolean z = (((int) 2147483648L) & w) != 0;
        byte P = this.f3252g.mo4625P();
        byte[] bArr = C2129c.f6169a;
        bVar.mo4089j(i, w & Integer.MAX_VALUE, (P & 255) + 1, z);
    }
}
