package p046h0;

/* renamed from: h0.d */
public final class C1005d {

    /* renamed from: a */
    public static final C1004c f3716a = new C1009d((C1007b) null, false);

    /* renamed from: b */
    public static final C1004c f3717b = new C1009d((C1007b) null, true);

    /* renamed from: c */
    public static final C1004c f3718c;

    /* renamed from: d */
    public static final C1004c f3719d;

    /* renamed from: h0.d$a */
    public static class C1006a implements C1007b {

        /* renamed from: a */
        public static final C1006a f3720a = new C1006a();

        /* renamed from: a */
        public int mo4439a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i));
                C1004c cVar = C1005d.f3716a;
                if (directionality != 0) {
                    if (!(directionality == 1 || directionality == 2)) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i4 = 2;
                                break;
                        }
                    }
                    i4 = 0;
                    i++;
                }
                i4 = 1;
                i++;
            }
            return i4;
        }
    }

    /* renamed from: h0.d$b */
    public interface C1007b {
        /* renamed from: a */
        int mo4439a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: h0.d$c */
    public static abstract class C1008c implements C1004c {

        /* renamed from: a */
        public final C1007b f3721a;

        public C1008c(C1007b bVar) {
            this.f3721a = bVar;
        }

        /* renamed from: a */
        public abstract boolean mo4440a();

        /* renamed from: b */
        public boolean mo4441b(CharSequence charSequence, int i, int i2) {
            if (i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            C1007b bVar = this.f3721a;
            if (bVar == null) {
                return mo4440a();
            }
            int a = bVar.mo4439a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo4440a();
            }
            return false;
        }
    }

    /* renamed from: h0.d$d */
    public static class C1009d extends C1008c {

        /* renamed from: b */
        public final boolean f3722b;

        public C1009d(C1007b bVar, boolean z) {
            super(bVar);
            this.f3722b = z;
        }

        /* renamed from: a */
        public boolean mo4440a() {
            return this.f3722b;
        }
    }

    static {
        C1006a aVar = C1006a.f3720a;
        f3718c = new C1009d(aVar, false);
        f3719d = new C1009d(aVar, true);
    }
}
