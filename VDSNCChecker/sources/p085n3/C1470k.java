package p085n3;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import p061j3.C1097e;
import p061j3.C1099g;
import p073l3.C1264a1;
import p073l3.C1320u;

/* renamed from: n3.k */
public final class C1470k {

    /* renamed from: a */
    public static final C1264a1 f4617a;

    static {
        T t;
        String w = C1320u.m3719w("kotlinx.coroutines.fast.service.loader");
        if (w != null) {
            Boolean.parseBoolean(w);
        }
        Class<MainDispatcherFactory> cls = MainDispatcherFactory.class;
        List<T> I = C1097e.m3119I(C1099g.m3120H(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
        Iterator<T> it = I.iterator();
        if (!it.hasNext()) {
            t = null;
        } else {
            T next = it.next();
            if (it.hasNext()) {
                int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                do {
                    T next2 = it.next();
                    int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                    if (loadPriority < loadPriority2) {
                        next = next2;
                        loadPriority = loadPriority2;
                    }
                } while (it.hasNext());
            }
            t = next;
        }
        MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) t;
        if (mainDispatcherFactory != null) {
            try {
                f4617a = mainDispatcherFactory.createDispatcher(I);
            } catch (Throwable th) {
                mainDispatcherFactory.hintOnError();
                throw th;
            }
        } else {
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        }
    }
}
