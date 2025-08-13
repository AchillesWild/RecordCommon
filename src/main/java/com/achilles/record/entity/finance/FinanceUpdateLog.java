package com.achilles.record.entity.finance;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FinanceUpdateLog extends BaseEntity {

    private Integer tradeDate;

    private Integer tradeDatePre;

    private Integer pace;

    private String traceId;


}
