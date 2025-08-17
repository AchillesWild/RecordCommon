package com.achilles.record.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum OperateTypeEnum {


    ADD("add","add"),

    DELETE("delete","delete"),

    UPDATE("update","update"),

    COPY("copy","copy");

    private String key;

    private String value;

    OperateTypeEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public static String getValue(Integer key) {
        return getMap().get(key);
    }

    public static Map<String,String> getMap() {
        Map<String, String> map = new HashMap<>();
        for (OperateTypeEnum operateTypeEnum : EnumSet.allOf(OperateTypeEnum.class)) {
            map.put(operateTypeEnum.getKey(), operateTypeEnum.getValue());
        }
        return map;
    }

    public static boolean contains(String key){

        if(key == null){
            return false;
        }

        OperateTypeEnum[] operateTypeEnums = OperateTypeEnum.values();
        for (OperateTypeEnum operateTypeEnum : operateTypeEnums){
            if(operateTypeEnum.key == key){
                return true;
            }
        }

        return false;
    }
}
