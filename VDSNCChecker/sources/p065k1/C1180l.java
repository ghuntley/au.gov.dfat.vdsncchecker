package p065k1;

import android.view.View;
import p007au.gov.dfat.vdsncchecker.p008ui.ScanActivity;
import p007au.gov.dfat.vdsncchecker.p008ui.SummaryFragment;

/* renamed from: k1.l */
public final /* synthetic */ class C1180l implements View.OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ int f4060e = 0;

    /* renamed from: f */
    public final /* synthetic */ Object f4061f;

    public /* synthetic */ C1180l(ScanActivity scanActivity) {
        this.f4061f = scanActivity;
    }

    public /* synthetic */ C1180l(SummaryFragment summaryFragment) {
        this.f4061f = summaryFragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            int r10 = r9.f4060e
            r0 = 0
            java.lang.String r1 = "this$0"
            switch(r10) {
                case 0: goto L_0x0009;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x002a
        L_0x0009:
            java.lang.Object r10 = r9.f4061f
            au.gov.dfat.vdsncchecker.ui.ScanActivity r10 = (p007au.gov.dfat.vdsncchecker.p008ui.ScanActivity) r10
            int r2 = p007au.gov.dfat.vdsncchecker.p008ui.ScanActivity.f2246H
            p072l2.C1241e.m3517j(r10, r1)
            com.dynamsoft.dce.CameraEnhancer r10 = r10.f2252F
            if (r10 == 0) goto L_0x0024
            com.dynamsoft.dce.TorchState r0 = r10.getTorchCurrentState()
            com.dynamsoft.dce.TorchState r1 = com.dynamsoft.dce.TorchState.TORCH_STATE_OFF
            if (r0 != r1) goto L_0x0020
            com.dynamsoft.dce.TorchState r1 = com.dynamsoft.dce.TorchState.TORCH_STATE_ON
        L_0x0020:
            r10.setTorchDesiredState(r1)
            return
        L_0x0024:
            java.lang.String r10 = "cameraEnhancer"
            p072l2.C1241e.m3524r(r10)
            throw r0
        L_0x002a:
            java.lang.Object r10 = r9.f4061f
            au.gov.dfat.vdsncchecker.ui.SummaryFragment r10 = (p007au.gov.dfat.vdsncchecker.p008ui.SummaryFragment) r10
            int r2 = p007au.gov.dfat.vdsncchecker.p008ui.SummaryFragment.f2262f0
            p072l2.C1241e.m3517j(r10, r1)
            androidx.navigation.NavController r1 = androidx.navigation.fragment.NavHostFragment.m1076m0(r10)
            java.lang.String r2 = "NavHostFragment.findNavController(this)"
            p072l2.C1241e.m3514d(r1, r2)
            k1.s r10 = r10.mo2478m0()
            au.gov.dfat.vdsncchecker.vds.VdsParcel r10 = r10.f4073a
            java.lang.String r2 = "vds"
            p072l2.C1241e.m3517j(r10, r2)
            r3 = 2131296325(0x7f090045, float:1.8210563E38)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.Class<android.os.Parcelable> r5 = android.os.Parcelable.class
            java.lang.Class<au.gov.dfat.vdsncchecker.vds.VdsParcel> r6 = p007au.gov.dfat.vdsncchecker.vds.VdsParcel.class
            boolean r5 = r5.isAssignableFrom(r6)
            if (r5 == 0) goto L_0x005d
            r4.putParcelable(r2, r10)
            goto L_0x006c
        L_0x005d:
            java.lang.Class<java.io.Serializable> r5 = java.io.Serializable.class
            java.lang.Class<au.gov.dfat.vdsncchecker.vds.VdsParcel> r6 = p007au.gov.dfat.vdsncchecker.vds.VdsParcel.class
            boolean r5 = r5.isAssignableFrom(r6)
            if (r5 == 0) goto L_0x012a
            java.io.Serializable r10 = (java.io.Serializable) r10
            r4.putSerializable(r2, r10)
        L_0x006c:
            java.util.Deque<w0.g> r10 = r1.f1726h
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x0077
            androidx.navigation.c r10 = r1.f1722d
            goto L_0x0081
        L_0x0077:
            java.util.Deque<w0.g> r10 = r1.f1726h
            java.lang.Object r10 = r10.getLast()
            w0.g r10 = (p136w0.C2004g) r10
            androidx.navigation.b r10 = r10.f5821e
        L_0x0081:
            if (r10 == 0) goto L_0x0122
            w0.b r2 = r10.mo1867b(r3)
            if (r2 == 0) goto L_0x009a
            w0.m r5 = r2.f5810b
            int r6 = r2.f5809a
            android.os.Bundle r7 = r2.f5811c
            if (r7 == 0) goto L_0x009c
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            r8.putAll(r7)
            goto L_0x009d
        L_0x009a:
            r5 = r0
            r6 = r3
        L_0x009c:
            r8 = r0
        L_0x009d:
            if (r8 != 0) goto L_0x00a4
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
        L_0x00a4:
            r8.putAll(r4)
            if (r6 != 0) goto L_0x00bc
            if (r5 == 0) goto L_0x00bc
            int r4 = r5.f5853b
            r7 = -1
            if (r4 == r7) goto L_0x00bc
            boolean r10 = r5.f5854c
            boolean r10 = r1.mo1857f(r4, r10)
            if (r10 == 0) goto L_0x0119
            r1.mo1852a()
            goto L_0x0119
        L_0x00bc:
            if (r6 == 0) goto L_0x011a
            androidx.navigation.b r4 = r1.mo1853b(r6)
            if (r4 != 0) goto L_0x0116
            android.content.Context r0 = r1.f1719a
            java.lang.String r0 = androidx.navigation.C0364b.m1046c(r0, r6)
            java.lang.String r4 = " cannot be found from the current destination "
            if (r2 == 0) goto L_0x00f9
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Navigation destination "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = " referenced from action "
            r5.append(r0)
            android.content.Context r0 = r1.f1719a
            java.lang.String r0 = androidx.navigation.C0364b.m1046c(r0, r3)
            r5.append(r0)
            r5.append(r4)
            r5.append(r10)
            java.lang.String r10 = r5.toString()
            r2.<init>(r10)
            throw r2
        L_0x00f9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Navigation action/destination "
            r2.append(r3)
            r2.append(r0)
            r2.append(r4)
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            r1.<init>(r10)
            throw r1
        L_0x0116:
            r1.mo1855d(r4, r8, r5, r0)
        L_0x0119:
            return
        L_0x011a:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo"
            r10.<init>(r0)
            throw r10
        L_0x0122:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "no current navigation node"
            r10.<init>(r0)
            throw r10
        L_0x012a:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.Class<au.gov.dfat.vdsncchecker.vds.VdsParcel> r0 = p007au.gov.dfat.vdsncchecker.vds.VdsParcel.class
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = " must implement Parcelable or Serializable or must be an Enum."
            java.lang.String r0 = p072l2.C1241e.m3522p(r0, r1)
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p065k1.C1180l.onClick(android.view.View):void");
    }
}
