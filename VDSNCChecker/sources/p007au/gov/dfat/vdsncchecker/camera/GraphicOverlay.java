package p007au.gov.dfat.vdsncchecker.camera;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import p047h1.C1011a;
import p072l2.C1241e;

/* renamed from: au.gov.dfat.vdsncchecker.camera.GraphicOverlay */
public final class GraphicOverlay extends View {

    /* renamed from: g */
    public static final /* synthetic */ int f2235g = 0;

    /* renamed from: e */
    public final Object f2236e = new Object();

    /* renamed from: f */
    public final List<C0487a> f2237f = new ArrayList();

    /* renamed from: au.gov.dfat.vdsncchecker.camera.GraphicOverlay$a */
    public static abstract class C0487a {

        /* renamed from: a */
        public final Context f2238a;

        public C0487a(GraphicOverlay graphicOverlay) {
            Context context = graphicOverlay.getContext();
            C1241e.m3516f(context, "overlay.context");
            this.f2238a = context;
        }

        /* renamed from: a */
        public abstract void mo2461a(Canvas canvas);
    }

    public GraphicOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Matrix();
        setLayerType(2, (Paint) null);
        addOnLayoutChangeListener(new C1011a(this));
    }

    public final int getImageHeight() {
        return 0;
    }

    public final int getImageWidth() {
        return 0;
    }

    public void onDraw(Canvas canvas) {
        C1241e.m3517j(canvas, "canvas");
        super.onDraw(canvas);
        synchronized (this.f2236e) {
            for (C0487a a : this.f2237f) {
                a.mo2461a(canvas);
            }
        }
    }
}
