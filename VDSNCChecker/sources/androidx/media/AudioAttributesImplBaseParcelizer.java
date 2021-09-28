package androidx.media;

import java.util.Objects;
import p029e1.C0864a;

public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(C0864a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f1715a = aVar.mo4151k(audioAttributesImplBase.f1715a, 1);
        audioAttributesImplBase.f1716b = aVar.mo4151k(audioAttributesImplBase.f1716b, 2);
        audioAttributesImplBase.f1717c = aVar.mo4151k(audioAttributesImplBase.f1717c, 3);
        audioAttributesImplBase.f1718d = aVar.mo4151k(audioAttributesImplBase.f1718d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, C0864a aVar) {
        Objects.requireNonNull(aVar);
        int i = audioAttributesImplBase.f1715a;
        aVar.mo4156p(1);
        aVar.mo4160t(i);
        int i2 = audioAttributesImplBase.f1716b;
        aVar.mo4156p(2);
        aVar.mo4160t(i2);
        int i3 = audioAttributesImplBase.f1717c;
        aVar.mo4156p(3);
        aVar.mo4160t(i3);
        int i4 = audioAttributesImplBase.f1718d;
        aVar.mo4156p(4);
        aVar.mo4160t(i4);
    }
}
