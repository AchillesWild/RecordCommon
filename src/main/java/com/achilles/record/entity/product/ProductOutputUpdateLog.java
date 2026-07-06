package com.achilles.record.entity.product;

import com.achilles.model.entity.BaseEntity;


public class ProductOutputUpdateLog extends BaseEntity {

    private String productUuid;

    private Integer productionDate;

    private String productUuidPre;

    private Integer productionDatePre;

    private String type;

    private Integer pace;

    private String traceId;

    public String getProductUuid() {
        return productUuid;
    }

    public void setProductUuid(String productUuid) {
        this.productUuid = productUuid;
    }

    public Integer getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Integer productionDate) {
        this.productionDate = productionDate;
    }

    public String getProductUuidPre() {
        return productUuidPre;
    }

    public void setProductUuidPre(String productUuidPre) {
        this.productUuidPre = productUuidPre;
    }

    public Integer getProductionDatePre() {
        return productionDatePre;
    }

    public void setProductionDatePre(Integer productionDatePre) {
        this.productionDatePre = productionDatePre;
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
