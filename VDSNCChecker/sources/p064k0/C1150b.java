package p064k0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeInfo;
import com.dynamsoft.dbr.EnumBarcodeFormat;
import com.dynamsoft.dbr.EnumBarcodeFormat_2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p064k0.C1158d;

/* renamed from: k0.b */
public class C1150b {

    /* renamed from: d */
    public static int f4004d;

    /* renamed from: a */
    public final AccessibilityNodeInfo f4005a;

    /* renamed from: b */
    public int f4006b = -1;

    /* renamed from: c */
    public int f4007c = -1;

    /* renamed from: k0.b$a */
    public static class C1151a {

        /* renamed from: e */
        public static final C1151a f4008e = new C1151a(16, (CharSequence) null);

        /* renamed from: f */
        public static final C1151a f4009f = new C1151a(4096, (CharSequence) null);

        /* renamed from: g */
        public static final C1151a f4010g = new C1151a(8192, (CharSequence) null);

        /* renamed from: h */
        public static final C1151a f4011h = new C1151a(EnumBarcodeFormat.BF_PATCHCODE, (CharSequence) null);

        /* renamed from: i */
        public static final C1151a f4012i = new C1151a(EnumBarcodeFormat.BF_MICRO_PDF417, (CharSequence) null);

        /* renamed from: j */
        public static final C1151a f4013j = new C1151a(1048576, (CharSequence) null);

        /* renamed from: k */
        public static final C1151a f4014k = new C1151a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, (CharSequence) null, (C1158d) null, (Class<? extends C1158d.C1159a>) null);

