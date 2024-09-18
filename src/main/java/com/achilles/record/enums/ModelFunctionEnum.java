package com.achilles.record.enums;

import com.achilles.record.constant.ClzConstant;

import java.util.*;

public enum ModelFunctionEnum {

    //--------------------------------------------- mission  start ----------------------------------------------------------------
    MISSION_ADD(ClzConstant.MISSION_COMMAND + ".add", ModelEnum.MISSION.getCode(),"add", ModelEnum.MISSION.getValue() + "_新增"),
    MISSION_DEL(ClzConstant.MISSION_COMMAND + ".delete", ModelEnum.MISSION.getCode(),"delete", ModelEnum.MISSION.getValue() + "_删除"),
    MISSION_UPDATE(ClzConstant.MISSION_COMMAND + ".update", ModelEnum.MISSION.getCode(),"update", ModelEnum.MISSION.getValue() + "_修改"),
    MISSION_UPDATE_INITIAL(ClzConstant.MISSION_COMMAND + ".updateInitial", ModelEnum.MISSION.getCode(),"updateInitial", ModelEnum.MISSION.getValue() + "_改为未处理"),
    MISSION_UPDATE_DOING(ClzConstant.MISSION_COMMAND + ".updateDoing", ModelEnum.MISSION.getCode(),"updateDoing", ModelEnum.MISSION.getValue() + "_改为处理中"),
    MISSION_UPDATE_DONE(ClzConstant.MISSION_COMMAND + ".updateDone", ModelEnum.MISSION.getCode(),"updateDone", ModelEnum.MISSION.getValue() + "_改为已处理"),

    MISSION_DOWNLOAD(ClzConstant.MISSION_QUERY + ".download", ModelEnum.MISSION.getCode(),"download", ModelEnum.MISSION.getValue() + "_下载"),
    MISSION_GET(ClzConstant.MISSION_QUERY + ".get", ModelEnum.MISSION.getCode(),"get", ModelEnum.MISSION.getValue() + "_根据id查询"),
    MISSION_LIST(ClzConstant.MISSION_QUERY + ".getPageList", ModelEnum.MISSION.getCode(),"getPageList", ModelEnum.MISSION.getValue() + "_查询列表"),
    MISSION_COUNT(ClzConstant.MISSION_QUERY + ".getCount", ModelEnum.MISSION.getCode(),"getCount", ModelEnum.MISSION.getValue() + "_查询总数"),
    MISSION_TYPE(ClzConstant.MISSION_QUERY + ".getType", ModelEnum.MISSION.getCode(),"getType", ModelEnum.MISSION.getValue() + "_查询所有类型"),
    MISSION_PACE(ClzConstant.MISSION_QUERY + ".getPace", ModelEnum.MISSION.getCode(),"getPace", ModelEnum.MISSION.getValue() + "_查询所有进度"),
    MISSION_GET_IMG(ClzConstant.MISSION_QUERY + ".getBigImg", ModelEnum.MISSION.getCode(),"getBigImg", ModelEnum.MISSION.getValue() + "_获取大图"),

    //--------------------------------------------- diary  start ----------------------------------------------------------------
    NOTE_ADD(ClzConstant.NOTE_COMMAND + ".add", ModelEnum.NOTE.getCode(),"add", ModelEnum.NOTE.getValue() + "_新增"),
    NOTE_DEL(ClzConstant.NOTE_COMMAND + ".delete", ModelEnum.NOTE.getCode(),"delete", ModelEnum.NOTE.getValue() + "_删除"),
    NOTE_UPDATE(ClzConstant.NOTE_COMMAND + ".update", ModelEnum.NOTE.getCode(),"update", ModelEnum.NOTE.getValue() + "_修改"),
    NOTE_COPY(ClzConstant.NOTE_COMMAND + ".copy", ModelEnum.NOTE.getCode(),"copy", ModelEnum.NOTE.getValue() + "_复制"),
    NOTE_UPDATE_CONTENT(ClzConstant.NOTE_COMMAND + ".updateContent", ModelEnum.NOTE.getCode(),"updateContent", ModelEnum.NOTE.getValue() + "_修改正文"),

