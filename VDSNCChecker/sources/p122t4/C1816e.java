package p122t4;

/* renamed from: t4.e */
public class C1816e {
    /* renamed from: a */
    public static int m5001a(long j) {
        long j2 = j & 9218868437227405312L;
        if (j2 == 0) {
            return -1074;
        }
        return ((int) ((j2 >>> 52) & 4294967295L)) - 1075;
    }

    /* renamed from: b */
    public static long m5002b(long j) {
        long j2 = 4503599627370495L & j;
        return !(((j & 9218868437227405312L) > 0 ? 1 : ((j & 9218868437227405312L) == 0 ? 0 : -1)) == 0) ? j2 + 4503599627370496L : j2;
    }
}
