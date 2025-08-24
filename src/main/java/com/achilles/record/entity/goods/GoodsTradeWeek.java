package com.achilles.record.entity.goods;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GoodsTradeWeek extends BaseEntity {

    private Integer dateStart;

    private Integer dateEnd;

    private Long incomeAmount;

    private Integer incomeCount;

    private Long payAmount;

    private Integer payCount;

    private String userUuid;
}