package p058j0;

import android.view.View;
import android.view.ViewParent;

/* renamed from: j0.g */
public class C1053g {

    /* renamed from: a */
    public ViewParent f3798a;

    /* renamed from: b */
    public ViewParent f3799b;

    /* renamed from: c */
    public final View f3800c;

    /* renamed from: d */
    public boolean f3801d;

    /* renamed from: e */
    public int[] f3802e;

    public C1053g(View view) {
        this.f3800c = view;
    }

    /* renamed from: a */
    public boolean mo4525a(float f, float f2, boolean z) {
        ViewParent g;
        if (!this.f3801d || (g = mo4531g(0)) == null) {
            return false;
        }
        try {
            return g.onNestedFling(this.f3800c, f, f2, z);
        } catch (AbstractMethodError unused) {
            g.toString();
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo4526b(float f, float f2) {
        ViewParent g;
        if (!this.f3801d || (g = mo4531g(0)) == null) {
            return false;
        }
        try {
            return g.onNestedPreFling(this.f3800c, f, f2);
        } catch (AbstractMethodError unused) {
            g.toString();
            return false;
        }
    }

    /* renamed from: c */
    public boolean mo4527c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent g;
        int i4;
        int i5;
        int[] iArr3;
        int i6 = i;
        int i7 = i2;
        int[] iArr4 = iArr2;
        int i8 = i3;
        if (!this.f3801d || (g = mo4531g(i8)) == null) {
            return false;
        }
        if (i6 != 0 || i7 != 0) {
            if (iArr4 != null) {
                this.f3800c.getLocationInWindow(iArr4);
                i5 = iArr4[0];
                i4 = iArr4[1];
            } else {
                i5 = 0;
                i4 = 0;
            }
            if (iArr == null) {
                if (this.f3802e == null) {
                    this.f3802e = new int[2];
                }
                iArr3 = this.f3802e;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            View view = this.f3800c;
            if (g instanceof C1054h) {
                ((C1054h) g).mo447j(view, i, i2, iArr3, i3);
            } else if (i8 == 0) {
                try {
                    g.onNestedPreScroll(view, i, i2, iArr3);
                } catch (AbstractMethodError unused) {
                    g.toString();
                }
            }
            if (iArr4 != null) {
                this.f3800c.getLocationInWindow(iArr4);
                iArr4[0] = iArr4[0] - i5;
                iArr4[1] = iArr4[1] - i4;
            }
            if (iArr3[0] == 0 && iArr3[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr4 == null) {
            return false;
        } else {
            iArr4[0] = 0;
            iArr4[1] = 0;
            return false;
        }
    }

    /* renamed from: d */
    public void mo4528d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        mo4530f(i, i2, i3, i4, (int[]) null, i5, iArr2);
    }

    /* renamed from: e */
    public boolean mo4529e(int i, int i2, int i3, int i4, int[] iArr) {
        return mo4530f(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    /* renamed from: f */
    public final boolean mo4530f(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent g;
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        int i8 = i5;
        if (!this.f3801d || (g = mo4531g(i8)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f3800c.getLocationInWindow(iArr4);
            i7 = iArr4[0];
            i6 = iArr4[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            if (this.f3802e == null) {
                this.f3802e = new int[2];
            }
            int[] iArr5 = this.f3802e;
            iArr5[0] = 0;
            iArr5[1] = 0;
            iArr3 = iArr5;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f3800c;
        if (g instanceof C1055i) {
            ((C1055i) g).mo450m(view, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (g instanceof C1054h) {
                ((C1054h) g).mo451n(view, i, i2, i3, i4, i5);
            } else if (i8 == 0) {
                try {
                    g.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError unused) {
                    g.toString();
                }
            }
        }
        if (iArr4 != null) {
            this.f3800c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i7;
            iArr4[1] = iArr4[1] - i6;
        }
        return true;
    }

    /* renamed from: g */
    public final ViewParent mo4531g(int i) {
        if (i == 0) {
            return this.f3798a;
        }
        if (i != 1) {
            return null;
        }
        return this.f3799b;
    }

    /* renamed from: h */
    public boolean mo4532h(int i) {
        return mo4531g(i) != null;
    }

    /* renamed from: i */
    public boolean mo4533i(int i, int i2) {
        boolean z;
        if (mo4531g(i2) != null) {
            return true;
        }
        if (this.f3801d) {
            View view = this.f3800c;
            for (ViewParent parent = this.f3800c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f3800c;
                boolean z2 = parent instanceof C1054h;
                if (z2) {
                    z = ((C1054h) parent).mo452o(view, view2, i, i2);
                } else {
                    if (i2 == 0) {
                        try {
                            z = parent.onStartNestedScroll(view, view2, i);
                        } catch (AbstractMethodError unused) {
                            parent.toString();
                        }
                    }
                    z = false;
                }
                if (z) {
                    if (i2 == 0) {
                        this.f3798a = parent;
                    } else if (i2 == 1) {
                        this.f3799b = parent;
                    }
                    View view3 = this.f3800c;
                    if (z2) {
                        ((C1054h) parent).mo433d(view, view3, i, i2);
                    } else if (i2 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view, view3, i);
                        } catch (AbstractMethodError unused2) {
                            parent.toString();
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: j */
    public void mo4534j(int i) {
        ViewParent g = mo4531g(i);
        if (g != null) {
            View view = this.f3800c;
            if (g instanceof C1054h) {
                ((C1054h) g).mo446i(view, i);
            } else if (i == 0) {
                try {
                    g.onStopNestedScroll(view);
                } catch (AbstractMethodError unused) {
                    g.toString();
                }
            }
            if (i == 0) {
                this.f3798a = null;
            } else if (i == 1) {
                this.f3799b = null;
            }
        }
    }
}
