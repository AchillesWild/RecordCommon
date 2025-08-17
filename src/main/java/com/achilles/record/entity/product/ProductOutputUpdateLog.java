package com.achilles.record.entity.product;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductOutputUpdateLog extends BaseEntity {

    private String productUuid;

    private Integer productionDate;

    private String productUuidPre;

    private Integer productionDatePre;

    private String type;

    private Integer pace;

    private String traceId;
}
