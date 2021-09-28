package p128u4;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import p128u4.C1884c;
import p139w3.C2063d0;

/* renamed from: u4.g */
public final class C1899g extends C1884c.C1885a {
    @Nullable

    /* renamed from: a */
    public final Executor f5610a;

    /* renamed from: u4.g$a */
    public class C1900a implements C1884c<Object, C1882b<?>> {

        /* renamed from: a */
        public final /* synthetic */ Type f5611a;

        /* renamed from: b */
        public final /* synthetic */ Executor f5612b;

        public C1900a(C1899g gVar, Type type, Executor executor) {
            this.f5611a = type;
            this.f5612b = executor;
        }

        /* renamed from: a */
        public Type mo5963a() {
            return this.f5611a;
        }

        /* renamed from: b */
        public Object mo5964b(C1882b bVar) {
            Executor executor = this.f5612b;
            return executor == null ? bVar : new C1901b(executor, bVar);
        }
    }

    /* renamed from: u4.g$b */
    public static final class C1901b<T> implements C1882b<T> {

        /* renamed from: e */
        public final Executor f5613e;

        /* renamed from: f */
        public final C1882b<T> f5614f;

        /* renamed from: u4.g$b$a */
        public class C1902a implements C1887d<T> {

            /* renamed from: a */
            public final /* synthetic */ C1887d f5615a;

            public C1902a(C1887d dVar) {
                this.f5615a = dVar;
            }

            /* renamed from: a */
            public void mo5961a(C1882b<T> bVar, Throwable th) {
                C1901b.this.f5613e.execute(new C1907h(this, this.f5615a, th));
            }

            /* renamed from: b */
            public void mo5962b(C1882b<T> bVar, C1881a0<T> a0Var) {
                C1901b.this.f5613e.execute(new C1907h(this, this.f5615a, (C1881a0) a0Var));
            }
        }

        public C1901b(Executor executor, C1882b<T> bVar) {
            this.f5613e = executor;
            this.f5614f = bVar;
        }

        /* renamed from: a */
        public C2063d0 mo5978a() {
            return this.f5614f.mo5978a();
        }

        /* renamed from: c */
        public boolean mo5979c() {
            return this.f5614f.mo5979c();
        }

        public void cancel() {
            this.f5614f.cancel();
        }

        /* renamed from: h */
        public C1882b<T> clone() {
            return new C1901b(this.f5613e, this.f5614f.mo5982h());
        }

        /* renamed from: i */
        public void mo5983i(C1887d<T> dVar) {
            this.f5614f.mo5983i(new C1902a(dVar));
        }
    }

    public C1899g(@Nullable Executor executor) {
        this.f5610a = executor;
    }

    @Nullable
    /* renamed from: a */
    public C1884c<?, ?> mo5977a(Type type, Annotation[] annotationArr, C1886c0 c0Var) {
        Executor executor = null;
        if (C1903g0.m5186f(type) != C1882b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type e = C1903g0.m5185e(0, (ParameterizedType) type);
            if (!C1903g0.m5189i(annotationArr, C1895e0.class)) {
                executor = this.f5610a;
            }
            return new C1900a(this, e, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
