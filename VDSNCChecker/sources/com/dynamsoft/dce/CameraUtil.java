package com.dynamsoft.dce;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.WindowManager;
import p117t.C1751e;

public class CameraUtil {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Rect ConvertFrameRegionToViewRegion(android.graphics.Rect r4, android.graphics.Rect r5, int r6, android.util.Size r7) {
        /*
            r0 = 180(0xb4, float:2.52E-43)
            r1 = 90
            if (r6 != r1) goto L_0x001d
            android.graphics.Point r1 = new android.graphics.Point
            int r2 = r5.width()
            int r2 = r2 / 2
            int r3 = r5.height()
            int r3 = r3 / 2
            r1.<init>(r2, r3)
            r2 = 0
        L_0x0018:
            android.graphics.Rect r4 = boundaryRotate(r1, r4, r2)
            goto L_0x004c
        L_0x001d:
            if (r6 != r0) goto L_0x0035
            android.graphics.Point r1 = new android.graphics.Point
            int r2 = r5.width()
            int r2 = r2 / 2
            int r3 = r5.height()
            int r3 = r3 / 2
            r1.<init>(r2, r3)
            android.graphics.Rect r4 = boundaryRotate180(r1, r4)
            goto L_0x004c
        L_0x0035:
            r1 = 270(0x10e, float:3.78E-43)
            if (r6 != r1) goto L_0x004c
            android.graphics.Point r1 = new android.graphics.Point
            int r2 = r5.width()
            int r2 = r2 / 2
            int r3 = r5.height()
            int r3 = r3 / 2
            r1.<init>(r2, r3)
            r2 = 1
            goto L_0x0018
        L_0x004c:
            int r1 = r7.getWidth()
            int r7 = r7.getHeight()
            int r6 = r6 % r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r7 = (float) r7
            float r7 = r7 * r0
            if (r6 != 0) goto L_0x0060
            int r2 = r5.height()
            goto L_0x0064
        L_0x0060:
            int r2 = r5.width()
        L_0x0064:
            float r2 = (float) r2
            float r7 = r7 / r2
            if (r6 != 0) goto L_0x006f
            float r6 = (float) r1
            float r6 = r6 * r0
            int r5 = r5.width()
            goto L_0x0075
        L_0x006f:
            float r6 = (float) r1
            float r6 = r6 * r0
            int r5 = r5.height()
        L_0x0075:
            float r5 = (float) r5
            float r6 = r6 / r5
            int r5 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x007c
            r7 = r6
        L_0x007c:
            int r5 = r4.left
            float r5 = (float) r5
            float r5 = r5 * r7
            int r5 = (int) r5
            int r6 = r4.top
            float r6 = (float) r6
            float r6 = r6 * r7
            int r6 = (int) r6
            int r0 = r4.width()
            float r0 = (float) r0
            float r0 = r0 * r7
            int r0 = (int) r0
            int r4 = r4.height()
            float r4 = (float) r4
            float r4 = r4 * r7
            int r4 = (int) r4
            android.graphics.Rect r7 = new android.graphics.Rect
            int r0 = r0 + r5
            int r4 = r4 + r6
            r7.<init>(r5, r6, r0, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynamsoft.dce.CameraUtil.ConvertFrameRegionToViewRegion(android.graphics.Rect, android.graphics.Rect, int, android.util.Size):android.graphics.Rect");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Rect ConvertViewRegionToVideoFrameRegion(android.graphics.Rect r4, android.graphics.Rect r5, int r6, android.util.Size r7) {
        /*
            r0 = 180(0xb4, float:2.52E-43)
            r1 = 90
            if (r6 != r1) goto L_0x001d
            android.graphics.Point r1 = new android.graphics.Point
            int r2 = r7.getWidth()
            int r2 = r2 / 2
            int r3 = r7.getHeight()
            int r3 = r3 / 2
            r1.<init>(r2, r3)
            r2 = 1
        L_0x0018:
            android.graphics.Rect r4 = boundaryRotate(r1, r4, r2)
            goto L_0x004c
        L_0x001d:
            if (r6 != r0) goto L_0x0035
            android.graphics.Point r1 = new android.graphics.Point
            int r2 = r7.getWidth()
            int r2 = r2 / 2
            int r3 = r7.getHeight()
            int r3 = r3 / 2
            r1.<init>(r2, r3)
            android.graphics.Rect r4 = boundaryRotate180(r1, r4)
            goto L_0x004c
        L_0x0035:
            r1 = 270(0x10e, float:3.78E-43)
            if (r6 != r1) goto L_0x004c
            android.graphics.Point r1 = new android.graphics.Point
            int r2 = r7.getWidth()
            int r2 = r2 / 2
            int r3 = r7.getHeight()
            int r3 = r3 / 2
            r1.<init>(r2, r3)
            r2 = 0
            goto L_0x0018
        L_0x004c:
            int r1 = r7.getWidth()
            int r7 = r7.getHeight()
            int r6 = r6 % r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = r5.height()
            float r2 = (float) r2
            float r2 = r2 * r0
            if (r6 != 0) goto L_0x0061
            float r3 = (float) r7
            goto L_0x0062
        L_0x0061:
            float r3 = (float) r1
        L_0x0062:
            float r2 = r2 / r3
            int r5 = r5.width()
            float r5 = (float) r5
            float r5 = r5 * r0
            if (r6 != 0) goto L_0x006d
            float r6 = (float) r1
            goto L_0x006e
        L_0x006d:
            float r6 = (float) r7
        L_0x006e:
            float r5 = r5 / r6
            int r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x0074
            r2 = r5
        L_0x0074:
            int r5 = r4.left
            float r5 = (float) r5
            float r5 = r5 * r2
            int r5 = (int) r5
            int r6 = r4.top
            float r6 = (float) r6
            float r6 = r6 * r2
            int r6 = (int) r6
            int r7 = r4.width()
            float r7 = (float) r7
            float r7 = r7 * r2
            int r7 = (int) r7
            int r4 = r4.height()
            float r4 = (float) r4
            float r4 = r4 * r2
            int r4 = (int) r4
            android.graphics.Rect r0 = new android.graphics.Rect
            int r7 = r7 + r5
            int r4 = r4 + r6
            r0.<init>(r5, r6, r7, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynamsoft.dce.CameraUtil.ConvertViewRegionToVideoFrameRegion(android.graphics.Rect, android.graphics.Rect, int, android.util.Size):android.graphics.Rect");
    }

    public static Rect boundaryRotate(Point point, Rect rect, boolean z) {
        char c;
        Point point2 = point;
        Rect rect2 = rect;
        float f = (float) point2.x;
        float f2 = (float) point2.y;
        int i = rect2.left;
        int i2 = rect2.top;
        int i3 = rect2.right;
        int i4 = rect2.bottom;
        float[] fArr = {(float) i, (float) i2, (float) i3, (float) i2, (float) i3, (float) i4, (float) i, (float) i4};
        int[] iArr = new int[8];
        if (z) {
            double d = (double) f2;
            iArr[6] = (int) ((Math.sin(1.5707963267948966d) * ((double) (fArr[1] - f2))) + (Math.cos(1.5707963267948966d) * ((double) (fArr[0] - f))) + d);
            double d2 = (double) f;
            iArr[7] = (int) ((Math.cos(1.5707963267948966d) * ((double) (fArr[1] - f2))) + (Math.sin(1.5707963267948966d) * ((double) (-(fArr[0] - f)))) + d2);
            iArr[0] = (int) ((Math.sin(1.5707963267948966d) * ((double) (fArr[3] - f2))) + (Math.cos(1.5707963267948966d) * ((double) (fArr[2] - f))) + d);
            iArr[1] = (int) ((Math.cos(1.5707963267948966d) * ((double) (fArr[3] - f2))) + (Math.sin(1.5707963267948966d) * ((double) (-(fArr[2] - f)))) + d2);
            iArr[2] = (int) ((Math.sin(1.5707963267948966d) * ((double) (fArr[5] - f2))) + (Math.cos(1.5707963267948966d) * ((double) (fArr[4] - f))) + d);
            iArr[3] = (int) ((Math.cos(1.5707963267948966d) * ((double) (fArr[5] - f2))) + (Math.sin(1.5707963267948966d) * ((double) (-(fArr[4] - f)))) + d2);
            iArr[4] = (int) ((Math.sin(1.5707963267948966d) * ((double) (fArr[7] - f2))) + (Math.cos(1.5707963267948966d) * ((double) (fArr[6] - f))) + d);
            iArr[5] = (int) ((Math.cos(1.5707963267948966d) * ((double) (fArr[7] - f2))) + (Math.sin(1.5707963267948966d) * ((double) (-(fArr[6] - f)))) + d2);
            c = 1;
        } else {
            double d3 = (double) f2;
            iArr[2] = (int) (((Math.cos(1.5707963267948966d) * ((double) (fArr[0] - f))) - (Math.sin(1.5707963267948966d) * ((double) (fArr[1] - f2)))) + d3);
            double d4 = (double) f;
            iArr[3] = (int) ((Math.cos(1.5707963267948966d) * ((double) (fArr[1] - f2))) + (Math.sin(1.5707963267948966d) * ((double) (fArr[0] - f))) + d4);
            double d5 = d3;
            iArr[4] = (int) (((Math.cos(1.5707963267948966d) * ((double) (fArr[2] - f))) - (Math.sin(1.5707963267948966d) * ((double) (fArr[3] - f2)))) + d5);
            iArr[5] = (int) ((Math.cos(1.5707963267948966d) * ((double) (fArr[3] - f2))) + (Math.sin(1.5707963267948966d) * ((double) (fArr[2] - f))) + d4);
            iArr[6] = (int) (((Math.cos(1.5707963267948966d) * ((double) (fArr[4] - f))) - (Math.sin(1.5707963267948966d) * ((double) (fArr[5] - f2)))) + d5);
            iArr[7] = (int) ((Math.cos(1.5707963267948966d) * ((double) (fArr[5] - f2))) + (Math.sin(1.5707963267948966d) * ((double) (fArr[4] - f))) + d4);
            iArr[0] = (int) (((Math.cos(1.5707963267948966d) * ((double) (fArr[6] - f))) - (Math.sin(1.5707963267948966d) * ((double) (fArr[7] - f2)))) + d5);
            double sin = Math.sin(1.5707963267948966d);
            c = 1;
            iArr[1] = (int) ((Math.cos(1.5707963267948966d) * ((double) (fArr[7] - f2))) + (sin * ((double) (fArr[6] - f))) + d4);
        }
        return new Rect(iArr[0], iArr[c], iArr[2], iArr[5]);
    }

    public static Rect boundaryRotate180(Point point, Rect rect) {
        float f = (float) point.x;
        float f2 = (float) point.y;
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        float[] fArr = {(float) i, (float) i2, (float) i3, (float) i2, (float) i3, (float) i4, (float) i, (float) i4};
        int[] iArr = new int[8];
        iArr[4] = (int) (f - (fArr[0] - f));
        iArr[5] = (int) (f2 - (fArr[1] - f2));
        iArr[6] = (int) (f - (fArr[2] - f));
        iArr[7] = (int) (f2 - (fArr[3] - f2));
        iArr[0] = (int) (f - (fArr[4] - f));
        iArr[1] = (int) (f2 - (fArr[5] - f2));
        iArr[2] = (int) (f - (fArr[6] - f));
        iArr[3] = (int) (f2 - (fArr[7] - f2));
        return new Rect(iArr[0], iArr[1], iArr[2], iArr[5]);
    }

    public static float clamp(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    public static int clamp(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    public static int getOrientationDisplayOffset(Context context, int i) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i2 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i2 = 90;
            } else if (rotation == 2) {
                i2 = 180;
            } else if (rotation == 3) {
                i2 = 270;
            }
        }
        return ((i - i2) + 360) % 360;
    }

    public static void inlineRectToRectF(RectF rectF, Rect rect) {
        rect.left = Math.round(rectF.left);
        rect.top = Math.round(rectF.top);
        rect.right = Math.round(rectF.right);
        rect.bottom = Math.round(rectF.bottom);
    }

    public static float lerp(float f, float f2, float f3) {
        return C1751e.m4875a(f2, f, f3, f);
    }

    public static PointF normalizedSensorCoordsForNormalizedDisplayCoords(float f, float f2, int i) {
        if (i == 0) {
            return new PointF(f, f2);
        }
        if (i == 90) {
            return new PointF(f2, 1.0f - f);
        }
        if (i == 180) {
            return new PointF(1.0f - f, 1.0f - f2);
        }
        if (i != 270) {
            return null;
        }
        return new PointF(1.0f - f2, f);
    }

    public static Rect rectFToRect(RectF rectF) {
        Rect rect = new Rect();
        inlineRectToRectF(rectF, rect);
        return rect;
    }

    public static RectF rectToRectF(Rect rect) {
        return new RectF((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
    }
}
