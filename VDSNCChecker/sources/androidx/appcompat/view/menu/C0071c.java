package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.C0060b;
import androidx.appcompat.view.menu.C0082i;
import androidx.appcompat.view.menu.C0084j;
import com.dynamsoft.dbr.EnumBarcodeFormat;
import java.util.ArrayList;
import java.util.Objects;
import p007au.gov.dfat.vdsncchecker.R;

/* renamed from: androidx.appcompat.view.menu.c */
public class C0071c implements C0082i, AdapterView.OnItemClickListener {

    /* renamed from: e */
    public Context f341e;

    /* renamed from: f */
    public LayoutInflater f342f;

    /* renamed from: g */
    public C0074e f343g;

    /* renamed from: h */
    public ExpandedMenuView f344h;

    /* renamed from: i */
    public C0082i.C0083a f345i;

    /* renamed from: j */
    public C0072a f346j;

    /* renamed from: androidx.appcompat.view.menu.c$a */
    public class C0072a extends BaseAdapter {

        /* renamed from: e */
        public int f347e = -1;

        public C0072a() {
            mo229a();
        }

        /* renamed from: a */
        public void mo229a() {
            C0074e eVar = C0071c.this.f343g;
            C0078g gVar = eVar.f377v;
            if (gVar != null) {
                eVar.mo266i();
                ArrayList<C0078g> arrayList = eVar.f365j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == gVar) {
                        this.f347e = i;
                        return;
                    }
                }
            }
            this.f347e = -1;
        }

        /* renamed from: b */
        public C0078g getItem(int i) {
            C0074e eVar = C0071c.this.f343g;
            eVar.mo266i();
            ArrayList<C0078g> arrayList = eVar.f365j;
            Objects.requireNonNull(C0071c.this);
            int i2 = i + 0;
            int i3 = this.f347e;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return arrayList.get(i2);
        }

        public int getCount() {
            C0074e eVar = C0071c.this.f343g;
            eVar.mo266i();
            int size = eVar.f365j.size();
            Objects.requireNonNull(C0071c.this);
            int i = size + 0;
            return this.f347e < 0 ? i : i - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = C0071c.this.f342f.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((C0084j.C0085a) view).mo163d(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo229a();
            super.notifyDataSetChanged();
        }
    }

    public C0071c(Context context, int i) {
        this.f341e = context;
        this.f342f = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public void mo201a(C0074e eVar, boolean z) {
        C0082i.C0083a aVar = this.f345i;
        if (aVar != null) {
            aVar.mo296a(eVar, z);
        }
    }

    /* renamed from: b */
    public ListAdapter mo226b() {
        if (this.f346j == null) {
            this.f346j = new C0072a();
        }
        return this.f346j;
    }

    /* renamed from: c */
    public boolean mo203c() {
        return false;
    }

    /* renamed from: d */
    public void mo227d(Context context, C0074e eVar) {
        if (this.f341e != null) {
            this.f341e = context;
            if (this.f342f == null) {
                this.f342f = LayoutInflater.from(context);
            }
        }
        this.f343g = eVar;
        C0072a aVar = this.f346j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: e */
    public boolean mo198e(C0074e eVar, C0078g gVar) {
        return false;
    }

    /* renamed from: g */
    public boolean mo199g(C0074e eVar, C0078g gVar) {
        return false;
    }

    /* renamed from: h */
    public void mo200h(C0082i.C0083a aVar) {
        this.f345i = aVar;
    }

    /* renamed from: i */
    public boolean mo206i(C0089l lVar) {
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        C0077f fVar = new C0077f(lVar);
        C0060b.C0061a aVar = new C0060b.C0061a(lVar.f356a);
        C0071c cVar = new C0071c(aVar.f264a.f241a, R.layout.abc_list_menu_item_layout);
        fVar.f382g = cVar;
        cVar.f345i = fVar;
        C0074e eVar = fVar.f380e;
        eVar.mo253b(cVar, eVar.f356a);
        ListAdapter b = fVar.f382g.mo226b();
        AlertController.C0056b bVar = aVar.f264a;
        bVar.f255o = b;
        bVar.f256p = fVar;
        View view = lVar.f370o;
        if (view != null) {
            bVar.f245e = view;
        } else {
            bVar.f243c = lVar.f369n;
            bVar.f244d = lVar.f368m;
        }
        bVar.f254n = fVar;
        C0060b a = aVar.mo5a();
        fVar.f381f = a;
        a.setOnDismissListener(fVar);
        WindowManager.LayoutParams attributes = fVar.f381f.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= EnumBarcodeFormat.BF_GS1_DATABAR_LIMITED;
        fVar.f381f.show();
        C0082i.C0083a aVar2 = this.f345i;
        if (aVar2 == null) {
            return true;
        }
        aVar2.mo297b(lVar);
        return true;
    }

    /* renamed from: j */
    public void mo207j(boolean z) {
        C0072a aVar = this.f346j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f343g.mo278r(this.f346j.getItem(i), this, 0);
    }
}
