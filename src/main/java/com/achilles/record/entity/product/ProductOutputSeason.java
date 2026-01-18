package com.achilles.record.entity.product;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductOutputSeason extends BaseEntity {

    private String productUuid;

    private BigDecimal number;

    private Integer season;

    private Integer count;
}