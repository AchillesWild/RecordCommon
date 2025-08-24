package com.achilles.record.enums.goods;

import java.util.*;

public enum GoodsSupplierTypeEnum {


    PERSONAL(0,"个人"),

    COMPANY(1,"企业");

    private Integer key;

    private String value;

    GoodsSupplierTypeEnum(Integer key, String value) {
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
        for (GoodsSupplierTypeEnum goodsSupplierTypeEnum : EnumSet.allOf(GoodsSupplierTypeEnum.class)) {
            map.put(goodsSupplierTypeEnum.getKey(), goodsSupplierTypeEnum.getValue());
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
