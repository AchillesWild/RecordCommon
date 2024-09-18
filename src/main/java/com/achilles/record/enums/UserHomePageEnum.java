package com.achilles.record.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum UserHomePageEnum {

    MISSION(1,"待办"),

    NOTE(2, "笔记"),

    FINANCE(3, "账务"),

    PRODUCT(4, "计量"),

    GOODS(5, "买/卖"),

    ;

    private Integer key;

    private String value;

    UserHomePageEnum(Integer key, String value) {
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
        for (UserHomePageEnum userHomePageEnum : EnumSet.allOf(UserHomePageEnum.class)) {
            map.put(userHomePageEnum.getKey(), userHomePageEnum.getValue());
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
