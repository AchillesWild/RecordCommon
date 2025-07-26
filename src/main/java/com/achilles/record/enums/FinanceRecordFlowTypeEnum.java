package com.achilles.record.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum FinanceRecordFlowTypeEnum {


    PAY(0,"支出"),

    INCOME(1,"收入");

    private Integer key;

    private String value;

    FinanceRecordFlowTypeEnum(Integer key, String value) {
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
        return getMap().get(key);
    }

    public static Map<Integer,String> getMap() {
        Map<Integer, String> map = new HashMap<>();
        for (FinanceRecordFlowTypeEnum financeRecordFlowTypeEnum : EnumSet.allOf(FinanceRecordFlowTypeEnum.class)) {
            map.put(financeRecordFlowTypeEnum.getKey(), financeRecordFlowTypeEnum.getValue());
        }
        return map;
    }

    public static boolean contains(Integer key){

        if(key == null){
            return false;
        }

        FinanceRecordFlowTypeEnum[] financeRecordFlowTypeEnums = FinanceRecordFlowTypeEnum.values();
        for (FinanceRecordFlowTypeEnum financeRecordFlowTypeEnum : financeRecordFlowTypeEnums){
            if(financeRecordFlowTypeEnum.key == key){
                return true;
            }
        }

        return false;
    }
}
