package com.dynamsoft.dce;

public enum CameraPosition {
    CAMERA_POSITION_USER(0),
    CAMERA_POSITION_WORLD(1);
    
    public static final CameraPosition DEFAULT = null;
    private int value;

    /* access modifiers changed from: public */
    static {
        CameraPosition cameraPosition;
        DEFAULT = cameraPosition;
    }

    private CameraPosition(int i) {
        this.value = i;
    }

    public static CameraPosition fromValue(int i) {
        for (CameraPosition cameraPosition : values()) {
            if (cameraPosition.value == i) {
                return cameraPosition;
            }
        }
        return null;
    }
}
