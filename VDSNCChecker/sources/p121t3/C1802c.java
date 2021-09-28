package p121t3;

import p000a.C0001b;
import p072l2.C1241e;

/* renamed from: t3.c */
public final class C1802c {

    /* renamed from: a */
    public final boolean f5452a;

    /* renamed from: b */
    public final boolean f5453b;

    /* renamed from: c */
    public final boolean f5454c;

    /* renamed from: d */
    public final boolean f5455d;

    /* renamed from: e */
    public final boolean f5456e;

    /* renamed from: f */
    public final String f5457f;

    /* renamed from: g */
    public final boolean f5458g;

    /* renamed from: h */
    public final boolean f5459h;

    /* renamed from: i */
    public final String f5460i;

    /* renamed from: j */
    public final boolean f5461j;

    /* renamed from: k */
    public final boolean f5462k;

    public C1802c(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, boolean z6, boolean z7, String str2, boolean z8, boolean z9, int i) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        z3 = (i & 4) != 0 ? false : z3;
        z4 = (i & 8) != 0 ? false : z4;
        z5 = (i & 16) != 0 ? false : z5;
        String str3 = null;
        String str4 = (i & 32) != 0 ? "    " : null;
        z6 = (i & 64) != 0 ? false : z6;
        z7 = (i & 128) != 0 ? false : z7;
        str3 = (i & 256) != 0 ? "type" : str3;
        z8 = (i & 512) != 0 ? false : z8;
        z9 = (i & 1024) != 0 ? true : z9;
        C1241e.m3517j(str4, "prettyPrintIndent");
        C1241e.m3517j(str3, "classDiscriminator");
        this.f5452a = z;
        this.f5453b = z2;
        this.f5454c = z3;
        this.f5455d = z4;
        this.f5456e = z5;
        this.f5457f = str4;
        this.f5458g = z6;
        this.f5459h = z7;
        this.f5460i = str3;
        this.f5461j = z8;
        this.f5462k = z9;
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("JsonConfiguration(encodeDefaults=");
        a.append(this.f5452a);
        a.append(", ignoreUnknownKeys=");
        a.append(this.f5453b);
        a.append(", isLenient=");
        a.append(this.f5454c);
        a.append(", allowStructuredMapKeys=");
        a.append(this.f5455d);
        a.append(", prettyPrint=");
        a.append(this.f5456e);
        a.append(", prettyPrintIndent='");
        a.append(this.f5457f);
        a.append("', coerceInputValues=");
        a.append(this.f5458g);
        a.append(", useArrayPolymorphism=");
        a.append(this.f5459h);
        a.append(", classDiscriminator='");
        a.append(this.f5460i);
        a.append("', allowSpecialFloatingPointValues=");
        a.append(this.f5461j);
        a.append(')');
        return a.toString();
    }
}
