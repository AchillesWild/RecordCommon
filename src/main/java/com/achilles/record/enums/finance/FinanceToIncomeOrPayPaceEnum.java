package com.achilles.record.enums.finance;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum FinanceToIncomeOrPayPaceEnum {


    INITIAL(0,"待结款"),

//    DOING(1,"结算中"),

    DONE(2,"已结款");

    private Integer key;
    private String value;

    FinanceToIncomeOrPayPaceEnum(Integer key, String value) {
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
        for (FinanceToIncomeOrPayPaceEnum financeToIncomeOrPayPaceEnum : EnumSet.allOf(FinanceToIncomeOrPayPaceEnum.class)) {
            map.put(financeToIncomeOrPayPaceEnum.getKey(), financeToIncomeOrPayPaceEnum.getValue());
        }
        return map;
    }

    public static boolean contains(Integer key){

        if(key == null){
            return false;
        }

        FinanceToIncomeOrPayPaceEnum[] financeToIncomeOrPayPaceEnums = FinanceToIncomeOrPayPaceEnum.values();
        for (FinanceToIncomeOrPayPaceEnum financeToIncomeOrPayPaceEnum : financeToIncomeOrPayPaceEnums){
            if(financeToIncomeOrPayPaceEnum.key == key){
                return true;
            }
        }

        return false;
    }
}
