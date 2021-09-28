package p127u3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import p072l2.C1241e;
import p121t3.C1801b;
import p121t3.C1802c;
import p121t3.C1804e;
import p121t3.C1805f;
import p121t3.C1807h;
import p121t3.C1808i;
import p121t3.C1810j;

/* renamed from: u3.j */
public final class C1870j {

    /* renamed from: a */
    public final C1863e f5567a;

    /* renamed from: b */
    public final boolean f5568b;

    public C1870j(C1802c cVar, C1863e eVar) {
        C1241e.m3517j(cVar, "configuration");
        C1241e.m3517j(eVar, "lexer");
        this.f5567a = eVar;
        this.f5568b = cVar.f5454c;
    }

    /* renamed from: a */
    public final C1804e mo6394a() {
        byte m = this.f5567a.mo6387m();
        if (m == 1) {
            return mo6395b(true);
        }
        if (m == 0) {
            return mo6395b(false);
        }
        if (m == 6) {
            byte d = this.f5567a.mo6379d((byte) 6);
            if (this.f5567a.mo6387m() != 4) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (this.f5567a.mo6376a()) {
                    String g = this.f5568b ? this.f5567a.mo6382g() : this.f5567a.mo6381f();
                    this.f5567a.mo6379d((byte) 5);
                    linkedHashMap.put(g, mo6394a());
                    d = this.f5567a.mo6378c();
                    if (d != 4 && d != 7) {
                        C1863e.m5080k(this.f5567a, "Expected end of the object or comma", 0, 2);
                        throw null;
                    }
                }
                if (d == 6) {
                    this.f5567a.mo6379d((byte) 7);
                } else if (d == 4) {
                    C1863e.m5080k(this.f5567a, "Unexpected trailing comma", 0, 2);
                    throw null;
                }
                return new C1808i(linkedHashMap);
            }
            C1863e.m5080k(this.f5567a, "Unexpected leading comma", 0, 2);
            throw null;
        } else if (m == 8) {
            byte c = this.f5567a.mo6378c();
            if (this.f5567a.mo6387m() != 4) {
                ArrayList arrayList = new ArrayList();
                while (this.f5567a.mo6376a()) {
                    arrayList.add(mo6394a());
                    c = this.f5567a.mo6378c();
                    if (c != 4) {
                        C1863e eVar = this.f5567a;
                        boolean z = c == 9;
                        int i = eVar.f5552b;
                        if (!z) {
                            eVar.mo6384i("Expected end of the array or comma", i);
                            throw null;
                        }
                    }
                }
                if (c == 8) {
                    this.f5567a.mo6379d((byte) 9);
                } else if (c == 4) {
                    C1863e.m5080k(this.f5567a, "Unexpected trailing comma", 0, 2);
                    throw null;
                }
                return new C1801b(arrayList);
            }
            C1863e.m5080k(this.f5567a, "Unexpected leading comma", 0, 2);
            throw null;
        } else {
            C1863e.m5080k(this.f5567a, "Can't begin reading element, unexpected token", 0, 2);
            throw null;
        }
    }

    /* renamed from: b */
    public final C1810j mo6395b(boolean z) {
        String g = (this.f5568b || !z) ? this.f5567a.mo6382g() : this.f5567a.mo6381f();
        return (z || !C1241e.m3513b(g, "null")) ? new C1805f(g, z) : C1807h.f5465a;
    }
}
