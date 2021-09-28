package p122t4;

/* renamed from: t4.f */
public class C1817f {
    /* renamed from: a */
    public static boolean m5003a(C1818g gVar, long j, long j2, long j3, long j4, long j5) {
        C1818g gVar2 = gVar;
        long j6 = j - j5;
        long j7 = j + j5;
        long j8 = j3;
        while (j8 < j6 && j2 - j8 >= j4) {
            long j9 = j8 + j4;
            if (j9 >= j6 && j6 - j8 < j9 - j6) {
                break;
            }
            char[] cArr = gVar2.f5483a;
            int i = gVar2.f5484b - 1;
            cArr[i] = (char) (cArr[i] - 1);
            j8 = j9;
        }
        if (j8 < j7 && j2 - j8 >= j4) {
            long j10 = j8 + j4;
            if (j10 < j7 || j7 - j8 > j10 - j7) {
                return false;
            }
        }
        return 2 * j5 <= j8 && j8 <= j2 - (4 * j5);
    }
}
