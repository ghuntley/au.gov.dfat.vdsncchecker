package p014b4;

import p062j4.C1114h;
import p072l2.C1241e;
import p139w3.C2079i0;
import p139w3.C2111z;

/* renamed from: b4.h */
public final class C0549h extends C2079i0 {

    /* renamed from: e */
    public final String f2347e;

    /* renamed from: f */
    public final long f2348f;

    /* renamed from: g */
    public final C1114h f2349g;

    public C0549h(String str, long j, C1114h hVar) {
        this.f2347e = str;
        this.f2348f = j;
        this.f2349g = hVar;
    }

    /* renamed from: a */
    public long mo2693a() {
        return this.f2348f;
    }

    /* renamed from: c */
    public C2111z mo2694c() {
        String str = this.f2347e;
        if (str == null) {
            return null;
        }
        C2111z.C2112a aVar = C2111z.f6136f;
        C1241e.m3517j(str, "$this$toMediaTypeOrNull");
        try {
            return C2111z.C2112a.m5503a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public C1114h mo2695g() {
        return this.f2349g;
    }
}
