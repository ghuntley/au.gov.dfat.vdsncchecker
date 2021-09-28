package p129v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0237b;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: v.b */
public class C1956b {

    /* renamed from: a */
    public final ConstraintLayout f5768a;

    /* renamed from: b */
    public int f5769b = -1;

    /* renamed from: c */
    public int f5770c = -1;

    /* renamed from: d */
    public SparseArray<C1957a> f5771d = new SparseArray<>();

    /* renamed from: e */
    public SparseArray<C0237b> f5772e = new SparseArray<>();

    /* renamed from: v.b$a */
    public static class C1957a {

        /* renamed from: a */
        public int f5773a;

        /* renamed from: b */
        public ArrayList<C1958b> f5774b = new ArrayList<>();

        /* renamed from: c */
        public int f5775c = -1;

        /* renamed from: d */
        public C0237b f5776d;

        public C1957a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1961e.f5792j);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f5773a = obtainStyledAttributes.getResourceId(index, this.f5773a);
                } else if (index == 1) {
                    this.f5775c = obtainStyledAttributes.getResourceId(index, this.f5775c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f5775c);
                    context.getResources().getResourceName(this.f5775c);
                    if ("layout".equals(resourceTypeName)) {
                        C0237b bVar = new C0237b();
                        this.f5776d = bVar;
                        bVar.mo1308c((ConstraintLayout) LayoutInflater.from(context).inflate(this.f5775c, (ViewGroup) null));
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public int mo6455a(float f, float f2) {
            for (int i = 0; i < this.f5774b.size(); i++) {
                if (this.f5774b.get(i).mo6456a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: v.b$b */
    public static class C1958b {

        /* renamed from: a */
        public float f5777a = Float.NaN;

        /* renamed from: b */
        public float f5778b = Float.NaN;

        /* renamed from: c */
        public float f5779c = Float.NaN;

        /* renamed from: d */
        public float f5780d = Float.NaN;

        /* renamed from: e */
        public int f5781e = -1;

        /* renamed from: f */
        public C0237b f5782f;

        public C1958b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1961e.f5794l);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f5781e = obtainStyledAttributes.getResourceId(index, this.f5781e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f5781e);
                    context.getResources().getResourceName(this.f5781e);
                    if ("layout".equals(resourceTypeName)) {
                        C0237b bVar = new C0237b();
                        this.f5782f = bVar;
                        bVar.mo1308c((ConstraintLayout) LayoutInflater.from(context).inflate(this.f5781e, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.f5780d = obtainStyledAttributes.getDimension(index, this.f5780d);
                } else if (index == 2) {
                    this.f5778b = obtainStyledAttributes.getDimension(index, this.f5778b);
                } else if (index == 3) {
                    this.f5779c = obtainStyledAttributes.getDimension(index, this.f5779c);
                } else if (index == 4) {
                    this.f5777a = obtainStyledAttributes.getDimension(index, this.f5777a);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public boolean mo6456a(float f, float f2) {
            if (!Float.isNaN(this.f5777a) && f < this.f5777a) {
                return false;
            }
            if (!Float.isNaN(this.f5778b) && f2 < this.f5778b) {
                return false;
            }
            if (Float.isNaN(this.f5779c) || f <= this.f5779c) {
                return Float.isNaN(this.f5780d) || f2 <= this.f5780d;
            }
            return false;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1956b(android.content.Context r8, androidx.constraintlayout.widget.ConstraintLayout r9, int r10) {
        /*
            r7 = this;
            r7.<init>()
            r0 = -1
            r7.f5769b = r0
            r7.f5770c = r0
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r7.f5771d = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r7.f5772e = r1
            r7.f5768a = r9
            android.content.res.Resources r9 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r9.getXml(r10)
            int r10 = r9.getEventType()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r1 = 0
        L_0x0025:
            r2 = 1
            if (r10 == r2) goto L_0x00a6
            if (r10 == 0) goto L_0x0095
            r3 = 2
            if (r10 == r3) goto L_0x002f
            goto L_0x0098
        L_0x002f:
            java.lang.String r10 = r9.getName()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            int r4 = r10.hashCode()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r5 = 4
            r6 = 3
            switch(r4) {
                case -1349929691: goto L_0x0064;
                case 80204913: goto L_0x005a;
                case 1382829617: goto L_0x0051;
                case 1657696882: goto L_0x0047;
                case 1901439077: goto L_0x003d;
                default: goto L_0x003c;
            }     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
        L_0x003c:
            goto L_0x006e
        L_0x003d:
            java.lang.String r2 = "Variant"
            boolean r10 = r10.equals(r2)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r10 == 0) goto L_0x006e
            r2 = r6
            goto L_0x006f
        L_0x0047:
            java.lang.String r2 = "layoutDescription"
            boolean r10 = r10.equals(r2)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r10 == 0) goto L_0x006e
            r2 = 0
            goto L_0x006f
        L_0x0051:
            java.lang.String r4 = "StateSet"
            boolean r10 = r10.equals(r4)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r10 == 0) goto L_0x006e
            goto L_0x006f
        L_0x005a:
            java.lang.String r2 = "State"
            boolean r10 = r10.equals(r2)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r10 == 0) goto L_0x006e
            r2 = r3
            goto L_0x006f
        L_0x0064:
            java.lang.String r2 = "ConstraintSet"
            boolean r10 = r10.equals(r2)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r10 == 0) goto L_0x006e
            r2 = r5
            goto L_0x006f
        L_0x006e:
            r2 = r0
        L_0x006f:
            if (r2 == r3) goto L_0x0087
            if (r2 == r6) goto L_0x007a
            if (r2 == r5) goto L_0x0076
            goto L_0x0098
        L_0x0076:
            r7.mo6454a(r8, r9)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            goto L_0x0098
        L_0x007a:
            v.b$b r10 = new v.b$b     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r10.<init>(r8, r9)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r1 == 0) goto L_0x0098
            java.util.ArrayList<v.b$b> r2 = r1.f5774b     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r2.add(r10)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            goto L_0x0098
        L_0x0087:
            v.b$a r10 = new v.b$a     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r10.<init>(r8, r9)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            android.util.SparseArray<v.b$a> r1 = r7.f5771d     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            int r2 = r10.f5773a     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r1.put(r2, r10)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r1 = r10
            goto L_0x0098
        L_0x0095:
            r9.getName()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
        L_0x0098:
            int r10 = r9.next()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            goto L_0x0025
        L_0x009d:
            r8 = move-exception
            r8.printStackTrace()
            goto L_0x00a6
        L_0x00a2:
            r8 = move-exception
            r8.printStackTrace()
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p129v.C1956b.<init>(android.content.Context, androidx.constraintlayout.widget.ConstraintLayout, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0221, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a2, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a3, code lost:
        if (r5 == false) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a5, code lost:
        if (r5 == true) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a7, code lost:
        if (r5 == true) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a9, code lost:
        if (r5 == true) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ad, code lost:
        r0.f1119c.put(java.lang.Integer.valueOf(r7.f1120a), r7);
        r7 = null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6454a(android.content.Context r12, org.xmlpull.v1.XmlPullParser r13) {
        /*
            r11 = this;
            androidx.constraintlayout.widget.b r0 = new androidx.constraintlayout.widget.b
            r0.<init>()
            int r1 = r13.getAttributeCount()
            r2 = 0
            r3 = r2
        L_0x000b:
            if (r3 >= r1) goto L_0x023a
            java.lang.String r4 = r13.getAttributeName(r3)
            java.lang.String r5 = r13.getAttributeValue(r3)
            if (r4 == 0) goto L_0x0236
            if (r5 != 0) goto L_0x001b
            goto L_0x0236
        L_0x001b:
            java.lang.String r6 = "id"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x0236
            java.lang.String r1 = "/"
            boolean r1 = r5.contains(r1)
            r3 = -1
            r4 = 1
            if (r1 == 0) goto L_0x0045
            r1 = 47
            int r1 = r5.indexOf(r1)
            int r1 = r1 + r4
            java.lang.String r1 = r5.substring(r1)
            android.content.res.Resources r7 = r12.getResources()
            java.lang.String r8 = r12.getPackageName()
            int r1 = r7.getIdentifier(r1, r6, r8)
            goto L_0x0046
        L_0x0045:
            r1 = r3
        L_0x0046:
            if (r1 != r3) goto L_0x0056
            int r6 = r5.length()
            if (r6 <= r4) goto L_0x0056
            java.lang.String r1 = r5.substring(r4)
            int r1 = java.lang.Integer.parseInt(r1)
        L_0x0056:
            int r5 = r13.getEventType()     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r6 = 0
            r7 = r6
        L_0x005c:
            if (r5 == r4) goto L_0x0230
            if (r5 == 0) goto L_0x021e
            r8 = 3
            r9 = 2
            if (r5 == r9) goto L_0x00bb
            if (r5 == r8) goto L_0x0068
            goto L_0x0221
        L_0x0068:
            java.lang.String r5 = r13.getName()     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            java.util.Locale r10 = java.util.Locale.ROOT     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            java.lang.String r5 = r5.toLowerCase(r10)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            int r10 = r5.hashCode()     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            switch(r10) {
                case -2075718416: goto L_0x0098;
                case -190376483: goto L_0x008e;
                case 426575017: goto L_0x0084;
                case 2146106725: goto L_0x007a;
                default: goto L_0x0079;
            }     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
        L_0x0079:
            goto L_0x00a2
        L_0x007a:
            java.lang.String r10 = "constraintset"
            boolean r5 = r5.equals(r10)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            if (r5 == 0) goto L_0x00a2
            r5 = r2
            goto L_0x00a3
        L_0x0084:
            java.lang.String r10 = "constraintoverride"
            boolean r5 = r5.equals(r10)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            if (r5 == 0) goto L_0x00a2
            r5 = r9
            goto L_0x00a3
        L_0x008e:
            java.lang.String r10 = "constraint"
            boolean r5 = r5.equals(r10)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            if (r5 == 0) goto L_0x00a2
            r5 = r4
            goto L_0x00a3
        L_0x0098:
            java.lang.String r10 = "guideline"
            boolean r5 = r5.equals(r10)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            if (r5 == 0) goto L_0x00a2
            r5 = r8
            goto L_0x00a3
        L_0x00a2:
            r5 = r3
        L_0x00a3:
            if (r5 == 0) goto L_0x0230
            if (r5 == r4) goto L_0x00ad
            if (r5 == r9) goto L_0x00ad
            if (r5 == r8) goto L_0x00ad
            goto L_0x0221
        L_0x00ad:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.b$a> r5 = r0.f1119c     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            int r8 = r7.f1120a     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r5.put(r8, r7)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r7 = r6
            goto L_0x0221
        L_0x00bb:
            java.lang.String r5 = r13.getName()     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            int r10 = r5.hashCode()     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            switch(r10) {
                case -2025855158: goto L_0x0124;
                case -1984451626: goto L_0x011a;
                case -1962203927: goto L_0x0110;
                case -1269513683: goto L_0x0106;
                case -1238332596: goto L_0x00fc;
                case -71750448: goto L_0x00f2;
                case 366511058: goto L_0x00e7;
                case 1331510167: goto L_0x00de;
                case 1791837707: goto L_0x00d3;
                case 1803088381: goto L_0x00c8;
                default: goto L_0x00c6;
            }     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
        L_0x00c6:
            goto L_0x012e
        L_0x00c8:
            java.lang.String r8 = "Constraint"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            if (r5 == 0) goto L_0x012e
            r8 = r2
            goto L_0x012f
        L_0x00d3:
            java.lang.String r8 = "CustomAttribute"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            if (r5 == 0) goto L_0x012e
            r8 = 8
            goto L_0x012f
        L_0x00de:
            java.lang.String r9 = "Barrier"
            boolean r5 = r5.equals(r9)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            if (r5 == 0) goto L_0x012e
            goto L_0x012f
        L_0x00e7:
            java.lang.String r8 = "CustomMethod"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            if (r5 == 0) goto L_0x012e
            r8 = 9
            goto L_0x012f
        L_0x00f2:
            java.lang.String r8 = "Guideline"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            if (r5 == 0) goto L_0x012e
            r8 = r9
            goto L_0x012f
        L_0x00fc:
            java.lang.String r8 = "Transform"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            if (r5 == 0) goto L_0x012e
            r8 = 5
            goto L_0x012f
        L_0x0106:
            java.lang.String r8 = "PropertySet"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            if (r5 == 0) goto L_0x012e
            r8 = 4
            goto L_0x012f
        L_0x0110:
            java.lang.String r8 = "ConstraintOverride"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            if (r5 == 0) goto L_0x012e
            r8 = r4
            goto L_0x012f
        L_0x011a:
            java.lang.String r8 = "Motion"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            if (r5 == 0) goto L_0x012e
            r8 = 7
            goto L_0x012f
        L_0x0124:
            java.lang.String r8 = "Layout"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            if (r5 == 0) goto L_0x012e
            r8 = 6
            goto L_0x012f
        L_0x012e:
            r8 = r3
        L_0x012f:
            java.lang.String r5 = "XML parser error must be within a Constraint "
            switch(r8) {
                case 0: goto L_0x0214;
                case 1: goto L_0x020b;
                case 2: goto L_0x01fc;
                case 3: goto L_0x01ef;
                case 4: goto L_0x01ca;
                case 5: goto L_0x01a4;
                case 6: goto L_0x017e;
                case 7: goto L_0x0158;
                case 8: goto L_0x0136;
                case 9: goto L_0x0136;
                default: goto L_0x0134;
            }
        L_0x0134:
            goto L_0x0221
        L_0x0136:
            if (r7 == 0) goto L_0x013f
            java.util.HashMap<java.lang.String, v.a> r5 = r7.f1125f     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            p129v.C1955a.m5262a(r12, r13, r5)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            goto L_0x0221
        L_0x013f:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            throw r12     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
        L_0x0158:
            if (r7 == 0) goto L_0x0165
            androidx.constraintlayout.widget.b$c r5 = r7.f1122c     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r5.mo1324a(r12, r8)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            goto L_0x0221
        L_0x0165:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            throw r12     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
        L_0x017e:
            if (r7 == 0) goto L_0x018b
            androidx.constraintlayout.widget.b$b r5 = r7.f1123d     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r5.mo1323a(r12, r8)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            goto L_0x0221
        L_0x018b:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            throw r12     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
        L_0x01a4:
            if (r7 == 0) goto L_0x01b1
            androidx.constraintlayout.widget.b$e r5 = r7.f1124e     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r5.mo1326a(r12, r8)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            goto L_0x0221
        L_0x01b1:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            throw r12     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
        L_0x01ca:
            if (r7 == 0) goto L_0x01d6
            androidx.constraintlayout.widget.b$d r5 = r7.f1121b     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r5.mo1325a(r12, r8)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            goto L_0x0221
        L_0x01d6:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            throw r12     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
        L_0x01ef:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            androidx.constraintlayout.widget.b$a r5 = r0.mo1311f(r12, r5, r2)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            androidx.constraintlayout.widget.b$b r7 = r5.f1123d     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r7.f1181h0 = r4     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            goto L_0x021c
        L_0x01fc:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            androidx.constraintlayout.widget.b$a r5 = r0.mo1311f(r12, r5, r2)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            androidx.constraintlayout.widget.b$b r7 = r5.f1123d     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r7.f1166a = r4     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            r7.f1168b = r4     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            goto L_0x021c
        L_0x020b:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            androidx.constraintlayout.widget.b$a r5 = r0.mo1311f(r12, r5, r4)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            goto L_0x021c
        L_0x0214:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            androidx.constraintlayout.widget.b$a r5 = r0.mo1311f(r12, r5, r2)     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
        L_0x021c:
            r7 = r5
            goto L_0x0221
        L_0x021e:
            r13.getName()     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
        L_0x0221:
            int r5 = r13.next()     // Catch:{ XmlPullParserException -> 0x022c, IOException -> 0x0227 }
            goto L_0x005c
        L_0x0227:
            r12 = move-exception
            r12.printStackTrace()
            goto L_0x0230
        L_0x022c:
            r12 = move-exception
            r12.printStackTrace()
        L_0x0230:
            android.util.SparseArray<androidx.constraintlayout.widget.b> r12 = r11.f5772e
            r12.put(r1, r0)
            goto L_0x023a
        L_0x0236:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x023a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p129v.C1956b.mo6454a(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
