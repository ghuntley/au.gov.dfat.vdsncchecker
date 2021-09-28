package p045h;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0071c;
import androidx.appcompat.view.menu.C0074e;
import androidx.appcompat.view.menu.C0082i;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0136b1;
import androidx.appcompat.widget.C0163g0;
import androidx.appcompat.widget.C0170i1;
import androidx.appcompat.widget.C0176k;
import androidx.appcompat.widget.C0201r0;
import androidx.appcompat.widget.ContentFrameLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.C0001b;
import p001a0.C0002a;
import p007au.gov.dfat.vdsncchecker.R;
import p039g.C0934b;
import p051i.C1021a;
import p058j0.C1061o;
import p058j0.C1070q;
import p058j0.C1073r;
import p058j0.C1074s;
import p058j0.C1076u;
import p063k.C1135a;
import p063k.C1138c;
import p063k.C1143g;
import p063k.C1146h;
import p063k.C1148i;
import p093p.C1550e;
import p093p.C1558h;
import p150z.C2154f;

/* renamed from: h.h */
public class C0968h extends C0967g implements C0074e.C0075a, LayoutInflater.Factory2 {

    /* renamed from: d0 */
    public static final C1558h<String, Integer> f3543d0 = new C1558h<>();

    /* renamed from: e0 */
    public static final int[] f3544e0 = {16842836};

    /* renamed from: f0 */
    public static final boolean f3545f0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: g0 */
    public static final boolean f3546g0 = true;

    /* renamed from: A */
    public View f3547A;

    /* renamed from: B */
    public boolean f3548B;

    /* renamed from: C */
    public boolean f3549C;

    /* renamed from: D */
    public boolean f3550D;

    /* renamed from: E */
    public boolean f3551E;

    /* renamed from: F */
    public boolean f3552F;

    /* renamed from: G */
    public boolean f3553G;

    /* renamed from: H */
    public boolean f3554H;

    /* renamed from: I */
    public boolean f3555I;

    /* renamed from: J */
    public C0979i[] f3556J;

    /* renamed from: K */
    public C0979i f3557K;

    /* renamed from: L */
    public boolean f3558L;

    /* renamed from: M */
    public boolean f3559M;

    /* renamed from: N */
    public boolean f3560N;

    /* renamed from: O */
    public boolean f3561O;

    /* renamed from: P */
    public boolean f3562P;

    /* renamed from: Q */
    public int f3563Q = -100;

    /* renamed from: R */
    public int f3564R;

    /* renamed from: S */
    public boolean f3565S;

    /* renamed from: T */
    public boolean f3566T;

    /* renamed from: U */
    public C0975f f3567U;

    /* renamed from: V */
    public C0975f f3568V;

    /* renamed from: W */
    public boolean f3569W;

    /* renamed from: X */
    public int f3570X;

    /* renamed from: Y */
    public final Runnable f3571Y = new C0969a();

    /* renamed from: Z */
    public boolean f3572Z;

    /* renamed from: a0 */
    public Rect f3573a0;

    /* renamed from: b0 */
    public Rect f3574b0;

    /* renamed from: c0 */
    public C0988n f3575c0;

    /* renamed from: g */
    public final Object f3576g;

    /* renamed from: h */
    public final Context f3577h;

    /* renamed from: i */
    public Window f3578i;

    /* renamed from: j */
    public C0973d f3579j;

    /* renamed from: k */
    public final C0966f f3580k;

    /* renamed from: l */
    public C0958a f3581l;

    /* renamed from: m */
    public MenuInflater f3582m;

    /* renamed from: n */
    public CharSequence f3583n;

    /* renamed from: o */
    public C0163g0 f3584o;

    /* renamed from: p */
    public C0970b f3585p;

    /* renamed from: q */
    public C0980j f3586q;

    /* renamed from: r */
    public C1135a f3587r;

    /* renamed from: s */
    public ActionBarContextView f3588s;

    /* renamed from: t */
    public PopupWindow f3589t;

    /* renamed from: u */
    public Runnable f3590u;

    /* renamed from: v */
    public C1070q f3591v = null;

    /* renamed from: w */
    public boolean f3592w = true;

    /* renamed from: x */
    public boolean f3593x;

    /* renamed from: y */
    public ViewGroup f3594y;

    /* renamed from: z */
    public TextView f3595z;

    /* renamed from: h.h$a */
    public class C0969a implements Runnable {
        public C0969a() {
        }

        public void run() {
            C0968h hVar = C0968h.this;
            if ((hVar.f3570X & 1) != 0) {
                hVar.mo4325H(0);
            }
            C0968h hVar2 = C0968h.this;
            if ((hVar2.f3570X & 4096) != 0) {
                hVar2.mo4325H(108);
            }
            C0968h hVar3 = C0968h.this;
            hVar3.f3569W = false;
            hVar3.f3570X = 0;
        }
    }

    /* renamed from: h.h$b */
    public final class C0970b implements C0082i.C0083a {
        public C0970b() {
        }

        /* renamed from: a */
        public void mo296a(C0074e eVar, boolean z) {
            C0968h.this.mo4321D(eVar);
        }

        /* renamed from: b */
        public boolean mo297b(C0074e eVar) {
            Window.Callback O = C0968h.this.mo4332O();
            if (O == null) {
                return true;
            }
            O.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* renamed from: h.h$c */
    public class C0971c implements C1135a.C1136a {

        /* renamed from: a */
        public C1135a.C1136a f3598a;

        /* renamed from: h.h$c$a */
        public class C0972a extends C1074s {
            public C0972a() {
            }

            /* renamed from: a */
            public void mo739a(View view) {
                C0968h.this.f3588s.setVisibility(8);
                C0968h hVar = C0968h.this;
                PopupWindow popupWindow = hVar.f3589t;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.f3588s.getParent() instanceof View) {
                    WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                    ((View) C0968h.this.f3588s.getParent()).requestApplyInsets();
                }
                C0968h.this.f3588s.mo416h();
                C0968h.this.f3591v.mo4548d((C1073r) null);
                C0968h hVar2 = C0968h.this;
                hVar2.f3591v = null;
                ViewGroup viewGroup = hVar2.f3594y;
                WeakHashMap<View, C1070q> weakHashMap2 = C1061o.f3808a;
                viewGroup.requestApplyInsets();
            }
        }

        public C0971c(C1135a.C1136a aVar) {
            this.f3598a = aVar;
        }

        /* renamed from: a */
        public boolean mo4346a(C1135a aVar, MenuItem menuItem) {
            return this.f3598a.mo4346a(aVar, menuItem);
        }

        /* renamed from: b */
        public boolean mo4347b(C1135a aVar, Menu menu) {
            ViewGroup viewGroup = C0968h.this.f3594y;
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            viewGroup.requestApplyInsets();
            return this.f3598a.mo4347b(aVar, menu);
        }

        /* renamed from: c */
        public boolean mo4348c(C1135a aVar, Menu menu) {
            return this.f3598a.mo4348c(aVar, menu);
        }

        /* renamed from: d */
        public void mo4349d(C1135a aVar) {
            this.f3598a.mo4349d(aVar);
            C0968h hVar = C0968h.this;
            if (hVar.f3589t != null) {
                hVar.f3578i.getDecorView().removeCallbacks(C0968h.this.f3590u);
            }
            C0968h hVar2 = C0968h.this;
            if (hVar2.f3588s != null) {
                hVar2.mo4326I();
                C0968h hVar3 = C0968h.this;
                C1070q b = C1061o.m3021b(hVar3.f3588s);
                b.mo4545a(0.0f);
                hVar3.f3591v = b;
                C1070q qVar = C0968h.this.f3591v;
                C0972a aVar2 = new C0972a();
                View view = (View) qVar.f3821a.get();
                if (view != null) {
                    qVar.mo4549e(view, aVar2);
                }
            }
            C0968h hVar4 = C0968h.this;
            C0966f fVar = hVar4.f3580k;
            if (fVar != null) {
                fVar.mo4273f(hVar4.f3587r);
            }
            C0968h hVar5 = C0968h.this;
            hVar5.f3587r = null;
            ViewGroup viewGroup = hVar5.f3594y;
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            viewGroup.requestApplyInsets();
        }
    }

