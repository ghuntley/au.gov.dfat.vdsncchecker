package p128u4;

import java.lang.reflect.Array;
import javax.annotation.Nullable;

/* renamed from: u4.t */
public class C1929t extends C1930u<Object> {

    /* renamed from: a */
    public final /* synthetic */ C1930u f5665a;

    public C1929t(C1930u uVar) {
        this.f5665a = uVar;
    }

    /* renamed from: a */
    public void mo6440a(C1949w wVar, @Nullable Object obj) {
        if (obj != null) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                this.f5665a.mo6440a(wVar, Array.get(obj, i));
            }
        }
    }
}
