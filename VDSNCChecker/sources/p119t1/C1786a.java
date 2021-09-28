package p119t1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p058j0.C1061o;
import p058j0.C1070q;
import p060j2.C1091a;
import p072l2.C1242f;
import p072l2.C1247i;
import p072l2.C1261m;
import p136w0.C2036r;

/* renamed from: t1.a */
public class C1786a {

    /* renamed from: a */
    public final MaterialButton f5420a;

    /* renamed from: b */
    public C1247i f5421b;

    /* renamed from: c */
    public int f5422c;

    /* renamed from: d */
    public int f5423d;

    /* renamed from: e */
    public int f5424e;

    /* renamed from: f */
    public int f5425f;

    /* renamed from: g */
    public int f5426g;

    /* renamed from: h */
    public int f5427h;

    /* renamed from: i */
    public PorterDuff.Mode f5428i;

    /* renamed from: j */
    public ColorStateList f5429j;

    /* renamed from: k */
    public ColorStateList f5430k;

    /* renamed from: l */
    public ColorStateList f5431l;

    /* renamed from: m */
    public Drawable f5432m;

    /* renamed from: n */
    public boolean f5433n = false;

    /* renamed from: o */
    public boolean f5434o = false;

    /* renamed from: p */
    public boolean f5435p = false;

    /* renamed from: q */
    public boolean f5436q;

    /* renamed from: r */
    public LayerDrawable f5437r;

    /* renamed from: s */
    public int f5438s;

    public C1786a(MaterialButton materialButton, C1247i iVar) {
        this.f5420a = materialButton;
        this.f5421b = iVar;
    }

    /* renamed from: a */
    public C1261m mo6068a() {
        LayerDrawable layerDrawable = this.f5437r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (C1261m) (this.f5437r.getNumberOfLayers() > 2 ? this.f5437r.getDrawable(2) : this.f5437r.getDrawable(1));
    }

    /* renamed from: b */
    public C1242f mo6069b() {
        return mo6070c(false);
    }

    /* renamed from: c */
    public final C1242f mo6070c(boolean z) {
        LayerDrawable layerDrawable = this.f5437r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C1242f) ((LayerDrawable) ((InsetDrawable) this.f5437r.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
    }

    /* renamed from: d */
    public final C1242f mo6071d() {
        return mo6070c(true);
    }

    /* renamed from: e */
    public void mo6072e(C1247i iVar) {
        this.f5421b = iVar;
        if (mo6069b() != null) {
            C1242f b = mo6069b();
            b.f4164e.f4187a = iVar;
            b.invalidateSelf();
        }
        if (mo6071d() != null) {
            C1242f d = mo6071d();
            d.f4164e.f4187a = iVar;
            d.invalidateSelf();
        }
        if (mo6068a() != null) {
            mo6068a().setShapeAppearanceModel(iVar);
        }
    }

    /* renamed from: f */
    public final void mo6073f(int i, int i2) {
        MaterialButton materialButton = this.f5420a;
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = this.f5420a.getPaddingTop();
        int paddingEnd = this.f5420a.getPaddingEnd();
        int paddingBottom = this.f5420a.getPaddingBottom();
        int i3 = this.f5424e;
        int i4 = this.f5425f;
        this.f5425f = i2;
        this.f5424e = i;
        if (!this.f5434o) {
            mo6074g();
        }
        this.f5420a.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    /* renamed from: g */
    public final void mo6074g() {
        MaterialButton materialButton = this.f5420a;
        C1242f fVar = new C1242f(this.f5421b);
        fVar.mo4973n(this.f5420a.getContext());
        fVar.setTintList(this.f5429j);
        PorterDuff.Mode mode = this.f5428i;
        if (mode != null) {
            fVar.setTintMode(mode);
        }
        fVar.mo4979s((float) this.f5427h, this.f5430k);
        C1242f fVar2 = new C1242f(this.f5421b);
        fVar2.setTint(0);
        fVar2.mo4978r((float) this.f5427h, this.f5433n ? C2036r.m5365c(this.f5420a, R.attr.colorSurface) : 0);
        C1242f fVar3 = new C1242f(this.f5421b);
        this.f5432m = fVar3;
        fVar3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(C1091a.m3114a(this.f5431l), new InsetDrawable(new LayerDrawable(new Drawable[]{fVar2, fVar}), this.f5422c, this.f5424e, this.f5423d, this.f5425f), this.f5432m);
        this.f5437r = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C1242f b = mo6069b();
        if (b != null) {
            b.mo4974o((float) this.f5438s);
        }
    }

    /* renamed from: h */
    public final void mo6075h() {
        C1242f b = mo6069b();
        C1242f d = mo6071d();
        if (b != null) {
            b.mo4979s((float) this.f5427h, this.f5430k);
            if (d != null) {
                d.mo4978r((float) this.f5427h, this.f5433n ? C2036r.m5365c(this.f5420a, R.attr.colorSurface) : 0);
            }
        }
    }
}
