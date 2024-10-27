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
//    MISSION_TYPE(ClzConstant.MISSION_QUERY + ".getType", ModelEnum.MISSION.getCode(),"getType", ModelEnum.MISSION.getValue() + "_查询所有类型"),
//    MISSION_PACE(ClzConstant.MISSION_QUERY + ".getPace", ModelEnum.MISSION.getCode(),"getPace", ModelEnum.MISSION.getValue() + "_查询所有进度"),
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
//    NOTE_TYPE(ClzConstant.NOTE_QUERY + ".getType", ModelEnum.NOTE.getCode(),"getType", ModelEnum.NOTE.getValue() + "_查询所有类型"),
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
//    FINANCE_BIZ_TYPE(ClzConstant.FINANCE_QUERY + ".getBizType", ModelEnum.FINANCE.getCode(),"getBizType", ModelEnum.FINANCE.getValue() + "_查询所有业务类型"),
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
    PRODUCT_OUTPUT_ADD(ClzConstant.PRODUCT_OUTPUT_COMMAND + ".add", ModelEnum.PRODUCT_OUTPUT.getCode(),"add", ModelEnum.PRODUCT_OUTPUT.getValue() + "_新增"),
    PRODUCT_OUTPUT_DEL(ClzConstant.PRODUCT_OUTPUT_COMMAND + ".delete", ModelEnum.PRODUCT_OUTPUT.getCode(),"delete", ModelEnum.PRODUCT_OUTPUT.getValue() + "_删除"),
    PRODUCT_OUTPUT_UPDATE(ClzConstant.PRODUCT_OUTPUT_COMMAND + ".update", ModelEnum.PRODUCT_OUTPUT.getCode(),"update", ModelEnum.PRODUCT_OUTPUT.getValue() + "_修改"),
    PRODUCT_OUTPUT_COPY(ClzConstant.PRODUCT_OUTPUT_COMMAND + ".copy", ModelEnum.PRODUCT_OUTPUT.getCode(),"copy", ModelEnum.PRODUCT_OUTPUT.getValue() + "_复制"),

    PRODUCT_OUTPUT_DOWNLOAD(ClzConstant.PRODUCT_OUTPUT_QUERY + ".download", ModelEnum.PRODUCT_OUTPUT.getCode(),"download", ModelEnum.PRODUCT_OUTPUT.getValue() + "_下载"),
    PRODUCT_OUTPUT_GET(ClzConstant.PRODUCT_OUTPUT_QUERY + ".get", ModelEnum.PRODUCT_OUTPUT.getCode(),"get", ModelEnum.PRODUCT_OUTPUT.getValue() + "_根据id查询"),
    PRODUCT_OUTPUT_LIST(ClzConstant.PRODUCT_OUTPUT_QUERY + ".getPageList", ModelEnum.PRODUCT_OUTPUT.getCode(),"getPageList", ModelEnum.PRODUCT_OUTPUT.getValue() + "_查询列表"),
    PRODUCT_OUTPUT_GET_COUNT(ClzConstant.PRODUCT_OUTPUT_QUERY + ".getCount", ModelEnum.PRODUCT_OUTPUT.getCode(),"getCount", ModelEnum.PRODUCT_OUTPUT.getValue() + "_查询数据总数"),
    PRODUCT_OUTPUT_GET_SUM(ClzConstant.PRODUCT_OUTPUT_QUERY + ".getSumAmount", ModelEnum.PRODUCT_OUTPUT.getCode(),"getSumAmount", ModelEnum.PRODUCT_OUTPUT.getValue() + "_查询汇总数量"),

    PRODUCT_COMMAND_ADD(ClzConstant.PRODUCT_COMMAND + ".add", ModelEnum.PRODUCT.getCode(),"add", ModelEnum.PRODUCT.getValue() + "_新增"),
    PRODUCT_COMMAND_DEL(ClzConstant.PRODUCT_COMMAND + ".delete", ModelEnum.PRODUCT.getCode(),"delete", ModelEnum.PRODUCT.getValue() + "_删除"),
    PRODUCT_COMMAND_UPDATE(ClzConstant.PRODUCT_COMMAND + ".update", ModelEnum.PRODUCT.getCode(),"update", ModelEnum.PRODUCT.getValue() + "_修改"),

    PRODUCT_COMMAND_GET(ClzConstant.PRODUCT_QUERY + ".get", ModelEnum.PRODUCT.getCode(),"get", ModelEnum.PRODUCT.getValue() + "_根据id查询"),
    PRODUCT_COMMAND_LIST(ClzConstant.PRODUCT_QUERY + ".getPageList", ModelEnum.PRODUCT.getCode(),"getPageList", ModelEnum.PRODUCT.getValue() + "_查询列表"),
    PRODUCT_COMMAND_GET_BIG_IMG(ClzConstant.PRODUCT_QUERY + ".getBigImg", ModelEnum.PRODUCT.getCode(),"getBigImg", ModelEnum.PRODUCT.getValue() + "_获取大图"),

    PRODUCT_OUTPUT_MONTH_LIST(ClzConstant.PRODUCT_OUTPUT_MONTH_QUERY + ".getPageList", ModelEnum.PRODUCT_OUTPUT_MONTH.getCode(),"getPageList", ModelEnum.PRODUCT_OUTPUT_MONTH.getValue() + "_查询列表"),
    PRODUCT_OUTPUT_MONTH_GET(ClzConstant.PRODUCT_OUTPUT_MONTH_QUERY + ".getByMonth", ModelEnum.PRODUCT_OUTPUT_MONTH.getCode(),"getByMonth", ModelEnum.PRODUCT_OUTPUT_MONTH.getValue() + "_查询某个月"),
    PRODUCT_OUTPUT_MONTH_DOWNLOAD(ClzConstant.PRODUCT_OUTPUT_MONTH_QUERY + ".download", ModelEnum.PRODUCT_OUTPUT_MONTH.getCode(),"download", ModelEnum.PRODUCT_OUTPUT_MONTH.getValue() + "下载"),
    PRODUCT_OUTPUT_MONTH_DOWNLOAD_DETAIL(ClzConstant.PRODUCT_OUTPUT_MONTH_QUERY + ".downloadMonthDetail", ModelEnum.PRODUCT_OUTPUT_MONTH.getCode(),"downloadMonthDetail", ModelEnum.PRODUCT_OUTPUT_MONTH.getValue() + "下载某月明细"),
    PRODUCT_OUTPUT_MONTH_TO_SUM(ClzConstant.PRODUCT_OUTPUT_MONTH_QUERY + ".toSumOne", ModelEnum.PRODUCT_OUTPUT_MONTH.getCode(),"toSumOne", ModelEnum.PRODUCT_OUTPUT_MONTH.getValue() + "_汇总某个月"),
    PRODUCT_OUTPUT_MONTH_TO_SUM_RECENT(ClzConstant.PRODUCT_OUTPUT_MONTH_QUERY + ".toSumRecent", ModelEnum.PRODUCT_OUTPUT_MONTH.getCode(),"toSumRecent", ModelEnum.PRODUCT_OUTPUT_MONTH.getValue() + "_汇总最近几个月"),
    PRODUCT_OUTPUT_MONTH_GET_SUM(ClzConstant.PRODUCT_OUTPUT_MONTH_QUERY + ".getSumAmount", ModelEnum.PRODUCT_OUTPUT_MONTH.getCode(),"getSumAmount", ModelEnum.PRODUCT_OUTPUT_MONTH.getValue() + "_查询某个计量物的汇总"),

    //--------------------------------------------- goods  start ----------------------------------------------------------------
    GOODS_TRADE_ADD(ClzConstant.GOODS_TRADE_COMMAND + ".add", ModelEnum.GOODS_TRADE.getCode(),"add", ModelEnum.GOODS_TRADE.getValue() + "_新增"),
    GOODS_TRADE_DEL(ClzConstant.GOODS_TRADE_COMMAND + ".delete", ModelEnum.GOODS_TRADE.getCode(),"delete", ModelEnum.GOODS_TRADE.getValue() + "_删除"),
    GOODS_TRADE_UPDATE(ClzConstant.GOODS_TRADE_COMMAND + ".update", ModelEnum.GOODS_TRADE.getCode(),"update", ModelEnum.GOODS_TRADE.getValue() + "_修改"),
    GOODS_TRADE_COPY(ClzConstant.GOODS_TRADE_COMMAND + ".copy", ModelEnum.GOODS_TRADE.getCode(),"copy", ModelEnum.GOODS_TRADE.getValue() + "_复制"),

    GOODS_TRADE_DOWNLOAD(ClzConstant.GOODS_TRADE_QUERY + ".download", ModelEnum.GOODS_TRADE.getCode(),"download", ModelEnum.GOODS_TRADE.getValue() + "_下载"),
    GOODS_TRADE_GET(ClzConstant.GOODS_TRADE_QUERY + ".get", ModelEnum.GOODS_TRADE.getCode(),"get", ModelEnum.GOODS_TRADE.getValue() + "_根据id查询"),
    GOODS_TRADE_LIST(ClzConstant.GOODS_TRADE_QUERY + ".getPageList", ModelEnum.GOODS_TRADE.getCode(),"getPageList", ModelEnum.GOODS_TRADE.getValue() + "_查询列表"),
    GOODS_TRADE_GET_COUNT(ClzConstant.GOODS_TRADE_QUERY + ".getCount", ModelEnum.GOODS_TRADE.getCode(),"getCount", ModelEnum.GOODS_TRADE.getValue() + "_查询数据总数"),
    GOODS_TRADE_GET_SUM(ClzConstant.GOODS_TRADE_QUERY + ".getSumAmount", ModelEnum.GOODS_TRADE.getCode(),"getSumAmount", ModelEnum.GOODS_TRADE.getValue() + "_查询汇总金额"),
    GOODS_TRADE_GET_BIG_IMG(ClzConstant.GOODS_TRADE_QUERY + ".getBigImg", ModelEnum.GOODS_TRADE.getCode(),"getBigImg", ModelEnum.GOODS_TRADE.getValue() + "_查询大图"),
