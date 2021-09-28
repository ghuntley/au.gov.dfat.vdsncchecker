package p054i2;

import android.graphics.Typeface;
import android.text.TextPaint;
import p075m.C1417c;

/* renamed from: i2.e */
public class C1032e extends C1417c {

    /* renamed from: a */
    public final /* synthetic */ TextPaint f3752a;

    /* renamed from: b */
    public final /* synthetic */ C1417c f3753b;

    /* renamed from: c */
    public final /* synthetic */ C1033f f3754c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1032e(C1033f fVar, TextPaint textPaint, C1417c cVar) {
        super(2);
        this.f3754c = fVar;
        this.f3752a = textPaint;
        this.f3753b = cVar;
    }

    /* renamed from: g */
    public void mo3467g(int i) {
        this.f3753b.mo3467g(i);
    }

    /* renamed from: h */
    public void mo3468h(Typeface typeface, boolean z) {
        this.f3754c.mo4473g(this.f3752a, typeface);
        this.f3753b.mo3468h(typeface, z);
    }
}
