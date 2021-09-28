package com.dynamsoft.dce;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.MeteringRectangle;

public class AutoFocusHelper {
    private static final int CAMERA2_REGION_WEIGHT = ((int) CameraUtil.lerp(0.0f, 1000.0f, 0.1225f));
    public static final float METERING_REGION_FRACTION = 0.1225f;
    private static final MeteringRectangle[] ZERO_WEIGHT_3A_REGION = {new MeteringRectangle(0, 0, 0, 0, 0)};

    public static MeteringRectangle[] aeRegionsForNormalizedCoord(float f, float f2, Rect rect, int i) {
        return regionsForNormalizedCoord(f, f2, 0.1225f, rect, i);
    }

    public static MeteringRectangle[] afRegionsForNormalizedCoord(float f, float f2, Rect rect, int i) {
        return regionsForNormalizedCoord(f, f2, 0.1225f, rect, i);
    }

    public static Rect cropRegionForZoom(CameraCharacteristics cameraCharacteristics, float f) {
        Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        int width = rect.width() / 2;
        int height = rect.height() / 2;
        int width2 = (int) ((((float) rect.width()) * 0.5f) / f);
        int height2 = (int) ((((float) rect.height()) * 0.5f) / f);
        return new Rect(width - width2, height - height2, width + width2, height + height2);
    }

    public static MeteringRectangle[] getZeroWeightRegion() {
        return ZERO_WEIGHT_3A_REGION;
    }

    private static MeteringRectangle[] regionsForNormalizedCoord(float f, float f2, float f3, Rect rect, int i) {
        int min = (int) (f3 * 0.5f * ((float) Math.min(rect.width(), rect.height())));
        PointF normalizedSensorCoordsForNormalizedDisplayCoords = CameraUtil.normalizedSensorCoordsForNormalizedDisplayCoords(f, f2, i);
        int width = (int) ((normalizedSensorCoordsForNormalizedDisplayCoords.x * ((float) rect.width())) + ((float) rect.left));
        int height = (int) ((normalizedSensorCoordsForNormalizedDisplayCoords.y * ((float) rect.height())) + ((float) rect.top));
        Rect rect2 = new Rect(width - min, height - min, width + min, height + min);
        rect2.left = CameraUtil.clamp(rect2.left, rect.left, rect.right);
        rect2.top = CameraUtil.clamp(rect2.top, rect.top, rect.bottom);
        rect2.right = CameraUtil.clamp(rect2.right, rect.left, rect.right);
        rect2.bottom = CameraUtil.clamp(rect2.bottom, rect.top, rect.bottom);
        return new MeteringRectangle[]{new MeteringRectangle(rect2, CAMERA2_REGION_WEIGHT)};
    }
}
