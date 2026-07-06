package com.achilles.record.entity.finance;

import com.achilles.model.entity.BaseEntity;


public class FinanceReimburseTransaction extends BaseEntity {

    private String name;

    private Integer sort;

    private Long version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}