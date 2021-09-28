package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p001a0.C0002a;
import p028e0.C0861a;
import p058j0.C1069p;

/* renamed from: androidx.appcompat.view.menu.e */
public class C0074e implements C0861a {

    /* renamed from: y */
    public static final int[] f355y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f356a;

    /* renamed from: b */
    public final Resources f357b;

    /* renamed from: c */
    public boolean f358c;

    /* renamed from: d */
    public boolean f359d;

    /* renamed from: e */
    public C0075a f360e;

    /* renamed from: f */
    public ArrayList<C0078g> f361f;

    /* renamed from: g */
    public ArrayList<C0078g> f362g;

    /* renamed from: h */
    public boolean f363h;

    /* renamed from: i */
    public ArrayList<C0078g> f364i;

    /* renamed from: j */
    public ArrayList<C0078g> f365j;

    /* renamed from: k */
    public boolean f366k;

    /* renamed from: l */
    public int f367l = 0;

    /* renamed from: m */
    public CharSequence f368m;

    /* renamed from: n */
    public Drawable f369n;

    /* renamed from: o */
    public View f370o;

    /* renamed from: p */
    public boolean f371p = false;

    /* renamed from: q */
    public boolean f372q = false;

    /* renamed from: r */
    public boolean f373r = false;

    /* renamed from: s */
    public boolean f374s = false;

    /* renamed from: t */
    public ArrayList<C0078g> f375t = new ArrayList<>();

    /* renamed from: u */
    public CopyOnWriteArrayList<WeakReference<C0082i>> f376u = new CopyOnWriteArrayList<>();

    /* renamed from: v */
    public C0078g f377v;

    /* renamed from: w */
    public boolean f378w = false;

    /* renamed from: x */
    public boolean f379x;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    public interface C0075a {
        /* renamed from: a */
        boolean mo294a(C0074e eVar, MenuItem menuItem);

        /* renamed from: b */
        void mo295b(C0074e eVar);
    }

    /* renamed from: androidx.appcompat.view.menu.e$b */
    public interface C0076b {
        /* renamed from: a */
        boolean mo182a(C0078g gVar);
    }

