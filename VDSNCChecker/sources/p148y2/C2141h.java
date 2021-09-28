package p148y2;

import p025d3.C0803g;
import p025d3.C0810n;
import p072l2.C1241e;
import p138w2.C2043d;

/* renamed from: y2.h */
public abstract class C2141h extends C2135c implements C0803g<Object> {

    /* renamed from: h */
    public final int f6192h;

    public C2141h(int i, C2043d<Object> dVar) {
        super(dVar);
        this.f6192h = i;
    }

    /* renamed from: f */
    public int mo4041f() {
        return this.f6192h;
    }

    public String toString() {
        if (this.f6183e != null) {
            return super.toString();
        }
        String a = C0810n.f3120a.mo4051a(this);
        C1241e.m3516f(a, "Reflection.renderLambdaToString(this)");
        return a;
    }
}
