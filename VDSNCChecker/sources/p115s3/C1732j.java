package p115s3;

import java.util.HashSet;
import java.util.Set;
import p103q3.C1615c;

/* renamed from: s3.j */
public final class C1732j {

    /* renamed from: a */
    public static final C1615c[] f5312a = new C1615c[0];

    /* renamed from: a */
    public static final Set<String> m4807a(C1615c cVar) {
        if (cVar instanceof C1725d) {
            return ((C1725d) cVar).mo5985e();
        }
        HashSet hashSet = new HashSet(cVar.mo5767j());
        int i = 0;
        int j = cVar.mo5767j();
        if (j > 0) {
            while (true) {
                int i2 = i + 1;
                hashSet.add(cVar.mo5757a(i));
                if (i2 >= j) {
                    break;
                }
                i = i2;
            }
        }
        return hashSet;
    }
}
