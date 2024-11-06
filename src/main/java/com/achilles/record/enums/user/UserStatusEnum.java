package com.achilles.record.enums.user;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum UserStatusEnum {

    DELETED(0,"已删除"),

    NORMAL(1,"正常"),

    FROZEN(2,"冻结中"),

    ;

    private Integer key;

    private String value;

    UserStatusEnum(Integer key, String value) {
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
        for (UserStatusEnum userStatusEnum : EnumSet.allOf(UserStatusEnum.class)) {
            map.put(userStatusEnum.getKey(), userStatusEnum.getValue());
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
