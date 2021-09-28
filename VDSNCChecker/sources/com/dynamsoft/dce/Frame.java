package com.dynamsoft.dce;

import android.graphics.Rect;

public class Frame {
    public byte[] data;
    public int format;
    public int frameId;
    public int height;
    public Rect mCropRect = null;
    public int mFastFrameId;
    public boolean mIsFastFrame;
    public int mOriH;
    public int mOrientation;
    public int mOriw;
    public int[] strides;
    public int width;

    public Frame(byte[] bArr, int i, int i2, int[] iArr, int i3, int i4) {
        this.data = bArr;
        this.width = i;
        this.height = i2;
        this.strides = iArr;
        this.format = i3;
        this.frameId = i4;
        this.mIsFastFrame = false;
        this.mFastFrameId = 0;
    }

    public Rect getCropRect() {
        return this.mCropRect;
    }

    public byte[] getData() {
        return this.data;
    }

    public int getFastFrameId() {
        return this.mFastFrameId;
    }

    public int getFormat() {
        return this.format;
    }

    public int getFrameId() {
        return this.frameId;
    }

    public int getHeight() {
        return this.height;
    }

    public int getOriH() {
        return this.mOriH;
    }

    public int getOriW() {
        return this.mOriw;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int[] getStrides() {
        return this.strides;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isFastFrame() {
        return this.mIsFastFrame;
    }
}
