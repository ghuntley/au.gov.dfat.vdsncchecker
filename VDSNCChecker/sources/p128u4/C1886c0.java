package p128u4;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import p128u4.C1874a;
import p128u4.C1884c;
import p128u4.C1896f;
import p139w3.C2068f;
import p139w3.C2070f0;
import p139w3.C2079i0;
import p139w3.C2106x;

/* renamed from: u4.c0 */
public final class C1886c0 {

    /* renamed from: a */
    public final Map<Method, C1888d0<?>> f5597a = new ConcurrentHashMap();

    /* renamed from: b */
    public final C2068f.C2069a f5598b;

    /* renamed from: c */
    public final C2106x f5599c;

    /* renamed from: d */
    public final List<C1896f.C1897a> f5600d;

    /* renamed from: e */
    public final List<C1884c.C1885a> f5601e;

    /* renamed from: f */
    public final boolean f5602f;

    public C1886c0(C2068f.C2069a aVar, C2106x xVar, List<C1896f.C1897a> list, List<C1884c.C1885a> list2, @Nullable Executor executor, boolean z) {
        this.f5598b = aVar;
        this.f5599c = xVar;
        this.f5600d = list;
        this.f5601e = list2;
        this.f5602f = z;
    }

    /* renamed from: a */
    public C1884c<?, ?> mo6402a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f5601e.indexOf((Object) null) + 1;
        int size = this.f5601e.size();
        for (int i = indexOf; i < size; i++) {
            C1884c<?, ?> a = this.f5601e.get(i).mo5977a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f5601e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f5601e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public C1888d0<?> mo6403b(Method method) {
        C1888d0<?> d0Var;
        C1888d0<?> d0Var2 = this.f5597a.get(method);
        if (d0Var2 != null) {
            return d0Var2;
        }
        synchronized (this.f5597a) {
            d0Var = this.f5597a.get(method);
            if (d0Var == null) {
                d0Var = C1888d0.m5158b(this, method);
                this.f5597a.put(method, d0Var);
            }
        }
        return d0Var;
    }

    /* renamed from: c */
    public <T> C1896f<C2079i0, T> mo6404c(@Nullable C1896f.C1897a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f5600d.indexOf((Object) null) + 1;
        int size = this.f5600d.size();
        for (int i = indexOf; i < size; i++) {
            C1896f<C2079i0, ?> b = this.f5600d.get(i).mo6397b(type, annotationArr, this);
            if (b != null) {
                return b;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f5600d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f5600d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: d */
    public <T> C1896f<T, C2070f0> mo6405d(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f5600d.indexOf((Object) null) + 1;
        int size = this.f5600d.size();
        for (int i = indexOf; i < size; i++) {
            C1896f<?, C2070f0> a = this.f5600d.get(i).mo6396a(type, annotationArr, annotationArr2, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f5600d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f5600d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    public <T> C1896f<T, String> mo6406e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f5600d.size();
        for (int i = 0; i < size; i++) {
            Objects.requireNonNull(this.f5600d.get(i));
        }
        return C1874a.C1878d.f5587a;
    }
}
