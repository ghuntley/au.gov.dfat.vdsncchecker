package p051i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C0201r0;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* renamed from: i.a */
public final class C1021a {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f3740a = new ThreadLocal<>();

    /* renamed from: b */
    public static final WeakHashMap<Context, SparseArray<Object>> f3741b = new WeakHashMap<>(0);

    /* renamed from: c */
    public static final Object f3742c = new Object();

    /* renamed from: a */
    public static Drawable m2945a(Context context, int i) {
        return C0201r0.m544c().mo1112e(context, i);
    }
}
