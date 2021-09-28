package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.C0184m0;
import androidx.core.widget.NestedScrollView;
import com.dynamsoft.dbr.EnumBarcodeFormat;
import java.util.Objects;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p045h.C0986m;
import p058j0.C1061o;
import p058j0.C1070q;

/* renamed from: androidx.appcompat.app.b */
public class C0060b extends C0986m {

    /* renamed from: g */
    public final AlertController f263g = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.b$a */
    public static class C0061a {

        /* renamed from: a */
        public final AlertController.C0056b f264a;

        /* renamed from: b */
        public final int f265b;

        public C0061a(Context context) {
            int d = C0060b.m101d(context, 0);
            this.f264a = new AlertController.C0056b(new ContextThemeWrapper(context, C0060b.m101d(context, d)));
            this.f265b = d;
        }

        public C0061a(Context context, int i) {
            this.f264a = new AlertController.C0056b(new ContextThemeWrapper(context, C0060b.m101d(context, i)));
            this.f265b = i;
        }

        /* renamed from: a */
        public C0060b mo5a() {
            C0060b bVar = new C0060b(this.f264a.f241a, this.f265b);
            AlertController.C0056b bVar2 = this.f264a;
            AlertController alertController = bVar.f263g;
            View view = bVar2.f245e;
            if (view != null) {
                alertController.f200G = view;
            } else {
                CharSequence charSequence = bVar2.f244d;
                if (charSequence != null) {
                    alertController.f216e = charSequence;
                    TextView textView = alertController.f198E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar2.f243c;
                if (drawable != null) {
                    alertController.f196C = drawable;
                    alertController.f195B = 0;
                    ImageView imageView = alertController.f197D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.f197D.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = bVar2.f246f;
            if (charSequence2 != null) {
                alertController.f217f = charSequence2;
                TextView textView2 = alertController.f199F;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = bVar2.f247g;
            if (charSequence3 != null) {
                alertController.mo150e(-1, charSequence3, bVar2.f248h, (Message) null, (Drawable) null);
            }
            CharSequence charSequence4 = bVar2.f249i;
            if (charSequence4 != null) {
                alertController.mo150e(-2, charSequence4, bVar2.f250j, (Message) null, (Drawable) null);
            }
            CharSequence charSequence5 = bVar2.f251k;
            if (charSequence5 != null) {
                alertController.mo150e(-3, charSequence5, bVar2.f252l, (Message) null, (Drawable) null);
            }
            if (bVar2.f255o != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar2.f242b.inflate(alertController.f205L, (ViewGroup) null);
                int i = bVar2.f258r ? alertController.f207N : alertController.f208O;
                ListAdapter listAdapter = bVar2.f255o;
                if (listAdapter == null) {
                    listAdapter = new AlertController.C0058d(bVar2.f241a, i, 16908308, (CharSequence[]) null);
                }
                alertController.f201H = listAdapter;
                alertController.f202I = bVar2.f259s;
                if (bVar2.f256p != null) {
                    recycleListView.setOnItemClickListener(new C0059a(bVar2, alertController));
                }
                if (bVar2.f258r) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f218g = recycleListView;
            }
            int i2 = bVar2.f257q;
            if (i2 != 0) {
                alertController.f219h = null;
                alertController.f220i = i2;
                alertController.f225n = false;
            }
            bVar.setCancelable(this.f264a.f253m);
            if (this.f264a.f253m) {
                bVar.setCanceledOnTouchOutside(true);
            }
            Objects.requireNonNull(this.f264a);
            bVar.setOnCancelListener((DialogInterface.OnCancelListener) null);
            Objects.requireNonNull(this.f264a);
            bVar.setOnDismissListener((DialogInterface.OnDismissListener) null);
            DialogInterface.OnKeyListener onKeyListener = this.f264a.f254n;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }
    }

    public C0060b(Context context, int i) {
        super(context, m101d(context, i));
    }

    /* renamed from: d */
    public static int m101d(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        View view;
        ListAdapter listAdapter;
        View findViewById;
        Button button;
        super.onCreate(bundle);
        AlertController alertController = this.f263g;
        int i = alertController.f204K;
        alertController.f213b.setContentView(alertController.f203J);
        View findViewById2 = alertController.f214c.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view2 = alertController.f219h;
        int i2 = 0;
        if (view2 == null) {
            view2 = alertController.f220i != 0 ? LayoutInflater.from(alertController.f212a).inflate(alertController.f220i, viewGroup, false) : null;
        }
        boolean z2 = view2 != null;
        if (!z2 || !AlertController.m96a(view2)) {
            alertController.f214c.setFlags(EnumBarcodeFormat.BF_GS1_DATABAR_LIMITED, EnumBarcodeFormat.BF_GS1_DATABAR_LIMITED);
        }
        if (z2) {
            FrameLayout frameLayout = (FrameLayout) alertController.f214c.findViewById(R.id.custom);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f225n) {
                frameLayout.setPadding(alertController.f221j, alertController.f222k, alertController.f223l, alertController.f224m);
            }
            if (alertController.f218g != null) {
                ((C0184m0.C0185a) viewGroup.getLayoutParams()).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup d = alertController.mo149d(findViewById6, findViewById3);
        ViewGroup d2 = alertController.mo149d(findViewById7, findViewById4);
        ViewGroup d3 = alertController.mo149d(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) alertController.f214c.findViewById(R.id.scrollView);
        alertController.f194A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.f194A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) d2.findViewById(16908299);
        alertController.f199F = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f217f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.f194A.removeView(alertController.f199F);
                if (alertController.f218g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.f194A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.f194A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.f218g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    d2.setVisibility(8);
                }
            }
        }
        Button button2 = (Button) d3.findViewById(16908313);
        alertController.f226o = button2;
        button2.setOnClickListener(alertController.f211R);
        if (!TextUtils.isEmpty(alertController.f227p) || alertController.f229r != null) {
            alertController.f226o.setText(alertController.f227p);
            Drawable drawable = alertController.f229r;
            if (drawable != null) {
                int i3 = alertController.f215d;
                drawable.setBounds(0, 0, i3, i3);
                alertController.f226o.setCompoundDrawables(alertController.f229r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            alertController.f226o.setVisibility(0);
            z = true;
        } else {
            alertController.f226o.setVisibility(8);
            z = false;
        }
        Button button3 = (Button) d3.findViewById(16908314);
        alertController.f230s = button3;
        button3.setOnClickListener(alertController.f211R);
        if (!TextUtils.isEmpty(alertController.f231t) || alertController.f233v != null) {
            alertController.f230s.setText(alertController.f231t);
            Drawable drawable2 = alertController.f233v;
            if (drawable2 != null) {
                int i4 = alertController.f215d;
                drawable2.setBounds(0, 0, i4, i4);
                alertController.f230s.setCompoundDrawables(alertController.f233v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            alertController.f230s.setVisibility(0);
            z |= true;
        } else {
            alertController.f230s.setVisibility(8);
        }
        Button button4 = (Button) d3.findViewById(16908315);
        alertController.f234w = button4;
        button4.setOnClickListener(alertController.f211R);
        if (!TextUtils.isEmpty(alertController.f235x) || alertController.f237z != null) {
            alertController.f234w.setText(alertController.f235x);
            Drawable drawable3 = alertController.f237z;
            if (drawable3 != null) {
                int i5 = alertController.f215d;
                drawable3.setBounds(0, 0, i5, i5);
                view = null;
                alertController.f234w.setCompoundDrawables(alertController.f237z, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                view = null;
            }
            alertController.f234w.setVisibility(0);
            z |= true;
        } else {
            alertController.f234w.setVisibility(8);
            view = null;
        }
        Context context = alertController.f212a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z) {
                button = alertController.f226o;
            } else if (z) {
                button = alertController.f230s;
            } else if (z) {
                button = alertController.f234w;
            }
            alertController.mo148b(button);
        }
        if (!(z)) {
            d3.setVisibility(8);
        }
        if (alertController.f200G != null) {
            d.addView(alertController.f200G, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.f214c.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.f197D = (ImageView) alertController.f214c.findViewById(16908294);
            if (!(!TextUtils.isEmpty(alertController.f216e)) || !alertController.f209P) {
                alertController.f214c.findViewById(R.id.title_template).setVisibility(8);
                alertController.f197D.setVisibility(8);
                d.setVisibility(8);
            } else {
                TextView textView2 = (TextView) alertController.f214c.findViewById(R.id.alertTitle);
                alertController.f198E = textView2;
                textView2.setText(alertController.f216e);
                int i6 = alertController.f195B;
                if (i6 != 0) {
                    alertController.f197D.setImageResource(i6);
                } else {
                    Drawable drawable4 = alertController.f196C;
                    if (drawable4 != null) {
                        alertController.f197D.setImageDrawable(drawable4);
                    } else {
                        alertController.f198E.setPadding(alertController.f197D.getPaddingLeft(), alertController.f197D.getPaddingTop(), alertController.f197D.getPaddingRight(), alertController.f197D.getPaddingBottom());
                        alertController.f197D.setVisibility(8);
                    }
                }
            }
        }
        boolean z3 = viewGroup.getVisibility() != 8;
        int i7 = (d == null || d.getVisibility() == 8) ? 0 : 1;
        boolean z4 = d3.getVisibility() != 8;
        if (!z4 && (findViewById = d2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i7 != 0) {
            NestedScrollView nestedScrollView2 = alertController.f194A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (alertController.f217f == null && alertController.f218g == null) ? view : d.findViewById(R.id.titleDividerNoCustom);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = d2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        ListView listView = alertController.f218g;
        if (listView instanceof AlertController.RecycleListView) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) listView;
            Objects.requireNonNull(recycleListView);
            if (!z4 || i7 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i7 != 0 ? recycleListView.getPaddingTop() : recycleListView.f238e, recycleListView.getPaddingRight(), z4 ? recycleListView.getPaddingBottom() : recycleListView.f239f);
            }
        }
        if (!z3) {
            View view3 = alertController.f218g;
            if (view3 == null) {
                view3 = alertController.f194A;
            }
            if (view3 != null) {
                if (z4) {
                    i2 = 2;
                }
                View findViewById11 = alertController.f214c.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = alertController.f214c.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
                view3.setScrollIndicators(i7 | i2, 3);
                if (findViewById11 != null) {
                    d2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    d2.removeView(findViewById12);
                }
            }
        }
        ListView listView2 = alertController.f218g;
        if (listView2 != null && (listAdapter = alertController.f201H) != null) {
            listView2.setAdapter(listAdapter);
            int i8 = alertController.f202I;
            if (i8 > -1) {
                listView2.setItemChecked(i8, true);
                listView2.setSelection(i8);
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f263g.f194A;
        if (nestedScrollView != null && nestedScrollView.mo1463l(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f263g.f194A;
        if (nestedScrollView != null && nestedScrollView.mo1463l(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f263g;
        alertController.f216e = charSequence;
        TextView textView = alertController.f198E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
