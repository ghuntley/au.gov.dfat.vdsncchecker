package p111s;

import java.util.ArrayList;
import p099q.C1592d;

/* renamed from: s.l */
public class C1702l extends C1695e {

    /* renamed from: q0 */
    public ArrayList<C1695e> f5270q0 = new ArrayList<>();

    /* renamed from: C */
    public void mo5907C() {
        this.f5270q0.clear();
        super.mo5907C();
    }

    /* renamed from: E */
    public void mo5909E(C1592d dVar) {
        super.mo5909E(dVar);
        int size = this.f5270q0.size();
        for (int i = 0; i < size; i++) {
            this.f5270q0.get(i).mo5909E(dVar);
        }
    }

    /* renamed from: Q */
    public void mo5944Q() {
        ArrayList<C1695e> arrayList = this.f5270q0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C1695e eVar = this.f5270q0.get(i);
                if (eVar instanceof C1702l) {
                    ((C1702l) eVar).mo5944Q();
                }
            }
        }
    }
}
