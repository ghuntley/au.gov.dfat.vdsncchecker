package androidx.media;

import android.media.AudioAttributes;
import java.util.Objects;
import p029e1.C0864a;

public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(C0864a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f1713a = (AudioAttributes) aVar.mo4153m(audioAttributesImplApi21.f1713a, 1);
        audioAttributesImplApi21.f1714b = aVar.mo4151k(audioAttributesImplApi21.f1714b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, C0864a aVar) {
        Objects.requireNonNull(aVar);
        AudioAttributes audioAttributes = audioAttributesImplApi21.f1713a;
        aVar.mo4156p(1);
        aVar.mo4161u(audioAttributes);
        int i = audioAttributesImplApi21.f1714b;
        aVar.mo4156p(2);
        aVar.mo4160t(i);
    }
}
