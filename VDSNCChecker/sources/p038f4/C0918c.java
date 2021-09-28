package p038f4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import p026d4.C0819e;
import p042g2.C0955a;
import p072l2.C1241e;
import p126u2.C1853n;
import p139w3.C2057b0;
import p154z3.C2208d;

/* renamed from: f4.c */
public final class C0918c {

    /* renamed from: a */
    public static final CopyOnWriteArraySet<Logger> f3439a = new CopyOnWriteArraySet<>();

    /* renamed from: b */
    public static final Map<String, String> f3440b;

    /* renamed from: c */
    public static final C0918c f3441c = null;

    static {
        Map<String, String> map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package packageR = C2057b0.class.getPackage();
        String name = packageR != null ? packageR.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(C2057b0.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(C0819e.class.getName(), "okhttp.Http2");
        linkedHashMap.put(C2208d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        C1241e.m3517j(linkedHashMap, "$this$toMap");
        int size = linkedHashMap.size();
        if (size == 0) {
            map = C1853n.f5543e;
        } else if (size != 1) {
            C1241e.m3517j(linkedHashMap, "$this$toMutableMap");
            map = new LinkedHashMap<>(linkedHashMap);
        } else {
            map = C0955a.m2725F(linkedHashMap);
        }
        f3440b = map;
    }
}
