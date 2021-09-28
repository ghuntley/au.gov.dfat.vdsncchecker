package androidx.media;

import java.util.Objects;
import p029e1.C0864a;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(C0864a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.f1712a;
        if (aVar.mo4149i(1)) {
            obj = aVar.mo4155o();
        }
        audioAttributesCompat.f1712a = (AudioAttributesImpl) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, C0864a aVar) {
        Objects.requireNonNull(aVar);
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f1712a;
        aVar.mo4156p(1);
        aVar.mo4163w(audioAttributesImpl);
    }
}
