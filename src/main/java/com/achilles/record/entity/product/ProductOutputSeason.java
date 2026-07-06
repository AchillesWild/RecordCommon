package com.achilles.record.entity.product;

import com.achilles.model.entity.BaseEntity;

import java.math.BigDecimal;


public class ProductOutputSeason extends BaseEntity {

    private String productUuid;

    private BigDecimal number;

    private Integer season;

    private Integer count;

    public String getProductUuid() {
        return productUuid;
    }

    public void setProductUuid(String productUuid) {
        this.productUuid = productUuid;
    }

    public BigDecimal getNumber() {
        return number;
    }

    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}