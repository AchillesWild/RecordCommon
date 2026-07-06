package com.achilles.record.entity.common;

import com.achilles.model.entity.BaseEntity;


public class UserActiveData extends BaseEntity {

    private Integer activeDays;

    public Integer getActiveDays() {
        return activeDays;
    }

    public void setActiveDays(Integer activeDays) {
        this.activeDays = activeDays;
    }
}
