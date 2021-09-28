package com.dynamsoft.dce;

import android.graphics.Point;
import java.util.ArrayList;

public class FrameUtil {
    public boolean dependOnWid;
    private float previewScaleX;
    private float previewScaleY;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r5 > r3) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r5 > r4) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        r2.dependOnWid = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void calculatePreviewScale(int r3, int r4, int r5, int r6) {
        /*
            r2 = this;
            r0 = 1
            r1 = 0
            float r5 = (float) r5
            if (r4 <= r3) goto L_0x0013
            float r3 = (float) r3
            float r5 = r5 / r3
            r2.previewScaleX = r5
            float r3 = (float) r6
            float r4 = (float) r4
            float r3 = r3 / r4
            r2.previewScaleY = r3
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0023
            goto L_0x0020
        L_0x0013:
            float r4 = (float) r4
            float r5 = r5 / r4
            r2.previewScaleX = r5
            float r4 = (float) r6
            float r3 = (float) r3
            float r4 = r4 / r3
            r2.previewScaleY = r4
            int r3 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0023
        L_0x0020:
            r2.dependOnWid = r0
            goto L_0x0025
        L_0x0023:
            r2.dependOnWid = r1
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynamsoft.dce.FrameUtil.calculatePreviewScale(int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r5 > r4) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r5 > r3) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        r2.dependOnWid = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void calculatePreviewScaleEx(int r3, int r4, int r5, int r6) {
        /*
            r2 = this;
            r0 = 1
            r1 = 0
            float r5 = (float) r5
            if (r4 <= r3) goto L_0x0013
            float r4 = (float) r4
            float r5 = r5 / r4
            r2.previewScaleX = r5
            float r4 = (float) r6
            float r3 = (float) r3
            float r4 = r4 / r3
            r2.previewScaleY = r4
            int r3 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0023
            goto L_0x0020
        L_0x0013:
            float r3 = (float) r3
            float r5 = r5 / r3
            r2.previewScaleX = r5
            float r3 = (float) r6
            float r4 = (float) r4
            float r3 = r3 / r4
            r2.previewScaleY = r3
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0023
        L_0x0020:
            r2.dependOnWid = r0
            goto L_0x0025
        L_0x0023:
            r2.dependOnWid = r1
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynamsoft.dce.FrameUtil.calculatePreviewScaleEx(int, int, int, int):void");
    }

    public ArrayList<FloatPoint[]> handlePoints(ArrayList<Point> arrayList, int i, int i2) {
        ArrayList<Point> arrayList2 = arrayList;
        ArrayList<FloatPoint[]> arrayList3 = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size() / 4; i3++) {
            FloatPoint[] floatPointArr = new FloatPoint[4];
            FloatPoint floatPoint = new FloatPoint();
            FloatPoint floatPoint2 = new FloatPoint();
            FloatPoint floatPoint3 = new FloatPoint();
            FloatPoint floatPoint4 = new FloatPoint();
            if (this.dependOnWid) {
                int i4 = i3 * 4;
                floatPoint.f2527x = ((float) (i - arrayList2.get(i4).y)) * this.previewScaleX;
                floatPoint.f2528y = ((float) arrayList2.get(i4).x) * this.previewScaleX;
                int i5 = i4 + 1;
                floatPoint2.f2527x = ((float) (i - arrayList2.get(i5).y)) * this.previewScaleX;
                floatPoint2.f2528y = ((float) arrayList2.get(i5).x) * this.previewScaleX;
                int i6 = i4 + 2;
                floatPoint3.f2527x = ((float) (i - arrayList2.get(i6).y)) * this.previewScaleX;
                floatPoint3.f2528y = ((float) arrayList2.get(i6).x) * this.previewScaleX;
                int i7 = i4 + 3;
                floatPoint4.f2527x = ((float) (i - arrayList2.get(i7).y)) * this.previewScaleX;
                floatPoint4.f2528y = ((float) arrayList2.get(i7).x) * this.previewScaleX;
                floatPointArr[0] = floatPoint;
                floatPointArr[1] = floatPoint2;
                floatPointArr[2] = floatPoint3;
                floatPointArr[3] = floatPoint4;
            } else {
                int i8 = i3 * 4;
                floatPoint.f2527x = ((float) (i - arrayList2.get(i8).y)) * this.previewScaleY;
                floatPoint.f2528y = ((float) arrayList2.get(i8).x) * this.previewScaleY;
                int i9 = i8 + 1;
                floatPoint2.f2527x = ((float) (i - arrayList2.get(i9).y)) * this.previewScaleY;
                floatPoint2.f2528y = ((float) arrayList2.get(i9).x) * this.previewScaleY;
                int i10 = i8 + 2;
                floatPoint3.f2527x = ((float) (i - arrayList2.get(i10).y)) * this.previewScaleY;
                floatPoint3.f2528y = ((float) arrayList2.get(i10).x) * this.previewScaleY;
                int i11 = i8 + 3;
                floatPoint4.f2527x = ((float) (i - arrayList2.get(i11).y)) * this.previewScaleY;
                floatPoint4.f2528y = ((float) arrayList2.get(i11).x) * this.previewScaleY;
                floatPointArr[0] = floatPoint;
                floatPointArr[1] = floatPoint2;
                floatPointArr[2] = floatPoint3;
                floatPointArr[3] = floatPoint4;
            }
            arrayList3.add(floatPointArr);
        }
        return arrayList3;
    }

    public ArrayList<FloatPoint[]> rotatePoints180(ArrayList<Point> arrayList, int i, int i2) {
        float f = this.previewScaleX;
        float f2 = this.previewScaleY;
        if (f <= f2) {
            f = f2;
        }
        ArrayList<FloatPoint[]> arrayList2 = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size() / 4; i3++) {
            FloatPoint floatPoint = new FloatPoint();
            FloatPoint floatPoint2 = new FloatPoint();
            FloatPoint floatPoint3 = new FloatPoint();
            FloatPoint floatPoint4 = new FloatPoint();
            int i4 = i3 * 4;
            floatPoint.f2527x = ((float) (i2 - arrayList.get(i4).x)) * f;
            floatPoint.f2528y = ((float) (i - arrayList.get(i4).y)) * f;
            int i5 = i4 + 1;
            floatPoint2.f2527x = ((float) (i2 - arrayList.get(i5).x)) * f;
            floatPoint2.f2528y = ((float) (i - arrayList.get(i5).y)) * f;
            int i6 = i4 + 2;
            floatPoint3.f2527x = ((float) (i2 - arrayList.get(i6).x)) * f;
            floatPoint3.f2528y = ((float) (i - arrayList.get(i6).y)) * f;
            int i7 = i4 + 3;
            floatPoint4.f2527x = ((float) (i2 - arrayList.get(i7).x)) * f;
            floatPoint4.f2528y = ((float) (i - arrayList.get(i7).y)) * f;
            arrayList2.add(new FloatPoint[]{floatPoint, floatPoint2, floatPoint3, floatPoint4});
        }
        return arrayList2;
    }

    public ArrayList<FloatPoint[]> translatePoints(ArrayList<Point> arrayList) {
        float f = this.previewScaleX;
        float f2 = this.previewScaleY;
        if (f <= f2) {
            f = f2;
        }
        ArrayList<FloatPoint[]> arrayList2 = new ArrayList<>();
        for (int i = 0; i < arrayList.size() / 4; i++) {
            FloatPoint floatPoint = new FloatPoint();
            FloatPoint floatPoint2 = new FloatPoint();
            FloatPoint floatPoint3 = new FloatPoint();
            FloatPoint floatPoint4 = new FloatPoint();
            int i2 = i * 4;
            floatPoint.f2527x = ((float) arrayList.get(i2).x) * f;
            floatPoint.f2528y = ((float) arrayList.get(i2).y) * f;
            int i3 = i2 + 1;
            floatPoint2.f2527x = ((float) arrayList.get(i3).x) * f;
            floatPoint2.f2528y = ((float) arrayList.get(i3).y) * f;
            int i4 = i2 + 2;
            floatPoint3.f2527x = ((float) arrayList.get(i4).x) * f;
            floatPoint3.f2528y = ((float) arrayList.get(i4).y) * f;
            int i5 = i2 + 3;
            floatPoint4.f2527x = ((float) arrayList.get(i5).x) * f;
            floatPoint4.f2528y = ((float) arrayList.get(i5).y) * f;
            arrayList2.add(new FloatPoint[]{floatPoint, floatPoint2, floatPoint3, floatPoint4});
        }
        return arrayList2;
    }
}
