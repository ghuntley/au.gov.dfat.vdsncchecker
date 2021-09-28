package p098p4;

import androidx.appcompat.widget.C0131a0;
import java.io.IOException;
import java.util.concurrent.ConcurrentMap;
import p000a.C0001b;
import p074l4.C1340b0;
import p074l4.C1345d;
import p074l4.C1348e;
import p074l4.C1358g1;
import p074l4.C1377n;
import p074l4.C1380o;
import p074l4.C1384p;
import p074l4.C1393s;
import p074l4.C1399u;
import p074l4.C1409x0;
import p075m.C1417c;
import p086n4.C1484c;

/* renamed from: p4.c */
public class C1585c extends C1377n implements C1345d {

    /* renamed from: e */
    public C1348e f4915e;

    /* renamed from: f */
    public int f4916f;

    public C1585c(int i, C1348e eVar) {
        this.f4915e = eVar;
        this.f4916f = i;
    }

    /* renamed from: i */
    public static C1585c m4430i(Object obj) {
        C1409x0 x0Var;
        C1380o oVar;
        if (obj == null || (obj instanceof C1585c)) {
            return (C1585c) obj;
        }
        if (obj instanceof C1340b0) {
            C1340b0 b0Var = (C1340b0) obj;
            int i = b0Var.f4358e;
            switch (i) {
                case 0:
                case 3:
                case 5:
                    return new C1585c(i, C1399u.m4011r(b0Var, false));
                case 1:
                case 2:
                case 6:
                    C1393s r = b0Var.mo5163r();
                    if (r instanceof C1409x0) {
                        x0Var = C1409x0.m4045q(r);
                    } else {
                        x0Var = new C1409x0(C1384p.m3959q(r).f4424e);
                    }
                    return new C1585c(i, x0Var);
                case 4:
                    C1417c cVar = C1484c.f4632j;
                    return new C1585c(i, C1484c.m4177i(C1399u.m4011r(b0Var, true)));
                case 7:
                    return new C1585c(i, C1384p.m3960r(b0Var, false));
                case 8:
                    ConcurrentMap<C1380o.C1381a, C1380o> concurrentMap = C1380o.f4415g;
                    C1393s r2 = b0Var.mo5163r();
                    if (r2 instanceof C1380o) {
                        oVar = C1380o.m3942t(r2);
                    } else {
                        oVar = C1380o.m3941r(C1384p.m3959q(r2).f4424e);
                    }
                    return new C1585c(i, oVar);
                default:
                    throw new IllegalArgumentException(C0131a0.m344a("unknown tag: ", i));
            }
        } else if (obj instanceof byte[]) {
            try {
                return m4430i(C1393s.m3981m((byte[]) obj));
            } catch (IOException unused) {
                throw new IllegalArgumentException("unable to parse encoded general name");
            }
        } else {
            StringBuilder a = C0001b.m0a("unknown object in getInstance: ");
            a.append(obj.getClass().getName());
            throw new IllegalArgumentException(a.toString());
        }
    }

    /* renamed from: c */
    public C1393s mo5171c() {
        int i = this.f4916f;
        return new C1358g1(i == 4, i, this.f4915e, 0);
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f4916f);
        stringBuffer.append(": ");
        int i = this.f4916f;
        if (!(i == 1 || i == 2)) {
            if (i == 4) {
                str = C1484c.m4177i(this.f4915e).toString();
            } else if (i != 6) {
                str = this.f4915e.toString();
            }
            stringBuffer.append(str);
            return stringBuffer.toString();
        }
        str = C1409x0.m4045q(this.f4915e).mo5158d();
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
