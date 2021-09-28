package p025d3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p019c3.C0625a;
import p019c3.C0626b;
import p019c3.C0627c;
import p019c3.C0628d;
import p019c3.C0629e;
import p019c3.C0630f;
import p019c3.C0631g;
import p019c3.C0632h;
import p019c3.C0633i;
import p019c3.C0634j;
import p019c3.C0635k;
import p019c3.C0636l;
import p019c3.C0637m;
import p019c3.C0638n;
import p019c3.C0639o;
import p019c3.C0640p;
import p019c3.C0641q;
import p019c3.C0642r;
import p019c3.C0643s;
import p019c3.C0644t;
import p019c3.C0645u;
import p019c3.C0646v;
import p019c3.C0647w;
import p042g2.C0955a;
import p055i3.C1035b;
import p067k3.C1209l;
import p072l2.C1241e;
import p120t2.C1787a;
import p120t2.C1791e;
import p126u2.C1845f;
import p126u2.C1846g;
import p126u2.C1853n;
import p126u2.C1857r;

/* renamed from: d3.d */
public final class C0800d implements C1035b<Object>, C0799c {

    /* renamed from: b */
    public static final Map<Class<? extends C1787a<?>>, Integer> f3110b;

    /* renamed from: c */
    public static final Map<String, String> f3111c;

    /* renamed from: a */
    public final Class<?> f3112a;

    static {
        Map<Class<? extends C1787a<?>>, Integer> map;
        List H = C1845f.m5041H(new Class[]{C0625a.class, C0636l.class, C0640p.class, C0641q.class, C0642r.class, C0643s.class, C0644t.class, C0645u.class, C0646v.class, C0647w.class, C0626b.class, C0627c.class, C0628d.class, C0629e.class, C0630f.class, C0631g.class, C0632h.class, C0633i.class, C0634j.class, C0635k.class, C0637m.class, C0638n.class, C0639o.class});
        ArrayList arrayList = new ArrayList(C1846g.m5046H(H, 10));
        int i = 0;
        for (Object next : H) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new C1791e((Class) next, Integer.valueOf(i)));
                i = i2;
            } else {
                C0955a.m2723D();
                throw null;
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            map = C1853n.f5543e;
        } else if (size != 1) {
            map = new LinkedHashMap<>(C0955a.m2749w(arrayList.size()));
            C1857r.m5061I(arrayList, map);
        } else {
            C1791e eVar = (C1791e) arrayList.get(0);
            C1241e.m3517j(eVar, "pair");
            map = Collections.singletonMap(eVar.f5439e, eVar.f5440f);
            C1241e.m3516f(map, "java.util.Collections.si…(pair.first, pair.second)");
        }
        f3110b = map;
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C1241e.m3516f(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            C1241e.m3516f(str, "kotlinName");
            sb.append(C1209l.m3454i0(str, '.', (String) null, 2));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str + ".Companion");
        }
        for (Map.Entry next2 : f3110b.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            hashMap3.put(((Class) next2.getKey()).getName(), "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C0955a.m2749w(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), C1209l.m3454i0((String) entry.getValue(), '.', (String) null, 2));
        }
        f3111c = linkedHashMap;
    }

    public C0800d(Class<?> cls) {
        C1241e.m3517j(cls, "jClass");
        this.f3112a = cls;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo4037a() {
        /*
            r6 = this;
            java.lang.Class<?> r0 = r6.f3112a
            java.lang.String r1 = "jClass"
            p072l2.C1241e.m3517j(r0, r1)
            boolean r1 = r0.isAnonymousClass()
            java.lang.String r2 = "Array"
            r3 = 0
            if (r1 == 0) goto L_0x0013
        L_0x0010:
            r2 = r3
            goto L_0x00c6
        L_0x0013:
            boolean r1 = r0.isLocalClass()
            if (r1 == 0) goto L_0x0083
            java.lang.String r2 = r0.getSimpleName()
            java.lang.reflect.Method r1 = r0.getEnclosingMethod()
            r4 = 2
            java.lang.String r5 = "$"
            if (r1 == 0) goto L_0x003a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            goto L_0x0053
        L_0x003a:
            java.lang.reflect.Constructor r0 = r0.getEnclosingConstructor()
            if (r0 == 0) goto L_0x0058
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
        L_0x0053:
            java.lang.String r0 = p067k3.C1209l.m3453h0(r2, r0, r3, r4)
            goto L_0x0059
        L_0x0058:
            r0 = r3
        L_0x0059:
            if (r0 == 0) goto L_0x005d
            r2 = r0
            goto L_0x00c6
        L_0x005d:
            r0 = 36
            java.lang.String r1 = "$this$substringAfter"
            p072l2.C1241e.m3517j(r2, r1)
            java.lang.String r1 = "missingDelimiterValue"
            p072l2.C1241e.m3517j(r2, r1)
            r1 = 0
            r3 = 6
            int r0 = p067k3.C1209l.m3444Y(r2, r0, r1, r1, r3)
            r1 = -1
            if (r0 != r1) goto L_0x0073
            goto L_0x00c6
        L_0x0073:
            int r0 = r0 + 1
            int r1 = r2.length()
            java.lang.String r2 = r2.substring(r0, r1)
            java.lang.String r0 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p072l2.C1241e.m3516f(r2, r0)
            goto L_0x00c6
        L_0x0083:
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x00b0
            java.lang.Class r0 = r0.getComponentType()
            java.lang.String r1 = "componentType"
            p072l2.C1241e.m3516f(r0, r1)
            boolean r1 = r0.isPrimitive()
            if (r1 == 0) goto L_0x00ac
            java.util.Map<java.lang.String, java.lang.String> r1 = f3111c
            java.lang.String r0 = r0.getName()
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x00ac
            java.lang.String r3 = p063k.C1142f.m3365a(r0, r2)
        L_0x00ac:
            if (r3 == 0) goto L_0x00c6
            goto L_0x0010
        L_0x00b0:
            java.util.Map<java.lang.String, java.lang.String> r1 = f3111c
            java.lang.String r2 = r0.getName()
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r1 = r1.get(r2)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00c2
            goto L_0x00c6
        L_0x00c2:
            java.lang.String r2 = r0.getSimpleName()
        L_0x00c6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p025d3.C0800d.mo4037a():java.lang.String");
    }

    /* renamed from: b */
    public Class<?> mo4036b() {
        return this.f3112a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0800d) && C1241e.m3513b(C0955a.m2741o(this), C0955a.m2741o((C1035b) obj));
    }

    public int hashCode() {
        return C0955a.m2741o(this).hashCode();
    }

    public String toString() {
        return this.f3112a.toString() + " (Kotlin reflection is not available)";
    }
}
