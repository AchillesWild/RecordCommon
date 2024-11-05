package com.achilles.record.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum ModelEnum {

    MISSION("mission", "待办"),

    NOTE("note", "笔记"),

    FINANCE_TRANSACTION_TYPE("finance_transaction_type","收/支类型"),
    FINANCE("finance", "账务"),
    FINANCE_MONTH("finance_month","账务-月度"),

    PRODUCT("product", "计量物"),
    PRODUCT_OUTPUT("product_output","计量"),
    PRODUCT_OUTPUT_MONTH("product_output_month","计量-月度"),

    SUPPLIER("supplier","供应商"),
    GOODS( "goods","买/卖"),
    GOODS_TRADE("goods_trade","买/卖-明细"),
    GOODS_TRADE_MONTH("goods_trade_month","买/卖-月度"),

    SHARE_AREA("share_area", "信息板"),

    SHARE_USER("share_user", "分享用户"),

    USER("user", "用户"),

    USER_NOTICE("user_notice", "用户通知"),

    ;

    private String code;

    private String value;

    ModelEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getCode() {
        return code;
    }

    public static String getValue(String code) {
        return map.get(code);
    }

    public static Map<String, String> map = new HashMap<>();

    static {
        for (ModelEnum modelEnum : EnumSet.allOf(ModelEnum.class)) {
            map.put(modelEnum.getCode(), modelEnum.getValue());
        }
    }

    public static boolean contains(Integer code){

        if(code == null){
            return false;
        }

        String value = map.get(code);
        if(value != null) {
            return true;
        }

        return false;
    }

}
