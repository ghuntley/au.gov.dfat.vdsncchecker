package p036f2;

import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p054i2.C1033f;
import p075m.C1417c;

/* renamed from: f2.i */
public class C0899i {

    /* renamed from: a */
    public final TextPaint f3418a = new TextPaint(1);

    /* renamed from: b */
    public final C1417c f3419b = new C0900a();

    /* renamed from: c */
    public float f3420c;

    /* renamed from: d */
    public boolean f3421d = true;

    /* renamed from: e */
    public WeakReference<C0901b> f3422e = new WeakReference<>((Object) null);

    /* renamed from: f */
    public C1033f f3423f;

    /* renamed from: f2.i$a */
    public class C0900a extends C1417c {
        public C0900a() {
            super(2);
        }

        /* renamed from: g */
        public void mo3467g(int i) {
            C0899i iVar = C0899i.this;
            iVar.f3421d = true;
            C0901b bVar = (C0901b) iVar.f3422e.get();
            if (bVar != null) {
                bVar.mo3535a();
            }
        }

        /* renamed from: h */
        public void mo3468h(Typeface typeface, boolean z) {
            if (!z) {
                C0899i iVar = C0899i.this;
                iVar.f3421d = true;
                C0901b bVar = (C0901b) iVar.f3422e.get();
                if (bVar != null) {
                    bVar.mo3535a();
                }
            }
        }
    }

    /* renamed from: f2.i$b */
    public interface C0901b {
        /* renamed from: a */
        void mo3535a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C0899i(C0901b bVar) {
        this.f3422e = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public float mo4226a(String str) {
        if (!this.f3421d) {
            return this.f3420c;
        }
        float measureText = str == null ? 0.0f : this.f3418a.measureText(str, 0, str.length());
        this.f3420c = measureText;
        this.f3421d = false;
        return measureText;
    }
}
