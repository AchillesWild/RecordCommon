package com.achilles.record.entity.product;

import com.achilles.model.entity.BaseEntity;

import java.math.BigDecimal;


public class ProductOutputMonth extends BaseEntity {

    private String productUuid;

    private Integer month;

    private BigDecimal number;

    private Integer count;

    public String getProductUuid() {
        return productUuid;
    }

    public void setProductUuid(String productUuid) {
        this.productUuid = productUuid;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public BigDecimal getNumber() {
        return number;
    }

    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}