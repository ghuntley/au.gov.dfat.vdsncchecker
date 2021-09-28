package p128u4;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import p000a.C0001b;
import p025d3.C0802f;
import p062j4.C1113g;
import p063k.C1142f;
import p072l2.C1241e;
import p139w3.C2053a0;
import p139w3.C2063d0;
import p139w3.C2070f0;
import p139w3.C2098t;
import p139w3.C2103w;
import p139w3.C2106x;
import p139w3.C2111z;

/* renamed from: u4.w */
public final class C1949w {

    /* renamed from: l */
    public static final char[] f5709l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m */
    public static final Pattern f5710m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    public final String f5711a;

    /* renamed from: b */
    public final C2106x f5712b;
    @Nullable

    /* renamed from: c */
    public String f5713c;
    @Nullable

    /* renamed from: d */
    public C2106x.C2107a f5714d;

    /* renamed from: e */
    public final C2063d0.C2064a f5715e = new C2063d0.C2064a();

    /* renamed from: f */
    public final C2103w.C2104a f5716f;
    @Nullable

    /* renamed from: g */
    public C2111z f5717g;

    /* renamed from: h */
    public final boolean f5718h;
    @Nullable

    /* renamed from: i */
    public C2053a0.C2054a f5719i;
    @Nullable

    /* renamed from: j */
    public C2098t.C2099a f5720j;
    @Nullable

    /* renamed from: k */
    public C2070f0 f5721k;

    /* renamed from: u4.w$a */
    public static class C1950a extends C2070f0 {

        /* renamed from: a */
        public final C2070f0 f5722a;

        /* renamed from: b */
        public final C2111z f5723b;

        public C1950a(C2070f0 f0Var, C2111z zVar) {
            this.f5722a = f0Var;
            this.f5723b = zVar;
        }

        /* renamed from: a */
        public long mo6448a() {
            return this.f5722a.mo6448a();
        }

        /* renamed from: b */
        public C2111z mo6449b() {
            return this.f5723b;
        }

        /* renamed from: c */
        public void mo6450c(C1113g gVar) {
            this.f5722a.mo6450c(gVar);
        }
    }

    public C1949w(String str, C2106x xVar, @Nullable String str2, @Nullable C2103w wVar, @Nullable C2111z zVar, boolean z, boolean z2, boolean z3) {
        this.f5711a = str;
        this.f5712b = xVar;
        this.f5713c = str2;
        this.f5717g = zVar;
        this.f5718h = z;
        this.f5716f = wVar != null ? wVar.mo6613d() : new C2103w.C2104a();
        if (z2) {
            this.f5720j = new C2098t.C2099a();
        } else if (z3) {
            C2053a0.C2054a aVar = new C2053a0.C2054a();
            this.f5719i = aVar;
            C2111z zVar2 = C2053a0.f5901f;
            Objects.requireNonNull(aVar);
            C1241e.m3517j(zVar2, "type");
            if (C1241e.m3513b(zVar2.f6138b, "multipart")) {
                aVar.f5910b = zVar2;
                return;
            }
            throw new IllegalArgumentException(("multipart != " + zVar2).toString());
        }
    }

    /* renamed from: a */
    public void mo6444a(String str, String str2, boolean z) {
        String str3 = str;
        C2098t.C2099a aVar = this.f5720j;
        Objects.requireNonNull(aVar);
        if (z) {
            C1241e.m3517j(str3, "name");
            List<String> list = aVar.f6102a;
            C2106x.C2108b bVar = C2106x.f6115l;
            list.add(C2106x.C2108b.m5496a(bVar, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f6104c, 83));
            aVar.f6103b.add(C2106x.C2108b.m5496a(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f6104c, 83));
            return;
        }
        C1241e.m3517j(str3, "name");
        List<String> list2 = aVar.f6102a;
        C2106x.C2108b bVar2 = C2106x.f6115l;
        list2.add(C2106x.C2108b.m5496a(bVar2, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, aVar.f6104c, 91));
        aVar.f6103b.add(C2106x.C2108b.m5496a(bVar2, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, aVar.f6104c, 91));
    }

    /* renamed from: b */
    public void mo6445b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                C2111z.C2112a aVar = C2111z.f6136f;
                this.f5717g = C2111z.C2112a.m5503a(str2);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(C1142f.m3365a("Malformed content type: ", str2), e);
            }
        } else {
            this.f5716f.mo6620a(str, str2);
        }
    }

    /* renamed from: c */
    public void mo6446c(C2103w wVar, C2070f0 f0Var) {
        C2053a0.C2054a aVar = this.f5719i;
        Objects.requireNonNull(aVar);
        C1241e.m3517j(f0Var, "body");
        C1241e.m3517j(f0Var, "body");
        boolean z = true;
        if ((wVar != null ? wVar.mo6611b("Content-Type") : null) == null) {
            if ((wVar != null ? wVar.mo6611b("Content-Length") : null) != null) {
                z = false;
            }
            if (z) {
                C2053a0.C2055b bVar = new C2053a0.C2055b(wVar, f0Var, (C0802f) null);
                C1241e.m3517j(bVar, "part");
                aVar.f5911c.add(bVar);
                return;
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
        }
        throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
    }

    /* renamed from: d */
    public void mo6447d(String str, @Nullable String str2, boolean z) {
        String str3 = str;
        String str4 = this.f5713c;
        String str5 = null;
        if (str4 != null) {
            C2106x.C2107a f = this.f5712b.mo6633f(str4);
            this.f5714d = f;
            if (f != null) {
                this.f5713c = null;
            } else {
                StringBuilder a = C0001b.m0a("Malformed URL. Base: ");
                a.append(this.f5712b);
                a.append(", Relative: ");
                a.append(this.f5713c);
                throw new IllegalArgumentException(a.toString());
            }
        }
        C2106x.C2107a aVar = this.f5714d;
        Objects.requireNonNull(aVar);
        if (z) {
            C1241e.m3517j(str3, "encodedName");
            if (aVar.f6132g == null) {
                aVar.f6132g = new ArrayList();
            }
            List<String> list = aVar.f6132g;
            C1241e.m3515e(list);
            C2106x.C2108b bVar = C2106x.f6115l;
            list.add(C2106x.C2108b.m5496a(bVar, str, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211));
            List<String> list2 = aVar.f6132g;
            C1241e.m3515e(list2);
            if (str2 != null) {
                str5 = C2106x.C2108b.m5496a(bVar, str2, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211);
            }
            list2.add(str5);
            return;
        }
        C1241e.m3517j(str3, "name");
        if (aVar.f6132g == null) {
            aVar.f6132g = new ArrayList();
        }
        List<String> list3 = aVar.f6132g;
        C1241e.m3515e(list3);
        C2106x.C2108b bVar2 = C2106x.f6115l;
        list3.add(C2106x.C2108b.m5496a(bVar2, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219));
        List<String> list4 = aVar.f6132g;
        C1241e.m3515e(list4);
        if (str2 != null) {
            str5 = C2106x.C2108b.m5496a(bVar2, str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219);
        }
        list4.add(str5);
    }
}
