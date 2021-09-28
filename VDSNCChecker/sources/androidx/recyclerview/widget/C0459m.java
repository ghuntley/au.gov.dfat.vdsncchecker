package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.WeakHashMap;
import p058j0.C1061o;
import p058j0.C1070q;

/* renamed from: androidx.recyclerview.widget.m */
public class C0459m extends RecyclerView.C0399k implements RecyclerView.C0407o {

    /* renamed from: D */
    public static final int[] f2145D = {16842919};

    /* renamed from: E */
    public static final int[] f2146E = new int[0];

    /* renamed from: A */
    public int f2147A;

    /* renamed from: B */
    public final Runnable f2148B;

    /* renamed from: C */
    public final RecyclerView.C0408p f2149C;

    /* renamed from: a */
    public final int f2150a;

    /* renamed from: b */
    public final int f2151b;

    /* renamed from: c */
    public final StateListDrawable f2152c;

    /* renamed from: d */
    public final Drawable f2153d;

    /* renamed from: e */
    public final int f2154e;

    /* renamed from: f */
    public final int f2155f;

    /* renamed from: g */
    public final StateListDrawable f2156g;

    /* renamed from: h */
    public final Drawable f2157h;

    /* renamed from: i */
    public final int f2158i;

    /* renamed from: j */
    public final int f2159j;

    /* renamed from: k */
    public int f2160k;

    /* renamed from: l */
    public int f2161l;

    /* renamed from: m */
    public float f2162m;

    /* renamed from: n */
    public int f2163n;

    /* renamed from: o */
    public int f2164o;

    /* renamed from: p */
    public float f2165p;

    /* renamed from: q */
    public int f2166q = 0;

    /* renamed from: r */
    public int f2167r = 0;

    /* renamed from: s */
    public RecyclerView f2168s;

    /* renamed from: t */
    public boolean f2169t = false;

    /* renamed from: u */
    public boolean f2170u = false;

    /* renamed from: v */
    public int f2171v = 0;

    /* renamed from: w */
    public int f2172w = 0;

    /* renamed from: x */
    public final int[] f2173x = new int[2];

    /* renamed from: y */
    public final int[] f2174y = new int[2];

    /* renamed from: z */
    public final ValueAnimator f2175z;

    /* renamed from: androidx.recyclerview.widget.m$a */
    public class C0460a implements Runnable {
        public C0460a() {
        }

