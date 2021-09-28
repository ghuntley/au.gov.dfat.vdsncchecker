package androidx.appcompat.widget;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import p058j0.C1047c;
import p058j0.C1061o;
import p070l0.C1229d;
import p070l0.C1230e;

/* renamed from: androidx.appcompat.widget.u */
public class C0209u implements C1229d {

    /* renamed from: a */
    public final /* synthetic */ View f935a;

    public C0209u(View view) {
        this.f935a = view;
    }

    /* renamed from: a */
    public boolean mo1135a(C1230e eVar, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                eVar.f4154a.mo4944a();
                InputContentInfo inputContentInfo = (InputContentInfo) eVar.f4154a.mo4947d();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception unused) {
                return false;
            }
        }
        C1047c.C1048a aVar = new C1047c.C1048a(new ClipData(eVar.f4154a.mo4946c(), new ClipData.Item(eVar.f4154a.mo4948e())), 2);
        aVar.f3791d = eVar.f4154a.mo4945b();
        aVar.f3792e = bundle;
        if (C1061o.m3030k(this.f935a, new C1047c(aVar)) == null) {
            return true;
        }
        return false;
    }
}
