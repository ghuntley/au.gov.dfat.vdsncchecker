package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p082n0.C1454c;

/* renamed from: androidx.appcompat.widget.v0 */
public class C0213v0 extends C1454c implements View.OnClickListener {

    /* renamed from: C */
    public static final /* synthetic */ int f941C = 0;

    /* renamed from: A */
    public int f942A = -1;

    /* renamed from: B */
    public int f943B = -1;

    /* renamed from: p */
    public final SearchView f944p;

    /* renamed from: q */
    public final SearchableInfo f945q;

    /* renamed from: r */
    public final Context f946r;

    /* renamed from: s */
    public final WeakHashMap<String, Drawable.ConstantState> f947s;

    /* renamed from: t */
    public final int f948t;

    /* renamed from: u */
    public int f949u = 1;

    /* renamed from: v */
    public ColorStateList f950v;

    /* renamed from: w */
    public int f951w = -1;

    /* renamed from: x */
    public int f952x = -1;

    /* renamed from: y */
    public int f953y = -1;

    /* renamed from: z */
    public int f954z = -1;

    /* renamed from: androidx.appcompat.widget.v0$a */
    public static final class C0214a {

        /* renamed from: a */
        public final TextView f955a;

        /* renamed from: b */
        public final TextView f956b;

        /* renamed from: c */
        public final ImageView f957c;

        /* renamed from: d */
        public final ImageView f958d;

        /* renamed from: e */
        public final ImageView f959e;

        public C0214a(View view) {
            this.f955a = (TextView) view.findViewById(16908308);
            this.f956b = (TextView) view.findViewById(16908309);
            this.f957c = (ImageView) view.findViewById(16908295);
            this.f958d = (ImageView) view.findViewById(16908296);
            this.f959e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    public C0213v0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f944p = searchView;
        this.f945q = searchableInfo;
        this.f948t = searchView.getSuggestionCommitIconResId();
        this.f946r = context;
        this.f947s = weakHashMap;
    }

