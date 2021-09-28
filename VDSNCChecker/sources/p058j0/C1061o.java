package p058j0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p007au.gov.dfat.vdsncchecker.R;
import p058j0.C1043a;
import p064k0.C1150b;
import p064k0.C1158d;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: j0.o */
public class C1061o {

    /* renamed from: a */
    public static WeakHashMap<View, C1070q> f3808a = null;

    /* renamed from: b */
    public static Field f3809b;

    /* renamed from: c */
    public static boolean f3810c = false;

    /* renamed from: d */
    public static final int[] f3811d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e */
    public static final C1059m f3812e = new C1062a();

    /* renamed from: j0.o$a */
    public class C1062a implements C1059m {
        /* renamed from: a */
        public C1047c mo986a(C1047c cVar) {
            return cVar;
        }
    }

    /* renamed from: j0.o$b */
    public static class C1063b {

        /* renamed from: j0.o$b$a */
        public class C1064a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            public C1076u f3813a = null;

            /* renamed from: b */
            public final /* synthetic */ View f3814b;

            /* renamed from: c */
            public final /* synthetic */ C1057k f3815c;

            public C1064a(View view, C1057k kVar) {
                this.f3814b = view;
                this.f3815c = kVar;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C1076u i = C1076u.m3059i(windowInsets, view);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 30) {
                    C1063b.m3036a(windowInsets, this.f3814b);
                    if (i.equals(this.f3813a)) {
                        return this.f3815c.mo1392a(view, i).mo4562g();
                    }
                }
                this.f3813a = i;
                C1076u a = this.f3815c.mo1392a(view, i);
                if (i2 >= 30) {
                    return a.mo4562g();
                }
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                view.requestApplyInsets();
                return a.mo4562g();
            }
        }

        /* renamed from: a */
        public static void m3036a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        public static C1076u m3037b(View view, C1076u uVar, Rect rect) {
            WindowInsets g = uVar.mo4562g();
            if (g != null) {
                return C1076u.m3059i(view.computeSystemWindowInsets(g, rect), view);
            }
            rect.setEmpty();
            return uVar;
        }

        /* renamed from: c */
        public static void m3038c(View view, C1057k kVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, kVar);
            }
            if (kVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new C1064a(view, kVar));
            }
        }
    }

    /* renamed from: j0.o$c */
    public static class C1065c {
        /* renamed from: a */
        public static C1076u m3039a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C1076u i = C1076u.m3059i(rootWindowInsets, (View) null);
            i.f3826a.mo4574m(i);
            i.f3826a.mo4568d(view.getRootView());
            return i;
        }
    }

    /* renamed from: j0.o$d */
    public static class C1066d {
        /* renamed from: a */
        public static void m3040a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: j0.o$e */
    public interface C1067e {
        /* renamed from: a */
        boolean mo4542a(View view, KeyEvent keyEvent);
    }

    /* renamed from: j0.o$f */
    public static class C1068f {

        /* renamed from: d */
        public static final ArrayList<WeakReference<View>> f3816d = new ArrayList<>();

        /* renamed from: a */
        public WeakHashMap<View, Boolean> f3817a = null;

        /* renamed from: b */
        public SparseArray<WeakReference<View>> f3818b = null;

        /* renamed from: c */
        public WeakReference<KeyEvent> f3819c = null;

        /* renamed from: a */
        public final View mo4543a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f3817a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View a = mo4543a(viewGroup.getChildAt(childCount), keyEvent);
                        if (a != null) {
                            return a;
                        }
                    }
                }
                if (mo4544b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo4544b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((C1067e) arrayList.get(size)).mo4542a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        new AtomicInteger(1);
        new WeakHashMap();
    }

    /* renamed from: a */
    public static void m3020a(View view, C1150b.C1151a aVar) {
        C1043a e = m3024e(view);
        if (e == null) {
            e = new C1043a();
        }
        m3034o(view, e);
        m3031l(aVar.mo4772a(), view);
        m3027h(view).add(aVar);
        m3028i(view, 0);
    }

    /* renamed from: b */
    public static C1070q m3021b(View view) {
        if (f3808a == null) {
            f3808a = new WeakHashMap<>();
        }
        C1070q qVar = f3808a.get(view);
        if (qVar != null) {
            return qVar;
        }
        C1070q qVar2 = new C1070q(view);
        f3808a.put(view, qVar2);
        return qVar2;
    }

    /* renamed from: c */
    public static C1076u m3022c(View view, C1076u uVar) {
        WindowInsets g = uVar.mo4562g();
        if (g != null) {
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(g);
            if (!dispatchApplyWindowInsets.equals(g)) {
                return C1076u.m3059i(dispatchApplyWindowInsets, view);
            }
        }
        return uVar;
    }

    /* renamed from: d */
    public static boolean m3023d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = C1068f.f3816d;
        C1068f fVar = (C1068f) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (fVar == null) {
            fVar = new C1068f();
            view.setTag(R.id.tag_unhandled_key_event_manager, fVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = fVar.f3817a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = C1068f.f3816d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (fVar.f3817a == null) {
                        fVar.f3817a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = C1068f.f3816d;
                        View view2 = (View) arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            fVar.f3817a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                fVar.f3817a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a = fVar.mo4543a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (fVar.f3818b == null) {
                    fVar.f3818b = new SparseArray<>();
                }
                fVar.f3818b.put(keyCode, new WeakReference(a));
            }
        }
        if (a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static C1043a m3024e(View view) {
        View.AccessibilityDelegate f = m3025f(view);
        if (f == null) {
            return null;
        }
        return f instanceof C1043a.C1044a ? ((C1043a.C1044a) f).f3781a : new C1043a(f);
    }

    /* renamed from: f */
    public static View.AccessibilityDelegate m3025f(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        if (f3810c) {
            return null;
        }
        if (f3809b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3809b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3810c = true;
                return null;
            }
        }
        Object obj = f3809b.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    /* renamed from: g */
    public static CharSequence m3026g(View view) {
        Object obj;
        Class<CharSequence> cls = CharSequence.class;
        if (Build.VERSION.SDK_INT >= 28) {
            obj = view.getAccessibilityPaneTitle();
        } else {
            obj = view.getTag(R.id.tag_accessibility_pane_title);
            if (!cls.isInstance(obj)) {
                obj = null;
            }
        }
        return (CharSequence) obj;
    }

    /* renamed from: h */
    public static List<C1150b.C1151a> m3027h(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* renamed from: i */
    public static void m3028i(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m3026g(view) != null && view.getVisibility() == 0;
            int i2 = 32;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i2 = 2048;
                }
                obtain.setEventType(i2);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(m3026g(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            break;
                        } else if (((View) parent).getImportantForAccessibility() == 4) {
                            view.setImportantForAccessibility(2);
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m3026g(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError unused) {
                    Objects.requireNonNull(view.getParent());
                }
            }
        }
    }

    /* renamed from: j */
    public static C1076u m3029j(View view, C1076u uVar) {
        WindowInsets g = uVar.mo4562g();
        if (g != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(g);
            if (!onApplyWindowInsets.equals(g)) {
                return C1076u.m3059i(onApplyWindowInsets, view);
            }
        }
        return uVar;
    }

    /* renamed from: k */
    public static C1047c m3030k(View view, C1047c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            cVar.toString();
            view.getClass();
            view.getId();
        }
        C1058l lVar = (C1058l) view.getTag(R.id.tag_on_receive_content_listener);
        if (lVar != null) {
            C1047c a = lVar.mo4536a(view, cVar);
            if (a == null) {
                return null;
            }
            return (view instanceof C1059m ? (C1059m) view : f3812e).mo986a(a);
        }
        return (view instanceof C1059m ? (C1059m) view : f3812e).mo986a(cVar);
    }

    /* renamed from: l */
    public static void m3031l(int i, View view) {
        List<C1150b.C1151a> h = m3027h(view);
        for (int i2 = 0; i2 < h.size(); i2++) {
            if (h.get(i2).mo4772a() == i) {
                h.remove(i2);
                return;
            }
        }
    }

    /* renamed from: m */
    public static void m3032m(View view, C1150b.C1151a aVar, CharSequence charSequence, C1158d dVar) {
        m3020a(view, new C1150b.C1151a((Object) null, aVar.f4017b, (CharSequence) null, dVar, aVar.f4018c));
    }

    /* renamed from: n */
    public static void m3033n(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1066d.m3040a(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: o */
    public static void m3034o(View view, C1043a aVar) {
        if (aVar == null && (m3025f(view) instanceof C1043a.C1044a)) {
            aVar = new C1043a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.f3780b);
    }
}
