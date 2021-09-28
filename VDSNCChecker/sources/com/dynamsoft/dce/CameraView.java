package com.dynamsoft.dce;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

public class CameraView extends FrameLayout {
    public BoxView mBoxView;
    public CanvasView mCanvasView;
    public AutoFitTextureView mTextureView;

    public CameraView(Context context) {
        this(context, (AttributeSet) null);
    }

    public CameraView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(C0683R.layout.camera_view, this);
        this.mTextureView = (AutoFitTextureView) findViewById(C0683R.C0685id.camera_cameraView);
        this.mCanvasView = (CanvasView) findViewById(C0683R.C0685id.camera_canvasView);
        this.mBoxView = (BoxView) findViewById(C0683R.C0685id.camera_boxview);
    }

    public void addOverlay() {
        this.mCanvasView.setStartOverlay(true);
    }

    public AutoFitTextureView getAutoFitTextureView() {
        return this.mTextureView;
    }

    public BoxView getBoxView() {
        return this.mBoxView;
    }

    public CanvasView getCanvasView() {
        return this.mCanvasView;
    }

    public void removeOverlay() {
        this.mCanvasView.setStartOverlay(false);
    }

    public void setBrushColor(String str) {
        this.mCanvasView.setBoundaryColor(str);
    }
}
