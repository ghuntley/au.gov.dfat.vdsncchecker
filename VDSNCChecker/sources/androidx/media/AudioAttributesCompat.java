package androidx.media;

import android.util.SparseIntArray;
import p029e1.C0866c;

public class AudioAttributesCompat implements C0866c {

    /* renamed from: b */
    public static final /* synthetic */ int f1711b = 0;

    /* renamed from: a */
    public AudioAttributesImpl f1712a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesImpl audioAttributesImpl = this.f1712a;
        AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).f1712a;
        return audioAttributesImpl == null ? audioAttributesImpl2 == null : audioAttributesImpl.equals(audioAttributesImpl2);
    }

    public int hashCode() {
        return this.f1712a.hashCode();
    }

    public String toString() {
        return this.f1712a.toString();
    }
}
