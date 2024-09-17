package com.achilles.record.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum ModelEnum {

//    SHARE(0,"分享区"),
    MISSION(1,"待办"),
    NOTE(2,"笔记"),

//    FINANCE_TRANSACTION(3,"收/支类型"),
    FINANCE(3,"账务"),
//    FINANCE_MONTH(5,"账务-月度"),

    PRODUCT(4,"计量"),
//    PRODUCT_OUTPUT(7,"产量-明细"),
//    PRODUCT_OUTPUT_MONTH(8,"产量-月度"),

//    SUPPLIER(9,"供应商"),
    GOODS(5,"买/卖"),
//    PRICE(11,"价目"),
//    GOODS_TRADE(12,"进货/销售-明细"),
//    GOODS_TRADE_MONTH(13,"进货/销售-月度"),



    ;

    private Integer key;

    private String value;

    ModelEnum(Integer key, String value) {
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
        return map.get(key);
    }

    public static Map<Integer, String> map = new HashMap<>();

    static {
        for (ModelEnum modelEnum : EnumSet.allOf(ModelEnum.class)) {
            map.put(modelEnum.getKey(), modelEnum.getValue());
        }
    }

    public static boolean contains(Integer key){

        if(key == null){
            return false;
        }

        String value = map.get(key);
        if(value != null) {
            return true;
        }

        return false;
    }

}
