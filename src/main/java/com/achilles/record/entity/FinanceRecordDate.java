package com.achilles.record.entity;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FinanceRecordDate extends BaseEntity {

    private Integer tradeDate;

    private Long incomeAmount;

    private Long payAmount;

    private String userUuid;
}