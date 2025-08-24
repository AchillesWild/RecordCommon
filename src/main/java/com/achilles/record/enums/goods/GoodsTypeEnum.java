package com.achilles.record.enums.goods;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum GoodsTypeEnum {

    OTHER(0,"其他"),

    FRUIT(1,"水果"),

    VEGETABLE(2,"蔬菜"),

    DAILY_NECESSITIES(3,"日用"),

    MEAT(4,"肉类"),

    GRAIN(5,"五谷杂粮"),

    BEVERAGE(6,"饮料"),

    WATER(7,"水"),

    MILK(8,"奶制品"),

    WINE(9,"酒"),

    CLOTHES(10,"衣服"),

    ;

    private Integer key;

    private String value;

    GoodsTypeEnum(Integer key, String value) {
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
        for (GoodsTypeEnum goodsTypeEnum : EnumSet.allOf(GoodsTypeEnum.class)) {
            map.put(goodsTypeEnum.getKey(), goodsTypeEnum.getValue());
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
