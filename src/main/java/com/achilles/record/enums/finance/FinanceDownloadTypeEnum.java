package com.achilles.record.enums.finance;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum FinanceDownloadTypeEnum {


    FINANCE_LIST(0,"FINANCE_LIST"),

    FINANCE_DATE_LIST(10,"FINANCE_DATE_LIST"),
    FINANCE_DATE_CLASSIFIED(11,"FINANCE_DATE_CLASSIFIED"),

    FINANCE_WEEK_LIST(20,"FINANCE_WEEK_LIST"),
    FINANCE_WEEK_CLASSIFIED_WEEK(22,"FINANCE_WEEK_CLASSIFIED_WEEK"),

    FINANCE_MONTH_LIST(30,"FINANCE_MONTH_LIST"),
    FINANCE_MONTH_CLASSIFIED(31,"FINANCE_MONTH_CLASSIFIED"),
    FINANCE_MONTH_CLASSIFIED_MONTH(32,"FINANCE_MONTH_CLASSIFIED_MONTH"),

    FINANCE_SEASON_LIST(40,"FINANCE_SEASON_LIST"),
    FINANCE_SEASON_CLASSIFIED(41,"FINANCE_SEASON_CLASSIFIED"),
    FINANCE_SEASON_CLASSIFIED_SEASON(42,"FINANCE_SEASON_CLASSIFIED_SEASON"),

    FINANCE_YEAR_LIST(50,"FINANCE_YEAR_LIST"),
    FINANCE_YEAR_CLASSIFIED(51,"FINANCE_YEAR_CLASSIFIED"),
    FINANCE_YEAR_CLASSIFIED_YEAR(52,"FINANCE_YEAR_CLASSIFIED_YEAR"),
    ;

    private Integer key;

    private String value;

    FinanceDownloadTypeEnum(Integer key, String value) {
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
        for (FinanceDownloadTypeEnum financeDownloadTypeEnum : EnumSet.allOf(FinanceDownloadTypeEnum.class)) {
            map.put(financeDownloadTypeEnum.getKey(), financeDownloadTypeEnum.getValue());
        }
        return map;
    }

    public static boolean contains(Integer key){

        if(key == null){
            return false;
        }

        FinanceDownloadTypeEnum[] financeDownloadTypeEnums = FinanceDownloadTypeEnum.values();
        for (FinanceDownloadTypeEnum financeDownloadTypeEnum : financeDownloadTypeEnums){
            if(financeDownloadTypeEnum.key == key){
                return true;
            }
        }

        return false;
    }
}
