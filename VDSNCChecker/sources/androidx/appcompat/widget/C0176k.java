package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import androidx.appcompat.widget.C0201r0;
import p007au.gov.dfat.vdsncchecker.R;
import p016c0.C0557a;
import p051i.C1021a;

/* renamed from: androidx.appcompat.widget.k */
public final class C0176k {

    /* renamed from: b */
    public static final PorterDuff.Mode f823b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static C0176k f824c;

    /* renamed from: a */
    public C0201r0 f825a;

    /* renamed from: androidx.appcompat.widget.k$a */
    public class C0177a implements C0201r0.C0204c {

        /* renamed from: a */
        public final int[] f826a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        public final int[] f827b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        public final int[] f828c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, 2131165207, R.drawable.abc_text_cursor_material, 2131165260, 2131165261, 2131165262};

        /* renamed from: d */
        public final int[] f829d = {2131165239, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        public final int[] f830e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* renamed from: f */
        public final int[] f831f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        /* renamed from: a */
        public final boolean mo980a(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final ColorStateList mo981b(Context context, int i) {
            int c = C0216w0.m571c(context, R.attr.colorControlHighlight);
            int b = C0216w0.m570b(context, R.attr.colorButtonNormal);
            return new ColorStateList(new int[][]{C0216w0.f967b, C0216w0.f969d, C0216w0.f968c, C0216w0.f971f}, new int[]{b, C0557a.m1817a(c, i), C0557a.m1817a(c, i), i});
        }

        /* renamed from: c */
        public final LayerDrawable mo982c(C0201r0 r0Var, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable e = r0Var.mo1112e(context, R.drawable.abc_star_black_48dp);
            Drawable e2 = r0Var.mo1112e(context, R.drawable.abc_star_half_black_48dp);
            if ((e instanceof BitmapDrawable) && e.getIntrinsicWidth() == dimensionPixelSize && e.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) e;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                e.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                e.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((e2 instanceof BitmapDrawable) && e2.getIntrinsicWidth() == dimensionPixelSize && e2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) e2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                e2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                e2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        /* renamed from: d */
        public ColorStateList mo983d(Context context, int i) {
            if (i == R.drawable.abc_edit_text_material) {
                ThreadLocal<TypedValue> threadLocal = C1021a.f3740a;
                return context.getColorStateList(R.color.abc_tint_edittext);
            } else if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                ThreadLocal<TypedValue> threadLocal2 = C1021a.f3740a;
                return context.getColorStateList(R.color.abc_tint_switch_track);
            } else if (i == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                ColorStateList d = C0216w0.m572d(context, R.attr.colorSwitchThumbNormal);
                if (d == null || !d.isStateful()) {
                    iArr[0] = C0216w0.f967b;
                    iArr2[0] = C0216w0.m570b(context, R.attr.colorSwitchThumbNormal);
                    iArr[1] = C0216w0.f970e;
                    iArr2[1] = C0216w0.m571c(context, R.attr.colorControlActivated);
                    iArr[2] = C0216w0.f971f;
                    iArr2[2] = C0216w0.m571c(context, R.attr.colorSwitchThumbNormal);
                } else {
                    iArr[0] = C0216w0.f967b;
                    iArr2[0] = d.getColorForState(iArr[0], 0);
                    iArr[1] = C0216w0.f970e;
                    iArr2[1] = C0216w0.m571c(context, R.attr.colorControlActivated);
                    iArr[2] = C0216w0.f971f;
                    iArr2[2] = d.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return mo981b(context, C0216w0.m571c(context, R.attr.colorButtonNormal));
            } else {
                if (i == R.drawable.abc_btn_borderless_material) {
                    return mo981b(context, 0);
                }
                if (i == R.drawable.abc_btn_colored_material) {
                    return mo981b(context, C0216w0.m571c(context, R.attr.colorAccent));
                }
                if (i == 2131165251 || i == R.drawable.abc_spinner_textfield_background_material) {
                    ThreadLocal<TypedValue> threadLocal3 = C1021a.f3740a;
                    return context.getColorStateList(R.color.abc_tint_spinner);
                } else if (mo980a(this.f827b, i)) {
                    return C0216w0.m572d(context, R.attr.colorControlNormal);
                } else {
                    if (mo980a(this.f830e, i)) {
                        ThreadLocal<TypedValue> threadLocal4 = C1021a.f3740a;
                        return context.getColorStateList(R.color.abc_tint_default);
                    } else if (mo980a(this.f831f, i)) {
                        ThreadLocal<TypedValue> threadLocal5 = C1021a.f3740a;
                        return context.getColorStateList(R.color.abc_tint_btn_checkable);
                    } else if (i != R.drawable.abc_seekbar_thumb_material) {
                        return null;
                    } else {
                        ThreadLocal<TypedValue> threadLocal6 = C1021a.f3740a;
                        return context.getColorStateList(R.color.abc_tint_seek_thumb);
                    }
                }
            }
        }

        /* renamed from: e */
        public final void mo984e(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (C0169i0.m487a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0176k.f823b;
            }
            drawable.setColorFilter(C0176k.m497c(i, mode));
        }
    }

    /* renamed from: a */
    public static synchronized C0176k m496a() {
        C0176k kVar;
        synchronized (C0176k.class) {
            if (f824c == null) {
                m498e();
            }
            kVar = f824c;
        }
        return kVar;
    }

    /* renamed from: c */
    public static synchronized PorterDuffColorFilter m497c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter g;
        synchronized (C0176k.class) {
            g = C0201r0.m545g(i, mode);
        }
        return g;
    }

    /* renamed from: e */
    public static synchronized void m498e() {
        synchronized (C0176k.class) {
            if (f824c == null) {
                C0176k kVar = new C0176k();
                f824c = kVar;
                kVar.f825a = C0201r0.m544c();
                C0201r0 r0Var = f824c.f825a;
                C0177a aVar = new C0177a();
                synchronized (r0Var) {
                    r0Var.f922g = aVar;
                }
            }
        }
    }

    /* renamed from: f */
    public static void m499f(Drawable drawable, C0232z0 z0Var, int[] iArr) {
        PorterDuff.Mode mode = C0201r0.f913h;
        if (!C0169i0.m487a(drawable) || drawable.mutate() == drawable) {
            boolean z = z0Var.f1007d;
            if (z || z0Var.f1006c) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = z ? z0Var.f1004a : null;
                PorterDuff.Mode mode2 = z0Var.f1006c ? z0Var.f1005b : C0201r0.f913h;
                if (!(colorStateList == null || mode2 == null)) {
                    porterDuffColorFilter = C0201r0.m545g(colorStateList.getColorForState(iArr, 0), mode2);
                }
                drawable.setColorFilter(porterDuffColorFilter);
                return;
            }
            drawable.clearColorFilter();
        }
    }

    /* renamed from: b */
    public synchronized Drawable mo978b(Context context, int i) {
        return this.f825a.mo1112e(context, i);
    }

    /* renamed from: d */
    public synchronized ColorStateList mo979d(Context context, int i) {
        return this.f825a.mo1114h(context, i);
    }
}
