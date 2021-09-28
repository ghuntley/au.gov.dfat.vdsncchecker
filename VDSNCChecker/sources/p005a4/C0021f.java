package p005a4;

import java.net.Proxy;

/* renamed from: a4.f */
public final /* synthetic */ class C0021f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f64a;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        f64a = iArr;
        iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        iArr[Proxy.Type.HTTP.ordinal()] = 2;
    }
}
