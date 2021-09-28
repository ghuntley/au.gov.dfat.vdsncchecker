package p040g0;

import android.content.Context;
import java.util.concurrent.Callable;
import p040g0.C0945j;

/* renamed from: g0.f */
public class C0941f implements Callable<C0945j.C0946a> {

    /* renamed from: a */
    public final /* synthetic */ String f3497a;

    /* renamed from: b */
    public final /* synthetic */ Context f3498b;

    /* renamed from: c */
    public final /* synthetic */ C0940e f3499c;

    /* renamed from: d */
    public final /* synthetic */ int f3500d;

    public C0941f(String str, Context context, C0940e eVar, int i) {
        this.f3497a = str;
        this.f3498b = context;
        this.f3499c = eVar;
        this.f3500d = i;
    }

    public Object call() {
        return C0945j.m2718a(this.f3497a, this.f3498b, this.f3499c, this.f3500d);
    }
}
