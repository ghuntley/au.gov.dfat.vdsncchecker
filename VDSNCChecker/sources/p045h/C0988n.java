package p045h;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.C0148d0;
import androidx.appcompat.widget.C0151e;
import androidx.appcompat.widget.C0162g;
import androidx.appcompat.widget.C0165h;
import androidx.appcompat.widget.C0205s;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000a.C0001b;
import p007au.gov.dfat.vdsncchecker.R;
import p093p.C1558h;

/* renamed from: h.n */
public class C0988n {

    /* renamed from: b */
    public static final Class<?>[] f3635b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    public static final int[] f3636c = {16843375};

    /* renamed from: d */
    public static final String[] f3637d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e */
    public static final C1558h<String, Constructor<? extends View>> f3638e = new C1558h<>();

    /* renamed from: a */
    public final Object[] f3639a = new Object[2];

    /* renamed from: h.n$a */
    public static class C0989a implements View.OnClickListener {

        /* renamed from: e */
        public final View f3640e;

        /* renamed from: f */
        public final String f3641f;

        /* renamed from: g */
        public Method f3642g;

        /* renamed from: h */
        public Context f3643h;

        public C0989a(View view, String str) {
            this.f3640e = view;
            this.f3641f = str;
        }

        public void onClick(View view) {
            String str;
            Method method;
            if (this.f3642g == null) {
                for (Context context = this.f3640e.getContext(); context != null; context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.f3641f, new Class[]{View.class})) != null) {
                            this.f3642g = method;
                            this.f3643h = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
                int id = this.f3640e.getId();
                if (id == -1) {
                    str = "";
                } else {
                    StringBuilder a = C0001b.m0a(" with id '");
                    a.append(this.f3640e.getContext().getResources().getResourceEntryName(id));
                    a.append("'");
                    str = a.toString();
                }
                StringBuilder a2 = C0001b.m0a("Could not find method ");
                a2.append(this.f3641f);
                a2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                a2.append(this.f3640e.getClass());
                a2.append(str);
                throw new IllegalStateException(a2.toString());
            }
            try {
                this.f3642g.invoke(this.f3643h, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: a */
    public C0151e mo3983a(Context context, AttributeSet attributeSet) {
        return new C0151e(context, attributeSet);
    }

    /* renamed from: b */
    public C0162g mo3984b(Context context, AttributeSet attributeSet) {
        return new C0162g(context, attributeSet);
    }

    /* renamed from: c */
    public C0165h mo3985c(Context context, AttributeSet attributeSet) {
        return new C0165h(context, attributeSet);
    }

    /* renamed from: d */
    public C0205s mo3986d(Context context, AttributeSet attributeSet) {
        return new C0205s(context, attributeSet, R.attr.radioButtonStyle);
    }

    /* renamed from: e */
    public C0148d0 mo3987e(Context context, AttributeSet attributeSet) {
        return new C0148d0(context, attributeSet);
    }

    /* renamed from: f */
    public final View mo4385f(Context context, String str, String str2) {
        String str3;
        C1558h<String, Constructor<? extends View>> hVar = f3638e;
        Constructor<? extends U> orDefault = hVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f3635b);
            hVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return (View) orDefault.newInstance(this.f3639a);
    }

    /* renamed from: g */
    public final void mo4386g(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }
}