        public void run() {
            C0459m mVar = C0459m.this;
            int i = mVar.f2147A;
            if (i == 1) {
                mVar.f2175z.cancel();
            } else if (i != 2) {
                return;
            }
            mVar.f2147A = 3;
            ValueAnimator valueAnimator = mVar.f2175z;
            valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
            mVar.f2175z.setDuration((long) 500);
            mVar.f2175z.start();
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$b */
    public class C0461b extends RecyclerView.C0408p {
        public C0461b() {
        }

        /* renamed from: b */
        public void mo2204b(RecyclerView recyclerView, int i, int i2) {
            C0459m mVar = C0459m.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = mVar.f2168s.computeVerticalScrollRange();
            int i3 = mVar.f2167r;
            mVar.f2169t = computeVerticalScrollRange - i3 > 0 && i3 >= mVar.f2150a;
            int computeHorizontalScrollRange = mVar.f2168s.computeHorizontalScrollRange();
            int i4 = mVar.f2166q;
            boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= mVar.f2150a;
            mVar.f2170u = z;
            boolean z2 = mVar.f2169t;
            if (z2 || z) {
                if (z2) {
                    float f = (float) i3;
                    mVar.f2161l = (int) ((((f / 2.0f) + ((float) computeVerticalScrollOffset)) * f) / ((float) computeVerticalScrollRange));
                    mVar.f2160k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
                }
                if (mVar.f2170u) {
                    float f2 = (float) computeHorizontalScrollOffset;
                    float f3 = (float) i4;
                    mVar.f2164o = (int) ((((f3 / 2.0f) + f2) * f3) / ((float) computeHorizontalScrollRange));
                    mVar.f2163n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
                }
                int i5 = mVar.f2171v;
                if (i5 == 0 || i5 == 1) {
                    mVar.mo2398k(1);
                }
            } else if (mVar.f2171v != 0) {
                mVar.mo2398k(0);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$c */
    public class C0462c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f2178a = false;

        public C0462c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f2178a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f2178a) {
                this.f2178a = false;
            } else if (((Float) C0459m.this.f2175z.getAnimatedValue()).floatValue() == 0.0f) {
                C0459m mVar = C0459m.this;
                mVar.f2147A = 0;
                mVar.mo2398k(0);
            } else {
                C0459m mVar2 = C0459m.this;
                mVar2.f2147A = 2;
                mVar2.f2168s.invalidate();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$d */
    public class C0463d implements ValueAnimator.AnimatorUpdateListener {
        public C0463d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0459m.this.f2152c.setAlpha(floatValue);
            C0459m.this.f2153d.setAlpha(floatValue);
            C0459m.this.f2168s.invalidate();
        }
    }

    public C0459m(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        boolean z = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f2175z = ofFloat;
        this.f2147A = 0;
        this.f2148B = new C0460a();
        C0461b bVar = new C0461b();
        this.f2149C = bVar;
        this.f2152c = stateListDrawable;
        this.f2153d = drawable;
        this.f2156g = stateListDrawable2;
        this.f2157h = drawable2;
        this.f2154e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f2155f = Math.max(i, drawable.getIntrinsicWidth());
        this.f2158i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f2159j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f2150a = i2;
        this.f2151b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0462c());
        ofFloat.addUpdateListener(new C0463d());
        RecyclerView recyclerView2 = this.f2168s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                RecyclerView.C0400l lVar = recyclerView2.f1881p;
                if (lVar != null) {
                    lVar.mo1948d("Cannot remove item decoration during a scroll  or layout");
                }
                recyclerView2.f1885r.remove(this);
                if (recyclerView2.f1885r.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2 ? true : z);
                }
                recyclerView2.mo1998R();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.f2168s;
                recyclerView3.f1887s.remove(this);
                if (recyclerView3.f1889t == this) {
                    recyclerView3.f1889t = null;
                }
                List<RecyclerView.C0408p> list = this.f2168s.f1870j0;
                if (list != null) {
                    list.remove(bVar);
                }
                mo2394g();
            }
            this.f2168s = recyclerView;
            recyclerView.mo2032g(this);
            this.f2168s.f1887s.add(this);
            this.f2168s.mo2054h(bVar);
        }
    }

