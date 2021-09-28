package com.dynamsoft.dbr;

public class DBRUUID {
    public String deviceId;
    public boolean ifSoft;

    public DBRUUID(String str, boolean z) {
        this.deviceId = str;
        this.ifSoft = z;
    }
}