    NOTE_DOWNLOAD(ClzConstant.NOTE_QUERY + ".download", ModelEnum.NOTE.getCode(),"download", ModelEnum.NOTE.getValue() + "_下载"),
    NOTE_GET(ClzConstant.NOTE_QUERY + ".get", ModelEnum.NOTE.getCode(),"get", ModelEnum.NOTE.getValue() + "_根据id查询"),
    NOTE_LIST(ClzConstant.NOTE_QUERY + ".getPageList", ModelEnum.NOTE.getCode(),"getPageList", ModelEnum.NOTE.getValue() + "_查询列表"),
    NOTE_COUNT(ClzConstant.NOTE_QUERY + ".getCount", ModelEnum.NOTE.getCode(),"getCount", ModelEnum.NOTE.getValue() + "_查询总数"),
    NOTE_TYPE(ClzConstant.NOTE_QUERY + ".getType", ModelEnum.NOTE.getCode(),"getType", ModelEnum.NOTE.getValue() + "_查询所有类型"),
    NOTE_GET_IMG(ClzConstant.NOTE_QUERY + ".getBigImg", ModelEnum.NOTE.getCode(),"getBigImg", ModelEnum.NOTE.getValue() + "_获取大图"),

    //--------------------------------------------- finance  start ----------------------------------------------------------------
    FINANCE_ADD(ClzConstant.FINANCE_COMMAND + ".add", ModelEnum.FINANCE.getCode(),"add", ModelEnum.FINANCE.getValue() + "_新增"),
    FINANCE_DEL(ClzConstant.FINANCE_COMMAND + ".delete", ModelEnum.FINANCE.getCode(),"delete", ModelEnum.FINANCE.getValue() + "_删除"),
    FINANCE_UPDATE(ClzConstant.FINANCE_COMMAND + ".update", ModelEnum.FINANCE.getCode(),"update", ModelEnum.FINANCE.getValue() + "_修改"),
    FINANCE_COPY(ClzConstant.FINANCE_COMMAND + ".copy", ModelEnum.FINANCE.getCode(),"copy", ModelEnum.FINANCE.getValue() + "_复制"),

    FINANCE_DOWNLOAD(ClzConstant.FINANCE_QUERY + ".download", ModelEnum.FINANCE.getCode(),"download", ModelEnum.FINANCE.getValue() + "_下载"),
    FINANCE_GET(ClzConstant.FINANCE_QUERY + ".get", ModelEnum.FINANCE.getCode(),"get", ModelEnum.FINANCE.getValue() + "_根据id查询"),
    FINANCE_LIST(ClzConstant.FINANCE_QUERY + ".getPageList", ModelEnum.FINANCE.getCode(),"getPageList", ModelEnum.FINANCE.getValue() + "_查询列表"),
    FINANCE_COUNT(ClzConstant.FINANCE_QUERY + ".getCount", ModelEnum.FINANCE.getCode(),"getCount", ModelEnum.FINANCE.getValue() + "_查询总数"),
    FINANCE_BIZ_TYPE(ClzConstant.FINANCE_QUERY + ".getBizType", ModelEnum.FINANCE.getCode(),"getBizType", ModelEnum.FINANCE.getValue() + "_查询所有业务类型"),
    FINANCE_GET_SUM(ClzConstant.FINANCE_QUERY + ".getSum", ModelEnum.FINANCE.getCode(),"getSum", ModelEnum.FINANCE.getValue() + "_查询汇总"),
    FINANCE_GET_IMG(ClzConstant.FINANCE_QUERY + ".getBigImg", ModelEnum.FINANCE.getCode(),"getBigImg", ModelEnum.FINANCE.getValue() + "_获取大图"),

