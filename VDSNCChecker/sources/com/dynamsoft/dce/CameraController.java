package com.dynamsoft.dce;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public abstract class CameraController {
    public abstract int addCameraListener(CameraListener cameraListener);

    public abstract void addCameraView(CameraView cameraView);

    public abstract int addTorchListener(TorchListener torchListener);

    public abstract int enableAutoFocusOnSharpnessChange(boolean z);

    public abstract int enableAutoZoom(boolean z);

    public abstract int enableDCEAutoFocus(boolean z);

    public abstract void enableDefaultAutoFocus(boolean z);

    public abstract int enableFastMode(boolean z);

    public abstract int enableFrameFilter(boolean z);

    public abstract int enableRegularAutoFocus(boolean z);

    public abstract int enableSensorControl(boolean z);

    public abstract CameraState getCameraCurrentState();

    public abstract CameraState getCameraDesireState();

    public abstract CameraPosition getCameraPosition();

    public abstract int getDeviceLevel();

    public abstract boolean getEnabledAutoFocusOnSharpnessChangeStatus();

    public abstract boolean getEnabledAutoZoomStatus();

    public abstract boolean getEnabledDCEAutoFocusStatus();

    public abstract boolean getEnabledDefaultAutoFocusStatus();

    public abstract boolean getEnabledFastModeStatus();

    public abstract boolean getEnabledFrameFilterStatus();

    public abstract boolean getEnabledRegularAutoFocusStatus();

    public abstract boolean getEnabledSensorControlStatus();

    public abstract Size getResolution();

    public abstract List<Size> getResolutionList();

    public abstract TorchState getTorchCurrentState();

    public abstract TorchState getTorchDesiredState();

    public abstract String getVersion();

    public abstract void initLicenseFromDLS(DMDLSConnectionParameters dMDLSConnectionParameters, CameraDLSLicenseVerificationListener cameraDLSLicenseVerificationListener);

    public abstract void pauseCamera();

    public abstract void removeCameraListener();

    public abstract void resumeCamera();

    public abstract void setAutoFocusPosition(float f, float f2);

    public abstract void setAutoModeLevelParam(int i, int i2, int i3, int i4);

    public abstract int setCameraDesiredState(CameraState cameraState);

    public abstract int setFocalLength(float f);

    public abstract int setManualFocusPosition(int i, int i2);

    public abstract int setMaxFrameRate(int i);

    public abstract int setRegularAutoFocusParam(int i, int i2);

    public abstract void setResolution(Resolution resolution);

    public abstract void setResultPoints(ArrayList<Point> arrayList);

    public abstract int setSensorControlThreshold(int i);

    public abstract int setTorchDesiredState(TorchState torchState);

    public abstract void setZoomFactor(float f);

    public abstract void setZoomRegion(Rect rect, int i);

    public abstract void startScanning();

    public abstract void stopScanning();

    public abstract int switchCameraPosition(CameraPosition cameraPosition);

    public abstract void updateCameraSetting(String str);

    public abstract void updateCameraSetting(JSONObject jSONObject);
}