//    GOODS_TRADE_GET_TRADE_TYPE(ClzConstant.GOODS_TRADE_QUERY + ".getTradeType", ModelEnum.GOODS_TRADE.getCode(),"getTradeType", ModelEnum.GOODS_TRADE.getValue() + "_查询交易类型"),

    GOODS_TRADE_MONTH_LIST(ClzConstant.GOODS_TRADE_MONTH_QUERY + ".getPageList", ModelEnum.GOODS_TRADE_MONTH.getCode(),"getPageList", ModelEnum.GOODS_TRADE_MONTH.getValue() + "_查询列表"),
    GOODS_TRADE_MONTH_TO_SUM(ClzConstant.GOODS_TRADE_MONTH_QUERY + ".toSum", ModelEnum.GOODS_TRADE_MONTH.getCode(),"toSum", ModelEnum.GOODS_TRADE_MONTH.getValue() + "_汇总某月"),
    GOODS_TRADE_MONTH_TO_SUM_RECENT(ClzConstant.GOODS_TRADE_MONTH_QUERY + ".toSumRecent", ModelEnum.GOODS_TRADE_MONTH.getCode(),"toSumRecent", ModelEnum.GOODS_TRADE_MONTH.getValue() + "_汇总最近几月"),
    GOODS_TRADE_MONTH_GET_CLASSIFIED_MONTH(ClzConstant.GOODS_TRADE_MONTH_QUERY + ".getClassifiedMonth", ModelEnum.GOODS_TRADE_MONTH.getCode(),"getClassifiedMonth", ModelEnum.GOODS_TRADE_MONTH.getValue() + "_按月查询分类汇总"),
    GOODS_TRADE_MONTH_GET_CLASSIFIED_SUM(ClzConstant.GOODS_TRADE_MONTH_QUERY + ".getClassifiedSum", ModelEnum.GOODS_TRADE_MONTH.getCode(),"getClassifiedSum", ModelEnum.GOODS_TRADE_MONTH.getValue() + "_按条件查询分类汇总"),
    GOODS_TRADE_MONTH_GET(ClzConstant.GOODS_TRADE_MONTH_QUERY + ".getByMonth", ModelEnum.GOODS_TRADE_MONTH.getCode(),"getByMonth", ModelEnum.GOODS_TRADE_MONTH.getValue() + "_查询某月"),
    GOODS_TRADE_MONTH_GET_SUM(ClzConstant.GOODS_TRADE_MONTH_QUERY + ".getSumAmount", ModelEnum.GOODS_TRADE_MONTH.getCode(),"getSumAmount", ModelEnum.GOODS_TRADE_MONTH.getValue() + "_查询汇总金额"),
    GOODS_TRADE_MONTH_GET_DOWNLOAD(ClzConstant.GOODS_TRADE_MONTH_QUERY + ".download", ModelEnum.GOODS_TRADE_MONTH.getCode(),"download", ModelEnum.GOODS_TRADE_MONTH.getValue() + "_下载"),
    GOODS_TRADE_MONTH_GET_DOWNLOAD_DETAIL(ClzConstant.GOODS_TRADE_MONTH_QUERY + ".downloadMonthDetail", ModelEnum.GOODS_TRADE_MONTH.getCode(),"downloadMonthDetail", ModelEnum.GOODS_TRADE_MONTH.getValue() + "_下载某月明细"),

    GOODS_ADD(ClzConstant.GOODS_COMMAND + ".add", ModelEnum.GOODS.getCode(),"add", ModelEnum.GOODS.getValue() + "_新增"),
    GOODS_DEL(ClzConstant.GOODS_COMMAND + ".delete", ModelEnum.GOODS.getCode(),"delete", ModelEnum.GOODS.getValue() + "_删除"),
    GOODS_UPDATE(ClzConstant.GOODS_COMMAND + ".update", ModelEnum.GOODS.getCode(),"update", ModelEnum.GOODS.getValue() + "_修改"),

    GOODS_DOWNLOAD(ClzConstant.GOODS_QUERY + ".download", ModelEnum.GOODS.getCode(),"download", ModelEnum.GOODS.getValue() + "_下载"),
    GOODS_GET(ClzConstant.GOODS_QUERY + ".get", ModelEnum.GOODS.getCode(),"get", ModelEnum.GOODS.getValue() + "_查询一个"),
    GOODS_GET_BIG_IMG(ClzConstant.GOODS_QUERY + ".getBigImg", ModelEnum.GOODS.getCode(),"getBigImg", ModelEnum.GOODS.getValue() + "_查询大图"),
    GOODS_LIST(ClzConstant.GOODS_QUERY + ".getPageList", ModelEnum.GOODS.getCode(),"getPageList", ModelEnum.GOODS.getValue() + "_查询列表"),
