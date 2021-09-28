package p064k0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import java.util.Objects;

/* renamed from: k0.c */
public class C1154c {

    /* renamed from: a */
    public final Object f4022a;

    /* renamed from: k0.c$a */
    public static class C1155a extends AccessibilityNodeProvider {

        /* renamed from: a */
        public final C1154c f4023a;

        public C1155a(C1154c cVar) {
            this.f4023a = cVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C1150b a = this.f4023a.mo4776a(i);
            if (a == null) {
                return null;
            }
            return a.f4005a;
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            Objects.requireNonNull(this.f4023a);
            return null;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f4023a.mo4778c(i, i2, bundle);
        }
    }

    /* renamed from: k0.c$b */
    public static class C1156b extends C1155a {
        public C1156b(C1154c cVar) {
            super(cVar);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            C1150b b = this.f4023a.mo4777b(i);
            if (b == null) {
                return null;
            }
            return b.f4005a;
        }
    }

    /* renamed from: k0.c$c */
    public static class C1157c extends C1156b {
        public C1157c(C1154c cVar) {
            super(cVar);
        }

        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            Objects.requireNonNull(this.f4023a);
        }
    }

    public C1154c() {
        this.f4022a = Build.VERSION.SDK_INT >= 26 ? new C1157c(this) : new C1156b(this);
    }

    public C1154c(Object obj) {
        this.f4022a = obj;
    }

    /* renamed from: a */
    public C1150b mo4776a(int i) {
        return null;
    }

    /* renamed from: b */
    public C1150b mo4777b(int i) {
        return null;
    }

    /* renamed from: c */
    public boolean mo4778c(int i, int i2, Bundle bundle) {
        return false;
    }
}
