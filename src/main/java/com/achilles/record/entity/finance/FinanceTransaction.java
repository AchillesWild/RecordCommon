package com.achilles.record.entity.finance;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FinanceTransaction extends BaseEntity {

    private String name;

    private Integer sort;

    private Integer flowType;

    private Long version;
}