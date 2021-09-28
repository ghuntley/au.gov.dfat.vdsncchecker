package p136w0;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import p027e.C0856d;

/* renamed from: w0.n */
public abstract class C2016n<T> {

    /* renamed from: b */
    public static final C2016n<Integer> f5859b = new C2019c(false);

    /* renamed from: c */
    public static final C2016n<Integer> f5860c = new C2020d(false);

    /* renamed from: d */
    public static final C2016n<int[]> f5861d = new C2021e(true);

    /* renamed from: e */
    public static final C2016n<Long> f5862e = new C2022f(false);

    /* renamed from: f */
    public static final C2016n<long[]> f5863f = new C2023g(true);

    /* renamed from: g */
    public static final C2016n<Float> f5864g = new C2024h(false);

    /* renamed from: h */
    public static final C2016n<float[]> f5865h = new C2025i(true);

    /* renamed from: i */
    public static final C2016n<Boolean> f5866i = new C2026j(false);

    /* renamed from: j */
    public static final C2016n<boolean[]> f5867j = new C2027k(true);

    /* renamed from: k */
    public static final C2016n<String> f5868k = new C2017a(true);

    /* renamed from: l */
    public static final C2016n<String[]> f5869l = new C2018b(true);

    /* renamed from: a */
    public final boolean f5870a;

    /* renamed from: w0.n$a */
    public class C2017a extends C2016n<String> {
        public C2017a(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public Object mo6509a(Bundle bundle, String str) {
            return (String) bundle.get(str);
        }

        /* renamed from: b */
        public String mo6510b() {
            return "string";
        }

        /* renamed from: c */
        public Object mo6511c(String str) {
            return str;
        }

        /* renamed from: d */
        public void mo6512d(Bundle bundle, String str, Object obj) {
            bundle.putString(str, (String) obj);
        }
    }

    /* renamed from: w0.n$b */
    public class C2018b extends C2016n<String[]> {
        public C2018b(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public Object mo6509a(Bundle bundle, String str) {
            return (String[]) bundle.get(str);
        }

        /* renamed from: b */
        public String mo6510b() {
            return "string[]";
        }

        /* renamed from: c */
        public Object mo6511c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: d */
        public void mo6512d(Bundle bundle, String str, Object obj) {
            bundle.putStringArray(str, (String[]) obj);
        }
    }

