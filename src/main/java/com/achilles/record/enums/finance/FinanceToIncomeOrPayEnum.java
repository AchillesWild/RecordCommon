package com.achilles.record.enums.finance;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum FinanceToIncomeOrPayEnum {


    PAY(0,"待付"),

    INCOME(1,"待收");

    private Integer key;

    private String value;

    FinanceToIncomeOrPayEnum(Integer key, String value) {
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
        for (FinanceToIncomeOrPayEnum financeToIncomeOrPayEnum : EnumSet.allOf(FinanceToIncomeOrPayEnum.class)) {
            map.put(financeToIncomeOrPayEnum.getKey(), financeToIncomeOrPayEnum.getValue());
        }
        return map;
    }

    public static boolean contains(Integer key){

        if(key == null){
            return false;
        }

        FinanceToIncomeOrPayEnum[] financeToIncomeOrPayEnums = FinanceToIncomeOrPayEnum.values();
        for (FinanceToIncomeOrPayEnum financeToIncomeOrPayEnum : financeToIncomeOrPayEnums){
            if(financeToIncomeOrPayEnum.key == key){
                return true;
            }
        }

        return false;
    }
}
