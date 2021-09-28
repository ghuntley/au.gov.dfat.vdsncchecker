package p065k1;

import android.widget.ImageView;
import android.widget.TextView;
import com.dynamsoft.dbr.TextResult;
import com.dynamsoft.dbr.TextResultCallback;
import com.dynamsoft.dce.TorchListener;
import com.dynamsoft.dce.TorchState;
import java.util.Arrays;
import p007au.gov.dfat.vdsncchecker.p008ui.ScanActivity;
import p007au.gov.dfat.vdsncchecker.p008ui.VdsActivity;
import p027e.C0854b;
import p072l2.C1241e;
import p077m1.C1426a;
import p118t0.C1777k;
import p136w0.C2036r;

/* renamed from: k1.o */
public final /* synthetic */ class C1183o implements C1777k, C0854b, TextResultCallback, TorchListener {

    /* renamed from: a */
    public final /* synthetic */ int f4067a;

    /* renamed from: b */
    public final /* synthetic */ Object f4068b;

    public /* synthetic */ C1183o(ScanActivity scanActivity, int i) {
        this.f4067a = i;
        if (!(i == 1 || i == 2)) {
        }
        this.f4068b = scanActivity;
    }

    public /* synthetic */ C1183o(VdsActivity vdsActivity) {
        this.f4067a = 5;
        this.f4068b = vdsActivity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1735a(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f4068b
            au.gov.dfat.vdsncchecker.ui.ScanActivity r0 = (p007au.gov.dfat.vdsncchecker.p008ui.ScanActivity) r0
            java.util.Map r11 = (java.util.Map) r11
            int r1 = p007au.gov.dfat.vdsncchecker.p008ui.ScanActivity.f2246H
            java.lang.String r1 = "this$0"
            p072l2.C1241e.m3517j(r0, r1)
            java.util.Set r11 = r11.entrySet()
            boolean r1 = r11 instanceof java.util.Collection
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001e
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto L_0x001e
            goto L_0x003c
        L_0x001e:
            java.util.Iterator r11 = r11.iterator()
        L_0x0022:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x003c
            java.lang.Object r1 = r11.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r1 = p072l2.C1241e.m3513b(r1, r4)
            if (r1 != 0) goto L_0x0022
            r11 = r2
            goto L_0x003d
        L_0x003c:
            r11 = r3
        L_0x003d:
            if (r11 == 0) goto L_0x0043
            r0.mo2475y()
            goto L_0x00a2
        L_0x0043:
            r11 = 2131886124(0x7f12002c, float:1.9406818E38)
            r1 = 2131886123(0x7f12002b, float:1.9406816E38)
            k1.r r4 = new k1.r
            r4.<init>(r0)
            r5 = 2131886114(0x7f120022, float:1.9406798E38)
            r6 = 17039360(0x1040000, float:2.424457E-38)
            i1.b r7 = p053i1.C1026b.f3746f
            java.lang.String r8 = "context"
            p072l2.C1241e.m3517j(r0, r8)
            java.lang.String r8 = "okCallback"
            p072l2.C1241e.m3517j(r4, r8)
            java.lang.String r8 = "cancelCallback"
            p072l2.C1241e.m3517j(r7, r8)
            a2.b r8 = new a2.b
            r8.<init>(r0)
            androidx.appcompat.app.AlertController$b r0 = r8.f264a
            android.content.Context r9 = r0.f241a
            java.lang.CharSequence r11 = r9.getText(r11)
            r0.f244d = r11
            androidx.appcompat.app.AlertController$b r11 = r8.f264a
            android.content.Context r0 = r11.f241a
            java.lang.CharSequence r0 = r0.getText(r1)
            r11.f246f = r0
            i1.a r11 = new i1.a
            r11.<init>(r4, r3)
            r8.mo6b(r5, r11)
            androidx.appcompat.app.AlertController$b r11 = r8.f264a
            r11.f253m = r2
            i1.a r0 = new i1.a
            r1 = 2
            r0.<init>(r7, r1)
            android.content.Context r1 = r11.f241a
            java.lang.CharSequence r1 = r1.getText(r6)
            r11.f249i = r1
            androidx.appcompat.app.AlertController$b r11 = r8.f264a
            r11.f250j = r0
            androidx.appcompat.app.b r11 = r8.mo5a()
            r11.show()
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p065k1.C1183o.mo1735a(java.lang.Object):void");
    }

    /* renamed from: b */
    public void mo4788b(Object obj) {
        int i = 0;
        switch (this.f4067a) {
            case 0:
                ScanActivity scanActivity = (ScanActivity) this.f4068b;
                Boolean bool = (Boolean) obj;
                int i2 = ScanActivity.f2246H;
                C1241e.m3517j(scanActivity, "this$0");
                TextView textView = scanActivity.f2255w;
                if (textView != null) {
                    C1241e.m3516f(bool, "it");
                    if (!bool.booleanValue()) {
                        i = 8;
                    }
                    textView.setVisibility(i);
                    return;
                }
                C1241e.m3524r("warningBanner");
                throw null;
            case 1:
                ScanActivity scanActivity2 = (ScanActivity) this.f4068b;
                byte[] bArr = (byte[]) obj;
                int i3 = ScanActivity.f2246H;
                C1241e.m3517j(scanActivity2, "this$0");
                if (bArr != null) {
                    C1241e.m3516f(String.format("Saving latest CRL...", Arrays.copyOf(new Object[]{new Object[0]}, 1)), "java.lang.String.format(format, *args)");
                    C2036r.m5373k(scanActivity2, bArr);
                    C2036r.m5374l(scanActivity2);
                    C1426a.m4088a(scanActivity2, scanActivity2.mo2473w());
                    return;
                }
                return;
            default:
                VdsActivity vdsActivity = (VdsActivity) this.f4068b;
                byte[] bArr2 = (byte[]) obj;
                int i4 = VdsActivity.f2269t;
                C1241e.m3517j(vdsActivity, "this$0");
                if (bArr2 != null) {
                    C1241e.m3516f(String.format("Saving latest CRL...", Arrays.copyOf(new Object[]{new Object[0]}, 1)), "java.lang.String.format(format, *args)");
                    C2036r.m5373k(vdsActivity, bArr2);
                    C2036r.m5374l(vdsActivity);
                    C1426a.m4088a(vdsActivity, vdsActivity.mo2479u());
                    return;
                }
                return;
        }
    }

    public void onTorchStateChanged(TorchState torchState) {
        ScanActivity scanActivity = (ScanActivity) this.f4068b;
        int i = ScanActivity.f2246H;
        C1241e.m3517j(scanActivity, "this$0");
        ImageView imageView = scanActivity.f2258z;
        if (imageView != null) {
            imageView.setImageResource(torchState == TorchState.TORCH_STATE_OFF ? 2131165311 : 2131165312);
        } else {
            C1241e.m3524r("torchButton");
            throw null;
        }
    }

    public void textResultCallback(int i, TextResult[] textResultArr, Object obj) {
        ScanActivity scanActivity = (ScanActivity) this.f4068b;
        int i2 = ScanActivity.f2246H;
        C1241e.m3517j(scanActivity, "this$0");
        scanActivity.runOnUiThread(new C1182n(scanActivity, textResultArr));
    }
}
