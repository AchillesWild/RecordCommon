package com.achilles.record.entity.goods;

import com.achilles.model.entity.BaseEntity;

public class GoodsTradeUpdateLog extends BaseEntity {

    private Integer tradeDate;

    private Integer tradeDatePre;

    private String type;

    private Integer pace;

    private String traceId;

    public Integer getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Integer tradeDate) {
        this.tradeDate = tradeDate;
    }

    public Integer getTradeDatePre() {
        return tradeDatePre;
    }

    public void setTradeDatePre(Integer tradeDatePre) {
        this.tradeDatePre = tradeDatePre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPace() {
        return pace;
    }

    public void setPace(Integer pace) {
        this.pace = pace;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }
}
