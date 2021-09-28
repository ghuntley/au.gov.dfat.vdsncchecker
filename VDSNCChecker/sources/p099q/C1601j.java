package p099q;

import java.util.Arrays;
import p000a.C0001b;

/* renamed from: q.j */
public class C1601j implements Comparable<C1601j> {

    /* renamed from: q */
    public static int f4967q = 1;

    /* renamed from: e */
    public boolean f4968e;

    /* renamed from: f */
    public int f4969f = -1;

    /* renamed from: g */
    public int f4970g = -1;

    /* renamed from: h */
    public int f4971h = 0;

    /* renamed from: i */
    public float f4972i;

    /* renamed from: j */
    public boolean f4973j = false;

    /* renamed from: k */
    public float[] f4974k = new float[9];

    /* renamed from: l */
    public float[] f4975l = new float[9];

    /* renamed from: m */
    public int f4976m;

    /* renamed from: n */
    public C1590c[] f4977n = new C1590c[16];

    /* renamed from: o */
    public int f4978o = 0;

    /* renamed from: p */
    public int f4979p = 0;

    public C1601j(int i) {
        this.f4976m = i;
    }

    /* renamed from: a */
    public final void mo5742a(C1590c cVar) {
        int i = 0;
        while (true) {
            int i2 = this.f4978o;
            if (i >= i2) {
                C1590c[] cVarArr = this.f4977n;
                if (i2 >= cVarArr.length) {
                    this.f4977n = (C1590c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
                }
                C1590c[] cVarArr2 = this.f4977n;
                int i3 = this.f4978o;
                cVarArr2[i3] = cVar;
                this.f4978o = i3 + 1;
                return;
            } else if (this.f4977n[i] != cVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo5743b(C1590c cVar) {
        int i = this.f4978o;
        int i2 = 0;
        while (i2 < i) {
            if (this.f4977n[i2] == cVar) {
                while (i2 < i - 1) {
                    C1590c[] cVarArr = this.f4977n;
                    int i3 = i2 + 1;
                    cVarArr[i2] = cVarArr[i3];
                    i2 = i3;
                }
                this.f4978o--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: c */
    public void mo5744c() {
        this.f4976m = 5;
        this.f4971h = 0;
        this.f4969f = -1;
        this.f4970g = -1;
        this.f4972i = 0.0f;
        this.f4973j = false;
        int i = this.f4978o;
        for (int i2 = 0; i2 < i; i2++) {
            this.f4977n[i2] = null;
        }
        this.f4978o = 0;
        this.f4979p = 0;
        this.f4968e = false;
        Arrays.fill(this.f4975l, 0.0f);
    }

    public int compareTo(Object obj) {
        return this.f4969f - ((C1601j) obj).f4969f;
    }

    /* renamed from: d */
    public void mo5746d(C1593e eVar, float f) {
        this.f4972i = f;
        this.f4973j = true;
        int i = this.f4978o;
        this.f4970g = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f4977n[i2].mo5709k(eVar, this, false);
        }
        this.f4978o = 0;
    }

    /* renamed from: e */
    public final void mo5747e(C1593e eVar, C1590c cVar) {
        int i = this.f4978o;
        for (int i2 = 0; i2 < i; i2++) {
            this.f4977n[i2].mo5710l(eVar, cVar, false);
        }
        this.f4978o = 0;
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("");
        a.append(this.f4969f);
        return a.toString();
    }
}
