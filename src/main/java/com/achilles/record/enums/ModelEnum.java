package com.achilles.record.enums;

import java.util.*;

public enum ModelEnum {

    //--------------------------------------------- mission  start ----------------------------------------------------------------
    MISSION_ADD("com.achilles.server.controller.mission.MissionCommandController.add",500, "待办_新增"),
    MISSION_DEL("com.achilles.server.controller.mission.MissionCommandController.delete",501, "待办_删除"),
    MISSION_UPDATE("com.achilles.server.controller.mission.MissionCommandController.update",502, "待办_修改"),
    MISSION_UPDATE_INITIAL("com.achilles.server.controller.mission.MissionCommandController.updateInitial",503, "待办_改为未处理"),
    MISSION_UPDATE_DOING("com.achilles.server.controller.mission.MissionCommandController.updateDoing",504, "待办_改为处理中"),
    MISSION_UPDATE_DONE("com.achilles.server.controller.mission.MissionCommandController.updateDone",505, "待办_改为已处理"),

    MISSION_DOWNLOAD("com.achilles.server.controller.mission.MissionQryController.download",506, "待办_下载"),
    MISSION_GET("com.achilles.server.controller.mission.MissionQryController.get",507, "待办_根据id查询"),
    MISSION_LIST("com.achilles.server.controller.mission.MissionQryController.list",508, "待办_查询列表"),
    MISSION_COUNT("com.achilles.server.controller.mission.MissionQryController.count",509, "待办_查询总数"),
    MISSION_TYPE("com.achilles.server.controller.mission.MissionQryController.type",510, "待办_查询所有类型"),
    MISSION_PACE("com.achilles.server.controller.mission.MissionQryController.pace",511, "待办_查询所有进度"),
    MISSION_GET_IMG("com.achilles.server.controller.mission.MissionQryController.getBigImg",512, "待办_获取大图"),
    //--------------------------------------------- diary  start ----------------------------------------------------------------


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
