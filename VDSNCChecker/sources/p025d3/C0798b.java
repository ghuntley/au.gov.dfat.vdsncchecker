package p025d3;

import java.io.Serializable;
import java.util.Objects;
import p055i3.C1034a;
import p055i3.C1036c;

/* renamed from: d3.b */
public abstract class C0798b implements C1034a, Serializable {

    /* renamed from: e */
    public transient C1034a f3104e;

    /* renamed from: f */
    public final Object f3105f;

    /* renamed from: g */
    public final Class f3106g;

    /* renamed from: h */
    public final String f3107h;

    /* renamed from: i */
    public final String f3108i;

    /* renamed from: j */
    public final boolean f3109j;

    public C0798b(Object obj, Class cls, String str, String str2, boolean z) {
        this.f3105f = obj;
        this.f3106g = cls;
        this.f3107h = str;
        this.f3108i = str2;
        this.f3109j = z;
    }

    /* renamed from: a */
    public C1036c mo4035a() {
        Class cls = this.f3106g;
        if (cls == null) {
            return null;
        }
        if (!this.f3109j) {
            return C0810n.m2403a(cls);
        }
        Objects.requireNonNull(C0810n.f3120a);
        return new C0807k(cls, "");
    }
}
