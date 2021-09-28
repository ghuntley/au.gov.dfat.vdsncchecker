package com.dynamsoft.dce;

public interface CameraListener {
    void onPreviewFastFrame(Frame frame);

    void onPreviewFilterFrame(Frame frame);

    void onPreviewOriginalFrame(Frame frame);
}
