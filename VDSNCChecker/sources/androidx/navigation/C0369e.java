package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.C0364b;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p136w0.C2015m;

/* renamed from: androidx.navigation.e */
public abstract class C0369e<D extends C0364b> {

    /* renamed from: androidx.navigation.e$a */
    public interface C0370a {
    }

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.navigation.e$b */
    public @interface C0371b {
        String value();
    }

    /* renamed from: a */
    public abstract D mo1861a();

    /* renamed from: b */
    public abstract C0364b mo1862b(D d, Bundle bundle, C2015m mVar, C0370a aVar);

    /* renamed from: c */
    public void mo1878c(Bundle bundle) {
    }

    /* renamed from: d */
    public Bundle mo1879d() {
        return null;
    }

    /* renamed from: e */
    public abstract boolean mo1863e();
}
