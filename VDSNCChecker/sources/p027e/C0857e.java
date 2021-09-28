package p027e;

import androidx.activity.result.C0051a;
import p033f.C0881a;
import p150z.C2147b;

/* renamed from: e.e */
public class C0857e extends C0855c<Object> {

    /* renamed from: a */
    public final /* synthetic */ String f3305a;

    /* renamed from: b */
    public final /* synthetic */ int f3306b;

    /* renamed from: c */
    public final /* synthetic */ C0881a f3307c;

    /* renamed from: d */
    public final /* synthetic */ C0051a f3308d;

    public C0857e(C0051a aVar, String str, int i, C0881a aVar2) {
        this.f3308d = aVar;
        this.f3305a = str;
        this.f3306b = i;
        this.f3307c = aVar2;
    }

    /* renamed from: a */
    public void mo146a(Object obj, C2147b bVar) {
        this.f3308d.f182e.add(this.f3305a);
        Integer num = this.f3308d.f180c.get(this.f3305a);
        this.f3308d.mo136b(num != null ? num.intValue() : this.f3306b, this.f3307c, obj, (C2147b) null);
    }

    /* renamed from: b */
    public void mo147b() {
        this.f3308d.mo145e(this.f3305a);
    }
}
