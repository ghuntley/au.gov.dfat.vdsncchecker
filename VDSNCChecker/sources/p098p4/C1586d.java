package p098p4;

import p074l4.C1347d1;
import p074l4.C1348e;
import p074l4.C1377n;
import p074l4.C1393s;
import p074l4.C1399u;
import p104q4.C1630e;

/* renamed from: p4.d */
public class C1586d extends C1377n {

    /* renamed from: e */
    public final C1585c[] f4917e;

    public C1586d(C1399u uVar) {
        this.f4917e = new C1585c[uVar.size()];
        for (int i = 0; i != uVar.size(); i++) {
            this.f4917e[i] = C1585c.m4430i(uVar.mo5228s(i));
        }
    }

    /* renamed from: c */
    public C1393s mo5171c() {
        return new C1347d1((C1348e[]) this.f4917e);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = C1630e.f5006a;
        stringBuffer.append("GeneralNames:");
        stringBuffer.append(str);
        for (int i = 0; i != this.f4917e.length; i++) {
            stringBuffer.append("    ");
            stringBuffer.append(this.f4917e[i]);
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }
}
