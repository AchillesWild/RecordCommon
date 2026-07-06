package com.achilles.record.entity.product;

import com.achilles.model.entity.BaseEntity;

import java.math.BigDecimal;


public class ProductOutputWeek extends BaseEntity {

    private String productUuid;

    private BigDecimal number;

    private Integer count;

    private Integer dateStart;

    private Integer dateEnd;

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

    public Integer getDateStart() {
        return dateStart;
    }

    public void setDateStart(Integer dateStart) {
        this.dateStart = dateStart;
    }

    public Integer getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Integer dateEnd) {
        this.dateEnd = dateEnd;
    }
}