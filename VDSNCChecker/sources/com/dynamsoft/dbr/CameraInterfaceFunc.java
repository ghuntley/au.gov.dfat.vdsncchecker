package com.dynamsoft.dbr;

import android.graphics.Point;
import android.graphics.Rect;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class CameraInterfaceFunc {
    private Object mInstance;

    public CameraInterfaceFunc(Object obj) {
        this.mInstance = obj;
    }

    public FrameInterfaceFunc AcquireListFrame(boolean z) {
        try {
            Object invoke = this.mInstance.getClass().getMethod("AcquireListFrame", new Class[]{Boolean.TYPE}).invoke(this.mInstance, new Object[]{Boolean.valueOf(z)});
            if (invoke == null) {
                return null;
            }
            return new FrameInterfaceFunc(invoke);
        } catch (Exception unused) {
            return null;
        }
    }

    public void SetBoxViewByRegionDefinition(RegionDefinition regionDefinition) {
        try {
            Method declaredMethod = this.mInstance.getClass().getDeclaredMethod("setBoxView", new Class[]{Object.class});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.mInstance, new Object[]{regionDefinition});
        } catch (Exception unused) {
        }
    }

    public void SetResultPoints(ArrayList<Point> arrayList) {
        try {
            this.mInstance.getClass().getMethod("setResultPoints", new Class[]{ArrayList.class}).invoke(this.mInstance, new Object[]{arrayList});
        } catch (Exception unused) {
        }
    }

    public void SetZoomRegion(Rect rect, int i) {
        try {
            this.mInstance.getClass().getMethod("setZoomRegion", new Class[]{Rect.class, Integer.TYPE}).invoke(this.mInstance, new Object[]{rect, Integer.valueOf(i)});
        } catch (Exception unused) {
        }
    }

    public int addCameraListener(Object obj) {
        try {
            this.mInstance.getClass().getMethod("addCameraListenerInner", new Class[]{Object.class}).invoke(this.mInstance, new Object[]{obj});
        } catch (Exception unused) {
        }
        return 0;
    }

    public boolean getAutoZoomStatus() {
        try {
            return ((Boolean) this.mInstance.getClass().getMethod("getAutoZoomStatus", new Class[0]).invoke(this.mInstance, new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public void pause() {
        try {
            this.mInstance.getClass().getMethod("pauseCamera", new Class[0]).invoke(this.mInstance, new Object[0]);
        } catch (Exception unused) {
        }
    }

    public void resume() {
        try {
            this.mInstance.getClass().getMethod("resumeCamera", new Class[0]).invoke(this.mInstance, new Object[0]);
        } catch (Exception unused) {
        }
    }

    public void start() {
        try {
            this.mInstance.getClass().getMethod("startScanning", new Class[0]).invoke(this.mInstance, new Object[0]);
        } catch (Exception unused) {
        }
    }

    public void stop() {
        try {
            this.mInstance.getClass().getMethod("stopScanning", new Class[0]).invoke(this.mInstance, new Object[0]);
        } catch (Exception unused) {
        }
    }
}
