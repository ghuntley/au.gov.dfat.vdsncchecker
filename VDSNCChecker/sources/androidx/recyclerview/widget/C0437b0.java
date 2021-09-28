package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.b0 */
public abstract class C0437b0 extends RecyclerView.C0406n {

    /* renamed from: a */
    public RecyclerView f2072a;

    /* renamed from: b */
    public final RecyclerView.C0408p f2073b = new C0438a();

    /* renamed from: androidx.recyclerview.widget.b0$a */
    public class C0438a extends RecyclerView.C0408p {

        /* renamed from: a */
        public boolean f2074a = false;

        public C0438a() {
        }

        /* renamed from: a */
        public void mo2203a(RecyclerView recyclerView, int i) {
            if (i == 0 && this.f2074a) {
                this.f2074a = false;
                C0437b0.this.mo2339b();
            }
        }

        /* renamed from: b */
        public void mo2204b(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f2074a = true;
            }
        }
    }

    /* renamed from: a */
    public abstract int[] mo2338a(RecyclerView.C0400l lVar, View view);

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2339b() {
        /*
            r10 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r10.f2072a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            androidx.recyclerview.widget.RecyclerView$l r0 = r0.getLayoutManager()
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            r1 = r10
            androidx.recyclerview.widget.v r1 = (androidx.recyclerview.widget.C0476v) r1
            boolean r2 = r0.mo1952f()
            if (r2 == 0) goto L_0x001a
            androidx.recyclerview.widget.t r2 = r1.mo2434f(r0)
            goto L_0x0024
        L_0x001a:
            boolean r2 = r0.mo1950e()
            if (r2 == 0) goto L_0x0029
            androidx.recyclerview.widget.t r2 = r1.mo2433e(r0)
        L_0x0024:
            android.view.View r1 = r1.mo2432d(r0, r2)
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            if (r1 != 0) goto L_0x002d
            return
        L_0x002d:
            int[] r0 = r10.mo2338a(r0, r1)
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != 0) goto L_0x003b
            r2 = r0[r3]
            if (r2 == 0) goto L_0x0048
        L_0x003b:
            androidx.recyclerview.widget.RecyclerView r4 = r10.f2072a
            r5 = r0[r1]
            r6 = r0[r3]
            r9 = 0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 0
            r4.mo2055h0(r5, r6, r7, r8, r9)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0437b0.mo2339b():void");
    }
}
