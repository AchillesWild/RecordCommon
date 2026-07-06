package com.achilles.record.entity.finance;

import com.achilles.model.entity.BaseEntity;


public class FinanceUpdateLog extends BaseEntity {

    private Integer tradeDate;

    private Integer tradeDatePre;

    private String type;

    private Integer pace;

    private String traceId;

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public Integer getPace() {
        return pace;
    }

    public void setPace(Integer pace) {
        this.pace = pace;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getTradeDatePre() {
        return tradeDatePre;
    }

    public void setTradeDatePre(Integer tradeDatePre) {
        this.tradeDatePre = tradeDatePre;
    }

    public Integer getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Integer tradeDate) {
        this.tradeDate = tradeDate;
    }
}
