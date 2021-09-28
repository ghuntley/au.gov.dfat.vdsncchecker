package com.dynamsoft.dce;

public class CameraUUID {
    public String deviceId;
    public boolean ifSoft;

    public CameraUUID(String str, boolean z) {
        this.deviceId = str;
        this.ifSoft = z;
    }
}
