package com.power.doc.enums;

import com.google.common.collect.ImmutableMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yu 2020/12/3.
 */
public enum DeviceDataExpressionEnum {

    /**
     * temperature
     */
    SENSIRION("2101", new HashMap<>());


    private String deviceType;

    private Map<String, String> keyWords;

    DeviceDataExpressionEnum(String s, Object put) {
        this.deviceType = s;
        this.keyWords = (Map<String, String>) put;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public Map<String, String> getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(Map<String, String> keyWords) {
        this.keyWords = keyWords;
    }
}
