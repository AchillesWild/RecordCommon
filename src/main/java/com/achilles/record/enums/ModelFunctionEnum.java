package com.achilles.record.enums;

import java.util.*;

public enum ModelFunctionEnum {

    //--------------------------------------------- mission  start ----------------------------------------------------------------
    MISSION_ADD(ClzConstant.MISSION + ".add", ModelEnum.MISSION.getKey(),1, ModelEnum.MISSION.getValue() + "_新增"),
//    MISSION_DEL("com.achilles.server.controller.mission.MissionCommandController.delete",501, "待办_删除"),
//    MISSION_UPDATE("com.achilles.server.controller.mission.MissionCommandController.update",502, "待办_修改"),
//    MISSION_UPDATE_INITIAL("com.achilles.server.controller.mission.MissionCommandController.updateInitial",503, "待办_改为未处理"),
//    MISSION_UPDATE_DOING("com.achilles.server.controller.mission.MissionCommandController.updateDoing",504, "待办_改为处理中"),
//    MISSION_UPDATE_DONE("com.achilles.server.controller.mission.MissionCommandController.updateDone",505, "待办_改为已处理"),
//
//    MISSION_DOWNLOAD("com.achilles.server.controller.mission.MissionQryController.download",506, "待办_下载"),
//    MISSION_GET("com.achilles.server.controller.mission.MissionQryController.get",507, "待办_根据id查询"),
//    MISSION_LIST("com.achilles.server.controller.mission.MissionQryController.list",508, "待办_查询列表"),
//    MISSION_COUNT("com.achilles.server.controller.mission.MissionQryController.count",509, "待办_查询总数"),
//    MISSION_TYPE("com.achilles.server.controller.mission.MissionQryController.type",510, "待办_查询所有类型"),
//    MISSION_PACE("com.achilles.server.controller.mission.MissionQryController.pace",511, "待办_查询所有进度"),
//    MISSION_GET_IMG("com.achilles.server.controller.mission.MissionQryController.getBigImg",512, "待办_获取大图"),
    //--------------------------------------------- diary  start ----------------------------------------------------------------


    ;

    private String method;

    private Integer modelCode;

    private Integer functionCode;

    private String desc;



    ModelFunctionEnum(String method, Integer modelCode, Integer functionCode, String desc) {
        this.method = method;
        this.modelCode = modelCode;
        this.functionCode = functionCode;
        this.desc = desc;
    }

    public String getMethod() {
        return method;
    }

    public Integer getModelCode() {
        return modelCode;
    }

    public Integer getFunctionCode() {
        return functionCode;
    }

    public String getDesc() {
        return desc;
    }

    public static Integer getFunctionCode(String method) {
        return methodToFunctionCodeMap.get(method);
    }

    public static String getDesc(String function) {
        return functionToDescMap.get(function);
    }

    public static Map<String, Integer> methodToModelCodeMap = new HashMap<>();

    public static Map<String, Integer> methodToFunctionCodeMap = new HashMap<>();

    public static Map<String, String> functionToDescMap = new HashMap<>();

    static {
        for (ModelFunctionEnum modelFunctionEnum : EnumSet.allOf(ModelFunctionEnum.class)) {
            methodToModelCodeMap.put(modelFunctionEnum.getMethod(), modelFunctionEnum.getModelCode());
            methodToFunctionCodeMap.put(modelFunctionEnum.getMethod(), modelFunctionEnum.getFunctionCode());
            functionToDescMap.put(modelFunctionEnum.getModelCode() + "_" + modelFunctionEnum.getFunctionCode(), modelFunctionEnum.getDesc());
        }
    }

}
