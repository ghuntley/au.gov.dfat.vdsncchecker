package p136w0;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000a.C0001b;
import p016c0.C0559c;

/* renamed from: w0.j */
public final class C2010j {

    /* renamed from: i */
    public static final Pattern f5836i = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: a */
    public final ArrayList<String> f5837a = new ArrayList<>();

    /* renamed from: b */
    public final Map<String, C2012b> f5838b = new HashMap();

    /* renamed from: c */
    public Pattern f5839c = null;

    /* renamed from: d */
    public boolean f5840d;

    /* renamed from: e */
    public boolean f5841e;

    /* renamed from: f */
    public final String f5842f;

    /* renamed from: g */
    public Pattern f5843g;

    /* renamed from: h */
    public final String f5844h;

    /* renamed from: w0.j$a */
    public static class C2011a implements Comparable<C2011a> {

        /* renamed from: e */
        public String f5845e;

        /* renamed from: f */
        public String f5846f;

        public C2011a(String str) {
            String[] split = str.split("/", -1);
            this.f5845e = split[0];
            this.f5846f = split[1];
        }

        /* renamed from: a */
        public int compareTo(C2011a aVar) {
            int i = this.f5845e.equals(aVar.f5845e) ? 2 : 0;
            return this.f5846f.equals(aVar.f5846f) ? i + 1 : i;
        }
    }

    /* renamed from: w0.j$b */
    public static class C2012b {

        /* renamed from: a */
        public String f5847a;

        /* renamed from: b */
        public ArrayList<String> f5848b = new ArrayList<>();
    }

    public C2010j(String str, String str2, String str3) {
        int i = 0;
        this.f5840d = false;
        this.f5841e = false;
        this.f5843g = null;
        this.f5842f = str2;
        this.f5844h = str3;
        if (str != null) {
            Uri parse = Uri.parse(str);
            int i2 = 1;
            this.f5841e = parse.getQuery() != null;
            StringBuilder sb = new StringBuilder("^");
            if (!f5836i.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (this.f5841e) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    mo6500a(str.substring(0, matcher.start()), sb, compile);
                }
                this.f5840d = false;
                for (String next : parse.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(next);
                    Matcher matcher2 = compile.matcher(queryParameter);
                    C2012b bVar = new C2012b();
                    while (matcher2.find()) {
                        bVar.f5848b.add(matcher2.group(i2));
                        sb2.append(Pattern.quote(queryParameter.substring(i, matcher2.start())));
                        sb2.append("(.+?)?");
                        i = matcher2.end();
                        i2 = 1;
                    }
                    if (i < queryParameter.length()) {
                        sb2.append(Pattern.quote(queryParameter.substring(i)));
                    }
                    bVar.f5847a = sb2.toString().replace(".*", "\\E.*\\Q");
                    this.f5838b.put(next, bVar);
                    i = 0;
                    i2 = 1;
                }
            } else {
                this.f5840d = mo6500a(str, sb, compile);
            }
            this.f5839c = Pattern.compile(sb.toString().replace(".*", "\\E.*\\Q"), 2);
        }
        if (str3 == null) {
            return;
        }
        if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
            C2011a aVar = new C2011a(str3);
            StringBuilder a = C0001b.m0a("^(");
            a.append(aVar.f5845e);
            a.append("|[*]+)/(");
            a.append(aVar.f5846f);
            a.append("|[*]+)$");
            this.f5843g = Pattern.compile(a.toString().replace("*|[*]", "[\\s\\S]"));
            return;
        }
        throw new IllegalArgumentException(C0559c.m1823a("The given mimeType ", str3, " does not match to required \"type/subtype\" format"));
    }

    /* renamed from: a */
    public final boolean mo6500a(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z = !str.contains(".*");
        int i = 0;
        while (matcher.find()) {
            this.f5837a.add(matcher.group(1));
            sb.append(Pattern.quote(str.substring(i, matcher.start())));
            sb.append("(.+?)");
            i = matcher.end();
            z = false;
        }
        if (i < str.length()) {
            sb.append(Pattern.quote(str.substring(i)));
        }
        sb.append("($|(\\?(.)*))");
        return z;
    }

    /* renamed from: b */
    public final boolean mo6501b(Bundle bundle, String str, String str2, C2003f fVar) {
        if (fVar != null) {
            C2016n nVar = fVar.f5817a;
            try {
                nVar.mo6512d(bundle, str, nVar.mo6511c(str2));
                return false;
            } catch (IllegalArgumentException unused) {
                return true;
            }
        } else {
            bundle.putString(str, str2);
            return false;
        }
    }
}