    /* renamed from: h.h$d */
    public class C0973d extends C1148i {
        public C0973d(Window.Callback callback) {
            super(callback);
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00a1  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.view.ActionMode mo4350a(android.view.ActionMode.Callback r11) {
            /*
                r10 = this;
                k.e$a r0 = new k.e$a
                h.h r1 = p045h.C0968h.this
                android.content.Context r1 = r1.f3577h
                r0.<init>(r1, r11)
                h.h r11 = p045h.C0968h.this
                java.util.Objects.requireNonNull(r11)
                k.a r1 = r11.f3587r
                if (r1 == 0) goto L_0x0015
                r1.mo4408c()
            L_0x0015:
                h.h$c r1 = new h.h$c
                r1.<init>(r0)
                r11.mo4333P()
                h.a r2 = r11.f3581l
                r3 = 32
                r4 = 1
                r5 = 0
                r6 = 0
                if (r2 == 0) goto L_0x007f
                h.s r2 = (p045h.C0995s) r2
                h.s$d r7 = r2.f3674i
                if (r7 == 0) goto L_0x002f
                r7.mo4408c()
            L_0x002f:
                androidx.appcompat.widget.ActionBarOverlayLayout r7 = r2.f3668c
                r7.setHideOnContentScrollEnabled(r5)
                androidx.appcompat.widget.ActionBarContextView r7 = r2.f3671f
                r7.mo416h()
                h.s$d r7 = new h.s$d
                androidx.appcompat.widget.ActionBarContextView r8 = r2.f3671f
                android.content.Context r8 = r8.getContext()
                r7.<init>(r8, r1)
                androidx.appcompat.view.menu.e r8 = r7.f3695h
                r8.mo293y()
                k.a$a r8 = r7.f3696i     // Catch:{ all -> 0x0078 }
                androidx.appcompat.view.menu.e r9 = r7.f3695h     // Catch:{ all -> 0x0078 }
                boolean r8 = r8.mo4348c(r7, r9)     // Catch:{ all -> 0x0078 }
                androidx.appcompat.view.menu.e r9 = r7.f3695h
                r9.mo292x()
                if (r8 == 0) goto L_0x006b
                r2.f3674i = r7
                r7.mo4414i()
                androidx.appcompat.widget.ActionBarContextView r8 = r2.f3671f
                r8.mo408f(r7)
                r2.mo4403d(r4)
                androidx.appcompat.widget.ActionBarContextView r2 = r2.f3671f
                r2.sendAccessibilityEvent(r3)
                goto L_0x006c
            L_0x006b:
                r7 = r6
            L_0x006c:
                r11.f3587r = r7
                if (r7 == 0) goto L_0x007f
                h.f r2 = r11.f3580k
                if (r2 == 0) goto L_0x007f
                r2.mo4277i(r7)
                goto L_0x007f
            L_0x0078:
                r11 = move-exception
                androidx.appcompat.view.menu.e r0 = r7.f3695h
                r0.mo292x()
                throw r11
            L_0x007f:
                k.a r2 = r11.f3587r
                if (r2 != 0) goto L_0x01ff
                r11.mo4326I()
                k.a r2 = r11.f3587r
                if (r2 == 0) goto L_0x008d
                r2.mo4408c()
            L_0x008d:
                h.f r2 = r11.f3580k
                if (r2 == 0) goto L_0x009a
                boolean r7 = r11.f3562P
                if (r7 != 0) goto L_0x009a
                k.a r2 = r2.mo4270b(r1)     // Catch:{ AbstractMethodError -> 0x009a }
                goto L_0x009b
            L_0x009a:
                r2 = r6
            L_0x009b:
                if (r2 == 0) goto L_0x00a1
                r11.f3587r = r2
                goto L_0x01f0
            L_0x00a1:
                androidx.appcompat.widget.ActionBarContextView r2 = r11.f3588s
                if (r2 != 0) goto L_0x015b
                boolean r2 = r11.f3553G
                if (r2 == 0) goto L_0x012e
                android.util.TypedValue r2 = new android.util.TypedValue
                r2.<init>()
                android.content.Context r7 = r11.f3577h
                android.content.res.Resources$Theme r7 = r7.getTheme()
                r8 = 2130903053(0x7f03000d, float:1.7412913E38)
                r7.resolveAttribute(r8, r2, r4)
                int r8 = r2.resourceId
                if (r8 == 0) goto L_0x00df
                android.content.Context r8 = r11.f3577h
                android.content.res.Resources r8 = r8.getResources()
                android.content.res.Resources$Theme r8 = r8.newTheme()
                r8.setTo(r7)
                int r7 = r2.resourceId
                r8.applyStyle(r7, r4)
                k.c r7 = new k.c
                android.content.Context r9 = r11.f3577h
                r7.<init>(r9, r5)
                android.content.res.Resources$Theme r9 = r7.getTheme()
                r9.setTo(r8)
                goto L_0x00e1
            L_0x00df:
                android.content.Context r7 = r11.f3577h
            L_0x00e1:
                androidx.appcompat.widget.ActionBarContextView r8 = new androidx.appcompat.widget.ActionBarContextView
                r8.<init>(r7, r6)
                r11.f3588s = r8
                android.widget.PopupWindow r8 = new android.widget.PopupWindow
                r9 = 2130903068(0x7f03001c, float:1.7412944E38)
                r8.<init>(r7, r6, r9)
                r11.f3589t = r8
                r9 = 2
                r8.setWindowLayoutType(r9)
                android.widget.PopupWindow r8 = r11.f3589t
                androidx.appcompat.widget.ActionBarContextView r9 = r11.f3588s
                r8.setContentView(r9)
                android.widget.PopupWindow r8 = r11.f3589t
                r9 = -1
                r8.setWidth(r9)
                android.content.res.Resources$Theme r8 = r7.getTheme()
                r9 = 2130903047(0x7f030007, float:1.74129E38)
                r8.resolveAttribute(r9, r2, r4)
                int r2 = r2.data
                android.content.res.Resources r7 = r7.getResources()
                android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
                int r2 = android.util.TypedValue.complexToDimensionPixelSize(r2, r7)
                androidx.appcompat.widget.ActionBarContextView r7 = r11.f3588s
                r7.setContentHeight(r2)
                android.widget.PopupWindow r2 = r11.f3589t
                r7 = -2
                r2.setHeight(r7)
                h.k r2 = new h.k
                r2.<init>(r11)
                r11.f3590u = r2
                goto L_0x015b
            L_0x012e:
                android.view.ViewGroup r2 = r11.f3594y
                r7 = 2131296323(0x7f090043, float:1.821056E38)
                android.view.View r2 = r2.findViewById(r7)
                androidx.appcompat.widget.ViewStubCompat r2 = (androidx.appcompat.widget.ViewStubCompat) r2
                if (r2 == 0) goto L_0x015b
                r11.mo4333P()
                h.a r7 = r11.f3581l
                if (r7 == 0) goto L_0x0147
                android.content.Context r7 = r7.mo4265b()
                goto L_0x0148
            L_0x0147:
                r7 = r6
            L_0x0148:
                if (r7 != 0) goto L_0x014c
                android.content.Context r7 = r11.f3577h
            L_0x014c:
                android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
                r2.setLayoutInflater(r7)
                android.view.View r2 = r2.mo720a()
                androidx.appcompat.widget.ActionBarContextView r2 = (androidx.appcompat.widget.ActionBarContextView) r2
                r11.f3588s = r2
            L_0x015b:
                androidx.appcompat.widget.ActionBarContextView r2 = r11.f3588s
                if (r2 == 0) goto L_0x01f0
                r11.mo4326I()
                androidx.appcompat.widget.ActionBarContextView r2 = r11.f3588s
                r2.mo416h()
                k.d r2 = new k.d
                androidx.appcompat.widget.ActionBarContextView r7 = r11.f3588s
                android.content.Context r7 = r7.getContext()
                androidx.appcompat.widget.ActionBarContextView r8 = r11.f3588s
                android.widget.PopupWindow r9 = r11.f3589t
                if (r9 != 0) goto L_0x0176
                goto L_0x0177
            L_0x0176:
                r4 = r5
            L_0x0177:
                r2.<init>(r7, r8, r1, r4)
                androidx.appcompat.view.menu.e r4 = r2.f3944l
                boolean r1 = r1.mo4348c(r2, r4)
                if (r1 == 0) goto L_0x01ee
                r2.mo4414i()
                androidx.appcompat.widget.ActionBarContextView r1 = r11.f3588s
                r1.mo408f(r2)
                r11.f3587r = r2
                boolean r1 = r11.mo4339V()
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r1 == 0) goto L_0x01b8
                androidx.appcompat.widget.ActionBarContextView r1 = r11.f3588s
                r3 = 0
                r1.setAlpha(r3)
                androidx.appcompat.widget.ActionBarContextView r1 = r11.f3588s
                j0.q r1 = p058j0.C1061o.m3021b(r1)
                r1.mo4545a(r2)
                r11.f3591v = r1
                h.l r2 = new h.l
                r2.<init>(r11)
                java.lang.ref.WeakReference<android.view.View> r3 = r1.f3821a
                java.lang.Object r3 = r3.get()
                android.view.View r3 = (android.view.View) r3
                if (r3 == 0) goto L_0x01de
                r1.mo4549e(r3, r2)
                goto L_0x01de
            L_0x01b8:
                androidx.appcompat.widget.ActionBarContextView r1 = r11.f3588s
                r1.setAlpha(r2)
                androidx.appcompat.widget.ActionBarContextView r1 = r11.f3588s
                r1.setVisibility(r5)
                androidx.appcompat.widget.ActionBarContextView r1 = r11.f3588s
                r1.sendAccessibilityEvent(r3)
                androidx.appcompat.widget.ActionBarContextView r1 = r11.f3588s
                android.view.ViewParent r1 = r1.getParent()
                boolean r1 = r1 instanceof android.view.View
                if (r1 == 0) goto L_0x01de
                androidx.appcompat.widget.ActionBarContextView r1 = r11.f3588s
                android.view.ViewParent r1 = r1.getParent()
                android.view.View r1 = (android.view.View) r1
                java.util.WeakHashMap<android.view.View, j0.q> r2 = p058j0.C1061o.f3808a
                r1.requestApplyInsets()
            L_0x01de:
                android.widget.PopupWindow r1 = r11.f3589t
                if (r1 == 0) goto L_0x01f0
                android.view.Window r1 = r11.f3578i
                android.view.View r1 = r1.getDecorView()
                java.lang.Runnable r2 = r11.f3590u
                r1.post(r2)
                goto L_0x01f0
            L_0x01ee:
                r11.f3587r = r6
            L_0x01f0:
                k.a r1 = r11.f3587r
                if (r1 == 0) goto L_0x01fb
                h.f r2 = r11.f3580k
                if (r2 == 0) goto L_0x01fb
                r2.mo4277i(r1)
            L_0x01fb:
                k.a r1 = r11.f3587r
                r11.f3587r = r1
            L_0x01ff:
                k.a r11 = r11.f3587r
                if (r11 == 0) goto L_0x0208
                android.view.ActionMode r11 = r0.mo4733e(r11)
                return r11
            L_0x0208:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p045h.C0968h.C0973d.mo4350a(android.view.ActionMode$Callback):android.view.ActionMode");
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0968h.this.mo4324G(keyEvent) || this.f4000e.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
            if (r3 != false) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
            if (r7 != false) goto L_0x006b;
         */
        /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
            /*
                r6 = this;
                android.view.Window$Callback r0 = r6.f4000e
                boolean r0 = r0.dispatchKeyShortcutEvent(r7)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x0070
                h.h r0 = p045h.C0968h.this
                int r3 = r7.getKeyCode()
                r0.mo4333P()
                h.a r4 = r0.f3581l
                if (r4 == 0) goto L_0x003f
                h.s r4 = (p045h.C0995s) r4
                h.s$d r4 = r4.f3674i
                if (r4 != 0) goto L_0x001e
                goto L_0x003b
            L_0x001e:
                androidx.appcompat.view.menu.e r4 = r4.f3695h
                if (r4 == 0) goto L_0x003b
                int r5 = r7.getDeviceId()
                android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
                int r5 = r5.getKeyboardType()
                if (r5 == r2) goto L_0x0032
                r5 = r2
                goto L_0x0033
            L_0x0032:
                r5 = r1
            L_0x0033:
                r4.setQwertyMode(r5)
                boolean r3 = r4.performShortcut(r3, r7, r1)
                goto L_0x003c
            L_0x003b:
                r3 = r1
            L_0x003c:
                if (r3 == 0) goto L_0x003f
                goto L_0x006b
            L_0x003f:
                h.h$i r3 = r0.f3557K
                if (r3 == 0) goto L_0x0054
                int r4 = r7.getKeyCode()
                boolean r3 = r0.mo4337T(r3, r4, r7, r2)
                if (r3 == 0) goto L_0x0054
                h.h$i r7 = r0.f3557K
                if (r7 == 0) goto L_0x006b
                r7.f3621l = r2
                goto L_0x006b
            L_0x0054:
                h.h$i r3 = r0.f3557K
                if (r3 != 0) goto L_0x006d
                h.h$i r3 = r0.mo4331N(r1)
                r0.mo4338U(r3, r7)
                int r4 = r7.getKeyCode()
                boolean r7 = r0.mo4337T(r3, r4, r7, r2)
                r3.f3620k = r1
                if (r7 == 0) goto L_0x006d
            L_0x006b:
                r7 = r2
                goto L_0x006e
            L_0x006d:
                r7 = r1
            L_0x006e:
                if (r7 == 0) goto L_0x0071
            L_0x0070:
                r1 = r2
            L_0x0071:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p045h.C0968h.C0973d.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0074e)) {
                return this.f4000e.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            this.f4000e.onMenuOpened(i, menu);
            C0968h hVar = C0968h.this;
            Objects.requireNonNull(hVar);
            if (i == 108) {
                hVar.mo4333P();
                C0958a aVar = hVar.f3581l;
                if (aVar != null) {
                    aVar.mo4264a(true);
                }
            }
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            this.f4000e.onPanelClosed(i, menu);
            C0968h hVar = C0968h.this;
            Objects.requireNonNull(hVar);
            if (i == 108) {
                hVar.mo4333P();
                C0958a aVar = hVar.f3581l;
                if (aVar != null) {
                    aVar.mo4264a(false);
                }
            } else if (i == 0) {
                C0979i N = hVar.mo4331N(i);
                if (N.f3622m) {
                    hVar.mo4322E(N, false);
                }
            }
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0074e eVar = menu instanceof C0074e ? (C0074e) menu : null;
            if (i == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.f379x = true;
            }
            boolean onPreparePanel = this.f4000e.onPreparePanel(i, view, menu);
            if (eVar != null) {
                eVar.f379x = false;
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0074e eVar = C0968h.this.mo4331N(0).f3617h;
            if (eVar != null) {
                this.f4000e.onProvideKeyboardShortcuts(list, eVar, i);
            } else {
                this.f4000e.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!C0968h.this.f3592w || i != 0) {
                return this.f4000e.onWindowStartingActionMode(callback, i);
            }
            return mo4350a(callback);
        }
    }

    /* renamed from: h.h$e */
    public class C0974e extends C0975f {

        /* renamed from: c */
        public final PowerManager f3602c;

        public C0974e(Context context) {
            super();
            this.f3602c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* renamed from: b */
        public IntentFilter mo4361b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo4362c() {
            return this.f3602c.isPowerSaveMode() ? 2 : 1;
        }

        /* renamed from: d */
        public void mo4363d() {
            C0968h.this.mo4344z();
        }
    }

    /* renamed from: h.h$f */
    public abstract class C0975f {

        /* renamed from: a */
        public BroadcastReceiver f3604a;

        /* renamed from: h.h$f$a */
        public class C0976a extends BroadcastReceiver {
            public C0976a() {
            }

            public void onReceive(Context context, Intent intent) {
                C0975f.this.mo4363d();
            }
        }

        public C0975f() {
        }

        /* renamed from: a */
        public void mo4364a() {
            BroadcastReceiver broadcastReceiver = this.f3604a;
            if (broadcastReceiver != null) {
                try {
                    C0968h.this.f3577h.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f3604a = null;
            }
        }

        /* renamed from: b */
        public abstract IntentFilter mo4361b();

        /* renamed from: c */
        public abstract int mo4362c();

        /* renamed from: d */
        public abstract void mo4363d();

        /* renamed from: e */
        public void mo4365e() {
            mo4364a();
            IntentFilter b = mo4361b();
            if (b != null && b.countActions() != 0) {
                if (this.f3604a == null) {
                    this.f3604a = new C0976a();
                }
                C0968h.this.f3577h.registerReceiver(this.f3604a, b);
            }
        }
    }

    /* renamed from: h.h$g */
    public class C0977g extends C0975f {

        /* renamed from: c */
        public final C0993r f3607c;

        public C0977g(C0993r rVar) {
            super();
            this.f3607c = rVar;
        }

        /* renamed from: b */
        public IntentFilter mo4361b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0067  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00e1  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00f9 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo4362c() {
            /*
                r24 = this;
                r0 = r24
                h.r r1 = r0.f3607c
                h.r$a r2 = r1.f3661c
                long r3 = r2.f3663b
                long r5 = java.lang.System.currentTimeMillis()
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                r4 = 1
                if (r3 <= 0) goto L_0x0013
                r3 = r4
                goto L_0x0014
            L_0x0013:
                r3 = 0
            L_0x0014:
                if (r3 == 0) goto L_0x001a
            L_0x0016:
                boolean r1 = r2.f3662a
                goto L_0x00f7
            L_0x001a:
                android.content.Context r3 = r1.f3659a
                java.lang.String r6 = "android.permission.ACCESS_COARSE_LOCATION"
                int r3 = p039g.C0933a.m2710d(r3, r6)
                r6 = 0
                if (r3 != 0) goto L_0x0036
                java.lang.String r3 = "network"
                android.location.LocationManager r7 = r1.f3660b     // Catch:{ Exception -> 0x0036 }
                boolean r7 = r7.isProviderEnabled(r3)     // Catch:{ Exception -> 0x0036 }
                if (r7 == 0) goto L_0x0036
                android.location.LocationManager r7 = r1.f3660b     // Catch:{ Exception -> 0x0036 }
                android.location.Location r3 = r7.getLastKnownLocation(r3)     // Catch:{ Exception -> 0x0036 }
                goto L_0x0037
            L_0x0036:
                r3 = r6
            L_0x0037:
                android.content.Context r7 = r1.f3659a
                java.lang.String r8 = "android.permission.ACCESS_FINE_LOCATION"
                int r7 = p039g.C0933a.m2710d(r7, r8)
                if (r7 != 0) goto L_0x0051
                java.lang.String r7 = "gps"
                android.location.LocationManager r8 = r1.f3660b     // Catch:{ Exception -> 0x0051 }
                boolean r8 = r8.isProviderEnabled(r7)     // Catch:{ Exception -> 0x0051 }
                if (r8 == 0) goto L_0x0051
                android.location.LocationManager r8 = r1.f3660b     // Catch:{ Exception -> 0x0051 }
                android.location.Location r6 = r8.getLastKnownLocation(r7)     // Catch:{ Exception -> 0x0051 }
            L_0x0051:
                if (r6 == 0) goto L_0x0062
                if (r3 == 0) goto L_0x0062
                long r7 = r6.getTime()
                long r9 = r3.getTime()
                int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r7 <= 0) goto L_0x0065
                goto L_0x0064
            L_0x0062:
                if (r6 == 0) goto L_0x0065
            L_0x0064:
                r3 = r6
            L_0x0065:
                if (r3 == 0) goto L_0x00e1
                h.r$a r1 = r1.f3661c
                long r13 = java.lang.System.currentTimeMillis()
                h.q r6 = p045h.C0992q.f3654d
                if (r6 != 0) goto L_0x0078
                h.q r6 = new h.q
                r6.<init>()
                p045h.C0992q.f3654d = r6
            L_0x0078:
                h.q r11 = p045h.C0992q.f3654d
                r22 = 86400000(0x5265c00, double:4.2687272E-316)
                long r16 = r13 - r22
                double r18 = r3.getLatitude()
                double r20 = r3.getLongitude()
                r15 = r11
                r15.mo4402a(r16, r18, r20)
                double r9 = r3.getLatitude()
                double r15 = r3.getLongitude()
                r6 = r11
                r7 = r13
                r5 = r11
                r11 = r15
                r6.mo4402a(r7, r9, r11)
                int r6 = r5.f3657c
                if (r6 != r4) goto L_0x00a0
                r6 = r4
                goto L_0x00a1
            L_0x00a0:
                r6 = 0
            L_0x00a1:
                long r7 = r5.f3656b
                long r9 = r5.f3655a
                long r16 = r13 + r22
                double r18 = r3.getLatitude()
                double r20 = r3.getLongitude()
                r15 = r5
                r15.mo4402a(r16, r18, r20)
                long r11 = r5.f3656b
                r15 = 0
                r17 = -1
                int r3 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
                if (r3 == 0) goto L_0x00d6
                int r3 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
                if (r3 != 0) goto L_0x00c2
                goto L_0x00d6
            L_0x00c2:
                int r3 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r3 <= 0) goto L_0x00c8
                long r11 = r11 + r15
                goto L_0x00d1
            L_0x00c8:
                int r3 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
                if (r3 <= 0) goto L_0x00cf
                long r11 = r9 + r15
                goto L_0x00d1
            L_0x00cf:
                long r11 = r7 + r15
            L_0x00d1:
                r7 = 60000(0xea60, double:2.9644E-319)
                long r11 = r11 + r7
                goto L_0x00db
            L_0x00d6:
                r7 = 43200000(0x2932e00, double:2.1343636E-316)
                long r11 = r13 + r7
            L_0x00db:
                r1.f3662a = r6
                r1.f3663b = r11
                goto L_0x0016
            L_0x00e1:
                java.util.Calendar r1 = java.util.Calendar.getInstance()
                r2 = 11
                int r1 = r1.get(r2)
                r2 = 6
                if (r1 < r2) goto L_0x00f5
                r2 = 22
                if (r1 < r2) goto L_0x00f3
                goto L_0x00f5
            L_0x00f3:
                r5 = 0
                goto L_0x00f6
            L_0x00f5:
                r5 = r4
            L_0x00f6:
                r1 = r5
            L_0x00f7:
                if (r1 == 0) goto L_0x00fa
                r4 = 2
            L_0x00fa:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p045h.C0968h.C0977g.mo4362c():int");
        }

        /* renamed from: d */
        public void mo4363d() {
            C0968h.this.mo4344z();
        }
    }

    /* renamed from: h.h$h */
    public class C0978h extends ContentFrameLayout {
        public C0978h(Context context) {
            super(context, (AttributeSet) null);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0968h.this.mo4324G(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    C0968h hVar = C0968h.this;
                    hVar.mo4322E(hVar.mo4331N(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C1021a.m2945a(getContext(), i));
        }
    }

    /* renamed from: h.h$i */
    public static final class C0979i {

        /* renamed from: a */
        public int f3610a;

        /* renamed from: b */
        public int f3611b;

        /* renamed from: c */
        public int f3612c;

        /* renamed from: d */
        public int f3613d;

        /* renamed from: e */
        public ViewGroup f3614e;

        /* renamed from: f */
        public View f3615f;

        /* renamed from: g */
        public View f3616g;

        /* renamed from: h */
        public C0074e f3617h;

        /* renamed from: i */
        public C0071c f3618i;

        /* renamed from: j */
        public Context f3619j;

        /* renamed from: k */
        public boolean f3620k;

        /* renamed from: l */
        public boolean f3621l;

        /* renamed from: m */
        public boolean f3622m;

        /* renamed from: n */
        public boolean f3623n = false;

        /* renamed from: o */
        public boolean f3624o;

        /* renamed from: p */
        public Bundle f3625p;

        public C0979i(int i) {
            this.f3610a = i;
        }

        /* renamed from: a */
        public void mo4370a(C0074e eVar) {
            C0071c cVar;
            C0074e eVar2 = this.f3617h;
            if (eVar != eVar2) {
                if (eVar2 != null) {
                    eVar2.mo288t(this.f3618i);
                }
                this.f3617h = eVar;
                if (eVar != null && (cVar = this.f3618i) != null) {
                    eVar.mo253b(cVar, eVar.f356a);
                }
            }
        }
    }

    /* renamed from: h.h$j */
    public final class C0980j implements C0082i.C0083a {
        public C0980j() {
        }

        /* renamed from: a */
        public void mo296a(C0074e eVar, boolean z) {
            C0074e k = eVar.mo269k();
            boolean z2 = k != eVar;
            C0968h hVar = C0968h.this;
            if (z2) {
                eVar = k;
            }
            C0979i L = hVar.mo4329L(eVar);
            if (L == null) {
                return;
            }
            if (z2) {
                C0968h.this.mo4320C(L.f3610a, L, k);
                C0968h.this.mo4322E(L, true);
                return;
            }
            C0968h.this.mo4322E(L, z);
        }

        /* renamed from: b */
        public boolean mo297b(C0074e eVar) {
            Window.Callback O;
            if (eVar != eVar.mo269k()) {
                return true;
            }
            C0968h hVar = C0968h.this;
            if (!hVar.f3550D || (O = hVar.mo4332O()) == null || C0968h.this.f3562P) {
                return true;
            }
            O.onMenuOpened(108, eVar);
            return true;
        }
    }

    public C0968h(Context context, Window window, C0966f fVar, Object obj) {
        C1558h<String, Integer> hVar;
        Integer orDefault;
        C0965e eVar;
        this.f3577h = context;
        this.f3580k = fVar;
        this.f3576g = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof C0965e)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        eVar = (C0965e) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            eVar = null;
            if (eVar != null) {
                this.f3563Q = eVar.mo4292r().mo4299f();
            }
        }
        if (this.f3563Q == -100 && (orDefault = hVar.getOrDefault(this.f3576g.getClass().getName(), null)) != null) {
            this.f3563Q = orDefault.intValue();
            (hVar = f3543d0).remove(this.f3576g.getClass().getName());
        }
        if (window != null) {
            mo4319B(window);
        }
        C0176k.m498e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:92:0x014e, code lost:
        if (r1 != false) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0153, code lost:
        if (r10.f3561O != false) goto L_0x0155;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ad A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x015c  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo4318A(boolean r11) {
        /*
            r10 = this;
            boolean r0 = r10.f3562P
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r10.f3563Q
            r2 = -100
            if (r0 == r2) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r0 = r2
        L_0x000e:
            android.content.Context r2 = r10.f3577h
            int r2 = r10.mo4335R(r2, r0)
            android.content.Context r3 = r10.f3577h
            r4 = 0
            android.content.res.Configuration r2 = r10.mo4323F(r3, r2, r4)
            boolean r3 = r10.f3566T
            r5 = 1
            if (r3 != 0) goto L_0x005c
            java.lang.Object r3 = r10.f3576g
            boolean r3 = r3 instanceof android.app.Activity
            if (r3 == 0) goto L_0x005c
            android.content.Context r3 = r10.f3577h
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            if (r3 != 0) goto L_0x0030
            r3 = r1
            goto L_0x0060
        L_0x0030:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x005a }
            r7 = 29
            if (r6 < r7) goto L_0x0039
            r6 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L_0x003b
        L_0x0039:
            r6 = 786432(0xc0000, float:1.102026E-39)
        L_0x003b:
            android.content.ComponentName r7 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x005a }
            android.content.Context r8 = r10.f3577h     // Catch:{ NameNotFoundException -> 0x005a }
            java.lang.Object r9 = r10.f3576g     // Catch:{ NameNotFoundException -> 0x005a }
            java.lang.Class r9 = r9.getClass()     // Catch:{ NameNotFoundException -> 0x005a }
            r7.<init>(r8, r9)     // Catch:{ NameNotFoundException -> 0x005a }
            android.content.pm.ActivityInfo r3 = r3.getActivityInfo(r7, r6)     // Catch:{ NameNotFoundException -> 0x005a }
            if (r3 == 0) goto L_0x0056
            int r3 = r3.configChanges     // Catch:{ NameNotFoundException -> 0x005a }
            r3 = r3 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0056
            r3 = r5
            goto L_0x0057
        L_0x0056:
            r3 = r1
        L_0x0057:
            r10.f3565S = r3     // Catch:{ NameNotFoundException -> 0x005a }
            goto L_0x005c
        L_0x005a:
            r10.f3565S = r1
        L_0x005c:
            r10.f3566T = r5
            boolean r3 = r10.f3565S
        L_0x0060:
            android.content.Context r6 = r10.f3577h
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.uiMode
            r6 = r6 & 48
            int r2 = r2.uiMode
            r2 = r2 & 48
            r7 = 28
            if (r6 == r2) goto L_0x00aa
            if (r11 == 0) goto L_0x00aa
            if (r3 != 0) goto L_0x00aa
            boolean r11 = r10.f3559M
            if (r11 == 0) goto L_0x00aa
            boolean r11 = f3545f0
            if (r11 != 0) goto L_0x0086
            boolean r11 = r10.f3560N
            if (r11 == 0) goto L_0x00aa
        L_0x0086:
            java.lang.Object r11 = r10.f3576g
            boolean r8 = r11 instanceof android.app.Activity
            if (r8 == 0) goto L_0x00aa
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L_0x00aa
            java.lang.Object r11 = r10.f3576g
            android.app.Activity r11 = (android.app.Activity) r11
            int r8 = p150z.C2145a.f6196b
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r7) goto L_0x009f
            goto L_0x00a5
        L_0x009f:
            boolean r8 = p150z.C2148c.m5564b(r11)
            if (r8 != 0) goto L_0x00a8
        L_0x00a5:
            r11.recreate()
        L_0x00a8:
            r11 = r5
            goto L_0x00ab
        L_0x00aa:
            r11 = r1
        L_0x00ab:
            if (r11 != 0) goto L_0x0159
            if (r6 == r2) goto L_0x0159
            android.content.Context r11 = r10.f3577h
            android.content.res.Resources r11 = r11.getResources()
            android.content.res.Configuration r6 = new android.content.res.Configuration
            android.content.res.Configuration r8 = r11.getConfiguration()
            r6.<init>(r8)
            android.content.res.Configuration r8 = r11.getConfiguration()
            int r8 = r8.uiMode
            r8 = r8 & -49
            r2 = r2 | r8
            r6.uiMode = r2
            r11.updateConfiguration(r6, r4)
            int r2 = android.os.Build.VERSION.SDK_INT
            r8 = 26
            if (r2 >= r8) goto L_0x0118
            if (r2 < r7) goto L_0x00d5
            goto L_0x0118
        L_0x00d5:
            boolean r2 = p045h.C0991p.f3653h
            if (r2 != 0) goto L_0x00e8
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.String r7 = "mResourcesImpl"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r7)     // Catch:{ NoSuchFieldException -> 0x00e6 }
            p045h.C0991p.f3652g = r2     // Catch:{ NoSuchFieldException -> 0x00e6 }
            r2.setAccessible(r5)     // Catch:{ NoSuchFieldException -> 0x00e6 }
        L_0x00e6:
            p045h.C0991p.f3653h = r5
        L_0x00e8:
            java.lang.reflect.Field r2 = p045h.C0991p.f3652g
            if (r2 != 0) goto L_0x00ed
            goto L_0x0118
        L_0x00ed:
            java.lang.Object r11 = r2.get(r11)     // Catch:{ IllegalAccessException -> 0x00f2 }
            goto L_0x00f3
        L_0x00f2:
            r11 = r4
        L_0x00f3:
            if (r11 != 0) goto L_0x00f6
            goto L_0x0118
        L_0x00f6:
            boolean r2 = p045h.C0991p.f3647b
            if (r2 != 0) goto L_0x010b
            java.lang.Class r2 = r11.getClass()     // Catch:{ NoSuchFieldException -> 0x0109 }
            java.lang.String r7 = "mDrawableCache"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r7)     // Catch:{ NoSuchFieldException -> 0x0109 }
            p045h.C0991p.f3646a = r2     // Catch:{ NoSuchFieldException -> 0x0109 }
            r2.setAccessible(r5)     // Catch:{ NoSuchFieldException -> 0x0109 }
        L_0x0109:
            p045h.C0991p.f3647b = r5
        L_0x010b:
            java.lang.reflect.Field r2 = p045h.C0991p.f3646a
            if (r2 == 0) goto L_0x0113
            java.lang.Object r4 = r2.get(r11)     // Catch:{ IllegalAccessException -> 0x0113 }
        L_0x0113:
            if (r4 == 0) goto L_0x0118
            p045h.C0991p.m2898a(r4)
        L_0x0118:
            int r11 = r10.f3564R
            if (r11 == 0) goto L_0x012c
            android.content.Context r2 = r10.f3577h
            r2.setTheme(r11)
            android.content.Context r11 = r10.f3577h
            android.content.res.Resources$Theme r11 = r11.getTheme()
            int r2 = r10.f3564R
            r11.applyStyle(r2, r5)
        L_0x012c:
            if (r3 == 0) goto L_0x015a
            java.lang.Object r11 = r10.f3576g
            boolean r2 = r11 instanceof android.app.Activity
            if (r2 == 0) goto L_0x015a
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r2 = r11 instanceof p118t0.C1773g
            if (r2 == 0) goto L_0x0151
            r2 = r11
            t0.g r2 = (p118t0.C1773g) r2
            androidx.lifecycle.c r2 = r2.mo113c()
            androidx.lifecycle.e r2 = (androidx.lifecycle.C0347e) r2
            androidx.lifecycle.c$c r2 = r2.f1689b
            androidx.lifecycle.c$c r3 = androidx.lifecycle.C0342c.C0345c.STARTED
            int r2 = r2.compareTo(r3)
            if (r2 < 0) goto L_0x014e
            r1 = r5
        L_0x014e:
            if (r1 == 0) goto L_0x015a
            goto L_0x0155
        L_0x0151:
            boolean r1 = r10.f3561O
            if (r1 == 0) goto L_0x015a
        L_0x0155:
            r11.onConfigurationChanged(r6)
            goto L_0x015a
        L_0x0159:
            r5 = r11
        L_0x015a:
            if (r5 == 0) goto L_0x0167
            java.lang.Object r11 = r10.f3576g
            boolean r1 = r11 instanceof p045h.C0965e
            if (r1 == 0) goto L_0x0167
            h.e r11 = (p045h.C0965e) r11
            java.util.Objects.requireNonNull(r11)
        L_0x0167:
            if (r0 != 0) goto L_0x0173
            android.content.Context r11 = r10.f3577h
            h.h$f r11 = r10.mo4330M(r11)
            r11.mo4365e()
            goto L_0x017a
        L_0x0173:
            h.h$f r11 = r10.f3567U
            if (r11 == 0) goto L_0x017a
            r11.mo4364a()
        L_0x017a:
            r11 = 3
            if (r0 != r11) goto L_0x0190
            android.content.Context r11 = r10.f3577h
            h.h$f r0 = r10.f3568V
            if (r0 != 0) goto L_0x018a
            h.h$e r0 = new h.h$e
            r0.<init>(r11)
            r10.f3568V = r0
        L_0x018a:
            h.h$f r11 = r10.f3568V
            r11.mo4365e()
            goto L_0x0197
        L_0x0190:
            h.h$f r11 = r10.f3568V
            if (r11 == 0) goto L_0x0197
            r11.mo4364a()
        L_0x0197:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p045h.C0968h.mo4318A(boolean):boolean");
    }

    /* renamed from: B */
    public final void mo4319B(Window window) {
        if (this.f3578i == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C0973d)) {
                C0973d dVar = new C0973d(callback);
                this.f3579j = dVar;
                window.setCallback(dVar);
                C0136b1 p = C0136b1.m360p(this.f3577h, (AttributeSet) null, f3544e0);
                Drawable h = p.mo768h(0);
                if (h != null) {
                    window.setBackgroundDrawable(h);
                }
                p.f692b.recycle();
                this.f3578i = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: C */
    public void mo4320C(int i, C0979i iVar, Menu menu) {
        if (menu == null) {
            menu = iVar.f3617h;
        }
        if (iVar.f3622m && !this.f3562P) {
            this.f3579j.f4000e.onPanelClosed(i, menu);
        }
    }

    /* renamed from: D */
    public void mo4321D(C0074e eVar) {
        if (!this.f3555I) {
            this.f3555I = true;
            this.f3584o.mo449l();
            Window.Callback O = mo4332O();
            if (O != null && !this.f3562P) {
                O.onPanelClosed(108, eVar);
            }
            this.f3555I = false;
        }
    }

    /* renamed from: E */
    public void mo4322E(C0979i iVar, boolean z) {
        ViewGroup viewGroup;
        C0163g0 g0Var;
        if (!z || iVar.f3610a != 0 || (g0Var = this.f3584o) == null || !g0Var.mo431c()) {
            WindowManager windowManager = (WindowManager) this.f3577h.getSystemService("window");
            if (!(windowManager == null || !iVar.f3622m || (viewGroup = iVar.f3614e) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    mo4320C(iVar.f3610a, iVar, (Menu) null);
                }
            }
            iVar.f3620k = false;
            iVar.f3621l = false;
            iVar.f3622m = false;
            iVar.f3615f = null;
            iVar.f3623n = true;
            if (this.f3557K == iVar) {
                this.f3557K = null;
                return;
            }
            return;
        }
        mo4321D(iVar.f3617h);
    }

    /* renamed from: F */
    public final Configuration mo4323F(Context context, int i, Configuration configuration) {
        int i2 = i != 1 ? i != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        return configuration2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x011b, code lost:
        if (r7 != false) goto L_0x011d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4324G(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f3576g
            boolean r1 = r0 instanceof p058j0.C1050e.C1051a
            r2 = 1
            if (r1 != 0) goto L_0x000b
            boolean r0 = r0 instanceof p045h.C0986m
            if (r0 == 0) goto L_0x001a
        L_0x000b:
            android.view.Window r0 = r6.f3578i
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001a
            boolean r0 = p058j0.C1050e.m2995a(r0, r7)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            int r0 = r7.getKeyCode()
            r1 = 82
            if (r0 != r1) goto L_0x002d
            h.h$d r0 = r6.f3579j
            android.view.Window$Callback r0 = r0.f4000e
            boolean r0 = r0.dispatchKeyEvent(r7)
            if (r0 == 0) goto L_0x002d
            return r2
        L_0x002d:
            int r0 = r7.getKeyCode()
            int r3 = r7.getAction()
            r4 = 0
            if (r3 != 0) goto L_0x003a
            r3 = r2
            goto L_0x003b
        L_0x003a:
            r3 = r4
        L_0x003b:
            r5 = 4
            if (r3 == 0) goto L_0x0065
            if (r0 == r5) goto L_0x0056
            if (r0 == r1) goto L_0x0043
            goto L_0x0062
        L_0x0043:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x0122
            h.h$i r0 = r6.mo4331N(r4)
            boolean r1 = r0.f3622m
            if (r1 != 0) goto L_0x0122
            r6.mo4338U(r0, r7)
            goto L_0x0122
        L_0x0056:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r2 = r4
        L_0x0060:
            r6.f3558L = r2
        L_0x0062:
            r2 = r4
            goto L_0x0122
        L_0x0065:
            if (r0 == r5) goto L_0x00e6
            if (r0 == r1) goto L_0x006a
            goto L_0x0062
        L_0x006a:
            k.a r0 = r6.f3587r
            if (r0 == 0) goto L_0x0070
            goto L_0x0122
        L_0x0070:
            h.h$i r0 = r6.mo4331N(r4)
            androidx.appcompat.widget.g0 r1 = r6.f3584o
            if (r1 == 0) goto L_0x00aa
            boolean r1 = r1.mo445h()
            if (r1 == 0) goto L_0x00aa
            android.content.Context r1 = r6.f3577h
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            boolean r1 = r1.hasPermanentMenuKey()
            if (r1 != 0) goto L_0x00aa
            androidx.appcompat.widget.g0 r1 = r6.f3584o
            boolean r1 = r1.mo431c()
            if (r1 != 0) goto L_0x00a3
            boolean r1 = r6.f3562P
            if (r1 != 0) goto L_0x00ca
            boolean r7 = r6.mo4338U(r0, r7)
            if (r7 == 0) goto L_0x00ca
            androidx.appcompat.widget.g0 r7 = r6.f3584o
            boolean r7 = r7.mo436f()
            goto L_0x00d0
        L_0x00a3:
            androidx.appcompat.widget.g0 r7 = r6.f3584o
            boolean r7 = r7.mo435e()
            goto L_0x00d0
        L_0x00aa:
            boolean r1 = r0.f3622m
            if (r1 != 0) goto L_0x00cc
            boolean r3 = r0.f3621l
            if (r3 == 0) goto L_0x00b3
            goto L_0x00cc
        L_0x00b3:
            boolean r1 = r0.f3620k
            if (r1 == 0) goto L_0x00ca
            boolean r1 = r0.f3624o
            if (r1 == 0) goto L_0x00c2
            r0.f3620k = r4
            boolean r1 = r6.mo4338U(r0, r7)
            goto L_0x00c3
        L_0x00c2:
            r1 = r2
        L_0x00c3:
            if (r1 == 0) goto L_0x00ca
            r6.mo4336S(r0, r7)
            r7 = r2
            goto L_0x00d0
        L_0x00ca:
            r7 = r4
            goto L_0x00d0
        L_0x00cc:
            r6.mo4322E(r0, r2)
            r7 = r1
        L_0x00d0:
            if (r7 == 0) goto L_0x0122
            android.content.Context r7 = r6.f3577h
            android.content.Context r7 = r7.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L_0x0122
            r7.playSoundEffect(r4)
            goto L_0x0122
        L_0x00e6:
            boolean r7 = r6.f3558L
            r6.f3558L = r4
            h.h$i r0 = r6.mo4331N(r4)
            boolean r1 = r0.f3622m
            if (r1 == 0) goto L_0x00f8
            if (r7 != 0) goto L_0x0122
            r6.mo4322E(r0, r2)
            goto L_0x0122
        L_0x00f8:
            k.a r7 = r6.f3587r
            if (r7 == 0) goto L_0x0100
            r7.mo4408c()
            goto L_0x011d
        L_0x0100:
            r6.mo4333P()
            h.a r7 = r6.f3581l
            if (r7 == 0) goto L_0x011f
            h.s r7 = (p045h.C0995s) r7
            androidx.appcompat.widget.h0 r0 = r7.f3670e
            if (r0 == 0) goto L_0x011a
            boolean r0 = r0.mo852s()
            if (r0 == 0) goto L_0x011a
            androidx.appcompat.widget.h0 r7 = r7.f3670e
            r7.collapseActionView()
            r7 = r2
            goto L_0x011b
        L_0x011a:
            r7 = r4
        L_0x011b:
            if (r7 == 0) goto L_0x011f
        L_0x011d:
            r7 = r2
            goto L_0x0120
        L_0x011f:
            r7 = r4
        L_0x0120:
            if (r7 == 0) goto L_0x0062
        L_0x0122:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p045h.C0968h.mo4324G(android.view.KeyEvent):boolean");
    }

    /* renamed from: H */
    public void mo4325H(int i) {
        C0979i N = mo4331N(i);
        if (N.f3617h != null) {
            Bundle bundle = new Bundle();
            N.f3617h.mo290v(bundle);
            if (bundle.size() > 0) {
                N.f3625p = bundle;
            }
            N.f3617h.mo293y();
            N.f3617h.clear();
        }
        N.f3624o = true;
        N.f3623n = true;
        if ((i == 108 || i == 0) && this.f3584o != null) {
            C0979i N2 = mo4331N(0);
            N2.f3620k = false;
            mo4338U(N2, (KeyEvent) null);
        }
    }

    /* renamed from: I */
    public void mo4326I() {
        C1070q qVar = this.f3591v;
        if (qVar != null) {
            qVar.mo4546b();
        }
    }

    /* renamed from: J */
    public final void mo4327J() {
        ViewGroup viewGroup;
        if (!this.f3593x) {
            TypedArray obtainStyledAttributes = this.f3577h.obtainStyledAttributes(C0934b.f3468j);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    mo4312t(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    mo4312t(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    mo4312t(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    mo4312t(10);
                }
                this.f3553G = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                mo4328K();
                this.f3578i.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.f3577h);
                if (this.f3554H) {
                    viewGroup = (ViewGroup) from.inflate(this.f3552F ? R.layout.abc_screen_simple_overlay_action_mode : R.layout.abc_screen_simple, (ViewGroup) null);
                } else if (this.f3553G) {
                    viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                    this.f3551E = false;
                    this.f3550D = false;
                } else if (this.f3550D) {
                    TypedValue typedValue = new TypedValue();
                    this.f3577h.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C1138c(this.f3577h, typedValue.resourceId) : this.f3577h).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                    C0163g0 g0Var = (C0163g0) viewGroup.findViewById(R.id.decor_content_parent);
                    this.f3584o = g0Var;
                    g0Var.setWindowCallback(mo4332O());
                    if (this.f3551E) {
                        this.f3584o.mo448k(109);
                    }
                    if (this.f3548B) {
                        this.f3584o.mo448k(2);
                    }
                    if (this.f3549C) {
                        this.f3584o.mo448k(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    C0981i iVar = new C0981i(this);
                    WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                    C1061o.C1063b.m3038c(viewGroup, iVar);
                    if (this.f3584o == null) {
                        this.f3595z = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    Method method = C0170i1.f801a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f3578i.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                        }
                    }
                    this.f3578i.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new C0982j(this));
                    this.f3594y = viewGroup;
                    Object obj = this.f3576g;
                    CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f3583n;
                    if (!TextUtils.isEmpty(title)) {
                        C0163g0 g0Var2 = this.f3584o;
                        if (g0Var2 != null) {
                            g0Var2.setWindowTitle(title);
                        } else {
                            C0958a aVar = this.f3581l;
                            if (aVar != null) {
                                ((C0995s) aVar).f3670e.setWindowTitle(title);
                            } else {
                                TextView textView = this.f3595z;
                                if (textView != null) {
                                    textView.setText(title);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f3594y.findViewById(16908290);
                    View decorView = this.f3578i.getDecorView();
                    contentFrameLayout2.f533k.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap<View, C1070q> weakHashMap2 = C1061o.f3808a;
                    if (contentFrameLayout2.isLaidOut()) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = this.f3577h.obtainStyledAttributes(C0934b.f3468j);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.f3593x = true;
                    C0979i N = mo4331N(0);
                    if (!this.f3562P && N.f3617h == null) {
                        mo4334Q(108);
                        return;
                    }
                    return;
                }
                StringBuilder a = C0001b.m0a("AppCompat does not support the current theme features: { windowActionBar: ");
                a.append(this.f3550D);
                a.append(", windowActionBarOverlay: ");
                a.append(this.f3551E);
                a.append(", android:windowIsFloating: ");
                a.append(this.f3553G);
                a.append(", windowActionModeOverlay: ");
                a.append(this.f3552F);
                a.append(", windowNoTitle: ");
                a.append(this.f3554H);
                a.append(" }");
                throw new IllegalArgumentException(a.toString());
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    /* renamed from: K */
    public final void mo4328K() {
        if (this.f3578i == null) {
            Object obj = this.f3576g;
            if (obj instanceof Activity) {
                mo4319B(((Activity) obj).getWindow());
            }
        }
        if (this.f3578i == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: L */
    public C0979i mo4329L(Menu menu) {
        C0979i[] iVarArr = this.f3556J;
        int length = iVarArr != null ? iVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0979i iVar = iVarArr[i];
            if (iVar != null && iVar.f3617h == menu) {
                return iVar;
            }
        }
        return null;
    }

    /* renamed from: M */
    public final C0975f mo4330M(Context context) {
        if (this.f3567U == null) {
            if (C0993r.f3658d == null) {
                Context applicationContext = context.getApplicationContext();
                C0993r.f3658d = new C0993r(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f3567U = new C0977g(C0993r.f3658d);
        }
        return this.f3567U;
    }

    /* renamed from: N */
    public C0979i mo4331N(int i) {
        C0979i[] iVarArr = this.f3556J;
        if (iVarArr == null || iVarArr.length <= i) {
            C0979i[] iVarArr2 = new C0979i[(i + 1)];
            if (iVarArr != null) {
                System.arraycopy(iVarArr, 0, iVarArr2, 0, iVarArr.length);
            }
            this.f3556J = iVarArr2;
            iVarArr = iVarArr2;
        }
        C0979i iVar = iVarArr[i];
        if (iVar != null) {
            return iVar;
        }
        C0979i iVar2 = new C0979i(i);
        iVarArr[i] = iVar2;
        return iVar2;
    }

    /* renamed from: O */
    public final Window.Callback mo4332O() {
        return this.f3578i.getCallback();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4333P() {
        /*
            r3 = this;
            r3.mo4327J()
            boolean r0 = r3.f3550D
            if (r0 == 0) goto L_0x0042
            h.a r0 = r3.f3581l
            if (r0 == 0) goto L_0x000c
            goto L_0x0042
        L_0x000c:
            java.lang.Object r0 = r3.f3576g
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x001e
            h.s r0 = new h.s
            java.lang.Object r1 = r3.f3576g
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.f3551E
            r0.<init>(r1, r2)
            goto L_0x002b
        L_0x001e:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x002d
            h.s r0 = new h.s
            java.lang.Object r1 = r3.f3576g
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
        L_0x002b:
            r3.f3581l = r0
        L_0x002d:
            h.a r0 = r3.f3581l
            if (r0 == 0) goto L_0x0042
            boolean r1 = r3.f3572Z
            h.s r0 = (p045h.C0995s) r0
            boolean r2 = r0.f3673h
            if (r2 != 0) goto L_0x0042
            r2 = 4
            if (r1 == 0) goto L_0x003e
            r1 = r2
            goto L_0x003f
        L_0x003e:
            r1 = 0
        L_0x003f:
            r0.mo4405f(r1, r2)
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p045h.C0968h.mo4333P():void");
    }

    /* renamed from: Q */
    public final void mo4334Q(int i) {
        this.f3570X = (1 << i) | this.f3570X;
        if (!this.f3569W) {
            View decorView = this.f3578i.getDecorView();
            Runnable runnable = this.f3571Y;
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            decorView.postOnAnimation(runnable);
            this.f3569W = true;
        }
    }

    /* renamed from: R */
    public int mo4335R(Context context, int i) {
        C0975f M;
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        if (this.f3568V == null) {
                            this.f3568V = new C0974e(context);
                        }
                        M = this.f3568V;
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                M = mo4330M(context);
            }
            return M.mo4362c();
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0154, code lost:
        if (r15 != null) goto L_0x0156;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x015b  */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4336S(p045h.C0968h.C0979i r14, android.view.KeyEvent r15) {
        /*
            r13 = this;
            boolean r0 = r14.f3622m
            if (r0 != 0) goto L_0x01d5
            boolean r0 = r13.f3562P
            if (r0 == 0) goto L_0x000a
            goto L_0x01d5
        L_0x000a:
            int r0 = r14.f3610a
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0027
            android.content.Context r0 = r13.f3577h
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r3 = 4
            if (r0 != r3) goto L_0x0023
            r0 = r2
            goto L_0x0024
        L_0x0023:
            r0 = r1
        L_0x0024:
            if (r0 == 0) goto L_0x0027
            return
        L_0x0027:
            android.view.Window$Callback r0 = r13.mo4332O()
            if (r0 == 0) goto L_0x003b
            int r3 = r14.f3610a
            androidx.appcompat.view.menu.e r4 = r14.f3617h
            boolean r0 = r0.onMenuOpened(r3, r4)
            if (r0 != 0) goto L_0x003b
            r13.mo4322E(r14, r2)
            return
        L_0x003b:
            android.content.Context r0 = r13.f3577h
            java.lang.String r3 = "window"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L_0x0048
            return
        L_0x0048:
            boolean r15 = r13.mo4338U(r14, r15)
            if (r15 != 0) goto L_0x004f
            return
        L_0x004f:
            android.view.ViewGroup r15 = r14.f3614e
            r3 = -1
            r4 = -2
            if (r15 == 0) goto L_0x006b
            boolean r5 = r14.f3623n
            if (r5 == 0) goto L_0x005a
            goto L_0x006b
        L_0x005a:
            android.view.View r15 = r14.f3616g
            if (r15 == 0) goto L_0x01b2
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 == 0) goto L_0x01b2
            int r15 = r15.width
            if (r15 != r3) goto L_0x01b2
            r6 = r3
            goto L_0x01b3
        L_0x006b:
            if (r15 != 0) goto L_0x00e3
            r13.mo4333P()
            h.a r15 = r13.f3581l
            if (r15 == 0) goto L_0x0079
            android.content.Context r15 = r15.mo4265b()
            goto L_0x007a
        L_0x0079:
            r15 = 0
        L_0x007a:
            if (r15 != 0) goto L_0x007e
            android.content.Context r15 = r13.f3577h
        L_0x007e:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources r5 = r15.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            android.content.res.Resources$Theme r6 = r15.getTheme()
            r5.setTo(r6)
            r6 = 2130903046(0x7f030006, float:1.7412899E38)
            r5.resolveAttribute(r6, r3, r2)
            int r6 = r3.resourceId
            if (r6 == 0) goto L_0x009f
            r5.applyStyle(r6, r2)
        L_0x009f:
            r6 = 2130903750(0x7f0302c6, float:1.7414327E38)
            r5.resolveAttribute(r6, r3, r2)
            int r3 = r3.resourceId
            if (r3 == 0) goto L_0x00aa
            goto L_0x00ad
        L_0x00aa:
            r3 = 2131952034(0x7f1301a2, float:1.95405E38)
        L_0x00ad:
            r5.applyStyle(r3, r2)
            k.c r3 = new k.c
            r3.<init>(r15, r1)
            android.content.res.Resources$Theme r15 = r3.getTheme()
            r15.setTo(r5)
            r14.f3619j = r3
            int[] r15 = p039g.C0934b.f3468j
            android.content.res.TypedArray r15 = r3.obtainStyledAttributes(r15)
            r3 = 86
            int r3 = r15.getResourceId(r3, r1)
            r14.f3611b = r3
            int r3 = r15.getResourceId(r2, r1)
            r14.f3613d = r3
            r15.recycle()
            h.h$h r15 = new h.h$h
            android.content.Context r3 = r14.f3619j
            r15.<init>(r3)
            r14.f3614e = r15
            r15 = 81
            r14.f3612c = r15
            goto L_0x00f2
        L_0x00e3:
            boolean r3 = r14.f3623n
            if (r3 == 0) goto L_0x00f2
            int r15 = r15.getChildCount()
            if (r15 <= 0) goto L_0x00f2
            android.view.ViewGroup r15 = r14.f3614e
            r15.removeAllViews()
        L_0x00f2:
            android.view.View r15 = r14.f3616g
            if (r15 == 0) goto L_0x00f9
            r14.f3615f = r15
            goto L_0x0156
        L_0x00f9:
            androidx.appcompat.view.menu.e r15 = r14.f3617h
            if (r15 != 0) goto L_0x00fe
            goto L_0x0158
        L_0x00fe:
            h.h$j r15 = r13.f3586q
            if (r15 != 0) goto L_0x0109
            h.h$j r15 = new h.h$j
            r15.<init>()
            r13.f3586q = r15
        L_0x0109:
            h.h$j r15 = r13.f3586q
            androidx.appcompat.view.menu.c r3 = r14.f3618i
            if (r3 != 0) goto L_0x0124
            androidx.appcompat.view.menu.c r3 = new androidx.appcompat.view.menu.c
            android.content.Context r5 = r14.f3619j
            r6 = 2131492880(0x7f0c0010, float:1.8609224E38)
            r3.<init>(r5, r6)
            r14.f3618i = r3
            r3.f345i = r15
            androidx.appcompat.view.menu.e r15 = r14.f3617h
            android.content.Context r5 = r15.f356a
            r15.mo253b(r3, r5)
        L_0x0124:
            androidx.appcompat.view.menu.c r15 = r14.f3618i
            android.view.ViewGroup r3 = r14.f3614e
            androidx.appcompat.view.menu.ExpandedMenuView r5 = r15.f344h
            if (r5 != 0) goto L_0x0150
            android.view.LayoutInflater r5 = r15.f342f
            r6 = 2131492877(0x7f0c000d, float:1.8609218E38)
            android.view.View r3 = r5.inflate(r6, r3, r1)
            androidx.appcompat.view.menu.ExpandedMenuView r3 = (androidx.appcompat.view.menu.ExpandedMenuView) r3
            r15.f344h = r3
            androidx.appcompat.view.menu.c$a r3 = r15.f346j
            if (r3 != 0) goto L_0x0144
            androidx.appcompat.view.menu.c$a r3 = new androidx.appcompat.view.menu.c$a
            r3.<init>()
            r15.f346j = r3
        L_0x0144:
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r15.f344h
            androidx.appcompat.view.menu.c$a r5 = r15.f346j
            r3.setAdapter(r5)
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r15.f344h
            r3.setOnItemClickListener(r15)
        L_0x0150:
            androidx.appcompat.view.menu.ExpandedMenuView r15 = r15.f344h
            r14.f3615f = r15
            if (r15 == 0) goto L_0x0158
        L_0x0156:
            r15 = r2
            goto L_0x0159
        L_0x0158:
            r15 = r1
        L_0x0159:
            if (r15 == 0) goto L_0x01d3
            android.view.View r15 = r14.f3615f
            if (r15 != 0) goto L_0x0160
            goto L_0x0175
        L_0x0160:
            android.view.View r15 = r14.f3616g
            if (r15 == 0) goto L_0x0165
            goto L_0x0173
        L_0x0165:
            androidx.appcompat.view.menu.c r15 = r14.f3618i
            android.widget.ListAdapter r15 = r15.mo226b()
            androidx.appcompat.view.menu.c$a r15 = (androidx.appcompat.view.menu.C0071c.C0072a) r15
            int r15 = r15.getCount()
            if (r15 <= 0) goto L_0x0175
        L_0x0173:
            r15 = r2
            goto L_0x0176
        L_0x0175:
            r15 = r1
        L_0x0176:
            if (r15 != 0) goto L_0x0179
            goto L_0x01d3
        L_0x0179:
            android.view.View r15 = r14.f3615f
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 != 0) goto L_0x0186
            android.view.ViewGroup$LayoutParams r15 = new android.view.ViewGroup$LayoutParams
            r15.<init>(r4, r4)
        L_0x0186:
            int r3 = r14.f3611b
            android.view.ViewGroup r5 = r14.f3614e
            r5.setBackgroundResource(r3)
            android.view.View r3 = r14.f3615f
            android.view.ViewParent r3 = r3.getParent()
            boolean r5 = r3 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x019e
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r5 = r14.f3615f
            r3.removeView(r5)
        L_0x019e:
            android.view.ViewGroup r3 = r14.f3614e
            android.view.View r5 = r14.f3615f
            r3.addView(r5, r15)
            android.view.View r15 = r14.f3615f
            boolean r15 = r15.hasFocus()
            if (r15 != 0) goto L_0x01b2
            android.view.View r15 = r14.f3615f
            r15.requestFocus()
        L_0x01b2:
            r6 = r4
        L_0x01b3:
            r14.f3621l = r1
            android.view.WindowManager$LayoutParams r15 = new android.view.WindowManager$LayoutParams
            r7 = -2
            r8 = 0
            r9 = 0
            r10 = 1002(0x3ea, float:1.404E-42)
            r11 = 8519680(0x820000, float:1.1938615E-38)
            r12 = -3
            r5 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            int r1 = r14.f3612c
            r15.gravity = r1
            int r1 = r14.f3613d
            r15.windowAnimations = r1
            android.view.ViewGroup r1 = r14.f3614e
            r0.addView(r1, r15)
            r14.f3622m = r2
            return
        L_0x01d3:
            r14.f3623n = r2
        L_0x01d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p045h.C0968h.mo4336S(h.h$i, android.view.KeyEvent):void");
    }

    /* renamed from: T */
    public final boolean mo4337T(C0979i iVar, int i, KeyEvent keyEvent, int i2) {
        C0074e eVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((iVar.f3620k || mo4338U(iVar, keyEvent)) && (eVar = iVar.f3617h) != null) {
            z = eVar.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f3584o == null) {
            mo4322E(iVar, true);
        }
        return z;
    }

    /* renamed from: U */
    public final boolean mo4338U(C0979i iVar, KeyEvent keyEvent) {
        C0163g0 g0Var;
        C0163g0 g0Var2;
        C0163g0 g0Var3;
        Resources.Theme theme;
        C0163g0 g0Var4;
        if (this.f3562P) {
            return false;
        }
        if (iVar.f3620k) {
            return true;
        }
        C0979i iVar2 = this.f3557K;
        if (!(iVar2 == null || iVar2 == iVar)) {
            mo4322E(iVar2, false);
        }
        Window.Callback O = mo4332O();
        if (O != null) {
            iVar.f3616g = O.onCreatePanelView(iVar.f3610a);
        }
        int i = iVar.f3610a;
        boolean z = i == 0 || i == 108;
        if (z && (g0Var4 = this.f3584o) != null) {
            g0Var4.mo438g();
        }
        if (iVar.f3616g == null) {
            C0074e eVar = iVar.f3617h;
            if (eVar == null || iVar.f3624o) {
                if (eVar == null) {
                    Context context = this.f3577h;
                    int i2 = iVar.f3610a;
                    if ((i2 == 0 || i2 == 108) && this.f3584o != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            C1138c cVar = new C1138c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    C0074e eVar2 = new C0074e(context);
                    eVar2.f360e = this;
                    iVar.mo4370a(eVar2);
                    if (iVar.f3617h == null) {
                        return false;
                    }
                }
                if (z && (g0Var3 = this.f3584o) != null) {
                    if (this.f3585p == null) {
                        this.f3585p = new C0970b();
                    }
                    g0Var3.mo429a(iVar.f3617h, this.f3585p);
                }
                iVar.f3617h.mo293y();
                if (!O.onCreatePanelMenu(iVar.f3610a, iVar.f3617h)) {
                    iVar.mo4370a((C0074e) null);
                    if (z && (g0Var2 = this.f3584o) != null) {
                        g0Var2.mo429a((Menu) null, this.f3585p);
                    }
                    return false;
                }
                iVar.f3624o = false;
            }
            iVar.f3617h.mo293y();
            Bundle bundle = iVar.f3625p;
            if (bundle != null) {
                iVar.f3617h.mo289u(bundle);
                iVar.f3625p = null;
            }
            if (!O.onPreparePanel(0, iVar.f3616g, iVar.f3617h)) {
                if (z && (g0Var = this.f3584o) != null) {
                    g0Var.mo429a((Menu) null, this.f3585p);
                }
                iVar.f3617h.mo292x();
                return false;
            }
            iVar.f3617h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            iVar.f3617h.mo292x();
        }
        iVar.f3620k = true;
        iVar.f3621l = false;
        this.f3557K = iVar;
        return true;
    }

    /* renamed from: V */
    public final boolean mo4339V() {
        ViewGroup viewGroup;
        if (this.f3593x && (viewGroup = this.f3594y) != null) {
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            if (viewGroup.isLaidOut()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: W */
    public final void mo4340W() {
        if (this.f3593x) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: X */
    public final int mo4341X(C1076u uVar, Rect rect) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        Context context;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3;
        int d = uVar.mo4559d();
        ActionBarContextView actionBarContextView = this.f3588s;
        int i4 = 8;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f3588s.getLayoutParams();
            boolean z3 = true;
            if (this.f3588s.isShown()) {
                if (this.f3573a0 == null) {
                    this.f3573a0 = new Rect();
                    this.f3574b0 = new Rect();
                }
                Rect rect2 = this.f3573a0;
                Rect rect3 = this.f3574b0;
                rect2.set(uVar.mo4557b(), uVar.mo4559d(), uVar.mo4558c(), uVar.mo4556a());
                ViewGroup viewGroup = this.f3594y;
                Method method = C0170i1.f801a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, new Object[]{rect2, rect3});
                    } catch (Exception unused) {
                    }
                }
                int i5 = rect2.top;
                int i6 = rect2.left;
                int i7 = rect2.right;
                ViewGroup viewGroup2 = this.f3594y;
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                C1076u a = C1061o.C1065c.m3039a(viewGroup2);
                if (a == null) {
                    i = 0;
                } else {
                    i = a.mo4557b();
                }
                int c = a == null ? 0 : a.mo4558c();
                if (marginLayoutParams2.topMargin == i5 && marginLayoutParams2.leftMargin == i6 && marginLayoutParams2.rightMargin == i7) {
                    z2 = false;
                } else {
                    marginLayoutParams2.topMargin = i5;
                    marginLayoutParams2.leftMargin = i6;
                    marginLayoutParams2.rightMargin = i7;
                    z2 = true;
                }
                if (i5 <= 0 || this.f3547A != null) {
                    View view = this.f3547A;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i3 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i && marginLayoutParams.rightMargin == c))) {
                        marginLayoutParams.height = i3;
                        marginLayoutParams.leftMargin = i;
                        marginLayoutParams.rightMargin = c;
                        this.f3547A.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f3577h);
                    this.f3547A = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i;
                    layoutParams.rightMargin = c;
                    this.f3594y.addView(this.f3547A, -1, layoutParams);
                }
                View view3 = this.f3547A;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    View view4 = this.f3547A;
                    if ((view4.getWindowSystemUiVisibility() & 8192) == 0) {
                        z3 = false;
                    }
                    if (z3) {
                        context = this.f3577h;
                        i2 = R.color.abc_decor_view_status_guard_light;
                    } else {
                        context = this.f3577h;
                        i2 = R.color.abc_decor_view_status_guard;
                    }
                    Object obj = C0002a.f0a;
                    view4.setBackgroundColor(C0002a.C0005c.m7a(context, i2));
                }
                if (!this.f3552F && z) {
                    d = 0;
                }
                z3 = z2;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z = false;
            } else {
                z3 = false;
                z = false;
            }
            if (z3) {
                this.f3588s.setLayoutParams(marginLayoutParams2);
            }
        }
        View view5 = this.f3547A;
        if (view5 != null) {
            if (z) {
                i4 = 0;
            }
            view5.setVisibility(i4);
        }
        return d;
    }

    /* renamed from: a */
    public boolean mo294a(C0074e eVar, MenuItem menuItem) {
        C0979i L;
        Window.Callback O = mo4332O();
        if (O == null || this.f3562P || (L = mo4329L(eVar.mo269k())) == null) {
            return false;
        }
        return O.onMenuItemSelected(L.f3610a, menuItem);
    }

    /* renamed from: b */
    public void mo295b(C0074e eVar) {
        C0163g0 g0Var = this.f3584o;
        if (g0Var == null || !g0Var.mo445h() || (ViewConfiguration.get(this.f3577h).hasPermanentMenuKey() && !this.f3584o.mo430b())) {
            C0979i N = mo4331N(0);
            N.f3623n = true;
            mo4322E(N, false);
            mo4336S(N, (KeyEvent) null);
            return;
        }
        Window.Callback O = mo4332O();
        if (this.f3584o.mo431c()) {
            this.f3584o.mo435e();
            if (!this.f3562P) {
                O.onPanelClosed(108, mo4331N(0).f3617h);
            }
        } else if (O != null && !this.f3562P) {
            if (this.f3569W && (1 & this.f3570X) != 0) {
                this.f3578i.getDecorView().removeCallbacks(this.f3571Y);
                this.f3571Y.run();
            }
            C0979i N2 = mo4331N(0);
            C0074e eVar2 = N2.f3617h;
            if (eVar2 != null && !N2.f3624o && O.onPreparePanel(0, N2.f3616g, eVar2)) {
                O.onMenuOpened(108, N2.f3617h);
                this.f3584o.mo436f();
            }
        }
    }

    /* renamed from: c */
    public void mo4296c(View view, ViewGroup.LayoutParams layoutParams) {
        mo4327J();
        ((ViewGroup) this.f3594y.findViewById(16908290)).addView(view, layoutParams);
        this.f3579j.f4000e.onContentChanged();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:114:0x01ad */
    /* JADX WARNING: Missing exception handler attribute for start block: B:120:0x01b9 */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0189  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Context mo4297d(android.content.Context r10) {
        /*
            r9 = this;
            r0 = 1
            r9.f3559M = r0
            int r1 = r9.f3563Q
            r2 = -100
            if (r1 == r2) goto L_0x000a
            goto L_0x000b
        L_0x000a:
            r1 = r2
        L_0x000b:
            int r1 = r9.mo4335R(r10, r1)
            boolean r2 = f3546g0
            r3 = 0
            if (r2 == 0) goto L_0x0023
            boolean r2 = r10 instanceof android.view.ContextThemeWrapper
            if (r2 == 0) goto L_0x0023
            android.content.res.Configuration r2 = r9.mo4323F(r10, r1, r3)
            r4 = r10
            android.view.ContextThemeWrapper r4 = (android.view.ContextThemeWrapper) r4     // Catch:{ IllegalStateException -> 0x0023 }
            r4.applyOverrideConfiguration(r2)     // Catch:{ IllegalStateException -> 0x0023 }
            return r10
        L_0x0023:
            boolean r2 = r10 instanceof p063k.C1138c
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r2 = r9.mo4323F(r10, r1, r3)
            r4 = r10
            k.c r4 = (p063k.C1138c) r4     // Catch:{ IllegalStateException -> 0x0032 }
            r4.mo4708a(r2)     // Catch:{ IllegalStateException -> 0x0032 }
            return r10
        L_0x0032:
            boolean r2 = f3545f0
            if (r2 != 0) goto L_0x0037
            return r10
        L_0x0037:
            int r2 = android.os.Build.VERSION.SDK_INT
            android.content.res.Configuration r4 = new android.content.res.Configuration
            r4.<init>()
            r5 = -1
            r4.uiMode = r5
            r5 = 0
            r4.fontScale = r5
            android.content.Context r4 = r10.createConfigurationContext(r4)
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            android.content.res.Resources r6 = r10.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r7 = r6.uiMode
            r4.uiMode = r7
            boolean r7 = r4.equals(r6)
            if (r7 != 0) goto L_0x016d
            android.content.res.Configuration r7 = new android.content.res.Configuration
            r7.<init>()
            r7.fontScale = r5
            int r5 = r4.diff(r6)
            if (r5 != 0) goto L_0x0071
            goto L_0x016e
        L_0x0071:
            float r5 = r4.fontScale
            float r8 = r6.fontScale
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x007b
            r7.fontScale = r8
        L_0x007b:
            int r5 = r4.mcc
            int r8 = r6.mcc
            if (r5 == r8) goto L_0x0083
            r7.mcc = r8
        L_0x0083:
            int r5 = r4.mnc
            int r8 = r6.mnc
            if (r5 == r8) goto L_0x008b
            r7.mnc = r8
        L_0x008b:
            android.os.LocaleList r5 = r4.getLocales()
            android.os.LocaleList r8 = r6.getLocales()
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L_0x00a0
            r7.setLocales(r8)
            java.util.Locale r5 = r6.locale
            r7.locale = r5
        L_0x00a0:
            int r5 = r4.touchscreen
            int r8 = r6.touchscreen
            if (r5 == r8) goto L_0x00a8
            r7.touchscreen = r8
        L_0x00a8:
            int r5 = r4.keyboard
            int r8 = r6.keyboard
            if (r5 == r8) goto L_0x00b0
            r7.keyboard = r8
        L_0x00b0:
            int r5 = r4.keyboardHidden
            int r8 = r6.keyboardHidden
            if (r5 == r8) goto L_0x00b8
            r7.keyboardHidden = r8
        L_0x00b8:
            int r5 = r4.navigation
            int r8 = r6.navigation
            if (r5 == r8) goto L_0x00c0
            r7.navigation = r8
        L_0x00c0:
            int r5 = r4.navigationHidden
            int r8 = r6.navigationHidden
            if (r5 == r8) goto L_0x00c8
            r7.navigationHidden = r8
        L_0x00c8:
            int r5 = r4.orientation
            int r8 = r6.orientation
            if (r5 == r8) goto L_0x00d0
            r7.orientation = r8
        L_0x00d0:
            int r5 = r4.screenLayout
            r5 = r5 & 15
            int r8 = r6.screenLayout
            r8 = r8 & 15
            if (r5 == r8) goto L_0x00df
            int r5 = r7.screenLayout
            r5 = r5 | r8
            r7.screenLayout = r5
        L_0x00df:
            int r5 = r4.screenLayout
            r5 = r5 & 192(0xc0, float:2.69E-43)
            int r8 = r6.screenLayout
            r8 = r8 & 192(0xc0, float:2.69E-43)
            if (r5 == r8) goto L_0x00ee
            int r5 = r7.screenLayout
            r5 = r5 | r8
            r7.screenLayout = r5
        L_0x00ee:
            int r5 = r4.screenLayout
            r5 = r5 & 48
            int r8 = r6.screenLayout
            r8 = r8 & 48
            if (r5 == r8) goto L_0x00fd
            int r5 = r7.screenLayout
            r5 = r5 | r8
            r7.screenLayout = r5
        L_0x00fd:
            int r5 = r4.screenLayout
            r5 = r5 & 768(0x300, float:1.076E-42)
            int r8 = r6.screenLayout
            r8 = r8 & 768(0x300, float:1.076E-42)
            if (r5 == r8) goto L_0x010c
            int r5 = r7.screenLayout
            r5 = r5 | r8
            r7.screenLayout = r5
        L_0x010c:
            r5 = 26
            if (r2 < r5) goto L_0x012e
            int r2 = r4.colorMode
            r2 = r2 & 3
            int r5 = r6.colorMode
            r5 = r5 & 3
            if (r2 == r5) goto L_0x011f
            int r2 = r7.colorMode
            r2 = r2 | r5
            r7.colorMode = r2
        L_0x011f:
            int r2 = r4.colorMode
            r2 = r2 & 12
            int r5 = r6.colorMode
            r5 = r5 & 12
            if (r2 == r5) goto L_0x012e
            int r2 = r7.colorMode
            r2 = r2 | r5
            r7.colorMode = r2
        L_0x012e:
            int r2 = r4.uiMode
            r2 = r2 & 15
            int r5 = r6.uiMode
            r5 = r5 & 15
            if (r2 == r5) goto L_0x013d
            int r2 = r7.uiMode
            r2 = r2 | r5
            r7.uiMode = r2
        L_0x013d:
            int r2 = r4.uiMode
            r2 = r2 & 48
            int r5 = r6.uiMode
            r5 = r5 & 48
            if (r2 == r5) goto L_0x014c
            int r2 = r7.uiMode
            r2 = r2 | r5
            r7.uiMode = r2
        L_0x014c:
            int r2 = r4.screenWidthDp
            int r5 = r6.screenWidthDp
            if (r2 == r5) goto L_0x0154
            r7.screenWidthDp = r5
        L_0x0154:
            int r2 = r4.screenHeightDp
            int r5 = r6.screenHeightDp
            if (r2 == r5) goto L_0x015c
            r7.screenHeightDp = r5
        L_0x015c:
            int r2 = r4.smallestScreenWidthDp
            int r5 = r6.smallestScreenWidthDp
            if (r2 == r5) goto L_0x0164
            r7.smallestScreenWidthDp = r5
        L_0x0164:
            int r2 = r4.densityDpi
            int r4 = r6.densityDpi
            if (r2 == r4) goto L_0x016e
            r7.densityDpi = r4
            goto L_0x016e
        L_0x016d:
            r7 = r3
        L_0x016e:
            android.content.res.Configuration r1 = r9.mo4323F(r10, r1, r7)
            k.c r2 = new k.c
            r4 = 2131952046(0x7f1301ae, float:1.9540524E38)
            r2.<init>(r10, r4)
            r2.mo4708a(r1)
            r1 = 0
            android.content.res.Resources$Theme r10 = r10.getTheme()     // Catch:{ NullPointerException -> 0x0186 }
            if (r10 == 0) goto L_0x0186
            r10 = r0
            goto L_0x0187
        L_0x0186:
            r10 = r1
        L_0x0187:
            if (r10 == 0) goto L_0x01c0
            android.content.res.Resources$Theme r10 = r2.getTheme()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r4 < r5) goto L_0x0197
            r10.rebase()
            goto L_0x01c0
        L_0x0197:
            java.lang.Object r4 = p010b0.C0537c.f2326a
            monitor-enter(r4)
            boolean r5 = p010b0.C0537c.f2328c     // Catch:{ all -> 0x01bd }
            if (r5 != 0) goto L_0x01af
            java.lang.Class<android.content.res.Resources$Theme> r5 = android.content.res.Resources.Theme.class
            java.lang.String r6 = "rebase"
            java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x01ad }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x01ad }
            p010b0.C0537c.f2327b = r5     // Catch:{ NoSuchMethodException -> 0x01ad }
            r5.setAccessible(r0)     // Catch:{ NoSuchMethodException -> 0x01ad }
        L_0x01ad:
            p010b0.C0537c.f2328c = r0     // Catch:{ all -> 0x01bd }
        L_0x01af:
            java.lang.reflect.Method r0 = p010b0.C0537c.f2327b     // Catch:{ all -> 0x01bd }
            if (r0 == 0) goto L_0x01bb
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x01b9 }
            r0.invoke(r10, r1)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x01b9 }
            goto L_0x01bb
        L_0x01b9:
            p010b0.C0537c.f2327b = r3     // Catch:{ all -> 0x01bd }
        L_0x01bb:
            monitor-exit(r4)     // Catch:{ all -> 0x01bd }
            goto L_0x01c0
        L_0x01bd:
            r10 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01bd }
            throw r10
        L_0x01c0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p045h.C0968h.mo4297d(android.content.Context):android.content.Context");
    }

    /* renamed from: e */
    public <T extends View> T mo4298e(int i) {
        mo4327J();
        return this.f3578i.findViewById(i);
    }

    /* renamed from: f */
    public int mo4299f() {
        return this.f3563Q;
    }

    /* renamed from: g */
    public MenuInflater mo4300g() {
        if (this.f3582m == null) {
            mo4333P();
            C0958a aVar = this.f3581l;
            this.f3582m = new C1143g(aVar != null ? aVar.mo4265b() : this.f3577h);
        }
        return this.f3582m;
    }

    /* renamed from: h */
    public C0958a mo4301h() {
        mo4333P();
        return this.f3581l;
    }

    /* renamed from: i */
    public void mo4302i() {
        LayoutInflater from = LayoutInflater.from(this.f3577h);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            boolean z = from.getFactory2() instanceof C0968h;
        }
    }

    /* renamed from: j */
    public void mo4303j() {
        mo4333P();
        C0958a aVar = this.f3581l;
        mo4334Q(0);
    }

    /* renamed from: k */
    public void mo4304k(Configuration configuration) {
        if (this.f3550D && this.f3593x) {
            mo4333P();
            C0958a aVar = this.f3581l;
            if (aVar != null) {
                C0995s sVar = (C0995s) aVar;
                sVar.mo4406g(sVar.f3666a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        C0176k a = C0176k.m496a();
        Context context = this.f3577h;
        synchronized (a) {
            C0201r0 r0Var = a.f825a;
            synchronized (r0Var) {
                C1550e eVar = r0Var.f919d.get(context);
                if (eVar != null) {
                    eVar.mo5531b();
                }
            }
        }
        mo4318A(false);
    }

    /* renamed from: l */
    public void mo4305l(Bundle bundle) {
        this.f3559M = true;
        mo4318A(false);
        mo4328K();
        Object obj = this.f3576g;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                str = C2154f.m5568c(activity, activity.getComponentName());
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                C0958a aVar = this.f3581l;
                if (aVar == null) {
                    this.f3572Z = true;
                } else {
                    C0995s sVar = (C0995s) aVar;
                    if (!sVar.f3673h) {
                        sVar.mo4405f(4, 4);
                    }
                }
            }
            synchronized (C0967g.f3542f) {
                C0967g.m2772s(this);
                C0967g.f3541e.add(new WeakReference(this));
            }
        }
        this.f3560N = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4306m() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f3576g
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = p045h.C0967g.f3542f
            monitor-enter(r0)
            p045h.C0967g.m2772s(r3)     // Catch:{ all -> 0x000e }
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            goto L_0x0011
        L_0x000e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            throw r1
        L_0x0011:
            boolean r0 = r3.f3569W
            if (r0 == 0) goto L_0x0020
            android.view.Window r0 = r3.f3578i
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f3571Y
            r0.removeCallbacks(r1)
        L_0x0020:
            r0 = 0
            r3.f3561O = r0
            r0 = 1
            r3.f3562P = r0
            int r0 = r3.f3563Q
            r1 = -100
            if (r0 == r1) goto L_0x0050
            java.lang.Object r0 = r3.f3576g
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0050
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0050
            p.h<java.lang.String, java.lang.Integer> r0 = f3543d0
            java.lang.Object r1 = r3.f3576g
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f3563Q
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x005f
        L_0x0050:
            p.h<java.lang.String, java.lang.Integer> r0 = f3543d0
            java.lang.Object r1 = r3.f3576g
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x005f:
            h.a r0 = r3.f3581l
            if (r0 == 0) goto L_0x0066
            java.util.Objects.requireNonNull(r0)
        L_0x0066:
            h.h$f r0 = r3.f3567U
            if (r0 == 0) goto L_0x006d
            r0.mo4364a()
        L_0x006d:
            h.h$f r0 = r3.f3568V
            if (r0 == 0) goto L_0x0074
            r0.mo4364a()
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p045h.C0968h.mo4306m():void");
    }

    /* renamed from: n */
    public void mo4307n(Bundle bundle) {
        mo4327J();
    }

    /* renamed from: o */
    public void mo4308o() {
        mo4333P();
        C0958a aVar = this.f3581l;
        if (aVar != null) {
            ((C0995s) aVar).f3686u = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v69, resolved type: androidx.appcompat.widget.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v70, resolved type: androidx.appcompat.widget.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v71, resolved type: androidx.appcompat.widget.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v72, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v73, resolved type: androidx.appcompat.widget.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v74, resolved type: androidx.appcompat.widget.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v75, resolved type: androidx.appcompat.widget.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v76, resolved type: androidx.appcompat.widget.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v77, resolved type: androidx.appcompat.widget.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v78, resolved type: androidx.appcompat.widget.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v79, resolved type: androidx.appcompat.widget.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v80, resolved type: androidx.appcompat.widget.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v81, resolved type: androidx.appcompat.widget.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v82, resolved type: androidx.appcompat.widget.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v83, resolved type: androidx.appcompat.widget.g} */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r9v8, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r1v8, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r1v24 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e9, code lost:
        if (r9.equals("ImageButton") == false) goto L_0x0118;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r8, java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r7 = this;
            h.n r8 = r7.f3575c0
            r0 = 0
            if (r8 != 0) goto L_0x0037
            android.content.Context r8 = r7.f3577h
            int[] r1 = p039g.C0934b.f3468j
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r1)
            r1 = 116(0x74, float:1.63E-43)
            java.lang.String r8 = r8.getString(r1)
            if (r8 != 0) goto L_0x001b
            h.n r8 = new h.n
            r8.<init>()
            goto L_0x0035
        L_0x001b:
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0030 }
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch:{ all -> 0x0030 }
            java.lang.reflect.Constructor r8 = r8.getDeclaredConstructor(r1)     // Catch:{ all -> 0x0030 }
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0030 }
            java.lang.Object r8 = r8.newInstance(r1)     // Catch:{ all -> 0x0030 }
            h.n r8 = (p045h.C0988n) r8     // Catch:{ all -> 0x0030 }
            r7.f3575c0 = r8     // Catch:{ all -> 0x0030 }
            goto L_0x0037
        L_0x0030:
            h.n r8 = new h.n
            r8.<init>()
        L_0x0035:
            r7.f3575c0 = r8
        L_0x0037:
            h.n r8 = r7.f3575c0
            int r1 = androidx.appcompat.widget.C0167h1.f796a
            java.util.Objects.requireNonNull(r8)
            r1 = 4
            int[] r2 = p039g.C0934b.f3482x
            android.content.res.TypedArray r2 = r10.obtainStyledAttributes(r11, r2, r0, r0)
            int r3 = r2.getResourceId(r1, r0)
            r2.recycle()
            if (r3 == 0) goto L_0x005f
            boolean r2 = r10 instanceof p063k.C1138c
            if (r2 == 0) goto L_0x0059
            r2 = r10
            k.c r2 = (p063k.C1138c) r2
            int r2 = r2.f3934a
            if (r2 == r3) goto L_0x005f
        L_0x0059:
            k.c r2 = new k.c
            r2.<init>(r10, r3)
            goto L_0x0060
        L_0x005f:
            r2 = r10
        L_0x0060:
            java.util.Objects.requireNonNull(r9)
            int r3 = r9.hashCode()
            r4 = -1
            r5 = 1
            switch(r3) {
                case -1946472170: goto L_0x010d;
                case -1455429095: goto L_0x0102;
                case -1346021293: goto L_0x00f7;
                case -938935918: goto L_0x00ec;
                case -937446323: goto L_0x00e3;
                case -658531749: goto L_0x00d8;
                case -339785223: goto L_0x00cd;
                case 776382189: goto L_0x00c2;
                case 799298502: goto L_0x00b4;
                case 1125864064: goto L_0x00a6;
                case 1413872058: goto L_0x0098;
                case 1601505219: goto L_0x008a;
                case 1666676343: goto L_0x007c;
                case 2001146706: goto L_0x006e;
                default: goto L_0x006c;
            }
        L_0x006c:
            goto L_0x0118
        L_0x006e:
            java.lang.String r1 = "Button"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x0078
            goto L_0x0118
        L_0x0078:
            r1 = 13
            goto L_0x0119
        L_0x007c:
            java.lang.String r1 = "EditText"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x0086
            goto L_0x0118
        L_0x0086:
            r1 = 12
            goto L_0x0119
        L_0x008a:
            java.lang.String r1 = "CheckBox"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x0094
            goto L_0x0118
        L_0x0094:
            r1 = 11
            goto L_0x0119
        L_0x0098:
            java.lang.String r1 = "AutoCompleteTextView"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x00a2
            goto L_0x0118
        L_0x00a2:
            r1 = 10
            goto L_0x0119
        L_0x00a6:
            java.lang.String r1 = "ImageView"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x00b0
            goto L_0x0118
        L_0x00b0:
            r1 = 9
            goto L_0x0119
        L_0x00b4:
            java.lang.String r1 = "ToggleButton"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x00be
            goto L_0x0118
        L_0x00be:
            r1 = 8
            goto L_0x0119
        L_0x00c2:
            java.lang.String r1 = "RadioButton"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x00cb
            goto L_0x0118
        L_0x00cb:
            r1 = 7
            goto L_0x0119
        L_0x00cd:
            java.lang.String r1 = "Spinner"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x00d6
            goto L_0x0118
        L_0x00d6:
            r1 = 6
            goto L_0x0119
        L_0x00d8:
            java.lang.String r1 = "SeekBar"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x00e1
            goto L_0x0118
        L_0x00e1:
            r1 = 5
            goto L_0x0119
        L_0x00e3:
            java.lang.String r3 = "ImageButton"
            boolean r3 = r9.equals(r3)
            if (r3 != 0) goto L_0x0119
            goto L_0x0118
        L_0x00ec:
            java.lang.String r1 = "TextView"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x00f5
            goto L_0x0118
        L_0x00f5:
            r1 = 3
            goto L_0x0119
        L_0x00f7:
            java.lang.String r1 = "MultiAutoCompleteTextView"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x0100
            goto L_0x0118
        L_0x0100:
            r1 = 2
            goto L_0x0119
        L_0x0102:
            java.lang.String r1 = "CheckedTextView"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x010b
            goto L_0x0118
        L_0x010b:
            r1 = r5
            goto L_0x0119
        L_0x010d:
            java.lang.String r1 = "RatingBar"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x0116
            goto L_0x0118
        L_0x0116:
            r1 = r0
            goto L_0x0119
        L_0x0118:
            r1 = r4
        L_0x0119:
            r3 = 0
            switch(r1) {
                case 0: goto L_0x016e;
                case 1: goto L_0x0168;
                case 2: goto L_0x0162;
                case 3: goto L_0x015a;
                case 4: goto L_0x0154;
                case 5: goto L_0x014e;
                case 6: goto L_0x0145;
                case 7: goto L_0x0140;
                case 8: goto L_0x013a;
                case 9: goto L_0x0134;
                case 10: goto L_0x012f;
                case 11: goto L_0x012a;
                case 12: goto L_0x0124;
                case 13: goto L_0x011f;
                default: goto L_0x011d;
            }
        L_0x011d:
            r1 = r3
            goto L_0x0173
        L_0x011f:
            androidx.appcompat.widget.g r1 = r8.mo3984b(r2, r11)
            goto L_0x015e
        L_0x0124:
            androidx.appcompat.widget.l r1 = new androidx.appcompat.widget.l
            r1.<init>(r2, r11)
            goto L_0x0173
        L_0x012a:
            androidx.appcompat.widget.h r1 = r8.mo3985c(r2, r11)
            goto L_0x015e
        L_0x012f:
            androidx.appcompat.widget.e r1 = r8.mo3983a(r2, r11)
            goto L_0x015e
        L_0x0134:
            androidx.appcompat.widget.o r1 = new androidx.appcompat.widget.o
            r1.<init>(r2, r11, r0)
            goto L_0x0173
        L_0x013a:
            androidx.appcompat.widget.f0 r1 = new androidx.appcompat.widget.f0
            r1.<init>(r2, r11)
            goto L_0x0173
        L_0x0140:
            androidx.appcompat.widget.s r1 = r8.mo3986d(r2, r11)
            goto L_0x015e
        L_0x0145:
            androidx.appcompat.widget.y r1 = new androidx.appcompat.widget.y
            r6 = 2130903850(0x7f03032a, float:1.741453E38)
            r1.<init>(r2, r11, r6)
            goto L_0x0173
        L_0x014e:
            androidx.appcompat.widget.v r1 = new androidx.appcompat.widget.v
            r1.<init>(r2, r11)
            goto L_0x0173
        L_0x0154:
            androidx.appcompat.widget.m r1 = new androidx.appcompat.widget.m
            r1.<init>(r2, r11)
            goto L_0x0173
        L_0x015a:
            androidx.appcompat.widget.d0 r1 = r8.mo3987e(r2, r11)
        L_0x015e:
            r8.mo4386g(r1, r9)
            goto L_0x0173
        L_0x0162:
            androidx.appcompat.widget.p r1 = new androidx.appcompat.widget.p
            r1.<init>(r2, r11)
            goto L_0x0173
        L_0x0168:
            androidx.appcompat.widget.i r1 = new androidx.appcompat.widget.i
            r1.<init>(r2, r11)
            goto L_0x0173
        L_0x016e:
            androidx.appcompat.widget.t r1 = new androidx.appcompat.widget.t
            r1.<init>(r2, r11)
        L_0x0173:
            if (r1 != 0) goto L_0x01ce
            if (r10 == r2) goto L_0x01ce
            java.lang.String r10 = "view"
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L_0x0185
            java.lang.String r9 = "class"
            java.lang.String r9 = r11.getAttributeValue(r3, r9)
        L_0x0185:
            java.lang.Object[] r10 = r8.f3639a     // Catch:{ Exception -> 0x01c7, all -> 0x01bf }
            r10[r0] = r2     // Catch:{ Exception -> 0x01c7, all -> 0x01bf }
            r10[r5] = r11     // Catch:{ Exception -> 0x01c7, all -> 0x01bf }
            r10 = 46
            int r10 = r9.indexOf(r10)     // Catch:{ Exception -> 0x01c7, all -> 0x01bf }
            if (r4 != r10) goto L_0x01b3
            r10 = r0
        L_0x0194:
            java.lang.String[] r1 = p045h.C0988n.f3637d     // Catch:{ Exception -> 0x01c7, all -> 0x01bf }
            int r4 = r1.length     // Catch:{ Exception -> 0x01c7, all -> 0x01bf }
            if (r10 >= r4) goto L_0x01ac
            r1 = r1[r10]     // Catch:{ Exception -> 0x01c7, all -> 0x01bf }
            android.view.View r1 = r8.mo4385f(r2, r9, r1)     // Catch:{ Exception -> 0x01c7, all -> 0x01bf }
            if (r1 == 0) goto L_0x01a9
            java.lang.Object[] r8 = r8.f3639a
            r8[r0] = r3
            r8[r5] = r3
            r3 = r1
            goto L_0x01cd
        L_0x01a9:
            int r10 = r10 + 1
            goto L_0x0194
        L_0x01ac:
            java.lang.Object[] r8 = r8.f3639a
            r8[r0] = r3
            r8[r5] = r3
            goto L_0x01cd
        L_0x01b3:
            android.view.View r9 = r8.mo4385f(r2, r9, r3)     // Catch:{ Exception -> 0x01c7, all -> 0x01bf }
            java.lang.Object[] r8 = r8.f3639a
            r8[r0] = r3
            r8[r5] = r3
            r3 = r9
            goto L_0x01cd
        L_0x01bf:
            r9 = move-exception
            java.lang.Object[] r8 = r8.f3639a
            r8[r0] = r3
            r8[r5] = r3
            throw r9
        L_0x01c7:
            java.lang.Object[] r8 = r8.f3639a
            r8[r0] = r3
            r8[r5] = r3
        L_0x01cd:
            r1 = r3
        L_0x01ce:
            if (r1 == 0) goto L_0x01f8
            android.content.Context r8 = r1.getContext()
            boolean r9 = r8 instanceof android.content.ContextWrapper
            if (r9 == 0) goto L_0x01f8
            java.util.WeakHashMap<android.view.View, j0.q> r9 = p058j0.C1061o.f3808a
            boolean r9 = r1.hasOnClickListeners()
            if (r9 != 0) goto L_0x01e1
            goto L_0x01f8
        L_0x01e1:
            int[] r9 = p045h.C0988n.f3636c
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r11, r9)
            java.lang.String r9 = r8.getString(r0)
            if (r9 == 0) goto L_0x01f5
            h.n$a r10 = new h.n$a
            r10.<init>(r1, r9)
            r1.setOnClickListener(r10)
        L_0x01f5:
            r8.recycle()
        L_0x01f8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p045h.C0968h.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* renamed from: p */
    public void mo4309p(Bundle bundle) {
    }

    /* renamed from: q */
    public void mo4310q() {
        this.f3561O = true;
        mo4344z();
    }

    /* renamed from: r */
    public void mo4311r() {
        this.f3561O = false;
        mo4333P();
        C0958a aVar = this.f3581l;
        if (aVar != null) {
            C0995s sVar = (C0995s) aVar;
            sVar.f3686u = false;
            C1146h hVar = sVar.f3685t;
            if (hVar != null) {
                hVar.mo4742a();
            }
        }
    }

    /* renamed from: t */
    public boolean mo4312t(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.f3554H && i == 108) {
            return false;
        }
        if (this.f3550D && i == 1) {
            this.f3550D = false;
        }
        if (i == 1) {
            mo4340W();
            this.f3554H = true;
            return true;
        } else if (i == 2) {
            mo4340W();
            this.f3548B = true;
            return true;
        } else if (i == 5) {
            mo4340W();
            this.f3549C = true;
            return true;
        } else if (i == 10) {
            mo4340W();
            this.f3552F = true;
            return true;
        } else if (i == 108) {
            mo4340W();
            this.f3550D = true;
            return true;
        } else if (i != 109) {
            return this.f3578i.requestFeature(i);
        } else {
            mo4340W();
            this.f3551E = true;
            return true;
        }
    }

    /* renamed from: u */
    public void mo4313u(int i) {
        mo4327J();
        ViewGroup viewGroup = (ViewGroup) this.f3594y.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f3577h).inflate(i, viewGroup);
        this.f3579j.f4000e.onContentChanged();
    }

    /* renamed from: v */
    public void mo4314v(View view) {
        mo4327J();
        ViewGroup viewGroup = (ViewGroup) this.f3594y.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f3579j.f4000e.onContentChanged();
    }

    /* renamed from: w */
    public void mo4315w(View view, ViewGroup.LayoutParams layoutParams) {
        mo4327J();
        ViewGroup viewGroup = (ViewGroup) this.f3594y.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f3579j.f4000e.onContentChanged();
    }

    /* renamed from: x */
    public void mo4316x(int i) {
        this.f3564R = i;
    }

    /* renamed from: y */
    public final void mo4317y(CharSequence charSequence) {
        this.f3583n = charSequence;
        C0163g0 g0Var = this.f3584o;
        if (g0Var != null) {
            g0Var.setWindowTitle(charSequence);
            return;
        }
        C0958a aVar = this.f3581l;
        if (aVar != null) {
            ((C0995s) aVar).f3670e.setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.f3595z;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: z */
    public boolean mo4344z() {
        return mo4318A(true);
    }
}
