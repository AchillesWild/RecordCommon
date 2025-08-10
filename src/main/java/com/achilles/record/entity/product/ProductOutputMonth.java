package com.achilles.record.entity.product;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductOutputMonth extends BaseEntity {

    private String productUuid;

    private String month;

    private BigDecimal number;

}