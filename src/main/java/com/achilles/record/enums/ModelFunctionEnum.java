package com.achilles.record.enums;

import java.util.*;

public enum ModelFunctionEnum {

    //--------------------------------------------- mission  start ----------------------------------------------------------------
    MISSION_ADD(ClzConstant.MISSION_COMMAND + ".add", ModelEnum.MISSION.getCode(),"add", ModelEnum.MISSION.getValue() + "_新增"),
    MISSION_DEL(ClzConstant.MISSION_COMMAND + ".delete",ModelEnum.MISSION.getCode(),"delete", ModelEnum.MISSION.getValue() + "_删除"),
    MISSION_UPDATE(ClzConstant.MISSION_COMMAND + ".update",ModelEnum.MISSION.getCode(),"update", ModelEnum.MISSION.getValue() + "_修改"),
    MISSION_UPDATE_INITIAL(ClzConstant.MISSION_COMMAND + ".updateInitial",ModelEnum.MISSION.getCode(),"updateInitial", ModelEnum.MISSION.getValue() + "_改为未处理"),
    MISSION_UPDATE_DOING(ClzConstant.MISSION_COMMAND + ".updateDoing", ModelEnum.MISSION.getCode(),"updateDoing", ModelEnum.MISSION.getValue() + "_改为处理中"),
    MISSION_UPDATE_DONE(ClzConstant.MISSION_COMMAND + ".updateDone",ModelEnum.MISSION.getCode(),"updateDone", ModelEnum.MISSION.getValue() + "_改为已处理"),

    MISSION_DOWNLOAD(ClzConstant.MISSION_QUERY + ".download",ModelEnum.MISSION.getCode(),"download", ModelEnum.MISSION.getValue() + "_下载"),
    MISSION_GET(ClzConstant.MISSION_QUERY + ".get", ModelEnum.MISSION.getCode(),"get", ModelEnum.MISSION.getValue() + "_根据id查询"),
    MISSION_LIST(ClzConstant.MISSION_QUERY + ".getPageList", ModelEnum.MISSION.getCode(),"list", ModelEnum.MISSION.getValue() + "_查询列表"),
    MISSION_COUNT(ClzConstant.MISSION_QUERY + ".getCount", ModelEnum.MISSION.getCode(),"count", ModelEnum.MISSION.getValue() + "_查询总数"),
    MISSION_TYPE(ClzConstant.MISSION_QUERY + ".getType", ModelEnum.MISSION.getCode(),"type", ModelEnum.MISSION.getValue() + "_查询所有类型"),
    MISSION_PACE(ClzConstant.MISSION_QUERY + ".getPace", ModelEnum.MISSION.getCode(),"pace", ModelEnum.MISSION.getValue() + "_查询所有进度"),
    MISSION_GET_IMG(ClzConstant.MISSION_QUERY + ".getBigImg", ModelEnum.MISSION.getCode(),"getBigImg", ModelEnum.MISSION.getValue() + "_获取大图"),
    //--------------------------------------------- diary  start ----------------------------------------------------------------


    ;

    private String method;

    private String modelCode;

    private String functionCode;

    private String desc;

    ModelFunctionEnum(String method, String modelCode, String functionCode, String desc) {
        this.method = method;
        this.modelCode = modelCode;
        this.functionCode = functionCode;
        this.desc = desc;
    }

    public String getMethod() {
        return method;
    }

    public String getModelCode() {
        return modelCode;
    }

    public String getFunctionCode() {
        return functionCode;
    }

    public String getDesc() {
        return desc;
    }

    public static String getFunctionCode(String method) {
        return methodToFunctionCodeMap.get(method);
    }

    public static String getDesc(String function) {
        return functionToDescMap.get(function);
    }

    public static Map<String, String> methodToModelCodeMap = new HashMap<>();

    public static Map<String, String> methodToFunctionCodeMap = new HashMap<>();

    public static Map<String, String> functionToDescMap = new HashMap<>();

    static {
        for (ModelFunctionEnum modelFunctionEnum : EnumSet.allOf(ModelFunctionEnum.class)) {
            methodToModelCodeMap.put(modelFunctionEnum.getMethod(), modelFunctionEnum.getModelCode());
            methodToFunctionCodeMap.put(modelFunctionEnum.getMethod(), modelFunctionEnum.getFunctionCode());
            functionToDescMap.put(modelFunctionEnum.getModelCode() + "_" + modelFunctionEnum.getFunctionCode(), modelFunctionEnum.getDesc());
        }
    }

}