    FINANCE_MONTH_TO_SUM_RECENT(ClzConstant.FINANCE_MONTH_QUERY + ".toSumRecent", ModelEnum.FINANCE_MONTH.getCode(),"toSumRecent", ModelEnum.FINANCE_MONTH.getValue() + "_汇总最近几个月"),
    FINANCE_MONTH_TO_SUM_MONTH(ClzConstant.FINANCE_MONTH_QUERY + ".toSumMonth", ModelEnum.FINANCE_MONTH.getCode(),"toSumMonth", ModelEnum.FINANCE_MONTH.getValue() + "_汇总某月"),
    FINANCE_MONTH_CLASSIFIED_LIST_MONTH(ClzConstant.FINANCE_MONTH_QUERY + ".getClassifiedMonth", ModelEnum.FINANCE_MONTH.getCode(),"getClassifiedMonth", ModelEnum.FINANCE_MONTH.getValue() + "_查询某月分类汇总"),
    FINANCE_MONTH_CLASSIFIED_LIST(ClzConstant.FINANCE_MONTH_QUERY + ".getClassifiedSum", ModelEnum.FINANCE_MONTH.getCode(),"getClassifiedSum", ModelEnum.FINANCE_MONTH.getValue() + "_根据条件查询分类汇总"),
    FINANCE_MONTH_LIST(ClzConstant.FINANCE_MONTH_QUERY + ".getMonthPageList", ModelEnum.FINANCE_MONTH.getCode(),"getMonthPageList", ModelEnum.FINANCE_MONTH.getValue() + "_查询列表"),
    FINANCE_MONTH_GET(ClzConstant.FINANCE_MONTH_QUERY + ".getByMonth", ModelEnum.FINANCE_MONTH.getCode(),"getByMonth", ModelEnum.FINANCE_MONTH.getValue() + "_获取某个月详细"),
    FINANCE_MONTH_SUM(ClzConstant.FINANCE_MONTH_QUERY + ".getMonthSumAmount", ModelEnum.FINANCE_MONTH.getCode(),"getMonthSumAmount", ModelEnum.FINANCE_MONTH.getValue() + "_获取汇总值"),
    FINANCE_MONTH_DOWNLOAD(ClzConstant.FINANCE_MONTH_QUERY + ".downloadMonth", ModelEnum.FINANCE_MONTH.getCode(),"downloadMonth", ModelEnum.FINANCE_MONTH.getValue() + "_下载列表"),
    FINANCE_MONTH_DOWNLOAD_MONTH_DETAIL(ClzConstant.FINANCE_MONTH_QUERY + ".downloadMonthDetail", ModelEnum.FINANCE_MONTH.getCode(),"downloadMonthDetail", ModelEnum.FINANCE_MONTH.getValue() + "_下载某月详细"),

    FINANCE_TRANSACTION_TYPE_ADD(ClzConstant.FINANCE_TRANSACTION_TYPE_COMMAND + ".add", ModelEnum.FINANCE_TRANSACTION_TYPE.getCode(),"add", ModelEnum.FINANCE_TRANSACTION_TYPE.getValue() + "_新增"),
    FINANCE_TRANSACTION_TYPE_DEL(ClzConstant.FINANCE_TRANSACTION_TYPE_COMMAND + ".delete", ModelEnum.FINANCE_TRANSACTION_TYPE.getCode(),"delete", ModelEnum.FINANCE_TRANSACTION_TYPE.getValue() + "_删除"),
    FINANCE_TRANSACTION_TYPE_UPDATE(ClzConstant.FINANCE_TRANSACTION_TYPE_COMMAND + ".update", ModelEnum.FINANCE_TRANSACTION_TYPE.getCode(),"update", ModelEnum.FINANCE_TRANSACTION_TYPE.getValue() + "_修改"),

