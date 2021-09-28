package p106r0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.C0286k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p034f0.C0885a;
import p058j0.C1060n;
import p058j0.C1061o;
import p058j0.C1070q;
import p093p.C1558h;

@SuppressLint({"UnknownNullness"})
/* renamed from: r0.s */
public abstract class C1665s {

    /* renamed from: r0.s$a */
    public class C1666a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ int f5094e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f5095f;

        /* renamed from: g */
        public final /* synthetic */ ArrayList f5096g;

        /* renamed from: h */
        public final /* synthetic */ ArrayList f5097h;

        /* renamed from: i */
        public final /* synthetic */ ArrayList f5098i;

        public C1666a(C1665s sVar, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f5094e = i;
            this.f5095f = arrayList;
            this.f5096g = arrayList2;
            this.f5097h = arrayList3;
            this.f5098i = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f5094e; i++) {
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                ((View) this.f5095f.get(i)).setTransitionName((String) this.f5096g.get(i));
                ((View) this.f5097h.get(i)).setTransitionName((String) this.f5098i.get(i));
            }
        }
    }

    /* renamed from: d */
    public static void m4618d(List<View> list, View view) {
        int size = list.size();
        if (!m4619h(list, view, size)) {
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            if (view.getTransitionName() != null) {
                list.add(view);
            }
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m4619h(list, childAt, size) && childAt.getTransitionName() != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public static boolean m4619h(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m4620k(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    public abstract void mo2744a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo2745b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo2746c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo2747e(Object obj);

    /* renamed from: f */
    public void mo5852f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z = view instanceof ViewGroup;
            ViewGroup viewGroup = view;
            if (z) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                boolean isTransitionGroup = viewGroup2.isTransitionGroup();
                viewGroup = viewGroup2;
                if (!isTransitionGroup) {
                    int childCount = viewGroup2.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        mo5852f(arrayList, viewGroup2.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(viewGroup);
        }
    }

    /* renamed from: g */
    public abstract Object mo2748g(Object obj);

    /* renamed from: i */
    public void mo5853i(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            String transitionName = view.getTransitionName();
            if (transitionName != null) {
                map.put(transitionName, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo5853i(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: j */
    public void mo5854j(View view, Rect rect) {
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: l */
    public abstract Object mo2749l(Object obj, Object obj2, Object obj3);

    /* renamed from: m */
    public abstract Object mo2750m(Object obj, Object obj2, Object obj3);

    /* renamed from: n */
    public ArrayList<String> mo5855n(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            arrayList2.add(view.getTransitionName());
            view.setTransitionName((String) null);
        }
        return arrayList2;
    }

    /* renamed from: o */
    public abstract void mo2751o(Object obj, View view);

    /* renamed from: p */
    public abstract void mo2752p(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: q */
    public abstract void mo2753q(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: r */
    public abstract void mo2754r(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: s */
    public abstract void mo2755s(Object obj, Rect rect);

    /* renamed from: t */
    public abstract void mo2756t(Object obj, View view);

    /* renamed from: u */
    public void mo2757u(C0286k kVar, Object obj, C0885a aVar, Runnable runnable) {
        runnable.run();
    }

    /* renamed from: v */
    public void mo5856v(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            String transitionName = view2.getTransitionName();
            arrayList4.add(transitionName);
            if (transitionName != null) {
                view2.setTransitionName((String) null);
                String str = (String) ((C1558h) map).getOrDefault(transitionName, null);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        arrayList2.get(i2).setTransitionName(transitionName);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        C1060n.m3018a(view, new C1666a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: w */
    public abstract void mo2758w(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: x */
    public abstract void mo2759x(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: y */
    public abstract Object mo2760y(Object obj);
}
