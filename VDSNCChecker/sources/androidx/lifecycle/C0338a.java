package androidx.lifecycle;

import androidx.lifecycle.C0342c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p000a.C0001b;
import p118t0.C1773g;

/* renamed from: androidx.lifecycle.a */
public final class C0338a {

    /* renamed from: c */
    public static C0338a f1673c = new C0338a();

    /* renamed from: a */
    public final Map<Class<?>, C0339a> f1674a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, Boolean> f1675b = new HashMap();

    /* renamed from: androidx.lifecycle.a$a */
    public static class C0339a {

        /* renamed from: a */
        public final Map<C0342c.C0344b, List<C0340b>> f1676a = new HashMap();

        /* renamed from: b */
        public final Map<C0340b, C0342c.C0344b> f1677b;

        public C0339a(Map<C0340b, C0342c.C0344b> map) {
            this.f1677b = map;
            for (Map.Entry next : map.entrySet()) {
                C0342c.C0344b bVar = (C0342c.C0344b) next.getValue();
                List list = this.f1676a.get(bVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f1676a.put(bVar, list);
                }
                list.add(next.getKey());
            }
        }

        /* renamed from: a */
        public static void m1007a(List<C0340b> list, C1773g gVar, C0342c.C0344b bVar, Object obj) {
            if (list != null) {
                int size = list.size() - 1;
                while (size >= 0) {
                    C0340b bVar2 = list.get(size);
                    Objects.requireNonNull(bVar2);
                    try {
                        int i = bVar2.f1678a;
                        if (i == 0) {
                            bVar2.f1679b.invoke(obj, new Object[0]);
                        } else if (i == 1) {
                            bVar2.f1679b.invoke(obj, new Object[]{gVar});
                        } else if (i == 2) {
                            bVar2.f1679b.invoke(obj, new Object[]{gVar, bVar});
                        }
                        size--;
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException("Failed to call observer method", e.getCause());
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.lifecycle.a$b */
    public static final class C0340b {

        /* renamed from: a */
        public final int f1678a;

        /* renamed from: b */
        public final Method f1679b;

        public C0340b(int i, Method method) {
            this.f1678a = i;
            this.f1679b = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0340b)) {
                return false;
            }
            C0340b bVar = (C0340b) obj;
            return this.f1678a == bVar.f1678a && this.f1679b.getName().equals(bVar.f1679b.getName());
        }

        public int hashCode() {
            return this.f1679b.getName().hashCode() + (this.f1678a * 31);
        }
    }

    /* renamed from: a */
    public final C0339a mo1796a(Class<?> cls, Method[] methodArr) {
        int i;
        C0339a b;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (b = mo1797b(superclass)) == null)) {
            hashMap.putAll(b.f1677b);
        }
        for (Class b2 : cls.getInterfaces()) {
            for (Map.Entry next : mo1797b(b2).f1677b.entrySet()) {
                mo1798c(hashMap, (C0340b) next.getKey(), (C0342c.C0344b) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            C0349f fVar = (C0349f) method.getAnnotation(C0349f.class);
            if (fVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C1773g.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0342c.C0344b value = fVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0342c.C0344b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C0342c.C0344b.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    mo1798c(hashMap, new C0340b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0339a aVar = new C0339a(hashMap);
        this.f1674a.put(cls, aVar);
        this.f1675b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: b */
    public C0339a mo1797b(Class<?> cls) {
        C0339a aVar = this.f1674a.get(cls);
        return aVar != null ? aVar : mo1796a(cls, (Method[]) null);
    }

    /* renamed from: c */
    public final void mo1798c(Map<C0340b, C0342c.C0344b> map, C0340b bVar, C0342c.C0344b bVar2, Class<?> cls) {
        C0342c.C0344b bVar3 = map.get(bVar);
        if (bVar3 != null && bVar2 != bVar3) {
            Method method = bVar.f1679b;
            StringBuilder a = C0001b.m0a("Method ");
            a.append(method.getName());
            a.append(" in ");
            a.append(cls.getName());
            a.append(" already declared with different @OnLifecycleEvent value: previous value ");
            a.append(bVar3);
            a.append(", new value ");
            a.append(bVar2);
            throw new IllegalArgumentException(a.toString());
        } else if (bVar3 == null) {
            map.put(bVar, bVar2);
        }
    }
}
