package p063k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* renamed from: k.c */
public class C1138c extends ContextWrapper {

    /* renamed from: a */
    public int f3934a;

    /* renamed from: b */
    public Resources.Theme f3935b;

    /* renamed from: c */
    public LayoutInflater f3936c;

    /* renamed from: d */
    public Configuration f3937d;

    /* renamed from: e */
    public Resources f3938e;

    public C1138c() {
        super((Context) null);
    }

    public C1138c(Context context, int i) {
        super(context);
        this.f3934a = i;
    }

    /* renamed from: a */
    public void mo4708a(Configuration configuration) {
        if (this.f3938e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f3937d == null) {
            this.f3937d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public final void mo4710b() {
        if (this.f3935b == null) {
            this.f3935b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f3935b.setTo(theme);
            }
        }
        this.f3935b.applyStyle(this.f3934a, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        if (this.f3938e == null) {
            Configuration configuration = this.f3937d;
            this.f3938e = configuration == null ? super.getResources() : createConfigurationContext(configuration).getResources();
        }
        return this.f3938e;
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f3936c == null) {
            this.f3936c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f3936c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f3935b;
        if (theme != null) {
            return theme;
        }
        if (this.f3934a == 0) {
            this.f3934a = 2131952047;
        }
        mo4710b();
        return this.f3935b;
    }

    public void setTheme(int i) {
        if (this.f3934a != i) {
            this.f3934a = i;
            mo4710b();
        }
    }
}
