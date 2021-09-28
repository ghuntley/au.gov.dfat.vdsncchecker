package p069l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p028e0.C0861a;
import p028e0.C0862b;
import p028e0.C0863c;
import p093p.C1558h;

/* renamed from: l.e */
public class C1223e extends C1215b implements Menu {

    /* renamed from: d */
    public final C0861a f4149d;

    public C1223e(Context context, C0861a aVar) {
        super(context);
        if (aVar != null) {
            this.f4149d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(int i) {
        return mo4848c(this.f4149d.add(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo4848c(this.f4149d.add(i, i2, i3, i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo4848c(this.f4149d.add(i, i2, i3, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return mo4848c(this.f4149d.add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f4149d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = mo4848c(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i) {
        return mo4849d(this.f4149d.addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo4849d(this.f4149d.addSubMenu(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo4849d(this.f4149d.addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo4849d(this.f4149d.addSubMenu(charSequence));
    }

    public void clear() {
        C1558h<C0862b, MenuItem> hVar = this.f4136b;
        if (hVar != null) {
            hVar.clear();
        }
        C1558h<C0863c, SubMenu> hVar2 = this.f4137c;
        if (hVar2 != null) {
            hVar2.clear();
        }
        this.f4149d.clear();
    }

    public void close() {
        this.f4149d.close();
    }

    public MenuItem findItem(int i) {
        return mo4848c(this.f4149d.findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo4848c(this.f4149d.getItem(i));
    }

    public boolean hasVisibleItems() {
        return this.f4149d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f4149d.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.f4149d.performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f4149d.performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        if (this.f4136b != null) {
            int i2 = 0;
            while (true) {
                C1558h<C0862b, MenuItem> hVar = this.f4136b;
                if (i2 >= hVar.f4840g) {
                    break;
                }
                if (hVar.mo5614i(i2).getGroupId() == i) {
                    this.f4136b.mo5616j(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f4149d.removeGroup(i);
    }

    public void removeItem(int i) {
        if (this.f4136b != null) {
            int i2 = 0;
            while (true) {
                C1558h<C0862b, MenuItem> hVar = this.f4136b;
                if (i2 >= hVar.f4840g) {
                    break;
                } else if (hVar.mo5614i(i2).getItemId() == i) {
                    this.f4136b.mo5616j(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.f4149d.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f4149d.setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.f4149d.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        this.f4149d.setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        this.f4149d.setQwertyMode(z);
    }

    public int size() {
        return this.f4149d.size();
    }
}
