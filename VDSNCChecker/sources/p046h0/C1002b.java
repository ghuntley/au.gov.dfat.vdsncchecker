package p046h0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.Objects;
import p000a.C0001b;

/* renamed from: h0.b */
public class C1002b implements Spannable {

    /* renamed from: h0.b$a */
    public static final class C1003a {

        /* renamed from: a */
        public final TextPaint f3712a;

        /* renamed from: b */
        public final TextDirectionHeuristic f3713b;

        /* renamed from: c */
        public final int f3714c;

        /* renamed from: d */
        public final int f3715d;

        public C1003a(PrecomputedText.Params params) {
            this.f3712a = params.getTextPaint();
            this.f3713b = params.getTextDirection();
            this.f3714c = params.getBreakStrategy();
            this.f3715d = params.getHyphenationFrequency();
        }

        @SuppressLint({"NewApi"})
        public C1003a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            }
            this.f3712a = textPaint;
            this.f3713b = textDirectionHeuristic;
            this.f3714c = i;
            this.f3715d = i2;
        }

        /* renamed from: a */
        public boolean mo4435a(C1003a aVar) {
            if (this.f3714c != aVar.f3714c || this.f3715d != aVar.f3715d || this.f3712a.getTextSize() != aVar.f3712a.getTextSize() || this.f3712a.getTextScaleX() != aVar.f3712a.getTextScaleX() || this.f3712a.getTextSkewX() != aVar.f3712a.getTextSkewX() || this.f3712a.getLetterSpacing() != aVar.f3712a.getLetterSpacing() || !TextUtils.equals(this.f3712a.getFontFeatureSettings(), aVar.f3712a.getFontFeatureSettings()) || this.f3712a.getFlags() != aVar.f3712a.getFlags() || !this.f3712a.getTextLocales().equals(aVar.f3712a.getTextLocales())) {
                return false;
            }
            if (this.f3712a.getTypeface() == null) {
                if (aVar.f3712a.getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f3712a.getTypeface().equals(aVar.f3712a.getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1003a)) {
                return false;
            }
            C1003a aVar = (C1003a) obj;
            return mo4435a(aVar) && this.f3713b == aVar.f3713b;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Float.valueOf(this.f3712a.getTextSize()), Float.valueOf(this.f3712a.getTextScaleX()), Float.valueOf(this.f3712a.getTextSkewX()), Float.valueOf(this.f3712a.getLetterSpacing()), Integer.valueOf(this.f3712a.getFlags()), this.f3712a.getTextLocales(), this.f3712a.getTypeface(), Boolean.valueOf(this.f3712a.isElegantTextHeight()), this.f3713b, Integer.valueOf(this.f3714c), Integer.valueOf(this.f3715d)});
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder a = C0001b.m0a("textSize=");
            a.append(this.f3712a.getTextSize());
            sb.append(a.toString());
            sb.append(", textScaleX=" + this.f3712a.getTextScaleX());
            sb.append(", textSkewX=" + this.f3712a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            StringBuilder a2 = C0001b.m0a(", letterSpacing=");
            a2.append(this.f3712a.getLetterSpacing());
            sb.append(a2.toString());
            sb.append(", elegantTextHeight=" + this.f3712a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f3712a.getTextLocales());
            sb.append(", typeface=" + this.f3712a.getTypeface());
            if (i >= 26) {
                StringBuilder a3 = C0001b.m0a(", variationSettings=");
                a3.append(this.f3712a.getFontVariationSettings());
                sb.append(a3.toString());
            }
            StringBuilder a4 = C0001b.m0a(", textDir=");
            a4.append(this.f3713b);
            sb.append(a4.toString());
            sb.append(", breakStrategy=" + this.f3714c);
            sb.append(", hyphenationFrequency=" + this.f3715d);
            sb.append("}");
            return sb.toString();
        }
    }

    public char charAt(int i) {
        throw null;
    }

    public int getSpanEnd(Object obj) {
        throw null;
    }

    public int getSpanFlags(Object obj) {
        throw null;
    }

    public int getSpanStart(Object obj) {
        throw null;
    }

    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        int i3 = Build.VERSION.SDK_INT;
        throw null;
    }

    public int length() {
        throw null;
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        throw null;
    }

    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            int i = Build.VERSION.SDK_INT;
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            int i4 = Build.VERSION.SDK_INT;
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    public CharSequence subSequence(int i, int i2) {
        throw null;
    }

    public String toString() {
        throw null;
    }
}
