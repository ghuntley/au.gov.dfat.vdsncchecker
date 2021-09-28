package com.dynamsoft.dbr;

import android.graphics.Rect;

public class FrameInterfaceFunc {
    private Object mFrameInstance;

    public FrameInterfaceFunc(Object obj) {
        this.mFrameInstance = obj;
    }

    public Rect getCropRect() {
        try {
            Object invoke = this.mFrameInstance.getClass().getMethod("getCropRect", new Class[0]).invoke(this.mFrameInstance, new Object[0]);
            if (invoke != null) {
                return (Rect) invoke;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public byte[] getData() {
        try {
            return (byte[]) this.mFrameInstance.getClass().getMethod("getData", new Class[0]).invoke(this.mFrameInstance, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public int getFastFrameId() {
        try {
            return Integer.parseInt(String.valueOf(this.mFrameInstance.getClass().getMethod("getFastFrameId", new Class[0]).invoke(this.mFrameInstance, new Object[0])));
        } catch (Exception unused) {
            return 0;
        }
    }

    public int getFormat() {
        try {
            return Integer.parseInt(String.valueOf(this.mFrameInstance.getClass().getMethod("getFormat", new Class[0]).invoke(this.mFrameInstance, new Object[0])));
        } catch (Exception unused) {
            return 0;
        }
    }

    public int getFrameId() {
        try {
            return Integer.parseInt(String.valueOf(this.mFrameInstance.getClass().getMethod("getFrameId", new Class[0]).invoke(this.mFrameInstance, new Object[0])));
        } catch (Exception unused) {
            return 0;
        }
    }

    public int getHeight() {
        try {
            return Integer.parseInt(String.valueOf(this.mFrameInstance.getClass().getMethod("getHeight", new Class[0]).invoke(this.mFrameInstance, new Object[0])));
        } catch (Exception unused) {
            return 0;
        }
    }

    public int getOriH() {
        try {
            return Integer.parseInt(String.valueOf(this.mFrameInstance.getClass().getMethod("getOriH", new Class[0]).invoke(this.mFrameInstance, new Object[0])));
        } catch (Exception unused) {
            return 0;
        }
    }

    public int getOriW() {
        try {
            return Integer.parseInt(String.valueOf(this.mFrameInstance.getClass().getMethod("getOriW", new Class[0]).invoke(this.mFrameInstance, new Object[0])));
        } catch (Exception unused) {
            return 0;
        }
    }

    public int getOrientation() {
        try {
            return Integer.parseInt(String.valueOf(this.mFrameInstance.getClass().getMethod("getOrientation", new Class[0]).invoke(this.mFrameInstance, new Object[0])));
        } catch (Exception unused) {
            return 0;
        }
    }

    public int[] getStrides() {
        try {
            return (int[]) this.mFrameInstance.getClass().getMethod("getStrides", new Class[0]).invoke(this.mFrameInstance, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public int getWidth() {
        try {
            return Integer.parseInt(String.valueOf(this.mFrameInstance.getClass().getMethod("getWidth", new Class[0]).invoke(this.mFrameInstance, new Object[0])));
        } catch (Exception unused) {
            return 0;
        }
    }

    public boolean isFastFrame() {
        try {
            return ((Boolean) this.mFrameInstance.getClass().getMethod("isFastFrame", new Class[0]).invoke(this.mFrameInstance, new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
