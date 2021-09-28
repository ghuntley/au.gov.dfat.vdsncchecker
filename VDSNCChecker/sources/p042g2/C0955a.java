package p042g2;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p018c2.C0624a;
import p019c3.C0625a;
import p019c3.C0640p;
import p025d3.C0799c;
import p049h3.C1013a;
import p049h3.C1015c;
import p055i3.C1035b;
import p058j0.C1061o;
import p058j0.C1070q;
import p072l2.C1240d;
import p072l2.C1241e;
import p072l2.C1242f;
import p072l2.C1246h;
import p114s2.C1713d;
import p120t2.C1790d;
import p120t2.C1792f;
import p120t2.C1794g;
import p120t2.C1798k;
import p126u2.C1852m;
import p128u4.C1881a0;
import p128u4.C1896f;
import p128u4.C1908i;
import p129v.C1960d;
import p138w2.C2043d;
import p138w2.C2046f;
import p138w2.C2051h;
import p139w3.C2079i0;
import p139w3.C2103w;
import p143x2.C2125b;
import p143x2.C2126c;
import p148y2.C2133a;
import p153z2.C2204b;

/* renamed from: g2.a */
public class C0955a {
    /* renamed from: A */
    public static void m2720A(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C1242f) {
            C1242f fVar = (C1242f) background;
            C1242f.C1244b bVar = fVar.f4164e;
            if (bVar.f4201o != f) {
                bVar.f4201o = f;
                fVar.mo4984w();
            }
        }
    }

    /* renamed from: B */
    public static void m2721B(View view, C1242f fVar) {
        C0624a aVar = fVar.f4164e.f4188b;
        if (aVar != null && aVar.f2493a) {
            float f = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                f += ((View) parent).getElevation();
            }
            C1242f.C1244b bVar = fVar.f4164e;
            if (bVar.f4200n != f) {
                bVar.f4200n = f;
                fVar.mo4984w();
            }
        }
    }

    /* renamed from: C */
    public static final C1013a m2722C(C1013a aVar, int i) {
        C1241e.m3517j(aVar, "$this$step");
        boolean z = i > 0;
        Integer valueOf = Integer.valueOf(i);
        C1241e.m3517j(valueOf, "step");
        if (z) {
            int i2 = aVar.f3728e;
            int i3 = aVar.f3729f;
            if (aVar.f3730g <= 0) {
                i = -i;
            }
            return new C1013a(i2, i3, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    /* renamed from: D */
    public static final void m2723D() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* renamed from: E */
    public static final void m2724E(Object obj) {
        if (obj instanceof C1792f.C1793a) {
            throw ((C1792f.C1793a) obj).f5441e;
        }
    }

    /* renamed from: F */
    public static final <K, V> Map<K, V> m2725F(Map<? extends K, ? extends V> map) {
        Map.Entry next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        C1241e.m3516f(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    /* renamed from: G */
    public static final C1015c m2726G(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new C1015c(i, i2 - 1);
        }
        C1015c cVar = C1015c.f3736i;
        return C1015c.f3735h;
    }

    /* renamed from: a */
    public static final void m2727a(Throwable th, Throwable th2) {
        C1241e.m3517j(th, "$this$addSuppressed");
        C1241e.m3517j(th2, "exception");
        if (th != th2) {
            C2204b.f6332a.mo7a(th, th2);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [c3.l, c3.l<? super T, ? extends java.lang.CharSequence>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void m2728b(java.lang.Appendable r0, T r1, p019c3.C0636l<? super T, ? extends java.lang.CharSequence> r2) {
        /*
            if (r2 == 0) goto L_0x0007
            java.lang.Object r1 = r2.mo2828m(r1)
            goto L_0x000f
        L_0x0007:
            if (r1 == 0) goto L_0x000c
            boolean r2 = r1 instanceof java.lang.CharSequence
            goto L_0x000d
        L_0x000c:
            r2 = 1
        L_0x000d:
            if (r2 == 0) goto L_0x0012
        L_0x000f:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto L_0x0024
        L_0x0012:
            boolean r2 = r1 instanceof java.lang.Character
            if (r2 == 0) goto L_0x0020
            java.lang.Character r1 = (java.lang.Character) r1
            char r1 = r1.charValue()
            r0.append(r1)
            goto L_0x0027
        L_0x0020:
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L_0x0024:
            r0.append(r1)
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p042g2.C0955a.m2728b(java.lang.Appendable, java.lang.Object, c3.l):void");
    }

    /* renamed from: c */
    public static final int m2729c(int i) {
        if (2 <= i && 36 >= i) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C1015c(2, 36));
    }

    /* renamed from: d */
    public static final void m2730d(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                m2727a(th, th2);
            }
        }
    }

    /* renamed from: e */
    public static final int m2731e(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* renamed from: f */
    public static final <T extends Comparable<?>> int m2732f(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    /* renamed from: g */
    public static C1960d m2733g(int i) {
        if (i == 0) {
            return new C1246h();
        }
        if (i != 1) {
            return new C1246h();
        }
        return new C1240d();
    }

    /* renamed from: h */
    public static final <R, T> C2043d<C1798k> m2734h(C0640p<? super R, ? super C2043d<? super T>, ? extends Object> pVar, R r, C2043d<? super T> dVar) {
        C1241e.m3517j(pVar, "$this$createCoroutineUnintercepted");
        C1241e.m3517j(dVar, "completion");
        if (pVar instanceof C2133a) {
            return ((C2133a) pVar).mo4785a(r, dVar);
        }
        C2046f d = dVar.mo5012d();
        return d == C2051h.f5888e ? new C2125b(dVar, dVar, pVar, r) : new C2126c(dVar, d, dVar, d, pVar, r);
    }

    /* renamed from: i */
    public static C1241e m2735i() {
        return new C1241e(0);
    }

    /* renamed from: j */
    public static final Object m2736j(Throwable th) {
        C1241e.m3517j(th, "exception");
        return new C1792f.C1793a(th);
    }

    /* renamed from: k */
    public static float m2737k(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    /* renamed from: l */
    public static final C1013a m2738l(int i, int i2) {
        return new C1013a(i, i2, -1);
    }

    /* renamed from: m */
    public static final boolean m2739m(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* renamed from: n */
    public static final <S, E> C1713d<S, E> m2740n(Throwable th, C1896f<C2079i0, E> fVar) {
        C2079i0 i0Var;
        int i;
        C2103w wVar;
        C1241e.m3517j(fVar, "errorConverter");
        if (th instanceof IOException) {
            return new C1713d.C1714a((IOException) th);
        }
        E e = null;
        if (!(th instanceof C1908i)) {
            return new C1713d.C1717d(th, (Integer) null, (C2103w) null, 6);
        }
        C1881a0<?> a0Var = ((C1908i) th).f5628e;
        if (a0Var == null) {
            i0Var = null;
        } else {
            i0Var = a0Var.f5592c;
        }
        if (a0Var == null) {
            i = 520;
        } else {
            i = a0Var.f5590a.f6004h;
        }
        if (a0Var == null) {
            wVar = null;
        } else {
            wVar = a0Var.f5590a.f6006j;
        }
        if (!(i0Var == null || i0Var.mo2693a() == 0)) {
            try {
                e = fVar.mo6398a(i0Var);
            } catch (Exception unused) {
                return new C1713d.C1715b(null, i, wVar);
            }
        }
        return new C1713d.C1715b(e, i, wVar);
    }

    /* renamed from: o */
    public static final <T> Class<T> m2741o(C1035b<T> bVar) {
        C1241e.m3517j(bVar, "$this$javaObjectType");
        Class<?> b = ((C0799c) bVar).mo4036b();
        if (!b.isPrimitive()) {
            return b;
        }
        String name = b.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return name.equals("double") ? Double.class : b;
            case 104431:
                return name.equals("int") ? Integer.class : b;
            case 3039496:
                return name.equals("byte") ? Byte.class : b;
            case 3052374:
                return name.equals("char") ? Character.class : b;
            case 3327612:
                return name.equals("long") ? Long.class : b;
            case 3625364:
                return name.equals("void") ? Void.class : b;
            case 64711720:
                return name.equals("boolean") ? Boolean.class : b;
            case 97526364:
                return name.equals("float") ? Float.class : b;
            case 109413500:
                return name.equals("short") ? Short.class : b;
            default:
                return b;
        }
    }

    /* renamed from: p */
    public static final <T> int m2742p(List<? extends T> list) {
        C1241e.m3517j(list, "$this$lastIndex");
        return list.size() - 1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: w2.d<? super T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: y2.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: w2.d<? super T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: w2.d<java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: w2.d<? super T>} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r2 != null) goto L_0x002e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> p138w2.C2043d<T> m2743q(p138w2.C2043d<? super T> r2) {
        /*
            java.lang.String r0 = "$this$intercepted"
            p072l2.C1241e.m3517j(r2, r0)
            boolean r0 = r2 instanceof p148y2.C2135c
            if (r0 != 0) goto L_0x000b
            r0 = 0
            goto L_0x000c
        L_0x000b:
            r0 = r2
        L_0x000c:
            y2.c r0 = (p148y2.C2135c) r0
            if (r0 == 0) goto L_0x0030
            w2.d<java.lang.Object> r2 = r0.f6185f
            if (r2 == 0) goto L_0x0015
            goto L_0x0030
        L_0x0015:
            w2.f r2 = r0.f6186g
            p072l2.C1241e.m3515e(r2)
            int r1 = p138w2.C2044e.f5885d
            w2.e$a r1 = p138w2.C2044e.C2045a.f5886e
            w2.f$a r2 = r2.get(r1)
            w2.e r2 = (p138w2.C2044e) r2
            if (r2 == 0) goto L_0x002d
            w2.d r2 = r2.mo5117A(r0)
            if (r2 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r2 = r0
        L_0x002e:
            r0.f6185f = r2
        L_0x0030:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p042g2.C0955a.m2743q(w2.d):w2.d");
    }

    /* renamed from: r */
    public static final boolean m2744r(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* renamed from: s */
    public static final <T> C1790d<T> m2745s(C0625a<? extends T> aVar) {
        return new C1794g(aVar, (Object) null, 2);
    }

    /* renamed from: t */
    public static float m2746t(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    /* renamed from: u */
    public static final <T> List<T> m2747u(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C1241e.m3516f(singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    /* renamed from: v */
    public static final <T> List<T> m2748v(T... tArr) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: w */
    public static final int m2749w(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: x */
    public static final int m2750x(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    /* renamed from: y */
    public static final <T> List<T> m2751y(List<? extends T> list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : m2747u(list.get(0)) : C1852m.f5542e;
    }

    /* renamed from: z */
    public static final byte[] m2752z(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                C1241e.m3516f(byteArray, "buffer.toByteArray()");
                return byteArray;
            }
        }
    }
}
