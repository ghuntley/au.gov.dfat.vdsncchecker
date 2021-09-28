package com.dynamsoft.dce;

public class CameraEnhancerAlgorithm {
    private long m_Instance;

    static {
        System.loadLibrary("DynamsoftCameraEnhancerAndroid");
    }

    public CameraEnhancerAlgorithm() {
        this.m_Instance = 0;
        this.m_Instance = nativeCreateInstance();
    }

    private native Object nativeConsumePkg(String str, String str2, String str3, String str4, String str5);

    private native long nativeCreateInstance();

    private native void nativeDestroyInstance(long j);

    private native int nativeInitLicenseInfo(long j, String str, String str2, String str3);

    private native boolean nativeIsNeedFilter(long j, boolean z);

    private native boolean nativeIsNeedFocus(long j, boolean z);

    private native boolean nativeIsNeedZoom(long j, int i, int i2);

    private native int nativeLoadParamJson(long j, String str);

    private native int nativeLoadParamJsonString(long j, String str);

    private native void nativeSetCurrentFrameData(long j, byte[] bArr, int i, int i2, int i3, int i4, int i5);

    private native void nativeSetSensorValue(long j, float f);

    private native String[] nativeSplitForDLS(byte[] bArr);

    public int LoadParamJsonString(String str) {
        long j = this.m_Instance;
        if (j != 0) {
            return nativeLoadParamJsonString(j, str);
        }
        return -1;
    }

    public Object NativeConsumePkg(String str, String str2, String str3, String str4, String str5) {
        return nativeConsumePkg(str, str2, str3, str4, str5);
    }

    public String[] NativeSplitForDLS(byte[] bArr) {
        return nativeSplitForDLS(bArr);
    }

    public void SetSensorValue(float f) {
        long j = this.m_Instance;
        if (j != 0) {
            nativeSetSensorValue(j, f);
        }
    }

    public void destroy() {
        long j = this.m_Instance;
        if (j != 0) {
            nativeDestroyInstance(j);
        }
        this.m_Instance = 0;
    }

    public void finalize() {
        destroy();
        super.finalize();
    }

    public int initLicenseInfo(String str, String str2, String str3) {
        long j = this.m_Instance;
        if (j != 0) {
            return nativeInitLicenseInfo(j, str, str2, str3);
        }
        return 0;
    }

    public boolean isNeedDecode(boolean z) {
        long j = this.m_Instance;
        if (j != 0) {
            return !nativeIsNeedFilter(j, z);
        }
        return false;
    }

    public boolean isNeedFocus(boolean z) {
        long j = this.m_Instance;
        if (j != 0) {
            return nativeIsNeedFocus(j, z);
        }
        return false;
    }

    public boolean isNeedZoom(int i, int i2) {
        long j = this.m_Instance;
        if (j != 0) {
            return nativeIsNeedZoom(j, i, i2);
        }
        return false;
    }

    public int loadParamJson(String str) {
        long j = this.m_Instance;
        if (j != 0) {
            return nativeLoadParamJson(j, str);
        }
        return -1;
    }

    public void setCurFrameData(byte[] bArr, int i, int i2, int i3, int i4) {
        long j = this.m_Instance;
        if (j != 0) {
            nativeSetCurrentFrameData(j, bArr, i, i2, i3, i4, 3);
        }
    }
}
