package p128u4;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import p139w3.C2103w;
import p139w3.C2106x;
import p139w3.C2111z;
import retrofit2.ParameterHandler;

/* renamed from: u4.z */
public final class C1953z {

    /* renamed from: a */
    public final Method f5724a;

    /* renamed from: b */
    public final C2106x f5725b;

    /* renamed from: c */
    public final String f5726c;
    @Nullable

    /* renamed from: d */
    public final String f5727d;
    @Nullable

    /* renamed from: e */
    public final C2103w f5728e;
    @Nullable

    /* renamed from: f */
    public final C2111z f5729f;

    /* renamed from: g */
    public final boolean f5730g;

    /* renamed from: h */
    public final boolean f5731h;

    /* renamed from: i */
    public final boolean f5732i;

    /* renamed from: j */
    public final ParameterHandler<?>[] f5733j;

    /* renamed from: k */
    public final boolean f5734k;

    /* renamed from: u4.z$a */
    public static final class C1954a {

        /* renamed from: x */
        public static final Pattern f5735x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y */
        public static final Pattern f5736y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        public final C1886c0 f5737a;

        /* renamed from: b */
        public final Method f5738b;

        /* renamed from: c */
        public final Annotation[] f5739c;

        /* renamed from: d */
        public final Annotation[][] f5740d;

        /* renamed from: e */
        public final Type[] f5741e;

        /* renamed from: f */
        public boolean f5742f;

        /* renamed from: g */
        public boolean f5743g;

        /* renamed from: h */
        public boolean f5744h;

        /* renamed from: i */
        public boolean f5745i;

        /* renamed from: j */
        public boolean f5746j;

        /* renamed from: k */
        public boolean f5747k;

        /* renamed from: l */
        public boolean f5748l;

        /* renamed from: m */
        public boolean f5749m;
        @Nullable

        /* renamed from: n */
        public String f5750n;

        /* renamed from: o */
        public boolean f5751o;

        /* renamed from: p */
        public boolean f5752p;

        /* renamed from: q */
        public boolean f5753q;
        @Nullable

        /* renamed from: r */
        public String f5754r;
        @Nullable

        /* renamed from: s */
        public C2103w f5755s;
        @Nullable

        /* renamed from: t */
        public C2111z f5756t;
        @Nullable

        /* renamed from: u */
        public Set<String> f5757u;
        @Nullable

        /* renamed from: v */
        public ParameterHandler<?>[] f5758v;

        /* renamed from: w */
        public boolean f5759w;

        public C1954a(C1886c0 c0Var, Method method) {
            this.f5737a = c0Var;
            this.f5738b = method;
            this.f5739c = method.getAnnotations();
            this.f5741e = method.getGenericParameterTypes();
            this.f5740d = method.getParameterAnnotations();
        }

        /* renamed from: a */
        public static Class<?> m5259a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        /* renamed from: b */
        public final void mo6451b(String str, String str2, boolean z) {
            String str3 = this.f5750n;
            if (str3 == null) {
                this.f5750n = str;
                this.f5751o = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (f5735x.matcher(substring).find()) {
                            throw C1903g0.m5190j(this.f5738b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f5754r = str2;
                    Matcher matcher = f5735x.matcher(str2);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    while (matcher.find()) {
                        linkedHashSet.add(matcher.group(1));
                    }
                    this.f5757u = linkedHashSet;
                    return;
                }
                return;
            }
            throw C1903g0.m5190j(this.f5738b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* renamed from: c */
        public final void mo6452c(int i, Type type) {
            if (C1903g0.m5188h(type)) {
                throw C1903g0.m5192l(this.f5738b, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public C1953z(C1954a aVar) {
        this.f5724a = aVar.f5738b;
        this.f5725b = aVar.f5737a.f5599c;
        this.f5726c = aVar.f5750n;
        this.f5727d = aVar.f5754r;
        this.f5728e = aVar.f5755s;
        this.f5729f = aVar.f5756t;
        this.f5730g = aVar.f5751o;
        this.f5731h = aVar.f5752p;
        this.f5732i = aVar.f5753q;
        this.f5733j = aVar.f5758v;
        this.f5734k = aVar.f5759w;
    }
}
