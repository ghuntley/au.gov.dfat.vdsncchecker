package p136w0;

import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import p019c3.C0625a;
import p025d3.C0799c;
import p055i3.C1035b;
import p072l2.C1241e;
import p093p.C1545a;
import p120t2.C1790d;
import p120t2.C1795h;
import p136w0.C2000c;

/* renamed from: w0.d */
public final class C2001d<Args extends C2000c> implements C1790d<Args> {

    /* renamed from: e */
    public Args f5812e;

    /* renamed from: f */
    public final C1035b<Args> f5813f;

    /* renamed from: g */
    public final C0625a<Bundle> f5814g;

    public C2001d(C1035b<Args> bVar, C0625a<Bundle> aVar) {
        this.f5813f = bVar;
        this.f5814g = aVar;
    }

    public Object getValue() {
        Args args = this.f5812e;
        if (args != null) {
            return args;
        }
        Bundle b = this.f5814g.mo40b();
        Class<Bundle>[] clsArr = C2002e.f5815a;
        C1545a<C1035b<? extends C2000c>, Method> aVar = C2002e.f5816b;
        Method method = aVar.get(this.f5813f);
        if (method == null) {
            C1035b<Args> bVar = this.f5813f;
            C1241e.m3517j(bVar, "$this$java");
            Class<?> b2 = ((C0799c) bVar).mo4036b();
            Objects.requireNonNull(b2, "null cannot be cast to non-null type java.lang.Class<T>");
            Class<Bundle>[] clsArr2 = C2002e.f5815a;
            method = b2.getMethod("fromBundle", (Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
            aVar.put(this.f5813f, method);
            C1241e.m3514d(method, "navArgsClass.java.getMet…hod\n                    }");
        }
        Args invoke = method.invoke((Object) null, new Object[]{b});
        if (invoke != null) {
            Args args2 = (C2000c) invoke;
            this.f5812e = args2;
            return args2;
        }
        throw new C1795h("null cannot be cast to non-null type Args");
    }
}