//    GOODS_GET_SELECT(ClzConstant.GOODS_QUERY + ".getSelect", ModelEnum.GOODS.getCode(),"getSelect", ModelEnum.GOODS.getValue() + "_查询下拉"),

    SUPPLIER_ADD(ClzConstant.SUPPLIER_COMMAND + ".add", ModelEnum.SUPPLIER.getCode(),"add", ModelEnum.SUPPLIER.getValue() + "_新增"),
    SUPPLIER_DEL(ClzConstant.SUPPLIER_COMMAND + ".delete", ModelEnum.SUPPLIER.getCode(),"delete", ModelEnum.SUPPLIER.getValue() + "_删除"),
    SUPPLIER_UPDATE(ClzConstant.SUPPLIER_COMMAND + ".update", ModelEnum.SUPPLIER.getCode(),"update", ModelEnum.SUPPLIER.getValue() + "_修改"),

    SUPPLIER_LIST(ClzConstant.SUPPLIER_QUERY + ".getPageList", ModelEnum.SUPPLIER.getCode(),"getPageList", ModelEnum.SUPPLIER.getValue() + "_查询列表"),
    SUPPLIERS_GET(ClzConstant.SUPPLIER_QUERY + ".get", ModelEnum.SUPPLIER.getCode(),"get", ModelEnum.SUPPLIER.getValue() + "_查询一个"),
    SUPPLIERS_GET_BY_UUID(ClzConstant.SUPPLIER_QUERY + ".getByUuid", ModelEnum.SUPPLIER.getCode(),"getByUuid", ModelEnum.SUPPLIER.getValue() + "_根据uuid查询一个"),
    SUPPLIERS_DOWNLOAD(ClzConstant.SUPPLIER_QUERY + ".download", ModelEnum.SUPPLIER.getCode(),"download", ModelEnum.SUPPLIER.getValue() + "_下载"),
