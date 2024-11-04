package com.achilles.record.enums.user;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum EnableEnum {


    NO(0,"否"),

    YES(1,"是");


    private Integer key;

    private String value;

    EnableEnum(Integer key, String value) {
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
        return map.get(key);
    }

    public static Map<Integer, String> map = new HashMap<>();

    static {
        for (EnableEnum enableEnum : EnumSet.allOf(EnableEnum.class)) {
            map.put(enableEnum.getKey(), enableEnum.getValue());
        }
    }

    public static boolean contains(Integer key){

        if(key == null){
            return false;
        }

        String value = map.get(key);
        if(value != null) {
            return true;
        }

        return false;
    }
}
