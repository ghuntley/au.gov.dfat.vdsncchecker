package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import p079m3.C1437a;
import p079m3.C1439c;

public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    public C1437a createDispatcher(List<? extends MainDispatcherFactory> list) {
        return new C1437a(C1439c.m4095a(Looper.getMainLooper(), true), (String) null, false);
    }

    public int getLoadPriority() {
        return 1073741823;
    }

    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
