package com.achilles.record.entity.goods;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class GoodsTrade extends BaseEntity {


    private String goodsUuid;

    private Integer tradeType;

    private BigDecimal number;

    private Integer unit;

    private Long unitPrice;

    private Long sumPrice;

    private Integer goodsType;

    private String supplierUuid;

    private String userUuid;

    private Integer tradeDate;

    private Integer hasImg;

    private String compressImgUrl;

    private String imgUrl;

    private Integer paid;

    private String remark;
}