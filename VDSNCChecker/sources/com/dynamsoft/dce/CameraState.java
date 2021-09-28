package com.dynamsoft.dce;

public enum CameraState {
    CAMERA_STATE_OFF(0),
    CAMERA_STATE_ON(1);
    
    public static final CameraState DEFAULT = null;
    private int value;

    /* access modifiers changed from: public */
    static {
        CameraState cameraState;
        DEFAULT = cameraState;
    }

    private CameraState(int i) {
        this.value = i;
    }

    public static CameraState fromValue(int i) {
        for (CameraState cameraState : values()) {
            if (cameraState.value == i) {
                return cameraState;
            }
        }
        return null;
    }
}
