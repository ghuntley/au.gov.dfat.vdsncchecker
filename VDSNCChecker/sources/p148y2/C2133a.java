package p148y2;

import java.io.Serializable;
import p000a.C0001b;
import p120t2.C1798k;
import p138w2.C2043d;

/* renamed from: y2.a */
public abstract class C2133a implements C2043d<Object>, C2136d, Serializable {

    /* renamed from: e */
    public final C2043d<Object> f6183e;

    public C2133a(C2043d<Object> dVar) {
        this.f6183e = dVar;
    }

    /* renamed from: a */
    public C2043d<C1798k> mo4785a(Object obj, C2043d<?> dVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.StackTraceElement mo6671c() {
        /*
            r9 = this;
            java.lang.String r0 = "$this$getStackTraceElementImpl"
            p072l2.C1241e.m3517j(r9, r0)
            java.lang.Class r0 = r9.getClass()
            java.lang.Class<y2.e> r1 = p148y2.C2137e.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            y2.e r0 = (p148y2.C2137e) r0
            r1 = 0
            if (r0 == 0) goto L_0x0126
            int r2 = r0.mo6679v()
            r3 = 1
            if (r2 > r3) goto L_0x00fe
            r2 = 0
            r4 = -1
            java.lang.Class r5 = r9.getClass()     // Catch:{ Exception -> 0x0044 }
            java.lang.String r6 = "label"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r6 = "field"
            p072l2.C1241e.m3516f(r5, r6)     // Catch:{ Exception -> 0x0044 }
            r5.setAccessible(r3)     // Catch:{ Exception -> 0x0044 }
            java.lang.Object r5 = r5.get(r9)     // Catch:{ Exception -> 0x0044 }
            boolean r6 = r5 instanceof java.lang.Integer     // Catch:{ Exception -> 0x0044 }
            if (r6 != 0) goto L_0x0038
            r5 = r1
        L_0x0038:
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x0044 }
            if (r5 == 0) goto L_0x0041
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x0044 }
            goto L_0x0042
        L_0x0041:
            r5 = r2
        L_0x0042:
            int r5 = r5 - r3
            goto L_0x0045
        L_0x0044:
            r5 = r4
        L_0x0045:
            if (r5 >= 0) goto L_0x0048
            goto L_0x004e
        L_0x0048:
            int[] r3 = r0.mo6677l()
            r4 = r3[r5]
        L_0x004e:
            java.lang.String r3 = "continuation"
            p072l2.C1241e.m3517j(r9, r3)
            y2.f$a r3 = p148y2.C2138f.f6188b
            if (r3 == 0) goto L_0x0058
            goto L_0x009b
        L_0x0058:
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            java.lang.String r5 = "getModule"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0097 }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r5, r6)     // Catch:{ Exception -> 0x0097 }
            java.lang.Class r5 = r9.getClass()     // Catch:{ Exception -> 0x0097 }
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r6 = "java.lang.Module"
            java.lang.Class r5 = r5.loadClass(r6)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r6 = "getDescriptor"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0097 }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)     // Catch:{ Exception -> 0x0097 }
            java.lang.Class r6 = r9.getClass()     // Catch:{ Exception -> 0x0097 }
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r7 = "java.lang.module.ModuleDescriptor"
            java.lang.Class r6 = r6.loadClass(r7)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r7 = "name"
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0097 }
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r7, r8)     // Catch:{ Exception -> 0x0097 }
            y2.f$a r7 = new y2.f$a     // Catch:{ Exception -> 0x0097 }
            r7.<init>(r3, r5, r6)     // Catch:{ Exception -> 0x0097 }
            p148y2.C2138f.f6188b = r7     // Catch:{ Exception -> 0x0097 }
            r3 = r7
            goto L_0x009b
        L_0x0097:
            y2.f$a r3 = p148y2.C2138f.f6187a
            p148y2.C2138f.f6188b = r3
        L_0x009b:
            y2.f$a r5 = p148y2.C2138f.f6187a
            if (r3 != r5) goto L_0x00a0
            goto L_0x00d0
        L_0x00a0:
            java.lang.reflect.Method r5 = r3.f6189a
            if (r5 == 0) goto L_0x00d0
            java.lang.Class r6 = r9.getClass()
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Object r5 = r5.invoke(r6, r7)
            if (r5 == 0) goto L_0x00d0
            java.lang.reflect.Method r6 = r3.f6190b
            if (r6 == 0) goto L_0x00d0
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Object r5 = r6.invoke(r5, r7)
            if (r5 == 0) goto L_0x00d0
            java.lang.reflect.Method r3 = r3.f6191c
            if (r3 == 0) goto L_0x00c7
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r2 = r3.invoke(r5, r2)
            goto L_0x00c8
        L_0x00c7:
            r2 = r1
        L_0x00c8:
            boolean r3 = r2 instanceof java.lang.String
            if (r3 != 0) goto L_0x00cd
            goto L_0x00ce
        L_0x00cd:
            r1 = r2
        L_0x00ce:
            java.lang.String r1 = (java.lang.String) r1
        L_0x00d0:
            if (r1 != 0) goto L_0x00d7
            java.lang.String r1 = r0.mo6675c()
            goto L_0x00ef
        L_0x00d7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r1 = 47
            r2.append(r1)
            java.lang.String r1 = r0.mo6675c()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x00ef:
            java.lang.StackTraceElement r2 = new java.lang.StackTraceElement
            java.lang.String r3 = r0.mo6678m()
            java.lang.String r0 = r0.mo6676f()
            r2.<init>(r1, r3, r0, r4)
            r1 = r2
            goto L_0x0126
        L_0x00fe:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Debug metadata version mismatch. Expected: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ", got "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ". Please update the Kotlin standard library."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0126:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p148y2.C2133a.mo6671c():java.lang.StackTraceElement");
    }

    /* renamed from: e */
    public C2136d mo5040e() {
        C2043d<Object> dVar = this.f6183e;
        if (!(dVar instanceof C2136d)) {
            dVar = null;
        }
        return (C2136d) dVar;
    }

    /* renamed from: g */
    public abstract Object mo4587g(Object obj);

    /* renamed from: h */
    public void mo6672h() {
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [w2.d<java.lang.Object>, w2.d, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5013j(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r3
        L_0x0001:
            java.lang.String r1 = "frame"
            p072l2.C1241e.m3517j(r0, r1)
            w2.d<java.lang.Object> r1 = r0.f6183e
            p072l2.C1241e.m3515e(r1)
            java.lang.Object r4 = r0.mo4587g(r4)     // Catch:{ all -> 0x0014 }
            x2.a r2 = p143x2.C2124a.COROUTINE_SUSPENDED     // Catch:{ all -> 0x0014 }
            if (r4 != r2) goto L_0x0019
            return
        L_0x0014:
            r4 = move-exception
            java.lang.Object r4 = p042g2.C0955a.m2736j(r4)
        L_0x0019:
            r0.mo6672h()
            boolean r0 = r1 instanceof p148y2.C2133a
            if (r0 == 0) goto L_0x0024
            r0 = r1
            y2.a r0 = (p148y2.C2133a) r0
            goto L_0x0001
        L_0x0024:
            r1.mo5013j(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148y2.C2133a.mo5013j(java.lang.Object):void");
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("Continuation at ");
        Object c = mo6671c();
        if (c == null) {
            c = getClass().getName();
        }
        a.append(c);
        return a.toString();
    }
}
