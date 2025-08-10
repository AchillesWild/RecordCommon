package com.achilles.record.constant;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FinanceRecordMonth extends BaseEntity {

    private Integer tradeMonth;

    private Long incomeAmount;

    private Long payAmount;

    private String userUuid;
}