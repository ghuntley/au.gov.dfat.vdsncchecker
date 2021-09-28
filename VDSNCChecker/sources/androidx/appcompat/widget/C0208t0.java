package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.t0 */
public class C0208t0 {

    /* renamed from: a */
    public int f927a = 0;

    /* renamed from: b */
    public int f928b = 0;

    /* renamed from: c */
    public int f929c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f930d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f931e = 0;

    /* renamed from: f */
    public int f932f = 0;

    /* renamed from: g */
    public boolean f933g = false;

    /* renamed from: h */
    public boolean f934h = false;

    /* renamed from: a */
    public void mo1134a(int i, int i2) {
        this.f929c = i;
        this.f930d = i2;
        this.f934h = true;
        if (this.f933g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f927a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f928b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f927a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f928b = i2;
        }
    }
}
