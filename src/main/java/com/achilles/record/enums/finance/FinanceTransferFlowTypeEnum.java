package com.achilles.record.enums.finance;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum FinanceTransferFlowTypeEnum {


    PAY(0, "转出"),

    INCOME(1, "转入");

    private Integer key;

    private String value;

    FinanceTransferFlowTypeEnum(Integer key, String value) {
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
        for (FinanceTransferFlowTypeEnum financeTransferFlowTypeEnum : EnumSet.allOf(FinanceTransferFlowTypeEnum.class)) {
            map.put(financeTransferFlowTypeEnum.getKey(), financeTransferFlowTypeEnum.getValue());
        }
        return map;
    }

    public static boolean contains(Integer key){

        if(key == null){
            return false;
        }

        FinanceTransferFlowTypeEnum[] financeTransferFlowTypeEnums = FinanceTransferFlowTypeEnum.values();
        for (FinanceTransferFlowTypeEnum financeRecordFlowTypeEnum : financeTransferFlowTypeEnums){
            if(financeRecordFlowTypeEnum.key == key){
                return true;
            }
        }

        return false;
    }
}
