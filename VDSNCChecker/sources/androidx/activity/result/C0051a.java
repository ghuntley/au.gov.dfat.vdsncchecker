package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.C0342c;
import androidx.lifecycle.C0346d;
import com.dynamsoft.dbr.EnumBarcodeFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import p027e.C0852a;
import p027e.C0854b;
import p027e.C0855c;
import p027e.C0856d;
import p033f.C0881a;
import p150z.C2147b;

/* renamed from: androidx.activity.result.a */
public abstract class C0051a {

    /* renamed from: a */
    public Random f178a = new Random();

    /* renamed from: b */
    public final Map<Integer, String> f179b = new HashMap();

    /* renamed from: c */
    public final Map<String, Integer> f180c = new HashMap();

    /* renamed from: d */
    public final Map<String, C0054c> f181d = new HashMap();

    /* renamed from: e */
    public ArrayList<String> f182e = new ArrayList<>();

    /* renamed from: f */
    public final transient Map<String, C0053b<?>> f183f = new HashMap();

    /* renamed from: g */
    public final Map<String, Object> f184g = new HashMap();

    /* renamed from: h */
    public final Bundle f185h = new Bundle();

    /* renamed from: androidx.activity.result.a$a */
    public class C0052a extends C0855c<I> {

        /* renamed from: a */
        public final /* synthetic */ String f186a;

        /* renamed from: b */
        public final /* synthetic */ int f187b;

        /* renamed from: c */
        public final /* synthetic */ C0881a f188c;

        public C0052a(String str, int i, C0881a aVar) {
            this.f186a = str;
            this.f187b = i;
            this.f188c = aVar;
        }

        /* renamed from: a */
        public void mo146a(I i, C2147b bVar) {
            C0051a.this.f182e.add(this.f186a);
            Integer num = C0051a.this.f180c.get(this.f186a);
            C0051a.this.mo136b(num != null ? num.intValue() : this.f187b, this.f188c, i, (C2147b) null);
        }

        /* renamed from: b */
        public void mo147b() {
            C0051a.this.mo145e(this.f186a);
        }
    }

    /* renamed from: androidx.activity.result.a$b */
    public static class C0053b<O> {

        /* renamed from: a */
        public final C0854b<O> f190a;

        /* renamed from: b */
        public final C0881a<?, O> f191b;

        public C0053b(C0854b<O> bVar, C0881a<?, O> aVar) {
            this.f190a = bVar;
            this.f191b = aVar;
        }
    }

    /* renamed from: androidx.activity.result.a$c */
    public static class C0054c {

        /* renamed from: a */
        public final C0342c f192a;

        /* renamed from: b */
        public final ArrayList<C0346d> f193b = new ArrayList<>();

        public C0054c(C0342c cVar) {
            this.f192a = cVar;
        }
    }

    /* renamed from: a */
    public final boolean mo142a(int i, int i2, Intent intent) {
        C0854b<O> bVar;
        String str = this.f179b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.f182e.remove(str);
        C0053b bVar2 = this.f183f.get(str);
        if (bVar2 == null || (bVar = bVar2.f190a) == null) {
            this.f184g.remove(str);
            this.f185h.putParcelable(str, new C0852a(i2, intent));
            return true;
        }
        bVar.mo1735a(bVar2.f191b.mo1742c(i2, intent));
        return true;
    }

    /* renamed from: b */
    public abstract <I, O> void mo136b(int i, C0881a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i2, C2147b bVar);

    /* renamed from: c */
    public final <I, O> C0855c<I> mo143c(String str, C0881a<I, O> aVar, C0854b<O> bVar) {
        int d = mo144d(str);
        this.f183f.put(str, new C0053b(bVar, aVar));
        if (this.f184g.containsKey(str)) {
            Object obj = this.f184g.get(str);
            this.f184g.remove(str);
            bVar.mo1735a(obj);
        }
        C0852a aVar2 = (C0852a) this.f185h.getParcelable(str);
        if (aVar2 != null) {
            this.f185h.remove(str);
            bVar.mo1735a(aVar.mo1742c(aVar2.f3303e, aVar2.f3304f));
        }
        return new C0052a(str, d, aVar);
    }

    /* renamed from: d */
    public final int mo144d(String str) {
        Integer num = this.f180c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int nextInt = this.f178a.nextInt(2147418112);
        while (true) {
            int i = nextInt + EnumBarcodeFormat.BF_GS1_DATABAR_EXPANDED_STACKED;
            if (this.f179b.containsKey(Integer.valueOf(i))) {
                nextInt = this.f178a.nextInt(2147418112);
            } else {
                this.f179b.put(Integer.valueOf(i), str);
                this.f180c.put(str, Integer.valueOf(i));
                return i;
            }
        }
    }

    /* renamed from: e */
    public final void mo145e(String str) {
        Integer remove;
        if (!this.f182e.contains(str) && (remove = this.f180c.remove(str)) != null) {
            this.f179b.remove(remove);
        }
        this.f183f.remove(str);
        if (this.f184g.containsKey(str)) {
            C0856d.m2530a("Dropping pending result for request ", str, ": ").append(this.f184g.get(str));
            this.f184g.remove(str);
        }
        if (this.f185h.containsKey(str)) {
            C0856d.m2530a("Dropping pending result for request ", str, ": ").append(this.f185h.getParcelable(str));
            this.f185h.remove(str);
        }
        C0054c cVar = this.f181d.get(str);
        if (cVar != null) {
            Iterator<C0346d> it = cVar.f193b.iterator();
            while (it.hasNext()) {
                cVar.f192a.mo1803b(it.next());
            }
            cVar.f193b.clear();
            this.f181d.remove(str);
        }
    }
}
