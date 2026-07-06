package com.achilles.record.entity.goods;

import com.achilles.model.entity.BaseEntity;

public class GoodsPrice extends BaseEntity {

    private String goodsUuid;

    private Integer type;

    private Integer number;

    private Integer unit;

    private Long purchasePrice;

    private Long sellingPrice;

    private Integer hasImg;

    private String compressImgUrl;

    private String imgUrl;

    private String supplierUuid;

    private String remark;

    private String userUuid;


    public String getGoodsUuid() {
        return goodsUuid;
    }

    public void setGoodsUuid(String goodsUuid) {
        this.goodsUuid = goodsUuid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Long getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Long sellingPrice) {
        this.sellingPrice = sellingPrice;
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

    public String getSupplierUuid() {
        return supplierUuid;
    }

    public void setSupplierUuid(String supplierUuid) {
        this.supplierUuid = supplierUuid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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