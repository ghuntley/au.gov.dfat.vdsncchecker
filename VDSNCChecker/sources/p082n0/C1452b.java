package p082n0;

import android.database.Cursor;
import android.widget.Filter;
import androidx.appcompat.widget.C0213v0;

/* renamed from: n0.b */
public class C1452b extends Filter {

    /* renamed from: a */
    public C1453a f4555a;

    /* renamed from: n0.b$a */
    public interface C1453a {
    }

    public C1452b(C1453a aVar) {
        this.f4555a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return ((C0213v0) this.f4555a).mo1154c((Cursor) obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r5) {
        /*
            r4 = this;
            n0.b$a r0 = r4.f4555a
            androidx.appcompat.widget.v0 r0 = (androidx.appcompat.widget.C0213v0) r0
            java.util.Objects.requireNonNull(r0)
            if (r5 != 0) goto L_0x000c
            java.lang.String r5 = ""
            goto L_0x0010
        L_0x000c:
            java.lang.String r5 = r5.toString()
        L_0x0010:
            androidx.appcompat.widget.SearchView r1 = r0.f944p
            int r1 = r1.getVisibility()
            r2 = 0
            if (r1 != 0) goto L_0x0030
            androidx.appcompat.widget.SearchView r1 = r0.f944p
            int r1 = r1.getWindowVisibility()
            if (r1 == 0) goto L_0x0022
            goto L_0x0030
        L_0x0022:
            android.app.SearchableInfo r1 = r0.f945q     // Catch:{ RuntimeException -> 0x0030 }
            r3 = 50
            android.database.Cursor r5 = r0.mo1158g(r1, r5, r3)     // Catch:{ RuntimeException -> 0x0030 }
            if (r5 == 0) goto L_0x0030
            r5.getCount()     // Catch:{ RuntimeException -> 0x0030 }
            goto L_0x0031
        L_0x0030:
            r5 = r2
        L_0x0031:
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r5 == 0) goto L_0x0041
            int r1 = r5.getCount()
            r0.count = r1
            r0.values = r5
            goto L_0x0046
        L_0x0041:
            r5 = 0
            r0.count = r5
            r0.values = r2
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p082n0.C1452b.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        C1453a aVar = this.f4555a;
        Cursor cursor = ((C1449a) aVar).f4547g;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((C0213v0) aVar).mo1153b((Cursor) obj);
        }
    }
}
