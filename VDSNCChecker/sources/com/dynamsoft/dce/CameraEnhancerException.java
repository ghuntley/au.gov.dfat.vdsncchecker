package com.dynamsoft.dce;

import com.dynamsoft.dbr.EnumErrorCode;

public class CameraEnhancerException extends RuntimeException {
    public int errorCode = EnumErrorCode.DBR_UNKNOWN;

    public CameraEnhancerException() {
    }

    public CameraEnhancerException(int i, String str) {
        super(str);
        this.errorCode = i;
    }

    public CameraEnhancerException(int i, String str, Throwable th) {
        super(str, th);
        this.errorCode = i;
    }

    public CameraEnhancerException(Exception exc) {
        exc.printStackTrace();
    }

    public CameraEnhancerException(String str) {
        super(str);
    }

    public CameraEnhancerException(String str, Throwable th) {
        super(str, th);
    }

    public int getErrorCode() {
        return this.errorCode;
    }
}
