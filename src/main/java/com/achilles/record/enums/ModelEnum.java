package com.achilles.record.enums;

import java.util.*;

public enum ModelEnum {


    MISSION_ADD("com.achilles.server.controller.mission.MissionCommandController.add",501, "生产"),


    ;

    private String method;

    private Integer code;

    private String desc;



    ModelEnum(String method, Integer code, String desc) {
        this.method = method;
        this.code = code;
        this.desc = desc;
    }

    public String getMethod() {
        return method;
    }

    public String getDesc() {
        return desc;
    }

    public Integer getCode() {
        return code;
    }

    public static Integer getCode(String method) {
        return methodToCodeMap.get(method);
    }

    public static String getDesc(Integer code) {
        return codeToDescMap.get(code);
    }

    public static Map<String, Integer> methodToCodeMap = new HashMap<>();

    public static Map<Integer, String> codeToDescMap = new HashMap<>();

    static {
        for (ModelEnum modelEnum : EnumSet.allOf(ModelEnum.class)) {
            methodToCodeMap.put(modelEnum.getMethod(), modelEnum.getCode());
            codeToDescMap.put(modelEnum.getCode(), modelEnum.getDesc());
        }
    }

}
