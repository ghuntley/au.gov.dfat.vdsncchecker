package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p000a.C0001b;
import p093p.C1559i;
import p136w0.C1999b;
import p136w0.C2003f;
import p136w0.C2010j;
import p141x0.C2114a;

/* renamed from: androidx.navigation.b */
public class C0364b {

    /* renamed from: e */
    public final String f1740e;

    /* renamed from: f */
    public C0366c f1741f;

    /* renamed from: g */
    public int f1742g;

    /* renamed from: h */
    public String f1743h;

    /* renamed from: i */
    public CharSequence f1744i;

    /* renamed from: j */
    public ArrayList<C2010j> f1745j;

    /* renamed from: k */
    public C1559i<C1999b> f1746k;

    /* renamed from: l */
    public HashMap<String, C2003f> f1747l;

    /* renamed from: androidx.navigation.b$a */
    public static class C0365a implements Comparable<C0365a> {

        /* renamed from: e */
        public final C0364b f1748e;

        /* renamed from: f */
        public final Bundle f1749f;

        /* renamed from: g */
        public final boolean f1750g;

        /* renamed from: h */
        public final boolean f1751h;

        /* renamed from: i */
        public final int f1752i;

        public C0365a(C0364b bVar, Bundle bundle, boolean z, boolean z2, int i) {
            this.f1748e = bVar;
            this.f1749f = bundle;
            this.f1750g = z;
            this.f1751h = z2;
            this.f1752i = i;
        }

        /* renamed from: a */
        public int compareTo(C0365a aVar) {
            boolean z = this.f1750g;
            if (z && !aVar.f1750g) {
                return 1;
            }
            if (!z && aVar.f1750g) {
                return -1;
            }
            Bundle bundle = this.f1749f;
            if (bundle != null && aVar.f1749f == null) {
                return 1;
            }
            if (bundle == null && aVar.f1749f != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size() - aVar.f1749f.size();
                if (size > 0) {
                    return 1;
                }
                if (size < 0) {
                    return -1;
                }
            }
            boolean z2 = this.f1751h;
            if (z2 && !aVar.f1751h) {
                return 1;
            }
            if (z2 || !aVar.f1751h) {
                return this.f1752i - aVar.f1752i;
            }
            return -1;
        }
    }

    static {
        new HashMap();
    }

    public C0364b(C0369e<? extends C0364b> eVar) {
        this.f1740e = C0372f.m1065b(eVar.getClass());
    }

    /* renamed from: c */
    public static String m1046c(Context context, int i) {
        if (i <= 16777215) {
            return Integer.toString(i);
        }
        try {
            return context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            return Integer.toString(i);
        }
    }

