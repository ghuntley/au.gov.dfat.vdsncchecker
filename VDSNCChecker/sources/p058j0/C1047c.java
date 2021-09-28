package p058j0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import java.util.Locale;
import java.util.Objects;
import p000a.C0001b;
import p099q.C1589b;

/* renamed from: j0.c */
public final class C1047c {

    /* renamed from: a */
    public final ClipData f3783a;

    /* renamed from: b */
    public final int f3784b;

    /* renamed from: c */
    public final int f3785c;

    /* renamed from: d */
    public final Uri f3786d;

    /* renamed from: e */
    public final Bundle f3787e;

    /* renamed from: j0.c$a */
    public static final class C1048a {

        /* renamed from: a */
        public ClipData f3788a;

        /* renamed from: b */
        public int f3789b;

        /* renamed from: c */
        public int f3790c;

        /* renamed from: d */
        public Uri f3791d;

        /* renamed from: e */
        public Bundle f3792e;

        public C1048a(ClipData clipData, int i) {
            this.f3788a = clipData;
            this.f3789b = i;
        }
    }

    public C1047c(C1048a aVar) {
        ClipData clipData = aVar.f3788a;
        Objects.requireNonNull(clipData);
        this.f3783a = clipData;
        int i = aVar.f3789b;
        if (i < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{"source", 0, 3}));
        } else if (i <= 3) {
            this.f3784b = i;
            int i2 = aVar.f3790c;
            if ((i2 & 1) == i2) {
                this.f3785c = i2;
                this.f3786d = aVar.f3791d;
                this.f3787e = aVar.f3792e;
                return;
            }
            StringBuilder a = C0001b.m0a("Requested flags 0x");
            a.append(Integer.toHexString(i2));
            a.append(", but only 0x");
            a.append(Integer.toHexString(1));
            a.append(" are allowed");
            throw new IllegalArgumentException(a.toString());
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{"source", 0, 3}));
        }
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder a = C0001b.m0a("ContentInfoCompat{clip=");
        a.append(this.f3783a.getDescription());
        a.append(", source=");
        int i = this.f3784b;
        a.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? String.valueOf(i) : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
        a.append(", flags=");
        int i2 = this.f3785c;
        if ((i2 & 1) != 0) {
            str = "FLAG_CONVERT_TO_PLAIN_TEXT";
        } else {
            str = String.valueOf(i2);
        }
        a.append(str);
        String str3 = "";
        if (this.f3786d == null) {
            str2 = str3;
        } else {
            StringBuilder a2 = C0001b.m0a(", hasLinkUri(");
            a2.append(this.f3786d.toString().length());
            a2.append(")");
            str2 = a2.toString();
        }
        a.append(str2);
        if (this.f3787e != null) {
            str3 = ", hasExtras";
        }
        return C1589b.m4444a(a, str3, "}");
    }
}