    /* renamed from: a */
    public boolean mo2200a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f2171v;
        if (i == 1) {
            boolean i2 = mo2396i(motionEvent.getX(), motionEvent.getY());
            boolean h = mo2395h(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (i2 || h)) {
                if (h) {
                    this.f2172w = 1;
                    this.f2165p = (float) ((int) motionEvent.getX());
                } else if (i2) {
                    this.f2172w = 2;
                    this.f2162m = (float) ((int) motionEvent.getY());
                }
                mo2398k(2);
                return true;
            }
        } else if (i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo2201b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f2171v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean i = mo2396i(motionEvent.getX(), motionEvent.getY());
                boolean h = mo2395h(motionEvent.getX(), motionEvent.getY());
                if (i || h) {
                    if (h) {
                        this.f2172w = 1;
                        this.f2165p = (float) ((int) motionEvent.getX());
                    } else if (i) {
                        this.f2172w = 2;
                        this.f2162m = (float) ((int) motionEvent.getY());
                    }
                    mo2398k(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f2171v == 2) {
                this.f2162m = 0.0f;
                this.f2165p = 0.0f;
                mo2398k(1);
                this.f2172w = 0;
            } else if (motionEvent.getAction() == 2 && this.f2171v == 2) {
                mo2399l();
                if (this.f2172w == 1) {
                    float x = motionEvent.getX();
                    int[] iArr = this.f2174y;
                    int i2 = this.f2151b;
                    iArr[0] = i2;
                    iArr[1] = this.f2166q - i2;
                    float max = Math.max((float) iArr[0], Math.min((float) iArr[1], x));
                    if (Math.abs(((float) this.f2164o) - max) >= 2.0f) {
                        int j = mo2397j(this.f2165p, max, iArr, this.f2168s.computeHorizontalScrollRange(), this.f2168s.computeHorizontalScrollOffset(), this.f2166q);
                        if (j != 0) {
                            this.f2168s.scrollBy(j, 0);
                        }
                        this.f2165p = max;
                    }
                }
                if (this.f2172w == 2) {
                    float y = motionEvent.getY();
                    int[] iArr2 = this.f2173x;
                    int i3 = this.f2151b;
                    iArr2[0] = i3;
                    iArr2[1] = this.f2167r - i3;
                    float max2 = Math.max((float) iArr2[0], Math.min((float) iArr2[1], y));
                    if (Math.abs(((float) this.f2161l) - max2) >= 2.0f) {
                        int j2 = mo2397j(this.f2162m, max2, iArr2, this.f2168s.computeVerticalScrollRange(), this.f2168s.computeVerticalScrollOffset(), this.f2167r);
                        if (j2 != 0) {
                            this.f2168s.scrollBy(0, j2);
                        }
                        this.f2162m = max2;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void mo2202c(boolean z) {
    }

    /* renamed from: f */
    public void mo2148f(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0419w wVar) {
        if (this.f2166q != this.f2168s.getWidth() || this.f2167r != this.f2168s.getHeight()) {
            this.f2166q = this.f2168s.getWidth();
            this.f2167r = this.f2168s.getHeight();
            mo2398k(0);
        } else if (this.f2147A != 0) {
            if (this.f2169t) {
                int i = this.f2166q;
                int i2 = this.f2154e;
                int i3 = i - i2;
                int i4 = this.f2161l;
                int i5 = this.f2160k;
                int i6 = i4 - (i5 / 2);
                this.f2152c.setBounds(0, 0, i2, i5);
                this.f2153d.setBounds(0, 0, this.f2155f, this.f2167r);
                RecyclerView recyclerView2 = this.f2168s;
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                boolean z = true;
                if (recyclerView2.getLayoutDirection() != 1) {
                    z = false;
                }
                if (z) {
                    this.f2153d.draw(canvas);
                    canvas.translate((float) this.f2154e, (float) i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.f2152c.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    i3 = this.f2154e;
                } else {
                    canvas.translate((float) i3, 0.0f);
                    this.f2153d.draw(canvas);
                    canvas.translate(0.0f, (float) i6);
                    this.f2152c.draw(canvas);
                }
                canvas.translate((float) (-i3), (float) (-i6));
            }
            if (this.f2170u) {
                int i7 = this.f2167r;
                int i8 = this.f2158i;
                int i9 = i7 - i8;
                int i10 = this.f2164o;
                int i11 = this.f2163n;
                int i12 = i10 - (i11 / 2);
                this.f2156g.setBounds(0, 0, i11, i8);
                this.f2157h.setBounds(0, 0, this.f2166q, this.f2159j);
                canvas.translate(0.0f, (float) i9);
                this.f2157h.draw(canvas);
                canvas.translate((float) i12, 0.0f);
                this.f2156g.draw(canvas);
                canvas.translate((float) (-i12), (float) (-i9));
            }
        }
    }

    /* renamed from: g */
    public final void mo2394g() {
        this.f2168s.removeCallbacks(this.f2148B);
    }

    /* renamed from: h */
    public boolean mo2395h(float f, float f2) {
        if (f2 >= ((float) (this.f2167r - this.f2158i))) {
            int i = this.f2164o;
            int i2 = this.f2163n;
            return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
        }
    }

    /* renamed from: i */
    public boolean mo2396i(float f, float f2) {
        RecyclerView recyclerView = this.f2168s;
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        if (recyclerView.getLayoutDirection() == 1) {
            if (f > ((float) (this.f2154e / 2))) {
                return false;
            }
        } else if (f < ((float) (this.f2166q - this.f2154e))) {
            return false;
        }
        int i = this.f2161l;
        int i2 = this.f2160k / 2;
        if (f2 < ((float) (i - i2)) || f2 > ((float) (i2 + i))) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final int mo2397j(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: k */
    public void mo2398k(int i) {
        int i2;
        if (i == 2 && this.f2171v != 2) {
            this.f2152c.setState(f2145D);
            mo2394g();
        }
        if (i == 0) {
            this.f2168s.invalidate();
        } else {
            mo2399l();
        }
        if (this.f2171v != 2 || i == 2) {
            if (i == 1) {
                i2 = 1500;
            }
            this.f2171v = i;
        }
        this.f2152c.setState(f2146E);
        i2 = 1200;
        mo2394g();
        this.f2168s.postDelayed(this.f2148B, (long) i2);
        this.f2171v = i;
    }

    /* renamed from: l */
    public void mo2399l() {
        int i = this.f2147A;
        if (i != 0) {
            if (i == 3) {
                this.f2175z.cancel();
            } else {
                return;
            }
        }
        this.f2147A = 1;
        ValueAnimator valueAnimator = this.f2175z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f2175z.setDuration(500);
        this.f2175z.setStartDelay(0);
        this.f2175z.start();
    }
}
