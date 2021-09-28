package com.dynamsoft.dbr;

public class BarcodeReaderException extends Exception {
    public int errorCode = EnumErrorCode.DBR_UNKNOWN;

    public BarcodeReaderException() {
    }

    public BarcodeReaderException(int i, String str) {
        super(str);
        this.errorCode = i;
    }

    public BarcodeReaderException(int i, String str, Throwable th) {
        super(str, th);
        this.errorCode = i;
    }

    public BarcodeReaderException(String str) {
        super(str);
    }

    public BarcodeReaderException(String str, Throwable th) {
        super(str, th);
    }

    public int getErrorCode() {
        return this.errorCode;
    }
}
