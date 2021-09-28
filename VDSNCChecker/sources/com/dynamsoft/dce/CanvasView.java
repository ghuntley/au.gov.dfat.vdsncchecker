package com.dynamsoft.dce;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;

public class CanvasView extends View {
    private int degree;
    private FrameUtil frameUtil;
    private GestureDetector mGestureDetector;
    private boolean mStartOverlay;
    public int paddingBottom;
    public int paddingLeft;
    public int paddingRight;
    public int paddingTop;
    private Paint paint;
    private Path path;
    private float previewScale;
    private ArrayList<FloatPoint[]> rectCoord;
    private int srcHeight;
    private int srcWidth;

    public CanvasView(Context context) {
        super(context);
        this.rectCoord = null;
        this.path = new Path();
        this.mStartOverlay = false;
    }

    public CanvasView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.rectCoord = null;
        this.path = new Path();
        this.mStartOverlay = false;
        Paint paint2 = new Paint();
        this.paint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.paint.setColor(getResources().getColor(C0683R.color.aboutOK));
        this.paint.setAlpha(128);
        this.paint.setAntiAlias(true);
        this.paddingLeft = getPaddingLeft();
        this.paddingTop = getPaddingTop();
        this.paddingRight = getPaddingRight();
        this.paddingBottom = getPaddingBottom();
        this.frameUtil = new FrameUtil();
    }

    public CanvasView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet);
    }

    public void calculatePreviewScale(int i, int i2) {
        this.frameUtil.calculatePreviewScale(i, i2, getWidth(), getHeight());
        if (i > i2) {
            this.srcWidth = i;
            this.srcHeight = i2;
            return;
        }
        this.srcHeight = i;
        this.srcWidth = i2;
    }

    public void calculatePreviewScaleEx(int i, int i2) {
        this.frameUtil.calculatePreviewScaleEx(i, i2, getWidth(), getHeight());
        if (i > i2) {
            this.srcWidth = i;
            this.srcHeight = i2;
            return;
        }
        this.srcHeight = i;
        this.srcWidth = i2;
    }

    public void clear() {
        this.rectCoord = null;
        invalidate();
    }

    public boolean hasGestureDetector() {
        return this.mGestureDetector != null;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList<FloatPoint[]> arrayList = this.rectCoord;
        if (arrayList != null && arrayList.size() > 0) {
            for (int i = 0; i < this.rectCoord.size(); i++) {
                this.path.reset();
                this.path.moveTo(this.rectCoord.get(i)[0].f2527x + ((float) this.paddingLeft), this.rectCoord.get(i)[0].f2528y + ((float) this.paddingTop));
                this.path.lineTo(this.rectCoord.get(i)[1].f2527x + ((float) this.paddingLeft), this.rectCoord.get(i)[1].f2528y + ((float) this.paddingTop));
                this.path.lineTo(this.rectCoord.get(i)[2].f2527x + ((float) this.paddingLeft), this.rectCoord.get(i)[2].f2528y + ((float) this.paddingTop));
                this.path.lineTo(this.rectCoord.get(i)[3].f2527x + ((float) this.paddingLeft), this.rectCoord.get(i)[3].f2528y + ((float) this.paddingTop));
                this.path.close();
                canvas.drawPath(this.path, this.paint);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.mGestureDetector;
        if (gestureDetector == null) {
            return true;
        }
        gestureDetector.onTouchEvent(motionEvent);
        return true;
    }

    public void setBoundaryColor(String str) {
        this.paint.setColor(Color.parseColor(str));
    }

    public void setBoundaryPoints(ArrayList<Point> arrayList, int i) {
        ArrayList<FloatPoint[]> rotatePoints180;
        if (this.mStartOverlay) {
            if (i == 0) {
                calculatePreviewScale(this.srcWidth, this.srcHeight);
                rotatePoints180 = this.frameUtil.handlePoints(arrayList, this.srcHeight, this.srcWidth);
            } else if (i == 1) {
                calculatePreviewScaleEx(this.srcWidth, this.srcHeight);
                rotatePoints180 = this.frameUtil.translatePoints(arrayList);
            } else if (i == 3) {
                calculatePreviewScaleEx(this.srcWidth, this.srcHeight);
                rotatePoints180 = this.frameUtil.rotatePoints180(arrayList, this.srcHeight, this.srcWidth);
            } else {
                return;
            }
            this.rectCoord = rotatePoints180;
        }
    }

    public void setBoundaryThickness(int i) {
        this.paint.setStrokeWidth((float) i);
    }

    public void setCanvasDegree(int i) {
        this.degree = i;
    }

    public void setGestureListener(GestureDetector.OnGestureListener onGestureListener) {
        if (onGestureListener != null) {
            this.mGestureDetector = new GestureDetector(getContext(), onGestureListener);
        } else {
            this.mGestureDetector = null;
        }
    }

    public void setStartOverlay(boolean z) {
        this.mStartOverlay = z;
    }
}
