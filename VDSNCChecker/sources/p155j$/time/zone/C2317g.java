package p155j$.time.zone;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: j$.time.zone.g */
public abstract class C2317g {

    /* renamed from: a */
    private static final CopyOnWriteArrayList f6579a;

    /* renamed from: b */
    private static final ConcurrentMap f6580b = new ConcurrentHashMap(512, 0.75f, 2);

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f6579a = copyOnWriteArrayList;
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new C2315e(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    protected C2317g() {
    }

    /* renamed from: a */
    public static Set m6146a() {
        return new HashSet(((ConcurrentHashMap) f6580b).keySet());
    }

    /* renamed from: b */
    public static C2313c m6147b(String str, boolean z) {
        Objects.requireNonNull(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f6580b;
        C2317g gVar = (C2317g) concurrentHashMap.get(str);
        if (gVar != null) {
            return gVar.mo7072c(str, z);
        }
        if (concurrentHashMap.isEmpty()) {
            throw new C2314d("No time-zone data files registered");
        }
        throw new C2314d("Unknown time-zone ID: " + str);
    }

    /* renamed from: e */
    public static void m6148e(C2317g gVar) {
        Objects.requireNonNull(gVar, "provider");
        for (String str : gVar.mo7073d()) {
            Objects.requireNonNull(str, "zoneId");
            if (((C2317g) ((ConcurrentHashMap) f6580b).putIfAbsent(str, gVar)) != null) {
                throw new C2314d("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + gVar);
            }
        }
        f6579a.add(gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C2313c mo7072c(String str, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Set mo7073d();
}
