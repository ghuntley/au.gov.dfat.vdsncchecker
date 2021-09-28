package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.C0060b;
import androidx.appcompat.view.menu.C0071c;
import androidx.appcompat.view.menu.C0082i;

/* renamed from: androidx.appcompat.view.menu.f */
public class C0077f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C0082i.C0083a {

    /* renamed from: e */
    public C0074e f380e;

    /* renamed from: f */
    public C0060b f381f;

    /* renamed from: g */
    public C0071c f382g;

    public C0077f(C0074e eVar) {
        this.f380e = eVar;
    }

    /* renamed from: a */
    public void mo296a(C0074e eVar, boolean z) {
        C0060b bVar;
        if ((z || eVar == this.f380e) && (bVar = this.f381f) != null) {
            bVar.dismiss();
        }
    }

    /* renamed from: b */
    public boolean mo297b(C0074e eVar) {
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f380e.mo277q(((C0071c.C0072a) this.f382g.mo226b()).getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C0071c cVar = this.f382g;
        C0074e eVar = this.f380e;
        C0082i.C0083a aVar = cVar.f345i;
        if (aVar != null) {
            aVar.mo296a(eVar, true);
        }
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f381f.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f381f.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f380e.mo254c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f380e.performShortcut(i, keyEvent, 0);
    }
}
