package p029e1;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p093p.C1545a;

/* renamed from: e1.a */
public abstract class C0864a {

    /* renamed from: a */
    public final C1545a<String, Method> f3313a;

    /* renamed from: b */
    public final C1545a<String, Method> f3314b;

    /* renamed from: c */
    public final C1545a<String, Class> f3315c;

    public C0864a(C1545a<String, Method> aVar, C1545a<String, Method> aVar2, C1545a<String, Class> aVar3) {
        this.f3313a = aVar;
        this.f3314b = aVar2;
        this.f3315c = aVar3;
    }

    /* renamed from: a */
    public abstract void mo4141a();

    /* renamed from: b */
    public abstract C0864a mo4142b();

    /* renamed from: c */
    public final Class mo4143c(Class<? extends C0866c> cls) {
        Class orDefault = this.f3315c.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f3315c.put(cls.getName(), cls2);
        return cls2;
    }

    /* renamed from: d */
    public final Method mo4144d(String str) {
        Class<C0864a> cls = C0864a.class;
        Method orDefault = this.f3313a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f3313a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    public final Method mo4145e(Class cls) {
        Method orDefault = this.f3314b.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class c = mo4143c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c.getDeclaredMethod("write", new Class[]{cls, C0864a.class});
        this.f3314b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: f */
    public abstract boolean mo4146f();

    /* renamed from: g */
    public abstract byte[] mo4147g();

    /* renamed from: h */
    public abstract CharSequence mo4148h();

    /* renamed from: i */
    public abstract boolean mo4149i(int i);

    /* renamed from: j */
    public abstract int mo4150j();

    /* renamed from: k */
    public int mo4151k(int i, int i2) {
        return !mo4149i(i2) ? i : mo4150j();
    }

    /* renamed from: l */
    public abstract <T extends Parcelable> T mo4152l();

    /* renamed from: m */
    public <T extends Parcelable> T mo4153m(T t, int i) {
        return !mo4149i(i) ? t : mo4152l();
    }

    /* renamed from: n */
    public abstract String mo4154n();

    /* renamed from: o */
    public <T extends C0866c> T mo4155o() {
        String n = mo4154n();
        if (n == null) {
            return null;
        }
        C0864a b = mo4142b();
        try {
            return (C0866c) mo4144d(n).invoke((Object) null, new Object[]{b});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: p */
    public abstract void mo4156p(int i);

    /* renamed from: q */
    public abstract void mo4157q(boolean z);

    /* renamed from: r */
    public abstract void mo4158r(byte[] bArr);

    /* renamed from: s */
    public abstract void mo4159s(CharSequence charSequence);

    /* renamed from: t */
    public abstract void mo4160t(int i);

    /* renamed from: u */
    public abstract void mo4161u(Parcelable parcelable);

    /* renamed from: v */
    public abstract void mo4162v(String str);

    /* renamed from: w */
    public void mo4163w(C0866c cVar) {
        if (cVar == null) {
            mo4162v((String) null);
            return;
        }
        try {
            mo4162v(mo4143c(cVar.getClass()).getName());
            C0864a b = mo4142b();
            try {
                mo4145e(cVar.getClass()).invoke((Object) null, new Object[]{cVar, b});
                b.mo4141a();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e2.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e5);
        }
    }
}
