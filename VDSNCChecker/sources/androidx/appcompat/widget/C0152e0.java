package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.appcompat.widget.e0 */
public class C0152e0 {

    /* renamed from: l */
    public static final RectF f749l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m */
    public static ConcurrentHashMap<String, Method> f750m = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: n */
    public static ConcurrentHashMap<String, Field> f751n = new ConcurrentHashMap<>();

    /* renamed from: a */
    public int f752a = 0;

    /* renamed from: b */
    public boolean f753b = false;

    /* renamed from: c */
    public float f754c = -1.0f;

    /* renamed from: d */
    public float f755d = -1.0f;

    /* renamed from: e */
    public float f756e = -1.0f;

    /* renamed from: f */
    public int[] f757f = new int[0];

    /* renamed from: g */
    public boolean f758g = false;

    /* renamed from: h */
    public TextPaint f759h;

    /* renamed from: i */
    public final TextView f760i;

    /* renamed from: j */
    public final Context f761j;

    /* renamed from: k */
    public final C0155c f762k;

    /* renamed from: androidx.appcompat.widget.e0$a */
    public static class C0153a extends C0155c {
        /* renamed from: a */
        public void mo881a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0152e0.m427e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: androidx.appcompat.widget.e0$b */
    public static class C0154b extends C0153a {
        /* renamed from: a */
        public void mo881a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        /* renamed from: b */
        public boolean mo882b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* renamed from: androidx.appcompat.widget.e0$c */
    public static class C0155c {
        /* renamed from: a */
        public void mo881a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        /* renamed from: b */
        public boolean mo882b(TextView textView) {
            return ((Boolean) C0152e0.m427e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public C0152e0(TextView textView) {
        this.f760i = textView;
        this.f761j = textView.getContext();
        this.f762k = Build.VERSION.SDK_INT >= 29 ? new C0154b() : new C0153a();
    }

    /* renamed from: d */
    public static Method m426d(String str) {
        try {
            Method method = f750m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f750m.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        return r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T m427e(java.lang.Object r1, java.lang.String r2, T r3) {
        /*
            java.lang.reflect.Method r2 = m426d(r2)     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            java.lang.Object r3 = r2.invoke(r1, r0)     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            goto L_0x000e
        L_0x000c:
            r1 = move-exception
            throw r1
        L_0x000e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0152e0.m427e(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    public void mo873a() {
        if (mo879i() && this.f752a != 0) {
            if (this.f753b) {
                if (this.f760i.getMeasuredHeight() > 0 && this.f760i.getMeasuredWidth() > 0) {
                    int measuredWidth = this.f762k.mo882b(this.f760i) ? 1048576 : (this.f760i.getMeasuredWidth() - this.f760i.getTotalPaddingLeft()) - this.f760i.getTotalPaddingRight();
                    int height = (this.f760i.getHeight() - this.f760i.getCompoundPaddingBottom()) - this.f760i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f749l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) measuredWidth;
                            rectF.bottom = (float) height;
                            float c = (float) mo875c(rectF);
                            if (c != this.f760i.getTextSize()) {
                                mo876f(0, c);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f753b = true;
        }
    }

    /* renamed from: b */
    public final int[] mo874b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: c */
    public final int mo875c(RectF rectF) {
        CharSequence transformation;
        int length = this.f757f.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                int i5 = this.f757f[i4];
                CharSequence text = this.f760i.getText();
                TransformationMethod transformationMethod = this.f760i.getTransformationMethod();
                if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f760i)) == null)) {
                    text = transformation;
                }
                int maxLines = this.f760i.getMaxLines();
                TextPaint textPaint = this.f759h;
                if (textPaint == null) {
                    this.f759h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f759h.set(this.f760i.getPaint());
                this.f759h.setTextSize((float) i5);
                StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f759h, Math.round(rectF.right));
                obtain.setAlignment((Layout.Alignment) m427e(this.f760i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL)).setLineSpacing(this.f760i.getLineSpacingExtra(), this.f760i.getLineSpacingMultiplier()).setIncludePad(this.f760i.getIncludeFontPadding()).setBreakStrategy(this.f760i.getBreakStrategy()).setHyphenationFrequency(this.f760i.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
                try {
                    this.f762k.mo881a(obtain, this.f760i);
                } catch (ClassCastException unused) {
                }
                StaticLayout build = obtain.build();
                if ((maxLines == -1 || (build.getLineCount() <= maxLines && build.getLineEnd(build.getLineCount() - 1) == text.length())) && ((float) build.getHeight()) <= rectF.bottom) {
                    int i6 = i4 + 1;
                    i3 = i2;
                    i2 = i6;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f757f[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: f */
    public void mo876f(int i, float f) {
        Context context = this.f761j;
        float applyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension != this.f760i.getPaint().getTextSize()) {
            this.f760i.getPaint().setTextSize(applyDimension);
            boolean isInLayout = this.f760i.isInLayout();
            if (this.f760i.getLayout() != null) {
                this.f753b = false;
                try {
                    Method d = m426d("nullLayouts");
                    if (d != null) {
                        d.invoke(this.f760i, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (!isInLayout) {
                    this.f760i.requestLayout();
                } else {
                    this.f760i.forceLayout();
                }
                this.f760i.invalidate();
            }
        }
    }

    /* renamed from: g */
    public final boolean mo877g() {
        if (!mo879i() || this.f752a != 1) {
            this.f753b = false;
        } else {
            if (!this.f758g || this.f757f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f756e - this.f755d) / this.f754c))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((((float) i) * this.f754c) + this.f755d);
                }
                this.f757f = mo874b(iArr);
            }
            this.f753b = true;
        }
        return this.f753b;
    }

    /* renamed from: h */
    public final boolean mo878h() {
        int[] iArr = this.f757f;
        int length = iArr.length;
        boolean z = length > 0;
        this.f758g = z;
        if (z) {
            this.f752a = 1;
            this.f755d = (float) iArr[0];
            this.f756e = (float) iArr[length - 1];
            this.f754c = -1.0f;
        }
        return z;
    }

    /* renamed from: i */
    public final boolean mo879i() {
        return !(this.f760i instanceof C0179l);
    }

    /* renamed from: j */
    public final void mo880j(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f752a = 1;
            this.f755d = f;
            this.f756e = f2;
            this.f754c = f3;
            this.f758g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }
}
