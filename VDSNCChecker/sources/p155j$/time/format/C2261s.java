package p155j$.time.format;

/* renamed from: j$.time.format.s */
enum C2261s implements C2250h {
    SENSITIVE,
    INSENSITIVE,
    STRICT,
    LENIENT;

    /* renamed from: c */
    public int mo6897c(C2266x xVar, CharSequence charSequence, int i) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            xVar.mo6957m(true);
        } else if (ordinal == 1) {
            xVar.mo6957m(false);
        } else if (ordinal == 2) {
            xVar.mo6961q(true);
        } else if (ordinal == 3) {
            xVar.mo6961q(false);
        }
        return i;
    }

    /* renamed from: d */
    public boolean mo6898d(C2233A a, StringBuilder sb) {
        return true;
    }

    public String toString() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (ordinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (ordinal == 2) {
            return "ParseStrict(true)";
        }
        if (ordinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
