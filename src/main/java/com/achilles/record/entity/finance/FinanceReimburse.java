package com.achilles.record.entity.finance;

import com.achilles.model.entity.BaseEntity;


public class FinanceReimburse extends BaseEntity {

    private Long amount;

    private Integer pace;

    private Integer hasImg;

    private String compressImgUrl;

    private String imgUrl;

    private String transactionType;

    private String remark;

    private Integer tradeDate;

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Integer getPace() {
        return pace;
    }

    public void setPace(Integer pace) {
        this.pace = pace;
    }

    public Integer getHasImg() {
        return hasImg;
    }

    public void setHasImg(Integer hasImg) {
        this.hasImg = hasImg;
    }

    public String getCompressImgUrl() {
        return compressImgUrl;
    }

    public void setCompressImgUrl(String compressImgUrl) {
        this.compressImgUrl = compressImgUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Integer tradeDate) {
        this.tradeDate = tradeDate;
    }
}