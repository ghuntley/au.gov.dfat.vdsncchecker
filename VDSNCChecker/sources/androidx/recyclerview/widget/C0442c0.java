package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.c0 */
public class C0442c0 {

    /* renamed from: a */
    public final C0444b f2081a;

    /* renamed from: b */
    public C0443a f2082b = new C0443a();

    /* renamed from: androidx.recyclerview.widget.c0$a */
    public static class C0443a {

        /* renamed from: a */
        public int f2083a = 0;

        /* renamed from: b */
        public int f2084b;

        /* renamed from: c */
        public int f2085c;

        /* renamed from: d */
        public int f2086d;

        /* renamed from: e */
        public int f2087e;

        /* renamed from: a */
        public boolean mo2364a() {
            int i = this.f2083a;
            if ((i & 7) != 0 && (i & (mo2365b(this.f2086d, this.f2084b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f2083a;
            if ((i2 & 112) != 0 && (i2 & (mo2365b(this.f2086d, this.f2085c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f2083a;
            if ((i3 & 1792) != 0 && (i3 & (mo2365b(this.f2087e, this.f2084b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f2083a;
            return (i4 & 28672) == 0 || (i4 & (mo2365b(this.f2087e, this.f2085c) << 12)) != 0;
        }

        /* renamed from: b */
        public int mo2365b(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.c0$b */
    public interface C0444b {
        /* renamed from: a */
        View mo2192a(int i);

        /* renamed from: b */
        int mo2193b();

        /* renamed from: c */
        int mo2194c();

        /* renamed from: d */
        int mo2195d(View view);

        /* renamed from: e */
        int mo2196e(View view);
    }

    public C0442c0(C0444b bVar) {
        this.f2081a = bVar;
    }

    /* renamed from: a */
    public View mo2362a(int i, int i2, int i3, int i4) {
        int c = this.f2081a.mo2194c();
        int b = this.f2081a.mo2193b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a = this.f2081a.mo2192a(i);
            int e = this.f2081a.mo2196e(a);
            int d = this.f2081a.mo2195d(a);
            C0443a aVar = this.f2082b;
            aVar.f2084b = c;
            aVar.f2085c = b;
            aVar.f2086d = e;
            aVar.f2087e = d;
            if (i3 != 0) {
                aVar.f2083a = 0;
                aVar.f2083a = i3 | 0;
                if (aVar.mo2364a()) {
                    return a;
                }
            }
            if (i4 != 0) {
                C0443a aVar2 = this.f2082b;
                aVar2.f2083a = 0;
                aVar2.f2083a = i4 | 0;
                if (aVar2.mo2364a()) {
                    view = a;
                }
            }
            i += i5;
        }
        return view;
    }

    /* renamed from: b */
    public boolean mo2363b(View view, int i) {
        C0443a aVar = this.f2082b;
        int c = this.f2081a.mo2194c();
        int b = this.f2081a.mo2193b();
        int e = this.f2081a.mo2196e(view);
        int d = this.f2081a.mo2195d(view);
        aVar.f2084b = c;
        aVar.f2085c = b;
        aVar.f2086d = e;
        aVar.f2087e = d;
        if (i == 0) {
            return false;
        }
        C0443a aVar2 = this.f2082b;
        aVar2.f2083a = 0;
        aVar2.f2083a = 0 | i;
        return aVar2.mo2364a();
    }
}
