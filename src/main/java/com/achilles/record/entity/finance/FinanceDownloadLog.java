package com.achilles.record.entity.finance;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FinanceDownloadLog extends BaseEntity {

    private Integer type;

    private Integer downloadDate;

    private Integer downloadMonth;

    private String traceId;


}
