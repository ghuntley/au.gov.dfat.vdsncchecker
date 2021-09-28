package p118t0;

import androidx.lifecycle.C0338a;
import androidx.lifecycle.C0341b;
import androidx.lifecycle.C0349f;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: t0.i */
public class C1775i {

    /* renamed from: a */
    public static Map<Class<?>, Integer> f5410a = new HashMap();

    /* renamed from: b */
    public static Map<Class<?>, List<Constructor<? extends C0341b>>> f5411b = new HashMap();

    /* renamed from: a */
    public static C0341b m4949a(Constructor<? extends C0341b> constructor, Object obj) {
        try {
            return (C0341b) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    public static String m4950b(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: c */
    public static int m4951c(Class<?> cls) {
        Constructor<?> constructor;
        Map<Class<?>, List<Constructor<? extends C0341b>>> map;
        boolean z;
        Integer num = (Integer) ((HashMap) f5410a).get(cls);
        if (num != null) {
            return num.intValue();
        }
        Class<C1772f> cls2 = C1772f.class;
        int i = 1;
        if (cls.getCanonicalName() != null) {
            List<?> list = null;
            try {
                Package packageR = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = packageR != null ? packageR.getName() : "";
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String b = m4950b(canonicalName);
                if (!name.isEmpty()) {
                    b = name + "." + b;
                }
                constructor = Class.forName(b).getDeclaredConstructor(new Class[]{cls});
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            if (constructor != null) {
                map = f5411b;
                list = Collections.singletonList(constructor);
            } else {
                C0338a aVar = C0338a.f1673c;
                Boolean bool = aVar.f1675b.get(cls);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                aVar.f1675b.put(cls, Boolean.FALSE);
                                z = false;
                                break;
                            } else if (((C0349f) declaredMethods[i2].getAnnotation(C0349f.class)) != null) {
                                aVar.mo1796a(cls, declaredMethods);
                                z = true;
                                break;
                            } else {
                                i2++;
                            }
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!z) {
                    Class<? super Object> superclass = cls.getSuperclass();
                    if (superclass != null && cls2.isAssignableFrom(superclass)) {
                        if (m4951c(superclass) != 1) {
                            list = new ArrayList<>((Collection) ((HashMap) f5411b).get(superclass));
                        }
                    }
                    Class[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            Class cls3 = interfaces[i3];
                            if (cls3 != null && cls2.isAssignableFrom(cls3)) {
                                if (m4951c(cls3) == 1) {
                                    break;
                                }
                                if (list == null) {
                                    list = new ArrayList<>();
                                }
                                list.addAll((Collection) ((HashMap) f5411b).get(cls3));
                            }
                            i3++;
                        } else if (list != null) {
                            map = f5411b;
                        }
                    }
                }
            }
            ((HashMap) map).put(cls, list);
            i = 2;
        }
        ((HashMap) f5410a).put(cls, Integer.valueOf(i));
        return i;
    }
}
