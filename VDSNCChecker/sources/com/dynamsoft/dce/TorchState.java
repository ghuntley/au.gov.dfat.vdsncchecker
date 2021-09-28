package com.dynamsoft.dce;

public enum TorchState {
    TORCH_STATE_OFF(0),
    TORCH_STATE_ON(1),
    TORCH_STATE_AUTO(2);
    
    public static final TorchState DEFAULT = null;
    private int value;

    /* access modifiers changed from: public */
    static {
        TorchState torchState;
        DEFAULT = torchState;
    }

    private TorchState(int i) {
        this.value = i;
    }

    public static TorchState fromValue(int i) {
        for (TorchState torchState : values()) {
            if (torchState.value == i) {
                return torchState;
            }
        }
        return null;
    }
}
