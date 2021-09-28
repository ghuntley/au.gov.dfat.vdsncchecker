package p148y2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: y2.e */
public @interface C2137e {
    /* renamed from: c */
    String mo6675c() default "";

    /* renamed from: f */
    String mo6676f() default "";

    /* renamed from: l */
    int[] mo6677l() default {};

    /* renamed from: m */
    String mo6678m() default "";

    /* renamed from: v */
    int mo6679v() default 1;
}
