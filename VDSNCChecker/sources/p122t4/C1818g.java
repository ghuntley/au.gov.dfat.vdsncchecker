package p122t4;

import p000a.C0001b;

/* renamed from: t4.g */
public class C1818g {

    /* renamed from: e */
    public static final char[] f5482e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    /* renamed from: a */
    public final char[] f5483a = new char[25];

    /* renamed from: b */
    public int f5484b = 0;

    /* renamed from: c */
    public int f5485c;

    /* renamed from: d */
    public boolean f5486d = false;

    /* renamed from: a */
    public void mo6157a(char c) {
        char[] cArr = this.f5483a;
        int i = this.f5484b;
        this.f5484b = i + 1;
        cArr[i] = c;
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("[chars:");
        a.append(new String(this.f5483a, 0, this.f5484b));
        a.append(", point:");
        a.append(this.f5485c);
        a.append("]");
        return a.toString();
    }
}