    /* renamed from: w0.n$c */
    public class C2019c extends C2016n<Integer> {
        public C2019c(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public Object mo6509a(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        /* renamed from: b */
        public String mo6510b() {
            return "integer";
        }

        /* renamed from: c */
        public Object mo6511c(String str) {
            return Integer.valueOf(str.startsWith("0x") ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str));
        }

        /* renamed from: d */
        public void mo6512d(Bundle bundle, String str, Object obj) {
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    /* renamed from: w0.n$d */
    public class C2020d extends C2016n<Integer> {
        public C2020d(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public Object mo6509a(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        /* renamed from: b */
        public String mo6510b() {
            return "reference";
        }

        /* renamed from: c */
        public Object mo6511c(String str) {
            return Integer.valueOf(str.startsWith("0x") ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str));
        }

        /* renamed from: d */
        public void mo6512d(Bundle bundle, String str, Object obj) {
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    /* renamed from: w0.n$e */
    public class C2021e extends C2016n<int[]> {
        public C2021e(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public Object mo6509a(Bundle bundle, String str) {
            return (int[]) bundle.get(str);
        }

        /* renamed from: b */
        public String mo6510b() {
            return "integer[]";
        }

        /* renamed from: c */
        public Object mo6511c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: d */
        public void mo6512d(Bundle bundle, String str, Object obj) {
            bundle.putIntArray(str, (int[]) obj);
        }
    }

    /* renamed from: w0.n$f */
    public class C2022f extends C2016n<Long> {
        public C2022f(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public Object mo6509a(Bundle bundle, String str) {
            return (Long) bundle.get(str);
        }

        /* renamed from: b */
        public String mo6510b() {
            return "long";
        }

        /* renamed from: c */
        public Object mo6511c(String str) {
            if (str.endsWith("L")) {
                str = str.substring(0, str.length() - 1);
            }
            return Long.valueOf(str.startsWith("0x") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str));
        }

        /* renamed from: d */
        public void mo6512d(Bundle bundle, String str, Object obj) {
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    /* renamed from: w0.n$g */
    public class C2023g extends C2016n<long[]> {
        public C2023g(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public Object mo6509a(Bundle bundle, String str) {
            return (long[]) bundle.get(str);
        }

        /* renamed from: b */
        public String mo6510b() {
            return "long[]";
        }

        /* renamed from: c */
        public Object mo6511c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: d */
        public void mo6512d(Bundle bundle, String str, Object obj) {
            bundle.putLongArray(str, (long[]) obj);
        }
    }

    /* renamed from: w0.n$h */
    public class C2024h extends C2016n<Float> {
        public C2024h(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public Object mo6509a(Bundle bundle, String str) {
            return (Float) bundle.get(str);
        }

        /* renamed from: b */
        public String mo6510b() {
            return "float";
        }

        /* renamed from: c */
        public Object mo6511c(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }

        /* renamed from: d */
        public void mo6512d(Bundle bundle, String str, Object obj) {
            bundle.putFloat(str, ((Float) obj).floatValue());
        }
    }

    /* renamed from: w0.n$i */
    public class C2025i extends C2016n<float[]> {
        public C2025i(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public Object mo6509a(Bundle bundle, String str) {
            return (float[]) bundle.get(str);
        }

        /* renamed from: b */
        public String mo6510b() {
            return "float[]";
        }

        /* renamed from: c */
        public Object mo6511c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: d */
        public void mo6512d(Bundle bundle, String str, Object obj) {
            bundle.putFloatArray(str, (float[]) obj);
        }
    }

    /* renamed from: w0.n$j */
    public class C2026j extends C2016n<Boolean> {
        public C2026j(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public Object mo6509a(Bundle bundle, String str) {
            return (Boolean) bundle.get(str);
        }

        /* renamed from: b */
        public String mo6510b() {
            return "boolean";
        }

        /* renamed from: c */
        public Object mo6511c(String str) {
            if ("true".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equals(str)) {
                return Boolean.FALSE;
            }
            throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        }

        /* renamed from: d */
        public void mo6512d(Bundle bundle, String str, Object obj) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: w0.n$k */
    public class C2027k extends C2016n<boolean[]> {
        public C2027k(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public Object mo6509a(Bundle bundle, String str) {
            return (boolean[]) bundle.get(str);
        }

        /* renamed from: b */
        public String mo6510b() {
            return "boolean[]";
        }

        /* renamed from: c */
        public Object mo6511c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: d */
        public void mo6512d(Bundle bundle, String str, Object obj) {
            bundle.putBooleanArray(str, (boolean[]) obj);
        }
    }

    /* renamed from: w0.n$l */
    public static final class C2028l<D extends Enum> extends C2032p<D> {

        /* renamed from: n */
        public final Class<D> f5871n;

        public C2028l(Class<D> cls) {
            super(false, cls);
            if (cls.isEnum()) {
                this.f5871n = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " is not an Enum type.");
        }

        /* renamed from: b */
        public String mo6510b() {
            return this.f5871n.getName();
        }

        /* renamed from: f */
        public D mo6514e(String str) {
            for (D d : (Enum[]) this.f5871n.getEnumConstants()) {
                if (d.name().equals(str)) {
                    return d;
                }
            }
            StringBuilder a = C0856d.m2530a("Enum value ", str, " not found for type ");
            a.append(this.f5871n.getName());
            a.append(".");
            throw new IllegalArgumentException(a.toString());
        }
    }

    /* renamed from: w0.n$m */
    public static final class C2029m<D extends Parcelable> extends C2016n<D[]> {

        /* renamed from: m */
        public final Class<D[]> f5872m;

        public C2029m(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls)) {
                try {
                    this.f5872m = Class.forName("[L" + cls.getName() + ";");
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new IllegalArgumentException(cls + " does not implement Parcelable.");
            }
        }

        /* renamed from: a */
        public Object mo6509a(Bundle bundle, String str) {
            return (Parcelable[]) bundle.get(str);
        }

        /* renamed from: b */
        public String mo6510b() {
            return this.f5872m.getName();
        }

        /* renamed from: c */
        public Object mo6511c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: d */
        public void mo6512d(Bundle bundle, String str, Object obj) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            this.f5872m.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C2029m.class != obj.getClass()) {
                return false;
            }
            return this.f5872m.equals(((C2029m) obj).f5872m);
        }

        public int hashCode() {
            return this.f5872m.hashCode();
        }
    }

    /* renamed from: w0.n$n */
    public static final class C2030n<D> extends C2016n<D> {

        /* renamed from: m */
        public final Class<D> f5873m;

        public C2030n(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f5873m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Parcelable or Serializable.");
        }

        /* renamed from: a */
        public D mo6509a(Bundle bundle, String str) {
            return bundle.get(str);
        }

        /* renamed from: b */
        public String mo6510b() {
            return this.f5873m.getName();
        }

        /* renamed from: c */
        public D mo6511c(String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        /* renamed from: d */
        public void mo6512d(Bundle bundle, String str, D d) {
            this.f5873m.cast(d);
            if (d == null || (d instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d);
            } else if (d instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C2030n.class != obj.getClass()) {
                return false;
            }
            return this.f5873m.equals(((C2030n) obj).f5873m);
        }

        public int hashCode() {
            return this.f5873m.hashCode();
        }
    }

    /* renamed from: w0.n$o */
    public static final class C2031o<D extends Serializable> extends C2016n<D[]> {

        /* renamed from: m */
        public final Class<D[]> f5874m;

        public C2031o(Class<D> cls) {
            super(true);
            if (Serializable.class.isAssignableFrom(cls)) {
                try {
                    this.f5874m = Class.forName("[L" + cls.getName() + ";");
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
        }

        /* renamed from: a */
        public Object mo6509a(Bundle bundle, String str) {
            return (Serializable[]) bundle.get(str);
        }

        /* renamed from: b */
        public String mo6510b() {
            return this.f5874m.getName();
        }

        /* renamed from: c */
        public Object mo6511c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, java.io.Serializable[], java.io.Serializable] */
        /* renamed from: d */
        public void mo6512d(Bundle bundle, String str, Object obj) {
            ? r4 = (Serializable[]) obj;
            this.f5874m.cast(r4);
            bundle.putSerializable(str, r4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C2031o.class != obj.getClass()) {
                return false;
            }
            return this.f5874m.equals(((C2031o) obj).f5874m);
        }

        public int hashCode() {
            return this.f5874m.hashCode();
        }
    }

    /* renamed from: w0.n$p */
    public static class C2032p<D extends Serializable> extends C2016n<D> {

        /* renamed from: m */
        public final Class<D> f5875m;

        public C2032p(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            } else if (!cls.isEnum()) {
                this.f5875m = cls;
            } else {
                throw new IllegalArgumentException(cls + " is an Enum. You should use EnumType instead.");
            }
        }

        public C2032p(boolean z, Class<D> cls) {
            super(z);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f5875m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Serializable.");
        }

        /* renamed from: a */
        public Object mo6509a(Bundle bundle, String str) {
            return (Serializable) bundle.get(str);
        }

        /* renamed from: b */
        public String mo6510b() {
            return this.f5875m.getName();
        }

        /* renamed from: d */
        public void mo6512d(Bundle bundle, String str, Object obj) {
            Serializable serializable = (Serializable) obj;
            this.f5875m.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        /* renamed from: e */
        public D mo6511c(String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2032p)) {
                return false;
            }
            return this.f5875m.equals(((C2032p) obj).f5875m);
        }

        public int hashCode() {
            return this.f5875m.hashCode();
        }
    }

    public C2016n(boolean z) {
        this.f5870a = z;
    }

    /* renamed from: a */
    public abstract T mo6509a(Bundle bundle, String str);

    /* renamed from: b */
    public abstract String mo6510b();

    /* renamed from: c */
    public abstract T mo6511c(String str);

    /* renamed from: d */
    public abstract void mo6512d(Bundle bundle, String str, T t);

    public String toString() {
        return mo6510b();
    }
}
