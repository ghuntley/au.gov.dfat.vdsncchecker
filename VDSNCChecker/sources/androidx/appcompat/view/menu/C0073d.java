package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.C0084j;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.d */
public class C0073d extends BaseAdapter {

    /* renamed from: e */
    public C0074e f349e;

    /* renamed from: f */
    public int f350f = -1;

    /* renamed from: g */
    public boolean f351g;

    /* renamed from: h */
    public final boolean f352h;

    /* renamed from: i */
    public final LayoutInflater f353i;

    /* renamed from: j */
    public final int f354j;

    public C0073d(C0074e eVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f352h = z;
        this.f353i = layoutInflater;
        this.f349e = eVar;
        this.f354j = i;
        mo236a();
    }

    /* renamed from: a */
    public void mo236a() {
        C0074e eVar = this.f349e;
        C0078g gVar = eVar.f377v;
        if (gVar != null) {
            eVar.mo266i();
            ArrayList<C0078g> arrayList = eVar.f365j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == gVar) {
                    this.f350f = i;
                    return;
                }
            }
        }
        this.f350f = -1;
    }

    /* renamed from: b */
    public C0078g getItem(int i) {
        ArrayList<C0078g> arrayList;
        if (this.f352h) {
            C0074e eVar = this.f349e;
            eVar.mo266i();
            arrayList = eVar.f365j;
        } else {
            arrayList = this.f349e.mo270l();
        }
        int i2 = this.f350f;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayList.get(i);
    }

    public int getCount() {
        ArrayList<C0078g> arrayList;
        if (this.f352h) {
            C0074e eVar = this.f349e;
            eVar.mo266i();
            arrayList = eVar.f365j;
        } else {
            arrayList = this.f349e.mo270l();
        }
        int i = this.f350f;
        int size = arrayList.size();
        return i < 0 ? size : size - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f353i.inflate(this.f354j, viewGroup, false);
        }
        int i2 = getItem(i).f388b;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f349e.mo271m() && i2 != (i3 >= 0 ? getItem(i3).f388b : i2));
        C0084j.C0085a aVar = (C0084j.C0085a) view;
        if (this.f351g) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo163d(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo236a();
        super.notifyDataSetChanged();
    }
}
