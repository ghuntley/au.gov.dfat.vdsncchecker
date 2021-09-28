package p136w0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.navigation.C0361a;
import androidx.navigation.C0364b;
import androidx.navigation.C0366c;
import androidx.navigation.C0372f;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
import p093p.C1559i;
import p141x0.C2114a;

/* renamed from: w0.l */
public final class C2014l {

    /* renamed from: c */
    public static final ThreadLocal<TypedValue> f5849c = new ThreadLocal<>();

    /* renamed from: a */
    public Context f5850a;

    /* renamed from: b */
    public C0372f f5851b;

    public C2014l(Context context, C0372f fVar) {
        this.f5850a = context;
        this.f5851b = fVar;
    }

    /* renamed from: a */
    public static C2016n m5287a(TypedValue typedValue, C2016n nVar, C2016n nVar2, String str, String str2) {
        if (nVar == null || nVar == nVar2) {
            return nVar != null ? nVar : nVar2;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    /* renamed from: b */
    public final C0364b mo6504b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) {
        int i2;
        int depth;
        int i3;
        String str;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        C0364b a = this.f5851b.mo1882c(xmlResourceParser.getName()).mo1861a();
        a.mo1864e(this.f5850a, attributeSet2);
        int i4 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i4) {
                break;
            }
            int depth3 = xmlResourceParser.getDepth();
            int i5 = 3;
            if (depth3 < depth2 && next == 3) {
                break;
            } else if (next == 2 && depth3 <= depth2) {
                String name = xmlResourceParser.getName();
                if ("argument".equals(name)) {
                    TypedArray obtainAttributes = resources2.obtainAttributes(attributeSet2, C2114a.f6143b);
                    String string = obtainAttributes.getString(0);
                    if (string != null) {
                        C2003f d = mo6506d(obtainAttributes, resources2, i);
                        if (a.f1747l == null) {
                            a.f1747l = new HashMap<>();
                        }
                        a.f1747l.put(string, d);
                        obtainAttributes.recycle();
                    } else {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                } else {
                    int i6 = i;
                    if ("deepLink".equals(name)) {
                        TypedArray obtainAttributes2 = resources2.obtainAttributes(attributeSet2, C2114a.f6144c);
                        String string2 = obtainAttributes2.getString(3);
                        String string3 = obtainAttributes2.getString(i4);
                        String string4 = obtainAttributes2.getString(2);
                        if (!TextUtils.isEmpty(string2) || !TextUtils.isEmpty(string3) || !TextUtils.isEmpty(string4)) {
                            String str2 = null;
                            String replace = string2 != null ? string2.replace("${applicationId}", this.f5850a.getPackageName()) : null;
                            if (!TextUtils.isEmpty(string3)) {
                                str = string3.replace("${applicationId}", this.f5850a.getPackageName());
                                if (str.isEmpty()) {
                                    throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
                                }
                            } else {
                                str = null;
                            }
                            if (string4 != null) {
                                str2 = string4.replace("${applicationId}", this.f5850a.getPackageName());
                            }
                            C2010j jVar = new C2010j(replace, str, str2);
                            if (a.f1745j == null) {
                                a.f1745j = new ArrayList<>();
                            }
                            a.f1745j.add(jVar);
                            obtainAttributes2.recycle();
                        } else {
                            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                        }
                    } else {
                        if ("action".equals(name)) {
                            TypedArray obtainAttributes3 = resources2.obtainAttributes(attributeSet2, C2114a.f6142a);
                            int resourceId = obtainAttributes3.getResourceId(0, 0);
                            C1999b bVar = new C1999b(obtainAttributes3.getResourceId(i4, 0));
                            bVar.f5810b = new C2015m(obtainAttributes3.getBoolean(4, false), obtainAttributes3.getResourceId(7, -1), obtainAttributes3.getBoolean(8, false), obtainAttributes3.getResourceId(2, -1), obtainAttributes3.getResourceId(3, -1), obtainAttributes3.getResourceId(5, -1), obtainAttributes3.getResourceId(6, -1));
                            Bundle bundle = new Bundle();
                            int i7 = 1;
                            int depth4 = xmlResourceParser.getDepth() + 1;
                            int i8 = i6;
                            while (true) {
                                int next2 = xmlResourceParser.next();
                                if (next2 == i7 || ((depth = xmlResourceParser.getDepth()) < depth4 && next2 == i5)) {
                                    i2 = depth2;
                                } else {
                                    if (next2 == 2 && depth <= depth4) {
                                        if ("argument".equals(xmlResourceParser.getName())) {
                                            TypedArray obtainAttributes4 = resources2.obtainAttributes(attributeSet2, C2114a.f6143b);
                                            String string5 = obtainAttributes4.getString(0);
                                            if (string5 != null) {
                                                C2003f d2 = mo6506d(obtainAttributes4, resources2, i8);
                                                i3 = depth2;
                                                boolean z = d2.f5819c;
                                                if (z && z) {
                                                    d2.f5817a.mo6512d(bundle, string5, d2.f5820d);
                                                }
                                                obtainAttributes4.recycle();
                                            } else {
                                                throw new XmlPullParserException("Arguments must have a name");
                                            }
                                        } else {
                                            i3 = depth2;
                                        }
                                        i8 = i6;
                                    } else {
                                        i3 = depth2;
                                    }
                                    depth2 = i3;
                                    i5 = 3;
                                    i7 = 1;
                                }
                            }
                            i2 = depth2;
                            if (!bundle.isEmpty()) {
                                bVar.f5811c = bundle;
                            }
                            i4 = 1;
                            if (!(!(a instanceof C0361a.C0362a))) {
                                throw new UnsupportedOperationException("Cannot add action " + resourceId + " to " + a + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                            } else if (resourceId != 0) {
                                if (a.f1746k == null) {
                                    a.f1746k = new C1559i<>();
                                }
                                a.f1746k.mo5634l(resourceId, bVar);
                                obtainAttributes3.recycle();
                            } else {
                                throw new IllegalArgumentException("Cannot have an action with actionId 0");
                            }
                        } else {
                            i2 = depth2;
                            if ("include".equals(name) && (a instanceof C0366c)) {
                                TypedArray obtainAttributes5 = resources2.obtainAttributes(attributeSet2, C2037s.f5878c);
                                ((C0366c) a).mo1871f(mo6505c(obtainAttributes5.getResourceId(0, 0)));
                                obtainAttributes5.recycle();
                            } else if (a instanceof C0366c) {
                                ((C0366c) a).mo1871f(mo6504b(resources, xmlResourceParser, attributeSet, i));
                            }
                        }
                        depth2 = i2;
                    }
                }
                i2 = depth2;
                depth2 = i2;
            }
        }
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049 A[Catch:{ Exception -> 0x0053, all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b A[Catch:{ Exception -> 0x0053, all -> 0x0051 }] */
    @android.annotation.SuppressLint({"ResourceType"})
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.navigation.C0366c mo6505c(int r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f5850a
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.XmlResourceParser r1 = r0.getXml(r7)
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r1)
        L_0x000e:
            int r3 = r1.next()     // Catch:{ Exception -> 0x0053 }
            r4 = 2
            if (r3 == r4) goto L_0x0019
            r5 = 1
            if (r3 == r5) goto L_0x0019
            goto L_0x000e
        L_0x0019:
            if (r3 != r4) goto L_0x0049
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x0053 }
            androidx.navigation.b r2 = r6.mo6504b(r0, r1, r2, r7)     // Catch:{ Exception -> 0x0053 }
            boolean r4 = r2 instanceof androidx.navigation.C0366c     // Catch:{ Exception -> 0x0053 }
            if (r4 == 0) goto L_0x002d
            androidx.navigation.c r2 = (androidx.navigation.C0366c) r2     // Catch:{ Exception -> 0x0053 }
            r1.close()
            return r2
        L_0x002d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0053 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0053 }
            r4.<init>()     // Catch:{ Exception -> 0x0053 }
            java.lang.String r5 = "Root element <"
            r4.append(r5)     // Catch:{ Exception -> 0x0053 }
            r4.append(r3)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = "> did not inflate into a NavGraph"
            r4.append(r3)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0053 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0053 }
            throw r2     // Catch:{ Exception -> 0x0053 }
        L_0x0049:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = "No start tag found"
            r2.<init>(r3)     // Catch:{ Exception -> 0x0053 }
            throw r2     // Catch:{ Exception -> 0x0053 }
        L_0x0051:
            r7 = move-exception
            goto L_0x007b
        L_0x0053:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x0051 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r4.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r5 = "Exception inflating "
            r4.append(r5)     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = r0.getResourceName(r7)     // Catch:{ all -> 0x0051 }
            r4.append(r7)     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = " line "
            r4.append(r7)     // Catch:{ all -> 0x0051 }
            int r7 = r1.getLineNumber()     // Catch:{ all -> 0x0051 }
            r4.append(r7)     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0051 }
            r3.<init>(r7, r2)     // Catch:{ all -> 0x0051 }
            throw r3     // Catch:{ all -> 0x0051 }
        L_0x007b:
            r1.close()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p136w0.C2014l.mo6505c(int):androidx.navigation.c");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:115|116|117|118|119|120) */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        r1 = p136w0.C2016n.f5862e;
        r1.mo6511c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        r1 = p136w0.C2016n.f5864g;
        r1.mo6511c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        r1 = p136w0.C2016n.f5866i;
        r1.mo6511c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0263, code lost:
        r1 = p136w0.C2016n.f5868k;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x0251 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:117:0x0257 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:119:0x025d */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p136w0.C2003f mo6506d(android.content.res.TypedArray r17, android.content.res.Resources r18, int r19) {
        /*
            r16 = this;
            r0 = r17
            r1 = 3
            r2 = 0
            boolean r3 = r0.getBoolean(r1, r2)
            java.lang.ThreadLocal<android.util.TypedValue> r4 = f5849c
            java.lang.Object r5 = r4.get()
            android.util.TypedValue r5 = (android.util.TypedValue) r5
            if (r5 != 0) goto L_0x001a
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            r4.set(r5)
        L_0x001a:
            r4 = 2
            java.lang.String r4 = r0.getString(r4)
            java.lang.String r6 = "reference"
            java.lang.String r7 = "boolean"
            java.lang.String r8 = "integer"
            java.lang.String r9 = "float"
            if (r4 == 0) goto L_0x0147
            java.lang.String r10 = r18.getResourcePackageName(r19)
            w0.n<java.lang.Integer> r11 = p136w0.C2016n.f5859b
            boolean r12 = r8.equals(r4)
            if (r12 == 0) goto L_0x0037
            goto L_0x0148
        L_0x0037:
            w0.n<int[]> r11 = p136w0.C2016n.f5861d
            java.lang.String r12 = "integer[]"
            boolean r12 = r12.equals(r4)
            if (r12 == 0) goto L_0x0043
            goto L_0x0148
        L_0x0043:
            w0.n<java.lang.Long> r11 = p136w0.C2016n.f5862e
            java.lang.String r12 = "long"
            boolean r12 = r12.equals(r4)
            if (r12 == 0) goto L_0x004f
            goto L_0x0148
        L_0x004f:
            w0.n<long[]> r11 = p136w0.C2016n.f5863f
            java.lang.String r12 = "long[]"
            boolean r12 = r12.equals(r4)
            if (r12 == 0) goto L_0x005b
            goto L_0x0148
        L_0x005b:
            w0.n<java.lang.Boolean> r11 = p136w0.C2016n.f5866i
            boolean r12 = r7.equals(r4)
            if (r12 == 0) goto L_0x0065
            goto L_0x0148
        L_0x0065:
            w0.n<boolean[]> r11 = p136w0.C2016n.f5867j
            java.lang.String r12 = "boolean[]"
            boolean r12 = r12.equals(r4)
            if (r12 == 0) goto L_0x0071
            goto L_0x0148
        L_0x0071:
            w0.n<java.lang.String> r11 = p136w0.C2016n.f5868k
            java.lang.String r12 = "string"
            boolean r12 = r12.equals(r4)
            if (r12 == 0) goto L_0x007d
            goto L_0x0148
        L_0x007d:
            w0.n<java.lang.String[]> r12 = p136w0.C2016n.f5869l
            java.lang.String r13 = "string[]"
            boolean r13 = r13.equals(r4)
            if (r13 == 0) goto L_0x008a
        L_0x0087:
            r11 = r12
            goto L_0x0148
        L_0x008a:
            w0.n<java.lang.Float> r12 = p136w0.C2016n.f5864g
            boolean r13 = r9.equals(r4)
            if (r13 == 0) goto L_0x0093
            goto L_0x0087
        L_0x0093:
            w0.n<float[]> r12 = p136w0.C2016n.f5865h
            java.lang.String r13 = "float[]"
            boolean r13 = r13.equals(r4)
            if (r13 == 0) goto L_0x009e
            goto L_0x0087
        L_0x009e:
            w0.n<java.lang.Integer> r12 = p136w0.C2016n.f5860c
            boolean r13 = r6.equals(r4)
            if (r13 == 0) goto L_0x00a7
            goto L_0x0087
        L_0x00a7:
            boolean r12 = r4.isEmpty()
            if (r12 != 0) goto L_0x0148
            java.lang.String r11 = "."
            boolean r11 = r4.startsWith(r11)     // Catch:{ ClassNotFoundException -> 0x0140 }
            if (r11 == 0) goto L_0x00c7
            if (r10 == 0) goto L_0x00c7
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0140 }
            r11.<init>()     // Catch:{ ClassNotFoundException -> 0x0140 }
            r11.append(r10)     // Catch:{ ClassNotFoundException -> 0x0140 }
            r11.append(r4)     // Catch:{ ClassNotFoundException -> 0x0140 }
            java.lang.String r10 = r11.toString()     // Catch:{ ClassNotFoundException -> 0x0140 }
            goto L_0x00c8
        L_0x00c7:
            r10 = r4
        L_0x00c8:
            java.lang.String r11 = "[]"
            boolean r11 = r4.endsWith(r11)     // Catch:{ ClassNotFoundException -> 0x0140 }
            if (r11 == 0) goto L_0x00fa
            int r11 = r10.length()     // Catch:{ ClassNotFoundException -> 0x0140 }
            int r11 = r11 + -2
            java.lang.String r10 = r10.substring(r2, r11)     // Catch:{ ClassNotFoundException -> 0x0140 }
            java.lang.Class r11 = java.lang.Class.forName(r10)     // Catch:{ ClassNotFoundException -> 0x0140 }
            java.lang.Class<android.os.Parcelable> r12 = android.os.Parcelable.class
            boolean r12 = r12.isAssignableFrom(r11)     // Catch:{ ClassNotFoundException -> 0x0140 }
            if (r12 == 0) goto L_0x00ec
            w0.n$m r10 = new w0.n$m     // Catch:{ ClassNotFoundException -> 0x0140 }
            r10.<init>(r11)     // Catch:{ ClassNotFoundException -> 0x0140 }
            goto L_0x010b
        L_0x00ec:
            java.lang.Class<java.io.Serializable> r12 = java.io.Serializable.class
            boolean r12 = r12.isAssignableFrom(r11)     // Catch:{ ClassNotFoundException -> 0x0140 }
            if (r12 == 0) goto L_0x0129
            w0.n$o r10 = new w0.n$o     // Catch:{ ClassNotFoundException -> 0x0140 }
            r10.<init>(r11)     // Catch:{ ClassNotFoundException -> 0x0140 }
            goto L_0x010b
        L_0x00fa:
            java.lang.Class r11 = java.lang.Class.forName(r10)     // Catch:{ ClassNotFoundException -> 0x0140 }
            java.lang.Class<android.os.Parcelable> r12 = android.os.Parcelable.class
            boolean r12 = r12.isAssignableFrom(r11)     // Catch:{ ClassNotFoundException -> 0x0140 }
            if (r12 == 0) goto L_0x010d
            w0.n$n r10 = new w0.n$n     // Catch:{ ClassNotFoundException -> 0x0140 }
            r10.<init>(r11)     // Catch:{ ClassNotFoundException -> 0x0140 }
        L_0x010b:
            r11 = r10
            goto L_0x0148
        L_0x010d:
            java.lang.Class<java.lang.Enum> r12 = java.lang.Enum.class
            boolean r12 = r12.isAssignableFrom(r11)     // Catch:{ ClassNotFoundException -> 0x0140 }
            if (r12 == 0) goto L_0x011b
            w0.n$l r10 = new w0.n$l     // Catch:{ ClassNotFoundException -> 0x0140 }
            r10.<init>(r11)     // Catch:{ ClassNotFoundException -> 0x0140 }
            goto L_0x010b
        L_0x011b:
            java.lang.Class<java.io.Serializable> r12 = java.io.Serializable.class
            boolean r12 = r12.isAssignableFrom(r11)     // Catch:{ ClassNotFoundException -> 0x0140 }
            if (r12 == 0) goto L_0x0129
            w0.n$p r10 = new w0.n$p     // Catch:{ ClassNotFoundException -> 0x0140 }
            r10.<init>(r11)     // Catch:{ ClassNotFoundException -> 0x0140 }
            goto L_0x010b
        L_0x0129:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ ClassNotFoundException -> 0x0140 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0140 }
            r1.<init>()     // Catch:{ ClassNotFoundException -> 0x0140 }
            r1.append(r10)     // Catch:{ ClassNotFoundException -> 0x0140 }
            java.lang.String r2 = " is not Serializable or Parcelable."
            r1.append(r2)     // Catch:{ ClassNotFoundException -> 0x0140 }
            java.lang.String r1 = r1.toString()     // Catch:{ ClassNotFoundException -> 0x0140 }
            r0.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x0140 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x0140 }
        L_0x0140:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0147:
            r11 = 0
        L_0x0148:
            r10 = 1
            boolean r12 = r0.getValue(r10, r5)
            if (r12 == 0) goto L_0x026b
            w0.n<java.lang.Integer> r12 = p136w0.C2016n.f5860c
            java.lang.String r13 = "' for "
            java.lang.String r14 = "unsupported value '"
            r15 = 16
            if (r11 != r12) goto L_0x018f
            int r0 = r5.resourceId
            if (r0 == 0) goto L_0x015f
            goto L_0x022d
        L_0x015f:
            int r0 = r5.type
            if (r0 != r15) goto L_0x016d
            int r0 = r5.data
            if (r0 != 0) goto L_0x016d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x026c
        L_0x016d:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = p000a.C0001b.m0a(r14)
            java.lang.CharSequence r2 = r5.string
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r11.mo6510b()
            r1.append(r2)
            java.lang.String r2 = ". Must be a reference to a resource."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x018f:
            int r2 = r5.resourceId
            if (r2 == 0) goto L_0x01c0
            if (r11 != 0) goto L_0x019c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r11 = r12
            goto L_0x026c
        L_0x019c:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = p000a.C0001b.m0a(r14)
            java.lang.CharSequence r2 = r5.string
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r11.mo6510b()
            r1.append(r2)
            java.lang.String r2 = ". You must use a \""
            r1.append(r2)
            java.lang.String r2 = "\" type to reference other resources."
            java.lang.String r1 = p099q.C1589b.m4444a(r1, r6, r2)
            r0.<init>(r1)
            throw r0
        L_0x01c0:
            w0.n<java.lang.String> r2 = p136w0.C2016n.f5868k
            if (r11 != r2) goto L_0x01ca
            java.lang.String r0 = r0.getString(r10)
            goto L_0x026c
        L_0x01ca:
            int r0 = r5.type
            if (r0 == r1) goto L_0x0242
            r1 = 4
            if (r0 == r1) goto L_0x0232
            r1 = 5
            if (r0 == r1) goto L_0x021a
            r1 = 18
            if (r0 == r1) goto L_0x0208
            if (r0 < r15) goto L_0x01f3
            r1 = 31
            if (r0 > r1) goto L_0x01f3
            w0.n<java.lang.Float> r0 = p136w0.C2016n.f5864g
            if (r11 != r0) goto L_0x01ea
            w0.n r0 = m5287a(r5, r11, r0, r4, r9)
            int r1 = r5.data
            float r1 = (float) r1
            goto L_0x023c
        L_0x01ea:
            w0.n<java.lang.Integer> r0 = p136w0.C2016n.f5859b
            w0.n r0 = m5287a(r5, r11, r0, r4, r8)
            int r1 = r5.data
            goto L_0x022b
        L_0x01f3:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "unsupported argument type "
            java.lang.StringBuilder r1 = p000a.C0001b.m0a(r1)
            int r2 = r5.type
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0208:
            w0.n<java.lang.Boolean> r0 = p136w0.C2016n.f5866i
            w0.n r11 = m5287a(r5, r11, r0, r4, r7)
            int r0 = r5.data
            if (r0 == 0) goto L_0x0214
            r0 = r10
            goto L_0x0215
        L_0x0214:
            r0 = 0
        L_0x0215:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x026c
        L_0x021a:
            w0.n<java.lang.Integer> r0 = p136w0.C2016n.f5859b
            java.lang.String r1 = "dimension"
            w0.n r0 = m5287a(r5, r11, r0, r4, r1)
            android.util.DisplayMetrics r1 = r18.getDisplayMetrics()
            float r1 = r5.getDimension(r1)
            int r1 = (int) r1
        L_0x022b:
            r11 = r0
            r0 = r1
        L_0x022d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x026c
        L_0x0232:
            w0.n<java.lang.Float> r0 = p136w0.C2016n.f5864g
            w0.n r0 = m5287a(r5, r11, r0, r4, r9)
            float r1 = r5.getFloat()
        L_0x023c:
            r11 = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            goto L_0x026c
        L_0x0242:
            java.lang.CharSequence r0 = r5.string
            java.lang.String r0 = r0.toString()
            if (r11 != 0) goto L_0x0266
            w0.n<java.lang.Integer> r1 = p136w0.C2016n.f5859b     // Catch:{ IllegalArgumentException -> 0x0251 }
            r1.mo6511c(r0)     // Catch:{ IllegalArgumentException -> 0x0251 }
        L_0x024f:
            r11 = r1
            goto L_0x0266
        L_0x0251:
            w0.n<java.lang.Long> r1 = p136w0.C2016n.f5862e     // Catch:{ IllegalArgumentException -> 0x0257 }
            r1.mo6511c(r0)     // Catch:{ IllegalArgumentException -> 0x0257 }
            goto L_0x024f
        L_0x0257:
            w0.n<java.lang.Float> r1 = p136w0.C2016n.f5864g     // Catch:{ IllegalArgumentException -> 0x025d }
            r1.mo6511c(r0)     // Catch:{ IllegalArgumentException -> 0x025d }
            goto L_0x024f
        L_0x025d:
            w0.n<java.lang.Boolean> r1 = p136w0.C2016n.f5866i     // Catch:{ IllegalArgumentException -> 0x0263 }
            r1.mo6511c(r0)     // Catch:{ IllegalArgumentException -> 0x0263 }
            goto L_0x024f
        L_0x0263:
            w0.n<java.lang.String> r1 = p136w0.C2016n.f5868k
            goto L_0x024f
        L_0x0266:
            java.lang.Object r0 = r11.mo6511c(r0)
            goto L_0x026c
        L_0x026b:
            r0 = 0
        L_0x026c:
            if (r0 == 0) goto L_0x026f
            goto L_0x0271
        L_0x026f:
            r0 = 0
            r10 = 0
        L_0x0271:
            if (r11 == 0) goto L_0x0274
            goto L_0x0275
        L_0x0274:
            r11 = 0
        L_0x0275:
            if (r11 != 0) goto L_0x0362
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x0280
            w0.n<java.lang.Integer> r1 = p136w0.C2016n.f5859b
        L_0x027d:
            r11 = r1
            goto L_0x0362
        L_0x0280:
            boolean r1 = r0 instanceof int[]
            if (r1 == 0) goto L_0x0287
            w0.n<int[]> r1 = p136w0.C2016n.f5861d
            goto L_0x027d
        L_0x0287:
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 == 0) goto L_0x028e
            w0.n<java.lang.Long> r1 = p136w0.C2016n.f5862e
            goto L_0x027d
        L_0x028e:
            boolean r1 = r0 instanceof long[]
            if (r1 == 0) goto L_0x0295
            w0.n<long[]> r1 = p136w0.C2016n.f5863f
            goto L_0x027d
        L_0x0295:
            boolean r1 = r0 instanceof java.lang.Float
            if (r1 == 0) goto L_0x029c
            w0.n<java.lang.Float> r1 = p136w0.C2016n.f5864g
            goto L_0x027d
        L_0x029c:
            boolean r1 = r0 instanceof float[]
            if (r1 == 0) goto L_0x02a3
            w0.n<float[]> r1 = p136w0.C2016n.f5865h
            goto L_0x027d
        L_0x02a3:
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L_0x02aa
            w0.n<java.lang.Boolean> r1 = p136w0.C2016n.f5866i
            goto L_0x027d
        L_0x02aa:
            boolean r1 = r0 instanceof boolean[]
            if (r1 == 0) goto L_0x02b1
            w0.n<boolean[]> r1 = p136w0.C2016n.f5867j
            goto L_0x027d
        L_0x02b1:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L_0x035e
            if (r0 != 0) goto L_0x02b9
            goto L_0x035e
        L_0x02b9:
            boolean r1 = r0 instanceof java.lang.String[]
            if (r1 == 0) goto L_0x02c0
            w0.n<java.lang.String[]> r1 = p136w0.C2016n.f5869l
            goto L_0x027d
        L_0x02c0:
            java.lang.Class r1 = r0.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto L_0x02e8
            java.lang.Class<android.os.Parcelable> r1 = android.os.Parcelable.class
            java.lang.Class r2 = r0.getClass()
            java.lang.Class r2 = r2.getComponentType()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x02e8
            w0.n$m r1 = new w0.n$m
            java.lang.Class r2 = r0.getClass()
            java.lang.Class r2 = r2.getComponentType()
            r1.<init>(r2)
            goto L_0x027d
        L_0x02e8:
            java.lang.Class r1 = r0.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto L_0x0311
            java.lang.Class<java.io.Serializable> r1 = java.io.Serializable.class
            java.lang.Class r2 = r0.getClass()
            java.lang.Class r2 = r2.getComponentType()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x0311
            w0.n$o r1 = new w0.n$o
            java.lang.Class r2 = r0.getClass()
            java.lang.Class r2 = r2.getComponentType()
            r1.<init>(r2)
            goto L_0x027d
        L_0x0311:
            boolean r1 = r0 instanceof android.os.Parcelable
            if (r1 == 0) goto L_0x0320
            w0.n$n r1 = new w0.n$n
            java.lang.Class r2 = r0.getClass()
            r1.<init>(r2)
            goto L_0x027d
        L_0x0320:
            boolean r1 = r0 instanceof java.lang.Enum
            if (r1 == 0) goto L_0x032f
            w0.n$l r1 = new w0.n$l
            java.lang.Class r2 = r0.getClass()
            r1.<init>(r2)
            goto L_0x027d
        L_0x032f:
            boolean r1 = r0 instanceof java.io.Serializable
            if (r1 == 0) goto L_0x033e
            w0.n$p r1 = new w0.n$p
            java.lang.Class r2 = r0.getClass()
            r1.<init>(r2)
            goto L_0x027d
        L_0x033e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Object of type "
            java.lang.StringBuilder r2 = p000a.C0001b.m0a(r2)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r2.append(r0)
            java.lang.String r0 = " is not supported for navigation arguments."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x035e:
            w0.n<java.lang.String> r1 = p136w0.C2016n.f5868k
            goto L_0x027d
        L_0x0362:
            w0.f r1 = new w0.f
            r1.<init>(r11, r3, r0, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p136w0.C2014l.mo6506d(android.content.res.TypedArray, android.content.res.Resources, int):w0.f");
    }
}
