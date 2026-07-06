package com.achilles.record.entity.finance;

import com.achilles.model.entity.BaseEntity;


public class FinanceToIncomeOrPay extends BaseEntity {

    private Long amount;

    private Long paidAmount;

    private Integer flowType;

    private String related;

    private String transaction;

    private Integer tradeDate;

    private Integer appointedDate;

    private Integer hasImg;

    private Integer pace;

    private String compressImgUrl;

    private String imgUrl;

    private String remark;

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Long paidAmount) {
        this.paidAmount = paidAmount;
    }

    public Integer getFlowType() {
        return flowType;
    }

    public void setFlowType(Integer flowType) {
        this.flowType = flowType;
    }

    public String getRelated() {
        return related;
    }

    public void setRelated(String related) {
        this.related = related;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public Integer getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Integer tradeDate) {
        this.tradeDate = tradeDate;
    }

    public Integer getAppointedDate() {
        return appointedDate;
    }

    public void setAppointedDate(Integer appointedDate) {
        this.appointedDate = appointedDate;
    }

    public Integer getHasImg() {
        return hasImg;
    }

    public void setHasImg(Integer hasImg) {
        this.hasImg = hasImg;
    }

    public Integer getPace() {
        return pace;
    }

    public void setPace(Integer pace) {
        this.pace = pace;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}