    FINANCE_TRANSACTION_TYPE_GET(ClzConstant.FINANCE_TRANSACTION_TYPE_QUERY + ".get", ModelEnum.FINANCE_TRANSACTION_TYPE.getCode(),"get", ModelEnum.FINANCE_TRANSACTION_TYPE.getValue() + "_根据id查询"),
    FINANCE_TRANSACTION_TYPE_LIST(ClzConstant.FINANCE_TRANSACTION_TYPE_QUERY + ".getPageList", ModelEnum.FINANCE_TRANSACTION_TYPE.getCode(),"getPageList", ModelEnum.FINANCE_TRANSACTION_TYPE.getValue() + "_查询列表"),
    FINANCE_TRANSACTION_TYPE_GET_SELECT(ClzConstant.FINANCE_TRANSACTION_TYPE_QUERY + ".getSelect", ModelEnum.FINANCE_TRANSACTION_TYPE.getCode(),"getSelect", ModelEnum.FINANCE_TRANSACTION_TYPE.getValue() + "_查询所有(下拉菜单)"),

    //--------------------------------------------- product  start ----------------------------------------------------------------
    PRODUCT_OUTPUT_COMMAND_ADD(ClzConstant.PRODUCT_OUTPUT_COMMAND + ".add", ModelEnum.PRODUCT_OUTPUT.getCode(),"add", ModelEnum.PRODUCT_OUTPUT.getValue() + "_新增"),
    PRODUCT_OUTPUT_COMMAND_DEL(ClzConstant.PRODUCT_OUTPUT_COMMAND + ".delete", ModelEnum.PRODUCT_OUTPUT.getCode(),"delete", ModelEnum.PRODUCT_OUTPUT.getValue() + "_删除"),
    PRODUCT_OUTPUT_COMMAND_UPDATE(ClzConstant.PRODUCT_OUTPUT_COMMAND + ".update", ModelEnum.PRODUCT_OUTPUT.getCode(),"update", ModelEnum.PRODUCT_OUTPUT.getValue() + "_修改"),
    PRODUCT_OUTPUT_COMMAND_COPY(ClzConstant.PRODUCT_OUTPUT_COMMAND + ".copy", ModelEnum.PRODUCT_OUTPUT.getCode(),"copy", ModelEnum.PRODUCT_OUTPUT.getValue() + "_复制"),

    PRODUCT_OUTPUT_COMMAND_DOWNLOAD(ClzConstant.PRODUCT_OUTPUT_QUERY + ".download", ModelEnum.PRODUCT_OUTPUT.getCode(),"download", ModelEnum.PRODUCT_OUTPUT.getValue() + "_下载"),
    PRODUCT_OUTPUT_COMMAND_GET(ClzConstant.PRODUCT_OUTPUT_QUERY + ".get", ModelEnum.PRODUCT_OUTPUT.getCode(),"get", ModelEnum.PRODUCT_OUTPUT.getValue() + "_根据id查询"),
    PRODUCT_OUTPUT_COMMAND_LIST(ClzConstant.PRODUCT_OUTPUT_QUERY + ".getPageList", ModelEnum.PRODUCT_OUTPUT.getCode(),"getPageList", ModelEnum.PRODUCT_OUTPUT.getValue() + "_查询列表"),
    PRODUCT_OUTPUT_COMMAND_GET_COUNT(ClzConstant.PRODUCT_OUTPUT_QUERY + ".getCount", ModelEnum.PRODUCT_OUTPUT.getCode(),"getCount", ModelEnum.PRODUCT_OUTPUT.getValue() + "_查询数据总数"),
    PRODUCT_OUTPUT_COMMAND_GET_SUM(ClzConstant.PRODUCT_OUTPUT_QUERY + ".getSumAmount", ModelEnum.PRODUCT_OUTPUT.getCode(),"getSumAmount", ModelEnum.PRODUCT_OUTPUT.getValue() + "_查询汇总数量"),
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
