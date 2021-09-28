package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0176k;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p007au.gov.dfat.vdsncchecker.R;
import p093p.C1550e;
import p093p.C1551f;
import p093p.C1558h;
import p093p.C1559i;

/* renamed from: androidx.appcompat.widget.r0 */
public final class C0201r0 {

    /* renamed from: h */
    public static final PorterDuff.Mode f913h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i */
    public static C0201r0 f914i;

    /* renamed from: j */
    public static final C0202a f915j = new C0202a(6);

    /* renamed from: a */
    public WeakHashMap<Context, C1559i<ColorStateList>> f916a;

    /* renamed from: b */
    public C1558h<String, C0203b> f917b;

    /* renamed from: c */
    public C1559i<String> f918c;

    /* renamed from: d */
    public final WeakHashMap<Context, C1550e<WeakReference<Drawable.ConstantState>>> f919d = new WeakHashMap<>(0);

    /* renamed from: e */
    public TypedValue f920e;

    /* renamed from: f */
    public boolean f921f;

    /* renamed from: g */
    public C0204c f922g;

    /* renamed from: androidx.appcompat.widget.r0$a */
    public static class C0202a extends C1551f<Integer, PorterDuffColorFilter> {
        public C0202a(int i) {
            super(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.r0$b */
    public interface C0203b {
        /* renamed from: a */
        Drawable mo1118a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.r0$c */
    public interface C0204c {
    }

    /* renamed from: c */
    public static synchronized C0201r0 m544c() {
        C0201r0 r0Var;
        synchronized (C0201r0.class) {
            if (f914i == null) {
                f914i = new C0201r0();
            }
            r0Var = f914i;
        }
        return r0Var;
    }

    /* renamed from: g */
    public static synchronized PorterDuffColorFilter m545g(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C0201r0.class) {
            C0202a aVar = f915j;
            Objects.requireNonNull(aVar);
            int i2 = (i + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) aVar.mo5541a(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                Objects.requireNonNull(aVar);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) aVar.mo5542b(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    /* renamed from: a */
    public final synchronized boolean mo1109a(Context context, long j, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C1550e eVar = this.f919d.get(context);
            if (eVar == null) {
                eVar = new C1550e();
                this.f919d.put(context, eVar);
            }
            eVar.mo5537k(j, new WeakReference(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public final Drawable mo1110b(Context context, int i) {
        int i2;
        if (this.f920e == null) {
            this.f920e = new TypedValue();
        }
        TypedValue typedValue = this.f920e;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable d = mo1111d(context, j);
        if (d != null) {
            return d;
        }
        C0204c cVar = this.f922g;
        LayerDrawable layerDrawable = null;
        if (cVar != null) {
            C0176k.C0177a aVar = (C0176k.C0177a) cVar;
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{mo1112e(context, R.drawable.abc_cab_background_internal_bg), mo1112e(context, 2131165207)});
            } else {
                if (i == R.drawable.abc_ratingbar_material) {
                    i2 = R.dimen.abc_star_big;
                } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                    i2 = R.dimen.abc_star_medium;
                } else if (i == R.drawable.abc_ratingbar_small_material) {
                    i2 = R.dimen.abc_star_small;
                }
                layerDrawable = aVar.mo982c(this, context, i2);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            mo1109a(context, j, layerDrawable);
        }
        return layerDrawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        r5 = r0.f4810g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        return null;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable mo1111d(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, p.e<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f919d     // Catch:{ all -> 0x0041 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0041 }
            p.e r0 = (p093p.C1550e) r0     // Catch:{ all -> 0x0041 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo5536j(r5, r1)     // Catch:{ all -> 0x0041 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0041 }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0041 }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x0041 }
            monitor-exit(r3)
            return r4
        L_0x0028:
            long[] r4 = r0.f4809f     // Catch:{ all -> 0x0041 }
            int r2 = r0.f4811h     // Catch:{ all -> 0x0041 }
            int r4 = p093p.C1549d.m4305b(r4, r2, r5)     // Catch:{ all -> 0x0041 }
            if (r4 < 0) goto L_0x003f
            java.lang.Object[] r5 = r0.f4810g     // Catch:{ all -> 0x0041 }
            r6 = r5[r4]     // Catch:{ all -> 0x0041 }
            java.lang.Object r2 = p093p.C1550e.f4807i     // Catch:{ all -> 0x0041 }
            if (r6 == r2) goto L_0x003f
            r5[r4] = r2     // Catch:{ all -> 0x0041 }
            r4 = 1
            r0.f4808e = r4     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r3)
            return r1
        L_0x0041:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0201r0.mo1111d(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: e */
    public synchronized Drawable mo1112e(Context context, int i) {
        return mo1113f(context, i, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r0 != false) goto L_0x002b;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.drawable.Drawable mo1113f(android.content.Context r5, int r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f921f     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0006
            goto L_0x002b
        L_0x0006:
            r0 = 1
            r4.f921f = r0     // Catch:{ all -> 0x0049 }
            r1 = 2131165268(0x7f070054, float:1.7944748E38)
            android.graphics.drawable.Drawable r1 = r4.mo1112e(r5, r1)     // Catch:{ all -> 0x0049 }
            r2 = 0
            if (r1 == 0) goto L_0x004b
            boolean r3 = r1 instanceof p023d1.C0795b     // Catch:{ all -> 0x0049 }
            if (r3 != 0) goto L_0x0029
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0049 }
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r0 = r2
        L_0x0029:
            if (r0 == 0) goto L_0x004b
        L_0x002b:
            android.graphics.drawable.Drawable r0 = r4.mo1115i(r5, r6)     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0035
            android.graphics.drawable.Drawable r0 = r4.mo1110b(r5, r6)     // Catch:{ all -> 0x0049 }
        L_0x0035:
            if (r0 != 0) goto L_0x003d
            java.lang.Object r0 = p001a0.C0002a.f0a     // Catch:{ all -> 0x0049 }
            android.graphics.drawable.Drawable r0 = p001a0.C0002a.C0004b.m5b(r5, r6)     // Catch:{ all -> 0x0049 }
        L_0x003d:
            if (r0 == 0) goto L_0x0043
            android.graphics.drawable.Drawable r0 = r4.mo1116j(r5, r6, r7, r0)     // Catch:{ all -> 0x0049 }
        L_0x0043:
            if (r0 == 0) goto L_0x0047
            int[] r5 = androidx.appcompat.widget.C0169i0.f799a     // Catch:{ all -> 0x0049 }
        L_0x0047:
            monitor-exit(r4)
            return r0
        L_0x0049:
            r5 = move-exception
            goto L_0x0055
        L_0x004b:
            r4.f921f = r2     // Catch:{ all -> 0x0049 }
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0049 }
            java.lang.String r6 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r5.<init>(r6)     // Catch:{ all -> 0x0049 }
            throw r5     // Catch:{ all -> 0x0049 }
        L_0x0055:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0201r0.mo1113f(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = r0.get(r4);
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.content.res.ColorStateList mo1114h(android.content.Context r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, p.i<android.content.res.ColorStateList>> r0 = r3.f916a     // Catch:{ all -> 0x0049 }
            r1 = 0
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0049 }
            p.i r0 = (p093p.C1559i) r0     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.mo5632j(r5, r1)     // Catch:{ all -> 0x0049 }
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch:{ all -> 0x0049 }
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r0 != 0) goto L_0x004b
            androidx.appcompat.widget.r0$c r0 = r3.f922g     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x001d
            goto L_0x0023
        L_0x001d:
            androidx.appcompat.widget.k$a r0 = (androidx.appcompat.widget.C0176k.C0177a) r0     // Catch:{ all -> 0x0049 }
            android.content.res.ColorStateList r1 = r0.mo983d(r4, r5)     // Catch:{ all -> 0x0049 }
        L_0x0023:
            if (r1 == 0) goto L_0x0047
            java.util.WeakHashMap<android.content.Context, p.i<android.content.res.ColorStateList>> r0 = r3.f916a     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0030
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch:{ all -> 0x0049 }
            r0.<init>()     // Catch:{ all -> 0x0049 }
            r3.f916a = r0     // Catch:{ all -> 0x0049 }
        L_0x0030:
            java.util.WeakHashMap<android.content.Context, p.i<android.content.res.ColorStateList>> r0 = r3.f916a     // Catch:{ all -> 0x0049 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0049 }
            p.i r0 = (p093p.C1559i) r0     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0044
            p.i r0 = new p.i     // Catch:{ all -> 0x0049 }
            r0.<init>()     // Catch:{ all -> 0x0049 }
            java.util.WeakHashMap<android.content.Context, p.i<android.content.res.ColorStateList>> r2 = r3.f916a     // Catch:{ all -> 0x0049 }
            r2.put(r4, r0)     // Catch:{ all -> 0x0049 }
        L_0x0044:
            r0.mo5627b(r5, r1)     // Catch:{ all -> 0x0049 }
        L_0x0047:
            r0 = r1
            goto L_0x004b
        L_0x0049:
            r4 = move-exception
            goto L_0x004d
        L_0x004b:
            monitor-exit(r3)
            return r0
        L_0x004d:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0201r0.mo1114h(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079 A[Catch:{ Exception -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f A[Catch:{ Exception -> 0x00a7 }] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo1115i(android.content.Context r11, int r12) {
        /*
            r10 = this;
            p.h<java.lang.String, androidx.appcompat.widget.r0$b> r0 = r10.f917b
            r1 = 0
            if (r0 == 0) goto L_0x00af
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00af
            p.i<java.lang.String> r0 = r10.f918c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.mo5632j(r12, r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            p.h<java.lang.String, androidx.appcompat.widget.r0$b> r3 = r10.f917b
            java.lang.Object r0 = r3.getOrDefault(r0, r1)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            p.i r0 = new p.i
            r0.<init>()
            r10.f918c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f920e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f920e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f920e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            int r4 = r0.assetCookie
            long r4 = (long) r4
            r6 = 32
            long r4 = r4 << r6
            int r6 = r0.data
            long r6 = (long) r6
            long r4 = r4 | r6
            android.graphics.drawable.Drawable r6 = r10.mo1111d(r11, r4)
            if (r6 == 0) goto L_0x0055
            return r6
        L_0x0055:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00a7
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00a7
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a7 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a7 }
        L_0x006d:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a7 }
            r9 = 2
            if (r8 == r9) goto L_0x0077
            if (r8 == r3) goto L_0x0077
            goto L_0x006d
        L_0x0077:
            if (r8 != r9) goto L_0x009f
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a7 }
            p.i<java.lang.String> r8 = r10.f918c     // Catch:{ Exception -> 0x00a7 }
            r8.mo5627b(r12, r3)     // Catch:{ Exception -> 0x00a7 }
            p.h<java.lang.String, androidx.appcompat.widget.r0$b> r8 = r10.f917b     // Catch:{ Exception -> 0x00a7 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a7 }
            androidx.appcompat.widget.r0$b r3 = (androidx.appcompat.widget.C0201r0.C0203b) r3     // Catch:{ Exception -> 0x00a7 }
            if (r3 == 0) goto L_0x0094
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a7 }
            android.graphics.drawable.Drawable r6 = r3.mo1118a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a7 }
        L_0x0094:
            if (r6 == 0) goto L_0x00a7
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a7 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a7 }
            r10.mo1109a(r11, r4, r6)     // Catch:{ Exception -> 0x00a7 }
            goto L_0x00a7
        L_0x009f:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a7 }
            throw r11     // Catch:{ Exception -> 0x00a7 }
        L_0x00a7:
            if (r6 != 0) goto L_0x00ae
            p.i<java.lang.String> r11 = r10.f918c
            r11.mo5627b(r12, r2)
        L_0x00ae:
            return r6
        L_0x00af:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0201r0.mo1115i(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: j */
    public final Drawable mo1116j(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList h = mo1114h(context, i);
        PorterDuff.Mode mode = null;
        if (h != null) {
            if (C0169i0.m487a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setTintList(h);
            C0204c cVar = this.f922g;
            if (cVar != null) {
                C0176k.C0177a aVar = (C0176k.C0177a) cVar;
                if (i == R.drawable.abc_switch_thumb_material) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
            }
            if (mode == null) {
                return drawable;
            }
            drawable.setTintMode(mode);
            return drawable;
        }
        C0204c cVar2 = this.f922g;
        if (cVar2 != null) {
            C0176k.C0177a aVar2 = (C0176k.C0177a) cVar2;
            boolean z2 = true;
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int c = C0216w0.m571c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C0176k.f823b;
                aVar2.mo984e(findDrawableByLayerId, c, mode2);
                aVar2.mo984e(layerDrawable.findDrawableByLayerId(16908303), C0216w0.m571c(context, R.attr.colorControlNormal), mode2);
                aVar2.mo984e(layerDrawable.findDrawableByLayerId(16908301), C0216w0.m571c(context, R.attr.colorControlActivated), mode2);
            } else if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                int b = C0216w0.m570b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C0176k.f823b;
                aVar2.mo984e(findDrawableByLayerId2, b, mode3);
                aVar2.mo984e(layerDrawable2.findDrawableByLayerId(16908303), C0216w0.m571c(context, R.attr.colorControlActivated), mode3);
                aVar2.mo984e(layerDrawable2.findDrawableByLayerId(16908301), C0216w0.m571c(context, R.attr.colorControlActivated), mode3);
            } else {
                z2 = false;
            }
            if (z2) {
                return drawable;
            }
        }
        if (mo1117k(context, i, drawable) || !z) {
            return drawable;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1117k(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            androidx.appcompat.widget.r0$c r0 = r7.f922g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0072
            androidx.appcompat.widget.k$a r0 = (androidx.appcompat.widget.C0176k.C0177a) r0
            java.util.Objects.requireNonNull(r0)
            android.graphics.PorterDuff$Mode r3 = androidx.appcompat.widget.C0176k.f823b
            int[] r4 = r0.f826a
            boolean r4 = r0.mo980a(r4, r9)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            if (r4 == 0) goto L_0x001d
            r5 = 2130903259(0x7f0300db, float:1.741333E38)
            goto L_0x0049
        L_0x001d:
            int[] r4 = r0.f828c
            boolean r4 = r0.mo980a(r4, r9)
            if (r4 == 0) goto L_0x0029
            r5 = 2130903257(0x7f0300d9, float:1.7413327E38)
            goto L_0x0049
        L_0x0029:
            int[] r4 = r0.f829d
            boolean r0 = r0.mo980a(r4, r9)
            if (r0 == 0) goto L_0x0034
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0049
        L_0x0034:
            r0 = 2131165227(0x7f07002b, float:1.7944665E38)
            if (r9 != r0) goto L_0x0044
            r9 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r0 = java.lang.Math.round(r0)
            goto L_0x004b
        L_0x0044:
            r0 = 2131165209(0x7f070019, float:1.7944629E38)
            if (r9 != r0) goto L_0x004d
        L_0x0049:
            r9 = r5
            r0 = r6
        L_0x004b:
            r4 = r1
            goto L_0x0050
        L_0x004d:
            r9 = r2
            r4 = r9
            r0 = r6
        L_0x0050:
            if (r4 == 0) goto L_0x006e
            boolean r4 = androidx.appcompat.widget.C0169i0.m487a(r10)
            if (r4 == 0) goto L_0x005c
            android.graphics.drawable.Drawable r10 = r10.mutate()
        L_0x005c:
            int r8 = androidx.appcompat.widget.C0216w0.m571c(r8, r9)
            android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.C0176k.m497c(r8, r3)
            r10.setColorFilter(r8)
            if (r0 == r6) goto L_0x006c
            r10.setAlpha(r0)
        L_0x006c:
            r8 = r1
            goto L_0x006f
        L_0x006e:
            r8 = r2
        L_0x006f:
            if (r8 == 0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r1 = r2
        L_0x0073:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0201r0.mo1117k(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
