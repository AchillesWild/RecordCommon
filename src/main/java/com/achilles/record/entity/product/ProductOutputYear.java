package com.achilles.record.entity.product;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductOutputYear extends BaseEntity {

    private String productUuid;

    private Integer year;

    private BigDecimal number;

    private Integer count;

}