package p007au.gov.dfat.vdsncchecker.p008ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultRegistry$1;
import androidx.activity.result.C0051a;
import androidx.appcompat.app.AlertController;
import androidx.constraintlayout.widget.C0237b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C0342c;
import androidx.lifecycle.C0347e;
import com.dynamsoft.dbr.BarcodeReader;
import com.dynamsoft.dbr.TextResultCallback;
import com.dynamsoft.dce.CameraEnhancer;
import com.dynamsoft.dce.CameraView;
import java.util.ArrayList;
import java.util.Objects;
import p000a.C0001b;
import p003a2.C0009b;
import p007au.gov.dfat.vdsncchecker.R;
import p007au.gov.dfat.vdsncchecker.camera.GraphicOverlay;
import p019c3.C0625a;
import p025d3.C0806j;
import p025d3.C0810n;
import p027e.C0855c;
import p027e.C0857e;
import p033f.C0883b;
import p045h.C0958a;
import p045h.C0995s;
import p053i1.C1025a;
import p065k1.C1169c;
import p065k1.C1172f;
import p065k1.C1183o;
import p065k1.C1184p;
import p071l1.C1234a;
import p072l2.C1241e;
import p077m1.C1426a;
import p118t0.C1780n;
import p118t0.C1781o;
import p118t0.C1784r;
import p120t2.C1790d;
import p136w0.C2036r;
import p150z.C2147b;

/* renamed from: au.gov.dfat.vdsncchecker.ui.ScanActivity */
public final class ScanActivity extends C1172f {

    /* renamed from: H */
    public static final /* synthetic */ int f2246H = 0;

    /* renamed from: A */
    public TextView f2247A;

    /* renamed from: B */
    public final C1790d f2248B = new C1780n(C0810n.m2403a(C1169c.class), new C0493c(this), C0491a.f2259f);

    /* renamed from: C */
    public BarcodeReader f2249C;

    /* renamed from: D */
    public boolean f2250D;

    /* renamed from: E */
    public TextResultCallback f2251E;

    /* renamed from: F */
    public CameraEnhancer f2252F;

    /* renamed from: G */
    public final C0855c<String[]> f2253G;

    /* renamed from: v */
    public ConstraintLayout f2254v;

    /* renamed from: w */
    public TextView f2255w;

    /* renamed from: x */
    public CameraView f2256x;

    /* renamed from: y */
    public GraphicOverlay f2257y;

    /* renamed from: z */
    public ImageView f2258z;

    /* renamed from: au.gov.dfat.vdsncchecker.ui.ScanActivity$a */
    public static final class C0491a extends C0806j implements C0625a<C1781o> {

        /* renamed from: f */
        public static final C0491a f2259f = new C0491a();

        public C0491a() {
            super(0);
        }

        /* renamed from: b */
        public Object mo40b() {
            return C1234a.m3507a();
        }
    }

    /* renamed from: au.gov.dfat.vdsncchecker.ui.ScanActivity$b */
    public static final class C0492b implements View.OnLayoutChangeListener {

        /* renamed from: a */
        public final /* synthetic */ ScanActivity f2260a;

        public C0492b(ScanActivity scanActivity) {
            this.f2260a = scanActivity;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C1241e.m3517j(view, "view");
            view.removeOnLayoutChangeListener(this);
            ScanActivity.m1719u(this.f2260a);
        }
    }

    /* renamed from: au.gov.dfat.vdsncchecker.ui.ScanActivity$c */
    public static final class C0493c extends C0806j implements C0625a<C1784r> {

        /* renamed from: f */
        public final /* synthetic */ ComponentActivity f2261f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0493c(ComponentActivity componentActivity) {
            super(0);
            this.f2261f = componentActivity;
        }

        /* renamed from: b */
        public Object mo40b() {
            C1784r j = this.f2261f.mo116j();
            C1241e.m3516f(j, "viewModelStore");
            return j;
        }
    }