//    SUPPLIERS_GET_SUPPLIER_TYPE(ClzConstant.SUPPLIER_QUERY + ".getSupplierType", ModelEnum.SUPPLIER.getCode(),"getSupplierType", ModelEnum.SUPPLIER.getValue() + "_获取供应商类型下拉"),
//    SUPPLIERS_GET_SELECT(ClzConstant.SUPPLIER_QUERY + ".getSelect", ModelEnum.SUPPLIER.getCode(),"getSelect", ModelEnum.SUPPLIER.getValue() + "_获取供应商下拉菜单"),

    //--------------------------------------------- share area  start ----------------------------------------------------------------
    SHARE_AREA_ADD(ClzConstant.SHARE_AREA_COMMAND + ".add", ModelEnum.SHARE_AREA.getCode(),"add", ModelEnum.SHARE_AREA.getValue() + "_新增"),
    SHARE_AREA_DEL(ClzConstant.SHARE_AREA_COMMAND + ".delete", ModelEnum.SHARE_AREA.getCode(),"delete", ModelEnum.SHARE_AREA.getValue() + "_删除"),

    SHARE_AREA_LIST(ClzConstant.SHARE_AREA_QUERY + ".getPageList", ModelEnum.SHARE_AREA.getCode(),"getPageList", ModelEnum.SHARE_AREA.getValue() + "_查询列表"),

    //--------------------------------------------- share user  start ----------------------------------------------------------------
    SHARE_USER_ADD(ClzConstant.SHARE_USER_COMMAND + ".add", ModelEnum.SHARE_USER.getCode(),"add", ModelEnum.SHARE_USER.getValue() + "_新增"),
    SHARE_USER_DEL(ClzConstant.SHARE_USER_COMMAND + ".delete", ModelEnum.SHARE_USER.getCode(),"delete", ModelEnum.SHARE_USER.getValue() + "_删除"),
    SHARE_USER_UPDATE(ClzConstant.SHARE_USER_COMMAND + ".update", ModelEnum.SHARE_USER.getCode(),"update", ModelEnum.SHARE_USER.getValue() + "_修改"),
    SHARE_USER_FREEZE(ClzConstant.SHARE_USER_COMMAND + ".freeze", ModelEnum.SHARE_USER.getCode(),"freeze", ModelEnum.SHARE_USER.getValue() + "_冻结"),
    SHARE_USER_UNFREEZE(ClzConstant.SHARE_USER_COMMAND + ".unfreeze", ModelEnum.SHARE_USER.getCode(),"unfreeze", ModelEnum.SHARE_USER.getValue() + "_解冻"),

    SHARE_USER_LIST(ClzConstant.SHARE_USER_QUERY + ".getList", ModelEnum.SHARE_USER.getCode(),"getList", ModelEnum.SHARE_USER.getValue() + "_查询列表"),
    SHARE_USER_GET(ClzConstant.SHARE_USER_QUERY + ".get", ModelEnum.SHARE_USER.getCode(),"get", ModelEnum.SHARE_USER.getValue() + "_查询一个"),
    SHARE_USER_COUNT(ClzConstant.SHARE_USER_QUERY + ".getCount", ModelEnum.SHARE_USER.getCode(),"getCount", ModelEnum.SHARE_USER.getValue() + "_查询总数"),

    //--------------------------------------------- user  start ----------------------------------------------------------------
    USER_UPDATE(ClzConstant.USER_COMMAND + ".update", ModelEnum.USER.getCode(),"update", ModelEnum.USER.getValue() + "_修改"),
    USER_UPDATE_PASSWORD(ClzConstant.USER_COMMAND + ".updatePassword", ModelEnum.USER.getCode(),"updatePassword", ModelEnum.USER.getValue() + "_修改密码"),
    USER_UPDATE_AVATAR(ClzConstant.USER_COMMAND + ".updateAvatar", ModelEnum.USER.getCode(),"updateAvatar", ModelEnum.USER.getValue() + "_修改头像"),
    USER_UPDATE_QUESTION(ClzConstant.USER_COMMAND + ".updateQuestion", ModelEnum.USER.getCode(),"updateQuestion", ModelEnum.USER.getValue() + "_修改问题"),

    USER_GET(ClzConstant.USER_QUERY + ".get", ModelEnum.USER.getCode(),"get", ModelEnum.USER.getValue() + "_查询一个"),
    USER_GET_AVATAR(ClzConstant.USER_QUERY + ".getAvatar", ModelEnum.USER.getCode(),"getAvatar", ModelEnum.USER.getValue() + "_查询头像"),
//    USER_GET_GENDER(ClzConstant.USER_QUERY + ".getGender", ModelEnum.USER.getCode(),"getGender", ModelEnum.USER.getValue() + "_查询性别下拉"),
//    USER_GET_HOME_PAGE(ClzConstant.USER_QUERY + ".getHomePage", ModelEnum.USER.getCode(),"getHomePage", ModelEnum.USER.getValue() + "_查询可以选择的默认页菜单"),
    USER_GET_QUESTION_ANSWER(ClzConstant.USER_QUERY + ".getQuestionAndAnswer", ModelEnum.USER.getCode(),"getQuestionAndAnswer", ModelEnum.USER.getValue() + "_查询问题和答案"),

    USER_NOTICE_READ_ONE(ClzConstant.USER_NOTICE + ".readOne", ModelEnum.USER_NOTICE.getCode(),"readOne", ModelEnum.USER_NOTICE.getValue() + "_读一条"),
    USER_NOTICE_GET_ONE(ClzConstant.USER_NOTICE + ".getOne", ModelEnum.USER_NOTICE.getCode(),"getOne", ModelEnum.USER_NOTICE.getValue() + "_查一条"),

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
