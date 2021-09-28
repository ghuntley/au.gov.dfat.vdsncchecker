package p099q;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import p093p.C1545a;
import p093p.C1550e;
import p093p.C1558h;

/* renamed from: q.d */
public class C1592d {

    /* renamed from: a */
    public C1595f f4936a;

    /* renamed from: b */
    public C1595f f4937b;

    /* renamed from: c */
    public C1595f f4938c;

    /* renamed from: d */
    public Object f4939d;

    /* JADX WARNING: type inference failed for: r3v2, types: [q.f, p.h] */
    /* JADX WARNING: type inference failed for: r3v3, types: [q.f, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v5, types: [p.a, q.f] */
    /* JADX WARNING: type inference failed for: r3v6, types: [android.util.SparseArray, q.f] */
    /* JADX WARNING: type inference failed for: r3v7, types: [p.e, q.f] */
    public C1592d(int i) {
        if (i == 1) {
            this.f4936a = new C1595f(10, 1);
            this.f4937b = new C1558h();
            this.f4938c = new ArrayList();
            this.f4939d = new HashSet();
        } else if (i != 2) {
            this.f4936a = new C1595f(256, 0);
            this.f4937b = new C1595f(256, 0);
            this.f4938c = new C1595f(256, 0);
            this.f4939d = new C1601j[32];
        } else {
            this.f4936a = new C1545a();
            this.f4937b = new SparseArray();
            this.f4938c = new C1550e();
            this.f4939d = new C1545a();
        }
    }

    /* renamed from: a */
    public void mo5712a(T t) {
        if (!(((C1558h) this.f4937b).mo5608f(t) >= 0)) {
            ((C1558h) this.f4937b).put(t, null);
        }
    }

    /* renamed from: b */
    public void mo5713b(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = (ArrayList) ((C1558h) this.f4937b).getOrDefault(t, null);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        mo5713b(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    /* renamed from: c */
    public ArrayList<T> mo5714c() {
        ArrayList<T> arrayList = (ArrayList) this.f4936a.mo4463a();
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    /* renamed from: d */
    public void mo5715d(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f4936a.mo4464c(arrayList);
    }
}
