package p082n0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;

/* renamed from: n0.c */
public abstract class C1454c extends C1449a {

    /* renamed from: m */
    public int f4556m;

    /* renamed from: n */
    public int f4557n;

    /* renamed from: o */
    public LayoutInflater f4558o;

    @Deprecated
    public C1454c(Context context, int i, Cursor cursor, boolean z) {
        super(context, (Cursor) null, z);
        this.f4557n = i;
        this.f4556m = i;
        this.f4558o = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
