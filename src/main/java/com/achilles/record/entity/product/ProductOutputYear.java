package com.achilles.record.entity.product;

import com.achilles.model.entity.BaseEntity;

import java.math.BigDecimal;


public class ProductOutputYear extends BaseEntity {

    private String productUuid;

    private Integer year;

    private BigDecimal number;

    private Integer count;

    public String getProductUuid() {
        return productUuid;
    }

    public void setProductUuid(String productUuid) {
        this.productUuid = productUuid;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
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