        /* renamed from: l */
        public static final C1151a f4015l = new C1151a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (CharSequence) null, (C1158d) null, (Class<? extends C1158d.C1159a>) null);

        /* renamed from: a */
        public final Object f4016a;

        /* renamed from: b */
        public final int f4017b;

        /* renamed from: c */
        public final Class<? extends C1158d.C1159a> f4018c;

        /* renamed from: d */
        public final C1158d f4019d;

        static {
            Class<C1158d.C1161c> cls = C1158d.C1161c.class;
            Class<C1158d.C1160b> cls2 = C1158d.C1160b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new C1151a(1, (CharSequence) null);
            new C1151a(2, (CharSequence) null);
            new C1151a(4, (CharSequence) null);
            new C1151a(8, (CharSequence) null);
            new C1151a(32, (CharSequence) null);
            new C1151a(64, (CharSequence) null);
            new C1151a(128, (CharSequence) null);
            new C1151a(256, (CharSequence) null, cls2);
            new C1151a(512, (CharSequence) null, cls2);
            new C1151a(1024, (CharSequence) null, cls);
            new C1151a(2048, (CharSequence) null, cls);
            new C1151a(EnumBarcodeFormat.BF_GS1_DATABAR_STACKED_OMNIDIRECTIONAL, (CharSequence) null);
            new C1151a(EnumBarcodeFormat.BF_GS1_DATABAR_EXPANDED, (CharSequence) null);
            new C1151a(EnumBarcodeFormat.BF_GS1_DATABAR_EXPANDED_STACKED, (CharSequence) null);
            new C1151a(EnumBarcodeFormat.BF_GS1_DATABAR_LIMITED, (CharSequence) null, C1158d.C1165g.class);
            new C1151a(EnumBarcodeFormat_2.BF2_POSTNET, (CharSequence) null, C1158d.C1166h.class);
            int i = Build.VERSION.SDK_INT;
            new C1151a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (CharSequence) null, (C1158d) null, (Class<? extends C1158d.C1159a>) null);
            new C1151a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, (CharSequence) null, (C1158d) null, C1158d.C1163e.class);
            new C1151a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (CharSequence) null, (C1158d) null, (Class<? extends C1158d.C1159a>) null);
            new C1151a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (CharSequence) null, (C1158d) null, (Class<? extends C1158d.C1159a>) null);
            new C1151a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (C1158d) null, (Class<? extends C1158d.C1159a>) null);
            new C1151a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (C1158d) null, (Class<? extends C1158d.C1159a>) null);
            new C1151a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (C1158d) null, (Class<? extends C1158d.C1159a>) null);
            new C1151a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (C1158d) null, (Class<? extends C1158d.C1159a>) null);
            new C1151a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (CharSequence) null, (C1158d) null, (Class<? extends C1158d.C1159a>) null);
            new C1151a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, (CharSequence) null, (C1158d) null, C1158d.C1164f.class);
            new C1151a(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (C1158d) null, C1158d.C1162d.class);
            new C1151a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (C1158d) null, (Class<? extends C1158d.C1159a>) null);
            new C1151a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, (CharSequence) null, (C1158d) null, (Class<? extends C1158d.C1159a>) null);
            new C1151a(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (CharSequence) null, (C1158d) null, (Class<? extends C1158d.C1159a>) null);
            if (i >= 30) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            }
            new C1151a(accessibilityAction, 16908372, (CharSequence) null, (C1158d) null, (Class<? extends C1158d.C1159a>) null);
        }

        public C1151a(int i, CharSequence charSequence) {
            this((Object) null, i, (CharSequence) null, (C1158d) null, (Class<? extends C1158d.C1159a>) null);
        }

        public C1151a(int i, CharSequence charSequence, Class<? extends C1158d.C1159a> cls) {
            this((Object) null, i, (CharSequence) null, (C1158d) null, cls);
        }

        public C1151a(Object obj, int i, CharSequence charSequence, C1158d dVar, Class<? extends C1158d.C1159a> cls) {
            this.f4017b = i;
            this.f4019d = dVar;
            this.f4016a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i, charSequence) : obj;
            this.f4018c = cls;
        }

        /* renamed from: a */
        public int mo4772a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f4016a).getId();
        }

        /* renamed from: b */
        public CharSequence mo4773b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f4016a).getLabel();
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C1151a)) {
                return false;
            }
            Object obj2 = this.f4016a;
            Object obj3 = ((C1151a) obj).f4016a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f4016a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    /* renamed from: k0.b$b */
    public static class C1152b {

        /* renamed from: a */
        public final Object f4020a;

        public C1152b(Object obj) {
            this.f4020a = obj;
        }

        /* renamed from: a */
        public static C1152b m3388a(int i, int i2, boolean z, int i3) {
            return new C1152b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }
    }

    /* renamed from: k0.b$c */
    public static class C1153c {

        /* renamed from: a */
        public final Object f4021a;

        public C1153c(Object obj) {
            this.f4021a = obj;
        }

        /* renamed from: a */
        public static C1153c m3389a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new C1153c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    public C1150b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f4005a = accessibilityNodeInfo;
    }

    /* renamed from: c */
    public static String m3375c(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case EnumBarcodeFormat.BF_GS1_DATABAR_STACKED_OMNIDIRECTIONAL:
                return "ACTION_COPY";
            case EnumBarcodeFormat.BF_GS1_DATABAR_EXPANDED:
                return "ACTION_PASTE";
            case EnumBarcodeFormat.BF_GS1_DATABAR_EXPANDED_STACKED:
                return "ACTION_CUT";
            case EnumBarcodeFormat.BF_GS1_DATABAR_LIMITED:
                return "ACTION_SET_SELECTION";
            case EnumBarcodeFormat.BF_PATCHCODE:
                return "ACTION_EXPAND";
            case EnumBarcodeFormat.BF_MICRO_PDF417:
                return "ACTION_COLLAPSE";
            case EnumBarcodeFormat_2.BF2_POSTNET:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908372:
                return "ACTION_IME_ENTER";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    /* renamed from: d */
    public static ClickableSpan[] m3376d(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: a */
    public void mo4760a(C1151a aVar) {
        this.f4005a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f4016a);
    }

    /* renamed from: b */
    public final List<Integer> mo4761b(String str) {
        ArrayList<Integer> integerArrayList = this.f4005a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f4005a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: e */
    public CharSequence mo4762e() {
        return this.f4005a.getContentDescription();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1150b)) {
            return false;
        }
        C1150b bVar = (C1150b) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4005a;
        if (accessibilityNodeInfo == null) {
            if (bVar.f4005a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(bVar.f4005a)) {
            return false;
        }
        return this.f4007c == bVar.f4007c && this.f4006b == bVar.f4006b;
    }

    /* renamed from: f */
    public Bundle mo4764f() {
        return this.f4005a.getExtras();
    }

    /* renamed from: g */
    public CharSequence mo4765g() {
        if (!(!mo4761b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.f4005a.getText();
        }
        List<Integer> b = mo4761b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> b2 = mo4761b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> b3 = mo4761b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> b4 = mo4761b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f4005a.getText(), 0, this.f4005a.getText().length()));
        for (int i = 0; i < b.size(); i++) {
            spannableString.setSpan(new C1149a(b4.get(i).intValue(), this, mo4764f().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), b.get(i).intValue(), b2.get(i).intValue(), b3.get(i).intValue());
        }
        return spannableString;
    }

    /* renamed from: h */
    public final void mo4766h(int i, boolean z) {
        Bundle f = mo4764f();
        if (f != null) {
            int i2 = f.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            f.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4005a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public void mo4768i(Object obj) {
        this.f4005a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((C1152b) obj).f4020a);
    }

    /* renamed from: j */
    public void mo4769j(Object obj) {
        this.f4005a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((C1153c) obj).f4021a);
    }

    /* renamed from: k */
    public void mo4770k(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4005a.setHintText(charSequence);
        } else {
            this.f4005a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public String toString() {
        ArrayList arrayList;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        this.f4005a.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        this.f4005a.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.f4005a.getPackageName());
        sb.append("; className: ");
        sb.append(this.f4005a.getClassName());
        sb.append("; text: ");
        sb.append(mo4765g());
        sb.append("; contentDescription: ");
        sb.append(mo4762e());
        sb.append("; viewId: ");
        sb.append(this.f4005a.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.f4005a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.f4005a.isChecked());
        sb.append("; focusable: ");
        sb.append(this.f4005a.isFocusable());
        sb.append("; focused: ");
        sb.append(this.f4005a.isFocused());
        sb.append("; selected: ");
        sb.append(this.f4005a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.f4005a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.f4005a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.f4005a.isEnabled());
        sb.append("; password: ");
        sb.append(this.f4005a.isPassword());
        sb.append("; scrollable: " + this.f4005a.isScrollable());
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f4005a.getActionList();
        if (actionList != null) {
            ArrayList arrayList2 = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(new C1151a(actionList.get(i), 0, (CharSequence) null, (C1158d) null, (Class<? extends C1158d.C1159a>) null));
            }
            arrayList = arrayList2;
        } else {
            arrayList = Collections.emptyList();
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C1151a aVar = (C1151a) arrayList.get(i2);
            String c = m3375c(aVar.mo4772a());
            if (c.equals("ACTION_UNKNOWN") && aVar.mo4773b() != null) {
                c = aVar.mo4773b().toString();
            }
            sb.append(c);
            if (i2 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
