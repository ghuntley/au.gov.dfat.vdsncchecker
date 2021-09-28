package com.dynamsoft.dbr;

import java.util.List;

@Deprecated
public class DMLTSConnectionParameters {
    public int chargeWay = -1;
    public String handshakeCode;
    public List<Integer> limitedLicenseModules;
    public String mainServerURL;
    public int maxBufferDays = -1;
    public String organizationID;
    public int products = 65535;
    public String sessionPassword;
    public String standbyServerURL;
    public int uuidGenerationMethod = 1;
}
