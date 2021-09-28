package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.C0082i;

/* renamed from: androidx.appcompat.view.menu.a */
public abstract class C0064a implements C0082i {

    /* renamed from: e */
    public Context f297e;

    /* renamed from: f */
    public Context f298f;

    /* renamed from: g */
    public C0074e f299g;

    /* renamed from: h */
    public LayoutInflater f300h;

    /* renamed from: i */
    public C0082i.C0083a f301i;

    /* renamed from: j */
    public int f302j;

    /* renamed from: k */
    public int f303k;

    /* renamed from: l */
    public C0084j f304l;

    public C0064a(Context context, int i, int i2) {
        this.f297e = context;
        this.f300h = LayoutInflater.from(context);
        this.f302j = i;
        this.f303k = i2;
    }

    /* renamed from: e */
    public boolean mo198e(C0074e eVar, C0078g gVar) {
        return false;
    }

    /* renamed from: g */
    public boolean mo199g(C0074e eVar, C0078g gVar) {
        return false;
    }

    /* renamed from: h */
    public void mo200h(C0082i.C0083a aVar) {
        this.f301i = aVar;
    }
}
