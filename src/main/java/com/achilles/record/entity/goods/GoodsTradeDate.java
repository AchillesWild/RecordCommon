package com.achilles.record.entity.goods;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GoodsTradeDate extends BaseEntity {

    private Integer tradeDate;

    private Long incomeAmount;

    private Integer incomeCount;

    private Long payAmount;

    private Integer payCount;

    private Integer imgCount;

    private String userUuid;
}