    /* renamed from: a */
    public Bundle mo1866a(Bundle bundle) {
        HashMap<String, C2003f> hashMap;
        if (bundle == null && ((hashMap = this.f1747l) == null || hashMap.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        HashMap<String, C2003f> hashMap2 = this.f1747l;
        if (hashMap2 != null) {
            for (Map.Entry next : hashMap2.entrySet()) {
                C2003f fVar = (C2003f) next.getValue();
                String str = (String) next.getKey();
                if (fVar.f5819c) {
                    fVar.f5817a.mo6512d(bundle2, str, fVar.f5820d);
                }
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            HashMap<String, C2003f> hashMap3 = this.f1747l;
            if (hashMap3 != null) {
                for (Map.Entry next2 : hashMap3.entrySet()) {
                    C2003f fVar2 = (C2003f) next2.getValue();
                    String str2 = (String) next2.getKey();
                    boolean z = false;
                    if (fVar2.f5818b || !bundle2.containsKey(str2) || bundle2.get(str2) != null) {
                        try {
                            fVar2.f5817a.mo6509a(bundle2, str2);
                            z = true;
                            continue;
                        } catch (ClassCastException unused) {
                            continue;
                        }
                    }
                    if (!z) {
                        StringBuilder a = C0001b.m0a("Wrong argument type for '");
                        a.append((String) next2.getKey());
                        a.append("' in argument bundle. ");
                        a.append(((C2003f) next2.getValue()).f5817a.mo6510b());
                        a.append(" expected.");
                        throw new IllegalArgumentException(a.toString());
                    }
                }
            }
        }
        return bundle2;
    }

    /* renamed from: b */
    public final C1999b mo1867b(int i) {
        C1559i<C1999b> iVar = this.f1746k;
        C1999b j = iVar == null ? null : iVar.mo5632j(i, null);
        if (j != null) {
            return j;
        }
        C0366c cVar = this.f1741f;
        if (cVar != null) {
            return cVar.mo1867b(i);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.util.regex.Matcher} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.util.regex.Matcher} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.util.regex.Matcher} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.navigation.C0364b.C0365a mo1868d(p106r0.C1656o r19) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            java.util.ArrayList<w0.j> r0 = r6.f1745j
            r8 = 0
            if (r0 != 0) goto L_0x000a
            return r8
        L_0x000a:
            java.util.Iterator r9 = r0.iterator()
            r10 = r8
        L_0x000f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x014f
            java.lang.Object r0 = r9.next()
            w0.j r0 = (p136w0.C2010j) r0
            java.util.ArrayList<androidx.fragment.app.k> r1 = r7.f5070b
            android.net.Uri r1 = (android.net.Uri) r1
            if (r1 == 0) goto L_0x00f3
            java.util.HashMap<java.lang.String, w0.f> r3 = r6.f1747l
            if (r3 != 0) goto L_0x002a
            java.util.Map r3 = java.util.Collections.emptyMap()
            goto L_0x002e
        L_0x002a:
            java.util.Map r3 = java.util.Collections.unmodifiableMap(r3)
        L_0x002e:
            java.util.regex.Pattern r4 = r0.f5839c
            java.lang.String r5 = r1.toString()
            java.util.regex.Matcher r4 = r4.matcher(r5)
            boolean r5 = r4.matches()
            if (r5 != 0) goto L_0x0041
        L_0x003e:
            r5 = r8
            goto L_0x00f1
        L_0x0041:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.util.ArrayList<java.lang.String> r11 = r0.f5837a
            int r11 = r11.size()
            r12 = 0
        L_0x004d:
            if (r12 >= r11) goto L_0x006e
            java.util.ArrayList<java.lang.String> r13 = r0.f5837a
            java.lang.Object r13 = r13.get(r12)
            java.lang.String r13 = (java.lang.String) r13
            int r12 = r12 + 1
            java.lang.String r14 = r4.group(r12)
            java.lang.String r14 = android.net.Uri.decode(r14)
            java.lang.Object r15 = r3.get(r13)
            w0.f r15 = (p136w0.C2003f) r15
            boolean r13 = r0.mo6501b(r5, r13, r14, r15)
            if (r13 == 0) goto L_0x004d
            goto L_0x003e
        L_0x006e:
            boolean r4 = r0.f5841e
            if (r4 == 0) goto L_0x00f1
            java.util.Map<java.lang.String, w0.j$b> r4 = r0.f5838b
            java.util.Set r4 = r4.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x007c:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x00f1
            java.lang.Object r11 = r4.next()
            java.lang.String r11 = (java.lang.String) r11
            java.util.Map<java.lang.String, w0.j$b> r12 = r0.f5838b
            java.lang.Object r12 = r12.get(r11)
            w0.j$b r12 = (p136w0.C2010j.C2012b) r12
            java.lang.String r11 = r1.getQueryParameter(r11)
            if (r11 == 0) goto L_0x00a7
            java.lang.String r13 = r12.f5847a
            java.util.regex.Pattern r13 = java.util.regex.Pattern.compile(r13)
            java.util.regex.Matcher r11 = r13.matcher(r11)
            boolean r13 = r11.matches()
            if (r13 != 0) goto L_0x00a8
            goto L_0x003e
        L_0x00a7:
            r11 = r8
        L_0x00a8:
            r13 = 0
        L_0x00a9:
            java.util.ArrayList<java.lang.String> r14 = r12.f5848b
            int r14 = r14.size()
            if (r13 >= r14) goto L_0x007c
            if (r11 == 0) goto L_0x00be
            int r14 = r13 + 1
            java.lang.String r14 = r11.group(r14)
            java.lang.String r14 = android.net.Uri.decode(r14)
            goto L_0x00bf
        L_0x00be:
            r14 = r8
        L_0x00bf:
            java.util.ArrayList<java.lang.String> r15 = r12.f5848b
            java.lang.Object r15 = r15.get(r13)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r16 = r3.get(r15)
            r2 = r16
            w0.f r2 = (p136w0.C2003f) r2
            if (r14 == 0) goto L_0x00e9
            java.lang.String r8 = "[{}]"
            r17 = r1
            java.lang.String r1 = ""
            java.lang.String r1 = r14.replaceAll(r8, r1)
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x00eb
            boolean r1 = r0.mo6501b(r5, r15, r14, r2)
            if (r1 == 0) goto L_0x00eb
            r5 = 0
            goto L_0x00f1
        L_0x00e9:
            r17 = r1
        L_0x00eb:
            int r13 = r13 + 1
            r1 = r17
            r8 = 0
            goto L_0x00a9
        L_0x00f1:
            r2 = r5
            goto L_0x00f4
        L_0x00f3:
            r2 = 0
        L_0x00f4:
            java.util.HashMap<java.lang.String, androidx.fragment.app.t> r1 = r7.f5071c
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0105
            java.lang.String r3 = r0.f5842f
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0105
            r1 = 1
            r4 = r1
            goto L_0x0106
        L_0x0105:
            r4 = 0
        L_0x0106:
            java.lang.Object r1 = r7.f5072d
            java.lang.String r1 = (java.lang.String) r1
            r3 = -1
            if (r1 == 0) goto L_0x0132
            java.lang.String r5 = r0.f5844h
            if (r5 == 0) goto L_0x012f
            java.util.regex.Pattern r5 = r0.f5843g
            java.util.regex.Matcher r5 = r5.matcher(r1)
            boolean r5 = r5.matches()
            if (r5 != 0) goto L_0x011e
            goto L_0x012f
        L_0x011e:
            w0.j$a r5 = new w0.j$a
            java.lang.String r8 = r0.f5844h
            r5.<init>(r8)
            w0.j$a r8 = new w0.j$a
            r8.<init>(r1)
            int r1 = r5.compareTo(r8)
            goto L_0x0130
        L_0x012f:
            r1 = r3
        L_0x0130:
            r5 = r1
            goto L_0x0133
        L_0x0132:
            r5 = r3
        L_0x0133:
            if (r2 != 0) goto L_0x0139
            if (r4 != 0) goto L_0x0139
            if (r5 <= r3) goto L_0x014c
        L_0x0139:
            androidx.navigation.b$a r8 = new androidx.navigation.b$a
            boolean r3 = r0.f5840d
            r0 = r8
            r1 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            if (r10 == 0) goto L_0x014b
            int r0 = r8.compareTo(r10)
            if (r0 <= 0) goto L_0x014c
        L_0x014b:
            r10 = r8
        L_0x014c:
            r8 = 0
            goto L_0x000f
        L_0x014f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.C0364b.mo1868d(r0.o):androidx.navigation.b$a");
    }

    /* renamed from: e */
    public void mo1864e(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C2114a.f6146e);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        this.f1742g = resourceId;
        this.f1743h = null;
        this.f1743h = m1046c(context, resourceId);
        this.f1744i = obtainAttributes.getText(0);
        obtainAttributes.recycle();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f1743h;
        if (str == null) {
            sb.append("0x");
            str = Integer.toHexString(this.f1742g);
        }
        sb.append(str);
        sb.append(")");
        if (this.f1744i != null) {
            sb.append(" label=");
            sb.append(this.f1744i);
        }
        return sb.toString();
    }
}
