package p063k;

import android.view.ActionMode;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: k.i */
public class C1148i implements Window.Callback {

    /* renamed from: e */
    public final Window.Callback f4000e;

    public C1148i(Window.Callback callback) {
        if (callback != null) {
            this.f4000e = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f4000e.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f4000e.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f4000e.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f4000e.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f4000e.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f4000e.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f4000e.onAttachedToWindow();
    }

    public View onCreatePanelView(int i) {
        return this.f4000e.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.f4000e.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f4000e.onMenuItemSelected(i, menuItem);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.f4000e.onPointerCaptureChanged(z);
    }

    public boolean onSearchRequested() {
        return this.f4000e.onSearchRequested();
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f4000e.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f4000e.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f4000e.onWindowFocusChanged(z);
    }
}
