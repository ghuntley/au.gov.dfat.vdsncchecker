package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import p000a.C0001b;

@TargetApi(21)
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public AudioAttributes f1713a;

    /* renamed from: b */
    public int f1714b = -1;

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f1713a.equals(((AudioAttributesImplApi21) obj).f1713a);
    }

    public int hashCode() {
        return this.f1713a.hashCode();
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("AudioAttributesCompat: audioattributes=");
        a.append(this.f1713a);
        return a.toString();
    }
}
