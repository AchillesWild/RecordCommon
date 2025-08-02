package com.achilles.record.entity;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FinanceRecordWeek extends BaseEntity {

    private Integer dateStart;

    private Integer dateEnd;

    private Long incomeAmount;

    private Long payAmount;

    private String userUuid;
}