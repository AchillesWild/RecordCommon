package com.achilles.record.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum SortEnum {

    ASC(1,"升序"),

    DESC(0,"降序");

    private Integer key;

    private String value;

    SortEnum(Integer key, String value) {
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
        for (SortEnum sortEnum : EnumSet.allOf(SortEnum.class)) {
            map.put(sortEnum.getKey(), sortEnum.getValue());
        }
        return map;
    }

    public static boolean contains(Integer key){

        if(key == null){
            return false;
        }

        SortEnum[] sortEnums = SortEnum.values();
        for (SortEnum sortEnum : sortEnums){
            if(sortEnum.key == key){
                return true;
            }
        }

        return false;
    }
}
