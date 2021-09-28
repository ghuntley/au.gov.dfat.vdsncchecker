package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;
import p029e1.C0864a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(C0864a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f1304a;
        if (aVar.mo4149i(1)) {
            obj = aVar.mo4155o();
        }
        remoteActionCompat.f1304a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.f1305b;
        if (aVar.mo4149i(2)) {
            charSequence = aVar.mo4148h();
        }
        remoteActionCompat.f1305b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1306c;
        if (aVar.mo4149i(3)) {
            charSequence2 = aVar.mo4148h();
        }
        remoteActionCompat.f1306c = charSequence2;
        remoteActionCompat.f1307d = (PendingIntent) aVar.mo4153m(remoteActionCompat.f1307d, 4);
        boolean z = remoteActionCompat.f1308e;
        if (aVar.mo4149i(5)) {
            z = aVar.mo4146f();
        }
        remoteActionCompat.f1308e = z;
        boolean z2 = remoteActionCompat.f1309f;
        if (aVar.mo4149i(6)) {
            z2 = aVar.mo4146f();
        }
        remoteActionCompat.f1309f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, C0864a aVar) {
        Objects.requireNonNull(aVar);
        IconCompat iconCompat = remoteActionCompat.f1304a;
        aVar.mo4156p(1);
        aVar.mo4163w(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1305b;
        aVar.mo4156p(2);
        aVar.mo4159s(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f1306c;
        aVar.mo4156p(3);
        aVar.mo4159s(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f1307d;
        aVar.mo4156p(4);
        aVar.mo4161u(pendingIntent);
        boolean z = remoteActionCompat.f1308e;
        aVar.mo4156p(5);
        aVar.mo4157q(z);
        boolean z2 = remoteActionCompat.f1309f;
        aVar.mo4156p(6);
        aVar.mo4157q(z2);
    }
}
