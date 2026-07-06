package com.achilles.record.entity.goods;

import com.achilles.model.entity.BaseEntity;

public class GoodsTradeDate extends BaseEntity {

    private Integer tradeDate;

    private Long incomeAmount;

    private Integer incomeCount;

    private Long payAmount;

    private Integer payCount;

    private Integer imgCount;

    private String userUuid;

    public Integer getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Integer tradeDate) {
        this.tradeDate = tradeDate;
    }

    public Long getIncomeAmount() {
        return incomeAmount;
    }

    public void setIncomeAmount(Long incomeAmount) {
        this.incomeAmount = incomeAmount;
    }

    public Integer getIncomeCount() {
        return incomeCount;
    }

    public void setIncomeCount(Integer incomeCount) {
        this.incomeCount = incomeCount;
    }

    public Long getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getPayCount() {
        return payCount;
    }

    public void setPayCount(Integer payCount) {
        this.payCount = payCount;
    }

    public Integer getImgCount() {
        return imgCount;
    }

    public void setImgCount(Integer imgCount) {
        this.imgCount = imgCount;
    }

    @Override
    public String getUserUuid() {
        return userUuid;
    }

    @Override
    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }
}