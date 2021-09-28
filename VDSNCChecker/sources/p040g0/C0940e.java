package p040g0;

import android.util.Base64;
import java.util.List;
import java.util.Objects;
import p000a.C0001b;
import p099q.C1589b;

/* renamed from: g0.e */
public final class C0940e {

    /* renamed from: a */
    public final String f3492a;

    /* renamed from: b */
    public final String f3493b;

    /* renamed from: c */
    public final String f3494c;

    /* renamed from: d */
    public final List<List<byte[]>> f3495d;

    /* renamed from: e */
    public final String f3496e;

    public C0940e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f3492a = str;
        this.f3493b = str2;
        this.f3494c = str3;
        Objects.requireNonNull(list);
        this.f3495d = list;
        this.f3496e = str + "-" + str2 + "-" + str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder a = C0001b.m0a("FontRequest {mProviderAuthority: ");
        a.append(this.f3492a);
        a.append(", mProviderPackage: ");
        a.append(this.f3493b);
        a.append(", mQuery: ");
        a.append(this.f3494c);
        a.append(", mCertificates:");
        sb.append(a.toString());
        for (int i = 0; i < this.f3495d.size(); i++) {
            sb.append(" [");
            List list = this.f3495d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        return C1589b.m4444a(sb, "}", "mCertificatesArray: 0");
    }
}
