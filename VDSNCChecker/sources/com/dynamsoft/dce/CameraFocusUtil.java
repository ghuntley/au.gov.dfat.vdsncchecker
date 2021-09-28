package com.dynamsoft.dce;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.lang.reflect.Method;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CameraFocusUtil {
    private boolean AFFocused = false;
    private boolean bfirst = true;
    private CameraEnhancerAlgorithm camAlgorithmFilter;
    private double clarity;
    private Context context;
    public float delta_temp = 0.0f;
    private boolean existClarityShark;
    private Method focusMethod;
    private boolean focusStateAvailable = false;
    public long focusTimeLong = -1;
    private long focusTimems = 3000;
    private int grayIndex = -1;
    private boolean ifFocusClarity;
    private boolean ifFocusSensor;
    private boolean ifFocusStateFilter;
    private boolean ifFocusTime;
    private boolean ifJudgedFocusState = false;
    private boolean ifSharpnessFilter;
    private boolean ifStatusBySharpness;
    public boolean isActivelyFocusing = false;
    private boolean isFocusing2 = false;
    private boolean isMoving = false;
    private boolean isNeedFocusAnother = false;
    private boolean isSharkFrame;
    private int lastClarity = -1;
    private int lastGrayIndex = -1;
    private long lastSensorTime;
    private int lastState = -1;
    private float lastX;
    private float lastY;
    private float lastZ;
    private int lastc = 0;
    private Lock lock = new ReentrantLock();
    private CameraEnhancer mCamera;
    private int maxClarity = -1;
    private final SensorEventListener myAccelerometerListener;
    private boolean needDecode = true;
    private SensorManager sensorManager;
    private int sensorThreshold = 50;
    private double sharpnessThreshold;
    private double sharpnessThresholdLarge;
    private int stateId = 0;
    private double terminateFocusBySharpness;
    private long terminateFocusByTime = 500;

    public CameraFocusUtil(Context context2, CameraEnhancer cameraEnhancer) {
        C06791 r2 = new SensorEventListener() {
            public void onAccuracyChanged(Sensor sensor, int i) {
            }

            public void onSensorChanged(SensorEvent sensorEvent) {
                CameraFocusUtil.this.sensorFocus(sensorEvent);
            }
        };
        this.myAccelerometerListener = r2;
        this.context = context2;
        this.sensorThreshold = 50;
        this.focusTimems = 1800;
        this.terminateFocusBySharpness = 0.05d;
        this.terminateFocusByTime = 800;
        this.ifStatusBySharpness = false;
        this.sharpnessThreshold = 0.2d;
        this.sharpnessThresholdLarge = 0.4d;
        this.ifSharpnessFilter = false;
        this.ifFocusClarity = false;
        this.clarity = 0.1d;
        this.ifFocusTime = false;
        this.ifFocusStateFilter = false;
        this.ifFocusSensor = true;
        this.existClarityShark = false;
        this.mCamera = cameraEnhancer;
        SensorManager sensorManager2 = (SensorManager) context2.getSystemService("sensor");
        this.sensorManager = sensorManager2;
        if (sensorManager2 != null) {
            sensorManager2.registerListener(r2, sensorManager2.getDefaultSensor(1), 3);
        }
        getMethod();
    }

    private void clarityFocus() {
        try {
            if (this.camAlgorithmFilter.isNeedFocus(false)) {
                this.isActivelyFocusing = true;
                focus(this.mCamera);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void endFocusSelf() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.focusTimeLong;
        if (currentTimeMillis - j >= 500) {
            if (this.ifFocusTime && currentTimeMillis - j > this.terminateFocusByTime) {
                this.isActivelyFocusing = false;
            } else if (!this.camAlgorithmFilter.isNeedFocus(true)) {
                this.isActivelyFocusing = false;
            }
        }
    }

    private void focus(Object obj) {
        this.focusTimeLong = System.currentTimeMillis();
        this.focusMethod.invoke(obj, new Object[0]);
    }

    private void getMethod() {
        try {
            this.focusMethod = CameraEnhancer.class.getMethod("focusAtCenter", new Class[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public void sensorFocus(SensorEvent sensorEvent) {
        try {
            if (this.isNeedFocusAnother && !this.isActivelyFocusing) {
                this.lock.lock();
                this.isActivelyFocusing = true;
                focus(this.mCamera);
                this.lock.unlock();
            }
            if (sensorEvent.sensor.getType() == 1) {
                long currentTimeMillis = System.currentTimeMillis();
                float[] fArr = sensorEvent.values;
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = fArr[2];
                if (!this.bfirst) {
                    float f4 = f - this.lastX;
                    float f5 = f2 - this.lastY;
                    float f6 = f3 - this.lastZ;
                    long j = currentTimeMillis - this.lastSensorTime;
                    if (j != 0) {
                        float f7 = f6 * f6;
                        double sqrt = (Math.sqrt((double) (f7 + ((f5 * f5) + (f4 * f4)))) / ((double) j)) * 1000.0d;
                        this.delta_temp = (float) sqrt;
                        if (sqrt > ((double) this.sensorThreshold)) {
                            this.isMoving = true;
                        } else {
                            this.isMoving = false;
                        }
                    } else {
                        return;
                    }
                } else {
                    this.bfirst = false;
                }
                this.bfirst = false;
                this.lastX = f;
                this.lastY = f2;
                this.lastZ = f3;
                this.lastSensorTime = currentTimeMillis;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void timeFocus() {
        try {
            this.lock.lock();
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.focusTimeLong;
            if (currentTimeMillis - j > this.focusTimems || j < 0) {
                this.isActivelyFocusing = true;
                focus(this.mCamera);
            }
            this.lock.unlock();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addCamAlgorithmFilter(CameraEnhancerAlgorithm cameraEnhancerAlgorithm) {
        this.camAlgorithmFilter = cameraEnhancerAlgorithm;
    }

    public void destroy() {
        SensorManager sensorManager2 = (SensorManager) this.context.getSystemService("sensor");
        this.sensorManager = sensorManager2;
        if (sensorManager2 != null) {
            sensorManager2.unregisterListener(this.myAccelerometerListener);
        }
    }

    public boolean endZoomBySensor() {
        return this.delta_temp > 25.0f;
    }

    public boolean isNeedDecode() {
        if (!this.isMoving || !this.ifFocusSensor) {
            return this.needDecode;
        }
        return false;
    }

    public void process(Frame frame) {
        if (this.ifFocusTime && !this.isActivelyFocusing) {
            timeFocus();
        }
        if (this.ifFocusClarity && !this.isActivelyFocusing) {
            clarityFocus();
        }
        if (this.isActivelyFocusing && (this.ifStatusBySharpness || this.ifFocusTime || this.ifFocusClarity)) {
            endFocusSelf();
        }
        if (this.ifSharpnessFilter) {
            this.camAlgorithmFilter.SetSensorValue(this.delta_temp);
            this.needDecode = this.camAlgorithmFilter.isNeedDecode(this.isActivelyFocusing);
        }
    }

    public void setClarity(double d) {
        this.clarity = d;
    }

    public void setFocusTimems(long j) {
        this.focusTimems = j;
    }

    public void setIfFocusClarity(boolean z) {
        this.ifFocusClarity = z;
    }

    public void setIfFocusSensor(boolean z) {
        this.ifFocusSensor = z;
        SensorManager sensorManager2 = (SensorManager) this.context.getSystemService("sensor");
        this.sensorManager = sensorManager2;
        if (sensorManager2 == null) {
            return;
        }
        if (this.ifFocusSensor) {
            sensorManager2.registerListener(this.myAccelerometerListener, sensorManager2.getDefaultSensor(1), 3);
        } else {
            sensorManager2.unregisterListener(this.myAccelerometerListener);
        }
    }

    public void setIfFocusStateFilter(boolean z) {
        this.ifFocusStateFilter = z;
    }

    public void setIfFocusTime(boolean z) {
        this.ifFocusTime = z;
    }

    public void setIfSharpnessFilter(boolean z) {
        this.ifSharpnessFilter = z;
    }

    public void setIfStatusBySharpness(boolean z) {
        this.ifStatusBySharpness = z;
    }

    public void setSensorThreshold(int i) {
        this.sensorThreshold = i;
    }

    public void setSharpnessThreshold(double d) {
        this.sharpnessThreshold = d;
    }

    public void setTerminateFocusBySharpness(double d) {
        this.terminateFocusBySharpness = d;
    }

    public void setTerminateFocusByTime(long j) {
        this.terminateFocusByTime = j;
    }

    public void stateFilter(int i) {
        if (!this.ifJudgedFocusState) {
            int i2 = this.lastState;
            if (i2 == -1) {
                this.stateId++;
                this.lastState = i;
            } else if (i == i2) {
                int i3 = this.stateId + 1;
                this.stateId = i3;
                if (i3 > 20) {
                    this.focusStateAvailable = false;
                    this.ifJudgedFocusState = true;
                }
            } else {
                this.ifJudgedFocusState = true;
                this.focusStateAvailable = true;
            }
        } else {
            if (i == 2 || i == 4) {
                this.AFFocused = true;
            } else {
                this.AFFocused = false;
            }
            if (this.ifFocusClarity) {
                if (this.isFocusing2 && (i == 0 || i == 4 || i == 5 || i == 2)) {
                    if (!this.ifStatusBySharpness) {
                        this.isFocusing2 = false;
                        this.isActivelyFocusing = false;
                        this.isNeedFocusAnother = false;
                    }
                    if (i == 5) {
                        this.isNeedFocusAnother = true;
                    }
                } else if (i == 3 && !this.ifStatusBySharpness) {
                    this.isFocusing2 = true;
                    this.lock.lock();
                    this.isActivelyFocusing = true;
                    this.lock.unlock();
                }
            }
        }
    }
}
