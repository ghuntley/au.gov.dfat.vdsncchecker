package p045h;

/* renamed from: h.q */
public class C0992q {

    /* renamed from: d */
    public static C0992q f3654d;

    /* renamed from: a */
    public long f3655a;

    /* renamed from: b */
    public long f3656b;

    /* renamed from: c */
    public int f3657c;

    /* renamed from: a */
    public void mo4402a(long j, double d, double d2) {
        float f = ((float) (j - 946728000000L)) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d3 = (double) f2;
        double sin = (Math.sin((double) (f2 * 3.0f)) * 5.236000106378924E-6d) + (Math.sin((double) (2.0f * f2)) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double sin2 = (Math.sin(2.0d * sin) * -0.0069d) + (Math.sin(d3) * 0.0053d) + ((double) (((float) Math.round(((double) (f - 9.0E-4f)) - d4)) + 9.0E-4f)) + d4;
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d5 = 0.01745329238474369d * d;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d5))) / (Math.cos(asin) * Math.cos(d5));
        if (sin3 >= 1.0d) {
            this.f3657c = 1;
        } else if (sin3 <= -1.0d) {
            this.f3657c = 0;
        } else {
            double acos = (double) ((float) (Math.acos(sin3) / 6.283185307179586d));
            this.f3655a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f3656b = round;
            if (round >= j || this.f3655a <= j) {
                this.f3657c = 1;
                return;
            } else {
                this.f3657c = 0;
                return;
            }
        }
        this.f3655a = -1;
        this.f3656b = -1;
    }
}