    public C0074e(Context context) {
        boolean z;
        boolean z2 = false;
        this.f356a = context;
        Resources resources = context.getResources();
        this.f357b = resources;
        this.f361f = new ArrayList<>();
        this.f362g = new ArrayList<>();
        this.f363h = true;
        this.f364i = new ArrayList<>();
        this.f365j = new ArrayList<>();
        this.f366k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = C1069p.f3820a;
            if (Build.VERSION.SDK_INT >= 28) {
                z = viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z) {
                z2 = true;
            }
        }
        this.f359d = z2;
    }

    /* renamed from: a */
    public MenuItem mo243a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = (-65536 & i3) >> 16;
        if (i5 >= 0) {
            int[] iArr = f355y;
            if (i5 < iArr.length) {
                int i6 = (iArr[i5] << 16) | (65535 & i3);
                C0078g gVar = new C0078g(this, i, i2, i3, i6, charSequence, this.f367l);
                ArrayList<C0078g> arrayList = this.f361f;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (arrayList.get(size).f390d <= i6) {
                            i4 = size + 1;
                            break;
                        }
                    } else {
                        i4 = 0;
                        break;
                    }
                }
                arrayList.add(i4, gVar);
                mo274p(true);
                return gVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public MenuItem add(int i) {
        return mo243a(0, 0, 0, this.f357b.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo243a(i, i2, i3, this.f357b.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo243a(i, i2, i3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo243a(0, 0, 0, charSequence);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [android.view.MenuItem[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int addIntentOptions(int r8, int r9, int r10, android.content.ComponentName r11, android.content.Intent[] r12, android.content.Intent r13, int r14, android.view.MenuItem[] r15) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f356a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.util.List r11 = r0.queryIntentActivityOptions(r11, r12, r13, r1)
            if (r11 == 0) goto L_0x0012
            int r2 = r11.size()
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            r14 = r14 & 1
            if (r14 != 0) goto L_0x001a
            r7.removeGroup(r8)
        L_0x001a:
            if (r1 >= r2) goto L_0x005e
            java.lang.Object r14 = r11.get(r1)
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14
            android.content.Intent r3 = new android.content.Intent
            int r4 = r14.specificIndex
            if (r4 >= 0) goto L_0x002a
            r4 = r13
            goto L_0x002c
        L_0x002a:
            r4 = r12[r4]
        L_0x002c:
            r3.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ActivityInfo r5 = r14.activityInfo
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo
            java.lang.String r6 = r6.packageName
            java.lang.String r5 = r5.name
            r4.<init>(r6, r5)
            r3.setComponent(r4)
            java.lang.CharSequence r4 = r14.loadLabel(r0)
            android.view.MenuItem r4 = r7.mo243a(r8, r9, r10, r4)
            android.graphics.drawable.Drawable r5 = r14.loadIcon(r0)
            androidx.appcompat.view.menu.g r4 = (androidx.appcompat.view.menu.C0078g) r4
            r4.setIcon((android.graphics.drawable.Drawable) r5)
            r4.setIntent(r3)
            if (r15 == 0) goto L_0x005b
            int r14 = r14.specificIndex
            if (r14 < 0) goto L_0x005b
            r15[r14] = r4
        L_0x005b:
            int r1 = r1 + 1
            goto L_0x001a
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0074e.addIntentOptions(int, int, int, android.content.ComponentName, android.content.Intent[], android.content.Intent, int, android.view.MenuItem[]):int");
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f357b.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f357b.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0078g gVar = (C0078g) mo243a(i, i2, i3, charSequence);
        C0089l lVar = new C0089l(this.f356a, this, gVar);
        gVar.f401o = lVar;
        lVar.setHeaderTitle(gVar.f391e);
        return lVar;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void mo253b(C0082i iVar, Context context) {
        this.f376u.add(new WeakReference(iVar));
        iVar.mo227d(context, this);
        this.f366k = true;
    }

    /* renamed from: c */
    public final void mo254c(boolean z) {
        if (!this.f374s) {
            this.f374s = true;
            Iterator<WeakReference<C0082i>> it = this.f376u.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0082i iVar = (C0082i) next.get();
                if (iVar == null) {
                    this.f376u.remove(next);
                } else {
                    iVar.mo201a(this, z);
                }
            }
            this.f374s = false;
        }
    }

    public void clear() {
        C0078g gVar = this.f377v;
        if (gVar != null) {
            mo258d(gVar);
        }
        this.f361f.clear();
        mo274p(true);
    }

    public void clearHeader() {
        this.f369n = null;
        this.f368m = null;
        this.f370o = null;
        mo274p(false);
    }

    public void close() {
        mo254c(true);
    }

    /* renamed from: d */
    public boolean mo258d(C0078g gVar) {
        boolean z = false;
        if (!this.f376u.isEmpty() && this.f377v == gVar) {
            mo293y();
            Iterator<WeakReference<C0082i>> it = this.f376u.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0082i iVar = (C0082i) next.get();
                if (iVar == null) {
                    this.f376u.remove(next);
                } else {
                    z = iVar.mo198e(this, gVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo292x();
            if (z) {
                this.f377v = null;
            }
        }
        return z;
    }

    /* renamed from: e */
    public boolean mo259e(C0074e eVar, MenuItem menuItem) {
        C0075a aVar = this.f360e;
        return aVar != null && aVar.mo294a(eVar, menuItem);
    }

    /* renamed from: f */
    public boolean mo260f(C0078g gVar) {
        boolean z = false;
        if (this.f376u.isEmpty()) {
            return false;
        }
        mo293y();
        Iterator<WeakReference<C0082i>> it = this.f376u.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0082i iVar = (C0082i) next.get();
            if (iVar == null) {
                this.f376u.remove(next);
            } else {
                z = iVar.mo199g(this, gVar);
                if (z) {
                    break;
                }
            }
        }
        mo292x();
        if (z) {
            this.f377v = gVar;
        }
        return z;
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0078g gVar = this.f361f.get(i2);
            if (gVar.f387a == i) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.f401o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public C0078g mo262g(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<C0078g> arrayList = this.f375t;
        arrayList.clear();
        mo264h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean n = mo272n();
        for (int i2 = 0; i2 < size; i2++) {
            C0078g gVar = arrayList.get(i2);
            if (n) {
                c = gVar.f396j;
            } else {
                c = gVar.f394h;
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (n && c == 8 && i == 67))) {
                return gVar;
            }
        }
        return null;
    }

    public MenuItem getItem(int i) {
        return this.f361f.get(i);
    }

    /* renamed from: h */
    public void mo264h(List<C0078g> list, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean n = mo272n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f361f.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0078g gVar = this.f361f.get(i3);
                if (gVar.hasSubMenu()) {
                    gVar.f401o.mo264h(list, i, keyEvent);
                }
                if (n) {
                    c = gVar.f396j;
                } else {
                    c = gVar.f394h;
                }
                if (n) {
                    i2 = gVar.f397k;
                } else {
                    i2 = gVar.f395i;
                }
                if (((modifiers & 69647) == (i2 & 69647)) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (n && c == 8 && i == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public boolean hasVisibleItems() {
        if (this.f379x) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f361f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public void mo266i() {
        ArrayList<C0078g> l = mo270l();
        if (this.f366k) {
            Iterator<WeakReference<C0082i>> it = this.f376u.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0082i iVar = (C0082i) next.get();
                if (iVar == null) {
                    this.f376u.remove(next);
                } else {
                    z |= iVar.mo203c();
                }
            }
            if (z) {
                this.f364i.clear();
                this.f365j.clear();
                int size = l.size();
                for (int i = 0; i < size; i++) {
                    C0078g gVar = l.get(i);
                    (gVar.mo308g() ? this.f364i : this.f365j).add(gVar);
                }
            } else {
                this.f364i.clear();
                this.f365j.clear();
                this.f365j.addAll(mo270l());
            }
            this.f366k = false;
        }
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo262g(i, keyEvent) != null;
    }

    /* renamed from: j */
    public String mo268j() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: k */
    public C0074e mo269k() {
        return this;
    }

    /* renamed from: l */
    public ArrayList<C0078g> mo270l() {
        if (!this.f363h) {
            return this.f362g;
        }
        this.f362g.clear();
        int size = this.f361f.size();
        for (int i = 0; i < size; i++) {
            C0078g gVar = this.f361f.get(i);
            if (gVar.isVisible()) {
                this.f362g.add(gVar);
            }
        }
        this.f363h = false;
        this.f366k = true;
        return this.f362g;
    }

    /* renamed from: m */
    public boolean mo271m() {
        return this.f378w;
    }

    /* renamed from: n */
    public boolean mo272n() {
        return this.f358c;
    }

    /* renamed from: o */
    public boolean mo273o() {
        return this.f359d;
    }

    /* renamed from: p */
    public void mo274p(boolean z) {
        if (!this.f371p) {
            if (z) {
                this.f363h = true;
                this.f366k = true;
            }
            if (!this.f376u.isEmpty()) {
                mo293y();
                Iterator<WeakReference<C0082i>> it = this.f376u.iterator();
                while (it.hasNext()) {
                    WeakReference next = it.next();
                    C0082i iVar = (C0082i) next.get();
                    if (iVar == null) {
                        this.f376u.remove(next);
                    } else {
                        iVar.mo207j(z);
                    }
                }
                mo292x();
                return;
            }
            return;
        }
        this.f372q = true;
        if (z) {
            this.f373r = true;
        }
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo277q(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0078g g = mo262g(i, keyEvent);
        boolean r = g != null ? mo278r(g, (C0082i) null, i2) : false;
        if ((i2 & 2) != 0) {
            mo254c(true);
        }
        return r;
    }

    /* renamed from: q */
    public boolean mo277q(MenuItem menuItem, int i) {
        return mo278r(menuItem, (C0082i) null, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0053, code lost:
        if (r1 != false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0062, code lost:
        if ((r9 & 1) == 0) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00be, code lost:
        if (r1 == false) goto L_0x00c0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0057  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo278r(android.view.MenuItem r7, androidx.appcompat.view.menu.C0082i r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.g r7 = (androidx.appcompat.view.menu.C0078g) r7
            r0 = 0
            if (r7 == 0) goto L_0x00c4
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000d
            goto L_0x00c4
        L_0x000d:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f402p
            r2 = 1
            if (r1 == 0) goto L_0x0019
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L_0x0019
            goto L_0x0038
        L_0x0019:
            androidx.appcompat.view.menu.e r1 = r7.f400n
            boolean r1 = r1.mo259e(r1, r7)
            if (r1 == 0) goto L_0x0022
            goto L_0x0038
        L_0x0022:
            android.content.Intent r1 = r7.f393g
            if (r1 == 0) goto L_0x002e
            androidx.appcompat.view.menu.e r3 = r7.f400n     // Catch:{ ActivityNotFoundException -> 0x002e }
            android.content.Context r3 = r3.f356a     // Catch:{ ActivityNotFoundException -> 0x002e }
            r3.startActivity(r1)     // Catch:{ ActivityNotFoundException -> 0x002e }
            goto L_0x0038
        L_0x002e:
            j0.b r1 = r7.f383A
            if (r1 == 0) goto L_0x003a
            boolean r1 = r1.mo4517e()
            if (r1 == 0) goto L_0x003a
        L_0x0038:
            r1 = r2
            goto L_0x003b
        L_0x003a:
            r1 = r0
        L_0x003b:
            j0.b r3 = r7.f383A
            if (r3 == 0) goto L_0x0047
            boolean r4 = r3.mo4513a()
            if (r4 == 0) goto L_0x0047
            r4 = r2
            goto L_0x0048
        L_0x0047:
            r4 = r0
        L_0x0048:
            boolean r5 = r7.mo307f()
            if (r5 == 0) goto L_0x0057
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x00c3
            goto L_0x00c0
        L_0x0057:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x0065
            if (r4 == 0) goto L_0x0060
            goto L_0x0065
        L_0x0060:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x00c3
            goto L_0x00c0
        L_0x0065:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x006c
            r6.mo254c(r0)
        L_0x006c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0080
            androidx.appcompat.view.menu.l r9 = new androidx.appcompat.view.menu.l
            android.content.Context r5 = r6.f356a
            r9.<init>(r5, r6, r7)
            r7.f401o = r9
            java.lang.CharSequence r5 = r7.f391e
            r9.setHeaderTitle((java.lang.CharSequence) r5)
        L_0x0080:
            androidx.appcompat.view.menu.l r7 = r7.f401o
            if (r4 == 0) goto L_0x0087
            r3.mo4518f(r7)
        L_0x0087:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r9 = r6.f376u
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0090
            goto L_0x00bd
        L_0x0090:
            if (r8 == 0) goto L_0x0096
            boolean r0 = r8.mo206i(r7)
        L_0x0096:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r8 = r6.f376u
            java.util.Iterator r8 = r8.iterator()
        L_0x009c:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00bd
            java.lang.Object r9 = r8.next()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r3 = r9.get()
            androidx.appcompat.view.menu.i r3 = (androidx.appcompat.view.menu.C0082i) r3
            if (r3 != 0) goto L_0x00b6
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r3 = r6.f376u
            r3.remove(r9)
            goto L_0x009c
        L_0x00b6:
            if (r0 != 0) goto L_0x009c
            boolean r0 = r3.mo206i(r7)
            goto L_0x009c
        L_0x00bd:
            r1 = r1 | r0
            if (r1 != 0) goto L_0x00c3
        L_0x00c0:
            r6.mo254c(r2)
        L_0x00c3:
            return r1
        L_0x00c4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0074e.mo278r(android.view.MenuItem, androidx.appcompat.view.menu.i, int):boolean");
    }

    public void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f361f.get(i2).f388b == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.f361f.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || this.f361f.get(i2).f388b != i) {
                    mo274p(true);
                } else {
                    mo281s(i2, false);
                    i3 = i4;
                }
            }
            mo274p(true);
        }
    }

    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f361f.get(i2).f387a == i) {
                break;
            } else {
                i2++;
            }
        }
        mo281s(i2, true);
    }

    /* renamed from: s */
    public final void mo281s(int i, boolean z) {
        if (i >= 0 && i < this.f361f.size()) {
            this.f361f.remove(i);
            if (z) {
                mo274p(true);
            }
        }
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f361f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0078g gVar = this.f361f.get(i2);
            if (gVar.f388b == i) {
                gVar.f410x = (gVar.f410x & -5) | (z2 ? 4 : 0);
                gVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f378w = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f361f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0078g gVar = this.f361f.get(i2);
            if (gVar.f388b == i) {
                gVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f361f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0078g gVar = this.f361f.get(i2);
            if (gVar.f388b == i && gVar.mo338l(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo274p(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f358c = z;
        mo274p(false);
    }

    public int size() {
        return this.f361f.size();
    }

    /* renamed from: t */
    public void mo288t(C0082i iVar) {
        Iterator<WeakReference<C0082i>> it = this.f376u.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0082i iVar2 = (C0082i) next.get();
            if (iVar2 == null || iVar2 == iVar) {
                this.f376u.remove(next);
            }
        }
    }

    /* renamed from: u */
    public void mo289u(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo268j());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0089l) item.getSubMenu()).mo289u(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* renamed from: v */
    public void mo290v(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0089l) item.getSubMenu()).mo290v(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo268j(), sparseArray);
        }
    }

    /* renamed from: w */
    public final void mo291w(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f357b;
        if (view != null) {
            this.f370o = view;
            this.f368m = null;
            this.f369n = null;
        } else {
            if (i > 0) {
                this.f368m = resources.getText(i);
            } else if (charSequence != null) {
                this.f368m = charSequence;
            }
            if (i2 > 0) {
                Context context = this.f356a;
                Object obj = C0002a.f0a;
                this.f369n = C0002a.C0004b.m5b(context, i2);
            } else if (drawable != null) {
                this.f369n = drawable;
            }
            this.f370o = null;
        }
        mo274p(false);
    }

    /* renamed from: x */
    public void mo292x() {
        this.f371p = false;
        if (this.f372q) {
            this.f372q = false;
            mo274p(this.f373r);
        }
    }

    /* renamed from: y */
    public void mo293y() {
        if (!this.f371p) {
            this.f371p = true;
            this.f372q = false;
            this.f373r = false;
        }
    }
}
