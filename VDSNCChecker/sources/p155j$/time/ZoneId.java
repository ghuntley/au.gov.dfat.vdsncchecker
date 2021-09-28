package p155j$.time;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import p155j$.time.zone.C2313c;

/* renamed from: j$.time.ZoneId */
public abstract class ZoneId implements Serializable {
    static {
        HashMap hashMap = new HashMap(64);
        hashMap.put("ACT", "Australia/Darwin");
        hashMap.put("AET", "Australia/Sydney");
        hashMap.put("AGT", "America/Argentina/Buenos_Aires");
        hashMap.put("ART", "Africa/Cairo");
        hashMap.put("AST", "America/Anchorage");
        hashMap.put("BET", "America/Sao_Paulo");
        hashMap.put("BST", "Asia/Dhaka");
        hashMap.put("CAT", "Africa/Harare");
        hashMap.put("CNT", "America/St_Johns");
        hashMap.put("CST", "America/Chicago");
        hashMap.put("CTT", "Asia/Shanghai");
        hashMap.put("EAT", "Africa/Addis_Ababa");
        hashMap.put("ECT", "Europe/Paris");
        hashMap.put("IET", "America/Indiana/Indianapolis");
        hashMap.put("IST", "Asia/Kolkata");
        hashMap.put("JST", "Asia/Tokyo");
        hashMap.put("MIT", "Pacific/Apia");
        hashMap.put("NET", "Asia/Yerevan");
        hashMap.put("NST", "Pacific/Auckland");
        hashMap.put("PLT", "Asia/Karachi");
        hashMap.put("PNT", "America/Phoenix");
        hashMap.put("PRT", "America/Puerto_Rico");
        hashMap.put("PST", "America/Los_Angeles");
        hashMap.put("SST", "Pacific/Guadalcanal");
        hashMap.put("VST", "Asia/Ho_Chi_Minh");
        hashMap.put("EST", "-05:00");
        hashMap.put("MST", "-07:00");
        hashMap.put("HST", "-10:00");
        Collections.unmodifiableMap(hashMap);
    }

    ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != C2278p.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    /* renamed from: n */
    public static ZoneId m5729n(String str) {
        int i;
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.m5734r(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            i = 3;
        } else if (!str.startsWith("UT")) {
            return C2278p.m5987q(str, true);
        } else {
            i = 2;
        }
        return m5731p(str, i, true);
    }

    /* renamed from: o */
    public static ZoneId m5730o(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.length() == 0) {
            return zoneOffset;
        }
        if (str.equals("GMT") || str.equals("UTC") || str.equals("UT")) {
            if (zoneOffset.mo6837q() != 0) {
                str = str.concat(zoneOffset.mo6833l());
            }
            return new C2278p(str, C2313c.m6137j(zoneOffset));
        }
        throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: " + str);
    }

    /* renamed from: p */
    private static ZoneId m5731p(String str, int i, boolean z) {
        String substring = str.substring(0, i);
        if (str.length() == i) {
            return m5730o(substring, ZoneOffset.UTC);
        }
        if (str.charAt(i) != '+' && str.charAt(i) != '-') {
            return C2278p.m5987q(str, z);
        }
        try {
            ZoneOffset r = ZoneOffset.m5734r(str.substring(i));
            return r == ZoneOffset.UTC ? m5730o(substring, r) : m5730o(substring, r);
        } catch (C2230d e) {
            throw new C2230d("Invalid ID for offset-based ZoneId: " + str, e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return mo6833l().equals(((ZoneId) obj).mo6833l());
        }
        return false;
    }

    public int hashCode() {
        return mo6833l().hashCode();
    }

    /* renamed from: l */
    public abstract String mo6833l();

    /* renamed from: m */
    public abstract C2313c mo6834m();

    public String toString() {
        return mo6833l();
    }
}
