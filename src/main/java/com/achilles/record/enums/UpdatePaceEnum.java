package com.achilles.record.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum UpdatePaceEnum {


    INITIAL(0,"未处理"),

    DOING(1,"处理中"),

    DONE(2,"已完成");

    private Integer key;
    private String value;

    UpdatePaceEnum(Integer key, String value) {
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
        for (UpdatePaceEnum updatePaceEnum : EnumSet.allOf(UpdatePaceEnum.class)) {
            map.put(updatePaceEnum.getKey(), updatePaceEnum.getValue());
        }
        return map;
    }

    public static boolean contains(Integer key){

        if(key == null){
            return false;
        }

        UpdatePaceEnum[] updatePaceEnums = UpdatePaceEnum.values();
        for (UpdatePaceEnum updatePaceEnum : updatePaceEnums){
            if(updatePaceEnum.key == key){
                return true;
            }
        }

        return false;
    }
}
