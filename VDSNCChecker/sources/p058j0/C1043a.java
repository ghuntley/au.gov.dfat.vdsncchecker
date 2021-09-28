package p058j0;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p064k0.C1150b;
import p064k0.C1154c;
import p064k0.C1158d;

/* renamed from: j0.a */
public class C1043a {

    /* renamed from: c */
    public static final View.AccessibilityDelegate f3778c = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f3779a;

    /* renamed from: b */
    public final View.AccessibilityDelegate f3780b;

    /* renamed from: j0.a$a */
    public static final class C1044a extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final C1043a f3781a;

        public C1044a(C1043a aVar) {
            this.f3781a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f3781a.mo2444a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C1154c b = this.f3781a.mo2445b(view);
            if (b != null) {
                return (AccessibilityNodeProvider) b.f4022a;
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3781a.mo1507c(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Object obj;
            Object obj2;
            int i;
            View view2 = view;
            AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfo;
            Class<Boolean> cls = Boolean.class;
            C1150b bVar = new C1150b(accessibilityNodeInfo2);
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            int i2 = Build.VERSION.SDK_INT;
            boolean z = true;
            Object obj3 = null;
            if (i2 >= 28) {
                obj = Boolean.valueOf(view.isScreenReaderFocusable());
            } else {
                obj = view2.getTag(R.id.tag_screen_reader_focusable);
                if (!cls.isInstance(obj)) {
                    obj = null;
                }
            }
            Boolean bool = (Boolean) obj;
            boolean booleanValue = bool == null ? false : bool.booleanValue();
            if (i2 >= 28) {
                accessibilityNodeInfo2.setScreenReaderFocusable(booleanValue);
            } else {
                bVar.mo4766h(1, booleanValue);
            }
            if (i2 >= 28) {
                obj2 = Boolean.valueOf(view.isAccessibilityHeading());
            } else {
                Object tag = view2.getTag(R.id.tag_accessibility_heading);
                obj2 = cls.isInstance(tag) ? tag : null;
            }
            Boolean bool2 = (Boolean) obj2;
            boolean booleanValue2 = bool2 == null ? false : bool2.booleanValue();
            if (i2 >= 28) {
                accessibilityNodeInfo2.setHeading(booleanValue2);
            } else {
                bVar.mo4766h(2, booleanValue2);
            }
            CharSequence g = C1061o.m3026g(view);
            if (i2 >= 28) {
                accessibilityNodeInfo2.setPaneTitle(g);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", g);
            }
            Class<CharSequence> cls2 = CharSequence.class;
            if (i2 >= 30) {
                obj3 = view.getStateDescription();
            } else {
                Object tag2 = view2.getTag(R.id.tag_state_description);
                if (cls2.isInstance(tag2)) {
                    obj3 = tag2;
                }
            }
            CharSequence charSequence = (CharSequence) obj3;
            if (i2 < 30) {
                z = false;
            }
            if (z) {
                accessibilityNodeInfo2.setStateDescription(charSequence);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
            }
            this.f3781a.mo1508d(view2, bVar);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i2 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view2.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                        if (((WeakReference) sparseArray.valueAt(i3)).get() == null) {
                            arrayList.add(Integer.valueOf(i3));
                        }
                    }
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        sparseArray.remove(((Integer) arrayList.get(i4)).intValue());
                    }
                }
                ClickableSpan[] d = C1150b.m3376d(text);
                if (d != null && d.length > 0) {
                    bVar.mo4764f().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view2.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view2.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    for (int i5 = 0; i5 < d.length; i5++) {
                        ClickableSpan clickableSpan = d[i5];
                        int i6 = 0;
                        while (true) {
                            if (i6 >= sparseArray2.size()) {
                                i = C1150b.f4004d;
                                C1150b.f4004d = i + 1;
                                break;
                            } else if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i6)).get())) {
                                i = sparseArray2.keyAt(i6);
                                break;
                            } else {
                                i6++;
                            }
                        }
                        sparseArray2.put(i, new WeakReference(d[i5]));
                        ClickableSpan clickableSpan2 = d[i5];
                        Spanned spanned = (Spanned) text;
                        bVar.mo4761b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        bVar.mo4761b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        bVar.mo4761b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        bVar.mo4761b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                    }
                }
            }
            List list = (List) view2.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i7 = 0; i7 < list.size(); i7++) {
                bVar.mo4760a((C1150b.C1151a) list.get(i7));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3781a.mo2446e(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f3781a.mo2447f(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f3781a.mo1509g(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f3781a.mo2448h(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f3781a.mo2449i(view, accessibilityEvent);
        }
    }

    public C1043a() {
        this.f3779a = f3778c;
        this.f3780b = new C1044a(this);
    }

    public C1043a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f3779a = accessibilityDelegate;
        this.f3780b = new C1044a(this);
    }

    /* renamed from: a */
    public boolean mo2444a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f3779a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C1154c mo2445b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f3779a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C1154c(accessibilityNodeProvider);
        }
        return null;
    }

    /* renamed from: c */
    public void mo1507c(View view, AccessibilityEvent accessibilityEvent) {
        this.f3779a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo1508d(View view, C1150b bVar) {
        this.f3779a.onInitializeAccessibilityNodeInfo(view, bVar.f4005a);
    }

    /* renamed from: e */
    public void mo2446e(View view, AccessibilityEvent accessibilityEvent) {
        this.f3779a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: f */
    public boolean mo2447f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f3779a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: g */
    public boolean mo1509g(View view, int i, Bundle bundle) {
        boolean z;
        WeakReference weakReference;
        boolean z2;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            C1150b.C1151a aVar = (C1150b.C1151a) list.get(i2);
            if (aVar.mo4772a() != i) {
                i2++;
            } else if (aVar.f4019d != null) {
                C1158d.C1159a aVar2 = null;
                Class<? extends C1158d.C1159a> cls = aVar.f4018c;
                if (cls != null) {
                    try {
                        C1158d.C1159a aVar3 = (C1158d.C1159a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        try {
                            Objects.requireNonNull(aVar3);
                        } catch (Exception unused) {
                        }
                        aVar2 = aVar3;
                    } catch (Exception unused2) {
                    }
                }
                z = aVar.f4019d.mo3169a(view, aVar2);
            }
        }
        z = false;
        if (!z) {
            z = this.f3779a.performAccessibilityAction(view, i, bundle);
        }
        if (z || i != R.id.accessibility_action_clickable_span) {
            return z;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (!(sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i3)) == null)) {
            ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
            if (clickableSpan != null) {
                ClickableSpan[] d = C1150b.m3376d(view.createAccessibilityNodeInfo().getText());
                int i4 = 0;
                while (true) {
                    if (d == null || i4 >= d.length) {
                        break;
                    } else if (clickableSpan.equals(d[i4])) {
                        z2 = true;
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            z2 = false;
            if (z2) {
                clickableSpan.onClick(view);
                z3 = true;
            }
        }
        return z3;
    }

    /* renamed from: h */
    public void mo2448h(View view, int i) {
        this.f3779a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: i */
    public void mo2449i(View view, AccessibilityEvent accessibilityEvent) {
        this.f3779a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
