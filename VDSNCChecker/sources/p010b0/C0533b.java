package p010b0;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: b0.b */
public final class C0533b {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f2319a = new ThreadLocal<>();

    /* renamed from: b */
    public static final WeakHashMap<Object, SparseArray<Object>> f2320b = new WeakHashMap<>(0);

    /* renamed from: c */
    public static final Object f2321c = new Object();

    /* renamed from: b0.b$a */
    public static abstract class C0534a {

        /* renamed from: b0.b$a$a */
        public class C0535a implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ Typeface f2322e;

            public C0535a(Typeface typeface) {
                this.f2322e = typeface;
            }

            public void run() {
                C0534a.this.mo760e(this.f2322e);
            }
        }

        /* renamed from: b0.b$a$b */
        public class C0536b implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ int f2324e;

            public C0536b(int i) {
                this.f2324e = i;
            }

            public void run() {
                C0534a.this.mo759d(this.f2324e);
            }
        }

        /* renamed from: c */
        public static Handler m1780c(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* renamed from: a */
        public final void mo2676a(int i, Handler handler) {
            m1780c(handler).post(new C0536b(i));
        }

        /* renamed from: b */
        public final void mo2677b(Typeface typeface, Handler handler) {
            m1780c(handler).post(new C0535a(typeface));
        }

        /* renamed from: d */
        public abstract void mo759d(int i);

        /* renamed from: e */
        public abstract void mo760e(Typeface typeface);
    }

    /* renamed from: a */
    public static Typeface m1778a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m1779b(context, i, new TypedValue(), 0, (C0534a) null, (Handler) null, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
        if (r9 == null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0022, code lost:
        if (r9 != null) goto L_0x007c;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m1779b(android.content.Context r13, int r14, android.util.TypedValue r15, int r16, p010b0.C0533b.C0534a r17, android.os.Handler r18, boolean r19, boolean r20) {
        /*
            r8 = r14
            r0 = r15
            r4 = r16
            r9 = r17
            r10 = r18
            android.content.res.Resources r2 = r13.getResources()
            r1 = 1
            r2.getValue(r14, r15, r1)
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto L_0x00a3
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r0.startsWith(r1)
            r11 = -3
            r12 = 0
            if (r1 != 0) goto L_0x0025
            if (r9 == 0) goto L_0x007f
            goto L_0x007c
        L_0x0025:
            p.f<java.lang.String, android.graphics.Typeface> r1 = p016c0.C0560d.f2364b
            java.lang.String r3 = p016c0.C0560d.m1826c(r2, r14, r4)
            java.lang.Object r1 = r1.mo5541a(r3)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x003a
            if (r9 == 0) goto L_0x0038
            r9.mo2677b(r1, r10)
        L_0x0038:
            r12 = r1
            goto L_0x007f
        L_0x003a:
            if (r20 == 0) goto L_0x003d
            goto L_0x007f
        L_0x003d:
            java.lang.String r1 = r0.toLowerCase()     // Catch:{ IOException | XmlPullParserException -> 0x007a }
            java.lang.String r3 = ".xml"
            boolean r1 = r1.endsWith(r3)     // Catch:{ IOException | XmlPullParserException -> 0x007a }
            if (r1 == 0) goto L_0x0068
            android.content.res.XmlResourceParser r0 = r2.getXml(r14)     // Catch:{ IOException | XmlPullParserException -> 0x007a }
            b0.a$a r1 = p010b0.C0528a.m1774a(r0, r2)     // Catch:{ IOException | XmlPullParserException -> 0x007a }
            if (r1 != 0) goto L_0x0059
            if (r9 == 0) goto L_0x007f
            r9.mo2676a(r11, r10)     // Catch:{ IOException | XmlPullParserException -> 0x007a }
            goto L_0x007f
        L_0x0059:
            r0 = r13
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            android.graphics.Typeface r12 = p016c0.C0560d.m1824a(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ IOException | XmlPullParserException -> 0x007a }
            goto L_0x007f
        L_0x0068:
            r1 = r13
            android.graphics.Typeface r0 = p016c0.C0560d.m1825b(r13, r2, r14, r0, r4)     // Catch:{ IOException | XmlPullParserException -> 0x007a }
            if (r9 == 0) goto L_0x0078
            if (r0 == 0) goto L_0x0075
            r9.mo2677b(r0, r10)     // Catch:{ IOException | XmlPullParserException -> 0x007a }
            goto L_0x0078
        L_0x0075:
            r9.mo2676a(r11, r10)     // Catch:{ IOException | XmlPullParserException -> 0x007a }
        L_0x0078:
            r12 = r0
            goto L_0x007f
        L_0x007a:
            if (r9 == 0) goto L_0x007f
        L_0x007c:
            r9.mo2676a(r11, r10)
        L_0x007f:
            if (r12 != 0) goto L_0x00a2
            if (r9 != 0) goto L_0x00a2
            if (r20 == 0) goto L_0x0086
            goto L_0x00a2
        L_0x0086:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.String r1 = "Font resource ID #0x"
            java.lang.StringBuilder r1 = p000a.C0001b.m0a(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r14)
            r1.append(r2)
            java.lang.String r2 = " could not be retrieved."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00a2:
            return r12
        L_0x00a3:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.String r3 = "Resource \""
            java.lang.StringBuilder r3 = p000a.C0001b.m0a(r3)
            java.lang.String r2 = r2.getResourceName(r14)
            r3.append(r2)
            java.lang.String r2 = "\" ("
            r3.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r14)
            r3.append(r2)
            java.lang.String r2 = ") is not a Font: "
            r3.append(r2)
            r3.append(r15)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b0.C0533b.m1779b(android.content.Context, int, android.util.TypedValue, int, b0.b$a, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
