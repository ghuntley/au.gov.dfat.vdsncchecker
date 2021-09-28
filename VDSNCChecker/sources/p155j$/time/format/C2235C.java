package p155j$.time.format;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p155j$.time.temporal.C2285a;
import p155j$.time.temporal.C2300p;

/* renamed from: j$.time.format.C */
class C2235C {

    /* renamed from: a */
    private static final ConcurrentMap f6383a = new ConcurrentHashMap(16, 0.75f, 2);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Comparator f6384b = new C2245d(1);

    /* renamed from: c */
    public static final /* synthetic */ int f6385c = 0;

    C2235C() {
    }

    /* renamed from: b */
    private Object m5783b(C2300p pVar, Locale locale) {
        Object obj;
        C2300p pVar2 = pVar;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(pVar2, locale);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f6383a;
        Object obj2 = concurrentHashMap.get(simpleImmutableEntry);
        if (obj2 != null) {
            return obj2;
        }
        HashMap hashMap = new HashMap();
        int i = 0;
        if (pVar2 == C2285a.ERA) {
            DateFormatSymbols instance = DateFormatSymbols.getInstance(locale);
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            String[] eras = instance.getEras();
            while (i < eras.length) {
                if (!eras[i].isEmpty()) {
                    long j = (long) i;
                    hashMap2.put(Long.valueOf(j), eras[i]);
                    hashMap3.put(Long.valueOf(j), m5784c(eras[i]));
                }
                i++;
            }
            if (!hashMap2.isEmpty()) {
                hashMap.put(C2240H.FULL, hashMap2);
                hashMap.put(C2240H.SHORT, hashMap2);
                hashMap.put(C2240H.NARROW, hashMap3);
            }
            obj = new C2234B(hashMap);
        } else if (pVar2 == C2285a.MONTH_OF_YEAR) {
            DateFormatSymbols instance2 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            String[] months = instance2.getMonths();
            for (int i2 = 0; i2 < months.length; i2++) {
                if (!months[i2].isEmpty()) {
                    long j2 = ((long) i2) + 1;
                    hashMap4.put(Long.valueOf(j2), months[i2]);
                    hashMap5.put(Long.valueOf(j2), m5784c(months[i2]));
                }
            }
            if (!hashMap4.isEmpty()) {
                hashMap.put(C2240H.FULL, hashMap4);
                hashMap.put(C2240H.NARROW, hashMap5);
            }
            HashMap hashMap6 = new HashMap();
            String[] shortMonths = instance2.getShortMonths();
            while (i < shortMonths.length) {
                if (!shortMonths[i].isEmpty()) {
                    hashMap6.put(Long.valueOf(((long) i) + 1), shortMonths[i]);
                }
                i++;
            }
            if (!hashMap6.isEmpty()) {
                hashMap.put(C2240H.SHORT, hashMap6);
            }
            obj = new C2234B(hashMap);
        } else if (pVar2 == C2285a.DAY_OF_WEEK) {
            DateFormatSymbols instance3 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap7 = new HashMap();
            String[] weekdays = instance3.getWeekdays();
            hashMap7.put(1L, weekdays[2]);
            hashMap7.put(2L, weekdays[3]);
            hashMap7.put(3L, weekdays[4]);
            hashMap7.put(4L, weekdays[5]);
            hashMap7.put(5L, weekdays[6]);
            hashMap7.put(6L, weekdays[7]);
            hashMap7.put(7L, weekdays[1]);
            hashMap.put(C2240H.FULL, hashMap7);
            HashMap hashMap8 = new HashMap();
            hashMap8.put(1L, m5784c(weekdays[2]));
            hashMap8.put(2L, m5784c(weekdays[3]));
            hashMap8.put(3L, m5784c(weekdays[4]));
            hashMap8.put(4L, m5784c(weekdays[5]));
            hashMap8.put(5L, m5784c(weekdays[6]));
            hashMap8.put(6L, m5784c(weekdays[7]));
            hashMap8.put(7L, m5784c(weekdays[1]));
            hashMap.put(C2240H.NARROW, hashMap8);
            HashMap hashMap9 = new HashMap();
            String[] shortWeekdays = instance3.getShortWeekdays();
            hashMap9.put(1L, shortWeekdays[2]);
            hashMap9.put(2L, shortWeekdays[3]);
            hashMap9.put(3L, shortWeekdays[4]);
            hashMap9.put(4L, shortWeekdays[5]);
            hashMap9.put(5L, shortWeekdays[6]);
            hashMap9.put(6L, shortWeekdays[7]);
            hashMap9.put(7L, shortWeekdays[1]);
            hashMap.put(C2240H.SHORT, hashMap9);
            obj = new C2234B(hashMap);
        } else if (pVar2 == C2285a.AMPM_OF_DAY) {
            DateFormatSymbols instance4 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap10 = new HashMap();
            HashMap hashMap11 = new HashMap();
            String[] amPmStrings = instance4.getAmPmStrings();
            while (i < amPmStrings.length) {
                if (!amPmStrings[i].isEmpty()) {
                    long j3 = (long) i;
                    hashMap10.put(Long.valueOf(j3), amPmStrings[i]);
                    hashMap11.put(Long.valueOf(j3), m5784c(amPmStrings[i]));
                }
                i++;
            }
            if (!hashMap10.isEmpty()) {
                hashMap.put(C2240H.FULL, hashMap10);
                hashMap.put(C2240H.SHORT, hashMap10);
                hashMap.put(C2240H.NARROW, hashMap11);
            }
            obj = new C2234B(hashMap);
        } else {
            obj = "";
        }
        concurrentHashMap.putIfAbsent(simpleImmutableEntry, obj);
        return concurrentHashMap.get(simpleImmutableEntry);
    }

    /* renamed from: c */
    private static String m5784c(String str) {
        return str.substring(0, Character.charCount(str.codePointAt(0)));
    }

    /* renamed from: d */
    public String mo6872d(C2300p pVar, long j, C2240H h, Locale locale) {
        Object b = m5783b(pVar, locale);
        if (b instanceof C2234B) {
            return ((C2234B) b).mo6870a(j, h);
        }
        return null;
    }

    /* renamed from: e */
    public Iterator mo6873e(C2300p pVar, C2240H h, Locale locale) {
        Object b = m5783b(pVar, locale);
        if (b instanceof C2234B) {
            return ((C2234B) b).mo6871b(h);
        }
        return null;
    }
}
