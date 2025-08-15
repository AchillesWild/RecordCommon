package com.achilles.record.entity.goods;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GoodsTradeMonth extends BaseEntity {

    private Integer month;

    private Long incomeAmount;

    private Long payAmount;

    private String userUuid;
}