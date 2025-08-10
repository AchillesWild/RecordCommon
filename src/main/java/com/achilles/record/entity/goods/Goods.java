package com.achilles.record.entity.goods;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Goods extends BaseEntity {

    private String name;

    private String code;

    private Integer sort;

    private Integer type;

    private Integer hasImg;

    private String compressImgUrl;

    private String imgUrl;

    private Long version;

    private String remark;

}