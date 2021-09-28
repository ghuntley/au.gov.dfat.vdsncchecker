package p040g0;

import android.content.Context;
import java.util.concurrent.Callable;
import p040g0.C0945j;

/* renamed from: g0.h */
public class C0943h implements Callable<C0945j.C0946a> {

    /* renamed from: a */
    public final /* synthetic */ String f3502a;

    /* renamed from: b */
    public final /* synthetic */ Context f3503b;

    /* renamed from: c */
    public final /* synthetic */ C0940e f3504c;

    /* renamed from: d */
    public final /* synthetic */ int f3505d;

    public C0943h(String str, Context context, C0940e eVar, int i) {
        this.f3502a = str;
        this.f3503b = context;
        this.f3504c = eVar;
        this.f3505d = i;
    }

    public Object call() {
        return C0945j.m2718a(this.f3502a, this.f3503b, this.f3504c, this.f3505d);
    }
}
