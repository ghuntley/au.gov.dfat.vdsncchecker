package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p058j0.C1061o;
import p058j0.C1070q;
import p083n1.C1455a;

public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: e */
    public TextView f2886e;

    /* renamed from: f */
    public Button f2887f;

    /* renamed from: g */
    public int f2888g;

    /* renamed from: h */
    public int f2889h;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1455a.f4588z);
        this.f2888g = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f2889h = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final boolean mo3764a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f2886e.getPaddingTop() == i2 && this.f2886e.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f2886e;
        WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.f2887f;
    }

    public TextView getMessageView() {
        return this.f2886e;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2886e = (TextView) findViewById(R.id.snackbar_text);
        this.f2887f = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        if (mo3764a(1, r0, r0 - r1) != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (mo3764a(0, r0, r0) != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f2888g
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f2888g
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            r1 = 2131099786(0x7f06008a, float:1.7811935E38)
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            r2 = 2131099785(0x7f060089, float:1.7811933E38)
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f2886e
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003e
            r2 = r4
            goto L_0x003f
        L_0x003e:
            r2 = r3
        L_0x003f:
            if (r2 == 0) goto L_0x0058
            int r5 = r7.f2889h
            if (r5 <= 0) goto L_0x0058
            android.widget.Button r5 = r7.f2887f
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f2889h
            if (r5 <= r6) goto L_0x0058
            int r1 = r0 - r1
            boolean r0 = r7.mo3764a(r4, r0, r1)
            if (r0 == 0) goto L_0x0063
            goto L_0x0062
        L_0x0058:
            if (r2 == 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r0 = r1
        L_0x005c:
            boolean r0 = r7.mo3764a(r3, r0, r0)
            if (r0 == 0) goto L_0x0063
        L_0x0062:
            r3 = r4
        L_0x0063:
            if (r3 == 0) goto L_0x0068
            super.onMeasure(r8, r9)
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.f2889h = i;
    }
}
