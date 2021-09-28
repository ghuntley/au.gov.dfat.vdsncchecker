package p016c0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import p010b0.C0528a;
import p040g0.C0948l;

/* renamed from: c0.j */
public class C0567j {
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a */
    public ConcurrentHashMap<Long, C0528a.C0530b> f2382a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public Typeface mo2706a(Context context, C0528a.C0530b bVar, Resources resources, int i) {
        throw null;
    }

    /* renamed from: b */
    public Typeface mo2707b(Context context, CancellationSignal cancellationSignal, C0948l[] lVarArr, int i) {
        throw null;
    }

    /* renamed from: c */
    public Typeface mo2717c(Context context, InputStream inputStream) {
        File c = C0568k.m1861c(context);
        if (c == null) {
            return null;
        }
        try {
            if (!C0568k.m1860b(c, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(c.getPath());
            c.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            c.delete();
        }
    }

    /* renamed from: d */
    public Typeface mo2708d(Context context, Resources resources, int i, String str, int i2) {
        File c = C0568k.m1861c(context);
        if (c == null) {
            return null;
        }
        try {
            if (!C0568k.m1859a(c, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(c.getPath());
            c.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            c.delete();
        }
    }

    /* renamed from: e */
    public C0948l mo2718e(C0948l[] lVarArr, int i) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        C0948l lVar = null;
        int i3 = Integer.MAX_VALUE;
        for (C0948l lVar2 : lVarArr) {
            int abs = (Math.abs(lVar2.f3517c - i2) * 2) + (lVar2.f3518d == z ? 0 : 1);
            if (lVar == null || i3 > abs) {
                lVar = lVar2;
                i3 = abs;
            }
        }
        return lVar;
    }
}
