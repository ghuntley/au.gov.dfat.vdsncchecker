package p065k1;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import p000a.C0001b;
import p007au.gov.dfat.vdsncchecker.vds.VdsParcel;
import p072l2.C1241e;
import p136w0.C2000c;

/* renamed from: k1.s */
public final class C1187s implements C2000c {

    /* renamed from: a */
    public final VdsParcel f4073a;

    public C1187s(VdsParcel vdsParcel) {
        this.f4073a = vdsParcel;
    }

    public static final C1187s fromBundle(Bundle bundle) {
        C1241e.m3517j(bundle, "bundle");
        bundle.setClassLoader(C1187s.class.getClassLoader());
        if (!bundle.containsKey("vds")) {
            throw new IllegalArgumentException("Required argument \"vds\" is missing and does not have an android:defaultValue");
        } else if (Parcelable.class.isAssignableFrom(VdsParcel.class) || Serializable.class.isAssignableFrom(VdsParcel.class)) {
            VdsParcel vdsParcel = (VdsParcel) bundle.get("vds");
            if (vdsParcel != null) {
                return new C1187s(vdsParcel);
            }
            throw new IllegalArgumentException("Argument \"vds\" is marked as non-null but was passed a null value.");
        } else {
            throw new UnsupportedOperationException(C1241e.m3522p(VdsParcel.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1187s) && C1241e.m3513b(this.f4073a, ((C1187s) obj).f4073a);
    }

    public int hashCode() {
        return this.f4073a.hashCode();
    }

    public String toString() {
        StringBuilder a = C0001b.m0a("SummaryFragmentArgs(vds=");
        a.append(this.f4073a);
        a.append(')');
        return a.toString();
    }
}
