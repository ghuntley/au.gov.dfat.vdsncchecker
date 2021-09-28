package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Objects;
import p007au.gov.dfat.vdsncchecker.R;
import p052i0.C1023b;
import p058j0.C1061o;
import p152z1.C2160a0;
import p152z1.C2166d;
import p152z1.C2182n;
import p152z1.C2183o;
import p152z1.C2193t;

public final class MaterialCalendarGridView extends GridView {

    /* renamed from: e */
    public final boolean f2801e;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C2160a0.m5574e();
        if (C2183o.m5607q0(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f2801e = C2183o.m5608r0(getContext(), R.attr.nestedScrollable);
        C1061o.m3034o(this, new C2182n(this));
    }

    /* renamed from: a */
    public C2193t getAdapter() {
        return (C2193t) super.getAdapter();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C2193t a = getAdapter();
        C2166d<?> dVar = a.f6314f;
        a.getItem(a.mo6751b());
        a.getItem(a.mo6753d());
        for (C1023b<Long, Long> requireNonNull : dVar.mo6707e()) {
            Objects.requireNonNull(requireNonNull);
        }
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        int i2;
        if (z) {
            if (i == 33) {
                i2 = getAdapter().mo6753d();
            } else if (i == 130) {
                i2 = getAdapter().mo6751b();
            } else {
                super.onFocusChanged(true, i, rect);
                return;
            }
            setSelection(i2);
            return;
        }
        super.onFocusChanged(false, i, rect);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().mo6751b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().mo6751b());
        return true;
    }

    public void onMeasure(int i, int i2) {
        if (this.f2801e) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C2193t) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), C2193t.class.getCanonicalName()}));
        }
    }

    public void setSelection(int i) {
        if (i < getAdapter().mo6751b()) {
            i = getAdapter().mo6751b();
        }
        super.setSelection(i);
    }
}
