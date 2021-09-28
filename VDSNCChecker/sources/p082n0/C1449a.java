package p082n0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.widget.C0131a0;
import p082n0.C1452b;

/* renamed from: n0.a */
public abstract class C1449a extends BaseAdapter implements Filterable, C1452b.C1453a {

    /* renamed from: e */
    public boolean f4545e;

    /* renamed from: f */
    public boolean f4546f;

    /* renamed from: g */
    public Cursor f4547g;

    /* renamed from: h */
    public Context f4548h;

    /* renamed from: i */
    public int f4549i;

    /* renamed from: j */
    public C1450a f4550j;

    /* renamed from: k */
    public DataSetObserver f4551k;

    /* renamed from: l */
    public C1452b f4552l;

    /* renamed from: n0.a$a */
    public class C1450a extends ContentObserver {
        public C1450a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            Cursor cursor;
            C1449a aVar = C1449a.this;
            if (aVar.f4546f && (cursor = aVar.f4547g) != null && !cursor.isClosed()) {
                aVar.f4545e = aVar.f4547g.requery();
            }
        }
    }

    /* renamed from: n0.a$b */
    public class C1451b extends DataSetObserver {
        public C1451b() {
        }

        public void onChanged() {
            C1449a aVar = C1449a.this;
            aVar.f4545e = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C1449a aVar = C1449a.this;
            aVar.f4545e = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public C1449a(Context context, Cursor cursor, boolean z) {
        C1451b bVar;
        boolean z2 = true;
        boolean z3 = z ? true : true;
        if (z3 && true) {
            z3 |= true;
            this.f4546f = true;
        } else {
            this.f4546f = false;
        }
        z2 = cursor == null ? false : z2;
        this.f4547g = cursor;
        this.f4545e = z2;
        this.f4548h = context;
        this.f4549i = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if (z3 & true) {
            this.f4550j = new C1450a();
            bVar = new C1451b();
        } else {
            bVar = null;
            this.f4550j = null;
        }
        this.f4551k = bVar;
        if (z2) {
            C1450a aVar = this.f4550j;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f4551k;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo1152a(View view, Context context, Cursor cursor);

    /* renamed from: b */
    public void mo1153b(Cursor cursor) {
        Cursor cursor2 = this.f4547g;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C1450a aVar = this.f4550j;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                DataSetObserver dataSetObserver = this.f4551k;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f4547g = cursor;
            if (cursor != null) {
                C1450a aVar2 = this.f4550j;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                DataSetObserver dataSetObserver2 = this.f4551k;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f4549i = cursor.getColumnIndexOrThrow("_id");
                this.f4545e = true;
                notifyDataSetChanged();
            } else {
                this.f4549i = -1;
                this.f4545e = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* renamed from: c */
    public abstract CharSequence mo1154c(Cursor cursor);

    /* renamed from: d */
    public abstract View mo1155d(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.f4545e || (cursor = this.f4547g) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f4545e) {
            return null;
        }
        this.f4547g.moveToPosition(i);
        if (view == null) {
            C1454c cVar = (C1454c) this;
            view = cVar.f4558o.inflate(cVar.f4557n, viewGroup, false);
        }
        mo1152a(view, this.f4548h, this.f4547g);
        return view;
    }

    public Filter getFilter() {
        if (this.f4552l == null) {
            this.f4552l = new C1452b(this);
        }
        return this.f4552l;
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f4545e || (cursor = this.f4547g) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f4547g;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f4545e || (cursor = this.f4547g) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f4547g.getLong(this.f4549i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f4545e) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f4547g.moveToPosition(i)) {
            if (view == null) {
                view = mo1155d(this.f4548h, this.f4547g, viewGroup);
            }
            mo1152a(view, this.f4548h, this.f4547g);
            return view;
        } else {
            throw new IllegalStateException(C0131a0.m344a("couldn't move cursor to position ", i));
        }
    }
}
