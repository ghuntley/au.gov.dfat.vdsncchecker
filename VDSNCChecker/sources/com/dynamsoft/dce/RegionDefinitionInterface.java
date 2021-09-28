package com.dynamsoft.dce;

import java.lang.reflect.Field;

public class RegionDefinitionInterface {
    private Object mRegionInstance;
    public int regionBottom;
    public int regionLeft;
    public int regionMeasuredByPercentage;
    public int regionRight;
    public int regionTop;

    public RegionDefinitionInterface(Object obj) {
        this.mRegionInstance = obj;
        try {
            Field field = obj.getClass().getField("regionLeft");
            Field field2 = this.mRegionInstance.getClass().getField("regionRight");
            Field field3 = this.mRegionInstance.getClass().getField("regionTop");
            Field field4 = this.mRegionInstance.getClass().getField("regionBottom");
            Field field5 = this.mRegionInstance.getClass().getField("regionMeasuredByPercentage");
            this.regionLeft = ((Integer) field.get(this.mRegionInstance)).intValue();
            this.regionRight = ((Integer) field2.get(this.mRegionInstance)).intValue();
            this.regionTop = ((Integer) field3.get(this.mRegionInstance)).intValue();
            this.regionBottom = ((Integer) field4.get(this.mRegionInstance)).intValue();
            this.regionMeasuredByPercentage = ((Integer) field5.get(this.mRegionInstance)).intValue();
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
