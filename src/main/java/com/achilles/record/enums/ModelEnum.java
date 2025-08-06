package com.achilles.record.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum ModelEnum {

    MISSION("mission", "待办", 0),

    NOTE("note", "笔记", 1),

    NOTES("notes", "日记", 1),

    FINANCE("finance", "账务", 2),
    FINANCE_DATE("finance_date","账务-天", 3),
    FINANCE_WEEK("finance_week","账务-周", 3),
    FINANCE_MONTH("finance_month","账务-月", 3),
    FINANCE_SEASON("finance_season","账务-季", 4),
    FINANCE_YEAR("finance_year","账务-年", 4),
    FINANCE_TRANSACTION_TYPE("finance_transaction_type","收/支类型", 4),

    PRODUCT_OUTPUT("product_output", "计量", 5),
    PRODUCT_OUTPUT_MONTH("product_output_month", "计量-月度", 6),
    PRODUCT_OUTPUT_YEAR("product_output_year", "计量-年度", 6),
    PRODUCT("product", "计量物", 7),

    GOODS_TRADE("goods_trade", "买/卖", 8),
    GOODS_TRADE_MONTH("goods_trade_month", "买/卖-月度", 9),
    GOODS_TRADE_YEAR("goods_trade_year", "买/卖-年度", 9),
    SUPPLIER("supplier", "供应商", 10),
    GOODS( "goods", "商品", 11),

    SHARE_AREA("share_area", "公告栏", 12),

    SHARE_USER("share_user", "分享用户", 13),

    USER("user", "用户", 14),

    USER_NOTICE("user_notice", "用户通知", 15),

    CONFIG("config", "配置", 16),

    ;

    private String key;

    private String value;

    private Integer sort;

    ModelEnum(String key, String value, Integer sort) {
        this.key = key;
        this.value = value;
        this.sort = sort;
    }

    public String getValue() {
        return value;
    }

    public String getKey() {
        return key;
    }

    public Integer getSort() {
        return sort;
    }

    public static String getValue(String key) {
        return keyValueMap.get(key);
    }

    public static Map<String, String> keyValueMap = new HashMap<>();
    public static Map<String, Integer> keySortMap = new HashMap<>();

    static {
        for (ModelEnum modelEnum : EnumSet.allOf(ModelEnum.class)) {
            keyValueMap.put(modelEnum.getKey(), modelEnum.getValue());
            keySortMap.put(modelEnum.getKey(), modelEnum.getSort());
        }
    }

    public static boolean contains(String key){

        if(key == null || "".equals(key)){
            return false;
        }

        String value = keyValueMap.get(key);
        if(value != null) {
            return true;
        }

        return false;
    }

}
