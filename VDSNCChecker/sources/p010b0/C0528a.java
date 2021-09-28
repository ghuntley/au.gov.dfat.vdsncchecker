package p010b0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p040g0.C0940e;
import p145y.C2130a;

/* renamed from: b0.a */
public class C0528a {

    /* renamed from: b0.a$a */
    public interface C0529a {
    }

    /* renamed from: b0.a$b */
    public static final class C0530b implements C0529a {

        /* renamed from: a */
        public final C0531c[] f2308a;

        public C0530b(C0531c[] cVarArr) {
            this.f2308a = cVarArr;
        }
    }

    /* renamed from: b0.a$c */
    public static final class C0531c {

        /* renamed from: a */
        public final String f2309a;

        /* renamed from: b */
        public int f2310b;

        /* renamed from: c */
        public boolean f2311c;

        /* renamed from: d */
        public String f2312d;

        /* renamed from: e */
        public int f2313e;

        /* renamed from: f */
        public int f2314f;

        public C0531c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f2309a = str;
            this.f2310b = i;
            this.f2311c = z;
            this.f2312d = str2;
            this.f2313e = i2;
            this.f2314f = i3;
        }
    }

    /* renamed from: b0.a$d */
    public static final class C0532d implements C0529a {

        /* renamed from: a */
        public final C0940e f2315a;

        /* renamed from: b */
        public final int f2316b;

        /* renamed from: c */
        public final int f2317c;

        /* renamed from: d */
        public final String f2318d;

        public C0532d(C0940e eVar, int i, int i2, String str) {
            this.f2315a = eVar;
            this.f2317c = i;
            this.f2316b = i2;
            this.f2318d = str;
        }
    }

    /* renamed from: a */
    public static C0529a m1774a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        Resources resources2 = resources;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlPullParser.require(2, (String) null, "font-family");
            if (xmlPullParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C2130a.f6176b);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            if (xmlPullParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources2.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C2130a.f6177c);
                                int i = 8;
                                if (!obtainAttributes2.hasValue(8)) {
                                    i = 1;
                                }
                                int i2 = obtainAttributes2.getInt(i, 400);
                                boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                                int i3 = 9;
                                if (!obtainAttributes2.hasValue(9)) {
                                    i3 = 3;
                                }
                                int i4 = 7;
                                if (!obtainAttributes2.hasValue(7)) {
                                    i4 = 4;
                                }
                                String string5 = obtainAttributes2.getString(i4);
                                int i5 = obtainAttributes2.getInt(i3, 0);
                                int i6 = obtainAttributes2.hasValue(5) ? 5 : 0;
                                int resourceId2 = obtainAttributes2.getResourceId(i6, 0);
                                String string6 = obtainAttributes2.getString(i6);
                                obtainAttributes2.recycle();
                                while (xmlPullParser.next() != 3) {
                                    m1776c(xmlPullParser);
                                }
                                arrayList.add(new C0531c(string6, i2, z, string5, i5, resourceId2));
                            } else {
                                m1776c(xmlPullParser);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return new C0530b((C0531c[]) arrayList.toArray(new C0531c[arrayList.size()]));
                    }
                } else {
                    while (xmlPullParser.next() != 3) {
                        m1776c(xmlPullParser);
                    }
                    return new C0532d(new C0940e(string, string2, string3, m1775b(resources2, resourceId)), integer, integer2, string4);
                }
            } else {
                m1776c(xmlPullParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    public static List<List<byte[]>> m1775b(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m1777d(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m1777d(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: c */
    public static void m1776c(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: d */
    public static List<byte[]> m1777d(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
