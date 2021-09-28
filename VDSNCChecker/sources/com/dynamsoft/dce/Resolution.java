package com.dynamsoft.dce;

public enum Resolution {
    RESOLUTION_AUTO(0),
    RESOLUTION_480P(1),
    RESOLUTION_720P(2),
    RESOLUTION_1080P(3),
    RESOLUTION_2K(4),
    RESOLUTION_4K(5);
    
    public static final Resolution DEFALUT = null;
    private int value;

    /* access modifiers changed from: public */
    static {
        Resolution resolution;
        DEFALUT = resolution;
    }

    private Resolution(int i) {
        this.value = i;
    }

    public static Resolution fromValue(int i) {
        for (Resolution resolution : values()) {
            if (resolution.value == i) {
                return resolution;
            }
        }
        return null;
    }
}
