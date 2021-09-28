package p067k3;

import java.io.Serializable;
import java.util.regex.Pattern;
import p072l2.C1241e;

/* renamed from: k3.c */
public final class C1200c implements Serializable {

    /* renamed from: e */
    public final Pattern f4109e;

    public C1200c(String str) {
        Pattern compile = Pattern.compile(str);
        C1241e.m3516f(compile, "Pattern.compile(pattern)");
        this.f4109e = compile;
    }

    /* renamed from: a */
    public final boolean mo4808a(CharSequence charSequence) {
        return this.f4109e.matcher(charSequence).matches();
    }

    public String toString() {
        String pattern = this.f4109e.toString();
        C1241e.m3516f(pattern, "nativePattern.toString()");
        return pattern;
    }
}
