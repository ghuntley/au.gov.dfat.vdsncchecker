package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.navigation.C0369e;
import java.util.HashMap;
import p000a.C0001b;
import p016c0.C0559c;

@SuppressLint({"TypeParameterUnusedInFormals"})
/* renamed from: androidx.navigation.f */
public class C0372f {

    /* renamed from: b */
    public static final HashMap<Class<?>, String> f1760b = new HashMap<>();

    /* renamed from: a */
    public final HashMap<String, C0369e<? extends C0364b>> f1761a = new HashMap<>();

    /* renamed from: b */
    public static String m1065b(Class<? extends C0369e> cls) {
        HashMap<Class<?>, String> hashMap = f1760b;
        String str = hashMap.get(cls);
        if (str == null) {
            C0369e.C0371b bVar = (C0369e.C0371b) cls.getAnnotation(C0369e.C0371b.class);
            str = bVar != null ? bVar.value() : null;
            if (m1066d(str)) {
                hashMap.put(cls, str);
            } else {
                StringBuilder a = C0001b.m0a("No @Navigator.Name annotation found for ");
                a.append(cls.getSimpleName());
                throw new IllegalArgumentException(a.toString());
            }
        }
        return str;
    }

    /* renamed from: d */
    public static boolean m1066d(String str) {
        return str != null && !str.isEmpty();
    }

    /* renamed from: a */
    public final C0369e<? extends C0364b> mo1881a(C0369e<? extends C0364b> eVar) {
        String b = m1065b(eVar.getClass());
        if (m1066d(b)) {
            return this.f1761a.put(b, eVar);
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    /* renamed from: c */
    public <T extends C0369e<?>> T mo1882c(String str) {
        if (m1066d(str)) {
            T t = (C0369e) this.f1761a.get(str);
            if (t != null) {
                return t;
            }
            throw new IllegalStateException(C0559c.m1823a("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }
}
