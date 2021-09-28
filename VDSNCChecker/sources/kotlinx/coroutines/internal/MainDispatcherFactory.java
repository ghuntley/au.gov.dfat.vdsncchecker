package kotlinx.coroutines.internal;

import java.util.List;
import p073l3.C1264a1;

public interface MainDispatcherFactory {
    C1264a1 createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
