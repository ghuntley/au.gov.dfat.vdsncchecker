package p099q;

import java.util.Arrays;
import p000a.C0001b;
import p063k.C1142f;
import p099q.C1590c;

/* renamed from: q.a */
public class C1588a implements C1590c.C1591a {

    /* renamed from: a */
    public int f4921a = 0;

    /* renamed from: b */
    public final C1590c f4922b;

    /* renamed from: c */
    public final C1592d f4923c;

    /* renamed from: d */
    public int f4924d = 8;

    /* renamed from: e */
    public int[] f4925e = new int[8];

    /* renamed from: f */
    public int[] f4926f = new int[8];

    /* renamed from: g */
    public float[] f4927g = new float[8];

    /* renamed from: h */
    public int f4928h = -1;

    /* renamed from: i */
    public int f4929i = -1;

    /* renamed from: j */
    public boolean f4930j = false;

    public C1588a(C1590c cVar, C1592d dVar) {
        this.f4922b = cVar;
        this.f4923c = dVar;
    }

    /* renamed from: a */
    public float mo5684a(int i) {
        int i2 = this.f4928h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f4921a) {
            if (i3 == i) {
                return this.f4927g[i2];
            }
            i2 = this.f4926f[i2];
            i3++;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public void mo5685b(C1601j jVar, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f4928h;
            if (i == -1) {
                this.f4928h = 0;
                this.f4927g[0] = f;
                this.f4925e[0] = jVar.f4969f;
                this.f4926f[0] = -1;
                jVar.f4979p++;
                jVar.mo5742a(this.f4922b);
                this.f4921a++;
                if (!this.f4930j) {
                    int i2 = this.f4929i + 1;
                    this.f4929i = i2;
                    int[] iArr = this.f4925e;
                    if (i2 >= iArr.length) {
                        this.f4930j = true;
                        this.f4929i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.f4921a) {
                int[] iArr2 = this.f4925e;
                int i5 = iArr2[i];
                int i6 = jVar.f4969f;
                if (i5 == i6) {
                    float[] fArr = this.f4927g;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f4928h) {
                            this.f4928h = this.f4926f[i];
                        } else {
                            int[] iArr3 = this.f4926f;
                            iArr3[i4] = iArr3[i];
                        }
                        if (z) {
                            jVar.mo5743b(this.f4922b);
                        }
                        if (this.f4930j) {
                            this.f4929i = i;
                        }
                        jVar.f4979p--;
                        this.f4921a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i4 = i;
                }
                i = this.f4926f[i];
                i3++;
            }
            int i7 = this.f4929i;
            int i8 = i7 + 1;
            if (this.f4930j) {
                int[] iArr4 = this.f4925e;
                if (iArr4[i7] != -1) {
                    i7 = iArr4.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr5 = this.f4925e;
            if (i7 >= iArr5.length && this.f4921a < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.f4925e;
                    if (i9 >= iArr6.length) {
                        break;
                    } else if (iArr6[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr7 = this.f4925e;
            if (i7 >= iArr7.length) {
                i7 = iArr7.length;
                int i10 = this.f4924d * 2;
                this.f4924d = i10;
                this.f4930j = false;
                this.f4929i = i7 - 1;
                this.f4927g = Arrays.copyOf(this.f4927g, i10);
                this.f4925e = Arrays.copyOf(this.f4925e, this.f4924d);
                this.f4926f = Arrays.copyOf(this.f4926f, this.f4924d);
            }
            this.f4925e[i7] = jVar.f4969f;
            this.f4927g[i7] = f;
            int[] iArr8 = this.f4926f;
            if (i4 != -1) {
                iArr8[i7] = iArr8[i4];
                iArr8[i4] = i7;
            } else {
                iArr8[i7] = this.f4928h;
                this.f4928h = i7;
            }
            jVar.f4979p++;
            jVar.mo5742a(this.f4922b);
            this.f4921a++;
            if (!this.f4930j) {
                this.f4929i++;
            }
            int i11 = this.f4929i;
            int[] iArr9 = this.f4925e;
            if (i11 >= iArr9.length) {
                this.f4930j = true;
                this.f4929i = iArr9.length - 1;
            }
        }
    }

    /* renamed from: c */
    public final float mo5686c(C1601j jVar) {
        int i = this.f4928h;
        int i2 = 0;
        while (i != -1 && i2 < this.f4921a) {
            if (this.f4925e[i] == jVar.f4969f) {
                return this.f4927g[i];
            }
            i = this.f4926f[i];
            i2++;
        }
        return 0.0f;
    }

    public final void clear() {
        int i = this.f4928h;
        int i2 = 0;
        while (i != -1 && i2 < this.f4921a) {
            C1601j jVar = ((C1601j[]) this.f4923c.f4939d)[this.f4925e[i]];
            if (jVar != null) {
                jVar.mo5743b(this.f4922b);
            }
            i = this.f4926f[i];
            i2++;
        }
        this.f4928h = -1;
        this.f4929i = -1;
        this.f4930j = false;
        this.f4921a = 0;
    }

    /* renamed from: d */
    public float mo5688d(C1590c cVar, boolean z) {
        float c = mo5686c(cVar.f4931a);
        mo5690f(cVar.f4931a, z);
        C1590c.C1591a aVar = cVar.f4934d;
        int k = aVar.mo5695k();
        for (int i = 0; i < k; i++) {
            C1601j e = aVar.mo5689e(i);
            mo5685b(e, aVar.mo5686c(e) * c, z);
        }
        return c;
    }

    /* renamed from: e */
    public C1601j mo5689e(int i) {
        int i2 = this.f4928h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f4921a) {
            if (i3 == i) {
                return ((C1601j[]) this.f4923c.f4939d)[this.f4925e[i2]];
            }
            i2 = this.f4926f[i2];
            i3++;
        }
        return null;
    }

    /* renamed from: f */
    public final float mo5690f(C1601j jVar, boolean z) {
        int i = this.f4928h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f4921a) {
            if (this.f4925e[i] == jVar.f4969f) {
                if (i == this.f4928h) {
                    this.f4928h = this.f4926f[i];
                } else {
                    int[] iArr = this.f4926f;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    jVar.mo5743b(this.f4922b);
                }
                jVar.f4979p--;
                this.f4921a--;
                this.f4925e[i] = -1;
                if (this.f4930j) {
                    this.f4929i = i;
                }
                return this.f4927g[i];
            }
            i2++;
            i3 = i;
            i = this.f4926f[i];
        }
        return 0.0f;
    }

    /* renamed from: g */
    public boolean mo5691g(C1601j jVar) {
        int i = this.f4928h;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f4921a) {
            if (this.f4925e[i] == jVar.f4969f) {
                return true;
            }
            i = this.f4926f[i];
            i2++;
        }
        return false;
    }

    /* renamed from: h */
    public void mo5692h(float f) {
        int i = this.f4928h;
        int i2 = 0;
        while (i != -1 && i2 < this.f4921a) {
            float[] fArr = this.f4927g;
            fArr[i] = fArr[i] / f;
            i = this.f4926f[i];
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo5693i(C1601j jVar, float f) {
        if (f == 0.0f) {
            mo5690f(jVar, true);
            return;
        }
        int i = this.f4928h;
        if (i == -1) {
            this.f4928h = 0;
            this.f4927g[0] = f;
            this.f4925e[0] = jVar.f4969f;
            this.f4926f[0] = -1;
            jVar.f4979p++;
            jVar.mo5742a(this.f4922b);
            this.f4921a++;
            if (!this.f4930j) {
                int i2 = this.f4929i + 1;
                this.f4929i = i2;
                int[] iArr = this.f4925e;
                if (i2 >= iArr.length) {
                    this.f4930j = true;
                    this.f4929i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.f4921a) {
            int[] iArr2 = this.f4925e;
            int i5 = iArr2[i];
            int i6 = jVar.f4969f;
            if (i5 == i6) {
                this.f4927g[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i4 = i;
            }
            i = this.f4926f[i];
            i3++;
        }
        int i7 = this.f4929i;
        int i8 = i7 + 1;
        if (this.f4930j) {
            int[] iArr3 = this.f4925e;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f4925e;
        if (i7 >= iArr4.length && this.f4921a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f4925e;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.f4925e;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.f4924d * 2;
            this.f4924d = i10;
            this.f4930j = false;
            this.f4929i = i7 - 1;
            this.f4927g = Arrays.copyOf(this.f4927g, i10);
            this.f4925e = Arrays.copyOf(this.f4925e, this.f4924d);
            this.f4926f = Arrays.copyOf(this.f4926f, this.f4924d);
        }
        this.f4925e[i7] = jVar.f4969f;
        this.f4927g[i7] = f;
        int[] iArr7 = this.f4926f;
        if (i4 != -1) {
            iArr7[i7] = iArr7[i4];
            iArr7[i4] = i7;
        } else {
            iArr7[i7] = this.f4928h;
            this.f4928h = i7;
        }
        jVar.f4979p++;
        jVar.mo5742a(this.f4922b);
        int i11 = this.f4921a + 1;
        this.f4921a = i11;
        if (!this.f4930j) {
            this.f4929i++;
        }
        int[] iArr8 = this.f4925e;
        if (i11 >= iArr8.length) {
            this.f4930j = true;
        }
        if (this.f4929i >= iArr8.length) {
            this.f4930j = true;
            this.f4929i = iArr8.length - 1;
        }
    }

    /* renamed from: j */
    public void mo5694j() {
        int i = this.f4928h;
        int i2 = 0;
        while (i != -1 && i2 < this.f4921a) {
            float[] fArr = this.f4927g;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f4926f[i];
            i2++;
        }
    }

    /* renamed from: k */
    public int mo5695k() {
        return this.f4921a;
    }

    public String toString() {
        int i = this.f4928h;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.f4921a) {
            StringBuilder a = C0001b.m0a(C1142f.m3365a(str, " -> "));
            a.append(this.f4927g[i]);
            a.append(" : ");
            StringBuilder a2 = C0001b.m0a(a.toString());
            a2.append(((C1601j[]) this.f4923c.f4939d)[this.f4925e[i]]);
            str = a2.toString();
            i = this.f4926f[i];
            i2++;
        }
        return str;
    }
}
