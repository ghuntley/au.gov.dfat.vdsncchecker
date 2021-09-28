package p115s3;

import java.util.ArrayList;
import java.util.Objects;
import p042g2.C0955a;
import p072l2.C1241e;
import p097p3.C1579a;
import p103q3.C1615c;
import p109r3.C1685b;
import p109r3.C1687c;
import p121t3.C1807h;
import p127u3.C1858a;

/* renamed from: s3.q */
public abstract class C1743q<Tag> implements C1687c, C1685b {

    /* renamed from: a */
    public final ArrayList<Tag> f5336a = new ArrayList<>();

    /* renamed from: b */
    public boolean f5337b;

    /* renamed from: b */
    public final <T> T mo5874b(C1615c cVar, int i, C1579a<T> aVar, T t) {
        C1241e.m3517j(cVar, "descriptor");
        C1241e.m3517j(aVar, "deserializer");
        this.f5336a.add(((C1858a) this).mo6367A(cVar, i));
        T r = mo6003r(aVar, t);
        if (!this.f5337b) {
            mo6007v();
        }
        this.f5337b = false;
        return r;
    }

    /* renamed from: c */
    public abstract <T> T mo5875c(C1579a<T> aVar);

    /* renamed from: d */
    public final long mo5876d() {
        return mo6004s(mo6007v());
    }

    /* renamed from: f */
    public final <T> T mo5877f(C1615c cVar, int i, C1579a<T> aVar, T t) {
        T t2;
        C1241e.m3517j(cVar, "descriptor");
        this.f5336a.add(((C1858a) this).mo6367A(cVar, i));
        if (!(((C1858a) this).mo6370x() instanceof C1807h)) {
            Objects.requireNonNull(this);
            C1241e.m3517j(aVar, "deserializer");
            t2 = mo5875c(aVar);
        } else {
            Objects.requireNonNull(this);
            t2 = null;
        }
        if (!this.f5337b) {
            mo6007v();
        }
        this.f5337b = false;
        return t2;
    }

    /* renamed from: g */
    public int mo5878g(C1615c cVar) {
        C1241e.m3517j(cVar, "descriptor");
        return -1;
    }

    /* renamed from: k */
    public final String mo5879k(C1615c cVar, int i) {
        C1241e.m3517j(cVar, "descriptor");
        return mo6005t(((C1858a) this).mo6367A(cVar, i));
    }

    /* renamed from: m */
    public final Void mo5888m() {
        return null;
    }

    /* renamed from: o */
    public boolean mo5880o() {
        return false;
    }

    /* renamed from: p */
    public final String mo5881p() {
        return mo6005t(mo6007v());
    }

    /* renamed from: q */
    public final long mo5882q(C1615c cVar, int i) {
        C1241e.m3517j(cVar, "descriptor");
        return mo6004s(((C1858a) this).mo6367A(cVar, i));
    }

    /* renamed from: r */
    public <T> T mo6003r(C1579a<T> aVar, T t) {
        C1241e.m3517j(aVar, "deserializer");
        return mo5875c(aVar);
    }

    /* renamed from: s */
    public abstract long mo6004s(Tag tag);

    /* renamed from: t */
    public abstract String mo6005t(Tag tag);

    /* renamed from: u */
    public final Tag mo6006u() {
        ArrayList<Tag> arrayList = this.f5336a;
        C1241e.m3517j(arrayList, "$this$lastOrNull");
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: v */
    public final Tag mo6007v() {
        ArrayList<Tag> arrayList = this.f5336a;
        Tag remove = arrayList.remove(C0955a.m2742p(arrayList));
        this.f5337b = true;
        return remove;
    }
}
