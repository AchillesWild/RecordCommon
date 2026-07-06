package com.achilles.record.entity.product;

import com.achilles.model.entity.BaseEntity;

import java.math.BigDecimal;


public class ProductOutputDate extends BaseEntity {


    private String productUuid;

    private BigDecimal number;

    private Integer count;

    private Integer productionDate;

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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Integer productionDate) {
        this.productionDate = productionDate;
    }
}