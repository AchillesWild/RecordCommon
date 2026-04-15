package com.achilles.record.enums.finance;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum FinanceReimbursePaceEnum {


    INITIAL(0,"待报销"),

    DOING(1,"报销中"),

    DONE(2,"已报销");

    private Integer key;
    private String value;

    FinanceReimbursePaceEnum(Integer key, String value) {
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
        for (FinanceReimbursePaceEnum financeReimbursePaceEnum : EnumSet.allOf(FinanceReimbursePaceEnum.class)) {
            map.put(financeReimbursePaceEnum.getKey(), financeReimbursePaceEnum.getValue());
        }
        return map;
    }

    public static boolean contains(Integer key){

        if(key == null){
            return false;
        }

        FinanceReimbursePaceEnum[] financeReimbursePaceEnums = FinanceReimbursePaceEnum.values();
        for (FinanceReimbursePaceEnum financeReimbursePaceEnum : financeReimbursePaceEnums){
            if(financeReimbursePaceEnum.key == key){
                return true;
            }
        }

        return false;
    }
}
