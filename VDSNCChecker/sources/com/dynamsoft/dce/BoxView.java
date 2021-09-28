package com.dynamsoft.dce;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

public class BoxView extends RelativeLayout {
    private int borderColor;
    private FrameLayout boxView;
    private int boxViewHeight;
    private int boxViewWidth;
    private int cornerColor;
    private int cornerLength;
    private int cornerOffset;
    private int cornerSize;
    private int maskColor;

    public BoxView(Context context) {
        super(context);
        initialize(context, (AttributeSet) null, 0, 0);
    }

    public BoxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context, attributeSet, 0, 0);
    }

    public BoxView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(context, attributeSet, i, 0);
    }

    @SuppressLint({"NewApi"})
    public BoxView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initialize(context, attributeSet, i, i2);
    }

    private void initialize(Context context, AttributeSet attributeSet, int i, int i2) {
        RelativeLayout.inflate(context, C0683R.layout.layout_box_view, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0683R.styleable.BoxView, i, 0);
        Resources resources = getResources();
        int i3 = C0683R.styleable.BoxView_boxViewCornerColor;
        this.maskColor = obtainStyledAttributes.getColor(i3, resources.getColor(C0683R.color.box_view_mask, (Resources.Theme) null));
        this.cornerColor = obtainStyledAttributes.getColor(i3, resources.getColor(C0683R.color.box_view_corner, (Resources.Theme) null));
        this.borderColor = obtainStyledAttributes.getColor(C0683R.styleable.BoxView_boxViewBorderColor, resources.getColor(C0683R.color.box_view_border, (Resources.Theme) null));
        this.cornerOffset = obtainStyledAttributes.getInt(C0683R.styleable.BoxView_boxViewCornerOffset, (int) resources.getDimension(C0683R.dimen.size_qr_box_view_corner_offset));
        this.cornerLength = obtainStyledAttributes.getInt(C0683R.styleable.BoxView_boxViewCornerLength, (int) resources.getDimension(C0683R.dimen.length_qr_box_view_corner));
        this.cornerSize = obtainStyledAttributes.getInt(C0683R.styleable.BoxView_boxViewCornerSize, (int) resources.getDimension(C0683R.dimen.size_qr_box_view_corner));
        this.boxViewWidth = obtainStyledAttributes.getInt(C0683R.styleable.BoxView_boxViewWidth, (int) resources.getDimension(C0683R.dimen.width_qr_box_view));
        this.boxViewHeight = obtainStyledAttributes.getInt(C0683R.styleable.BoxView_boxViewHeight, (int) resources.getDimension(C0683R.dimen.height_qr_box_view));
        obtainStyledAttributes.recycle();
        this.boxView = (FrameLayout) findViewById(C0683R.C0685id.fl_box_view);
    }

    public void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        float x = this.boxView.getX();
        float y = this.boxView.getY();
        Paint paint = new Paint(1);
        paint.setColor(this.maskColor);
        canvas.drawRect(0.0f, y, x, y + ((float) this.boxViewHeight), paint);
        float f = (float) width;
        Canvas canvas2 = canvas;
        float f2 = f;
        Paint paint2 = paint;
        canvas2.drawRect(x + ((float) this.boxViewWidth), y, f2, y + ((float) this.boxViewHeight), paint2);
        canvas2.drawRect(0.0f, 0.0f, f2, y, paint2);
        Canvas canvas3 = canvas;
        Paint paint3 = paint;
        canvas3.drawRect(0.0f, y + ((float) this.boxViewHeight), f, (float) height, paint3);
        paint.setColor(this.borderColor);
        float f3 = x;
        float f4 = y;
        canvas3.drawLine(f3, f4, x + ((float) this.boxViewWidth), y, paint3);
        float f5 = x;
        canvas3.drawLine(f3, f4, f5, y + ((float) this.boxViewHeight), paint3);
        float f6 = x + ((float) this.boxViewWidth);
        int i = this.boxViewHeight;
        canvas3.drawLine(f6, y + ((float) i), f5, y + ((float) i), paint3);
        int i2 = this.boxViewWidth;
        canvas.drawLine(x + ((float) i2), y + ((float) this.boxViewHeight), x + ((float) i2), y, paint2);
        Rect rect = new Rect();
        int i3 = (int) x;
        int i4 = (int) y;
        rect.set(i3, i4, this.boxViewWidth + i3, this.boxViewHeight + i4);
        paint.setColor(this.cornerColor);
        int i5 = rect.left;
        int i6 = this.cornerSize;
        int i7 = this.cornerOffset;
        int i8 = rect.top;
        Paint paint4 = paint;
        canvas.drawRect((float) ((i5 - i6) + i7), (float) ((i8 - i6) + i7), (float) (((i5 + this.cornerLength) - i6) + i7), (float) (i8 + i7), paint4);
        int i9 = rect.left;
        int i10 = this.cornerSize;
        int i11 = this.cornerOffset;
        int i12 = rect.top;
        canvas.drawRect((float) ((i9 - i10) + i11), (float) ((i12 - i10) + i11), (float) (i9 + i11), (float) (((i12 + this.cornerLength) - i10) + i11), paint4);
        int i13 = rect.right;
        int i14 = this.cornerSize;
        int i15 = this.cornerOffset;
        int i16 = rect.top;
        canvas.drawRect((float) (((i13 - this.cornerLength) + i14) - i15), (float) ((i16 - i14) + i15), (float) ((i13 + i14) - i15), (float) (i16 + i15), paint4);
        int i17 = rect.right;
        int i18 = this.cornerOffset;
        int i19 = rect.top;
        int i20 = this.cornerSize;
        canvas.drawRect((float) (i17 - i18), (float) ((i19 - i20) + i18), (float) ((i17 + i20) - i18), (float) (((i19 + this.cornerLength) - i20) + i18), paint4);
        int i21 = rect.left;
        int i22 = this.cornerSize;
        int i23 = this.cornerOffset;
        int i24 = rect.bottom;
        canvas.drawRect((float) ((i21 - i22) + i23), (float) (i24 - i23), (float) (((i21 + this.cornerLength) - i22) + i23), (float) ((i24 + i22) - i23), paint4);
        int i25 = rect.left;
        int i26 = this.cornerSize;
        int i27 = this.cornerOffset;
        int i28 = rect.bottom;
        canvas.drawRect((float) ((i25 - i26) + i27), (float) (((i28 - this.cornerLength) + i26) - i27), (float) (i25 + i27), (float) ((i28 + i26) - i27), paint4);
        int i29 = rect.right;
        int i30 = this.cornerSize;
        int i31 = this.cornerOffset;
        int i32 = rect.bottom;
        canvas.drawRect((float) (((i29 - this.cornerLength) + i30) - i31), (float) (i32 - i31), (float) ((i29 + i30) - i31), (float) ((i32 + i30) - i31), paint4);
        int i33 = rect.right;
        int i34 = this.cornerOffset;
        int i35 = rect.bottom;
        int i36 = this.cornerSize;
        Canvas canvas4 = canvas;
        canvas4.drawRect((float) (i33 - i34), (float) (((i35 - this.cornerLength) + i36) - i34), (float) ((i33 + i36) - i34), (float) ((i35 + i36) - i34), paint4);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public void reSetboxview(int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.boxView.getLayoutParams());
        marginLayoutParams.setMargins(i, i2, i + i3, i2 + i4);
        this.boxViewWidth = i3;
        this.boxViewHeight = i4;
        this.boxView.setLayoutParams(new RelativeLayout.LayoutParams(marginLayoutParams));
        setBackgroundResource(C0683R.color.box_view_transparent);
    }
}
