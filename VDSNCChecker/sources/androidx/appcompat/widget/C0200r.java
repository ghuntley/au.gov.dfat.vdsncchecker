package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import p022d0.C0793a;

/* renamed from: androidx.appcompat.widget.r */
public class C0200r {

    /* renamed from: c */
    public static final int[] f910c = {16843067, 16843068};

    /* renamed from: a */
    public final ProgressBar f911a;

    /* renamed from: b */
    public Bitmap f912b;

    public C0200r(ProgressBar progressBar) {
        this.f911a = progressBar;
    }

    /* renamed from: a */
    public void mo1107a(AttributeSet attributeSet, int i) {
        C0136b1 q = C0136b1.m361q(this.f911a.getContext(), attributeSet, f910c, i, 0);
        Drawable h = q.mo768h(0);
        if (h != null) {
            ProgressBar progressBar = this.f911a;
            if (h instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) h;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable b = mo1108b(animationDrawable.getFrame(i2), true);
                    b.setLevel(10000);
                    animationDrawable2.addFrame(b, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                h = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(h);
        }
        Drawable h2 = q.mo768h(1);
        if (h2 != null) {
            this.f911a.setProgressDrawable(mo1108b(h2, false));
        }
        q.f692b.recycle();
    }

    /* renamed from: b */
    public final Drawable mo1108b(Drawable drawable, boolean z) {
        if (drawable instanceof C0793a) {
            C0793a aVar = (C0793a) drawable;
            Drawable a = aVar.mo4030a();
            if (a != null) {
                aVar.mo4031b(mo1108b(a, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = mo1108b(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f912b == null) {
                this.f912b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }
}
