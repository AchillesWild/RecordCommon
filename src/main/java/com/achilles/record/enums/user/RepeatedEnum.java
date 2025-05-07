package com.achilles.record.enums.user;

import java.util.Comparator;
import java.util.EnumSet;
import java.util.Map;
import java.util.TreeMap;

public enum RepeatedEnum {


    NO(0,"否"),

    ONE(1,"一次"),

    YES(2,"是");


    private Integer key;

    private String value;

    RepeatedEnum(Integer key, String value) {
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

    public static Map<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());

    static {
        for (RepeatedEnum repeatedEnum : EnumSet.allOf(RepeatedEnum.class)) {
            map.put(repeatedEnum.getKey(), repeatedEnum.getValue());
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
