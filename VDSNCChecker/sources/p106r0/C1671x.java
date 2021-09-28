package p106r0;

import java.io.Writer;

/* renamed from: r0.x */
public final class C1671x extends Writer {

    /* renamed from: e */
    public StringBuilder f5106e = new StringBuilder(128);

    public C1671x(String str) {
    }

    /* renamed from: a */
    public final void mo5862a() {
        if (this.f5106e.length() > 0) {
            this.f5106e.toString();
            StringBuilder sb = this.f5106e;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        mo5862a();
    }

    public void flush() {
        mo5862a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                mo5862a();
            } else {
                this.f5106e.append(c);
            }
        }
    }
}
