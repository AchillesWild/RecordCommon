package com.achilles.record.entity.goods;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GoodsTradeUpdateLog extends BaseEntity {

    private Integer tradeDate;

    private Integer tradeDatePre;

    private String type;

    private Integer pace;

    private String traceId;


}
