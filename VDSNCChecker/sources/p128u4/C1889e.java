package p128u4;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p128u4.C1884c;

@IgnoreJRERequirement
/* renamed from: u4.e */
public final class C1889e extends C1884c.C1885a {

    /* renamed from: a */
    public static final C1884c.C1885a f5603a = new C1889e();

    @IgnoreJRERequirement
    /* renamed from: u4.e$a */
    public static final class C1890a<R> implements C1884c<R, CompletableFuture<R>> {

        /* renamed from: a */
        public final Type f5604a;

        @IgnoreJRERequirement
        /* renamed from: u4.e$a$a */
        public class C1891a implements C1887d<R> {

            /* renamed from: a */
            public final CompletableFuture<R> f5605a;

            public C1891a(C1890a aVar, CompletableFuture<R> completableFuture) {
                this.f5605a = completableFuture;
            }

            /* renamed from: a */
            public void mo5961a(C1882b<R> bVar, Throwable th) {
                this.f5605a.completeExceptionally(th);
            }

            /* renamed from: b */
            public void mo5962b(C1882b<R> bVar, C1881a0<R> a0Var) {
                if (a0Var.mo6399a()) {
                    this.f5605a.complete(a0Var.f5591b);
                } else {
                    this.f5605a.completeExceptionally(new C1908i(a0Var));
                }
            }
        }

        public C1890a(Type type) {
            this.f5604a = type;
        }

        /* renamed from: a */
        public Type mo5963a() {
            return this.f5604a;
        }

        /* renamed from: b */
        public Object mo5964b(C1882b bVar) {
            C1892b bVar2 = new C1892b(bVar);
            bVar.mo5983i(new C1891a(this, bVar2));
            return bVar2;
        }
    }

    @IgnoreJRERequirement
    /* renamed from: u4.e$b */
    public static final class C1892b<T> extends CompletableFuture<T> {

        /* renamed from: e */
        public final C1882b<?> f5606e;

        public C1892b(C1882b<?> bVar) {
            this.f5606e = bVar;
        }

        public boolean cancel(boolean z) {
            if (z) {
                this.f5606e.cancel();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    /* renamed from: u4.e$c */
    public static final class C1893c<R> implements C1884c<R, CompletableFuture<C1881a0<R>>> {

        /* renamed from: a */
        public final Type f5607a;

        @IgnoreJRERequirement
        /* renamed from: u4.e$c$a */
        public class C1894a implements C1887d<R> {

            /* renamed from: a */
            public final CompletableFuture<C1881a0<R>> f5608a;

            public C1894a(C1893c cVar, CompletableFuture<C1881a0<R>> completableFuture) {
                this.f5608a = completableFuture;
            }

            /* renamed from: a */
            public void mo5961a(C1882b<R> bVar, Throwable th) {
                this.f5608a.completeExceptionally(th);
            }

            /* renamed from: b */
            public void mo5962b(C1882b<R> bVar, C1881a0<R> a0Var) {
                this.f5608a.complete(a0Var);
            }
        }

        public C1893c(Type type) {
            this.f5607a = type;
        }

        /* renamed from: a */
        public Type mo5963a() {
            return this.f5607a;
        }

        /* renamed from: b */
        public Object mo5964b(C1882b bVar) {
            C1892b bVar2 = new C1892b(bVar);
            bVar.mo5983i(new C1894a(this, bVar2));
            return bVar2;
        }
    }

    @Nullable
    /* renamed from: a */
    public C1884c<?, ?> mo5977a(Type type, Annotation[] annotationArr, C1886c0 c0Var) {
        if (C1903g0.m5186f(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type e = C1903g0.m5185e(0, (ParameterizedType) type);
            if (C1903g0.m5186f(e) != C1881a0.class) {
                return new C1890a(e);
            }
            if (e instanceof ParameterizedType) {
                return new C1893c(C1903g0.m5185e(0, (ParameterizedType) e));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
