package com.achilles.record.enums.goods;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum GoodsTradeTypeEnum {


    INCOMING(0,"进货", 1),

    SALE(1,"销售", 0);

    private Integer key;

    private String value;

    private Integer sort;

    GoodsTradeTypeEnum(Integer key, String value, Integer sort) {
        this.key = key;
        this.value = value;
        this.sort = sort;
    }

    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public Integer getSort() {
        return sort;
    }

    public static String getValue(Integer key) {
        return keyValueMap.get(key);
    }

    public static Map<Integer, String> keyValueMap = new HashMap<>();

    public static Map<Integer, Integer> keySortMap = new HashMap<>();

    static {
        for (GoodsTradeTypeEnum goodsTradeTypeEnum : EnumSet.allOf(GoodsTradeTypeEnum.class)) {
            keyValueMap.put(goodsTradeTypeEnum.getKey(), goodsTradeTypeEnum.getValue());
            keySortMap.put(goodsTradeTypeEnum.getKey(), goodsTradeTypeEnum.getSort());
        }
    }

    public static boolean contains(Integer key){

        if(key == null){
            return false;
        }

        String value = keyValueMap.get(key);
        if(value != null) {
            return true;
        }

        return false;
    }
}