    /* renamed from: h */
    public static String m558h(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1152a(android.view.View r19, android.content.Context r20, android.database.Cursor r21) {
        /*
            r18 = this;
            r1 = r18
            r2 = r21
            java.lang.Object r0 = r19.getTag()
            r3 = r0
            androidx.appcompat.widget.v0$a r3 = (androidx.appcompat.widget.C0213v0.C0214a) r3
            int r0 = r1.f943B
            r4 = -1
            r5 = 0
            if (r0 == r4) goto L_0x0017
            int r0 = r2.getInt(r0)
            r6 = r0
            goto L_0x0018
        L_0x0017:
            r6 = r5
        L_0x0018:
            android.widget.TextView r0 = r3.f955a
            if (r0 == 0) goto L_0x0034
            int r0 = r1.f951w
            java.lang.String r0 = m558h(r2, r0)
            android.widget.TextView r8 = r3.f955a
            r8.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0030
            r0 = 8
            goto L_0x0031
        L_0x0030:
            r0 = r5
        L_0x0031:
            r8.setVisibility(r0)
        L_0x0034:
            android.widget.TextView r0 = r3.f956b
            r8 = 2
            r9 = 1
            if (r0 == 0) goto L_0x00bd
            int r0 = r1.f953y
            java.lang.String r0 = m558h(r2, r0)
            if (r0 == 0) goto L_0x0086
            android.content.res.ColorStateList r10 = r1.f950v
            if (r10 != 0) goto L_0x0065
            android.util.TypedValue r10 = new android.util.TypedValue
            r10.<init>()
            android.content.Context r11 = r1.f946r
            android.content.res.Resources$Theme r11 = r11.getTheme()
            r12 = 2130903953(0x7f030391, float:1.7414739E38)
            r11.resolveAttribute(r12, r10, r9)
            android.content.Context r11 = r1.f946r
            android.content.res.Resources r11 = r11.getResources()
            int r10 = r10.resourceId
            android.content.res.ColorStateList r10 = r11.getColorStateList(r10)
            r1.f950v = r10
        L_0x0065:
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r0)
            android.text.style.TextAppearanceSpan r15 = new android.text.style.TextAppearanceSpan
            r12 = 0
            r13 = 0
            r14 = 0
            android.content.res.ColorStateList r11 = r1.f950v
            r16 = 0
            r17 = r11
            r11 = r15
            r7 = r15
            r15 = r17
            r11.<init>(r12, r13, r14, r15, r16)
            int r0 = r0.length()
            r11 = 33
            r10.setSpan(r7, r5, r0, r11)
            goto L_0x008c
        L_0x0086:
            int r0 = r1.f952x
            java.lang.String r10 = m558h(r2, r0)
        L_0x008c:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x009f
            android.widget.TextView r0 = r3.f955a
            if (r0 == 0) goto L_0x00ab
            r0.setSingleLine(r5)
            android.widget.TextView r0 = r3.f955a
            r0.setMaxLines(r8)
            goto L_0x00ab
        L_0x009f:
            android.widget.TextView r0 = r3.f955a
            if (r0 == 0) goto L_0x00ab
            r0.setSingleLine(r9)
            android.widget.TextView r0 = r3.f955a
            r0.setMaxLines(r9)
        L_0x00ab:
            android.widget.TextView r0 = r3.f956b
            r0.setText(r10)
            boolean r7 = android.text.TextUtils.isEmpty(r10)
            if (r7 == 0) goto L_0x00b9
            r7 = 8
            goto L_0x00ba
        L_0x00b9:
            r7 = r5
        L_0x00ba:
            r0.setVisibility(r7)
        L_0x00bd:
            android.widget.ImageView r7 = r3.f957c
            r10 = 0
            if (r7 == 0) goto L_0x0155
            int r0 = r1.f954z
            if (r0 != r4) goto L_0x00c9
            r0 = r10
            goto L_0x0142
        L_0x00c9:
            java.lang.String r0 = r2.getString(r0)
            android.graphics.drawable.Drawable r0 = r1.mo1157f(r0)
            if (r0 == 0) goto L_0x00d5
            goto L_0x0142
        L_0x00d5:
            android.app.SearchableInfo r0 = r1.f945q
            android.content.ComponentName r0 = r0.getSearchActivity()
            java.lang.String r11 = r0.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r12 = r1.f947s
            boolean r12 = r12.containsKey(r11)
            if (r12 == 0) goto L_0x00fe
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r1.f947s
            java.lang.Object r0 = r0.get(r11)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 != 0) goto L_0x00f3
            r0 = r10
            goto L_0x0135
        L_0x00f3:
            android.content.Context r11 = r1.f946r
            android.content.res.Resources r11 = r11.getResources()
            android.graphics.drawable.Drawable r0 = r0.newDrawable(r11)
            goto L_0x0135
        L_0x00fe:
            android.content.Context r12 = r1.f946r
            android.content.pm.PackageManager r12 = r12.getPackageManager()
            r13 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r13 = r12.getActivityInfo(r0, r13)     // Catch:{ NameNotFoundException -> 0x0121 }
            int r14 = r13.getIconResource()
            if (r14 != 0) goto L_0x0111
            goto L_0x0126
        L_0x0111:
            java.lang.String r15 = r0.getPackageName()
            android.content.pm.ApplicationInfo r13 = r13.applicationInfo
            android.graphics.drawable.Drawable r12 = r12.getDrawable(r15, r14, r13)
            if (r12 != 0) goto L_0x0127
            r0.flattenToShortString()
            goto L_0x0126
        L_0x0121:
            r0 = move-exception
            r12 = r0
            r12.toString()
        L_0x0126:
            r12 = r10
        L_0x0127:
            if (r12 != 0) goto L_0x012b
            r0 = r10
            goto L_0x012f
        L_0x012b:
            android.graphics.drawable.Drawable$ConstantState r0 = r12.getConstantState()
        L_0x012f:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r13 = r1.f947s
            r13.put(r11, r0)
            r0 = r12
        L_0x0135:
            if (r0 == 0) goto L_0x0138
            goto L_0x0142
        L_0x0138:
            android.content.Context r0 = r1.f946r
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
        L_0x0142:
            r11 = 4
            r7.setImageDrawable(r0)
            if (r0 != 0) goto L_0x014c
            r7.setVisibility(r11)
            goto L_0x0155
        L_0x014c:
            r7.setVisibility(r5)
            r0.setVisible(r5, r5)
            r0.setVisible(r9, r5)
        L_0x0155:
            android.widget.ImageView r0 = r3.f958d
            if (r0 == 0) goto L_0x017a
            int r7 = r1.f942A
            if (r7 != r4) goto L_0x015e
            goto L_0x0166
        L_0x015e:
            java.lang.String r2 = r2.getString(r7)
            android.graphics.drawable.Drawable r10 = r1.mo1157f(r2)
        L_0x0166:
            r0.setImageDrawable(r10)
            if (r10 != 0) goto L_0x0171
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x017a
        L_0x0171:
            r0.setVisibility(r5)
            r10.setVisible(r5, r5)
            r10.setVisible(r9, r5)
        L_0x017a:
            int r0 = r1.f949u
            if (r0 == r8) goto L_0x018d
            if (r0 != r9) goto L_0x0185
            r0 = r6 & 1
            if (r0 == 0) goto L_0x0185
            goto L_0x018d
        L_0x0185:
            android.widget.ImageView r0 = r3.f959e
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x01a2
        L_0x018d:
            android.widget.ImageView r0 = r3.f959e
            r0.setVisibility(r5)
            android.widget.ImageView r0 = r3.f959e
            android.widget.TextView r2 = r3.f955a
            java.lang.CharSequence r2 = r2.getText()
            r0.setTag(r2)
            android.widget.ImageView r0 = r3.f959e
            r0.setOnClickListener(r1)
        L_0x01a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0213v0.mo1152a(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    /* renamed from: b */
    public void mo1153b(Cursor cursor) {
        try {
            super.mo1153b(cursor);
            if (cursor != null) {
                this.f951w = cursor.getColumnIndex("suggest_text_1");
                this.f952x = cursor.getColumnIndex("suggest_text_2");
                this.f953y = cursor.getColumnIndex("suggest_text_2_url");
                this.f954z = cursor.getColumnIndex("suggest_icon_1");
                this.f942A = cursor.getColumnIndex("suggest_icon_2");
                this.f943B = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public CharSequence mo1154c(Cursor cursor) {
        String h;
        String h2;
        if (cursor == null) {
            return null;
        }
        String h3 = m558h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h3 != null) {
            return h3;
        }
        if (this.f945q.shouldRewriteQueryFromData() && (h2 = m558h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h2;
        }
        if (!this.f945q.shouldRewriteQueryFromText() || (h = m558h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h;
    }

    /* renamed from: d */
    public View mo1155d(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.f4558o.inflate(this.f4556m, viewGroup, false);
        inflate.setTag(new C0214a(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f948t);
        return inflate;
    }

    /* renamed from: e */
    public Drawable mo1156e(Uri uri) {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f946r.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:32|33|34) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:44|45|46|47|48|49) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:37|38|39|40|41|42|43) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r1);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0086 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00b1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00bb */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x0081=Splitter:B:30:0x0081, B:41:0x00b1=Splitter:B:41:0x00b1, B:47:0x00bb=Splitter:B:47:0x00bb} */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo1157f(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L_0x00e8
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x00e8
            java.lang.String r1 = "0"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0013
            goto L_0x00e8
        L_0x0013:
            int r1 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            r2.<init>()     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            java.lang.String r3 = "android.resource://"
            r2.append(r3)     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            android.content.Context r3 = r5.f946r     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            r2.append(r3)     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            java.lang.String r3 = "/"
            r2.append(r3)     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            r2.append(r1)     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            java.lang.String r2 = r2.toString()     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r3 = r5.f947s     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            android.graphics.drawable.Drawable$ConstantState r3 = (android.graphics.drawable.Drawable.ConstantState) r3     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            if (r3 != 0) goto L_0x0042
            r3 = r0
            goto L_0x0046
        L_0x0042:
            android.graphics.drawable.Drawable r3 = r3.newDrawable()     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
        L_0x0046:
            if (r3 == 0) goto L_0x0049
            return r3
        L_0x0049:
            android.content.Context r3 = r5.f946r     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            java.lang.Object r4 = p001a0.C0002a.f0a     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            android.graphics.drawable.Drawable r1 = p001a0.C0002a.C0004b.m5b(r3, r1)     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            if (r1 == 0) goto L_0x005c
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r3 = r5.f947s     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            android.graphics.drawable.Drawable$ConstantState r4 = r1.getConstantState()     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            r3.put(r2, r4)     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
        L_0x005c:
            return r1
        L_0x005d:
            return r0
        L_0x005e:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r5.f947s
            java.lang.Object r1 = r1.get(r6)
            android.graphics.drawable.Drawable$ConstantState r1 = (android.graphics.drawable.Drawable.ConstantState) r1
            if (r1 != 0) goto L_0x006a
            r1 = r0
            goto L_0x006e
        L_0x006a:
            android.graphics.drawable.Drawable r1 = r1.newDrawable()
        L_0x006e:
            if (r1 == 0) goto L_0x0071
            return r1
        L_0x0071:
            android.net.Uri r1 = android.net.Uri.parse(r6)
            java.lang.String r2 = r1.getScheme()     // Catch:{ FileNotFoundException -> 0x00d6 }
            java.lang.String r3 = "android.resource"
            boolean r2 = r3.equals(r2)     // Catch:{ FileNotFoundException -> 0x00d6 }
            if (r2 == 0) goto L_0x009d
            android.graphics.drawable.Drawable r0 = r5.mo1156e(r1)     // Catch:{ NotFoundException -> 0x0086 }
            goto L_0x00dd
        L_0x0086:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x00d6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00d6 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x00d6 }
            java.lang.String r4 = "Resource does not exist: "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x00d6 }
            r3.append(r1)     // Catch:{ FileNotFoundException -> 0x00d6 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x00d6 }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00d6 }
            throw r2     // Catch:{ FileNotFoundException -> 0x00d6 }
        L_0x009d:
            android.content.Context r2 = r5.f946r     // Catch:{ FileNotFoundException -> 0x00d6 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ FileNotFoundException -> 0x00d6 }
            java.io.InputStream r2 = r2.openInputStream(r1)     // Catch:{ FileNotFoundException -> 0x00d6 }
            if (r2 == 0) goto L_0x00bf
            android.graphics.drawable.Drawable r3 = android.graphics.drawable.Drawable.createFromStream(r2, r0)     // Catch:{ all -> 0x00b6 }
            r2.close()     // Catch:{ IOException -> 0x00b1 }
            goto L_0x00b4
        L_0x00b1:
            r1.toString()     // Catch:{ FileNotFoundException -> 0x00d6 }
        L_0x00b4:
            r0 = r3
            goto L_0x00dd
        L_0x00b6:
            r3 = move-exception
            r2.close()     // Catch:{ IOException -> 0x00bb }
            goto L_0x00be
        L_0x00bb:
            r1.toString()     // Catch:{ FileNotFoundException -> 0x00d6 }
        L_0x00be:
            throw r3     // Catch:{ FileNotFoundException -> 0x00d6 }
        L_0x00bf:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x00d6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00d6 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x00d6 }
            java.lang.String r4 = "Failed to open "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x00d6 }
            r3.append(r1)     // Catch:{ FileNotFoundException -> 0x00d6 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x00d6 }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00d6 }
            throw r2     // Catch:{ FileNotFoundException -> 0x00d6 }
        L_0x00d6:
            r2 = move-exception
            java.util.Objects.toString(r1)
            r2.getMessage()
        L_0x00dd:
            if (r0 == 0) goto L_0x00e8
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r5.f947s
            android.graphics.drawable.Drawable$ConstantState r2 = r0.getConstantState()
            r1.put(r6, r2)
        L_0x00e8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0213v0.mo1157f(java.lang.String):android.graphics.drawable.Drawable");
    }

    /* renamed from: g */
    public Cursor mo1158g(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f946r.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View inflate = this.f4558o.inflate(this.f4557n, viewGroup, false);
            if (inflate != null) {
                ((C0214a) inflate.getTag()).f955a.setText(e.toString());
            }
            return inflate;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View d = mo1155d(this.f946r, this.f4547g, viewGroup);
            ((C0214a) d.getTag()).f955a.setText(e.toString());
            return d;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f4547g;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f4547g;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f944p.mo557s((CharSequence) tag);
        }
    }
}
