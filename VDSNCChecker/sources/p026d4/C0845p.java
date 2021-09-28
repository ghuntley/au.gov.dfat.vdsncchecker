package p026d4;

import androidx.appcompat.widget.C0131a0;
import com.dynamsoft.dbr.EnumBarcodeFormat;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000a.C0001b;
import p026d4.C0816d;
import p062j4.C1112f;
import p062j4.C1113g;
import p072l2.C1241e;
import p144x3.C2129c;

/* renamed from: d4.p */
public final class C0845p implements Closeable {

    /* renamed from: k */
    public static final Logger f3285k = Logger.getLogger(C0819e.class.getName());

    /* renamed from: e */
    public final C1112f f3286e;

    /* renamed from: f */
    public int f3287f = EnumBarcodeFormat.BF_GS1_DATABAR_STACKED_OMNIDIRECTIONAL;

    /* renamed from: g */
    public boolean f3288g;

    /* renamed from: h */
    public final C0816d.C0818b f3289h;

    /* renamed from: i */
    public final C1113g f3290i;

    /* renamed from: j */
    public final boolean f3291j;

    public C0845p(C1113g gVar, boolean z) {
        this.f3290i = gVar;
        this.f3291j = z;
        C1112f fVar = new C1112f();
        this.f3286e = fVar;
        this.f3289h = new C0816d.C0818b(0, false, fVar, 3);
    }

    /* renamed from: a */
    public final synchronized void mo4113a(C0850t tVar) {
        C1241e.m3517j(tVar, "peerSettings");
        if (!this.f3288g) {
            int i = this.f3287f;
            int i2 = tVar.f3300a;
            if ((i2 & 32) != 0) {
                i = tVar.f3301b[5];
            }
            this.f3287f = i;
            int i3 = i2 & 2;
            int i4 = -1;
            if ((i3 != 0 ? tVar.f3301b[1] : -1) != -1) {
                C0816d.C0818b bVar = this.f3289h;
                if (i3 != 0) {
                    i4 = tVar.f3301b[1];
                }
                Objects.requireNonNull(bVar);
                int min = Math.min(i4, EnumBarcodeFormat.BF_GS1_DATABAR_STACKED_OMNIDIRECTIONAL);
                int i5 = bVar.f3152c;
                if (i5 != min) {
                    if (min < i5) {
                        bVar.f3150a = Math.min(bVar.f3150a, min);
                    }
                    bVar.f3151b = true;
                    bVar.f3152c = min;
                    int i6 = bVar.f3156g;
                    if (min < i6) {
                        if (min == 0) {
                            bVar.mo4063a();
                        } else {
                            bVar.mo4064b(i6 - min);
                        }
                    }
                }
            }
            mo4117g(0, 0, 4, 1);
            this.f3290i.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: c */
    public final synchronized void mo4114c(boolean z, int i, C1112f fVar, int i2) {
        if (!this.f3288g) {
            mo4117g(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                C1113g gVar = this.f3290i;
                C1241e.m3515e(fVar);
                gVar.mo15O(fVar, (long) i2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void close() {
        this.f3288g = true;
        this.f3290i.close();
    }

    public final synchronized void flush() {
        if (!this.f3288g) {
            this.f3290i.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: g */
    public final void mo4117g(int i, int i2, int i3, int i4) {
        Logger logger = f3285k;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C0819e.f3163e.mo4070b(false, i, i2, i3, i4));
        }
        boolean z = true;
        if (i2 <= this.f3287f) {
            if ((((int) 2147483648L) & i) != 0) {
                z = false;
            }
            if (z) {
                C1113g gVar = this.f3290i;
                byte[] bArr = C2129c.f6169a;
                C1241e.m3517j(gVar, "$this$writeMedium");
                gVar.mo4622L((i2 >>> 16) & 255);
                gVar.mo4622L((i2 >>> 8) & 255);
                gVar.mo4622L(i2 & 255);
                this.f3290i.mo4622L(i3 & 255);
                this.f3290i.mo4622L(i4 & 255);
                this.f3290i.mo4664x(i & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(C0131a0.m344a("reserved bit set: ", i).toString());
        }
        StringBuilder a = C0001b.m0a("FRAME_SIZE_ERROR length > ");
        a.append(this.f3287f);
        a.append(": ");
        a.append(i2);
        throw new IllegalArgumentException(a.toString().toString());
    }

    /* renamed from: h */
    public final synchronized void mo4118h(int i, C0814b bVar, byte[] bArr) {
        C1241e.m3517j(bArr, "debugData");
        if (!this.f3288g) {
            boolean z = false;
            if (bVar.f3129e != -1) {
                mo4117g(0, bArr.length + 8, 7, 0);
                this.f3290i.mo4664x(i);
                this.f3290i.mo4664x(bVar.f3129e);
                if (bArr.length == 0) {
                    z = true;
                }
                if (!z) {
                    this.f3290i.mo4642e(bArr);
                }
                this.f3290i.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: i */
    public final synchronized void mo4119i(boolean z, int i, List<C0815c> list) {
        C1241e.m3517j(list, "headerBlock");
        if (!this.f3288g) {
            this.f3289h.mo4067e(list);
            long j = this.f3286e.f3888f;
            long min = Math.min((long) this.f3287f, j);
            int i2 = (j > min ? 1 : (j == min ? 0 : -1));
            int i3 = i2 == 0 ? 4 : 0;
            if (z) {
                i3 |= 1;
            }
            mo4117g(i, (int) min, 1, i3);
            this.f3290i.mo15O(this.f3286e, min);
            if (i2 > 0) {
                mo4123u(i, j - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: k */
    public final synchronized void mo4120k(boolean z, int i, int i2) {
        if (!this.f3288g) {
            mo4117g(0, 8, 6, z ? 1 : 0);
            this.f3290i.mo4664x(i);
            this.f3290i.mo4664x(i2);
            this.f3290i.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: l */
    public final synchronized void mo4121l(int i, C0814b bVar) {
        C1241e.m3517j(bVar, "errorCode");
        if (!this.f3288g) {
            if (bVar.f3129e != -1) {
                mo4117g(i, 4, 3, 0);
                this.f3290i.mo4664x(bVar.f3129e);
                this.f3290i.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: n */
    public final synchronized void mo4122n(int i, long j) {
        if (!this.f3288g) {
            if (j != 0 && j <= 2147483647L) {
                mo4117g(i, 4, 8, 0);
                this.f3290i.mo4664x((int) j);
                this.f3290i.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: u */
    public final void mo4123u(int i, long j) {
        while (j > 0) {
            long min = Math.min((long) this.f3287f, j);
            j -= min;
            mo4117g(i, (int) min, 9, j == 0 ? 4 : 0);
            this.f3290i.mo15O(this.f3286e, min);
        }
    }
}
