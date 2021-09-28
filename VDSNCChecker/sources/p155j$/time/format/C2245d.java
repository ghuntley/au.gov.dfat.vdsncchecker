package p155j$.time.format;

import java.util.Comparator;
import java.util.Map;

/* renamed from: j$.time.format.d */
class C2245d implements Comparator {
    public C2245d(int i) {
    }

    public int compare(Object obj, Object obj2) {
        return ((String) ((Map.Entry) obj2).getKey()).length() - ((String) ((Map.Entry) obj).getKey()).length();
    }
}
