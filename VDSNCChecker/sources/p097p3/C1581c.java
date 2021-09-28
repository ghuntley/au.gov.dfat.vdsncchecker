package p097p3;

import p072l2.C1241e;

/* renamed from: p3.c */
public class C1581c extends C1582d {
    public C1581c(int i) {
        this(C1241e.m3522p("An unknown field for index ", Integer.valueOf(i)), 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1581c(String str, int i) {
        super(str);
        if (i != 2) {
            return;
        }
        C1241e.m3517j(str, "message");
        super(str);
    }

    public C1581c(String str, Throwable th) {
        super(str, (Throwable) null);
    }
}
