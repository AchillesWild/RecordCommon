package com.achilles.record.entity.goods;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GoodsPrice extends BaseEntity {

    private String goodsUuid;

    private Integer type;

    private Integer number;

    private Integer unit;

    private Long purchasePrice;

    private Long sellingPrice;

    private Integer hasImg;

    private String compressImgUrl;

    private String imgUrl;

    private String supplierUuid;

    private String remark;

    private String userUuid;

}