    static {
        System.loadLibrary("vdsncchecker");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScanActivity() {
        super(false, false, true, 2);
        boolean z = false;
        C0883b bVar = new C0883b();
        C1183o oVar = new C1183o(this, 2);
        C0051a aVar = this.f148l;
        StringBuilder a = C0001b.m0a("activity_rq#");
        a.append(this.f147k.getAndIncrement());
        String sb = a.toString();
        Objects.requireNonNull(aVar);
        C0347e eVar = this.f143g;
        if (!(eVar.f1689b.compareTo(C0342c.C0345c.STARTED) >= 0 ? true : z)) {
            int d = aVar.mo144d(sb);
            C0051a.C0054c cVar = aVar.f181d.get(sb);
            cVar = cVar == null ? new C0051a.C0054c(eVar) : cVar;
            ActivityResultRegistry$1 activityResultRegistry$1 = new ActivityResultRegistry$1(aVar, sb, oVar, bVar);
            cVar.f192a.mo1802a(activityResultRegistry$1);
            cVar.f193b.add(activityResultRegistry$1);
            aVar.f181d.put(sb, cVar);
            this.f2253G = new C0857e(aVar, sb, d, bVar);
            return;
        }
        throw new IllegalStateException("LifecycleOwner " + this + " is attempting to register while current state is " + eVar.f1689b + ". LifecycleOwners must call register before they are STARTED.");
    }

    /* renamed from: u */
    public static final void m1719u(ScanActivity scanActivity) {
        float f;
        CameraView cameraView = scanActivity.f2256x;
        if (cameraView != null) {
            float width = ((float) cameraView.getWidth()) * 0.75f;
            CameraView cameraView2 = scanActivity.f2256x;
            if (cameraView2 != null) {
                float f2 = (float) 2;
                float height = (width / f2) + ((float) (cameraView2.getHeight() / 2));
                TextView textView = scanActivity.f2255w;
                if (textView != null) {
                    if (textView.getVisibility() == 0) {
                        TextView textView2 = scanActivity.f2255w;
                        if (textView2 != null) {
                            float height2 = ((float) (textView2.getHeight() * 2)) + height;
                            CameraView cameraView3 = scanActivity.f2256x;
                            if (cameraView3 != null) {
                                f = (height2 + ((float) cameraView3.getHeight())) / f2;
                            } else {
                                C1241e.m3524r("cameraView");
                                throw null;
                            }
                        } else {
                            C1241e.m3524r("warningBanner");
                            throw null;
                        }
                    } else {
                        CameraView cameraView4 = scanActivity.f2256x;
                        if (cameraView4 != null) {
                            f = (height + ((float) cameraView4.getHeight())) / f2;
                        } else {
                            C1241e.m3524r("cameraView");
                            throw null;
                        }
                    }
                    C0237b bVar = new C0237b();
                    ConstraintLayout constraintLayout = scanActivity.f2254v;
                    if (constraintLayout != null) {
                        bVar.mo1308c(constraintLayout);
                        bVar.mo1312g(R.id.torchButtonGuideline).f1123d.f1174e = (int) f;
                        bVar.mo1312g(R.id.torchButtonGuideline).f1123d.f1176f = -1;
                        bVar.mo1312g(R.id.torchButtonGuideline).f1123d.f1178g = -1.0f;
                        C0237b bVar2 = bVar;
                        bVar2.mo1309d(R.id.torchButton, 3, R.id.torchButtonGuideline, 3, 0);
                        bVar2.mo1309d(R.id.torchButton, 4, R.id.torchButtonGuideline, 4, 0);
                        ConstraintLayout constraintLayout2 = scanActivity.f2254v;
                        if (constraintLayout2 != null) {
                            bVar.mo1307b(constraintLayout2, true);
                            constraintLayout2.setConstraintSet((C0237b) null);
                            constraintLayout2.requestLayout();
                            return;
                        }
                        C1241e.m3524r("parentLayout");
                        throw null;
                    }
                    C1241e.m3524r("parentLayout");
                    throw null;
                }
                C1241e.m3524r("warningBanner");
                throw null;
            }
            C1241e.m3524r("cameraView");
            throw null;
        }
        C1241e.m3524r("cameraView");
        throw null;
    }

    /* renamed from: A */
    public final void mo2464A() {
        BarcodeReader barcodeReader = this.f2249C;
        if (barcodeReader != null && this.f2250D) {
            C1241e.m3515e(barcodeReader);
            barcodeReader.StopCameraEnhancer();
            this.f2250D = false;
        }
    }

    /* renamed from: a */
    public final native void mo2465a();

    /* renamed from: b */
    public final native int mo2466b();

    public void onCreate(Bundle bundle) {
        mo2465a();
        super.onCreate(bundle);
        getWindow().setFlags(8192, 8192);
        setContentView((int) R.layout.activity_scan);
        C0958a s = mo4293s();
        C1241e.m3515e(s);
        ((C0995s) s).f3669d.setPrimaryBackground(new ColorDrawable(Color.parseColor(getString(R.color.blue_500))));
        View findViewById = findViewById(R.id.parentLayout);
        C1241e.m3516f(findViewById, "findViewById(R.id.parentLayout)");
        this.f2254v = (ConstraintLayout) findViewById;
        View findViewById2 = findViewById(R.id.warningBanner);
        C1241e.m3516f(findViewById2, "findViewById(R.id.warningBanner)");
        this.f2255w = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.camera_view);
        C1241e.m3516f(findViewById3, "findViewById(R.id.camera_view)");
        this.f2256x = (CameraView) findViewById3;
        View findViewById4 = findViewById(R.id.graphic_overlay);
        C1241e.m3516f(findViewById4, "findViewById(R.id.graphic_overlay)");
        this.f2257y = (GraphicOverlay) findViewById4;
        View findViewById5 = findViewById(R.id.torchButton);
        C1241e.m3516f(findViewById5, "findViewById(R.id.torchButton)");
        this.f2258z = (ImageView) findViewById5;
        View findViewById6 = findViewById(R.id.invalidCode);
        C1241e.m3516f(findViewById6, "findViewById(R.id.invalidCode)");
        this.f2247A = (TextView) findViewById6;
        mo2473w().f4032f.mo1780d(this, new C1183o(this, 0));
        mo2473w().f4031e.mo1780d(this, new C1183o(this, 1));
        if (mo2472v()) {
            mo2475y();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C1241e.m3517j(menuItem, "item");
        if (menuItem.getItemId() != R.id.action_info) {
            return super.onOptionsItemSelected(menuItem);
        }
        startActivity(new Intent(this, AboutActivity.class));
        return true;
    }

    public void onPause() {
        super.onPause();
        mo2464A();
    }

    public void onResume() {
        super.onResume();
        C1426a.m4088a(this, mo2473w());
        C1426a.m4089b(this, mo2473w());
        BarcodeReader barcodeReader = this.f2249C;
        if (barcodeReader != null && !this.f2250D) {
            C1241e.m3515e(barcodeReader);
            barcodeReader.StartCameraEnhancer();
            this.f2250D = true;
        }
    }

    public void onStart() {
        super.onStart();
        if (!mo2472v()) {
            ArrayList arrayList = new ArrayList();
            String[] x = mo2474x();
            int length = x.length;
            int i = 0;
            while (i < length) {
                String str = x[i];
                i++;
                if (str != null && !mo2476z(this, str)) {
                    arrayList.add(str);
                }
            }
            if (!arrayList.isEmpty()) {
                C1241e.m3517j(this, "context");
                if (!C2036r.m5367e(this).getBoolean("PREF_CAMERA_ACCESS_EXPLANATION_DISPLAYED", false)) {
                    String string = getString(R.string.cameraAccessTitle);
                    C1241e.m3516f(string, "getString(R.string.cameraAccessTitle)");
                    String string2 = getString(R.string.cameraAccessDescription, new Object[]{getString(R.string.app_name)});
                    C1241e.m3516f(string2, "getString(R.string.cameraAccessDescription, getString(R.string.app_name))");
                    C1184p pVar = new C1184p(this, arrayList);
                    C1241e.m3517j(this, "context");
                    C1241e.m3517j(string, "title");
                    C1241e.m3517j(string2, "message");
                    C1241e.m3517j(pVar, "okCallback");
                    C0009b bVar = new C0009b(this);
                    AlertController.C0056b bVar2 = bVar.f264a;
                    bVar2.f244d = string;
                    bVar2.f246f = string2;
                    bVar.mo6b(17039370, new C1025a(pVar, 0));
                    bVar.f264a.f253m = false;
                    bVar.mo5a().show();
                    C1241e.m3517j(this, "context");
                    SharedPreferences.Editor edit = C2036r.m5367e(this).edit();
                    edit.putBoolean("PREF_CAMERA_ACCESS_EXPLANATION_DISPLAYED", true);
                    edit.apply();
                    return;
                }
                C0855c<String[]> cVar = this.f2253G;
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                cVar.mo146a(array, (C2147b) null);
            }
        }
    }

    /* renamed from: v */
    public final boolean mo2472v() {
        String[] x = mo2474x();
        int length = x.length;
        int i = 0;
        while (i < length) {
            String str = x[i];
            i++;
            if (str != null && !mo2476z(this, str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: w */
    public final C1169c mo2473w() {
        return (C1169c) this.f2248B.getValue();
    }

    /* renamed from: x */
    public final String[] mo2474x() {
        try {
            String[] strArr = getPackageManager().getPackageInfo(getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                if (!(strArr.length == 0)) {
                    return strArr;
                }
            }
            return new String[0];
        } catch (Exception unused) {
            return new String[0];
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2475y() {
        /*
            r11 = this;
            r0 = 0
            r1 = 1
            com.dynamsoft.dbr.BarcodeReader r2 = new com.dynamsoft.dbr.BarcodeReader     // Catch:{ BarcodeReaderException -> 0x0034 }
            java.lang.String r3 = "f0068NQAAAG47SZbzdRgiqsdYFgEUpCDOpUWr8O3n9WHkyE/HW9Y0m9NXHH8rmaJjDZdn+MFuipdI2i8GhxculIsX9Ow2fN8="
            r2.<init>(r3)     // Catch:{ BarcodeReaderException -> 0x0034 }
            com.dynamsoft.dbr.DMDLSConnectionParameters r3 = new com.dynamsoft.dbr.DMDLSConnectionParameters     // Catch:{ BarcodeReaderException -> 0x0034 }
            r3.<init>()     // Catch:{ BarcodeReaderException -> 0x0034 }
            k1.m r4 = p065k1.C1181m.f4062b     // Catch:{ BarcodeReaderException -> 0x0034 }
            r2.initLicenseFromDLS(r3, r4)     // Catch:{ BarcodeReaderException -> 0x0034 }
            r2.enableResultVerification(r1)     // Catch:{ BarcodeReaderException -> 0x0034 }
            r11.f2249C = r2     // Catch:{ BarcodeReaderException -> 0x0034 }
            p072l2.C1241e.m3515e(r2)     // Catch:{ BarcodeReaderException -> 0x0034 }
            com.dynamsoft.dbr.PublicRuntimeSettings r2 = r2.getRuntimeSettings()     // Catch:{ BarcodeReaderException -> 0x0034 }
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            r2.barcodeFormatIds = r3     // Catch:{ BarcodeReaderException -> 0x0034 }
            r2.barcodeFormatIds_2 = r0     // Catch:{ BarcodeReaderException -> 0x0034 }
            r2.expectedBarcodesCount = r1     // Catch:{ BarcodeReaderException -> 0x0034 }
            r3 = 30
            r2.minResultConfidence = r3     // Catch:{ BarcodeReaderException -> 0x0034 }
            com.dynamsoft.dbr.BarcodeReader r3 = r11.f2249C     // Catch:{ BarcodeReaderException -> 0x0034 }
            p072l2.C1241e.m3515e(r3)     // Catch:{ BarcodeReaderException -> 0x0034 }
            r3.updateRuntimeSettings(r2)     // Catch:{ BarcodeReaderException -> 0x0034 }
            goto L_0x005b
        L_0x0034:
            r2 = move-exception
            java.lang.String r3 = "ScanActivity"
            java.lang.String r9 = "Error with barcode reader"
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r0] = r2
            java.lang.String r4 = "tag"
            java.lang.String r6 = "msg"
            java.lang.String r8 = "params"
            r5 = r9
            r7 = r10
            p136w0.C2034p.m5361a(r3, r4, r5, r6, r7, r8)
            java.lang.String r2 = "java.lang.String.format(format, *args)"
            int r3 = r10.length
            if (r3 != r1) goto L_0x0054
            boolean r3 = r10 instanceof java.lang.Throwable
            if (r3 == 0) goto L_0x0054
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            goto L_0x005b
        L_0x0054:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r3[r0] = r10
            p136w0.C2035q.m5362a(r3, r1, r9, r2)
        L_0x005b:
            k1.o r2 = new k1.o
            r3 = 3
            r2.<init>(r11, r3)
            r11.f2251E = r2
            com.dynamsoft.dce.CameraEnhancer r2 = new com.dynamsoft.dce.CameraEnhancer
            r2.<init>(r11)
            com.dynamsoft.dce.CameraView r3 = r11.f2256x
            r4 = 0
            if (r3 == 0) goto L_0x015d
            r2.addCameraView(r3)
            com.dynamsoft.dce.DMDLSConnectionParameters r3 = new com.dynamsoft.dce.DMDLSConnectionParameters
            r3.<init>()
            k1.m r5 = p065k1.C1181m.f4063c
            r2.initLicenseFromDLS(r3, r5)
            r11.f2252F = r2
            au.gov.dfat.vdsncchecker.camera.GraphicOverlay r2 = r11.f2257y
            if (r2 == 0) goto L_0x0157
            g1.a r3 = new g1.a
            if (r2 == 0) goto L_0x0151
            r3.<init>(r2)
            java.lang.String r5 = "graphic"
            p072l2.C1241e.m3517j(r3, r5)
            java.lang.Object r5 = r2.f2236e
            monitor-enter(r5)
            java.util.List<au.gov.dfat.vdsncchecker.camera.GraphicOverlay$a> r2 = r2.f2237f     // Catch:{ all -> 0x014e }
            r2.add(r3)     // Catch:{ all -> 0x014e }
            monitor-exit(r5)
            com.dynamsoft.dce.CameraEnhancer r2 = r11.f2252F
            if (r2 == 0) goto L_0x0148
            int r2 = r2.getDeviceLevel()
            if (r2 == r1) goto L_0x00a5
            r3 = 2
            if (r2 == r3) goto L_0x00a3
            r0 = r1
        L_0x00a3:
            r2 = r0
            goto L_0x00a6
        L_0x00a5:
            r2 = r1
        L_0x00a6:
            com.dynamsoft.dce.CameraEnhancer r3 = r11.f2252F
            if (r3 == 0) goto L_0x0142
            r3.enableDCEAutoFocus(r0)
            r3.enableFrameFilter(r2)
            r3.enableSensorControl(r1)
            r3.enableFastMode(r1)
            android.content.pm.PackageManager r0 = r11.getPackageManager()
            java.lang.String r1 = "android.hardware.camera.flash"
            boolean r0 = r0.hasSystemFeature(r1)
            if (r0 == 0) goto L_0x011c
            android.widget.ImageView r0 = r11.f2258z
            if (r0 == 0) goto L_0x0116
            r1 = 2131165311(0x7f07007f, float:1.7944836E38)
            r0.setImageResource(r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r11.f2254v
            if (r0 == 0) goto L_0x0110
            java.util.WeakHashMap<android.view.View, j0.q> r1 = p058j0.C1061o.f3808a
            boolean r1 = r0.isLaidOut()
            if (r1 == 0) goto L_0x00e2
            boolean r1 = r0.isLayoutRequested()
            if (r1 != 0) goto L_0x00e2
            m1719u(r11)
            goto L_0x00ea
        L_0x00e2:
            au.gov.dfat.vdsncchecker.ui.ScanActivity$b r1 = new au.gov.dfat.vdsncchecker.ui.ScanActivity$b
            r1.<init>(r11)
            r0.addOnLayoutChangeListener(r1)
        L_0x00ea:
            android.widget.ImageView r0 = r11.f2258z
            if (r0 == 0) goto L_0x010a
            k1.l r1 = new k1.l
            r1.<init>((p007au.gov.dfat.vdsncchecker.p008ui.ScanActivity) r11)
            r0.setOnClickListener(r1)
            com.dynamsoft.dce.CameraEnhancer r0 = r11.f2252F
            if (r0 == 0) goto L_0x0104
            k1.o r1 = new k1.o
            r2 = 4
            r1.<init>(r11, r2)
            r0.addTorchListener(r1)
            goto L_0x011c
        L_0x0104:
            java.lang.String r0 = "cameraEnhancer"
            p072l2.C1241e.m3524r(r0)
            throw r4
        L_0x010a:
            java.lang.String r0 = "torchButton"
            p072l2.C1241e.m3524r(r0)
            throw r4
        L_0x0110:
            java.lang.String r0 = "parentLayout"
            p072l2.C1241e.m3524r(r0)
            throw r4
        L_0x0116:
            java.lang.String r0 = "torchButton"
            p072l2.C1241e.m3524r(r0)
            throw r4
        L_0x011c:
            com.dynamsoft.dbr.DCESettingParameters r0 = new com.dynamsoft.dbr.DCESettingParameters
            r0.<init>()
            com.dynamsoft.dce.CameraEnhancer r1 = r11.f2252F
            if (r1 == 0) goto L_0x013c
            r0.cameraInstance = r1
            com.dynamsoft.dbr.TextResultCallback r1 = r11.f2251E
            if (r1 == 0) goto L_0x0136
            r0.textResultCallback = r1
            com.dynamsoft.dbr.BarcodeReader r1 = r11.f2249C
            p072l2.C1241e.m3515e(r1)
            r1.SetCameraEnhancerParam(r0)
            return
        L_0x0136:
            java.lang.String r0 = "textResultCallback"
            p072l2.C1241e.m3524r(r0)
            throw r4
        L_0x013c:
            java.lang.String r0 = "cameraEnhancer"
            p072l2.C1241e.m3524r(r0)
            throw r4
        L_0x0142:
            java.lang.String r0 = "cameraEnhancer"
            p072l2.C1241e.m3524r(r0)
            throw r4
        L_0x0148:
            java.lang.String r0 = "cameraEnhancer"
            p072l2.C1241e.m3524r(r0)
            throw r4
        L_0x014e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0151:
            java.lang.String r0 = "graphicOverlay"
            p072l2.C1241e.m3524r(r0)
            throw r4
        L_0x0157:
            java.lang.String r0 = "graphicOverlay"
            p072l2.C1241e.m3524r(r0)
            throw r4
        L_0x015d:
            java.lang.String r0 = "cameraView"
            p072l2.C1241e.m3524r(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p007au.gov.dfat.vdsncchecker.p008ui.ScanActivity.mo2475y():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2476z(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = this;
            int r4 = p001a0.C0002a.m1a(r4, r5)
            java.lang.String r0 = "java.lang.String.format(format, *args)"
            r1 = 0
            r2 = 1
            if (r4 != 0) goto L_0x001f
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r1] = r5
            boolean r5 = r4 instanceof java.lang.Throwable
            if (r5 == 0) goto L_0x0015
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            goto L_0x001e
        L_0x0015:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r1] = r4
            java.lang.String r4 = "Permission granted: %1$s"
            p136w0.C2035q.m5362a(r5, r2, r4, r0)
        L_0x001e:
            return r2
        L_0x001f:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r1] = r5
            boolean r5 = r4 instanceof java.lang.Throwable
            if (r5 == 0) goto L_0x002a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            goto L_0x0033
        L_0x002a:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r1] = r4
            java.lang.String r4 = "Permission NOT granted: %1$s"
            p136w0.C2035q.m5362a(r5, r2, r4, r0)
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p007au.gov.dfat.vdsncchecker.p008ui.ScanActivity.mo2476z(android.content.Context, java.lang.String):boolean");
    }
}
