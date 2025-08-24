package com.achilles.record.enums.goods;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum GoodsUnitEnum {

    KILOGRAM(0,"千克", 0, 0),
    JIN(1,"斤", 1, 0),
    GRAM(2,"克", 2, 0),
    TON(3,"吨", 3, 0),

    CUBIC_METER(200,"立方米", 4, 0),
    LITRE(4,"升", 5, 0),
    MILLILITER(5,"毫升", 6, 0),

    GE(6,"个", 100, 1),
    TIAO(7,"条", 100, 1),
    HE(8,"盒", 100, 1),
    XIANG(9,"箱", 100, 1),
    PING(10,"瓶", 100, 1),
    ZHA(11,"扎", 100, 1),
    JIAN(12,"件", 100, 1),
    TAI(13,"台", 100, 1),
    LIANG(14,"辆", 100, 1),
    BARREL(15,"桶", 100, 1),
    ZHI(16,"只", 100, 1),
    ZHII(17,"支", 100, 1),
    PAIR(18,"双", 100, 1),
    BAG(19,"袋", 100, 1),
    STICK(20,"根", 100, 1),
    PIECE(21,"颗", 100, 1),
    TREE(22,"棵", 100, 1),

    METER(50,"米", 50, 0),
    KILOMETER(51,"千米", 51, 0),
    DECIMETRE(52,"分米", 52, 0),
    CENTIMETER(53,"厘米", 53, 0),
    MILLIMETRE(54,"毫米", 54, 0),

    SQUARE_METER(80,"平方米", 80, 0),

    ;

    private Integer key;

    private String value;

    private Integer sort;

    private Integer isInteger;

    GoodsUnitEnum(Integer key, String value, Integer sort, Integer isInteger) {
        this.key = key;
        this.value = value;
        this.sort = sort;
        this.isInteger = isInteger;
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

    public Integer getIsInteger() {
        return isInteger;
    }

    public static String getValue(Integer key) {
        return keyValueMap.get(key);
    }

    public static Integer getSort(Integer key) {
        return keySortMap.get(key);
    }

    public static Integer getIsInteger(Integer key) {
        return isIntegerMap.get(key);
    }

    public static Map<Integer, String> keyValueMap = new HashMap<>();

    public static Map<Integer, Integer> keySortMap = new HashMap<>();

    public static Map<Integer, Integer> isIntegerMap = new HashMap<>();

    static {
        for (GoodsUnitEnum goodsUnitEnum : EnumSet.allOf(GoodsUnitEnum.class)) {
            keyValueMap.put(goodsUnitEnum.getKey(), goodsUnitEnum.getValue());
            keySortMap.put(goodsUnitEnum.getKey(), goodsUnitEnum.getSort());
            isIntegerMap.put(goodsUnitEnum.getKey(), goodsUnitEnum.getIsInteger());
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
