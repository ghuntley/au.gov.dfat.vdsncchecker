package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p007au.gov.dfat.vdsncchecker.R;
import p039g.C0934b;
import p045h.C0986m;

public class AlertController {

    /* renamed from: A */
    public NestedScrollView f194A;

    /* renamed from: B */
    public int f195B = 0;

    /* renamed from: C */
    public Drawable f196C;

    /* renamed from: D */
    public ImageView f197D;

    /* renamed from: E */
    public TextView f198E;

    /* renamed from: F */
    public TextView f199F;

    /* renamed from: G */
    public View f200G;

    /* renamed from: H */
    public ListAdapter f201H;

    /* renamed from: I */
    public int f202I = -1;

    /* renamed from: J */
    public int f203J;

    /* renamed from: K */
    public int f204K;

    /* renamed from: L */
    public int f205L;

    /* renamed from: M */
    public int f206M;

    /* renamed from: N */
    public int f207N;

    /* renamed from: O */
    public int f208O;

    /* renamed from: P */
    public boolean f209P;

    /* renamed from: Q */
    public Handler f210Q;

    /* renamed from: R */
    public final View.OnClickListener f211R = new C0055a();

    /* renamed from: a */
    public final Context f212a;

    /* renamed from: b */
    public final C0986m f213b;

    /* renamed from: c */
    public final Window f214c;

    /* renamed from: d */
    public final int f215d;

    /* renamed from: e */
    public CharSequence f216e;

    /* renamed from: f */
    public CharSequence f217f;

    /* renamed from: g */
    public ListView f218g;

    /* renamed from: h */
    public View f219h;

    /* renamed from: i */
    public int f220i;

    /* renamed from: j */
    public int f221j;

    /* renamed from: k */
    public int f222k;

    /* renamed from: l */
    public int f223l;

    /* renamed from: m */
    public int f224m;

    /* renamed from: n */
    public boolean f225n = false;

    /* renamed from: o */
    public Button f226o;

    /* renamed from: p */
    public CharSequence f227p;

    /* renamed from: q */
    public Message f228q;

    /* renamed from: r */
    public Drawable f229r;

    /* renamed from: s */
    public Button f230s;

    /* renamed from: t */
    public CharSequence f231t;

    /* renamed from: u */
    public Message f232u;

    /* renamed from: v */
    public Drawable f233v;

    /* renamed from: w */
    public Button f234w;

    /* renamed from: x */
    public CharSequence f235x;

    /* renamed from: y */
    public Message f236y;

    /* renamed from: z */
    public Drawable f237z;

    public static class RecycleListView extends ListView {

        /* renamed from: e */
        public final int f238e;

        /* renamed from: f */
        public final int f239f;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0934b.f3477s);
            this.f239f = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f238e = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    public class C0055a implements View.OnClickListener {
        public C0055a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            r3 = r0.f236y;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f226o
                if (r3 != r1) goto L_0x000f
                android.os.Message r1 = r0.f228q
                if (r1 == 0) goto L_0x000f
            L_0x000a:
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x0026
            L_0x000f:
                android.widget.Button r1 = r0.f230s
                if (r3 != r1) goto L_0x0018
                android.os.Message r1 = r0.f232u
                if (r1 == 0) goto L_0x0018
                goto L_0x000a
            L_0x0018:
                android.widget.Button r1 = r0.f234w
                if (r3 != r1) goto L_0x0025
                android.os.Message r3 = r0.f236y
                if (r3 == 0) goto L_0x0025
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x0026
            L_0x0025:
                r3 = 0
            L_0x0026:
                if (r3 == 0) goto L_0x002b
                r3.sendToTarget()
            L_0x002b:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.f210Q
                r1 = 1
                h.m r3 = r3.f213b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0055a.onClick(android.view.View):void");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    public static class C0056b {

        /* renamed from: a */
        public final Context f241a;

        /* renamed from: b */
        public final LayoutInflater f242b;

        /* renamed from: c */
        public Drawable f243c;

        /* renamed from: d */
        public CharSequence f244d;

        /* renamed from: e */
        public View f245e;

        /* renamed from: f */
        public CharSequence f246f;

        /* renamed from: g */
        public CharSequence f247g;

        /* renamed from: h */
        public DialogInterface.OnClickListener f248h;

        /* renamed from: i */
        public CharSequence f249i;

        /* renamed from: j */
        public DialogInterface.OnClickListener f250j;

        /* renamed from: k */
        public CharSequence f251k;

        /* renamed from: l */
        public DialogInterface.OnClickListener f252l;

        /* renamed from: m */
        public boolean f253m;

        /* renamed from: n */
        public DialogInterface.OnKeyListener f254n;

        /* renamed from: o */
        public ListAdapter f255o;

        /* renamed from: p */
        public DialogInterface.OnClickListener f256p;

        /* renamed from: q */
        public int f257q;

        /* renamed from: r */
        public boolean f258r;

        /* renamed from: s */
        public int f259s = -1;

        public C0056b(Context context) {
            this.f241a = context;
            this.f253m = true;
            this.f242b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    public static final class C0057c extends Handler {

        /* renamed from: a */
        public WeakReference<DialogInterface> f260a;

        public C0057c(DialogInterface dialogInterface) {
            this.f260a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f260a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    public static class C0058d extends ArrayAdapter<CharSequence> {
        public C0058d(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, (Object[]) null);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C0986m mVar, Window window) {
        this.f212a = context;
        this.f213b = mVar;
        this.f214c = window;
        this.f210Q = new C0057c(mVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C0934b.f3463e, R.attr.alertDialogStyle, 0);
        this.f203J = obtainStyledAttributes.getResourceId(0, 0);
        this.f204K = obtainStyledAttributes.getResourceId(2, 0);
        this.f205L = obtainStyledAttributes.getResourceId(4, 0);
        this.f206M = obtainStyledAttributes.getResourceId(5, 0);
        this.f207N = obtainStyledAttributes.getResourceId(7, 0);
        this.f208O = obtainStyledAttributes.getResourceId(3, 0);
        this.f209P = obtainStyledAttributes.getBoolean(6, true);
        this.f215d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        mVar.mo4372a().mo4312t(1);
    }

    /* renamed from: a */
    public static boolean m96a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m96a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static void m97c(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: b */
    public final void mo148b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: d */
    public final ViewGroup mo149d(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: e */
    public void mo150e(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        Message obtainMessage = onClickListener != null ? this.f210Q.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f235x = charSequence;
            this.f236y = obtainMessage;
            this.f237z = null;
        } else if (i == -2) {
            this.f231t = charSequence;
            this.f232u = obtainMessage;
            this.f233v = null;
        } else if (i == -1) {
            this.f227p = charSequence;
            this.f228q = obtainMessage;
            this.f229r = null;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }
}
