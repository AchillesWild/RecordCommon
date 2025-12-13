package com.achilles.record.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum FrontEnum {

    ALL(0,"ALL"),

    PC(1,"PC"),

    MOBILE(2,"MOBILE");

    private Integer key;
    private String value;

    FrontEnum(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public static String getValue(Integer key) {
        return getMap().get(key);
    }

    public static Map<Integer,String> getMap() {
        Map<Integer, String> map = new HashMap<>();
        for (FrontEnum frontEnum : EnumSet.allOf(FrontEnum.class)) {
            map.put(frontEnum.getKey(), frontEnum.getValue());
        }
        return map;
    }

    public static boolean contains(Integer key){

        if(key == null){
            return false;
        }

        FrontEnum[] frontEnums = FrontEnum.values();
        for (FrontEnum frontEnum : frontEnums){
            if(frontEnum.key == key){
                return true;
            }
        }

        return false;
    }
}
