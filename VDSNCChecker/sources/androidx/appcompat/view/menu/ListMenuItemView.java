package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0084j;
import androidx.appcompat.widget.C0136b1;
import com.dynamsoft.dbr.EnumBarcodeFormat;
import java.util.Objects;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p039g.C0934b;
import p058j0.C1061o;
import p058j0.C1070q;

public class ListMenuItemView extends LinearLayout implements C0084j.C0085a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: e */
    public C0078g f280e;

    /* renamed from: f */
    public ImageView f281f;

    /* renamed from: g */
    public RadioButton f282g;

    /* renamed from: h */
    public TextView f283h;

    /* renamed from: i */
    public CheckBox f284i;

    /* renamed from: j */
    public TextView f285j;

    /* renamed from: k */
    public ImageView f286k;

    /* renamed from: l */
    public ImageView f287l;

    /* renamed from: m */
    public LinearLayout f288m;

    /* renamed from: n */
    public Drawable f289n;

    /* renamed from: o */
    public int f290o;

    /* renamed from: p */
    public Context f291p;

    /* renamed from: q */
    public boolean f292q;

    /* renamed from: r */
    public Drawable f293r;

    /* renamed from: s */
    public boolean f294s;

    /* renamed from: t */
    public LayoutInflater f295t;

    /* renamed from: u */
    public boolean f296u;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0136b1 q = C0136b1.m361q(getContext(), attributeSet, C0934b.f3475q, R.attr.listMenuViewStyle, 0);
        this.f289n = q.mo767g(5);
        this.f290o = q.mo772l(1, -1);
        this.f292q = q.mo761a(7, false);
        this.f291p = context;
        this.f293r = q.mo767g(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f294s = obtainStyledAttributes.hasValue(0);
        q.f692b.recycle();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f295t == null) {
            this.f295t = LayoutInflater.from(getContext());
        }
        return this.f295t;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f286k;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public final void mo187a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
        this.f284i = checkBox;
        LinearLayout linearLayout = this.f288m;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f287l;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f287l.getLayoutParams();
            rect.top = this.f287l.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* renamed from: b */
    public final void mo189b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
        this.f282g = radioButton;
        LinearLayout linearLayout = this.f288m;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    /* renamed from: d */
    public void mo163d(C0078g gVar, int i) {
        String str;
        int i2;
        this.f280e = gVar;
        int i3 = 0;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.f391e);
        setCheckable(gVar.isCheckable());
        boolean m = gVar.mo339m();
        gVar.mo305e();
        if (!m || !this.f280e.mo339m()) {
            i3 = 8;
        }
        if (i3 == 0) {
            TextView textView = this.f285j;
            C0078g gVar2 = this.f280e;
            char e = gVar2.mo305e();
            if (e == 0) {
                str = "";
            } else {
                Resources resources = gVar2.f400n.f356a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(gVar2.f400n.f356a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i4 = gVar2.f400n.mo272n() ? gVar2.f397k : gVar2.f395i;
                C0078g.m181c(sb, i4, EnumBarcodeFormat.BF_GS1_DATABAR_EXPANDED_STACKED, resources.getString(R.string.abc_menu_meta_shortcut_label));
                C0078g.m181c(sb, i4, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                C0078g.m181c(sb, i4, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                C0078g.m181c(sb, i4, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                C0078g.m181c(sb, i4, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                C0078g.m181c(sb, i4, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (e == 8) {
                    i2 = R.string.abc_menu_delete_shortcut_label;
                } else if (e == 10) {
                    i2 = R.string.abc_menu_enter_shortcut_label;
                } else if (e != ' ') {
                    sb.append(e);
                    str = sb.toString();
                } else {
                    i2 = R.string.abc_menu_space_shortcut_label;
                }
                sb.append(resources.getString(i2));
                str = sb.toString();
            }
            textView.setText(str);
        }
        if (this.f285j.getVisibility() != i3) {
            this.f285j.setVisibility(i3);
        }
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.f403q);
    }

    public C0078g getItemData() {
        return this.f280e;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.f289n;
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        setBackground(drawable);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f283h = textView;
        int i = this.f290o;
        if (i != -1) {
            textView.setTextAppearance(this.f291p, i);
        }
        this.f285j = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f286k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f293r);
        }
        this.f287l = (ImageView) findViewById(R.id.group_divider);
        this.f288m = (LinearLayout) findViewById(R.id.content);
    }

    public void onMeasure(int i, int i2) {
        if (this.f281f != null && this.f292q) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f281f.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f282g != null || this.f284i != null) {
            if (this.f280e.mo328h()) {
                if (this.f282g == null) {
                    mo189b();
                }
                compoundButton2 = this.f282g;
                compoundButton = this.f284i;
            } else {
                if (this.f284i == null) {
                    mo187a();
                }
                compoundButton2 = this.f284i;
                compoundButton = this.f282g;
            }
            if (z) {
                compoundButton2.setChecked(this.f280e.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f284i;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f282g;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f280e.mo328h()) {
            if (this.f282g == null) {
                mo189b();
            }
            compoundButton = this.f282g;
        } else {
            if (this.f284i == null) {
                mo187a();
            }
            compoundButton = this.f284i;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f296u = z;
        this.f292q = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f287l;
        if (imageView != null) {
            imageView.setVisibility((this.f294s || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        Objects.requireNonNull(this.f280e.f400n);
        boolean z = this.f296u;
        if (z || this.f292q) {
            ImageView imageView = this.f281f;
            if (imageView != null || drawable != null || this.f292q) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, this, false);
                    this.f281f = imageView2;
                    LinearLayout linearLayout = this.f288m;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.f292q) {
                    ImageView imageView3 = this.f281f;
                    if (!z) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.f281f.getVisibility() != 0) {
                        this.f281f.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f281f.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i;
        if (charSequence != null) {
            this.f283h.setText(charSequence);
            if (this.f283h.getVisibility() != 0) {
                textView = this.f283h;
                i = 0;
            } else {
                return;
            }
        } else {
            i = 8;
            if (this.f283h.getVisibility() != 8) {
                textView = this.f283h;
            } else {
                return;
            }
        }
        textView.setVisibility(i);
    }
}
