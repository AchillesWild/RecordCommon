package com.achilles.record.enums;

public enum ModelEnum {

//    SHARE(0,"分享区"),
    MISSION("mission", "待办"),

    NOTE("note", "笔记"),

    FINANCE_TRANSACTION_TYPE("finance_transaction_type","收/支类型"),
    FINANCE("finance", "账务"),
    FINANCE_MONTH("finance_month","账务-月度"),

    PRODUCT("product", "产品"),
    PRODUCT_OUTPUT("product_output","计量"),
    PRODUCT_OUTPUT_MONTH("product_output_month","计量-月度"),

//    SUPPLIER(9,"供应商"),
    GOODS( "goods","买/卖"),
//    PRICE(11,"价目"),
//    GOODS_TRADE(12,"进货/销售-明细"),
//    GOODS_TRADE_MONTH(13,"进货/销售-月度"),

    ;

    private String code;

    private String value;

    ModelEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getCode() {
        return code;
    }


}
